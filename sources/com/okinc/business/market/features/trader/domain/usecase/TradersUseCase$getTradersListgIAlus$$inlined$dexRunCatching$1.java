package com.okinc.business.market.features.trader.domain.usecase;

import com.okinc.business.market.data.model.traders.TradersData;
import com.okinc.business.market.data.model.traders.TradersWrapperData;
import com.okinc.business.market.features.trader.domain.model.Traders;
import com.okinc.business.market.features.trader.domain.model.TradersRequestParam;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C29728kzC;
import o.C29777kzz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29729kzD;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.trader.domain.usecase.TradersUseCase$getTradersList-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class TradersUseCase$getTradersListgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends Traders>>>, Object> {
    final /* synthetic */ TradersRequestParam $traderParam$inlined;
    int label;
    final /* synthetic */ C29777kzz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradersUseCase$getTradersListgIAlus$$inlined$dexRunCatching$1(Continuation continuation, C29777kzz c29777kzz, TradersRequestParam tradersRequestParam) {
        super(2, continuation);
        this.this$0 = c29777kzz;
        this.$traderParam$inlined = tradersRequestParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradersUseCase$getTradersListgIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$traderParam$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends Traders>>> continuation) {
        return ((TradersUseCase$getTradersListgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[Catch: all -> 0x0075, CancellationException -> 0x008c, TryCatch #2 {CancellationException -> 0x008c, all -> 0x0075, blocks: (B:6:0x000f, B:25:0x0060, B:29:0x0068, B:31:0x006c, B:32:0x0070, B:10:0x0021, B:16:0x003b, B:18:0x0045, B:21:0x004d, B:22:0x0051, B:13:0x0028), top: B:40:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objEZpvd;
        List listAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Object obj2 = null;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            InterfaceC29729kzD interfaceC29729kzD = this.this$0.KWHzl;
            TradersRequestParam tradersRequestParam = this.$traderParam$inlined;
            this.label = 1;
            obj = interfaceC29729kzD.copydefault(tradersRequestParam, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objEZpvd)) {
                    obj2 = objEZpvd;
                }
                listAhwBna = (List) obj2;
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
        }
        TradersWrapperData tradersWrapperData = (TradersWrapperData) ((AbstractC43419rot) obj).copydefault();
        List<TradersData> listOLrzqt = tradersWrapperData != null ? tradersWrapperData.OLrzqt() : null;
        if (listOLrzqt == null) {
            listOLrzqt = yDY.AhwBna();
        }
        C29728kzC c29728kzC = this.this$0.EZpvd;
        this.label = 2;
        objEZpvd = c29728kzC.EZpvd(listOLrzqt, this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        if (Result.m7383isFailureimpl(objEZpvd)) {
        }
        listAhwBna = (List) obj2;
        if (listAhwBna == null) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
