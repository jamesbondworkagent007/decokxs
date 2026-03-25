package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.view.OKSortTextView;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hAo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21470hAo implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final wYC AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final android.widget.LinearLayout AkhnZx;
    public final C55258xgZ AuCTel;
    public final android.widget.LinearLayout DbNXlk;
    public final LinearLayoutCompat EZpvd;
    public final jZV KWHzl;
    public final android.view.View OLrzqt;
    public final C28431kae copydefault;
    public final android.widget.ImageView djBIcL;
    public final C55052xcf ejfBZ;
    public final android.widget.TextView fARcdN;
    public final android.widget.TextView fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final LinearLayoutCompat gEmmrt;
    public final hTG getNewProxyInstance;
    public final LinearLayoutCompat isConnected;
    public final OKSortTextView uzCIH;
    public final OKSortTextView valueOf;
    public final RecyclerView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AkhnZx;
    }

    public C21470hAo(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull jZV jzv, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull C28431kae c28431kae, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat4, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat5, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull C55052xcf c55052xcf, @androidx.annotation.NonNull OKSortTextView oKSortTextView2, @androidx.annotation.NonNull hTG htg) {
        this.AkhnZx = linearLayout;
        this.OLrzqt = view;
        this.AEQbTJ = linearLayoutCompat;
        this.KWHzl = jzv;
        this.EZpvd = linearLayoutCompat2;
        this.copydefault = c28431kae;
        this.djBIcL = imageView;
        this.AYXKKw = wyc;
        this.gEmmrt = linearLayoutCompat3;
        this.AhwBna = linearLayoutCompat4;
        this.valueOf = oKSortTextView;
        this.values = recyclerView;
        this.DbNXlk = linearLayout2;
        this.isConnected = linearLayoutCompat5;
        this.fetchVPNInfo = textView;
        this.AuCTel = c55258xgZ;
        this.fIwbmz = textView2;
        this.fJNWhG = textView3;
        this.fARcdN = textView4;
        this.ejfBZ = c55052xcf;
        this.uzCIH = oKSortTextView2;
        this.getNewProxyInstance = htg;
    }

    public static C21470hAo AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.aJFbMH, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C21470hAo AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.OWSZPf;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C23274hvD.Application.vqBjd;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = C23274hvD.Application.clearCurrentKeyboardTarget;
                jZV jzv = (jZV) ViewBindings.findChildViewById(view, i);
                if (jzv != null) {
                    i = C23274hvD.Application.RcLksq;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat2 != null) {
                        i = C23274hvD.Application.aPFruk;
                        C28431kae c28431kae = (C28431kae) ViewBindings.findChildViewById(view, i);
                        if (c28431kae != null) {
                            i = C23274hvD.Application.OhRmUC;
                            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C23274hvD.Application.ikcuIV;
                                wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
                                if (wyc != null) {
                                    i = C23274hvD.Application.isRated;
                                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat3 != null) {
                                        i = C23274hvD.Application.hasHeart;
                                        LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat4 != null) {
                                            i = C23274hvD.Application.PlaybackStateCompatCustomAction;
                                            OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                                            if (oKSortTextView != null) {
                                                i = C23274hvD.Application.reportFullyDrawn;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                if (recyclerView != null) {
                                                    i = C23274hvD.Application.getFlagsMask;
                                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout != null) {
                                                        i = C23274hvD.Application.AttrRes;
                                                        LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayoutCompat5 != null) {
                                                            i = C23274hvD.Application.fromInclusive;
                                                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView != null) {
                                                                i = C23274hvD.Application.FractionRes;
                                                                C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                                                if (c55258xgZ != null) {
                                                                    i = C23274hvD.Application.onItemClick;
                                                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView2 != null) {
                                                                        i = C23274hvD.Application.DrawableContainerBlockInvalidateCallback;
                                                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView3 != null) {
                                                                            i = C23274hvD.Application.canConstantState;
                                                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView4 != null) {
                                                                                i = C23274hvD.Application.getTabContainerHeight;
                                                                                C55052xcf c55052xcf = (C55052xcf) ViewBindings.findChildViewById(view, i);
                                                                                if (c55052xcf != null) {
                                                                                    i = C23274hvD.Application.showsOverflowMenuButton;
                                                                                    OKSortTextView oKSortTextView2 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oKSortTextView2 != null) {
                                                                                        i = C23274hvD.Application.initialize;
                                                                                        hTG htg = (hTG) ViewBindings.findChildViewById(view, i);
                                                                                        if (htg != null) {
                                                                                            return new C21470hAo((android.widget.LinearLayout) view, viewFindChildViewById, linearLayoutCompat, jzv, linearLayoutCompat2, c28431kae, imageView, wyc, linearLayoutCompat3, linearLayoutCompat4, oKSortTextView, recyclerView, linearLayout, linearLayoutCompat5, textView, c55258xgZ, textView2, textView3, textView4, c55052xcf, oKSortTextView2, htg);
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
