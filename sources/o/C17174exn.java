package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.exn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17174exn implements ViewBinding {
    public final Barrier AEQbTJ;
    public final C19258fxr AYXKKw;
    public final ShapeableImageView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final android.view.View EZpvd;
    public final ShapeableImageView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final androidx.legacy.widget.Space gEmmrt;
    public final android.widget.TextView isConnected;
    public final C19251fxk valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C17174exn(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull androidx.legacy.widget.Space space, @androidx.annotation.NonNull C19258fxr c19258fxr, @androidx.annotation.NonNull ShapeableImageView shapeableImageView2, @androidx.annotation.NonNull C19251fxk c19251fxk, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = barrier;
        this.copydefault = constraintLayout2;
        this.EZpvd = view;
        this.KWHzl = shapeableImageView;
        this.gEmmrt = space;
        this.AYXKKw = c19258fxr;
        this.AhwBna = shapeableImageView2;
        this.valueOf = c19251fxk;
        this.djBIcL = textView;
        this.AkhnZx = textView2;
        this.isConnected = textView3;
        this.fetchVPNInfo = textView4;
        this.DbNXlk = textView5;
    }

    public static C17174exn copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.fGsPTM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C17174exn AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C13754dXa.ActionBar.USBtdM;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C13754dXa.ActionBar.DcMfJKsuEgdN;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.ikIEnW))) != null) {
                i = C13754dXa.ActionBar.isBrowsable;
                ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                if (shapeableImageView != null) {
                    i = C13754dXa.ActionBar.unregisterMediaButtonEventReceiver;
                    androidx.legacy.widget.Space space = (androidx.legacy.widget.Space) ViewBindings.findChildViewById(view, i);
                    if (space != null) {
                        i = C13754dXa.ActionBar.toBundle;
                        C19258fxr c19258fxr = (C19258fxr) ViewBindings.findChildViewById(view, i);
                        if (c19258fxr != null) {
                            i = C13754dXa.ActionBar.PlaybackStateCompatApi22;
                            ShapeableImageView shapeableImageView2 = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                            if (shapeableImageView2 != null) {
                                i = C13754dXa.ActionBar.send;
                                C19251fxk c19251fxk = (C19251fxk) ViewBindings.findChildViewById(view, i);
                                if (c19251fxk != null) {
                                    i = C13754dXa.ActionBar.onStart;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C13754dXa.ActionBar.LocalFullyDrawnReporterOwner;
                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = C13754dXa.ActionBar.getFillInIntent;
                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                i = C13754dXa.ActionBar.getFlagsValues;
                                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    i = C13754dXa.ActionBar.toInclusive;
                                                    android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView5 != null) {
                                                        return new C17174exn((ConstraintLayout) view, barrier, constraintLayout, viewFindChildViewById, shapeableImageView, space, c19258fxr, shapeableImageView2, c19251fxk, textView, textView2, textView3, textView4, textView5);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
