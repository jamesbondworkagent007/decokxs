package o;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.usecase.QueryDexInstrumentWatchUseCase$onExecute$1;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qXk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40480qXk extends AbstractC49400uno<DexInstrument, java.lang.Boolean> {
    public static final int OLrzqt = 8;
    public final qWQ AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C40480qXk(@NotNull qWQ qwq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(qwq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = qwq;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull DexInstrument dexInstrument, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        QueryDexInstrumentWatchUseCase$onExecute$1 queryDexInstrumentWatchUseCase$onExecute$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof QueryDexInstrumentWatchUseCase$onExecute$1) {
            queryDexInstrumentWatchUseCase$onExecute$1 = (QueryDexInstrumentWatchUseCase$onExecute$1) continuation;
            int i = queryDexInstrumentWatchUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                queryDexInstrumentWatchUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                queryDexInstrumentWatchUseCase$onExecute$1 = new QueryDexInstrumentWatchUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = queryDexInstrumentWatchUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = queryDexInstrumentWatchUseCase$onExecute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                qWQ qwq = this.AEQbTJ;
                java.lang.String strKWHzl = C55686xod.KWHzl();
                MarketUserFavorite marketUserFavoriteConvertToUserFavorite$default = qWJ.convertToUserFavorite$default(qWJ.OLrzqt(dexInstrument), null, 1, null);
                queryDexInstrumentWatchUseCase$onExecute$1.label = 1;
                objKWHzl = qwq.KWHzl(strKWHzl, marketUserFavoriteConvertToUserFavorite$default, queryDexInstrumentWatchUseCase$onExecute$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((java.lang.Boolean) objKWHzl).booleanValue()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7383isFailureimpl(objM7377constructorimpl) ? C56443yFo.KWHzl(false) : objM7377constructorimpl;
    }
}
