package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelStoreOwner;
import com.okinc.biz.TradeType;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.RecurringOrderData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vUW extends ConstraintLayout implements InterfaceC53558wnk {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public RecurringOrderData AEQbTJ;
    public uWH copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vUW(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vUW(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53558wnk
    public void AEQbTJ(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
    }

    @Override // o.InterfaceC53558wnk
    public java.lang.String AhwBna() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC53558wnk
    public java.lang.String EZpvd(ViewModelStoreOwner viewModelStoreOwner, BizInstrument bizInstrument, @NotNull TradeType tradeType) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        return null;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.vUW.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ vUW(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vUW(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new RecurringOrderData((java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, 16383, (DefaultConstructorMarker) null);
        copydefault();
        AEQbTJ();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vUW.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final void copydefault() {
        uWH uwh = (uWH) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.fdt, this, true);
        this.copydefault = uwh;
        uWH uwh2 = null;
        if (uwh == null) {
            Intrinsics.gEmmrt("");
            uwh = null;
        }
        uwh.AYXKKw.KWHzl().setTextSize(14.0f);
        uWH uwh3 = this.copydefault;
        if (uwh3 == null) {
            Intrinsics.gEmmrt("");
            uwh3 = null;
        }
        uwh3.AEQbTJ.KWHzl().setTextSize(14.0f);
        uWH uwh4 = this.copydefault;
        if (uwh4 == null) {
            Intrinsics.gEmmrt("");
            uwh4 = null;
        }
        uwh4.AYXKKw.OLrzqt();
        uWH uwh5 = this.copydefault;
        if (uwh5 == null) {
            Intrinsics.gEmmrt("");
            uwh5 = null;
        }
        uwh5.AEQbTJ.OLrzqt();
        uWH uwh6 = this.copydefault;
        if (uwh6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uwh2 = uwh6;
        }
        uwh2.AYXKKw.setTitleClickListener(new View.OnClickListener() { // from class: o.vUV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vUW.EZpvd(this.KWHzl, view);
            }
        });
        EZpvd(false);
    }

    public static final void EZpvd(vUW vuw, android.view.View view) {
        android.content.Context context = vuw.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.UlpNxW);
        viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.svY);
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new View.OnClickListener() { // from class: o.vUZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                vUW.OLrzqt(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        uWH uwh = this.copydefault;
        if (uwh == null) {
            Intrinsics.gEmmrt("");
            uwh = null;
        }
        uwh.AEQbTJ.KWHzl(new View.OnClickListener() { // from class: o.vUX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vUW.OLrzqt(function0, view);
            }
        });
    }

    public static final void OLrzqt(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public final void KWHzl(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        uWH uwh = this.copydefault;
        if (uwh == null) {
            Intrinsics.gEmmrt("");
            uwh = null;
        }
        uwh.AYXKKw.KWHzl(new View.OnClickListener() { // from class: o.vUY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vUW.EZpvd(function0, view);
            }
        });
    }

    public static final void EZpvd(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    private final void AEQbTJ() {
        uWH uwh = this.copydefault;
        if (uwh == null) {
            Intrinsics.gEmmrt("");
            uwh = null;
        }
        uwh.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.vVc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vUW.AEQbTJ(this.KWHzl, view);
            }
        });
    }

    public static final void AEQbTJ(vUW vuw, android.view.View view) {
        uWH uwh = vuw.copydefault;
        if (uwh == null) {
            Intrinsics.gEmmrt("");
            uwh = null;
        }
        Group group = uwh.EZpvd;
        Intrinsics.checkNotNullExpressionValue(group, "");
        vuw.EZpvd(!(group.getVisibility() == 0));
    }

    public final void EZpvd(boolean z) {
        uWH uwh = this.copydefault;
        uWH uwh2 = null;
        if (uwh == null) {
            Intrinsics.gEmmrt("");
            uwh = null;
        }
        Group group = uwh.EZpvd;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(z ? 0 : 8);
        int i = z ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG;
        uWH uwh3 = this.copydefault;
        if (uwh3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uwh2 = uwh3;
        }
        uwh2.OLrzqt.setImageResource(i);
    }

    public final void setBotName(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.setStgyName(str);
        uWH uwh = this.copydefault;
        if (uwh == null) {
            Intrinsics.gEmmrt("");
            uwh = null;
        }
        uwh.AEQbTJ.setActiveContent(str);
    }

    public final java.lang.String OLrzqt() {
        java.lang.String stgyName = this.AEQbTJ.getStgyName();
        return stgyName == null ? "" : stgyName;
    }

    public final void setPriceRange(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        uWH uwh = this.copydefault;
        if (uwh == null) {
            Intrinsics.gEmmrt("");
            uwh = null;
        }
        uwh.AYXKKw.setActiveContent(str);
    }
}
