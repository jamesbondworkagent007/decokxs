package o;

import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import com.okinc.business.defi.tee.bean.CacheState;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import o.dTO;
import o.dTR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fXj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17925fXj {
    public static final C17925fXj EZpvd = new C17925fXj();
    public static dTO AEQbTJ = dTO.Companion.KWHzl();
    public static java.util.Map<java.lang.String, dTR> OLrzqt = new LinkedHashMap();
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dTO copydefault() {
        return AEQbTJ;
    }

    private C17925fXj() {
    }

    public final void EZpvd() {
        if (AEQbTJ.AEQbTJ() == CacheState.None) {
            AEQbTJ = dTO.Companion.copydefault();
        }
    }

    public final void OLrzqt(@NotNull TeeMetadata teeMetadata) {
        Intrinsics.checkNotNullParameter(teeMetadata, "");
        try {
            dTO.Application application = dTO.Companion;
            java.util.List<java.lang.Long> supportChainIndexList = teeMetadata.getSupportChainIndexList();
            boolean zIsTeeServiceMaintenance = teeMetadata.isTeeServiceMaintenance();
            long upgradeAssetThreshold = teeMetadata.getUpgradeAssetThreshold();
            java.lang.Integer entranceCloseFlag = teeMetadata.getEntranceCloseFlag();
            AEQbTJ = application.AEQbTJ(supportChainIndexList, zIsTeeServiceMaintenance, upgradeAssetThreshold, entranceCloseFlag != null ? entranceCloseFlag.intValue() : 0);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (copydefault(str).KWHzl() == CacheState.None) {
            OLrzqt.put(str, dTR.Companion.KWHzl());
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull SingleTeeStatus singleTeeStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(singleTeeStatus, "");
        java.util.Map<java.lang.String, dTR> map = OLrzqt;
        dTR.Activity activity = dTR.Companion;
        java.util.List<java.lang.Long> chainIndexList = singleTeeStatus.getChainIndexList();
        if (chainIndexList == null) {
            chainIndexList = yDY.AhwBna();
        }
        map.put(str, activity.OLrzqt(chainIndexList));
    }

    public final dTR copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt.getOrDefault(str, dTR.Companion.OLrzqt());
    }
}
