package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.uilab.list.OKAnchorSelection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.egh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16267egh extends wXX {
    public Function1<? super C13924dbk, Unit> EZpvd;
    public C16482ekk gEmmrt;
    public final int OLrzqt = 10;
    public int djBIcL = 2;
    public final java.util.ArrayList<C13924dbk> copydefault = new java.util.ArrayList<>();
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.egt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C16267egh.KWHzl(this.copydefault);
        }
    });
    public final java.util.List<C13924dbk> AEQbTJ = new java.util.ArrayList();

    private final boolean EZpvd(char c) {
        return ('a' <= c && c < '{') || ('A' <= c && c < '[');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function1<? super C13924dbk, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.djBIcL = i;
    }

    public final OKAnchorSelection AEQbTJ() {
        C16482ekk c16482ekk = this.gEmmrt;
        if (c16482ekk != null) {
            return c16482ekk.AEQbTJ;
        }
        return null;
    }

    public static final C59534zip KWHzl(C16267egh c16267egh) {
        return new C59534zip(c16267egh.copydefault);
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
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    private final boolean KWHzl() {
        return this.AEQbTJ.size() <= this.OLrzqt;
    }

    public final C13924dbk AEQbTJ(CustomChainMeta customChainMeta) {
        C10854bwM c10854bwMAEQbTJ;
        CustomChainCoinMeta customChainCoinMetaDjBIcL = customChainMeta.djBIcL();
        if (customChainCoinMetaDjBIcL == null || (c10854bwMAEQbTJ = customChainCoinMetaDjBIcL.AEQbTJ()) == null) {
            return null;
        }
        return new C13924dbk(c10854bwMAEQbTJ, customChainMeta.valueOf());
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        C55173xeu c55173xeuCopydefault;
        C55230xfy c55230xfyDjBIcL;
        android.widget.EditText editTextEZpvd;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C16482ekk c16482ekkKWHzl = C16482ekk.KWHzl(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, false);
        this.gEmmrt = c16482ekkKWHzl;
        Intrinsics.copydefault(c16482ekkKWHzl);
        constraintLayout.addView(c16482ekkKWHzl.getRoot());
        OKAnchorSelection oKAnchorSelectionAEQbTJ = AEQbTJ();
        if (oKAnchorSelectionAEQbTJ != null) {
            oKAnchorSelectionAEQbTJ.setStyle(OKAnchorSelection.OKAnchorSelectionStyle.SHEET);
        }
        OKAnchorSelection oKAnchorSelectionAEQbTJ2 = AEQbTJ();
        if (oKAnchorSelectionAEQbTJ2 != null && (c55230xfyDjBIcL = oKAnchorSelectionAEQbTJ2.djBIcL()) != null && (editTextEZpvd = c55230xfyDjBIcL.EZpvd()) != null) {
            editTextEZpvd.setHint(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getVisualMimeTypeactivity_release));
        }
        OKAnchorSelection oKAnchorSelectionAEQbTJ3 = AEQbTJ();
        if (oKAnchorSelectionAEQbTJ3 != null && (c55173xeuCopydefault = oKAnchorSelectionAEQbTJ3.copydefault()) != null) {
            c55173xeuCopydefault.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsStartActivityForResult));
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.egr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16267egh.AEQbTJ(objectRef, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.egq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C16267egh.copydefault(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        C33024moe.subscribeOnIO$default(abstractC58185ywXKWHzl, (Function1) null, (Function0) null, new Function1() { // from class: o.ego
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16267egh.AEQbTJ(objectRef, this, (java.util.List) obj);
            }
        }, 3, (java.lang.Object) null);
    }

    public static final InterfaceC60096zvd copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.ctV */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC60096zvd AEQbTJ(Ref.ObjectRef objectRef, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        objectRef.element = abstractC12782ctV;
        return abstractC12782ctV.gkJEwt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(Ref.ObjectRef objectRef, final C16267egh c16267egh, java.util.List list) {
        C55230xfy c55230xfyDjBIcL;
        java.util.List<InterfaceC55105xdf> listValueOf;
        java.util.List<InterfaceC55105xdf> listValueOf2;
        java.util.List<InterfaceC55105xdf> listValueOf3;
        java.util.HashMap map = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C13924dbk c13924dbk = (C13924dbk) it.next();
            if (c13924dbk.OLrzqt().hBpjJd()) {
                arrayList.add(c13924dbk);
            }
            if (c13924dbk.OLrzqt().djBIcL().length() > 0) {
                char cCharAt = c13924dbk.OLrzqt().djBIcL().charAt(0);
                if (c16267egh.EZpvd(cCharAt)) {
                    char upperCase = java.lang.Character.toUpperCase(cCharAt);
                    java.util.List arrayList3 = (java.util.List) map.get(java.lang.Character.valueOf(upperCase));
                    if (arrayList3 == null) {
                        arrayList3 = new java.util.ArrayList();
                        map.put(java.lang.Character.valueOf(upperCase), arrayList3);
                    }
                    arrayList3.add(c13924dbk);
                    c16267egh.AEQbTJ.add(c13924dbk);
                }
            }
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objectRef.element;
        if (abstractC12782ctV != null && AbstractC12782ctV.isCustomNetworkSupport$default(abstractC12782ctV, false, 1, null)) {
            for (CustomChainMeta customChainMeta : C10598brV.AEQbTJ.AkhnZx()) {
                if (customChainMeta.OLrzqt().length() > 0) {
                    char cCharAt2 = customChainMeta.OLrzqt().charAt(0);
                    if (c16267egh.EZpvd(cCharAt2)) {
                        char upperCase2 = java.lang.Character.toUpperCase(cCharAt2);
                        java.util.List arrayList4 = (java.util.List) map.get(java.lang.Character.valueOf(upperCase2));
                        if (arrayList4 == null) {
                            arrayList4 = new java.util.ArrayList();
                            map.put(java.lang.Character.valueOf(upperCase2), arrayList4);
                        }
                        C13924dbk c13924dbkAEQbTJ = c16267egh.AEQbTJ(customChainMeta);
                        if (c13924dbkAEQbTJ != null) {
                            arrayList4.add(c13924dbkAEQbTJ);
                            c16267egh.AEQbTJ.add(c13924dbkAEQbTJ);
                        }
                    }
                }
            }
        }
        if (c16267egh.KWHzl()) {
            arrayList.clear();
        }
        if (arrayList.size() > 0) {
            arrayList2.add("★");
            C56407yEf.copydefault(arrayList, new java.util.Comparator() { // from class: o.egm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return C16267egh.AEQbTJ((C13924dbk) obj, (C13924dbk) obj2);
                }
            });
            OKAnchorSelection oKAnchorSelectionAEQbTJ = c16267egh.AEQbTJ();
            if (oKAnchorSelectionAEQbTJ != null && (listValueOf3 = oKAnchorSelectionAEQbTJ.valueOf()) != null) {
                listValueOf3.add(new C13784dYd(true, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ikEgkI), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList)));
            }
        }
        for (char c = 'A'; c < '['; c = (char) (c + 1)) {
            java.util.List list2 = (java.util.List) map.get(java.lang.Character.valueOf(c));
            if (list2 != null) {
                if (c16267egh.KWHzl()) {
                    OKAnchorSelection oKAnchorSelectionAEQbTJ2 = c16267egh.AEQbTJ();
                    if (oKAnchorSelectionAEQbTJ2 != null && (listValueOf2 = oKAnchorSelectionAEQbTJ2.valueOf()) != null) {
                        listValueOf2.add(new C13784dYd(false, java.lang.String.valueOf(c), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list2)));
                    }
                } else {
                    arrayList2.add(java.lang.String.valueOf(c));
                    OKAnchorSelection oKAnchorSelectionAEQbTJ3 = c16267egh.AEQbTJ();
                    if (oKAnchorSelectionAEQbTJ3 != null && (listValueOf = oKAnchorSelectionAEQbTJ3.valueOf()) != null) {
                        listValueOf.add(new C13784dYd(true, java.lang.String.valueOf(c), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list2)));
                    }
                }
            }
        }
        OKAnchorSelection oKAnchorSelectionAEQbTJ4 = c16267egh.AEQbTJ();
        if (oKAnchorSelectionAEQbTJ4 != null) {
            oKAnchorSelectionAEQbTJ4.setDividerLineVisibility(!c16267egh.KWHzl());
            oKAnchorSelectionAEQbTJ4.OLrzqt().setVisibility(c16267egh.KWHzl() ^ true ? 0 : 8);
            oKAnchorSelectionAEQbTJ4.setIndexList(arrayList2);
            java.util.List<InterfaceC55105xdf> listValueOf4 = oKAnchorSelectionAEQbTJ4.valueOf();
            if (listValueOf4 != null) {
                java.util.Iterator<T> it2 = listValueOf4.iterator();
                while (it2.hasNext()) {
                    oKAnchorSelectionAEQbTJ4.EZpvd((InterfaceC55105xdf) it2.next());
                }
            }
            if (!c16267egh.isDynamicFullScreen()) {
                c16267egh.setDynamicFullScreen(true);
                oKAnchorSelectionAEQbTJ4.getViewTreeObserver().addOnGlobalLayoutListener(new StateListAnimator(oKAnchorSelectionAEQbTJ4, c16267egh));
            }
            oKAnchorSelectionAEQbTJ4.setConvertViewCallback(new Function2() { // from class: o.egp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C16267egh.EZpvd(this.copydefault, (C55043xcW) obj, obj2);
                }
            });
        }
        OKAnchorSelection oKAnchorSelectionAEQbTJ5 = c16267egh.AEQbTJ();
        if (oKAnchorSelectionAEQbTJ5 != null) {
            oKAnchorSelectionAEQbTJ5.setSearchResultCallback(new Function1() { // from class: o.egs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C16267egh.OLrzqt(this.EZpvd, (java.lang.CharSequence) obj);
                }
            });
        }
        OKAnchorSelection oKAnchorSelectionAEQbTJ6 = c16267egh.AEQbTJ();
        if (oKAnchorSelectionAEQbTJ6 != null && (c55230xfyDjBIcL = oKAnchorSelectionAEQbTJ6.djBIcL()) != null) {
            c55230xfyDjBIcL.setVisibility(8);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c16267egh, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.egh$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C16267egh OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C16267egh c16267egh) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c16267egh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    public static final int AEQbTJ(C13924dbk c13924dbk, C13924dbk c13924dbk2) {
        if (c13924dbk.OLrzqt().ORxRYg() > c13924dbk2.OLrzqt().ORxRYg()) {
            return 1;
        }
        return c13924dbk.OLrzqt().ORxRYg() == c13924dbk2.OLrzqt().ORxRYg() ? 0 : -1;
    }

    /* JADX INFO: renamed from: o.egh$StateListAnimator */
    public static final class StateListAnimator implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ OKAnchorSelection EZpvd;
        public final /* synthetic */ C16267egh KWHzl;

        public StateListAnimator(OKAnchorSelection oKAnchorSelection, C16267egh c16267egh) {
            this.EZpvd = oKAnchorSelection;
            this.KWHzl = c16267egh;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            android.widget.FrameLayout frameLayout;
            ViewGroup.LayoutParams layoutParams;
            this.EZpvd.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int height = this.EZpvd.getHeight();
            C16482ekk c16482ekk = this.KWHzl.gEmmrt;
            if (c16482ekk == null || (frameLayout = c16482ekk.EZpvd) == null || (layoutParams = frameLayout.getLayoutParams()) == null) {
                return;
            }
            layoutParams.height = height + C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null);
        }
    }

    public static final Unit EZpvd(final C16267egh c16267egh, C55043xcW c55043xcW, java.lang.Object obj) {
        java.lang.String string;
        java.lang.String strOLrzqt;
        java.lang.String strAEQbTJ = "";
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        Intrinsics.copydefault(obj, "");
        final C13924dbk c13924dbk = (C13924dbk) obj;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c13924dbk.AEQbTJ())) {
            strAEQbTJ = c13924dbk.AEQbTJ();
        } else {
            java.lang.Character chWlaJM = C59454zhO.wlaJM(c13924dbk.OLrzqt().djBIcL());
            if (chWlaJM != null && (string = chWlaJM.toString()) != null && (strOLrzqt = C9700baY.OLrzqt(string)) != null) {
                strAEQbTJ = strOLrzqt;
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.aWJMta);
        if (imageView != null) {
            C33054mpH.KWHzl(imageView, strAEQbTJ);
        }
        c55043xcW.EZpvd(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi211, c13924dbk.OLrzqt().djBIcL());
        c55043xcW.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.egn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C16267egh.EZpvd(this.OLrzqt, c13924dbk, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C16267egh c16267egh, C13924dbk c13924dbk, android.view.View view) {
        Function1<? super C13924dbk, Unit> function1 = c16267egh.EZpvd;
        if (function1 != null) {
            function1.invoke(c13924dbk);
        }
        c16267egh.dismiss();
    }

    public static final Unit OLrzqt(C16267egh c16267egh, java.lang.CharSequence charSequence) {
        java.util.List<C13924dbk> list = c16267egh.AEQbTJ;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            C13924dbk c13924dbk = (C13924dbk) obj;
            if (charSequence == null || StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c13924dbk.OLrzqt().djBIcL(), charSequence, true)) {
                arrayList.add(obj);
            }
        }
        OKAnchorSelection oKAnchorSelectionAEQbTJ = c16267egh.AEQbTJ();
        if (oKAnchorSelectionAEQbTJ != null) {
            oKAnchorSelectionAEQbTJ.setSearchResultList(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList));
        }
        return Unit.INSTANCE;
    }
}
