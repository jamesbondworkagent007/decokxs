package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.raL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42643raL implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final RecyclerView EZpvd;
    public final C40505qYi KWHzl;
    public final RecyclerView OLrzqt;
    public final RecyclerView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C40505qYi getRoot() {
        return this.KWHzl;
    }

    public C42643raL(@androidx.annotation.NonNull C40505qYi c40505qYi, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView recyclerView2, @androidx.annotation.NonNull RecyclerView recyclerView3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.KWHzl = c40505qYi;
        this.AEQbTJ = c52794wYp;
        this.EZpvd = recyclerView;
        this.copydefault = recyclerView2;
        this.OLrzqt = recyclerView3;
        this.djBIcL = textView;
        this.gEmmrt = textView2;
        this.valueOf = textView3;
    }

    public static C42643raL KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.aUsmxb, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C42643raL AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DAIeex;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = qZH.StateListAnimator.aWJMta;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = qZH.StateListAnimator.apLTlu;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView2 != null) {
                    i = qZH.StateListAnimator.sEcTXd;
                    RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView3 != null) {
                        i = qZH.StateListAnimator.ITrustedWebActivityServiceStubProxy;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = qZH.StateListAnimator.INotificationSideChannel_Parcel;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = qZH.StateListAnimator.INotificationSideChannelDefault;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    return new C42643raL((C40505qYi) view, c52794wYp, recyclerView, recyclerView2, recyclerView3, textView, textView2, textView3);
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
