package o;

import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class tUE extends AppCompatTextView {
    public float AEQbTJ;
    public float AYXKKw;
    public int EZpvd;
    public float KWHzl;
    public final android.util.AttributeSet OLrzqt;
    public boolean copydefault;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUE(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:15) call: o.tUE.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ tUE(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tUE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = attributeSet;
        this.copydefault = true;
        AEQbTJ();
        copydefault();
    }

    private final void AEQbTJ() {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(this.OLrzqt, C47501trL.FragmentManager.djBIcL);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.KWHzl = typedArrayObtainStyledAttributes.getDimensionPixelSize(C47501trL.FragmentManager.values, 0);
        this.AEQbTJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(C47501trL.FragmentManager.gEmmrt, 0);
        this.copydefault = typedArrayObtainStyledAttributes.getBoolean(C47501trL.FragmentManager.isConnected, true);
        this.AYXKKw = typedArrayObtainStyledAttributes.getDimension(C47501trL.FragmentManager.DbNXlk, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        if (this.AYXKKw > 0.0f) {
            setBackground(new MaterialShapeDrawable(ShapeAppearanceModel.builder().setAllCorners(new RoundedCornerTreatment()).setAllCornerSizes(this.AYXKKw).build()));
        }
    }

    public static /* synthetic */ void setDrawableSize$default(tUE tue, float f, float f2, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDrawableSize");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        tue.setDrawableSize(f, f2, z);
    }

    public final void setDrawableSize(float f, float f2, boolean z) {
        this.KWHzl = f;
        this.AEQbTJ = f2;
        this.copydefault = z;
        copydefault();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.valueOf = i;
        this.EZpvd = i2;
        copydefault();
    }

    public final void copydefault() {
        if (this.KWHzl == 0.0f && this.AEQbTJ == 0.0f) {
            AEQbTJ();
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "");
        if (this.KWHzl > 0.0f || this.AEQbTJ > 0.0f) {
            for (android.graphics.drawable.Drawable drawable : compoundDrawablesRelative) {
                if (drawable != null) {
                    android.graphics.Rect bounds = drawable.getBounds();
                    Intrinsics.checkNotNullExpressionValue(bounds, "");
                    float fHeight = bounds.height() / bounds.width();
                    float fWidth = bounds.width();
                    float fHeight2 = bounds.height();
                    float f = this.KWHzl;
                    if (f > 0.0f && fWidth > f) {
                        fHeight2 = f * fHeight;
                        fWidth = f;
                    }
                    float f2 = this.AEQbTJ;
                    if (f2 > 0.0f && fHeight2 > f2) {
                        fWidth = f2 / fHeight;
                        fHeight2 = f2;
                    }
                    bounds.right = bounds.left + yII.EZpvd(fWidth);
                    bounds.bottom = bounds.top + yII.EZpvd(fHeight2);
                    drawable.setBounds(bounds);
                }
            }
        }
        android.graphics.drawable.Drawable drawable2 = compoundDrawablesRelative[0];
        if (drawable2 != null) {
            Intrinsics.checkNotNullExpressionValue(drawable2, "");
            setDrawable(drawable2, 0);
        }
        android.graphics.drawable.Drawable drawable3 = compoundDrawablesRelative[1];
        if (drawable3 != null) {
            Intrinsics.checkNotNullExpressionValue(drawable3, "");
            setDrawable(drawable3, 1);
        }
        android.graphics.drawable.Drawable drawable4 = compoundDrawablesRelative[2];
        if (drawable4 != null) {
            Intrinsics.checkNotNullExpressionValue(drawable4, "");
            setDrawable(drawable4, 2);
        }
        android.graphics.drawable.Drawable drawable5 = compoundDrawablesRelative[3];
        if (drawable5 != null) {
            Intrinsics.checkNotNullExpressionValue(drawable5, "");
            setDrawable(drawable5, 3);
        }
        setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setDrawable(android.graphics.drawable.Drawable drawable, int i) {
        int lineHeight;
        int i2;
        int i3;
        int i4 = 0;
        if (i == 0) {
            lineHeight = this.copydefault ? 0 : (((-getLineCount()) * getLineHeight()) / 2) + (getLineHeight() / 2);
            i2 = (int) this.KWHzl;
            i3 = (int) (lineHeight + this.AEQbTJ);
        } else if (i == 1) {
            int i5 = this.copydefault ? 0 : (int) (((-this.valueOf) / 2) + (this.KWHzl / 2));
            i2 = (int) (i5 + this.KWHzl);
            i3 = (int) (0 + this.AEQbTJ);
            i4 = i5;
            lineHeight = 0;
        } else if (i != 2) {
            lineHeight = 0;
            i2 = 0;
            i3 = 0;
        }
        drawable.setBounds(i4, lineHeight, i2, i3);
    }
}
