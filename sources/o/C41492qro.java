package o;

import com.okinc.market.quotation.data.model.DexTokenListRequest;
import com.okinc.market.quotation.data.model.DexTokenPo;
import com.okinc.market.quotation.domain.dex.GetDexTokenDetailUseCase$fetchMultipleBatches$1;
import com.okinc.market.quotation.domain.dex.GetDexTokenDetailUseCase$fetchMultipleBatches$batchTasks$1$1;
import com.okinc.market.quotation.domain.dex.GetDexTokenDetailUseCase$fetchSingleBatch$1;
import com.okinc.market.quotation.domain.dex.GetDexTokenDetailUseCase$onExecute$1;
import com.okinc.unify_trade.biz.DexInstrument;
import java.math.BigDecimal;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41492qro extends AbstractC49400uno<C41490qrm, java.util.List<? extends InterfaceC41655qus>> {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final C41448qqx EZpvd;
    public final InterfaceC46557tYt KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public C41492qro(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41448qqx c41448qqx, @NotNull InterfaceC46557tYt interfaceC46557tYt) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41448qqx, "");
        Intrinsics.checkNotNullParameter(interfaceC46557tYt, "");
        this.AEQbTJ = coroutineDispatcher;
        this.EZpvd = c41448qqx;
        this.KWHzl = interfaceC46557tYt;
    }

    /* JADX INFO: renamed from: o.qro$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qro.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41490qrm c41490qrm, @NotNull Continuation<? super java.util.List<? extends InterfaceC41655qus>> continuation) throws java.lang.Throwable {
        GetDexTokenDetailUseCase$onExecute$1 getDexTokenDetailUseCase$onExecute$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof GetDexTokenDetailUseCase$onExecute$1) {
            getDexTokenDetailUseCase$onExecute$1 = (GetDexTokenDetailUseCase$onExecute$1) continuation;
            int i = getDexTokenDetailUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDexTokenDetailUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getDexTokenDetailUseCase$onExecute$1 = new GetDexTokenDetailUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = getDexTokenDetailUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getDexTokenDetailUseCase$onExecute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                java.util.List<DexInstrument> listEZpvd = c41490qrm.EZpvd();
                InterfaceC41652qup interfaceC41652qupAEQbTJ = c41490qrm.AEQbTJ();
                C41434qqj.KWHzl.KWHzl("GetDexTokenDetailUseCase", "get dex token detail, [input: " + c41490qrm + "]");
                Result.Application application = Result.Companion;
                getDexTokenDetailUseCase$onExecute$1.label = 1;
                objOLrzqt = OLrzqt(listEZpvd, interfaceC41652qupAEQbTJ, getDexTokenDetailUseCase$onExecute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objOLrzqt);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C41434qqj.KWHzl.copydefault("GetDexTokenDetailUseCase", "Failed to get dex token detail", thM7380exceptionOrNullimpl);
            objM7377constructorimpl = yDY.AhwBna();
        }
        return (java.util.List) objM7377constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.util.List<DexTokenListRequest> list, InterfaceC41652qup interfaceC41652qup, Continuation<? super java.util.List<? extends InterfaceC41655qus>> continuation) throws java.lang.Throwable {
        GetDexTokenDetailUseCase$fetchSingleBatch$1 getDexTokenDetailUseCase$fetchSingleBatch$1;
        C41492qro c41492qro;
        if (continuation instanceof GetDexTokenDetailUseCase$fetchSingleBatch$1) {
            getDexTokenDetailUseCase$fetchSingleBatch$1 = (GetDexTokenDetailUseCase$fetchSingleBatch$1) continuation;
            int i = getDexTokenDetailUseCase$fetchSingleBatch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDexTokenDetailUseCase$fetchSingleBatch$1.label = i - Integer.MIN_VALUE;
            } else {
                getDexTokenDetailUseCase$fetchSingleBatch$1 = new GetDexTokenDetailUseCase$fetchSingleBatch$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getDexTokenDetailUseCase$fetchSingleBatch$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getDexTokenDetailUseCase$fetchSingleBatch$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C41448qqx c41448qqx = this.EZpvd;
            getDexTokenDetailUseCase$fetchSingleBatch$1.L$0 = this;
            getDexTokenDetailUseCase$fetchSingleBatch$1.L$1 = interfaceC41652qup;
            getDexTokenDetailUseCase$fetchSingleBatch$1.label = 1;
            objKWHzl = c41448qqx.KWHzl(list, getDexTokenDetailUseCase$fetchSingleBatch$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c41492qro = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41652qup = (InterfaceC41652qup) getDexTokenDetailUseCase$fetchSingleBatch$1.L$1;
            c41492qro = (C41492qro) getDexTokenDetailUseCase$fetchSingleBatch$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.util.List<DexTokenPo> listAhwBna = (java.util.List) objKWHzl;
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        return c41492qro.EZpvd(listAhwBna, interfaceC41652qup);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.util.List<DexTokenListRequest> list, InterfaceC41652qup interfaceC41652qup, Continuation<? super java.util.List<? extends InterfaceC41655qus>> continuation) throws java.lang.Throwable {
        GetDexTokenDetailUseCase$fetchMultipleBatches$1 getDexTokenDetailUseCase$fetchMultipleBatches$1;
        if (continuation instanceof GetDexTokenDetailUseCase$fetchMultipleBatches$1) {
            getDexTokenDetailUseCase$fetchMultipleBatches$1 = (GetDexTokenDetailUseCase$fetchMultipleBatches$1) continuation;
            int i = getDexTokenDetailUseCase$fetchMultipleBatches$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDexTokenDetailUseCase$fetchMultipleBatches$1.label = i - Integer.MIN_VALUE;
            } else {
                getDexTokenDetailUseCase$fetchMultipleBatches$1 = new GetDexTokenDetailUseCase$fetchMultipleBatches$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = getDexTokenDetailUseCase$fetchMultipleBatches$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getDexTokenDetailUseCase$fetchMultipleBatches$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            java.util.List listValueOf = CollectionsKt___CollectionsKt.valueOf((java.lang.Iterable) list, 100);
            int size = listValueOf.size();
            C41434qqj.KWHzl.KWHzl("GetDexTokenDetailUseCase", "Split into " + size + " batches for parallel execution");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
            int i3 = 0;
            for (java.lang.Object obj : listValueOf) {
                if (i3 < 0) {
                    yDY.AYXKKw();
                }
                arrayList.add(new GetDexTokenDetailUseCase$fetchMultipleBatches$batchTasks$1$1(i3, size, (java.util.List) obj, this, interfaceC41652qup, null));
                i3++;
            }
            getDexTokenDetailUseCase$fetchMultipleBatches$1.label = 1;
            objAEQbTJ = C41347qpB.AEQbTJ(arrayList, getDexTokenDetailUseCase$fetchMultipleBatches$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return C56403yEb.QOLQEE((java.util.List) objAEQbTJ);
    }

    public static final java.lang.String EZpvd(DexTokenPo dexTokenPo, C41492qro c41492qro) {
        int iEZpvd = c41492qro.KWHzl.EZpvd();
        if (iEZpvd == 1) {
            return dexTokenPo.getPriceChangeUtc0();
        }
        if (iEZpvd == 2) {
            return dexTokenPo.getPriceChangeUtc8();
        }
        return dexTokenPo.getPriceChange();
    }

    public final java.util.List<InterfaceC41655qus> EZpvd(java.util.List<DexTokenPo> list, final InterfaceC41652qup interfaceC41652qup) {
        return C41389qpr.EZpvd(list, new Function1() { // from class: o.qrn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41492qro.OLrzqt(interfaceC41652qup, this, (DexTokenPo) obj);
            }
        });
    }

    public static final InterfaceC41655qus OLrzqt(InterfaceC41652qup interfaceC41652qup, C41492qro c41492qro, DexTokenPo dexTokenPo) {
        Intrinsics.checkNotNullParameter(dexTokenPo, "");
        DexInstrument dexInstrumentCopydefault = DexTokenPo.Companion.copydefault(dexTokenPo);
        double dAEQbTJ = C33129mqd.AEQbTJ(EZpvd(dexTokenPo, c41492qro));
        double dAEQbTJ2 = C33129mqd.AEQbTJ(dexTokenPo.getPrice());
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(dexTokenPo.getTurnOver());
        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(dexTokenPo.getMarketCap());
        BigDecimal bigDecimalEZpvd3 = C33129mqd.EZpvd(dexTokenPo.getLiquidity());
        boolean zEZpvd = Intrinsics.EZpvd(dexTokenPo.getVerified(), java.lang.Boolean.TRUE);
        java.lang.String boostPercentage = dexTokenPo.getBoostPercentage();
        boolean boosted = dexTokenPo.getBoosted();
        return interfaceC41652qup.OLrzqt(dexInstrumentCopydefault, java.lang.Double.valueOf(dAEQbTJ), java.lang.Double.valueOf(dAEQbTJ2), bigDecimalEZpvd, bigDecimalEZpvd2, bigDecimalEZpvd3, zEZpvd, java.lang.Boolean.valueOf(boosted), boostPercentage, dexTokenPo.getBoostRate());
    }

    public final java.lang.Object OLrzqt(java.util.List<DexInstrument> list, InterfaceC41652qup interfaceC41652qup, Continuation<? super java.util.List<? extends InterfaceC41655qus>> continuation) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (DexInstrument dexInstrument : list) {
            arrayList.add(new DexTokenListRequest(dexInstrument.getChainId(), dexInstrument.getTokenContractAddress()));
        }
        if (arrayList.size() <= 100) {
            C41434qqj.KWHzl.KWHzl("GetDexTokenDetailUseCase", "Single batch request: " + arrayList.size() + " tokens");
            return KWHzl(arrayList, interfaceC41652qup, continuation);
        }
        C41434qqj.KWHzl.KWHzl("GetDexTokenDetailUseCase", "Multiple batch requests needed: " + arrayList.size() + " tokens, batch size: 100");
        return copydefault(arrayList, interfaceC41652qup, continuation);
    }
}
