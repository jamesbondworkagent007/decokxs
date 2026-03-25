package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.leP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC30608leP {
    void KWHzl(@NotNull InterfaceC30619lea interfaceC30619lea, @NotNull kRM krm);

    void copydefault(@NotNull java.lang.String str, @NotNull kRM krm);

    /* JADX INFO: renamed from: o.leP$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ void trackEvent$default(InterfaceC30608leP interfaceC30608leP, InterfaceC30619lea interfaceC30619lea, kRM krm, int i, java.lang.Object obj) {
            InterfaceC30608leP interfaceC30608leP2;
            InterfaceC30619lea interfaceC30619lea2;
            kRM krm2;
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackEvent");
            }
            if ((i & 2) != 0) {
                krm2 = new kRM(null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, false, 1048575, null);
                interfaceC30608leP2 = interfaceC30608leP;
                interfaceC30619lea2 = interfaceC30619lea;
            } else {
                interfaceC30608leP2 = interfaceC30608leP;
                interfaceC30619lea2 = interfaceC30619lea;
                krm2 = krm;
            }
            interfaceC30608leP2.KWHzl(interfaceC30619lea2, krm2);
        }

        public static /* synthetic */ void trackView$default(InterfaceC30608leP interfaceC30608leP, java.lang.String str, kRM krm, int i, java.lang.Object obj) {
            InterfaceC30608leP interfaceC30608leP2;
            java.lang.String str2;
            kRM krm2;
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackView");
            }
            if ((i & 2) != 0) {
                krm2 = new kRM(null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, false, 1048575, null);
                interfaceC30608leP2 = interfaceC30608leP;
                str2 = str;
            } else {
                interfaceC30608leP2 = interfaceC30608leP;
                str2 = str;
                krm2 = krm;
            }
            interfaceC30608leP2.copydefault(str2, krm2);
        }
    }
}
