package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.assets.api.model.DepositEntryPoint;
import com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardDepositType;
import com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardMessageContent;
import com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardMessageData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okx.paymentapi.service.DepositWithdrawLandingPage;
import com.okinc.okx.paymentapi.service.DepositWithdrawPageParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C31351lsQ;
import o.InterfaceC47251tmX;
import o.InterfaceC8224ayh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lKg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30056lKg extends oAE<OtcAgentDepositCardMessageContent, AbstractC31555lwI> {
    public final int AEQbTJ = C31351lsQ.ActionBar.DCUTEI;
    public final java.lang.Integer KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OtcAgentDepositCardMessageContent> KWHzl() {
        return OtcAgentDepositCardMessageContent.class;
    }

    @Override // o.oAE, o.AbstractC35707oAs
    public /* bridge */ /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        copydefault((oAC<AbstractC44111sDt, AbstractC31555lwI>) oac, c35254nrp, (OtcAgentDepositCardMessageContent) oKMessageContent);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OtcAgentDepositCardMessageContent otcAgentDepositCardMessageContent, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(otcAgentDepositCardMessageContent, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        OtcAgentDepositCardMessageData messageData = otcAgentDepositCardMessageContent.getMessageData();
        if ((messageData != null ? messageData.getDepositType() : null) == OtcAgentDepositCardDepositType.FIAT) {
            return C33070mpX.AYXKKw(C31351lsQ.Activity.aeJQwa);
        }
        return C33070mpX.AYXKKw(C31351lsQ.Activity.v);
    }

    public void copydefault(@NotNull oAC<AbstractC44111sDt, AbstractC31555lwI> oac, @NotNull C35254nrp c35254nrp, @NotNull OtcAgentDepositCardMessageContent otcAgentDepositCardMessageContent) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(otcAgentDepositCardMessageContent, "");
        super.copydefault((oAC) oac, c35254nrp, otcAgentDepositCardMessageContent);
        AbstractC31555lwI abstractC31555lwI = (AbstractC31555lwI) oac.EZpvd();
        android.view.View root = abstractC31555lwI.getRoot();
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            android.content.Context context = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            layoutParams.width = AbstractC35707oAs.getMaxBubbleWidth$default(this, context, 0, 2, null);
            root.setLayoutParams(layoutParams);
        }
        ConstraintLayout constraintLayout = abstractC31555lwI.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        AEQbTJ(c35254nrp, constraintLayout);
        OtcAgentDepositCardMessageData messageData = otcAgentDepositCardMessageContent.getMessageData();
        if (messageData != null) {
            copydefault(abstractC31555lwI, messageData);
        }
    }

    public final void copydefault(final AbstractC31555lwI abstractC31555lwI, final OtcAgentDepositCardMessageData otcAgentDepositCardMessageData) {
        java.lang.String strAppendCryptoSymbol$default;
        final boolean z = otcAgentDepositCardMessageData.getDepositType() == OtcAgentDepositCardDepositType.FIAT;
        if (z) {
            strAppendCryptoSymbol$default = C31661lzi.appendFiatSymbol$default(otcAgentDepositCardMessageData.getAmount(), otcAgentDepositCardMessageData.getCurrency(), 0, null, null, null, 30, null);
        } else {
            strAppendCryptoSymbol$default = C31661lzi.appendCryptoSymbol$default(otcAgentDepositCardMessageData.getAmount(), otcAgentDepositCardMessageData.getCurrency(), 0, null, null, null, 30, null);
        }
        java.lang.String strCopydefault = C33069mpW.copydefault(C31351lsQ.Activity.setPageName, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strAppendCryptoSymbol$default)));
        android.widget.TextView textView = abstractC31555lwI.copydefault;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strCopydefault);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, strAppendCryptoSymbol$default, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default != -1) {
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), iIndexOf$default, strAppendCryptoSymbol$default.length() + iIndexOf$default, 33);
        }
        textView.setText(spannableStringBuilder);
        abstractC31555lwI.EZpvd.setText(C33069mpW.copydefault(C31351lsQ.Activity.hfdhUn, C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", otcAgentDepositCardMessageData.getCurrency()))));
        abstractC31555lwI.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.lKl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30056lKg.EZpvd(this.OLrzqt, abstractC31555lwI, z, otcAgentDepositCardMessageData, view);
            }
        });
    }

    public static final void EZpvd(C30056lKg c30056lKg, AbstractC31555lwI abstractC31555lwI, boolean z, final OtcAgentDepositCardMessageData otcAgentDepositCardMessageData, android.view.View view) {
        android.content.Context context = abstractC31555lwI.EZpvd.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AbstractActivityC33041mov abstractActivityC33041movCopydefault = c30056lKg.copydefault(context);
        if (abstractActivityC33041movCopydefault != null) {
            if (z) {
                C32866mlf.onEvent$default("OTC_AI_Agent_Deposit_Click", (TrackChannel[]) null, new Function1() { // from class: o.lKn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C30056lKg.EZpvd(otcAgentDepositCardMessageData, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                InterfaceC47251tmX.StateListAnimator.goToDepositWithdrawPage$default((InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class), abstractActivityC33041movCopydefault, new DepositWithdrawPageParameters(new DepositWithdrawLandingPage.DepositPaymentSelectionPage(otcAgentDepositCardMessageData.getCurrency()), OKPaymentSource.PAYMENT_INTERNAL_FLOW), null, null, 12, null);
            } else {
                C32866mlf.onEvent$default("OTC_AI_Agent_Deposit_Click", (TrackChannel[]) null, new Function1() { // from class: o.lKm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C30056lKg.AEQbTJ(otcAgentDepositCardMessageData, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                InterfaceC8224ayh.TaskDescription.goToDeposit$default((InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class), abstractActivityC33041movCopydefault, new DepositEntryPoint.SpecificCryptoPage(otcAgentDepositCardMessageData.getCurrencyId()), null, null, null, null, 60, null);
            }
        }
    }

    public static final Unit EZpvd(OtcAgentDepositCardMessageData otcAgentDepositCardMessageData, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "deposit_type", OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, false, 4, null);
        EventParamsList.put$default(eventParamsList, "deposit_currency", otcAgentDepositCardMessageData.getCurrency(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "deposit_amount", otcAgentDepositCardMessageData.getAmount(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(OtcAgentDepositCardMessageData otcAgentDepositCardMessageData, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "deposit_type", OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, false, 4, null);
        EventParamsList.put$default(eventParamsList, "deposit_currency", otcAgentDepositCardMessageData.getCurrency(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "deposit_amount", otcAgentDepositCardMessageData.getAmount(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final AbstractActivityC33041mov copydefault(android.content.Context context) {
        android.content.Context contextOLrzqt = C58196ywi.OLrzqt(context);
        if (contextOLrzqt instanceof AbstractActivityC33041mov) {
            return (AbstractActivityC33041mov) contextOLrzqt;
        }
        return null;
    }
}
