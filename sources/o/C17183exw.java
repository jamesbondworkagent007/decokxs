package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.exw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17183exw implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final C19247fxg AYXKKw;
    public final C33546myW EZpvd;
    public final C55113xdn KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C17183exw(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C19247fxg c19247fxg) {
        this.OLrzqt = constraintLayout;
        this.KWHzl = c55113xdn;
        this.AEQbTJ = recyclerView;
        this.EZpvd = c33546myW;
        this.copydefault = textView;
        this.AYXKKw = c19247fxg;
    }

    public static C17183exw copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.INotificationSideChannelStub;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            i = C13754dXa.ActionBar.processPendingCallbacksLocked;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C13754dXa.ActionBar.setSessionImpl;
                C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                if (c33546myW != null) {
                    i = C13754dXa.ActionBar.ComponentActivity1;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C13754dXa.ActionBar.RequiresOptInLevel;
                        C19247fxg c19247fxg = (C19247fxg) ViewBindings.findChildViewById(view, i);
                        if (c19247fxg != null) {
                            return new C17183exw((ConstraintLayout) view, c55113xdn, recyclerView, c33546myW, textView, c19247fxg);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
