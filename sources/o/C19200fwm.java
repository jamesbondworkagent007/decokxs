package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.okinc.business.defi.wallet.mine.search.data.model.MarketChainBean;
import com.okinc.uilab.list.OKAnchorSelection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19200fwm extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public C16482ekk EZpvd;
    public final int OLrzqt = 10;
    public int AYXKKw = 2;
    public java.util.List<MarketChainBean> AEQbTJ = new java.util.ArrayList();
    public long copydefault = Long.MIN_VALUE;

    private final boolean OLrzqt(char c) {
        return ('a' <= c && c < '{') || ('A' <= c && c < '[');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.AYXKKw = i;
    }

    /* JADX INFO: renamed from: o.fwm$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fwm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    private final OKAnchorSelection copydefault() {
        C16482ekk c16482ekk = this.EZpvd;
        if (c16482ekk != null) {
            return c16482ekk.AEQbTJ;
        }
        return null;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setDynamicFullScreen(false);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        java.lang.String string = getString(C13754dXa.FragmentManager.gtCCJH);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.EZpvd().setVisibility(8);
        wxq.EZpvd().setImageResource(0);
        wxq.KWHzl().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new StateListAnimator(imageViewKWHzl, 1000L, this));
    }

    private final boolean OLrzqt() {
        return this.AEQbTJ.size() <= this.OLrzqt;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        C55230xfy c55230xfyDjBIcL;
        java.util.List<InterfaceC55105xdf> listValueOf;
        java.util.List<InterfaceC55105xdf> listValueOf2;
        java.util.List<InterfaceC55105xdf> listValueOf3;
        java.util.List<InterfaceC55105xdf> listValueOf4;
        C55173xeu c55173xeuCopydefault;
        C55230xfy c55230xfyDjBIcL2;
        android.widget.EditText editTextEZpvd;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C16482ekk c16482ekkKWHzl = C16482ekk.KWHzl(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, false);
        this.EZpvd = c16482ekkKWHzl;
        Intrinsics.copydefault(c16482ekkKWHzl);
        constraintLayout.addView(c16482ekkKWHzl.getRoot());
        OKAnchorSelection oKAnchorSelectionCopydefault = copydefault();
        if (oKAnchorSelectionCopydefault != null) {
            oKAnchorSelectionCopydefault.setStyle(OKAnchorSelection.OKAnchorSelectionStyle.SHEET);
        }
        OKAnchorSelection oKAnchorSelectionCopydefault2 = copydefault();
        if (oKAnchorSelectionCopydefault2 != null && (c55230xfyDjBIcL2 = oKAnchorSelectionCopydefault2.djBIcL()) != null && (editTextEZpvd = c55230xfyDjBIcL2.EZpvd()) != null) {
            editTextEZpvd.setHint(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getVisualMimeTypeactivity_release));
        }
        OKAnchorSelection oKAnchorSelectionCopydefault3 = copydefault();
        if (oKAnchorSelectionCopydefault3 != null && (c55173xeuCopydefault = oKAnchorSelectionCopydefault3.copydefault()) != null) {
            c55173xeuCopydefault.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsStartActivityForResult));
        }
        java.util.HashMap map = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(" ");
        OKAnchorSelection oKAnchorSelectionCopydefault4 = copydefault();
        if (oKAnchorSelectionCopydefault4 != null && (listValueOf4 = oKAnchorSelectionCopydefault4.valueOf()) != null) {
            listValueOf4.add(new C13784dYd(false, "", CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) C56402yEa.EZpvd(Long.MIN_VALUE))));
        }
        for (MarketChainBean marketChainBean : this.AEQbTJ) {
            if (marketChainBean.getPopularChain()) {
                arrayList.add(marketChainBean);
            }
            if (marketChainBean.getChainName().length() > 0) {
                char cCharAt = marketChainBean.getChainName().charAt(0);
                if (OLrzqt(cCharAt)) {
                    char upperCase = java.lang.Character.toUpperCase(cCharAt);
                    java.util.List arrayList3 = (java.util.List) map.get(java.lang.Character.valueOf(upperCase));
                    if (arrayList3 == null) {
                        arrayList3 = new java.util.ArrayList();
                        map.put(java.lang.Character.valueOf(upperCase), arrayList3);
                    }
                    arrayList3.add(marketChainBean);
                }
            }
        }
        if (OLrzqt()) {
            arrayList.clear();
        }
        if (arrayList.size() > 0) {
            arrayList2.add("★");
            OKAnchorSelection oKAnchorSelectionCopydefault5 = copydefault();
            if (oKAnchorSelectionCopydefault5 != null && (listValueOf3 = oKAnchorSelectionCopydefault5.valueOf()) != null) {
                listValueOf3.add(new C13784dYd(true, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ikEgkI), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList)));
            }
        }
        for (char c = 'A'; c < '['; c = (char) (c + 1)) {
            java.util.List list = (java.util.List) map.get(java.lang.Character.valueOf(c));
            if (list != null) {
                if (OLrzqt()) {
                    OKAnchorSelection oKAnchorSelectionCopydefault6 = copydefault();
                    if (oKAnchorSelectionCopydefault6 != null && (listValueOf2 = oKAnchorSelectionCopydefault6.valueOf()) != null) {
                        listValueOf2.add(new C13784dYd(false, java.lang.String.valueOf(c), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list)));
                    }
                } else {
                    arrayList2.add(java.lang.String.valueOf(c));
                    OKAnchorSelection oKAnchorSelectionCopydefault7 = copydefault();
                    if (oKAnchorSelectionCopydefault7 != null && (listValueOf = oKAnchorSelectionCopydefault7.valueOf()) != null) {
                        listValueOf.add(new C13784dYd(true, java.lang.String.valueOf(c), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list)));
                    }
                }
            }
        }
        final OKAnchorSelection oKAnchorSelectionCopydefault8 = copydefault();
        if (oKAnchorSelectionCopydefault8 != null) {
            oKAnchorSelectionCopydefault8.setDividerLineVisibility(!OLrzqt());
            oKAnchorSelectionCopydefault8.OLrzqt().setVisibility(OLrzqt() ^ true ? 0 : 8);
            oKAnchorSelectionCopydefault8.setIndexList(arrayList2);
            java.util.List<InterfaceC55105xdf> listValueOf5 = oKAnchorSelectionCopydefault8.valueOf();
            if (listValueOf5 != null) {
                java.util.Iterator<T> it = listValueOf5.iterator();
                while (it.hasNext()) {
                    oKAnchorSelectionCopydefault8.EZpvd((InterfaceC55105xdf) it.next());
                }
            }
            OKAnchorSelection oKAnchorSelectionCopydefault9 = copydefault();
            if (oKAnchorSelectionCopydefault9 != null && (c55230xfyDjBIcL = oKAnchorSelectionCopydefault9.djBIcL()) != null) {
                c55230xfyDjBIcL.setVisibility(8);
            }
            oKAnchorSelectionCopydefault8.setConvertViewCallback(new Function2() { // from class: o.fwn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C19200fwm.OLrzqt(this.EZpvd, oKAnchorSelectionCopydefault8, (C55043xcW) obj, obj2);
                }
            });
        }
        OKAnchorSelection oKAnchorSelectionCopydefault10 = copydefault();
        if (oKAnchorSelectionCopydefault10 != null) {
            oKAnchorSelectionCopydefault10.setSearchResultCallback(new Function1() { // from class: o.fwo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19200fwm.copydefault(this.AEQbTJ, (java.lang.CharSequence) obj);
                }
            });
        }
    }

    public static final Unit OLrzqt(final C19200fwm c19200fwm, OKAnchorSelection oKAnchorSelection, C55043xcW c55043xcW, java.lang.Object obj) {
        java.lang.String string;
        java.lang.String strOLrzqt;
        java.lang.String chainLogo = "";
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        if (obj instanceof MarketChainBean) {
            final MarketChainBean marketChainBean = (MarketChainBean) obj;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) marketChainBean.getChainLogo())) {
                chainLogo = marketChainBean.getChainLogo();
            } else {
                java.lang.Character chWlaJM = C59454zhO.wlaJM(marketChainBean.getChainName());
                if (chWlaJM != null && (string = chWlaJM.toString()) != null && (strOLrzqt = C9700baY.OLrzqt(string)) != null) {
                    chainLogo = strOLrzqt;
                }
            }
            android.widget.ImageView imageView = (android.widget.ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.aWJMta);
            if (imageView != null) {
                C33054mpH.KWHzl(imageView, chainLogo);
            }
            android.widget.ImageView imageView2 = (android.widget.ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialsiEkQe);
            if (imageView2 != null) {
                imageView2.setVisibility(Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(c19200fwm.copydefault), (java.lang.Object) marketChainBean.getChainId()) ? 0 : 8);
            }
            c55043xcW.EZpvd(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi211, marketChainBean.getChainName());
            c55043xcW.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.fwp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C19200fwm.OLrzqt(this.AEQbTJ, marketChainBean, view);
                }
            });
        } else {
            c55043xcW.EZpvd(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi211, oKAnchorSelection.getContext().getString(C13754dXa.FragmentManager.setSupportActionBar));
            android.widget.ImageView imageView3 = (android.widget.ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.aWJMta);
            if (imageView3 != null) {
                C33054mpH.OLrzqt(imageView3, java.lang.Integer.valueOf(C52761wXj.TaskDescription.createSocket));
            }
            android.widget.ImageView imageView4 = (android.widget.ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialsiEkQe);
            if (imageView4 != null) {
                imageView4.setVisibility(c19200fwm.copydefault != Long.MIN_VALUE ? 8 : 0);
            }
            c55043xcW.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.fwl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C19200fwm.copydefault(this.copydefault, view);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fwm$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C19200fwm OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C19200fwm c19200fwm) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c19200fwm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    public static final void OLrzqt(C19200fwm c19200fwm, MarketChainBean marketChainBean, android.view.View view) {
        FragmentKt.setFragmentResult(c19200fwm, "SELECT_NETWORK_REQUEST_KEY", BundleKt.bundleOf(C56390yDp.OLrzqt("SELECT_NETWORK_RESULT_KEY", marketChainBean)));
        c19200fwm.dismiss();
    }

    public static final void copydefault(C19200fwm c19200fwm, android.view.View view) {
        FragmentKt.setFragmentResult(c19200fwm, "SELECT_NETWORK_REQUEST_KEY", BundleKt.bundleOf(C56390yDp.OLrzqt("SELECT_NETWORK_RESULT_KEY", null)));
        c19200fwm.dismiss();
    }

    public static final Unit copydefault(C19200fwm c19200fwm, java.lang.CharSequence charSequence) {
        java.util.List<MarketChainBean> list = c19200fwm.AEQbTJ;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            MarketChainBean marketChainBean = (MarketChainBean) obj;
            if (charSequence == null || StringsKt__StringsKt.AhwBna((java.lang.CharSequence) marketChainBean.getChainName(), charSequence, true)) {
                arrayList.add(obj);
            }
        }
        OKAnchorSelection oKAnchorSelectionCopydefault = c19200fwm.copydefault();
        if (oKAnchorSelectionCopydefault != null) {
            oKAnchorSelectionCopydefault.setSearchResultList(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList));
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull java.util.List<MarketChainBean> list, long j) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.clear();
        this.AEQbTJ.addAll(list);
        this.copydefault = j;
    }
}
