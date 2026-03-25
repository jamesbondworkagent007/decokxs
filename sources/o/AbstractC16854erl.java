package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountDetailUIBean;

/* JADX INFO: renamed from: o.erl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16854erl extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.ImageView EZpvd;
    public final ShapeableImageView KWHzl;

    @Bindable
    public EscapeAccountDetailUIBean OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final ConstraintLayout gEmmrt;

    public AbstractC16854erl(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, ShapeableImageView shapeableImageView, android.widget.ImageView imageView, ConstraintLayout constraintLayout, android.widget.TextView textView2, ConstraintLayout constraintLayout2, android.widget.TextView textView3, android.widget.TextView textView4) {
        super(obj, view, i);
        this.AEQbTJ = textView;
        this.KWHzl = shapeableImageView;
        this.EZpvd = imageView;
        this.copydefault = constraintLayout;
        this.AYXKKw = textView2;
        this.gEmmrt = constraintLayout2;
        this.AhwBna = textView3;
        this.djBIcL = textView4;
    }
}
