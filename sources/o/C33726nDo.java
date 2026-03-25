package o;

import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.web3pay.api.model.CurrencyDisplayStyle;
import com.okinc.business.web3pay.api.model.CurrencySign;
import com.okinc.business.web3pay.api.model.Web3PayOrderType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okimcore.model.im.BaseOKPayMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKPayMessage;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C44105sDn;
import o.C52761wXj;
import o.InterfaceC31257lqc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nDo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C33726nDo {
    public static final C33726nDo EZpvd = new C33726nDo();

    /* JADX INFO: renamed from: o.nDo$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKMessage.MessageDirection.values().length];
            try {
                iArr[OKMessage.MessageDirection.SEND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKPayMessage oKPayMessage) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKPayMessage, "");
        return true;
    }

    private C33726nDo() {
    }

    public final java.lang.CharSequence OLrzqt(@NotNull android.content.Context context, @NotNull BaseOKPayMessage baseOKPayMessage, @NotNull OKMessage oKMessage) {
        java.lang.String cryptoAmount$default;
        int i;
        int length;
        BigDecimal bigDecimalEZpvd;
        java.lang.String tokenType;
        InterfaceC31257lqc interfaceC31257lqc;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(baseOKPayMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.String amount = baseOKPayMessage.getAmount();
        java.lang.String strAYXKKw = null;
        if (amount == null || (bigDecimalEZpvd = C33129mqd.EZpvd(amount)) == null || (tokenType = baseOKPayMessage.getTokenType()) == null || (interfaceC31257lqc = (InterfaceC31257lqc) C43251rlk.OLrzqt(InterfaceC31257lqc.class)) == null) {
            cryptoAmount$default = null;
        } else {
            boolean zOLrzqt = C55296xhK.OLrzqt(context);
            java.lang.Integer tokenDecimal = baseOKPayMessage.getTokenDecimal();
            cryptoAmount$default = InterfaceC31257lqc.StateListAnimator.formatCryptoAmount$default(interfaceC31257lqc, zOLrzqt, bigDecimalEZpvd, tokenDecimal != null ? tokenDecimal.intValue() : 6, tokenType, CurrencySign.CURRENCY_SIGN_EMPTY, false, CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX, null, 128, null);
        }
        java.lang.Integer status = baseOKPayMessage.getStatus();
        if ((status != null && status.intValue() == 200) || (status != null && status.intValue() == 100)) {
            strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.fJNWhG);
        } else if (status != null && status.intValue() == 101) {
            java.lang.String string = context.getString(C35399nuc.LoaderManager.copydefault);
            Intrinsics.checkNotNullExpressionValue(string, "");
            strAYXKKw = C33069mpW.OLrzqt(string, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, java.lang.String.valueOf(cryptoAmount$default)), C56390yDp.OLrzqt("network", java.lang.String.valueOf(baseOKPayMessage.getNetwork()))));
        } else if (status != null && status.intValue() == 202) {
            strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.invokespecialODCBUN);
        } else if (status != null && status.intValue() == 103) {
            strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.invokespecialROgMPW);
        } else if (status != null && status.intValue() == 102) {
            strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.invokespecialaKhcqp);
        } else if (status != null && status.intValue() == 203) {
            strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.invokespecialDaTmkG);
        } else if (status != null && status.intValue() == 105) {
            strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.invokespecialDPHOMC);
        }
        java.lang.String string2 = context.getString(C35399nuc.LoaderManager.dbAction);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String str = string2 + " " + strAYXKKw;
        java.lang.Integer status2 = baseOKPayMessage.getStatus();
        if ((status2 != null && status2.intValue() == 203) || (status2 != null && status2.intValue() == 102)) {
            i = C52761wXj.Activity.QfJbVf;
        } else {
            i = ((status2 != null && status2.intValue() == 100) || (status2 != null && status2.intValue() == 101)) ? C52761wXj.Activity.gGvvIC : C52761wXj.Activity.QwvEab;
        }
        java.lang.Integer status3 = baseOKPayMessage.getStatus();
        if ((status3 != null && status3.intValue() == 203) || (status3 != null && status3.intValue() == 102)) {
            length = str.length();
        } else {
            length = string2.length();
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, i)), 0, length, 33);
        return spannableString;
    }

    public final nML KWHzl(@NotNull nML nml) {
        Intrinsics.checkNotNullParameter(nml, "");
        android.view.View root = nml.getRoot();
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            C33566myq c33566myq = C33566myq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(root.getContext(), "");
            int iEZpvd = yII.EZpvd(c33566myq.EZpvd(r5) * 0.6f);
            int iDp2px$default = C55298xhM.dp2px$default(280.0f, null, 1, null);
            int iDp2px$default2 = C55298xhM.dp2px$default(210.0f, null, 1, null);
            if (iEZpvd >= iDp2px$default) {
                iEZpvd = iDp2px$default;
            } else if (iEZpvd <= iDp2px$default2) {
                iEZpvd = iDp2px$default2;
            }
            layoutParams.width = iEZpvd;
        } else {
            layoutParams = null;
        }
        root.setLayoutParams(layoutParams);
        return nml;
    }

    public final void copydefault(@NotNull oAC<? extends ViewDataBinding, nML> oac, @NotNull C35254nrp c35254nrp, @NotNull BaseOKPayMessage baseOKPayMessage, @NotNull OKMessage.MessageDirection messageDirection) {
        java.lang.Integer numValueOf;
        android.graphics.drawable.Drawable drawableWrap;
        java.lang.Integer numValueOf2;
        int i;
        java.lang.String cryptoAmount$default;
        java.lang.Integer numValueOf3;
        BigDecimal bigDecimalEZpvd;
        java.lang.String tokenType;
        InterfaceC31257lqc interfaceC31257lqc;
        int color;
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(baseOKPayMessage, "");
        Intrinsics.checkNotNullParameter(messageDirection, "");
        nML nml = (nML) oac.EZpvd();
        java.lang.Integer status = baseOKPayMessage.getStatus();
        if (status != null && status.intValue() == 100) {
            numValueOf = java.lang.Integer.valueOf(C52761wXj.TaskDescription.RXzakW);
        } else if ((status != null && status.intValue() == 101) || (status != null && status.intValue() == 200)) {
            numValueOf = java.lang.Integer.valueOf(C52761wXj.TaskDescription.aSdHwS);
        } else if (status != null && status.intValue() == 202) {
            numValueOf = java.lang.Integer.valueOf(C52761wXj.TaskDescription.Dmq);
        } else if (status != null && status.intValue() == 103) {
            numValueOf = java.lang.Integer.valueOf(C52761wXj.TaskDescription.FdcJU);
        } else {
            numValueOf = ((status != null && status.intValue() == 102) || (status != null && status.intValue() == 203) || (status != null && status.intValue() == 105)) ? java.lang.Integer.valueOf(C52761wXj.TaskDescription.OFqMGB) : null;
        }
        android.graphics.drawable.Drawable drawable = numValueOf != null ? ContextCompat.getDrawable(nml.getRoot().getContext(), numValueOf.intValue()) : null;
        if (drawable != null) {
            drawableWrap = DrawableCompat.wrap(drawable);
            Intrinsics.checkNotNullExpressionValue(drawableWrap, "");
            if (StateListAnimator.copydefault[messageDirection.ordinal()] == 1) {
                color = ContextCompat.getColor(nml.getRoot().getContext(), C52761wXj.Activity.gasjUx);
            } else {
                color = ContextCompat.getColor(nml.getRoot().getContext(), C52761wXj.Activity.dvKsVJ);
            }
            DrawableCompat.setTint(drawableWrap, color);
        } else {
            drawableWrap = null;
        }
        nml.copydefault.setImageDrawable(drawableWrap);
        android.widget.TextView textView = nml.AYXKKw;
        java.lang.Integer status2 = baseOKPayMessage.getStatus();
        if (status2 != null && status2.intValue() == 200) {
            numValueOf2 = java.lang.Integer.valueOf(C35399nuc.LoaderManager.fJNWhG);
        } else if (status2 != null && status2.intValue() == 100) {
            numValueOf2 = java.lang.Integer.valueOf(C35399nuc.LoaderManager.invokespecialRuDPQV);
        } else if (status2 != null && status2.intValue() == 101) {
            numValueOf2 = java.lang.Integer.valueOf(Intrinsics.EZpvd((java.lang.Object) baseOKPayMessage.getPaymentSenderId(), (java.lang.Object) C44157sFk.KWHzl()) ? C35399nuc.LoaderManager.invokespecialdPnHjp : C35399nuc.LoaderManager.invokespecialatDTRm);
        } else if (status2 != null && status2.intValue() == 202) {
            numValueOf2 = java.lang.Integer.valueOf(Intrinsics.EZpvd((java.lang.Object) baseOKPayMessage.getPaymentSenderId(), (java.lang.Object) C44157sFk.KWHzl()) ? C35399nuc.LoaderManager.invokespecialhlXVux : C35399nuc.LoaderManager.invokespecialRtjmuc);
        } else if (status2 != null && status2.intValue() == 103) {
            numValueOf2 = java.lang.Integer.valueOf(C35399nuc.LoaderManager.invokespecialROgMPW);
        } else if (status2 != null && status2.intValue() == 102) {
            numValueOf2 = java.lang.Integer.valueOf(Intrinsics.EZpvd((java.lang.Object) baseOKPayMessage.getPaymentSenderId(), (java.lang.Object) C44157sFk.KWHzl()) ? C35399nuc.LoaderManager.invokespecialaKhcqp : C35399nuc.LoaderManager.gEmmrt);
        } else if (status2 != null && status2.intValue() == 203) {
            numValueOf2 = java.lang.Integer.valueOf(C35399nuc.LoaderManager.invokespecialDaTmkG);
        } else {
            numValueOf2 = (status2 != null && status2.intValue() == 105) ? java.lang.Integer.valueOf(C35399nuc.LoaderManager.invokespecialDPHOMC) : null;
        }
        textView.setText(numValueOf2 != null ? textView.getContext().getString(numValueOf2.intValue()) : null);
        android.widget.TextView textView2 = nml.AYXKKw;
        java.lang.Integer status3 = baseOKPayMessage.getStatus();
        if (status3 != null && status3.intValue() == 101) {
            i = StateListAnimator.copydefault[messageDirection.ordinal()] == 1 ? C52761wXj.Activity.gasjUx : C52761wXj.Activity.dvKsVJ;
        } else {
            i = StateListAnimator.copydefault[messageDirection.ordinal()] == 1 ? C52761wXj.Activity.WS : C52761wXj.Activity.DCUTEIddSDPG;
        }
        textView2.setTextColor(ContextCompat.getColor(nml.getRoot().getContext(), i));
        java.lang.String amount = baseOKPayMessage.getAmount();
        if (amount == null || (bigDecimalEZpvd = C33129mqd.EZpvd(amount)) == null || (tokenType = baseOKPayMessage.getTokenType()) == null || (interfaceC31257lqc = (InterfaceC31257lqc) C43251rlk.OLrzqt(InterfaceC31257lqc.class)) == null) {
            cryptoAmount$default = null;
        } else {
            android.content.Context context = nml.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            boolean zOLrzqt = C55296xhK.OLrzqt(context);
            java.lang.Integer tokenDecimal = baseOKPayMessage.getTokenDecimal();
            cryptoAmount$default = InterfaceC31257lqc.StateListAnimator.formatCryptoAmount$default(interfaceC31257lqc, zOLrzqt, bigDecimalEZpvd, tokenDecimal != null ? tokenDecimal.intValue() : 6, tokenType, CurrencySign.CURRENCY_SIGN_EMPTY, false, CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX, null, 128, null);
        }
        nml.EZpvd.setText(cryptoAmount$default);
        android.widget.TextView textView3 = nml.AEQbTJ;
        android.content.Context context2 = nml.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView3.setText(C33069mpW.KWHzl(context2, C35399nuc.LoaderManager.invokespecialaGOrKO, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("network", java.lang.String.valueOf(baseOKPayMessage.getNetwork())))));
        android.widget.TextView textView4 = nml.EZpvd;
        int[] iArr = StateListAnimator.copydefault;
        textView4.setTextColor(ContextCompat.getColor(nml.getRoot().getContext(), iArr[messageDirection.ordinal()] == 1 ? C52761wXj.Activity.zblBkD : C52761wXj.Activity.fdOvFl));
        nml.AEQbTJ.setTextColor(ContextCompat.getColor(nml.getRoot().getContext(), iArr[messageDirection.ordinal()] == 1 ? C52761wXj.Activity.aUsmxb : C52761wXj.Activity.QwvEab));
        android.widget.TextView textView5 = (android.widget.TextView) oac.copydefault().getRoot().findViewById(C44105sDn.ActionBar.QfsBiF);
        if (textView5 != null) {
            java.lang.Integer status4 = baseOKPayMessage.getStatus();
            if (status4 != null && status4.intValue() == 100) {
                numValueOf3 = java.lang.Integer.valueOf(C35399nuc.LoaderManager.iHkeWl);
            } else {
                numValueOf3 = (status4 != null && status4.intValue() == 200) ? java.lang.Integer.valueOf(C35399nuc.LoaderManager.ggKfIT) : null;
            }
            java.lang.String string = numValueOf3 != null ? textView5.getContext().getString(numValueOf3.intValue()) : null;
            textView5.setText(string);
            textView5.setVisibility((string == null || string.length() == 0) ^ true ? 0 : 8);
        }
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull OKMessage oKMessage, @NotNull BaseOKPayMessage baseOKPayMessage) {
        Web3PayOrderType web3PayOrderType;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(baseOKPayMessage, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("IMChat_ToolTip_Pay_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.nDp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33726nDo.AEQbTJ((EventParamsList) obj);
            }
        });
        java.lang.Integer status = baseOKPayMessage.getStatus();
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) C44157sFk.KWHzl(), (java.lang.Object) baseOKPayMessage.getPaymentSenderId());
        java.lang.String paymentId = baseOKPayMessage.getPaymentId();
        java.lang.String str = paymentId != null ? paymentId : "";
        if (status != null && status.intValue() == 101 && !zEZpvd) {
            RxBus.AEQbTJ(new C33731nDt(C33724nDm.KWHzl.EZpvd(oKMessage, baseOKPayMessage)));
            return;
        }
        if (status != null && status.intValue() == 203) {
            RxBus.AEQbTJ(new C33731nDt(C33724nDm.KWHzl.EZpvd(oKMessage, baseOKPayMessage)));
            return;
        }
        if (status != null && status.intValue() == 103 && !zEZpvd) {
            RxBus.AEQbTJ(new C33731nDt(C33724nDm.KWHzl.EZpvd(oKMessage, baseOKPayMessage)));
            return;
        }
        if (!zEZpvd) {
            web3PayOrderType = Web3PayOrderType.RECEIVE;
        } else {
            web3PayOrderType = Web3PayOrderType.PAY;
        }
        InterfaceC31257lqc interfaceC31257lqc = (InterfaceC31257lqc) C43251rlk.OLrzqt(InterfaceC31257lqc.class);
        if (interfaceC31257lqc != null) {
            interfaceC31257lqc.AEQbTJ(context, str, web3PayOrderType);
        }
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "IMChat_ToolTip_Pay_Click", "", false, 4, null);
        return Unit.INSTANCE;
    }
}
