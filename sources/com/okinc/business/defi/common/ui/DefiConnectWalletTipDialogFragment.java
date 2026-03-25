package com.okinc.business.defi.common.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.okinc.business.defi.biz.constant.WalletStatus;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.okinc.wallet.api.bean.ScanResult;
import com.okinc.wallet.api.bean.SupportedNetworkType;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC33041mov;
import o.AbstractC12782ctV;
import o.AbstractC52785wYg;
import o.AbstractC58185ywX;
import o.C10337bmZ;
import o.C10604brb;
import o.C10954byG;
import o.C11205cFp;
import o.C12827cuN;
import o.C13754dXa;
import o.C14449dlf;
import o.C14469dlz;
import o.C14542dnS;
import o.C14616don;
import o.C14728dqt;
import o.C15714eSo;
import o.C19629gJl;
import o.C32866mlf;
import o.C33527myD;
import o.C52794wYp;
import o.C54954xan;
import o.C55296xhK;
import o.C55298xhM;
import o.C56390yDp;
import o.C56392yDr;
import o.C56403yEb;
import o.C56524yIo;
import o.C58156yvv;
import o.InterfaceC54852xXs;
import o.InterfaceC54856xXw;
import o.InterfaceC54859xXz;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC58227yxM;
import o.InterfaceC9739bbK;
import o.dZK;
import o.eLN;
import o.pUU;
import o.rVN;
import o.wYF;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiConnectWalletTipDialogFragment extends AbstractC52785wYg {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public eLN AEQbTJ;
    public final Object AYXKKw;
    public InterfaceC54856xXw AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public boolean EZpvd;
    public final String KWHzl;
    public String OLrzqt;
    public InterfaceC54852xXs djBIcL;
    public UiParamsConfig fetchVPNInfo;
    public boolean gEmmrt;
    public int valueOf;
    public InterfaceC54859xXz values;

    public static final /* synthetic */ class FragmentManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
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
        public final /* synthetic */ void onChanged(Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull InterfaceC54859xXz interfaceC54859xXz) {
        Intrinsics.checkNotNullParameter(interfaceC54859xXz, "");
        this.values = interfaceC54859xXz;
    }

    @Override // o.AbstractC52785wYg
    public boolean AhwBna() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull InterfaceC54852xXs interfaceC54852xXs) {
        Intrinsics.checkNotNullParameter(interfaceC54852xXs, "");
        this.djBIcL = interfaceC54852xXs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull InterfaceC54856xXw interfaceC54856xXw) {
        Intrinsics.checkNotNullParameter(interfaceC54856xXw, "");
        this.AhwBna = interfaceC54856xXw;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DefiConnectWalletTipDialogFragment newInstance$default(Application application, int i, List list, List list2, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 2;
            }
            if ((i2 & 2) != 0) {
                list = null;
            }
            if ((i2 & 8) != 0) {
                str = "";
            }
            return application.OLrzqt(i, (List<SupportedNetworkType>) list, (List<? extends UnsupportedWalletType>) list2, str);
        }

        public final DefiConnectWalletTipDialogFragment OLrzqt(int i, List<SupportedNetworkType> list, @NotNull List<? extends UnsupportedWalletType> list2, @NotNull String str) {
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(str, "");
            DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment = new DefiConnectWalletTipDialogFragment();
            Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt(OtcExtraKeys.MODE, Integer.valueOf(i)), C56390yDp.OLrzqt("UNSUPPORTED_WALLET_TYPES", new ArrayList(list2)), C56390yDp.OLrzqt("description", str));
            if (list != null) {
                bundleBundleOf.putParcelableArrayList("SUPPORTED_NETWORK_TYPES", new ArrayList<>(list));
            }
            defiConnectWalletTipDialogFragment.setArguments(bundleBundleOf);
            return defiConnectWalletTipDialogFragment;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DefiConnectWalletTipDialogFragment newInstance$default(Application application, int i, List list, List list2, UiParamsConfig uiParamsConfig, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 2;
            }
            if ((i2 & 2) != 0) {
                list = null;
            }
            return application.OLrzqt(i, (List<SupportedNetworkType>) list, (List<? extends UnsupportedWalletType>) list2, uiParamsConfig);
        }

        public final DefiConnectWalletTipDialogFragment OLrzqt(int i, List<SupportedNetworkType> list, @NotNull List<? extends UnsupportedWalletType> list2, @NotNull UiParamsConfig uiParamsConfig) {
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(uiParamsConfig, "");
            DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment = new DefiConnectWalletTipDialogFragment();
            Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt(OtcExtraKeys.MODE, Integer.valueOf(i)), C56390yDp.OLrzqt("UNSUPPORTED_WALLET_TYPES", new ArrayList(list2)), C56390yDp.OLrzqt("ui_config", uiParamsConfig));
            if (list != null) {
                bundleBundleOf.putParcelableArrayList("SUPPORTED_NETWORK_TYPES", new ArrayList<>(list));
            }
            defiConnectWalletTipDialogFragment.setArguments(bundleBundleOf);
            return defiConnectWalletTipDialogFragment;
        }
    }

    public DefiConnectWalletTipDialogFragment() {
        String simpleName = DefiConnectWalletTipDialogFragment.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.KWHzl = simpleName;
        Function0 function0 = new Function0() { // from class: o.dnF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DefiConnectWalletTipDialogFragment.djBIcL();
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C14542dnS.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        final Function0<Fragment> function04 = new Function0<Fragment>() { // from class: com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C19629gJl.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$special$$inlined$viewModels$default$9
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
                Function0 function05 = function03;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$special$$inlined$viewModels$default$10
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.AYXKKw = new Object();
        this.valueOf = 2;
        this.OLrzqt = "";
    }

    public final C14542dnS gEmmrt() {
        return (C14542dnS) this.AkhnZx.getValue();
    }

    public static final C14542dnS EZpvd(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C14542dnS(SavedStateHandleSupport.createSavedStateHandle(creationExtras), C10954byG.EZpvd.valueOf());
    }

    private final C19629gJl DbNXlk() {
        return (C19629gJl) this.DbNXlk.getValue();
    }

    @Override // o.AbstractC52785wYg
    public void AEQbTJ(@NotNull C54954xan c54954xan) {
        Intrinsics.checkNotNullParameter(c54954xan, "");
        Context context = getContext();
        if (context == null) {
            return;
        }
        copydefault(context, c54954xan);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new Runnable() { // from class: o.dnL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                DefiConnectWalletTipDialogFragment.AkhnZx(this.copydefault);
            }
        });
    }

    public static final void AkhnZx(DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment) {
        rVN.reportFullyDrawn$default((Fragment) defiConnectWalletTipDialogFragment, true, (String) null, 2, (Object) null);
    }

    public final void copydefault(Context context, C54954xan c54954xan) {
        Serializable serializable;
        Parcelable parcelable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.valueOf = arguments.getInt(OtcExtraKeys.MODE);
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("ui_config", UiParamsConfig.class);
            } else {
                parcelable = arguments.getParcelable("ui_config");
            }
            this.fetchVPNInfo = (UiParamsConfig) parcelable;
            this.OLrzqt = arguments.getString("description", "");
        }
        c54954xan.KWHzl.setImageResource(C13754dXa.Activity.QHmsKR);
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            serializable = null;
        } else if (Build.VERSION.SDK_INT >= 33) {
            serializable = arguments2.getSerializable("UNSUPPORTED_WALLET_TYPES", Object.class);
        } else {
            serializable = arguments2.getSerializable("UNSUPPORTED_WALLET_TYPES");
        }
        List arrayList = serializable instanceof List ? (List) serializable : null;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.contains(UnsupportedWalletType.PrivateKeyWallet)) {
            c54954xan.AEQbTJ.setText(context.getString(C13754dXa.FragmentManager.resume));
            AppCompatTextView appCompatTextView = c54954xan.OLrzqt;
            String string = this.OLrzqt;
            if (string.length() == 0) {
                string = context.getString(C13754dXa.FragmentManager.fObYrO);
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
            appCompatTextView.setText(string);
        } else {
            c54954xan.AEQbTJ.setText(context.getString(C13754dXa.FragmentManager.dTTfOR));
            AppCompatTextView appCompatTextView2 = c54954xan.OLrzqt;
            String string2 = this.OLrzqt;
            if (string2.length() == 0) {
                string2 = context.getString(C13754dXa.FragmentManager.ddhgMB);
                Intrinsics.checkNotNullExpressionValue(string2, "");
            }
            appCompatTextView2.setText(string2);
        }
        AppCompatImageView appCompatImageView = c54954xan.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C55298xhM.copydefault(120.0f, context);
            layoutParams.height = C55298xhM.copydefault(120.0f, context);
            appCompatImageView.setLayoutParams(layoutParams);
            AEQbTJ(c54954xan, context);
            AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C14449dlf.class, new String[0]);
            final Object obj = this.AYXKKw;
            abstractC58185ywXKWHzl.subscribe(new RxBus.EventCallback<C14449dlf>(obj) { // from class: com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$initView$5
                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(C14449dlf c14449dlf) {
                    this.this$0.valueOf();
                }
            });
            C33527myD.subscribeOnIO$default(C58156yvv.EZpvd(C33527myD.KWHzl(InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null)), this), (Function1) null, new Function0() { // from class: o.dnH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return DefiConnectWalletTipDialogFragment.isConnected(this.AEQbTJ);
                }
            }, (Function1) null, 5, (Object) null);
            fetchVPNInfo();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ DefiConnectWalletTipDialogFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = defiConnectWalletTipDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.AEQbTJ(Web3SecurityTrackEvent.VALUE_IMPORT);
                InterfaceC54852xXs interfaceC54852xXs = this.copydefault.djBIcL;
                if (interfaceC54852xXs != null) {
                    interfaceC54852xXs.copydefault();
                }
                C10604brb instance$default = C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null);
                Context contextRequireContext = this.copydefault.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment = this.copydefault;
                instance$default.KWHzl(contextRequireContext, defiConnectWalletTipDialogFragment, defiConnectWalletTipDialogFragment.new Activity());
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ DefiConnectWalletTipDialogFragment OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = defiConnectWalletTipDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ("create");
                InterfaceC54852xXs interfaceC54852xXs = this.OLrzqt.djBIcL;
                if (interfaceC54852xXs != null) {
                    interfaceC54852xXs.AEQbTJ();
                }
                C10604brb instance$default = C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null);
                Context contextRequireContext = this.OLrzqt.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment = this.OLrzqt;
                instance$default.KWHzl(contextRequireContext, defiConnectWalletTipDialogFragment, defiConnectWalletTipDialogFragment.new TaskDescription());
            }
        }
    }

    public static final Unit isConnected(DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment) {
        defiConnectWalletTipDialogFragment.EZpvd = true;
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C54954xan c54954xan, Context context) {
        UiParamsConfig uiParamsConfig = this.fetchVPNInfo;
        if (uiParamsConfig == null) {
            return;
        }
        UiParamsConfig.ImageConfig imageConfigCopydefault = uiParamsConfig.copydefault();
        if (imageConfigCopydefault != null) {
            AppCompatImageView appCompatImageView = c54954xan.KWHzl;
            Integer numOLrzqt = imageConfigCopydefault.OLrzqt();
            appCompatImageView.setImageResource(numOLrzqt != null ? numOLrzqt.intValue() : C13754dXa.Activity.QHmsKR);
            AppCompatImageView appCompatImageView2 = c54954xan.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            ViewGroup.LayoutParams layoutParams = appCompatImageView2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = imageConfigCopydefault.AEQbTJ();
                layoutParams.height = imageConfigCopydefault.copydefault();
                appCompatImageView2.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        AppCompatTextView appCompatTextView = c54954xan.AEQbTJ;
        String strEZpvd = uiParamsConfig.EZpvd();
        String string = context.getString(C13754dXa.FragmentManager.dTTfOR);
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (strEZpvd == null || strEZpvd.length() == 0) {
            strEZpvd = string;
        }
        appCompatTextView.setText(strEZpvd);
        AppCompatTextView appCompatTextView2 = c54954xan.OLrzqt;
        String strAEQbTJ = uiParamsConfig.AEQbTJ();
        String string2 = context.getString(C13754dXa.FragmentManager.ddhgMB);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
            strAEQbTJ = string2;
        }
        appCompatTextView2.setText(strAEQbTJ);
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        Context context = getContext();
        if (context == null) {
            return;
        }
        wyf.setType(7);
        wyf.setOKDSSize(52);
        UiParamsConfig uiParamsConfig = this.fetchVPNInfo;
        String strOLrzqt = uiParamsConfig != null ? uiParamsConfig.OLrzqt() : null;
        String string = context.getString(C13754dXa.FragmentManager.r8lambda3HoOD4FOOs4BK4W3sogOQmeeOUI);
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (strOLrzqt == null || strOLrzqt.length() == 0) {
            strOLrzqt = string;
        }
        wyf.setPrimaryText(strOLrzqt);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setVisibility(C14728dqt.KWHzl.OLrzqt() ^ true ? 0 : 8);
        }
        UiParamsConfig uiParamsConfig2 = this.fetchVPNInfo;
        String strKWHzl = uiParamsConfig2 != null ? uiParamsConfig2.KWHzl() : null;
        String string2 = context.getString(C13754dXa.FragmentManager.invokeSuspendlambda1);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        if (strKWHzl == null || strKWHzl.length() == 0) {
            strKWHzl = string2;
        }
        wyf.setSecondaryText(strKWHzl);
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new ActionBar(c52794wYpAEQbTJ2, 1000L, this));
        }
    }

    public static final class TaskDescription implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            final DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment = DefiConnectWalletTipDialogFragment.this;
            defiConnectWalletTipDialogFragment.EZpvd(new Function0<Unit>() { // from class: com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment.TaskDescription.1
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* synthetic */ Unit invoke() {
                    EZpvd();
                    return Unit.INSTANCE;
                }

                public final void EZpvd() {
                    defiConnectWalletTipDialogFragment.AYXKKw();
                }
            });
        }
    }

    public static final class Activity implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            final DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment = DefiConnectWalletTipDialogFragment.this;
            defiConnectWalletTipDialogFragment.EZpvd(new Function0<Unit>() { // from class: com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment.Activity.2
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* synthetic */ Unit invoke() {
                    EZpvd();
                    return Unit.INSTANCE;
                }

                public final void EZpvd() {
                    C14616don.Companion.KWHzl((226 & 1) != 0 ? 1 : defiConnectWalletTipDialogFragment.valueOf, (226 & 2) != 0 ? false : false, (226 & 4) != 0 ? null : defiConnectWalletTipDialogFragment.gEmmrt().AEQbTJ(), (226 & 8) != 0 ? yDY.AhwBna() : defiConnectWalletTipDialogFragment.gEmmrt().copydefault(), (226 & 16) == 0, (226 & 32) != 0 ? null : null, (226 & 64) != 0 ? new ArrayList() : null, (226 & 128) == 0 ? null : null).show(defiConnectWalletTipDialogFragment.getChildFragmentManager(), defiConnectWalletTipDialogFragment.KWHzl);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(final String str) {
        C32866mlf.onEvent$default("Web3AddWallet_Sheet_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.dnE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiConnectWalletTipDialogFragment.AEQbTJ(str, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit AEQbTJ(String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true));
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SubHelper.AEQbTJ(this.AYXKKw);
    }

    public final void AYXKKw() {
        isConnected();
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null), this, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.dnK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiConnectWalletTipDialogFragment.OLrzqt(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dnJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiConnectWalletTipDialogFragment.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dnI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiConnectWalletTipDialogFragment.copydefault(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dnM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiConnectWalletTipDialogFragment.EZpvd(function12, obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment, Boolean bool) {
        defiConnectWalletTipDialogFragment.AkhnZx();
        eLN.TaskDescription taskDescription = eLN.Companion;
        Function0 function0 = new Function0() { // from class: o.dnw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DefiConnectWalletTipDialogFragment.DbNXlk(this.copydefault);
            }
        };
        Function0 function02 = new Function0() { // from class: o.dnG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DefiConnectWalletTipDialogFragment.fetchVPNInfo(this.OLrzqt);
            }
        };
        int i = defiConnectWalletTipDialogFragment.valueOf;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(defiConnectWalletTipDialogFragment.gEmmrt().copydefault());
        UnsupportedWalletType unsupportedWalletType = UnsupportedWalletType.MPCWallet;
        if (!arrayList.contains(unsupportedWalletType)) {
            arrayList.add(unsupportedWalletType);
        }
        Unit unit = Unit.INSTANCE;
        eLN elnNewInstance$default = eLN.TaskDescription.newInstance$default(taskDescription, function0, function02, i, false, arrayList, null, 40, null);
        defiConnectWalletTipDialogFragment.AEQbTJ = elnNewInstance$default;
        if (elnNewInstance$default != null) {
            elnNewInstance$default.show(defiConnectWalletTipDialogFragment.getChildFragmentManager(), "ChooseCreateWalletFragment");
        }
        return unit;
    }

    public static final Unit DbNXlk(final DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment) {
        androidx.fragment.app.FragmentManager childFragmentManager = defiConnectWalletTipDialogFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Context context = defiConnectWalletTipDialogFragment.getContext();
        Bundle bundle = new Bundle();
        bundle.putString("from", "create_mpc");
        bundle.putInt(OtcExtraKeys.MODE, defiConnectWalletTipDialogFragment.valueOf);
        Unit unit = Unit.INSTANCE;
        new C14469dlz(childFragmentManager, context, bundle, null, new Function1() { // from class: o.dnO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiConnectWalletTipDialogFragment.EZpvd(this.copydefault, (java.lang.String) obj);
            }
        }, new Function0() { // from class: o.dny
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DefiConnectWalletTipDialogFragment.copydefault();
            }
        }, null, null, 200, null).EZpvd();
        return unit;
    }

    public static final Unit EZpvd(DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        FragmentActivity activity = defiConnectWalletTipDialogFragment.getActivity();
        if (activity != null) {
            C15714eSo.TaskDescription.step$default(C15714eSo.Companion, activity, str, defiConnectWalletTipDialogFragment.valueOf, false, C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).fetchVPNInfo() == WalletStatus.NoWallet, 8, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(final DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment) {
        androidx.fragment.app.FragmentManager childFragmentManager = defiConnectWalletTipDialogFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Context context = defiConnectWalletTipDialogFragment.getContext();
        Bundle bundle = new Bundle();
        bundle.putString("from", "create");
        bundle.putInt(OtcExtraKeys.MODE, defiConnectWalletTipDialogFragment.valueOf);
        Unit unit = Unit.INSTANCE;
        new C14469dlz(childFragmentManager, context, bundle, null, new Function1() { // from class: o.dnx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiConnectWalletTipDialogFragment.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        }, new Function0() { // from class: o.dnA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DefiConnectWalletTipDialogFragment.AEQbTJ();
            }
        }, null, null, 200, null).EZpvd();
        return unit;
    }

    public static final Unit KWHzl(DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        defiConnectWalletTipDialogFragment.EZpvd(str);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment, Throwable th) {
        defiConnectWalletTipDialogFragment.AkhnZx();
        pUU.copydefault(defiConnectWalletTipDialogFragment.KWHzl, "handleShowCreateDialog ensureInitialized error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    private final void EZpvd(String str) {
        C19629gJl c19629gJlDbNXlk = DbNXlk();
        int i = this.valueOf;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        C19629gJl.createHDWallet$default(c19629gJlDbNXlk, str, childFragmentManager, i, null, 8, null);
    }

    public final void valueOf() {
        InterfaceC54859xXz interfaceC54859xXz = this.values;
        if (interfaceC54859xXz != null) {
            interfaceC54859xXz.EZpvd();
        }
        AkhnZx();
        eLN eln = this.AEQbTJ;
        if (eln != null) {
            eln.dismissAllowingStateLoss();
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("result", true);
        copydefault(bundle);
    }

    public static /* synthetic */ void close$default(DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            bundle = null;
        }
        defiConnectWalletTipDialogFragment.copydefault(bundle);
    }

    private final void copydefault(Bundle bundle) {
        this.gEmmrt = true;
        InterfaceC54856xXw interfaceC54856xXw = this.AhwBna;
        if (interfaceC54856xXw != null) {
            interfaceC54856xXw.OLrzqt(bundle);
        }
        dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        InterfaceC54856xXw interfaceC54856xXw;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (this.gEmmrt || (interfaceC54856xXw = this.AhwBna) == null) {
            return;
        }
        interfaceC54856xXw.OLrzqt(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(final Function1<? super Unit, Unit> function1) {
        if (this.EZpvd) {
            function1.invoke(Unit.INSTANCE);
        } else {
            isConnected();
            C33527myD.subscribeOnIO$default(C58156yvv.OLrzqt(InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null), this, Lifecycle.Event.ON_DESTROY), new Function1() { // from class: o.dnB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DefiConnectWalletTipDialogFragment.KWHzl(this.copydefault, (java.lang.Throwable) obj);
                }
            }, new Function0() { // from class: o.dnD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return DefiConnectWalletTipDialogFragment.OLrzqt(function1, this);
                }
            }, (Function1) null, 4, (Object) null);
        }
    }

    public static final Unit KWHzl(DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.copydefault(defiConnectWalletTipDialogFragment.KWHzl, "handleEnsureInitData ensureInitialized error message :" + th.getMessage());
        defiConnectWalletTipDialogFragment.AkhnZx();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function1 function1, DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment) {
        Unit unit = Unit.INSTANCE;
        function1.invoke(unit);
        defiConnectWalletTipDialogFragment.AkhnZx();
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(Function0<Unit> function0) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiConnectWalletTipDialogFragment$handleJudgeForbiddenCheck$1(this, function0, null), 3, null);
    }

    private final void isConnected() {
        try {
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).showLoading();
        } catch (Exception e) {
            String message = e.getMessage();
            pUU.AEQbTJ("DefiConnectWalletTipDialogFragment", message != null ? message : "", e);
        }
    }

    private final void AkhnZx() {
        try {
            FragmentActivity activity = getActivity();
            AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.dismissLoading();
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pUU.AEQbTJ("DefiConnectWalletTipDialogFragment", message, e);
        }
    }

    private final void fetchVPNInfo() {
        DbNXlk().copydefault().observe(this, new FragmentManager(new Function1() { // from class: o.dnP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiConnectWalletTipDialogFragment.EZpvd(this.AEQbTJ, (AbstractC12782ctV) obj);
            }
        }));
    }

    public static final Unit EZpvd(DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            C11205cFp c11205cFp = C11205cFp.EZpvd;
            ArrayList<ChainAddress> arrayListIsConnected = abstractC12782ctV.isConnected();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(arrayListIsConnected, 10));
            Iterator<T> it = arrayListIsConnected.iterator();
            while (it.hasNext()) {
                arrayList.add(((ChainAddress) it.next()).getAddress());
            }
            c11205cFp.OLrzqt(arrayList);
        }
        if (defiConnectWalletTipDialogFragment.valueOf == 1) {
            dZK dzk = dZK.AEQbTJ;
            FragmentActivity fragmentActivityRequireActivity = defiConnectWalletTipDialogFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            dzk.AEQbTJ(fragmentActivityRequireActivity, new EnterWalletMainBean((Boolean) null, (String) null, (Integer) null, (String) null, false, false, (ScanResult) null, 127, (DefaultConstructorMarker) null));
        }
        defiConnectWalletTipDialogFragment.valueOf();
        return Unit.INSTANCE;
    }

    public static final class UiParamsConfig implements Parcelable {
        public static final Parcelable.Creator<UiParamsConfig> CREATOR = new Creator();
        public final String AEQbTJ;
        public final ImageConfig EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<UiParamsConfig> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiParamsConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new UiParamsConfig(parcel.readInt() == 0 ? null : ImageConfig.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiParamsConfig[] newArray(int i) {
                return new UiParamsConfig[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UiParamsConfig() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UiParamsConfig copy$default(UiParamsConfig uiParamsConfig, ImageConfig imageConfig, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                imageConfig = uiParamsConfig.EZpvd;
            }
            if ((i & 2) != 0) {
                str = uiParamsConfig.KWHzl;
            }
            String str5 = str;
            if ((i & 4) != 0) {
                str2 = uiParamsConfig.OLrzqt;
            }
            String str6 = str2;
            if ((i & 8) != 0) {
                str3 = uiParamsConfig.copydefault;
            }
            String str7 = str3;
            if ((i & 16) != 0) {
                str4 = uiParamsConfig.AEQbTJ;
            }
            return uiParamsConfig.KWHzl(imageConfig, str5, str6, str7, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UiParamsConfig KWHzl(ImageConfig imageConfig, String str, String str2, String str3, String str4) {
            return new UiParamsConfig(imageConfig, str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ImageConfig copydefault() {
            return this.EZpvd;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiParamsConfig)) {
                return false;
            }
            UiParamsConfig uiParamsConfig = (UiParamsConfig) obj;
            return Intrinsics.EZpvd(this.EZpvd, uiParamsConfig.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) uiParamsConfig.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) uiParamsConfig.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) uiParamsConfig.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) uiParamsConfig.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            ImageConfig imageConfig = this.EZpvd;
            int iHashCode = imageConfig == null ? 0 : imageConfig.hashCode();
            String str = this.KWHzl;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.OLrzqt;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.copydefault;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.AEQbTJ;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UiParamsConfig(imageConfig=" + this.EZpvd + ", title=" + this.KWHzl + ", description=" + this.OLrzqt + ", createButtonText=" + this.copydefault + ", importButtonText=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ImageConfig imageConfig = this.EZpvd;
            if (imageConfig == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                imageConfig.writeToParcel(parcel, i);
            }
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.copydefault);
            parcel.writeString(this.AEQbTJ);
        }

        public UiParamsConfig(ImageConfig imageConfig, String str, String str2, String str3, String str4) {
            this.EZpvd = imageConfig;
            this.KWHzl = str;
            this.OLrzqt = str2;
            this.copydefault = str3;
            this.AEQbTJ = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$UiParamsConfig$ImageConfig:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$UiParamsConfig$ImageConfig) : (r5v0 com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$UiParamsConfig$ImageConfig))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$UiParamsConfig$ImageConfig, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:476) call: com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment.UiParamsConfig.<init>(com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$UiParamsConfig$ImageConfig, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ UiParamsConfig(ImageConfig imageConfig, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : imageConfig, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }

        public static final class ImageConfig implements Parcelable {
            public static final Parcelable.Creator<ImageConfig> CREATOR = new Creator();
            public final int AEQbTJ;
            public final Integer OLrzqt;
            public final int copydefault;

            public static final class Creator implements Parcelable.Creator<ImageConfig> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ImageConfig createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new ImageConfig(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ImageConfig[] newArray(int i) {
                    return new ImageConfig[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ImageConfig copy$default(ImageConfig imageConfig, Integer num, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    num = imageConfig.OLrzqt;
                }
                if ((i3 & 2) != 0) {
                    i = imageConfig.AEQbTJ;
                }
                if ((i3 & 4) != 0) {
                    i2 = imageConfig.copydefault;
                }
                return imageConfig.copydefault(num, i, i2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Integer OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ImageConfig copydefault(@DrawableRes Integer num, int i, int i2) {
                return new ImageConfig(num, i, i2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ImageConfig)) {
                    return false;
                }
                ImageConfig imageConfig = (ImageConfig) obj;
                return Intrinsics.EZpvd(this.OLrzqt, imageConfig.OLrzqt) && this.AEQbTJ == imageConfig.AEQbTJ && this.copydefault == imageConfig.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                Integer num = this.OLrzqt;
                return ((((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.AEQbTJ)) * 31) + Integer.hashCode(this.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ImageConfig(iconDrawableRes=" + this.OLrzqt + ", height=" + this.AEQbTJ + ", width=" + this.copydefault + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int iIntValue;
                Intrinsics.checkNotNullParameter(parcel, "");
                Integer num = this.OLrzqt;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    parcel.writeInt(1);
                    iIntValue = num.intValue();
                }
                parcel.writeInt(iIntValue);
                parcel.writeInt(this.AEQbTJ);
                parcel.writeInt(this.copydefault);
            }

            public ImageConfig(@DrawableRes Integer num, int i, int i2) {
                this.OLrzqt = num;
                this.AEQbTJ = i;
                this.copydefault = i2;
            }
        }
    }

    public static final ViewModelProvider.Factory djBIcL() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C14542dnS.class), new Function1() { // from class: o.dnC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiConnectWalletTipDialogFragment.EZpvd((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
