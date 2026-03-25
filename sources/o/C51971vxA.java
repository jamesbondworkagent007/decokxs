package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.SignalBotSubsInfoBean;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vxA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51971vxA extends ConstraintLayout {
    public AbstractC48462uSh AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51971vxA(@NotNull android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51971vxA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51971vxA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int, int):void (m)] (LINE:27) call: o.vxA.<init>(android.content.Context, android.util.AttributeSet, int, int):void type: THIS */
    public /* synthetic */ C51971vxA(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51971vxA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = AbstractC48462uSh.EZpvd(android.view.LayoutInflater.from(context), this, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [55=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setSubscriptionState(boolean z, @NotNull SignalBotSubsInfoBean signalBotSubsInfoBean) {
        Intrinsics.checkNotNullParameter(signalBotSubsInfoBean, "");
        AbstractC48462uSh abstractC48462uSh = this.AEQbTJ;
        if (!z && signalBotSubsInfoBean.isSubscribed()) {
            android.widget.TextView textView = abstractC48462uSh.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            C55251xgS c55251xgS = abstractC48462uSh.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(8);
            abstractC48462uSh.KWHzl.setBackground(null);
            abstractC48462uSh.KWHzl.setTextColor(C33070mpX.copydefault(C32113mPz.ActionBar.iwGUEr));
            abstractC48462uSh.KWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.registerKeyboardTarget));
            return;
        }
        abstractC48462uSh.KWHzl.setOKDSStyle(6);
        java.lang.String strCopydefault = C56002xub.KWHzl.copydefault(signalBotSubsInfoBean.getSubscriptionType(), true);
        if (strCopydefault != null) {
            switch (strCopydefault.hashCode()) {
                case -1024311728:
                    if (strCopydefault.equals("subscription,profit_sharing")) {
                        android.widget.TextView textView2 = abstractC48462uSh.copydefault;
                        Intrinsics.checkNotNullExpressionValue(textView2, "");
                        textView2.setVisibility(0);
                        C55251xgS c55251xgS2 = abstractC48462uSh.OLrzqt;
                        Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
                        c55251xgS2.setVisibility(0);
                        C55251xgS c55251xgS3 = abstractC48462uSh.KWHzl;
                        int i = C55688xof.Application.RhlVAI;
                        xMR xmr = xMR.copydefault;
                        java.lang.String profitSharingRatio = signalBotSubsInfoBean.getProfitSharingRatio();
                        if (profitSharingRatio == null) {
                            profitSharingRatio = "";
                        }
                        c55251xgS3.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xmr.AEQbTJ(profitSharingRatio, 0, RoundingMode.DOWN)))));
                        abstractC48462uSh.copydefault.setText("/");
                        C55251xgS c55251xgS4 = abstractC48462uSh.OLrzqt;
                        int i2 = C55688xof.Application.RIsQag;
                        java.lang.String subscriptionFee = signalBotSubsInfoBean.getSubscriptionFee();
                        java.lang.String str = subscriptionFee == null ? "" : subscriptionFee;
                        java.lang.String ccy = signalBotSubsInfoBean.getCcy();
                        c55251xgS4.setText(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C56033xvF.copydefault(str, ccy == null ? "" : ccy, (88 & 4) != 0 ? false : false, (88 & 8) != 0 ? null : null, (88 & 16) != 0 ? false : false, (88 & 32) == 0 ? false : false, (88 & 64) == 0 ? null : null)))));
                        break;
                    }
                    break;
                case 3151468:
                    if (strCopydefault.equals("free")) {
                        android.widget.TextView textView3 = abstractC48462uSh.copydefault;
                        Intrinsics.checkNotNullExpressionValue(textView3, "");
                        textView3.setVisibility(8);
                        C55251xgS c55251xgS5 = abstractC48462uSh.OLrzqt;
                        Intrinsics.checkNotNullExpressionValue(c55251xgS5, "");
                        c55251xgS5.setVisibility(8);
                        abstractC48462uSh.KWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.glXhWM));
                    }
                    break;
                case 341203229:
                    if (strCopydefault.equals("subscription")) {
                        android.widget.TextView textView4 = abstractC48462uSh.copydefault;
                        Intrinsics.checkNotNullExpressionValue(textView4, "");
                        textView4.setVisibility(8);
                        C55251xgS c55251xgS6 = abstractC48462uSh.OLrzqt;
                        Intrinsics.checkNotNullExpressionValue(c55251xgS6, "");
                        c55251xgS6.setVisibility(8);
                        C55251xgS c55251xgS7 = abstractC48462uSh.KWHzl;
                        int i3 = C55688xof.Application.RIsQag;
                        java.lang.String subscriptionFee2 = signalBotSubsInfoBean.getSubscriptionFee();
                        java.lang.String str2 = subscriptionFee2 == null ? "" : subscriptionFee2;
                        java.lang.String ccy2 = signalBotSubsInfoBean.getCcy();
                        c55251xgS7.setText(C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C56033xvF.copydefault(str2, ccy2 == null ? "" : ccy2, (88 & 4) != 0 ? false : false, (88 & 8) != 0 ? null : null, (88 & 16) != 0 ? false : false, (88 & 32) == 0 ? false : false, (88 & 64) == 0 ? null : null)))));
                        break;
                    }
                    break;
                case 413749729:
                    if (strCopydefault.equals("profit_sharing")) {
                        android.widget.TextView textView5 = abstractC48462uSh.copydefault;
                        Intrinsics.checkNotNullExpressionValue(textView5, "");
                        textView5.setVisibility(8);
                        C55251xgS c55251xgS8 = abstractC48462uSh.OLrzqt;
                        Intrinsics.checkNotNullExpressionValue(c55251xgS8, "");
                        c55251xgS8.setVisibility(8);
                        C55251xgS c55251xgS9 = abstractC48462uSh.KWHzl;
                        int i4 = C55688xof.Application.RhlVAI;
                        xMR xmr2 = xMR.copydefault;
                        java.lang.String profitSharingRatio2 = signalBotSubsInfoBean.getProfitSharingRatio();
                        c55251xgS9.setText(C33069mpW.copydefault(i4, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xmr2.AEQbTJ(profitSharingRatio2 != null ? profitSharingRatio2 : "", 0, RoundingMode.DOWN)))));
                        break;
                    }
                    break;
            }
        }
    }
}
