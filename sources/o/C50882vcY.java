package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.core.widget.SortTextView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50882vcY implements ViewBinding {
    public final android.widget.LinearLayout KWHzl;
    public final C55258xgZ OLrzqt;
    public final SortTextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public C50882vcY(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull SortTextView sortTextView) {
        this.KWHzl = linearLayout;
        this.OLrzqt = c55258xgZ;
        this.copydefault = sortTextView;
    }

    public static C50882vcY OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.OeZisf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C50882vcY copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.SlnMSS;
        C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
        if (c55258xgZ != null) {
            i = C48033uCm.Application.PluralsRes;
            SortTextView sortTextView = (SortTextView) ViewBindings.findChildViewById(view, i);
            if (sortTextView != null) {
                return new C50882vcY((android.widget.LinearLayout) view, c55258xgZ, sortTextView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
