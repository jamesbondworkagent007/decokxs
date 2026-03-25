package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes19.dex */
public final class uNL implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C55258xgZ AYXKKw;
    public final C55258xgZ AhwBna;
    public final C55258xgZ EZpvd;
    public final C55258xgZ KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TableLayout gEmmrt;
    public final android.widget.HorizontalScrollView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.HorizontalScrollView getRoot() {
        return this.valueOf;
    }

    public uNL(@androidx.annotation.NonNull android.widget.HorizontalScrollView horizontalScrollView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull C55258xgZ c55258xgZ2, @androidx.annotation.NonNull C55258xgZ c55258xgZ3, @androidx.annotation.NonNull android.widget.TableLayout tableLayout, @androidx.annotation.NonNull C55258xgZ c55258xgZ4) {
        this.valueOf = horizontalScrollView;
        this.AEQbTJ = linearLayout;
        this.OLrzqt = textView;
        this.copydefault = textView2;
        this.KWHzl = c55258xgZ;
        this.EZpvd = c55258xgZ2;
        this.AYXKKw = c55258xgZ3;
        this.gEmmrt = tableLayout;
        this.AhwBna = c55258xgZ4;
    }

    public static uNL AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.QKudOq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static uNL KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.iluEmO;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C48033uCm.Application.MediaBrowserCompatMediaBrowserServiceCallbackImpl;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C48033uCm.Application.getMediaId;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C48033uCm.Application.setMediaButtonReceiver;
                    C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                    if (c55258xgZ != null) {
                        i = C48033uCm.Application.setActive;
                        C55258xgZ c55258xgZ2 = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                        if (c55258xgZ2 != null) {
                            i = C48033uCm.Application.setPlaybackState;
                            C55258xgZ c55258xgZ3 = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                            if (c55258xgZ3 != null) {
                                i = C48033uCm.Application.Dimension;
                                android.widget.TableLayout tableLayout = (android.widget.TableLayout) ViewBindings.findChildViewById(view, i);
                                if (tableLayout != null) {
                                    i = C48033uCm.Application.onKeyShortcut;
                                    C55258xgZ c55258xgZ4 = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                    if (c55258xgZ4 != null) {
                                        return new uNL((android.widget.HorizontalScrollView) view, linearLayout, textView, textView2, c55258xgZ, c55258xgZ2, c55258xgZ3, tableLayout, c55258xgZ4);
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
