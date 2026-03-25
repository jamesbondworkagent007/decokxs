package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.item.OKRegularCell;

/* JADX INFO: renamed from: o.eqc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16792eqc extends ViewDataBinding {
    public final LinearLayoutCompat EZpvd;
    public final android.widget.TextView KWHzl;
    public final OKRegularCell OLrzqt;
    public final android.widget.ImageView copydefault;

    public AbstractC16792eqc(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, LinearLayoutCompat linearLayoutCompat, OKRegularCell oKRegularCell, android.widget.TextView textView) {
        super(obj, view, i);
        this.copydefault = imageView;
        this.EZpvd = linearLayoutCompat;
        this.OLrzqt = oKRegularCell;
        this.KWHzl = textView;
    }
}
