package o;

import androidx.core.os.BundleKt;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.unify_trade.biz.ArbInvestDetailsBean;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.CostVo;
import com.okinc.unify_trade.biz.EstimatedClosePnlVo;
import com.okinc.unify_trade.biz.EstimatedStakingVo;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vTo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50577vTo extends AbstractC50583vTu {
    public static final Application Companion = new Application(null);

    @Override // o.AbstractC50583vTu
    public boolean by_() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49393unh
    public java.lang.String djBIcL() {
        return "SmartArbitrageOrderConfirmDFragment";
    }

    /* JADX INFO: renamed from: o.vTo$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vTo.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C50577vTo AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull SmartArbitrageReq smartArbitrageReq) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(smartArbitrageReq, "");
            C50577vTo c50577vTo = new C50577vTo();
            c50577vTo.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("bot_inst_id", str), C56390yDp.OLrzqt("bot_inst_type", str2), C56390yDp.OLrzqt("data", smartArbitrageReq)));
            return c50577vTo;
        }
    }

    @Override // o.AbstractC50583vTu, o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AEQbTJ();
    }

    private final void AEQbTJ() {
        java.lang.String string;
        java.lang.String string2;
        android.os.Bundle arguments = getArguments();
        java.lang.String str = (arguments == null || (string2 = arguments.getString("bot_inst_id")) == null) ? "" : string2;
        android.os.Bundle arguments2 = getArguments();
        djBIcL(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, (arguments2 == null || (string = arguments2.getString("bot_inst_type")) == null) ? "" : string, false, false, 12, null));
        java.lang.String string3 = getString(C55688xof.Application.MediaBrowserCompatConnectionCallbackConnectionCallbackApi21);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        AhwBna(string3);
    }

    @Override // o.AbstractC50583vTu
    public java.util.List<java.lang.Object> EZpvd() {
        ArbInvestDetailsBean arbInvestDetailsBean;
        java.lang.String string;
        SmartArbitrageReq smartArbitrageReq;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (smartArbitrageReq = (SmartArbitrageReq) arguments.getParcelable("data")) == null || (arbInvestDetailsBean = smartArbitrageReq.getInvestDetails()) == null) {
            arbInvestDetailsBean = new ArbInvestDetailsBean((java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ArbInvestDetailsBeanStakingType4UI) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ArbitrageTotalPnlInfo) null, false, (java.lang.String) null, (java.lang.String) null, (EstimatedStakingVo) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (CostVo) null, (EstimatedClosePnlVo) null, (CostVo) null, (CostVo) null, 67108863, (DefaultConstructorMarker) null);
        }
        ArbInvestDetailsBean arbInvestDetailsBean2 = arbInvestDetailsBean;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("bot_inst_id")) == null) {
            string = "";
        }
        return new C50588vTz().KWHzl(arbInvestDetailsBean2.copy((67108831 & 1) != 0 ? arbInvestDetailsBean2.arbItems : null, (67108831 & 2) != 0 ? arbInvestDetailsBean2.totalAmt : null, (67108831 & 4) != 0 ? arbInvestDetailsBean2.unit : null, (67108831 & 8) != 0 ? arbInvestDetailsBean2.estimatingArbPnl : null, (67108831 & 16) != 0 ? arbInvestDetailsBean2.estimatingEnlargeArbPnl : null, (67108831 & 32) != 0 ? arbInvestDetailsBean2.instFamily : string, (67108831 & 64) != 0 ? arbInvestDetailsBean2.isStaking : null, (67108831 & 128) != 0 ? arbInvestDetailsBean2.spreadRatio : null, (67108831 & 256) != 0 ? arbInvestDetailsBean2.marketSpreadRatio : null, (67108831 & 512) != 0 ? arbInvestDetailsBean2.unitAmt : null, (67108831 & 1024) != 0 ? arbInvestDetailsBean2.minUnitAmt : null, (67108831 & 2048) != 0 ? arbInvestDetailsBean2.userExpectSpreadRatio : null, (67108831 & 4096) != 0 ? arbInvestDetailsBean2.userExpectUnitAmt : null, (67108831 & 8192) != 0 ? arbInvestDetailsBean2.arbitrageTotalPnlInfo : null, (67108831 & 16384) != 0 ? arbInvestDetailsBean2.allowLeverPrincipal : false, (67108831 & 32768) != 0 ? arbInvestDetailsBean2.enlargedAmt : null, (67108831 & 65536) != 0 ? arbInvestDetailsBean2.interestDebt : null, (67108831 & 131072) != 0 ? arbInvestDetailsBean2.estimatedStaking : null, (67108831 & 262144) != 0 ? arbInvestDetailsBean2.minAmt : null, (67108831 & 524288) != 0 ? arbInvestDetailsBean2.displayMinPaybackDays : null, (67108831 & 1048576) != 0 ? arbInvestDetailsBean2.highestApyPeriod : null, (67108831 & 2097152) != 0 ? arbInvestDetailsBean2.estimatedApyList : null, (67108831 & 4194304) != 0 ? arbInvestDetailsBean2.estimatedOpenCost : null, (67108831 & 8388608) != 0 ? arbInvestDetailsBean2.estimatedClosePnl : null, (67108831 & 16777216) != 0 ? arbInvestDetailsBean2.closeCost : null, (67108831 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? arbInvestDetailsBean2.openCost : null));
    }

    @Override // o.AbstractC50583vTu, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setOKDSSize(52);
    }

    @Override // o.AbstractC50583vTu
    public void OLrzqt() {
        java.lang.String string;
        java.lang.String string2;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "";
        if (arguments == null || (string = arguments.getString("bot_inst_id")) == null) {
            string = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("BOT_INST_ID", string);
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("bot_inst_type")) != null) {
            str = string2;
        }
        pairArr[1] = C56390yDp.OLrzqt("BOT_INST_TYPE", str);
        C56028xvA.OLrzqt("make_order", C56424yEw.gEmmrt(pairArr));
        dismissAllowingStateLoss();
        getParentFragmentManager().setFragmentResult("bot_order", new android.os.Bundle());
    }
}
