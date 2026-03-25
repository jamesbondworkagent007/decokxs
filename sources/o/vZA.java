package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.order.strategy.signalbot.ui.dialog.SignalMultiCoinSelectFragment$initViewModel$1;
import com.okinc.tradingbot.impl.order.strategy.signalbot.ui.dialog.SignalMultiCoinSelectFragment$initViewModel$2;
import com.okinc.tradingbot.impl.order.strategy.signalbot.ui.dialog.SignalMultiCoinSelectFragment$initViewModel$3;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import com.okinc.unify_trade.bot.data.SignalMultiCoinPairSelectItemData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import o.C52861wac;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vZA extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AYXKKw;
    public uSK AhwBna;
    public Function2<? super java.util.List<? extends SignalCoinPairItemData>, ? super java.lang.Boolean, Unit> djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.vZz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vZA.valueOf(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.vZw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vZA.isConnected(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vZB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vZA.gEmmrt(this.copydefault);
        }
    });
    public final boolean copydefault = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.copydefault;
    }

    public vZA() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.signalbot.ui.dialog.SignalMultiCoinSelectFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.signalbot.ui.dialog.SignalMultiCoinSelectFragment$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(vZG.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.signalbot.ui.dialog.SignalMultiCoinSelectFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.signalbot.ui.dialog.SignalMultiCoinSelectFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.signalbot.ui.dialog.SignalMultiCoinSelectFragment$special$$inlined$viewModels$default$5
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
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.vZC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vZA.DbNXlk(this.KWHzl);
            }
        });
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vZA.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ vZA newInstance$default(Activity activity, java.util.ArrayList arrayList, java.lang.String str, java.lang.String str2, Function2 function2, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                str2 = "";
            }
            return activity.KWHzl(arrayList, str, str2, function2);
        }

        public final vZA KWHzl(@NotNull java.util.ArrayList<SignalMultiCoinPairSelectItemData> arrayList, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function2<? super java.util.List<? extends SignalCoinPairItemData>, ? super java.lang.Boolean, Unit> function2) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function2, "");
            vZA vza = new vZA();
            vza.djBIcL = function2;
            vza.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("search_data_list", arrayList), C56390yDp.OLrzqt("signal_cur_lever", str), C56390yDp.OLrzqt("dialog_title", str2)));
            return vza;
        }
    }

    public static final java.util.List valueOf(vZA vza) {
        android.os.Bundle arguments = vza.getArguments();
        java.util.ArrayList parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("search_data_list") : null;
        return parcelableArrayList == null ? yDY.AhwBna() : parcelableArrayList;
    }

    public final java.util.List<SignalMultiCoinPairSelectItemData> copydefault() {
        return (java.util.List) this.EZpvd.getValue();
    }

    private final java.lang.String KWHzl() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String isConnected(vZA vza) {
        android.os.Bundle arguments = vza.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("signal_cur_lever") : null;
        return string == null ? "" : string;
    }

    private final java.lang.String EZpvd() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public static final java.lang.String gEmmrt(vZA vza) {
        android.os.Bundle arguments = vza.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("dialog_title") : null;
        return string == null ? "" : string;
    }

    public final vZG OLrzqt() {
        return (vZG) this.AYXKKw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C43316rmw AEQbTJ() {
        return (C43316rmw) this.gEmmrt.getValue();
    }

    public static final C43316rmw DbNXlk(final vZA vza) {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(CommonEmptyData.class, new C50041uzt(null, 1, null));
        java.lang.String strKWHzl = vza.KWHzl();
        java.util.List<SignalMultiCoinPairSelectItemData> listCopydefault = vza.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listCopydefault) {
            if (!((SignalMultiCoinPairSelectItemData) obj).gEmmrt()) {
                arrayList.add(obj);
            }
        }
        c43316rmw.register(C52861wac.Activity.class, new C52861wac(strKWHzl, arrayList, new Function1() { // from class: o.vZF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return vZA.KWHzl(this.copydefault, (java.lang.String) obj2);
            }
        }, new Function1() { // from class: o.vZE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return vZA.EZpvd(this.AEQbTJ, ((java.lang.Boolean) obj2).booleanValue());
            }
        }));
        c43316rmw.register(SignalMultiCoinPairSelectItemData.class, new vZY(new Function1() { // from class: o.vZD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return vZA.KWHzl(this.OLrzqt, (SignalMultiCoinPairSelectItemData) obj2);
            }
        }));
        return c43316rmw;
    }

    public static final Unit KWHzl(vZA vza, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        vza.OLrzqt().AEQbTJ(str);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(vZA vza, boolean z) {
        vza.OLrzqt().EZpvd(z);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vZA vza, SignalMultiCoinPairSelectItemData signalMultiCoinPairSelectItemData) {
        Intrinsics.checkNotNullParameter(signalMultiCoinPairSelectItemData, "");
        vza.OLrzqt().KWHzl(signalMultiCoinPairSelectItemData);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        java.lang.String strEZpvd = EZpvd();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd)) {
            strEZpvd = C33070mpX.AYXKKw(C55688xof.Application.STbtMW);
        }
        wxq.setTitle(strEZpvd);
        wxq.setCloseVisibility(true);
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        uSK uskCopydefault = uSK.copydefault(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        RecyclerView recyclerView = uskCopydefault.EZpvd;
        recyclerView.setAdapter(AEQbTJ());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        wYF wyf = uskCopydefault.KWHzl;
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new Application(c52794wYpAEQbTJ, 1000L, this));
        }
        this.AhwBna = uskCopydefault;
        djBIcL();
    }

    private final void djBIcL() {
        Flow<java.util.List<java.lang.Object>> flowAEQbTJ = OLrzqt().AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C52692wUv.flowAndCollectLatest$default(flowAEQbTJ, viewLifecycleOwner, null, new SignalMultiCoinSelectFragment$initViewModel$1(this, null), 2, null);
        StateFlow<java.lang.Boolean> stateFlowCopydefault = OLrzqt().copydefault();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C52692wUv.flowAndCollectLatest$default(stateFlowCopydefault, viewLifecycleOwner2, null, new SignalMultiCoinSelectFragment$initViewModel$2(this, null), 2, null);
        StateFlow<java.util.List<SignalMultiCoinPairSelectItemData>> stateFlowOLrzqt = OLrzqt().OLrzqt();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        C52692wUv.flowAndCollectLatest$default(stateFlowOLrzqt, viewLifecycleOwner3, null, new SignalMultiCoinSelectFragment$initViewModel$3(this, null), 2, null);
        OLrzqt().copydefault(copydefault());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.AhwBna = null;
        this.djBIcL = null;
        super.onDestroyView();
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ vZA copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vZA vza) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = vza;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.OLrzqt().djBIcL();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ vZA KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vZA vza) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = vza;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                java.util.List<SignalMultiCoinPairSelectItemData> value = this.KWHzl.OLrzqt().OLrzqt().getValue();
                if (!value.isEmpty()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
                    for (SignalMultiCoinPairSelectItemData signalMultiCoinPairSelectItemData : value) {
                        arrayList.add(new SignalCoinPairItemData(signalMultiCoinPairSelectItemData.KWHzl(), signalMultiCoinPairSelectItemData.AEQbTJ(), (java.lang.Integer) null, (java.lang.Integer) null, signalMultiCoinPairSelectItemData.OLrzqt(), signalMultiCoinPairSelectItemData.copydefault(), (java.lang.String) null, signalMultiCoinPairSelectItemData.EZpvd(), false, false, false, 0, false, 8012, (DefaultConstructorMarker) null));
                    }
                    Function2 function2 = this.KWHzl.djBIcL;
                    if (function2 != null) {
                        function2.invoke(arrayList, java.lang.Boolean.valueOf(this.KWHzl.OLrzqt().KWHzl()));
                    }
                    this.KWHzl.dismiss();
                    return;
                }
                C55326xho.toastWithFailedIcon$default(C55688xof.Application.validateRelationship, 0, 1, (java.lang.Object) null);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ vZA EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, vZA vza) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = vza;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }
}
