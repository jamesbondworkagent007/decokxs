package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.components.track.TrackChannel;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.AdjustLeverRequiredData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.LeverageReq;
import com.okinc.unify_trade.exception.BizSystemException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C49511upt;
import o.C52761wXj;
import o.InterfaceC49810uva;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uuY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49755uuY extends AbstractC49732uuB implements InterfaceC49810uva.Activity {
    public java.lang.String EZpvd;
    public InterfaceC58217yxC OLrzqt;
    public C49818uvi copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public float KWHzl = 0.95f;
    public int valueOf = 1;

    /* JADX INFO: renamed from: o.uuY$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49810uva.Activity
    public java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49393unh
    public java.lang.String djBIcL() {
        return "CoinAdjustLeverageDFragment";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.valueOf = i;
    }

    /* JADX INFO: renamed from: o.uuY$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uuY.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C49755uuY copydefault(java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull Function1<? super android.content.Context, Unit> function1) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C49755uuY c49755uuY = new C49755uuY();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("marginModel", str2);
            bundle.putString("ccy", str3);
            bundle.putString("instType", str);
            c49755uuY.setArguments(bundle);
            c49755uuY.KWHzl(function1);
            return c49755uuY;
        }
    }

    @Override // o.AbstractC49732uuB, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C49818uvi c49818uvi = new C49818uvi();
        this.copydefault = c49818uvi;
        c49818uvi.AEQbTJ(this);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            C49818uvi c49818uvi2 = this.copydefault;
            if (c49818uvi2 == null) {
                Intrinsics.gEmmrt("");
                c49818uvi2 = null;
            }
            java.lang.String string = arguments.getString("instType", "");
            Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String string2 = arguments.getString("marginModel", "cross");
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c49818uvi2.OLrzqt(string, string2, arguments.getString("ccy"));
        }
        C32866mlf.onEvent$default("PlaceOrder_PopUp_AdjustLeveragePage_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    @Override // o.AbstractC49732uuB, o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        int i = C49511upt.Activity.iZzfmt;
        C49818uvi c49818uvi = this.copydefault;
        if (c49818uvi == null) {
            Intrinsics.gEmmrt("");
            c49818uvi = null;
        }
        java.lang.String strEZpvd = c49818uvi.EZpvd();
        wxq.setTitle(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, strEZpvd != null ? strEZpvd : ""))));
        wxq.AEQbTJ().setVisibility(8);
        wxq.KWHzl().setVisibility(0);
        wxq.setStyle(1);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.uvg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49755uuY.copydefault(this.EZpvd, view);
            }
        });
    }

    public static final void copydefault(C49755uuY c49755uuY, android.view.View view) {
        c49755uuY.dismiss();
    }

    @Override // o.AbstractC49732uuB, o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        C49818uvi c49818uvi = null;
        java.lang.String string = arguments != null ? arguments.getString("ccy") : null;
        this.EZpvd = string;
        gEmmrt(java.lang.String.valueOf(string));
        valueOf(java.lang.String.valueOf(this.EZpvd));
        C49818uvi c49818uvi2 = this.copydefault;
        if (c49818uvi2 == null) {
            Intrinsics.gEmmrt("");
            c49818uvi2 = null;
        }
        c49818uvi2.EZpvd(fetchVPNInfo());
        copydefault(true);
        OLrzqt(java.lang.Boolean.FALSE);
        C49818uvi c49818uvi3 = this.copydefault;
        if (c49818uvi3 == null) {
            Intrinsics.gEmmrt("");
            c49818uvi3 = null;
        }
        C56109xwc<ResponseData<java.util.List<? extends AdjustLeverRequiredData>>> c56109xwcFetchVPNInfo = c49818uvi3.valueOf().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56109xwcFetchVPNInfo.observe(viewLifecycleOwner, new StateListAnimator(new Function1() { // from class: o.uuZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49755uuY.EZpvd(this.EZpvd, (ResponseData) obj);
            }
        }));
        C49818uvi c49818uvi4 = this.copydefault;
        if (c49818uvi4 == null) {
            Intrinsics.gEmmrt("");
            c49818uvi4 = null;
        }
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = c49818uvi4.valueOf().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.uuX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49755uuY.OLrzqt(this.AEQbTJ, (java.lang.Exception) obj);
            }
        }));
        C49818uvi c49818uvi5 = this.copydefault;
        if (c49818uvi5 == null) {
            Intrinsics.gEmmrt("");
            c49818uvi5 = null;
        }
        C56111xwe<java.util.ArrayList<LeverageReq>> c56111xweOLrzqt = c49818uvi5.OLrzqt();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweOLrzqt.observe(viewLifecycleOwner3, new StateListAnimator(new Function1() { // from class: o.uuW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49755uuY.AEQbTJ(this.copydefault, (java.util.ArrayList) obj);
            }
        }));
        C49818uvi c49818uvi6 = this.copydefault;
        if (c49818uvi6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c49818uvi = c49818uvi6;
        }
        C56109xwc<java.lang.Exception> c56109xwcAhwBna2 = c49818uvi.AhwBna().AhwBna();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56109xwcAhwBna2.observe(viewLifecycleOwner4, new Observer() { // from class: o.uve
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C49755uuY.OLrzqt((java.lang.Exception) obj);
            }
        });
        isConnected().QfsBiF.setVisibility(8);
    }

    public static final Unit EZpvd(C49755uuY c49755uuY, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        C49818uvi c49818uvi = c49755uuY.copydefault;
        AdjustLeverRequiredData adjustLeverRequiredData = null;
        if (c49818uvi == null) {
            Intrinsics.gEmmrt("");
            c49818uvi = null;
        }
        boolean z = responseData.getCode() == 0 && responseData.getData() != null;
        if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            adjustLeverRequiredData = (AdjustLeverRequiredData) ((java.util.List) data).get(0);
        }
        c49818uvi.copydefault(z, adjustLeverRequiredData, new BizApiException(responseData.getMsg(), C33129mqd.gEmmrt(java.lang.Integer.valueOf(responseData.getCode())), null, null, null, 28, null));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C49755uuY c49755uuY, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        C49818uvi c49818uvi = c49755uuY.copydefault;
        if (c49818uvi == null) {
            Intrinsics.gEmmrt("");
            c49818uvi = null;
        }
        c49818uvi.copydefault(false, null, new BizSystemException(exc.getMessage()));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C49755uuY c49755uuY, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        c49755uuY.AEQbTJ(true);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C33134mqi.AEQbTJ(message);
        }
    }

    @Override // o.AbstractC49732uuB
    public void copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.just("").delay(300L, java.util.concurrent.TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.uvc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49755uuY.KWHzl(this.AEQbTJ, str, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.uvb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49755uuY.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.uvd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49755uuY.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        this.OLrzqt = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.uvf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49755uuY.AEQbTJ(function12, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C49755uuY c49755uuY, java.lang.String str, java.lang.String str2) {
        C49818uvi c49818uvi = c49755uuY.copydefault;
        if (c49818uvi == null) {
            Intrinsics.gEmmrt("");
            c49818uvi = null;
        }
        c49818uvi.EZpvd(str);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC49732uuB
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C49818uvi c49818uvi = this.copydefault;
        if (c49818uvi == null) {
            Intrinsics.gEmmrt("");
            c49818uvi = null;
        }
        c49818uvi.AEQbTJ(str);
    }

    @Override // o.InterfaceC49810uva.Activity
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) fetchVPNInfo())) {
            AEQbTJ(str, "", "", "");
            copydefault(false);
        }
    }

    @Override // o.InterfaceC49810uva.Activity
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) fetchVPNInfo())) {
            copydefault((java.lang.CharSequence) AEQbTJ(this, str4, str2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String AEQbTJ(C49755uuY c49755uuY, java.lang.String str, java.lang.String str2) {
        BizInstrument suggestedInstrument$default;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL2;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String safeString$default = null;
        if (interfaceC54581xNrOLrzqt != null) {
            C49818uvi c49818uvi = c49755uuY.copydefault;
            if (c49818uvi == null) {
                Intrinsics.gEmmrt("");
                c49818uvi = null;
            }
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, c49818uvi.AEQbTJ(), null, null, null, 14, null);
        } else {
            suggestedInstrument$default = null;
        }
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null) {
            c54536xMLDjBIcL = null;
        } else {
            C49818uvi c49818uvi2 = c49755uuY.copydefault;
            if (c49818uvi2 == null) {
                Intrinsics.gEmmrt("");
                c49818uvi2 = null;
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(c49818uvi2.AEQbTJ());
            if (abstractC54531xLwOLrzqt != null) {
                C54571xNh c54571xNhCreateTradeConverterWithIndex$default = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily != null ? instFamily : "", null, 2, null);
                if (c54571xNhCreateTradeConverterWithIndex$default != null) {
                    c54536xMLDjBIcL = c54571xNhCreateTradeConverterWithIndex$default.djBIcL(str2);
                }
            }
        }
        if (c54536xMLDjBIcL != null) {
            c54536xMLDjBIcL.EZpvd("4");
        }
        if (c54536xMLDjBIcL != null && (c54536xMLCopydefault = c54536xMLDjBIcL.copydefault()) != null && (c54536xMLDjBIcL2 = c54536xMLCopydefault.djBIcL()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null);
        }
        return safeString$default + " " + str;
    }

    @Override // o.AbstractC49732uuB
    public void hDKMBd() {
        isConnected().QVAiDq.setVisibility(0);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C49511upt.Activity.getNewProxyInstance);
        java.lang.String strCopydefault = C33069mpW.copydefault(C49511upt.Activity.zuWLRA, C56423yEv.EZpvd(C56390yDp.OLrzqt("positionTier", strAYXKKw)));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strCopydefault);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, strAYXKKw, 0, false, 6, (java.lang.Object) null);
        int length = strAYXKKw.length() + iIndexOf$default;
        spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), iIndexOf$default, length, 33);
        spannableStringBuilder.setSpan(new Application(), iIndexOf$default, length, 33);
        isConnected().QVAiDq.setText(spannableStringBuilder);
        isConnected().QVAiDq.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        isConnected().QVAiDq.setClickable(true);
    }

    /* JADX INFO: renamed from: o.uuY$Application */
    public static final class Application extends android.text.style.ClickableSpan {
        public Application() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            android.content.Context context = C49755uuY.this.getContext();
            if (context != null) {
                C49755uuY.this.copydefault(context);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            textPaint.setUnderlineText(true);
        }
    }

    @Override // o.InterfaceC49810uva.Activity
    public void KWHzl(java.lang.String str) {
        copydefault(true);
        if (str != null && str.length() != 0) {
            AkhnZx(str);
            copydefault(false);
        } else {
            AkhnZx("");
        }
    }

    public void AEQbTJ(boolean z) {
        Function2<java.lang.Boolean, java.lang.String, Unit> function2EjfBZ;
        dismissAllowingStateLoss();
        if (!z || (function2EjfBZ = ejfBZ()) == null) {
            return;
        }
        function2EjfBZ.invoke(java.lang.Boolean.TRUE, fetchVPNInfo());
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C49818uvi c49818uvi = this.copydefault;
        if (c49818uvi == null) {
            Intrinsics.gEmmrt("");
            c49818uvi = null;
        }
        c49818uvi.KWHzl();
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C49818uvi c49818uvi = this.copydefault;
        if (c49818uvi == null) {
            Intrinsics.gEmmrt("");
            c49818uvi = null;
        }
        c49818uvi.copydefault();
    }

    @Override // o.AbstractC49732uuB, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C49818uvi c49818uvi = this.copydefault;
        if (c49818uvi == null) {
            Intrinsics.gEmmrt("");
            c49818uvi = null;
        }
        c49818uvi.djBIcL();
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }
}
