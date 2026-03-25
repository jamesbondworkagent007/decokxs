package com.bytedance.bdtracker;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* JADX INFO: loaded from: classes2.dex */
public class q0 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f244a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q0(Drawable drawable) {
        Drawable drawable2 = this.f244a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f244a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable drawable = this.f244a;
        return drawable != null ? drawable.getCurrent() : this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f244a;
        return drawable != null ? drawable.getIntrinsicHeight() : super.getIntrinsicHeight();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f244a;
        return drawable != null ? drawable.getIntrinsicWidth() : super.getIntrinsicWidth();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawable = this.f244a;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawable = this.f244a;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        Drawable drawable = this.f244a;
        return drawable != null ? drawable.getState() : StateSet.WILD_CARD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            drawable.setTint(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f244a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
