package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.OKAppBarLayoutBehavior;
import com.okinc.business.defi.biz.net.bean.AddressCoinBalanceDetail;
import com.okinc.business.defi.biz.net.bean.AddressCoinHistoryDetail;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$initRecyclerView$1$2$5;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$initRecyclerView$1$2$8;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$observeTxHistoryData$1;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$observeTxHistoryData$2;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$observeTxHistoryData$3;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$observeTxHistoryData$4;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$observeTxHistoryData$5;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$observeTxHistoryData$6;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetCoinDetailViewModel;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C15878eYq;
import o.C19595gIe;
import o.C52761wXj;
import o.C8039avH;
import o.eYK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eYq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C15878eYq extends eXO {
    public AddressCoinBalanceDetail AYXKKw;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public AbstractC16580emc values;
    public static final Application Companion = new Application(null);
    public static final int AhwBna = 8;
    public final int isConnected = C13754dXa.TaskDescription.DSiOMJ;
    public final C43316rmw djBIcL = new C43316rmw();
    public java.lang.String fetchVPNInfo = "";
    public java.lang.String DbNXlk = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.isConnected;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public C15878eYq() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AddressProfileAssetCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$special$$inlined$viewModels$default$5
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C19503gEu.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$special$$inlined$activityViewModels$default$3
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
    }

    /* JADX DEBUG: Possible override for method o.eXO.OLrzqt()V */
    public final AddressProfileAssetCoinDetailViewModel OLrzqt() {
        return (AddressProfileAssetCoinDetailViewModel) this.valueOf.getValue();
    }

    public final C19503gEu valueOf() {
        return (C19503gEu) this.gEmmrt.getValue();
    }

    /* JADX INFO: renamed from: o.eYq$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eYq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C15878eYq OLrzqt(@NotNull AddressCoinBalanceDetail addressCoinBalanceDetail, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(addressCoinBalanceDetail, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C15878eYq c15878eYq = new C15878eYq();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", addressCoinBalanceDetail);
            bundle.putString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str);
            bundle.putString("url", str2);
            c15878eYq.setArguments(bundle);
            return c15878eYq;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.AYXKKw = arguments != null ? (AddressCoinBalanceDetail) arguments.getParcelable("data") : null;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String str = "";
        if (arguments2 == null || (string = arguments2.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS)) == null) {
            string = "";
        }
        this.fetchVPNInfo = string;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 != null && (string2 = arguments3.getString("url")) != null) {
            str = string2;
        }
        this.DbNXlk = str;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        this.values = (AbstractC16580emc) viewDataBindingBind;
        if (this.fetchVPNInfo.length() == 0) {
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSessionStubProxy), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        AbstractC16580emc abstractC16580emc = this.values;
        if (abstractC16580emc == null) {
            Intrinsics.gEmmrt("");
            abstractC16580emc = null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC16580emc.EZpvd.getLayoutParams();
        CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            OKAppBarLayoutBehavior oKAppBarLayoutBehavior = new OKAppBarLayoutBehavior(null, null, 3, null);
            oKAppBarLayoutBehavior.setLimitId(C13754dXa.ActionBar.ZNPcth);
            layoutParams2.setBehavior(oKAppBarLayoutBehavior);
            AbstractC16580emc abstractC16580emc2 = this.values;
            if (abstractC16580emc2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16580emc2 = null;
            }
            abstractC16580emc2.EZpvd.setLayoutParams(layoutParams2);
            AbstractC16580emc abstractC16580emc3 = this.values;
            if (abstractC16580emc3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16580emc3 = null;
            }
            abstractC16580emc3.EZpvd.requestLayout();
        }
        AbstractC16580emc abstractC16580emc4 = this.values;
        if (abstractC16580emc4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16580emc4 = null;
        }
        abstractC16580emc4.EZpvd.setOnClickListener(null);
        OLrzqt(this.fetchVPNInfo);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSessionStubProxy), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        AbstractC16580emc abstractC16580emc = this.values;
        if (abstractC16580emc == null) {
            Intrinsics.gEmmrt("");
            abstractC16580emc = null;
        }
        abstractC16580emc.AhwBna.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
        djBIcL();
        isConnected();
        AkhnZx();
        AYXKKw();
        gEmmrt();
    }

    public final void AYXKKw() {
        AddressCoinBalanceDetail addressCoinBalanceDetail = this.AYXKKw;
        if (addressCoinBalanceDetail != null) {
            C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
            java.lang.String address = addressCoinBalanceDetail.getAddress();
            if (address == null) {
                address = "";
            }
            C10854bwM c10854bwMEZpvd = c10948byAValueOf.EZpvd(address, addressCoinBalanceDetail.getChainIndex());
            AbstractC16580emc abstractC16580emc = this.values;
            AbstractC16580emc abstractC16580emc2 = null;
            if (abstractC16580emc == null) {
                Intrinsics.gEmmrt("");
                abstractC16580emc = null;
            }
            C19394gAt.setCoinCount$default(abstractC16580emc.OLrzqt, C54870xYj.OLrzqt(addressCoinBalanceDetail.getCoinAmount(), (249 & 1) != 0 ? 0 : 0, c10854bwMEZpvd != null ? c10854bwMEZpvd.AkhnZx() : 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null), null, 2, null);
            AbstractC16580emc abstractC16580emc3 = this.values;
            if (abstractC16580emc3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16580emc2 = abstractC16580emc3;
            }
            abstractC16580emc2.OLrzqt.setValuation(C54880xYt.formatValuationFromAsset$default(addressCoinBalanceDetail.getCurrencyAmount(), null, false, 0, false, 15, null));
            AhwBna();
            AddressProfileAssetCoinDetailViewModel addressProfileAssetCoinDetailViewModelOLrzqt = OLrzqt();
            java.lang.String str = this.fetchVPNInfo;
            long chainIndex = addressCoinBalanceDetail.getChainIndex();
            java.lang.String address2 = addressCoinBalanceDetail.getAddress();
            if (address2 == null) {
                address2 = "";
            }
            addressProfileAssetCoinDetailViewModelOLrzqt.AEQbTJ(str, chainIndex, address2);
            AddressProfileAssetCoinDetailViewModel addressProfileAssetCoinDetailViewModelOLrzqt2 = OLrzqt();
            java.lang.String str2 = this.fetchVPNInfo;
            long chainIndex2 = addressCoinBalanceDetail.getChainIndex();
            java.lang.String address3 = addressCoinBalanceDetail.getAddress();
            AddressProfileAssetCoinDetailViewModel.loadHistory$default(addressProfileAssetCoinDetailViewModelOLrzqt2, str2, chainIndex2, address3 == null ? "" : address3, false, 8, null);
            C33064mpR.OLrzqt(this.djBIcL, (java.util.List<? extends java.lang.Object>) yDY.copydefault(new C14318djG()));
        }
    }

    public final void AhwBna() {
        AbstractC16580emc abstractC16580emc = null;
        if (this.fetchVPNInfo.length() == 0) {
            AbstractC16580emc abstractC16580emc2 = this.values;
            if (abstractC16580emc2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16580emc = abstractC16580emc2;
            }
            abstractC16580emc.AEQbTJ.setVisibility(8);
            return;
        }
        AbstractC16580emc abstractC16580emc3 = this.values;
        if (abstractC16580emc3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16580emc3 = null;
        }
        abstractC16580emc3.AEQbTJ.setVisibility(0);
        AddressCoinBalanceDetail addressCoinBalanceDetail = this.AYXKKw;
        if (addressCoinBalanceDetail != null) {
            AbstractC16580emc abstractC16580emc4 = this.values;
            if (abstractC16580emc4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16580emc4 = null;
            }
            abstractC16580emc4.isConnected.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.onPlaybackStateChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", addressCoinBalanceDetail.getChainName()))));
        }
        AbstractC16580emc abstractC16580emc5 = this.values;
        if (abstractC16580emc5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16580emc = abstractC16580emc5;
        }
        abstractC16580emc.AkhnZx.setText(this.fetchVPNInfo);
    }

    /* JADX INFO: renamed from: o.eYq$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C15878eYq AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C15878eYq c15878eYq) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c15878eYq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                FragmentActivity activity = this.AEQbTJ.getActivity();
                if (activity != null) {
                    if (!(!activity.isFinishing())) {
                        activity = null;
                    }
                    if (activity != null) {
                        java.lang.Object systemService = activity.getSystemService("clipboard");
                        Intrinsics.copydefault(systemService, "");
                        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(null, this.AEQbTJ.fetchVPNInfo));
                        C19595gIe.StateListAnimator.newInstance$default(C19595gIe.Companion, null, this.AEQbTJ.fetchVPNInfo, 1, null).KWHzl(this.AEQbTJ.getContext());
                    }
                }
            }
        }
    }

    public final void gEmmrt() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new ProfileAssetCoinDetailFragment$observeTxHistoryData$1(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new ProfileAssetCoinDetailFragment$observeTxHistoryData$2(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new ProfileAssetCoinDetailFragment$observeTxHistoryData$3(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new ProfileAssetCoinDetailFragment$observeTxHistoryData$4(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new ProfileAssetCoinDetailFragment$observeTxHistoryData$5(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new ProfileAssetCoinDetailFragment$observeTxHistoryData$6(this, null));
    }

    public final void djBIcL() {
        AbstractC16580emc abstractC16580emc = this.values;
        if (abstractC16580emc == null) {
            Intrinsics.gEmmrt("");
            abstractC16580emc = null;
        }
        android.widget.LinearLayout linearLayout = abstractC16580emc.gEmmrt;
        linearLayout.setOnClickListener(new TaskDescription(linearLayout, 1000L, this));
    }

    private final void isConnected() {
        AbstractC16580emc abstractC16580emc = this.values;
        AbstractC16580emc abstractC16580emc2 = null;
        if (abstractC16580emc == null) {
            Intrinsics.gEmmrt("");
            abstractC16580emc = null;
        }
        C33546myW c33546myW = abstractC16580emc.DbNXlk;
        AbstractC16580emc abstractC16580emc3 = this.values;
        if (abstractC16580emc3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16580emc3 = null;
        }
        abstractC16580emc3.DbNXlk.djBIcL(true);
        AbstractC16580emc abstractC16580emc4 = this.values;
        if (abstractC16580emc4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16580emc2 = abstractC16580emc4;
        }
        abstractC16580emc2.DbNXlk.AhwBna(true);
        AddressCoinBalanceDetail addressCoinBalanceDetail = this.AYXKKw;
        if (addressCoinBalanceDetail != null) {
            c33546myW.OLrzqt((InterfaceC57901yrE) new Fragment(addressCoinBalanceDetail, this));
        }
    }

    /* JADX INFO: renamed from: o.eYq$Fragment */
    public static final class Fragment implements InterfaceC57901yrE {
        public final /* synthetic */ C15878eYq KWHzl;
        public final /* synthetic */ AddressCoinBalanceDetail copydefault;

        public Fragment(AddressCoinBalanceDetail addressCoinBalanceDetail, C15878eYq c15878eYq) {
            this.copydefault = addressCoinBalanceDetail;
            this.KWHzl = c15878eYq;
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            C10854bwM c10854bwMGenerateCoinMeta = this.copydefault.generateCoinMeta();
            AddressProfileAssetCoinDetailViewModel addressProfileAssetCoinDetailViewModelOLrzqt = this.KWHzl.OLrzqt();
            java.lang.String str = this.KWHzl.fetchVPNInfo;
            long chainIndex = this.copydefault.getChainIndex();
            java.lang.String address = this.copydefault.getAddress();
            if (address == null) {
                address = "";
            }
            addressProfileAssetCoinDetailViewModelOLrzqt.AEQbTJ(str, chainIndex, address);
            AddressProfileAssetCoinDetailViewModel addressProfileAssetCoinDetailViewModelOLrzqt2 = this.KWHzl.OLrzqt();
            java.lang.String str2 = this.KWHzl.fetchVPNInfo;
            long chainIndex2 = this.copydefault.getChainIndex();
            java.lang.String address2 = this.copydefault.getAddress();
            addressProfileAssetCoinDetailViewModelOLrzqt2.copydefault(str2, chainIndex2, address2 == null ? "" : address2, false);
            this.KWHzl.OLrzqt().AEQbTJ(this.copydefault.getSymbol(), this.KWHzl.fetchVPNInfo, java.lang.Long.valueOf(this.copydefault.getChainIndex()), this.copydefault.getAddress());
            this.KWHzl.valueOf().copydefault(c10854bwMGenerateCoinMeta);
            C19503gEu c19503gEuValueOf = this.KWHzl.valueOf();
            long chainIndex3 = this.copydefault.getChainIndex();
            java.lang.String address3 = this.copydefault.getAddress();
            c19503gEuValueOf.EZpvd(chainIndex3, address3 != null ? address3 : "");
        }

        @Override // o.InterfaceC57900yrD
        public void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            AddressProfileAssetCoinDetailViewModel addressProfileAssetCoinDetailViewModelOLrzqt = this.KWHzl.OLrzqt();
            java.lang.String str = this.KWHzl.fetchVPNInfo;
            long chainIndex = this.copydefault.getChainIndex();
            java.lang.String address = this.copydefault.getAddress();
            addressProfileAssetCoinDetailViewModelOLrzqt.copydefault(str, chainIndex, address == null ? "" : address, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AkhnZx() {
        int iAkhnZx;
        java.lang.String address;
        AbstractC16580emc abstractC16580emc = this.values;
        java.lang.String str = "";
        if (abstractC16580emc == null) {
            Intrinsics.gEmmrt("");
            abstractC16580emc = null;
        }
        RecyclerView recyclerView = abstractC16580emc.fetchVPNInfo;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        if (recyclerView.getItemDecorationCount() > 0) {
            int itemDecorationCount = recyclerView.getItemDecorationCount();
            for (int i = 0; i < itemDecorationCount; i++) {
                recyclerView.removeItemDecorationAt(i);
            }
        }
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.addItemDecoration(new C8039avH(new StateListAnimator(new gAI(), context)));
        C43316rmw c43316rmw = this.djBIcL;
        AddressCoinBalanceDetail addressCoinBalanceDetail = this.AYXKKw;
        if (addressCoinBalanceDetail != null) {
            long chainIndex = addressCoinBalanceDetail.getChainIndex();
            C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
            AddressCoinBalanceDetail addressCoinBalanceDetail2 = this.AYXKKw;
            if (addressCoinBalanceDetail2 != null && (address = addressCoinBalanceDetail2.getAddress()) != null) {
                str = address;
            }
            C10854bwM c10854bwMEZpvd = c10948byAValueOf.EZpvd(str, C33129mqd.valueOf(java.lang.Long.valueOf(chainIndex)));
            iAkhnZx = c10854bwMEZpvd != null ? c10854bwMEZpvd.AkhnZx() : 6;
        }
        c43316rmw.register(AddressCoinHistoryDetail.class).copydefault(new C15908eZt(iAkhnZx, new Function1() { // from class: o.eYp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15878eYq.copydefault(this.EZpvd, (AddressCoinHistoryDetail) obj);
            }
        }), new C15906eZr(iAkhnZx, new Function1() { // from class: o.eYu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15878eYq.KWHzl(this.AEQbTJ, (AddressCoinHistoryDetail) obj);
            }
        })).AEQbTJ(new InterfaceC59531zim() { // from class: o.eYv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59531zim
            public final int OLrzqt(int i2, java.lang.Object obj) {
                return C15878eYq.OLrzqt(i2, (AddressCoinHistoryDetail) obj);
            }
        });
        c43316rmw.register(C14316djE.class, new ActionBar(context, this, ProfileAssetCoinDetailFragment$initRecyclerView$1$2$5.INSTANCE));
        c43316rmw.register(C14318djG.class, new LoaderManager(C13754dXa.TaskDescription.OAUGar));
        c43316rmw.register(C14317djF.class, new FragmentManager(context, ProfileAssetCoinDetailFragment$initRecyclerView$1$2$8.INSTANCE));
        recyclerView.setAdapter(c43316rmw);
    }

    public static final AddressCoinHistoryDetail EZpvd(C15878eYq c15878eYq, int i) {
        java.lang.Object objAEQbTJ = c15878eYq.djBIcL.AEQbTJ(i);
        if (objAEQbTJ instanceof AddressCoinHistoryDetail) {
            return (AddressCoinHistoryDetail) objAEQbTJ;
        }
        return null;
    }

    /* JADX INFO: renamed from: o.eYq$StateListAnimator */
    public static final class StateListAnimator implements C8039avH.ActionBar<Activity> {
        public final /* synthetic */ android.content.Context AEQbTJ;
        public final /* synthetic */ gAI copydefault;

        public StateListAnimator(gAI gai, android.content.Context context) {
            this.copydefault = gai;
            this.AEQbTJ = context;
        }

        @Override // o.C8039avH.ActionBar
        public long EZpvd(int i) {
            AddressCoinHistoryDetail addressCoinHistoryDetailEZpvd = C15878eYq.EZpvd(C15878eYq.this, i);
            java.lang.Long txTime = addressCoinHistoryDetailEZpvd != null ? addressCoinHistoryDetailEZpvd.getTxTime() : null;
            AddressCoinHistoryDetail addressCoinHistoryDetailEZpvd2 = C15878eYq.EZpvd(C15878eYq.this, i);
            boolean z = addressCoinHistoryDetailEZpvd2 != null && addressCoinHistoryDetailEZpvd2.isShowPending();
            AddressCoinHistoryDetail addressCoinHistoryDetailEZpvd3 = C15878eYq.EZpvd(C15878eYq.this, i);
            int txStatus = addressCoinHistoryDetailEZpvd3 != null ? addressCoinHistoryDetailEZpvd3.getTxStatus() : 4;
            if (txTime == null || txTime.longValue() == 0 || z || txStatus == 1 || txStatus == 2 || txStatus == 5) {
                return i < C15878eYq.this.djBIcL.getItemCount() - 1 ? 1000L : -1L;
            }
            return this.copydefault.KWHzl(txTime.longValue());
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.C8039avH.ActionBar
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Activity OLrzqt(android.view.ViewGroup viewGroup) {
            ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(this.AEQbTJ), C13754dXa.TaskDescription.sCB, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
            return new Activity((AbstractC16741epe) viewDataBindingInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // o.C8039avH.ActionBar
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void KWHzl(Activity activity, int i) {
            android.view.View view;
            AddressCoinHistoryDetail addressCoinHistoryDetailEZpvd = C15878eYq.EZpvd(C15878eYq.this, i);
            java.lang.Long txTime = addressCoinHistoryDetailEZpvd != null ? addressCoinHistoryDetailEZpvd.getTxTime() : null;
            AddressCoinHistoryDetail addressCoinHistoryDetailEZpvd2 = C15878eYq.EZpvd(C15878eYq.this, i);
            boolean z = addressCoinHistoryDetailEZpvd2 != null && addressCoinHistoryDetailEZpvd2.isShowPending();
            AddressCoinHistoryDetail addressCoinHistoryDetailEZpvd3 = C15878eYq.EZpvd(C15878eYq.this, i);
            int txStatus = addressCoinHistoryDetailEZpvd3 != null ? addressCoinHistoryDetailEZpvd3.getTxStatus() : 4;
            if (txTime == null || txTime.longValue() == 0 || z || txStatus == 1 || txStatus == 2 || txStatus == 5) {
                if (activity != null) {
                    java.lang.String string = C15878eYq.this.getString(C13754dXa.FragmentManager.ensureViewModelStore);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    activity.AEQbTJ(string);
                }
            } else if (activity != null) {
                activity.AEQbTJ(this.copydefault.AEQbTJ(txTime.longValue()));
            }
            if (activity == null || (view = activity.itemView) == null) {
                return;
            }
            view.setPadding(view.getPaddingLeft(), C55298xhM.dp2px$default(12.0f, null, 1, null), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public static final Unit copydefault(C15878eYq c15878eYq, AddressCoinHistoryDetail addressCoinHistoryDetail) {
        Intrinsics.checkNotNullParameter(addressCoinHistoryDetail, "");
        c15878eYq.AEQbTJ(addressCoinHistoryDetail);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C15878eYq c15878eYq, AddressCoinHistoryDetail addressCoinHistoryDetail) {
        Intrinsics.checkNotNullParameter(addressCoinHistoryDetail, "");
        c15878eYq.AEQbTJ(addressCoinHistoryDetail);
        return Unit.INSTANCE;
    }

    public static final int OLrzqt(int i, AddressCoinHistoryDetail addressCoinHistoryDetail) {
        Intrinsics.checkNotNullParameter(addressCoinHistoryDetail, "");
        return (addressCoinHistoryDetail.getTxStatus() == 1 || addressCoinHistoryDetail.getTxStatus() == 5) ? 0 : 1;
    }

    /* JADX INFO: renamed from: o.eYq$ActionBar */
    public static final class ActionBar extends AbstractC19608gIr<C14316djE, C17133ewz> {
        public final /* synthetic */ android.content.Context AEQbTJ;
        public final /* synthetic */ C15878eYq KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(android.content.Context context, C15878eYq c15878eYq, ProfileAssetCoinDetailFragment$initRecyclerView$1$2$5 profileAssetCoinDetailFragment$initRecyclerView$1$2$5) {
            super(profileAssetCoinDetailFragment$initRecyclerView$1$2$5);
            this.AEQbTJ = context;
            this.KWHzl = c15878eYq;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
        @Override // o.AbstractC19608gIr
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(C17133ewz c17133ewz, C14316djE c14316djE) {
            Intrinsics.checkNotNullParameter(c17133ewz, "");
            Intrinsics.checkNotNullParameter(c14316djE, "");
            C55173xeu c55173xeu = c17133ewz.OLrzqt;
            android.content.Context context = this.AEQbTJ;
            final C15878eYq c15878eYq = this.KWHzl;
            java.util.Map<java.lang.String, java.lang.String> mapOLrzqt = c14316djE.OLrzqt();
            if (mapOLrzqt == null || mapOLrzqt.isEmpty()) {
                c55173xeu.setImage(C52761wXj.TaskDescription.HJWChPRGtXKC);
                java.lang.String string = context.getString(C13754dXa.FragmentManager.setRepeatMode);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c55173xeu.setSubTitle((java.lang.CharSequence) string);
                c55173xeu.setRetry("");
                return;
            }
            java.lang.String str = c14316djE.OLrzqt().get("title");
            if (str == null) {
                str = "";
            }
            c55173xeu.setTitle(str);
            java.lang.String str2 = c14316djE.OLrzqt().get("subtitle");
            if (str2 == null) {
                str2 = "";
            }
            c55173xeu.setSubTitle((java.lang.CharSequence) str2);
            java.lang.String str3 = c14316djE.OLrzqt().get("retry");
            c55173xeu.setRetry(str3 != null ? str3 : "");
            c55173xeu.setEmptyTypeImage(c14316djE.AEQbTJ());
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.eYw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C15878eYq.ActionBar.copydefault(c15878eYq, view);
                }
            });
        }

        public static final void copydefault(C15878eYq c15878eYq, android.view.View view) {
            AddressCoinBalanceDetail addressCoinBalanceDetail = c15878eYq.AYXKKw;
            if (addressCoinBalanceDetail != null) {
                AddressProfileAssetCoinDetailViewModel addressProfileAssetCoinDetailViewModelOLrzqt = c15878eYq.OLrzqt();
                java.lang.String str = c15878eYq.fetchVPNInfo;
                long chainIndex = addressCoinBalanceDetail.getChainIndex();
                java.lang.String address = addressCoinBalanceDetail.getAddress();
                if (address == null) {
                    address = "";
                }
                addressProfileAssetCoinDetailViewModelOLrzqt.copydefault(str, chainIndex, address, false);
            }
        }
    }

    /* JADX INFO: renamed from: o.eYq$LoaderManager */
    public static final class LoaderManager extends C43318rmy<C14318djG, AbstractC17086ewE> {
        public LoaderManager(int i) {
            super(i, 0);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC17086ewE> c43312rms, C14318djG c14318djG) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c14318djG, "");
            ((AbstractC17086ewE) c43312rms.OLrzqt()).KWHzl.setAnimation(C52761wXj.PendingIntent.hDKMBd);
        }
    }

    /* JADX INFO: renamed from: o.eYq$FragmentManager */
    public static final class FragmentManager extends AbstractC19608gIr<C14317djF, C17089ewH> {
        public final /* synthetic */ android.content.Context KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(android.content.Context context, ProfileAssetCoinDetailFragment$initRecyclerView$1$2$8 profileAssetCoinDetailFragment$initRecyclerView$1$2$8) {
            super(profileAssetCoinDetailFragment$initRecyclerView$1$2$8);
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
                c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.eYt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C15878eYq.FragmentManager.copydefault(c14317djF, view);
                    }
                });
            }
        }

        public static final void copydefault(C14317djF c14317djF, android.view.View view) {
            c14317djF.KWHzl().invoke();
        }
    }

    public final void AEQbTJ(AddressCoinHistoryDetail addressCoinHistoryDetail) {
        eYK.ActionBar actionBar = eYK.Companion;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        actionBar.copydefault(activity, addressCoinHistoryDetail, this.DbNXlk);
    }

    /* JADX INFO: renamed from: o.eYq$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final AbstractC16741epe copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull AbstractC16741epe abstractC16741epe) {
            super(abstractC16741epe.getRoot());
            Intrinsics.checkNotNullParameter(abstractC16741epe, "");
            this.copydefault = abstractC16741epe;
        }

        public final void AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault.getRoot().setVisibility(str.length() == 0 ? 8 : 0);
            this.copydefault.KWHzl.setText(str);
        }
    }
}
