package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.edit.OKEditText;

/* JADX INFO: renamed from: o.ryu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC43950ryu extends ViewDataBinding {
    public final AppCompatImageView AEQbTJ;

    @Bindable
    public rIB AYXKKw;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.TextView copydefault;
    public final OKEditText gEmmrt;

    public AbstractC43950ryu(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, OKEditText oKEditText) {
        super(obj, view, i);
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = appCompatImageView;
        this.KWHzl = textView;
        this.copydefault = textView2;
        this.EZpvd = textView3;
        this.gEmmrt = oKEditText;
    }
}
