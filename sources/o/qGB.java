package o;

import com.okinc.im.bean.SearchResultData;
import com.okinc.market.search.features.main.root.data.datasource.impl.MainSearchSourceImpl$searchIMChats$1;
import com.okinc.market.search.features.main.root.data.po.SearchResultBotsTradersWeb3Po;
import com.okinc.market.search.features.main.root.data.po.SearchResultEarnProductPo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.reactive.AwaitKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qGB {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qGC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return qGB.AEQbTJ();
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qGA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return qGB.KWHzl();
        }
    });
    public final InterfaceC46557tYt copydefault;

    @yCM
    public qGB(InterfaceC46557tYt interfaceC46557tYt) {
        this.copydefault = interfaceC46557tYt;
    }

    public static final qGD AEQbTJ() {
        return (qGD) C38416pXz.copydefault(C56524yIo.AEQbTJ(qGD.class));
    }

    public final qGD AYXKKw() {
        return (qGD) this.EZpvd.getValue();
    }

    public static final BizApiService KWHzl() {
        return (BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class));
    }

    public final BizApiService OLrzqt() {
        return (BizApiService) this.KWHzl.getValue();
    }

    public final InterfaceC35180nqU AhwBna() {
        return (InterfaceC35180nqU) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC35180nqU.class));
    }

    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<SearchResultBotsTradersWeb3Po>> continuation) {
        return AYXKKw().OLrzqt(str, continuation);
    }

    public java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<SearchResultEarnProductPo>> continuation) {
        return AYXKKw().copydefault(continuation);
    }

    public java.lang.Object EZpvd(@NotNull Continuation<? super ResponseData<java.util.List<TickersData>>> continuation) {
        return AwaitKt.awaitFirstOrNull(BizApiService.TaskDescription.getMarketTickers$default(OLrzqt(), "SPOT", null, 2, null), continuation);
    }

    public java.lang.Object valueOf(@NotNull Continuation<? super ResponseData<java.util.List<TickersData>>> continuation) {
        return AwaitKt.awaitFirstOrNull(BizApiService.TaskDescription.getMarketTickers$default(OLrzqt(), "SWAP", null, 2, null), continuation);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.unify_trade.net.BizApiService.TaskDescription.getMarketTickers$default(com.okinc.unify_trade.net.BizApiService, java.lang.String, java.lang.String, int, java.lang.Object):o.ywX */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<java.util.List<TickersData>>> continuation) {
        return AwaitKt.awaitFirstOrNull(BizApiService.TaskDescription.getMarketTickers$default(OLrzqt(), "FUTURES", null, 2, null), continuation);
    }

    public java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<java.util.List<TickersData>>> continuation) {
        BizApiService bizApiServiceOLrzqt = OLrzqt();
        InterfaceC46557tYt interfaceC46557tYt = this.copydefault;
        java.lang.String strAEQbTJ = interfaceC46557tYt != null ? interfaceC46557tYt.AEQbTJ() : null;
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        return AwaitKt.awaitFirstOrNull(bizApiServiceOLrzqt.getMarkPriceTicker("OPTION", null, strAEQbTJ, null, null), continuation);
    }

    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.List<TickersData>>> continuation) {
        return AwaitKt.awaitFirstOrNull(OLrzqt().batchMarketAllCupTickers(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<qGF>> continuation) throws java.lang.Throwable {
        MainSearchSourceImpl$searchIMChats$1 mainSearchSourceImpl$searchIMChats$1;
        if (continuation instanceof MainSearchSourceImpl$searchIMChats$1) {
            mainSearchSourceImpl$searchIMChats$1 = (MainSearchSourceImpl$searchIMChats$1) continuation;
            int i = mainSearchSourceImpl$searchIMChats$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mainSearchSourceImpl$searchIMChats$1.label = i - Integer.MIN_VALUE;
            } else {
                mainSearchSourceImpl$searchIMChats$1 = new MainSearchSourceImpl$searchIMChats$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = mainSearchSourceImpl$searchIMChats$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mainSearchSourceImpl$searchIMChats$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            InterfaceC35180nqU interfaceC35180nqUAhwBna = AhwBna();
            if (interfaceC35180nqUAhwBna != null) {
                mainSearchSourceImpl$searchIMChats$1.label = 1;
                objOLrzqt = interfaceC35180nqUAhwBna.OLrzqt(str, mainSearchSourceImpl$searchIMChats$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            }
            return yDY.AhwBna();
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        java.util.List list = (java.util.List) objOLrzqt;
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new qGF((SearchResultData) it.next()));
            }
            return arrayList;
        }
        return yDY.AhwBna();
    }
}
