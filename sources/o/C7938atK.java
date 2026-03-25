package o;

/* JADX INFO: renamed from: o.atK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7938atK extends android.view.ViewGroup {
    public float EZpvd;
    public float copydefault;

    public final float EZpvd(int i, float f) {
        if (i == 0) {
            return f;
        }
        return (((int) ((f * r2) + 0.5f)) * 1.0f) / i;
    }

    public C7938atK(android.content.Context context) {
        super(context);
        this.copydefault = 1.0f;
        this.EZpvd = 1.0f;
    }

    public C7938atK(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.copydefault = 1.0f;
        this.EZpvd = 1.0f;
    }

    public C7938atK(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.copydefault = 1.0f;
        this.EZpvd = 1.0f;
    }

    public C7938atK(android.view.View view) {
        super(view.getContext());
        this.copydefault = 1.0f;
        this.EZpvd = 1.0f;
        addView(view);
    }

    public void setChildScale(float f, float f2) {
        this.copydefault = f;
        this.EZpvd = f2;
        if (isInLayout()) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            measureChild(childAt, i, i2);
            iMax = java.lang.Math.max(iMax, (int) (childAt.getMeasuredWidth() * EZpvd(childAt.getMeasuredWidth(), this.copydefault)));
            iMax2 = java.lang.Math.max(iMax2, (int) (childAt.getMeasuredHeight() * EZpvd(childAt.getMeasuredHeight(), this.EZpvd)));
        }
        setMeasuredDimension(iMax, iMax2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(i5);
            float fEZpvd = EZpvd(childAt.getMeasuredWidth(), this.copydefault);
            float fEZpvd2 = EZpvd(childAt.getMeasuredHeight(), this.EZpvd);
            childAt.setPivotX(0.0f);
            childAt.setPivotY(0.0f);
            childAt.setScaleX(fEZpvd);
            childAt.setScaleY(fEZpvd2);
            childAt.layout(0, 0, (int) (childAt.getMeasuredWidth() * fEZpvd), (int) (childAt.getMeasuredHeight() * fEZpvd2));
        }
    }
}
