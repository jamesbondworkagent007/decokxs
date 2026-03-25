package com.bytedance.bdtracker;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.bytedance.applog.log.EventBus;
import com.bytedance.applog.log.LogUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class v3 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f275a;
    public final Handler b;
    public final Map<String, b> c = new HashMap();
    public final Set<String> d = new HashSet();
    public String e = "";

    public class a implements EventBus.DataFetcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f276a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(v3 v3Var, Set set, String str, boolean z) {
            this.f276a = set;
            this.b = str;
            this.c = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.bytedance.applog.log.EventBus.DataFetcher
        public Object fetch() {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            try {
                Iterator it = this.f276a.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject.put("$$APP_ID", this.b);
                jSONObject.put("$$EVENT_LOCAL_ID_ARRAY", jSONArray);
                jSONObject.put("$$UPLOAD_STATUS", this.c ? "success" : EopTrackEvent.KEY_RESULT_FAILED);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f277a;
        public JSONObject b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public b(String str, JSONObject jSONObject) {
            this.f277a = str;
            this.b = jSONObject;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            StringBuilder sbA = com.bytedance.bdtracker.a.a("ProfileDataWrapper{apiName='");
            sbA.append(this.f277a);
            sbA.append('\'');
            sbA.append(", jsonObject=");
            sbA.append(this.b);
            sbA.append(AbstractJsonLexerKt.END_OBJ);
            return sbA.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v3(f0 f0Var) {
        this.f275a = f0Var;
        StringBuilder sbA = com.bytedance.bdtracker.a.a("bd_tracker_profile:");
        sbA.append(f0Var.d.m);
        HandlerThread handlerThread = new HandlerThread(sbA.toString());
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(b bVar) {
        if (this.f275a == null) {
            return;
        }
        StringBuilder sbA = com.bytedance.bdtracker.a.a("__profile_");
        sbA.append(bVar.f277a);
        q4 q4Var = new q4(sbA.toString(), bVar.b.toString());
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(this.f275a.d())) {
            f0 f0Var = this.f275a;
            f0Var.n.a(f0Var.d, q4Var, arrayList);
        } else {
            f0 f0Var2 = this.f275a;
            f0Var2.n.a(f0Var2.d, q4Var);
        }
        this.f275a.b(q4Var);
        arrayList.add(q4Var);
        this.f275a.c().c(arrayList);
        this.b.sendMessageDelayed(this.b.obtainMessage(106), 500L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(JSONObject jSONObject) {
        a(105, new b(RequestParameters.SUBRESOURCE_APPEND, jSONObject));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void b(JSONObject jSONObject) {
        a(103, new b("increment", jSONObject));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void c(JSONObject jSONObject) {
        a(100, new b("set", jSONObject));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void d(JSONObject jSONObject) {
        a(102, new b("set_once", jSONObject));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void e(JSONObject jSONObject) {
        a(104, new b("unset", jSONObject));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:0x0084 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v14, resolved type: java.lang.Object */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0292  */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 100:
                b bVar = (b) message.obj;
                this.f275a.d.D.debug(9, "Handle set:{}", bVar);
                String str = this.e;
                boolean zEquals = str != null ? str.equals(this.f275a.d.getSsid()) : false;
                this.e = this.f275a.d.getSsid();
                Iterator<String> itKeys = bVar.b.keys();
                boolean z = true;
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!this.c.containsKey(next) || this.c.get(next) == null) {
                        z = false;
                    } else {
                        b bVar2 = this.c.get(next);
                        if (bVar2 != null) {
                            try {
                                if (!r.a(bVar.b, bVar2.b, (String) null)) {
                                }
                            } catch (Throwable th) {
                                this.f275a.d.D.error(9, "JSON handle failed", th, new Object[0]);
                            }
                        }
                    }
                    this.c.put(next, bVar);
                }
                if (!zEquals || !z) {
                    this.f275a.d.D.debug(9, "invoke profile set.", new Object[0]);
                    a(bVar);
                }
                return true;
            case 101:
            default:
                return true;
            case 102:
                b bVar3 = (b) message.obj;
                this.f275a.d.D.debug(9, "Handle setOnce:{}", bVar3);
                String str2 = this.e;
                boolean zEquals2 = str2 != null ? str2.equals(this.f275a.d.getSsid()) : false;
                this.e = this.f275a.d.getSsid();
                Iterator<String> itKeys2 = bVar3.b.keys();
                boolean z2 = true;
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!this.d.contains(next2)) {
                        z2 = false;
                    }
                    this.d.add(next2);
                }
                if (!zEquals2 || !z2) {
                    this.f275a.d.D.debug(9, "invoke profile set once.", new Object[0]);
                    a(bVar3);
                }
                return true;
            case 103:
                b bVar4 = (b) message.obj;
                this.f275a.d.D.debug(9, "Handle increment:{}", bVar4);
                a(bVar4);
                return true;
            case 104:
                b bVar5 = (b) message.obj;
                this.f275a.d.D.debug(9, "Handle unset:{}", bVar5);
                a(bVar5);
                return true;
            case 105:
                b bVar6 = (b) message.obj;
                this.f275a.d.D.debug(9, "Handle append:{}", bVar6);
                a(bVar6);
                return true;
            case 106:
                f0 f0Var = this.f275a;
                if (f0Var != null) {
                    f0Var.d.D.debug(9, "Handle flush with dr state:{}", Integer.valueOf(f0Var.i.i()));
                    if (this.f275a.i.i() != 0) {
                        Map<String, List<q4>> mapA = this.f275a.c().a(this.f275a.d.m);
                        if (!mapA.isEmpty()) {
                            HashSet hashSet = new HashSet();
                            for (Map.Entry<String, List<q4>> entry : mapA.entrySet()) {
                                String key = entry.getKey();
                                JSONArray jSONArray = new JSONArray();
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    r.a(jSONObject, this.f275a.d.getHeader());
                                    if (r.c(key)) {
                                        key = JSONObject.NULL;
                                    }
                                    jSONObject.put("user_unique_id", key);
                                    jSONObject.remove("ssid");
                                    JSONObject jSONObject2 = new JSONObject();
                                    for (q4 q4Var : entry.getValue()) {
                                        jSONArray.put(q4Var.h());
                                        if (r.d(q4Var.i) && !jSONObject.has("ssid")) {
                                            jSONObject.put("ssid", q4Var.i);
                                        }
                                        hashSet.add(q4Var.p);
                                    }
                                    if (this.f275a.a(jSONObject)) {
                                        jSONObject2.put("event_v3", jSONArray);
                                        jSONObject2.put("magic_tag", "ss_app_log");
                                        jSONObject2.put("header", jSONObject);
                                        jSONObject2.put("time_sync", a4.d);
                                        jSONObject2.put("local_time", System.currentTimeMillis() / 1000);
                                        this.f275a.c().a(entry.getValue());
                                        String[] strArr = {this.f275a.e().getProfileUri()};
                                        f0 f0Var2 = this.f275a;
                                        if (f0Var2.d.k.a(strArr, jSONObject2, f0Var2.e) != 200) {
                                            this.f275a.c().d(entry.getValue());
                                            a((Set<String>) hashSet, false);
                                        } else {
                                            a((Set<String>) hashSet, true);
                                        }
                                    } else {
                                        this.f275a.d.D.warn(9, "Register to get ssid by temp header failed.", new Object[0]);
                                    }
                                } catch (Throwable th2) {
                                    this.f275a.d.D.error(9, "Flush failed", th2, new Object[0]);
                                    this.f275a.d.b().a(th2, "profile flush");
                                    a((Set<String>) hashSet, false);
                                }
                            }
                        }
                    }
                }
                return true;
        }
    }

    public final void a(int i, b bVar) {
        if (this.f275a.d.x) {
            return;
        }
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(i, bVar));
    }

    public final void a(Set<String> set, boolean z) {
        if (LogUtils.isDisabled() || set == null || set.isEmpty()) {
            return;
        }
        LogUtils.sendJsonFetcher("event_upload_eid", new a(this, set, this.f275a.d.m, z));
    }
}
