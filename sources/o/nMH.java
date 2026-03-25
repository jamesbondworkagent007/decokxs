package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.okimcore.model.im.OKImageMessage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nMH extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final ShapeableImageView KWHzl;
    public final C55113xdn OLrzqt;
    public final android.widget.FrameLayout copydefault;

    @Bindable
    public OKImageMessage valueOf;

    public nMH(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView, android.widget.ImageView imageView2, ShapeableImageView shapeableImageView, C55113xdn c55113xdn) {
        super(obj, view, i);
        this.copydefault = frameLayout;
        this.AEQbTJ = imageView;
        this.EZpvd = imageView2;
        this.KWHzl = shapeableImageView;
        this.OLrzqt = c55113xdn;
    }
}
