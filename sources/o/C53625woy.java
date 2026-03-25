package o;

import android.os.Build;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsContentFragment$initListeners$1;
import com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsContentFragment$initListeners$2;
import com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel;
import com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawType;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.bot.data.SmartArbProfitsInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsInsideLineItemData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47978uAl;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.woy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53625woy extends AbstractC53616wop {
    public static final Activity Companion = new Activity(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public C48330uNm AhwBna;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.woF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53625woy.valueOf(this.copydefault);
        }
    });
    public final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.dNCPSb;
    }

    public C53625woy() {
        final Function0 function0 = new Function0() { // from class: o.woK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53625woy.gEmmrt(this.AEQbTJ);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsContentFragment$special$$inlined$viewModels$default$1
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SmartArbWithdrawProfitsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsContentFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsContentFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsContentFragment$special$$inlined$viewModels$default$4
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.woG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53625woy.AYXKKw();
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.woJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53625woy.djBIcL(this.AEQbTJ);
            }
        });
    }

    private final TacticsData AkhnZx() {
        return (TacticsData) this.valueOf.getValue();
    }

    public static final TacticsData valueOf(C53625woy c53625woy) {
        java.lang.Object parcelable;
        android.os.Bundle arguments = c53625woy.getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = arguments.getParcelable("key_tactics_data", TacticsData.class);
        } else {
            java.lang.Object parcelable2 = arguments.getParcelable("key_tactics_data");
            parcelable = (TacticsData) (parcelable2 instanceof TacticsData ? parcelable2 : null);
        }
        return (TacticsData) parcelable;
    }

    /* JADX INFO: renamed from: o.woy$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.woy.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C53625woy copydefault(@NotNull TacticsData tacticsData, @NotNull SmartArbWithdrawType smartArbWithdrawType) {
            Intrinsics.checkNotNullParameter(tacticsData, "");
            Intrinsics.checkNotNullParameter(smartArbWithdrawType, "");
            C53625woy c53625woy = new C53625woy();
            c53625woy.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("key_tactics_data", tacticsData), C56390yDp.OLrzqt("tab_type", smartArbWithdrawType)));
            return c53625woy;
        }
    }

    public final C48330uNm AhwBna() {
        C48330uNm c48330uNm = this.AhwBna;
        Intrinsics.copydefault(c48330uNm);
        return c48330uNm;
    }

    public final SmartArbWithdrawProfitsViewModel valueOf() {
        return (SmartArbWithdrawProfitsViewModel) this.gEmmrt.getValue();
    }

    public static final ViewModelStoreOwner gEmmrt(C53625woy c53625woy) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c53625woy.requireParentFragment();
        if (!(fragmentRequireParentFragment instanceof C53613wom)) {
            fragmentRequireParentFragment = null;
        }
        return fragmentRequireParentFragment != null ? fragmentRequireParentFragment : c53625woy;
    }

    private final C50027uzf<java.lang.Object> djBIcL() {
        return (C50027uzf) this.AYXKKw.getValue();
    }

    public static final C50027uzf AYXKKw() {
        return new C50027uzf(new ActionBar());
    }

    /* JADX INFO: renamed from: o.woy$ActionBar */
    public static final class ActionBar extends DiffUtil.ItemCallback<java.lang.Object> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(java.lang.Object obj, java.lang.Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            return Intrinsics.EZpvd(obj, obj2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(java.lang.Object obj, java.lang.Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            return Intrinsics.EZpvd(obj instanceof SmartArbWithdrawProfitsViewModel.Activity ? (SmartArbWithdrawProfitsViewModel.Activity) obj : null, obj2 instanceof SmartArbWithdrawProfitsViewModel.Activity ? (SmartArbWithdrawProfitsViewModel.Activity) obj2 : null);
        }
    }

    public final SmartArbWithdrawType gEmmrt() {
        return (SmartArbWithdrawType) this.values.getValue();
    }

    public static final SmartArbWithdrawType djBIcL(C53625woy c53625woy) {
        android.os.Bundle arguments = c53625woy.getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("tab_type") : null;
        SmartArbWithdrawType smartArbWithdrawType = serializable instanceof SmartArbWithdrawType ? (SmartArbWithdrawType) serializable : null;
        return smartArbWithdrawType == null ? SmartArbWithdrawType.Arbitrage : smartArbWithdrawType;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AhwBna = C48330uNm.EZpvd(view);
        isConnected();
        fetchVPNInfo();
    }

    private final void isConnected() {
        final java.lang.String strOLrzqt;
        SmartArbProfitsInfo smartArbProfitsInfo;
        ProfitDetailResponse stakingProfit;
        SmartArbProfitsInfo smartArbProfitsInfo2;
        ProfitDetailResponse autoStakingProfit;
        C48330uNm c48330uNmAhwBna = AhwBna();
        final C47988uAv c47988uAv = c48330uNmAhwBna.AEQbTJ;
        c47988uAv.sSMYrx();
        C47988uAv.setInputLabel$default(c47988uAv, C33070mpX.AYXKKw(C55688xof.Application.getCustomAction), null, 2, null);
        if (gEmmrt() == SmartArbWithdrawType.Staking) {
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
            TacticsData tacticsDataAkhnZx = AkhnZx();
            if (tacticsDataAkhnZx == null || (smartArbProfitsInfo2 = tacticsDataAkhnZx.getSmartArbProfitsInfo()) == null || (autoStakingProfit = smartArbProfitsInfo2.getAutoStakingProfit()) == null || (strOLrzqt = autoStakingProfit.getCcy()) == null) {
                strOLrzqt = valueOf().OLrzqt();
            }
            TacticsData tacticsDataAkhnZx2 = AkhnZx();
            final java.lang.String ccy = (tacticsDataAkhnZx2 == null || (smartArbProfitsInfo = tacticsDataAkhnZx2.getSmartArbProfitsInfo()) == null || (stakingProfit = smartArbProfitsInfo.getStakingProfit()) == null) ? null : stakingProfit.getCcy();
            c47988uAv.setInputUnit(strOLrzqt == null ? ccy : strOLrzqt);
            c47988uAv.setUnitClickable((strOLrzqt == null || ccy == null) ? false : true, new Function0() { // from class: o.woB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C53625woy.copydefault(this.EZpvd, strOLrzqt, ccy, c47988uAv);
                }
            });
        } else {
            Intrinsics.copydefault(c47988uAv);
            AEQbTJ(c47988uAv, "--", "USDT");
        }
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.woD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53625woy.AEQbTJ(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        C52691wUu c52691wUu = C52691wUu.copydefault;
        android.content.Context context = c47988uAv.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c47988uAv.setInputBasicsFunctionButton(c52691wUu.KWHzl(context, C33070mpX.AYXKKw(C48033uCm.Fragment.gFTCsA), new Function0() { // from class: o.woE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53625woy.OLrzqt(c47988uAv, this);
            }
        }));
        c48330uNmAhwBna.EZpvd.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.svhCHd));
        djBIcL().register(SmartArbWithdrawProfitsViewModel.Activity.class, new TaskDescription(this, new Function1() { // from class: o.woC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53625woy.AEQbTJ(this.AEQbTJ, (SmartArbWithdrawProfitsViewModel.Activity) obj);
            }
        }));
        djBIcL().register(TacticsInsideLineItemData.class, new C52512wOd());
        c48330uNmAhwBna.copydefault.setAdapter(djBIcL());
        c48330uNmAhwBna.copydefault.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        if (c48330uNmAhwBna.copydefault.getItemDecorationCount() == 0) {
            c48330uNmAhwBna.copydefault.addItemDecoration(new Application(C52761wXj.StateListAnimator.getFieldNames));
        }
        c48330uNmAhwBna.copydefault.setItemAnimator(null);
    }

    public static final Unit copydefault(C53625woy c53625woy, java.lang.String str, java.lang.String str2, final C47988uAv c47988uAv) {
        java.util.ArrayList arrayList;
        C47978uAl.Application application = C47978uAl.Companion;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (str != null) {
            arrayList = arrayList2;
            arrayList.add(new TradeMenuItemBean(str, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c47988uAv.fARcdN()), null, null, false, null, null, 0, false, null, 0, false, 0, null, null, 32764, null));
        } else {
            arrayList = arrayList2;
        }
        if (str2 != null) {
            arrayList = arrayList;
            arrayList.add(new TradeMenuItemBean(str2, Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) c47988uAv.fARcdN()), null, null, false, null, null, 0, false, null, 0, false, 0, null, null, 32764, null));
        }
        C47978uAl c47978uAlNewInstance$default = C47978uAl.Application.newInstance$default(application, arrayList, null, true, null, 0, 26, null);
        c47978uAlNewInstance$default.KWHzl(new StateListAnimator(c47988uAv, c53625woy));
        c47978uAlNewInstance$default.copydefault(new Function0() { // from class: o.woI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53625woy.KWHzl(c47988uAv);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = c53625woy.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c47978uAlNewInstance$default.show(childFragmentManager, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.woy$StateListAnimator */
    public static final class StateListAnimator implements C47978uAl.StateListAnimator {
        public final /* synthetic */ C53625woy AEQbTJ;
        public final /* synthetic */ C47988uAv copydefault;

        public StateListAnimator(C47988uAv c47988uAv, C53625woy c53625woy) {
            this.copydefault = c47988uAv;
            this.AEQbTJ = c53625woy;
        }

        @Override // o.C47978uAl.StateListAnimator
        public void copydefault(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            this.copydefault.setInputUnit(tradeMenuItemBean.getTitle());
            this.copydefault.setSidesLabelUnselect();
            SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModelValueOf = this.AEQbTJ.valueOf();
            SmartArbWithdrawType smartArbWithdrawType = SmartArbWithdrawType.Staking;
            smartArbWithdrawType.setCcy(this.AEQbTJ.AhwBna().AEQbTJ.fARcdN());
            smartArbWithdrawProfitsViewModelValueOf.OLrzqt(new SmartArbWithdrawProfitsViewModel.StateListAnimator.C0663StateListAnimator(smartArbWithdrawType));
        }
    }

    public static final Unit KWHzl(C47988uAv c47988uAv) {
        c47988uAv.setSidesLabelUnselect();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C53625woy c53625woy, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (str != null) {
            c53625woy.valueOf().OLrzqt(new SmartArbWithdrawProfitsViewModel.StateListAnimator.ActionBar(c53625woy.gEmmrt(), str, c53625woy.AhwBna().AEQbTJ.fARcdN()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.woy$TaskDescription */
    public final class TaskDescription extends AbstractC59533zio<SmartArbWithdrawProfitsViewModel.Activity, StateListAnimator> {
        public final Function1<SmartArbWithdrawProfitsViewModel.Activity, Unit> KWHzl;
        public final /* synthetic */ C53625woy OLrzqt;

        /* JADX INFO: renamed from: o.woy$TaskDescription$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j) {
                this.KWHzl = view;
                this.AEQbTJ = j;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                }
            }
        }

        /* JADX INFO: renamed from: o.woy$TaskDescription$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ TaskDescription EZpvd;
            public final /* synthetic */ SmartArbWithdrawProfitsViewModel.Activity KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, SmartArbWithdrawProfitsViewModel.Activity activity, TaskDescription taskDescription) {
                this.OLrzqt = view;
                this.copydefault = j;
                this.KWHzl = activity;
                this.EZpvd = taskDescription;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    pUU.copydefault("WithdrawProfitsContentFragment", this.KWHzl);
                    this.EZpvd.KWHzl.invoke(this.KWHzl);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel$Activity, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull C53625woy c53625woy, Function1<? super SmartArbWithdrawProfitsViewModel.Activity, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = c53625woy;
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            uNN unnEZpvd = uNN.EZpvd(layoutInflater, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(unnEZpvd, "");
            return new StateListAnimator(this, unnEZpvd);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull SmartArbWithdrawProfitsViewModel.Activity activity) {
            C55320xhi c55320xhiKWHzl;
            C55320xhi c55320xhiKWHzl2;
            C55320xhi c55320xhiKWHzl3;
            C55320xhi c55320xhiKWHzl4;
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(activity, "");
            uNN unnKWHzl = stateListAnimator.KWHzl();
            if (activity.EZpvd()) {
                unnKWHzl.KWHzl.setHelperLabelType(1);
                C55312xha c55312xhaValueOf = unnKWHzl.KWHzl.valueOf();
                if (c55312xhaValueOf != null && (c55320xhiKWHzl4 = c55312xhaValueOf.KWHzl()) != null) {
                    c55320xhiKWHzl4.setOnClickListener(new Application(c55320xhiKWHzl4, 1000L, activity, this));
                }
            } else {
                unnKWHzl.KWHzl.setHelperLabelType(2);
                C55312xha c55312xhaValueOf2 = unnKWHzl.KWHzl.valueOf();
                if (c55312xhaValueOf2 != null && (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) != null) {
                    c55320xhiKWHzl.setOnClickListener(new ActionBar(c55320xhiKWHzl, 1000L));
                }
            }
            C55312xha c55312xhaValueOf3 = unnKWHzl.KWHzl.valueOf();
            if (c55312xhaValueOf3 != null && (c55320xhiKWHzl3 = c55312xhaValueOf3.KWHzl()) != null) {
                c55320xhiKWHzl3.setText(activity.KWHzl());
            }
            C55312xha c55312xhaValueOf4 = unnKWHzl.AEQbTJ.valueOf();
            if (c55312xhaValueOf4 == null || (c55320xhiKWHzl2 = c55312xhaValueOf4.KWHzl()) == null) {
                return;
            }
            c55320xhiKWHzl2.setText(activity.copydefault());
        }

        /* JADX INFO: renamed from: o.woy$TaskDescription$StateListAnimator */
        public final class StateListAnimator extends RecyclerView.ViewHolder {
            public final /* synthetic */ TaskDescription AEQbTJ;
            public final uNN OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final uNN KWHzl() {
                return this.OLrzqt;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull TaskDescription taskDescription, uNN unn) {
                super(unn.getRoot());
                Intrinsics.checkNotNullParameter(unn, "");
                this.AEQbTJ = taskDescription;
                this.OLrzqt = unn;
            }
        }
    }

    public static final Unit OLrzqt(C47988uAv c47988uAv, C53625woy c53625woy) {
        C47988uAv.setInputContent$default(c47988uAv, uLP.KWHzl(c53625woy.valueOf().KWHzl()), false, false, 6, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C53625woy c53625woy, SmartArbWithdrawProfitsViewModel.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        pUU.KWHzl(c53625woy.getTAG(), "onLabelClick : " + C56524yIo.AEQbTJ(activity.getClass()).valueOf());
        if (activity instanceof SmartArbWithdrawProfitsViewModel.Activity.Application) {
            c53625woy.valueOf().OLrzqt(SmartArbWithdrawProfitsViewModel.StateListAnimator.Application.OLrzqt);
        } else if (activity instanceof SmartArbWithdrawProfitsViewModel.Activity.StateListAnimator) {
            c53625woy.valueOf().OLrzqt(SmartArbWithdrawProfitsViewModel.StateListAnimator.Activity.EZpvd);
        } else if (activity instanceof SmartArbWithdrawProfitsViewModel.Activity.C0661Activity) {
            c53625woy.valueOf().OLrzqt(SmartArbWithdrawProfitsViewModel.StateListAnimator.FragmentManager.copydefault);
        }
        return Unit.INSTANCE;
    }

    private final void fetchVPNInfo() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SmartArbWithdrawProfitsContentFragment$initListeners$1(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new SmartArbWithdrawProfitsContentFragment$initListeners$2(this, null), 3, null);
    }

    public final void OLrzqt(SmartArbWithdrawProfitsViewModel.PendingIntent pendingIntent) {
        C50027uzf.submitList$default(djBIcL(), pendingIntent.EZpvd(), null, 2, null);
        C47988uAv c47988uAv = AhwBna().AEQbTJ;
        if (gEmmrt() == SmartArbWithdrawType.Staking) {
            c47988uAv.setInputUnit(AhwBna().AEQbTJ.fARcdN());
        } else {
            Intrinsics.copydefault(c47988uAv);
            AEQbTJ(c47988uAv, uLP.AEQbTJ(pendingIntent.gEmmrt()), pendingIntent.djBIcL());
        }
        c47988uAv.setMaxDecimal(pendingIntent.OLrzqt());
        android.widget.TextView textView = AhwBna().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(pendingIntent.KWHzl() ? 0 : 8);
        java.lang.String strCopydefault = pendingIntent.copydefault();
        if (strCopydefault != null) {
            AhwBna().AEQbTJ.setInputErrorMsg(strCopydefault);
        } else {
            AhwBna().AEQbTJ.copydefault();
        }
    }

    public final void AEQbTJ(C47988uAv c47988uAv, java.lang.String str, java.lang.String str2) {
        java.lang.String strEZpvd = EZpvd(str2, str);
        c47988uAv.setInputHint(strEZpvd);
        c47988uAv.setFloatingHint(copydefault(c47988uAv.values(), strEZpvd));
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        return "≤ " + str2 + " " + str;
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        return str + " (" + str2 + ")";
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.AhwBna = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: o.woy$Application */
    public final class Application extends RecyclerView.ItemDecoration {
        public final int OLrzqt;

        public Application(@androidx.annotation.DimenRes int i) {
            this.OLrzqt = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            super.getItemOffsets(rect, view, recyclerView, state);
            int iOLrzqt = C33070mpX.OLrzqt(this.OLrzqt);
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = iOLrzqt;
            }
        }
    }
}
