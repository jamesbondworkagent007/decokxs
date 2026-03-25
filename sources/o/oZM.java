package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.camera.video.AudioStats;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.data.KlineCoinInfo;
import com.okinc.kline.ui.CoinInfoChartFragment$createInstListCupTicker$1;
import com.okinc.kline.ui.CoinInfoChartFragment$startWsWork$1;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.uilab.stateful.StatefulView;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.net.BizApiService;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C32113mPz;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes23.dex */
public final class oZM extends AbstractC32996moC {
    public android.widget.ImageView AEQbTJ;
    public final InterfaceC56387yDm AuCTel;
    public TickersData DbNXlk;
    public java.lang.String EZpvd;
    public TickersData KWHzl;
    public android.widget.TextView OLrzqt;
    public android.widget.TextView copydefault;
    public java.util.List<? extends java.util.List<java.lang.String>> djBIcL;
    public Job gEmmrt;
    public AbstractC36020oMh isConnected;
    public final int values = C35964oKf.Application.fJNWhG;
    public final java.util.Map<java.lang.String, java.lang.String> valueOf = C56424yEw.gEmmrt(C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.getValue), "1m"), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.GQzpsZsQwTVT), "5m"), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.getSerial), "1H"), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.hKJZrr), "2H"), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.fQQVvf), "1D"), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.GcnicV), "1W"));
    public final java.util.Map<java.lang.String, java.lang.String> AkhnZx = C56424yEw.gEmmrt(C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.getValue), "60"), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.GQzpsZsQwTVT), "288"), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.getSerial), "168"), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.hKJZrr), "360"), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.fQQVvf), "365"), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.GcnicV), "130"));
    public final java.util.Map<java.lang.String, java.lang.String> fetchVPNInfo = C56424yEw.gEmmrt(C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.getValue), "HH:mm"), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.GQzpsZsQwTVT), "HH:mm"), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.getSerial), "MM/dd HH:mm"), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.hKJZrr), "MM/dd HH:mm"), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.fQQVvf), "YYYY/MM/dd"), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.GcnicV), "YYYY/MM/dd"));
    public java.lang.String AYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.GcnicV);
    public final int AhwBna = 5;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final ResponseData KWHzl(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.values;
    }

    public oZM() {
        final Function0 function0 = null;
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C37858pDh.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.CoinInfoChartFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.CoinInfoChartFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.CoinInfoChartFragment$special$$inlined$activityViewModels$default$3
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

    private final C37858pDh KWHzl() {
        return (C37858pDh) this.AuCTel.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.OLrzqt = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.OqhRBMiKdSzF);
        this.AEQbTJ = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.isInitInProgress);
        this.copydefault = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.sVaiLC);
        this.isConnected = (AbstractC36020oMh) DataBindingUtil.bind(view);
        KWHzl().ejfBZ().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.oZT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oZM.AEQbTJ(this.copydefault, (kotlin.Pair) obj);
            }
        }));
        KWHzl().fJNWhG().observe(this, new Application(new Function1() { // from class: o.oZP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oZM.copydefault(this.AEQbTJ, (KlineCoinInfo) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(final oZM ozm, kotlin.Pair pair) {
        C39786pys c39786pys;
        final java.lang.String strReplace$default = null;
        java.lang.String str = pair != null ? (java.lang.String) pair.getSecond() : null;
        if (str != null) {
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (upperCase != null) {
                strReplace$default = C59449zhJ.replace$default(upperCase, "_", "-", false, 4, (java.lang.Object) null);
            }
        }
        Intrinsics.copydefault((java.lang.Object) strReplace$default);
        ozm.EZpvd = (java.lang.String) pair.getFirst();
        ozm.OLrzqt();
        ozm.EZpvd(ozm.AEQbTJ(strReplace$default));
        requestCoinCandles$default(ozm, strReplace$default, ozm.valueOf.get(ozm.AYXKKw), ozm.AkhnZx.get(ozm.AYXKKw), false, 8, null);
        AbstractC36020oMh abstractC36020oMh = ozm.isConnected;
        if (abstractC36020oMh != null && (c39786pys = abstractC36020oMh.values) != null) {
            java.util.Map<java.lang.String, java.lang.String> map = ozm.valueOf;
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            java.util.Iterator<Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getKey());
            }
            c39786pys.setData(arrayList, ozm.AhwBna, new Function1() { // from class: o.oZK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oZM.EZpvd(this.KWHzl, strReplace$default, (java.lang.String) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(oZM ozm, java.lang.String str, java.lang.String str2) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str2, "");
        ozm.AYXKKw = str2;
        AbstractC36020oMh abstractC36020oMh = ozm.isConnected;
        if (abstractC36020oMh != null && (textView = abstractC36020oMh.AhwBna) != null) {
            textView.setText("");
        }
        ozm.EZpvd(str, ozm.valueOf.get(str2), ozm.AkhnZx.get(str2), Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) C33070mpX.AYXKKw(C35964oKf.Fragment.GcnicV)));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(oZM ozm, KlineCoinInfo klineCoinInfo) {
        if (klineCoinInfo != null) {
            android.widget.ImageView imageView = ozm.AEQbTJ;
            if (imageView != null) {
                C33054mpH.AEQbTJ(imageView, klineCoinInfo.getIcon());
            }
            android.widget.TextView textView = ozm.copydefault;
            if (textView != null) {
                textView.setText(klineCoinInfo.getFullName());
            }
            android.widget.TextView textView2 = ozm.OLrzqt;
            if (textView2 != null) {
                textView2.setText(klineCoinInfo.getProject());
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        OLrzqt();
    }

    public final void OLrzqt() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.EZpvd)) {
            Job job = this.gEmmrt;
            if (job == null || !job.isActive()) {
                Job job2 = this.gEmmrt;
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
                }
                this.gEmmrt = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CoinInfoChartFragment$startWsWork$1(this, null), 3, null);
            }
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Job job = this.gEmmrt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        java.util.List listSplit$default = str != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str) || listSplit$default == null || listSplit$default.size() <= 1) {
            return "";
        }
        return java.lang.String.valueOf(listSplit$default != null ? (java.lang.String) listSplit$default.get(0) : null);
    }

    private final void EZpvd(java.lang.String str) {
        C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(OLrzqt(str), this), new Function1() { // from class: o.oZN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oZM.OLrzqt(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.oZQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oZM.EZpvd(this.EZpvd, (TickersData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(oZM ozm, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        ozm.getTAG();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(oZM ozm, TickersData tickersData) {
        Intrinsics.checkNotNullParameter(tickersData, "");
        ozm.DbNXlk = tickersData;
        ozm.AEQbTJ();
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<TickersData> OLrzqt(java.lang.String str) {
        AbstractC58185ywX<ResponseData<java.util.List<TickersData>>> abstractC58185ywXKWHzl = ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).batchMarketCupTickers(str).KWHzl(yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.oZS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oZM.KWHzl((ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.oZY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return oZM.KWHzl(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(abstractC58185ywXAEQbTJ, (Function1) null, 1, (java.lang.Object) null);
        final Function1 function12 = new Function1() { // from class: o.oZW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oZM.copydefault((java.util.List) obj);
            }
        };
        AbstractC58185ywX<TickersData> abstractC58185ywXAEQbTJ2 = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.oZU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return oZM.EZpvd(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final ResponseData KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final TickersData EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (TickersData) function1.invoke(obj);
    }

    public static final TickersData copydefault(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return (TickersData) list.get(0);
    }

    public static /* synthetic */ void requestCoinCandles$default(oZM ozm, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        ozm.EZpvd(str, str2, str3, z);
    }

    public final void EZpvd(java.lang.String str, final java.lang.String str2, java.lang.String str3, final boolean z) {
        C55237xgE c55237xgE;
        xOW newProxyInstance;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        C32866mlf.onEvent$default("Token_Mid_SelectTime_Click", (TrackChannel[]) null, new Function1() { // from class: o.pab
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oZM.KWHzl(str2, z, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        java.util.HashMap map = new java.util.HashMap();
        map.put("bar", C33129mqd.gEmmrt(str2));
        map.put("limit", C33129mqd.gEmmrt(str3));
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        ValuationCurrencyData value = (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null) ? null : mutableLiveDataBG_.getValue();
        AbstractC36020oMh abstractC36020oMh = this.isConnected;
        if (abstractC36020oMh != null && (c55237xgE = abstractC36020oMh.copydefault) != null) {
            c55237xgE.setStatus(StatefulView.Status.Loading);
        }
        if (value != null) {
            C33024moe.copydefault(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).getCoinTrendCandles(AEQbTJ(str), value.getIsoCode(), value.isPremium(), C33129mqd.gEmmrt(str2), C33129mqd.AhwBna(str3)), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.oZL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oZM.OLrzqt((java.lang.Throwable) obj);
                }
            }, (Function0<Unit>) new Function0() { // from class: o.oZO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oZM.AhwBna(this.KWHzl);
                }
            }, new Function1() { // from class: o.oZR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oZM.OLrzqt(this.OLrzqt, (ResponseData) obj);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(java.lang.String str, boolean z, oZM ozm, EventParamsList eventParamsList) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        try {
            Result.Application application = Result.Companion;
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != 1587) {
                    str2 = "1m";
                    if (iHashCode == 1591) {
                        if (!str.equals("1H")) {
                        }
                        if (z) {
                        }
                        EventParamsList.put$default(eventParamsList, "timeframe", str2, false, 4, null);
                        java.lang.String str3 = ozm.EZpvd;
                        EventParamsList.put$default(eventParamsList, "token", str3 == null ? "" : str3, false, 4, null);
                        Result.m7377constructorimpl(Unit.INSTANCE);
                    } else if (iHashCode == 1628) {
                        if (str.equals("1m")) {
                            str2 = "1h";
                        }
                        if (z) {
                        }
                        EventParamsList.put$default(eventParamsList, "timeframe", str2, false, 4, null);
                        java.lang.String str32 = ozm.EZpvd;
                        EventParamsList.put$default(eventParamsList, "token", str32 == null ? "" : str32, false, 4, null);
                        Result.m7377constructorimpl(Unit.INSTANCE);
                    } else if (iHashCode != 1752) {
                        str2 = (iHashCode == 50608 && str.equals("30m")) ? "1w" : "";
                        if (z) {
                            str2 = "all";
                        }
                        EventParamsList.put$default(eventParamsList, "timeframe", str2, false, 4, null);
                        java.lang.String str322 = ozm.EZpvd;
                        EventParamsList.put$default(eventParamsList, "token", str322 == null ? "" : str322, false, 4, null);
                        Result.m7377constructorimpl(Unit.INSTANCE);
                    } else {
                        if (str.equals("5m")) {
                            str2 = "24h";
                        }
                        if (z) {
                        }
                        EventParamsList.put$default(eventParamsList, "timeframe", str2, false, 4, null);
                        java.lang.String str3222 = ozm.EZpvd;
                        EventParamsList.put$default(eventParamsList, "token", str3222 == null ? "" : str3222, false, 4, null);
                        Result.m7377constructorimpl(Unit.INSTANCE);
                    }
                } else {
                    if (str.equals("1D")) {
                        str2 = "1y";
                    }
                    if (z) {
                    }
                    EventParamsList.put$default(eventParamsList, "timeframe", str2, false, 4, null);
                    java.lang.String str32222 = ozm.EZpvd;
                    EventParamsList.put$default(eventParamsList, "token", str32222 == null ? "" : str32222, false, 4, null);
                    Result.m7377constructorimpl(Unit.INSTANCE);
                }
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C55326xho.toast$default(th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(oZM ozm) {
        C55237xgE c55237xgE;
        AbstractC36020oMh abstractC36020oMh = ozm.isConnected;
        if (abstractC36020oMh != null && (c55237xgE = abstractC36020oMh.copydefault) != null) {
            c55237xgE.setStatus(StatefulView.Status.Content);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.util.List<? extends java.util.List<java.lang.String>> list) {
        AbstractC36020oMh abstractC36020oMh;
        C39786pys c39786pys;
        C39790pyw c39790pyw;
        C39790pyw c39790pyw2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List list2 = (java.util.List) it.next();
            if (list2.size() >= 2) {
                arrayList.add(list2.get(0));
                arrayList2.add(list2.get(1));
            }
        }
        AbstractC36020oMh abstractC36020oMh2 = this.isConnected;
        if (abstractC36020oMh2 != null && (c39790pyw2 = abstractC36020oMh2.KWHzl) != null) {
            C39790pyw.setData$default(c39790pyw2, arrayList, arrayList2, new Function0() { // from class: o.oZX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oZM.AYXKKw(this.OLrzqt);
                }
            }, new Function1() { // from class: o.oZV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oZM.AEQbTJ(this.KWHzl, (Entry) obj);
                }
            }, null, 16, null);
        }
        AbstractC36020oMh abstractC36020oMh3 = this.isConnected;
        if (abstractC36020oMh3 != null && (c39790pyw = abstractC36020oMh3.KWHzl) != null) {
            c39790pyw.setOnChartValueSelectedListener(new Activity());
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList) && (abstractC36020oMh = this.isConnected) != null && (c39786pys = abstractC36020oMh.values) != null) {
            c39786pys.setVisibility(0);
        }
        if (!list.isEmpty()) {
            AEQbTJ();
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit AYXKKw(oZM ozm) {
        ozm.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(oZM ozm, Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        ozm.AEQbTJ((int) entry.getX());
        return Unit.INSTANCE;
    }

    public static final class Activity implements OnChartValueSelectedListener {
        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
        }

        public Activity() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            if (entry != null) {
                oZM.this.AEQbTJ((int) entry.getX());
            }
        }
    }

    public final void AEQbTJ() {
        TickersData tickersData;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.EZpvd) && (tickersData = this.KWHzl) != null && interfaceC54581xNrCopydefault != null) {
            if (tickersData != null) {
                AEQbTJ(tickersData);
            }
        } else {
            TickersData tickersData2 = this.DbNXlk;
            if (tickersData2 != null) {
                AEQbTJ(tickersData2);
            }
        }
    }

    public final void AEQbTJ(TickersData tickersData) {
        xMW xmwKWHzl;
        xMW xmwKWHzl2;
        android.widget.TextView textView;
        AbstractC36020oMh abstractC36020oMh = this.isConnected;
        if (abstractC36020oMh != null && (textView = abstractC36020oMh.AhwBna) != null) {
            textView.setVisibility(4);
        }
        java.lang.String last = tickersData.getLast();
        kotlin.Pair pairCalApplies$default = C55692xoj.calApplies$default(C55692xoj.KWHzl, tickersData.getLast(), tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8(), false, 16, null);
        InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
        java.lang.String strAhwBna = null;
        java.lang.String strSubS$default = C33129mqd.subS$default(tickersData.getLast(), interfaceC43033rhe != null ? interfaceC43033rhe.copydefault(tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8()) : null, null, null, null, 14, null);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd((interfaceC54581xNrOLrzqt == null || (xmwKWHzl2 = interfaceC54581xNrOLrzqt.KWHzl()) == null) ? null : xmwKWHzl2.AhwBna(C33129mqd.gEmmrt(last)));
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (xmwKWHzl = interfaceC54581xNrOLrzqt2.KWHzl()) != null) {
            strAhwBna = xmwKWHzl.AhwBna(C33129mqd.gEmmrt(strSubS$default));
        }
        OLrzqt(bigDecimalEZpvd, C33129mqd.EZpvd(strAhwBna), C33129mqd.EZpvd(pairCalApplies$default.getFirst()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(int i) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        java.util.List<? extends java.util.List<java.lang.String>> list = this.djBIcL;
        if (list != null) {
            java.util.List<java.lang.String> list2 = list.get(i);
            if (list2.size() >= 2) {
                AbstractC36020oMh abstractC36020oMh = this.isConnected;
                if (abstractC36020oMh != null && (textView4 = abstractC36020oMh.AhwBna) != null) {
                    textView4.setVisibility(0);
                }
                AbstractC36020oMh abstractC36020oMh2 = this.isConnected;
                if (abstractC36020oMh2 != null && (textView3 = abstractC36020oMh2.AhwBna) != null) {
                    textView3.setText(copydefault(list2.get(0)));
                }
                getTAG();
                Objects.toString(list2);
                getTAG();
                copydefault(list2.get(0));
                android.content.Context context = getContext();
                ViewGroup.LayoutParams layoutParams = null;
                if (context != null && C55296xhK.OLrzqt(context)) {
                    AbstractC36020oMh abstractC36020oMh3 = this.isConnected;
                    if (abstractC36020oMh3 != null && (textView2 = abstractC36020oMh3.AhwBna) != null) {
                        layoutParams = textView2.getLayoutParams();
                    }
                    Intrinsics.copydefault(layoutParams, "");
                    ((LinearLayout.LayoutParams) layoutParams).setMargins(0, 0, AEQbTJ(i, list.size()), 0);
                } else {
                    AbstractC36020oMh abstractC36020oMh4 = this.isConnected;
                    if (abstractC36020oMh4 != null && (textView = abstractC36020oMh4.AhwBna) != null) {
                        layoutParams = textView.getLayoutParams();
                    }
                    Intrinsics.copydefault(layoutParams, "");
                    ((LinearLayout.LayoutParams) layoutParams).setMargins(AEQbTJ(i, list.size()), 0, 0, 0);
                }
                if (i >= 1) {
                    BigDecimal bigDecimal = new BigDecimal(list.get(i - 1).get(1));
                    BigDecimal bigDecimalSubtract = new BigDecimal(list2.get(1)).subtract(bigDecimal);
                    BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimal, 4, 4);
                    BigDecimal bigDecimal2 = new BigDecimal(list2.get(1));
                    Intrinsics.copydefault(bigDecimalSubtract);
                    Intrinsics.copydefault(bigDecimalDivide);
                    OLrzqt(bigDecimal2, bigDecimalSubtract, bigDecimalDivide);
                    return;
                }
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(0L);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "");
                OLrzqt(new BigDecimal(list2.get(1)), bigDecimalValueOf, bigDecimalValueOf2);
            }
        }
    }

    public final void OLrzqt(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        android.widget.TextView textView;
        java.lang.String downToFixed$default;
        android.widget.TextView textView2;
        java.lang.String downToFixed$default2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        java.lang.String downToFixed$default3;
        android.widget.TextView textView6;
        boolean z = bigDecimal.compareTo(new BigDecimal(1)) < 0;
        java.lang.String strRJOkX = ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).RJOkX();
        int iCompareTo = bigDecimal2.compareTo(new BigDecimal(0));
        java.lang.String str = Marker.ANY_NON_NULL_MARKER;
        java.lang.String str2 = iCompareTo > 0 ? Marker.ANY_NON_NULL_MARKER : bigDecimal2.compareTo(new BigDecimal(0)) < 0 ? "-" : "";
        int iAEQbTJ = C54573xNj.copydefault.AEQbTJ(C33129mqd.EZpvd(bigDecimal).doubleValue());
        if (z) {
            AbstractC36020oMh abstractC36020oMh = this.isConnected;
            if (abstractC36020oMh != null && (textView6 = abstractC36020oMh.AYXKKw) != null) {
                textView6.setText(strRJOkX + ((java.lang.Object) pTB.formatDownToFixed$default(C33129mqd.EZpvd(bigDecimal), iAEQbTJ, null, 2, null)));
            }
            AbstractC36020oMh abstractC36020oMh2 = this.isConnected;
            if (abstractC36020oMh2 != null && (textView5 = abstractC36020oMh2.EZpvd) != null) {
                BigDecimal bigDecimalAbs = C33129mqd.EZpvd(bigDecimal2).abs();
                if (C33129mqd.AEQbTJ(bigDecimal2) == AudioStats.AUDIO_AMPLITUDE_NONE) {
                    Intrinsics.copydefault(bigDecimalAbs);
                    downToFixed$default3 = pTB.formatDownToFixed$default(bigDecimalAbs, 0, null, 2, null);
                } else {
                    Intrinsics.copydefault(bigDecimalAbs);
                    downToFixed$default3 = pTB.formatDownToFixed$default(bigDecimalAbs, iAEQbTJ, null, 2, null);
                }
                textView5.setText(str2 + strRJOkX + ((java.lang.Object) downToFixed$default3));
            }
        } else {
            AbstractC36020oMh abstractC36020oMh3 = this.isConnected;
            if (abstractC36020oMh3 != null && (textView2 = abstractC36020oMh3.AYXKKw) != null) {
                if (Intrinsics.EZpvd(bigDecimal, new BigDecimal(0))) {
                    downToFixed$default2 = pTB.formatDownToFixed$default(C33129mqd.EZpvd(bigDecimal), 2, null, 2, null);
                } else {
                    downToFixed$default2 = pTB.formatDownToFixed$default(C33129mqd.EZpvd(bigDecimal), iAEQbTJ, null, 2, null);
                }
                textView2.setText(strRJOkX + downToFixed$default2);
            }
            AbstractC36020oMh abstractC36020oMh4 = this.isConnected;
            if (abstractC36020oMh4 != null && (textView = abstractC36020oMh4.EZpvd) != null) {
                pTF ptf = pTF.KWHzl;
                if (Intrinsics.EZpvd(bigDecimal2.abs(), new BigDecimal(0))) {
                    downToFixed$default = pTB.formatDownToFixed$default(C33129mqd.EZpvd(bigDecimal2.abs()), 0, null, 2, null);
                } else {
                    downToFixed$default = pTB.formatDownToFixed$default(C33129mqd.EZpvd(bigDecimal2.abs()), iAEQbTJ, null, 2, null);
                }
                textView.setText(ptf.AEQbTJ(str2 + strRJOkX + downToFixed$default));
            }
        }
        if (bigDecimal3.compareTo(new BigDecimal(0)) <= 0) {
            str = "";
        }
        AbstractC36020oMh abstractC36020oMh5 = this.isConnected;
        if (abstractC36020oMh5 != null && (textView4 = abstractC36020oMh5.AEQbTJ) != null) {
            textView4.setText(pTF.KWHzl.AEQbTJ(str + pTB.formatPercent$default(C33129mqd.EZpvd(bigDecimal3), 0, null, 3, null)));
        }
        AbstractC36020oMh abstractC36020oMh6 = this.isConnected;
        android.widget.TextView textView7 = abstractC36020oMh6 != null ? abstractC36020oMh6.EZpvd : null;
        Intrinsics.copydefault(textView7);
        KWHzl(textView7, bigDecimal2);
        AbstractC36020oMh abstractC36020oMh7 = this.isConnected;
        android.widget.TextView textView8 = abstractC36020oMh7 != null ? abstractC36020oMh7.AEQbTJ : null;
        Intrinsics.copydefault(textView8);
        KWHzl(textView8, bigDecimal3);
        AbstractC36020oMh abstractC36020oMh8 = this.isConnected;
        if (abstractC36020oMh8 == null || (textView3 = abstractC36020oMh8.AEQbTJ) == null) {
            return;
        }
        textView3.getTextColors();
    }

    public final int AEQbTJ(int i, int i2) {
        int width;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.text.TextPaint paint;
        android.widget.TextView textView4;
        int iAEQbTJ = C33570myu.AEQbTJ();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iEZpvd = C33052mpF.EZpvd(6.0f, contextRequireContext);
        AbstractC36020oMh abstractC36020oMh = this.isConnected;
        if (abstractC36020oMh == null || (textView2 = abstractC36020oMh.AhwBna) == null || textView2.getWidth() != 0) {
            AbstractC36020oMh abstractC36020oMh2 = this.isConnected;
            width = (abstractC36020oMh2 == null || (textView = abstractC36020oMh2.AhwBna) == null) ? 0 : textView.getWidth();
        } else {
            AbstractC36020oMh abstractC36020oMh3 = this.isConnected;
            java.lang.Object objValueOf = null;
            if (abstractC36020oMh3 != null && (textView3 = abstractC36020oMh3.AhwBna) != null && (paint = textView3.getPaint()) != null) {
                AbstractC36020oMh abstractC36020oMh4 = this.isConnected;
                if (abstractC36020oMh4 != null && (textView4 = abstractC36020oMh4.AhwBna) != null) {
                    objValueOf = textView4.getText();
                }
                objValueOf = java.lang.Float.valueOf(paint.measureText(java.lang.String.valueOf(objValueOf)));
            }
            width = C33129mqd.AhwBna(objValueOf);
        }
        int i3 = width + 1;
        int i4 = i3 / 2;
        int i5 = ((iAEQbTJ - (iEZpvd * 2)) * i) / i2;
        int i6 = (i5 - i4) + iEZpvd;
        android.content.Context context = getContext();
        if (context != null && C55296xhK.OLrzqt(context)) {
            i6 = ((iAEQbTJ - iEZpvd) - i5) - i4;
        }
        if (i6 < 0) {
            return 0;
        }
        int i7 = iAEQbTJ - i3;
        return i6 > i7 ? i7 - 10 : C56548yJl.valueOf(i7 - 10, i6);
    }

    public final java.lang.String copydefault(java.lang.String str) {
        Date date;
        try {
            date = new Date(java.lang.Long.parseLong(str));
        } catch (java.lang.Exception unused) {
            date = null;
        }
        getTAG();
        Objects.toString(date);
        if (date == null) {
            try {
                date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").parse(str);
            } catch (java.lang.Exception unused2) {
            }
        }
        getTAG();
        Objects.toString(date);
        if (date == null) {
            return "";
        }
        java.lang.String str2 = new SimpleDateFormat(this.fetchVPNInfo.get(this.AYXKKw)).format(date);
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public final void KWHzl(android.widget.TextView textView, BigDecimal bigDecimal) {
        int color = getResources().getColor(C32113mPz.ActionBar.zLjUOn);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iCopydefault = C33508mxl.copydefault(contextRequireContext);
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        int iAEQbTJ = C33508mxl.AEQbTJ(contextRequireContext2);
        if (bigDecimal.compareTo(new BigDecimal(0)) > 0) {
            color = iCopydefault;
        } else if (bigDecimal.compareTo(new BigDecimal(0)) < 0) {
            color = iAEQbTJ;
        }
        textView.setTextColor(color);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C39790pyw c39790pyw;
        super.onDestroyView();
        AbstractC36020oMh abstractC36020oMh = this.isConnected;
        if (abstractC36020oMh != null && (c39790pyw = abstractC36020oMh.KWHzl) != null) {
            c39790pyw.clear();
        }
        oLF.EZpvd.AEQbTJ();
    }

    public final Flow<java.util.List<TickersData>> KWHzl(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return FlowKt.callbackFlow(new CoinInfoChartFragment$createInstListCupTicker$1(list, null));
    }

    public static final Unit OLrzqt(oZM ozm, ResponseData responseData) {
        java.util.List<? extends java.util.List<java.lang.String>> arrayList;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.List list = (java.util.List) responseData.getData();
            ozm.djBIcL = list != null ? C56405yEd.hDKMBd(list) : null;
            java.util.List list2 = (java.util.List) responseData.getData();
            if (list2 == null || (arrayList = C56405yEd.hDKMBd(list2)) == null) {
                arrayList = new java.util.ArrayList<>();
            }
            ozm.AEQbTJ(arrayList);
            Unit unit = Unit.INSTANCE;
        } else {
            C55326xho.toast$default(responseData.getMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }
}
