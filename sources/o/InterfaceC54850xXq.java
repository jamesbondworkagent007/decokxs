package o;

/* JADX INFO: renamed from: o.xXq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC54850xXq {
    void KWHzl(int i);

    void copydefault();

    /* JADX INFO: renamed from: o.xXq$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ void onError$default(InterfaceC54850xXq interfaceC54850xXq, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
            }
            if ((i2 & 1) != 0) {
                i = 4;
            }
            interfaceC54850xXq.KWHzl(i);
        }
    }
}
