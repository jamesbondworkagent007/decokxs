package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.web3Uilib.bean.TransactionButtonGroupInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yiw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57468yiw extends ConstraintLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final C57373yhG OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57468yiw(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57468yiw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.yiw.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57468yiw(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57468yiw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57373yhG c57373yhGAEQbTJ = C57373yhG.AEQbTJ(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57373yhGAEQbTJ, "");
        this.OLrzqt = c57373yhGAEQbTJ;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57406yhn.Fragment.zuBGHE);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.AxsJAY);
        string = string == null ? "" : string;
        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.gHZMYf);
        java.lang.String str = string2 != null ? string2 : "";
        setPrimaryButtonText(string);
        setSecondaryButtonText(str);
        typedArrayObtainStyledAttributes.recycle();
        setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public final C52794wYp copydefault() {
        C52794wYp c52794wYp = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        return c52794wYp;
    }

    public final C52794wYp EZpvd() {
        C52794wYp c52794wYp = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        return c52794wYp;
    }

    public final void setViewDataBean(@NotNull TransactionButtonGroupInfoBean transactionButtonGroupInfoBean) {
        Intrinsics.checkNotNullParameter(transactionButtonGroupInfoBean, "");
        setPrimaryButtonText(transactionButtonGroupInfoBean.getPrimaryButtonContent());
        setPrimaryButtonCallBack(transactionButtonGroupInfoBean.getPrimaryButtonCallback());
        setSecondaryButtonText(transactionButtonGroupInfoBean.getSecondaryButtonContent());
        setSecondaryButtonCallBack(transactionButtonGroupInfoBean.getSecondaryButtonCallback());
    }

    public final void setPrimaryButtonText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            C52794wYp c52794wYp = this.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(8);
        } else {
            C52794wYp c52794wYp2 = this.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            c52794wYp2.setVisibility(0);
            this.OLrzqt.OLrzqt.setText(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yiw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setPrimaryButtonCallBack$default(C57468yiw c57468yiw, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        c57468yiw.setPrimaryButtonCallBack(function0);
    }

    public final void setPrimaryButtonCallBack(final Function0<Unit> function0) {
        C8003auW.copydefault(this.OLrzqt.OLrzqt).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.yiE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C57468yiw.setPrimaryButtonCallBack$lambda$0(function0, obj);
            }
        });
    }

    public static final void setPrimaryButtonCallBack$lambda$0(Function0 function0, java.lang.Object obj) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setSecondaryButtonText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            C52794wYp c52794wYp = this.OLrzqt.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(8);
        } else {
            C52794wYp c52794wYp2 = this.OLrzqt.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            c52794wYp2.setVisibility(0);
            this.OLrzqt.AEQbTJ.setText(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yiw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setSecondaryButtonCallBack$default(C57468yiw c57468yiw, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        c57468yiw.setSecondaryButtonCallBack(function0);
    }

    public final void setSecondaryButtonCallBack(final Function0<Unit> function0) {
        C8003auW.copydefault(this.OLrzqt.AEQbTJ).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.yiD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C57468yiw.setSecondaryButtonCallBack$lambda$1(function0, obj);
            }
        });
    }

    public static final void setSecondaryButtonCallBack$lambda$1(Function0 function0, java.lang.Object obj) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setPrimaryButtonEnabled(boolean z) {
        this.OLrzqt.OLrzqt.setEnabled(z);
    }

    public final void setSecondaryButtonEnabled(boolean z) {
        this.OLrzqt.AEQbTJ.setEnabled(z);
    }

    public final void setSecondaryButtonStyle(int i) {
        this.OLrzqt.AEQbTJ.setOKDSType((i == 0 || i != 1) ? 257 : 262);
    }

    /* JADX INFO: renamed from: o.yiw$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yiw.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
