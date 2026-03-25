package o;

import com.okinc.market.quotation.data.model.stock.StockListPo;
import com.okinc.market.quotation.data.model.stock.StockTokenPo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.noM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35066noM implements InterfaceC49405unt<C35065noL, java.util.List<? extends C35069noP>> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final InterfaceC54577xNn AEQbTJ;
    public final InterfaceC46557tYt EZpvd;

    @yCM
    public C35066noM(@NotNull InterfaceC46557tYt interfaceC46557tYt, InterfaceC54577xNn interfaceC54577xNn) {
        Intrinsics.checkNotNullParameter(interfaceC46557tYt, "");
        this.EZpvd = interfaceC46557tYt;
        this.AEQbTJ = interfaceC54577xNn;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Ljava/lang/Object; */
    public java.util.List<C35069noP> OLrzqt(@NotNull C35065noL c35065noL) {
        return (java.util.List) InterfaceC49405unt.Activity.EZpvd(this, c35065noL);
    }

    /* JADX INFO: renamed from: o.noM$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.noM.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    public java.util.List<C35069noP> AEQbTJ(@NotNull C35065noL c35065noL) {
        java.util.List<StockTokenPo> futures;
        Intrinsics.checkNotNullParameter(c35065noL, "");
        java.util.List<C35069noP> listAEQbTJ = c35065noL.AEQbTJ();
        StockListPo stockListPoCopydefault = c35065noL.copydefault();
        java.lang.String strEZpvd = c35065noL.EZpvd();
        java.util.Map<java.lang.String, TickersData> mapOLrzqt = c35065noL.OLrzqt();
        pUU.EZpvd("ApplyHomeStockTickerUseCase", "apply stock tickers, [voList: " + listAEQbTJ.size() + ", spot: " + stockListPoCopydefault.getSpot().size() + ", futures: " + stockListPoCopydefault.getFutures().size() + ", bizType: " + strEZpvd + ", cupTickerMapSize: " + (mapOLrzqt != null ? java.lang.Integer.valueOf(mapOLrzqt.size()) : null) + "]");
        if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) "SPOT")) {
            futures = stockListPoCopydefault.getSpot();
        } else {
            futures = stockListPoCopydefault.getFutures();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(futures, 10)), 16));
        for (java.lang.Object obj : futures) {
            linkedHashMap.put(((StockTokenPo) obj).getInstId(), obj);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            arrayList.add(OLrzqt((C35069noP) it.next(), linkedHashMap, mapOLrzqt));
        }
        return arrayList;
    }

    public final C35069noP OLrzqt(C35069noP c35069noP, java.util.Map<java.lang.String, StockTokenPo> map, java.util.Map<java.lang.String, TickersData> map2) {
        java.lang.String changePerDay24h;
        TickersData tickersData;
        TickersData tickersData2;
        StockTokenPo stockTokenPo = map.get(c35069noP.AhwBna());
        if (stockTokenPo == null) {
            return c35069noP;
        }
        java.lang.String lastPrice = stockTokenPo.getLastPrice();
        int iEZpvd = this.EZpvd.EZpvd();
        if (iEZpvd == 0) {
            changePerDay24h = stockTokenPo.getChangePerDay24h();
        } else if (iEZpvd == 1) {
            changePerDay24h = stockTokenPo.getChangePerDayUtc0();
        } else if (iEZpvd == 2) {
            changePerDay24h = stockTokenPo.getChangePerDayUtc8();
        } else {
            changePerDay24h = stockTokenPo.getChangePerDay24h();
        }
        java.lang.String str = changePerDay24h;
        java.lang.String volume = stockTokenPo.getVolume();
        java.lang.String last = (map2 == null || (tickersData2 = map2.get(c35069noP.copydefault())) == null) ? null : tickersData2.getLast();
        java.lang.String last2 = (map2 == null || (tickersData = map2.get(c35069noP.gEmmrt())) == null) ? null : tickersData.getLast();
        return c35069noP.AEQbTJ(lastPrice, str, volume, last, last2, AEQbTJ(stockTokenPo.getLastPrice(), last2, last));
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC54577xNn interfaceC54577xNn = this.AEQbTJ;
        if (interfaceC54577xNn != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
            java.lang.String tickerPrice$default = xTM.formatTickerPrice$default(xTM.AEQbTJ, str, str2, str3, interfaceC54581xNrOLrzqt, false, 16, null);
            if (tickerPrice$default.length() > 0) {
                return pTF.KWHzl.AEQbTJ(tickerPrice$default);
            }
        }
        return null;
    }
}
