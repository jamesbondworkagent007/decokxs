package o;

import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.config.ImEnabledStatus;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oGU {
    public static final oGU KWHzl = new oGU();

    private oGU() {
    }

    public static /* synthetic */ boolean isInPlanetMode$default(oGU ogu, ChatOrigin chatOrigin, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            chatOrigin = ChatOrigin.UNKNOWN;
        }
        return ogu.OLrzqt(chatOrigin);
    }

    public final boolean OLrzqt(@NotNull ChatOrigin chatOrigin) {
        Intrinsics.checkNotNullParameter(chatOrigin, "");
        InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
        boolean fieldNames = interfaceC33171mrS.getFieldNames();
        boolean zFIwbmz = interfaceC33171mrS.fIwbmz();
        boolean zAhwBna = ((tWL) C43251rlk.copydefault(tWL.class)).AhwBna();
        boolean z = zAhwBna && !zFIwbmz && fieldNames && !(chatOrigin == ChatOrigin.P2P);
        pUU.KWHzl("IMModeUtil", "isInPlanetMode: " + z + ", isProMode=" + fieldNames + ", isOnChain:" + zFIwbmz + ", isPlanetEnabled=" + zAhwBna);
        return z;
    }

    public final boolean KWHzl() {
        InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
        boolean zFJNWhG = interfaceC33171mrS.fJNWhG();
        boolean zFIwbmz = interfaceC33171mrS.fIwbmz();
        boolean z = !zFIwbmz && zFJNWhG;
        pUU.KWHzl("IMModeUtil", "isInPayMode: " + z + ", isPay=" + zFJNWhG + ", isOnChain:" + zFIwbmz);
        return z;
    }

    public final boolean copydefault() {
        boolean zKWHzl = C33216msK.KWHzl.KWHzl();
        pUU.KWHzl("IMModeUtil", "isPlanetEnabled: " + zKWHzl);
        return zKWHzl;
    }

    public final ImEnabledStatus AEQbTJ() {
        boolean zUzCIH = sDZ.AEQbTJ.uzCIH();
        InterfaceC31422lti interfaceC31422lti = (InterfaceC31422lti) C43251rlk.OLrzqt(InterfaceC31422lti.class);
        boolean zOLrzqt = interfaceC31422lti != null ? interfaceC31422lti.OLrzqt() : false;
        boolean z = ((OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class)) != null ? !r3.AEQbTJ(OKComplianceRestrictionService.Feature.VIP_SERVICE_GROUP) : false;
        pUU.KWHzl("IMModeUtil", "isAllowImEntryPoint: isIMEnabled: " + zUzCIH + ", isOtcAgentEnabled: " + zOLrzqt + " isVipServiceEnabled: " + z);
        if (zUzCIH) {
            return ImEnabledStatus.Full;
        }
        if (zOLrzqt) {
            return ImEnabledStatus.Limited;
        }
        if (z) {
            return ImEnabledStatus.Limited;
        }
        return ImEnabledStatus.Disabled;
    }
}
