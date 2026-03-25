package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.okinc.web3Uilib.bean.TransactionInfoRowBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57518yjt extends ConstraintLayout {
    public final C57416yhx OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57518yjt(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57518yjt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.yjt.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57518yjt(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57518yjt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57416yhx c57416yhxCopydefault = C57416yhx.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57416yhxCopydefault, "");
        this.OLrzqt = c57416yhxCopydefault;
        int[] iArr = C57406yhn.Fragment.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.EZpvd);
        string = string == null ? "" : string;
        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.copydefault);
        java.lang.String str = string2 != null ? string2 : "";
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C57406yhn.Fragment.AEQbTJ, false);
        setTitle$default(this, string, null, 2, null);
        setInfoValue(str);
        setShowArrow$default(this, z, false, 2, null);
        typedArrayObtainStyledAttributes.recycle();
        setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public final android.widget.TextView AEQbTJ() {
        android.widget.TextView textView = this.OLrzqt.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final void setViewDataBean(@NotNull TransactionInfoRowBean transactionInfoRowBean) {
        Intrinsics.checkNotNullParameter(transactionInfoRowBean, "");
        setTitle(transactionInfoRowBean.getTitle(), transactionInfoRowBean.getTitleClickCallback());
        setInfoValue(transactionInfoRowBean.getInfoValue());
        java.lang.Integer infoValueColor = transactionInfoRowBean.getInfoValueColor();
        setInfoValueColor(infoValueColor != null ? infoValueColor.intValue() : ContextCompat.getColor(getContext(), C52761wXj.Activity.QwvEab));
        setInfoTag(transactionInfoRowBean.getInfoTag(), transactionInfoRowBean.getInfoTagStyle(), transactionInfoRowBean.getInfoTagIcon(), transactionInfoRowBean.getInfoTagShowIcon(), transactionInfoRowBean.getInfoTagPaint(), transactionInfoRowBean.getInfoTagClickCallback(), false);
        setRightIcon(transactionInfoRowBean.getRightIcon(), transactionInfoRowBean.getRightIconDefault(), false);
        setShowArrow(transactionInfoRowBean.getShowArrow(), false);
        setClickCallback(transactionInfoRowBean.getClickCallback());
        OLrzqt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yjt */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTitle$default(C57518yjt c57518yjt, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c57518yjt.setTitle(str, function0);
    }

    public final void setTitle(@NotNull java.lang.String str, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        if (function0 == null) {
            this.OLrzqt.gEmmrt.setText(str);
            this.OLrzqt.gEmmrt.setOnClickListener(null);
            this.OLrzqt.gEmmrt.setClickable(false);
            this.OLrzqt.gEmmrt.setMovementMethod(null);
            return;
        }
        this.OLrzqt.gEmmrt.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        AppCompatTextView appCompatTextView = this.OLrzqt.gEmmrt;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        C57492yjT c57492yjT = new C57492yjT(C33070mpX.copydefault(C52761wXj.Activity.ORxRYg), str);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.setSpan(c57492yjT, length, spannableStringBuilder.length(), 17);
        appCompatTextView.setText(new android.text.SpannedString(spannableStringBuilder));
        this.OLrzqt.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.yjC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                function0.invoke();
            }
        });
    }

    public final void setInfoValue(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.OLrzqt.valueOf.setText(charSequence);
    }

    public final void setInfoValueColor(int i) {
        this.OLrzqt.valueOf.setTextColor(i);
    }

    public final void setInfoTag(@NotNull java.lang.CharSequence charSequence, java.lang.Integer num, java.lang.Integer num2, boolean z, java.lang.Integer num3, final Function0<Unit> function0, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (charSequence.length() > 0) {
            C55251xgS c55251xgS = this.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(0);
            this.OLrzqt.OLrzqt.setText(charSequence);
            if (num != null) {
                this.OLrzqt.OLrzqt.setOKDSStyle(num.intValue());
            }
            if (num3 != null) {
                this.OLrzqt.OLrzqt.setTagPaint(num3.intValue());
            }
            if (z && num2 != null) {
                this.OLrzqt.OLrzqt.setTagIcon(getContext().getDrawable(num2.intValue()));
                this.OLrzqt.OLrzqt.setShowIcon(true);
            } else {
                this.OLrzqt.OLrzqt.setShowIcon(false);
            }
            if (function0 != null) {
                this.OLrzqt.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.yjx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        function0.invoke();
                    }
                });
            } else {
                this.OLrzqt.OLrzqt.setOnClickListener(null);
                this.OLrzqt.OLrzqt.setClickable(false);
            }
        } else {
            C55251xgS c55251xgS2 = this.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
            c55251xgS2.setVisibility(8);
        }
        if (z2) {
            OLrzqt();
        }
    }

    public static /* synthetic */ void setRightIcon$default(C57518yjt c57518yjt, java.lang.Object obj, android.graphics.drawable.Drawable drawable, boolean z, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            drawable = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        c57518yjt.setRightIcon(obj, drawable, z);
    }

    public final void setRightIcon(java.lang.Object obj, android.graphics.drawable.Drawable drawable, boolean z) {
        if (obj != null || drawable != null) {
            AppCompatImageView appCompatImageView = this.OLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(0);
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrKWHzl = Glide.KWHzl(this.OLrzqt.copydefault);
            if (obj == null) {
                obj = drawable;
            }
            Intrinsics.copydefault(componentCallbacks2C5333NrKWHzl.KWHzl(obj).EZpvd(drawable).OLrzqt(drawable).EZpvd((android.widget.ImageView) this.OLrzqt.copydefault));
        } else {
            AppCompatImageView appCompatImageView2 = this.OLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            appCompatImageView2.setVisibility(8);
        }
        if (z) {
            OLrzqt();
        }
    }

    public static /* synthetic */ void setShowArrow$default(C57518yjt c57518yjt, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        c57518yjt.setShowArrow(z, z2);
    }

    /* JADX INFO: renamed from: o.yjt$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C57518yjt KWHzl;
        public final /* synthetic */ Function1 OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function1 function1, C57518yjt c57518yjt) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = function1;
            this.KWHzl = c57518yjt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.invoke(this.KWHzl);
            }
        }
    }

    public final void setShowArrow(boolean z, boolean z2) {
        AppCompatImageView appCompatImageView = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(z ? 0 : 8);
        if (z2) {
            OLrzqt();
        }
    }

    public final void setClickCallback(Function1<? super C57518yjt, Unit> function1) {
        if (function1 != null) {
            android.view.View root = this.OLrzqt.getRoot();
            root.setOnClickListener(new ActionBar(root, 1000L, function1, this));
        } else {
            this.OLrzqt.getRoot().setOnClickListener(null);
            this.OLrzqt.getRoot().setClickable(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt() {
        boolean z;
        C55251xgS c55251xgS = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        if (c55251xgS.getVisibility() == 0) {
            z = true;
        } else {
            AppCompatImageView appCompatImageView = this.OLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            if (appCompatImageView.getVisibility() != 0) {
                AppCompatImageView appCompatImageView2 = this.OLrzqt.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                if (appCompatImageView2.getVisibility() != 0) {
                    z = false;
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = this.OLrzqt.valueOf.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.goneEndMargin = z ? getContext().getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.QKVWgx) : 0;
            this.OLrzqt.valueOf.setLayoutParams(layoutParams2);
        }
    }
}
