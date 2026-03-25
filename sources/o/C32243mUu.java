package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mUu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32243mUu extends ConstraintLayout {
    public final C36085oOs copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32243mUu(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:21) call: o.mUu.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C32243mUu(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32243mUu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C36085oOs c36085oOsEZpvd = C36085oOs.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c36085oOsEZpvd, "");
        this.copydefault = c36085oOsEZpvd;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C35964oKf.PendingIntent.AEQbTJ);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            float dimension = typedArrayObtainStyledAttributes.getDimension(C35964oKf.PendingIntent.EZpvd, 22.0f);
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(C35964oKf.PendingIntent.djBIcL, 11.0f);
            float dimension3 = typedArrayObtainStyledAttributes.getDimension(C35964oKf.PendingIntent.KWHzl, 11.0f);
            OLrzqt(C33129mqd.AhwBna(java.lang.Float.valueOf(dimension)));
            KWHzl(C33129mqd.AhwBna(java.lang.Float.valueOf(dimension2)));
            AEQbTJ(C33129mqd.AhwBna(java.lang.Float.valueOf(dimension3)));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final void OLrzqt(int i) {
        ViewGroup.LayoutParams layoutParams = this.copydefault.copydefault.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.copydefault.copydefault.setLayoutParams(layoutParams);
    }

    private final void KWHzl(int i) {
        ViewGroup.LayoutParams layoutParams = this.copydefault.OLrzqt.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.copydefault.OLrzqt.setLayoutParams(layoutParams);
    }

    private final void AEQbTJ(int i) {
        ViewGroup.LayoutParams layoutParams = this.copydefault.OLrzqt.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.circleRadius = i;
        this.copydefault.OLrzqt.setLayoutParams(layoutParams2);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AppCompatImageView appCompatImageView = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        int i = C52761wXj.Activity.fZc;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        mUL.EZpvd(appCompatImageView, str, new mUJ(null, null, 0.0f, mUM.EZpvd(i, context), 7, null));
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AppCompatImageView appCompatImageView = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        int i = C52761wXj.Activity.fZc;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        mUL.EZpvd(appCompatImageView, str, new mUJ(null, null, 0.0f, mUM.EZpvd(i, context), 7, null));
    }
}
