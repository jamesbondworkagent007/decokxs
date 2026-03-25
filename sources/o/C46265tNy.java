package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C47501trL;

/* JADX INFO: renamed from: o.tNy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46265tNy implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C52794wYp EZpvd;
    public final ViewPager2 OLrzqt;
    public final wXO copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C46265tNy(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull wXO wxo, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.AEQbTJ = linearLayout;
        this.EZpvd = c52794wYp;
        this.copydefault = wxo;
        this.OLrzqt = viewPager2;
    }

    public static C46265tNy KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.flVtFt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C46265tNy copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.iRxXKY;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C47501trL.TaskDescription.sILrnl;
            wXO wxo = (wXO) ViewBindings.findChildViewById(view, i);
            if (wxo != null) {
                i = C47501trL.TaskDescription.OeawrHRnVkix;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                if (viewPager2 != null) {
                    return new C46265tNy((android.widget.LinearLayout) view, c52794wYp, wxo, viewPager2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
