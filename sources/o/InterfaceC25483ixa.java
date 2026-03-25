package o;

/* JADX INFO: renamed from: o.ixa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25483ixa {
    public static final StateListAnimator Companion = StateListAnimator.EZpvd;

    void KWHzl(int i, java.lang.String str);

    void OLrzqt();

    void copydefault();

    void copydefault(int i);

    /* JADX INFO: renamed from: o.ixa$StateListAnimator */
    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator EZpvd = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.ixa$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ void onClaimFailed$default(InterfaceC25483ixa interfaceC25483ixa, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClaimFailed");
            }
            if ((i2 & 2) != 0) {
                str = "";
            }
            interfaceC25483ixa.KWHzl(i, str);
        }
    }
}
