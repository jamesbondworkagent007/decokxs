package o;

import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.Glide;
import com.just.agentweb.DefaultWebClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nfP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34611nfP extends android.widget.FrameLayout {
    public AbstractC5449Sd<android.graphics.drawable.Drawable> AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public C34604nfI OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34611nfP(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34611nfP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.nfP.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C34611nfP(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34611nfP(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.nfQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34611nfP.copydefault(context);
            }
        });
        copydefault().setTextAppearance(C52761wXj.LoaderManager.QUSxYX);
        int iDpInt$default = C55298xhM.dpInt$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        int i2 = iDpInt$default * 2;
        copydefault().setPaddingRelative(i2, iDpInt$default, i2, iDpInt$default);
        copydefault().setCompoundDrawablePadding(iDpInt$default);
        copydefault().setBackground(mUL.generateSolidBackground$default(C55298xhM.dpInt$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null), java.lang.Integer.valueOf(Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_dark") ? C33070mpX.copydefault(C52761wXj.Activity.invokespecialaGOrKO) : C33070mpX.copydefault(C52761wXj.Activity.invokespecialRtjmuc)), 0.0f, null, 12, null));
        addView(copydefault(), -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatTextView copydefault() {
        return (AppCompatTextView) this.KWHzl.getValue();
    }

    public static final AppCompatTextView copydefault(android.content.Context context) {
        return new AppCompatTextView(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.AEQbTJ = null;
    }

    public final void AEQbTJ(@NotNull C34604nfI c34604nfI) {
        Intrinsics.checkNotNullParameter(c34604nfI, "");
        this.OLrzqt = c34604nfI;
        copydefault().setText(c34604nfI.gEmmrt());
        if (EZpvd(c34604nfI.OLrzqt()) || c34604nfI.copydefault() != null) {
            EZpvd(c34604nfI.OLrzqt(), c34604nfI.copydefault(), c34604nfI.KWHzl());
        }
    }

    /* JADX INFO: renamed from: o.nfP$ActionBar */
    public static final class ActionBar extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
        public final /* synthetic */ android.graphics.drawable.Drawable AEQbTJ;
        public final /* synthetic */ java.lang.Integer KWHzl;
        public final /* synthetic */ C34611nfP OLrzqt;
        public final int copydefault = C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null);

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
        }

        public ActionBar(java.lang.Integer num, C34611nfP c34611nfP, android.graphics.drawable.Drawable drawable) {
            this.KWHzl = num;
            this.OLrzqt = c34611nfP;
            this.AEQbTJ = drawable;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            int i = this.copydefault;
            drawable.setBounds(0, 0, i, i);
            java.lang.Integer num = this.KWHzl;
            if (num != null) {
                drawable.setTint(mUM.copydefault(num.intValue()));
            }
            this.OLrzqt.copydefault().setCompoundDrawablesRelative(drawable, null, null, null);
        }

        @Override // o.AbstractC5449Sd, o.InterfaceC5462Sq
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            android.graphics.drawable.Drawable drawable2 = this.AEQbTJ;
            if (drawable2 != null) {
                int i = this.copydefault;
                drawable2.setBounds(0, 0, i, i);
            }
            this.OLrzqt.copydefault().setCompoundDrawablesRelative(this.AEQbTJ, null, null, null);
        }
    }

    public final void EZpvd(java.lang.String str, android.graphics.drawable.Drawable drawable, java.lang.Integer num) {
        this.AEQbTJ = new ActionBar(num, this, drawable);
        C5335Nt<android.graphics.drawable.Drawable> c5335NtCopydefault = Glide.AEQbTJ(getContext()).AEQbTJ().copydefault(str);
        AbstractC5449Sd<android.graphics.drawable.Drawable> abstractC5449Sd = this.AEQbTJ;
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
