package o;

import androidx.core.widget.ImageViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kLj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28005kLj extends android.widget.FrameLayout {
    public static final int OLrzqt = C54989xbV.KWHzl;
    public final C54989xbV KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28005kLj(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28005kLj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:15) call: o.kLj.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28005kLj(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28005kLj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C54989xbV c54989xbV = new C54989xbV(context, attributeSet, i);
        this.KWHzl = c54989xbV;
        addView(c54989xbV);
        EZpvd();
    }

    public final android.widget.TextView copydefault() {
        return this.KWHzl.EZpvd();
    }

    public final android.widget.ImageView OLrzqt() {
        return this.KWHzl.OLrzqt();
    }

    public final android.widget.ImageView KWHzl() {
        return this.KWHzl.AEQbTJ();
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.EZpvd().setText(str);
    }

    public final void EZpvd() {
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        copydefault().setTextAppearance(C52761wXj.LoaderManager.QOLQEE);
        copydefault().setTextColor(iCopydefault);
        ImageViewCompat.setImageTintList(OLrzqt(), android.content.res.ColorStateList.valueOf(iCopydefault));
        ImageViewCompat.setImageTintList(KWHzl(), android.content.res.ColorStateList.valueOf(iCopydefault));
    }
}
