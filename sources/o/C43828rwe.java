package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rwe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C43828rwe implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final C55230xfy AYXKKw;
    public final ConstraintLayout EZpvd;
    public final C55113xdn KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final RecyclerView copydefault;
    public final C55042xcV djBIcL;
    public final android.widget.RelativeLayout gEmmrt;
    public final android.widget.FrameLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.valueOf;
    }

    public C43828rwe(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C55042xcV c55042xcV, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout) {
        this.valueOf = frameLayout;
        this.OLrzqt = imageView;
        this.EZpvd = constraintLayout;
        this.AEQbTJ = textView;
        this.copydefault = recyclerView;
        this.KWHzl = c55113xdn;
        this.djBIcL = c55042xcV;
        this.AYXKKw = c55230xfy;
        this.gEmmrt = relativeLayout;
    }

    public static C43828rwe copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C43662rtX.TaskDescription.fARcdN, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C43828rwe copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C43662rtX.ActionBar.dxcTrN;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C43662rtX.ActionBar.dvKsVJ;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C43662rtX.ActionBar.fvQaOB;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C43662rtX.ActionBar.DGOPHZ;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C43662rtX.ActionBar.reset;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = C43662rtX.ActionBar.DQzvGNdrmXxu;
                            C55042xcV c55042xcV = (C55042xcV) ViewBindings.findChildViewById(view, i);
                            if (c55042xcV != null) {
                                i = C43662rtX.ActionBar.YFmri;
                                C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                                if (c55230xfy != null) {
                                    i = C43662rtX.ActionBar.deregisterUser;
                                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout != null) {
                                        return new C43828rwe((android.widget.FrameLayout) view, imageView, constraintLayout, textView, recyclerView, c55113xdn, c55042xcV, c55230xfy, relativeLayout);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
