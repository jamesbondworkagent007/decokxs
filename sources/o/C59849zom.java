package o;

/* JADX INFO: renamed from: o.zom, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59849zom {
    public static void EZpvd(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static void AEQbTJ(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        throw new java.lang.IllegalStateException(str + " is null");
    }
}
