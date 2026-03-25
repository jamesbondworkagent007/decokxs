package o;

import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: renamed from: o.mAn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C31696mAn extends AppCompatImageView {
    public ViewOnTouchListenerC31694mAl AEQbTJ;
    public ImageView.ScaleType EZpvd;

    public C31696mAn(android.content.Context context) {
        this(context, null);
    }

    public C31696mAn(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C31696mAn(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OLrzqt();
    }

    private void OLrzqt() {
        this.AEQbTJ = new ViewOnTouchListenerC31694mAl(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.EZpvd;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.EZpvd = null;
        }
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.AEQbTJ.isConnected();
    }

    @Override // android.widget.ImageView
    public android.graphics.Matrix getImageMatrix() {
        return this.AEQbTJ.gEmmrt();
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.AEQbTJ.copydefault(onLongClickListener);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.AEQbTJ.copydefault(onClickListener);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC31694mAl viewOnTouchListenerC31694mAl = this.AEQbTJ;
        if (viewOnTouchListenerC31694mAl == null) {
            this.EZpvd = scaleType;
        } else {
            viewOnTouchListenerC31694mAl.OLrzqt(scaleType);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC31694mAl viewOnTouchListenerC31694mAl = this.AEQbTJ;
        if (viewOnTouchListenerC31694mAl != null) {
            viewOnTouchListenerC31694mAl.AkhnZx();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        ViewOnTouchListenerC31694mAl viewOnTouchListenerC31694mAl = this.AEQbTJ;
        if (viewOnTouchListenerC31694mAl != null) {
            viewOnTouchListenerC31694mAl.AkhnZx();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC31694mAl viewOnTouchListenerC31694mAl = this.AEQbTJ;
        if (viewOnTouchListenerC31694mAl != null) {
            viewOnTouchListenerC31694mAl.AkhnZx();
        }
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.AEQbTJ.AkhnZx();
        }
        return frame;
    }

    public void setRotationTo(float f) {
        this.AEQbTJ.OLrzqt(f);
    }

    public void setRotationBy(float f) {
        this.AEQbTJ.KWHzl(f);
    }

    public void setZoomable(boolean z) {
        this.AEQbTJ.OLrzqt(z);
    }

    public float KWHzl() {
        return this.AEQbTJ.DbNXlk();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.AEQbTJ.KWHzl(z);
    }

    public void setMinimumScale(float f) {
        this.AEQbTJ.AEQbTJ(f);
    }

    public void setMediumScale(float f) {
        this.AEQbTJ.copydefault(f);
    }

    public void setMaximumScale(float f) {
        this.AEQbTJ.EZpvd(f);
    }

    public void setScaleLevels(float f, float f2, float f3) {
        this.AEQbTJ.KWHzl(f, f2, f3);
    }

    public void setOnMatrixChangeListener(InterfaceC31683mAa interfaceC31683mAa) {
        this.AEQbTJ.copydefault(interfaceC31683mAa);
    }

    public void setOnPhotoTapListener(InterfaceC31691mAi interfaceC31691mAi) {
        this.AEQbTJ.EZpvd(interfaceC31691mAi);
    }

    public void setOnOutsidePhotoTapListener(InterfaceC31692mAj interfaceC31692mAj) {
        this.AEQbTJ.OLrzqt(interfaceC31692mAj);
    }

    public void setOnViewTapListener(InterfaceC31693mAk interfaceC31693mAk) {
        this.AEQbTJ.EZpvd(interfaceC31693mAk);
    }

    public void setOnViewDragListener(InterfaceC31688mAf interfaceC31688mAf) {
        this.AEQbTJ.copydefault(interfaceC31688mAf);
    }

    public void setScale(float f) {
        this.AEQbTJ.valueOf(f);
    }

    public void setScale(float f, boolean z) {
        this.AEQbTJ.copydefault(f, z);
    }

    public void setScale(float f, float f2, float f3, boolean z) {
        this.AEQbTJ.EZpvd(f, f2, f3, z);
    }

    public void setZoomTransitionDuration(int i) {
        this.AEQbTJ.copydefault(i);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.AEQbTJ.OLrzqt(onDoubleTapListener);
    }

    public void setOnScaleChangeListener(InterfaceC31690mAh interfaceC31690mAh) {
        this.AEQbTJ.KWHzl(interfaceC31690mAh);
    }

    public void setOnSingleFlingListener(InterfaceC31689mAg interfaceC31689mAg) {
        this.AEQbTJ.AEQbTJ(interfaceC31689mAg);
    }
}
