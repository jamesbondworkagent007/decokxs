package o;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yxz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58266yxz {
    public static final AbstractC58253yxm KWHzl = C58264yxx.OLrzqt(new Callable<AbstractC58253yxm>() { // from class: o.yxz.2
        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public AbstractC58253yxm call() throws java.lang.Exception {
            return Application.OLrzqt;
        }
    });

    /* JADX INFO: renamed from: o.yxz$Application */
    public static final class Application {
        public static final AbstractC58253yxm OLrzqt = new C58263yxw(new android.os.Handler(android.os.Looper.getMainLooper()));

        private Application() {
        }
    }

    public static AbstractC58253yxm OLrzqt() {
        return C58264yxx.OLrzqt(KWHzl);
    }

    private C58266yxz() {
        throw new java.lang.AssertionError("No instances.");
    }
}
