package cn.jzvd;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class JZTextureView extends TextureView {
    protected static final String TAG = "JZResizeTextureView";
    public int currentVideoHeight;
    public int currentVideoWidth;

    public JZTextureView(Context context) {
        super(context);
        this.currentVideoWidth = 0;
        this.currentVideoHeight = 0;
    }

    public JZTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.currentVideoWidth = 0;
        this.currentVideoHeight = 0;
    }

    public void setVideoSize(int i, int i2) {
        if (this.currentVideoWidth == i && this.currentVideoHeight == i2) {
            return;
        }
        this.currentVideoWidth = i;
        this.currentVideoHeight = i2;
        requestLayout();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        if (f != getRotation()) {
            super.setRotation(f);
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        hashCode();
        int rotation = (int) getRotation();
        int i5 = this.currentVideoWidth;
        int i6 = this.currentVideoHeight;
        int measuredHeight = ((View) getParent()).getMeasuredHeight();
        int measuredWidth = ((View) getParent()).getMeasuredWidth();
        if (measuredWidth != 0 && measuredHeight != 0 && i5 != 0 && i6 != 0 && Jzvd.VIDEO_IMAGE_DISPLAY_TYPE == 1) {
            if (rotation == 90 || rotation == 270) {
                measuredWidth = measuredHeight;
                measuredHeight = measuredWidth;
            }
            i6 = (i5 * measuredHeight) / measuredWidth;
        }
        if (rotation == 90 || rotation == 270) {
            i2 = i;
            i = i2;
        }
        int defaultSize = View.getDefaultSize(i5, i);
        int defaultSize2 = View.getDefaultSize(i6, i2);
        if (i5 > 0 && i6 > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            View.MeasureSpec.toString(i);
            View.MeasureSpec.toString(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i7 = i5 * size2;
                int i8 = size * i6;
                if (i7 < i8) {
                    i3 = i7 / i6;
                    defaultSize = i3;
                    defaultSize2 = size2;
                } else if (i7 > i8) {
                    i4 = i8 / i5;
                    defaultSize = size;
                    defaultSize2 = i4;
                } else {
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else if (mode == 1073741824) {
                i4 = (size * i6) / i5;
                if (mode2 == Integer.MIN_VALUE && i4 > size2) {
                    i3 = (size2 * i5) / i6;
                    defaultSize = i3;
                    defaultSize2 = size2;
                }
                defaultSize = size;
                defaultSize2 = i4;
            } else if (mode2 == 1073741824) {
                i3 = (size2 * i5) / i6;
                if (mode == Integer.MIN_VALUE && i3 > size) {
                    i4 = (size * i6) / i5;
                    defaultSize = size;
                    defaultSize2 = i4;
                }
                defaultSize = i3;
                defaultSize2 = size2;
            } else {
                if (mode2 != Integer.MIN_VALUE || i6 <= size2) {
                    i3 = i5;
                    size2 = i6;
                } else {
                    i3 = (size2 * i5) / i6;
                }
                if (mode == Integer.MIN_VALUE && i3 > size) {
                    i4 = (size * i6) / i5;
                    defaultSize = size;
                    defaultSize2 = i4;
                }
                defaultSize = i3;
                defaultSize2 = size2;
            }
        }
        if (measuredWidth == 0 || measuredHeight == 0 || i5 == 0 || i6 == 0) {
            i5 = defaultSize;
            i6 = defaultSize2;
        } else {
            int i9 = Jzvd.VIDEO_IMAGE_DISPLAY_TYPE;
            if (i9 != 3) {
                if (i9 == 2) {
                    if (rotation == 90 || rotation == 270) {
                        int i10 = measuredWidth;
                        measuredWidth = measuredHeight;
                        measuredHeight = i10;
                    }
                    double d = ((double) i6) / ((double) i5);
                    double d2 = measuredHeight;
                    double d3 = measuredWidth;
                    double d4 = d2 / d3;
                    if (d > d4) {
                        i6 = (int) ((d3 / ((double) defaultSize)) * ((double) defaultSize2));
                        i5 = measuredWidth;
                    } else if (d < d4) {
                        i5 = (int) ((d2 / ((double) defaultSize2)) * ((double) defaultSize));
                        i6 = measuredHeight;
                    }
                }
            }
        }
        setMeasuredDimension(i5, i6);
    }
}
