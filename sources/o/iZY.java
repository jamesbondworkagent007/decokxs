package o;

import android.view.View;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailClaimPromptInformation;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards.DeFiSectionItemBinder$1;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iZY extends AbstractC27119jpF<C26356jal, iJE> {
    public final Function2<C26356jal, InvestUserRewardElementInfo, Unit> AEQbTJ;
    public final Function1<C26356jal, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super o.jal, ? super com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.jal, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public iZY(@NotNull Function2<? super C26356jal, ? super InvestUserRewardElementInfo, Unit> function2, @NotNull Function1<? super C26356jal, Unit> function1) {
        super(DeFiSectionItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function2;
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull iJE ije, @NotNull C26356jal c26356jal) {
        ButtonType buttonTypeAEQbTJ;
        InvestTipInfoVo claimTipInfo;
        Intrinsics.checkNotNullParameter(ije, "");
        Intrinsics.checkNotNullParameter(c26356jal, "");
        ije.KWHzl.removeAllViews();
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(ije.getRoot().getContext());
        java.util.Iterator<T> it = c26356jal.fetchVPNInfo().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InvestUserRewardElementInfo investUserRewardElementInfo = (InvestUserRewardElementInfo) it.next();
            C23768iIp c23768iIpOLrzqt = C23768iIp.OLrzqt(layoutInflaterFrom, ije.KWHzl, false);
            Intrinsics.checkNotNullExpressionValue(c23768iIpOLrzqt, "");
            copydefault(c23768iIpOLrzqt, investUserRewardElementInfo, c26356jal, this.AEQbTJ);
            ije.KWHzl.addView(c23768iIpOLrzqt.getRoot());
        }
        android.widget.FrameLayout frameLayout = ije.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(c26356jal.DbNXlk() ? 0 : 8);
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        C52794wYp c52794wYp = ije.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        if (C24193iYi.OLrzqt.AEQbTJ()) {
            buttonTypeAEQbTJ = ButtonType.CLAIM_TYPE_NO_NEED_SHOW;
        } else {
            buttonTypeAEQbTJ = c26356jal.AEQbTJ();
        }
        ButtonAction buttonAction = ButtonAction.CLAIM_ALL;
        InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformationGEmmrt = c26356jal.gEmmrt();
        c27569jxf.AEQbTJ(c52794wYp, buttonTypeAEQbTJ, buttonAction, (investUserAssetDetailClaimPromptInformationGEmmrt == null || (claimTipInfo = investUserAssetDetailClaimPromptInformationGEmmrt.getClaimTipInfo()) == null) ? null : claimTipInfo.getTipContent());
        C52794wYp c52794wYp2 = ije.AEQbTJ;
        c52794wYp2.setOnClickListener(new ActionBar(c52794wYp2, 1000L, this, c26356jal));
    }

    public final void copydefault(C23768iIp c23768iIp, InvestUserRewardElementInfo investUserRewardElementInfo, C26356jal c26356jal, Function2<? super C26356jal, ? super InvestUserRewardElementInfo, Unit> function2) {
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.widget.ImageView imageView = c23768iIp.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C27569jxf.loadCircleWithBorder$default(c27569jxf, imageView, investUserRewardElementInfo.getTokenLogo(), c27569jxf.OLrzqt(), 0, 0.0f, 24, null);
        android.widget.TextView textView = c23768iIp.AhwBna;
        java.lang.String tokenSymbol = investUserRewardElementInfo.getTokenSymbol();
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        textView.setText(tokenSymbol);
        C27586jxw c27586jxw = C27586jxw.OLrzqt;
        java.lang.String strLocalizeCryptoAmount$default = C27586jxw.localizeCryptoAmount$default(c27586jxw, C33129mqd.EZpvd(investUserRewardElementInfo.getCoinAmount()), 0, c27586jxw.OLrzqt(java.lang.Long.valueOf(c26356jal.KWHzl()), investUserRewardElementInfo.getTokenAddress()), null, null, null, 58, null);
        android.widget.TextView textView2 = c23768iIp.AYXKKw;
        C27488jwD c27488jwD = C27488jwD.copydefault;
        textView2.setText(c27488jwD.KWHzl(java.lang.String.valueOf(strLocalizeCryptoAmount$default)));
        c23768iIp.AEQbTJ.setText(c27488jwD.KWHzl(c27586jxw.KWHzl(C33129mqd.EZpvd(investUserRewardElementInfo.getCurrencyAmount()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null)));
        boolean z = (investUserRewardElementInfo.getButtonType() == ButtonType.CLAIM_TYPE_NO_NEED_SHOW || C24193iYi.OLrzqt.AEQbTJ() || c26356jal.values()) ? false : true;
        android.widget.TextView textView3 = c23768iIp.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(z ^ true ? 0 : 8);
        android.widget.FrameLayout frameLayout = c23768iIp.copydefault;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(z ? 0 : 8);
        if (z) {
            C52794wYp c52794wYp = c23768iIp.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            C27569jxf.setInvestClaimButtonStatus$default(c27569jxf, c52794wYp, investUserRewardElementInfo.getButtonType(), ButtonAction.CLAIM, null, 4, null);
            C52794wYp c52794wYp2 = c23768iIp.KWHzl;
            c52794wYp2.setOnClickListener(new Activity(c52794wYp2, 1000L, function2, c26356jal, investUserRewardElementInfo));
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C26356jal EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ iZY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, iZY izy, C26356jal c26356jal) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = izy;
            this.EZpvd = c26356jal;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt.invoke(this.EZpvd);
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Function2 EZpvd;
        public final /* synthetic */ InvestUserRewardElementInfo KWHzl;
        public final /* synthetic */ C26356jal OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, Function2 function2, C26356jal c26356jal, InvestUserRewardElementInfo investUserRewardElementInfo) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = function2;
            this.OLrzqt = c26356jal;
            this.KWHzl = investUserRewardElementInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.invoke(this.OLrzqt, this.KWHzl);
            }
        }
    }
}
