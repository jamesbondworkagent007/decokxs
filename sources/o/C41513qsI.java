package o;

import com.okinc.market.quotation.data.model.PeriodTickersPo;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC41641que;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41513qsI extends AbstractC49400uno<C41516qsL, java.util.List<? extends InterfaceC41641que>> {
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final C41446qqv KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final InterfaceC46557tYt copydefault;

    /* JADX INFO: renamed from: o.qsI$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

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
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public C41513qsI(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41446qqv c41446qqv, @NotNull InterfaceC46557tYt interfaceC46557tYt) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41446qqv, "");
        Intrinsics.checkNotNullParameter(interfaceC46557tYt, "");
        this.OLrzqt = coroutineDispatcher;
        this.KWHzl = c41446qqv;
        this.copydefault = interfaceC46557tYt;
    }

    /* JADX INFO: renamed from: o.qsI$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsI.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull C41516qsL c41516qsL, @NotNull Continuation<? super java.util.List<? extends InterfaceC41641que>> continuation) {
        java.util.Iterator it;
        java.lang.String changePercent5m;
        java.lang.String turnOver5m;
        C41513qsI c41513qsI = this;
        java.util.List<InterfaceC41641que> listEZpvd = c41516qsL.EZpvd();
        java.util.Map<java.lang.String, PeriodTickersPo> mapOLrzqt = c41516qsL.OLrzqt();
        java.util.Map<java.lang.String, TickersData> mapKWHzl = c41516qsL.KWHzl();
        PeriodEnum periodEnumAEQbTJ = c41516qsL.AEQbTJ();
        C41434qqj.KWHzl.KWHzl("ApplySpotPeriodTickerUseCase", "apply period tickers [period=" + periodEnumAEQbTJ + ", periodTickersSize=" + mapOLrzqt.size() + ", cupTickersSize=" + mapKWHzl.size() + ", spotSize=" + listEZpvd.size() + "]");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator it2 = listEZpvd.iterator();
        while (it2.hasNext()) {
            InterfaceC41641que interfaceC41641queOnCopy$default = (InterfaceC41641que) it2.next();
            PeriodTickersPo periodTickersPoAEQbTJ = mapOLrzqt.get(interfaceC41641queOnCopy$default.values().getInstId());
            if (periodTickersPoAEQbTJ == null) {
                periodTickersPoAEQbTJ = c41513qsI.KWHzl.AEQbTJ(interfaceC41641queOnCopy$default.values().getInstId());
            }
            if (periodTickersPoAEQbTJ != null) {
                int[] iArr = Application.KWHzl;
                int i = iArr[periodEnumAEQbTJ.ordinal()];
                if (i == 1) {
                    changePercent5m = periodTickersPoAEQbTJ.getChangePercent5m();
                } else if (i == 2) {
                    changePercent5m = periodTickersPoAEQbTJ.getChangePercent1h();
                } else if (i == 3) {
                    InterfaceC46557tYt interfaceC46557tYt = c41513qsI.copydefault;
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
                    InterfaceC46557tYt interfaceC46557tYt2 = c41513qsI.copydefault;
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
                    InterfaceC46557tYt interfaceC46557tYt3 = c41513qsI.copydefault;
                    java.lang.String changePercent1MUtc0 = periodTickersPoAEQbTJ.getChangePercent1MUtc0();
                    if (changePercent1MUtc0 == null) {
                        changePercent1MUtc0 = "";
                    }
                    java.lang.String changePercent1MUtc02 = periodTickersPoAEQbTJ.getChangePercent1MUtc0();
                    java.lang.String str = changePercent1MUtc02 == null ? "" : changePercent1MUtc02;
                    java.lang.String changePercent1MUtc8 = periodTickersPoAEQbTJ.getChangePercent1MUtc8();
                    changePercent5m = interfaceC46557tYt3.OLrzqt(changePercent1MUtc0, str, changePercent1MUtc8 == null ? "" : changePercent1MUtc8);
                }
                int i2 = iArr[periodEnumAEQbTJ.ordinal()];
                if (i2 == 1) {
                    turnOver5m = periodTickersPoAEQbTJ.getTurnOver5m();
                } else if (i2 == 2) {
                    turnOver5m = periodTickersPoAEQbTJ.getTurnOver1h();
                } else if (i2 == 3) {
                    turnOver5m = periodTickersPoAEQbTJ.getTurnOver24h();
                } else if (i2 == 4) {
                    InterfaceC46557tYt interfaceC46557tYt4 = c41513qsI.copydefault;
                    java.lang.String turnOver1wUtc0 = periodTickersPoAEQbTJ.getTurnOver1wUtc0();
                    if (turnOver1wUtc0 == null) {
                        turnOver1wUtc0 = "";
                    }
                    java.lang.String turnOver1wUtc02 = periodTickersPoAEQbTJ.getTurnOver1wUtc0();
                    if (turnOver1wUtc02 == null) {
                        turnOver1wUtc02 = "";
                    }
                    java.lang.String turnOver1wUtc8 = periodTickersPoAEQbTJ.getTurnOver1wUtc8();
                    if (turnOver1wUtc8 == null) {
                        turnOver1wUtc8 = "";
                    }
                    turnOver5m = interfaceC46557tYt4.OLrzqt(turnOver1wUtc0, turnOver1wUtc02, turnOver1wUtc8);
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC46557tYt interfaceC46557tYt5 = c41513qsI.copydefault;
                    java.lang.String turnOver1MUtc0 = periodTickersPoAEQbTJ.getTurnOver1MUtc0();
                    if (turnOver1MUtc0 == null) {
                        turnOver1MUtc0 = "";
                    }
                    java.lang.String turnOver1MUtc02 = periodTickersPoAEQbTJ.getTurnOver1MUtc0();
                    if (turnOver1MUtc02 == null) {
                        turnOver1MUtc02 = "";
                    }
                    java.lang.String turnOver1MUtc8 = periodTickersPoAEQbTJ.getTurnOver1MUtc8();
                    if (turnOver1MUtc8 == null) {
                        turnOver1MUtc8 = "";
                    }
                    turnOver5m = interfaceC46557tYt5.OLrzqt(turnOver1MUtc0, turnOver1MUtc02, turnOver1MUtc8);
                }
                java.lang.Double dEZpvd = c41513qsI.EZpvd(periodTickersPoAEQbTJ.getPrice(), mapKWHzl.get(interfaceC41641queOnCopy$default.values().getQuoteSymbol()));
                C41434qqj c41434qqj = C41434qqj.KWHzl;
                java.lang.String instId = interfaceC41641queOnCopy$default.values().getInstId();
                java.lang.String price = periodTickersPoAEQbTJ.getPrice();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                it = it2;
                sb.append("apply ticker to ");
                sb.append(instId);
                sb.append(" [price=");
                sb.append(price);
                sb.append(", change=");
                sb.append(changePercent5m);
                sb.append(", turnOver=");
                sb.append(turnOver5m);
                sb.append(", subPrice=");
                sb.append(dEZpvd);
                sb.append("]");
                c41434qqj.AEQbTJ("ApplySpotPeriodTickerUseCase", sb.toString());
                double dAEQbTJ = C33129mqd.AEQbTJ(periodTickersPoAEQbTJ.getPrice());
                java.lang.Double dAEQbTJ2 = changePercent5m != null ? C56443yFo.AEQbTJ(C33129mqd.AEQbTJ(changePercent5m)) : null;
                BigDecimal bigDecimalEZpvd = turnOver5m != null ? C33129mqd.EZpvd(turnOver5m) : null;
                interfaceC41641queOnCopy$default = InterfaceC41641que.Application.onCopy$default(interfaceC41641queOnCopy$default, dAEQbTJ2, C56443yFo.AEQbTJ(dAEQbTJ), dEZpvd, null, bigDecimalEZpvd, null, periodEnumAEQbTJ.getInputPara(), 40, null);
            } else {
                it = it2;
                C41434qqj.w$default(C41434qqj.KWHzl, "ApplySpotPeriodTickerUseCase", "ticker not found for " + interfaceC41641queOnCopy$default.values().getInstId() + ", keep original data", null, 4, null);
            }
            arrayList.add(interfaceC41641queOnCopy$default);
            c41513qsI = this;
            it2 = it;
        }
        return arrayList;
    }

    private final java.lang.Double EZpvd(java.lang.String str, TickersData tickersData) {
        if (str == null || tickersData == null) {
            return null;
        }
        return java.lang.Double.valueOf(C33129mqd.AEQbTJ(str) * C33129mqd.AEQbTJ(tickersData.getLast()));
    }
}
