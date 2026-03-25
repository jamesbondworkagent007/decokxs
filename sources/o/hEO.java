package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hEO implements ViewBinding {
    public final ShapeableImageView AEQbTJ;
    public final C55113xdn AYXKKw;
    public final android.view.View AhwBna;
    public final ConstraintLayout AkhnZx;
    public final C54989xbV AuCTel;
    public final C54989xbV DbNXlk;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C54989xbV OLrzqt;
    public final C54989xbV copydefault;
    public final AppCompatTextView djBIcL;
    public final C33546myW ejfBZ;
    public final C33603mza fetchVPNInfo;
    public final AppCompatImageView gEmmrt;
    public final RecyclerView isConnected;
    public final C55173xeu valueOf;
    public final ConstraintLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AkhnZx;
    }

    public hEO(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C54989xbV c54989xbV, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C54989xbV c54989xbV2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C54989xbV c54989xbV3, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C54989xbV c54989xbV4) {
        this.AkhnZx = constraintLayout;
        this.OLrzqt = c54989xbV;
        this.EZpvd = linearLayout;
        this.AEQbTJ = shapeableImageView;
        this.KWHzl = linearLayout2;
        this.copydefault = c54989xbV2;
        this.valueOf = c55173xeu;
        this.AhwBna = view;
        this.gEmmrt = appCompatImageView;
        this.AYXKKw = c55113xdn;
        this.djBIcL = appCompatTextView;
        this.values = constraintLayout2;
        this.isConnected = recyclerView;
        this.DbNXlk = c54989xbV3;
        this.fetchVPNInfo = c33603mza;
        this.ejfBZ = c33546myW;
        this.AuCTel = c54989xbV4;
    }

    public static hEO AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.GPCHlQ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static hEO AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.frkDMe;
        C54989xbV c54989xbV = (C54989xbV) ViewBindings.findChildViewById(view, i);
        if (c54989xbV != null) {
            i = C23274hvD.Application.invokespecialODCBUN;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C23274hvD.Application.Dap;
                ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                if (shapeableImageView != null) {
                    i = C23274hvD.Application.FQMcgEfQMcgE;
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = C23274hvD.Application.zvzmfz;
                        C54989xbV c54989xbV2 = (C54989xbV) ViewBindings.findChildViewById(view, i);
                        if (c54989xbV2 != null) {
                            i = C23274hvD.Application.sZqaRl;
                            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                            if (c55173xeu != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.dNxZaP))) != null) {
                                i = C23274hvD.Application.invokespecialhrnhsO;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView != null) {
                                    i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                    if (c55113xdn != null) {
                                        i = C23274hvD.Application.MediaSessionCompatMediaSessionImplBaseMessageHandler;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView != null) {
                                            i = C23274hvD.Application.ResultReceiver;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout != null) {
                                                i = C23274hvD.Application.IResultReceiverStub;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                if (recyclerView != null) {
                                                    i = C23274hvD.Application.IResultReceiver2Stub;
                                                    C54989xbV c54989xbV3 = (C54989xbV) ViewBindings.findChildViewById(view, i);
                                                    if (c54989xbV3 != null) {
                                                        i = C23274hvD.Application.ComponentActivityReportFullyDrawnExecutor;
                                                        C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                                        if (c33603mza != null) {
                                                            i = C23274hvD.Application.getLauncher;
                                                            C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                                            if (c33546myW != null) {
                                                                i = C23274hvD.Application.onActionViewCollapsed;
                                                                C54989xbV c54989xbV4 = (C54989xbV) ViewBindings.findChildViewById(view, i);
                                                                if (c54989xbV4 != null) {
                                                                    return new hEO((ConstraintLayout) view, c54989xbV, linearLayout, shapeableImageView, linearLayout2, c54989xbV2, c55173xeu, viewFindChildViewById, appCompatImageView, c55113xdn, appCompatTextView, constraintLayout, recyclerView, c54989xbV3, c33603mza, c33546myW, c54989xbV4);
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
