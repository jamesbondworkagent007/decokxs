package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.okimcore.model.im.OKImageMessage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nMA extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final ShapeableImageView OLrzqt;
    public final C55113xdn copydefault;

    @Bindable
    public OKImageMessage gEmmrt;

    public nMA(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView, android.widget.ImageView imageView2, ShapeableImageView shapeableImageView, C55113xdn c55113xdn) {
        super(obj, view, i);
        this.KWHzl = frameLayout;
        this.AEQbTJ = imageView;
        this.EZpvd = imageView2;
        this.OLrzqt = shapeableImageView;
        this.copydefault = c55113xdn;
    }
}
