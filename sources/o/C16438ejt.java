package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ejt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16438ejt implements ViewBinding {
    public static int ejfBZ;
    public static int isConnected;
    public final android.widget.TextView AEQbTJ;
    public final OKRegularCell AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final ConstraintLayout AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final OKRegularCell EZpvd;
    public final OKRegularCell KWHzl;
    public final C55068xcv OLrzqt;
    public final C33537myN copydefault;
    public final android.widget.ImageView djBIcL;
    public final OKRegularCell fetchVPNInfo;
    public final OKRegularCell gEmmrt;
    public final android.view.View valueOf;
    public final C55068xcv values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AkhnZx;
    }

    public C16438ejt(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55068xcv c55068xcv, @androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull OKRegularCell oKRegularCell2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull OKRegularCell oKRegularCell3, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull OKRegularCell oKRegularCell4, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull OKRegularCell oKRegularCell5, @androidx.annotation.NonNull C55068xcv c55068xcv2, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AkhnZx = constraintLayout;
        this.copydefault = c33537myN;
        this.AEQbTJ = textView;
        this.OLrzqt = c55068xcv;
        this.KWHzl = oKRegularCell;
        this.EZpvd = oKRegularCell2;
        this.valueOf = view;
        this.AYXKKw = oKRegularCell3;
        this.djBIcL = imageView;
        this.gEmmrt = oKRegularCell4;
        this.AhwBna = imageView2;
        this.fetchVPNInfo = oKRegularCell5;
        this.values = c55068xcv2;
        this.DbNXlk = textView2;
    }

    public static C16438ejt AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, null, false);
    }

    public static C16438ejt AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.hrNTAI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C16438ejt OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C13754dXa.ActionBar.iZzfmt;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C13754dXa.ActionBar.DAIeex;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C13754dXa.ActionBar.DQzvGN;
                C55068xcv c55068xcv = (C55068xcv) ViewBindings.findChildViewById(view, i);
                if (c55068xcv != null) {
                    i = C13754dXa.ActionBar.aGOrKO;
                    OKRegularCell oKRegularCell = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                    if (oKRegularCell != null) {
                        i = C13754dXa.ActionBar.svY;
                        OKRegularCell oKRegularCell2 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                        if (oKRegularCell2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.OAhWiU))) != null) {
                            i = C13754dXa.ActionBar.setLocationManually;
                            OKRegularCell oKRegularCell3 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                            if (oKRegularCell3 != null) {
                                i = C13754dXa.ActionBar.aWJMta;
                                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = C13754dXa.ActionBar.RatingCompat;
                                    OKRegularCell oKRegularCell4 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                                    if (oKRegularCell4 != null) {
                                        i = C13754dXa.ActionBar.getRepeatMode;
                                        android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView2 != null) {
                                            i = C13754dXa.ActionBar.verifySession;
                                            OKRegularCell oKRegularCell5 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                                            if (oKRegularCell5 != null) {
                                                i = C13754dXa.ActionBar.markerClass;
                                                C55068xcv c55068xcv2 = (C55068xcv) ViewBindings.findChildViewById(view, i);
                                                if (c55068xcv2 != null) {
                                                    i = C13754dXa.ActionBar.RequiresFeature;
                                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView2 != null) {
                                                        return new C16438ejt((ConstraintLayout) view, c33537myN, textView, c55068xcv, oKRegularCell, oKRegularCell2, viewFindChildViewById, oKRegularCell3, imageView, oKRegularCell4, imageView2, oKRegularCell5, c55068xcv2, textView2);
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

    public static int EZpvd() {
        int i = isConnected;
        int i2 = i % 9533985;
        isConnected = i + 1;
        if (i2 != 0) {
            return ejfBZ;
        }
        int iElapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
        ejfBZ = iElapsedRealtime;
        return iElapsedRealtime;
    }
}
