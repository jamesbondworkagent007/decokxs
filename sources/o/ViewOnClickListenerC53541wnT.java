package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import com.okinc.biz.TradeType;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C49861uwY;
import o.C55688xof;
import o.InterfaceC49496upe;
import o.InterfaceC8104awT;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wnT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ViewOnClickListenerC53541wnT extends ConstraintLayout implements View.OnClickListener {
    public Function1<? super java.lang.Boolean, Unit> AYXKKw;
    public InterfaceC49943uyA EZpvd;
    public C55887xsS KWHzl;
    public final AbstractC50991veb OLrzqt;
    public Function0<? extends AbstractC49896uxG> copydefault;
    public Function2<? super java.lang.String, ? super java.lang.String, Unit> valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.wnT$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.BUY_OPEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.SELL_CLOSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC53541wnT(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC53541wnT(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> */
    public final Function2<java.lang.String, java.lang.String, Unit> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55887xsS copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputPanelView(InterfaceC49943uyA interfaceC49943uyA) {
        this.EZpvd = interfaceC49943uyA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstManager(C55887xsS c55887xsS) {
        this.KWHzl = c55887xsS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarginModelViewModel(Function0<? extends AbstractC49896uxG> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlaceOrderClickCallback(Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        this.valueOf = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRefreshCallback(Function1<? super java.lang.Boolean, Unit> function1) {
        this.AYXKKw = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:70) call: o.wnT.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ ViewOnClickListenerC53541wnT(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC53541wnT(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.OtZEmZ, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC50991veb abstractC50991veb = (AbstractC50991veb) viewDataBindingInflate;
        this.OLrzqt = abstractC50991veb;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
        marginLayoutParams.bottomMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        setLayoutParams(marginLayoutParams);
        abstractC50991veb.djBIcL.setOnClickListener(this);
        abstractC50991veb.valueOf.setOnClickListener(this);
        abstractC50991veb.AEQbTJ.setOnClickListener(this);
        C52794wYp c52794wYp = abstractC50991veb.copydefault;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = abstractC50991veb.isConnected;
        c52794wYp2.setOnClickListener(new ActionBar(c52794wYp2, 1000L, this));
    }

    public final void EZpvd() {
        C54794xVo c54794xVo = C54794xVo.copydefault;
        C55887xsS c55887xsS = this.KWHzl;
        if (c54794xVo.valueOf(c55887xsS != null ? c55887xsS.AhwBna() : null)) {
            this.OLrzqt.copydefault.setEnabled(false);
            this.OLrzqt.isConnected.setEnabled(false);
        } else {
            this.OLrzqt.copydefault.setEnabled(true);
            this.OLrzqt.isConnected.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: o.wnT$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wnT.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0409  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ() {
        int i;
        java.lang.String strOLrzqt;
        java.lang.String strOLrzqt2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        java.lang.String strGEmmrt;
        Function0<? extends AbstractC49896uxG> function0;
        AbstractC49896uxG abstractC49896uxGInvoke;
        AbstractC54531xLw abstractC54531xLwAEQbTJ;
        InterfaceC49943uyA interfaceC49943uyA = this.EZpvd;
        if (interfaceC49943uyA != null) {
            interfaceC49943uyA.KWHzl();
        }
        this.OLrzqt.OLrzqt.setVisibility(8);
        this.OLrzqt.KWHzl.setVisibility(8);
        if (!C55697xoo.OLrzqt.isConnected()) {
            this.OLrzqt.djBIcL.setVisibility(0);
            this.OLrzqt.valueOf.setVisibility(8);
            this.OLrzqt.copydefault.setVisibility(8);
            this.OLrzqt.AhwBna.setVisibility(8);
            this.OLrzqt.gEmmrt.setVisibility(8);
            this.OLrzqt.isConnected.setVisibility(8);
            this.OLrzqt.AYXKKw.setVisibility(8);
            this.OLrzqt.DbNXlk.setVisibility(8);
            this.OLrzqt.AEQbTJ.setVisibility(8);
            return;
        }
        this.OLrzqt.djBIcL.setVisibility(8);
        C55887xsS c55887xsS = this.KWHzl;
        if (c55887xsS != null && (abstractC54531xLwAEQbTJ = c55887xsS.AEQbTJ()) != null && !abstractC54531xLwAEQbTJ.getFieldNames()) {
            this.OLrzqt.valueOf.setVisibility(0);
            this.OLrzqt.copydefault.setVisibility(8);
            this.OLrzqt.AhwBna.setVisibility(8);
            this.OLrzqt.gEmmrt.setVisibility(8);
            this.OLrzqt.isConnected.setVisibility(8);
            this.OLrzqt.AYXKKw.setVisibility(8);
            this.OLrzqt.DbNXlk.setVisibility(8);
            this.OLrzqt.AEQbTJ.setVisibility(8);
            return;
        }
        this.OLrzqt.valueOf.setVisibility(8);
        C55887xsS c55887xsS2 = this.KWHzl;
        java.lang.String strAuCTelauCTel = null;
        BizInstrument bizInstrumentAhwBna = c55887xsS2 != null ? c55887xsS2.AhwBna() : null;
        java.lang.String strCopydefault = (!Intrinsics.EZpvd((java.lang.Object) (bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getInstType() : null), (java.lang.Object) "MARGIN") || (function0 = this.copydefault) == null || (abstractC49896uxGInvoke = function0.invoke()) == null) ? null : abstractC49896uxGInvoke.copydefault();
        C49861uwY.ActionBar actionBar = C49861uwY.Companion;
        TradeType tradeType = actionBar.copydefault().get();
        C53466wly c53466wly = C53466wly.AEQbTJ;
        java.util.ArrayList<java.lang.String> arrayListAEQbTJ = c53466wly.AEQbTJ(bizInstrumentAhwBna, strCopydefault, tradeType);
        C55887xsS c55887xsS3 = this.KWHzl;
        boolean zKWHzl = c53466wly.KWHzl(c55887xsS3 != null ? c55887xsS3.AhwBna() : null, arrayListAEQbTJ, tradeType);
        java.lang.String str = "";
        if (zKWHzl) {
            this.OLrzqt.AEQbTJ.setVisibility(0);
            C52794wYp c52794wYp = this.OLrzqt.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c53466wly.KWHzl(c52794wYp, arrayListAEQbTJ);
            this.OLrzqt.copydefault.setVisibility(8);
            this.OLrzqt.AhwBna.setVisibility(8);
            this.OLrzqt.gEmmrt.setVisibility(8);
            this.OLrzqt.isConnected.setVisibility(8);
            this.OLrzqt.AYXKKw.setVisibility(8);
            this.OLrzqt.DbNXlk.setVisibility(8);
            if (arrayListAEQbTJ != null && (strGEmmrt = C33129mqd.gEmmrt(arrayListAEQbTJ)) != null) {
                str = strGEmmrt;
            }
            pUU.KWHzl("TradeFooterView", "collateralList=" + str);
            return;
        }
        this.OLrzqt.AEQbTJ.setVisibility(8);
        C55887xsS c55887xsS4 = this.KWHzl;
        java.lang.String strDjBIcL = c55887xsS4 != null ? c55887xsS4.djBIcL() : null;
        if (strDjBIcL != null) {
            switch (strDjBIcL.hashCode()) {
                case -2027980370:
                    if (!strDjBIcL.equals("MARGIN")) {
                    }
                    TradeType tradeType2 = actionBar.copydefault().get();
                    i = tradeType2 != null ? Application.AEQbTJ[tradeType2.ordinal()] : -1;
                    if (i != 1) {
                        this.OLrzqt.copydefault.setVisibility(0);
                        this.OLrzqt.isConnected.setVisibility(8);
                        C52794wYp c52794wYp2 = this.OLrzqt.copydefault;
                        java.lang.String string = getContext().getString(C55688xof.Application.setPipParamsSourceRectHint);
                        C55887xsS c55887xsS5 = this.KWHzl;
                        if (c55887xsS5 != null && (strOLrzqt = c55887xsS5.OLrzqt()) != null) {
                            str = strOLrzqt;
                        }
                        c52794wYp2.setText(string + " " + str);
                    } else if (i == 2) {
                        this.OLrzqt.copydefault.setVisibility(8);
                        this.OLrzqt.isConnected.setVisibility(0);
                        C52794wYp c52794wYp3 = this.OLrzqt.isConnected;
                        java.lang.String string2 = getContext().getString(C55688xof.Application.addMenuProvider);
                        C55887xsS c55887xsS6 = this.KWHzl;
                        if (c55887xsS6 != null && (strOLrzqt2 = c55887xsS6.OLrzqt()) != null) {
                            str = strOLrzqt2;
                        }
                        c52794wYp3.setText(string2 + " " + str);
                    }
                    this.OLrzqt.AhwBna.setVisibility(8);
                    this.OLrzqt.gEmmrt.setVisibility(8);
                    this.OLrzqt.AYXKKw.setVisibility(8);
                    this.OLrzqt.DbNXlk.setVisibility(8);
                    break;
                case -1956807563:
                    strDjBIcL.equals("OPTION");
                    break;
                case 2552066:
                    if (!strDjBIcL.equals("SPOT")) {
                    }
                    TradeType tradeType22 = actionBar.copydefault().get();
                    if (tradeType22 != null) {
                    }
                    if (i != 1) {
                    }
                    this.OLrzqt.AhwBna.setVisibility(8);
                    this.OLrzqt.gEmmrt.setVisibility(8);
                    this.OLrzqt.AYXKKw.setVisibility(8);
                    this.OLrzqt.DbNXlk.setVisibility(8);
                    break;
                case 2558355:
                    if (!strDjBIcL.equals("SWAP")) {
                    }
                    interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                    if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null) {
                        strAuCTelauCTel = newProxyInstance.AuCTelauCTel();
                    }
                    if (!Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "net_mode")) {
                        this.OLrzqt.copydefault.setVisibility(0);
                        this.OLrzqt.copydefault.setText(getContext().getString(C55688xof.Application.setPipParamsSourceRectHint));
                        this.OLrzqt.AhwBna.setVisibility(0);
                        C53539wnR.setFooterAvaTitle$default(this.OLrzqt.AhwBna, getContext().getString(C55688xof.Application.dispatchResult), false, null, 6, null);
                        this.OLrzqt.AhwBna.setFooterAvaValue("");
                        this.OLrzqt.gEmmrt.setVisibility(8);
                        this.OLrzqt.isConnected.setVisibility(0);
                        this.OLrzqt.isConnected.setText(getContext().getString(C55688xof.Application.addMenuProvider));
                        this.OLrzqt.AYXKKw.setVisibility(0);
                        C53539wnR.setFooterAvaTitle$default(this.OLrzqt.AYXKKw, getContext().getString(C55688xof.Application.ActivityResultRegistryCallbackAndContract), false, null, 6, null);
                        this.OLrzqt.AYXKKw.setFooterAvaValue("");
                        this.OLrzqt.DbNXlk.setVisibility(8);
                        break;
                    } else if (Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "long_short_mode")) {
                        TradeType tradeType3 = actionBar.copydefault().get();
                        i = tradeType3 != null ? Application.AEQbTJ[tradeType3.ordinal()] : -1;
                        if (i == 1) {
                            this.OLrzqt.copydefault.setVisibility(0);
                            this.OLrzqt.copydefault.setText(getContext().getString(C55688xof.Application.lambdanew0));
                            this.OLrzqt.AhwBna.setVisibility(0);
                            C53539wnR.setFooterAvaTitle$default(this.OLrzqt.AhwBna, getContext().getString(C55688xof.Application.setPosition), false, null, 6, null);
                            this.OLrzqt.AhwBna.setFooterAvaValue("");
                            this.OLrzqt.gEmmrt.setVisibility(8);
                            this.OLrzqt.isConnected.setVisibility(0);
                            this.OLrzqt.isConnected.setText(getContext().getString(C55688xof.Application.addOnMultiWindowModeChangedListener));
                            this.OLrzqt.AYXKKw.setVisibility(0);
                            C53539wnR.setFooterAvaTitle$default(this.OLrzqt.AYXKKw, getContext().getString(C55688xof.Application.isDrawerIndicatorEnabled), false, null, 6, null);
                            this.OLrzqt.AYXKKw.setFooterAvaValue("");
                            this.OLrzqt.DbNXlk.setVisibility(8);
                            break;
                        } else if (i == 2) {
                            this.OLrzqt.copydefault.setVisibility(0);
                            this.OLrzqt.copydefault.setText(getContext().getString(C55688xof.Application.getCREATORannotations));
                            this.OLrzqt.AhwBna.setVisibility(8);
                            this.OLrzqt.gEmmrt.setVisibility(0);
                            this.OLrzqt.gEmmrt.setFooterAvaTitle(getContext().getString(C55688xof.Application.ActivityResultContractsCaptureVideo), true, new Function0() { // from class: o.wnX
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return ViewOnClickListenerC53541wnT.AEQbTJ(this.KWHzl);
                                }
                            });
                            this.OLrzqt.gEmmrt.setFooterAvaValue("");
                            this.OLrzqt.isConnected.setVisibility(0);
                            this.OLrzqt.isConnected.setText(getContext().getString(C55688xof.Application.LocalFullyDrawnReporterOwnerLocalFullyDrawnReporterOwner1));
                            this.OLrzqt.AYXKKw.setVisibility(8);
                            this.OLrzqt.DbNXlk.setVisibility(0);
                            this.OLrzqt.DbNXlk.setFooterAvaTitle(getContext().getString(C55688xof.Application.ActivityResultContractSynchronousResult), true, new Function0() { // from class: o.woa
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return ViewOnClickListenerC53541wnT.gEmmrt(this.EZpvd);
                                }
                            });
                            this.OLrzqt.DbNXlk.setFooterAvaValue("");
                            this.OLrzqt.OLrzqt.setVisibility(0);
                            this.OLrzqt.KWHzl.setVisibility(0);
                            this.OLrzqt.OLrzqt.setFooterAvaTitle(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistry3), true, new Function0() { // from class: o.wnZ
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return ViewOnClickListenerC53541wnT.valueOf(this.AEQbTJ);
                                }
                            });
                            this.OLrzqt.KWHzl.setFooterAvaTitle(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistry3), true, new Function0() { // from class: o.wog
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return ViewOnClickListenerC53541wnT.AhwBna(this.EZpvd);
                                }
                            });
                            break;
                        }
                    }
                    break;
                case 214415088:
                    if (!strDjBIcL.equals("FUTURES")) {
                    }
                    interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                    if (interfaceC54581xNrOLrzqt != null) {
                        strAuCTelauCTel = newProxyInstance.AuCTelauCTel();
                    }
                    if (!Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "net_mode")) {
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: o.wnT$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ViewOnClickListenerC53541wnT copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ViewOnClickListenerC53541wnT viewOnClickListenerC53541wnT) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = viewOnClickListenerC53541wnT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.copydefault("clickSell");
                Function2<java.lang.String, java.lang.String, Unit> function2KWHzl = this.copydefault.KWHzl();
                if (function2KWHzl != null) {
                    java.util.List listGEmmrt = yDY.gEmmrt("FUTURES", "SWAP");
                    C55887xsS c55887xsSCopydefault = this.copydefault.copydefault();
                    java.lang.String str = null;
                    if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), c55887xsSCopydefault != null ? c55887xsSCopydefault.djBIcL() : null) && C56059xvf.EZpvd.DbNXlk()) {
                        TradeType tradeType = C49861uwY.Companion.copydefault().get();
                        int i = tradeType == null ? -1 : Application.AEQbTJ[tradeType.ordinal()];
                        if (i == 1) {
                            str = "short";
                        } else if (i == 2) {
                            str = "long";
                        }
                    }
                    function2KWHzl.invoke("clickSell", str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wnT$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ViewOnClickListenerC53541wnT OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ViewOnClickListenerC53541wnT viewOnClickListenerC53541wnT) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = viewOnClickListenerC53541wnT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.copydefault("clickBuy");
                Function2<java.lang.String, java.lang.String, Unit> function2KWHzl = this.OLrzqt.KWHzl();
                if (function2KWHzl != null) {
                    java.util.List listGEmmrt = yDY.gEmmrt("FUTURES", "SWAP");
                    C55887xsS c55887xsSCopydefault = this.OLrzqt.copydefault();
                    java.lang.String str = null;
                    if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), c55887xsSCopydefault != null ? c55887xsSCopydefault.djBIcL() : null) && C56059xvf.EZpvd.DbNXlk()) {
                        TradeType tradeType = C49861uwY.Companion.copydefault().get();
                        int i = tradeType == null ? -1 : Application.AEQbTJ[tradeType.ordinal()];
                        if (i == 1) {
                            str = "long";
                        } else if (i == 2) {
                            str = "short";
                        }
                    }
                    function2KWHzl.invoke("clickBuy", str);
                }
            }
        }
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC53541wnT viewOnClickListenerC53541wnT) {
        viewOnClickListenerC53541wnT.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(ViewOnClickListenerC53541wnT viewOnClickListenerC53541wnT) {
        viewOnClickListenerC53541wnT.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(ViewOnClickListenerC53541wnT viewOnClickListenerC53541wnT) {
        viewOnClickListenerC53541wnT.OLrzqt();
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ViewOnClickListenerC53541wnT viewOnClickListenerC53541wnT) {
        viewOnClickListenerC53541wnT.OLrzqt();
        return Unit.INSTANCE;
    }

    private final void valueOf() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.ComponentDialogExternalSyntheticLambda1));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.IntentSenderRequestCompanion), new View.OnClickListener() { // from class: o.wnS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ViewOnClickListenerC53541wnT.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void OLrzqt() {
        android.content.Context context = getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.FullyDrawnReporter));
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), new View.OnClickListener() { // from class: o.wob
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ViewOnClickListenerC53541wnT.copydefault(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.r8lambda9oQ81VFq3e0CkAqj9HHhVQeVeY), new View.OnClickListener() { // from class: o.wnY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ViewOnClickListenerC53541wnT.copydefault(viewOnClickListenerC54939xaY, this, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, ViewOnClickListenerC53541wnT viewOnClickListenerC53541wnT, android.view.View view) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, C35334ntP.KWHzl(viewOnClickListenerC53541wnT), BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C55688xof.Application.ComponentDialogExternalSyntheticApiModelOutline0))), null, 4, null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        Function0<? extends AbstractC49896uxG> function0;
        AbstractC49896uxG abstractC49896uxGInvoke;
        InterfaceC8104awT interfaceC8104awT;
        if (Intrinsics.EZpvd(view, this.OLrzqt.djBIcL)) {
            android.content.Context context = getContext();
            if (context == null || (interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class)) == null) {
                return;
            }
            InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, context, null, 2, null);
            return;
        }
        if (Intrinsics.EZpvd(view, this.OLrzqt.valueOf)) {
            InterfaceC49496upe interfaceC49496upeCopydefault = C53685wqE.copydefault.copydefault();
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            InterfaceC49496upe.Application.startAccountModeActivity$default(interfaceC49496upeCopydefault, context2, "2", null, 4, null);
            return;
        }
        if (Intrinsics.EZpvd(view, this.OLrzqt.AEQbTJ)) {
            C55887xsS c55887xsS = this.KWHzl;
            final BizInstrument bizInstrumentAhwBna = c55887xsS != null ? c55887xsS.AhwBna() : null;
            final java.lang.String strCopydefault = (!Intrinsics.EZpvd((java.lang.Object) (bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getInstType() : null), (java.lang.Object) "MARGIN") || (function0 = this.copydefault) == null || (abstractC49896uxGInvoke = function0.invoke()) == null) ? null : abstractC49896uxGInvoke.copydefault();
            final TradeType tradeType = C49861uwY.Companion.copydefault().get();
            android.content.Context context3 = getContext();
            FragmentActivity fragmentActivity = context3 instanceof FragmentActivity ? (FragmentActivity) context3 : null;
            if (fragmentActivity != null) {
                C53466wly.AEQbTJ.EZpvd(fragmentActivity, bizInstrumentAhwBna, strCopydefault, tradeType, new Function1() { // from class: o.wnW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC53541wnT.EZpvd(this.OLrzqt, bizInstrumentAhwBna, strCopydefault, tradeType, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            }
            C53466wly.AEQbTJ.OLrzqt(bizInstrumentAhwBna, "TWAP");
        }
    }

    public static final Unit EZpvd(ViewOnClickListenerC53541wnT viewOnClickListenerC53541wnT, BizInstrument bizInstrument, java.lang.String str, TradeType tradeType, boolean z) {
        if (z) {
            Function1<? super java.lang.Boolean, Unit> function1 = viewOnClickListenerC53541wnT.AYXKKw;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.FALSE);
            }
            pUU.KWHzl("TradeFooterView", "updateUi");
        }
        pUU.KWHzl("TradeFooterView", "openResultCallback-->" + z + " instType:" + (bizInstrument != null ? bizInstrument.getInstType() : null) + " instId:" + (bizInstrument != null ? bizInstrument.getInstId() : null) + " marginSymbol:" + str + " tradType:" + (tradeType != null ? tradeType.name() : null));
        C53466wly c53466wly = C53466wly.AEQbTJ;
        c53466wly.KWHzl(bizInstrument, c53466wly.AEQbTJ(bizInstrument, str, tradeType), "TWAP");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        if (r0.equals("SPOT") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008d, code lost:
    
        if (r0.equals("MARGIN") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0094, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r6, (java.lang.Object) "clickBuy") == false) goto L49;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(java.lang.String str) {
        final java.lang.String strDjBIcL;
        final java.lang.String str2;
        xOW newProxyInstance;
        java.lang.String strAuCTelauCTel;
        C55887xsS c55887xsS = this.KWHzl;
        if (c55887xsS == null || (strDjBIcL = c55887xsS.djBIcL()) == null) {
            return;
        }
        TradeType tradeType = C49861uwY.Companion.copydefault().get();
        switch (strDjBIcL.hashCode()) {
            case -2027980370:
                break;
            case -1956807563:
                strDjBIcL.equals("OPTION");
                str2 = "";
                C32866mlf.KWHzl("trade_strategy_make_order", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.wnU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC53541wnT.OLrzqt(str2, strDjBIcL, (EventParamsList) obj);
                    }
                });
                break;
            case 2552066:
                break;
            case 2558355:
                if (strDjBIcL.equals("SWAP")) {
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                    if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && (strAuCTelauCTel = newProxyInstance.AuCTelauCTel()) != null) {
                        if (Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "net_mode")) {
                            str2 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "clickBuy") ? "buy" : "sell";
                        } else if (tradeType == TradeType.BUY_OPEN) {
                            str2 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "clickBuy") ? "buy_long" : "sell_short";
                        } else {
                            str2 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "clickBuy") ? "buy_short" : "sell_long";
                        }
                    }
                } else {
                    str2 = "";
                }
                C32866mlf.KWHzl("trade_strategy_make_order", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.wnU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC53541wnT.OLrzqt(str2, strDjBIcL, (EventParamsList) obj);
                    }
                });
                break;
            case 214415088:
                if (!strDjBIcL.equals("FUTURES")) {
                }
                C32866mlf.KWHzl("trade_strategy_make_order", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.wnU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC53541wnT.OLrzqt(str2, strDjBIcL, (EventParamsList) obj);
                    }
                });
                break;
        }
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", str, true);
        eventParamsList.put("inst_type", str2, true);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt.DbNXlk.setFooterAvaValue(str);
        this.OLrzqt.gEmmrt.setFooterAvaValue(str2);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(ViewOnClickListenerC53541wnT viewOnClickListenerC53541wnT, java.lang.String str, java.lang.String str2) {
        java.lang.String safeString$default;
        java.lang.String safeString$default2;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        C54571xNh c54571xNhCreateAmtConvert$default;
        java.lang.String str3 = "";
        if (str2 == null) {
            xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
            str2 = value != null ? value.AYXKKw() : null;
            if (str2 == null) {
                str2 = "";
            }
        }
        C55887xsS c55887xsS = viewOnClickListenerC53541wnT.KWHzl;
        C54536xML c54536xMLDjBIcL2 = (c55887xsS == null || (c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(c55887xsS, str2, false, 2, null)) == null) ? null : c54571xNhCreateAmtConvert$default.djBIcL(str);
        if (c54536xMLDjBIcL2 == null || (c54536xMLDjBIcL = c54536xMLDjBIcL2.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
            safeString$default = "";
        }
        if (c54536xMLDjBIcL2 != null && (safeString$default2 = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null)) != null) {
            str3 = safeString$default2;
        }
        return new kotlin.Pair<>(safeString$default, str3);
    }

    public final void copydefault(MaxAvailableResp maxAvailableResp) {
        java.lang.String first = "--";
        this.OLrzqt.AhwBna.setFooterAvaValue((maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getBuySize())) ? "--" : KWHzl(this, maxAvailableResp.getBuySize(), (java.lang.String) null).getFirst());
        this.OLrzqt.AYXKKw.setFooterAvaValue((maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getSellSize())) ? "--" : KWHzl(this, maxAvailableResp.getSellSize(), (java.lang.String) null).getFirst());
        this.OLrzqt.KWHzl.setFooterAvaValue((maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getShortAvailablePos())) ? "--" : KWHzl(this, maxAvailableResp.getShortAvailablePos(), (java.lang.String) null).getFirst());
        if (maxAvailableResp != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getLongAvailablePos())) {
            first = KWHzl(this, maxAvailableResp.getLongAvailablePos(), (java.lang.String) null).getFirst();
        }
        this.OLrzqt.OLrzqt.setFooterAvaValue(first);
    }
}
