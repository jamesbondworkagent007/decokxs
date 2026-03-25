package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.okimcore.model.remote.RelationInfo;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nNW extends ViewDataBinding {
    public final wYK AEQbTJ;

    @Bindable
    public RelationInfo AYXKKw;

    @Bindable
    public boolean AhwBna;

    @Bindable
    public boolean EZpvd;
    public final C35893oHp KWHzl;
    public final Barrier OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    public abstract void EZpvd(boolean z);

    public abstract void copydefault(boolean z);

    public nNW(java.lang.Object obj, android.view.View view, int i, Barrier barrier, wYK wyk, ConstraintLayout constraintLayout, C35893oHp c35893oHp, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.OLrzqt = barrier;
        this.AEQbTJ = wyk;
        this.copydefault = constraintLayout;
        this.KWHzl = c35893oHp;
        this.valueOf = textView;
        this.gEmmrt = textView2;
        this.djBIcL = textView3;
    }
}
