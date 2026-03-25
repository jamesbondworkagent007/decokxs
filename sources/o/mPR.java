package o;

import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mPR extends ViewDataBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final RecyclerView EZpvd;
    public final CardView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.EditText copydefault;

    public mPR(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView, android.widget.EditText editText, CardView cardView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.AEQbTJ = frameLayout;
        this.OLrzqt = imageView;
        this.copydefault = editText;
        this.KWHzl = cardView;
        this.EZpvd = recyclerView;
    }
}
