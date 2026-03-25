package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.widget.FullyLinearLayoutManager;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.ui.MarketDealFragment$onVisible$1;
import com.okinc.kline.ui.view.model.MarketDealItem;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pfS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38755pfS extends AbstractC32998moE implements InterfaceC37933pGb {
    public C38751pfO AhwBna;
    public AbstractC54531xLw DbNXlk;
    public C55173xeu EZpvd;
    public C39323pqD KWHzl;
    public xOA OLrzqt;
    public C55173xeu djBIcL;
    public InterfaceC58217yxC fetchVPNInfo;
    public C36032oMt gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public MarketCoinInfo values;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public int copydefault = ContextCompat.getColor(oKH.Companion.OLrzqt(), C32113mPz.ActionBar.iwGUEr);
    public C38358pVv isConnected = new C38358pVv();
    public java.lang.String AkhnZx = "BTC";
    public java.lang.String AYXKKw = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.AwvSrB;
    }

    public C38755pfS() {
        final Function0 function0 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C37851pDa.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.MarketDealFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.MarketDealFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.MarketDealFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.pfS$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pfS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C38755pfS AEQbTJ(@NotNull MarketCoinInfo marketCoinInfo) {
            Intrinsics.checkNotNullParameter(marketCoinInfo, "");
            C38755pfS c38755pfS = new C38755pfS();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("market_detail_info", marketCoinInfo);
            c38755pfS.setArguments(bundle);
            return c38755pfS;
        }
    }

    public final C37851pDa copydefault() {
        return (C37851pDa) this.valueOf.getValue();
    }

    @Override // o.InterfaceC37933pGb
    public void AhwBna() {
        FragmentActivity activity;
        if (getActivity() == null || !isVisibled() || (activity = getActivity()) == null) {
            return;
        }
        activity.runOnUiThread(new java.lang.Runnable() { // from class: o.pfT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C38755pfS.EZpvd(this.KWHzl);
            }
        });
    }

    public static final void EZpvd(C38755pfS c38755pfS) {
        C38751pfO c38751pfO = c38755pfS.AhwBna;
        if (c38751pfO != null) {
            c38751pfO.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        pXB.registerTradeFragmentTrack$default(pXB.EZpvd, this, C56524yIo.AEQbTJ(C38755pfS.class).valueOf(), new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.widget.LinearLayout linearLayout;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        android.widget.LinearLayout linearLayout2;
        Intrinsics.checkNotNullParameter(view, "");
        this.gEmmrt = C36032oMt.EZpvd(view);
        if (getActivity() != null && (getActivity() instanceof ActivityC38834pgs)) {
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            this.AhwBna = new C38751pfO((ActivityC38834pgs) activity, copydefault());
        } else if (getActivity() != null && (getActivity() instanceof ActivityC38952pjD)) {
            FragmentActivity activity2 = getActivity();
            Intrinsics.copydefault(activity2, "");
            this.AhwBna = new C38751pfO((ActivityC38952pjD) activity2, copydefault());
        }
        if (this.values == null) {
            android.os.Bundle arguments = getArguments();
            this.values = arguments != null ? (MarketCoinInfo) arguments.getParcelable("market_detail_info") : null;
        }
        C36032oMt c36032oMt = this.gEmmrt;
        if (c36032oMt != null && (linearLayout2 = c36032oMt.values) != null) {
            linearLayout2.setMinimumHeight(C33518mxv.EZpvd(getActivity(), C33129mqd.djBIcL(20)));
        }
        C36032oMt c36032oMt2 = this.gEmmrt;
        if (c36032oMt2 != null && (recyclerView3 = c36032oMt2.EZpvd) != null) {
            recyclerView3.setLayoutManager(new FullyLinearLayoutManager(getActivity()));
        }
        this.djBIcL = (C55173xeu) view.findViewById(C35964oKf.StateListAnimator.invokespecialRuDPQV);
        C55173xeu c55173xeu = (C55173xeu) view.findViewById(C35964oKf.StateListAnimator.invokespecialaKhcqp);
        this.EZpvd = c55173xeu;
        if (c55173xeu != null) {
            java.lang.String string = getString(C35964oKf.Fragment.xxhdY);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setTitle(string);
        }
        C55173xeu c55173xeu2 = this.djBIcL;
        if (c55173xeu2 != null) {
            java.lang.String string2 = getString(C35964oKf.Fragment.getConnectivityMgr);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c55173xeu2.setTitle(string2);
        }
        C55173xeu c55173xeu3 = this.EZpvd;
        if (c55173xeu3 != null) {
            java.lang.String string3 = getString(C35964oKf.Fragment.iOIMNp);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            c55173xeu3.setRetry(string3);
        }
        C55173xeu c55173xeu4 = this.EZpvd;
        if (c55173xeu4 != null) {
            c55173xeu4.setEmptyTypeImage(6);
        }
        C55173xeu c55173xeu5 = this.EZpvd;
        if (c55173xeu5 != null) {
            java.lang.String string4 = getString(C35964oKf.Fragment.sanrWj);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            c55173xeu5.setSubTitle((java.lang.CharSequence) string4);
        }
        C55173xeu c55173xeu6 = this.EZpvd;
        if (c55173xeu6 != null) {
            c55173xeu6.setRetryClickListener(new View.OnClickListener() { // from class: o.pgb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C38755pfS.KWHzl(this.AEQbTJ, view2);
                }
            });
        }
        C36032oMt c36032oMt3 = this.gEmmrt;
        if (c36032oMt3 != null && (recyclerView2 = c36032oMt3.EZpvd) != null) {
            recyclerView2.setAdapter(this.AhwBna);
        }
        C36032oMt c36032oMt4 = this.gEmmrt;
        if (c36032oMt4 != null && (recyclerView = c36032oMt4.EZpvd) != null) {
            recyclerView.setHasFixedSize(true);
        }
        C36032oMt c36032oMt5 = this.gEmmrt;
        if (c36032oMt5 == null || (linearLayout = c36032oMt5.valueOf) == null) {
            return;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.pfZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C38755pfS.EZpvd(this.OLrzqt, view2);
            }
        });
    }

    public static final void KWHzl(C38755pfS c38755pfS, android.view.View view) {
        c38755pfS.gEmmrt();
    }

    public static final void EZpvd(C38755pfS c38755pfS, android.view.View view) {
        java.util.List<MarketDealItem> listAEQbTJ;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.widget.ImageView imageView3;
        C36032oMt c36032oMt = c38755pfS.gEmmrt;
        boolean zIsEmpty = true;
        if (c36032oMt != null && (imageView3 = c36032oMt.AhwBna) != null && imageView3.getVisibility() == 0) {
            c38755pfS.gEmmrt();
            C32866mlf.onEvent$default("KLine_LastTrade_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.pfU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38755pfS.AEQbTJ((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            return;
        }
        C36032oMt c36032oMt2 = c38755pfS.gEmmrt;
        if (c36032oMt2 != null && (imageView2 = c36032oMt2.AhwBna) != null) {
            imageView2.setVisibility(0);
        }
        C36032oMt c36032oMt3 = c38755pfS.gEmmrt;
        if (c36032oMt3 != null && (imageView = c36032oMt3.AYXKKw) != null) {
            imageView.setVisibility(8);
        }
        c38755pfS.AYXKKw = "";
        C38751pfO c38751pfO = c38755pfS.AhwBna;
        if (c38751pfO != null) {
            c38751pfO.EZpvd();
        }
        c38755pfS.copydefault().AEQbTJ();
        C38751pfO c38751pfO2 = c38755pfS.AhwBna;
        if (c38751pfO2 != null) {
            c38751pfO2.KWHzl(c38755pfS.copydefault().OLrzqt());
        }
        C38751pfO c38751pfO3 = c38755pfS.AhwBna;
        if (c38751pfO3 != null && (listAEQbTJ = c38751pfO3.AEQbTJ()) != null) {
            zIsEmpty = listAEQbTJ.isEmpty();
        }
        c38755pfS.AEQbTJ(zIsEmpty);
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "setting", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        android.widget.LinearLayout linearLayout;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        C36032oMt c36032oMt = this.gEmmrt;
        if (c36032oMt != null && (imageView2 = c36032oMt.AhwBna) != null) {
            imageView2.setVisibility(0);
        }
        C36032oMt c36032oMt2 = this.gEmmrt;
        if (c36032oMt2 != null && (imageView = c36032oMt2.AYXKKw) != null) {
            imageView.setVisibility(8);
        }
        C55173xeu c55173xeu = this.EZpvd;
        if (c55173xeu != null) {
            c55173xeu.setVisibility(4);
        }
        C55173xeu c55173xeu2 = this.djBIcL;
        if (c55173xeu2 != null) {
            c55173xeu2.setVisibility(4);
        }
        C36032oMt c36032oMt3 = this.gEmmrt;
        if (c36032oMt3 != null && (linearLayout = c36032oMt3.values) != null) {
            linearLayout.setVisibility(0);
        }
        this.AYXKKw = "";
        C38751pfO c38751pfO = this.AhwBna;
        if (c38751pfO != null) {
            c38751pfO.EZpvd();
        }
        copydefault().AEQbTJ();
        copydefault().KWHzl().clear();
        copydefault().OLrzqt().clear();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        ActivityResultCaller activityResultCaller;
        RecyclerView recyclerView;
        super.onResume();
        rVN.copydefault(this);
        C36032oMt c36032oMt = this.gEmmrt;
        if (c36032oMt != null && (recyclerView = c36032oMt.EZpvd) != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
                recyclerView.setLayoutParams(layoutParams);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        if (this instanceof C55427xjj) {
            activityResultCaller = this;
        } else {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof C55427xjj)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (!(parentFragment instanceof C55427xjj)) {
                parentFragment = null;
            }
            activityResultCaller = (C55427xjj) parentFragment;
        }
        C55427xjj c55427xjj = (C55427xjj) activityResultCaller;
        if (c55427xjj != null) {
            c55427xjj.EZpvd(this);
        }
        FragmentActivity activity = getActivity();
        ActivityC38952pjD activityC38952pjD = activity instanceof ActivityC38952pjD ? (ActivityC38952pjD) activity : null;
        if (activityC38952pjD != null) {
            activityC38952pjD.EZpvd(this);
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        ActivityResultCaller activityResultCaller;
        RecyclerView recyclerView;
        super.onPause();
        C36032oMt c36032oMt = this.gEmmrt;
        if (c36032oMt != null && (recyclerView = c36032oMt.EZpvd) != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C55298xhM.dpInt$default(250, (android.content.Context) null, 1, (java.lang.Object) null);
                recyclerView.setLayoutParams(layoutParams);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        if (this instanceof C55427xjj) {
            activityResultCaller = this;
        } else {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof C55427xjj)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (!(parentFragment instanceof C55427xjj)) {
                parentFragment = null;
            }
            activityResultCaller = (C55427xjj) parentFragment;
        }
        C55427xjj c55427xjj = (C55427xjj) activityResultCaller;
        if (c55427xjj != null) {
            c55427xjj.copydefault((InterfaceC37933pGb) null);
        }
        FragmentActivity activity = getActivity();
        ActivityC38952pjD activityC38952pjD = activity instanceof ActivityC38952pjD ? (ActivityC38952pjD) activity : null;
        if (activityC38952pjD != null) {
            activityC38952pjD.copydefault((InterfaceC37933pGb) null);
        }
    }

    public final void AEQbTJ() {
        java.lang.String instrumentId;
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        java.lang.String instrumentId2;
        MarketCoinInfo marketCoinInfo = this.values;
        if (marketCoinInfo == null || (instrumentId2 = marketCoinInfo.getInstrumentId()) == null || !instrumentId2.equals(copydefault().EZpvd().getValue())) {
            CopyOnWriteArrayList<MarketDealItem> copyOnWriteArrayListCopydefault = copydefault().copydefault();
            if (copyOnWriteArrayListCopydefault != null) {
                copyOnWriteArrayListCopydefault.clear();
            }
            EZpvd();
            MutableLiveData<java.lang.String> mutableLiveDataEZpvd = copydefault().EZpvd();
            MarketCoinInfo marketCoinInfo2 = this.values;
            if (marketCoinInfo2 == null || (instrumentId = marketCoinInfo2.getInstrumentId()) == null) {
                instrumentId = "";
            }
            mutableLiveDataEZpvd.setValue(instrumentId);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AYXKKw)) {
            C36032oMt c36032oMt = this.gEmmrt;
            if (c36032oMt != null && (imageView2 = c36032oMt.AhwBna) != null) {
                imageView2.setVisibility(8);
            }
            C36032oMt c36032oMt2 = this.gEmmrt;
            if (c36032oMt2 != null && (imageView = c36032oMt2.AYXKKw) != null) {
                imageView.setVisibility(0);
            }
            if (!C33129mqd.KWHzl((java.util.Collection) copydefault().copydefault())) {
                C55173xeu c55173xeu = this.EZpvd;
                if (c55173xeu != null) {
                    c55173xeu.setVisibility(0);
                }
                C55173xeu c55173xeu2 = this.djBIcL;
                if (c55173xeu2 != null) {
                    c55173xeu2.setVisibility(4);
                }
                C36032oMt c36032oMt3 = this.gEmmrt;
                if (c36032oMt3 != null && (linearLayout = c36032oMt3.values) != null) {
                    linearLayout.setVisibility(0);
                }
                C38751pfO c38751pfO = this.AhwBna;
                if (c38751pfO != null) {
                    c38751pfO.EZpvd();
                    return;
                }
                return;
            }
            C55173xeu c55173xeu3 = this.EZpvd;
            if (c55173xeu3 != null) {
                c55173xeu3.setVisibility(4);
            }
            C55173xeu c55173xeu4 = this.djBIcL;
            if (c55173xeu4 != null) {
                c55173xeu4.setVisibility(4);
            }
            C36032oMt c36032oMt4 = this.gEmmrt;
            if (c36032oMt4 != null && (linearLayout2 = c36032oMt4.values) != null) {
                linearLayout2.setVisibility(0);
            }
            C38751pfO c38751pfO2 = this.AhwBna;
            if (c38751pfO2 != null) {
                c38751pfO2.EZpvd();
            }
            C38751pfO c38751pfO3 = this.AhwBna;
            if (c38751pfO3 != null) {
                c38751pfO3.copydefault();
            }
        }
    }

    private final void gEmmrt() {
        MarketCoinInfo marketCoinInfo = this.values;
        C39323pqD c39323pqD = null;
        C39323pqD c39323pqDOLrzqt = marketCoinInfo != null ? C39323pqD.Companion.OLrzqt(this.AkhnZx, marketCoinInfo, this.AYXKKw) : null;
        Intrinsics.copydefault(c39323pqDOLrzqt);
        this.KWHzl = c39323pqDOLrzqt;
        if (c39323pqDOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c39323pqDOLrzqt = null;
        }
        c39323pqDOLrzqt.EZpvd(new Function1() { // from class: o.pfW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38755pfS.AEQbTJ(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        C39323pqD c39323pqD2 = this.KWHzl;
        if (c39323pqD2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c39323pqD = c39323pqD2;
        }
        c39323pqD.show(getChildFragmentManager(), "com.okinc.kline.ui.dialog.KlineMarketDealFilterDialogFragment");
    }

    public static final Unit AEQbTJ(C38755pfS c38755pfS, java.lang.String str) {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            C36032oMt c36032oMt = c38755pfS.gEmmrt;
            if (c36032oMt != null && (imageView2 = c36032oMt.AhwBna) != null) {
                imageView2.setVisibility(8);
            }
            C36032oMt c36032oMt2 = c38755pfS.gEmmrt;
            if (c36032oMt2 != null && (imageView = c36032oMt2.AYXKKw) != null) {
                imageView.setVisibility(0);
            }
        }
        c38755pfS.AYXKKw = str;
        c38755pfS.OLrzqt();
        C32866mlf.onEvent$default("KLine_LastTrade_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.pfX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38755pfS.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "filter", false, 4, null);
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(boolean z) {
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        android.widget.LinearLayout linearLayout3;
        if (!z) {
            C55173xeu c55173xeu = this.EZpvd;
            if (c55173xeu != null) {
                c55173xeu.setVisibility(4);
            }
            C55173xeu c55173xeu2 = this.djBIcL;
            if (c55173xeu2 != null) {
                c55173xeu2.setVisibility(4);
            }
            C36032oMt c36032oMt = this.gEmmrt;
            if (c36032oMt == null || (linearLayout = c36032oMt.values) == null) {
                return;
            }
            linearLayout.setVisibility(0);
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AYXKKw)) {
            C55173xeu c55173xeu3 = this.EZpvd;
            if (c55173xeu3 != null) {
                c55173xeu3.setVisibility(0);
            }
            C55173xeu c55173xeu4 = this.djBIcL;
            if (c55173xeu4 != null) {
                c55173xeu4.setVisibility(4);
            }
            C36032oMt c36032oMt2 = this.gEmmrt;
            if (c36032oMt2 == null || (linearLayout3 = c36032oMt2.values) == null) {
                return;
            }
            linearLayout3.setVisibility(0);
            return;
        }
        C55173xeu c55173xeu5 = this.EZpvd;
        if (c55173xeu5 != null) {
            c55173xeu5.setVisibility(4);
        }
        C55173xeu c55173xeu6 = this.djBIcL;
        if (c55173xeu6 != null) {
            c55173xeu6.setVisibility(0);
        }
        C36032oMt c36032oMt3 = this.gEmmrt;
        if (c36032oMt3 == null || (linearLayout2 = c36032oMt3.values) == null) {
            return;
        }
        linearLayout2.setVisibility(8);
    }

    public final void OLrzqt() {
        java.util.List<MarketDealItem> listAEQbTJ;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (xOA xoa : copydefault().OLrzqt()) {
            if (C33129mqd.EZpvd(xoa.copydefault()).compareTo(C33129mqd.EZpvd(this.AYXKKw)) >= 0) {
                xOA xoa2 = new xOA();
                this.OLrzqt = xoa2;
                xoa2.EZpvd(xoa.EZpvd());
                xOA xoa3 = this.OLrzqt;
                xOA xoa4 = null;
                if (xoa3 == null) {
                    Intrinsics.gEmmrt("");
                    xoa3 = null;
                }
                xoa3.OLrzqt(xoa.copydefault());
                xOA xoa5 = this.OLrzqt;
                if (xoa5 == null) {
                    Intrinsics.gEmmrt("");
                    xoa5 = null;
                }
                xoa5.copydefault(xoa.OLrzqt());
                xOA xoa6 = this.OLrzqt;
                if (xoa6 == null) {
                    Intrinsics.gEmmrt("");
                    xoa6 = null;
                }
                xoa6.KWHzl(xoa.KWHzl());
                xOA xoa7 = this.OLrzqt;
                if (xoa7 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    xoa4 = xoa7;
                }
                arrayList.add(xoa4);
            }
        }
        C38751pfO c38751pfO = this.AhwBna;
        if (c38751pfO != null) {
            c38751pfO.EZpvd();
        }
        copydefault().AEQbTJ();
        copydefault().EZpvd(arrayList);
        C38751pfO c38751pfO2 = this.AhwBna;
        if (c38751pfO2 != null) {
            c38751pfO2.KWHzl(arrayList);
        }
        C38751pfO c38751pfO3 = this.AhwBna;
        if (c38751pfO3 == null || (listAEQbTJ = c38751pfO3.AEQbTJ()) == null) {
            return;
        }
        AEQbTJ(listAEQbTJ.isEmpty());
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (C39216poC.copydefault.copydefault()) {
            if (parentFragment instanceof C39014pkM) {
                this.values = ((C39014pkM) parentFragment).DbNXlk().hDKMBd();
            }
        } else if (parentFragment instanceof oYA) {
            this.values = ((oYA) parentFragment).QbewEr();
        }
        AEQbTJ();
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new MarketDealFragment$onVisible$1(this, null));
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        InterfaceC58217yxC interfaceC58217yxCAYXKKw = copydefault().AYXKKw();
        if (interfaceC58217yxCAYXKKw != null) {
            interfaceC58217yxCAYXKKw.dispose();
        }
        copydefault().AEQbTJ((InterfaceC58217yxC) null);
        InterfaceC58217yxC interfaceC58217yxC = this.fetchVPNInfo;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final void KWHzl() {
        java.lang.String instrumentId;
        MarketCoinInfo marketCoinInfo = this.values;
        if (marketCoinInfo == null || (instrumentId = marketCoinInfo.getInstrumentId()) == null) {
            return;
        }
        InterfaceC58217yxC interfaceC58217yxCAYXKKw = copydefault().AYXKKw();
        if (interfaceC58217yxCAYXKKw != null) {
            interfaceC58217yxCAYXKKw.dispose();
        }
        copydefault().AEQbTJ((InterfaceC58217yxC) null);
        C37851pDa c37851pDaCopydefault = copydefault();
        AbstractC58185ywX<java.util.List<xOA>> abstractC58185ywXKWHzl = this.isConnected.OLrzqt(instrumentId).KWHzl(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.pga
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38755pfS.OLrzqt(this.OLrzqt, (java.util.List) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.pfY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C38755pfS.OLrzqt(function1, obj);
            }
        }).KWHzl(yBP.AEQbTJ());
        final Function1 function12 = new Function1() { // from class: o.pgc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38755pfS.copydefault(this.EZpvd, (java.util.List) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.pgg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C38755pfS.copydefault(function12, obj);
            }
        }).KWHzl(C58266yxz.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.pgd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38755pfS.copydefault(this.copydefault, (java.util.ArrayList) obj);
            }
        };
        c37851pDaCopydefault.AEQbTJ(abstractC58185ywXKWHzl3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pfV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C38755pfS.djBIcL(function13, obj);
            }
        }));
    }

    public static final java.util.List OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List OLrzqt(C38755pfS c38755pfS, java.util.List list) {
        java.lang.String strDjBIcL;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC54531xLw abstractC54531xLw = c38755pfS.DbNXlk;
        if (abstractC54531xLw == null) {
            return null;
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
            interfaceC54581xNrOLrzqt.KWHzl();
        }
        MarketCoinInfo marketCoinInfo = c38755pfS.values;
        java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
        Intrinsics.copydefault((java.lang.Object) instrumentId);
        BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId);
        if (bizInstrumentValueOf == null) {
            return list;
        }
        MarketCoinInfo marketCoinInfo2 = c38755pfS.values;
        java.lang.String instrumentType = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null;
        if (Intrinsics.EZpvd((java.lang.Object) instrumentType, (java.lang.Object) "MARGIN") || Intrinsics.EZpvd((java.lang.Object) instrumentType, (java.lang.Object) "SPOT") || (strDjBIcL = abstractC54531xLw.EZpvd(bizInstrumentValueOf)) == null || strDjBIcL.length() == 0) {
            strDjBIcL = abstractC54531xLw.djBIcL(bizInstrumentValueOf);
        }
        C36032oMt c36032oMt = c38755pfS.gEmmrt;
        if (c36032oMt != null && (textView2 = c36032oMt.KWHzl) != null) {
            textView2.setText(C59449zhJ.replace$default(c38755pfS.getResources().getText(C35964oKf.Fragment.hbZCHz).toString(), "USDT", strDjBIcL == null ? "" : strDjBIcL, false, 4, (java.lang.Object) null));
        }
        c38755pfS.AkhnZx = C33129mqd.gEmmrt(abstractC54531xLw.OLrzqt(bizInstrumentValueOf));
        C36032oMt c36032oMt2 = c38755pfS.gEmmrt;
        if (c36032oMt2 == null || (textView = c36032oMt2.AEQbTJ) == null) {
            return list;
        }
        textView.setText(C59449zhJ.replace$default(c38755pfS.getResources().getText(C35964oKf.Fragment.GQzpsZ).toString(), "BTC", C33129mqd.gEmmrt(abstractC54531xLw.OLrzqt(bizInstrumentValueOf)), false, 4, (java.lang.Object) null));
        return list;
    }

    public static final java.util.ArrayList copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final java.util.ArrayList copydefault(C38755pfS c38755pfS, java.util.List list) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        AbstractC54531xLw abstractC54531xLw = c38755pfS.DbNXlk;
        if (abstractC54531xLw != null) {
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
                interfaceC54581xNrOLrzqt.KWHzl();
            }
            MarketCoinInfo marketCoinInfo = c38755pfS.values;
            java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
            Intrinsics.copydefault((java.lang.Object) instrumentId);
            BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId);
            java.lang.String instFamily = bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstFamily() : null;
            Intrinsics.copydefault((java.lang.Object) instFamily);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                xOA xoa = (xOA) it.next();
                xoa.OLrzqt(C33129mqd.OLrzqt((java.lang.Object) AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLw, instFamily, null, 2, null).AhwBna(xoa.EZpvd()).copydefault(xoa.copydefault())));
                xoa.EZpvd(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(xoa.EZpvd()).djBIcL().AEQbTJ(true), false, 1, null));
            }
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) c38755pfS.AYXKKw)) {
                arrayList.addAll(list);
            } else {
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    xOA xoa2 = (xOA) it2.next();
                    if (C33129mqd.EZpvd(xoa2.copydefault()).compareTo(C33129mqd.EZpvd(c38755pfS.AYXKKw)) >= 0) {
                        arrayList.add(xoa2);
                    }
                }
            }
            c38755pfS.copydefault().AEQbTJ((java.util.List<xOA>) list);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) c38755pfS.AYXKKw)) {
                c38755pfS.copydefault().EZpvd(arrayList);
            }
        }
        return arrayList;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C38755pfS c38755pfS, java.util.ArrayList arrayList) {
        java.util.List<MarketDealItem> listAEQbTJ;
        C38751pfO c38751pfO = c38755pfS.AhwBna;
        if (c38751pfO != null) {
            Intrinsics.copydefault(arrayList);
            c38751pfO.KWHzl(arrayList);
        }
        C38751pfO c38751pfO2 = c38755pfS.AhwBna;
        if (c38751pfO2 != null && (listAEQbTJ = c38751pfO2.AEQbTJ()) != null) {
            c38755pfS.AEQbTJ(listAEQbTJ.isEmpty());
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c38755pfS, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        InterfaceC58217yxC interfaceC58217yxCAYXKKw = copydefault().AYXKKw();
        if (interfaceC58217yxCAYXKKw != null) {
            interfaceC58217yxCAYXKKw.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.fetchVPNInfo;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.gEmmrt = null;
    }
}
