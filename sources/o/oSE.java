package o;

import com.okinc.kline.api.bean.EntryType;
import com.okinc.kline.features.settings.main.data.datasource.ChartDisplayType;
import com.okinc.kline.features.settings.main.data.datasource.ChartHeightType;
import com.okinc.kline.features.settings.main.data.datasource.TopDisplayType;
import com.okinc.kline.features.settings.main.data.datasource.TradingDisplayType;
import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class oSE {

    public final /* synthetic */ class Dialog {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EntryType.values().length];
            try {
                iArr[EntryType.PRO_PORTRAIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[EntryType.PRO_FULL_SCREEN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[EntryType.PRO_LANDSCAPE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[EntryType.PRO_FORMULA.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[EntryType.LITE_PORTRAIT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[EntryType.LITE_LANDSCAPE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            EZpvd = iArr;
        }
    }

    @yCM
    public oSE() {
    }

    public final oSN OLrzqt(@NotNull SettingEntryPoint settingEntryPoint) {
        oSN fragment;
        Intrinsics.checkNotNullParameter(settingEntryPoint, "");
        switch (Dialog.EZpvd[settingEntryPoint.KWHzl().ordinal()]) {
            case 1:
                fragment = new Fragment(this, settingEntryPoint);
                break;
            case 2:
                fragment = new ActionBar(this, settingEntryPoint);
                break;
            case 3:
                fragment = new PendingIntent(this, settingEntryPoint);
                break;
            case 4:
                return new Activity();
            case 5:
                return new StateListAnimator();
            case 6:
                return new TaskDescription();
            default:
                fragment = new Application(this, settingEntryPoint);
                break;
        }
        return fragment;
    }

    public final class Fragment implements oSN {
        public final /* synthetic */ oSE AEQbTJ;
        public final oSM<java.util.List<TopDisplayType>, java.util.List<TradingDisplayType>, java.util.List<ChartDisplayType>, java.util.List<ChartHeightType>> OLrzqt;

        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] AEQbTJ;
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TopDisplayType.values().length];
                try {
                    iArr[TopDisplayType.Landscape.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[TopDisplayType.Drawing.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[TopDisplayType.Date.ordinal()] = 3;
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
                copydefault = iArr;
                int[] iArr2 = new int[TradingDisplayType.values().length];
                try {
                    iArr2[TradingDisplayType.HistoricalOrder.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr2[TradingDisplayType.BreakEvenPrice.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                try {
                    iArr2[TradingDisplayType.LipPrice.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused8) {
                }
                try {
                    iArr2[TradingDisplayType.CostOfPositions.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused9) {
                }
                try {
                    iArr2[TradingDisplayType.AverageCost.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused10) {
                }
                AEQbTJ = iArr2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oSN
        public oSM<java.util.List<TopDisplayType>, java.util.List<TradingDisplayType>, java.util.List<ChartDisplayType>, java.util.List<ChartHeightType>> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Fragment(@NotNull oSE ose, SettingEntryPoint settingEntryPoint) {
            boolean zOLrzqt;
            Intrinsics.checkNotNullParameter(settingEntryPoint, "");
            this.AEQbTJ = ose;
            TopDisplayType[] topDisplayTypeArrValues = TopDisplayType.values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (TopDisplayType topDisplayType : topDisplayTypeArrValues) {
                int i = TaskDescription.copydefault[topDisplayType.ordinal()];
                if (i == 1 || i == 2) {
                    if (!settingEntryPoint.OLrzqt()) {
                        arrayList.add(topDisplayType);
                    }
                } else if (i != 3) {
                    if (i == 4) {
                        if (!pFS.KWHzl.copydefault()) {
                        }
                    } else if (i == 5 && pFS.KWHzl.OLrzqt()) {
                    }
                } else if (settingEntryPoint.OLrzqt() || !pDX.AEQbTJ.copydefault() || Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.DbNXlk())) {
                }
            }
            java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            TradingDisplayType[] tradingDisplayTypeArrValues = TradingDisplayType.values();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (TradingDisplayType tradingDisplayType : tradingDisplayTypeArrValues) {
                int i2 = TaskDescription.AEQbTJ[tradingDisplayType.ordinal()];
                if (i2 == 1) {
                    zOLrzqt = pEX.OLrzqt.OLrzqt();
                } else if (i2 != 2 && i2 == 3) {
                    zOLrzqt = pEX.OLrzqt.AEQbTJ();
                } else {
                    zOLrzqt = pEX.OLrzqt.AEQbTJ();
                }
                if (zOLrzqt) {
                    arrayList2.add(tradingDisplayType);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList2) {
                int i3 = TaskDescription.AEQbTJ[((TradingDisplayType) obj).ordinal()];
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            if (!Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.fetchVPNInfo())) {
                                arrayList3.add(obj);
                            }
                        } else if (i3 != 5 || Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.fetchVPNInfo())) {
                            arrayList3.add(obj);
                        }
                    } else if (Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.AuCTel()) || Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.KWHzl()) || Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.isConnected())) {
                        arrayList3.add(obj);
                    }
                } else if (Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.AuCTel()) || Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.KWHzl())) {
                    arrayList3.add(obj);
                }
            }
            this.OLrzqt = new oSM<>(listAxsJAYsNCnLh, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList3), yDV.AwvSrB(ChartDisplayType.values()), yDV.AwvSrB(ChartHeightType.values()));
        }
    }

    public final class ActionBar implements oSN {
        public final oSM<java.util.List<TopDisplayType>, java.util.List<TradingDisplayType>, java.util.List<ChartDisplayType>, java.util.List<ChartHeightType>> EZpvd;
        public final /* synthetic */ oSE copydefault;

        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] EZpvd;
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TopDisplayType.values().length];
                try {
                    iArr[TopDisplayType.Indicators.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[TopDisplayType.Drawing.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[TopDisplayType.Tutorial.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[TopDisplayType.Date.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[TopDisplayType.Formula.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[TopDisplayType.Compare.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                OLrzqt = iArr;
                int[] iArr2 = new int[TradingDisplayType.values().length];
                try {
                    iArr2[TradingDisplayType.HistoricalOrder.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                try {
                    iArr2[TradingDisplayType.BreakEvenPrice.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused8) {
                }
                try {
                    iArr2[TradingDisplayType.LipPrice.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused9) {
                }
                try {
                    iArr2[TradingDisplayType.CostOfPositions.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused10) {
                }
                try {
                    iArr2[TradingDisplayType.AverageCost.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused11) {
                }
                EZpvd = iArr2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oSN
        public oSM<java.util.List<TopDisplayType>, java.util.List<TradingDisplayType>, java.util.List<ChartDisplayType>, java.util.List<ChartHeightType>> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ActionBar(@NotNull oSE ose, SettingEntryPoint settingEntryPoint) {
            boolean zOLrzqt;
            Intrinsics.checkNotNullParameter(settingEntryPoint, "");
            this.copydefault = ose;
            TopDisplayType[] topDisplayTypeArrValues = TopDisplayType.values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (TopDisplayType topDisplayType : topDisplayTypeArrValues) {
                switch (StateListAnimator.OLrzqt[topDisplayType.ordinal()]) {
                    case 4:
                        if (pDX.AEQbTJ.copydefault() && !Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.DbNXlk())) {
                            arrayList.add(topDisplayType);
                        }
                        break;
                    case 5:
                        if (pFS.KWHzl.copydefault()) {
                            break;
                        }
                        break;
                    case 6:
                        if (pFS.KWHzl.OLrzqt()) {
                            break;
                        }
                        break;
                }
            }
            java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            TradingDisplayType[] tradingDisplayTypeArrValues = TradingDisplayType.values();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (TradingDisplayType tradingDisplayType : tradingDisplayTypeArrValues) {
                int i = StateListAnimator.EZpvd[tradingDisplayType.ordinal()];
                if (i == 1) {
                    zOLrzqt = pEX.OLrzqt.OLrzqt();
                } else if (i != 2 && i == 3) {
                    zOLrzqt = pEX.OLrzqt.AEQbTJ();
                } else {
                    zOLrzqt = pEX.OLrzqt.AEQbTJ();
                }
                if (zOLrzqt) {
                    arrayList2.add(tradingDisplayType);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList2) {
                int i2 = StateListAnimator.EZpvd[((TradingDisplayType) obj).ordinal()];
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            if (!Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.fetchVPNInfo())) {
                                arrayList3.add(obj);
                            }
                        } else if (i2 != 5 || Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.fetchVPNInfo())) {
                            arrayList3.add(obj);
                        }
                    } else if (Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.AuCTel()) || Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.KWHzl()) || Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.isConnected())) {
                        arrayList3.add(obj);
                    }
                } else if (Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.AuCTel()) || Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.KWHzl())) {
                    arrayList3.add(obj);
                }
            }
            this.EZpvd = new oSM<>(listAxsJAYsNCnLh, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList3), yDV.AwvSrB(ChartDisplayType.values()), yDY.AhwBna());
        }
    }

    public final class PendingIntent implements oSN {
        public final /* synthetic */ oSE KWHzl;
        public final oSM<java.util.List<TopDisplayType>, java.util.List<TradingDisplayType>, java.util.List<ChartDisplayType>, java.util.List<ChartHeightType>> OLrzqt;

        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TradingDisplayType.values().length];
                try {
                    iArr[TradingDisplayType.HistoricalOrder.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[TradingDisplayType.BreakEvenPrice.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[TradingDisplayType.LipPrice.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[TradingDisplayType.CostOfPositions.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[TradingDisplayType.AverageCost.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                OLrzqt = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oSN
        public oSM<java.util.List<TopDisplayType>, java.util.List<TradingDisplayType>, java.util.List<ChartDisplayType>, java.util.List<ChartHeightType>> AEQbTJ() {
            return this.OLrzqt;
        }

        public PendingIntent(@NotNull oSE ose, SettingEntryPoint settingEntryPoint) {
            boolean zOLrzqt;
            Intrinsics.checkNotNullParameter(settingEntryPoint, "");
            this.KWHzl = ose;
            java.util.List listAhwBna = yDY.AhwBna();
            TradingDisplayType[] tradingDisplayTypeArrValues = TradingDisplayType.values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (TradingDisplayType tradingDisplayType : tradingDisplayTypeArrValues) {
                int i = ActionBar.OLrzqt[tradingDisplayType.ordinal()];
                if (i == 1) {
                    zOLrzqt = pEX.OLrzqt.OLrzqt();
                } else if (i != 2 && i == 3) {
                    zOLrzqt = pEX.OLrzqt.AEQbTJ();
                } else {
                    zOLrzqt = pEX.OLrzqt.AEQbTJ();
                }
                if (zOLrzqt) {
                    arrayList.add(tradingDisplayType);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                int i2 = ActionBar.OLrzqt[((TradingDisplayType) obj).ordinal()];
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            if (!Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.fetchVPNInfo())) {
                                arrayList2.add(obj);
                            }
                        } else if (i2 != 5 || Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.fetchVPNInfo())) {
                            arrayList2.add(obj);
                        }
                    } else if (Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.AuCTel()) || Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.KWHzl()) || Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.isConnected())) {
                        arrayList2.add(obj);
                    }
                } else if (Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.AuCTel()) || Intrinsics.EZpvd((java.lang.Object) settingEntryPoint.AEQbTJ(), (java.lang.Object) oLT.KWHzl())) {
                    arrayList2.add(obj);
                }
            }
            this.OLrzqt = new oSM<>(listAhwBna, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2), yDV.AwvSrB(ChartDisplayType.values()), yDY.AhwBna());
        }
    }

    public final class Activity implements oSN {
        public final oSM<java.util.List<TopDisplayType>, java.util.List<TradingDisplayType>, java.util.List<ChartDisplayType>, java.util.List<ChartHeightType>> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oSN
        public oSM<java.util.List<TopDisplayType>, java.util.List<TradingDisplayType>, java.util.List<ChartDisplayType>, java.util.List<ChartHeightType>> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
            TopDisplayType[] topDisplayTypeArrValues = TopDisplayType.values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (TopDisplayType topDisplayType : topDisplayTypeArrValues) {
                if (topDisplayType == TopDisplayType.Formula || topDisplayType == TopDisplayType.Settings) {
                    arrayList.add(topDisplayType);
                }
            }
            java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            java.util.List listAhwBna = yDY.AhwBna();
            ChartDisplayType[] chartDisplayTypeArrValues = ChartDisplayType.values();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (ChartDisplayType chartDisplayType : chartDisplayTypeArrValues) {
                if (chartDisplayType == ChartDisplayType.Axis || chartDisplayType == ChartDisplayType.CountDown) {
                    arrayList2.add(chartDisplayType);
                }
            }
            this.EZpvd = new oSM<>(listAxsJAYsNCnLh, listAhwBna, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2), yDY.AhwBna());
        }
    }

    public final class StateListAnimator implements oSN {
        public final oSM<java.util.List<TopDisplayType>, java.util.List<TradingDisplayType>, java.util.List<ChartDisplayType>, java.util.List<ChartHeightType>> OLrzqt;
        public final boolean copydefault = !((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.BANNER);
        public final boolean KWHzl = !((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.RISK_BANNER);

        public final /* synthetic */ class Activity {
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
                    iArr[TopDisplayType.Drawing.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[TopDisplayType.Tutorial.ordinal()] = 3;
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
                    iArr[TopDisplayType.Date.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                copydefault = iArr;
                int[] iArr2 = new int[TradingDisplayType.values().length];
                try {
                    iArr2[TradingDisplayType.HistoricalOrder.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                OLrzqt = iArr2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oSN
        public oSM<java.util.List<TopDisplayType>, java.util.List<TradingDisplayType>, java.util.List<ChartDisplayType>, java.util.List<ChartHeightType>> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public StateListAnimator() {
            boolean zAEQbTJ;
            TopDisplayType[] topDisplayTypeArrValues = TopDisplayType.values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (TopDisplayType topDisplayType : topDisplayTypeArrValues) {
                switch (Activity.copydefault[topDisplayType.ordinal()]) {
                    case 1:
                    case 2:
                        if (this.copydefault && this.KWHzl) {
                            arrayList.add(topDisplayType);
                        }
                        break;
                }
            }
            java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            TradingDisplayType[] tradingDisplayTypeArrValues = TradingDisplayType.values();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (TradingDisplayType tradingDisplayType : tradingDisplayTypeArrValues) {
                if (tradingDisplayType != TradingDisplayType.CostOfPositions && tradingDisplayType != TradingDisplayType.BreakEvenPrice && tradingDisplayType != TradingDisplayType.LipPrice) {
                    arrayList2.add(tradingDisplayType);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList2) {
                if (Activity.OLrzqt[((TradingDisplayType) obj).ordinal()] == 1) {
                    zAEQbTJ = pEX.OLrzqt.OLrzqt();
                } else {
                    zAEQbTJ = pEX.OLrzqt.AEQbTJ();
                }
                if (zAEQbTJ) {
                    arrayList3.add(obj);
                }
            }
            java.util.List listAxsJAYsNCnLh2 = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList3);
            ChartDisplayType[] chartDisplayTypeArrValues = ChartDisplayType.values();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (ChartDisplayType chartDisplayType : chartDisplayTypeArrValues) {
                if (chartDisplayType != ChartDisplayType.PriceAlerts) {
                    arrayList4.add(chartDisplayType);
                }
            }
            this.OLrzqt = new oSM<>(listAxsJAYsNCnLh, listAxsJAYsNCnLh2, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList4), yDV.AwvSrB(ChartHeightType.values()));
        }
    }

    public final class TaskDescription implements oSN {
        public final oSM<java.util.List<TopDisplayType>, java.util.List<TradingDisplayType>, java.util.List<ChartDisplayType>, java.util.List<ChartHeightType>> KWHzl;

        /* JADX INFO: renamed from: o.oSE$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public final /* synthetic */ class C0904TaskDescription {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TradingDisplayType.values().length];
                try {
                    iArr[TradingDisplayType.HistoricalOrder.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oSN
        public oSM<java.util.List<TopDisplayType>, java.util.List<TradingDisplayType>, java.util.List<ChartDisplayType>, java.util.List<ChartHeightType>> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
            boolean zAEQbTJ;
            java.util.List listAhwBna = yDY.AhwBna();
            TradingDisplayType[] tradingDisplayTypeArrValues = TradingDisplayType.values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (TradingDisplayType tradingDisplayType : tradingDisplayTypeArrValues) {
                if (tradingDisplayType != TradingDisplayType.CostOfPositions && tradingDisplayType != TradingDisplayType.BreakEvenPrice && tradingDisplayType != TradingDisplayType.LipPrice) {
                    arrayList.add(tradingDisplayType);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (C0904TaskDescription.AEQbTJ[((TradingDisplayType) obj).ordinal()] == 1) {
                    zAEQbTJ = pEX.OLrzqt.OLrzqt();
                } else {
                    zAEQbTJ = pEX.OLrzqt.AEQbTJ();
                }
                if (zAEQbTJ) {
                    arrayList2.add(obj);
                }
            }
            java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2);
            ChartDisplayType[] chartDisplayTypeArrValues = ChartDisplayType.values();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (ChartDisplayType chartDisplayType : chartDisplayTypeArrValues) {
                if (chartDisplayType != ChartDisplayType.PriceAlerts) {
                    arrayList3.add(chartDisplayType);
                }
            }
            this.KWHzl = new oSM<>(listAhwBna, listAxsJAYsNCnLh, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList3), yDY.AhwBna());
        }
    }

    public final class Application implements oSN {
        public final /* synthetic */ oSE KWHzl;
        public final oSM<java.util.List<TopDisplayType>, java.util.List<TradingDisplayType>, java.util.List<ChartDisplayType>, java.util.List<ChartHeightType>> copydefault;

        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] EZpvd;
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TopDisplayType.values().length];
                try {
                    iArr[TopDisplayType.Drawing.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[TopDisplayType.Tutorial.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[TopDisplayType.Formula.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[TopDisplayType.Compare.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[TopDisplayType.Date.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                EZpvd = iArr;
                int[] iArr2 = new int[TradingDisplayType.values().length];
                try {
                    iArr2[TradingDisplayType.HistoricalOrder.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr2[TradingDisplayType.OpenOrders.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                try {
                    iArr2[TradingDisplayType.AverageCost.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused8) {
                }
                copydefault = iArr2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oSN
        public oSM<java.util.List<TopDisplayType>, java.util.List<TradingDisplayType>, java.util.List<ChartDisplayType>, java.util.List<ChartHeightType>> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Application(@NotNull oSE ose, SettingEntryPoint settingEntryPoint) {
            java.util.List listAxsJAYsNCnLh;
            boolean zValueOf;
            boolean zDjBIcL;
            boolean zAEQbTJ;
            Intrinsics.checkNotNullParameter(settingEntryPoint, "");
            this.KWHzl = ose;
            if (settingEntryPoint.AYXKKw()) {
                listAxsJAYsNCnLh = yDY.AhwBna();
            } else {
                TopDisplayType[] topDisplayTypeArrValues = TopDisplayType.values();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (TopDisplayType topDisplayType : topDisplayTypeArrValues) {
                    int i = TaskDescription.EZpvd[topDisplayType.ordinal()];
                    if (i == 1) {
                        zValueOf = settingEntryPoint.valueOf();
                    } else if (i != 2) {
                        if (i != 3 && i != 4 && i != 5) {
                            arrayList.add(topDisplayType);
                        }
                    } else {
                        zValueOf = settingEntryPoint.isConnected();
                    }
                    if (zValueOf) {
                    }
                }
                listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            }
            TradingDisplayType[] tradingDisplayTypeArrValues = TradingDisplayType.values();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (TradingDisplayType tradingDisplayType : tradingDisplayTypeArrValues) {
                if (TaskDescription.copydefault[tradingDisplayType.ordinal()] == 1) {
                    zAEQbTJ = pEX.OLrzqt.OLrzqt();
                } else {
                    zAEQbTJ = pEX.OLrzqt.AEQbTJ();
                }
                if (zAEQbTJ) {
                    arrayList2.add(tradingDisplayType);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList2) {
                int i2 = TaskDescription.copydefault[((TradingDisplayType) obj).ordinal()];
                if (i2 == 1) {
                    zDjBIcL = settingEntryPoint.djBIcL();
                } else if (i2 == 2) {
                    zDjBIcL = settingEntryPoint.DbNXlk();
                } else if (i2 == 3) {
                    zDjBIcL = settingEntryPoint.AhwBna();
                }
                if (zDjBIcL) {
                    arrayList3.add(obj);
                }
            }
            java.util.List listAxsJAYsNCnLh2 = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList3);
            ChartDisplayType[] chartDisplayTypeArrValues = ChartDisplayType.values();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (ChartDisplayType chartDisplayType : chartDisplayTypeArrValues) {
                if (chartDisplayType == ChartDisplayType.Axis) {
                    arrayList4.add(chartDisplayType);
                }
            }
            this.copydefault = new oSM<>(listAxsJAYsNCnLh, listAxsJAYsNCnLh2, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList4), settingEntryPoint.AYXKKw() ? yDY.AhwBna() : yDV.AwvSrB(ChartHeightType.values()));
        }
    }
}
