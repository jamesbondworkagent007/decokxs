package o;

import com.okinc.kline.api.bean.EntryType;
import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import com.okinc.kline.features.settings.sub.data.datasource.ChartPreferencesType;
import com.okinc.kline.features.settings.sub.data.datasource.ChartStyleType;
import com.okinc.kline.features.settings.sub.data.datasource.OthersType;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class oTA {

    public final /* synthetic */ class PendingIntent {
        public static final /* synthetic */ int[] copydefault;

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
                iArr[EntryType.PRO_PORTRAIT_TV.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[EntryType.PRO_LANDSCAPE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[EntryType.PRO_FORMULA.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[EntryType.LITE_PORTRAIT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[EntryType.CEDEFI_DEX.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            copydefault = iArr;
        }
    }

    @yCM
    public oTA() {
    }

    public final InterfaceC36224oTw KWHzl(@NotNull SettingEntryPoint settingEntryPoint) {
        Intrinsics.checkNotNullParameter(settingEntryPoint, "");
        switch (PendingIntent.copydefault[settingEntryPoint.KWHzl().ordinal()]) {
            case 1:
                return new Fragment(this, settingEntryPoint);
            case 2:
                return new StateListAnimator(this, settingEntryPoint);
            case 3:
                return new FragmentManager(this, settingEntryPoint);
            case 4:
                return new LoaderManager();
            case 5:
                return new Activity();
            case 6:
                return new ActionBar();
            case 7:
                return new Application(this, settingEntryPoint);
            default:
                return new TaskDescription(this, settingEntryPoint);
        }
    }

    public final BizInstrument EZpvd(SettingEntryPoint settingEntryPoint) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            return InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, settingEntryPoint.AEQbTJ(), settingEntryPoint.copydefault(), null, null, 12, null);
        }
        return null;
    }

    public final class Fragment implements InterfaceC36224oTw {
        public final /* synthetic */ oTA AEQbTJ;
        public final Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> OLrzqt;

        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] AEQbTJ;
            public static final /* synthetic */ int[] EZpvd;
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[ChartStyleType.values().length];
                try {
                    iArr[ChartStyleType.ChartView.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[ChartStyleType.FullScreenMode.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[ChartStyleType.ColorPreference.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                EZpvd = iArr;
                int[] iArr2 = new int[ChartPreferencesType.values().length];
                try {
                    iArr2[ChartPreferencesType.QuickTrading.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr2[ChartPreferencesType.DoubleTapToFullScreen.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr2[ChartPreferencesType.CancelOrderConfirm.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr2[ChartPreferencesType.NewsDisplay.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                try {
                    iArr2[ChartPreferencesType.AnchorTime.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused8) {
                }
                try {
                    iArr2[ChartPreferencesType.AnchorTimeSwitchPairs.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused9) {
                }
                OLrzqt = iArr2;
                int[] iArr3 = new int[OthersType.values().length];
                try {
                    iArr3[OthersType.FloatingWidget.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused10) {
                }
                AEQbTJ = iArr3;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36224oTw
        public Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> copydefault() {
            return this.OLrzqt;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Fragment(@NotNull oTA ota, SettingEntryPoint settingEntryPoint) {
            Intrinsics.checkNotNullParameter(settingEntryPoint, "");
            this.AEQbTJ = ota;
            ChartStyleType[] chartStyleTypeArrValues = ChartStyleType.values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (ChartStyleType chartStyleType : chartStyleTypeArrValues) {
                int i = TaskDescription.EZpvd[chartStyleType.ordinal()];
                if ((i != 1 && i != 2 && i != 3) || !settingEntryPoint.OLrzqt()) {
                    arrayList.add(chartStyleType);
                }
            }
            java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            ChartPreferencesType[] chartPreferencesTypeArrValues = ChartPreferencesType.values();
            oTA ota2 = this.AEQbTJ;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (ChartPreferencesType chartPreferencesType : chartPreferencesTypeArrValues) {
                switch (TaskDescription.OLrzqt[chartPreferencesType.ordinal()]) {
                    case 1:
                        BizInstrument bizInstrumentEZpvd = ota2.EZpvd(settingEntryPoint);
                        if (bizInstrumentEZpvd != null && pFP.OLrzqt.copydefault(bizInstrumentEZpvd) && !settingEntryPoint.OLrzqt()) {
                            arrayList2.add(chartPreferencesType);
                        }
                        break;
                    case 2:
                    case 3:
                        if (settingEntryPoint.OLrzqt()) {
                            break;
                        }
                        break;
                    case 4:
                        if (!pFS.KWHzl.EZpvd() || settingEntryPoint.OLrzqt()) {
                            break;
                        }
                        break;
                    case 5:
                    case 6:
                        if (settingEntryPoint.OLrzqt() || !pDX.AEQbTJ.djBIcL()) {
                            break;
                        }
                        break;
                }
            }
            java.util.List listAxsJAYsNCnLh2 = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2);
            OthersType[] othersTypeArrValues = OthersType.values();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (OthersType othersType : othersTypeArrValues) {
                if (TaskDescription.AEQbTJ[othersType.ordinal()] != 1 || (!settingEntryPoint.OLrzqt() && pFP.OLrzqt.OLrzqt())) {
                    arrayList3.add(othersType);
                }
            }
            this.OLrzqt = new Triple<>(listAxsJAYsNCnLh, listAxsJAYsNCnLh2, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList3));
        }
    }

    public final class FragmentManager implements InterfaceC36224oTw {
        public final /* synthetic */ oTA AEQbTJ;
        public final Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> KWHzl;

        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] AEQbTJ;
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[ChartStyleType.values().length];
                try {
                    iArr[ChartStyleType.FullScreenMode.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[ChartStyleType.ZoomStyle.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                KWHzl = iArr;
                int[] iArr2 = new int[ChartPreferencesType.values().length];
                try {
                    iArr2[ChartPreferencesType.UtcChangeAndChartTime.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr2[ChartPreferencesType.KeepScreenOn.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr2[ChartPreferencesType.NewsDisplay.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                AEQbTJ = iArr2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36224oTw
        public Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> copydefault() {
            return this.KWHzl;
        }

        public FragmentManager(@NotNull oTA ota, SettingEntryPoint settingEntryPoint) {
            Intrinsics.checkNotNullParameter(settingEntryPoint, "");
            this.AEQbTJ = ota;
            ChartStyleType[] chartStyleTypeArrValues = ChartStyleType.values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (ChartStyleType chartStyleType : chartStyleTypeArrValues) {
                int i = StateListAnimator.KWHzl[chartStyleType.ordinal()];
                if (i != 1 && i != 2) {
                    arrayList.add(chartStyleType);
                }
            }
            java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            ChartPreferencesType[] chartPreferencesTypeArrValues = ChartPreferencesType.values();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (ChartPreferencesType chartPreferencesType : chartPreferencesTypeArrValues) {
                int i2 = StateListAnimator.AEQbTJ[chartPreferencesType.ordinal()];
                if (i2 == 1 || i2 == 2 || (i2 == 3 && pFS.KWHzl.EZpvd())) {
                    arrayList2.add(chartPreferencesType);
                }
            }
            this.KWHzl = new Triple<>(listAxsJAYsNCnLh, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2), yDV.AwvSrB(OthersType.values()));
        }
    }

    public final class StateListAnimator implements InterfaceC36224oTw {
        public final /* synthetic */ oTA KWHzl;
        public final Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> copydefault;

        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] AEQbTJ;
            public static final /* synthetic */ int[] OLrzqt;
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[ChartStyleType.values().length];
                try {
                    iArr[ChartStyleType.ChartView.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                copydefault = iArr;
                int[] iArr2 = new int[ChartPreferencesType.values().length];
                try {
                    iArr2[ChartPreferencesType.QuickTrading.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr2[ChartPreferencesType.NewsDisplay.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr2[ChartPreferencesType.AbstractOnChart.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr2[ChartPreferencesType.AnchorTime.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr2[ChartPreferencesType.AnchorTimeSwitchPairs.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                AEQbTJ = iArr2;
                int[] iArr3 = new int[OthersType.values().length];
                try {
                    iArr3[OthersType.FloatingWidget.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                OLrzqt = iArr3;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36224oTw
        public Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> copydefault() {
            return this.copydefault;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0077 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public StateListAnimator(@NotNull oTA ota, SettingEntryPoint settingEntryPoint) {
            boolean zCopydefault;
            Intrinsics.checkNotNullParameter(settingEntryPoint, "");
            this.KWHzl = ota;
            ChartStyleType[] chartStyleTypeArrValues = ChartStyleType.values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (ChartStyleType chartStyleType : chartStyleTypeArrValues) {
                if (ActionBar.copydefault[chartStyleType.ordinal()] != 1) {
                    arrayList.add(chartStyleType);
                }
            }
            java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            ChartPreferencesType[] chartPreferencesTypeArrValues = ChartPreferencesType.values();
            oTA ota2 = this.KWHzl;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (ChartPreferencesType chartPreferencesType : chartPreferencesTypeArrValues) {
                int i = ActionBar.AEQbTJ[chartPreferencesType.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        zCopydefault = pFS.KWHzl.EZpvd();
                    } else if (i != 3) {
                        if (i == 4 || i == 5) {
                            zCopydefault = pDX.AEQbTJ.djBIcL();
                        }
                        arrayList2.add(chartPreferencesType);
                    }
                    if (!zCopydefault) {
                        arrayList2.add(chartPreferencesType);
                    }
                } else {
                    BizInstrument bizInstrumentEZpvd = ota2.EZpvd(settingEntryPoint);
                    if (bizInstrumentEZpvd != null) {
                        zCopydefault = pFP.OLrzqt.copydefault(bizInstrumentEZpvd);
                        if (!zCopydefault) {
                        }
                    }
                }
            }
            java.util.List listAxsJAYsNCnLh2 = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2);
            OthersType[] othersTypeArrValues = OthersType.values();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (OthersType othersType : othersTypeArrValues) {
                if (ActionBar.OLrzqt[othersType.ordinal()] != 1 || pFP.OLrzqt.OLrzqt()) {
                    arrayList3.add(othersType);
                }
            }
            this.copydefault = new Triple<>(listAxsJAYsNCnLh, listAxsJAYsNCnLh2, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList3));
        }
    }

    public final class LoaderManager implements InterfaceC36224oTw {
        public final Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> copydefault = new Triple<>(yDY.AhwBna(), yDV.AwvSrB(ChartPreferencesType.values()), yDV.AwvSrB(OthersType.values()));

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36224oTw
        public Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public LoaderManager() {
        }
    }

    public final class Activity implements InterfaceC36224oTw {
        public final Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36224oTw
        public Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
            java.util.List listAhwBna = yDY.AhwBna();
            ChartPreferencesType[] chartPreferencesTypeArrValues = ChartPreferencesType.values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (ChartPreferencesType chartPreferencesType : chartPreferencesTypeArrValues) {
                if (chartPreferencesType == ChartPreferencesType.UtcChangeAndChartTime || chartPreferencesType == ChartPreferencesType.KeepScreenOn || chartPreferencesType == ChartPreferencesType.DragPosition) {
                    arrayList.add(chartPreferencesType);
                }
            }
            java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            OthersType[] othersTypeArrValues = OthersType.values();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (OthersType othersType : othersTypeArrValues) {
                if (othersType == OthersType.RemoveDrawing) {
                    arrayList2.add(othersType);
                }
            }
            this.OLrzqt = new Triple<>(listAhwBna, listAxsJAYsNCnLh, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2));
        }
    }

    public final class ActionBar implements InterfaceC36224oTw {
        public final Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> EZpvd;

        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] AEQbTJ;
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[ChartStyleType.values().length];
                try {
                    iArr[ChartStyleType.ZoomStyle.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[ChartStyleType.Bullish.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[ChartStyleType.Bearish.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                KWHzl = iArr;
                int[] iArr2 = new int[ChartPreferencesType.values().length];
                try {
                    iArr2[ChartPreferencesType.DragPosition.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                AEQbTJ = iArr2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36224oTw
        public Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
            ChartStyleType[] chartStyleTypeArrValues = ChartStyleType.values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (ChartStyleType chartStyleType : chartStyleTypeArrValues) {
                int i = Activity.KWHzl[chartStyleType.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    arrayList.add(chartStyleType);
                }
            }
            java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            ChartPreferencesType[] chartPreferencesTypeArrValues = ChartPreferencesType.values();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (ChartPreferencesType chartPreferencesType : chartPreferencesTypeArrValues) {
                if (Activity.AEQbTJ[chartPreferencesType.ordinal()] == 1) {
                    arrayList2.add(chartPreferencesType);
                }
            }
            this.EZpvd = new Triple<>(listAxsJAYsNCnLh, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2), yDY.AhwBna());
        }
    }

    public final class Application implements InterfaceC36224oTw {
        public final /* synthetic */ oTA AEQbTJ;
        public final Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> KWHzl;

        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] AEQbTJ;
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[ChartStyleType.values().length];
                try {
                    iArr[ChartStyleType.ZoomStyle.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[ChartStyleType.Bullish.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[ChartStyleType.Bearish.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                AEQbTJ = iArr;
                int[] iArr2 = new int[ChartPreferencesType.values().length];
                try {
                    iArr2[ChartPreferencesType.UtcChangeAndChartTime.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr2[ChartPreferencesType.DragPosition.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr2[ChartPreferencesType.NewsDisplay.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                EZpvd = iArr2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36224oTw
        public Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> copydefault() {
            return this.KWHzl;
        }

        public Application(@NotNull oTA ota, SettingEntryPoint settingEntryPoint) {
            Intrinsics.checkNotNullParameter(settingEntryPoint, "");
            this.AEQbTJ = ota;
            InterfaceC56445yFq<ChartStyleType> entries = ChartStyleType.getEntries();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (ChartStyleType chartStyleType : entries) {
                int i = StateListAnimator.AEQbTJ[chartStyleType.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    arrayList.add(chartStyleType);
                }
            }
            java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            InterfaceC56445yFq<ChartPreferencesType> entries2 = ChartPreferencesType.getEntries();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (ChartPreferencesType chartPreferencesType : entries2) {
                int i2 = StateListAnimator.EZpvd[chartPreferencesType.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        arrayList2.add(chartPreferencesType);
                    }
                } else if (settingEntryPoint.values()) {
                    arrayList2.add(chartPreferencesType);
                }
            }
            this.KWHzl = new Triple<>(listAxsJAYsNCnLh, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2), yDY.AhwBna());
        }
    }

    public final class TaskDescription implements InterfaceC36224oTw {
        public final Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> EZpvd;
        public final /* synthetic */ oTA OLrzqt;

        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] KWHzl;
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[ChartStyleType.values().length];
                try {
                    iArr[ChartStyleType.ZoomStyle.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[ChartStyleType.Bullish.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[ChartStyleType.Bearish.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                OLrzqt = iArr;
                int[] iArr2 = new int[ChartPreferencesType.values().length];
                try {
                    iArr2[ChartPreferencesType.UtcChangeAndChartTime.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr2[ChartPreferencesType.DragPosition.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                KWHzl = iArr2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC36224oTw
        public Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> copydefault() {
            return this.EZpvd;
        }

        public TaskDescription(@NotNull oTA ota, SettingEntryPoint settingEntryPoint) {
            Intrinsics.checkNotNullParameter(settingEntryPoint, "");
            this.OLrzqt = ota;
            InterfaceC56445yFq<ChartStyleType> entries = ChartStyleType.getEntries();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (ChartStyleType chartStyleType : entries) {
                int i = StateListAnimator.OLrzqt[chartStyleType.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    arrayList.add(chartStyleType);
                }
            }
            java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            InterfaceC56445yFq<ChartPreferencesType> entries2 = ChartPreferencesType.getEntries();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (ChartPreferencesType chartPreferencesType : entries2) {
                int i2 = StateListAnimator.KWHzl[chartPreferencesType.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        arrayList2.add(chartPreferencesType);
                    }
                } else if (settingEntryPoint.values()) {
                    arrayList2.add(chartPreferencesType);
                }
            }
            this.EZpvd = new Triple<>(listAxsJAYsNCnLh, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2), yDY.AhwBna());
        }
    }
}
