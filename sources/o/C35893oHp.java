package o;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.Intrinsics;
import o.C44105sDn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oHp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35893oHp extends AppCompatImageView {
    public boolean AEQbTJ;
    public android.graphics.drawable.Drawable OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35893oHp(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt(context, null, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35893oHp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35893oHp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt(context, attributeSet, i);
    }

    private final void OLrzqt(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C44105sDn.FragmentManager.valueOf, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setTaggedDrawable(typedArrayObtainStyledAttributes.getDrawable(C44105sDn.FragmentManager.AhwBna));
        setFitPadding(typedArrayObtainStyledAttributes.getBoolean(C44105sDn.FragmentManager.gEmmrt, false));
    }

    public final void setFitPadding(boolean z) {
        this.AEQbTJ = z;
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
            if (this.AEQbTJ) {
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
