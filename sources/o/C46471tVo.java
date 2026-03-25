package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.color.MaterialColors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tVo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46471tVo extends ConstraintLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final C55173xeu AEQbTJ;
    public boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46471tVo(@NotNull android.content.Context context) {
        this(context, null, 0, null, 0, 30, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46471tVo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 0, 28, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46471tVo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 0, 24, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final void copydefault(android.view.View view) {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (r7v0 android.content.Context)
  (wrap:android.util.AttributeSet:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r8v0 android.util.AttributeSet))
  (wrap:int:0x000b: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:java.lang.Boolean:0x0012: TERNARY null = ((wrap:int:0x000c: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0010: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0013: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0017: SGET  A[WRAPPED] o.wXj.Activity.EZpvd int) : (r11v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int, java.lang.Boolean, int):void (m)] (LINE:27) call: o.tVo.<init>(android.content.Context, android.util.AttributeSet, int, java.lang.Boolean, int):void type: THIS */
    public /* synthetic */ C46471tVo(android.content.Context context, android.util.AttributeSet attributeSet, int i, java.lang.Boolean bool, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? java.lang.Boolean.TRUE : bool, (i3 & 16) != 0 ? C52761wXj.Activity.EZpvd : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46471tVo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, java.lang.Boolean bool, @androidx.annotation.ColorRes int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C55173xeu c55173xeu = new C55173xeu(context, null, 0, 6, null);
        this.AEQbTJ = c55173xeu;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C47501trL.FragmentManager.accept);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.CharSequence string$default = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C47501trL.FragmentManager.RlQdEF, 0, 4, null);
        java.lang.CharSequence string = string$default != null ? string$default.toString() : null;
        java.lang.CharSequence string$default2 = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C47501trL.FragmentManager.QKudOq, 0, 4, null);
        java.lang.String string2 = string$default2 != null ? string$default2.toString() : null;
        int integer = typedArrayObtainStyledAttributes.getInteger(C47501trL.FragmentManager.DAIeex, 6);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(C47501trL.FragmentManager.AxsJAYsNCnLh, -1);
        float fEZpvd = integer2 != 0 ? integer2 != 1 ? 0.0f : 48.0f : 96.0f;
        c55173xeu.setId(android.view.View.generateViewId());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.topToTop = 0;
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        layoutParams.bottomToBottom = -1;
        if (fEZpvd == 0.0f && Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            fEZpvd = C55298xhM.EZpvd(24.0f, context);
            layoutParams.bottomToBottom = 0;
        }
        Unit unit = Unit.INSTANCE;
        addView(c55173xeu, layoutParams);
        c55173xeu.setPaddingRelative(0, C55298xhM.copydefault(fEZpvd, context), 0, C55298xhM.copydefault(fEZpvd, context));
        if (string2 != null) {
            c55173xeu.setRetry(string2);
        }
        if (string != null) {
            setSubtitle(string);
        }
        if (integer == 8) {
            internalSetNetworkErrorUI$default(this, 0, null, null, null, new Function0() { // from class: o.tVt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C46471tVo.AEQbTJ();
                }
            }, 15, null);
        } else {
            copydefault(integer);
        }
        typedArrayObtainStyledAttributes.recycle();
        c55173xeu.setBackgroundColor(C33070mpX.OLrzqt(i2, context));
        setClickable(true);
        setFocusableInTouchMode(true);
        setOnClickListener(new View.OnClickListener() { // from class: o.tVw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C46471tVo.copydefault(view);
            }
        });
    }

    /* JADX INFO: renamed from: o.tVo$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tVo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    private final void copydefault(int i) {
        this.AEQbTJ.setEmptyTypeImage(i);
    }

    public final void setInBottomSheet(boolean z) {
        this.KWHzl = z;
        if (z) {
            android.content.Context context = getContext();
            int i = C52761wXj.ActionBar.UrRBLY;
            int i2 = C52761wXj.Activity.registerUser;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            setBackgroundColor(MaterialColors.getColor(context, i, C33070mpX.OLrzqt(i2, context2)));
            return;
        }
        int i3 = C52761wXj.Activity.EZpvd;
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        setBackgroundColor(C33070mpX.OLrzqt(i3, context3));
    }

    public final void setTitle(java.lang.CharSequence charSequence) {
        C55173xeu c55173xeu = this.AEQbTJ;
        if (charSequence == null) {
            charSequence = "";
        }
        c55173xeu.setTitle(charSequence);
    }

    public final void setSubtitle(java.lang.CharSequence charSequence) {
        C55173xeu c55173xeu = this.AEQbTJ;
        if (charSequence == null) {
            charSequence = "";
        }
        c55173xeu.setSubTitle(charSequence);
    }

    public final void setSubtitleColor(@androidx.annotation.ColorRes java.lang.Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            android.widget.TextView textView = (android.widget.TextView) this.AEQbTJ.findViewById(C52761wXj.FragmentManager.gtdfxv);
            if (textView != null) {
                textView.setTextColor(C33070mpX.copydefault(iIntValue));
            }
        }
    }

    public final void setRetry(java.lang.CharSequence charSequence) {
        C55173xeu c55173xeu = this.AEQbTJ;
        if (charSequence == null) {
            charSequence = "";
        }
        c55173xeu.setRetry(charSequence);
    }

    public final void setRetryClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.AEQbTJ.setRetryClickListener(onClickListener);
    }

    public final void setImage(android.graphics.drawable.Drawable drawable) {
        this.AEQbTJ.setImage(drawable);
    }

    public final void setImage(@androidx.annotation.DrawableRes int i) {
        this.AEQbTJ.setImage(i);
    }

    public final C52794wYp OLrzqt() {
        return this.AEQbTJ.AEQbTJ();
    }

    public final void setSmallTitleSize(boolean z) {
        if (z) {
            this.AEQbTJ.OLrzqt().setTextSize(14.0f);
        } else {
            this.AEQbTJ.OLrzqt().setTextSize(16.0f);
        }
    }

    public static /* synthetic */ void setNetworkError$default(C46471tVo c46471tVo, int i, int i2, int i3, int i4, Function0 function0, int i5, java.lang.Object obj) {
        int i6 = (i5 & 1) != 0 ? 8 : i;
        if ((i5 & 2) != 0) {
            i2 = C47501trL.Fragment.DcMfJKffREWX;
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = C47501trL.Fragment.DbNXlk;
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = C47501trL.Fragment.valueOf;
        }
        c46471tVo.setNetworkError(i6, i7, i8, i4, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tVo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setEmpty$default(C46471tVo c46471tVo, int i, java.lang.String str, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = C47501trL.Fragment.zsXlph;
        }
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        c46471tVo.setEmpty(i, str, function0);
    }

    public static /* synthetic */ void setNoSearchResult$default(C46471tVo c46471tVo, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = C47501trL.Fragment.DcMfJKDIADVb;
        }
        c46471tVo.setNoSearchResult(i);
    }

    public static /* synthetic */ void internalSetNetworkErrorUI$default(C46471tVo c46471tVo, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0, int i2, java.lang.Object obj) {
        int i3 = (i2 & 1) != 0 ? 8 : i;
        if ((i2 & 2) != 0) {
            str = C33070mpX.OLrzqt(C47501trL.Fragment.DcMfJKffREWX, c46471tVo.getContext());
        }
        java.lang.String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = C33070mpX.OLrzqt(C47501trL.Fragment.DbNXlk, c46471tVo.getContext());
        }
        java.lang.String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = C33070mpX.OLrzqt(C47501trL.Fragment.valueOf, c46471tVo.getContext());
        }
        c46471tVo.KWHzl(i3, str4, str5, str3, function0);
    }

    public final void KWHzl(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, final Function0<Unit> function0) {
        copydefault(i);
        this.AEQbTJ.setTitle(str);
        this.AEQbTJ.setSubTitle((java.lang.CharSequence) str2);
        this.AEQbTJ.setRetry(str3);
        this.AEQbTJ.setRetryClickListener(new View.OnClickListener() { // from class: o.tVs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C46471tVo.EZpvd(function0, view);
            }
        });
    }

    public static final void EZpvd(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public final void EZpvd(int i) {
        this.AEQbTJ.setPaddingRelative(0, i, 0, i);
        C55173xeu c55173xeu = this.AEQbTJ;
        ViewGroup.LayoutParams layoutParams = c55173xeu.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToTop = 0;
            layoutParams2.startToStart = 0;
            layoutParams2.endToEnd = 0;
            layoutParams2.bottomToBottom = ((float) i) != 0.0f ? -1 : 0;
            c55173xeu.setLayoutParams(layoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final void setNetworkError(int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, @androidx.annotation.StringRes int i4, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        setVisibility(0);
        KWHzl(i, C33070mpX.OLrzqt(i2, getContext()), C33070mpX.OLrzqt(i3, getContext()), C33070mpX.OLrzqt(i4, getContext()), function0);
    }

    public final void setNetworkError(@NotNull java.lang.Throwable th, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(function0, "");
        setVisibility(0);
        internalSetNetworkErrorUI$default(this, 0, C33070mpX.OLrzqt(C47501trL.Fragment.DcMfJKffREWX, getContext()), tRK.EZpvd(th), C33070mpX.OLrzqt(C47501trL.Fragment.valueOf, getContext()), function0, 1, null);
    }

    public final void setEmpty(@androidx.annotation.StringRes int i, @NotNull java.lang.String str, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        setVisibility(0);
        copydefault(6);
        setTitle("");
        setSubtitle(C33070mpX.OLrzqt(i, getContext()));
        setRetry(str);
        if (function0 != null) {
            setRetryClickListener(new View.OnClickListener() { // from class: o.tVu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    function0.invoke();
                }
            });
        }
    }

    public final void setNoSearchResult(@androidx.annotation.StringRes int i) {
        setVisibility(0);
        setTitle("");
        copydefault(7);
        setTitle("");
        setSubtitle(C33070mpX.OLrzqt(i, getContext()));
        setRetry("");
    }
}
