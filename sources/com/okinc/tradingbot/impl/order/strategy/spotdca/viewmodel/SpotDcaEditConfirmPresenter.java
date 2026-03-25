package com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel;

import android.app.Application;
import android.os.Bundle;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.tradingbot.impl.order.strategy.data.SpotDcaConfirmMoreData;
import com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams;
import com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaEditParam;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.SpotDcaEditParamRep;
import com.okinc.unify_trade.biz.SpotGridEditParamRep;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C53392wkd;
import o.C53393wke;
import o.C54507xKz;
import o.C56033xvF;
import o.C56241xzB;
import o.C56402yEa;
import o.xKK;
import o.xMR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SpotDcaEditConfirmPresenter extends AbsPresenter {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public C53393wke AEQbTJ;
    public TacticsData AYXKKw;
    public String AhwBna;
    public SpotDcaEditParam EZpvd;
    public final C56241xzB OLrzqt;
    public final TradeLiveData<SpotGridEditParamRep> copydefault;
    public final SpotDcaConfirmMoreData djBIcL;
    public StrategyConfigInfo gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<SpotGridEditParamRep> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C53393wke AYXKKw() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotDcaEditParam EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(C53393wke c53393wke) {
        this.AEQbTJ = c53393wke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56241xzB KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotDcaConfirmMoreData djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData valueOf() {
        return this.AYXKKw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDcaEditConfirmPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = new C56241xzB();
        this.copydefault = new TradeLiveData<>();
        this.AhwBna = "";
        this.djBIcL = new SpotDcaConfirmMoreData("less");
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaEditConfirmPresenter.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final List<DcaTriggerParam> OLrzqt() {
        return C56402yEa.EZpvd(new DcaTriggerParam(TtmlNode.START, ContractDcaTriggerType.INSTANT.getMode(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, PointerIconCompat.TYPE_GRAB, (DefaultConstructorMarker) null));
    }

    public final void KWHzl(Bundle bundle) {
        String instType;
        String instId;
        this.AYXKKw = bundle != null ? (TacticsData) bundle.getParcelable("bot_spot_dca_data") : null;
        this.EZpvd = bundle != null ? (SpotDcaEditParam) bundle.getParcelable("bot_spot_dca_edit_param_req") : null;
        this.gEmmrt = bundle != null ? (StrategyConfigInfo) bundle.getParcelable("bot_spot_dca_edit_param_strategy_info") : null;
        TacticsData tacticsData = this.AYXKKw;
        String str = "";
        if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsData2 = this.AYXKKw;
        if (tacticsData2 != null && (instId = tacticsData2.getInstId()) != null) {
            str = instId;
        }
        this.AhwBna = C56033xvF.AEQbTJ(instType, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[PHI: r2
  0x004c: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v31 java.lang.String) binds: [B:9:0x003c, B:14:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089 A[PHI: r2
  0x0089: PHI (r2v24 java.lang.String) = (r2v12 java.lang.String), (r2v25 java.lang.String) binds: [B:33:0x0085, B:28:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4 A[PHI: r2
  0x00a4: PHI (r2v22 java.lang.String) = (r2v17 java.lang.String), (r2v23 java.lang.String) binds: [B:44:0x00a0, B:39:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AhwBna() {
        String str;
        List<DcaTriggerParam> listOLrzqt;
        String str2;
        String str3;
        String slPct;
        SpotDcaEditParam spotDcaEditParam = this.EZpvd;
        if (spotDcaEditParam != null) {
            String strEZpvd = spotDcaEditParam.EZpvd();
            TacticsData tacticsData = this.AYXKKw;
            String cycleId = tacticsData != null ? tacticsData.getCycleId() : null;
            xMR xmr = xMR.copydefault;
            String hundredQuot$default = xMR.formatHundredQuot$default(xmr, spotDcaEditParam.AYXKKw(), 0, false, null, 14, null);
            String hundredQuot$default2 = xMR.formatHundredQuot$default(xmr, spotDcaEditParam.fetchVPNInfo(), 0, false, null, 14, null);
            String strKWHzl = spotDcaEditParam.KWHzl();
            String strIsConnected = spotDcaEditParam.isConnected();
            String strValueOf = spotDcaEditParam.valueOf();
            if (strValueOf != null) {
                str = strValueOf;
            } else {
                TacticsData tacticsData2 = this.AYXKKw;
                strValueOf = tacticsData2 != null ? tacticsData2.getMaxSafetyOrds() : null;
                if (strValueOf == null) {
                    str = "";
                }
            }
            boolean zValues = spotDcaEditParam.values();
            SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk = spotDcaEditParam.DbNXlk();
            if ((spotDcaAdvancedParamsDbNXlk != null ? spotDcaAdvancedParamsDbNXlk.AEQbTJ() : null) == GridStartTriggerType.RSI_14) {
                listOLrzqt = spotDcaEditParam.DbNXlk().AYXKKw();
            } else {
                listOLrzqt = OLrzqt();
            }
            List<DcaTriggerParam> list = listOLrzqt;
            SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk2 = spotDcaEditParam.DbNXlk();
            if (spotDcaAdvancedParamsDbNXlk2 == null || (volMult = spotDcaAdvancedParamsDbNXlk2.AhwBna()) == null) {
                TacticsData tacticsData3 = this.AYXKKw;
                String volMult = tacticsData3 != null ? tacticsData3.getVolMult() : null;
                str2 = volMult == null ? "" : volMult;
            }
            SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk3 = spotDcaEditParam.DbNXlk();
            if (spotDcaAdvancedParamsDbNXlk3 == null || (pxStepsMult = spotDcaAdvancedParamsDbNXlk3.OLrzqt()) == null) {
                TacticsData tacticsData4 = this.AYXKKw;
                String pxStepsMult = tacticsData4 != null ? tacticsData4.getPxStepsMult() : null;
                str3 = pxStepsMult == null ? "" : pxStepsMult;
            }
            SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk4 = spotDcaEditParam.DbNXlk();
            if (spotDcaAdvancedParamsDbNXlk4 == null || (slPct = spotDcaAdvancedParamsDbNXlk4.EZpvd()) == null) {
                TacticsData tacticsData5 = this.AYXKKw;
                slPct = tacticsData5 != null ? tacticsData5.getSlPct() : null;
                if (slPct == null) {
                    slPct = "";
                }
            }
            SpotDcaEditParamRep spotDcaEditParamRep = new SpotDcaEditParamRep(strEZpvd, cycleId, hundredQuot$default, hundredQuot$default2, strKWHzl, strIsConnected, str, zValues, list, str2, str3, slPct);
            C56241xzB c56241xzB = this.OLrzqt;
            c56241xzB.copydefault(spotDcaEditParamRep);
            c56241xzB.gEmmrt();
            c56241xzB.OLrzqt(this.copydefault, new C54507xKz());
            xKK.Activity.execute$default(c56241xzB, 0L, 1, null);
        }
    }

    public final C53393wke copydefault() {
        if (this.AYXKKw == null) {
            return new C53393wke(null, null, null, 7, null);
        }
        C53392wkd c53392wkd = new C53392wkd(this.EZpvd, this.gEmmrt);
        TacticsData tacticsData = this.AYXKKw;
        Intrinsics.copydefault(tacticsData);
        return c53392wkd.KWHzl(tacticsData);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.OLrzqt);
    }
}
