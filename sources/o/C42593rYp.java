package o;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.Intrinsics;
import o.rXV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rYp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42593rYp extends AppCompatImageView {
    public android.graphics.drawable.Drawable OLrzqt;
    public boolean copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42593rYp(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt(context, null, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42593rYp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42593rYp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt(context, attributeSet, i);
    }

    private final void OLrzqt(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, rXV.Activity.copydefault, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setTaggedDrawable(typedArrayObtainStyledAttributes.getDrawable(rXV.Activity.EZpvd));
        setFitPadding(typedArrayObtainStyledAttributes.getBoolean(rXV.Activity.KWHzl, false));
    }

    public final void setFitPadding(boolean z) {
        this.copydefault = z;
        invalidate();
    }

    public final void setTaggedDrawable(android.graphics.drawable.Drawable drawable) {
        this.OLrzqt = drawable;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        android.graphics.drawable.Drawable drawable = this.OLrzqt;
        if (drawable != null) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int paddingBottom = getPaddingBottom();
            int height = getHeight() - intrinsicHeight;
            int i = intrinsicHeight + height;
            int width = getWidth() - intrinsicWidth;
            int paddingEnd = intrinsicWidth + width;
            if (this.copydefault) {
                height -= paddingBottom;
                i -= paddingBottom;
                width -= getPaddingEnd();
                paddingEnd -= getPaddingEnd();
            }
            drawable.setBounds(width, height, paddingEnd, i);
            drawable.draw(canvas);
        }
    }
}
