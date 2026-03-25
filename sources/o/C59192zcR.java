package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zcR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59192zcR {
    public static final C59192zcR AEQbTJ = new C59192zcR();

    private C59192zcR() {
    }

    public final boolean EZpvd(@NotNull InterfaceC59384zfy interfaceC59384zfy, @NotNull InterfaceC59382zfw interfaceC59382zfw, @NotNull InterfaceC59382zfw interfaceC59382zfw2) {
        Intrinsics.checkNotNullParameter(interfaceC59384zfy, "");
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        Intrinsics.checkNotNullParameter(interfaceC59382zfw2, "");
        return AEQbTJ(interfaceC59384zfy, interfaceC59382zfw, interfaceC59382zfw2);
    }

    public final boolean AEQbTJ(InterfaceC59384zfy interfaceC59384zfy, InterfaceC59382zfw interfaceC59382zfw, InterfaceC59382zfw interfaceC59382zfw2) {
        if (interfaceC59382zfw == interfaceC59382zfw2) {
            return true;
        }
        InterfaceC59381zfv interfaceC59381zfvOLrzqt = interfaceC59384zfy.OLrzqt(interfaceC59382zfw);
        InterfaceC59381zfv interfaceC59381zfvOLrzqt2 = interfaceC59384zfy.OLrzqt(interfaceC59382zfw2);
        if (interfaceC59381zfvOLrzqt != null && interfaceC59381zfvOLrzqt2 != null) {
            return copydefault(interfaceC59384zfy, interfaceC59381zfvOLrzqt, interfaceC59381zfvOLrzqt2);
        }
        InterfaceC59374zfo interfaceC59374zfoKWHzl = interfaceC59384zfy.KWHzl(interfaceC59382zfw);
        InterfaceC59374zfo interfaceC59374zfoKWHzl2 = interfaceC59384zfy.KWHzl(interfaceC59382zfw2);
        if (interfaceC59374zfoKWHzl == null || interfaceC59374zfoKWHzl2 == null) {
            return false;
        }
        return copydefault(interfaceC59384zfy, interfaceC59384zfy.copydefault(interfaceC59374zfoKWHzl), interfaceC59384zfy.copydefault(interfaceC59374zfoKWHzl2)) && copydefault(interfaceC59384zfy, interfaceC59384zfy.OLrzqt(interfaceC59374zfoKWHzl), interfaceC59384zfy.OLrzqt(interfaceC59374zfoKWHzl2));
    }

    public final boolean copydefault(InterfaceC59384zfy interfaceC59384zfy, InterfaceC59381zfv interfaceC59381zfv, InterfaceC59381zfv interfaceC59381zfv2) {
        if (interfaceC59384zfy.AEQbTJ((InterfaceC59382zfw) interfaceC59381zfv) != interfaceC59384zfy.AEQbTJ((InterfaceC59382zfw) interfaceC59381zfv2) || interfaceC59384zfy.values((InterfaceC59382zfw) interfaceC59381zfv) != interfaceC59384zfy.values((InterfaceC59382zfw) interfaceC59381zfv2) || interfaceC59384zfy.copydefault(interfaceC59381zfv) != interfaceC59384zfy.copydefault(interfaceC59381zfv2) || !interfaceC59384zfy.copydefault(interfaceC59384zfy.fetchVPNInfo(interfaceC59381zfv), interfaceC59384zfy.fetchVPNInfo(interfaceC59381zfv2))) {
            return false;
        }
        if (interfaceC59384zfy.AEQbTJ(interfaceC59381zfv, interfaceC59381zfv2)) {
            return true;
        }
        int iAEQbTJ = interfaceC59384zfy.AEQbTJ((InterfaceC59382zfw) interfaceC59381zfv);
        for (int i = 0; i < iAEQbTJ; i++) {
            InterfaceC59334zfA interfaceC59334zfACopydefault = interfaceC59384zfy.copydefault(interfaceC59381zfv, i);
            InterfaceC59334zfA interfaceC59334zfACopydefault2 = interfaceC59384zfy.copydefault(interfaceC59381zfv2, i);
            if (interfaceC59384zfy.EZpvd(interfaceC59334zfACopydefault) != interfaceC59384zfy.EZpvd(interfaceC59334zfACopydefault2)) {
                return false;
            }
            if (!interfaceC59384zfy.EZpvd(interfaceC59334zfACopydefault)) {
                if (interfaceC59384zfy.AEQbTJ(interfaceC59334zfACopydefault) != interfaceC59384zfy.AEQbTJ(interfaceC59334zfACopydefault2)) {
                    return false;
                }
                InterfaceC59382zfw interfaceC59382zfwOLrzqt = interfaceC59384zfy.OLrzqt(interfaceC59334zfACopydefault);
                Intrinsics.copydefault(interfaceC59382zfwOLrzqt);
                InterfaceC59382zfw interfaceC59382zfwOLrzqt2 = interfaceC59384zfy.OLrzqt(interfaceC59334zfACopydefault2);
                Intrinsics.copydefault(interfaceC59382zfwOLrzqt2);
                if (!AEQbTJ(interfaceC59384zfy, interfaceC59382zfwOLrzqt, interfaceC59382zfwOLrzqt2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
