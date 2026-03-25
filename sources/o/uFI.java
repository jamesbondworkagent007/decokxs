package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmSelectCryptoBottomSheet$initViewModel$1;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmSelectCryptoBottomSheet$initViewModel$2;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmSelectCryptoBottomSheet$initViewModel$3;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmSelectCryptoViewModel;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class uFI extends uEB {
    public static final Application Companion = new Application(null);
    public static final int valueOf = 8;
    public Function1<? super java.util.List<uCB>, Unit> AYXKKw;
    public C52794wYp AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public C48471uSq DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final boolean gEmmrt = true;
    public final boolean isConnected = true;
    public final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.isConnected;
    }

    public uFI() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmSelectCryptoBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmSelectCryptoBottomSheet$special$$inlined$viewModels$default$2
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(LlmSelectCryptoViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmSelectCryptoBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmSelectCryptoBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmSelectCryptoBottomSheet$special$$inlined$viewModels$default$5
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
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.uFH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return uFI.AkhnZx(this.copydefault);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.uFJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return uFI.fetchVPNInfo(this.EZpvd);
            }
        });
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.uFO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(uFI.values(this.KWHzl));
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.uFM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(uFI.isConnected(this.copydefault));
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.uFK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return uFI.DbNXlk(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uFI.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.Set<java.lang.String> set, @NotNull java.lang.String str, java.lang.Integer num, java.lang.Integer num2, @NotNull Function1<? super java.util.List<uCB>, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(set, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            uFI ufi = new uFI();
            ufi.AYXKKw = function1;
            ufi.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("DATA_SET", set), C56390yDp.OLrzqt("bot_inst_type", str), C56390yDp.OLrzqt("MIN_INST_SIZE", num), C56390yDp.OLrzqt("MAX_INST_SIZE", num2)));
            C49662usl.EZpvd(ufi, fragmentManager, "LlmSelectCryptoBottomSheet");
        }
    }

    public final LlmSelectCryptoViewModel valueOf() {
        return (LlmSelectCryptoViewModel) this.fJNWhG.getValue();
    }

    public static final java.util.Set AkhnZx(uFI ufi) {
        android.os.Bundle arguments = ufi.getArguments();
        java.lang.Object obj = arguments != null ? arguments.get("DATA_SET") : null;
        java.util.Set set = obj instanceof java.util.Set ? (java.util.Set) obj : null;
        return set == null ? yEE.copydefault() : set;
    }

    /* JADX DEBUG: Possible override for method o.uEB.KWHzl()V */
    public final java.util.Set<java.lang.Object> KWHzl() {
        return (java.util.Set) this.djBIcL.getValue();
    }

    private final java.lang.String DbNXlk() {
        return (java.lang.String) this.values.getValue();
    }

    public static final java.lang.String fetchVPNInfo(uFI ufi) {
        android.os.Bundle arguments = ufi.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("bot_inst_type") : null;
        return string == null ? "" : string;
    }

    private final int AkhnZx() {
        return ((java.lang.Number) this.fIwbmz.getValue()).intValue();
    }

    public static final int values(uFI ufi) {
        android.os.Bundle arguments = ufi.getArguments();
        if (arguments != null) {
            return arguments.getInt("MIN_INST_SIZE");
        }
        return 1;
    }

    public static final int isConnected(uFI ufi) {
        android.os.Bundle arguments = ufi.getArguments();
        if (arguments != null) {
            return arguments.getInt("MAX_INST_SIZE");
        }
        return Integer.MAX_VALUE;
    }

    private final int values() {
        return ((java.lang.Number) this.fetchVPNInfo.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C43316rmw isConnected() {
        return (C43316rmw) this.AkhnZx.getValue();
    }

    public static final C43316rmw DbNXlk(final uFI ufi) {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(CommonEmptyData.class, new C50041uzt(null, 1, 0 == true ? 1 : 0));
        c43316rmw.register(uCB.class, new uFL(new Function1() { // from class: o.uFF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return uFI.EZpvd(this.copydefault, (uCB) obj);
            }
        }));
        return c43316rmw;
    }

    public static final class StateListAnimator implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            uFI.this.valueOf().AEQbTJ(C33129mqd.gEmmrt(editable));
        }
    }

    public static final Unit EZpvd(uFI ufi, uCB ucb) {
        Intrinsics.checkNotNullParameter(ucb, "");
        ufi.valueOf().OLrzqt(ucb);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DkGEDn));
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new ActionBar(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C48471uSq c48471uSqOLrzqt = C48471uSq.OLrzqt(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        Intrinsics.copydefault(c48471uSqOLrzqt);
        EZpvd(c48471uSqOLrzqt);
        this.DbNXlk = c48471uSqOLrzqt;
        fetchVPNInfo();
    }

    private final void fetchVPNInfo() {
        C52692wUv.flowAndCollectLatest$default(valueOf().KWHzl(), this, null, new LlmSelectCryptoBottomSheet$initViewModel$1(this, null), 2, null);
        C52692wUv.flowAndCollectLatest$default(valueOf().EZpvd(), this, null, new LlmSelectCryptoBottomSheet$initViewModel$2(this, null), 2, null);
        C52692wUv.flowAndCollectLatest$default(valueOf().djBIcL(), this, null, new LlmSelectCryptoBottomSheet$initViewModel$3(this, null), 2, null);
        valueOf().KWHzl(KWHzl(), DbNXlk());
    }

    public final void EZpvd(C48471uSq c48471uSq) {
        c48471uSq.copydefault.setText(C33069mpW.copydefault(C48033uCm.Fragment.pauseLocationServices, C56424yEw.gEmmrt(C56390yDp.OLrzqt("minAmount", EZpvd(AkhnZx())), C56390yDp.OLrzqt("maxAmount", EZpvd(values())))));
        c48471uSq.AEQbTJ.KWHzl().addTextChangedListener(new StateListAnimator());
        RecyclerView recyclerView = c48471uSq.KWHzl;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(isConnected());
    }

    public final java.lang.String EZpvd(int i) {
        return pTB.formatLocalized$default(java.lang.String.valueOf(i), null, 1, null);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        wyf.setPrimaryText(C33069mpW.copydefault(C48033uCm.Fragment.dPnHjp, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "--"))));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            this.AhwBna = c52794wYpCopydefault;
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
        wyf.setSecondaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.SFHvfS));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
            c52794wYpAEQbTJ.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ uFI AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, uFI ufi) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = ufi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.dismiss();
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ uFI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, uFI ufi) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = ufi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function1 function1 = this.copydefault.AYXKKw;
                if (function1 != null) {
                    function1.invoke(this.copydefault.valueOf().AEQbTJ());
                }
                this.copydefault.dismiss();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ uFI OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, uFI ufi) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = ufi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.valueOf().valueOf();
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.DbNXlk = null;
        this.AhwBna = null;
        this.AYXKKw = null;
    }
}
