package o;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C5655aAa implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final RecyclerView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final CardView copydefault;
    public final android.widget.TextView djBIcL;
    public final Group gEmmrt;
    public final android.view.View valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.valueOf;
    }

    public C5655aAa(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull CardView cardView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7) {
        this.valueOf = view;
        this.copydefault = cardView;
        this.AEQbTJ = textView;
        this.OLrzqt = textView2;
        this.EZpvd = textView3;
        this.KWHzl = textView4;
        this.gEmmrt = group;
        this.AYXKKw = recyclerView;
        this.djBIcL = textView5;
        this.AhwBna = textView6;
        this.AkhnZx = textView7;
    }

    public static C5655aAa AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C8206ayP.Application.dxcTrN, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C5655aAa EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.aKErDB;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = C8206ayP.StateListAnimator.UeEOUB;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C8206ayP.StateListAnimator.fZBcTu;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C8206ayP.StateListAnimator.gasjUx;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = C8206ayP.StateListAnimator.DGOPHZ;
                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = C8206ayP.StateListAnimator.DGUQLI;
                            Group group = (Group) ViewBindings.findChildViewById(view, i);
                            if (group != null) {
                                i = C8206ayP.StateListAnimator.heceqZ;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C8206ayP.StateListAnimator.DaRZkR;
                                    android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        i = C8206ayP.StateListAnimator.isReflectionWorking;
                                        android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            i = C8206ayP.StateListAnimator.iHkeWl;
                                            android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView7 != null) {
                                                return new C5655aAa(view, cardView, textView, textView2, textView3, textView4, group, recyclerView, textView5, textView6, textView7);
                                            }
                                        }
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
