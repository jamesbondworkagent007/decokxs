package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22408hem;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hNy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21831hNy extends LinearLayoutCompat {
    public android.view.animation.Animation AEQbTJ;
    public Function1<? super android.view.View, Unit> EZpvd;
    public final hAH KWHzl;
    public Function1<? super AbstractC22408hem, Unit> OLrzqt;
    public android.view.animation.Animation copydefault;
    public C22495hgT djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21831hNy(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventTrackingCallback(@NotNull Function1<? super AbstractC22408hem, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimitContentViewModel(@NotNull C22495hgT c22495hgT) {
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        this.djBIcL = c22495hgT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSettingsClickListener(@NotNull Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:27) call: o.hNy.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C21831hNy(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21831hNy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hAH hahOLrzqt = hAH.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hahOLrzqt, "");
        this.KWHzl = hahOLrzqt;
        KWHzl();
    }

    private final void KWHzl() {
        setOrientation(1);
        C25330iug c25330iug = this.KWHzl.AhwBna;
        C25352ivB.setOnDoubleCheckClickListener$default(c25330iug, 0L, new Function1() { // from class: o.hND
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21831hNy.KWHzl(this.KWHzl, (android.view.View) obj);
            }
        }, 1, null);
        java.lang.String string = c25330iug.getContext().getString(C23274hvD.Fragment.dYepVG);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c25330iug.setPresetName(string);
    }

    public static final Unit KWHzl(C21831hNy c21831hNy, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function1<? super android.view.View, Unit> function1 = c21831hNy.EZpvd;
        if (function1 != null) {
            function1.invoke(view);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setLiquidityVisible(@NotNull FragmentActivity fragmentActivity) {
        boolean z;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        ViewOnClickListenerC25336ium viewOnClickListenerC25336ium = this.KWHzl.EZpvd;
        Intrinsics.copydefault(viewOnClickListenerC25336ium);
        viewOnClickListenerC25336ium.setVisibility(0);
        C22495hgT c22495hgT = this.djBIcL;
        java.lang.String strAxsJAYaxsJAY = c22495hgT != null ? c22495hgT.AxsJAYaxsJAY() : null;
        if (strAxsJAYaxsJAY == null) {
            strAxsJAYaxsJAY = "";
        }
        C22495hgT c22495hgT2 = this.djBIcL;
        java.lang.String strFARcdN = c22495hgT2 != null ? c22495hgT2.fARcdN() : null;
        if (strFARcdN == null) {
            strFARcdN = "";
        }
        C22495hgT c22495hgT3 = this.djBIcL;
        if (c22495hgT3 != null) {
            z = c22495hgT3.dUDNAs();
        }
        viewOnClickListenerC25336ium.setupLiquiditySelection(strAxsJAYaxsJAY, strFARcdN, z, fragmentActivity, new Function1() { // from class: o.hNB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21831hNy.KWHzl(this.EZpvd, (AbstractC22408hem) obj);
            }
        });
    }

    public static final Unit KWHzl(C21831hNy c21831hNy, AbstractC22408hem abstractC22408hem) {
        Intrinsics.checkNotNullParameter(abstractC22408hem, "");
        Function1<? super AbstractC22408hem, Unit> function1 = c21831hNy.OLrzqt;
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        SlippageMode slippageModeEZpvd;
        C25415iwL c25415iwLRcXXUw;
        Intrinsics.checkNotNullParameter(str, "");
        C22495hgT c22495hgT = this.djBIcL;
        if (c22495hgT == null || (c25415iwLRcXXUw = c22495hgT.RcXXUw()) == null || (slippageModeEZpvd = c25415iwLRcXXUw.EZpvd()) == null) {
            slippageModeEZpvd = SlippageMode.Dynamic;
        }
        this.KWHzl.AhwBna.setSlippageValue(slippageModeEZpvd, str);
        this.KWHzl.AhwBna.setSlippageColor(false);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.AhwBna.setPriorityFeeValue(str);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C25330iug c25330iug = this.KWHzl.AhwBna;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "501")) {
            c25330iug.setMevDisplayForSol(str2, z, str3, z2);
        } else {
            c25330iug.setMevDisplayForEVM(str2, z, str3, z2);
        }
    }

    public final void setShowTimeSelectCallback(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C25352ivB.setOnDoubleCheckClickListener$default(this.KWHzl.copydefault, 0L, new Function1() { // from class: o.hNE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21831hNy.AEQbTJ(function0, this, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit AEQbTJ(Function0 function0, C21831hNy c21831hNy, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        function0.invoke();
        Function1<? super AbstractC22408hem, Unit> function1 = c21831hNy.OLrzqt;
        if (function1 != null) {
            function1.invoke(new AbstractC22408hem.TaskDescription(TrackButtonName.EXPIRE_TIME_ENTER.getButtonName(), ButtonType.OTHERS.getType()));
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.view.animation.Animation animation = this.copydefault;
        if (animation != null) {
            animation.cancel();
        }
        android.view.animation.Animation animation2 = this.AEQbTJ;
        if (animation2 != null) {
            animation2.cancel();
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        hAH hah = this.KWHzl;
        if (str.length() > 0) {
            hah.valueOf.setText(str);
        } else {
            hah.valueOf.setText("--");
        }
    }

    @Override // android.view.View
    public void setVisibility(final int i) {
        android.view.animation.Animation animation;
        android.view.animation.Animation animation2;
        if (getVisibility() == 0 && i == 0) {
            return;
        }
        if (getVisibility() == 8 && i == 8) {
            return;
        }
        if (i == 0) {
            if (getVisibility() == 8 && (animation = this.AEQbTJ) != null && !animation.hasEnded()) {
                android.view.animation.Animation animation3 = this.AEQbTJ;
                if (animation3 != null) {
                    animation3.cancel();
                }
                this.AEQbTJ = null;
            }
            android.view.animation.Animation animation4 = this.AEQbTJ;
            if ((animation4 == null || !animation4.hasEnded()) && this.AEQbTJ != null) {
                return;
            }
            this.AEQbTJ = C25352ivB.EZpvd(this, 100L, (Function0<Unit>) new Function0() { // from class: o.hNH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C21831hNy.EZpvd(this.AEQbTJ, i);
                }
            });
            return;
        }
        if (i == 8) {
            if (getVisibility() == 0 && (animation2 = this.copydefault) != null && !animation2.hasEnded()) {
                android.view.animation.Animation animation5 = this.copydefault;
                if (animation5 != null) {
                    animation5.cancel();
                }
                this.copydefault = null;
            }
            android.view.animation.Animation animation6 = this.copydefault;
            if ((animation6 == null || !animation6.hasEnded()) && this.copydefault != null) {
                return;
            }
            this.copydefault = C25352ivB.KWHzl((android.view.View) this, 100L, (Function0<Unit>) new Function0() { // from class: o.hNL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C21831hNy.KWHzl(this.KWHzl, i);
                }
            });
            return;
        }
        super.setVisibility(i);
    }

    public static final Unit EZpvd(C21831hNy c21831hNy, int i) {
        super.setVisibility(i);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C21831hNy c21831hNy, int i) {
        super.setVisibility(i);
        return Unit.INSTANCE;
    }

    public final void setServiceFee(final ServiceFeeInfo serviceFeeInfo) {
        hAH hah = this.KWHzl;
        if (serviceFeeInfo == null) {
            C25332iui c25332iui = hah.djBIcL;
            Intrinsics.checkNotNullExpressionValue(c25332iui, "");
            c25332iui.setVisibility(8);
        } else {
            C25332iui c25332iui2 = hah.djBIcL;
            Intrinsics.checkNotNullExpressionValue(c25332iui2, "");
            c25332iui2.setVisibility(serviceFeeInfo.isDisplay() ? 0 : 8);
            hah.djBIcL.setupServiceFee(C25404iwA.AEQbTJ(serviceFeeInfo), new Function0() { // from class: o.hNF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C21831hNy.copydefault(serviceFeeInfo, this);
                }
            });
        }
        final C22495hgT c22495hgT = this.djBIcL;
        if (c22495hgT != null) {
            hah.djBIcL.setIsShowReferralView(c22495hgT.QVsKAR(), new Function0() { // from class: o.hNG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C21831hNy.AEQbTJ(c22495hgT, this);
                }
            });
        }
    }

    public static final Unit copydefault(ServiceFeeInfo serviceFeeInfo, C21831hNy c21831hNy) {
        android.content.Context context = c21831hNy.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25404iwA.copydefault(serviceFeeInfo, context);
        Function1<? super AbstractC22408hem, Unit> function1 = c21831hNy.OLrzqt;
        if (function1 != null) {
            function1.invoke(new AbstractC22408hem.TaskDescription(TrackButtonName.SERVICE_FEE_EXPLAIN.getButtonName(), ButtonType.EXPLAIN.getType()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C22495hgT c22495hgT, C21831hNy c21831hNy) {
        android.content.Context context = c21831hNy.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c22495hgT.AEQbTJ(context);
        Function1<? super AbstractC22408hem, Unit> function1 = c21831hNy.OLrzqt;
        if (function1 != null) {
            function1.invoke(new AbstractC22408hem.Application(false));
        }
        return Unit.INSTANCE;
    }
}
