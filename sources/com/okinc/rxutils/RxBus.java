package com.okinc.rxutils;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import io.reactivex.processors.PublishProcessor;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AbstractC58185ywX;
import o.InterfaceC58229yxO;
import o.InterfaceC58239yxY;
import o.InterfaceC60096zvd;
import o.pUU;
import o.yBC;

/* JADX INFO: loaded from: classes11.dex */
public class RxBus {
    public yBC<Application> AEQbTJ;
    public Map<Class<?>, Application> EZpvd;
    public final Object OLrzqt;
    public Handler copydefault;

    public interface Application {
        boolean check(String str);
    }

    public static class StateListAnimator {
        public static RxBus copydefault = new RxBus();

        private StateListAnimator() {
        }
    }

    public static RxBus copydefault() {
        return StateListAnimator.copydefault;
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.yBC<T>, o.yBC<com.okinc.rxutils.RxBus$Application> */
    private RxBus() {
        this.OLrzqt = new Object();
        this.AEQbTJ = PublishProcessor.isConnected().fetchVPNInfo();
        this.EZpvd = new LinkedHashMap(16);
        this.copydefault = new Handler(Looper.getMainLooper());
    }

    public static AbstractC58185ywX<String> AEQbTJ(String... strArr) {
        return KWHzl(TaskDescription.class, strArr).AEQbTJ((InterfaceC58229yxO) new InterfaceC58229yxO<TaskDescription, String>() { // from class: com.okinc.rxutils.RxBus.4
            /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // o.InterfaceC58229yxO
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public String apply(TaskDescription taskDescription) throws Exception {
                return taskDescription.valueOf;
            }
        });
    }

    public static <T extends Application> AbstractC58185ywX<T> KWHzl(Class<T> cls, final String... strArr) {
        return copydefault().AEQbTJ.AYXKKw().EZpvd(cls).KWHzl(new InterfaceC58239yxY<Application>() { // from class: com.okinc.rxutils.RxBus.5
            /* JADX DEBUG: Method merged with bridge method: test(Ljava/lang/Object;)Z */
            @Override // o.InterfaceC58239yxY
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public boolean test(Application application) throws Exception {
                if (application == null) {
                    return false;
                }
                String[] strArr2 = strArr;
                if (strArr2 == null || strArr2.length == 0) {
                    return true;
                }
                for (String str : strArr2) {
                    if (application.check(str)) {
                        return true;
                    }
                }
                return false;
            }
        });
    }

    public static <T extends Application> AbstractC58185ywX<T> AEQbTJ(Class<T> cls, final String... strArr) {
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = KWHzl(cls, strArr);
        Application application = copydefault().EZpvd.get(cls);
        return application == null ? abstractC58185ywXKWHzl : AbstractC58185ywX.KWHzl(application).KWHzl((InterfaceC58239yxY) new InterfaceC58239yxY<Application>() { // from class: com.okinc.rxutils.RxBus.3
            /* JADX DEBUG: Method merged with bridge method: test(Ljava/lang/Object;)Z */
            @Override // o.InterfaceC58239yxY
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public boolean test(Application application2) throws Exception {
                if (application2 == null) {
                    return false;
                }
                String[] strArr2 = strArr;
                if (strArr2 == null) {
                    return true;
                }
                for (String str : strArr2) {
                    if (application2.check(str)) {
                        return true;
                    }
                }
                return false;
            }
        }).AEQbTJ((InterfaceC58229yxO) new InterfaceC58229yxO<Application, T>() { // from class: com.okinc.rxutils.RxBus.1
            /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Incorrect return type in method signature: (Lcom/okinc/rxutils/RxBus$Application;)TT; */
            @Override // o.InterfaceC58229yxO
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public Application apply(Application application2) throws Exception {
                return application2;
            }
        }).AEQbTJ((InterfaceC60096zvd) abstractC58185ywXKWHzl);
    }

    public static <T> void AEQbTJ(Class<T> cls) {
        copydefault().EZpvd.remove(cls);
    }

    public static void KWHzl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AEQbTJ(new TaskDescription(str));
    }

    public static void AEQbTJ(final Application application) {
        if (application == null) {
            pUU.copydefault("RxBus", "post, event is null, return.");
            return;
        }
        synchronized (copydefault().OLrzqt) {
            copydefault().copydefault.post(new Runnable() { // from class: com.okinc.rxutils.RxBus.2
                @Override // java.lang.Runnable
                public void run() {
                    RxBus.copydefault().AEQbTJ.onNext(application);
                }
            });
        }
    }

    public static void KWHzl(Application application) {
        copydefault().EZpvd.put(application.getClass(), application);
        copydefault().AEQbTJ.onNext(application);
    }

    public static class TaskDescription implements Application {
        public String valueOf;

        public TaskDescription(String str) {
            this.valueOf = str;
        }

        @Override // com.okinc.rxutils.RxBus.Application
        public boolean check(String str) {
            String str2 = this.valueOf;
            return str2 != null && str2.equals(str);
        }
    }

    public static abstract class EventCallback<T> extends BaseSubscriber<T> {
        public abstract void onEvent(T t);

        public EventCallback(Object obj) {
            super(obj);
        }

        public EventCallback(Object obj, int i) {
            super(obj, i);
        }

        public EventCallback(Object obj, String str) {
            super(obj, str);
        }

        @Override // o.InterfaceC60097zve
        public void onNext(T t) {
            onEvent(t);
        }
    }
}
