package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import o.C57669yml;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mPJ extends ViewDataBinding {
    public final android.widget.CheckBox AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final Barrier AhwBna;

    @Bindable
    public C57669yml.ActionBar EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.view.View OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.view.View gEmmrt;

    public abstract void KWHzl(@androidx.annotation.Nullable C57669yml.ActionBar actionBar);

    public mPJ(java.lang.Object obj, android.view.View view, int i, android.widget.CheckBox checkBox, android.widget.TextView textView, android.view.View view2, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, Barrier barrier, android.view.View view3) {
        super(obj, view, i);
        this.AEQbTJ = checkBox;
        this.copydefault = textView;
        this.OLrzqt = view2;
        this.KWHzl = textView2;
        this.djBIcL = textView3;
        this.AYXKKw = textView4;
        this.AhwBna = barrier;
        this.gEmmrt = view3;
    }
}
