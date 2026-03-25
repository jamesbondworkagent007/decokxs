package o;

import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.okinc.auth.impl.widget.SimpleToolBar;
import com.okinc.uilab.edit.OKEditText;

/* JADX INFO: renamed from: o.azy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8294azy extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final FragmentContainerView AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final SimpleToolBar EZpvd;
    public final C52794wYp KWHzl;
    public final OKEditText OLrzqt;
    public final C55008xbo copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final C6695aUG valueOf;

    public AbstractC8294azy(java.lang.Object obj, android.view.View view, int i, SimpleToolBar simpleToolBar, C52794wYp c52794wYp, C55008xbo c55008xbo, OKEditText oKEditText, android.widget.ImageView imageView, android.widget.LinearLayout linearLayout, FragmentContainerView fragmentContainerView, C6695aUG c6695aUG, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.EZpvd = simpleToolBar;
        this.KWHzl = c52794wYp;
        this.copydefault = c55008xbo;
        this.OLrzqt = oKEditText;
        this.AEQbTJ = imageView;
        this.AhwBna = linearLayout;
        this.AYXKKw = fragmentContainerView;
        this.valueOf = c6695aUG;
        this.djBIcL = textView;
        this.gEmmrt = textView2;
    }
}
