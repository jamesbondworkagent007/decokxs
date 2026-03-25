package o;

import com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverOverallTrendPo;
import com.okinc.market.discover.features.markets.sub.overview.domain.GetMarketDiscoverOverallTrendUseCase$onExecute$1;
import com.okinc.market.discover.features.markets.sub.overview.domain.GetMarketDiscoverOverallTrendUseCase$onExecute$2;
import com.okinc.market.discover.features.markets.sub.overview.ui.MarketDiscoverOverallTrendPeriod;
import com.okinc.market.discover.features.markets.sub.overview.ui.MarketDiscoverOverallType;
import com.okinc.trade.arch.domain.IUseCaseDistinct;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qfa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40842qfa extends AbstractC49400uno<Triple<? extends MarketDiscoverOverallType, ? extends MarketDiscoverOverallTrendPeriod, ? extends java.lang.String>, C41092qkL> {
    public final InterfaceC54577xNn KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final C40786qeX copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.qfa$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MarketDiscoverOverallType.values().length];
            try {
                iArr[MarketDiscoverOverallType.CAPACITY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MarketDiscoverOverallType.VOLUME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketDiscoverOverallType.SHARE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((Triple<? extends MarketDiscoverOverallType, ? extends MarketDiscoverOverallTrendPeriod, java.lang.String>) obj, (Continuation<? super C41092qkL>) continuation);
    }

    @yCM
    public C40842qfa(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40786qeX c40786qeX, InterfaceC54577xNn interfaceC54577xNn) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40786qeX, "");
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = c40786qeX;
        this.KWHzl = interfaceC54577xNn;
    }

    /* JADX INFO: renamed from: o.qfa$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qfa.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[PHI: r11
  0x0080: PHI (r11v6 java.lang.Object) = (r11v4 java.lang.Object), (r11v1 java.lang.Object) binds: [B:25:0x007d, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Triple<? extends MarketDiscoverOverallType, ? extends MarketDiscoverOverallTrendPeriod, java.lang.String> triple, @NotNull Continuation<? super C41092qkL> continuation) throws java.lang.Throwable {
        GetMarketDiscoverOverallTrendUseCase$onExecute$1 getMarketDiscoverOverallTrendUseCase$onExecute$1;
        C40842qfa c40842qfa;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        if (continuation instanceof GetMarketDiscoverOverallTrendUseCase$onExecute$1) {
            getMarketDiscoverOverallTrendUseCase$onExecute$1 = (GetMarketDiscoverOverallTrendUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverOverallTrendUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverOverallTrendUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverOverallTrendUseCase$onExecute$1 = new GetMarketDiscoverOverallTrendUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objDistinct$default = getMarketDiscoverOverallTrendUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverOverallTrendUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objDistinct$default);
            InterfaceC54577xNn interfaceC54577xNn = this.KWHzl;
            if (interfaceC54577xNn != null) {
                getMarketDiscoverOverallTrendUseCase$onExecute$1.L$0 = this;
                getMarketDiscoverOverallTrendUseCase$onExecute$1.L$1 = triple;
                getMarketDiscoverOverallTrendUseCase$onExecute$1.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, null, getMarketDiscoverOverallTrendUseCase$onExecute$1, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                c40842qfa = this;
            } else {
                c40842qfa = this;
                java.lang.String string = triple.toString();
                GetMarketDiscoverOverallTrendUseCase$onExecute$2 getMarketDiscoverOverallTrendUseCase$onExecute$2 = new GetMarketDiscoverOverallTrendUseCase$onExecute$2(triple, c40842qfa, null);
                getMarketDiscoverOverallTrendUseCase$onExecute$1.L$0 = null;
                getMarketDiscoverOverallTrendUseCase$onExecute$1.L$1 = null;
                getMarketDiscoverOverallTrendUseCase$onExecute$1.label = 2;
                objDistinct$default = IUseCaseDistinct.TaskDescription.distinct$default(c40842qfa, (IUseCaseDistinct.DistinctStrategy) null, string, getMarketDiscoverOverallTrendUseCase$onExecute$2, getMarketDiscoverOverallTrendUseCase$onExecute$1, 1, (java.lang.Object) null);
                return objDistinct$default != objCopydefault ? objCopydefault : objDistinct$default;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objDistinct$default);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            triple = (Triple) getMarketDiscoverOverallTrendUseCase$onExecute$1.L$1;
            c40842qfa = (C40842qfa) getMarketDiscoverOverallTrendUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objDistinct$default);
            objM8790ensureInitialize0E7RQCE$default = ((Result) objDistinct$default).m7386unboximpl();
        }
        Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default);
        java.lang.String string2 = triple.toString();
        GetMarketDiscoverOverallTrendUseCase$onExecute$2 getMarketDiscoverOverallTrendUseCase$onExecute$22 = new GetMarketDiscoverOverallTrendUseCase$onExecute$2(triple, c40842qfa, null);
        getMarketDiscoverOverallTrendUseCase$onExecute$1.L$0 = null;
        getMarketDiscoverOverallTrendUseCase$onExecute$1.L$1 = null;
        getMarketDiscoverOverallTrendUseCase$onExecute$1.label = 2;
        objDistinct$default = IUseCaseDistinct.TaskDescription.distinct$default(c40842qfa, (IUseCaseDistinct.DistinctStrategy) null, string2, getMarketDiscoverOverallTrendUseCase$onExecute$22, getMarketDiscoverOverallTrendUseCase$onExecute$1, 1, (java.lang.Object) null);
        if (objDistinct$default != objCopydefault) {
        }
    }

    public final java.util.List<MarketDiscoverOverallTrendPo.LineChartItemPo> EZpvd(MarketDiscoverOverallType marketDiscoverOverallType, java.util.List<MarketDiscoverOverallTrendPo.LineChartItemPo> list) {
        Function1 function1;
        InterfaceC54577xNn interfaceC54577xNn = this.KWHzl;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = interfaceC54577xNn != null ? interfaceC54577xNn.OLrzqt() : null;
        if (interfaceC54581xNrOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("GetMarketOverallTrendUseCase tradeCore is null".toString());
        }
        final xMW xmwKWHzl = interfaceC54581xNrOLrzqt.KWHzl();
        int i = TaskDescription.KWHzl[marketDiscoverOverallType.ordinal()];
        if (i == 1 || i == 2) {
            function1 = new Function1() { // from class: o.qeZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40842qfa.KWHzl(xmwKWHzl, (java.lang.String) obj);
                }
            };
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            function1 = new Function1() { // from class: o.qfd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40842qfa.OLrzqt((java.lang.String) obj);
                }
            };
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (MarketDiscoverOverallTrendPo.LineChartItemPo lineChartItemPo : list) {
            arrayList.add(MarketDiscoverOverallTrendPo.LineChartItemPo.copy$default(lineChartItemPo, null, (java.lang.String) function1.invoke(lineChartItemPo.getValue()), 1, null));
        }
        return CollectionsKt___CollectionsKt.EZpvd(arrayList, new Application());
    }

    public static final java.lang.String KWHzl(xMW xmw, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd(C33129mqd.EZpvd(xmw.AhwBna("1")), BigDecimal.ZERO) ? str : xmw.AhwBna(str);
    }

    /* JADX INFO: renamed from: o.qfa$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(C33129mqd.EZpvd(((MarketDiscoverOverallTrendPo.LineChartItemPo) t).getTs()), C33129mqd.EZpvd(((MarketDiscoverOverallTrendPo.LineChartItemPo) t2).getTs()));
        }
    }
}
