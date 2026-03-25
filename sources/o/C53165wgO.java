package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.order.strategy.data.SpotDcaConfirmMoreData;
import com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaEditParam;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaEditConfirmPresenter;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.SpotGridEditParamRep;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wgO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53165wgO extends AbstractC49945uyC<AbstractC48343uNz, SpotDcaEditConfirmPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public wYF AYXKKw;
    public final InterfaceC56387yDm djBIcL;
    public final int gEmmrt = C48033uCm.Activity.iZzfmt;
    public final boolean copydefault = true;
    public final C43316rmw KWHzl = new C43316rmw();
    public final C59534zip AEQbTJ = new C59534zip();

    /* JADX INFO: renamed from: o.wgO$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.wgO$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wgO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C53165wgO OLrzqt(TacticsData tacticsData, @NotNull SpotDcaEditParam spotDcaEditParam, StrategyConfigInfo strategyConfigInfo) {
            Intrinsics.checkNotNullParameter(spotDcaEditParam, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("bot_spot_dca_data", tacticsData);
            bundle.putParcelable("bot_spot_dca_edit_param_strategy_info", strategyConfigInfo);
            bundle.putParcelable("bot_spot_dca_edit_param_req", spotDcaEditParam);
            C53165wgO c53165wgO = new C53165wgO();
            c53165wgO.setArguments(bundle);
            return c53165wgO;
        }
    }

    public C53165wgO() {
        final Function0 function0 = new Function0() { // from class: o.wgT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53165wgO.copydefault(this.copydefault);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamConfirmDialog$special$$inlined$viewModels$default$1
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C53390wkb.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamConfirmDialog$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamConfirmDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamConfirmDialog$special$$inlined$viewModels$default$4
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

    public final C53390wkb copydefault() {
        return (C53390wkb) this.djBIcL.getValue();
    }

    public static final ViewModelStoreOwner copydefault(C53165wgO c53165wgO) {
        androidx.fragment.app.Fragment parentFragment = c53165wgO.getParentFragment();
        return parentFragment != null ? parentFragment : c53165wgO;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AYXKKw().setGravity(17);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.newUnratedRating));
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.AYXKKw = wyf;
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fARcdN();
        fJNWhG();
        AuCTel();
    }

    private final void AuCTel() {
        TradeLiveData<SpotGridEditParamRep> tradeLiveDataAEQbTJ = OLrzqt().AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAEQbTJ.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.wgR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53165wgO.copydefault(this.EZpvd, (SpotGridEditParamRep) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().KWHzl().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new Activity(new Function1() { // from class: o.wgU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53165wgO.AEQbTJ(this.OLrzqt, (java.lang.Exception) obj);
            }
        }));
        OLrzqt().KWHzl().AkhnZx().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wgS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53165wgO.AEQbTJ(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit copydefault(C53165wgO c53165wgO, SpotGridEditParamRep spotGridEditParamRep) {
        Intrinsics.checkNotNullParameter(spotGridEditParamRep, "");
        java.lang.String sCode = spotGridEditParamRep.getSCode();
        if (Intrinsics.EZpvd((java.lang.Object) sCode, (java.lang.Object) "") || Intrinsics.EZpvd((java.lang.Object) sCode, (java.lang.Object) "0")) {
            c53165wgO.copydefault().OLrzqt().setValue(java.lang.Boolean.TRUE);
        } else {
            C55326xho.toast$default(spotGridEditParamRep.getSMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        c53165wgO.isConnected();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C53165wgO c53165wgO, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        c53165wgO.isConnected();
        java.lang.String message2 = exc.getMessage();
        pUU.copydefault("BotSpotDcaEditParamConfirmDialog", "change params fail cause by :" + (message2 != null ? message2 : ""));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C53165wgO c53165wgO, java.lang.Boolean bool) {
        C52794wYp c52794wYpCopydefault;
        C52794wYp c52794wYpCopydefault2;
        if (bool.booleanValue()) {
            wYF wyf = c53165wgO.AYXKKw;
            if (wyf != null && (c52794wYpCopydefault2 = wyf.copydefault()) != null) {
                C52794wYp.startLoading$default(c52794wYpCopydefault2, 0L, 1, null);
            }
        } else {
            wYF wyf2 = c53165wgO.AYXKKw;
            if (wyf2 != null && (c52794wYpCopydefault = wyf2.copydefault()) != null) {
                c52794wYpCopydefault.fIwbmz();
            }
        }
        return Unit.INSTANCE;
    }

    private final void fARcdN() {
        OLrzqt().KWHzl(getArguments());
    }

    private final void fJNWhG() {
        TacticsData tacticsDataValueOf;
        C53393wke c53393wkeCopydefault = OLrzqt().copydefault();
        OLrzqt().EZpvd(c53393wkeCopydefault);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (c53393wkeCopydefault.AEQbTJ().size() > 3) {
            arrayList.addAll(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) c53393wkeCopydefault.AEQbTJ(), 3));
            arrayList.add(OLrzqt().djBIcL());
        } else {
            arrayList.addAll(c53393wkeCopydefault.AEQbTJ());
        }
        copydefault(arrayList);
        KWHzl(c53393wkeCopydefault.OLrzqt());
        SpotDcaEditParam spotDcaEditParamEZpvd = OLrzqt().EZpvd();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (spotDcaEditParamEZpvd != null ? spotDcaEditParamEZpvd.AEQbTJ() : null))) {
            SpotDcaEditParam spotDcaEditParamEZpvd2 = OLrzqt().EZpvd();
            if (!C33129mqd.OLrzqt(spotDcaEditParamEZpvd2 != null ? spotDcaEditParamEZpvd2.AEQbTJ() : null, "0") && (tacticsDataValueOf = OLrzqt().valueOf()) != null) {
                wSY wsy = wSY.OLrzqt;
                SpotDcaEditParam spotDcaEditParamEZpvd3 = OLrzqt().EZpvd();
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(spotDcaEditParamEZpvd3 != null ? spotDcaEditParamEZpvd3.AEQbTJ() : null);
                OKReminder oKReminder = values().KWHzl;
                Intrinsics.checkNotNullExpressionValue(oKReminder, "");
                wsy.AEQbTJ(tacticsDataValueOf, (java.lang.String) null, strGEmmrt, oKReminder);
            }
        }
        android.widget.TextView textView = values().copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        SpotDcaEditParam spotDcaEditParamEZpvd4 = OLrzqt().EZpvd();
        textView.setVisibility((spotDcaEditParamEZpvd4 == null || spotDcaEditParamEZpvd4.values()) ? 8 : 0);
    }

    private final void copydefault(java.util.List<? extends java.lang.Object> list) {
        this.KWHzl.register(TacticsInsideItemData.class, new C52510wOb(null, null, null, 7, null));
        this.KWHzl.register(SpotDcaConfirmMoreData.class, new wNG(new Function0() { // from class: o.wgV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53165wgO.EZpvd(this.copydefault);
            }
        }));
        RecyclerView recyclerView = values().EZpvd;
        recyclerView.setAdapter(this.KWHzl);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        C33064mpR.OLrzqt(this.KWHzl, list);
    }

    public static final Unit EZpvd(C53165wgO c53165wgO) {
        java.util.List<java.lang.Object> listAEQbTJ;
        java.util.List listAhwBna;
        java.util.List<java.lang.Object> listAEQbTJ2;
        if (Intrinsics.EZpvd((java.lang.Object) c53165wgO.OLrzqt().djBIcL().KWHzl(), (java.lang.Object) "less")) {
            c53165wgO.OLrzqt().djBIcL().KWHzl("more");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            C53393wke c53393wkeAYXKKw = c53165wgO.OLrzqt().AYXKKw();
            if (c53393wkeAYXKKw != null && (listAEQbTJ2 = c53393wkeAYXKKw.AEQbTJ()) != null) {
                arrayList.addAll(listAEQbTJ2);
                arrayList.add(c53165wgO.OLrzqt().djBIcL());
                C33064mpR.OLrzqt(c53165wgO.KWHzl, (java.util.List<? extends java.lang.Object>) arrayList);
            }
        } else {
            c53165wgO.OLrzqt().djBIcL().KWHzl("less");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            C53393wke c53393wkeAYXKKw2 = c53165wgO.OLrzqt().AYXKKw();
            if (c53393wkeAYXKKw2 != null && (listAEQbTJ = c53393wkeAYXKKw2.AEQbTJ()) != null && (listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listAEQbTJ, 3)) != null) {
                arrayList2.addAll(listAhwBna);
                arrayList2.add(c53165wgO.OLrzqt().djBIcL());
                C33064mpR.OLrzqt(c53165wgO.KWHzl, (java.util.List<? extends java.lang.Object>) arrayList2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wgO$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C53165wgO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53165wgO c53165wgO) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = c53165wgO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.OLrzqt().AhwBna();
            }
        }
    }

    private final void KWHzl(java.util.List<TacticsInsideItemData> list) {
        this.AEQbTJ.register(TacticsInsideItemData.class, new C52510wOb(null, null, null, 7, null));
        RecyclerView recyclerView = values().OLrzqt;
        recyclerView.setAdapter(this.AEQbTJ);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        C33064mpR.OLrzqt(this.AEQbTJ, list);
    }

    private final void isConnected() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }
}
