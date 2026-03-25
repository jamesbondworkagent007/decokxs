package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.find_ui.ranking.stock.sub.MarketHomeStockRankingFragment$setListener$1;
import com.okinc.find_ui.ranking.stock.viewmodel.MarketHomeStockContainerViewModel;
import com.okinc.market.quotation.ui.AbsQuotationFragment;
import com.okinc.okmarket.ui.market.quote.WrapContentLinearLayoutManager;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.InterfaceC49371unL;
import o.qXK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.noU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35074noU extends AbstractC35076noW implements InterfaceC27808kEb, mAS {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm DbNXlk;
    public C42740rcC djBIcL;
    public final /* synthetic */ kDL AYXKKw = new kDL();
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.npc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35074noU.djBIcL(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.npa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35074noU.gEmmrt(this.KWHzl);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AYXKKw.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.AYXKKw.AEQbTJ(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw.EZpvd(dexInstrument, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AYXKKw.EZpvd(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt() {
        this.AYXKKw.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AYXKKw.OLrzqt(dexInstrument, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void aZ_() {
        this.AYXKKw.aZ_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void ba_() {
        this.AYXKKw.ba_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AYXKKw.copydefault(str, str2, str3, str4, str5, str6, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.DLGVGj;
    }

    public C35074noU() {
        final TaskDescription taskDescription = new TaskDescription(this);
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.find_ui.ranking.stock.sub.MarketHomeStockRankingFragment$special$$inlined$parentViewModels$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) taskDescription.invoke();
            }
        });
        final Function0 function0 = null;
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketHomeStockContainerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.find_ui.ranking.stock.sub.MarketHomeStockRankingFragment$special$$inlined$parentViewModels$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.find_ui.ranking.stock.sub.MarketHomeStockRankingFragment$special$$inlined$parentViewModels$4
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.find_ui.ranking.stock.sub.MarketHomeStockRankingFragment$special$$inlined$parentViewModels$5
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

    /* JADX INFO: renamed from: o.noU$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.noU.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C35074noU EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C35074noU c35074noU = new C35074noU();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("arg_biz_type", str);
            c35074noU.setArguments(bundle);
            return c35074noU;
        }
    }

    public final java.lang.String gEmmrt() {
        return (java.lang.String) this.fetchVPNInfo.getValue();
    }

    public static final java.lang.String djBIcL(C35074noU c35074noU) {
        java.lang.String string;
        android.os.Bundle arguments = c35074noU.getArguments();
        return (arguments == null || (string = arguments.getString("arg_biz_type")) == null) ? "SPOT" : string;
    }

    public final C35058noE AkhnZx() {
        return (C35058noE) this.AkhnZx.getValue();
    }

    public static final C35058noE gEmmrt(final C35074noU c35074noU) {
        return new C35058noE(new Function0() { // from class: o.noX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35074noU.AYXKKw(this.copydefault);
            }
        });
    }

    public static final Unit AYXKKw(C35074noU c35074noU) {
        android.content.Context context = c35074noU.getContext();
        if (context != null) {
            if (Intrinsics.EZpvd((java.lang.Object) c35074noU.gEmmrt(), (java.lang.Object) "SPOT")) {
                sZQ.EZpvd.EZpvd(context, "Stock");
            } else {
                sZQ.EZpvd.AEQbTJ(context, "Stock");
            }
        }
        return Unit.INSTANCE;
    }

    public final MarketHomeStockContainerViewModel DbNXlk() {
        return (MarketHomeStockContainerViewModel) this.DbNXlk.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C42740rcC c42740rcCEZpvd = C42740rcC.EZpvd(view);
        Intrinsics.copydefault(c42740rcCEZpvd);
        OLrzqt(c42740rcCEZpvd);
        this.djBIcL = c42740rcCEZpvd;
    }

    public final void OLrzqt(C42740rcC c42740rcC) {
        RecyclerView recyclerView = c42740rcC.KWHzl;
        recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(AkhnZx());
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MarketHomeStockRankingFragment$setListener$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(InterfaceC49371unL<? extends java.util.List<? extends InterfaceC40516qYt>> interfaceC49371unL) {
        C35152npt c35152nptKWHzl;
        ActivityResultCaller activityResultCaller;
        C35152npt c35152nptKWHzl2;
        ActivityResultCaller activityResultCaller2;
        C35152npt c35152nptKWHzl3;
        ActivityResultCaller activityResultCaller3;
        C35152npt c35152nptKWHzl4;
        C35152npt c35152nptKWHzl5;
        if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
            C41298qoF.AEQbTJ.EZpvd(getTAG(), "updateContentListUI: " + interfaceC49371unL);
            C42740rcC c42740rcC = this.djBIcL;
            if (c42740rcC == null || (c35152nptKWHzl5 = c42740rcC.getRoot()) == null) {
                return;
            }
            qXK.StateListAnimator.showLoadingState$default(c35152nptKWHzl5, 0L, 1, null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
            java.lang.Object objCopydefault = activity.copydefault();
            if (!(!((java.util.List) objCopydefault).isEmpty())) {
                objCopydefault = null;
            }
            java.util.List list = (java.util.List) objCopydefault;
            if (list == null) {
                EZpvd(new InterfaceC49371unL.TaskDescription(activity.copydefault()));
                return;
            }
            C41298qoF.AEQbTJ.EZpvd(getTAG(), "updateContentListUI: list size: " + list.size());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (list.size() >= 7) {
                arrayList.addAll(list.subList(0, 7));
                arrayList.add(new C27622jyf());
            } else {
                arrayList.addAll(list);
            }
            AbstractC40521qYy.submitList$default(AkhnZx(), arrayList, null, 2, null);
            C42740rcC c42740rcC2 = this.djBIcL;
            if (c42740rcC2 != null && (c35152nptKWHzl4 = c42740rcC2.getRoot()) != null) {
                c35152nptKWHzl4.values();
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            if (this instanceof C35095nop) {
                activityResultCaller3 = this;
            } else {
                androidx.fragment.app.Fragment parentFragment = getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof C35095nop)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                activityResultCaller3 = (C35095nop) (parentFragment instanceof C35095nop ? parentFragment : null);
            }
            C35095nop c35095nop = (C35095nop) activityResultCaller3;
            if (c35095nop != null) {
                c35095nop.fetchVPNInfo();
                return;
            }
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            C41298qoF.AEQbTJ.AEQbTJ(getTAG(), "updateContentListUI: error", ((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ());
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            C42740rcC c42740rcC3 = this.djBIcL;
            if (c42740rcC3 != null && (c35152nptKWHzl3 = c42740rcC3.getRoot()) != null) {
                c35152nptKWHzl3.copydefault(C33070mpX.AYXKKw(qZH.PendingIntent.DsL), C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj), C33070mpX.AYXKKw(qZH.PendingIntent.fetchVPNInfo), new Function0() { // from class: o.noV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C35074noU.AhwBna(this.EZpvd);
                    }
                });
            }
            if (this instanceof C35095nop) {
                activityResultCaller2 = this;
            } else {
                androidx.fragment.app.Fragment parentFragment2 = getParentFragment();
                while (parentFragment2 != null && !(parentFragment2 instanceof C35095nop)) {
                    parentFragment2 = parentFragment2.getParentFragment();
                }
                activityResultCaller2 = (C35095nop) (parentFragment2 instanceof C35095nop ? parentFragment2 : null);
            }
            C35095nop c35095nop2 = (C35095nop) activityResultCaller2;
            if (c35095nop2 != null) {
                c35095nop2.fetchVPNInfo();
                return;
            }
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) {
            C41298qoF.AEQbTJ.EZpvd(getTAG(), "updateContentListUI: " + interfaceC49371unL);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            C42740rcC c42740rcC4 = this.djBIcL;
            if (c42740rcC4 != null && (c35152nptKWHzl2 = c42740rcC4.getRoot()) != null) {
                qXK.StateListAnimator.showEmptyState$default(c35152nptKWHzl2, qZH.PendingIntent.getPostValueLengthLimit, 0, 0, 0, (Function0) null, 30, (java.lang.Object) null);
            }
            if (this instanceof C35095nop) {
                activityResultCaller = this;
            } else {
                androidx.fragment.app.Fragment parentFragment3 = getParentFragment();
                while (parentFragment3 != null && !(parentFragment3 instanceof C35095nop)) {
                    parentFragment3 = parentFragment3.getParentFragment();
                }
                activityResultCaller = (C35095nop) (parentFragment3 instanceof C35095nop ? parentFragment3 : null);
            }
            C35095nop c35095nop3 = (C35095nop) activityResultCaller;
            if (c35095nop3 != null) {
                c35095nop3.fetchVPNInfo();
                return;
            }
            return;
        }
        C41298qoF.AEQbTJ.EZpvd(getTAG(), "updateContentListUI: " + interfaceC49371unL);
        C42740rcC c42740rcC5 = this.djBIcL;
        if (c42740rcC5 == null || (c35152nptKWHzl = c42740rcC5.getRoot()) == null) {
            return;
        }
        qXK.StateListAnimator.showLoadingState$default(c35152nptKWHzl, 0L, 1, null);
    }

    @Override // com.okinc.market.quotation.ui.AbsQuotationFragment
    public java.lang.Object OLrzqt(@NotNull AbsQuotationFragment.SubscribeType subscribeType, @NotNull Continuation<? super Unit> continuation) {
        C41298qoF.AEQbTJ.EZpvd(getTAG(), "executeSubscribeData skipped - data from container");
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
    }

    public static final Unit AhwBna(C35074noU c35074noU) {
        boolean z = c35074noU instanceof C35095nop;
        java.lang.Object obj = c35074noU;
        if (!z) {
            androidx.fragment.app.Fragment parentFragment = c35074noU.getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof C35095nop)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (!(parentFragment instanceof C35095nop)) {
                parentFragment = null;
            }
            obj = (C35095nop) parentFragment;
        }
        C35095nop c35095nop = (C35095nop) obj;
        if (c35095nop != null) {
            c35095nop.fARcdN();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.noU$TaskDescription */
    public static final class TaskDescription implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(androidx.fragment.app.Fragment fragment) {
            this.OLrzqt = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.OLrzqt;
            if (fragment != null && !(fragment instanceof C35095nop)) {
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof C35095nop)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (!(parentFragment instanceof C35095nop)) {
                    parentFragment = null;
                }
                fragment = (C35095nop) parentFragment;
            }
            if (!(fragment instanceof C35095nop)) {
                fragment = null;
            }
            C35095nop c35095nop = (C35095nop) fragment;
            C35095nop c35095nop2 = c35095nop instanceof ViewModelStoreOwner ? c35095nop : null;
            if (c35095nop2 != null) {
                return c35095nop2;
            }
            throw new java.lang.IllegalArgumentException(("host parent fragment must be " + C35095nop.class.getSimpleName()).toString());
        }
    }
}
