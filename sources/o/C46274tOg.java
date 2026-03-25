package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C47501trL;

/* JADX INFO: renamed from: o.tOg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46274tOg implements ViewBinding {
    public final C55254xgV AEQbTJ;
    public final ViewPager2 KWHzl;
    public final LinearLayoutCompat copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.copydefault;
    }

    public C46274tOg(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C55254xgV c55254xgV) {
        this.copydefault = linearLayoutCompat;
        this.KWHzl = viewPager2;
        this.AEQbTJ = c55254xgV;
    }

    public static C46274tOg EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.DcMfJKfNUfqk;
        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
        if (viewPager2 != null) {
            i = C47501trL.TaskDescription.GcnicV;
            C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
            if (c55254xgV != null) {
                return new C46274tOg((LinearLayoutCompat) view, viewPager2, c55254xgV);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
