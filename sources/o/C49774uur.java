package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import o.C49511upt;

/* JADX INFO: renamed from: o.uur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49774uur extends android.view.ViewGroup {
    public int AEQbTJ;
    public int EZpvd;
    public int KWHzl;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setItemSpacing(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLineSpacing(int i) {
        this.KWHzl = i;
    }

    public C49774uur(@androidx.annotation.NonNull android.content.Context context) {
        this(context, null);
    }

    public C49774uur(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C49774uur(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EZpvd(context, attributeSet);
    }

    public final void EZpvd(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C49511upt.Fragment.QbewEr, 0, 0);
        this.KWHzl = typedArrayObtainStyledAttributes.getDimensionPixelSize(C49511upt.Fragment.UeEOUB, 0);
        this.EZpvd = typedArrayObtainStyledAttributes.getDimensionPixelSize(C49511upt.Fragment.RJOkX, 0);
        this.OLrzqt = typedArrayObtainStyledAttributes.getBoolean(C49511upt.Fragment.QfsBiF, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setSingleLine(boolean z) {
        this.OLrzqt = z;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.EZpvd = i;
        requestLayout();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int i6 = paddingTop;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            android.view.View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i9 = i6;
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin;
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int i10 = paddingLeft2;
                if (paddingLeft2 + i4 + childAt.getMeasuredWidth() <= i5 - paddingRight || copydefault()) {
                    paddingLeft = i10;
                } else {
                    paddingLeft = getPaddingLeft();
                    i9 = paddingTop + this.KWHzl;
                }
                int measuredWidth = paddingLeft + i4 + childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth > i7) {
                    i7 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i4 + i3 + childAt.getMeasuredWidth() + this.EZpvd;
                if (i8 == getChildCount() - 1) {
                    i7 += i3;
                }
                paddingTop = i9 + measuredHeight;
                i6 = i9;
            }
        }
        setMeasuredDimension(copydefault(size, mode, i7 + getPaddingRight()), copydefault(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public static int copydefault(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return java.lang.Math.min(i3, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int marginEnd;
        int marginStart;
        if (getChildCount() == 0) {
            this.AEQbTJ = 0;
            return;
        }
        this.AEQbTJ = 1;
        boolean z2 = ViewCompat.getLayoutDirection(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i5 = (i3 - i) - paddingLeft;
        int measuredWidth = paddingRight;
        int i6 = paddingTop;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            android.view.View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(com.google.android.material.R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = MarginLayoutParamsCompat.getMarginStart(marginLayoutParams);
                    marginEnd = MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams);
                } else {
                    marginEnd = 0;
                    marginStart = 0;
                }
                int measuredWidth2 = childAt.getMeasuredWidth();
                if (!this.OLrzqt && measuredWidth + marginStart + measuredWidth2 > i5) {
                    paddingTop = this.KWHzl + i6;
                    this.AEQbTJ++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(com.google.android.material.R.id.row_index_key, java.lang.Integer.valueOf(this.AEQbTJ - 1));
                int i8 = measuredWidth + marginStart;
                int measuredWidth3 = childAt.getMeasuredWidth() + i8;
                int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                if (z2) {
                    childAt.layout(i5 - measuredWidth3, paddingTop, (i5 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(i8, paddingTop, measuredWidth3, measuredHeight);
                }
                measuredWidth += marginStart + marginEnd + childAt.getMeasuredWidth() + this.EZpvd;
                i6 = measuredHeight;
            }
        }
    }
}
