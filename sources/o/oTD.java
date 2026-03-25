package o;

import android.graphics.Color;
import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import com.okinc.kline.features.settings.sub.data.datasource.ChartPreferencesType;
import com.okinc.kline.features.settings.sub.data.datasource.ChartStyleType;
import com.okinc.kline.features.settings.sub.data.datasource.OthersType;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.widget.data.TradeMenuItemBean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C35964oKf;
import o.C52761wXj;
import o.C55688xof;
import o.oTB;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes8.dex */
public final class oTD extends AbstractC49400uno<SettingEntryPoint, java.util.List<? extends oTB>> {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final C36226oTy AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final CoroutineDispatcher copydefault;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] copydefault;

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
                iArr[ChartStyleType.Theme.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ChartStyleType.ZoomStyle.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[ChartStyleType.TradeButton.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[ChartStyleType.ColorPreference.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[ChartStyleType.Bullish.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[ChartStyleType.Bearish.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[ChartPreferencesType.values().length];
            try {
                iArr2[ChartPreferencesType.UtcChangeAndChartTime.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[ChartPreferencesType.AbstractOnChart.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[ChartPreferencesType.DragPosition.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[ChartPreferencesType.AnchorTime.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[ChartPreferencesType.AnchorTimeSwitchPairs.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[ChartPreferencesType.NewsDisplay.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr2[ChartPreferencesType.QuickTrading.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr2[ChartPreferencesType.KeepScreenOn.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr2[ChartPreferencesType.DoubleTapToFullScreen.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr2[ChartPreferencesType.CancelOrderConfirm.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            AEQbTJ = iArr2;
            int[] iArr3 = new int[OthersType.values().length];
            try {
                iArr3[OthersType.SyncDrawing.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr3[OthersType.RemoveDrawing.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr3[OthersType.FloatingWidget.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            copydefault = iArr3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public oTD(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C36226oTy c36226oTy) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c36226oTy, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = c36226oTy;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.oTE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oTD.gEmmrt();
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.oTC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oTD.copydefault();
            }
        });
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oTD.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChartViewOutSideConfig gEmmrt() {
        return C36246oUr.copydefault().zLjUOn();
    }

    private final ChartViewOutSideConfig valueOf() {
        return (ChartViewOutSideConfig) this.EZpvd.getValue();
    }

    public static final InterfaceC46557tYt copydefault() {
        return (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
    }

    public final InterfaceC46557tYt AhwBna() {
        return (InterfaceC46557tYt) this.OLrzqt.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull SettingEntryPoint settingEntryPoint, @NotNull Continuation<? super java.util.List<? extends oTB>> continuation) {
        Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> tripleAEQbTJ = this.AEQbTJ.AEQbTJ(settingEntryPoint);
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) AEQbTJ(tripleAEQbTJ.component1(), settingEntryPoint), (java.lang.Iterable) AEQbTJ(tripleAEQbTJ.component2())), (java.lang.Iterable) EZpvd(tripleAEQbTJ.component3()));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:54:0x025a */
    public final java.util.List<oTB> AEQbTJ(java.util.List<? extends ChartStyleType> list, SettingEntryPoint settingEntryPoint) {
        java.lang.Object next;
        java.lang.Object actionBar;
        java.util.List listGEmmrt;
        java.lang.Object stateListAnimator;
        java.util.List listGEmmrt2;
        if (list.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (ChartStyleType chartStyleType : list) {
            switch (StateListAnimator.KWHzl[chartStyleType.ordinal()]) {
                case 1:
                    stateListAnimator = new oTB.StateListAnimator(chartStyleType, C33070mpX.AYXKKw(C35964oKf.Fragment.OBJEWx), null, null, null, yDY.gEmmrt(C33070mpX.AYXKKw(C35964oKf.Fragment.pXZxY), C33070mpX.AYXKKw(C35964oKf.Fragment.finishInit)), pEI.EZpvd.AEQbTJ() ? 1 : 0, false, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, null);
                    break;
                case 2:
                    stateListAnimator = new oTB.TaskDescription(chartStyleType, C33070mpX.AYXKKw(C35964oKf.Fragment.fRNHEq), null, C33070mpX.AYXKKw(C35964oKf.Fragment.zbGDDc), !C36236oUh.EZpvd.fetchVPNInfo(), false, false, 100, null);
                    break;
                case 3:
                    java.lang.String strEZpvd = C36236oUh.EZpvd.EZpvd();
                    java.util.ArrayList arrayListCopydefault = yDY.copydefault(new TradeMenuItemBean(C33070mpX.AYXKKw(C35964oKf.Fragment.run), Intrinsics.EZpvd((java.lang.Object) "kline_follow_app", (java.lang.Object) strEZpvd), "kline_follow_app", null, false, null, 56, null), new TradeMenuItemBean(C33070mpX.AYXKKw(C35964oKf.Fragment.call), Intrinsics.EZpvd((java.lang.Object) "kline_white", (java.lang.Object) strEZpvd), "kline_white", null, false, null, 56, null), new TradeMenuItemBean(C33070mpX.AYXKKw(C35964oKf.Fragment.zblBkD), Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) strEZpvd), "kline_dark", null, false, null, 56, null));
                    java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.QHmsKR);
                    java.util.Iterator it = arrayListCopydefault.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((TradeMenuItemBean) next).isSelect()) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    TradeMenuItemBean tradeMenuItemBean = (TradeMenuItemBean) next;
                    stateListAnimator = new oTB.Application(chartStyleType, strAYXKKw, null, tradeMenuItemBean != null ? tradeMenuItemBean.getTitle() : null, false, arrayListCopydefault, 20, null);
                    break;
                case 4:
                    stateListAnimator = new oTB.StateListAnimator(chartStyleType, C33070mpX.AYXKKw(C35964oKf.Fragment.valueOf), null, null, yDY.gEmmrt(C33070mpX.KWHzl(C52761wXj.TaskDescription.OFhtUX), C33070mpX.KWHzl(C52761wXj.TaskDescription.DzOuPm)), null, !valueOf().isColumnChart() ? 1 : 0, false, 172, null);
                    break;
                case 5:
                    stateListAnimator = new oTB.StateListAnimator(chartStyleType, C33070mpX.AYXKKw(C35964oKf.Fragment.AYXKKw), null, null, null, yDY.gEmmrt(C33070mpX.AYXKKw(C35964oKf.Fragment.gEmmrt), C33070mpX.AYXKKw(C35964oKf.Fragment.AhwBna)), !C36236oUh.EZpvd.AwvSrB() ? 1 : 0, false, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, null);
                    break;
                case 6:
                    InterfaceC46554tYq interfaceC46554tYq = (InterfaceC46554tYq) C43251rlk.OLrzqt(InterfaceC46554tYq.class);
                    actionBar = new oTB.ActionBar(chartStyleType, C33070mpX.AYXKKw(C55688xof.Application.IntRange), interfaceC46554tYq != null ? java.lang.Integer.valueOf(interfaceC46554tYq.KWHzl()) : null);
                    continue;
                    arrayList.add(actionBar);
                    break;
                case 7:
                    if (!settingEntryPoint.OLrzqt() && pEI.EZpvd.AEQbTJ()) {
                        listGEmmrt = yDY.AhwBna();
                    } else {
                        listGEmmrt = yDY.gEmmrt(C33070mpX.KWHzl(C52761wXj.TaskDescription.hQufeQ), C33070mpX.KWHzl(C52761wXj.TaskDescription.DjWNei));
                    }
                    java.util.List list2 = listGEmmrt;
                    java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C35964oKf.Fragment.HJWChPRGtXKC);
                    pEM pem = pEM.AEQbTJ;
                    stateListAnimator = new oTB.StateListAnimator(chartStyleType, strAYXKKw2, null, java.lang.Integer.valueOf(Color.parseColor(AEQbTJ(true, pem.copydefault()))), list2, null, !pem.EZpvd() ? 1 : 0, false, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, null);
                    break;
                case 8:
                    if (!settingEntryPoint.OLrzqt() && pEI.EZpvd.AEQbTJ()) {
                        listGEmmrt2 = yDY.AhwBna();
                    } else {
                        listGEmmrt2 = yDY.gEmmrt(C33070mpX.KWHzl(C52761wXj.TaskDescription.hQufeQ), C33070mpX.KWHzl(C52761wXj.TaskDescription.DjWNei));
                    }
                    java.util.List list3 = listGEmmrt2;
                    java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C35964oKf.Fragment.HJWChPRGtXKCRGtXKC);
                    pEM pem2 = pEM.AEQbTJ;
                    stateListAnimator = new oTB.StateListAnimator(chartStyleType, strAYXKKw3, null, java.lang.Integer.valueOf(Color.parseColor(AEQbTJ(false, pem2.KWHzl()))), list3, null, !pem2.AEQbTJ() ? 1 : 0, false, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, null);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            actionBar = stateListAnimator;
            arrayList.add(actionBar);
        }
        java.util.List<oTB> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        listFJNWhG.add(0, new oTB.Activity(C33070mpX.AYXKKw(C35964oKf.Fragment.aChkwz), null, false, false, 10, null));
        return listFJNWhG;
    }

    public final java.util.List<oTB> AEQbTJ(java.util.List<? extends ChartPreferencesType> list) {
        java.lang.Object next;
        java.lang.Object application;
        java.lang.String strAYXKKw;
        java.lang.Object application2;
        java.lang.Object next2;
        if (list.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                java.util.List<oTB> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
                listFJNWhG.add(0, new oTB.Activity(C33070mpX.AYXKKw(C35964oKf.Fragment.DuR), null, true, false, 10, null));
                return listFJNWhG;
            }
            ChartPreferencesType chartPreferencesType = (ChartPreferencesType) it.next();
            switch (StateListAnimator.AEQbTJ[chartPreferencesType.ordinal()]) {
                case 1:
                    TradeMenuItemBean[] tradeMenuItemBeanArr = new TradeMenuItemBean[3];
                    java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C35964oKf.Fragment.giSNqX);
                    InterfaceC46557tYt interfaceC46557tYtAhwBna = AhwBna();
                    tradeMenuItemBeanArr[0] = new TradeMenuItemBean(strAYXKKw2, interfaceC46557tYtAhwBna != null && interfaceC46557tYtAhwBna.EZpvd() == 2, 2, null, false, C33070mpX.AYXKKw(C35964oKf.Fragment.gwTjWJ), 24, null);
                    java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C35964oKf.Fragment.WS);
                    InterfaceC46557tYt interfaceC46557tYtAhwBna2 = AhwBna();
                    tradeMenuItemBeanArr[1] = new TradeMenuItemBean(strAYXKKw3, interfaceC46557tYtAhwBna2 != null && interfaceC46557tYtAhwBna2.EZpvd() == 1, 1, null, false, C33070mpX.AYXKKw(C35964oKf.Fragment.hBpjJd), 24, null);
                    java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C35964oKf.Fragment.DCUTEIddSDPG);
                    InterfaceC46557tYt interfaceC46557tYtAhwBna3 = AhwBna();
                    tradeMenuItemBeanArr[2] = new TradeMenuItemBean(strAYXKKw4, interfaceC46557tYtAhwBna3 != null && interfaceC46557tYtAhwBna3.EZpvd() == 0, 0, null, false, C33070mpX.AYXKKw(C35964oKf.Fragment.QkdxfA), 24, null);
                    java.util.ArrayList arrayListCopydefault = yDY.copydefault(tradeMenuItemBeanArr);
                    arrayListCopydefault.add(new TradeMenuItemBean("", false, "", null, false, "", 26, null));
                    java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C35964oKf.Fragment.DCUTEI);
                    java.util.Iterator it2 = arrayListCopydefault.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (((TradeMenuItemBean) next).isSelect()) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    TradeMenuItemBean tradeMenuItemBean = (TradeMenuItemBean) next;
                    application = new oTB.Application(chartPreferencesType, strAYXKKw5, null, tradeMenuItemBean != null ? tradeMenuItemBean.getTitle() : null, false, arrayListCopydefault, 20, null);
                    break;
                case 2:
                    boolean z = C36236oUh.EZpvd.OLrzqt() == 0;
                    java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C35964oKf.Fragment.DaRZkR);
                    if (z) {
                        strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.DsrFlB);
                    } else {
                        strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.DGgnkA);
                    }
                    application2 = new oTB.Application(chartPreferencesType, strAYXKKw6, null, strAYXKKw, false, null, 52, null);
                    continue;
                    arrayList.add(application2);
                    break;
                case 3:
                    int iAEQbTJ = C36236oUh.EZpvd.AEQbTJ();
                    TradeMenuItemBean[] tradeMenuItemBeanArr2 = new TradeMenuItemBean[3];
                    tradeMenuItemBeanArr2[0] = new TradeMenuItemBean(C33070mpX.AYXKKw(C35964oKf.Fragment.fXHmeK), iAEQbTJ == 0, 0, null, false, null, 56, null);
                    tradeMenuItemBeanArr2[1] = new TradeMenuItemBean(C33070mpX.AYXKKw(C35964oKf.Fragment.fLIjIY), iAEQbTJ == 1, 1, null, false, null, 56, null);
                    tradeMenuItemBeanArr2[2] = new TradeMenuItemBean(C33070mpX.AYXKKw(C35964oKf.Fragment.apNbdB), iAEQbTJ == 2, 2, null, false, null, 56, null);
                    java.util.List listGEmmrt = yDY.gEmmrt(tradeMenuItemBeanArr2);
                    java.lang.String strAYXKKw7 = C33070mpX.AYXKKw(C35964oKf.Fragment.dvImUD);
                    java.util.Iterator it3 = listGEmmrt.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (((TradeMenuItemBean) next2).isSelect()) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    TradeMenuItemBean tradeMenuItemBean2 = (TradeMenuItemBean) next2;
                    application = new oTB.Application(chartPreferencesType, strAYXKKw7, null, tradeMenuItemBean2 != null ? tradeMenuItemBean2.getTitle() : null, false, listGEmmrt, 20, null);
                    break;
                case 4:
                    java.lang.String strAYXKKw8 = C33070mpX.AYXKKw(C35964oKf.Fragment.BVXAa);
                    java.lang.String strAYXKKw9 = C33070mpX.AYXKKw(C35964oKf.Fragment.HJWChPRGtXKCDKRTZD);
                    C36236oUh c36236oUh = C36236oUh.EZpvd;
                    application2 = new oTB.TaskDescription(chartPreferencesType, strAYXKKw8, null, strAYXKKw9, c36236oUh.KWHzl(valueOf().getMode()), false, c36236oUh.gEmmrt(), 36, null);
                    continue;
                    arrayList.add(application2);
                    break;
                case 5:
                    java.lang.String strAYXKKw10 = C33070mpX.AYXKKw(C35964oKf.Fragment.iqeXgQ);
                    java.lang.String strAYXKKw11 = C33070mpX.AYXKKw(C35964oKf.Fragment.HJWChPUUMfbK);
                    C36236oUh c36236oUh2 = C36236oUh.EZpvd;
                    application2 = new oTB.TaskDescription(chartPreferencesType, strAYXKKw10, null, strAYXKKw11, c36236oUh2.OLrzqt(valueOf().getMode()), false, c36236oUh2.copydefault(), 36, null);
                    continue;
                    arrayList.add(application2);
                    break;
                case 6:
                    application2 = new oTB.TaskDescription(chartPreferencesType, C33070mpX.AYXKKw(C35964oKf.Fragment.gqESXP), null, null, C36236oUh.EZpvd.AkhnZx(), false, false, 108, null);
                    continue;
                    arrayList.add(application2);
                    break;
                case 7:
                    application2 = new oTB.TaskDescription(chartPreferencesType, C33070mpX.AYXKKw(C35964oKf.Fragment.ilfrrN), null, null, C36236oUh.EZpvd.fJNWhG(), false, false, 108, null);
                    continue;
                    arrayList.add(application2);
                    break;
                case 8:
                    application2 = new oTB.TaskDescription(chartPreferencesType, C33070mpX.AYXKKw(C35964oKf.Fragment.dtVxwd), null, null, C36236oUh.EZpvd.DbNXlk(), false, false, 108, null);
                    continue;
                    arrayList.add(application2);
                    break;
                case 9:
                    application2 = new oTB.TaskDescription(chartPreferencesType, C33070mpX.AYXKKw(C35964oKf.Fragment.NRYds), null, C33070mpX.AYXKKw(C35964oKf.Fragment.GPCHlQ), C36236oUh.EZpvd.AhwBna(), false, false, 100, null);
                    continue;
                    arrayList.add(application2);
                    break;
                case 10:
                    application2 = new oTB.TaskDescription(chartPreferencesType, C33070mpX.AYXKKw(C35964oKf.Fragment.gVEiQJ), C33070mpX.AYXKKw(C35964oKf.Fragment.aQtmcU), C33070mpX.AYXKKw(C35964oKf.Fragment.fsw), C36236oUh.EZpvd.valueOf(), false, false, 96, null);
                    continue;
                    arrayList.add(application2);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            application2 = application;
            arrayList.add(application2);
        }
    }

    public final java.util.List<oTB> EZpvd(java.util.List<? extends OthersType> list) {
        java.lang.Object taskDescription;
        if (list.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (OthersType othersType : list) {
            int i = StateListAnimator.copydefault[othersType.ordinal()];
            if (i == 1) {
                taskDescription = new oTB.TaskDescription(othersType, C33070mpX.AYXKKw(C35964oKf.Fragment.GLcwwN), null, C33070mpX.AYXKKw(C35964oKf.Fragment.fTEjYi), C36236oUh.EZpvd.gHZMYf(), false, false, 100, null);
            } else if (i == 2) {
                taskDescription = new oTB.TaskDescription(othersType, C33070mpX.AYXKKw(C35964oKf.Fragment.OgHfcT), null, C33069mpW.copydefault(C35964oKf.Fragment.ORWKdN, C56424yEw.AYXKKw(C56390yDp.OLrzqt("num", xMR.copydefault.copydefault("50")))), C36236oUh.EZpvd.AuCTel(), false, false, 100, null);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                taskDescription = new oTB.Application(othersType, C33070mpX.AYXKKw(C35964oKf.Fragment.YqksP), null, null, false, null, 60, null);
            }
            arrayList.add(taskDescription);
        }
        java.util.List<oTB> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        listFJNWhG.add(0, new oTB.Activity(C33070mpX.AYXKKw(C35964oKf.Fragment.EZpvd), null, true, false, 10, null));
        return listFJNWhG;
    }

    public final java.lang.String AEQbTJ(boolean z, java.lang.String str) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        int iIZzfmt = z ? c36246oUrCopydefault.iZzfmt() : c36246oUrCopydefault.giSNqX();
        if (str.length() == 0) {
            return copydefault(iIZzfmt);
        }
        java.lang.String strCopydefault = pDT.Companion.KWHzl().copydefault(str);
        return strCopydefault == null ? copydefault(iIZzfmt) : strCopydefault;
    }

    public final java.lang.String copydefault(int i) {
        java.lang.String str = java.lang.String.format("#%06X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i & 16777215)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
