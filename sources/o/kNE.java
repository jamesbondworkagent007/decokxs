package o;

import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.Glide;
import com.just.agentweb.DefaultWebClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kNE extends android.widget.FrameLayout {
    public C28072kNw AEQbTJ;
    public int EZpvd;
    public AbstractC5449Sd<android.graphics.drawable.Drawable> KWHzl;
    public int OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kNE(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kNE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:16) call: o.kNE.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ kNE(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kNE(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.kNF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kNE.OLrzqt(context);
            }
        });
        this.OLrzqt = C52761wXj.LoaderManager.QUSxYX;
        this.EZpvd = C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C23274hvD.LoaderManager.dNCPSb, i, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            try {
                this.OLrzqt = typedArrayObtainStyledAttributes.getResourceId(C23274hvD.LoaderManager.RcXXUw, C52761wXj.LoaderManager.QUSxYX);
                this.EZpvd = typedArrayObtainStyledAttributes.getDimensionPixelSize(C23274hvD.LoaderManager.aKErDB, C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        KWHzl().setTextAppearance(this.OLrzqt);
        KWHzl().setMaxLines(1);
        int iDpInt$default = C55298xhM.dpInt$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        int i2 = iDpInt$default * 2;
        KWHzl().setPaddingRelative(i2, iDpInt$default, i2, iDpInt$default);
        KWHzl().setCompoundDrawablePadding(iDpInt$default);
        KWHzl().setGravity(16);
        KWHzl().setIncludeFontPadding(false);
        KWHzl().setBackground(C25386ivj.generateSolidBackground$default(C55298xhM.dpInt$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null), java.lang.Integer.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.invokespecialDPHOMC)), 0.0f, null, 12, null));
        addView(KWHzl(), -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatTextView KWHzl() {
        return (AppCompatTextView) this.copydefault.getValue();
    }

    public static final AppCompatTextView OLrzqt(android.content.Context context) {
        return new AppCompatTextView(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.KWHzl = null;
    }

    public final void EZpvd(@NotNull C28072kNw c28072kNw) {
        Intrinsics.checkNotNullParameter(c28072kNw, "");
        this.AEQbTJ = c28072kNw;
        KWHzl().setText(c28072kNw.valueOf());
        if (copydefault(c28072kNw.KWHzl()) || c28072kNw.AEQbTJ() != null) {
            KWHzl(c28072kNw.KWHzl(), c28072kNw.AEQbTJ(), c28072kNw.copydefault());
        }
    }

    public static /* synthetic */ void setTagPadding$default(kNE kne, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        kne.setTagPadding(num, num2, num3, num4);
    }

    public final void setTagPadding(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
        KWHzl().setPaddingRelative(num != null ? num.intValue() : KWHzl().getPaddingStart(), num2 != null ? num2.intValue() : KWHzl().getPaddingTop(), num3 != null ? num3.intValue() : KWHzl().getPaddingEnd(), num4 != null ? num4.intValue() : KWHzl().getPaddingBottom());
    }

    public final void setTagBackground(android.graphics.drawable.Drawable drawable) {
        KWHzl().setBackground(drawable);
    }

    public static final class StateListAnimator extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
        public final /* synthetic */ android.graphics.drawable.Drawable AEQbTJ;
        public final /* synthetic */ java.lang.Integer OLrzqt;

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
        }

        public StateListAnimator(java.lang.Integer num, android.graphics.drawable.Drawable drawable) {
            this.OLrzqt = num;
            this.AEQbTJ = drawable;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            drawable.setBounds(0, 0, kNE.this.EZpvd, kNE.this.EZpvd);
            java.lang.Integer num = this.OLrzqt;
            if (num != null) {
                drawable.setTint(C25382ivf.KWHzl(num.intValue()));
            }
            kNE.this.KWHzl().setCompoundDrawablesRelative(drawable, null, null, null);
        }

        @Override // o.AbstractC5449Sd, o.InterfaceC5462Sq
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            android.graphics.drawable.Drawable drawable2 = this.AEQbTJ;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, kNE.this.EZpvd, kNE.this.EZpvd);
            }
            kNE.this.KWHzl().setCompoundDrawablesRelative(this.AEQbTJ, null, null, null);
        }
    }

    public final void KWHzl(java.lang.String str, android.graphics.drawable.Drawable drawable, java.lang.Integer num) {
        this.KWHzl = new StateListAnimator(num, drawable);
        C5335Nt<android.graphics.drawable.Drawable> c5335NtCopydefault = Glide.AEQbTJ(getContext()).AEQbTJ().copydefault(str);
        AbstractC5449Sd<android.graphics.drawable.Drawable> abstractC5449Sd = this.KWHzl;
        Intrinsics.copydefault(abstractC5449Sd);
        c5335NtCopydefault.OLrzqt(abstractC5449Sd);
    }

    public final boolean copydefault(java.lang.String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return false;
        }
        return C59449zhJ.startsWith$default(str, DefaultWebClient.HTTP_SCHEME, false, 2, null) || C59449zhJ.startsWith$default(str, DefaultWebClient.HTTPS_SCHEME, false, 2, null);
    }
}
