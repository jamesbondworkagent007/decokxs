package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17030evB implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final C55258xgZ AhwBna;
    public final android.widget.TextView AkhnZx;
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;
    public final C55258xgZ gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C17030evB(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55258xgZ c55258xgZ2, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8) {
        this.EZpvd = constraintLayout;
        this.KWHzl = textView;
        this.copydefault = textView2;
        this.AEQbTJ = textView3;
        this.OLrzqt = textView4;
        this.djBIcL = textView5;
        this.AhwBna = c55258xgZ;
        this.valueOf = textView6;
        this.AYXKKw = imageView;
        this.gEmmrt = c55258xgZ2;
        this.isConnected = textView7;
        this.AkhnZx = textView8;
    }

    public static C17030evB AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.IKQXqd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C17030evB copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.config;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C13754dXa.ActionBar.sElUiK;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C13754dXa.ActionBar.onProgressUpdate;
                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = C13754dXa.ActionBar.onResult;
                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = C13754dXa.ActionBar.onPlay;
                        android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView5 != null) {
                            i = C13754dXa.ActionBar.onPause;
                            C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                            if (c55258xgZ != null) {
                                i = C13754dXa.ActionBar.onSetCaptioningEnabled;
                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView6 != null) {
                                    i = C13754dXa.ActionBar.onSkipToNext;
                                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = C13754dXa.ActionBar.onSkipToPrevious;
                                        C55258xgZ c55258xgZ2 = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                        if (c55258xgZ2 != null) {
                                            i = C13754dXa.ActionBar.viewModelsdefault;
                                            android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView7 != null) {
                                                i = C13754dXa.ActionBar.ActivityViewModelLazyKtviewModels3;
                                                android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView8 != null) {
                                                    return new C17030evB((ConstraintLayout) view, textView, textView2, textView3, textView4, textView5, c55258xgZ, textView6, imageView, c55258xgZ2, textView7, textView8);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
