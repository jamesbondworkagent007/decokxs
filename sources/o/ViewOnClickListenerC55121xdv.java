package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC55124xdy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class ViewOnClickListenerC55121xdv extends BottomSheetDialogFragment implements View.OnClickListener {
    public java.lang.CharSequence AEQbTJ;
    public boolean AYXKKw;
    public Function1<? super java.lang.String[], Unit> AhwBna;
    public java.lang.CharSequence AkhnZx;
    public java.lang.String[] AuCTel = {""};
    public Function1<? super android.view.View, Unit> DbNXlk;
    public java.lang.CharSequence EZpvd;
    public int KWHzl;
    public wZY OLrzqt;
    public int copydefault;
    public Function1<? super android.net.Uri, Unit> djBIcL;
    public int ejfBZ;
    public java.lang.CharSequence fARcdN;
    public Function1<? super android.view.View, Unit> fIwbmz;
    public android.net.Uri fJNWhG;
    public int fetchVPNInfo;
    public Function1<? super android.net.Uri, Unit> gEmmrt;
    public Function1<? super android.view.View, Unit> isConnected;
    public Function1<? super android.net.Uri, Unit> valueOf;
    public InterfaceC55124xdy values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.CharSequence AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(int i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(java.lang.CharSequence charSequence) {
        this.fARcdN = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(Function1<? super android.net.Uri, Unit> function1) {
        this.valueOf = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String[], kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String[], kotlin.Unit> */
    public Function1<java.lang.String[], Unit> AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit>, kotlin.jvm.functions.Function1<android.net.Uri, kotlin.Unit> */
    public Function1<android.net.Uri, Unit> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.CharSequence AkhnZx() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit>, kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> */
    public Function1<android.view.View, Unit> DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(Function1<? super android.net.Uri, Unit> function1) {
        this.gEmmrt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(java.lang.CharSequence charSequence) {
        this.AEQbTJ = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(Function1<? super android.view.View, Unit> function1) {
        this.isConnected = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit>, kotlin.jvm.functions.Function1<android.net.Uri, kotlin.Unit> */
    public Function1<android.net.Uri, Unit> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(int i) {
        this.fetchVPNInfo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(java.lang.CharSequence charSequence) {
        this.EZpvd = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(Function1<? super android.net.Uri, Unit> function1) {
        this.djBIcL = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.CharSequence copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(int i) {
        this.ejfBZ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(java.lang.CharSequence charSequence) {
        this.AkhnZx = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(Function1<? super java.lang.String[], Unit> function1) {
        this.AhwBna = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        this.AuCTel = strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit>, kotlin.jvm.functions.Function1<android.net.Uri, kotlin.Unit> */
    public Function1<android.net.Uri, Unit> djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void djBIcL(Function1<? super android.view.View, Unit> function1) {
        this.DbNXlk = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String[] ejfBZ() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.net.Uri fJNWhG() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int fetchVPNInfo() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.CharSequence gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void gEmmrt(Function1<? super android.view.View, Unit> function1) {
        this.fIwbmz = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit>, kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> */
    public Function1<android.view.View, Unit> isConnected() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int valueOf() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit>, kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> */
    public Function1<android.view.View, Unit> values() {
        return this.DbNXlk;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
        this.values = InterfaceC55124xdy.Companion.EZpvd(this);
        setStyle(0, C52761wXj.LoaderManager.AuCTelauCTel);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.widget.LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.OLrzqt = wZY.AEQbTJ(layoutInflater);
        C55280xgv c55280xgv = new C55280xgv();
        C55279xgu c55279xgu = new C55279xgu();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c55279xgu.AEQbTJ(C55298xhM.EZpvd(10.0f, (android.content.Context) fragmentActivityRequireActivity));
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
        c55279xgu.KWHzl(C55298xhM.EZpvd(10.0f, (android.content.Context) fragmentActivityRequireActivity2));
        c55279xgu.isConnected(ContextCompat.getColor(requireActivity(), C52761wXj.Activity.registerUser));
        wZY wzy = this.OLrzqt;
        if (wzy != null && (linearLayout = wzy.AEQbTJ) != null) {
            c55280xgv.KWHzl(linearLayout, c55279xgu);
        }
        wZY wzy2 = this.OLrzqt;
        if (wzy2 != null) {
            return wzy2.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        wZY wzy = this.OLrzqt;
        if (wzy != null) {
            if (valueOf() != 0) {
                wzy.EZpvd.setText(valueOf());
            } else if (C33129mqd.OLrzqt(gEmmrt())) {
                wzy.EZpvd.setText(gEmmrt());
            }
            if (fetchVPNInfo() != 0) {
                wzy.KWHzl.setText(fetchVPNInfo());
            } else if (C33129mqd.OLrzqt(AkhnZx())) {
                wzy.KWHzl.setText(AkhnZx());
            }
            if (EZpvd() != 0) {
                wzy.copydefault.setText(EZpvd());
            } else if (C33129mqd.OLrzqt(AEQbTJ())) {
                wzy.copydefault.setText(AEQbTJ());
            }
            if (KWHzl() != 0) {
                wzy.OLrzqt.setText(KWHzl());
            } else if (C33129mqd.OLrzqt(copydefault())) {
                wzy.OLrzqt.setText(copydefault());
            }
            wzy.OLrzqt.setOnClickListener(this);
            wzy.KWHzl.setOnClickListener(this);
            wzy.EZpvd.setOnClickListener(this);
            wzy.copydefault.setOnClickListener(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        wZY wzy;
        android.widget.TextView textView;
        super.onResume();
        if (!this.AYXKKw || (wzy = this.OLrzqt) == null || (textView = wzy.copydefault) == null) {
            return;
        }
        textView.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        if (view != null) {
            Function1<? super java.lang.String[], Unit> function1 = new Function1() { // from class: o.xdu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC55121xdv.EZpvd(this.copydefault, (java.lang.String[]) obj);
                }
            };
            wZY wzy = this.OLrzqt;
            InterfaceC55124xdy interfaceC55124xdy = null;
            if (Intrinsics.EZpvd(view, wzy != null ? wzy.EZpvd : null)) {
                Function1<android.view.View, Unit> function1Values = values();
                if (function1Values != null) {
                    function1Values.invoke(view);
                }
                Function1<? super android.net.Uri, Unit> function12 = new Function1() { // from class: o.xdz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC55121xdv.copydefault(this.copydefault, (android.net.Uri) obj);
                    }
                };
                InterfaceC55124xdy interfaceC55124xdy2 = this.values;
                if (interfaceC55124xdy2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    interfaceC55124xdy = interfaceC55124xdy2;
                }
                android.content.Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                interfaceC55124xdy.KWHzl(context, function12, function1);
                Unit unit = Unit.INSTANCE;
                return;
            }
            wZY wzy2 = this.OLrzqt;
            if (!Intrinsics.EZpvd(view, wzy2 != null ? wzy2.KWHzl : null)) {
                wZY wzy3 = this.OLrzqt;
                if (Intrinsics.EZpvd(view, wzy3 != null ? wzy3.copydefault : null)) {
                    Function1<android.view.View, Unit> function1DbNXlk = DbNXlk();
                    if (function1DbNXlk != null) {
                        function1DbNXlk.invoke(view);
                    }
                    Function1<? super android.net.Uri, Unit> function13 = new Function1() { // from class: o.xdB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ViewOnClickListenerC55121xdv.AYXKKw(this.KWHzl, (android.net.Uri) obj);
                        }
                    };
                    InterfaceC55124xdy interfaceC55124xdy3 = this.values;
                    if (interfaceC55124xdy3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        interfaceC55124xdy = interfaceC55124xdy3;
                    }
                    android.content.Context context2 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    interfaceC55124xdy.EZpvd(context2, ejfBZ(), function13);
                    Unit unit2 = Unit.INSTANCE;
                    return;
                }
                dismissAllowingStateLoss();
                Unit unit3 = Unit.INSTANCE;
                return;
            }
            Function1<android.view.View, Unit> function1IsConnected = isConnected();
            if (function1IsConnected != null) {
                function1IsConnected.invoke(view);
            }
            Function1<? super android.net.Uri, Unit> function14 = new Function1() { // from class: o.xdA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC55121xdv.AEQbTJ(this.KWHzl, (android.net.Uri) obj);
                }
            };
            android.net.Uri uriFJNWhG = fJNWhG();
            if (uriFJNWhG != null) {
                InterfaceC55124xdy interfaceC55124xdy4 = this.values;
                if (interfaceC55124xdy4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    interfaceC55124xdy = interfaceC55124xdy4;
                }
                android.content.Context context3 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                interfaceC55124xdy.KWHzl(context3, uriFJNWhG, function14, function1);
                return;
            }
            InterfaceC55124xdy interfaceC55124xdy5 = this.values;
            if (interfaceC55124xdy5 == null) {
                Intrinsics.gEmmrt("");
                interfaceC55124xdy5 = null;
            }
            android.content.Context context4 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            InterfaceC55124xdy.StateListAnimator.takePicture$default(interfaceC55124xdy5, context4, null, function14, function1, 2, null);
            Unit unit4 = Unit.INSTANCE;
        }
    }

    public static final Unit EZpvd(ViewOnClickListenerC55121xdv viewOnClickListenerC55121xdv, java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Function1<java.lang.String[], Unit> function1AYXKKw = viewOnClickListenerC55121xdv.AYXKKw();
        if (function1AYXKKw != null) {
            function1AYXKKw.invoke(strArr);
        }
        viewOnClickListenerC55121xdv.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ViewOnClickListenerC55121xdv viewOnClickListenerC55121xdv, android.net.Uri uri) {
        Function1<android.net.Uri, Unit> function1AhwBna = viewOnClickListenerC55121xdv.AhwBna();
        if (function1AhwBna != null) {
            function1AhwBna.invoke(uri);
        }
        viewOnClickListenerC55121xdv.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC55121xdv viewOnClickListenerC55121xdv, android.net.Uri uri) {
        Function1<android.net.Uri, Unit> function1DjBIcL = viewOnClickListenerC55121xdv.djBIcL();
        if (function1DjBIcL != null) {
            function1DjBIcL.invoke(uri);
        }
        viewOnClickListenerC55121xdv.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(ViewOnClickListenerC55121xdv viewOnClickListenerC55121xdv, android.net.Uri uri) {
        Function1<android.net.Uri, Unit> function1OLrzqt = viewOnClickListenerC55121xdv.OLrzqt();
        if (function1OLrzqt != null) {
            function1OLrzqt.invoke(uri);
        }
        viewOnClickListenerC55121xdv.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        show(fragmentManager, getClass().getName());
    }
}
