package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.exr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17178exr implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C19258fxr AYXKKw;
    public final ConstraintLayout AhwBna;
    public final android.widget.TextView AkhnZx;
    public final AppCompatTextView AuCTel;
    public final AppCompatTextView AuCTelauCTel;
    public final android.widget.TextView DbNXlk;
    public final C52794wYp EZpvd;
    public final android.view.View KWHzl;
    public final Barrier OLrzqt;
    public final Group copydefault;
    public final androidx.legacy.widget.Space djBIcL;
    public final android.widget.TextView ejfBZ;
    public final AppCompatTextView fARcdN;
    public final AppCompatTextView fIwbmz;
    public final AppCompatTextView fJNWhG;
    public final ShapeableImageView fetchVPNInfo;
    public final ConstraintLayout gEmmrt;
    public final android.widget.TextView getFieldNames;
    public final android.widget.TextView getNewProxyInstance;
    public final AppCompatTextView hDKMBd;
    public final android.widget.TextView isConnected;
    public final AppCompatTextView iwGUEr;
    public final android.widget.TextView uzCIH;
    public final ShapeableImageView valueOf;
    public final C19251fxk values;
    public final android.view.View zLjUOn;
    public final AppCompatTextView zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public C17178exr(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull androidx.legacy.widget.Space space, @androidx.annotation.NonNull C19258fxr c19258fxr, @androidx.annotation.NonNull ShapeableImageView shapeableImageView2, @androidx.annotation.NonNull C19251fxk c19251fxk, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7, @androidx.annotation.NonNull AppCompatTextView appCompatTextView8, @androidx.annotation.NonNull android.view.View view2) {
        this.gEmmrt = constraintLayout;
        this.OLrzqt = barrier;
        this.EZpvd = c52794wYp;
        this.AEQbTJ = constraintLayout2;
        this.KWHzl = view;
        this.copydefault = group;
        this.AhwBna = constraintLayout3;
        this.valueOf = shapeableImageView;
        this.djBIcL = space;
        this.AYXKKw = c19258fxr;
        this.fetchVPNInfo = shapeableImageView2;
        this.values = c19251fxk;
        this.isConnected = textView;
        this.DbNXlk = textView2;
        this.AkhnZx = textView3;
        this.fARcdN = appCompatTextView;
        this.fIwbmz = appCompatTextView2;
        this.fJNWhG = appCompatTextView3;
        this.AuCTel = appCompatTextView4;
        this.ejfBZ = textView4;
        this.getFieldNames = textView5;
        this.uzCIH = textView6;
        this.getNewProxyInstance = textView7;
        this.hDKMBd = appCompatTextView5;
        this.iwGUEr = appCompatTextView6;
        this.zsXlph = appCompatTextView7;
        this.AuCTelauCTel = appCompatTextView8;
        this.zLjUOn = view2;
    }

    public static C17178exr EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.dtVxwd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C17178exr EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C13754dXa.ActionBar.USBtdM;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C13754dXa.ActionBar.zLAIeZ;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C13754dXa.ActionBar.DcMfJKsuEgdN;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.ikIEnW))) != null) {
                    i = C13754dXa.ActionBar.gdwsGQ;
                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                    if (group != null) {
                        i = C13754dXa.ActionBar.DbvGUJ;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout2 != null) {
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
                                                        i = C13754dXa.ActionBar.ContextAwareKt;
                                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView3 != null) {
                                                            i = C13754dXa.ActionBar.OnContextAvailableListener;
                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatTextView != null) {
                                                                i = C13754dXa.ActionBar.ContextAwareKtwithContextAvailable21;
                                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView2 != null) {
                                                                    i = C13754dXa.ActionBar.withContextAvailableforInline;
                                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (appCompatTextView3 != null) {
                                                                        i = C13754dXa.ActionBar.ActivityResult1;
                                                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatTextView4 != null) {
                                                                            i = C13754dXa.ActionBar.getFillInIntent;
                                                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView4 != null) {
                                                                                i = C13754dXa.ActionBar.getFlagsValues;
                                                                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView5 != null) {
                                                                                    i = C13754dXa.ActionBar.toInclusive;
                                                                                    android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView6 != null) {
                                                                                        i = C13754dXa.ActionBar.InspectableProperty;
                                                                                        android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView7 != null) {
                                                                                            i = C13754dXa.ActionBar.attributeId;
                                                                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (appCompatTextView5 != null) {
                                                                                                i = C13754dXa.ActionBar.name;
                                                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (appCompatTextView6 != null) {
                                                                                                    i = C13754dXa.ActionBar.enumMapping;
                                                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (appCompatTextView7 != null) {
                                                                                                        i = C13754dXa.ActionBar.InspectablePropertyFlagEntry;
                                                                                                        AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (appCompatTextView8 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.RequiresPermission))) != null) {
                                                                                                            return new C17178exr((ConstraintLayout) view, barrier, c52794wYp, constraintLayout, viewFindChildViewById, group, constraintLayout2, shapeableImageView, space, c19258fxr, shapeableImageView2, c19251fxk, textView, textView2, textView3, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, textView4, textView5, textView6, textView7, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, viewFindChildViewById2);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
