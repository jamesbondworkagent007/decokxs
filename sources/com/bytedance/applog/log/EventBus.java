package com.bytedance.applog.log;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class EventBus extends Thread implements Handler.Callback {
    private static final int EMIT_EVENT_MSG = 1;
    public static AbsSingleton<EventBus> global = new AbsSingleton<EventBus>() { // from class: com.bytedance.applog.log.EventBus.1
        /* JADX DEBUG: Method merged with bridge method: create([Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bytedance.applog.log.AbsSingleton
        public EventBus create(Object... objArr) {
            return new EventBus();
        }
    };
    private Handler eventHandler;
    private final Map<String, List<Subscription>> subscriptionMap = new ConcurrentHashMap();

    public interface DataFetcher {
        Object fetch();
    }

    public interface Subscription {
        void sub(Object obj);
    }

    public EventBus() {
        start();
    }

    public static class MessageEvent {
        Object data;
        String event;

        public MessageEvent(String str, Object obj) {
            this.event = str;
            this.data = obj;
        }
    }

    public void emit(String str, Object obj) {
        if (TextUtils.isEmpty(str) || !this.subscriptionMap.containsKey(str)) {
            return;
        }
        emit(new MessageEvent(str, obj));
    }

    public void emit(String str, DataFetcher dataFetcher) {
        if (TextUtils.isEmpty(str) || !this.subscriptionMap.containsKey(str) || dataFetcher == null) {
            return;
        }
        emit(new MessageEvent(str, dataFetcher.fetch()));
    }

    public void listen(String str, Subscription subscription) {
        synchronized (this) {
            List<Subscription> arrayList = this.subscriptionMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(subscription);
            this.subscriptionMap.put(str, arrayList);
        }
    }

    public void remove(String str, Subscription subscription) {
        synchronized (this) {
            List<Subscription> list = this.subscriptionMap.get(str);
            if (list != null && list.contains(subscription)) {
                list.remove(subscription);
                if (list.size() == 0) {
                    this.subscriptionMap.remove(str);
                } else {
                    this.subscriptionMap.put(str, list);
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
        Looper.prepare();
        this.eventHandler = new Handler(this);
        Looper.loop();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            emitEvent((MessageEvent) message.obj);
        }
        return true;
    }

    private void emit(MessageEvent messageEvent) {
        Handler handler = this.eventHandler;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1, messageEvent));
        } else {
            emitEvent(messageEvent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:6:0x0012, B:9:0x0020, B:11:0x0026, B:13:0x002e, B:15:0x003a, B:26:0x006e, B:27:0x0072, B:29:0x0078, B:31:0x0084, B:33:0x0095, B:35:0x009a, B:36:0x009d, B:39:0x00a7, B:38:0x00a1, B:16:0x0040, B:18:0x004a, B:20:0x0050, B:22:0x0058, B:24:0x0064), top: B:46:0x0012, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void emitEvent(MessageEvent messageEvent) {
        byte[] bArr;
        List<Subscription> list = this.subscriptionMap.get(messageEvent.event);
        if (list == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        try {
            if ("applog_event_upload_eid".equals(messageEvent.event)) {
                Object obj = messageEvent.data;
                if ((obj instanceof JSONObject) && ((JSONObject) obj).has("$$EVENT_LOCAL_IDS")) {
                    Object objOpt = ((JSONObject) messageEvent.data).opt("$$EVENT_LOCAL_IDS");
                    if (objOpt instanceof Collection) {
                        hashSet.addAll((Collection) objOpt);
                    }
                } else if ("applog_do_request_end".equals(messageEvent.event)) {
                    Object obj2 = messageEvent.data;
                    if ((obj2 instanceof JSONObject) && ((JSONObject) obj2).has("responseByte")) {
                        Object objOpt2 = ((JSONObject) messageEvent.data).opt("responseByte");
                        bArr = objOpt2 instanceof byte[] ? (byte[]) ((byte[]) objOpt2).clone() : null;
                    }
                }
            }
            for (Subscription subscription : list) {
                Object obj3 = messageEvent.data;
                if (obj3 instanceof JSONObject) {
                    try {
                        JSONObject jSONObject = new JSONObject(messageEvent.data.toString());
                        if (!hashSet.isEmpty()) {
                            jSONObject.put("$$EVENT_LOCAL_IDS", hashSet);
                        }
                        if (bArr != null) {
                            jSONObject.put("responseByte", bArr);
                        }
                        subscription.sub(jSONObject);
                    } catch (JSONException unused) {
                        subscription.sub(messageEvent.data);
                    }
                } else {
                    subscription.sub(obj3);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
