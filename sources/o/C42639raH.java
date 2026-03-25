package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.raH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42639raH implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final Group AYXKKw;
    public final C55173xeu EZpvd;
    public final RecyclerView KWHzl;
    public final C55113xdn OLrzqt;
    public final C55230xfy copydefault;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C42639raH(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull Group group) {
        this.AEQbTJ = view;
        this.KWHzl = recyclerView;
        this.copydefault = c55230xfy;
        this.EZpvd = c55173xeu;
        this.OLrzqt = c55113xdn;
        this.gEmmrt = appCompatTextView;
        this.valueOf = appCompatTextView2;
        this.AYXKKw = group;
    }

    public static C42639raH KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.OxVOHk, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C42639raH OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.heceqZ;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = qZH.StateListAnimator.hCLrkq;
            C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
            if (c55230xfy != null) {
                i = qZH.StateListAnimator.fkESqH;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = qZH.StateListAnimator.pXZxY;
                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                    if (c55113xdn != null) {
                        i = qZH.StateListAnimator.dYepVG;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            i = qZH.StateListAnimator.OGitdB;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView2 != null) {
                                i = qZH.StateListAnimator.ardYFU;
                                Group group = (Group) ViewBindings.findChildViewById(view, i);
                                if (group != null) {
                                    return new C42639raH(view, recyclerView, c55230xfy, c55173xeu, c55113xdn, appCompatTextView, appCompatTextView2, group);
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
