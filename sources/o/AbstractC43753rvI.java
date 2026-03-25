package o;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: renamed from: o.rvI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC43753rvI extends ViewDataBinding {
    public final android.widget.Button AEQbTJ;
    public final android.widget.FrameLayout AYXKKw;
    public final ShapeableImageView EZpvd;
    public final android.widget.ImageButton KWHzl;
    public final RecyclerView OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;

    public AbstractC43753rvI(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, android.widget.ImageButton imageButton, android.widget.Button button, RecyclerView recyclerView, ShapeableImageView shapeableImageView, android.widget.FrameLayout frameLayout2, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.copydefault = frameLayout;
        this.KWHzl = imageButton;
        this.AEQbTJ = button;
        this.OLrzqt = recyclerView;
        this.EZpvd = shapeableImageView;
        this.AYXKKw = frameLayout2;
        this.gEmmrt = textView;
        this.djBIcL = textView2;
    }
}
