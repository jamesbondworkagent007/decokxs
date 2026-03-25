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
import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinSharedViewModel;
import com.okinc.dexkline.market.common.constants.RiskControlLevel;
import com.okinc.dexkline.market.features.coincheck.CoinCheckViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import o.mRX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mWg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32283mWg extends AbstractC32294mWr<oNR> implements mRX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.mWg$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Possible override for method o.mWr.AEQbTJ()V */
    @Override // o.mRX
    public int AEQbTJ() {
        return mRX.TaskDescription.copydefault(this);
    }

    public C32283mWg() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.dexkline.market.features.coincheck.CoinCheckFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.market.features.coincheck.CoinCheckFragment$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CoinCheckViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.coincheck.CoinCheckFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.coincheck.CoinCheckFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.coincheck.CoinCheckFragment$special$$inlined$viewModels$default$5
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinSharedViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.coincheck.CoinCheckFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.coincheck.CoinCheckFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.coincheck.CoinCheckFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.EZpvd = C34656ngH.EZpvd(this);
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.mWi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32283mWg.EZpvd(this.EZpvd);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.mWl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32283mWg.fJNWhG();
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mWm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32283mWg.AkhnZx();
            }
        });
    }

    /* JADX INFO: renamed from: o.mWg$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mWg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C32283mWg OLrzqt(TokenBase tokenBase, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C32283mWg c32283mWg = new C32283mWg();
            android.os.Bundle bundle = new android.os.Bundle();
            C34656ngH.AEQbTJ(bundle, str);
            bundle.putParcelable("data", tokenBase);
            c32283mWg.setArguments(bundle);
            return c32283mWg;
        }
    }

    public final CoinCheckViewModel AhwBna() {
        return (CoinCheckViewModel) this.AYXKKw.getValue();
    }

    private final MarketCoinSharedViewModel values() {
        return (MarketCoinSharedViewModel) this.AEQbTJ.getValue();
    }

    private final java.lang.String fetchVPNInfo() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    private final TokenBase fARcdN() {
        return (TokenBase) this.valueOf.getValue();
    }

    public static final TokenBase EZpvd(C32283mWg c32283mWg) {
        android.os.Bundle arguments = c32283mWg.getArguments();
        TokenBase tokenBase = arguments != null ? (TokenBase) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "data", TokenBase.class)) : null;
        if (tokenBase instanceof TokenBase) {
            return tokenBase;
        }
        return null;
    }

    private final C43316rmw DbNXlk() {
        return (C43316rmw) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw fJNWhG() {
        return new C43316rmw();
    }

    private final C43316rmw isConnected() {
        return (C43316rmw) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw AkhnZx() {
        return new C43316rmw();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.mRH
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public oNR KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        oNR onrKWHzl = oNR.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(onrKWHzl, "");
        return onrKWHzl;
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AEQbTJ(false);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.mRH
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull final oNR onr, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(onr, "");
        onr.AkhnZx.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.getNewProxyInstance);
        RecyclerView recyclerView = onr.fJNWhG;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        DbNXlk().register(C32250mVa.class, new C32234mUl(fetchVPNInfo()));
        recyclerView.setAdapter(DbNXlk());
        RecyclerView recyclerView2 = onr.values;
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 1, false));
        isConnected().register(C32250mVa.class, new C32234mUl(fetchVPNInfo()));
        recyclerView2.setAdapter(isConnected());
        AhwBna().OLrzqt().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.mWp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32283mWg.OLrzqt(onr, this, (C32296mWt) obj);
            }
        }));
        requestCoinCheckData$default(this, false, 1, null);
    }

    public static final Unit OLrzqt(oNR onr, final C32283mWg c32283mWg, C32296mWt c32296mWt) {
        if (c32296mWt.KWHzl()) {
            onr.isConnected.setVisibility(8);
            c32283mWg.EZpvd(true);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c32283mWg, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else if (c32296mWt.EZpvd()) {
            onr.isConnected.setVisibility(0);
        } else if (c32296mWt.copydefault() != null) {
            onr.isConnected.setVisibility(8);
            c32283mWg.EZpvd(false);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c32283mWg, true, (java.lang.String) null, 2, (java.lang.Object) null);
            C33546myW c33546myW = onr.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            C57589ylK.KWHzl(c33546myW, false);
            android.content.Context context = c32283mWg.getContext();
            if (context != null) {
                onr.valueOf.setImageTintList(android.content.res.ColorStateList.valueOf(mUM.EZpvd(context, (c32296mWt.copydefault().AEQbTJ().length() == 0 || Intrinsics.EZpvd((java.lang.Object) c32296mWt.copydefault().AEQbTJ(), (java.lang.Object) "0")) ? C52761wXj.Activity.QwvEab : C52761wXj.ActionBar.OuxcSI)));
                onr.AYXKKw.setImageTintList(android.content.res.ColorStateList.valueOf(mUM.EZpvd(context, (c32296mWt.copydefault().KWHzl().length() == 0 || Intrinsics.EZpvd((java.lang.Object) c32296mWt.copydefault().KWHzl(), (java.lang.Object) "0")) ? C52761wXj.Activity.QwvEab : C52761wXj.Activity.gdmIOq)));
            }
            android.widget.TextView textView = onr.hDKMBd;
            java.lang.String strAEQbTJ = c32296mWt.copydefault().AEQbTJ();
            if (strAEQbTJ.length() == 0) {
                strAEQbTJ = "--";
            }
            textView.setText(strAEQbTJ);
            android.widget.TextView textView2 = onr.uzCIH;
            java.lang.String strKWHzl = c32296mWt.copydefault().KWHzl();
            if (strKWHzl.length() == 0) {
                strKWHzl = "--";
            }
            textView2.setText(strKWHzl);
            android.widget.TextView textView3 = onr.fARcdN;
            java.lang.Float fFIwbmz = C59443zhD.fIwbmz(c32296mWt.copydefault().EZpvd());
            if (fFIwbmz == null) {
                textView3.setText("--");
                textView3.setTextColor(mUM.copydefault(C52761wXj.Activity.fdOvFl));
            } else if (fFIwbmz.floatValue() > 0.5f) {
                textView3.setText(C32163mRv.formatPercentWithoutSymbol$default(fFIwbmz.toString(), true, 0, null, false, null, 30, null));
                int i = C52761wXj.ActionBar.OuxcSI;
                android.content.Context context2 = textView3.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                textView3.setTextColor(mUM.EZpvd(i, context2));
            } else {
                textView3.setText(C32163mRv.formatPercentWithoutSymbol$default(fFIwbmz.toString(), true, 0, null, false, null, 30, null));
                textView3.setTextColor(mUM.copydefault(C52761wXj.Activity.fdOvFl));
            }
            android.widget.TextView textView4 = onr.wlaJM;
            java.lang.Float fFIwbmz2 = C59443zhD.fIwbmz(c32296mWt.copydefault().djBIcL());
            if (fFIwbmz2 == null) {
                textView4.setText("--");
                textView4.setTextColor(mUM.copydefault(C52761wXj.Activity.fdOvFl));
            } else if (fFIwbmz2.floatValue() >= 0.5f) {
                textView4.setText(C32163mRv.formatPercentWithoutSymbol$default(fFIwbmz2.toString(), true, 0, null, false, null, 30, null));
                int i2 = C52761wXj.ActionBar.OuxcSI;
                android.content.Context context3 = textView4.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                textView4.setTextColor(mUM.EZpvd(i2, context3));
            } else {
                textView4.setText(C32163mRv.formatPercentWithoutSymbol$default(fFIwbmz2.toString(), true, 0, null, false, null, 30, null));
                textView4.setTextColor(mUM.copydefault(C52761wXj.Activity.fdOvFl));
            }
            if (c32296mWt.copydefault().OLrzqt() == RiskControlLevel.UNKNOWN) {
                onr.zsXlph.setVisibility(8);
                onr.AuCTel.setVisibility(8);
                onr.fARcdN.setVisibility(8);
                onr.AubY.setVisibility(8);
                onr.wlaJM.setVisibility(8);
                onr.fetchVPNInfo.setVisibility(8);
                onr.AEQbTJ.setVisibility(0);
            } else {
                onr.zsXlph.setVisibility(0);
                onr.AuCTel.setVisibility(0);
                onr.fARcdN.setVisibility(0);
                onr.AubY.setVisibility(0);
                onr.wlaJM.setVisibility(0);
                onr.fetchVPNInfo.setVisibility(0);
                onr.AEQbTJ.setVisibility(8);
                c32283mWg.DbNXlk().AhwBna(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) c32296mWt.copydefault().AhwBna()));
            }
            if (c32296mWt.copydefault().copydefault().isEmpty()) {
                onr.fIwbmz.setVisibility(0);
                onr.values.setVisibility(8);
                onr.getFieldNames.setVisibility(8);
                onr.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.mWo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C32283mWg.copydefault(this.OLrzqt, view);
                    }
                });
            } else {
                c32283mWg.isConnected().AhwBna(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) c32296mWt.copydefault().copydefault()));
                onr.fIwbmz.setVisibility(8);
                onr.values.setVisibility(0);
                onr.getFieldNames.setVisibility(0);
            }
            onr.EZpvd.setDescription(C33070mpX.AYXKKw(C35964oKf.Fragment.ODCBUN));
            c32283mWg.values().OLrzqt(c32296mWt.copydefault());
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(C32283mWg c32283mWg, android.view.View view) {
        C32232mUj.Companion.copydefault().show(c32283mWg.getChildFragmentManager(), C56524yIo.AEQbTJ(C32232mUj.class).valueOf());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        oNR onr = (oNR) KWHzl();
        if (onr != null) {
            onr.ejfBZ.AhwBna(false);
            onr.ejfBZ.OLrzqt((InterfaceC57901yrE) new Application());
        }
    }

    /* JADX INFO: renamed from: o.mWg$Application */
    public static final class Application implements InterfaceC57901yrE {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57900yrD
        public void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        }

        public Application() {
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            C32283mWg.this.AEQbTJ(false);
        }
    }

    public static /* synthetic */ void requestCoinCheckData$default(C32283mWg c32283mWg, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c32283mWg.AEQbTJ(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(boolean z) {
        if (fARcdN() == null) {
            AhwBna().copydefault();
            return;
        }
        TokenBase tokenBaseFARcdN = fARcdN();
        if (tokenBaseFARcdN != null) {
            AhwBna().AEQbTJ(tokenBaseFARcdN.getTokenContractAddress(), tokenBaseFARcdN.getChainId(), z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd(boolean z) {
        NestedScrollView nestedScrollView;
        C55173xeu c55173xeu;
        NestedScrollView nestedScrollView2;
        C55173xeu c55173xeu2;
        if (z) {
            oNR onr = (oNR) KWHzl();
            if (onr != null && (c55173xeu2 = onr.copydefault) != null) {
                c55173xeu2.setVisibility(0);
                c55173xeu2.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.dpErvT));
                c55173xeu2.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C35964oKf.Fragment.RKcVTr));
                c55173xeu2.setRetry(C33070mpX.AYXKKw(C35964oKf.Fragment.AwvSrB));
                c55173xeu2.setEmptyTypeImage(8);
                c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.mWn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C32283mWg.EZpvd(this.EZpvd, view);
                    }
                });
            }
            oNR onr2 = (oNR) KWHzl();
            if (onr2 == null || (nestedScrollView2 = onr2.KWHzl) == null) {
                return;
            }
            nestedScrollView2.setVisibility(8);
            return;
        }
        oNR onr3 = (oNR) KWHzl();
        if (onr3 != null && (c55173xeu = onr3.copydefault) != null) {
            c55173xeu.setVisibility(8);
        }
        oNR onr4 = (oNR) KWHzl();
        if (onr4 == null || (nestedScrollView = onr4.KWHzl) == null) {
            return;
        }
        nestedScrollView.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(C32283mWg c32283mWg, android.view.View view) {
        C55113xdn c55113xdn;
        oNR onr = (oNR) c32283mWg.KWHzl();
        if (onr != null && (c55113xdn = onr.isConnected) != null) {
            c55113xdn.setVisibility(0);
        }
        TokenBase tokenBaseFARcdN = c32283mWg.fARcdN();
        if (tokenBaseFARcdN != null) {
            CoinCheckViewModel.loadCoinCheckData$default(c32283mWg.AhwBna(), tokenBaseFARcdN.getTokenContractAddress(), tokenBaseFARcdN.getChainId(), false, 4, null);
        }
    }
}
