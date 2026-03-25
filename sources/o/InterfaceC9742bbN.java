package o;

/* JADX INFO: renamed from: o.bbN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9742bbN {
    long AEQbTJ();

    java.lang.String AYXKKw();

    java.lang.String AhwBna();

    InterfaceC9780bbz EZpvd();

    java.lang.String KWHzl(boolean z, boolean z2);

    InterfaceC9731bbC KWHzl();

    long OLrzqt();

    java.lang.String OLrzqt(boolean z);

    java.lang.String copydefault();

    java.lang.String djBIcL();

    long gEmmrt();

    java.lang.String valueOf();

    /* JADX INFO: renamed from: o.bbN$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ java.lang.String getDisplayCurrencyAmount$default(InterfaceC9742bbN interfaceC9742bbN, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDisplayCurrencyAmount");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC9742bbN.OLrzqt(z);
        }

        public static /* synthetic */ java.lang.String getDisplayAmount$default(InterfaceC9742bbN interfaceC9742bbN, boolean z, boolean z2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDisplayAmount");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            return interfaceC9742bbN.KWHzl(z, z2);
        }
    }
}
