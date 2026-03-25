package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.okimcore.model.remote.RelationInfo;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nLX extends ViewDataBinding {
    public final C35893oHp AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C52794wYp EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.widget.LinearLayout OLrzqt;

    @Bindable
    public RelationInfo copydefault;
    public final android.widget.TextView gEmmrt;

    public nLX(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, C52794wYp c52794wYp, C35893oHp c35893oHp, android.widget.LinearLayout linearLayout, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.KWHzl = constraintLayout;
        this.EZpvd = c52794wYp;
        this.AEQbTJ = c35893oHp;
        this.OLrzqt = linearLayout;
        this.AYXKKw = textView;
        this.gEmmrt = textView2;
    }
}
