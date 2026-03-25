package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.botDetail.ui.eventHistory.BotEventHistoryFragment$observeViewModel$1;
import com.okinc.tradingbot.impl.botDetail.ui.eventHistory.BotEventHistoryFragment$startPeriodicRefreshIfNeeded$1;
import com.okinc.tradingbot.impl.botDetail.ui.eventHistory.BotEventHistoryViewModel;
import com.okinc.tradingbot.impl.dto.HistoryEventsDto;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class uIG extends uIK {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public java.lang.String AEQbTJ;
    public boolean AYXKKw;
    public final InterfaceC56387yDm EZpvd;
    public C48318uNa KWHzl;
    public boolean OLrzqt;
    public final int djBIcL = C48033uCm.Activity.DTwDnp;
    public final InterfaceC56387yDm gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    public uIG() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.eventHistory.BotEventHistoryFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.eventHistory.BotEventHistoryFragment$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotEventHistoryViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.eventHistory.BotEventHistoryFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.eventHistory.BotEventHistoryFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.eventHistory.BotEventHistoryFragment$special$$inlined$viewModels$default$5
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
        this.OLrzqt = true;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.uIF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return uIG.valueOf(this.KWHzl);
            }
        });
    }

    public final BotEventHistoryViewModel EZpvd() {
        return (BotEventHistoryViewModel) this.gEmmrt.getValue();
    }

    public final C50027uzf<HistoryEventsDto> OLrzqt() {
        return (C50027uzf) this.EZpvd.getValue();
    }

    public static final C50027uzf valueOf(uIG uig) {
        C50027uzf c50027uzf = new C50027uzf(new Activity());
        java.lang.String str = uig.valueOf;
        if (str == null) {
            str = "";
        }
        c50027uzf.register(HistoryEventsDto.class, new wOO(str));
        return c50027uzf;
    }

    public static final class Activity extends DiffUtil.ItemCallback<HistoryEventsDto> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(HistoryEventsDto historyEventsDto, HistoryEventsDto historyEventsDto2) {
            Intrinsics.checkNotNullParameter(historyEventsDto, "");
            Intrinsics.checkNotNullParameter(historyEventsDto2, "");
            return historyEventsDto.KWHzl() == historyEventsDto2.KWHzl() && Intrinsics.EZpvd((java.lang.Object) historyEventsDto.djBIcL(), (java.lang.Object) historyEventsDto2.djBIcL()) && Intrinsics.EZpvd((java.lang.Object) historyEventsDto.copydefault(), (java.lang.Object) historyEventsDto2.copydefault()) && Intrinsics.EZpvd((java.lang.Object) historyEventsDto.OLrzqt(), (java.lang.Object) historyEventsDto2.OLrzqt());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(HistoryEventsDto historyEventsDto, HistoryEventsDto historyEventsDto2) {
            Intrinsics.checkNotNullParameter(historyEventsDto, "");
            Intrinsics.checkNotNullParameter(historyEventsDto2, "");
            return Intrinsics.EZpvd(historyEventsDto, historyEventsDto2);
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C55173xeu c55173xeu;
        C55173xeu c55173xeu2;
        Intrinsics.checkNotNullParameter(view, "");
        C48318uNa c48318uNaOLrzqt = C48318uNa.OLrzqt(view);
        this.KWHzl = c48318uNaOLrzqt;
        if (c48318uNaOLrzqt != null && (c55173xeu2 = c48318uNaOLrzqt.KWHzl) != null) {
            c55173xeu2.setTitle(C33070mpX.AYXKKw(C55688xof.Application.WorkerThread));
        }
        C48318uNa c48318uNa = this.KWHzl;
        if (c48318uNa != null && (c55173xeu = c48318uNa.KWHzl) != null) {
            c55173xeu.setEmptyTypeImage(6);
        }
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.AEQbTJ = arguments.getString("arg_algo_id");
            this.valueOf = arguments.getString("arg_order_type");
            this.AYXKKw = arguments.getBoolean("arg_is_history", false);
            this.OLrzqt = arguments.getBoolean("arg_enable_polling", true);
        }
        DbNXlk();
        djBIcL();
        gEmmrt();
    }

    public final void gEmmrt() {
        if (this.OLrzqt) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BotEventHistoryFragment$startPeriodicRefreshIfNeeded$1(this, null), 3, null);
        }
    }

    private final void DbNXlk() {
        RecyclerView recyclerView;
        C48318uNa c48318uNa = this.KWHzl;
        if (c48318uNa == null || (recyclerView = c48318uNa.OLrzqt) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(OLrzqt());
    }

    private final void djBIcL() {
        C52692wUv.copydefault(EZpvd().EZpvd(), this, Lifecycle.State.STARTED, new BotEventHistoryFragment$observeViewModel$1(this, null));
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        KWHzl();
    }

    public final void KWHzl() {
        java.lang.String str;
        java.lang.String str2 = this.AEQbTJ;
        if (str2 == null || (str = this.valueOf) == null) {
            return;
        }
        BotEventHistoryViewModel.fetchHistoryEvents$default(EZpvd(), str2, str, false, 4, null);
    }

    public static /* synthetic */ void configure$default(uIG uig, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        uig.OLrzqt(str, str2, z, z2);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.valueOf = str2;
        this.AYXKKw = z;
        this.OLrzqt = z2;
        OLrzqt().register(HistoryEventsDto.class, new wOO(str2));
        if (isResumed()) {
            EZpvd().OLrzqt(str, str2, true);
        }
    }

    public final void AEQbTJ() {
        EZpvd().KWHzl();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.KWHzl = null;
        super.onDestroyView();
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uIG.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ uIG newInstance$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = true;
            }
            return taskDescription.AEQbTJ(str, str2, z, z2);
        }

        public final uIG AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            uIG uig = new uIG();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("arg_algo_id", str);
            bundle.putString("arg_order_type", str2);
            bundle.putBoolean("arg_is_history", z);
            bundle.putBoolean("arg_enable_polling", z2);
            uig.setArguments(bundle);
            return uig;
        }
    }
}
