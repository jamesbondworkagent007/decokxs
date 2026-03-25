package o;

import androidx.camera.video.AudioStats;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData;
import com.okinc.business.dex.trade.copytrading.home.data.CTStrategy;
import com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus;
import com.okinc.business.dex.trade.copytrading.home.ui.StrategyCellType;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.JsonObject;
import o.C23274hvD;
import o.InterfaceC19982gWn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gWB {

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[StrategyCellType.values().length];
            try {
                iArr[StrategyCellType.PnL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[StrategyCellType.EndsIn.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[StrategyCellType.Txns.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[StrategyCellType.BoughtSold.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[StrategyStatus.values().length];
            try {
                iArr2[StrategyStatus.Expired.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[StrategyStatus.Done.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[StrategyStatus.Delete.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[StrategyStatus.SystemSuspended.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[StrategyStatus.Pause.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[StrategyStatus.Active.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            EZpvd = iArr2;
        }
    }

    @yCM
    public gWB() {
    }

    public final C19983gWo KWHzl(TeeWsOriginData teeWsOriginData, @NotNull C19983gWo c19983gWo) {
        JsonObject data;
        Intrinsics.checkNotNullParameter(c19983gWo, "");
        CTStrategy cTStrategy = (teeWsOriginData == null || (data = teeWsOriginData.getData()) == null) ? null : (CTStrategy) C43284rmQ.KWHzl().decodeFromJsonElement(CTStrategy.Companion.serializer(), data);
        if (cTStrategy == null) {
            return c19983gWo;
        }
        java.lang.String strategyId = cTStrategy.getStrategyId();
        java.lang.String strAYXKKw = c19983gWo.AYXKKw();
        java.lang.String strOLrzqt = c19983gWo.OLrzqt();
        java.lang.String strEZpvd = c19983gWo.EZpvd();
        java.lang.String strGEmmrt = c19983gWo.gEmmrt();
        java.lang.String strAEQbTJ = c19983gWo.AEQbTJ();
        java.lang.String strAhwBna = c19983gWo.AhwBna();
        boolean zDjBIcL = c19983gWo.djBIcL();
        boolean zFetchVPNInfo = c19983gWo.fetchVPNInfo();
        java.util.List<C19981gWm> listKWHzl = c19983gWo.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        for (C19981gWm c19981gWmOLrzqt : listKWHzl) {
            int i = StateListAnimator.OLrzqt[c19981gWmOLrzqt.EZpvd().ordinal()];
            if (i == 1) {
                c19981gWmOLrzqt = OLrzqt(cTStrategy);
            } else if (i == 3) {
                c19981gWmOLrzqt = KWHzl(cTStrategy);
            } else if (i == 4) {
                c19981gWmOLrzqt = EZpvd(cTStrategy);
            }
            arrayList.add(c19981gWmOLrzqt);
        }
        return new C19983gWo(strategyId, strAYXKKw, strOLrzqt, strEZpvd, strGEmmrt, strAEQbTJ, strAhwBna, arrayList, zDjBIcL, zFetchVPNInfo, C33129mqd.valueOf(cTStrategy.getExpireTime()));
    }

    public final C19981gWm OLrzqt(CTStrategy cTStrategy) {
        return new C19981gWm(null, new InterfaceC19982gWn.StateListAnimator(cTStrategy.getTotalPnL().getPnLUsdValue(), !C59449zhJ.startsWith$default(cTStrategy.getTotalPnL().getPnLUsdValue(), "-", false, 2, null)), StrategyCellType.PnL, null, 9, null);
    }

    public final C19981gWm copydefault(CTStrategy cTStrategy) {
        return new C19981gWm(null, new InterfaceC19982gWn.ActionBar(AhwBna(cTStrategy), null, null, null, null, 30, null), StrategyCellType.Status, null, 9, null);
    }

    public final C19981gWm AEQbTJ(CTStrategy cTStrategy) {
        return new C19981gWm(null, new InterfaceC19982gWn.ActionBar(AYXKKw(cTStrategy), null, null, null, null, 30, null), StrategyCellType.EndsIn, null, 9, null);
    }

    public final C19981gWm KWHzl(CTStrategy cTStrategy) {
        return new C19981gWm(null, new InterfaceC19982gWn.Activity(C33129mqd.gEmmrt(java.lang.Integer.valueOf(cTStrategy.getCopyBuyNum())), C33129mqd.gEmmrt(java.lang.Integer.valueOf(cTStrategy.getSellNum()))), StrategyCellType.Txns, null, 9, null);
    }

    public final C19981gWm EZpvd(CTStrategy cTStrategy) {
        return new C19981gWm(null, new InterfaceC19982gWn.Application(C33129mqd.gEmmrt(cTStrategy.getBoughtTokenInfo().getTokenUsd()), C33129mqd.gEmmrt(cTStrategy.getSoldTokenInfo().getTokenUsd())), StrategyCellType.BoughtSold, null, 9, null);
    }

    public final boolean OLrzqt(StrategyStatus strategyStatus) {
        return strategyStatus == StrategyStatus.Delete || strategyStatus == StrategyStatus.Done || strategyStatus == StrategyStatus.Expired;
    }

    public final java.lang.String AhwBna(CTStrategy cTStrategy) {
        switch (StateListAnimator.EZpvd[StrategyStatus.Companion.KWHzl(cTStrategy.getUseStatus()).ordinal()]) {
            case 1:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.fQQVvf);
            case 2:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.hKJZrr);
            case 3:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.hKJZrr);
            case 4:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.RckOJh);
            case 5:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.RckOJh);
            case 6:
                return AYXKKw(cTStrategy);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final java.lang.String AYXKKw(CTStrategy cTStrategy) {
        double time = (new Date((long) ((C33129mqd.valueOf(cTStrategy.getExpireTime()) / 1000.0d) * ((double) 1000))).getTime() - new Date().getTime()) / 1000.0d;
        if (time <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.fQQVvf);
        }
        if (time >= 86400.0d) {
            int iCeil = (int) java.lang.Math.ceil(time / 86400.0d);
            return pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C23274hvD.FragmentManager.AYXKKw, iCeil, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(iCeil))));
        }
        if (time >= 3600.0d) {
            int iCeil2 = (int) java.lang.Math.ceil(time / 3600.0d);
            return pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C23274hvD.FragmentManager.AkhnZx, iCeil2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(iCeil2))));
        }
        int iCeil3 = (int) java.lang.Math.ceil(time / 60.0d);
        return pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C23274hvD.FragmentManager.fetchVPNInfo, iCeil3, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(iCeil3))));
    }

    public final java.util.List<C19983gWo> KWHzl(@NotNull java.util.List<CTStrategy> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (CTStrategy cTStrategy : list) {
            java.lang.String strategyId = cTStrategy.getStrategyId();
            java.lang.String logo = cTStrategy.getKolInfo().getLogo();
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(cTStrategy.getChainId()));
            java.lang.String chainLogo = cTStrategy.getChainLogo();
            java.lang.String copyTradeName = cTStrategy.getCopyTradeName();
            java.lang.String trackedAddress = cTStrategy.getTrackedAddress();
            java.lang.String name = cTStrategy.getKolInfo().getName();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) name)) {
                name = C25352ivB.formatAddress$default(cTStrategy.getTrackedAddress(), 6, 4, null, 4, null);
            }
            java.lang.String str = name;
            boolean z2 = cTStrategy.getUseStatus() == StrategyStatus.Active.getStatus();
            boolean zOLrzqt = OLrzqt(StrategyStatus.Companion.KWHzl(cTStrategy.getUseStatus()));
            C19981gWm[] c19981gWmArr = new C19981gWm[4];
            c19981gWmArr[0] = OLrzqt(cTStrategy);
            c19981gWmArr[1] = z ? copydefault(cTStrategy) : AEQbTJ(cTStrategy);
            c19981gWmArr[2] = KWHzl(cTStrategy);
            c19981gWmArr[3] = EZpvd(cTStrategy);
            arrayList.add(new C19983gWo(strategyId, logo, strGEmmrt, chainLogo, copyTradeName, trackedAddress, str, yDY.gEmmrt(c19981gWmArr), z2, zOLrzqt, C33129mqd.valueOf(cTStrategy.getExpireTime())));
        }
        return arrayList;
    }
}
