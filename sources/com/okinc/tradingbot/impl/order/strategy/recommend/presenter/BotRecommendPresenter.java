package com.okinc.tradingbot.impl.order.strategy.recommend.presenter;

import android.app.Application;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.tradelite.bean.TradeProductId;
import com.okinc.unify_trade.biz.AIData;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.ProfitAutoReinvestParam;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56059xvf;
import o.C56111xwe;
import o.C56280xzo;
import o.C56402yEa;
import o.vTO;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotRecommendPresenter extends AbsPresenter {
    public final C56111xwe<List<SmartRecommendResp>> KWHzl;
    public final C56280xzo copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = C56111xwe.AEQbTJ | C56280xzo.KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<SmartRecommendResp>> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56280xzo OLrzqt() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotRecommendPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = new C56280xzo();
        this.KWHzl = new C56111xwe<>();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.recommend.presenter.BotRecommendPresenter.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Parcelable AEQbTJ(@NotNull SmartRecommendResp smartRecommendResp) {
            String algoOrdType;
            Intrinsics.checkNotNullParameter(smartRecommendResp, "");
            StgyParam stgyParam = smartRecommendResp.getStgyParam();
            if (stgyParam == null || (algoOrdType = smartRecommendResp.getAlgoOrdType()) == null) {
                return null;
            }
            switch (algoOrdType.hashCode()) {
                case -1831183611:
                    if (!algoOrdType.equals("spot_dca")) {
                        return null;
                    }
                    String pxSteps = stgyParam.getPxSteps();
                    String tpPct = stgyParam.getTpPct();
                    String maxSafetyOrds = stgyParam.getMaxSafetyOrds();
                    boolean reserveFunds = stgyParam.getReserveFunds();
                    String volMult = stgyParam.getVolMult();
                    String pxStepsMult = stgyParam.getPxStepsMult();
                    String slPct = stgyParam.getSlPct();
                    return new DcaOrderReq((String) null, stgyParam.getInitOrdAmt(), Boolean.valueOf(reserveFunds), stgyParam.getSafetyOrdAmt(), maxSafetyOrds, pxSteps, pxStepsMult, volMult, tpPct, slPct, stgyParam.getDirection(), (String) null, (String) null, stgyParam.getUserRiskMode(), (String) null, stgyParam.getLever(), stgyParam.getSlMode(), (List) stgyParam.getTriggerParams(), stgyParam.getInitOrdPct(), (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (AutoVipProfitInfo) null, -501759, 15, (DefaultConstructorMarker) null);
                case -1402017003:
                    if (!algoOrdType.equals("contract_dca")) {
                        return null;
                    }
                    String pxSteps2 = stgyParam.getPxSteps();
                    String tpPct2 = stgyParam.getTpPct();
                    String maxSafetyOrds2 = stgyParam.getMaxSafetyOrds();
                    boolean reserveFunds2 = stgyParam.getReserveFunds();
                    String volMult2 = stgyParam.getVolMult();
                    String pxStepsMult2 = stgyParam.getPxStepsMult();
                    String slPct2 = stgyParam.getSlPct();
                    return new DcaOrderReq((String) null, stgyParam.getInitOrdAmt(), Boolean.valueOf(reserveFunds2), stgyParam.getSafetyOrdAmt(), maxSafetyOrds2, pxSteps2, pxStepsMult2, volMult2, tpPct2, slPct2, stgyParam.getDirection(), (String) null, (String) null, stgyParam.getUserRiskMode(), (String) null, stgyParam.getLever(), stgyParam.getSlMode(), (List) stgyParam.getTriggerParams(), stgyParam.getInitOrdPct(), (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (AutoVipProfitInfo) null, -501759, 15, (DefaultConstructorMarker) null);
                case -512749997:
                    if (!algoOrdType.equals("contract_grid")) {
                        return null;
                    }
                    String gridNum = stgyParam.getGridNum();
                    String str = gridNum != null ? "" : gridNum;
                    String minPx = stgyParam.getMinPx();
                    String str2 = minPx != null ? "" : minPx;
                    String maxPx = stgyParam.getMaxPx();
                    String str3 = maxPx != null ? "" : maxPx;
                    String runType = stgyParam.getRunType();
                    String str4 = runType != null ? "" : runType;
                    String lever = stgyParam.getLever();
                    String str5 = lever != null ? "" : lever;
                    String direction = stgyParam.getDirection();
                    String str6 = direction != null ? "" : direction;
                    String displayName = stgyParam.getDisplayName();
                    String str7 = displayName != null ? "" : displayName;
                    String perGridProfitRatio = stgyParam.getPerGridProfitRatio();
                    return new AIData((String) null, str, str3, str2, (String) null, (String) null, (String) null, str4, str6, str7, str5, (ArrayList) null, (Boolean) null, (TrailingConfig) null, (TrailingConfig) null, true, (String) null, (String) null, (TpSlTriggerParam) null, perGridProfitRatio != null ? "" : perGridProfitRatio, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, -558991, 3, (DefaultConstructorMarker) null);
                case 3181382:
                    if (!algoOrdType.equals("grid")) {
                        return null;
                    }
                    String gridNum2 = stgyParam.getGridNum();
                    if (gridNum2 != null) {
                    }
                    String minPx2 = stgyParam.getMinPx();
                    if (minPx2 != null) {
                    }
                    String maxPx2 = stgyParam.getMaxPx();
                    if (maxPx2 != null) {
                    }
                    String runType2 = stgyParam.getRunType();
                    if (runType2 != null) {
                    }
                    String lever2 = stgyParam.getLever();
                    if (lever2 != null) {
                    }
                    String direction2 = stgyParam.getDirection();
                    if (direction2 != null) {
                    }
                    String displayName2 = stgyParam.getDisplayName();
                    if (displayName2 != null) {
                    }
                    String perGridProfitRatio2 = stgyParam.getPerGridProfitRatio();
                    return new AIData((String) null, str, str3, str2, (String) null, (String) null, (String) null, str4, str6, str7, str5, (ArrayList) null, (Boolean) null, (TrailingConfig) null, (TrailingConfig) null, true, (String) null, (String) null, (TpSlTriggerParam) null, perGridProfitRatio2 != null ? "" : perGridProfitRatio2, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, -558991, 3, (DefaultConstructorMarker) null);
                default:
                    return null;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r22v0, resolved type: java.lang.String */
        /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: java.lang.Boolean */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x019b, code lost:
        
            if (r2.equals("contract_dca") == false) goto L174;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x01a5, code lost:
        
            if (r2.equals("spot_dca") == false) goto L174;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Parcelable OLrzqt(@NotNull SmartRecommendResp smartRecommendResp) {
            String displayName;
            String direction;
            String lever;
            String runType;
            String maxPx;
            String minPx;
            String gridNum;
            String runType2;
            String gridNum2;
            String minPx2;
            String maxPx2;
            Intrinsics.checkNotNullParameter(smartRecommendResp, "");
            String algoOrdType = smartRecommendResp.getAlgoOrdType();
            if (algoOrdType != null) {
                switch (algoOrdType.hashCode()) {
                    case -1831183611:
                        break;
                    case -1402017003:
                        break;
                    case -512749997:
                        if (algoOrdType.equals("contract_grid")) {
                            String instId = smartRecommendResp.getInstId();
                            String str = instId == null ? "" : instId;
                            StgyParam stgyParam = smartRecommendResp.getStgyParam();
                            String str2 = (stgyParam == null || (gridNum = stgyParam.getGridNum()) == null) ? "" : gridNum;
                            StgyParam stgyParam2 = smartRecommendResp.getStgyParam();
                            String str3 = (stgyParam2 == null || (minPx = stgyParam2.getMinPx()) == null) ? "" : minPx;
                            StgyParam stgyParam3 = smartRecommendResp.getStgyParam();
                            String str4 = (stgyParam3 == null || (maxPx = stgyParam3.getMaxPx()) == null) ? "" : maxPx;
                            StgyParam stgyParam4 = smartRecommendResp.getStgyParam();
                            String str5 = (stgyParam4 == null || (runType = stgyParam4.getRunType()) == null) ? "" : runType;
                            StgyParam stgyParam5 = smartRecommendResp.getStgyParam();
                            String str6 = (stgyParam5 == null || (lever = stgyParam5.getLever()) == null) ? "" : lever;
                            StgyParam stgyParam6 = smartRecommendResp.getStgyParam();
                            String str7 = (stgyParam6 == null || (direction = stgyParam6.getDirection()) == null) ? "" : direction;
                            StgyParam stgyParam7 = smartRecommendResp.getStgyParam();
                            String str8 = (stgyParam7 == null || (displayName = stgyParam7.getDisplayName()) == null) ? "" : displayName;
                            StgyParam stgyParam8 = smartRecommendResp.getStgyParam();
                            return new ContractGridReq(str, (String) null, (Boolean) (Intrinsics.EZpvd((Object) (stgyParam8 != null ? stgyParam8.getDirection() : null), (Object) "neutral") ? null : Boolean.TRUE), str2, "1", str4, str3, (String) null, str5, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str7, str8, str6, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, -229758, 15, (DefaultConstructorMarker) null);
                        }
                        break;
                    case 3181382:
                        if (algoOrdType.equals("grid")) {
                            String instId2 = smartRecommendResp.getInstId();
                            String str9 = instId2 == null ? "" : instId2;
                            StgyParam stgyParam9 = smartRecommendResp.getStgyParam();
                            String str10 = (stgyParam9 == null || (maxPx2 = stgyParam9.getMaxPx()) == null) ? "" : maxPx2;
                            StgyParam stgyParam10 = smartRecommendResp.getStgyParam();
                            String str11 = (stgyParam10 == null || (minPx2 = stgyParam10.getMinPx()) == null) ? "" : minPx2;
                            StgyParam stgyParam11 = smartRecommendResp.getStgyParam();
                            String str12 = (stgyParam11 == null || (gridNum2 = stgyParam11.getGridNum()) == null) ? "" : gridNum2;
                            StgyParam stgyParam12 = smartRecommendResp.getStgyParam();
                            return new GridReq(str10, str11, str12, (stgyParam12 == null || (runType2 = stgyParam12.getRunType()) == null) ? "" : runType2, (String) null, (String) null, "1", (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (ArrayList) null, (Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, str9, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnRequestParam) null, (String) null, (String) null, (String) null, (ProfitAutoReinvestParam) null, -1048656, 15, (DefaultConstructorMarker) null);
                        }
                        break;
                }
                StgyParam stgyParam13 = smartRecommendResp.getStgyParam();
                String pxSteps = stgyParam13 != null ? stgyParam13.getPxSteps() : null;
                StgyParam stgyParam14 = smartRecommendResp.getStgyParam();
                String tpPct = stgyParam14 != null ? stgyParam14.getTpPct() : null;
                StgyParam stgyParam15 = smartRecommendResp.getStgyParam();
                String maxSafetyOrds = stgyParam15 != null ? stgyParam15.getMaxSafetyOrds() : null;
                StgyParam stgyParam16 = smartRecommendResp.getStgyParam();
                Boolean boolValueOf = stgyParam16 != null ? Boolean.valueOf(stgyParam16.getReserveFunds()) : null;
                StgyParam stgyParam17 = smartRecommendResp.getStgyParam();
                String volMult = stgyParam17 != null ? stgyParam17.getVolMult() : null;
                StgyParam stgyParam18 = smartRecommendResp.getStgyParam();
                String pxStepsMult = stgyParam18 != null ? stgyParam18.getPxStepsMult() : null;
                StgyParam stgyParam19 = smartRecommendResp.getStgyParam();
                String slPct = stgyParam19 != null ? stgyParam19.getSlPct() : null;
                StgyParam stgyParam20 = smartRecommendResp.getStgyParam();
                String initOrdAmt = stgyParam20 != null ? stgyParam20.getInitOrdAmt() : null;
                StgyParam stgyParam21 = smartRecommendResp.getStgyParam();
                String safetyOrdAmt = stgyParam21 != null ? stgyParam21.getSafetyOrdAmt() : null;
                StgyParam stgyParam22 = smartRecommendResp.getStgyParam();
                String direction2 = stgyParam22 != null ? stgyParam22.getDirection() : null;
                StgyParam stgyParam23 = smartRecommendResp.getStgyParam();
                String lever2 = stgyParam23 != null ? stgyParam23.getLever() : null;
                StgyParam stgyParam24 = smartRecommendResp.getStgyParam();
                String initOrdPct = stgyParam24 != null ? stgyParam24.getInitOrdPct() : null;
                StgyParam stgyParam25 = smartRecommendResp.getStgyParam();
                List<DcaTriggerParam> triggerParams = stgyParam25 != null ? stgyParam25.getTriggerParams() : null;
                StgyParam stgyParam26 = smartRecommendResp.getStgyParam();
                String userRiskMode = stgyParam26 != null ? stgyParam26.getUserRiskMode() : null;
                StgyParam stgyParam27 = smartRecommendResp.getStgyParam();
                return new DcaOrderReq((String) null, initOrdAmt, boolValueOf, safetyOrdAmt, maxSafetyOrds, pxSteps, pxStepsMult, volMult, tpPct, slPct, direction2, "1", (String) null, userRiskMode, (String) null, lever2, (String) (stgyParam27 != null ? stgyParam27.getSlMode() : null), (List) triggerParams, initOrdPct, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (AutoVipProfitInfo) null, -503807, 15, (DefaultConstructorMarker) null);
            }
            return new GridReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (ArrayList) null, (Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnRequestParam) null, (String) null, (String) null, (String) null, (ProfitAutoReinvestParam) null, -1, 15, (DefaultConstructorMarker) null);
        }
    }

    public static /* synthetic */ void queryRecommendList$default(BotRecommendPresenter botRecommendPresenter, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        botRecommendPresenter.KWHzl(str, str2, z);
    }

    public final void KWHzl(String str, String str2, boolean z) {
        C56280xzo c56280xzo = this.copydefault;
        c56280xzo.EZpvd(C56059xvf.EZpvd.djBIcL(), "official", str, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? null : str2, (56 & 32) != 0 ? null : z ? "segmented_hedging" : null);
        c56280xzo.OLrzqt(this.KWHzl, new vTO());
        xKK.Activity.execute$default(c56280xzo, 0L, 1, null);
    }

    public final TradeProductId copydefault(String str) {
        return Intrinsics.EZpvd((Object) str, (Object) "spot_dca") ? TradeProductId.SPOT_DCA : TradeProductId.SPOT_GRID;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.copydefault);
    }
}
