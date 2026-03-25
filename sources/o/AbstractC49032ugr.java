package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.share.platforms.SharePlatform;

/* JADX INFO: renamed from: o.ugr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49032ugr extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.ImageView OLrzqt;

    @Bindable
    public SharePlatform copydefault;

    public AbstractC49032ugr(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, android.widget.ImageView imageView, android.widget.TextView textView) {
        super(obj, view, i);
        this.EZpvd = linearLayout;
        this.OLrzqt = imageView;
        this.AEQbTJ = textView;
    }
}
