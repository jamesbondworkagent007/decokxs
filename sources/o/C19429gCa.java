package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
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
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.defi.wallet.tx.history.segwit.AggregationAddressSwitchFragment$observeAggregationListState$1;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gCa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19429gCa extends wXX {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public C59534zip AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public Function0<Unit> AhwBna;
    public yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, Unit> KWHzl;
    public java.lang.Integer OLrzqt;
    public boolean djBIcL;
    public final InterfaceC56387yDm isConnected;
    public C16488ekq values;
    public long valueOf = -1;
    public long gEmmrt = Long.MIN_VALUE;
    public java.lang.String DbNXlk = "";
    public java.lang.String EZpvd = "";

    public C19429gCa() {
        Function0 function0 = new Function0() { // from class: o.gCd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19429gCa.djBIcL();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.tx.history.segwit.AggregationAddressSwitchFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.tx.history.segwit.AggregationAddressSwitchFragment$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C19434gCf.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.history.segwit.AggregationAddressSwitchFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.history.segwit.AggregationAddressSwitchFragment$special$$inlined$viewModels$default$4
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.gCj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19429gCa.AYXKKw(this.copydefault);
            }
        });
    }

    public final C19434gCf AEQbTJ() {
        return (C19434gCf) this.isConnected.getValue();
    }

    public static final C19434gCf copydefault(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C19434gCf(new C8301bAD(), C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), C10954byG.EZpvd.valueOf(), C11205cFp.EZpvd);
    }

    /* JADX INFO: renamed from: o.gCa$TaskDescription */
    public static final class TaskDescription implements WalletUpdateWorker.TaskDescription {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
        public void EZpvd(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
        }

        public TaskDescription() {
        }

        @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
        public void KWHzl() {
            C19429gCa.this.AEQbTJ().AEQbTJ(C19429gCa.this.DbNXlk, C19429gCa.this.gEmmrt, C19429gCa.this.valueOf, C19429gCa.this.EZpvd, C19429gCa.this.djBIcL);
        }
    }

    public final TaskDescription KWHzl() {
        return (TaskDescription) this.AYXKKw.getValue();
    }

    public static final TaskDescription AYXKKw(C19429gCa c19429gCa) {
        return c19429gCa.new TaskDescription();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.gEmmrt = arguments.getLong("chainId", Long.MIN_VALUE);
            java.lang.String string = arguments.getString("walletId");
            if (string == null) {
                string = "";
            }
            this.DbNXlk = string;
            java.lang.String string2 = arguments.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            if (string2 == null) {
                string2 = "";
            }
            this.EZpvd = string2;
            this.valueOf = arguments.getLong("coinId", -1L);
            this.djBIcL = arguments.getBoolean("sortAddressByAssets", false);
        }
        wxq.setStyle(1);
        wxq.setCloseVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setDividerVisibility(false);
        java.lang.String string3 = wxq.getContext().getString(C13754dXa.FragmentManager.RKcVTr);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        wxq.setTitle(string3);
        wxq.EZpvd().setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C16488ekq c16488ekqKWHzl = C16488ekq.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(c16488ekqKWHzl, "");
        android.widget.TextView textView = c16488ekqKWHzl.OLrzqt;
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int i = C13754dXa.FragmentManager.getMaxItemsactivity_release;
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(this.gEmmrt));
        java.lang.String strDjBIcL = c10854bwMKWHzl != null ? c10854bwMKWHzl.djBIcL() : null;
        textView.setText(C33069mpW.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", strDjBIcL != null ? strDjBIcL : ""))));
        KWHzl(c16488ekqKWHzl);
        this.values = c16488ekqKWHzl;
        WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).KWHzl(KWHzl());
        AEQbTJ().AEQbTJ(this.DbNXlk, this.gEmmrt, this.valueOf, this.EZpvd, this.djBIcL);
        AhwBna();
    }

    public final void AhwBna() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AggregationAddressSwitchFragment$observeAggregationListState$1(this, null), 3, null);
    }

    public final void KWHzl(C16488ekq c16488ekq) {
        RecyclerView recyclerView = c16488ekq.AEQbTJ;
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(C19437gCi.class, new C19431gCc(new Function1() { // from class: o.gCh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19429gCa.OLrzqt(this.EZpvd, (C19437gCi) obj);
            }
        }));
        this.AEQbTJ = c59534zip;
        recyclerView.setAdapter(c59534zip);
    }

    public static final Unit OLrzqt(C19429gCa c19429gCa, C19437gCi c19437gCi) {
        Intrinsics.checkNotNullParameter(c19437gCi, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c19437gCi.copydefault())) {
            c19429gCa.dismissAllowingStateLoss();
            yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, Unit> yho = c19429gCa.KWHzl;
            if (yho != null) {
                yho.invoke(c19437gCi.copydefault(), c19437gCi.EZpvd(), java.lang.Integer.valueOf(c19437gCi.KWHzl()));
            }
        } else {
            c19429gCa.AEQbTJ().EZpvd(c19437gCi.KWHzl());
            c19429gCa.OLrzqt = java.lang.Integer.valueOf(c19437gCi.KWHzl());
            c19429gCa.EZpvd = c19437gCi.copydefault();
            androidx.fragment.app.FragmentManager childFragmentManager = c19429gCa.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            new C14461dlr(childFragmentManager, "completeAddress-aggregationAddressSwitch", new Function1() { // from class: o.gCb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19429gCa.AEQbTJ((java.lang.String) obj);
                }
            }, null, null, false, 48, null).EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gCa */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void show$default(C19429gCa c19429gCa, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, yHO yho, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function0 = new Function0() { // from class: o.gCg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C19429gCa.EZpvd();
                }
            };
        }
        c19429gCa.EZpvd(fragmentManager, str, yho, function0);
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, Unit> yho, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = yho;
        this.AhwBna = function0;
        show(fragmentManager, str);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        Function0<Unit> function0 = this.AhwBna;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).EZpvd(KWHzl());
    }

    /* JADX INFO: renamed from: o.gCa$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gCa.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C19429gCa OLrzqt(long j, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C19429gCa c19429gCa = new C19429gCa();
            c19429gCa.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("coinId", java.lang.Long.valueOf(j)), C56390yDp.OLrzqt("chainId", java.lang.Long.valueOf(j2)), C56390yDp.OLrzqt("walletId", str), C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str2), C56390yDp.OLrzqt("sortAddressByAssets", java.lang.Boolean.valueOf(z))));
            return c19429gCa;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory djBIcL() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C19434gCf.class), new Function1() { // from class: o.gCe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19429gCa.copydefault((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
