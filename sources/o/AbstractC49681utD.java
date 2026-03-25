package o;

import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.utD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49681utD extends ViewDataBinding {
    public final Guideline AEQbTJ;
    public final android.widget.TextView AhwBna;

    @Bindable
    public java.lang.String EZpvd;

    @Bindable
    public java.lang.String KWHzl;
    public final android.widget.TextView OLrzqt;

    @Bindable
    public boolean copydefault;

    public abstract void AEQbTJ(@androidx.annotation.Nullable java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.copydefault;
    }

    public abstract void KWHzl(boolean z);

    public abstract void OLrzqt(@androidx.annotation.Nullable java.lang.String str);

    public AbstractC49681utD(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, Guideline guideline, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = textView;
        this.AEQbTJ = guideline;
        this.AhwBna = textView2;
    }
}
