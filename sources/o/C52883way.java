package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.bumptech.glide.Glide;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.way, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52883way extends ConstraintLayout {
    public final int AEQbTJ;
    public int EZpvd;
    public AbstractC50874vcQ OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52883way(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52883way(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:23) call: o.way.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52883way(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52883way(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
        this.copydefault = C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
        this.AEQbTJ = C55298xhM.OLrzqt(16, context);
        AEQbTJ();
    }

    private final void AEQbTJ() {
        int i = this.EZpvd;
        int i2 = this.copydefault;
        setPaddingRelative(i, i2, i, i2);
        setBackground(C33070mpX.KWHzl(C48033uCm.ActionBar.AYXKKw));
        this.OLrzqt = (AbstractC50874vcQ) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.OUcgGI, this, true);
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC50874vcQ abstractC50874vcQ = this.OLrzqt;
        if (abstractC50874vcQ == null) {
            Intrinsics.gEmmrt("");
            abstractC50874vcQ = null;
        }
        abstractC50874vcQ.KWHzl.setText(str);
    }

    public static /* synthetic */ void setTitleIcon$default(C52883way c52883way, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c52883way.setTitleIcon(str);
    }

    public final void setTitleIcon(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(getContext());
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
        int i = this.AEQbTJ;
        C5335Nt<android.graphics.drawable.Drawable> c5335NtAEQbTJ = C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, str, "lfit", i, i);
        AbstractC50874vcQ abstractC50874vcQ = this.OLrzqt;
        if (abstractC50874vcQ == null) {
            Intrinsics.gEmmrt("");
            abstractC50874vcQ = null;
        }
        c5335NtAEQbTJ.EZpvd(abstractC50874vcQ.OLrzqt);
    }

    public final void setTitleIcon(java.lang.Integer num) {
        if (C33129mqd.OLrzqt((java.lang.Object) num, (java.lang.Object) 0) || num == null) {
            return;
        }
        int iIntValue = num.intValue();
        AbstractC50874vcQ abstractC50874vcQ = this.OLrzqt;
        if (abstractC50874vcQ == null) {
            Intrinsics.gEmmrt("");
            abstractC50874vcQ = null;
        }
        abstractC50874vcQ.OLrzqt.setImageDrawable(C33070mpX.KWHzl(iIntValue));
    }

    public final void setRightIcon(java.lang.Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            AbstractC50874vcQ abstractC50874vcQ = this.OLrzqt;
            if (abstractC50874vcQ == null) {
                Intrinsics.gEmmrt("");
                abstractC50874vcQ = null;
            }
            abstractC50874vcQ.copydefault.setImageDrawable(C33070mpX.KWHzl(iIntValue));
        }
    }

    public final void setRightIconVisible(boolean z) {
        AbstractC50874vcQ abstractC50874vcQ = this.OLrzqt;
        if (abstractC50874vcQ == null) {
            Intrinsics.gEmmrt("");
            abstractC50874vcQ = null;
        }
        AppCompatImageView appCompatImageView = abstractC50874vcQ.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(z ? 0 : 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.way */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setRightIconClick$default(C52883way c52883way, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        c52883way.setRightIconClick(function0);
    }

    public final void setRightIconClick(Function0<Unit> function0) {
        AbstractC50874vcQ abstractC50874vcQ = this.OLrzqt;
        if (abstractC50874vcQ == null) {
            Intrinsics.gEmmrt("");
            abstractC50874vcQ = null;
        }
        AppCompatImageView appCompatImageView = abstractC50874vcQ.copydefault;
        appCompatImageView.setOnClickListener(new StateListAnimator(appCompatImageView, 1000L, function0));
    }

    public final void setPaddingV(int i) {
        setPaddingRelative(C55298xhM.dp2px$default(8.0f, null, 1, null), i, 0, i);
    }

    /* JADX INFO: renamed from: o.way$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function0 function0 = this.AEQbTJ;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
