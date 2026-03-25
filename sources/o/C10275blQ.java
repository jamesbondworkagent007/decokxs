package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.api.bean.CoinPrice;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationContext;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationResponseAssetItem;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationResponseItem;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10347bmj;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC10343bmf;
import o.InterfaceC9737bbI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.blQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10275blQ extends AbstractC32996moC {
    public final InterfaceC56387yDm AYXKKw;
    public boolean AhwBna;
    public final int AkhnZx = C13754dXa.TaskDescription.Swccd;
    public final InterfaceC56387yDm AuCTel;
    public java.util.List<UtxoConfirmationResponseItem> DbNXlk;
    public InterfaceC9731bbC EZpvd;
    public AbstractC16563emL KWHzl;
    public java.lang.String OLrzqt;
    public long copydefault;
    public int djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public java.util.List<UtxoConfirmationResponseItem> gEmmrt;
    public InterfaceC9731bbC isConnected;
    public boolean valueOf;
    public int values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull AbstractC16563emL abstractC16563emL) {
        Intrinsics.checkNotNullParameter(abstractC16563emL, "");
        this.KWHzl = abstractC16563emL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AkhnZx;
    }

    public C10275blQ() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.assets.utxo.utxoconfirmation.InvestUtxoConfirmationFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.assets.utxo.utxoconfirmation.InvestUtxoConfirmationFragment$special$$inlined$viewModels$default$2
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
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C10342bme.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.assets.utxo.utxoconfirmation.InvestUtxoConfirmationFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.assets.utxo.utxoconfirmation.InvestUtxoConfirmationFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.assets.utxo.utxoconfirmation.InvestUtxoConfirmationFragment$special$$inlined$viewModels$default$5
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
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.blR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C10275blQ.KWHzl();
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.blX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C10275blQ.EZpvd();
            }
        });
        this.DbNXlk = yDY.AhwBna();
        this.gEmmrt = yDY.AhwBna();
        this.OLrzqt = "";
    }

    public final AbstractC16563emL AEQbTJ() {
        AbstractC16563emL abstractC16563emL = this.KWHzl;
        if (abstractC16563emL != null) {
            return abstractC16563emL;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C10342bme valueOf() {
        return (C10342bme) this.AuCTel.getValue();
    }

    public static final C10340bmc KWHzl() {
        return new C10340bmc();
    }

    public final C10340bmc AhwBna() {
        return (C10340bmc) this.fetchVPNInfo.getValue();
    }

    public static final C10340bmc EZpvd() {
        return new C10340bmc();
    }

    public final C10340bmc djBIcL() {
        return (C10340bmc) this.AYXKKw.getValue();
    }

    public final UtxoConfirmationContext gEmmrt() {
        android.os.Bundle arguments = getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("utxo.confirmation.context") : null;
        UtxoConfirmationContext utxoConfirmationContext = serializable instanceof UtxoConfirmationContext ? (UtxoConfirmationContext) serializable : null;
        return utxoConfirmationContext == null ? UtxoConfirmationContext.Undefined : utxoConfirmationContext;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dpQ.collectOnLifecycle$default(androidx.lifecycle.LifecycleOwner, kotlinx.coroutines.flow.Flow, androidx.lifecycle.Lifecycle$State, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.util.List<UtxoConfirmationResponseItem> listAhwBna;
        java.util.List<UtxoConfirmationResponseItem> listAhwBna2;
        Intrinsics.checkNotNullParameter(view, "");
        EZpvd(AbstractC16563emL.KWHzl(view));
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            java.util.ArrayList parcelableArrayList = arguments.getParcelableArrayList("useUtxoList");
            if (parcelableArrayList == null || (listAhwBna = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList)) == null) {
                listAhwBna = yDY.AhwBna();
            }
            this.DbNXlk = listAhwBna;
            java.util.ArrayList parcelableArrayList2 = arguments.getParcelableArrayList("gasUtxoList");
            if (parcelableArrayList2 == null || (listAhwBna2 = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList2)) == null) {
                listAhwBna2 = yDY.AhwBna();
            }
            this.gEmmrt = listAhwBna2;
            this.copydefault = arguments.getLong("coinId", 0L);
            if (arguments.containsKey("txType")) {
                this.values = arguments.getInt("txType", 0);
            }
            this.valueOf = arguments.getBoolean("isNFTListing", false);
            this.AhwBna = arguments.getBoolean("isDialog");
            this.djBIcL = arguments.getInt("count", 0);
        }
        this.EZpvd = InterfaceC9737bbI.Application.getCoinMeta$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), java.lang.Long.valueOf(this.copydefault), false, 2, null);
        InterfaceC9731bbC chainMeta$default = InterfaceC9737bbI.Application.getChainMeta$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), this.copydefault, false, 2, null);
        if (chainMeta$default == null) {
            chainMeta$default = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().copydefault();
        }
        this.isConnected = chainMeta$default;
        C14646dpQ.collectOnLifecycle$default(this, valueOf().OLrzqt(), null, new Function1() { // from class: o.blV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10275blQ.AEQbTJ(this.AEQbTJ, (InterfaceC10343bmf) obj);
            }
        }, 2, null);
        DbNXlk();
        showLoading();
        C13934dbu c13934dbu = new C13934dbu();
        InterfaceC9731bbC interfaceC9731bbC = this.isConnected;
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(c13934dbu.copydefault(yDY.OLrzqt(interfaceC9731bbC != null ? java.lang.Long.valueOf(interfaceC9731bbC.AhwBna()) : null), (java.util.List<java.lang.Long>) null), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.bma
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10275blQ.copydefault(this.KWHzl, (java.util.List) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58227yxM() { // from class: o.blY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10275blQ.KWHzl(function1, obj);
            }
        });
        C52794wYp c52794wYp = AEQbTJ().gEmmrt;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        if (this.AhwBna) {
            AEQbTJ().KWHzl.setBackgroundColor(ContextCompat.getColor(requireContext(), C52761wXj.Activity.DcMfJKDCKfqPDCfLja));
            android.widget.TextView textView = AEQbTJ().DbNXlk;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = 0;
                textView.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        C14646dpQ.EZpvd(this, C10350bmm.AEQbTJ.AEQbTJ(), Lifecycle.State.CREATED, new Function1() { // from class: o.blZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10275blQ.EZpvd(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit AEQbTJ(C10275blQ c10275blQ, InterfaceC10343bmf interfaceC10343bmf) {
        Intrinsics.checkNotNullParameter(interfaceC10343bmf, "");
        c10275blQ.OLrzqt(interfaceC10343bmf);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final C10275blQ c10275blQ, java.util.List list) {
        c10275blQ.dismissLoading();
        Intrinsics.copydefault(list);
        CoinPrice coinPrice = (CoinPrice) CollectionsKt___CollectionsKt.firstOrNull(list);
        java.lang.String price = coinPrice != null ? coinPrice.getPrice() : null;
        if (price == null) {
            price = "";
        }
        c10275blQ.OLrzqt = price;
        c10275blQ.isConnected();
        c10275blQ.AYXKKw();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c10275blQ, true, (java.lang.String) null, 2, (java.lang.Object) null);
        c10275blQ.AEQbTJ().isConnected.post(new java.lang.Runnable() { // from class: o.bmb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C10275blQ.KWHzl(this.AEQbTJ);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C10275blQ c10275blQ) {
        c10275blQ.AEQbTJ().isConnected.setLayoutTransition(new android.animation.LayoutTransition());
        c10275blQ.AEQbTJ().isConnected.getLayoutTransition().enableTransitionType(4);
    }

    public static final Unit EZpvd(C10275blQ c10275blQ, boolean z) {
        FragmentActivity activity;
        if (z && (activity = c10275blQ.getActivity()) != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    private final void DbNXlk() {
        AEQbTJ().fetchVPNInfo.setAdapter(AhwBna());
        RecyclerView recyclerView = AEQbTJ().fetchVPNInfo;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.copydefault(8.0f, contextRequireContext), 0));
        AEQbTJ().AYXKKw.setAdapter(djBIcL());
        RecyclerView recyclerView2 = AEQbTJ().AYXKKw;
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        recyclerView2.addItemDecoration(new C31703mAu(C55298xhM.copydefault(8.0f, contextRequireContext2), 0));
    }

    private final void isConnected() {
        java.lang.String strCopydefault;
        java.lang.String strCopydefault2;
        if (!this.DbNXlk.isEmpty()) {
            RecyclerView recyclerView = AEQbTJ().fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(0);
            android.widget.TextView textView = AEQbTJ().values;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            C10340bmc c10340bmcAhwBna = AhwBna();
            java.util.List<UtxoConfirmationResponseItem> list = this.DbNXlk;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((UtxoConfirmationResponseItem) it.next()).OLrzqt(this.values == 67));
            }
            c10340bmcAhwBna.AhwBna(arrayList);
        } else {
            RecyclerView recyclerView2 = AEQbTJ().fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
            recyclerView2.setVisibility(8);
            android.widget.TextView textView2 = AEQbTJ().values;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
        }
        if (!this.gEmmrt.isEmpty()) {
            RecyclerView recyclerView3 = AEQbTJ().AYXKKw;
            Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
            recyclerView3.setVisibility(0);
            android.widget.TextView textView3 = AEQbTJ().AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(0);
            android.widget.TextView textView4 = AEQbTJ().AhwBna;
            if (gEmmrt() == UtxoConfirmationContext.Dapp) {
                strCopydefault2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.gUEfcq);
            } else {
                int i = C13754dXa.FragmentManager.supportRequestWindowFeature;
                InterfaceC9731bbC interfaceC9731bbC = this.EZpvd;
                java.lang.String strFJNWhG = interfaceC9731bbC != null ? interfaceC9731bbC.fJNWhG() : null;
                if (strFJNWhG == null) {
                    strFJNWhG = "";
                }
                strCopydefault2 = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", strFJNWhG)));
            }
            textView4.setText(strCopydefault2);
            C10340bmc c10340bmcDjBIcL = djBIcL();
            java.util.List<UtxoConfirmationResponseItem> list2 = this.gEmmrt;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            java.util.Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((UtxoConfirmationResponseItem) it2.next()).KWHzl(this.isConnected, this.OLrzqt));
            }
            c10340bmcDjBIcL.AhwBna(arrayList2);
        } else {
            RecyclerView recyclerView4 = AEQbTJ().AYXKKw;
            Intrinsics.checkNotNullExpressionValue(recyclerView4, "");
            recyclerView4.setVisibility(8);
            android.widget.TextView textView5 = AEQbTJ().AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            textView5.setVisibility(8);
        }
        AEQbTJ().EZpvd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.blU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C10275blQ.AEQbTJ(this.copydefault, compoundButton, z);
            }
        });
        AEQbTJ().copydefault.setOnClickListener(null);
        AEQbTJ().AkhnZx.post(new java.lang.Runnable() { // from class: o.blT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C10275blQ.AEQbTJ(this.AEQbTJ);
            }
        });
        android.widget.TextView textView6 = AEQbTJ().values;
        int i2 = this.values;
        if (i2 == 67) {
            strCopydefault = getString(C13754dXa.FragmentManager.hlkKmr);
        } else if (i2 == 20 && this.valueOf && this.copydefault == 1) {
            strCopydefault = getString(C13754dXa.FragmentManager.gSBher);
        } else {
            int i3 = C13754dXa.FragmentManager.gmHjFq;
            InterfaceC9731bbC interfaceC9731bbC2 = this.EZpvd;
            java.lang.String strFJNWhG2 = interfaceC9731bbC2 != null ? interfaceC9731bbC2.fJNWhG() : null;
            strCopydefault = C33069mpW.copydefault(this, i3, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", strFJNWhG2 != null ? strFJNWhG2 : "")));
        }
        textView6.setText(strCopydefault);
    }

    /* JADX INFO: renamed from: o.blQ$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C10275blQ EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C10275blQ c10275blQ) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c10275blQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C52794wYp.startLoading$default(this.EZpvd.AEQbTJ().gEmmrt, 0L, 1, null);
                C10350bmm.AEQbTJ.AEQbTJ(AbstractC10347bmj.TaskDescription.copydefault);
            }
        }
    }

    public static final void AEQbTJ(C10275blQ c10275blQ, android.widget.CompoundButton compoundButton, boolean z) {
        c10275blQ.valueOf().AEQbTJ(z);
    }

    public static final void AEQbTJ(C10275blQ c10275blQ) {
        android.view.View view = c10275blQ.AEQbTJ().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = c10275blQ.AEQbTJ().copydefault.getMeasuredHeight();
            view.setLayoutParams(layoutParams);
            NestedScrollView nestedScrollView = c10275blQ.AEQbTJ().AkhnZx;
            Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
            if (c10275blQ.copydefault(nestedScrollView)) {
                c10275blQ.AEQbTJ().copydefault.setText(c10275blQ.getString(C13754dXa.FragmentManager.DGOPHZ));
                return;
            } else {
                c10275blQ.AEQbTJ().copydefault.setText(c10275blQ.getString(C13754dXa.FragmentManager.DCUTEIddSDPG));
                return;
            }
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void AYXKKw() {
        C32866mlf.onEvent$default("Web3Send_UTXO_Page_Submit", (TrackChannel[]) null, new Function1() { // from class: o.blW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10275blQ.EZpvd(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [239=4] */
    public static final Unit EZpvd(C10275blQ c10275blQ, EventParamsList eventParamsList) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.util.Iterator<T> it = c10275blQ.gEmmrt.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.util.List<UtxoConfirmationResponseAssetItem> listEZpvd = ((UtxoConfirmationResponseItem) next).EZpvd();
            if (listEZpvd != null) {
                java.util.Iterator<T> it2 = listEZpvd.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((UtxoConfirmationResponseAssetItem) next2).KWHzl(), (java.lang.Object) "ARC20")) {
                        obj = next2;
                        break;
                    }
                }
                obj = (UtxoConfirmationResponseAssetItem) obj;
            }
            if (obj != null) {
                obj = next;
                break;
            }
        }
        eventParamsList.put("utxo_arc_network", obj != null ? "Yes" : "No", false);
        eventParamsList.put("num_utxo", java.lang.String.valueOf(c10275blQ.djBIcL), false);
        eventParamsList.put("num_utxo_multiple", java.lang.String.valueOf(c10275blQ.gEmmrt.size() + c10275blQ.DbNXlk.size()), false);
        java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) c10275blQ.DbNXlk, (java.lang.Iterable) c10275blQ.gEmmrt);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it3 = listDjBIcL.iterator();
        while (it3.hasNext()) {
            java.util.List<UtxoConfirmationResponseAssetItem> listEZpvd2 = ((UtxoConfirmationResponseItem) it3.next()).EZpvd();
            if (listEZpvd2 == null) {
                listEZpvd2 = yDY.AhwBna();
            }
            C56406yEe.KWHzl(arrayList, listEZpvd2);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            java.lang.String strKWHzl = ((UtxoConfirmationResponseAssetItem) it4.next()).KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            arrayList2.add(strKWHzl);
        }
        eventParamsList.put("num_assets", java.lang.String.valueOf(CollectionsKt___CollectionsKt.QbewEr(arrayList2).size()), false);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(InterfaceC10343bmf interfaceC10343bmf) {
        if (Intrinsics.EZpvd(interfaceC10343bmf, InterfaceC10343bmf.ActionBar.EZpvd)) {
            android.widget.TextView textView = AEQbTJ().copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            android.view.View view = AEQbTJ().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(0);
            AEQbTJ().gEmmrt.setEnabled(false);
            if (this.AhwBna) {
                AEQbTJ().valueOf.setBackgroundColor(ContextCompat.getColor(requireContext(), C52761wXj.Activity.registerUser));
                return;
            }
            return;
        }
        if (!Intrinsics.EZpvd(interfaceC10343bmf, InterfaceC10343bmf.Application.AEQbTJ)) {
            throw new NoWhenBranchMatchedException();
        }
        android.widget.TextView textView2 = AEQbTJ().copydefault;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(4);
        android.view.View view2 = AEQbTJ().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(4);
        AEQbTJ().gEmmrt.setEnabled(true);
        if (this.AhwBna) {
            AEQbTJ().valueOf.setBackgroundColor(ContextCompat.getColor(requireContext(), C52761wXj.Activity.DcMfJKDCKfqPDCfLja));
        }
    }

    public final boolean copydefault(NestedScrollView nestedScrollView) {
        android.view.View childAt = nestedScrollView.getChildAt(0);
        if (childAt != null) {
            return nestedScrollView.getMeasuredHeight() < (childAt.getMeasuredHeight() + nestedScrollView.getPaddingTop()) + nestedScrollView.getPaddingBottom();
        }
        return false;
    }

    /* JADX INFO: renamed from: o.blQ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.blQ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C10275blQ copydefault(android.os.Bundle bundle) {
            C10275blQ c10275blQ = new C10275blQ();
            c10275blQ.setArguments(bundle);
            return c10275blQ;
        }
    }
}
