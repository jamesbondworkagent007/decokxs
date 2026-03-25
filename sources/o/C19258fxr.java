package o;

import android.graphics.drawable.GradientDrawable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.just.agentweb.DefaultWebClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19258fxr extends android.widget.FrameLayout {
    public int AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public int KWHzl;
    public AbstractC5449Sd<android.graphics.drawable.Drawable> OLrzqt;
    public C18985fsj copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19258fxr(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19258fxr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.fxr.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C19258fxr(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19258fxr(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.fxo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19258fxr.EZpvd(context);
            }
        });
        this.AEQbTJ = C52761wXj.LoaderManager.QUSxYX;
        this.KWHzl = C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13754dXa.PendingIntent.zLjUOn, i, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            try {
                this.AEQbTJ = typedArrayObtainStyledAttributes.getResourceId(C13754dXa.PendingIntent.gHZMYf, C52761wXj.LoaderManager.QUSxYX);
                this.KWHzl = typedArrayObtainStyledAttributes.getDimensionPixelSize(C13754dXa.PendingIntent.AuCTelauCTel, C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        copydefault().setTextAppearance(this.AEQbTJ);
        copydefault().setMaxLines(1);
        int iDpInt$default = C55298xhM.dpInt$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        int i2 = iDpInt$default * 2;
        copydefault().setPaddingRelative(i2, iDpInt$default, i2, iDpInt$default);
        copydefault().setCompoundDrawablePadding(iDpInt$default);
        copydefault().setGravity(16);
        copydefault().setBackground(generateSolidBackground$default(this, C55298xhM.dpInt$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null), java.lang.Integer.valueOf(ContextCompat.getColor(context, C52761wXj.Activity.invokespecialDPHOMC)), 0.0f, null, 12, null));
        addView(copydefault(), -1, -1);
    }

    public static final AppCompatTextView EZpvd(android.content.Context context) {
        return new AppCompatTextView(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatTextView copydefault() {
        return (AppCompatTextView) this.EZpvd.getValue();
    }

    public static /* synthetic */ android.graphics.drawable.Drawable generateSolidBackground$default(C19258fxr c19258fxr, int i, java.lang.Integer num, float f, java.lang.Integer num2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            f = 0.0f;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        return c19258fxr.copydefault(i, num, f, num2);
    }

    public final android.graphics.drawable.Drawable copydefault(int i, @androidx.annotation.ColorInt java.lang.Integer num, float f, @androidx.annotation.ColorInt java.lang.Integer num2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C55298xhM.dpInt$default(i, (android.content.Context) null, 1, (java.lang.Object) null));
        if (num != null) {
            gradientDrawable.setColor(android.content.res.ColorStateList.valueOf(num.intValue()));
        }
        if (f > 0.0f && num2 != null) {
            gradientDrawable.setStroke(C55298xhM.dpInt$default(f, (android.content.Context) null, 1, (java.lang.Object) null), num2.intValue());
        }
        return gradientDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.OLrzqt = null;
    }

    public final void OLrzqt(@NotNull C18985fsj c18985fsj) {
        Intrinsics.checkNotNullParameter(c18985fsj, "");
        this.copydefault = c18985fsj;
        copydefault().setText(c18985fsj.EZpvd());
        if (EZpvd(c18985fsj.OLrzqt()) || c18985fsj.KWHzl() != null) {
            OLrzqt(c18985fsj.OLrzqt(), c18985fsj.KWHzl(), c18985fsj.AEQbTJ());
        }
    }

    /* JADX INFO: renamed from: o.fxr$TaskDescription */
    public static final class TaskDescription extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
        public final /* synthetic */ android.graphics.drawable.Drawable KWHzl;
        public final /* synthetic */ java.lang.Integer OLrzqt;

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
        }

        public TaskDescription(java.lang.Integer num, android.graphics.drawable.Drawable drawable) {
            this.OLrzqt = num;
            this.KWHzl = drawable;
        }

        @Override // o.InterfaceC5462Sq
        public /* bridge */ /* synthetic */ void copydefault(java.lang.Object obj, InterfaceC5460So interfaceC5460So) {
            copydefault((android.graphics.drawable.Drawable) obj, (InterfaceC5460So<? super android.graphics.drawable.Drawable>) interfaceC5460So);
        }

        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            drawable.setBounds(0, 0, C19258fxr.this.KWHzl, C19258fxr.this.KWHzl);
            java.lang.Integer num = this.OLrzqt;
            if (num != null) {
                C19258fxr c19258fxr = C19258fxr.this;
                drawable.setTint(ContextCompat.getColor(c19258fxr.getContext(), num.intValue()));
            }
            C19258fxr.this.copydefault().setCompoundDrawablesRelative(drawable, null, null, null);
        }

        @Override // o.AbstractC5449Sd, o.InterfaceC5462Sq
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            android.graphics.drawable.Drawable drawable2 = this.KWHzl;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, C19258fxr.this.KWHzl, C19258fxr.this.KWHzl);
            }
            C19258fxr.this.copydefault().setCompoundDrawablesRelative(this.KWHzl, null, null, null);
        }
    }

    public final void OLrzqt(java.lang.String str, android.graphics.drawable.Drawable drawable, java.lang.Integer num) {
        this.OLrzqt = new TaskDescription(num, drawable);
        C5335Nt<android.graphics.drawable.Drawable> c5335NtCopydefault = Glide.AEQbTJ(getContext()).AEQbTJ().copydefault(str);
        AbstractC5449Sd<android.graphics.drawable.Drawable> abstractC5449Sd = this.OLrzqt;
        Intrinsics.copydefault(abstractC5449Sd);
        c5335NtCopydefault.OLrzqt(abstractC5449Sd);
    }

    public final boolean EZpvd(java.lang.String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return false;
        }
        return C59449zhJ.startsWith$default(str, DefaultWebClient.HTTP_SCHEME, false, 2, null) || C59449zhJ.startsWith$default(str, DefaultWebClient.HTTPS_SCHEME, false, 2, null);
    }
}
