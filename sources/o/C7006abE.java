package o;

/* JADX INFO: renamed from: o.abE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7006abE {
    public static void AEQbTJ(java.lang.Exception exc) {
        AEQbTJ(exc.toString());
    }

    public static void AEQbTJ(java.lang.String str) {
        throw new java.lang.IllegalStateException("failure '" + str + "'");
    }

    public static void copydefault(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException("assert failed");
        }
    }
}
