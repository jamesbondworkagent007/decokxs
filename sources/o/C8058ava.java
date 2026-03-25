package o;

/* JADX INFO: renamed from: o.ava, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8058ava {
    public static void AEQbTJ(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.NullPointerException(str);
        }
    }

    public static boolean EZpvd(InterfaceC58256yxp<?> interfaceC58256yxp) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            return true;
        }
        interfaceC58256yxp.onSubscribe(C58215yxA.copydefault());
        interfaceC58256yxp.onError(new java.lang.IllegalStateException("Expected to be called on the main thread but was " + java.lang.Thread.currentThread().getName()));
        return false;
    }

    private C8058ava() {
        throw new java.lang.AssertionError("No instances.");
    }
}
