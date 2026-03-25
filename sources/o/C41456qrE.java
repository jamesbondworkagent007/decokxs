package o;

import com.okinc.market.quotation.data.model.PeriodTickersPo;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC41638qub;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41456qrE extends AbstractC49400uno<C41458qrG, java.util.List<? extends InterfaceC41638qub>> {
    private static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher EZpvd;
    public final C41446qqv KWHzl;
    public final InterfaceC46557tYt copydefault;

    /* JADX INFO: renamed from: o.qrE$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PeriodEnum.values().length];
            try {
                iArr[PeriodEnum.RANKING_PERIOD_5M.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PeriodEnum.RANKING_PERIOD_1H.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PeriodEnum.RANKING_PERIOD_1D.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PeriodEnum.RANKING_PERIOD_1W.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[PeriodEnum.RANKING_PERIOD_1M.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((C41458qrG) obj, (Continuation<? super java.util.List<? extends InterfaceC41638qub>>) continuation);
    }

    @yCM
    public C41456qrE(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41446qqv c41446qqv, @NotNull InterfaceC46557tYt interfaceC46557tYt) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41446qqv, "");
        Intrinsics.checkNotNullParameter(interfaceC46557tYt, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = c41446qqv;
        this.copydefault = interfaceC46557tYt;
    }

    /* JADX INFO: renamed from: o.qrE$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qrE.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.Object EZpvd(@NotNull C41458qrG c41458qrG, @NotNull Continuation<? super java.util.List<? extends InterfaceC41638qub>> continuation) {
        java.lang.String changePercent5m;
        java.lang.String turnOver5m;
        java.util.List<InterfaceC41638qub> listCopydefault = c41458qrG.copydefault();
        java.util.Map<java.lang.String, PeriodTickersPo> mapOLrzqt = c41458qrG.OLrzqt();
        java.util.Map<java.lang.String, TickersData> mapEZpvd = c41458qrG.EZpvd();
        PeriodEnum periodEnumKWHzl = c41458qrG.KWHzl();
        C41434qqj.KWHzl.KWHzl("ApplyFuturesPeriodTickerUseCase", "apply period tickers [period=" + periodEnumKWHzl + ", periodTickersSize=" + mapOLrzqt.size() + ", cupTickersSize=" + mapEZpvd.size() + ", futuresSize=" + listCopydefault.size() + "]");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        for (InterfaceC41638qub interfaceC41638qubOnCopy$default : listCopydefault) {
            PeriodTickersPo periodTickersPoAEQbTJ = mapOLrzqt.get(interfaceC41638qubOnCopy$default.values().getInstId());
            if (periodTickersPoAEQbTJ == null) {
                periodTickersPoAEQbTJ = this.KWHzl.AEQbTJ(interfaceC41638qubOnCopy$default.values().getInstId());
            }
            if (periodTickersPoAEQbTJ != null) {
                int[] iArr = ActionBar.OLrzqt;
                int i = iArr[periodEnumKWHzl.ordinal()];
                if (i == 1) {
                    changePercent5m = periodTickersPoAEQbTJ.getChangePercent5m();
                } else if (i == 2) {
                    changePercent5m = periodTickersPoAEQbTJ.getChangePercent1h();
                } else if (i == 3) {
                    InterfaceC46557tYt interfaceC46557tYt = this.copydefault;
                    java.lang.String changePercent24h = periodTickersPoAEQbTJ.getChangePercent24h();
                    if (changePercent24h == null) {
                        changePercent24h = "";
                    }
                    java.lang.String changePercent1DUtc0 = periodTickersPoAEQbTJ.getChangePercent1DUtc0();
                    if (changePercent1DUtc0 == null) {
                        changePercent1DUtc0 = "";
                    }
                    java.lang.String changePercent1DUtc8 = periodTickersPoAEQbTJ.getChangePercent1DUtc8();
                    if (changePercent1DUtc8 == null) {
                        changePercent1DUtc8 = "";
                    }
                    changePercent5m = interfaceC46557tYt.OLrzqt(changePercent24h, changePercent1DUtc0, changePercent1DUtc8);
                } else if (i == 4) {
                    InterfaceC46557tYt interfaceC46557tYt2 = this.copydefault;
                    java.lang.String changePercent1wUtc0 = periodTickersPoAEQbTJ.getChangePercent1wUtc0();
                    if (changePercent1wUtc0 == null) {
                        changePercent1wUtc0 = "";
                    }
                    java.lang.String changePercent1wUtc02 = periodTickersPoAEQbTJ.getChangePercent1wUtc0();
                    if (changePercent1wUtc02 == null) {
                        changePercent1wUtc02 = "";
                    }
                    java.lang.String changePercent1wUtc8 = periodTickersPoAEQbTJ.getChangePercent1wUtc8();
                    if (changePercent1wUtc8 == null) {
                        changePercent1wUtc8 = "";
                    }
                    changePercent5m = interfaceC46557tYt2.OLrzqt(changePercent1wUtc0, changePercent1wUtc02, changePercent1wUtc8);
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC46557tYt interfaceC46557tYt3 = this.copydefault;
                    java.lang.String changePercent1MUtc0 = periodTickersPoAEQbTJ.getChangePercent1MUtc0();
                    java.lang.String str = changePercent1MUtc0 == null ? "" : changePercent1MUtc0;
                    java.lang.String changePercent1MUtc02 = periodTickersPoAEQbTJ.getChangePercent1MUtc0();
                    java.lang.String str2 = changePercent1MUtc02 == null ? "" : changePercent1MUtc02;
                    java.lang.String changePercent1MUtc8 = periodTickersPoAEQbTJ.getChangePercent1MUtc8();
                    changePercent5m = interfaceC46557tYt3.OLrzqt(str, str2, changePercent1MUtc8 == null ? "" : changePercent1MUtc8);
                }
                int i2 = iArr[periodEnumKWHzl.ordinal()];
                if (i2 == 1) {
                    turnOver5m = periodTickersPoAEQbTJ.getTurnOver5m();
                } else if (i2 == 2) {
                    turnOver5m = periodTickersPoAEQbTJ.getTurnOver1h();
                } else if (i2 == 3) {
                    turnOver5m = periodTickersPoAEQbTJ.getTurnOver24h();
                } else if (i2 == 4) {
                    InterfaceC46557tYt interfaceC46557tYt4 = this.copydefault;
                    java.lang.String turnOver1wUtc0 = periodTickersPoAEQbTJ.getTurnOver1wUtc0();
                    if (turnOver1wUtc0 == null) {
                        turnOver1wUtc0 = "";
                    }
                    java.lang.String turnOver1wUtc02 = periodTickersPoAEQbTJ.getTurnOver1wUtc0();
                    if (turnOver1wUtc02 == null) {
                        turnOver1wUtc02 = "";
                    }
                    java.lang.String turnOver1wUtc8 = periodTickersPoAEQbTJ.getTurnOver1wUtc8();
                    turnOver5m = interfaceC46557tYt4.OLrzqt(turnOver1wUtc0, turnOver1wUtc02, turnOver1wUtc8 != null ? turnOver1wUtc8 : "");
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC46557tYt interfaceC46557tYt5 = this.copydefault;
                    java.lang.String turnOver1MUtc0 = periodTickersPoAEQbTJ.getTurnOver1MUtc0();
                    if (turnOver1MUtc0 == null) {
                        turnOver1MUtc0 = "";
                    }
                    java.lang.String turnOver1MUtc02 = periodTickersPoAEQbTJ.getTurnOver1MUtc0();
                    if (turnOver1MUtc02 == null) {
                        turnOver1MUtc02 = "";
                    }
                    java.lang.String turnOver1MUtc8 = periodTickersPoAEQbTJ.getTurnOver1MUtc8();
                    turnOver5m = interfaceC46557tYt5.OLrzqt(turnOver1MUtc0, turnOver1MUtc02, turnOver1MUtc8 != null ? turnOver1MUtc8 : "");
                }
                interfaceC41638qubOnCopy$default = InterfaceC41638qub.ActionBar.onCopy$default(interfaceC41638qubOnCopy$default, changePercent5m != null ? C56443yFo.AEQbTJ(C33129mqd.AEQbTJ(changePercent5m)) : null, C56443yFo.AEQbTJ(C33129mqd.AEQbTJ(periodTickersPoAEQbTJ.getPrice())), copydefault(periodTickersPoAEQbTJ.getPrice(), mapEZpvd.get(interfaceC41638qubOnCopy$default.values().getQuoteSymbol())), null, turnOver5m != null ? C33129mqd.EZpvd(turnOver5m) : null, null, periodEnumKWHzl.getInputPara(), 40, null);
            } else {
                C41434qqj.w$default(C41434qqj.KWHzl, "ApplyFuturesPeriodTickerUseCase", "ticker not found for " + interfaceC41638qubOnCopy$default.values().getInstId() + ", keep original data", null, 4, null);
            }
            arrayList.add(interfaceC41638qubOnCopy$default);
        }
        return arrayList;
    }

    public final java.lang.Double copydefault(java.lang.String str, TickersData tickersData) {
        if (str == null || tickersData == null) {
            return null;
        }
        return java.lang.Double.valueOf(C33129mqd.AEQbTJ(str) * C33129mqd.AEQbTJ(tickersData.getLast()));
    }
}
