package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jOY extends ConstraintLayout {
    public final hFY OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jOY(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:12) call: o.jOY.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ jOY(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jOY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hFY hfyKWHzl = hFY.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hfyKWHzl, "");
        this.OLrzqt = hfyKWHzl;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C23274hvD.LoaderManager.dvKsVJ);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            float dimension = typedArrayObtainStyledAttributes.getDimension(C23274hvD.LoaderManager.fvQaOB, 48.0f);
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(C23274hvD.LoaderManager.fZBcTu, 18.0f);
            float dimension3 = typedArrayObtainStyledAttributes.getDimension(C23274hvD.LoaderManager.flVtFt, 54.0f);
            float dimension4 = typedArrayObtainStyledAttributes.getDimension(C23274hvD.LoaderManager.gasjUx, 2.0f);
            KWHzl(C33129mqd.AhwBna(java.lang.Float.valueOf(dimension)));
            copydefault(C33129mqd.AhwBna(java.lang.Float.valueOf(dimension2)));
            setProgressBar(C33129mqd.AhwBna(java.lang.Float.valueOf(dimension3)), C33129mqd.AhwBna(java.lang.Float.valueOf(dimension4)));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final void KWHzl(int i) {
        ViewGroup.LayoutParams layoutParams = this.OLrzqt.AEQbTJ.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.OLrzqt.AEQbTJ.setLayoutParams(layoutParams);
    }

    private final void copydefault(int i) {
        ViewGroup.LayoutParams layoutParams = this.OLrzqt.EZpvd.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.OLrzqt.EZpvd.setLayoutParams(layoutParams);
    }

    public final void setProgressBar(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.OLrzqt.KWHzl.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.OLrzqt.KWHzl.setLayoutParams(layoutParams);
        CircularProgressIndicator circularProgressIndicator = this.OLrzqt.KWHzl;
        circularProgressIndicator.setTrackThickness(i2);
        circularProgressIndicator.setIndicatorSize(i);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AppCompatImageView appCompatImageView = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C25386ivj.loadCircleImage$default(appCompatImageView, str, false, 2, null);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AppCompatImageView appCompatImageView = this.OLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C25386ivj.loadCircleImage$default(appCompatImageView, str, false, 2, null);
    }

    public final void setProgress(int i) {
        this.OLrzqt.KWHzl.setProgress(i);
    }

    public final void setProgressBarRotation(float f) {
        this.OLrzqt.KWHzl.setRotation(f);
    }
}
