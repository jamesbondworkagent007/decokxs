package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ext, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17180ext implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C19247fxg AhwBna;
    public final C54989xbV EZpvd;
    public final C55113xdn KWHzl;
    public final C54989xbV OLrzqt;
    public final ConstraintLayout copydefault;
    public final RecyclerView djBIcL;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AEQbTJ;
    }

    public C17180ext(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C54989xbV c54989xbV, @androidx.annotation.NonNull C54989xbV c54989xbV2, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C19247fxg c19247fxg) {
        this.AEQbTJ = frameLayout;
        this.EZpvd = c54989xbV;
        this.OLrzqt = c54989xbV2;
        this.KWHzl = c55113xdn;
        this.copydefault = constraintLayout;
        this.djBIcL = recyclerView;
        this.valueOf = textView;
        this.AhwBna = c19247fxg;
    }

    public static C17180ext EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.invokespecialgBtXYZ;
        C54989xbV c54989xbV = (C54989xbV) ViewBindings.findChildViewById(view, i);
        if (c54989xbV != null) {
            i = C13754dXa.ActionBar.sendSocketRequest;
            C54989xbV c54989xbV2 = (C54989xbV) ViewBindings.findChildViewById(view, i);
            if (c54989xbV2 != null) {
                i = C13754dXa.ActionBar.INotificationSideChannelStubProxy;
                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                if (c55113xdn != null) {
                    i = C13754dXa.ActionBar.fromMediaMetadata;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C13754dXa.ActionBar.skipToNext;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = C13754dXa.ActionBar.ComponentActivity5;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C13754dXa.ActionBar.UiContext;
                                C19247fxg c19247fxg = (C19247fxg) ViewBindings.findChildViewById(view, i);
                                if (c19247fxg != null) {
                                    return new C17180ext((android.widget.FrameLayout) view, c54989xbV, c54989xbV2, c55113xdn, constraintLayout, recyclerView, textView, c19247fxg);
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
