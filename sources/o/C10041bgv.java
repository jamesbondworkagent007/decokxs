package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.assets.coinmanagement.SearchCoinViewModel;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.net.bean.AddCoinReq;
import com.okinc.rxutils.RxBus;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC9955bfO;
import o.C10041bgv;
import o.C10407bnq;
import o.C13754dXa;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bgv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C10041bgv extends AbstractC9966bfZ implements ActivityC9955bfO.TaskDescription, ActivityC9955bfO.Application {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final java.lang.String AYXKKw;
    public final C59534zip EZpvd;
    public final int KWHzl = C13754dXa.TaskDescription.ggKfIT;
    public AbstractC16655eny OLrzqt;
    public final java.util.ArrayList<C10525bqB> djBIcL;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.bgv$StateListAnimator */
    public static final class StateListAnimator implements Function1<?, java.lang.Boolean> {
        public static final StateListAnimator KWHzl = new StateListAnimator();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke(java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return java.lang.Boolean.TRUE;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    public C10041bgv() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.assets.coinmanagement.SelectCoinSearchFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.assets.coinmanagement.SelectCoinSearchFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SearchCoinViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.assets.coinmanagement.SelectCoinSearchFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.assets.coinmanagement.SelectCoinSearchFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.assets.coinmanagement.SelectCoinSearchFragment$special$$inlined$viewModels$default$5
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
        java.util.ArrayList<C10525bqB> arrayList = new java.util.ArrayList<>();
        this.djBIcL = arrayList;
        this.EZpvd = new C59534zip(arrayList);
        this.AYXKKw = "SearchCoin-FM";
    }

    /* JADX INFO: renamed from: o.bgv$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bgv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C10041bgv newInstance$default(Activity activity, long j, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = Long.MIN_VALUE;
            }
            return activity.copydefault(j, z);
        }

        public final C10041bgv copydefault(long j, boolean z) {
            C10041bgv c10041bgv = new C10041bgv();
            c10041bgv.ensureArguments().putLong("chain_id", j);
            c10041bgv.ensureArguments().putBoolean("support_add_custom_coin", z);
            return c10041bgv;
        }
    }

    public final SearchCoinViewModel KWHzl() {
        return (SearchCoinViewModel) this.valueOf.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        AbstractC12782ctV abstractC12782ctVKWHzl;
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        this.OLrzqt = (AbstractC16655eny) viewDataBindingBind;
        SearchCoinViewModel searchCoinViewModelKWHzl = KWHzl();
        FragmentActivity activity = getActivity();
        ActivityC9955bfO activityC9955bfO = activity instanceof ActivityC9955bfO ? (ActivityC9955bfO) activity : null;
        if (activityC9955bfO == null || (abstractC12782ctVKWHzl = activityC9955bfO.KWHzl()) == null) {
            return;
        }
        searchCoinViewModelKWHzl.copydefault(abstractC12782ctVKWHzl, ensureArguments().getBoolean("support_add_custom_coin"));
        EZpvd();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault();
        KWHzl().EZpvd(ensureArguments().getLong("chain_id"), "");
    }

    private final void EZpvd() {
        AbstractC16655eny abstractC16655eny = this.OLrzqt;
        AbstractC16655eny abstractC16655eny2 = null;
        if (abstractC16655eny == null) {
            Intrinsics.gEmmrt("");
            abstractC16655eny = null;
        }
        C33546myW c33546myW = abstractC16655eny.AEQbTJ;
        c33546myW.djBIcL(false);
        if (KWHzl().gEmmrt()) {
            c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.bgw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57900yrD
                public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                    C10041bgv.AEQbTJ(this.OLrzqt, interfaceC57934yrl);
                }
            });
        }
        c33546myW.AhwBna(false);
        AbstractC16655eny abstractC16655eny3 = this.OLrzqt;
        if (abstractC16655eny3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16655eny2 = abstractC16655eny3;
        }
        RecyclerView recyclerView = abstractC16655eny2.EZpvd;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        this.EZpvd.register(C10525bqB.class, new Application());
        recyclerView.setAdapter(this.EZpvd);
    }

    public static final void AEQbTJ(C10041bgv c10041bgv, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c10041bgv.KWHzl().AhwBna();
    }

    public final void copydefault() {
        AbstractC32952mnL<SearchCoinViewModel.SearchCoinData> abstractC32952mnLCopydefault = KWHzl().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC16655eny abstractC16655eny = this.OLrzqt;
        if (abstractC16655eny == null) {
            Intrinsics.gEmmrt("");
            abstractC16655eny = null;
        }
        C55237xgE c55237xgE = abstractC16655eny.OLrzqt;
        SearchCoinViewModel searchCoinViewModelKWHzl = KWHzl();
        abstractC32952mnLCopydefault.observe(viewLifecycleOwner, new ActionBar(c55237xgE, searchCoinViewModelKWHzl != null ? searchCoinViewModelKWHzl.copydefault() : null, C13754dXa.ActionBar.awiJhF));
    }

    /* JADX INFO: renamed from: o.bgv$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar extends AbstractC32992mnz<SearchCoinViewModel.SearchCoinData> {
        public ActionBar(C55237xgE c55237xgE, AbstractC32952mnL<SearchCoinViewModel.SearchCoinData> abstractC32952mnL, int i) {
            super(c55237xgE, abstractC32952mnL, i);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Z */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean KWHzl(SearchCoinViewModel.SearchCoinData searchCoinData) {
            if (searchCoinData == null) {
                return true;
            }
            return searchCoinData.getOpenedCoins().isEmpty() && searchCoinData.getNotOpenedCoins().isEmpty() && C10041bgv.this.KWHzl().EZpvd().length() > 0;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void copydefault(SearchCoinViewModel.SearchCoinData searchCoinData, android.view.View view) {
            C55173xeu c55173xeu;
            super.copydefault(searchCoinData, view);
            if (view == null || (c55173xeu = (C55173xeu) view.findViewById(C13754dXa.ActionBar.setMediaButtonReceiver)) == null) {
                return;
            }
            C10041bgv c10041bgv = C10041bgv.this;
            c55173xeu.EZpvd().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            c55173xeu.setSubTitle(KWHzl());
            c55173xeu.AEQbTJ().setVisibility(c10041bgv.KWHzl().KWHzl() ? 0 : 8);
            C52794wYp c52794wYpAEQbTJ = c55173xeu.AEQbTJ();
            c52794wYpAEQbTJ.setOnClickListener(new Activity(c52794wYpAEQbTJ, 1000L, c10041bgv));
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void KWHzl(SearchCoinViewModel.SearchCoinData searchCoinData, android.view.View view) {
            super.KWHzl(searchCoinData, view);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Throwable;Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void KWHzl(java.lang.Throwable th, SearchCoinViewModel.SearchCoinData searchCoinData, android.view.View view) {
            Intrinsics.checkNotNullParameter(th, "");
            super.KWHzl(th, searchCoinData, view);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C10041bgv.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: copydefault, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void AEQbTJ(SearchCoinViewModel.SearchCoinData searchCoinData, android.view.View view) {
            super.AEQbTJ(searchCoinData, view);
            if (C10041bgv.this.KWHzl().valueOf()) {
                AbstractC16655eny abstractC16655eny = C10041bgv.this.OLrzqt;
                if (abstractC16655eny == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16655eny = null;
                }
                abstractC16655eny.AEQbTJ.AhwBna(true);
            } else {
                AbstractC16655eny abstractC16655eny2 = C10041bgv.this.OLrzqt;
                if (abstractC16655eny2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16655eny2 = null;
                }
                abstractC16655eny2.AEQbTJ.AhwBna(false);
            }
            AbstractC16655eny abstractC16655eny3 = C10041bgv.this.OLrzqt;
            if (abstractC16655eny3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16655eny3 = null;
            }
            C33546myW c33546myW = abstractC16655eny3.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            if (C57589ylK.AEQbTJ(c33546myW)) {
                AbstractC16655eny abstractC16655eny4 = C10041bgv.this.OLrzqt;
                if (abstractC16655eny4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16655eny4 = null;
                }
                abstractC16655eny4.AEQbTJ.valueOf();
            } else {
                AbstractC16655eny abstractC16655eny5 = C10041bgv.this.OLrzqt;
                if (abstractC16655eny5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16655eny5 = null;
                }
                abstractC16655eny5.EZpvd.scrollToPosition(0);
            }
            if (searchCoinData == null) {
                return;
            }
            C10041bgv.this.djBIcL.clear();
            C10041bgv.this.djBIcL.addAll(searchCoinData.getOpenedCoins());
            C10041bgv.this.djBIcL.addAll(searchCoinData.getNotOpenedCoins());
            C10041bgv.this.EZpvd.notifyDataSetChanged();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C10041bgv.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }

        /* JADX INFO: renamed from: o.bgv$ActionBar$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ C10041bgv EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, C10041bgv c10041bgv) {
                this.copydefault = view;
                this.KWHzl = j;
                this.EZpvd = c10041bgv;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    FragmentActivity activity = this.EZpvd.getActivity();
                    if (activity != null) {
                        ActivityC16100edZ.Companion.AEQbTJ(activity, this.EZpvd.KWHzl().OLrzqt());
                    }
                }
            }
        }

        public final java.lang.CharSequence KWHzl() {
            if (C10041bgv.this.KWHzl().KWHzl()) {
                C10041bgv c10041bgv = C10041bgv.this;
                java.lang.String strCopydefault = pTD.copydefault(c10041bgv, C13754dXa.FragmentManager.gCZUJG, C56424yEw.AYXKKw(C56390yDp.OLrzqt("search_result", c10041bgv.KWHzl().EZpvd())));
                java.lang.String strEZpvd = C10041bgv.this.KWHzl().EZpvd();
                final C10041bgv c10041bgv2 = C10041bgv.this;
                return C33061mpO.KWHzl(strCopydefault, strEZpvd, new Function1() { // from class: o.bgI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C10041bgv.ActionBar.copydefault(c10041bgv2, (java.util.List) obj);
                    }
                });
            }
            C10041bgv c10041bgv3 = C10041bgv.this;
            java.lang.String strCopydefault2 = pTD.copydefault(c10041bgv3, C13754dXa.FragmentManager.UJEglR, C56423yEv.EZpvd(C56390yDp.OLrzqt("search_result", c10041bgv3.KWHzl().EZpvd())));
            java.lang.String strEZpvd2 = C10041bgv.this.KWHzl().EZpvd();
            final C10041bgv c10041bgv4 = C10041bgv.this;
            return C33061mpO.KWHzl(strCopydefault2, strEZpvd2, new Function1() { // from class: o.bgH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10041bgv.ActionBar.OLrzqt(c10041bgv4, (java.util.List) obj);
                }
            });
        }

        public static final Unit copydefault(C10041bgv c10041bgv, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.TextAppearanceSpan(c10041bgv.getContext(), C32113mPz.Dialog.isConnected));
            list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.Dmq)));
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(C10041bgv c10041bgv, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.TextAppearanceSpan(c10041bgv.getContext(), C32113mPz.Dialog.isConnected));
            list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.Dmq)));
            return Unit.INSTANCE;
        }
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl().EZpvd(KWHzl().OLrzqt(), str);
    }

    @Override // o.ActivityC9955bfO.TaskDescription
    public void AEQbTJ(long j) {
        KWHzl().EZpvd(j, KWHzl().EZpvd());
    }

    @Override // o.ActivityC9955bfO.Application
    public void OLrzqt(boolean z) {
        KWHzl().KWHzl(z);
    }

    /* JADX INFO: renamed from: o.bgv$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public final class Application extends AbstractC43310rmq<C10525bqB, AbstractC16828erL> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C13754dXa.TaskDescription.RFmUsE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return dTV.fetchVPNInfo;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(1:4)(11:6|(1:12)|13|32|14|18|(1:20)(1:21)|22|(1:29)(1:28)|30|31)|5|13|32|14|18|(0)(0)|22|(2:24|29)(0)|30|31) */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
        
            o.C6777aVl.Companion.OLrzqt(r2, o.C56423yEv.EZpvd(o.C56390yDp.OLrzqt("formattedText", r1.toString())), java.lang.Boolean.TRUE);
            o.C10856bwO.copydefault(r9.copydefault.AYXKKw, -1, "Failed to setText: " + r2.getMessage() + " on text: " + ((java.lang.Object) r1), r2);
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0141  */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC16828erL> c43312rms, @NotNull C10525bqB c10525bqB) {
            java.lang.String str;
            java.lang.String string;
            java.lang.String strOLrzqt;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c10525bqB, "");
            super.onBindViewHolder((C43312rms) c43312rms, c10525bqB);
            if (!c10525bqB.KWHzl().DarRvM()) {
                strOLrzqt = c10525bqB.KWHzl().DbNXlk();
            } else {
                java.lang.Character chWlaJM = C59454zhO.wlaJM(c10525bqB.KWHzl().fJNWhG());
                if (chWlaJM == null || (string = chWlaJM.toString()) == null || (strOLrzqt = C9700baY.OLrzqt(string)) == null) {
                    str = "";
                }
                android.widget.ImageView imageView = ((AbstractC16828erL) c43312rms.OLrzqt()).AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                C57659ymb.loadFixSizeBorderImage$default(imageView, str, C52761wXj.TaskDescription.aHXSQp, 0.0f, 0.0f, 12, null);
                C10041bgv c10041bgv = C10041bgv.this;
                android.content.Context contextRequireContext = c10041bgv.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                java.lang.CharSequence charSequenceCopydefault = c10041bgv.copydefault(contextRequireContext, c10525bqB.KWHzl().fJNWhG());
                ((AbstractC16828erL) c43312rms.OLrzqt()).valueOf.setText(charSequenceCopydefault);
                ((AbstractC16828erL) c43312rms.OLrzqt()).KWHzl.setText(c10525bqB.KWHzl().gEmmrt());
                ((AbstractC16828erL) c43312rms.OLrzqt()).copydefault.setText(c10525bqB.AwvSrB());
                if (c10525bqB.AwvSrB().length() != 0) {
                    C55251xgS c55251xgS = ((AbstractC16828erL) c43312rms.OLrzqt()).copydefault;
                    Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
                    c55251xgS.setVisibility(8);
                } else {
                    C55251xgS c55251xgS2 = ((AbstractC16828erL) c43312rms.OLrzqt()).copydefault;
                    Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
                    c55251xgS2.setVisibility(0);
                }
                ((AbstractC16828erL) c43312rms.OLrzqt()).EZpvd.setText(C10041bgv.this.EZpvd(c10525bqB.KWHzl().OLrzqt()));
                if (c10525bqB.KWHzl().OLrzqt().length() <= 0 && !c10525bqB.ORxRYg() && !C10854bwM.isXRCToken$default(c10525bqB.KWHzl(), null, 1, null)) {
                    android.widget.TextView textView = ((AbstractC16828erL) c43312rms.OLrzqt()).EZpvd;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    textView.setVisibility(0);
                } else {
                    android.widget.TextView textView2 = ((AbstractC16828erL) c43312rms.OLrzqt()).EZpvd;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    textView2.setVisibility(8);
                }
                C10324bmM c10324bmM = ((AbstractC16828erL) c43312rms.OLrzqt()).OLrzqt;
                C10041bgv c10041bgv2 = C10041bgv.this;
                c10324bmM.setCheckState(c10041bgv2.copydefault(c10525bqB.wlaJM()));
                c10324bmM.setOnCheckStateChangeListener(new StateListAnimator(c10525bqB, c10041bgv2, c43312rms));
            }
            str = strOLrzqt;
            android.widget.ImageView imageView2 = ((AbstractC16828erL) c43312rms.OLrzqt()).AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C57659ymb.loadFixSizeBorderImage$default(imageView2, str, C52761wXj.TaskDescription.aHXSQp, 0.0f, 0.0f, 12, null);
            C10041bgv c10041bgv3 = C10041bgv.this;
            android.content.Context contextRequireContext2 = c10041bgv3.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            java.lang.CharSequence charSequenceCopydefault2 = c10041bgv3.copydefault(contextRequireContext2, c10525bqB.KWHzl().fJNWhG());
            ((AbstractC16828erL) c43312rms.OLrzqt()).valueOf.setText(charSequenceCopydefault2);
            ((AbstractC16828erL) c43312rms.OLrzqt()).KWHzl.setText(c10525bqB.KWHzl().gEmmrt());
            ((AbstractC16828erL) c43312rms.OLrzqt()).copydefault.setText(c10525bqB.AwvSrB());
            if (c10525bqB.AwvSrB().length() != 0) {
            }
            ((AbstractC16828erL) c43312rms.OLrzqt()).EZpvd.setText(C10041bgv.this.EZpvd(c10525bqB.KWHzl().OLrzqt()));
            if (c10525bqB.KWHzl().OLrzqt().length() <= 0) {
                android.widget.TextView textView22 = ((AbstractC16828erL) c43312rms.OLrzqt()).EZpvd;
                Intrinsics.checkNotNullExpressionValue(textView22, "");
                textView22.setVisibility(8);
            }
            C10324bmM c10324bmM2 = ((AbstractC16828erL) c43312rms.OLrzqt()).OLrzqt;
            C10041bgv c10041bgv22 = C10041bgv.this;
            c10324bmM2.setCheckState(c10041bgv22.copydefault(c10525bqB.wlaJM()));
            c10324bmM2.setOnCheckStateChangeListener(new StateListAnimator(c10525bqB, c10041bgv22, c43312rms));
        }

        /* JADX INFO: renamed from: o.bgv$Application$StateListAnimator */
        public static final class StateListAnimator implements InterfaceC10330bmS {
            public final /* synthetic */ C10041bgv EZpvd;
            public final /* synthetic */ C43312rms<AbstractC16828erL> KWHzl;
            public final /* synthetic */ C10525bqB OLrzqt;

            public StateListAnimator(C10525bqB c10525bqB, C10041bgv c10041bgv, C43312rms<AbstractC16828erL> c43312rms) {
                this.OLrzqt = c10525bqB;
                this.EZpvd = c10041bgv;
                this.KWHzl = c43312rms;
            }

            @Override // o.InterfaceC10330bmS
            public void KWHzl(final C10324bmM c10324bmM, int i) {
                Intrinsics.checkNotNullParameter(c10324bmM, "");
                if (!this.OLrzqt.KWHzl().DarRvM() && i == 1) {
                    final C10041bgv c10041bgv = this.EZpvd;
                    final C10525bqB c10525bqB = this.OLrzqt;
                    final C43312rms<AbstractC16828erL> c43312rms = this.KWHzl;
                    if (c10041bgv.EZpvd(c10525bqB, new Function1() { // from class: o.bgG
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C10041bgv.Application.StateListAnimator.EZpvd(c10041bgv, c10324bmM, c10525bqB, c43312rms, ((java.lang.Boolean) obj).booleanValue());
                        }
                    })) {
                        return;
                    }
                }
                C10041bgv c10041bgv2 = this.EZpvd;
                C10525bqB c10525bqB2 = this.OLrzqt;
                c10041bgv2.AEQbTJ(c10324bmM, c10525bqB2, c10525bqB2.wlaJM(), this.KWHzl.getAdapterPosition());
                if (i == 1) {
                    this.EZpvd.AEQbTJ(this.OLrzqt);
                }
            }

            public static final Unit EZpvd(C10041bgv c10041bgv, C10324bmM c10324bmM, C10525bqB c10525bqB, C43312rms c43312rms, boolean z) {
                if (z) {
                    c10041bgv.AEQbTJ(c10324bmM, c10525bqB, c10525bqB.wlaJM(), c43312rms.getAdapterPosition());
                } else {
                    c10324bmM.setCheckState(0);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.CharSequence copydefault(final android.content.Context context, java.lang.String str) {
        return C33061mpO.KWHzl(str, KWHzl().EZpvd(), new Function1() { // from class: o.bgE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10041bgv.KWHzl(context, (java.util.List) obj);
            }
        });
    }

    public static final Unit KWHzl(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.AhwBna));
        list.add(new android.text.style.ForegroundColorSpan(C55366xib.KWHzl(C52761wXj.ActionBar.DCUTEI, context)));
        return Unit.INSTANCE;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        if (str.length() == 0) {
            return str;
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.HJWChPOZOJIj) + C14079deg.getAddressStr$default(C14079deg.EZpvd, str, false, 2, null);
    }

    public final int copydefault(java.lang.String str) {
        C10407bnq.ActionBar actionBar = C10407bnq.Companion;
        return (C10407bnq.ActionBar.getInstance$default(actionBar, null, 1, null).copydefault(str) || C10407bnq.ActionBar.getInstance$default(actionBar, null, 1, null).AYXKKw(str)) ? 1 : 0;
    }

    public final void AEQbTJ(final C10324bmM c10324bmM, final C10525bqB c10525bqB, final java.lang.String str, final int i) {
        C10854bwM c10854bwMKWHzl;
        java.util.List<AddCoinReq> listEZpvd;
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXOLrzqt;
        if (c10324bmM.AEQbTJ() == 0 && !C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).gEmmrt(str)) {
            c10324bmM.setCheckState(1);
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.gVEiQJ), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        final boolean z = c10324bmM.AEQbTJ() == 1;
        if (c10525bqB.KWHzl().DarRvM()) {
            c10854bwMKWHzl = C10598brV.AEQbTJ.djBIcL(c10525bqB.OLrzqt());
        } else {
            c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(c10525bqB.OLrzqt()));
        }
        if (c10854bwMKWHzl == null || c10854bwMKWHzl.AuCTelauCTel() == 4) {
            java.lang.String strAhwBna = WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).AhwBna();
            C10862bwU c10862bwUAYXKKw = C10954byG.EZpvd.AYXKKw();
            AbstractC12782ctV abstractC12782ctVAEQbTJ = KWHzl().AEQbTJ();
            if (c10525bqB.ORxRYg()) {
                java.util.ArrayList<java.lang.Long> arrayListFARcdN = c10525bqB.fARcdN();
                if (arrayListFARcdN == null) {
                    listEZpvd = yDY.AhwBna();
                } else {
                    listEZpvd = new java.util.ArrayList<>(C56403yEb.AYXKKw(arrayListFARcdN, 10));
                    java.util.Iterator<T> it = arrayListFARcdN.iterator();
                    while (it.hasNext()) {
                        java.util.List<AddCoinReq> list = listEZpvd;
                        list.add(new AddCoinReq((java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 0, strAhwBna, KWHzl().AYXKKw(), (java.lang.Integer) null, java.lang.Long.valueOf(((java.lang.Number) it.next()).longValue()), 79, (DefaultConstructorMarker) null));
                        listEZpvd = list;
                    }
                }
            } else {
                listEZpvd = C56402yEa.EZpvd(new AddCoinReq((java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 0, strAhwBna, KWHzl().AYXKKw(), (java.lang.Integer) null, java.lang.Long.valueOf(c10525bqB.OLrzqt()), 79, (DefaultConstructorMarker) null));
            }
            abstractC58185ywXOLrzqt = c10862bwUAYXKKw.OLrzqt(abstractC12782ctVAEQbTJ, listEZpvd);
        } else {
            abstractC58185ywXOLrzqt = AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
        }
        final Function1 function1 = new Function1() { // from class: o.bgy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10041bgv.EZpvd(this.copydefault, c10525bqB, str, z, (java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXCopydefault = abstractC58185ywXOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bgB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10041bgv.valueOf(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bgC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10041bgv.EZpvd(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXCopydefault2 = abstractC58185ywXCopydefault.copydefault((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.bgz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10041bgv.gEmmrt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault2, "");
        C33024moe.subscribeOnIO$default(abstractC58185ywXCopydefault2, new Function1() { // from class: o.bgD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10041bgv.OLrzqt(c10324bmM, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.bgA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10041bgv.AEQbTJ(z, this, c10525bqB, i, c10324bmM, (Unit) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final InterfaceC58261yxu valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(C10041bgv c10041bgv, C10525bqB c10525bqB, java.lang.String str, boolean z, java.lang.Boolean bool) throws java.lang.Exception {
        AbstractC58260yxt abstractC58260yxtCopydefault;
        Intrinsics.checkNotNullParameter(bool, "");
        C10856bwO.copydefault(c10041bgv.AYXKKw, 0, "updateState state 111: " + bool);
        if (bool.booleanValue()) {
            if (c10525bqB.KWHzl().DarRvM()) {
                abstractC58260yxtCopydefault = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).AEQbTJ(str, z);
            } else {
                abstractC58260yxtCopydefault = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).copydefault(str, z);
            }
            final StateListAnimator stateListAnimator = StateListAnimator.KWHzl;
            return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.bgF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10041bgv.djBIcL(stateListAnimator, obj);
                }
            });
        }
        throw new java.lang.Exception(java.lang.String.valueOf(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DxnCrt)));
    }

    public static final java.lang.Boolean djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(C10041bgv c10041bgv, java.lang.Boolean bool) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            return c10041bgv.KWHzl().djBIcL().KWHzl(yBP.AEQbTJ());
        }
        throw new java.lang.Exception(java.lang.String.valueOf(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DxnCrt)));
    }

    public static final Unit AEQbTJ(boolean z, C10041bgv c10041bgv, C10525bqB c10525bqB, int i, C10324bmM c10324bmM, Unit unit) {
        SearchCoinViewModel.OpenOrCloseCoinResult openOrCloseCoinResultEZpvd;
        if (z) {
            openOrCloseCoinResultEZpvd = c10041bgv.KWHzl().AEQbTJ(c10525bqB, i);
        } else {
            openOrCloseCoinResultEZpvd = c10041bgv.KWHzl().EZpvd(c10525bqB, i);
        }
        c10041bgv.AEQbTJ(openOrCloseCoinResultEZpvd);
        if (c10324bmM.AEQbTJ() == 1) {
            C55326xho.toast$default(C13754dXa.FragmentManager.onWindowStartingSupportActionMode, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else {
            C55326xho.toast$default(C13754dXa.FragmentManager.supportInvalidateOptionsMenu, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        c10041bgv.KWHzl().KWHzl(c10525bqB, c10324bmM.AEQbTJ());
        RxBus.AEQbTJ(new C9934beu());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C10324bmM c10324bmM, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C55326xho.toast$default(th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        if (c10324bmM.AEQbTJ() == 0) {
            c10324bmM.setCheckState(1);
        } else {
            c10324bmM.setCheckState(0);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(SearchCoinViewModel.OpenOrCloseCoinResult openOrCloseCoinResult) {
        C10525bqB c10525bqBRemove = this.djBIcL.remove(openOrCloseCoinResult.getUiRemoveIndex());
        Intrinsics.checkNotNullExpressionValue(c10525bqBRemove, "");
        this.djBIcL.add(openOrCloseCoinResult.getUiAddIndex(), c10525bqBRemove);
        this.EZpvd.notifyItemRemoved(openOrCloseCoinResult.getUiRemoveIndex());
        this.EZpvd.notifyItemInserted(openOrCloseCoinResult.getUiAddIndex());
    }
}
