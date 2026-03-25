package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: renamed from: o.vbI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50813vbI extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final ShapeableImageView KWHzl;
    public final AppCompatTextView OLrzqt;

    public AbstractC50813vbI(java.lang.Object obj, android.view.View view, int i, ShapeableImageView shapeableImageView, AppCompatTextView appCompatTextView, android.widget.ImageView imageView, android.widget.TextView textView) {
        super(obj, view, i);
        this.KWHzl = shapeableImageView;
        this.OLrzqt = appCompatTextView;
        this.AEQbTJ = imageView;
        this.EZpvd = textView;
    }
}
