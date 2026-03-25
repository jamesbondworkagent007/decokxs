package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.edit.OKEditText;

/* JADX INFO: renamed from: o.eji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16427eji extends ViewDataBinding {
    public final C33537myN AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final OKEditText EZpvd;
    public final android.widget.ImageView KWHzl;
    public final RecyclerView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final AppCompatTextView djBIcL;

    public AbstractC16427eji(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, android.widget.ImageView imageView, RecyclerView recyclerView, OKEditText oKEditText, android.widget.ImageView imageView2, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.AEQbTJ = c33537myN;
        this.copydefault = imageView;
        this.OLrzqt = recyclerView;
        this.EZpvd = oKEditText;
        this.KWHzl = imageView2;
        this.AYXKKw = constraintLayout;
        this.djBIcL = appCompatTextView;
    }
}
