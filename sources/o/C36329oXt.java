package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.dexkline.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.kline.news.data.vo.KlineFlashVo;
import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oXt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36329oXt extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public C36332oXw AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public C54822xWp AhwBna;
    public MarketCoinDetailViewModel KWHzl;
    public C36106oPm djBIcL;
    public java.util.ArrayList<java.lang.Object> EZpvd = new java.util.ArrayList<>();
    public java.lang.String OLrzqt = "";
    public java.lang.String gEmmrt = "";

    public C36329oXt() {
        final Function0 function0 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pCZ.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.news.ui.KlineNewsListBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.news.ui.KlineNewsListBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.news.ui.KlineNewsListBottomSheet$special$$inlined$activityViewModels$default$3
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

    public final pCZ OLrzqt() {
        return (pCZ) this.AYXKKw.getValue();
    }

    /* JADX INFO: renamed from: o.oXt$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oXt.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C36329oXt KWHzl() {
            return new C36329oXt();
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        java.util.ArrayList parcelableArrayList;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("key_kline_flash_instrument_id")) == null) {
            string = "";
        }
        this.OLrzqt = string;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("key_kline_flash_instrument_type")) == null) {
            string2 = "";
        }
        this.gEmmrt = string2;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 != null && (parcelableArrayList = BundleCompat.getParcelableArrayList(arguments3, "key.get_flash_list_data", KlineFlashVo.class)) != null) {
            this.EZpvd.addAll(parcelableArrayList);
            this.EZpvd.add(new C36328oXs(this.OLrzqt, this.gEmmrt));
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            pUU.copydefault("KlineNewsListBottomSheet", "Activity is null, cannot init ViewModel");
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) "CEDEFI")) {
            ViewModelProvider.Factory defaultViewModelProviderFactory = activity.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            this.KWHzl = (MarketCoinDetailViewModel) new ViewModelProvider(activity, defaultViewModelProviderFactory).get(MarketCoinDetailViewModel.class);
        } else {
            ViewModelProvider.Factory defaultViewModelProviderFactory2 = activity.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
            this.AhwBna = (C54822xWp) new ViewModelProvider(activity, defaultViewModelProviderFactory2).get(C54822xWp.class);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String tradeSymbol;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(5);
        if (Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) "CEDEFI")) {
            tradeSymbol = this.OLrzqt;
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            tradeSymbol = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(this.gEmmrt)) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(this.OLrzqt)) == null) ? null : bizInstrumentValueOf.getTradeSymbol();
        }
        if (tradeSymbol != null) {
            wxq.setTitle(C33069mpW.copydefault(this, C35964oKf.Fragment.gLWkOL, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", tradeSymbol))));
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C36106oPm c36106oPmAEQbTJ = C36106oPm.AEQbTJ(getLayoutInflater(), constraintLayout, true);
        this.djBIcL = c36106oPmAEQbTJ;
        C36332oXw c36332oXw = null;
        if (c36106oPmAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c36106oPmAEQbTJ = null;
        }
        c36106oPmAEQbTJ.AEQbTJ.setLayoutManager(new LinearLayoutManager(getContext()));
        this.AEQbTJ = new C36332oXw(new Function0() { // from class: o.oXu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36329oXt.copydefault(this.OLrzqt);
            }
        });
        C36106oPm c36106oPm = this.djBIcL;
        if (c36106oPm == null) {
            Intrinsics.gEmmrt("");
            c36106oPm = null;
        }
        RecyclerView recyclerView = c36106oPm.AEQbTJ;
        C36332oXw c36332oXw2 = this.AEQbTJ;
        if (c36332oXw2 == null) {
            Intrinsics.gEmmrt("");
            c36332oXw2 = null;
        }
        recyclerView.setAdapter(c36332oXw2);
        C36332oXw c36332oXw3 = this.AEQbTJ;
        if (c36332oXw3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c36332oXw = c36332oXw3;
        }
        C33064mpR.OLrzqt(c36332oXw, this.EZpvd);
    }

    public static final Unit copydefault(C36329oXt c36329oXt) {
        c36329oXt.EZpvd();
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        if (Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) "CEDEFI")) {
            MarketCoinDetailViewModel marketCoinDetailViewModel = this.KWHzl;
            if (marketCoinDetailViewModel != null) {
                marketCoinDetailViewModel.KWHzl(new mQB(CoinDetailTabType.FEEDS.ordinal(), 0, null, null, null, 0, null, 124, null));
            }
            RxBus.AEQbTJ(new tWP("news", new android.os.Bundle()));
        } else {
            C54822xWp c54822xWp = this.AhwBna;
            if (c54822xWp != null) {
                c54822xWp.copydefault("news");
            }
            OLrzqt().AEQbTJ().postValue("news");
        }
        dismiss();
    }
}
