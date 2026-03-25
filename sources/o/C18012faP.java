package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.uilab.list.OKAnchorSelection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C12827cuN;
import o.C13754dXa;
import o.C18012faP;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.faP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18012faP extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public boolean AYXKKw;
    public AbstractC16516elR AhwBna;
    public boolean DbNXlk;
    public AbstractC12782ctV OLrzqt;
    public final int KWHzl = 10;
    public int values = 2;
    public Function2<? super ActionBar, ? super java.lang.Integer, Unit> gEmmrt = new Function2() { // from class: o.faT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return C18012faP.EZpvd((C18012faP.ActionBar) obj, ((java.lang.Integer) obj2).intValue());
        }
    };
    public boolean djBIcL = true;
    public long AEQbTJ = Long.MIN_VALUE;
    public boolean valueOf = true;
    public final java.util.List<ActionBar> copydefault = new java.util.ArrayList();

    private final boolean copydefault(char c) {
        return ('a' <= c && c < '{') || ('A' <= c && c < '[');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Function2<? super ActionBar, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.gEmmrt = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.values = i;
    }

    public static final Unit EZpvd(ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.faP$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.faP.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C18012faP AEQbTJ() {
            return new C18012faP();
        }
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, AbstractC12782ctV abstractC12782ctV, long j, boolean z, boolean z2) {
        OKAnchorSelection oKAnchorSelection;
        java.util.List<InterfaceC55105xdf> listValueOf;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        super.show(fragmentManager, str);
        this.djBIcL = z;
        this.AEQbTJ = j;
        this.DbNXlk = z2;
        AbstractC16516elR abstractC16516elR = this.AhwBna;
        if (abstractC16516elR == null) {
            this.OLrzqt = abstractC12782ctV;
        } else {
            if (abstractC16516elR == null || (oKAnchorSelection = abstractC16516elR.AEQbTJ) == null || (listValueOf = oKAnchorSelection.valueOf()) == null || !listValueOf.isEmpty()) {
                return;
            }
            KWHzl(abstractC12782ctV);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.valueOf) {
            OLrzqt(this.OLrzqt);
        }
        this.valueOf = false;
    }

    public final void OLrzqt(AbstractC12782ctV abstractC12782ctV) {
        OKAnchorSelection oKAnchorSelection;
        this.OLrzqt = abstractC12782ctV;
        AbstractC16516elR abstractC16516elR = this.AhwBna;
        if (abstractC16516elR != null && (oKAnchorSelection = abstractC16516elR.AEQbTJ) != null) {
            oKAnchorSelection.EZpvd();
        }
        KWHzl(abstractC12782ctV);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        OKAnchorSelection oKAnchorSelection;
        C55230xfy c55230xfyDjBIcL;
        OKAnchorSelection oKAnchorSelection2;
        C55173xeu c55173xeuCopydefault;
        OKAnchorSelection oKAnchorSelection3;
        C55230xfy c55230xfyDjBIcL2;
        android.widget.EditText editTextEZpvd;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC16516elR abstractC16516elREZpvd = AbstractC16516elR.EZpvd(android.view.LayoutInflater.from(getContext()), constraintLayout, false);
        this.AhwBna = abstractC16516elREZpvd;
        constraintLayout.addView(abstractC16516elREZpvd != null ? abstractC16516elREZpvd.getRoot() : null);
        AbstractC16516elR abstractC16516elR = this.AhwBna;
        if (abstractC16516elR != null && (oKAnchorSelection3 = abstractC16516elR.AEQbTJ) != null && (c55230xfyDjBIcL2 = oKAnchorSelection3.djBIcL()) != null && (editTextEZpvd = c55230xfyDjBIcL2.EZpvd()) != null) {
            editTextEZpvd.setHint(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getVisualMimeTypeactivity_release));
        }
        AbstractC16516elR abstractC16516elR2 = this.AhwBna;
        if (abstractC16516elR2 != null && (oKAnchorSelection2 = abstractC16516elR2.AEQbTJ) != null && (c55173xeuCopydefault = oKAnchorSelection2.copydefault()) != null) {
            c55173xeuCopydefault.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsStartActivityForResult));
        }
        AbstractC16516elR abstractC16516elR3 = this.AhwBna;
        if (abstractC16516elR3 != null && (oKAnchorSelection = abstractC16516elR3.AEQbTJ) != null && (c55230xfyDjBIcL = oKAnchorSelection.djBIcL()) != null) {
            c55230xfyDjBIcL.setVisibility(8);
        }
        KWHzl(this.OLrzqt);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsStartActivityForResultCompanion));
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.EZpvd().setVisibility(8);
        wxq.EZpvd().setImageResource(0);
        wxq.KWHzl().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.app.Dialog dialog = getDialog();
        android.view.View viewFindViewById = dialog != null ? dialog.findViewById(com.google.android.material.R.id.container) : null;
        if (viewFindViewById != null) {
            ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.faW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(android.view.View view2, WindowInsetsCompat windowInsetsCompat) {
                    return C18012faP.EZpvd(view2, windowInsetsCompat);
                }
            });
            ViewCompat.requestApplyInsets(viewFindViewById);
        }
        view.post(new java.lang.Runnable() { // from class: o.faV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C18012faP.copydefault(this.EZpvd);
            }
        });
    }

    public static final WindowInsetsCompat EZpvd(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), insets.bottom);
        return windowInsetsCompat;
    }

    public static final void copydefault(C18012faP c18012faP) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c18012faP, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void KWHzl(AbstractC12782ctV abstractC12782ctV) {
        java.lang.String strOLrzqt;
        boolean z;
        OKAnchorSelection oKAnchorSelection;
        final OKAnchorSelection oKAnchorSelection2;
        OKAnchorSelection oKAnchorSelection3;
        java.util.List<InterfaceC55105xdf> listValueOf;
        OKAnchorSelection oKAnchorSelection4;
        java.util.List<InterfaceC55105xdf> listValueOf2;
        OKAnchorSelection oKAnchorSelection5;
        java.util.List<InterfaceC55105xdf> listValueOf3;
        java.util.List<C10854bwM> listOFhtUX;
        OKAnchorSelection oKAnchorSelection6;
        java.util.List<InterfaceC55105xdf> listValueOf4;
        this.copydefault.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaSingleMimeType);
        if (abstractC12782ctV == null || (strOLrzqt = abstractC12782ctV.OLrzqt("opened")) == null) {
            strOLrzqt = "0";
        }
        boolean z2 = true;
        arrayList.add(new ActionBar("", strAYXKKw, "", strOLrzqt, Long.MIN_VALUE, Long.MIN_VALUE, z2, z2, this.AEQbTJ == Long.MIN_VALUE, 0, false, 0, false, false, 15872, null));
        AbstractC16516elR abstractC16516elR = this.AhwBna;
        if (abstractC16516elR != null && (oKAnchorSelection6 = abstractC16516elR.AEQbTJ) != null && (listValueOf4 = oKAnchorSelection6.valueOf()) != null) {
            listValueOf4.add(new C13784dYd(false, "", CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList)));
        }
        java.util.HashMap map = new java.util.HashMap();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.List<java.lang.String> listAhwBna = yDY.AhwBna("");
        if (abstractC12782ctV != null && (listOFhtUX = abstractC12782ctV.OFhtUX()) != null) {
            for (C10854bwM c10854bwM : listOFhtUX) {
                if (c10854bwM.hBpjJd() && !abstractC12782ctV.getFieldNames()) {
                    arrayList3.add(copydefault(c10854bwM, abstractC12782ctV));
                }
                if (c10854bwM.djBIcL().length() > 0) {
                    char cCharAt = c10854bwM.djBIcL().charAt(0);
                    if (copydefault(cCharAt)) {
                        char upperCase = java.lang.Character.toUpperCase(cCharAt);
                        java.lang.Object arrayList4 = (java.util.List) map.get(java.lang.Character.valueOf(upperCase));
                        if (arrayList4 == null) {
                            arrayList4 = new java.util.ArrayList();
                            map.put(java.lang.Character.valueOf(upperCase), arrayList4);
                        }
                        ActionBar actionBarCopydefault = copydefault(c10854bwM, abstractC12782ctV);
                        C56532yIw.OLrzqt(arrayList4).add(actionBarCopydefault);
                        this.copydefault.add(actionBarCopydefault);
                    } else {
                        ActionBar actionBarCopydefault2 = copydefault(c10854bwM, abstractC12782ctV);
                        arrayList2.add(actionBarCopydefault2);
                        this.copydefault.add(actionBarCopydefault2);
                    }
                }
            }
        }
        if (abstractC12782ctV != null) {
            z = true;
            if (AbstractC12782ctV.isCustomNetworkSupport$default(abstractC12782ctV, false, 1, null) && this.DbNXlk) {
                for (CustomChainMeta customChainMeta : C10598brV.AEQbTJ.AkhnZx()) {
                    if (customChainMeta.OLrzqt().length() > 0) {
                        char cCharAt2 = customChainMeta.OLrzqt().charAt(0);
                        if (copydefault(cCharAt2)) {
                            char upperCase2 = java.lang.Character.toUpperCase(cCharAt2);
                            java.lang.Object arrayList5 = (java.util.List) map.get(java.lang.Character.valueOf(upperCase2));
                            if (arrayList5 == null) {
                                arrayList5 = new java.util.ArrayList();
                                map.put(java.lang.Character.valueOf(upperCase2), arrayList5);
                            }
                            ActionBar actionBarOLrzqt = OLrzqt(customChainMeta);
                            C56532yIw.OLrzqt(arrayList5).add(actionBarOLrzqt);
                            this.copydefault.add(actionBarOLrzqt);
                        } else {
                            ActionBar actionBarOLrzqt2 = OLrzqt(customChainMeta);
                            arrayList2.add(actionBarOLrzqt2);
                            this.copydefault.add(actionBarOLrzqt2);
                        }
                    }
                }
            }
        } else {
            z = true;
        }
        if (EZpvd()) {
            arrayList3.clear();
            listAhwBna.clear();
        }
        if (arrayList3.size() > 0) {
            listAhwBna.add("★");
            C56407yEf.copydefault(arrayList3, new java.util.Comparator() { // from class: o.fbc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return C18012faP.AEQbTJ((C18012faP.ActionBar) obj, (C18012faP.ActionBar) obj2);
                }
            });
            AbstractC16516elR abstractC16516elR2 = this.AhwBna;
            if (abstractC16516elR2 != null && (oKAnchorSelection5 = abstractC16516elR2.AEQbTJ) != null && (listValueOf3 = oKAnchorSelection5.valueOf()) != null) {
                listValueOf3.add(new C13784dYd(z, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ikEgkI), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList3)));
            }
        }
        for (char c = 'A'; c < '['; c = (char) (c + 1)) {
            java.util.List list = (java.util.List) map.get(java.lang.Character.valueOf(c));
            if (list != null) {
                if (EZpvd()) {
                    AbstractC16516elR abstractC16516elR3 = this.AhwBna;
                    if (abstractC16516elR3 != null && (oKAnchorSelection4 = abstractC16516elR3.AEQbTJ) != null && (listValueOf2 = oKAnchorSelection4.valueOf()) != null) {
                        listValueOf2.add(new C13784dYd(false, java.lang.String.valueOf(c), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list)));
                    }
                } else {
                    listAhwBna.add(java.lang.String.valueOf(c));
                    AbstractC16516elR abstractC16516elR4 = this.AhwBna;
                    if (abstractC16516elR4 != null && (oKAnchorSelection3 = abstractC16516elR4.AEQbTJ) != null && (listValueOf = oKAnchorSelection3.valueOf()) != null) {
                        listValueOf.add(new C13784dYd(z, java.lang.String.valueOf(c), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list)));
                    }
                }
            }
        }
        AbstractC16516elR abstractC16516elR5 = this.AhwBna;
        if (abstractC16516elR5 != null && (oKAnchorSelection2 = abstractC16516elR5.AEQbTJ) != null) {
            oKAnchorSelection2.setDividerLineVisibility(EZpvd() ^ z);
            oKAnchorSelection2.OLrzqt().setVisibility(EZpvd() ^ z ? 0 : 8);
            oKAnchorSelection2.setIndexList(listAhwBna);
            java.util.List<InterfaceC55105xdf> listValueOf5 = oKAnchorSelection2.valueOf();
            if (listValueOf5 != null) {
                java.util.Iterator<T> it = listValueOf5.iterator();
                while (it.hasNext()) {
                    oKAnchorSelection2.OLrzqt((InterfaceC55105xdf) it.next());
                }
            }
            if (!this.AYXKKw) {
                this.AYXKKw = z;
                oKAnchorSelection2.post(new java.lang.Runnable() { // from class: o.fba
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18012faP.copydefault(this.EZpvd, oKAnchorSelection2);
                    }
                });
            }
            oKAnchorSelection2.setConvertViewCallback(new Function2() { // from class: o.fbd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C18012faP.EZpvd(oKAnchorSelection2, this, (C55043xcW) obj, obj2);
                }
            });
        }
        AbstractC16516elR abstractC16516elR6 = this.AhwBna;
        if (abstractC16516elR6 == null || (oKAnchorSelection = abstractC16516elR6.AEQbTJ) == null) {
            return;
        }
        oKAnchorSelection.setSearchResultCallback(new Function1() { // from class: o.faO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18012faP.KWHzl(this.OLrzqt, (java.lang.CharSequence) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.faP$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C18012faP EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C18012faP c18012faP) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c18012faP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    public static final int AEQbTJ(ActionBar actionBar, ActionBar actionBar2) {
        if (actionBar.AhwBna() > actionBar2.AhwBna()) {
            return 1;
        }
        return actionBar.AhwBna() == actionBar2.AhwBna() ? 0 : -1;
    }

    public static final void copydefault(C18012faP c18012faP, OKAnchorSelection oKAnchorSelection) {
        android.widget.FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        AbstractC16516elR abstractC16516elR = c18012faP.AhwBna;
        if (abstractC16516elR == null || (frameLayout = abstractC16516elR.OLrzqt) == null || (layoutParams = frameLayout.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = oKAnchorSelection.getHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(OKAnchorSelection oKAnchorSelection, final C18012faP c18012faP, final C55043xcW c55043xcW, java.lang.Object obj) {
        java.lang.String strKWHzl;
        java.lang.String str;
        android.widget.ImageView imageView;
        java.lang.String strEZpvd = "";
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        Intrinsics.copydefault(obj, "");
        final ActionBar actionBar = (ActionBar) obj;
        c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialhOMIpD, actionBar.KWHzl());
        java.lang.String valuationFromAsset$default = C54880xYt.formatValuationFromAsset$default(actionBar.AYXKKw(), null, false, C14455dll.KWHzl.copydefault(actionBar.AYXKKw()), false, 11, null);
        int i = C13754dXa.ActionBar.DPHOMC;
        if (actionBar.gEmmrt()) {
            strKWHzl = C13821dZn.EZpvd.OLrzqt(valuationFromAsset$default);
        } else {
            strKWHzl = C13821dZn.EZpvd.KWHzl(valuationFromAsset$default);
        }
        c55043xcW.EZpvd(i, strKWHzl);
        if (!actionBar.values()) {
            c55043xcW.OLrzqt(C13754dXa.ActionBar.invokespecialsiEkQe, false);
            c55043xcW.OLrzqt(C13754dXa.ActionBar.setMediaUri, true);
            android.widget.Button button = (android.widget.Button) c55043xcW.EZpvd(C13754dXa.ActionBar.setMediaUri);
            if (button != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: o.faS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C18012faP.EZpvd(this.AEQbTJ, c55043xcW, actionBar, view);
                    }
                });
            }
        } else {
            c55043xcW.OLrzqt(C13754dXa.ActionBar.setMediaUri, false);
        }
        if (actionBar.isConnected() && actionBar.values()) {
            android.widget.ImageView imageView2 = (android.widget.ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialsiEkQe);
            if (imageView2 != null) {
                imageView2.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(oKAnchorSelection.getContext(), C52761wXj.Activity.OJuSTm)));
            }
            c55043xcW.OLrzqt(C13754dXa.ActionBar.invokespecialsiEkQe, true);
        } else {
            c55043xcW.OLrzqt(C13754dXa.ActionBar.invokespecialsiEkQe, false);
        }
        if (actionBar.gEmmrt()) {
            android.widget.ImageView imageView3 = (android.widget.ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialaKhcqp);
            if (imageView3 != null) {
                Glide.KWHzl(imageView3).OLrzqt(java.lang.Integer.valueOf(actionBar.copydefault())).EZpvd(imageView3);
            }
        } else {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) actionBar.EZpvd())) {
                strEZpvd = actionBar.EZpvd();
            } else {
                java.lang.String strOLrzqt = C9700baY.OLrzqt(java.lang.String.valueOf(C59454zhO.wlaJM(actionBar.valueOf())));
                if (strOLrzqt != null) {
                    str = strOLrzqt;
                }
                imageView = (android.widget.ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialaKhcqp);
                if (imageView != null) {
                    C57659ymb.loadFixSizeBorderImage$default(imageView, str, C52761wXj.TaskDescription.fERRXa, 0.0f, 0.0f, 12, null);
                }
            }
            str = strEZpvd;
            imageView = (android.widget.ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialaKhcqp);
            if (imageView != null) {
            }
        }
        if (c18012faP.djBIcL && !actionBar.djBIcL()) {
            c55043xcW.OLrzqt(C13754dXa.ActionBar.DPHOMC, true);
            android.view.View viewEZpvd = c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialhOMIpD);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (viewEZpvd != null ? viewEZpvd.getLayoutParams() : null);
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = C33052mpF.dp2px$default(15.0f, null, 1, null);
            }
            if (viewEZpvd != null) {
                viewEZpvd.setLayoutParams(marginLayoutParams);
            }
        } else {
            android.view.View viewEZpvd2 = c55043xcW.EZpvd(C13754dXa.ActionBar.DPHOMC);
            if (viewEZpvd2 != null) {
                viewEZpvd2.setVisibility(8);
            }
            android.view.View viewEZpvd3 = c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialhOMIpD);
            ViewGroup.LayoutParams layoutParams = viewEZpvd3 != null ? viewEZpvd3.getLayoutParams() : null;
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C33052mpF.dp2px$default(24.0f, null, 1, null);
            }
            if (layoutParams2 != null) {
                layoutParams2.goneBottomMargin = C33052mpF.dp2px$default(24.0f, null, 1, null);
            }
            if (viewEZpvd3 != null) {
                viewEZpvd3.setLayoutParams(layoutParams2);
            }
        }
        c55043xcW.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.faR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C18012faP.KWHzl(actionBar, c18012faP, c55043xcW, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C18012faP c18012faP, C55043xcW c55043xcW, ActionBar actionBar, android.view.View view) {
        c18012faP.copydefault(c55043xcW.getLayoutPosition(), actionBar);
    }

    public static final void KWHzl(ActionBar actionBar, C18012faP c18012faP, C55043xcW c55043xcW, android.view.View view) {
        if (actionBar.values()) {
            c18012faP.gEmmrt.invoke(actionBar, java.lang.Integer.valueOf(c55043xcW.getLayoutPosition()));
        } else {
            c18012faP.copydefault(c55043xcW.getLayoutPosition(), actionBar);
        }
    }

    public static final Unit KWHzl(C18012faP c18012faP, java.lang.CharSequence charSequence) {
        OKAnchorSelection oKAnchorSelection;
        java.util.List<ActionBar> list = c18012faP.copydefault;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            ActionBar actionBar = (ActionBar) obj;
            if (charSequence == null || StringsKt__StringsKt.AhwBna((java.lang.CharSequence) actionBar.KWHzl(), charSequence, true)) {
                arrayList.add(obj);
            }
        }
        AbstractC16516elR abstractC16516elR = c18012faP.AhwBna;
        if (abstractC16516elR != null && (oKAnchorSelection = abstractC16516elR.AEQbTJ) != null) {
            oKAnchorSelection.setSearchResultList(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList));
        }
        return Unit.INSTANCE;
    }

    public final ActionBar OLrzqt(CustomChainMeta customChainMeta) {
        java.lang.String strEjfBZ;
        java.lang.String strValueOf = customChainMeta.valueOf();
        java.lang.String strOLrzqt = customChainMeta.OLrzqt();
        CustomChainCoinMeta customChainCoinMetaDjBIcL = customChainMeta.djBIcL();
        if (customChainCoinMetaDjBIcL == null || (strEjfBZ = customChainCoinMetaDjBIcL.ejfBZ()) == null) {
            strEjfBZ = "";
        }
        return new ActionBar(strValueOf, strOLrzqt, strEjfBZ, "0", customChainMeta.EZpvd(), -2L, true, false, customChainMeta.EZpvd() == this.AEQbTJ, 0, false, 0, true, customChainMeta.AhwBna(), LivenessCoordinator.TARGET_HEIGHT, null);
    }

    public final ActionBar copydefault(C10854bwM c10854bwM, AbstractC12782ctV abstractC12782ctV) {
        java.lang.String strCopydefault;
        boolean z;
        java.lang.String strCopydefault2 = c10854bwM.copydefault();
        java.lang.String strDjBIcL = c10854bwM.djBIcL();
        java.lang.String strFJNWhG = c10854bwM.fJNWhG();
        if (abstractC12782ctV == null || (strCopydefault = abstractC12782ctV.copydefault("opened", c10854bwM.AEQbTJ(), true)) == null) {
            strCopydefault = "0";
        }
        long jAEQbTJ = c10854bwM.AEQbTJ();
        long jFetchVPNInfo = c10854bwM.fetchVPNInfo();
        boolean zAhwBna = abstractC12782ctV != null ? abstractC12782ctV.AhwBna(java.lang.Long.valueOf(c10854bwM.AEQbTJ())) : false;
        boolean zHBpjJd = c10854bwM.hBpjJd();
        int iORxRYg = c10854bwM.ORxRYg();
        C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
        if (c10854bwMKWHzl != null) {
            z = zAhwBna;
            boolean z2 = c10854bwMKWHzl.AEQbTJ() == this.AEQbTJ;
            return new ActionBar(strCopydefault2, strDjBIcL, strFJNWhG, strCopydefault, jAEQbTJ, jFetchVPNInfo, z, false, z2, 0, zHBpjJd, iORxRYg, false, false, 12928, null);
        }
        z = zAhwBna;
        return new ActionBar(strCopydefault2, strDjBIcL, strFJNWhG, strCopydefault, jAEQbTJ, jFetchVPNInfo, z, false, z2, 0, zHBpjJd, iORxRYg, false, false, 12928, null);
    }

    public final void copydefault(final int i, final ActionBar actionBar) {
        C9930beq c9930beqEZpvd = C9930beq.Companion.EZpvd(actionBar.OLrzqt());
        c9930beqEZpvd.copydefault(new Function1() { // from class: o.faZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18012faP.OLrzqt(this.copydefault, actionBar, i, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        c9930beqEZpvd.show(getParentFragmentManager(), "ChainUpdateBottomSubFragment");
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final C18012faP c18012faP, final ActionBar actionBar, final int i, boolean z) {
        if (z) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
            final Function1 function1 = new Function1() { // from class: o.faX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18012faP.AEQbTJ(this.KWHzl, actionBar, i, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.faU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C18012faP.EZpvd(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.fbb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18012faP.copydefault((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.faY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C18012faP.copydefault(function12, obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C18012faP c18012faP, ActionBar actionBar, int i, AbstractC12782ctV abstractC12782ctV) {
        c18012faP.OLrzqt(abstractC12782ctV);
        c18012faP.gEmmrt.invoke(actionBar, java.lang.Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o.faP$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar {
        public final int AEQbTJ;
        public final boolean AYXKKw;
        public final int AhwBna;
        public final java.lang.String AkhnZx;
        public final boolean DbNXlk;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final boolean OLrzqt;
        public final long copydefault;
        public final boolean djBIcL;
        public final boolean gEmmrt;
        public boolean isConnected;
        public final long valueOf;
        public final java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j, long j2, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, boolean z5, boolean z6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new ActionBar(str, str2, str3, str4, j, j2, z, z2, z3, i, z4, i2, z5, z6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) actionBar.values) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) actionBar.AkhnZx) && this.copydefault == actionBar.copydefault && this.valueOf == actionBar.valueOf && this.DbNXlk == actionBar.DbNXlk && this.AYXKKw == actionBar.AYXKKw && this.isConnected == actionBar.isConnected && this.AEQbTJ == actionBar.AEQbTJ && this.djBIcL == actionBar.djBIcL && this.AhwBna == actionBar.AhwBna && this.gEmmrt == actionBar.gEmmrt && this.OLrzqt == actionBar.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((((((((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.values.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + java.lang.Long.hashCode(this.copydefault)) * 31) + java.lang.Long.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.DbNXlk)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Boolean.hashCode(this.isConnected)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + java.lang.Integer.hashCode(this.AhwBna)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isConnected() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NetworkData(coinUrl=" + this.KWHzl + ", chainName=" + this.EZpvd + ", symbol=" + this.values + ", originAsset=" + this.AkhnZx + ", chainId=" + this.copydefault + ", generalChainId=" + this.valueOf + ", isSupport=" + this.DbNXlk + ", isAll=" + this.AYXKKw + ", isSelect=" + this.isConnected + ", coinIcon=" + this.AEQbTJ + ", isHotNetwork=" + this.djBIcL + ", hotNetworkRank=" + this.AhwBna + ", isCustomer=" + this.gEmmrt + ", createFromUser=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean values() {
            return this.DbNXlk;
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j, long j2, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, boolean z5, boolean z6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.KWHzl = str;
            this.EZpvd = str2;
            this.values = str3;
            this.AkhnZx = str4;
            this.copydefault = j;
            this.valueOf = j2;
            this.DbNXlk = z;
            this.AYXKKw = z2;
            this.isConnected = z3;
            this.AEQbTJ = i;
            this.djBIcL = z4;
            this.AhwBna = i2;
            this.gEmmrt = z5;
            this.OLrzqt = z6;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (Long.MIN_VALUE long) : (r26v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r38v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (Long.MIN_VALUE long) : (r28v0 long))
  (r30v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0025: ARITH (r38v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002b: SGET  A[WRAPPED] o.wXj.TaskDescription.createSocket int) : (r33v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0030: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0039: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r36v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004b: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r37v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, boolean, boolean, boolean, int, boolean, int, boolean, boolean):void (m)] (LINE:445) call: o.faP.ActionBar.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, boolean, boolean, boolean, int, boolean, int, boolean, boolean):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, long j2, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, boolean z5, boolean z6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i3 & 16) != 0 ? Long.MIN_VALUE : j, (i3 & 32) != 0 ? Long.MIN_VALUE : j2, z, (i3 & 128) != 0 ? false : z2, (i3 & 256) != 0 ? false : z3, (i3 & 512) != 0 ? C52761wXj.TaskDescription.createSocket : i, (i3 & 1024) != 0 ? false : z4, (i3 & 2048) != 0 ? 0 : i2, (i3 & 4096) != 0 ? false : z5, (i3 & 8192) != 0 ? false : z6);
        }
    }

    private final boolean EZpvd() {
        return this.copydefault.size() <= this.KWHzl;
    }
}
