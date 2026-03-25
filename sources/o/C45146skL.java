package o;

import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.skL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45146skL extends AppCompatTextView {
    public final C55280xgv AEQbTJ;
    public final InterfaceC56387yDm KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45146skL(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45146skL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:15) call: o.skL.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C45146skL(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45146skL(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C55280xgv c55280xgv = new C55280xgv();
        c55280xgv.copydefault(true);
        c55280xgv.valueOf(C33070mpX.OLrzqt(C52761wXj.Activity.GcnicV, context));
        this.AEQbTJ = c55280xgv;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.skK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C45146skL.EZpvd(context));
            }
        });
        setCompoundDrawablePadding(C55298xhM.OLrzqt(4, context));
        setMaxLines(2);
        setEllipsize(TextUtils.TruncateAt.END);
        setTextAlignment(4);
        KWHzl();
    }

    private final int AEQbTJ() {
        return ((java.lang.Number) this.KWHzl.getValue()).intValue();
    }

    public static final int EZpvd(android.content.Context context) {
        return C33070mpX.OLrzqt(C52761wXj.Activity.zDGrpR, context);
    }

    public final C33579mzC copydefault(int i, android.content.Context context, int i2) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C33070mpX.EZpvd(i, context));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) objM7377constructorimpl;
        if (drawable == null) {
            return null;
        }
        C33579mzC c33579mzC = new C33579mzC(drawable, C55298xhM.OLrzqt(i2, context));
        c33579mzC.setTint(AEQbTJ());
        return c33579mzC;
    }

    public final void KWHzl() {
        int i = C52761wXj.TaskDescription.DGOPHZDGOPHZ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, copydefault(i, context, 16), (android.graphics.drawable.Drawable) null);
        setPaddingRelative(0, 0, 0, 0);
        C55280xgv c55280xgv = this.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c55280xgv.EZpvd(C55298xhM.AEQbTJ(4, context2)).OLrzqt(this);
        setTextAppearance(C52761wXj.LoaderManager.gHZMYf);
        setTextColor(AEQbTJ());
    }
}
