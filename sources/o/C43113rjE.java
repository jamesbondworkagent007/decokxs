package o;

import android.graphics.drawable.DrawableWrapper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rjE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43113rjE extends DrawableWrapper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43113rjE(@NotNull android.graphics.drawable.Drawable drawable) {
        super(drawable);
        Intrinsics.checkNotNullParameter(drawable, "");
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable == null) {
            return true;
        }
        drawable.setLayoutDirection(i);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        android.graphics.drawable.Drawable drawable = getDrawable();
        return drawable != null && drawable.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        android.graphics.Rect bounds;
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable == null || (bounds = drawable.getBounds()) == null) {
            return 0;
        }
        return bounds.width();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        android.graphics.Rect bounds;
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable == null || (bounds = drawable.getBounds()) == null) {
            return 0;
        }
        return bounds.height();
    }
}
