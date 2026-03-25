package com.okinc.business.invest_biz.ui.page.dialog;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.invest_api.bean.DeFiApyDataInfoData;
import com.okinc.business.invest_api.bean.DeFiApyItemInfoData;
import com.okinc.business.invest_biz.ui.page.dialog.InvestRecommendedInvestmentDialog;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractActivityC33041mov;
import o.C23814iKh;
import o.C24078iUb;
import o.C25493ixk;
import o.C26588jfE;
import o.C27103joq;
import o.C27117jpD;
import o.C33070mpX;
import o.C33129mqd;
import o.C43251rlk;
import o.C56391yDq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.InterfaceC25466ixJ;
import o.InterfaceC56387yDm;
import o.InterfaceC9731bbC;
import o.InterfaceC9737bbI;
import o.InterfaceC9738bbJ;
import o.InterfaceC9741bbM;
import o.InterfaceC9742bbN;
import o.InterfaceC9852bdR;
import o.iNB;
import o.iNI;
import o.wXQ;
import o.wXX;
import o.yCM;
import o.yDY;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class InvestRecommendedInvestmentDialog extends wXX implements InterfaceC25466ixJ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm KWHzl;

    @yCM
    public iNB viewModelFactory;
    public final InterfaceC9741bbM copydefault = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt();
    public final InterfaceC9737bbI OLrzqt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault();

    public InvestRecommendedInvestmentDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestRecommendedInvestmentDialog$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestRecommendedInvestmentDialog$special$$inlined$viewModels$default$2
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C27103joq.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestRecommendedInvestmentDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestRecommendedInvestmentDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestRecommendedInvestmentDialog$special$$inlined$viewModels$default$5
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
        final Function0<Fragment> function03 = new Function0<Fragment>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestRecommendedInvestmentDialog$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestRecommendedInvestmentDialog$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C27117jpD.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestRecommendedInvestmentDialog$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestRecommendedInvestmentDialog$special$$inlined$viewModels$default$9
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestRecommendedInvestmentDialog$special$$inlined$viewModels$default$10
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.iUe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestRecommendedInvestmentDialog.valueOf(this.EZpvd);
            }
        });
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.page.dialog.InvestRecommendedInvestmentDialog.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final InvestRecommendedInvestmentDialog EZpvd(@NotNull ArrayList<DeFiApyDataInfoData> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("data", arrayList);
            InvestRecommendedInvestmentDialog investRecommendedInvestmentDialog = new InvestRecommendedInvestmentDialog();
            investRecommendedInvestmentDialog.setArguments(bundle);
            return investRecommendedInvestmentDialog;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        iNI.KWHzl(context).EZpvd(this);
        super.onAttach(context);
    }

    public final iNB gEmmrt() {
        iNB inb = this.viewModelFactory;
        if (inb != null) {
            return inb;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return gEmmrt();
    }

    public final C27103joq djBIcL() {
        return (C27103joq) this.AEQbTJ.getValue();
    }

    private final C27117jpD fetchVPNInfo() {
        return (C27117jpD) this.AYXKKw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C26588jfE valueOf() {
        return (C26588jfE) this.KWHzl.getValue();
    }

    public static final C26588jfE valueOf(InvestRecommendedInvestmentDialog investRecommendedInvestmentDialog) {
        return new C26588jfE(investRecommendedInvestmentDialog.fetchVPNInfo(), investRecommendedInvestmentDialog);
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setCloseVisibility(false);
        wxq.setStyle(5);
        wxq.setTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.QbewEr));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        C23814iKh c23814iKhKWHzl = C23814iKh.KWHzl(LayoutInflater.from(requireContext()));
        Intrinsics.checkNotNullExpressionValue(c23814iKhKWHzl, "");
        constraintLayout.addView(c23814iKhKWHzl.getRoot(), new ViewGroup.LayoutParams(-1, -2));
        List parcelableArrayList = requireArguments().getParcelableArrayList("data");
        if (parcelableArrayList == null) {
            parcelableArrayList = yDY.AhwBna();
        }
        C27103joq c27103joqDjBIcL = djBIcL();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(parcelableArrayList, 10));
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((DeFiApyDataInfoData) it.next()).getInvestmentId()));
        }
        c27103joqDjBIcL.AEQbTJ(arrayList);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new AnonymousClass2(parcelableArrayList, c23814iKhKWHzl, null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.page.dialog.InvestRecommendedInvestmentDialog$onCreateContent$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C23814iKh $binding;
        final /* synthetic */ List<DeFiApyDataInfoData> $items;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List<DeFiApyDataInfoData> list, C23814iKh c23814iKh, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$items = list;
            this.$binding = c23814iKh;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestRecommendedInvestmentDialog.this.new AnonymousClass2(this.$items, this.$binding, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List listEZpvd;
            String amountInt;
            String strCopydefault;
            String strDjBIcL;
            String strCopydefault2;
            String strAhwBna;
            String displayAmount$default;
            List<InterfaceC9742bbN> listAYXKKw;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.firstOrNull(InvestRecommendedInvestmentDialog.this.copydefault.copydefault());
                List<DeFiApyDataInfoData> list = this.$items;
                InvestRecommendedInvestmentDialog investRecommendedInvestmentDialog = InvestRecommendedInvestmentDialog.this;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (DeFiApyDataInfoData deFiApyDataInfoData : list) {
                    InterfaceC9742bbN interfaceC9742bbN = (interfaceC9738bbJ == null || (listAYXKKw = interfaceC9738bbJ.AYXKKw(deFiApyDataInfoData.getCoinId())) == null) ? null : (InterfaceC9742bbN) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw);
                    InterfaceC9731bbC coinMeta$default = InterfaceC9737bbI.Application.getCoinMeta$default(investRecommendedInvestmentDialog.OLrzqt, C56443yFo.KWHzl(deFiApyDataInfoData.getCoinId()), false, 2, null);
                    InterfaceC9731bbC interfaceC9731bbCKWHzl = coinMeta$default != null ? coinMeta$default.KWHzl() : null;
                    arrayList.add(new DeFiApyItemInfoData(deFiApyDataInfoData.getCoinId(), deFiApyDataInfoData.getMinApy(), deFiApyDataInfoData.getMaxApy(), deFiApyDataInfoData.getInvestmentId(), (interfaceC9742bbN == null || (displayAmount$default = InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(interfaceC9742bbN, false, false, 3, null)) == null) ? "" : displayAmount$default, (interfaceC9742bbN == null || (strAhwBna = interfaceC9742bbN.AhwBna()) == null) ? "" : strAhwBna, (interfaceC9742bbN == null || (strCopydefault2 = interfaceC9742bbN.copydefault()) == null) ? "0" : strCopydefault2, (interfaceC9731bbCKWHzl == null || (strDjBIcL = interfaceC9731bbCKWHzl.djBIcL()) == null) ? "" : strDjBIcL, (interfaceC9731bbCKWHzl == null || (strCopydefault = interfaceC9731bbCKWHzl.copydefault()) == null) ? "" : strCopydefault));
                }
                DeFiApyItemInfoData deFiApyItemInfoData = (DeFiApyItemInfoData) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
                if (deFiApyItemInfoData != null && (amountInt = deFiApyItemInfoData.getAmountInt()) != null && C33129mqd.OLrzqt((CharSequence) amountInt) && C33129mqd.AEQbTJ(amountInt, "0")) {
                    listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new TaskDescription());
                } else {
                    listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new ActionBar());
                }
                if (interfaceC9738bbJ != null) {
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(listEZpvd, this.$binding, InvestRecommendedInvestmentDialog.this, null);
                    this.label = 1;
                    if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.page.dialog.InvestRecommendedInvestmentDialog$onCreateContent$2$ActionBar */
        public static final class ActionBar<T> implements Comparator {
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return yET.KWHzl(C33129mqd.EZpvd(((DeFiApyItemInfoData) t2).getMaxApy()), C33129mqd.EZpvd(((DeFiApyItemInfoData) t).getMaxApy()));
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.page.dialog.InvestRecommendedInvestmentDialog$onCreateContent$2$TaskDescription */
        public static final class TaskDescription<T> implements Comparator {
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return yET.KWHzl(C33129mqd.EZpvd(((DeFiApyItemInfoData) t2).getCurrentPriceStr()), C33129mqd.EZpvd(((DeFiApyItemInfoData) t).getCurrentPriceStr()));
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.page.dialog.InvestRecommendedInvestmentDialog$onCreateContent$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ C23814iKh $binding;
            final /* synthetic */ List<DeFiApyItemInfoData> $sortItemList;
            int label;
            final /* synthetic */ InvestRecommendedInvestmentDialog this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(List<DeFiApyItemInfoData> list, C23814iKh c23814iKh, InvestRecommendedInvestmentDialog investRecommendedInvestmentDialog, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$sortItemList = list;
                this.$binding = c23814iKh;
                this.this$0 = investRecommendedInvestmentDialog;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$sortItemList, this.$binding, this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List<DeFiApyItemInfoData> list = this.$sortItemList;
                    final InvestRecommendedInvestmentDialog investRecommendedInvestmentDialog = this.this$0;
                    this.$binding.EZpvd.setAdapter(new C24078iUb(list, new C24078iUb.Activity() { // from class: o.iUd
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.C24078iUb.Activity
                        public final void AEQbTJ(DeFiApyItemInfoData deFiApyItemInfoData) {
                            InvestRecommendedInvestmentDialog.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(investRecommendedInvestmentDialog, deFiApyItemInfoData);
                        }
                    }));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(InvestRecommendedInvestmentDialog investRecommendedInvestmentDialog, DeFiApyItemInfoData deFiApyItemInfoData) {
                investRecommendedInvestmentDialog.copydefault(deFiApyItemInfoData.getInvestmentId(), !deFiApyItemInfoData.getMinApy().contentEquals(deFiApyItemInfoData.getMaxApy()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(long j, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestRecommendedInvestmentDialog$startInvestFlow$1(this, j, z, null), 3, null);
    }

    public final void AYXKKw() {
        try {
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).showLoading();
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
    }

    public final void copydefault() {
        try {
            FragmentActivity activity = getActivity();
            AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.dismissLoading();
            }
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
    }

    @Override // o.InterfaceC25466ixJ
    public CoroutineScope KWHzl() {
        return LifecycleOwnerKt.getLifecycleScope(this);
    }

    @Override // o.InterfaceC25466ixJ
    public CoroutineScope AhwBna() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
    }

    @Override // o.InterfaceC25466ixJ
    public FragmentManager OLrzqt() {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        return parentFragmentManager;
    }

    @Override // o.InterfaceC25466ixJ
    public Context AEQbTJ() {
        return getContext();
    }

    @Override // o.InterfaceC25466ixJ
    public AbstractActivityC33041mov EZpvd() {
        FragmentActivity activity = getActivity();
        if (activity instanceof AbstractActivityC33041mov) {
            return (AbstractActivityC33041mov) activity;
        }
        return null;
    }
}
