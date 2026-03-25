package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rwb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C43825rwb implements ViewBinding {
    public final android.widget.TextView EZpvd;
    public final OKRegularCell KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final OKRegularCell copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public OKRegularCell getRoot() {
        return this.copydefault;
    }

    public C43825rwb(@androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull OKRegularCell oKRegularCell2, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.copydefault = oKRegularCell;
        this.EZpvd = textView;
        this.KWHzl = oKRegularCell2;
        this.OLrzqt = imageView;
    }

    public static C43825rwb EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C43662rtX.TaskDescription.fJNWhG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C43825rwb AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C43662rtX.ActionBar.gHZMYf;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            OKRegularCell oKRegularCell = (OKRegularCell) view;
            int i2 = C43662rtX.ActionBar.fupbxE;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView != null) {
                return new C43825rwb(oKRegularCell, textView, oKRegularCell, imageView);
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
