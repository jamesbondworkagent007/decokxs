package o;

import com.okinc.kline.api.bean.IBotOrdersDataBean;
import com.okinc.kline.data.BotOrderItem;
import com.okinc.kline.data.BotPendingLineVo;
import com.okinc.kline.ui.bot.GetBotOrderDataUseCase$onExecute$1;
import com.okinc.kline.ui.bot.GetBotOrderDataUseCase$onExecute$2$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pkd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39031pkd extends AbstractC49400uno<IBotOrdersDataBean, BotPendingLineVo> {
    public final CoroutineDispatcher AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public C39031pkd(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull IBotOrdersDataBean iBotOrdersDataBean, @NotNull Continuation<? super BotPendingLineVo> continuation) throws java.lang.Throwable {
        GetBotOrderDataUseCase$onExecute$1 getBotOrderDataUseCase$onExecute$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof GetBotOrderDataUseCase$onExecute$1) {
            getBotOrderDataUseCase$onExecute$1 = (GetBotOrderDataUseCase$onExecute$1) continuation;
            int i = getBotOrderDataUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getBotOrderDataUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getBotOrderDataUseCase$onExecute$1 = new GetBotOrderDataUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = getBotOrderDataUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getBotOrderDataUseCase$onExecute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCoroutineScope);
                Result.Application application = Result.Companion;
                GetBotOrderDataUseCase$onExecute$2$1 getBotOrderDataUseCase$onExecute$2$1 = new GetBotOrderDataUseCase$onExecute$2$1(this, iBotOrdersDataBean, null);
                getBotOrderDataUseCase$onExecute$1.label = 1;
                objCoroutineScope = CoroutineScopeKt.coroutineScope(getBotOrderDataUseCase$onExecute$2$1, getBotOrderDataUseCase$onExecute$1);
                if (objCoroutineScope == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCoroutineScope);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((BotPendingLineVo) objCoroutineScope);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }

    public final BotOrderItem OLrzqt(kotlin.Pair<java.lang.String, java.lang.String> pair) {
        return new BotOrderItem(pair.getFirst(), xMR.copydefault.copydefault(pair.getSecond()));
    }

    public final java.util.ArrayList<BotOrderItem> EZpvd(java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            arrayList.add(new BotOrderItem((java.lang.String) pair.component1(), xMR.copydefault.copydefault((java.lang.String) pair.component2())));
        }
        return new java.util.ArrayList<>(arrayList);
    }
}
