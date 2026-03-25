package o;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew;
import com.okinc.business.defi.wallet.tx.history.CustomCoinDetailFragment$initRecycleview$1$2$5;
import com.okinc.business.defi.wallet.tx.history.CustomCoinDetailFragment$initRecycleview$1$2$8;
import com.okinc.business.dex.api.bean.TradeDetails;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC10049bhC;
import o.C13754dXa;
import o.C14140dfo;
import o.C19595gIe;
import o.C8039avH;
import o.gAC;
import o.gAD;
import o.gAM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gAM extends AbstractC32998moE {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final C43316rmw KWHzl;
    public AbstractC16586emi OLrzqt;
    public boolean copydefault;
    public final int djBIcL = C13754dXa.TaskDescription.awiJhF;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.gAO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return gAM.copydefault(this.KWHzl);
        }
    });

    public static final /* synthetic */ class FragmentManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(Function1 function1) {
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

    public static final class LoaderManager implements InterfaceC54859xXz {
        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public gAM() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.tx.history.CustomCoinDetailFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.tx.history.CustomCoinDetailFragment$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C15513eLc.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.history.CustomCoinDetailFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.history.CustomCoinDetailFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tx.history.CustomCoinDetailFragment$special$$inlined$viewModels$default$5
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
        this.KWHzl = new C43316rmw();
        this.copydefault = true;
    }

    public final C19504gEv KWHzl() {
        return (C19504gEv) this.AEQbTJ.getValue();
    }

    public static final C19504gEv copydefault(gAM gam) {
        return (C19504gEv) new ViewModelProvider(gam).get(C19504gEv.class);
    }

    private final C15513eLc OLrzqt() {
        return (C15513eLc) this.AYXKKw.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC16586emi abstractC16586emi = (AbstractC16586emi) DataBindingUtil.bind(view);
        if (abstractC16586emi == null) {
            return;
        }
        this.OLrzqt = abstractC16586emi;
        copydefault();
        AYXKKw();
        AEQbTJ();
        AhwBna();
        EZpvd();
    }

    public final void EZpvd() {
        KWHzl().fetchVPNInfo();
        KWHzl().AkhnZx();
    }

    private final void copydefault() {
        AbstractC16586emi abstractC16586emi = this.OLrzqt;
        AbstractC16586emi abstractC16586emi2 = null;
        if (abstractC16586emi == null) {
            Intrinsics.gEmmrt("");
            abstractC16586emi = null;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(abstractC16586emi.values);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.gAV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gAM.AYXKKw(this.copydefault, obj);
            }
        });
        AbstractC16586emi abstractC16586emi3 = this.OLrzqt;
        if (abstractC16586emi3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16586emi3 = null;
        }
        C8003auW.copydefault(abstractC16586emi3.AhwBna).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.gAS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gAM.valueOf(this.OLrzqt, obj);
            }
        });
        AbstractC16586emi abstractC16586emi4 = this.OLrzqt;
        if (abstractC16586emi4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16586emi4 = null;
        }
        C8003auW.copydefault(abstractC16586emi4.KWHzl).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.gAT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gAM.AhwBna(this.EZpvd, obj);
            }
        });
        AbstractC16586emi abstractC16586emi5 = this.OLrzqt;
        if (abstractC16586emi5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16586emi2 = abstractC16586emi5;
        }
        C8003auW.copydefault(abstractC16586emi2.valueOf).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.gAW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gAM.EZpvd(this.AEQbTJ, obj);
            }
        });
        KWHzl().AYXKKw().observe(this, new FragmentManager(new Function1() { // from class: o.gBa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gAM.copydefault(this.EZpvd, (java.util.List) obj);
            }
        }));
        KWHzl().AhwBna().observe(this, new FragmentManager(new Function1() { // from class: o.gBb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gAM.copydefault(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        KWHzl().AEQbTJ().observe(getViewLifecycleOwner(), new FragmentManager(new Function1() { // from class: o.gAY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gAM.KWHzl(this.KWHzl, (C10594brR) obj);
            }
        }));
        KWHzl().copydefault().observe(getViewLifecycleOwner(), new FragmentManager(new Function1() { // from class: o.gAX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gAM.EZpvd(this.EZpvd, (java.lang.String) obj);
            }
        }));
        KWHzl().valueOf().observe(getViewLifecycleOwner(), new FragmentManager(new Function1() { // from class: o.gBc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gAM.EZpvd(this.copydefault, (java.util.List) obj);
            }
        }));
        OLrzqt().KWHzl().observe(getViewLifecycleOwner(), new FragmentManager(new Function1() { // from class: o.gBf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gAM.OLrzqt(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        KWHzl().djBIcL().observe(getViewLifecycleOwner(), new FragmentManager(new Function1() { // from class: o.gAU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gAM.djBIcL(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final void AYXKKw(final gAM gam, java.lang.Object obj) {
        gam.KWHzl().AEQbTJ(true, new Function1() { // from class: o.gBd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return gAM.OLrzqt(this.KWHzl, (AbstractC12782ctV) obj2);
            }
        });
    }

    public static final Unit OLrzqt(final gAM gam, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            if (gam.getContext() != null) {
                C15715eSp c15715eSp = C15715eSp.AEQbTJ;
                android.content.Context contextRequireContext = gam.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                if (C15715eSp.dealWithMpcExceptionStatus$default(c15715eSp, abstractC12782ctV, contextRequireContext, null, 4, null)) {
                    return Unit.INSTANCE;
                }
            }
            if (abstractC12782ctV.QfsBiF()) {
                C55326xho.toast$default(C13754dXa.FragmentManager.HJWChPfvRMlC, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            } else if (abstractC12782ctV.zsXlph()) {
                gam.djBIcL();
            } else if (abstractC12782ctV.zLjUOn()) {
                C20690gle.OLrzqt.KWHzl((106 & 1) != 0 ? null : gam, (106 & 2) != 0 ? null : null, gam.KWHzl().DbNXlk(), (106 & 8) != 0 ? null : java.lang.Long.valueOf(gam.KWHzl().EZpvd()), gam.KWHzl().KWHzl(), (106 & 32) != 0 ? null : null, (106 & 64) != 0 ? false : false, (106 & 128) != 0 ? null : new Function1() { // from class: o.gAQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return gAM.AEQbTJ(this.KWHzl, (android.os.Bundle) obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(gAM gam, android.os.Bundle bundle) {
        if (bundle != null && bundle.getBoolean("send_coin_status")) {
            refreshCoinHistory$default(gam, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(final gAM gam, java.lang.Object obj) {
        gam.KWHzl().AEQbTJ(true, new Function1() { // from class: o.gAZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return gAM.AYXKKw(this.EZpvd, (AbstractC12782ctV) obj2);
            }
        });
    }

    public static final Unit AYXKKw(gAM gam, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            if (gam.getContext() != null) {
                C15715eSp c15715eSp = C15715eSp.AEQbTJ;
                android.content.Context contextRequireContext = gam.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                if (C15715eSp.dealWithMpcExceptionStatus$default(c15715eSp, abstractC12782ctV, contextRequireContext, null, 4, null)) {
                    return Unit.INSTANCE;
                }
            }
            if (abstractC12782ctV.zsXlph()) {
                gam.djBIcL();
            } else if (abstractC12782ctV.zLjUOn()) {
                C20690gle.OLrzqt.EZpvd((10 & 1) != 0 ? null : gam, (10 & 2) != 0 ? null : null, gam.KWHzl().DbNXlk(), (10 & 8) != 0 ? null : java.lang.Long.valueOf(gam.KWHzl().EZpvd()), (10 & 16) != 0 ? false : false, "", (10 & 64) != 0 ? null : null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(gAM gam, java.lang.Object obj) {
        C10594brR value;
        CustomChainCoinMeta customChainCoinMetaFetchVPNInfo;
        CustomChainMeta customChainMetaOLrzqt;
        java.lang.String strAYXKKw;
        MutableLiveData<C10594brR> mutableLiveDataAEQbTJ = gam.KWHzl().AEQbTJ();
        if (mutableLiveDataAEQbTJ == null || (value = mutableLiveDataAEQbTJ.getValue()) == null || (customChainCoinMetaFetchVPNInfo = value.fetchVPNInfo()) == null || (customChainMetaOLrzqt = customChainCoinMetaFetchVPNInfo.OLrzqt()) == null || (strAYXKKw = customChainMetaOLrzqt.AYXKKw()) == null) {
            return;
        }
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", strAYXKKw), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context context = gam.getContext();
        if (context == null) {
            return;
        }
        WebActivity.TaskDescription.openPage$default(taskDescription, context, bundleBundleOf, null, 4, null);
    }

    public static final void EZpvd(final gAM gam, java.lang.Object obj) {
        gam.KWHzl().AEQbTJ(false, new Function1() { // from class: o.gBh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return gAM.EZpvd(this.OLrzqt, (AbstractC12782ctV) obj2);
            }
        });
    }

    public static final Unit EZpvd(gAM gam, AbstractC12782ctV abstractC12782ctV) {
        if (gam.getContext() != null && abstractC12782ctV != null) {
            C15715eSp c15715eSp = C15715eSp.AEQbTJ;
            android.content.Context contextRequireContext = gam.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            if (C15715eSp.dealWithMpcExceptionStatus$default(c15715eSp, abstractC12782ctV, contextRequireContext, null, 4, null)) {
                return Unit.INSTANCE;
            }
        }
        if (abstractC12782ctV != null && abstractC12782ctV.zLjUOn()) {
            java.lang.Object systemService = gam.requireActivity().getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(null, gam.KWHzl().copydefault().getValue()));
            C19595gIe.StateListAnimator stateListAnimator = C19595gIe.Companion;
            java.lang.String value = gam.KWHzl().copydefault().getValue();
            C19595gIe.StateListAnimator.newInstance$default(stateListAnimator, null, value != null ? value : "", 1, null).KWHzl(gam.getContext());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(gAM gam, java.util.List list) {
        if (list == null) {
            return Unit.INSTANCE;
        }
        AbstractC16586emi abstractC16586emi = gam.OLrzqt;
        if (abstractC16586emi == null) {
            Intrinsics.gEmmrt("");
            abstractC16586emi = null;
        }
        abstractC16586emi.AkhnZx.setNestedScrollingEnabled(((CollectionsKt___CollectionsKt.firstOrNull(list) instanceof C14316djE) || (CollectionsKt___CollectionsKt.firstOrNull(list) instanceof C14317djF)) ? false : true);
        gam.KWHzl.setItems(list);
        gam.KWHzl.notifyDataSetChanged();
        AbstractC16586emi abstractC16586emi2 = gam.OLrzqt;
        if (abstractC16586emi2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16586emi2 = null;
        }
        abstractC16586emi2.DbNXlk.AEQbTJ();
        AbstractC16586emi abstractC16586emi3 = gam.OLrzqt;
        if (abstractC16586emi3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16586emi3 = null;
        }
        abstractC16586emi3.DbNXlk.valueOf();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) gam, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(gAM gam, java.lang.Boolean bool) {
        if (bool == null) {
            return Unit.INSTANCE;
        }
        AbstractC16586emi abstractC16586emi = gam.OLrzqt;
        if (abstractC16586emi == null) {
            Intrinsics.gEmmrt("");
            abstractC16586emi = null;
        }
        abstractC16586emi.DbNXlk.OLrzqt(!bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(gAM gam, C10594brR c10594brR) {
        if (c10594brR != null) {
            AbstractC16586emi abstractC16586emi = gam.OLrzqt;
            AbstractC16586emi abstractC16586emi2 = null;
            if (abstractC16586emi == null) {
                Intrinsics.gEmmrt("");
                abstractC16586emi = null;
            }
            abstractC16586emi.copydefault.setCoinCount(C54870xYj.EZpvd(c10594brR.values(), c10594brR.KWHzl().valueOf(), c10594brR.KWHzl().AkhnZx(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null), c10594brR.KWHzl().fJNWhG());
            AbstractC16586emi abstractC16586emi3 = gam.OLrzqt;
            if (abstractC16586emi3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16586emi3 = null;
            }
            abstractC16586emi3.copydefault.EZpvd();
            AbstractC16586emi abstractC16586emi4 = gam.OLrzqt;
            if (abstractC16586emi4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16586emi4 = null;
            }
            android.widget.TextView textView = abstractC16586emi4.KWHzl;
            CustomChainMeta customChainMetaOLrzqt = c10594brR.fetchVPNInfo().OLrzqt();
            boolean z = false;
            textView.setVisibility((C33129mqd.OLrzqt((java.lang.CharSequence) (customChainMetaOLrzqt != null ? customChainMetaOLrzqt.AYXKKw() : null)) && c10594brR.fetchVPNInfo().fJNWhG()) ? 0 : 8);
            AbstractC16586emi abstractC16586emi5 = gam.OLrzqt;
            if (abstractC16586emi5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16586emi5 = null;
            }
            abstractC16586emi5.values.setEnabled((c10594brR.DbNXlk().QfsBiF() || c10594brR.DbNXlk().DCUTEIdCUTEI()) ? false : true);
            AbstractC16586emi abstractC16586emi6 = gam.OLrzqt;
            if (abstractC16586emi6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16586emi6 = null;
            }
            abstractC16586emi6.AhwBna.setEnabled(!c10594brR.DbNXlk().DCUTEIdCUTEI());
            AbstractC16586emi abstractC16586emi7 = gam.OLrzqt;
            if (abstractC16586emi7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16586emi2 = abstractC16586emi7;
            }
            android.widget.TextView textView2 = abstractC16586emi2.valueOf;
            if (c10594brR.DbNXlk().zLjUOn() && (!c10594brR.DbNXlk().ORxRYg() || !c10594brR.DbNXlk().DCUTEIdCUTEI())) {
                z = true;
            }
            textView2.setEnabled(z);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(gAM gam, java.lang.String str) {
        AbstractC12782ctV abstractC12782ctVDbNXlk;
        AbstractC16586emi abstractC16586emi = null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            AbstractC16586emi abstractC16586emi2 = gam.OLrzqt;
            if (abstractC16586emi2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16586emi2 = null;
            }
            android.widget.TextView textView = abstractC16586emi2.isConnected;
            C10594brR value = gam.KWHzl().AEQbTJ().getValue();
            if (value == null || (abstractC12782ctVDbNXlk = value.DbNXlk()) == null || !abstractC12782ctVDbNXlk.zLjUOn()) {
                str = C14079deg.getAddressStr$default(C14079deg.EZpvd, str, false, 2, null);
            }
            textView.setText(str);
        } else {
            AbstractC16586emi abstractC16586emi3 = gam.OLrzqt;
            if (abstractC16586emi3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16586emi = abstractC16586emi3;
            }
            abstractC16586emi.isConnected.setVisibility(4);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(gAM gam, java.util.List list) {
        AbstractC16586emi abstractC16586emi = gam.OLrzqt;
        AbstractC16586emi abstractC16586emi2 = null;
        if (abstractC16586emi == null) {
            Intrinsics.gEmmrt("");
            abstractC16586emi = null;
        }
        abstractC16586emi.gEmmrt.setVisibility((list == null || list.isEmpty()) ? 8 : 0);
        AbstractC16586emi abstractC16586emi3 = gam.OLrzqt;
        if (abstractC16586emi3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16586emi2 = abstractC16586emi3;
        }
        C21321gxZ c21321gxZ = abstractC16586emi2.gEmmrt;
        androidx.fragment.app.FragmentManager parentFragmentManager = gam.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c21321gxZ.copydefault(parentFragmentManager, list);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(gAM gam, java.lang.Boolean bool) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            gam.KWHzl().AkhnZx();
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(gAM gam, java.lang.Boolean bool) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            gam.OLrzqt().copydefault();
        }
        return Unit.INSTANCE;
    }

    private final void djBIcL() {
        C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        instance$default.EZpvd(childFragmentManager, new LoaderManager(), 1);
    }

    public final void AEQbTJ() {
        AbstractC16586emi abstractC16586emi = this.OLrzqt;
        AbstractC16586emi abstractC16586emi2 = null;
        if (abstractC16586emi == null) {
            Intrinsics.gEmmrt("");
            abstractC16586emi = null;
        }
        abstractC16586emi.AkhnZx.setNestedScrollingEnabled(false);
        AbstractC16586emi abstractC16586emi3 = this.OLrzqt;
        if (abstractC16586emi3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16586emi3 = null;
        }
        RecyclerView recyclerView = abstractC16586emi3.AkhnZx;
        android.content.Context context = getContext();
        if (context != null) {
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
            recyclerView.addItemDecoration(new C8039avH(new StateListAnimator(new gAI(), context)));
            C43316rmw c43316rmw = this.KWHzl;
            c43316rmw.register(CoinAndAddressHistoryDetail.class).copydefault(new gAD(new ActionBar()), new gAC(new Activity())).AEQbTJ(new InterfaceC59531zim() { // from class: o.gBg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC59531zim
                public final int OLrzqt(int i, java.lang.Object obj) {
                    return gAM.AEQbTJ(i, (CoinAndAddressHistoryDetail) obj);
                }
            });
            c43316rmw.register(C14316djE.class, new TaskDescription(context, this, CustomCoinDetailFragment$initRecycleview$1$2$5.INSTANCE));
            c43316rmw.register(C14318djG.class, new Dialog(C13754dXa.TaskDescription.OAUGar));
            c43316rmw.register(C14317djF.class, new Fragment(context, CustomCoinDetailFragment$initRecycleview$1$2$8.INSTANCE));
            c43316rmw.register(C14322djK.class, new PendingIntent(C13754dXa.TaskDescription.FF));
            recyclerView.setAdapter(c43316rmw);
        }
        C15513eLc c15513eLcOLrzqt = OLrzqt();
        AbstractC16586emi abstractC16586emi4 = this.OLrzqt;
        if (abstractC16586emi4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16586emi2 = abstractC16586emi4;
        }
        RecyclerView recyclerView2 = abstractC16586emi2.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        c15513eLcOLrzqt.copydefault(recyclerView2);
    }

    public static final CoinAndAddressHistoryDetail copydefault(gAM gam, int i) {
        java.lang.Object objAEQbTJ = gam.KWHzl.AEQbTJ(i);
        if (objAEQbTJ instanceof CoinAndAddressHistoryDetail) {
            return (CoinAndAddressHistoryDetail) objAEQbTJ;
        }
        return null;
    }

    public static final class StateListAnimator implements C8039avH.ActionBar<CoinDetailFragmentNew.TaskDescription> {
        public final /* synthetic */ android.content.Context EZpvd;
        public final /* synthetic */ gAI KWHzl;

        public StateListAnimator(gAI gai, android.content.Context context) {
            this.KWHzl = gai;
            this.EZpvd = context;
        }

        @Override // o.C8039avH.ActionBar
        public long EZpvd(int i) {
            CoinAndAddressHistoryDetail coinAndAddressHistoryDetailCopydefault = gAM.copydefault(gAM.this, i);
            java.lang.Long lValueOf = coinAndAddressHistoryDetailCopydefault != null ? java.lang.Long.valueOf(coinAndAddressHistoryDetailCopydefault.getTxTime()) : null;
            CoinAndAddressHistoryDetail coinAndAddressHistoryDetailCopydefault2 = gAM.copydefault(gAM.this, i);
            boolean z = coinAndAddressHistoryDetailCopydefault2 != null && coinAndAddressHistoryDetailCopydefault2.isShowPending();
            int iCopydefault = gAM.this.KWHzl().copydefault(gAM.copydefault(gAM.this, i));
            if (lValueOf == null || lValueOf.longValue() == 0 || z || iCopydefault == 0 || iCopydefault == 1 || iCopydefault == 2 || iCopydefault == 3) {
                return i < gAM.this.KWHzl.getItemCount() - 1 ? 1000L : -1L;
            }
            return this.KWHzl.KWHzl(lValueOf.longValue());
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.C8039avH.ActionBar
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public CoinDetailFragmentNew.TaskDescription OLrzqt(android.view.ViewGroup viewGroup) {
            ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(this.EZpvd), C13754dXa.TaskDescription.sCB, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
            return new CoinDetailFragmentNew.TaskDescription((AbstractC16741epe) viewDataBindingInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // o.C8039avH.ActionBar
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void KWHzl(CoinDetailFragmentNew.TaskDescription taskDescription, int i) {
            CoinAndAddressHistoryDetail coinAndAddressHistoryDetailCopydefault = gAM.copydefault(gAM.this, i);
            java.lang.Long lValueOf = coinAndAddressHistoryDetailCopydefault != null ? java.lang.Long.valueOf(coinAndAddressHistoryDetailCopydefault.getTxTime()) : null;
            CoinAndAddressHistoryDetail coinAndAddressHistoryDetailCopydefault2 = gAM.copydefault(gAM.this, i);
            boolean z = coinAndAddressHistoryDetailCopydefault2 != null && coinAndAddressHistoryDetailCopydefault2.isShowPending();
            int iCopydefault = gAM.this.KWHzl().copydefault(gAM.copydefault(gAM.this, i));
            if (lValueOf != null && lValueOf.longValue() != 0 && !z && iCopydefault != 0 && iCopydefault != 1 && iCopydefault != 2 && iCopydefault != 3) {
                if (taskDescription != null) {
                    taskDescription.KWHzl(this.KWHzl.AEQbTJ(lValueOf.longValue()));
                }
            } else if (taskDescription != null) {
                java.lang.String string = gAM.this.getString(C13754dXa.FragmentManager.ensureViewModelStore);
                Intrinsics.checkNotNullExpressionValue(string, "");
                taskDescription.KWHzl(string);
            }
        }
    }

    public static final class ActionBar implements gAD.TaskDescription {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gAD.TaskDescription
        public void OLrzqt(CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
            Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
        }

        public ActionBar() {
        }

        @Override // o.gAD.TaskDescription
        public void KWHzl(CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
            Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
            gAM.this.EZpvd(coinAndAddressHistoryDetail);
        }

        @Override // o.gAD.TaskDescription
        public void AEQbTJ(CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
            Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
            gAM.this.KWHzl(coinAndAddressHistoryDetail);
        }

        @Override // o.gAD.TaskDescription
        public void copydefault(CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
            Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
            gAM.this.AEQbTJ(coinAndAddressHistoryDetail);
        }

        @Override // o.gAD.TaskDescription
        public void EZpvd(CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
            Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
            gAM.this.copydefault(coinAndAddressHistoryDetail);
        }
    }

    public static final class Activity implements gAC.Activity {
        public Activity() {
        }

        @Override // o.gAC.Activity
        public void OLrzqt(CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
            Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
            gAM.this.EZpvd(coinAndAddressHistoryDetail);
        }
    }

    public static final int AEQbTJ(int i, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
        return (coinAndAddressHistoryDetail.getTxStatus() == 1 || coinAndAddressHistoryDetail.getTxStatus() == 5) ? 0 : 1;
    }

    public static final class TaskDescription extends AbstractC19608gIr<C14316djE, C17133ewz> {
        public final /* synthetic */ android.content.Context EZpvd;
        public final /* synthetic */ gAM OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(android.content.Context context, gAM gam, CustomCoinDetailFragment$initRecycleview$1$2$5 customCoinDetailFragment$initRecycleview$1$2$5) {
            super(customCoinDetailFragment$initRecycleview$1$2$5);
            this.EZpvd = context;
            this.OLrzqt = gam;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
        @Override // o.AbstractC19608gIr
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(C17133ewz c17133ewz, final C14316djE c14316djE) {
            Intrinsics.checkNotNullParameter(c17133ewz, "");
            Intrinsics.checkNotNullParameter(c14316djE, "");
            C55173xeu c55173xeu = c17133ewz.OLrzqt;
            android.content.Context context = this.EZpvd;
            final gAM gam = this.OLrzqt;
            java.lang.String string = context.getString(C13754dXa.FragmentManager.getAdvertisingId);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setSubTitle((java.lang.CharSequence) string);
            c55173xeu.AEQbTJ().setVisibility(8);
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.gBo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    gAM.TaskDescription.AEQbTJ(gam, c14316djE, view);
                }
            });
        }

        public static final void AEQbTJ(gAM gam, C14316djE c14316djE, android.view.View view) {
            gam.copydefault(c14316djE.OLrzqt());
        }
    }

    public static final class Dialog extends C43318rmy<C14318djG, AbstractC17086ewE> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC17086ewE> c43312rms, C14318djG c14318djG) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c14318djG, "");
        }

        public Dialog(int i) {
            super(i, 0);
        }
    }

    public static final class Fragment extends AbstractC19608gIr<C14317djF, C17089ewH> {
        public final /* synthetic */ android.content.Context KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(android.content.Context context, CustomCoinDetailFragment$initRecycleview$1$2$8 customCoinDetailFragment$initRecycleview$1$2$8) {
            super(customCoinDetailFragment$initRecycleview$1$2$8);
            this.KWHzl = context;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
        @Override // o.AbstractC19608gIr
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(C17089ewH c17089ewH, final C14317djF c14317djF) {
            Intrinsics.checkNotNullParameter(c17089ewH, "");
            Intrinsics.checkNotNullParameter(c14317djF, "");
            C55173xeu c55173xeu = c17089ewH.OLrzqt;
            android.content.Context context = this.KWHzl;
            c55173xeu.setTitle(c14317djF.EZpvd());
            c55173xeu.setSubTitle((java.lang.CharSequence) c14317djF.OLrzqt());
            java.lang.String strCopydefault = c14317djF.copydefault();
            if (strCopydefault == null) {
                strCopydefault = context.getString(C13754dXa.FragmentManager.QbewEr);
                Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
            }
            c55173xeu.setRetry(strCopydefault);
            if (c14317djF.KWHzl() != null) {
                c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.gBn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        gAM.Fragment.EZpvd(c14317djF, view);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void EZpvd(C14317djF c14317djF, android.view.View view) {
            c14317djF.KWHzl().invoke();
        }
    }

    public static final class PendingIntent extends C43318rmy<C14322djK, AbstractC17082ewA> {
        public PendingIntent(int i) {
            super(i, 0);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC17082ewA> c43312rms, final C14322djK c14322djK) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c14322djK, "");
            android.view.View root = ((AbstractC17082ewA) c43312rms.OLrzqt()).getRoot();
            final gAM gam = gAM.this;
            root.setOnClickListener(new View.OnClickListener() { // from class: o.gBq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    gAM.PendingIntent.copydefault(gam, c14322djK, view);
                }
            });
        }

        public static final void copydefault(gAM gam, C14322djK c14322djK, android.view.View view) {
            gam.copydefault(c14322djK.KWHzl());
        }
    }

    private final void AYXKKw() {
        java.lang.String string;
        java.lang.String string2;
        C19504gEv c19504gEvKWHzl = KWHzl();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("wallet_id", "")) == null) {
            string = "";
        }
        android.os.Bundle arguments2 = getArguments();
        long j = arguments2 != null ? arguments2.getLong("coin_id", 0L) : 0L;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (string2 = arguments3.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "")) == null) {
            string2 = "";
        }
        android.os.Bundle arguments4 = getArguments();
        c19504gEvKWHzl.copydefault(string, j, string2, arguments4 != null ? arguments4.getBoolean("can_show_recommended_investment", false) : false);
    }

    private final void AhwBna() {
        AbstractC16586emi abstractC16586emi = this.OLrzqt;
        if (abstractC16586emi == null) {
            Intrinsics.gEmmrt("");
            abstractC16586emi = null;
        }
        C33546myW c33546myW = abstractC16586emi.DbNXlk;
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.gBl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                gAM.OLrzqt(this.copydefault, interfaceC57934yrl);
            }
        });
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.gBk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                gAM.EZpvd(this.AEQbTJ, interfaceC57934yrl);
            }
        });
    }

    public static final void OLrzqt(gAM gam, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        gam.KWHzl().AkhnZx();
        gam.KWHzl().fetchVPNInfo();
    }

    public static final void EZpvd(gAM gam, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        gam.KWHzl().isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(final CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        KWHzl().AEQbTJ(false, new Function1() { // from class: o.gAP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gAM.djBIcL(this.copydefault, coinAndAddressHistoryDetail, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit djBIcL(final gAM gam, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            gCZ gcz = gCZ.EZpvd;
            androidx.fragment.app.FragmentManager childFragmentManager = gam.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            gcz.EZpvd(childFragmentManager, abstractC12782ctV.DbNXlk(), coinAndAddressHistoryDetail, new Function1() { // from class: o.gBi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return gAM.OLrzqt(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(gAM gam, boolean z) {
        if (z) {
            refreshCoinHistory$default(gam, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(final CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        KWHzl().AEQbTJ(false, new Function1() { // from class: o.gAR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gAM.OLrzqt(this.KWHzl, coinAndAddressHistoryDetail, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit OLrzqt(final gAM gam, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            gCZ gcz = gCZ.EZpvd;
            androidx.fragment.app.FragmentManager childFragmentManager = gam.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            gcz.copydefault(childFragmentManager, abstractC12782ctV.DbNXlk(), coinAndAddressHistoryDetail, new Function1() { // from class: o.gBj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return gAM.EZpvd(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(gAM gam, boolean z) {
        if (z) {
            refreshCoinHistory$default(gam, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(final CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        KWHzl().AEQbTJ(false, new Function1() { // from class: o.gAN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gAM.gEmmrt(this.AEQbTJ, coinAndAddressHistoryDetail, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit gEmmrt(final gAM gam, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            gCZ gcz = gCZ.EZpvd;
            androidx.fragment.app.FragmentManager childFragmentManager = gam.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            gcz.OLrzqt(childFragmentManager, abstractC12782ctV.DbNXlk(), coinAndAddressHistoryDetail, new Function1() { // from class: o.gAL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return gAM.valueOf(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(gAM gam, boolean z) {
        if (z) {
            refreshCoinHistory$default(gam, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void refreshCoinHistory$default(gAM gam, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        gam.KWHzl(z);
    }

    private final void KWHzl(boolean z) {
        OLrzqt().copydefault();
        KWHzl().fetchVPNInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.util.Map<java.lang.String, java.lang.String> map) {
        AbstractC12782ctV abstractC12782ctVGEmmrt;
        ChainAddress chainAddressOLrzqt;
        java.lang.String address;
        long jEZpvd = KWHzl().EZpvd();
        java.lang.String str = map != null ? map.get(C33129mqd.gEmmrt(java.lang.Long.valueOf(jEZpvd))) : null;
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || (abstractC12782ctVGEmmrt = KWHzl().gEmmrt()) == null || (chainAddressOLrzqt = abstractC12782ctVGEmmrt.OLrzqt(java.lang.Long.valueOf(jEZpvd))) == null || (address = chainAddressOLrzqt.getAddress()) == null) {
            return;
        }
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", str + address), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        WebActivity.TaskDescription.openPage$default(taskDescription, context, bundleBundleOf, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(final CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        KWHzl().AEQbTJ(false, new Function1() { // from class: o.gBe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gAM.valueOf(this.AEQbTJ, coinAndAddressHistoryDetail, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit valueOf(gAM gam, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, AbstractC12782ctV abstractC12782ctV) {
        InterfaceC25429iwZ interfaceC25429iwZ;
        if (abstractC12782ctV != null) {
            FragmentActivity activity = gam.getActivity();
            int txType = coinAndAddressHistoryDetail.getTxType();
            switch (txType) {
                case 30:
                case 31:
                case 32:
                    if ((activity instanceof AppCompatActivity) && (interfaceC25429iwZ = (InterfaceC25429iwZ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25429iwZ.class))) != null) {
                        interfaceC25429iwZ.AEQbTJ(activity, coinAndAddressHistoryDetail.getTxhash(), coinAndAddressHistoryDetail.getUOpHash());
                    }
                    break;
                default:
                    switch (txType) {
                        case 40:
                        case 41:
                            if (activity instanceof AppCompatActivity) {
                                ((gKO) C43251rlk.copydefault(gKO.class)).AEQbTJ(activity, new TradeDetails(coinAndAddressHistoryDetail.getOrderId()), activity);
                            }
                            break;
                        case 42:
                            if (activity instanceof AppCompatActivity) {
                                ((gKO) C43251rlk.copydefault(gKO.class)).EZpvd(activity, new TradeDetails(coinAndAddressHistoryDetail.getOrderId()), activity);
                            }
                            break;
                        default:
                            java.lang.String strKWHzl = gam.KWHzl().KWHzl();
                            ActivityC10049bhC.ActionBar actionBar = ActivityC10049bhC.Companion;
                            FragmentActivity activity2 = gam.getActivity();
                            if (activity2 == null) {
                                return Unit.INSTANCE;
                            }
                            java.lang.String txId = coinAndAddressHistoryDetail.getTxId();
                            java.lang.String txhash = coinAndAddressHistoryDetail.getTxhash();
                            if (txhash == null) {
                                txhash = "";
                            }
                            java.lang.String uOpHash = coinAndAddressHistoryDetail.getUOpHash();
                            if (uOpHash == null) {
                                uOpHash = "";
                            }
                            actionBar.KWHzl(activity2, (1544 & 2) != 0 ? "" : txId, (1544 & 4) != 0 ? "" : txhash, (1544 & 8) != 0 ? "" : uOpHash, strKWHzl, abstractC12782ctV.DbNXlk(), coinAndAddressHistoryDetail.getOrderId(), (1544 & 128) != 0 ? 0L : coinAndAddressHistoryDetail.getCoinId(), coinAndAddressHistoryDetail.getOrderType(), (1544 & 512) != 0 ? false : false, (1544 & 1024) != 0 ? "" : null);
                            break;
                    }
                    break;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.copydefault) {
            OLrzqt().copydefault();
            KWHzl().fetchVPNInfo();
        }
        this.copydefault = false;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gAM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final gAM OLrzqt(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("wallet_id", str);
            bundle.putLong("coin_id", j);
            bundle.putString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str2);
            bundle.putBoolean("can_show_recommended_investment", z);
            gAM gam = new gAM();
            gam.setArguments(bundle);
            return gam;
        }
    }
}
