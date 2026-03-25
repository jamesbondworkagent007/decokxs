package com.okinc.buysell.ui.otcagent.tradecard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.buysell.ui.otcagent.OtcAgentMetrics;
import com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKInvisibleCustomMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.service.BuySellOrderDetailParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import o.AbstractActivityC33041mov;
import o.AbstractC31558lwL;
import o.AbstractC35707oAs;
import o.AbstractC44111sDt;
import o.C31351lsQ;
import o.C31661lzi;
import o.C32866mlf;
import o.C33054mpH;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33492mxV;
import o.C35254nrp;
import o.C38307pTy;
import o.C43251rlk;
import o.C52794wYp;
import o.C54573xNj;
import o.C55284xgz;
import o.C55298xhM;
import o.C56390yDp;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56548yJl;
import o.C57635ymD;
import o.C58196ywi;
import o.C59454zhO;
import o.InterfaceC31422lti;
import o.InterfaceC35180nqU;
import o.InterfaceC44289sKh;
import o.InterfaceC47251tmX;
import o.oAC;
import o.oAE;
import o.oGY;
import o.pTB;
import o.pUU;
import o.sJU;
import o.sKH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class OtcAgentTradeCardMessageViewProvider extends oAE<OtcAgentTradeCardMessageContent, AbstractC31558lwL> {
    public static final Activity Companion = new Activity(null);
    public final Integer KWHzl;
    public final int copydefault = C31351lsQ.ActionBar.zuWLRA;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OtcAgentTradeCardStatus.values().length];
            try {
                iArr[OtcAgentTradeCardStatus.QUOTE_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OtcAgentTradeCardStatus.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OtcAgentTradeCardStatus.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OtcAgentTradeCardStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public Integer EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public Class<OtcAgentTradeCardMessageContent> KWHzl() {
        return OtcAgentTradeCardMessageContent.class;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public CharSequence KWHzl(@NotNull Context context, @NotNull OtcAgentTradeCardMessageContent otcAgentTradeCardMessageContent, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(otcAgentTradeCardMessageContent, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        OtcAgentTradeCardMessageData messageData = otcAgentTradeCardMessageContent.getMessageData();
        if (messageData != null && messageData.isBuyType()) {
            return C33070mpX.AYXKKw(C31351lsQ.Activity.finishInit);
        }
        return C33070mpX.AYXKKw(C31351lsQ.Activity.FSMca);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/databinding/ViewDataBinding; */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public AbstractC31558lwL OLrzqt(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC31558lwL abstractC31558lwL = (AbstractC31558lwL) super.OLrzqt(layoutInflater, viewGroup);
        abstractC31558lwL.EZpvd(new StateListAnimator());
        return abstractC31558lwL;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/oAC;Lo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;)V */
    @Override // o.oAE, o.AbstractC35707oAs
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull oAC<AbstractC44111sDt, AbstractC31558lwL> oac, @NotNull C35254nrp c35254nrp, @NotNull OtcAgentTradeCardMessageContent otcAgentTradeCardMessageContent) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(otcAgentTradeCardMessageContent, "");
        super.copydefault(oac, c35254nrp, otcAgentTradeCardMessageContent);
        AbstractC31558lwL abstractC31558lwL = (AbstractC31558lwL) oac.EZpvd();
        View root = abstractC31558lwL.getRoot();
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            int iDp2px$default = C55298xhM.dp2px$default(194.0f, null, 1, null);
            Context context = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            layoutParams.width = C56548yJl.copydefault(AbstractC35707oAs.getMaxBubbleWidth$default(this, context, 0, 2, null), iDp2px$default);
            root.setLayoutParams(layoutParams);
        }
        ConstraintLayout constraintLayout = abstractC31558lwL.values;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        AEQbTJ(c35254nrp, constraintLayout);
        OtcAgentTradeCardMessageData messageData = otcAgentTradeCardMessageContent.getMessageData();
        if (messageData != null) {
            OLrzqt(abstractC31558lwL, messageData, c35254nrp);
        }
    }

    @Override // o.oAE, o.AbstractC35703oAo, o.AbstractC35882oHe
    public void AEQbTJ(@NotNull oGY<AbstractC44111sDt> ogy) {
        StateListAnimator stateListAnimatorAEQbTJ;
        Intrinsics.checkNotNullParameter(ogy, "");
        super.AEQbTJ(ogy);
        oAC oac = ogy instanceof oAC ? (oAC) ogy : null;
        if (oac == null || (stateListAnimatorAEQbTJ = ((AbstractC31558lwL) oac.EZpvd()).AEQbTJ()) == null) {
            return;
        }
        stateListAnimatorAEQbTJ.copydefault();
    }

    public final void OLrzqt(AbstractC31558lwL abstractC31558lwL, OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, C35254nrp c35254nrp) {
        AEQbTJ(abstractC31558lwL, otcAgentTradeCardMessageData);
        copydefault(abstractC31558lwL, otcAgentTradeCardMessageData);
        StateListAnimator stateListAnimatorAEQbTJ = abstractC31558lwL.AEQbTJ();
        if (stateListAnimatorAEQbTJ == null) {
            stateListAnimatorAEQbTJ = new StateListAnimator();
        }
        KWHzl(abstractC31558lwL, otcAgentTradeCardMessageData, c35254nrp, stateListAnimatorAEQbTJ);
    }

    public final void AEQbTJ(AbstractC31558lwL abstractC31558lwL, OtcAgentTradeCardMessageData otcAgentTradeCardMessageData) {
        String localized$default;
        String strPrependFiatSymbol$default;
        String strOLrzqt = OLrzqt(otcAgentTradeCardMessageData);
        if (C33129mqd.OLrzqt((CharSequence) strOLrzqt)) {
            ImageView imageView = abstractC31558lwL.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            ImageView imageView2 = abstractC31558lwL.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C33054mpH.loadUrl$default(imageView2, strOLrzqt, null, 0, 0, 14, null);
        } else {
            ImageView imageView3 = abstractC31558lwL.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(8);
        }
        int i = otcAgentTradeCardMessageData.isBuyType() ? C31351lsQ.Activity.DuXjdv : C31351lsQ.Activity.FYtjSf;
        TextView textView = abstractC31558lwL.getNewProxyInstance;
        Pair[] pairArr = new Pair[2];
        if (otcAgentTradeCardMessageData.isBuyType()) {
            if (otcAgentTradeCardMessageData.isStablecoin()) {
                if (otcAgentTradeCardMessageData.isPegged()) {
                    localized$default = C31661lzi.prependFiatSymbol$default(otcAgentTradeCardMessageData.getQuoteAmount(), otcAgentTradeCardMessageData.getPeggedCurrency(), otcAgentTradeCardMessageData.getPeggedCurrency(), null, null, false, 28, null);
                } else {
                    localized$default = C31661lzi.formatDownToFixedOtc$default(otcAgentTradeCardMessageData.getQuoteAmount(), false, 1, null) + " " + otcAgentTradeCardMessageData.getQuoteCurrency();
                }
            } else {
                localized$default = C31661lzi.prependFiatSymbol$default(otcAgentTradeCardMessageData.getQuoteAmount(), otcAgentTradeCardMessageData.getQuoteCurrency(), otcAgentTradeCardMessageData.getQuoteCurrency(), null, null, false, 28, null);
            }
        } else {
            localized$default = pTB.formatLocalized$default(C31661lzi.OLrzqt(otcAgentTradeCardMessageData.getBaseAmount(), 8), null, 1, null);
        }
        pairArr[0] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, localized$default);
        pairArr[1] = C56390yDp.OLrzqt("currency", otcAgentTradeCardMessageData.getBaseCurrency());
        textView.setText(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
        if (otcAgentTradeCardMessageData.isStablecoin()) {
            if (otcAgentTradeCardMessageData.isPegged()) {
                strPrependFiatSymbol$default = C31661lzi.prependFiatSymbol$default(otcAgentTradeCardMessageData.getPrice(), otcAgentTradeCardMessageData.getPeggedCurrency(), otcAgentTradeCardMessageData.getPeggedCurrency(), null, null, false, 28, null);
            } else {
                strPrependFiatSymbol$default = C31661lzi.formatDownToFixedOtc$default(otcAgentTradeCardMessageData.getPrice(), false, 1, null) + " " + otcAgentTradeCardMessageData.getQuoteCurrency();
            }
        } else {
            strPrependFiatSymbol$default = C31661lzi.prependFiatSymbol$default(otcAgentTradeCardMessageData.getPrice(), otcAgentTradeCardMessageData.getQuoteCurrency(), otcAgentTradeCardMessageData.getQuoteCurrency(), C38307pTy.Companion.EZpvd(C54573xNj.copydefault.AEQbTJ(C33129mqd.AEQbTJ(otcAgentTradeCardMessageData.getPrice()))), null, false, 24, null);
        }
        abstractC31558lwL.AEQbTJ.setText(C33069mpW.copydefault(C31351lsQ.Activity.fdt, C56424yEw.gEmmrt(C56390yDp.OLrzqt("currency", otcAgentTradeCardMessageData.getBaseCurrency()), C56390yDp.OLrzqt("value", strPrependFiatSymbol$default))));
    }

    public final void copydefault(final AbstractC31558lwL abstractC31558lwL, final OtcAgentTradeCardMessageData otcAgentTradeCardMessageData) {
        String strAYXKKw;
        String strPrependFiatSymbol$default;
        String strPrependFiatSymbol$default2;
        String strAYXKKw2;
        String orderId;
        if ((C33129mqd.OLrzqt((CharSequence) otcAgentTradeCardMessageData.getOrderId()) && otcAgentTradeCardMessageData.getStatus() == OtcAgentTradeCardStatus.SUCCEEDED) || otcAgentTradeCardMessageData.getStatus() == OtcAgentTradeCardStatus.FAILED) {
            LinearLayout linearLayout = abstractC31558lwL.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            C57635ymD c57635ymD = abstractC31558lwL.isConnected;
            if (otcAgentTradeCardMessageData.getOrderId().length() <= 6) {
                orderId = otcAgentTradeCardMessageData.getOrderId();
            } else {
                orderId = "…" + C59454zhO.isConnected(otcAgentTradeCardMessageData.getOrderId(), 6);
            }
            c57635ymD.setText(orderId);
            abstractC31558lwL.isConnected.setOnClickListener(new View.OnClickListener() { // from class: o.lKx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    OtcAgentTradeCardMessageViewProvider.OLrzqt(this.AEQbTJ, abstractC31558lwL, otcAgentTradeCardMessageData, view);
                }
            });
            abstractC31558lwL.isConnected.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.lKv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return OtcAgentTradeCardMessageViewProvider.KWHzl(this.OLrzqt, abstractC31558lwL, otcAgentTradeCardMessageData, view);
                }
            });
        } else {
            LinearLayout linearLayout2 = abstractC31558lwL.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(8);
        }
        TextView textView = abstractC31558lwL.AuCTel;
        if (otcAgentTradeCardMessageData.isBuyType()) {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.OEgNct);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.FQNKFG);
        }
        textView.setText(strAYXKKw);
        TextView textView2 = abstractC31558lwL.uzCIH;
        if (otcAgentTradeCardMessageData.isBuyType()) {
            strPrependFiatSymbol$default = C31661lzi.formatDownToFixedOtc$default(otcAgentTradeCardMessageData.getBaseAmount(), false, 1, null) + " " + otcAgentTradeCardMessageData.getBaseCurrency();
        } else if (otcAgentTradeCardMessageData.isStablecoin()) {
            if (otcAgentTradeCardMessageData.isPegged()) {
                strPrependFiatSymbol$default = C31661lzi.prependFiatSymbol$default(otcAgentTradeCardMessageData.getQuoteAmount(), otcAgentTradeCardMessageData.getPeggedCurrency(), otcAgentTradeCardMessageData.getPeggedCurrency(), null, null, false, 28, null);
            } else {
                strPrependFiatSymbol$default = C31661lzi.formatDownToFixedOtc$default(otcAgentTradeCardMessageData.getQuoteAmount(), false, 1, null) + " " + otcAgentTradeCardMessageData.getQuoteCurrency();
            }
        } else {
            strPrependFiatSymbol$default = C31661lzi.prependFiatSymbol$default(otcAgentTradeCardMessageData.getQuoteAmount(), otcAgentTradeCardMessageData.getQuoteCurrency(), otcAgentTradeCardMessageData.getQuoteCurrency(), null, null, false, 28, null);
        }
        textView2.setText(strPrependFiatSymbol$default);
        TextView textView3 = abstractC31558lwL.valueOf;
        if (otcAgentTradeCardMessageData.isStablecoin()) {
            if (otcAgentTradeCardMessageData.isPegged()) {
                strPrependFiatSymbol$default2 = C31661lzi.prependFiatSymbol$default(otcAgentTradeCardMessageData.getFeeAmount(), otcAgentTradeCardMessageData.getPeggedCurrency(), otcAgentTradeCardMessageData.getPeggedCurrency(), null, null, false, 28, null);
            } else {
                strPrependFiatSymbol$default2 = C31661lzi.formatDownToFixedOtc$default(otcAgentTradeCardMessageData.getFeeAmount(), false, 1, null) + " " + otcAgentTradeCardMessageData.getQuoteCurrency();
            }
        } else {
            strPrependFiatSymbol$default2 = C31661lzi.prependFiatSymbol$default(otcAgentTradeCardMessageData.getFeeAmount(), otcAgentTradeCardMessageData.getQuoteCurrency(), otcAgentTradeCardMessageData.getQuoteCurrency(), null, null, false, 28, null);
        }
        textView3.setText(strPrependFiatSymbol$default2);
        TextView textView4 = abstractC31558lwL.fIwbmz;
        if (otcAgentTradeCardMessageData.isBuyType()) {
            strAYXKKw2 = C33070mpX.AYXKKw(C31351lsQ.Activity.sIqKDg);
        } else {
            strAYXKKw2 = C33070mpX.AYXKKw(C31351lsQ.Activity.clearRegistrations);
        }
        textView4.setText(strAYXKKw2);
        String strEZpvd = EZpvd(otcAgentTradeCardMessageData);
        if (C33129mqd.OLrzqt((CharSequence) strEZpvd)) {
            ImageView imageView = abstractC31558lwL.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            ImageView imageView2 = abstractC31558lwL.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C33054mpH.loadUrl$default(imageView2, strEZpvd, null, 0, 0, 14, null);
        } else {
            ImageView imageView3 = abstractC31558lwL.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(8);
        }
        abstractC31558lwL.ejfBZ.setText(C33069mpW.copydefault(C31351lsQ.Activity.gCZUJG, C56423yEv.EZpvd(C56390yDp.OLrzqt("fiatName", otcAgentTradeCardMessageData.getQuoteCurrency()))));
    }

    public static final void OLrzqt(OtcAgentTradeCardMessageViewProvider otcAgentTradeCardMessageViewProvider, AbstractC31558lwL abstractC31558lwL, OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, View view) {
        C57635ymD c57635ymD = abstractC31558lwL.isConnected;
        Intrinsics.checkNotNullExpressionValue(c57635ymD, "");
        otcAgentTradeCardMessageViewProvider.AEQbTJ(c57635ymD, otcAgentTradeCardMessageData);
    }

    public static final boolean KWHzl(OtcAgentTradeCardMessageViewProvider otcAgentTradeCardMessageViewProvider, AbstractC31558lwL abstractC31558lwL, OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, View view) {
        C57635ymD c57635ymD = abstractC31558lwL.isConnected;
        Intrinsics.checkNotNullExpressionValue(c57635ymD, "");
        otcAgentTradeCardMessageViewProvider.AEQbTJ(c57635ymD, otcAgentTradeCardMessageData);
        return true;
    }

    public final void KWHzl(final AbstractC31558lwL abstractC31558lwL, final OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, final C35254nrp c35254nrp, final StateListAnimator stateListAnimator) {
        int i = TaskDescription.AEQbTJ[otcAgentTradeCardMessageData.getStatus().ordinal()];
        if (i == 1) {
            Application applicationKWHzl = KWHzl(otcAgentTradeCardMessageData);
            if (applicationKWHzl.copydefault()) {
                stateListAnimator.copydefault();
                C52794wYp c52794wYp = abstractC31558lwL.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                EZpvd(c52794wYp);
            } else if (stateListAnimator.OLrzqt(applicationKWHzl)) {
                CoroutineScope coroutineScopeValueOf = valueOf();
                if (coroutineScopeValueOf != null) {
                    stateListAnimator.OLrzqt(coroutineScopeValueOf, applicationKWHzl, new Function1() { // from class: o.lKs
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return OtcAgentTradeCardMessageViewProvider.EZpvd(this.EZpvd, abstractC31558lwL, otcAgentTradeCardMessageData, c35254nrp, stateListAnimator, ((java.lang.Long) obj).longValue());
                        }
                    }, new Function0() { // from class: o.lKp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OtcAgentTradeCardMessageViewProvider.copydefault(this.OLrzqt, abstractC31558lwL);
                        }
                    });
                } else {
                    C52794wYp c52794wYp2 = abstractC31558lwL.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
                    EZpvd(c52794wYp2);
                }
            }
        } else if (i == 2) {
            C52794wYp c52794wYp3 = abstractC31558lwL.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
            AEQbTJ(c52794wYp3, otcAgentTradeCardMessageData.isBuyType(), stateListAnimator);
        } else if (i == 3) {
            stateListAnimator.copydefault();
            C52794wYp c52794wYp4 = abstractC31558lwL.KWHzl;
            c52794wYp4.setOKDSType(259);
            c52794wYp4.fIwbmz();
            c52794wYp4.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.zEHIKV));
            c52794wYp4.setOnClickListener(new View.OnClickListener() { // from class: o.lKq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    OtcAgentTradeCardMessageViewProvider.AhwBna(this.OLrzqt, abstractC31558lwL, otcAgentTradeCardMessageData, view);
                }
            });
            c52794wYp4.setEnabled(true);
            c52794wYp4.setClickable(true);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            stateListAnimator.copydefault();
            C52794wYp c52794wYp5 = abstractC31558lwL.KWHzl;
            c52794wYp5.setOKDSType(259);
            c52794wYp5.fIwbmz();
            c52794wYp5.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.svhCHd));
            c52794wYp5.setOnClickListener(null);
            c52794wYp5.setEnabled(false);
            c52794wYp5.setClickable(false);
        }
        if (otcAgentTradeCardMessageData.getStatus() == OtcAgentTradeCardStatus.SUCCEEDED) {
            ImageView imageView = abstractC31558lwL.AhwBna;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            TextView textView = abstractC31558lwL.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            return;
        }
        ImageView imageView2 = abstractC31558lwL.AhwBna;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
        TextView textView2 = abstractC31558lwL.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
    }

    public static final Unit EZpvd(OtcAgentTradeCardMessageViewProvider otcAgentTradeCardMessageViewProvider, AbstractC31558lwL abstractC31558lwL, OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, C35254nrp c35254nrp, StateListAnimator stateListAnimator, long j) {
        C52794wYp c52794wYp = abstractC31558lwL.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        otcAgentTradeCardMessageViewProvider.EZpvd(c52794wYp, otcAgentTradeCardMessageData, c35254nrp, j, stateListAnimator);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(OtcAgentTradeCardMessageViewProvider otcAgentTradeCardMessageViewProvider, AbstractC31558lwL abstractC31558lwL) {
        C52794wYp c52794wYp = abstractC31558lwL.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        otcAgentTradeCardMessageViewProvider.EZpvd(c52794wYp);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(OtcAgentTradeCardMessageViewProvider otcAgentTradeCardMessageViewProvider, AbstractC31558lwL abstractC31558lwL, final OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, View view) {
        InterfaceC47251tmX interfaceC47251tmX;
        TradeType tradeType;
        Context context = abstractC31558lwL.KWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AbstractActivityC33041mov abstractActivityC33041movOLrzqt = otcAgentTradeCardMessageViewProvider.OLrzqt(context);
        if (abstractActivityC33041movOLrzqt != null && (interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.OLrzqt(InterfaceC47251tmX.class)) != null) {
            if (otcAgentTradeCardMessageData.isBuyType()) {
                tradeType = TradeType.BUY;
            } else {
                tradeType = TradeType.SELL;
            }
            interfaceC47251tmX.copydefault(abstractActivityC33041movOLrzqt, new BuySellOrderDetailParameters(tradeType, otcAgentTradeCardMessageData.getOrderId(), OKPaymentSource.PAYMENT_INTERNAL_FLOW));
        }
        C32866mlf.onEvent$default("OTC_AI_Agent_Order_Card_Review_Details_Click", (TrackChannel[]) null, new Function1() { // from class: o.lKu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OtcAgentTradeCardMessageViewProvider.KWHzl(otcAgentTradeCardMessageData, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit KWHzl(OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.QUOTE_CURRENCY, otcAgentTradeCardMessageData.getQuoteCurrency(), false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.BASE_CURRENCY, otcAgentTradeCardMessageData.getBaseCurrency(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "quote_amount", otcAgentTradeCardMessageData.getQuoteAmount(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "base_amount", otcAgentTradeCardMessageData.getBaseAmount(), false, 4, null);
        eventParamsList.put(OtcExtraKeys.SIDE, (otcAgentTradeCardMessageData.isBuyType() ? OtcAgentMetrics.SIDE.BUY : OtcAgentMetrics.SIDE.SELL).getValue(), true);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final C52794wYp c52794wYp, final OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, final C35254nrp c35254nrp, final long j, final StateListAnimator stateListAnimator) {
        String strCopydefault;
        c52794wYp.setOKDSType(257);
        c52794wYp.fIwbmz();
        if (otcAgentTradeCardMessageData.isBuyType()) {
            strCopydefault = C33069mpW.copydefault(C31351lsQ.Activity.UfveVb, C56424yEw.gEmmrt(C56390yDp.OLrzqt("currency", otcAgentTradeCardMessageData.getBaseCurrency()), C56390yDp.OLrzqt("timer", String.valueOf(j))));
        } else {
            strCopydefault = C33069mpW.copydefault(C31351lsQ.Activity.Dap, C56424yEw.gEmmrt(C56390yDp.OLrzqt("currency", otcAgentTradeCardMessageData.getBaseCurrency()), C56390yDp.OLrzqt("timer", String.valueOf(j))));
        }
        c52794wYp.setText(strCopydefault);
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.lKw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                OtcAgentTradeCardMessageViewProvider.copydefault(this.EZpvd, c52794wYp, otcAgentTradeCardMessageData, stateListAnimator, c35254nrp, j, view);
            }
        });
        c52794wYp.setEnabled(true);
        c52794wYp.setClickable(true);
    }

    public static final void copydefault(OtcAgentTradeCardMessageViewProvider otcAgentTradeCardMessageViewProvider, C52794wYp c52794wYp, final OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, StateListAnimator stateListAnimator, C35254nrp c35254nrp, final long j, View view) {
        otcAgentTradeCardMessageViewProvider.AEQbTJ(c52794wYp, otcAgentTradeCardMessageData.isBuyType(), stateListAnimator);
        otcAgentTradeCardMessageViewProvider.EZpvd(otcAgentTradeCardMessageData, c35254nrp);
        C32866mlf.onEvent$default("OTC_AI_Agent_Order_Card_Buy_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.lKo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OtcAgentTradeCardMessageViewProvider.copydefault(otcAgentTradeCardMessageData, j, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit copydefault(OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, long j, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.QUOTE_CURRENCY, otcAgentTradeCardMessageData.getQuoteCurrency(), false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.BASE_CURRENCY, otcAgentTradeCardMessageData.getBaseCurrency(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "quote_amount", otcAgentTradeCardMessageData.getQuoteAmount(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "base_amount", otcAgentTradeCardMessageData.getBaseAmount(), false, 4, null);
        eventParamsList.put(OtcExtraKeys.SIDE, (otcAgentTradeCardMessageData.isBuyType() ? OtcAgentMetrics.SIDE.BUY : OtcAgentMetrics.SIDE.SELL).getValue(), true);
        EventParamsList.put$default(eventParamsList, "count_down_remain", String.valueOf(j), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C52794wYp c52794wYp, boolean z, StateListAnimator stateListAnimator) {
        String strAYXKKw;
        stateListAnimator.copydefault();
        c52794wYp.setOKDSType(257);
        c52794wYp.OLrzqt(0L);
        if (z) {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.gqOnQv);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.zDGrpR);
        }
        c52794wYp.setText(strAYXKKw);
        c52794wYp.setOnClickListener(null);
        c52794wYp.setEnabled(true);
        c52794wYp.setClickable(false);
    }

    public final void EZpvd(C52794wYp c52794wYp) {
        c52794wYp.setOKDSType(259);
        c52794wYp.fIwbmz();
        c52794wYp.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.FQMcgEfQMcgE));
        c52794wYp.setOnClickListener(null);
        c52794wYp.setEnabled(false);
        c52794wYp.setClickable(false);
    }

    public final void EZpvd(OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, C35254nrp c35254nrp) {
        CoroutineScope coroutineScopeValueOf = valueOf();
        if (coroutineScopeValueOf != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScopeValueOf, null, null, new OtcAgentTradeCardMessageViewProvider$handleSubmitOrderClick$1(this, otcAgentTradeCardMessageData, c35254nrp, null), 3, null);
        }
    }

    public final Object OLrzqt(final OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, Continuation<? super Unit> continuation) {
        String type;
        if (otcAgentTradeCardMessageData.isBuyType()) {
            type = TradeType.BUY.getType();
        } else {
            type = TradeType.SELL.getType();
        }
        final String str = type;
        C32866mlf.onEvent$default("OrderConfirm_Btm_Pay_Click", (TrackChannel[]) null, new Function1() { // from class: o.lKj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OtcAgentTradeCardMessageViewProvider.OLrzqt(otcAgentTradeCardMessageData, str, (EventParamsList) obj);
            }
        }, 1, (Object) null);
        InterfaceC31422lti interfaceC31422lti = (InterfaceC31422lti) C43251rlk.OLrzqt(InterfaceC31422lti.class);
        if (interfaceC31422lti != null) {
            Object objCopydefault = interfaceC31422lti.copydefault(str, str, otcAgentTradeCardMessageData.getQuoteCurrency(), otcAgentTradeCardMessageData.getQuoteAmount(), otcAgentTradeCardMessageData.getBaseCurrency(), otcAgentTradeCardMessageData.getBaseAmount(), otcAgentTradeCardMessageData.getQuoteToken(), otcAgentTradeCardMessageData.getRequestId(), "1000", "1000", "BALANCE", "BALANCE", "BALANCE", continuation);
            return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("isotcagent", "true", false);
        eventParamsList.put("token", otcAgentTradeCardMessageData.getBaseCurrency(), false);
        eventParamsList.put("currency", otcAgentTradeCardMessageData.getQuoteCurrency(), false);
        eventParamsList.put("flow", str, true);
        eventParamsList.put(OtcExtraKeys.CRYPTO_ORDER_TYPE, "one_time", true);
        EventParamsList.put$default(eventParamsList, "quote_amount", otcAgentTradeCardMessageData.getQuoteAmount(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "base_amount", otcAgentTradeCardMessageData.getBaseAmount(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, C35254nrp c35254nrp) {
        sKH skhCopydefault;
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU == null || (skhCopydefault = interfaceC35180nqU.copydefault()) == null) {
            return;
        }
        OKMessage.Companion companion = OKMessage.Companion;
        String targetId = c35254nrp.OLrzqt().getTargetId();
        OKConversationType oKConversationType = OKConversationType.GROUP;
        OtcAgentOrderPlacedMessage otcAgentOrderPlacedMessage = new OtcAgentOrderPlacedMessage();
        otcAgentOrderPlacedMessage.setServiceName("assistant-api");
        otcAgentOrderPlacedMessage.setBizName("OTC_ORDER_PLACED_MESSAGE");
        Json.Default r5 = Json.Default;
        OtcAgentOrderPlacedMessageContent otcAgentOrderPlacedMessageContent = new OtcAgentOrderPlacedMessageContent("OTC_ORDER_PLACED_MESSAGE", new OtcAgentOrderPlacedMessageData(otcAgentTradeCardMessageData.getRequestId()));
        r5.getSerializersModule();
        otcAgentOrderPlacedMessage.setContent(r5.encodeToString(OtcAgentOrderPlacedMessageContent.Companion.serializer(), otcAgentOrderPlacedMessageContent));
        Unit unit = Unit.INSTANCE;
        skhCopydefault.KWHzl(companion.OLrzqt(targetId, oKConversationType, otcAgentOrderPlacedMessage), "", "", new ActionBar());
    }

    public static final class ActionBar implements InterfaceC44289sKh {
        @Override // o.InterfaceC44289sKh
        public void copydefault(OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            pUU.EZpvd("OtcAgentTradeCardMessageViewProvider", "sendOrderPlacedMessage onStart");
        }

        @Override // o.InterfaceC44289sKh
        public void AEQbTJ(OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            pUU.EZpvd("OtcAgentTradeCardMessageViewProvider", "sendOrderPlacedMessage onSuccess");
        }

        @Override // o.InterfaceC44289sKh
        public void OLrzqt(OKMessage oKMessage, Throwable th) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            Intrinsics.checkNotNullParameter(th, "");
            pUU.copydefault("OtcAgentTradeCardMessageViewProvider", "sendOrderPlacedMessage onError", th);
        }
    }

    public final void AEQbTJ(TextView textView, final OtcAgentTradeCardMessageData otcAgentTradeCardMessageData) {
        try {
            C32866mlf.onEvent$default("OTC_AI_Agent_Order_Card_Copy_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.lKr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OtcAgentTradeCardMessageViewProvider.EZpvd(otcAgentTradeCardMessageData, (EventParamsList) obj);
                }
            }, 1, (Object) null);
            Object systemService = textView.getContext().getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(OtcExtraKeys.ORDER_ID, otcAgentTradeCardMessageData.getOrderId()));
            String strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.UJEglR);
            final C55284xgz c55284xgzKWHzl = C55284xgz.Companion.KWHzl(textView, strAYXKKw);
            if (c55284xgzKWHzl != null) {
                c55284xgzKWHzl.isConnected(0);
                c55284xgzKWHzl.djBIcL(0);
                c55284xgzKWHzl.AEQbTJ(strAYXKKw);
                c55284xgzKWHzl.EZpvd(new View.OnClickListener() { // from class: o.lKt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        OtcAgentTradeCardMessageViewProvider.AEQbTJ(c55284xgzKWHzl, view);
                    }
                });
                c55284xgzKWHzl.hDKMBd();
            }
        } catch (Exception e) {
            pUU.AEQbTJ("OtcAgentTradeCardMessageViewProvider", "Could not copy order ID.", e);
        }
    }

    public static final Unit EZpvd(OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.QUOTE_CURRENCY, otcAgentTradeCardMessageData.getQuoteCurrency(), false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.BASE_CURRENCY, otcAgentTradeCardMessageData.getBaseCurrency(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "quote_amount", otcAgentTradeCardMessageData.getQuoteAmount(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "base_amount", otcAgentTradeCardMessageData.getBaseAmount(), false, 4, null);
        eventParamsList.put(OtcExtraKeys.SIDE, (otcAgentTradeCardMessageData.isBuyType() ? OtcAgentMetrics.SIDE.BUY : OtcAgentMetrics.SIDE.SELL).getValue(), true);
        eventParamsList.put("card_status", otcAgentTradeCardMessageData.getStatus().getValue(), true);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER_ID, otcAgentTradeCardMessageData.getOrderId(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C55284xgz c55284xgz, View view) {
        c55284xgz.copydefault();
    }

    public final Application KWHzl(OtcAgentTradeCardMessageData otcAgentTradeCardMessageData) {
        long jValueOf = C33129mqd.valueOf(otcAgentTradeCardMessageData.getQuoteTime());
        long jValueOf2 = jValueOf + C33129mqd.valueOf(otcAgentTradeCardMessageData.getQuoteExpireMs());
        long jCurrentTimeMillis = System.currentTimeMillis();
        return new Application(jValueOf, jValueOf2, Math.max(0L, TimeUnit.MILLISECONDS.toSeconds(jValueOf2 - jCurrentTimeMillis)), jCurrentTimeMillis >= jValueOf2);
    }

    public final String OLrzqt(OtcAgentTradeCardMessageData otcAgentTradeCardMessageData) {
        if (C33492mxV.OLrzqt()) {
            return otcAgentTradeCardMessageData.getBaseCurrencyDarkIconUrl();
        }
        return otcAgentTradeCardMessageData.getBaseCurrencyIconUrl();
    }

    public final String EZpvd(OtcAgentTradeCardMessageData otcAgentTradeCardMessageData) {
        if (C33492mxV.OLrzqt()) {
            return otcAgentTradeCardMessageData.getQuoteCurrencyDarkIconUrl();
        }
        return otcAgentTradeCardMessageData.getQuoteCurrencyIconUrl();
    }

    public final CoroutineScope valueOf() {
        if (this.ejfBZ != null) {
            return LifecycleOwnerKt.getLifecycleScope(DbNXlk());
        }
        return null;
    }

    private final AbstractActivityC33041mov OLrzqt(Context context) {
        Context contextOLrzqt = C58196ywi.OLrzqt(context);
        if (contextOLrzqt instanceof AbstractActivityC33041mov) {
            return (AbstractActivityC33041mov) contextOLrzqt;
        }
        return null;
    }

    /* JADX INFO: loaded from: classes15.dex */
    @Serializable
    public static final class OtcAgentOrderPlacedMessage extends OKInvisibleCustomMessage implements sJU<OtcAgentOrderPlacedMessage> {
        public static final Companion Companion = new Companion(null);

        public static final /* synthetic */ void copydefault(OtcAgentOrderPlacedMessage otcAgentOrderPlacedMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider.OtcAgentOrderPlacedMessage.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<OtcAgentOrderPlacedMessage> serializer() {
                return OtcAgentTradeCardMessageViewProvider$OtcAgentOrderPlacedMessage$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ OtcAgentOrderPlacedMessage(int i, SerializationConstructorMarker serializationConstructorMarker) {
        }

        public OtcAgentOrderPlacedMessage() {
        }

        @Override // o.sJU
        public String encodeToInHouseCustomContent() {
            String content = getContent();
            return content == null ? "" : content;
        }

        /* JADX DEBUG: Method merged with bridge method: decodeFromInHouseCustomContent(Ljava/lang/String;)Ljava/lang/Object; */
        @Override // o.sJU
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public OtcAgentOrderPlacedMessage decodeFromInHouseCustomContent(String str) {
            setContent(str);
            return this;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    @Serializable
    public static final class OtcAgentOrderPlacedMessageContent {
        public static final Companion Companion = new Companion(null);
        public final OtcAgentOrderPlacedMessageData data;
        public final String useCase;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public OtcAgentOrderPlacedMessageContent() {
            this((String) null, (OtcAgentOrderPlacedMessageData) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OtcAgentOrderPlacedMessageContent copy$default(OtcAgentOrderPlacedMessageContent otcAgentOrderPlacedMessageContent, String str, OtcAgentOrderPlacedMessageData otcAgentOrderPlacedMessageData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = otcAgentOrderPlacedMessageContent.useCase;
            }
            if ((i & 2) != 0) {
                otcAgentOrderPlacedMessageData = otcAgentOrderPlacedMessageContent.data;
            }
            return otcAgentOrderPlacedMessageContent.OLrzqt(str, otcAgentOrderPlacedMessageData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OtcAgentOrderPlacedMessageContent OLrzqt(@NotNull String str, @NotNull OtcAgentOrderPlacedMessageData otcAgentOrderPlacedMessageData) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(otcAgentOrderPlacedMessageData, "");
            return new OtcAgentOrderPlacedMessageContent(str, otcAgentOrderPlacedMessageData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OtcAgentOrderPlacedMessageContent)) {
                return false;
            }
            OtcAgentOrderPlacedMessageContent otcAgentOrderPlacedMessageContent = (OtcAgentOrderPlacedMessageContent) obj;
            return Intrinsics.EZpvd((Object) this.useCase, (Object) otcAgentOrderPlacedMessageContent.useCase) && Intrinsics.EZpvd(this.data, otcAgentOrderPlacedMessageContent.data);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.useCase.hashCode() * 31) + this.data.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OtcAgentOrderPlacedMessageContent(useCase=" + this.useCase + ", data=" + this.data + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider.OtcAgentOrderPlacedMessageContent.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<OtcAgentOrderPlacedMessageContent> serializer() {
                return OtcAgentTradeCardMessageViewProvider$OtcAgentOrderPlacedMessageContent$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ OtcAgentOrderPlacedMessageContent(int i, String str, OtcAgentOrderPlacedMessageData otcAgentOrderPlacedMessageData, SerializationConstructorMarker serializationConstructorMarker) {
            this.useCase = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.data = new OtcAgentOrderPlacedMessageData((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            } else {
                this.data = otcAgentOrderPlacedMessageData;
            }
        }

        public static final /* synthetic */ void copydefault(OtcAgentOrderPlacedMessageContent otcAgentOrderPlacedMessageContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) otcAgentOrderPlacedMessageContent.useCase, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, otcAgentOrderPlacedMessageContent.useCase);
            }
            int i = 1;
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(otcAgentOrderPlacedMessageContent.data, new OtcAgentOrderPlacedMessageData((String) null, i, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
                return;
            }
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, OtcAgentTradeCardMessageViewProvider$OtcAgentOrderPlacedMessageData$$serializer.INSTANCE, otcAgentOrderPlacedMessageContent.data);
        }

        public OtcAgentOrderPlacedMessageContent(@NotNull String str, @NotNull OtcAgentOrderPlacedMessageData otcAgentOrderPlacedMessageData) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(otcAgentOrderPlacedMessageData, "");
            this.useCase = str;
            this.data = otcAgentOrderPlacedMessageData;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider$OtcAgentOrderPlacedMessageData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider$OtcAgentOrderPlacedMessageData:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (1 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (wrap:byte:?: TERNARY null = ((0 byte) == true) ? (1 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY])))
 A[MD:(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:758) call: com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider.OtcAgentOrderPlacedMessageData.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r2v0 com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider$OtcAgentOrderPlacedMessageData))
 A[MD:(java.lang.String, com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider$OtcAgentOrderPlacedMessageData):void (m)] (LINE:756) call: com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider.OtcAgentOrderPlacedMessageContent.<init>(java.lang.String, com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider$OtcAgentOrderPlacedMessageData):void type: THIS */
        public /* synthetic */ OtcAgentOrderPlacedMessageContent(String str, OtcAgentOrderPlacedMessageData otcAgentOrderPlacedMessageData, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new OtcAgentOrderPlacedMessageData((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : otcAgentOrderPlacedMessageData);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    @Serializable
    public static final class OtcAgentOrderPlacedMessageData {
        public static final Companion Companion = new Companion(null);
        public final String requestId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public OtcAgentOrderPlacedMessageData() {
            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OtcAgentOrderPlacedMessageData copy$default(OtcAgentOrderPlacedMessageData otcAgentOrderPlacedMessageData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = otcAgentOrderPlacedMessageData.requestId;
            }
            return otcAgentOrderPlacedMessageData.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OtcAgentOrderPlacedMessageData EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new OtcAgentOrderPlacedMessageData(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OtcAgentOrderPlacedMessageData) && Intrinsics.EZpvd((Object) this.requestId, (Object) ((OtcAgentOrderPlacedMessageData) obj).requestId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.requestId.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OtcAgentOrderPlacedMessageData(requestId=" + this.requestId + ")";
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider.OtcAgentOrderPlacedMessageData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<OtcAgentOrderPlacedMessageData> serializer() {
                return OtcAgentTradeCardMessageViewProvider$OtcAgentOrderPlacedMessageData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ OtcAgentOrderPlacedMessageData(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.requestId = "";
            } else {
                this.requestId = str;
            }
        }

        public static final /* synthetic */ void AEQbTJ(OtcAgentOrderPlacedMessageData otcAgentOrderPlacedMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd((Object) otcAgentOrderPlacedMessageData.requestId, (Object) "")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 0, otcAgentOrderPlacedMessageData.requestId);
        }

        public OtcAgentOrderPlacedMessageData(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.requestId = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:762) call: com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider.OtcAgentOrderPlacedMessageData.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ OtcAgentOrderPlacedMessageData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class StateListAnimator {
        public Application OLrzqt = new Application(0, 0, 0, false, 15, null);
        public Job copydefault;
        public static final Application Companion = new Application(null);
        public static final int AEQbTJ = 8;

        public final void OLrzqt(@NotNull CoroutineScope coroutineScope, @NotNull Application application, @NotNull Function1<? super Long, Unit> function1, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(coroutineScope, "");
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Job job = this.copydefault;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.OLrzqt = application;
            this.copydefault = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OtcAgentTradeCardMessageViewProvider$ExpirationTimer$startCountdown$1(this, function1, function0, null), 3, null);
        }

        public final void copydefault() {
            Job job = this.copydefault;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }

        public final boolean OLrzqt(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            Job job = this.copydefault;
            return (job != null && job.isActive() && copydefault(application)) ? false : true;
        }

        public final boolean copydefault(Application application) {
            return this.OLrzqt.OLrzqt() == application.OLrzqt() && this.OLrzqt.KWHzl() == application.KWHzl();
        }

        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider.StateListAnimator.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }
        }
    }

    public static final class Application {
        public final boolean AEQbTJ;
        public final long EZpvd;
        public final long KWHzl;
        public final long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(0L, 0L, 0L, false, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(long j, long j2, long j3, boolean z) {
            return new Application(j, j2, j3, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.EZpvd == application.EZpvd && this.copydefault == application.copydefault && this.KWHzl == application.KWHzl && this.AEQbTJ == application.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Long.hashCode(this.EZpvd) * 31) + Long.hashCode(this.copydefault)) * 31) + Long.hashCode(this.KWHzl)) * 31) + Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ExpirationState(startTimestamp=" + this.EZpvd + ", endTimestamp=" + this.copydefault + ", secondsRemaining=" + this.KWHzl + ", isExpired=" + this.AEQbTJ + ")";
        }

        public Application(long j, long j2, long j3, boolean z) {
            this.EZpvd = j;
            this.copydefault = j2;
            this.KWHzl = j3;
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r7v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r9v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r11v0 long) : (0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(long, long, long, boolean):void (m)] (LINE:815) call: com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider.Application.<init>(long, long, long, boolean):void type: THIS */
        public /* synthetic */ Application(long j, long j2, long j3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) == 0 ? j3 : 0L, (i & 8) != 0 ? false : z);
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
