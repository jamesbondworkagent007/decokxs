package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.okinc.business.defi.api.model.tx.signdata.EVM5792Call;
import com.okinc.business.defi.api.model.tx.signdata.EVM5792ContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.biz.core.ws.channel.WalletTxHistorySubManager;
import com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp;
import com.okinc.business.defi.wallet.eip7702.ui.bottomsheet.EIP7702UpgradeBottomSheet$onViewCreated$1;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC9737bbI;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eCw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15290eCw extends wXX {
    public final boolean AEQbTJ;
    public AbstractC12782ctV AhwBna;
    public EIP7702ChainStatusResp.ChainStatusItem EZpvd;
    public EVM5792ContractSignData KWHzl;
    public wYF OLrzqt;
    public Function0<Unit> copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final ActionBar gEmmrt;
    public Function0<Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AEQbTJ;
    }

    public C15290eCw() {
        Function0 function0 = new Function0() { // from class: o.eCs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15290eCw.EZpvd();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.eip7702.ui.bottomsheet.EIP7702UpgradeBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.eip7702.ui.bottomsheet.EIP7702UpgradeBottomSheet$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(eCH.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.eip7702.ui.bottomsheet.EIP7702UpgradeBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.eip7702.ui.bottomsheet.EIP7702UpgradeBottomSheet$special$$inlined$viewModels$default$4
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
        this.gEmmrt = new ActionBar(new xZA(0L, 300L, null, 4, null));
        this.AEQbTJ = true;
    }

    public final eCH AEQbTJ() {
        return (eCH) this.djBIcL.getValue();
    }

    public static final eCH copydefault(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new eCH(new C15272eCe(null, 1, null));
    }

    /* JADX INFO: renamed from: o.eCw$ActionBar */
    public static final class ActionBar extends xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> {
        public ActionBar(xZA xza) {
            super("TxHistorySub-eip7702Upgrade-BottomSheet", xza);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletTxHistorySubManager.SubResponse> list) {
            AbstractC12782ctV abstractC12782ctV;
            Intrinsics.checkNotNullParameter(list, "");
            C15290eCw c15290eCw = C15290eCw.this;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                return;
            }
            for (WalletTxHistorySubManager.SubResponse subResponse : list) {
                if (subResponse.isTxTypeEIP7702Authorization() && (abstractC12782ctV = c15290eCw.AhwBna) != null) {
                    java.lang.String address = subResponse.getAddress();
                    if (address == null) {
                        address = "";
                    }
                    if (abstractC12782ctV.DbNXlk(address)) {
                        C15290eCw.this.AEQbTJ().KWHzl();
                        return;
                    }
                }
            }
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String strDbNXlk;
        EIP7702ChainStatusResp.ChainStatusItem chainStatusItem;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C11205cFp.EZpvd.AxsJAY().AEQbTJ(this.gEmmrt);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new EIP7702UpgradeBottomSheet$onViewCreated$1(this, null), 3, null);
        eCH echAEQbTJ = AEQbTJ();
        AbstractC12782ctV abstractC12782ctV = this.AhwBna;
        if (abstractC12782ctV == null || (strDbNXlk = abstractC12782ctV.DbNXlk()) == null || (chainStatusItem = this.EZpvd) == null) {
            return;
        }
        long chainIndex = chainStatusItem.getChainIndex();
        EIP7702ChainStatusResp.ChainStatusItem chainStatusItem2 = this.EZpvd;
        if (chainStatusItem2 == null) {
            return;
        }
        echAEQbTJ.EZpvd(strDbNXlk, chainIndex, chainStatusItem2);
    }

    public final void KWHzl(boolean z) {
        EIP7702ChainStatusResp.ChainStatusItem chainStatusItem = this.EZpvd;
        if (chainStatusItem == null) {
            return;
        }
        long chainIndex = chainStatusItem.getChainIndex();
        if (z) {
            C10854bwM c10854bwM = (C10854bwM) InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(C11627cVg.KWHzl, chainIndex, false, 2, null);
            if (c10854bwM == null) {
                return;
            }
            EVM5792ContractSignData eVM5792ContractSignData = this.KWHzl;
            if (eVM5792ContractSignData != null) {
                AbstractC12782ctV abstractC12782ctV = this.AhwBna;
                java.lang.String strEZpvd = abstractC12782ctV != null ? abstractC12782ctV.EZpvd(chainIndex) : null;
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                eVM5792ContractSignData.setCalls(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd(new EVM5792Call(strEZpvd, chainStatusItem.getContractData(), "0x0", null, 8, null)), (java.lang.Iterable) eVM5792ContractSignData.getCalls()));
                eVM5792ContractSignData.setAuthorizationList(C56402yEa.EZpvd(new EVMAuthorization(C33491mxU.copydefault(java.lang.String.valueOf(c10854bwM.isConnected())), chainStatusItem.getContractAddress(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 60, (DefaultConstructorMarker) null)));
            }
        }
        Function0<Unit> function0 = this.valueOf;
        if (function0 != null) {
            function0.invoke();
        }
        this.copydefault = null;
        dismissAllowingStateLoss();
    }

    public final void KWHzl() {
        Function0<Unit> function0 = this.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        this.copydefault = null;
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C11205cFp.EZpvd.AxsJAY().OLrzqt(this.gEmmrt);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C17003eub c17003eubAEQbTJ = C17003eub.AEQbTJ(getLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(c17003eubAEQbTJ, "");
        C16797eqh c16797eqh = c17003eubAEQbTJ.EZpvd;
        c16797eqh.OLrzqt.setImageResource(C52761wXj.TaskDescription.RjCdvpRjCdvp);
        c16797eqh.EZpvd.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplBase6));
        c16797eqh.KWHzl.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplApi26));
        C16797eqh c16797eqh2 = c17003eubAEQbTJ.copydefault;
        c16797eqh2.OLrzqt.setImageResource(C52761wXj.TaskDescription.ZGRCNj);
        c16797eqh2.EZpvd.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection));
        c16797eqh2.KWHzl.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.isCurrent));
        C16797eqh c16797eqh3 = c17003eubAEQbTJ.AEQbTJ;
        c16797eqh3.OLrzqt.setImageResource(C52761wXj.TaskDescription.DDxOgT);
        c16797eqh3.EZpvd.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplBase4));
        c16797eqh3.KWHzl.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.dump));
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull EVM5792ContractSignData eVM5792ContractSignData, @NotNull EIP7702ChainStatusResp.ChainStatusItem chainStatusItem, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(eVM5792ContractSignData, "");
        Intrinsics.checkNotNullParameter(chainStatusItem, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.AhwBna = abstractC12782ctV;
        this.KWHzl = eVM5792ContractSignData;
        this.EZpvd = chainStatusItem;
        this.valueOf = function0;
        this.copydefault = function02;
        show(fragmentManager);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.OLrzqt = wyf;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory EZpvd() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(eCH.class), new Function1() { // from class: o.eCu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15290eCw.copydefault((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
