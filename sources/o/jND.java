package o;

import android.view.View;
import androidx.core.os.BundleCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.market.features.coincheck.CoinCheckViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class jND extends jNM<hAN> {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm valueOf;

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    public jND() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.coincheck.CoinCheckFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.coincheck.CoinCheckFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CoinCheckViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coincheck.CoinCheckFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coincheck.CoinCheckFragment$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coincheck.CoinCheckFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.AEQbTJ = C31200lpY.copydefault(this);
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.jNC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jND.copydefault(this.copydefault);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.jNJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jND.gEmmrt();
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.jNI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jND.valueOf();
            }
        });
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jND.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final jND AEQbTJ(TokenBase tokenBase, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            jND jnd = new jND();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putParcelable("data", tokenBase);
            jnd.setArguments(bundle);
            return jnd;
        }
    }

    public final CoinCheckViewModel AYXKKw() {
        return (CoinCheckViewModel) this.AhwBna.getValue();
    }

    private final java.lang.String values() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    private final TokenBase fetchVPNInfo() {
        return (TokenBase) this.valueOf.getValue();
    }

    public static final TokenBase copydefault(jND jnd) {
        android.os.Bundle arguments = jnd.getArguments();
        TokenBase tokenBase = arguments != null ? (TokenBase) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "data", TokenBase.class)) : null;
        if (tokenBase instanceof TokenBase) {
            return tokenBase;
        }
        return null;
    }

    public final C43316rmw djBIcL() {
        return (C43316rmw) this.copydefault.getValue();
    }

    public static final C43316rmw gEmmrt() {
        return new C43316rmw();
    }

    public final C43316rmw AhwBna() {
        return (C43316rmw) this.EZpvd.getValue();
    }

    public static final C43316rmw valueOf() {
        return new C43316rmw();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public hAN KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hAN hanEZpvd = hAN.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hanEZpvd, "");
        return hanEZpvd;
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        OLrzqt(false);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull final hAN han, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(han, "");
        han.AhwBna.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
        RecyclerView recyclerView = han.fetchVPNInfo;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        djBIcL().register(C2296AGh.class, new hSQ(values()));
        recyclerView.setAdapter(djBIcL());
        RecyclerView recyclerView2 = han.values;
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 1, false));
        AhwBna().register(C2296AGh.class, new hSQ(values()));
        recyclerView2.setAdapter(AhwBna());
        AYXKKw().AEQbTJ().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.jNA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jND.EZpvd(han, this, (jNF) obj);
            }
        }));
        requestCoinCheckData$default(this, false, 1, null);
    }

    public static final Unit EZpvd(hAN han, jND jnd, jNF jnf) {
        if (jnf.EZpvd()) {
            han.AYXKKw.setVisibility(8);
            jnd.copydefault(true);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) jnd, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else if (jnf.OLrzqt()) {
            han.AYXKKw.setVisibility(0);
        } else if (jnf.copydefault() != null) {
            han.AYXKKw.setVisibility(8);
            jnd.copydefault(false);
            C33546myW c33546myW = han.isConnected;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            C57589ylK.KWHzl(c33546myW, false);
            android.content.Context context = jnd.getContext();
            if (context != null) {
                han.valueOf.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(context, (jnf.copydefault().AEQbTJ().length() == 0 || Intrinsics.EZpvd((java.lang.Object) jnf.copydefault().AEQbTJ(), (java.lang.Object) "0")) ? C52761wXj.Activity.QwvEab : C52761wXj.ActionBar.OuxcSI)));
                han.gEmmrt.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(context, (jnf.copydefault().EZpvd().length() == 0 || Intrinsics.EZpvd((java.lang.Object) jnf.copydefault().EZpvd(), (java.lang.Object) "0")) ? C52761wXj.Activity.QwvEab : C52761wXj.Activity.gdmIOq)));
            }
            android.widget.TextView textView = han.fIwbmz;
            java.lang.String strAEQbTJ = jnf.copydefault().AEQbTJ();
            if (strAEQbTJ.length() == 0) {
                strAEQbTJ = "--";
            }
            textView.setText(strAEQbTJ);
            android.widget.TextView textView2 = han.AuCTel;
            java.lang.String strEZpvd = jnf.copydefault().EZpvd();
            if (strEZpvd.length() == 0) {
                strEZpvd = "--";
            }
            textView2.setText(strEZpvd);
            android.widget.TextView textView3 = han.DbNXlk;
            java.lang.Float fFIwbmz = C59443zhD.fIwbmz(jnf.copydefault().KWHzl());
            if (fFIwbmz == null) {
                textView3.setText("--");
                textView3.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
            } else if (fFIwbmz.floatValue() > 0.5f) {
                textView3.setText(C23311hvo.formatPercentWithoutSymbol$default(fFIwbmz.toString(), true, 0, null, false, null, 30, null));
                int i = C52761wXj.ActionBar.OuxcSI;
                android.content.Context context2 = textView3.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                textView3.setTextColor(C25382ivf.copydefault(i, context2));
            } else {
                textView3.setText(C23311hvo.formatPercentWithoutSymbol$default(fFIwbmz.toString(), true, 0, null, false, null, 30, null));
                textView3.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
            }
            android.widget.TextView textView4 = han.uzCIH;
            java.lang.Float fFIwbmz2 = C59443zhD.fIwbmz(jnf.copydefault().djBIcL());
            if (fFIwbmz2 == null) {
                textView4.setText("--");
                textView4.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
            } else if (fFIwbmz2.floatValue() >= 0.5f) {
                textView4.setText(C23311hvo.formatPercentWithoutSymbol$default(fFIwbmz2.toString(), true, 0, null, false, null, 30, null));
                int i2 = C52761wXj.ActionBar.OuxcSI;
                android.content.Context context3 = textView4.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                textView4.setTextColor(C25382ivf.copydefault(i2, context3));
            } else {
                textView4.setText(C23311hvo.formatPercentWithoutSymbol$default(fFIwbmz2.toString(), true, 0, null, false, null, 30, null));
                textView4.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
            }
            if (jNK.EZpvd(jnf.copydefault().gEmmrt())) {
                han.getNewProxyInstance.setVisibility(8);
                han.fJNWhG.setVisibility(8);
                han.DbNXlk.setVisibility(8);
                han.iwGUEr.setVisibility(8);
                han.uzCIH.setVisibility(8);
                han.djBIcL.setVisibility(8);
                han.OLrzqt.setVisibility(0);
            } else {
                han.getNewProxyInstance.setVisibility(0);
                han.fJNWhG.setVisibility(0);
                han.DbNXlk.setVisibility(0);
                han.iwGUEr.setVisibility(0);
                han.uzCIH.setVisibility(0);
                han.djBIcL.setVisibility(0);
                han.OLrzqt.setVisibility(8);
                jnd.djBIcL().AhwBna(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) jnf.copydefault().AYXKKw()));
            }
            if (jnf.copydefault().OLrzqt().isEmpty()) {
                han.values.setVisibility(8);
                han.ejfBZ.setVisibility(8);
            } else {
                jnd.AhwBna().AhwBna(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) jnf.copydefault().OLrzqt()));
                han.values.setVisibility(0);
                han.ejfBZ.setVisibility(0);
            }
            jPJ.setDescription$default(han.AEQbTJ, C33070mpX.AYXKKw(C23274hvD.Fragment.fXG), false, 2, null);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) jnd, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        hAN han = (hAN) aX_();
        if (han != null) {
            han.isConnected.AhwBna(false);
            han.isConnected.OLrzqt((InterfaceC57901yrE) new TaskDescription());
        }
    }

    public static final class TaskDescription implements InterfaceC57901yrE {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57900yrD
        public void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        }

        public TaskDescription() {
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            jND.this.OLrzqt(false);
        }
    }

    public static /* synthetic */ void requestCoinCheckData$default(jND jnd, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        jnd.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        if (fetchVPNInfo() == null) {
            AYXKKw().OLrzqt();
            return;
        }
        TokenBase tokenBaseFetchVPNInfo = fetchVPNInfo();
        if (tokenBaseFetchVPNInfo != null) {
            AYXKKw().EZpvd(tokenBaseFetchVPNInfo.getTokenContractAddress(), tokenBaseFetchVPNInfo.getChainId(), z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(boolean z) {
        NestedScrollView nestedScrollView;
        C55173xeu c55173xeu;
        NestedScrollView nestedScrollView2;
        C55173xeu c55173xeu2;
        if (z) {
            hAN han = (hAN) aX_();
            if (han != null && (c55173xeu2 = han.EZpvd) != null) {
                c55173xeu2.setVisibility(0);
                c55173xeu2.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
                c55173xeu2.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu));
                c55173xeu2.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
                c55173xeu2.setEmptyTypeImage(8);
                c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.jNB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        jND.KWHzl(this.AEQbTJ, view);
                    }
                });
            }
            hAN han2 = (hAN) aX_();
            if (han2 == null || (nestedScrollView2 = han2.KWHzl) == null) {
                return;
            }
            nestedScrollView2.setVisibility(8);
            return;
        }
        hAN han3 = (hAN) aX_();
        if (han3 != null && (c55173xeu = han3.EZpvd) != null) {
            c55173xeu.setVisibility(8);
        }
        hAN han4 = (hAN) aX_();
        if (han4 == null || (nestedScrollView = han4.KWHzl) == null) {
            return;
        }
        nestedScrollView.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(jND jnd, android.view.View view) {
        C55113xdn c55113xdn;
        hAN han = (hAN) jnd.aX_();
        if (han != null && (c55113xdn = han.AYXKKw) != null) {
            c55113xdn.setVisibility(0);
        }
        TokenBase tokenBaseFetchVPNInfo = jnd.fetchVPNInfo();
        if (tokenBaseFetchVPNInfo != null) {
            CoinCheckViewModel.loadCoinCheckData$default(jnd.AYXKKw(), tokenBaseFetchVPNInfo.getTokenContractAddress(), tokenBaseFetchVPNInfo.getChainId(), false, 4, null);
        }
    }
}
