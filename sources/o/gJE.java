package o;

import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.account.api.model.wallet.BindWalletInput;
import com.okinc.account.api.model.wallet.BindWalletResult;
import com.okinc.business.defi.wallet.walletaddressbinding.WalletAddressBindGuideFragment$bindWalletLauncher$1$1$1;
import com.okinc.business.defi.wallet.walletaddressbinding.WalletAddressBindGuideFragment$observeUIState$1;
import com.okinc.business.defi.wallet.walletaddressbinding.WalletAddressBindViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C12827cuN;
import o.C13754dXa;
import o.InterfaceC9739bbK;
import o.xXH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class gJE extends AbstractC19640gJw implements InterfaceC33040mou {
    public final java.lang.Object AYXKKw;
    public gJR AhwBna;
    public final ActivityResultLauncher<BindWalletInput> djBIcL;
    public C16624enT gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final ActivityResultLauncher<android.content.Context> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.invokespecialatDTRm;
    }

    public gJE() {
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(WalletAddressBindViewModel.class);
        Function0<ViewModelStore> function0 = new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.walletaddressbinding.WalletAddressBindGuideFragment$special$$inlined$activityViewModels$default$1
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
        };
        final byte b = 0 == true ? 1 : 0;
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, interfaceC56551yJoAEQbTJ, function0, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.walletaddressbinding.WalletAddressBindGuideFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = b;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.walletaddressbinding.WalletAddressBindGuideFragment$special$$inlined$activityViewModels$default$3
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
        this.AYXKKw = new java.lang.Object();
        InterfaceC8107awW interfaceC8107awWValueOf = valueOf();
        this.djBIcL = interfaceC8107awWValueOf != null ? registerForActivityResult(interfaceC8107awWValueOf.EZpvd(), new ActivityResultCallback() { // from class: o.gJH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                gJE.KWHzl(this.OLrzqt, (BindWalletResult) obj);
            }
        }) : null;
        InterfaceC8106awV interfaceC8106awV = (InterfaceC8106awV) C43251rlk.OLrzqt(InterfaceC8106awV.class);
        this.valueOf = interfaceC8106awV != null ? registerForActivityResult(interfaceC8106awV.OLrzqt(true), new ActivityResultCallback() { // from class: o.gJJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                gJE.EZpvd(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }) : null;
    }

    /* JADX DEBUG: Possible override for method o.gJw.AEQbTJ()V */
    public final WalletAddressBindViewModel AEQbTJ() {
        return (WalletAddressBindViewModel) this.isConnected.getValue();
    }

    private final InterfaceC8107awW valueOf() {
        return (InterfaceC8107awW) C43251rlk.OLrzqt(InterfaceC8107awW.class);
    }

    public static final void KWHzl(gJE gje, BindWalletResult bindWalletResult) {
        gje.showLoading();
        LifecycleOwner viewLifecycleOwner = gje.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletAddressBindGuideFragment$bindWalletLauncher$1$1$1(bindWalletResult, gje, null), 3, null);
    }

    public static final void EZpvd(gJE gje, final java.lang.Boolean bool) {
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        final java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        C32866mlf.onEvent$default("LinkedAccount_CefiNotLogin_KycVerify_Click", (TrackChannel[]) null, new Function1() { // from class: o.gJA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gJE.AEQbTJ(strDbNXlk, bool, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (bool.booleanValue()) {
            WalletAddressBindViewModel.startBindWalletProcess$default(gje.AEQbTJ(), null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(java.lang.String str, java.lang.Boolean bool, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("wallet_account_id", str, false);
        eventParamsList.put("entry_point", "wallet_default", true);
        eventParamsList.put("is_logged", bool.booleanValue() ? "yes" : "no", true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC19640gJw, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        gJR gjr = null;
        gJR gjr2 = context instanceof gJR ? (gJR) context : null;
        if (gjr2 == null) {
            pUU.copydefault(getTAG(), "Activity must implement OnWalletCefiBindingResultListener");
        } else {
            gjr = gjr2;
        }
        this.AhwBna = gjr;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C16624enT c16624enTAEQbTJ = C16624enT.AEQbTJ(view);
        this.gEmmrt = c16624enTAEQbTJ;
        if (c16624enTAEQbTJ != null) {
            copydefault(c16624enTAEQbTJ);
        }
        djBIcL();
        AYXKKw();
        gEmmrt();
    }

    private final void djBIcL() {
        C33527myD.subscribeOnIO$default(C58156yvv.EZpvd(C33527myD.KWHzl(InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null)), this), (Function1) null, new Function0() { // from class: o.gJG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gJE.AhwBna(this.KWHzl);
            }
        }, (Function1) null, 5, (java.lang.Object) null);
    }

    public static final Unit AhwBna(gJE gje) {
        gje.AEQbTJ().AEQbTJ(true);
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXH.class, new java.lang.String[0]);
        final java.lang.Object obj = this.AYXKKw;
        abstractC58185ywXKWHzl.subscribe(new RxBus.EventCallback<xXH>(obj) { // from class: com.okinc.business.defi.wallet.walletaddressbinding.WalletAddressBindGuideFragment$observeWalletAddedEvent$1
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(xXH xxh) {
                if (xxh != null && Intrinsics.EZpvd((Object) xxh.OLrzqt(), (Object) "from_import")) {
                    WalletAddressBindViewModel.startBindWalletProcess$default(this.this$0.AEQbTJ(), null, 1, null);
                }
            }
        });
    }

    public static final class Application implements Function1<EventParamsList, Unit> {
        public static final Application EZpvd = new Application();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "get_started", true);
        }
    }

    private final void copydefault(C16624enT c16624enT) {
        C52794wYp c52794wYp = c16624enT.EZpvd;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
    }

    private final void AYXKKw() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletAddressBindGuideFragment$observeUIState$1(this, null), 3, null);
    }

    @Override // o.InterfaceC33040mou
    public boolean AhwBna() {
        C32866mlf.onEvent$default("LinkedAccount_GuidePop_GetStarted_Click", (TrackChannel[]) null, new Function1() { // from class: o.gJI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gJE.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return false;
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "back", true);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SubHelper.AEQbTJ(this.AYXKKw);
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ gJE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, gJE gje) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = gje;
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.wallet.walletaddressbinding.WalletAddressBindViewModel.startBindWalletProcess$default(com.okinc.business.defi.wallet.walletaddressbinding.WalletAddressBindViewModel, java.lang.String, int, java.lang.Object):kotlinx.coroutines.Job */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C32866mlf.onEvent$default("LinkedAccount_GuidePop_GetStarted_Click", (TrackChannel[]) null, Application.EZpvd, 1, (java.lang.Object) null);
                WalletAddressBindViewModel.startBindWalletProcess$default(this.copydefault.AEQbTJ(), null, 1, null);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.AhwBna = null;
    }
}
