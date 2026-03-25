package com.okinc.business.invest_biz.ui.screens.base_transaction;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.NewSignCallbackBean;
import com.okinc.business.invest_biz.data.bean.InvestCallDataResult;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestSlippageConfig;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.NetworkFee;
import com.okinc.business.invest_biz.data.bean.SwapSlippageConfig;
import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.ui.bean.InvestConsumeData;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem;
import com.okinc.business.invest_biz.ui.screens.validator_selection.model.ValidatorSelectionParams;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC24170iXm;
import o.AbstractC32996moC;
import o.AbstractC58185ywX;
import o.C23978iQj;
import o.C24169iXl;
import o.C24181iXx;
import o.C25481ixY;
import o.C25493ixk;
import o.C26478jdA;
import o.C26683jgu;
import o.C26684jgv;
import o.C27026jnS;
import o.C27493jwI;
import o.C27508jwX;
import o.C27589jxz;
import o.C33070mpX;
import o.C33129mqd;
import o.C43422row;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC23916iOb;
import o.InterfaceC24171iXn;
import o.InterfaceC24182iXy;
import o.InterfaceC26481jdD;
import o.InterfaceC26677jgo;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC9738bbJ;
import o.ViewOnClickListenerC54939xaY;
import o.iCF;
import o.iTW;
import o.iUD;
import o.iUZ;
import o.iXB;
import o.iXC;
import o.iXD;
import o.rVN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseTransactionFragment extends AbstractC32996moC implements InterfaceC26481jdD, InterfaceC26677jgo {
    public final InterfaceC56387yDm KWHzl;
    public WeakReference<Context> copydefault;

    @yCM
    public InterfaceC23916iOb extDep;

    @yCM
    public InterfaceC24171iXn transactionManager;

    @yCM
    public C24169iXl vmFactory;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    public static final /* synthetic */ class Fragment implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InvestAction.values().length];
            try {
                iArr[InvestAction.SubscriptionApprove.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InvestAction.RedeemApprove.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    public abstract void DbNXlk();

    public abstract void OLrzqt(@NotNull InterfaceC24182iXy interfaceC24182iXy);

    public abstract TransactionConfig valueOf();

    public BaseTransactionFragment() {
        final Function0 function0 = new Function0() { // from class: o.iXj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseTransactionFragment.EZpvd(this.copydefault);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment$special$$inlined$viewModels$default$2
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AbstractC24170iXm.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final C24169iXl AkhnZx() {
        C24169iXl c24169iXl = this.vmFactory;
        if (c24169iXl != null) {
            return c24169iXl;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final InterfaceC23916iOb aU_() {
        InterfaceC23916iOb interfaceC23916iOb = this.extDep;
        if (interfaceC23916iOb != null) {
            return interfaceC23916iOb;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final InterfaceC24171iXn AYXKKw() {
        InterfaceC24171iXn interfaceC24171iXn = this.transactionManager;
        if (interfaceC24171iXn != null) {
            return interfaceC24171iXn;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public C26684jgv djBIcL() {
        return new C26684jgv(new C26683jgu(valueOf().isConnected(), valueOf().copydefault(), valueOf().AuCTel(), InvestAction.Subscription), true);
    }

    public final AbstractC24170iXm fetchVPNInfo() {
        return (AbstractC24170iXm) this.KWHzl.getValue();
    }

    public static final CreationExtras EZpvd(BaseTransactionFragment baseTransactionFragment) {
        return C24169iXl.Companion.AEQbTJ(baseTransactionFragment.valueOf());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.copydefault = new WeakReference<>(context);
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AkhnZx();
    }

    @Override // o.InterfaceC26481jdD
    public void EZpvd(@NotNull InvestNetworkFeeItem investNetworkFeeItem) {
        Intrinsics.checkNotNullParameter(investNetworkFeeItem, "");
        iXB value = fetchVPNInfo().fetchVPNInfo().getValue();
        iXB ixbKWHzl = value != null ? value.KWHzl((4091 & 1) != 0 ? value.copydefault : null, (4091 & 2) != 0 ? value.valueOf : null, (4091 & 4) != 0 ? value.AkhnZx : null, (4091 & 8) != 0 ? value.OLrzqt : null, (4091 & 16) != 0 ? value.AYXKKw : investNetworkFeeItem, (4091 & 32) != 0 ? value.gEmmrt : null, (4091 & 64) != 0 ? value.fetchVPNInfo : 0L, (4091 & 128) != 0 ? value.djBIcL : null, (4091 & 256) != 0 ? value.AEQbTJ : 0, (4091 & 512) != 0 ? value.AhwBna : false, (4091 & 1024) != 0 ? value.KWHzl : false, (4091 & 2048) != 0 ? value.EZpvd : false) : null;
        if (ixbKWHzl != null) {
            fetchVPNInfo().copydefault(ixbKWHzl);
        }
    }

    @Override // o.InterfaceC26677jgo
    public void copydefault(@NotNull TransactionMethod transactionMethod) {
        Intrinsics.checkNotNullParameter(transactionMethod, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BaseTransactionFragment$onToggleSwitch$1(this, transactionMethod, null), 3, null);
    }

    @Override // o.InterfaceC26677jgo
    public void copydefault(@NotNull ValidatorSelectionParams validatorSelectionParams) {
        Intrinsics.checkNotNullParameter(validatorSelectionParams, "");
        C27026jnS c27026jnSOLrzqt = C27026jnS.Companion.OLrzqt(validatorSelectionParams);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c27026jnSOLrzqt.show(parentFragmentManager);
    }

    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC24182iXy interfaceC24182iXy, Continuation<? super Unit> continuation) {
            BaseTransactionFragment.this.OLrzqt(interfaceC24182iXy);
            if (interfaceC24182iXy instanceof InterfaceC24182iXy.Activity) {
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) BaseTransactionFragment.this, true, (String) null, 2, (Object) null);
            } else if (interfaceC24182iXy instanceof InterfaceC24182iXy.TaskDescription) {
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) BaseTransactionFragment.this, false, (String) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    public void EZpvd() {
        C27589jxz.collectOnViewLifecycle$default(this, fetchVPNInfo().AhwBna(), null, new ActionBar(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, fetchVPNInfo().AkhnZx(), null, new Activity(), 2, null);
        fetchVPNInfo().copydefault().observe(this, new Fragment(new Function1() { // from class: o.iXb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseTransactionFragment.copydefault(this.KWHzl, (InvestConsumeData) obj);
            }
        }));
        C27589jxz.collectOnViewLifecycle$default(this, fetchVPNInfo().valueOf(), null, new TaskDescription(), 2, null);
    }

    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(iXD ixd, Continuation<? super Unit> continuation) {
            BaseTransactionFragment.this.EZpvd(ixd);
            return Unit.INSTANCE;
        }
    }

    public static final Unit copydefault(BaseTransactionFragment baseTransactionFragment, InvestConsumeData investConsumeData) {
        if (!((Boolean) investConsumeData.getData()).booleanValue()) {
            iXB value = baseTransactionFragment.fetchVPNInfo().fetchVPNInfo().getValue();
            InterfaceC24171iXn interfaceC24171iXnAYXKKw = baseTransactionFragment.AYXKKw();
            String strGEmmrt = C33129mqd.gEmmrt(Long.valueOf(baseTransactionFragment.valueOf().copydefault()));
            InvestGasPriceConfig value2 = baseTransactionFragment.fetchVPNInfo().OLrzqt().getValue();
            if (value2 == null) {
                value2 = new InvestGasPriceConfig((InvestSlippageConfig) null, (NetworkFee) null, (String) null, (SwapSlippageConfig) null, 15, (DefaultConstructorMarker) null);
            }
            String first = interfaceC24171iXnAYXKKw.copydefault(strGEmmrt, value2).getFirst();
            if (value != null) {
                AbstractC24170iXm abstractC24170iXmFetchVPNInfo = baseTransactionFragment.fetchVPNInfo();
                if (first == null) {
                    first = "";
                }
                abstractC24170iXmFetchVPNInfo.copydefault(value.KWHzl((4091 & 1) != 0 ? value.copydefault : null, (4091 & 2) != 0 ? value.valueOf : null, (4091 & 4) != 0 ? value.AkhnZx : null, (4091 & 8) != 0 ? value.OLrzqt : first, (4091 & 16) != 0 ? value.AYXKKw : null, (4091 & 32) != 0 ? value.gEmmrt : null, (4091 & 64) != 0 ? value.fetchVPNInfo : 0L, (4091 & 128) != 0 ? value.djBIcL : null, (4091 & 256) != 0 ? value.AEQbTJ : 0, (4091 & 512) != 0 ? value.AhwBna : false, (4091 & 1024) != 0 ? value.KWHzl : false, (4091 & 2048) != 0 ? value.EZpvd : false));
            }
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, Continuation<? super Unit> continuation) {
            if (str != null) {
                BaseTransactionFragment.this.copydefault(str);
            }
            return Unit.INSTANCE;
        }
    }

    public final boolean EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.copydefault(OLrzqt(), str);
    }

    public final String OLrzqt() {
        C25481ixY c25481ixYAYXKKw;
        String strOLrzqt;
        iXC ixcAEQbTJ = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue());
        return (ixcAEQbTJ == null || (c25481ixYAYXKKw = ixcAEQbTJ.AYXKKw()) == null || (strOLrzqt = c25481ixYAYXKKw.OLrzqt()) == null) ? "0" : strOLrzqt;
    }

    public final String gEmmrt() {
        String strAkhnZx;
        iXC ixcAEQbTJ = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue());
        return (ixcAEQbTJ == null || (strAkhnZx = ixcAEQbTJ.AkhnZx()) == null) ? "0" : strAkhnZx;
    }

    public final String aV_() {
        String strIsConnected;
        iXC ixcAEQbTJ = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue());
        return (ixcAEQbTJ == null || (strIsConnected = ixcAEQbTJ.isConnected()) == null) ? "0" : strIsConnected;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jgv.trackButtonClick$default(o.jgv, java.lang.String, com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):void */
    public final void OLrzqt(@NotNull NetworkFee networkFee) {
        Intrinsics.checkNotNullParameter(networkFee, "");
        C26478jdA.ActionBar actionBar = C26478jdA.Companion;
        iXB value = fetchVPNInfo().fetchVPNInfo().getValue();
        actionBar.KWHzl(networkFee, value != null ? value.valueOf() : null).show(getChildFragmentManager(), C56524yIo.AEQbTJ(getClass()).valueOf());
        djBIcL().OLrzqt("network_fee", fetchVPNInfo().KWHzl(), (28 & 4) != 0 ? null : null, (28 & 8) != 0 ? null : null, (28 & 16) != 0 ? null : null);
    }

    public final void isConnected() {
        if (fetchVPNInfo().OLrzqt().getValue() != null) {
            C23978iQj.Companion.AEQbTJ(6).show(getChildFragmentManager(), "javaClass");
        }
    }

    public final void EZpvd(iXD ixd) {
        if (getContext() == null || (ixd instanceof iXD.Activity)) {
            return;
        }
        if (ixd instanceof iXD.ActionBar) {
            EZpvd((iXD.ActionBar) ixd);
            return;
        }
        if (ixd instanceof iXD.StateListAnimator) {
            OLrzqt((iXD.StateListAnimator) ixd);
            return;
        }
        if (!(ixd instanceof iXD.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        iXD.TaskDescription taskDescription = (iXD.TaskDescription) ixd;
        Throwable thOLrzqt = taskDescription.OLrzqt();
        if (thOLrzqt != null && (thOLrzqt instanceof OKServerException) && ((OKServerException) thOLrzqt).getCode() == 111000111) {
            iUZ.Companion.OLrzqt(new iUZ.TaskDescription() { // from class: o.iXc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.iUZ.TaskDescription
                public final void KWHzl() {
                    BaseTransactionFragment.copydefault(this.copydefault);
                }
            }).show(getChildFragmentManager(), iUZ.class.getSimpleName());
        } else {
            EZpvd(taskDescription.OLrzqt());
        }
    }

    public static final void copydefault(BaseTransactionFragment baseTransactionFragment) {
        baseTransactionFragment.fetchVPNInfo().EZpvd(true);
    }

    public final void OLrzqt(Bundle bundle, int i) {
        DbNXlk();
        if (bundle == null || bundle.getInt("result") != -1) {
            djBIcL().OLrzqt(EopTrackEvent.CLOSE);
            return;
        }
        int i2 = StateListAnimator.KWHzl[InvestAction.Companion.copydefault(i).ordinal()];
        if (i2 == 1 || i2 == 2) {
            return;
        }
        djBIcL().OLrzqt("confirm_button");
        EZpvd(bundle, i);
    }

    public final void EZpvd(Bundle bundle, int i) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C27508jwX.toTransactionResultPage$default(C27508jwX.AEQbTJ, activity, bundle, fetchVPNInfo().DbNXlk(), valueOf().AkhnZx(), null, valueOf(), 8, null);
            activity.finish();
        }
    }

    public final void OLrzqt(final iXD.StateListAnimator stateListAnimator) {
        WeakReference<Context> weakReference = this.copydefault;
        if (weakReference == null) {
            Intrinsics.gEmmrt("");
            weakReference = null;
        }
        Context context = weakReference.get();
        if (context != null) {
            C27508jwX.AEQbTJ.copydefault(context, stateListAnimator.EZpvd(), new Function1() { // from class: o.iXf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BaseTransactionFragment.AEQbTJ(this.AEQbTJ, stateListAnimator, (android.os.Bundle) obj);
                }
            }, new Function1() { // from class: o.iXi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BaseTransactionFragment.OLrzqt(this.EZpvd, stateListAnimator, (NewSignCallbackBean) obj);
                }
            });
        }
    }

    public static final Unit AEQbTJ(BaseTransactionFragment baseTransactionFragment, iXD.StateListAnimator stateListAnimator, Bundle bundle) {
        if (bundle == null || bundle.getInt("result") != -1) {
            baseTransactionFragment.DbNXlk();
        } else {
            baseTransactionFragment.OLrzqt(bundle, stateListAnimator.AEQbTJ().getOrderType());
        }
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX OLrzqt(BaseTransactionFragment baseTransactionFragment, iXD.StateListAnimator stateListAnimator, NewSignCallbackBean newSignCallbackBean) {
        Intrinsics.checkNotNullParameter(newSignCallbackBean, "");
        return baseTransactionFragment.KWHzl(stateListAnimator, null, stateListAnimator.AEQbTJ(), newSignCallbackBean.getBody(), newSignCallbackBean.getHeaderMap());
    }

    public final void EZpvd(final iXD.ActionBar actionBar) {
        WeakReference<Context> weakReference = this.copydefault;
        if (weakReference == null) {
            Intrinsics.gEmmrt("");
            weakReference = null;
        }
        Context context = weakReference.get();
        if (context != null) {
            final iXC ixcAEQbTJ = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue());
            if (ixcAEQbTJ == null) {
                throw new IllegalStateException("TransactionInfo is Expected.");
            }
            C27508jwX.AEQbTJ.EZpvd(context, actionBar.EZpvd(), new Function1() { // from class: o.iXd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BaseTransactionFragment.AEQbTJ(this.EZpvd, actionBar, (android.os.Bundle) obj);
                }
            }, new Function1() { // from class: o.iXa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BaseTransactionFragment.KWHzl(this.copydefault, actionBar, (NewCallbackBean) obj);
                }
            }, new Function1() { // from class: o.iXe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BaseTransactionFragment.KWHzl(actionBar, this, ixcAEQbTJ, (NewCallbackBean) obj);
                }
            });
        }
    }

    public static final Unit AEQbTJ(BaseTransactionFragment baseTransactionFragment, iXD.ActionBar actionBar, Bundle bundle) {
        baseTransactionFragment.OLrzqt(bundle, actionBar.copydefault().getOrderType());
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX KWHzl(BaseTransactionFragment baseTransactionFragment, iXD.ActionBar actionBar, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        return submitTransaction$default(baseTransactionFragment, actionBar, newCallbackBean, actionBar.copydefault(), null, null, 24, null);
    }

    public static final AbstractC58185ywX KWHzl(iXD.ActionBar actionBar, BaseTransactionFragment baseTransactionFragment, iXC ixc, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        return actionBar.KWHzl().invoke(newCallbackBean, actionBar.copydefault(), baseTransactionFragment.valueOf(), ixc.EZpvd().KWHzl(), ixc.EZpvd().values());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC58185ywX submitTransaction$default(BaseTransactionFragment baseTransactionFragment, iXD ixd, NewCallbackBean newCallbackBean, InvestTxModel investTxModel, String str, Map map, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitTransaction");
        }
        if ((i & 8) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i & 16) != 0) {
            map = new HashMap();
        }
        return baseTransactionFragment.KWHzl(ixd, newCallbackBean, investTxModel, str2, map);
    }

    public final AbstractC58185ywX<ResponseData<String>> KWHzl(iXD ixd, NewCallbackBean newCallbackBean, InvestTxModel investTxModel, String str, Map<String, String> map) {
        NewCallbackBean newCallbackBeanCopy = newCallbackBean;
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.firstOrNull(aU_().gEmmrt().copydefault());
        if (interfaceC9738bbJ == null) {
            throw new IllegalArgumentException("Wallet is required!");
        }
        if (ixd instanceof iXD.StateListAnimator) {
            if (newCallbackBeanCopy == null) {
                if (valueOf().getNewProxyInstance()) {
                    int newProxyInstance = interfaceC9738bbJ.getNewProxyInstance();
                    InvestCallDataResult investCallDataResultKWHzl = ((iXD.StateListAnimator) ixd).KWHzl();
                    Map<String, String> redeemExtra = investTxModel.getRedeemExtra();
                    NewCallbackBean newCallbackBeanEZpvd = iCF.EZpvd(newProxyInstance, investCallDataResultKWHzl.AEQbTJ((2555 & 1) != 0 ? investCallDataResultKWHzl.data : null, (2555 & 2) != 0 ? investCallDataResultKWHzl.signedData : null, (2555 & 4) != 0 ? investCallDataResultKWHzl.signedPSBT : str, (2555 & 8) != 0 ? investCallDataResultKWHzl.fromAdr : null, (2555 & 16) != 0 ? investCallDataResultKWHzl.toAdr : null, (2555 & 32) != 0 ? investCallDataResultKWHzl.checkSum : null, (2555 & 64) != 0 ? investCallDataResultKWHzl.orderId : null, (2555 & 128) != 0 ? investCallDataResultKWHzl.slipper : null, (2555 & 256) != 0 ? investCallDataResultKWHzl.pubkey : null, (2555 & 512) != 0 ? investCallDataResultKWHzl.unstakeIndex : redeemExtra != null ? redeemExtra.get("unstakeIndex") : null, (2555 & 1024) != 0 ? investCallDataResultKWHzl.providerPubkey : null, (2555 & 2048) != 0 ? investCallDataResultKWHzl.priorityFee : null));
                    newCallbackBeanCopy = newCallbackBeanEZpvd.copy((2046 & 1) != 0 ? newCallbackBeanEZpvd.headerMap : map, (2046 & 2) != 0 ? newCallbackBeanEZpvd.body : null, (2046 & 4) != 0 ? newCallbackBeanEZpvd.isBatch : false, (2046 & 8) != 0 ? newCallbackBeanEZpvd.estTime : null, (2046 & 16) != 0 ? newCallbackBeanEZpvd.isBtcMint : false, (2046 & 32) != 0 ? newCallbackBeanEZpvd.reserved : null, (2046 & 64) != 0 ? newCallbackBeanEZpvd.protocolId : null, (2046 & 128) != 0 ? newCallbackBeanEZpvd.txType : null, (2046 & 256) != 0 ? newCallbackBeanEZpvd.dexUniqueKey : null, (2046 & 512) != 0 ? newCallbackBeanEZpvd.dexCallbackBean : null, (2046 & 1024) != 0 ? newCallbackBeanEZpvd.signAuthType : null);
                } else {
                    int newProxyInstance2 = interfaceC9738bbJ.getNewProxyInstance();
                    InvestCallDataResult investCallDataResultKWHzl2 = ((iXD.StateListAnimator) ixd).KWHzl();
                    NewCallbackBean newCallbackBeanCopydefault = iCF.copydefault(newProxyInstance2, investCallDataResultKWHzl2.AEQbTJ((2555 & 1) != 0 ? investCallDataResultKWHzl2.data : null, (2555 & 2) != 0 ? investCallDataResultKWHzl2.signedData : null, (2555 & 4) != 0 ? investCallDataResultKWHzl2.signedPSBT : str, (2555 & 8) != 0 ? investCallDataResultKWHzl2.fromAdr : null, (2555 & 16) != 0 ? investCallDataResultKWHzl2.toAdr : null, (2555 & 32) != 0 ? investCallDataResultKWHzl2.checkSum : null, (2555 & 64) != 0 ? investCallDataResultKWHzl2.orderId : null, (2555 & 128) != 0 ? investCallDataResultKWHzl2.slipper : null, (2555 & 256) != 0 ? investCallDataResultKWHzl2.pubkey : null, (2555 & 512) != 0 ? investCallDataResultKWHzl2.unstakeIndex : null, (2555 & 1024) != 0 ? investCallDataResultKWHzl2.providerPubkey : null, (2555 & 2048) != 0 ? investCallDataResultKWHzl2.priorityFee : null));
                    newCallbackBeanCopy = newCallbackBeanCopydefault.copy((2046 & 1) != 0 ? newCallbackBeanCopydefault.headerMap : map, (2046 & 2) != 0 ? newCallbackBeanCopydefault.body : null, (2046 & 4) != 0 ? newCallbackBeanCopydefault.isBatch : false, (2046 & 8) != 0 ? newCallbackBeanCopydefault.estTime : null, (2046 & 16) != 0 ? newCallbackBeanCopydefault.isBtcMint : false, (2046 & 32) != 0 ? newCallbackBeanCopydefault.reserved : null, (2046 & 64) != 0 ? newCallbackBeanCopydefault.protocolId : null, (2046 & 128) != 0 ? newCallbackBeanCopydefault.txType : null, (2046 & 256) != 0 ? newCallbackBeanCopydefault.dexUniqueKey : null, (2046 & 512) != 0 ? newCallbackBeanCopydefault.dexCallbackBean : null, (2046 & 1024) != 0 ? newCallbackBeanCopydefault.signAuthType : null);
                }
            }
            return ((iXD.StateListAnimator) ixd).OLrzqt().invoke(newCallbackBeanCopy, investTxModel);
        }
        if (ixd instanceof iXD.ActionBar) {
            Function2<NewCallbackBean, InvestTxModel, AbstractC58185ywX<ResponseData<String>>> function2OLrzqt = ((iXD.ActionBar) ixd).OLrzqt();
            Intrinsics.copydefault(newCallbackBean);
            return function2OLrzqt.invoke(newCallbackBeanCopy, investTxModel);
        }
        AbstractC58185ywX<ResponseData<String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-1, "Error", null, null, null, null, 60, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    private final void EZpvd(Throwable th) {
        String message;
        if (th instanceof OKServerException) {
            message = EZpvd(((OKServerException) th).getCode());
        } else {
            message = th.getMessage();
            if (message == null) {
                message = C43422row.OLrzqt();
            }
        }
        Context context = getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(message);
            String string = viewOnClickListenerC54939xaY.getContext().getString(C25493ixk.FragmentManager.OHqIaq);
            Intrinsics.checkNotNullExpressionValue(string, "");
            viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) string, new View.OnClickListener() { // from class: o.iXh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    BaseTransactionFragment.EZpvd(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
        DbNXlk();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final String EZpvd(int i) {
        if (i == 10003) {
            return C33070mpX.AYXKKw(C25493ixk.FragmentManager.Dfm);
        }
        if (i == 10006) {
            return C33070mpX.AYXKKw(C25493ixk.FragmentManager.Dfm);
        }
        if (i == 90010) {
            return C33070mpX.AYXKKw(C25493ixk.FragmentManager.fsSxsn);
        }
        return C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (Intrinsics.EZpvd((Object) str, (Object) "sp_invest_select_coin_reminder_dialog_never_show")) {
                new iUD().show(activity.getSupportFragmentManager(), iUD.class.getName());
            } else if (Intrinsics.EZpvd((Object) str, (Object) "sp_invest_maxreminder_dialog_never_show")) {
                iTW.Companion.KWHzl(str).show(activity.getSupportFragmentManager(), iTW.class.getName());
            }
        }
    }

    public static /* synthetic */ void trackButtonClick$default(BaseTransactionFragment baseTransactionFragment, String str, String str2, String str3, String str4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackButtonClick");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        baseTransactionFragment.KWHzl(str, str2, str3, str4);
    }

    public final void KWHzl(@NotNull String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        djBIcL().OLrzqt(str, fetchVPNInfo().KWHzl(), str2, str3, str4);
    }
}
