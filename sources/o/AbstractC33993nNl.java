package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.okimcore.model.im.OKSightMessage;

/* JADX INFO: renamed from: o.nNl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33993nNl extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.FrameLayout EZpvd;

    @Bindable
    public OKSightMessage KWHzl;
    public final ShapeableImageView OLrzqt;
    public final android.widget.ImageView copydefault;

    public AbstractC33993nNl(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, android.widget.TextView textView, android.widget.ImageView imageView, ShapeableImageView shapeableImageView) {
        super(obj, view, i);
        this.EZpvd = frameLayout;
        this.AEQbTJ = textView;
        this.copydefault = imageView;
        this.OLrzqt = shapeableImageView;
    }
}
