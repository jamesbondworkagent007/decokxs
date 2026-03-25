package com.okinc.business.dex.trade.copytrading.edit.ui.fragment;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings;
import com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment;
import com.okinc.business.dex.trade.copytrading.edit.ui.model.TokenAmountUnit;
import com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingBuyInputPanelViewModel;
import com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingEditStrategyViewModel;
import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.model.CopyTradeDetail;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import java.util.HashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractActivityC33041mov;
import o.AbstractC19905gTr;
import o.C19910gTw;
import o.C23274hvD;
import o.C23313hvq;
import o.C23322hvz;
import o.C23506hzX;
import o.C24324ibg;
import o.C25382ivf;
import o.C25386ivj;
import o.C25389ivm;
import o.C31256lqb;
import o.C33070mpX;
import o.C33129mqd;
import o.C52761wXj;
import o.C55001xbh;
import o.C55008xbo;
import o.C55009xbp;
import o.C55051xce;
import o.C55249xgQ;
import o.C55258xgZ;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC19683gLl;
import o.InterfaceC56387yDm;
import o.ViewOnClickListenerC54939xaY;
import o.gTC;
import o.rVN;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class CopyTradingBuyInputPanelFragment extends AbstractC19905gTr<C23506hzX> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm gEmmrt;

    @yCM
    public InterfaceC19683gLl walletUiService;
    public final HashMap<Integer, Boolean> AEQbTJ = new HashMap<>();
    public final Activity copydefault = new Activity();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.DNMMPQ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C23506hzX AEQbTJ(CopyTradingBuyInputPanelFragment copyTradingBuyInputPanelFragment) {
        return (C23506hzX) copyTradingBuyInputPanelFragment.AEQbTJ();
    }

    public CopyTradingBuyInputPanelFragment() {
        final Function0 function0 = null;
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingBuyInputPanelViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment$special$$inlined$activityViewModels$default$3
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingEditStrategyViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment$special$$inlined$activityViewModels$default$5
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment$special$$inlined$activityViewModels$default$6
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

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final CopyTradingBuyInputPanelFragment OLrzqt() {
            return new CopyTradingBuyInputPanelFragment();
        }
    }

    public final CopyTradingBuyInputPanelViewModel AhwBna() {
        return (CopyTradingBuyInputPanelViewModel) this.gEmmrt.getValue();
    }

    /* JADX DEBUG: Possible override for method o.gTr.OLrzqt()V */
    public final CopyTradingEditStrategyViewModel OLrzqt() {
        return (CopyTradingEditStrategyViewModel) this.KWHzl.getValue();
    }

    public final InterfaceC19683gLl djBIcL() {
        InterfaceC19683gLl interfaceC19683gLl = this.walletUiService;
        if (interfaceC19683gLl != null) {
            return interfaceC19683gLl;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/View;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC7000aZw
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C23506hzX AEQbTJ(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C23506hzX c23506hzXKWHzl = C23506hzX.KWHzl(view);
        Intrinsics.checkNotNullExpressionValue(c23506hzXKWHzl, "");
        return c23506hzXKWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final C55249xgQ EZpvd() {
        C23506hzX c23506hzX = (C23506hzX) AEQbTJ();
        if (c23506hzX != null) {
            return c23506hzX.OLrzqt;
        }
        return null;
    }

    public static final class StateListAnimator implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C55249xgQ c55249xgQ;
            C23506hzX c23506hzXAEQbTJ = CopyTradingBuyInputPanelFragment.AEQbTJ(CopyTradingBuyInputPanelFragment.this);
            int selectedTabPosition = (c23506hzXAEQbTJ == null || (c55249xgQ = c23506hzXAEQbTJ.OLrzqt) == null) ? 0 : c55249xgQ.getSelectedTabPosition();
            if (!Intrinsics.EZpvd(CopyTradingBuyInputPanelFragment.this.AEQbTJ.get(Integer.valueOf(selectedTabPosition)), Boolean.TRUE)) {
                CopyTradingBuyInputPanelFragment.this.AEQbTJ.put(Integer.valueOf(selectedTabPosition), Boolean.valueOf(C33129mqd.OLrzqt((CharSequence) editable)));
            }
            CopyTradingBuyInputPanelFragment.this.isConnected();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC7000aZw, o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        AppCompatImageView appCompatImageView;
        C55008xbo c55008xbo;
        C55001xbh c55001xbhAkhnZx;
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        fARcdN();
        valueOf();
        C23506hzX c23506hzX = (C23506hzX) AEQbTJ();
        if (c23506hzX != null && (c55008xbo = c23506hzX.EZpvd) != null && (c55001xbhAkhnZx = c55008xbo.AkhnZx()) != null) {
            c55001xbhAkhnZx.setShowThousandsSeparator(true);
        }
        C23506hzX c23506hzX2 = (C23506hzX) AEQbTJ();
        if (c23506hzX2 == null || (appCompatImageView = c23506hzX2.KWHzl) == null) {
            return;
        }
        appCompatImageView.setVisibility(true ^ OLrzqt().uzCIH() ? 0 : 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        TabLayout.TabView tabView;
        C23506hzX c23506hzX = (C23506hzX) AEQbTJ();
        if (c23506hzX != null) {
            TabLayout.Tab tabAt = c23506hzX.OLrzqt.getTabAt(1);
            if (tabAt != null && (tabView = tabAt.view) != null) {
                tabView.setContentDescription("web3_dex_copytrading_edit_fixed_amount_tab");
            }
            C55001xbh c55001xbhAkhnZx = c23506hzX.EZpvd.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setContentDescription("web3_dex_copytrading_edit_buy_input");
            }
            c23506hzX.AhwBna.setContentDescription("web3_dex_copytrading_edit_balance_selector");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fARcdN() {
        C23506hzX c23506hzX = (C23506hzX) AEQbTJ();
        if (c23506hzX != null) {
            for (String str : yDY.gEmmrt(C33070mpX.AYXKKw(C23274hvD.Fragment.drbYRJ), C33070mpX.AYXKKw(C23274hvD.Fragment.RXdAnZ))) {
                C55249xgQ c55249xgQ = c23506hzX.OLrzqt;
                c55249xgQ.addTab(c55249xgQ.newTab().setText(str));
            }
            EZpvd(AhwBna().DbNXlk());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void setListener() {
        C55249xgQ c55249xgQ;
        C55249xgQ c55249xgQ2;
        AppCompatImageView appCompatImageView;
        C55008xbo c55008xbo;
        C55001xbh c55001xbhAkhnZx;
        C55258xgZ c55258xgZ;
        TextView textView;
        AppCompatImageView appCompatImageView2;
        C23506hzX c23506hzX = (C23506hzX) AEQbTJ();
        if (c23506hzX != null && (appCompatImageView2 = c23506hzX.copydefault) != null) {
            appCompatImageView2.setOnClickListener(new ActionBar(appCompatImageView2, 1000L, this));
        }
        C23506hzX c23506hzX2 = (C23506hzX) AEQbTJ();
        if (c23506hzX2 != null && (textView = c23506hzX2.AhwBna) != null) {
            textView.setOnClickListener(new Application(textView, 1000L, this));
        }
        C23506hzX c23506hzX3 = (C23506hzX) AEQbTJ();
        if (c23506hzX3 != null && (c55258xgZ = c23506hzX3.djBIcL) != null) {
            c55258xgZ.setOnClickListener(new Fragment(c55258xgZ, 1000L, this));
        }
        C23506hzX c23506hzX4 = (C23506hzX) AEQbTJ();
        if (c23506hzX4 != null && (c55008xbo = c23506hzX4.EZpvd) != null && (c55001xbhAkhnZx = c55008xbo.AkhnZx()) != null) {
            c55001xbhAkhnZx.addTextChangedListener(new StateListAnimator());
        }
        C23506hzX c23506hzX5 = (C23506hzX) AEQbTJ();
        if (c23506hzX5 != null && (appCompatImageView = c23506hzX5.KWHzl) != null) {
            appCompatImageView.setOnClickListener(new Dialog(appCompatImageView, 1000L, this));
        }
        C23506hzX c23506hzX6 = (C23506hzX) AEQbTJ();
        if (c23506hzX6 != null && (c55249xgQ2 = c23506hzX6.OLrzqt) != null) {
            c55249xgQ2.clearOnTabSelectedListeners();
        }
        C23506hzX c23506hzX7 = (C23506hzX) AEQbTJ();
        if (c23506hzX7 != null && (c55249xgQ = c23506hzX7.OLrzqt) != null) {
            c55249xgQ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new PendingIntent());
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass7(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass8(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass9(null), 3, null);
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass10(null), 3, null);
    }

    public static final class PendingIntent implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public PendingIntent() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            CopyTradingBuyInputPanelFragment.this.EZpvd(tab.getPosition() == 0);
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment$setListener$7, reason: invalid class name */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass7(Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CopyTradingBuyInputPanelFragment.this.new AnonymousClass7(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<Pair<String, String>> stateFlowEZpvd = CopyTradingBuyInputPanelFragment.this.AhwBna().EZpvd();
                final CopyTradingBuyInputPanelFragment copyTradingBuyInputPanelFragment = CopyTradingBuyInputPanelFragment.this;
                FlowCollector<? super Pair<String, String>> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment.setListener.7.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(Pair<String, String> pair, Continuation<? super Unit> continuation) {
                        if (pair.getFirst().length() > 0) {
                            copyTradingBuyInputPanelFragment.AEQbTJ(pair.getSecond());
                        }
                        copyTradingBuyInputPanelFragment.isConnected();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment$setListener$8, reason: invalid class name */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass8(Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CopyTradingBuyInputPanelFragment.this.new AnonymousClass8(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<DexMultiTokenInfoBean> stateFlowDjBIcL = CopyTradingBuyInputPanelFragment.this.AhwBna().djBIcL();
                final CopyTradingBuyInputPanelFragment copyTradingBuyInputPanelFragment = CopyTradingBuyInputPanelFragment.this;
                FlowCollector<? super DexMultiTokenInfoBean> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment.setListener.8.1
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public final Object emit(DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super Unit> continuation) {
                        CopyTradingBuyInputPanelFragment copyTradingBuyInputPanelFragment2 = copyTradingBuyInputPanelFragment;
                        String amountNum = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getAmountNum() : null;
                        if (amountNum == null) {
                            amountNum = "";
                        }
                        copyTradingBuyInputPanelFragment2.AEQbTJ(amountNum);
                        CopyTradingBuyInputPanelFragment copyTradingBuyInputPanelFragment3 = copyTradingBuyInputPanelFragment;
                        String tokenSymbol = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null;
                        copyTradingBuyInputPanelFragment3.KWHzl(tokenSymbol != null ? tokenSymbol : "");
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowDjBIcL.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ CopyTradingBuyInputPanelFragment EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, CopyTradingBuyInputPanelFragment copyTradingBuyInputPanelFragment) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = copyTradingBuyInputPanelFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.gEmmrt();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ CopyTradingBuyInputPanelFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, CopyTradingBuyInputPanelFragment copyTradingBuyInputPanelFragment) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = copyTradingBuyInputPanelFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.gEmmrt();
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ CopyTradingBuyInputPanelFragment KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(View view, long j, CopyTradingBuyInputPanelFragment copyTradingBuyInputPanelFragment) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = copyTradingBuyInputPanelFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.gEmmrt();
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ CopyTradingBuyInputPanelFragment AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(View view, long j, CopyTradingBuyInputPanelFragment copyTradingBuyInputPanelFragment) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = copyTradingBuyInputPanelFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C55258xgZ c55258xgZ = (C55258xgZ) this.EZpvd;
                if (this.AEQbTJ.AhwBna().DbNXlk()) {
                    CopyTradingEditStrategyViewModel.trackClickEvent$default(this.AEQbTJ.OLrzqt(), TrackButtonName.BUY_PERCENT_EXPLAIN.getButtonName(), null, 2, null);
                    Context context = c55258xgZ.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    ViewOnClickListenerC54939xaY.addPrimaryButton$default(new ViewOnClickListenerC54939xaY(context).EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.HJWChPRAkuRW), C33070mpX.AYXKKw(C23274hvD.Fragment.OijiEz)), C23274hvD.Fragment.OcIXYQ, (View.OnClickListener) null, 2, (Object) null).show();
                    return;
                }
                CopyTradingEditStrategyViewModel.trackClickEvent$default(this.AEQbTJ.OLrzqt(), TrackButtonName.BUY_AMOUNT_EXPLAIN.getButtonName(), null, 2, null);
                Context context2 = c55258xgZ.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(new ViewOnClickListenerC54939xaY(context2).EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.sIqKDg), C33070mpX.AYXKKw(C23274hvD.Fragment.Dap)), C23274hvD.Fragment.OcIXYQ, (View.OnClickListener) null, 2, (Object) null).show();
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment$setListener$9, reason: invalid class name */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass9(Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CopyTradingBuyInputPanelFragment.this.new AnonymousClass9(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<Unit> sharedFlowKWHzl = CopyTradingBuyInputPanelFragment.this.AhwBna().KWHzl();
                final CopyTradingBuyInputPanelFragment copyTradingBuyInputPanelFragment = CopyTradingBuyInputPanelFragment.this;
                FlowCollector<? super Unit> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment.setListener.9.1
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                        C23506hzX c23506hzXAEQbTJ;
                        C55008xbo c55008xbo;
                        C55001xbh c55001xbhAkhnZx;
                        C55008xbo c55008xbo2;
                        C55001xbh c55001xbhAkhnZx2;
                        C23506hzX c23506hzXAEQbTJ2 = CopyTradingBuyInputPanelFragment.AEQbTJ(copyTradingBuyInputPanelFragment);
                        if (!Intrinsics.EZpvd((Object) ((c23506hzXAEQbTJ2 == null || (c55008xbo2 = c23506hzXAEQbTJ2.EZpvd) == null || (c55001xbhAkhnZx2 = c55008xbo2.AkhnZx()) == null) ? null : c55001xbhAkhnZx2.isConnected()), (Object) copyTradingBuyInputPanelFragment.AhwBna().valueOf().getSecond()) && (c23506hzXAEQbTJ = CopyTradingBuyInputPanelFragment.AEQbTJ(copyTradingBuyInputPanelFragment)) != null && (c55008xbo = c23506hzXAEQbTJ.EZpvd) != null && (c55001xbhAkhnZx = c55008xbo.AkhnZx()) != null) {
                            c55001xbhAkhnZx.setPlainNumericText(copyTradingBuyInputPanelFragment.AhwBna().valueOf().getSecond());
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowKWHzl.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment$setListener$10, reason: invalid class name */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class AnonymousClass10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass10(Continuation<? super AnonymousClass10> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CopyTradingBuyInputPanelFragment.this.new AnonymousClass10(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment$setListener$10$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ CopyTradingBuyInputPanelFragment AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(CopyTradingBuyInputPanelFragment copyTradingBuyInputPanelFragment) {
                this.AEQbTJ = copyTradingBuyInputPanelFragment;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Result<gTC> result, Continuation<? super Unit> continuation) throws Throwable {
                CopyTradingBuyInputPanelFragment$setListener$10$1$emit$1 copyTradingBuyInputPanelFragment$setListener$10$1$emit$1;
                final gTC gtc;
                AnonymousClass3<T> anonymousClass3;
                C55249xgQ c55249xgQ;
                C55249xgQ c55249xgQ2;
                BuySettings buySettings;
                if (continuation instanceof CopyTradingBuyInputPanelFragment$setListener$10$1$emit$1) {
                    copyTradingBuyInputPanelFragment$setListener$10$1$emit$1 = (CopyTradingBuyInputPanelFragment$setListener$10$1$emit$1) continuation;
                    int i = copyTradingBuyInputPanelFragment$setListener$10$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        copyTradingBuyInputPanelFragment$setListener$10$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        copyTradingBuyInputPanelFragment$setListener$10$1$emit$1 = new CopyTradingBuyInputPanelFragment$setListener$10$1$emit$1(this, continuation);
                    }
                }
                Object objKWHzl = copyTradingBuyInputPanelFragment$setListener$10$1$emit$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = copyTradingBuyInputPanelFragment$setListener$10$1$emit$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objKWHzl);
                    if (result != null && Result.m7383isFailureimpl(result.m7386unboximpl())) {
                        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this.AEQbTJ, false, (String) null, 2, (Object) null);
                    }
                    if (result != null) {
                        Object objM7386unboximpl = result.m7386unboximpl();
                        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                            objM7386unboximpl = null;
                        }
                        gtc = (gTC) objM7386unboximpl;
                        if (gtc != null) {
                            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this.AEQbTJ, true, (String) null, 2, (Object) null);
                            CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModelOLrzqt = this.AEQbTJ.OLrzqt();
                            copyTradingBuyInputPanelFragment$setListener$10$1$emit$1.L$0 = this;
                            copyTradingBuyInputPanelFragment$setListener$10$1$emit$1.L$1 = gtc;
                            copyTradingBuyInputPanelFragment$setListener$10$1$emit$1.label = 1;
                            objKWHzl = copyTradingEditStrategyViewModelOLrzqt.KWHzl(copyTradingBuyInputPanelFragment$setListener$10$1$emit$1);
                            if (objKWHzl == objCopydefault) {
                                return objCopydefault;
                            }
                            anonymousClass3 = this;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gtc = (gTC) copyTradingBuyInputPanelFragment$setListener$10$1$emit$1.L$1;
                anonymousClass3 = (AnonymousClass3) copyTradingBuyInputPanelFragment$setListener$10$1$emit$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                BuySettings buySettings2 = (BuySettings) objKWHzl;
                CopyTradeDetail copyTradeDetailEZpvd = gtc.EZpvd();
                if (copyTradeDetailEZpvd != null && (buySettings = copyTradeDetailEZpvd.getBuySettings()) != null) {
                    buySettings2 = buySettings;
                }
                if (buySettings2 != null) {
                    CopyTradingBuyInputPanelViewModel copyTradingBuyInputPanelViewModelAhwBna = anonymousClass3.AEQbTJ.AhwBna();
                    CopyTradeDetail copyTradeDetailEZpvd2 = gtc.EZpvd();
                    copyTradingBuyInputPanelViewModelAhwBna.EZpvd(C31256lqb.KWHzl(copyTradeDetailEZpvd2 != null ? copyTradeDetailEZpvd2.getChainId() : null, (Function0<String>) new Function0() { // from class: o.gSR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return CopyTradingBuyInputPanelFragment.AnonymousClass10.AnonymousClass3.KWHzl(gtc);
                        }
                    }), buySettings2.getTokenAddress());
                    C23506hzX c23506hzXAEQbTJ = CopyTradingBuyInputPanelFragment.AEQbTJ(anonymousClass3.AEQbTJ);
                    if (c23506hzXAEQbTJ != null && (c55249xgQ2 = c23506hzXAEQbTJ.OLrzqt) != null) {
                        CopyTradingBuyInputPanelFragment copyTradingBuyInputPanelFragment = anonymousClass3.AEQbTJ;
                        int i3 = buySettings2.getBuyType() == 2 ? 0 : 1;
                        TabLayout.Tab tabAt = c55249xgQ2.getTabAt(i3);
                        if (c55249xgQ2.getSelectedTabPosition() == i3) {
                            copyTradingBuyInputPanelFragment.EZpvd(buySettings2.getBuyType() == 2);
                        } else {
                            c55249xgQ2.selectTab(tabAt);
                        }
                    }
                    CopyTradingBuyInputPanelViewModel copyTradingBuyInputPanelViewModelAhwBna2 = anonymousClass3.AEQbTJ.AhwBna();
                    int buyType = buySettings2.getBuyType();
                    String chainId = gtc.KWHzl().getChainId();
                    String tokenAddress = buySettings2.getTokenAddress();
                    String originInputAmount = buySettings2.getOriginInputAmount();
                    String maxBuyAmount = buySettings2.getMaxBuyAmount();
                    copyTradingBuyInputPanelViewModelAhwBna2.KWHzl(buyType, chainId, tokenAddress, originInputAmount, maxBuyAmount == null ? "" : maxBuyAmount, buySettings2.getRepeatCopyBuy());
                } else {
                    anonymousClass3.AEQbTJ.AhwBna().EZpvd(gtc.KWHzl().getChainId(), "");
                    C23506hzX c23506hzXAEQbTJ2 = CopyTradingBuyInputPanelFragment.AEQbTJ(anonymousClass3.AEQbTJ);
                    if (c23506hzXAEQbTJ2 != null && (c55249xgQ = c23506hzXAEQbTJ2.OLrzqt) != null) {
                        CopyTradingBuyInputPanelFragment copyTradingBuyInputPanelFragment2 = anonymousClass3.AEQbTJ;
                        int i4 = !copyTradingBuyInputPanelFragment2.AhwBna().DbNXlk() ? 1 : 0;
                        TabLayout.Tab tabAt2 = c55249xgQ.getTabAt(i4);
                        if (c55249xgQ.getSelectedTabPosition() == i4) {
                            copyTradingBuyInputPanelFragment2.EZpvd(copyTradingBuyInputPanelFragment2.AhwBna().DbNXlk());
                        } else {
                            c55249xgQ.selectTab(tabAt2);
                        }
                    }
                }
                return Unit.INSTANCE;
            }

            public static final String KWHzl(gTC gtc) {
                return gtc.KWHzl().getChainId();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<Result<gTC>> stateFlowFJNWhG = CopyTradingBuyInputPanelFragment.this.OLrzqt().fJNWhG();
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CopyTradingBuyInputPanelFragment.this);
                this.label = 1;
                if (stateFlowFJNWhG.collect(anonymousClass3, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public final void gEmmrt() {
        if (OLrzqt().uzCIH()) {
            return;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = AhwBna().copydefault();
        C19910gTw.Activity activity = C19910gTw.Companion;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        String strEZpvd = OLrzqt().EZpvd();
        String tokenContractAddress = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenContractAddress() : null;
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        activity.EZpvd(childFragmentManager, strEZpvd, tokenContractAddress, AhwBna().OLrzqt(OLrzqt().EZpvd()), new Function2() { // from class: o.gSU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return CopyTradingBuyInputPanelFragment.KWHzl(this.copydefault, (DexMultiTokenInfoBean) obj, (java.util.List) obj2);
            }
        });
    }

    public static final Unit KWHzl(CopyTradingBuyInputPanelFragment copyTradingBuyInputPanelFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean, List list) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        copyTradingBuyInputPanelFragment.OLrzqt().OLrzqt(TrackButtonName.QUOTE_TOKEN.getButtonName(), dexMultiTokenInfoBean.getTokenSymbol());
        copyTradingBuyInputPanelFragment.AhwBna().AEQbTJ((List<DexMultiTokenInfoBean>) list);
        copyTradingBuyInputPanelFragment.OLrzqt().AEQbTJ(dexMultiTokenInfoBean);
        copyTradingBuyInputPanelFragment.AhwBna().EZpvd(dexMultiTokenInfoBean);
        return Unit.INSTANCE;
    }

    public final void EZpvd(boolean z) {
        AhwBna().OLrzqt(z);
        if (z) {
            DbNXlk();
        } else {
            AYXKKw();
        }
    }

    public static final class Activity implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C55008xbo c55008xbo;
            C55001xbh c55001xbhAkhnZx;
            String strIsConnected;
            C23506hzX c23506hzXAEQbTJ;
            C55008xbo c55008xbo2;
            C55001xbh c55001xbhAkhnZx2;
            C23506hzX c23506hzXAEQbTJ2 = CopyTradingBuyInputPanelFragment.AEQbTJ(CopyTradingBuyInputPanelFragment.this);
            if (c23506hzXAEQbTJ2 == null || (c55008xbo = c23506hzXAEQbTJ2.EZpvd) == null || (c55001xbhAkhnZx = c55008xbo.AkhnZx()) == null || (strIsConnected = c55001xbhAkhnZx.isConnected()) == null || !C23313hvq.OLrzqt(strIsConnected, "1000") || (c23506hzXAEQbTJ = CopyTradingBuyInputPanelFragment.AEQbTJ(CopyTradingBuyInputPanelFragment.this)) == null || (c55008xbo2 = c23506hzXAEQbTJ.EZpvd) == null || (c55001xbhAkhnZx2 = c55008xbo2.AkhnZx()) == null) {
                return;
            }
            c55001xbhAkhnZx2.setPlainNumericText("1000");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw() {
        C55008xbo c55008xbo;
        C55001xbh c55001xbhAkhnZx;
        C55008xbo c55008xbo2;
        C55001xbh c55001xbhAkhnZx2;
        C55008xbo c55008xbo3;
        C55001xbh c55001xbhAkhnZx3;
        C55258xgZ c55258xgZ;
        C23506hzX c23506hzX = (C23506hzX) AEQbTJ();
        if (c23506hzX != null && (c55258xgZ = c23506hzX.djBIcL) != null) {
            c55258xgZ.setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.sIqKDg));
        }
        C23506hzX c23506hzX2 = (C23506hzX) AEQbTJ();
        if (c23506hzX2 != null && (c55008xbo3 = c23506hzX2.EZpvd) != null && (c55001xbhAkhnZx3 = c55008xbo3.AkhnZx()) != null) {
            c55001xbhAkhnZx3.EZpvd(Integer.MAX_VALUE);
        }
        C23506hzX c23506hzX3 = (C23506hzX) AEQbTJ();
        if (c23506hzX3 != null && (c55008xbo2 = c23506hzX3.EZpvd) != null && (c55001xbhAkhnZx2 = c55008xbo2.AkhnZx()) != null) {
            c55001xbhAkhnZx2.removeTextChangedListener(this.copydefault);
        }
        C23506hzX c23506hzX4 = (C23506hzX) AEQbTJ();
        if (c23506hzX4 != null && (c55008xbo = c23506hzX4.EZpvd) != null && (c55001xbhAkhnZx = c55008xbo.AkhnZx()) != null) {
            c55001xbhAkhnZx.setPlainNumericText(AhwBna().valueOf().getSecond());
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = AhwBna().copydefault();
        String tokenSymbol = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenSymbol() : null;
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        KWHzl(tokenSymbol);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void DbNXlk() {
        C55008xbo c55008xbo;
        C55001xbh c55001xbhAkhnZx;
        C55008xbo c55008xbo2;
        C55001xbh c55001xbhAkhnZx2;
        C55008xbo c55008xbo3;
        C55001xbh c55001xbhAkhnZx3;
        C55008xbo c55008xbo4;
        C55001xbh c55001xbhAkhnZx4;
        C55258xgZ c55258xgZ;
        C23506hzX c23506hzX = (C23506hzX) AEQbTJ();
        if (c23506hzX != null && (c55258xgZ = c23506hzX.djBIcL) != null) {
            c55258xgZ.setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.HJWChPRAkuRW));
        }
        C23506hzX c23506hzX2 = (C23506hzX) AEQbTJ();
        if (c23506hzX2 != null && (c55008xbo4 = c23506hzX2.EZpvd) != null && (c55001xbhAkhnZx4 = c55008xbo4.AkhnZx()) != null) {
            c55001xbhAkhnZx4.EZpvd(0);
        }
        C23506hzX c23506hzX3 = (C23506hzX) AEQbTJ();
        if (c23506hzX3 != null && (c55008xbo3 = c23506hzX3.EZpvd) != null && (c55001xbhAkhnZx3 = c55008xbo3.AkhnZx()) != null) {
            c55001xbhAkhnZx3.removeTextChangedListener(this.copydefault);
        }
        C23506hzX c23506hzX4 = (C23506hzX) AEQbTJ();
        if (c23506hzX4 != null && (c55008xbo2 = c23506hzX4.EZpvd) != null && (c55001xbhAkhnZx2 = c55008xbo2.AkhnZx()) != null) {
            c55001xbhAkhnZx2.addTextChangedListener(this.copydefault);
        }
        C23506hzX c23506hzX5 = (C23506hzX) AEQbTJ();
        if (c23506hzX5 != null && (c55008xbo = c23506hzX5.EZpvd) != null && (c55001xbhAkhnZx = c55008xbo.AkhnZx()) != null) {
            c55001xbhAkhnZx.setPlainNumericText(AhwBna().valueOf().getSecond());
        }
        KWHzl("");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(String str) {
        C55008xbo c55008xbo;
        TextView textViewCopydefault;
        C55008xbo c55008xbo2;
        TextView textViewCopydefault2;
        if (AhwBna().DbNXlk()) {
            C23506hzX c23506hzX = (C23506hzX) AEQbTJ();
            if (c23506hzX == null || (c55008xbo2 = c23506hzX.EZpvd) == null || (textViewCopydefault2 = copydefault(c55008xbo2)) == null) {
                return;
            }
            TokenAmountUnit tokenAmountUnit = new TokenAmountUnit("%");
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            textViewCopydefault2.setText(tokenAmountUnit.getText(contextRequireContext));
            return;
        }
        C23506hzX c23506hzX2 = (C23506hzX) AEQbTJ();
        if (c23506hzX2 == null || (c55008xbo = c23506hzX2.EZpvd) == null || (textViewCopydefault = copydefault(c55008xbo)) == null) {
            return;
        }
        TokenAmountUnit tokenAmountUnit2 = new TokenAmountUnit(str);
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        textViewCopydefault.setText(tokenAmountUnit2.getText(contextRequireContext2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r13v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r13v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(String str) {
        TextView textView;
        String str2;
        String tokenSymbol;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        TextView textView2;
        if (str.length() > 0) {
            C23506hzX c23506hzX = (C23506hzX) AEQbTJ();
            if (c23506hzX != null && (textView2 = c23506hzX.AhwBna) != null) {
                DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = AhwBna().copydefault();
                String tokenSymbol2 = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenSymbol() : null;
                textView2.setText(C23322hvz.toLocalizedNumberWithSymbol$default(str, tokenSymbol2 == null ? "" : tokenSymbol2, false, null, false, false, 30, null));
            }
        } else {
            C23506hzX c23506hzX2 = (C23506hzX) AEQbTJ();
            if (c23506hzX2 != null && (textView = c23506hzX2.AhwBna) != null) {
                DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = AhwBna().copydefault();
                if (dexMultiTokenInfoBeanCopydefault2 == null || (tokenSymbol = dexMultiTokenInfoBeanCopydefault2.getTokenSymbol()) == null) {
                    str2 = null;
                } else if (C33129mqd.OLrzqt((CharSequence) tokenSymbol)) {
                    str2 = " " + tokenSymbol;
                } else {
                    str2 = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                textView.setText("--" + str2);
            }
        }
        C23506hzX c23506hzX3 = (C23506hzX) AEQbTJ();
        if (c23506hzX3 != null && (appCompatImageView2 = c23506hzX3.copydefault) != null) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault3 = AhwBna().copydefault();
            String tokenLogoUrl = dexMultiTokenInfoBeanCopydefault3 != null ? dexMultiTokenInfoBeanCopydefault3.getTokenLogoUrl() : null;
            C25386ivj.KWHzl(appCompatImageView2, tokenLogoUrl != null ? tokenLogoUrl : "");
        }
        C23506hzX c23506hzX4 = (C23506hzX) AEQbTJ();
        if (c23506hzX4 == null || (appCompatImageView = c23506hzX4.KWHzl) == null) {
            return;
        }
        appCompatImageView.setVisibility(OLrzqt().uzCIH() ^ true ? 0 : 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void isConnected() {
        C55008xbo c55008xbo;
        C55001xbh c55001xbhAkhnZx;
        String strIsConnected;
        C55249xgQ c55249xgQ;
        C23506hzX c23506hzX = (C23506hzX) AEQbTJ();
        if (c23506hzX == null || (c55008xbo = c23506hzX.EZpvd) == null || (c55001xbhAkhnZx = c55008xbo.AkhnZx()) == null || (strIsConnected = c55001xbhAkhnZx.isConnected()) == null) {
            return;
        }
        int selectedTabPosition = 0;
        if (strIsConnected.length() == 0) {
            HashMap<Integer, Boolean> map = this.AEQbTJ;
            C23506hzX c23506hzX2 = (C23506hzX) AEQbTJ();
            if (c23506hzX2 != null && (c55249xgQ = c23506hzX2.OLrzqt) != null) {
                selectedTabPosition = c55249xgQ.getSelectedTabPosition();
            }
            if (Intrinsics.EZpvd(map.get(Integer.valueOf(selectedTabPosition)), Boolean.TRUE)) {
                AEQbTJ((CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.dbUqJD));
            } else {
                AEQbTJ("");
            }
            CopyTradingBuyInputPanelViewModel.updateBuyInputValue$default(AhwBna(), strIsConnected, false, null, null, 12, null);
            return;
        }
        if (C23313hvq.copydefault(strIsConnected, 0)) {
            AEQbTJ((CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.DRGLNw));
            CopyTradingBuyInputPanelViewModel.updateBuyInputValue$default(AhwBna(), strIsConnected, false, null, null, 12, null);
            return;
        }
        if (!AhwBna().DbNXlk()) {
            String strOLrzqt = AhwBna().OLrzqt();
            if (strOLrzqt.length() <= 0 || !C23313hvq.OLrzqt(strIsConnected, strOLrzqt)) {
                if (!AhwBna().DbNXlk() || !EZpvd(AhwBna().OLrzqt())) {
                    AEQbTJ("");
                    CopyTradingBuyInputPanelViewModel.updateBuyInputValue$default(AhwBna(), strIsConnected, true, null, null, 12, null);
                    return;
                }
            }
        }
        C24324ibg.TaskDescription taskDescription = C24324ibg.Companion;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        AEQbTJ(taskDescription.EZpvd(contextRequireContext, C23274hvD.Fragment.iUnTnt).OLrzqt("btn", C33070mpX.AYXKKw(C23274hvD.Fragment.DDjfYY), (60 & 4) != 0 ? C55051xce.OLrzqt.valueOf() : null, (60 & 8) != 0 ? C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl) : C25382ivf.KWHzl(C52761wXj.Activity.DKtBnz), (60 & 16) != 0 ? 0 : 0, (60 & 32) != 0, new Function0() { // from class: o.gSS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CopyTradingBuyInputPanelFragment.valueOf(this.KWHzl);
            }
        }).AEQbTJ());
        CopyTradingBuyInputPanelViewModel.updateBuyInputValue$default(AhwBna(), strIsConnected, false, null, null, 12, null);
    }

    public static final Unit valueOf(CopyTradingBuyInputPanelFragment copyTradingBuyInputPanelFragment) {
        FragmentActivity fragmentActivityRequireActivity = copyTradingBuyInputPanelFragment.requireActivity();
        String tokenContractAddress = null;
        AbstractActivityC33041mov abstractActivityC33041mov = fragmentActivityRequireActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivityRequireActivity : null;
        if (abstractActivityC33041mov == null) {
            return Unit.INSTANCE;
        }
        InterfaceC19683gLl interfaceC19683gLlDjBIcL = copyTradingBuyInputPanelFragment.djBIcL();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copyTradingBuyInputPanelFragment.AhwBna().copydefault();
        String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        String str = chainId == null ? "" : chainId;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = copyTradingBuyInputPanelFragment.AhwBna().copydefault();
        if (dexMultiTokenInfoBeanCopydefault2 != null) {
            if (dexMultiTokenInfoBeanCopydefault2.isMainChainCoin()) {
                dexMultiTokenInfoBeanCopydefault2 = null;
            }
            if (dexMultiTokenInfoBeanCopydefault2 != null) {
                tokenContractAddress = dexMultiTokenInfoBeanCopydefault2.getTokenContractAddress();
            }
        }
        InterfaceC19683gLl.StateListAnimator.showRechargeDialog$default(interfaceC19683gLlDjBIcL, abstractActivityC33041mov, str, tokenContractAddress == null ? "" : tokenContractAddress, null, null, null, 56, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(CharSequence charSequence) {
        int i;
        C23506hzX c23506hzX = (C23506hzX) AEQbTJ();
        if (c23506hzX == null) {
            return;
        }
        if (charSequence.length() > 0) {
            c23506hzX.EZpvd.setState(2);
            c23506hzX.EZpvd.setErrorText(charSequence);
            return;
        }
        C55008xbo c55008xbo = c23506hzX.EZpvd;
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            i = !c55001xbhAkhnZx.isFocused() ? 0 : 1;
        }
        c55008xbo.setState(i);
        c23506hzX.EZpvd.values();
    }

    private final TextView copydefault(C55008xbo c55008xbo) {
        LinearLayout linearLayoutAuCTel = c55008xbo.AuCTel();
        View childAt = linearLayoutAuCTel != null ? linearLayoutAuCTel.getChildAt(1) : null;
        TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
        if (textView != null) {
            return textView;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(c55008xbo.getContext());
        ColorStateList colorStateList = ContextCompat.getColorStateList(appCompatTextView.getContext(), C52761wXj.Activity.fdOvFl);
        appCompatTextView.setTextColor(colorStateList);
        TextViewCompat.setTextAppearance(appCompatTextView, C52761wXj.LoaderManager.KWHzl);
        appCompatTextView.setGravity(16);
        appCompatTextView.setCompoundDrawablePadding(appCompatTextView.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.dxcTrN));
        TextViewCompat.setCompoundDrawableTintList(appCompatTextView, colorStateList);
        C55009xbp c55009xbpFIwbmz = c55008xbo.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.EZpvd(appCompatTextView);
        }
        if (linearLayoutAuCTel != null) {
            linearLayoutAuCTel.setMinimumWidth(0);
        }
        return appCompatTextView;
    }

    public final boolean EZpvd(String str) {
        return C33129mqd.OLrzqt((CharSequence) str) && !Intrinsics.EZpvd((Object) str, (Object) "--") && C33129mqd.OLrzqt((Object) str, (Object) 0);
    }
}
