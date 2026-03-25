package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.dexkline.dexlogic.txs.TxType;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoParams;
import com.okinc.dexkline.market.features.coindetail.ui.label.LabelFilter;
import com.okinc.dexkline.market.features.filter.SharedFilterViewModel;
import com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.filter.ui.CommonTrackData;
import com.okinc.dexkline.market.features.filter.ui.FilterAction;
import com.okinc.dexkline.market.features.filter.ui.FilterBottomSheetParams;
import com.okinc.dexkline.market.features.filter.ui.FilterSheetTrackParams;
import com.okinc.dexkline.market.features.history.ui.HistoryChangeViewModel;
import com.okinc.dexkline.market.features.history.ui.HistoryHeaderFragment$updateFilterIcon$1;
import com.okinc.dexkline.market.features.history.ui.models.HistoryChangeFragmentParams;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C35964oKf;
import o.C52761wXj;
import o.C57406yhn;
import o.InterfaceC32365mZh;
import o.mYW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class mZQ extends AbstractC32382mZy implements InterfaceC32365mZh {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AhwBna;
    public oNL djBIcL;
    public final InterfaceC56387yDm gEmmrt;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TxType.values().length];
            try {
                iArr[TxType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TxType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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

    @Override // o.InterfaceC32365mZh
    public void EZpvd(@NotNull FilterAction filterAction, @NotNull TokenFilter tokenFilter) {
        InterfaceC32365mZh.Application.copydefault(this, filterAction, tokenFilter);
    }

    public mZQ() {
        final Function0 function0 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SharedFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryHeaderFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryHeaderFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryHeaderFragment$special$$inlined$activityViewModels$default$3
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
        final Function0 function02 = new Function0() { // from class: o.mZU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return mZQ.EZpvd(this.OLrzqt);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryHeaderFragment$special$$inlined$viewModels$default$1
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(HistoryChangeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryHeaderFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryHeaderFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryHeaderFragment$special$$inlined$viewModels$default$4
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

    /* JADX INFO: Access modifiers changed from: private */
    public final HistoryChangeFragmentParams AhwBna() {
        HistoryChangeFragmentParams historyChangeFragmentParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (historyChangeFragmentParams = (HistoryChangeFragmentParams) BundleCompat.getParcelable(arguments, "key.history_change_params", HistoryChangeFragmentParams.class)) == null) ? new HistoryChangeFragmentParams(null, null, null, null, null, null, 63, null) : historyChangeFragmentParams;
    }

    public final oNL valueOf() {
        oNL onl = this.djBIcL;
        Intrinsics.copydefault(onl);
        return onl;
    }

    private final SharedFilterViewModel AYXKKw() {
        return (SharedFilterViewModel) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HistoryChangeViewModel AkhnZx() {
        return (HistoryChangeViewModel) this.gEmmrt.getValue();
    }

    public static final ViewModelStoreOwner EZpvd(mZQ mzq) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = mzq.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.djBIcL = oNL.EZpvd(layoutInflater, viewGroup, false);
        LinearLayoutCompat root = valueOf().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fetchVPNInfo();
        values();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (AkhnZx().isConnected().isEmpty()) {
            AkhnZx().fARcdN();
        }
    }

    private final void fetchVPNInfo() {
        final oNL onlValueOf = valueOf();
        DbNXlk();
        gEmmrt();
        onlValueOf.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.mZP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mZQ.valueOf(this.EZpvd, view);
            }
        });
        C55258xgZ c55258xgZ = onlValueOf.AhwBna;
        c55258xgZ.setOnClickListener(new ActionBar(c55258xgZ, 1000L, this));
        onlValueOf.valueOf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.mZV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                mZQ.KWHzl(this.copydefault, onlValueOf, compoundButton, z);
            }
        });
        mUO.setOnDoubleCheckClickListener$default(onlValueOf.KWHzl, 0L, new Function1() { // from class: o.mZT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mZQ.gEmmrt(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final void valueOf(mZQ mzq, android.view.View view) {
        mzq.AkhnZx().KWHzl(!(mzq.AkhnZx().DbNXlk().getValue() != null ? r1.booleanValue() : false));
    }

    public static final void KWHzl(mZQ mzq, oNL onl, android.widget.CompoundButton compoundButton, boolean z) {
        if (z) {
            java.lang.String strAEQbTJ = mzq.AhwBna().AEQbTJ();
            SwitchCompat switchCompat = onl.valueOf;
            Intrinsics.checkNotNullExpressionValue(switchCompat, "");
            C34599nfD.KWHzl(switchCompat, strAEQbTJ);
        } else {
            onl.valueOf.setThumbDrawable(C33070mpX.KWHzl(C57406yhn.Activity.DTwDnp));
        }
        mzq.AkhnZx().OLrzqt(z);
    }

    public static final Unit gEmmrt(mZQ mzq, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        mzq.isConnected();
        return Unit.INSTANCE;
    }

    private final void values() {
        AkhnZx().DbNXlk().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.nab
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mZQ.AEQbTJ(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        AkhnZx().copydefault().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.mZZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mZQ.EZpvd(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        AkhnZx().OLrzqt().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.naa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mZQ.AEQbTJ(this.EZpvd, (TokenFilter) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(mZQ mzq, java.lang.Boolean bool) {
        Intrinsics.copydefault(bool);
        mzq.KWHzl(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(mZQ mzq, java.lang.Boolean bool) {
        mzq.valueOf().valueOf.setChecked(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(mZQ mzq, TokenFilter tokenFilter) {
        Intrinsics.copydefault(tokenFilter);
        mzq.EZpvd(tokenFilter);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) mzq, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    private final void KWHzl(boolean z) {
        android.widget.ImageView imageView = valueOf().EZpvd;
        imageView.setImageResource(z ? C32113mPz.TaskDescription.EZpvd : C52761wXj.TaskDescription.RXzakW);
        imageView.setColorFilter(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
    }

    public final void gEmmrt() {
        if (!Intrinsics.EZpvd((java.lang.Object) AhwBna().EZpvd(), (java.lang.Object) "501")) {
            valueOf().copydefault.setVisibility(8);
        } else {
            mUO.setOnDoubleCheckClickListener$default(valueOf().copydefault, 0L, new Function1() { // from class: o.mZO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return mZQ.KWHzl(this.EZpvd, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit KWHzl(final mZQ mzq, final android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setSelected(true);
        LabelFilter[] labelFilterArrValues = LabelFilter.values();
        java.util.ArrayList<LabelFilter> arrayList = new java.util.ArrayList();
        for (LabelFilter labelFilter : labelFilterArrValues) {
            if (labelFilter != LabelFilter.FOLLOWING) {
                arrayList.add(labelFilter);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (LabelFilter labelFilter2 : arrayList) {
            LabelFilter.TaskDescription taskDescription = LabelFilter.Companion;
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(taskDescription.AEQbTJ(labelFilter2));
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(taskDescription.EZpvd(labelFilter2));
            if (drawableKWHzl != null) {
                drawableKWHzl.setTint(mUM.copydefault(C52761wXj.Activity.fdOvFl));
            } else {
                drawableKWHzl = null;
            }
            arrayList2.add(new C34640nfs(strAYXKKw, drawableKWHzl, null, null, labelFilter2 == mzq.AkhnZx().djBIcL(), labelFilter2, 12, null));
        }
        C34642nfu.Companion.KWHzl(arrayList2, mzq.AhwBna().copydefault(), new Function1() { // from class: o.mZY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mZQ.EZpvd(view, mzq, (C34640nfs) obj);
            }
        }).show(mzq.getChildFragmentManager(), "DexSelectionBottomSheet");
        mzq.EZpvd();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(android.view.View view, mZQ mzq, C34640nfs c34640nfs) {
        view.setSelected(false);
        java.lang.Object objGEmmrt = c34640nfs != null ? c34640nfs.gEmmrt() : null;
        LabelFilter labelFilter = objGEmmrt instanceof LabelFilter ? (LabelFilter) objGEmmrt : null;
        if (labelFilter == null) {
            return Unit.INSTANCE;
        }
        TokenFilter tokenFilterEZpvd = mzq.AkhnZx().EZpvd();
        HistoryChangeViewModel.updateFilter$default(mzq.AkhnZx(), null, labelFilter, tokenFilterEZpvd.AEQbTJ((15359 & 1) != 0 ? tokenFilterEZpvd.copydefault : null, (15359 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (15359 & 4) != 0 ? tokenFilterEZpvd.DbNXlk : null, (15359 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (15359 & 16) != 0 ? tokenFilterEZpvd.AEQbTJ : yDY.AhwBna(), (15359 & 32) != 0 ? tokenFilterEZpvd.valueOf : false, (15359 & 64) != 0 ? tokenFilterEZpvd.djBIcL : false, (15359 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (15359 & 256) != 0 ? tokenFilterEZpvd.AYXKKw : false, (15359 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : false, (15359 & 1024) != 0 ? tokenFilterEZpvd.gEmmrt : null, (15359 & 2048) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null, (15359 & 4096) != 0 ? tokenFilterEZpvd.KWHzl : null, (15359 & 8192) != 0 ? tokenFilterEZpvd.AkhnZx : null), 1, null);
        mzq.valueOf().copydefault.setTitle(C33070mpX.AYXKKw(LabelFilter.Companion.AEQbTJ(labelFilter)));
        mzq.AYXKKw().EZpvd(mzq.AkhnZx().EZpvd(), true);
        mzq.valueOf().KWHzl.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.dPnHjp));
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ mZQ EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, mZQ mzq) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = mzq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                mTY.Companion.EZpvd(new HolderInfoParams(this.EZpvd.AhwBna().copydefault(), "DEXMarket_Token_History_AddressLabel_View", null, 4, null)).show(this.EZpvd.getChildFragmentManager(), C56524yIo.AEQbTJ(mTY.class).valueOf());
            }
        }
    }

    public final void EZpvd() {
        mRG.OLrzqt(AhwBna().KWHzl(), AhwBna().copydefault(), AhwBna().EZpvd(), AhwBna().OLrzqt());
    }

    private final void DbNXlk() {
        mUO.setOnDoubleCheckClickListener$default(valueOf().OLrzqt, 0L, new Function1() { // from class: o.mZS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mZQ.djBIcL(this.copydefault, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit djBIcL(final mZQ mzq, final android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setSelected(true);
        C34367naj.Companion.EZpvd(TxType.Companion.copydefault(mzq.AkhnZx().AkhnZx().getValue()), mzq.AhwBna().copydefault(), new Function1() { // from class: o.mZW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mZQ.EZpvd(view, mzq, (TxType) obj);
            }
        }).show(mzq.getChildFragmentManager(), C56524yIo.AEQbTJ(C34367naj.class).valueOf());
        mzq.djBIcL();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(android.view.View view, mZQ mzq, TxType txType) {
        java.lang.String value;
        view.setSelected(false);
        if (txType != null) {
            HistoryChangeViewModel.updateFilter$default(mzq.AkhnZx(), txType, null, null, 6, null);
            mzq.OLrzqt(txType);
        }
        if (txType != null && (value = txType.getValue()) != null) {
            mzq.OLrzqt(value);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(TxType txType) {
        java.lang.String strAYXKKw;
        C55052xcf c55052xcf = valueOf().OLrzqt;
        int i = Activity.copydefault[txType.ordinal()];
        if (i == 1) {
            strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.DDjfYY);
        } else if (i == 2) {
            strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.jNexW);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.FQNKFG);
        }
        c55052xcf.setTitle(strAYXKKw);
    }

    private final void isConnected() {
        if (getChildFragmentManager().findFragmentByTag("tag.FilterBottomSheet") != null) {
            return;
        }
        mYW.ActionBar actionBar = mYW.Companion;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.stopBehavioSecDataCollection);
        java.util.List<PriceRangeFilter> listIsConnected = AkhnZx().isConnected();
        TokenFilter tokenFilterGEmmrt = AkhnZx().gEmmrt();
        TokenFilter tokenFilterEZpvd = AkhnZx().EZpvd();
        actionBar.KWHzl(new FilterBottomSheetParams(strAYXKKw, null, listIsConnected, null, tokenFilterGEmmrt, tokenFilterEZpvd.AEQbTJ((15359 & 1) != 0 ? tokenFilterEZpvd.copydefault : null, (15359 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (15359 & 4) != 0 ? tokenFilterEZpvd.DbNXlk : "", (15359 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (15359 & 16) != 0 ? tokenFilterEZpvd.AEQbTJ : null, (15359 & 32) != 0 ? tokenFilterEZpvd.valueOf : false, (15359 & 64) != 0 ? tokenFilterEZpvd.djBIcL : false, (15359 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (15359 & 256) != 0 ? tokenFilterEZpvd.AYXKKw : false, (15359 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : false, (15359 & 1024) != 0 ? tokenFilterEZpvd.gEmmrt : null, (15359 & 2048) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null, (15359 & 4096) != 0 ? tokenFilterEZpvd.KWHzl : null, (15359 & 8192) != 0 ? tokenFilterEZpvd.AkhnZx : null), AhwBna().copydefault(), AhwBna().OLrzqt(), new FilterSheetTrackParams("CedefiMarket_Token_HistoryFilter_Click", new CommonTrackData("CedefiMarket_Token_HistoryFilter_View", "token_symbol", AhwBna().copydefault())), false, null, null, null, null, false, false, false, true, 130570, null)).show(getChildFragmentManager(), "tag.FilterBottomSheet");
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mZQ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final mZQ copydefault(@NotNull HistoryChangeFragmentParams historyChangeFragmentParams) {
            Intrinsics.checkNotNullParameter(historyChangeFragmentParams, "");
            mZQ mzq = new mZQ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.history_change_params", historyChangeFragmentParams);
            mzq.setArguments(bundle);
            return mzq;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
    }

    @Override // o.InterfaceC32365mZh
    public void OLrzqt(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        HistoryChangeViewModel.updateFilter$default(AkhnZx(), null, null, tokenFilter, 3, null);
    }

    public final void EZpvd(TokenFilter tokenFilter) {
        mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HistoryHeaderFragment$updateFilterIcon$1(tokenFilter, this, null), 3, null);
    }

    public final void djBIcL() {
        TrackChannel[] trackChannelArrEZpvd = C32167mRz.OLrzqt.EZpvd();
        C32866mlf.EZpvd("CedefiMarket_Token_HistoryTransactions_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrEZpvd, trackChannelArrEZpvd.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mZX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mZQ.copydefault(this.EZpvd, (EventParamsList) obj);
            }
        });
    }

    public static final Unit copydefault(mZQ mzq, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "chain_id", mzq.AhwBna().EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", mzq.AhwBna().OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", mzq.AhwBna().KWHzl(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", mzq.AhwBna().copydefault(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str) {
        final java.lang.String str2;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) TxType.BUY.getValue())) {
            str2 = "buy";
        } else {
            str2 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) TxType.SELL.getValue()) ? "sell" : "all";
        }
        TrackChannel[] trackChannelArrEZpvd = C32167mRz.OLrzqt.EZpvd();
        C32866mlf.EZpvd("CedefiMarket_Token_HistoryTransactions_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrEZpvd, trackChannelArrEZpvd.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mZR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mZQ.OLrzqt(this.EZpvd, str2, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(mZQ mzq, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "chain_id", mzq.AhwBna().EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", mzq.AhwBna().OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", mzq.AhwBna().KWHzl(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", mzq.AhwBna().copydefault(), false, 4, null);
        EventParamsList.put$default(eventParamsList, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, str, false, 4, null);
        return Unit.INSTANCE;
    }
}
