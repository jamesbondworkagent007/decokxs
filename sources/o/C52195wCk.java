package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.presenter.DealRecordPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wCk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52195wCk extends AbstractC54505xKx<AbstractC48651uZh, DealRecordPresenter> {
    public final InterfaceC56387yDm KWHzl;
    public final int EZpvd = C48033uCm.Activity.GqbzPL;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wCv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52195wCk.djBIcL();
        }
    });

    /* JADX INFO: renamed from: o.wCk$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    public C52195wCk() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DelegatedDealRecordFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DelegatedDealRecordFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DelegatedDealRecordFragment$special$$inlined$activityViewModels$default$3
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

    private final TacticsDetailPresenter AEQbTJ() {
        return (TacticsDetailPresenter) this.KWHzl.getValue();
    }

    private final C43316rmw copydefault() {
        return (C43316rmw) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw djBIcL() {
        return new C43316rmw();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        valueOf();
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        dxcTrN().OLrzqt(AEQbTJ().AhwBna());
        AYXKKw();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        dxcTrN().fJNWhG();
    }

    private final void valueOf() {
        C43316rmw c43316rmwCopydefault = copydefault();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c43316rmwCopydefault.register(DetailsData.class, new C52503wNv(fragmentActivityRequireActivity, new Function1() { // from class: o.wCn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52195wCk.AEQbTJ((DetailsData) obj);
            }
        }, new Function1() { // from class: o.wCs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52195wCk.OLrzqt((java.lang.String) obj);
            }
        }, new Function1() { // from class: o.wCo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52195wCk.copydefault((DetailsData) obj);
            }
        }));
        gGvvIC().copydefault.setAdapter(copydefault());
        gGvvIC().copydefault.setLayoutManager(new LinearLayoutManager(requireActivity()));
        copydefault().register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wCq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52195wCk.OLrzqt(this.copydefault, (EmptyData) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(detailsData, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55328xhq.show$default(C33605mzc.AEQbTJ(), str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(detailsData, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C52195wCk c52195wCk, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        c52195wCk.dxcTrN().fJNWhG();
        return Unit.INSTANCE;
    }

    private final void AYXKKw() {
        dxcTrN().values().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wCp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52195wCk.EZpvd(this.OLrzqt, (java.util.ArrayList) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wCr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52195wCk.copydefault(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wCt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52195wCk.AEQbTJ(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit EZpvd(C52195wCk c52195wCk, java.util.ArrayList arrayList) {
        C43316rmw c43316rmwCopydefault = c52195wCk.copydefault();
        Intrinsics.copydefault(arrayList);
        C49952uyJ.updateDataOrEmpty$default(c43316rmwCopydefault, arrayList, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, null, null, false, 60, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52195wCk, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C52195wCk c52195wCk, androidx.core.util.Pair pair) {
        if (((java.lang.Boolean) pair.second).booleanValue()) {
            c52195wCk.showLoading();
        } else {
            c52195wCk.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C52195wCk c52195wCk, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd((java.lang.Object) pair.first, (java.lang.Object) c52195wCk.dxcTrN().AhwBna().bB_())) {
            java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
            if (message == null) {
                message = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
            }
            C33064mpR.OLrzqt(c52195wCk.copydefault(), (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, message, 60, false, null, null, false, 60, null));
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52195wCk, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        if (copydefault().getItemCount() == 0) {
            super.showLoading();
        }
    }
}
