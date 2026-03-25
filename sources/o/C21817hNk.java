package o;

import android.view.View;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.SimpleFaqArticle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hNk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21817hNk extends AbstractC32996moC {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public C21495hBm AEQbTJ;
    public final C43316rmw KWHzl = new C43316rmw();
    public java.lang.String EZpvd = "Web3_DEX_SWAP";
    public java.lang.String OLrzqt = "default_trade";
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.hNr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C21817hNk.OLrzqt(this.copydefault);
        }
    });

    /* JADX INFO: renamed from: o.hNk$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    public final C22491hgP OLrzqt() {
        return (C22491hgP) this.AYXKKw.getValue();
    }

    public static final C22491hgP OLrzqt(C21817hNk c21817hNk) {
        return (C22491hgP) new ViewModelProvider(c21817hNk).get(C22491hgP.class);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.EZpvd = arguments.getString("swap_type", "Web3_DEX_SWAP");
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21495hBm c21495hBmAEQbTJ = C21495hBm.AEQbTJ(layoutInflater, viewGroup, false);
        this.AEQbTJ = c21495hBmAEQbTJ;
        if (c21495hBmAEQbTJ != null && (recyclerView = c21495hBmAEQbTJ.copydefault) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            this.KWHzl.register(SimpleFaqArticle.class, new C21823hNq(false, null, 3, null));
            recyclerView.setAdapter(this.KWHzl);
        }
        C21495hBm c21495hBm = this.AEQbTJ;
        if (c21495hBm != null) {
            return c21495hBm.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String variant;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C22491hgP c22491hgPOLrzqt = OLrzqt();
        java.lang.String str = this.OLrzqt;
        java.lang.String str2 = this.EZpvd;
        java.util.Locale localeDjBIcL = pSC.AEQbTJ.djBIcL();
        if (localeDjBIcL == null || (variant = localeDjBIcL.getVariant()) == null) {
            variant = java.util.Locale.ENGLISH.getVariant();
        }
        Intrinsics.copydefault((java.lang.Object) variant);
        c22491hgPOLrzqt.KWHzl(str, "1", str2, variant);
        OLrzqt().AEQbTJ().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.hNp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21817hNk.OLrzqt(this.AEQbTJ, (kotlin.Pair) obj);
            }
        }));
        OLrzqt().OLrzqt().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.hNs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21817hNk.copydefault(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit OLrzqt(final C21817hNk c21817hNk, kotlin.Pair pair) {
        C55173xeu c55173xeu;
        C55173xeu c55173xeu2;
        RecyclerView recyclerView;
        C55173xeu c55173xeu3;
        RecyclerView recyclerView2;
        C55173xeu c55173xeu4;
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c21817hNk.KWHzl.setItems((java.util.List) pair.getSecond());
            c21817hNk.KWHzl.notifyDataSetChanged();
            C21495hBm c21495hBm = c21817hNk.AEQbTJ;
            if (c21495hBm != null && (c55173xeu4 = c21495hBm.KWHzl) != null) {
                c55173xeu4.setVisibility(8);
            }
            C21495hBm c21495hBm2 = c21817hNk.AEQbTJ;
            if (c21495hBm2 != null && (recyclerView2 = c21495hBm2.copydefault) != null) {
                recyclerView2.setVisibility(0);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c21817hNk, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            C21495hBm c21495hBm3 = c21817hNk.AEQbTJ;
            if (c21495hBm3 != null && (c55173xeu3 = c21495hBm3.KWHzl) != null) {
                c55173xeu3.setVisibility(0);
            }
            C21495hBm c21495hBm4 = c21817hNk.AEQbTJ;
            if (c21495hBm4 != null && (recyclerView = c21495hBm4.copydefault) != null) {
                recyclerView.setVisibility(8);
            }
            C21495hBm c21495hBm5 = c21817hNk.AEQbTJ;
            if (c21495hBm5 != null && (c55173xeu2 = c21495hBm5.KWHzl) != null) {
                java.lang.String string = c21817hNk.getString(C23274hvD.Fragment.EZpvd);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c55173xeu2.setRetry(string);
            }
            C21495hBm c21495hBm6 = c21817hNk.AEQbTJ;
            if (c21495hBm6 != null && (c55173xeu = c21495hBm6.KWHzl) != null) {
                c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.hNo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C21817hNk.AEQbTJ(this.AEQbTJ, view);
                    }
                });
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c21817hNk, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C21817hNk c21817hNk, android.view.View view) {
        java.lang.String variant;
        C22491hgP c22491hgPOLrzqt = c21817hNk.OLrzqt();
        java.lang.String str = c21817hNk.OLrzqt;
        java.lang.String str2 = c21817hNk.EZpvd;
        java.util.Locale localeDjBIcL = pSC.AEQbTJ.djBIcL();
        if (localeDjBIcL == null || (variant = localeDjBIcL.getVariant()) == null) {
            variant = java.util.Locale.ENGLISH.getVariant();
        }
        Intrinsics.copydefault((java.lang.Object) variant);
        c22491hgPOLrzqt.KWHzl(str, "1", str2, variant);
    }

    public static final Unit copydefault(C21817hNk c21817hNk, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c21817hNk.showLoading();
        } else {
            c21817hNk.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        releaseLoading();
    }

    /* JADX INFO: renamed from: o.hNk$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hNk.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C21817hNk EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C21817hNk c21817hNk = new C21817hNk();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("swap_type", str);
            c21817hNk.setArguments(bundle);
            return c21817hNk;
        }
    }
}
