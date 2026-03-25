package o;

import com.okinc.kline.features.settings.main.data.datasource.ChartDisplayType;
import com.okinc.kline.features.settings.main.data.datasource.ChartHeightType;
import com.okinc.kline.features.settings.main.data.datasource.TopDisplayType;
import com.okinc.kline.features.settings.main.data.datasource.TradingDisplayType;
import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C32392mcI;
import o.C35964oKf;
import o.C52761wXj;
import o.oSJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oSS extends AbstractC49400uno<SettingEntryPoint, java.util.List<? extends oSJ>> {
    public final InterfaceC56387yDm AEQbTJ;
    public final oSQ EZpvd;
    public final CoroutineDispatcher OLrzqt;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TopDisplayType.values().length];
            try {
                iArr[TopDisplayType.Landscape.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TopDisplayType.Indicators.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TopDisplayType.Drawing.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TopDisplayType.Formula.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[TopDisplayType.Compare.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[TopDisplayType.Tutorial.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[TopDisplayType.Date.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[TopDisplayType.Settings.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[TradingDisplayType.values().length];
            try {
                iArr2[TradingDisplayType.OpenOrders.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[TradingDisplayType.HistoricalOrder.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[TradingDisplayType.AverageCost.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[TradingDisplayType.CostOfPositions.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[TradingDisplayType.BreakEvenPrice.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[TradingDisplayType.LipPrice.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            copydefault = iArr2;
            int[] iArr3 = new int[ChartDisplayType.values().length];
            try {
                iArr3[ChartDisplayType.Axis.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr3[ChartDisplayType.CountDown.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr3[ChartDisplayType.PriceAlerts.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr3[ChartDisplayType.EconomicCalendar.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            AEQbTJ = iArr3;
            int[] iArr4 = new int[ChartHeightType.values().length];
            try {
                iArr4[ChartHeightType.ChartHeight.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            KWHzl = iArr4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public oSS(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull oSQ osq) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(osq, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = osq;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.oSR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oSS.copydefault();
            }
        });
    }

    public static final ChartViewOutSideConfig copydefault() {
        return C36246oUr.copydefault().zLjUOn();
    }

    public final ChartViewOutSideConfig OLrzqt() {
        return (ChartViewOutSideConfig) this.AEQbTJ.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull SettingEntryPoint settingEntryPoint, @NotNull Continuation<? super java.util.List<? extends oSJ>> continuation) {
        oSM<java.util.List<TopDisplayType>, java.util.List<TradingDisplayType>, java.util.List<ChartDisplayType>, java.util.List<ChartHeightType>> osmAEQbTJ = this.EZpvd.AEQbTJ(settingEntryPoint);
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) KWHzl(osmAEQbTJ.AEQbTJ()), (java.lang.Iterable) EZpvd(osmAEQbTJ.OLrzqt(), settingEntryPoint)), (java.lang.Iterable) AEQbTJ(osmAEQbTJ.copydefault(), settingEntryPoint)), (java.lang.Iterable) EZpvd(osmAEQbTJ.KWHzl()));
    }

    public final java.util.List<oSJ> KWHzl(java.util.List<? extends TopDisplayType> list) {
        oSJ.Activity activity;
        if (list.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (TopDisplayType topDisplayType : list) {
            switch (Activity.OLrzqt[topDisplayType.ordinal()]) {
                case 1:
                    activity = new oSJ.Activity(topDisplayType, false, C33070mpX.AYXKKw(C35964oKf.Fragment.DCUTEIdCUTEI), C52761wXj.TaskDescription.RXdAnZ, false, 18, null);
                    break;
                case 2:
                    activity = new oSJ.Activity(topDisplayType, false, C33070mpX.AYXKKw(C35964oKf.Fragment.djBIcL), C52761wXj.TaskDescription.OHqIaq, false, 18, null);
                    break;
                case 3:
                    activity = new oSJ.Activity(topDisplayType, false, C33070mpX.AYXKKw(C35964oKf.Fragment.fsSxsn), C52761wXj.TaskDescription.GiPPlL, false, 18, null);
                    break;
                case 4:
                    activity = new oSJ.Activity(topDisplayType, false, C33070mpX.AYXKKw(C35964oKf.Fragment.sRzUNh), C52761wXj.TaskDescription.fBE, false, 18, null);
                    break;
                case 5:
                    activity = new oSJ.Activity(topDisplayType, false, C33070mpX.AYXKKw(C35964oKf.Fragment.inahnb), C52761wXj.TaskDescription.wlaJM, false, 18, null);
                    break;
                case 6:
                    activity = new oSJ.Activity(topDisplayType, false, C33070mpX.AYXKKw(C35964oKf.Fragment.HJWChPURsaBn), C52761wXj.TaskDescription.iluEmO, false, 18, null);
                    break;
                case 7:
                    activity = new oSJ.Activity(topDisplayType, false, C33070mpX.AYXKKw(C35964oKf.Fragment.DuXjdv), C52761wXj.TaskDescription.QSBOWP, C39216poC.copydefault.KWHzl(), 2, null);
                    break;
                case 8:
                    activity = new oSJ.Activity(topDisplayType, false, C33070mpX.AYXKKw(C35964oKf.Fragment.zdxASf), C52761wXj.TaskDescription.HJWChPfvRMlC, C36236oUh.EZpvd.values(), 2, null);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(activity);
        }
        return arrayList;
    }

    public final java.util.List<oSJ> EZpvd(java.util.List<? extends TradingDisplayType> list, SettingEntryPoint settingEntryPoint) {
        oSJ.StateListAnimator stateListAnimator;
        if (list.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (TradingDisplayType tradingDisplayType : list) {
            switch (Activity.copydefault[tradingDisplayType.ordinal()]) {
                case 1:
                    stateListAnimator = new oSJ.StateListAnimator(tradingDisplayType, false, C33070mpX.AYXKKw(C35964oKf.Fragment.DGUQLI), OLrzqt().getMShowCurrentOrder(), settingEntryPoint.gEmmrt(), 2, null);
                    break;
                case 2:
                    stateListAnimator = new oSJ.StateListAnimator(tradingDisplayType, false, C33070mpX.AYXKKw(C35964oKf.Fragment.heceqZ), C36236oUh.EZpvd.wlaJM(), settingEntryPoint.gEmmrt(), 2, null);
                    break;
                case 3:
                    stateListAnimator = new oSJ.StateListAnimator(tradingDisplayType, false, Intrinsics.EZpvd((java.lang.Object) C37925pFu.KWHzl.KWHzl(), (java.lang.Object) "0") ? C33070mpX.AYXKKw(C35964oKf.Fragment.OUcgGI) : C33070mpX.AYXKKw(C35964oKf.Fragment.DsfknC), OLrzqt().isShowSpotAveragePrice(), settingEntryPoint.gEmmrt(), 2, null);
                    break;
                case 4:
                    stateListAnimator = new oSJ.StateListAnimator(tradingDisplayType, false, C33070mpX.AYXKKw(C35964oKf.Fragment.DNMMPQ), C36236oUh.EZpvd.ejfBZ(), settingEntryPoint.gEmmrt(), 2, null);
                    break;
                case 5:
                    stateListAnimator = new oSJ.StateListAnimator(tradingDisplayType, false, C33070mpX.AYXKKw(C32392mcI.Dialog.DCUTEIddSDPG), C36236oUh.EZpvd.fIwbmz(), settingEntryPoint.gEmmrt(), 2, null);
                    break;
                case 6:
                    stateListAnimator = new oSJ.StateListAnimator(tradingDisplayType, false, C33070mpX.AYXKKw(C32392mcI.Dialog.call), C36236oUh.EZpvd.AubY(), settingEntryPoint.gEmmrt(), 2, null);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(stateListAnimator);
        }
        java.util.List<oSJ> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        listFJNWhG.add(0, new oSJ.Application(C33070mpX.AYXKKw(C35964oKf.Fragment.ikIEnW), false, 2, null));
        return listFJNWhG;
    }

    public final java.util.List<oSJ> AEQbTJ(java.util.List<? extends ChartDisplayType> list, SettingEntryPoint settingEntryPoint) {
        oSJ.StateListAnimator stateListAnimator;
        if (list.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (ChartDisplayType chartDisplayType : list) {
            int i = Activity.AEQbTJ[chartDisplayType.ordinal()];
            if (i == 1) {
                stateListAnimator = new oSJ.StateListAnimator(chartDisplayType, false, C33070mpX.AYXKKw(C35964oKf.Fragment.gSBher), C36236oUh.EZpvd.AuCTelauCTel(), settingEntryPoint.gEmmrt(), 2, null);
            } else if (i == 2) {
                stateListAnimator = new oSJ.StateListAnimator(chartDisplayType, false, C33070mpX.AYXKKw(C35964oKf.Fragment.AEQbTJ), C36236oUh.EZpvd.getNewProxyInstance(), settingEntryPoint.gEmmrt(), 2, null);
            } else if (i == 3) {
                stateListAnimator = new oSJ.StateListAnimator(chartDisplayType, false, C33070mpX.AYXKKw(C35964oKf.Fragment.ORrpqH), C36236oUh.EZpvd.zLjUOn(), settingEntryPoint.gEmmrt(), 2, null);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                stateListAnimator = new oSJ.StateListAnimator(chartDisplayType, false, C33070mpX.AYXKKw(C35964oKf.Fragment.RXdAnZ), C36236oUh.EZpvd.hDKMBd(), settingEntryPoint.gEmmrt(), 2, null);
            }
            arrayList.add(stateListAnimator);
        }
        java.util.List<oSJ> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        listFJNWhG.add(0, new oSJ.Application(C33070mpX.AYXKKw(C35964oKf.Fragment.OBJEWx), false, 2, null));
        return listFJNWhG;
    }

    public final java.util.List<oSJ> EZpvd(java.util.List<? extends ChartHeightType> list) {
        if (list.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (ChartHeightType chartHeightType : list) {
            if (Activity.KWHzl[chartHeightType.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new oSJ.TaskDescription(chartHeightType, false, C36236oUh.EZpvd.KWHzl(), 2, null));
        }
        java.util.List<oSJ> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        listFJNWhG.add(0, new oSJ.Application(C33070mpX.AYXKKw(C35964oKf.Fragment.gmHjFq), false, 2, null));
        return listFJNWhG;
    }
}
