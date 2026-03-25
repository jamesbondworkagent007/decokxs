package o;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.usecase.WatchAddDEXUseCase$onExecute$1;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC40459qWq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qXo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40484qXo extends AbstractC49400uno<DexInstrument, Unit> {
    public static final int copydefault = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final qWQ EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public C40484qXo(@NotNull qWQ qwq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(qwq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = qwq;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull DexInstrument dexInstrument, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WatchAddDEXUseCase$onExecute$1 watchAddDEXUseCase$onExecute$1;
        if (continuation instanceof WatchAddDEXUseCase$onExecute$1) {
            watchAddDEXUseCase$onExecute$1 = (WatchAddDEXUseCase$onExecute$1) continuation;
            int i = watchAddDEXUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchAddDEXUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                watchAddDEXUseCase$onExecute$1 = new WatchAddDEXUseCase$onExecute$1(this, continuation);
            }
        }
        WatchAddDEXUseCase$onExecute$1 watchAddDEXUseCase$onExecute$12 = watchAddDEXUseCase$onExecute$1;
        java.lang.Object obj = watchAddDEXUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchAddDEXUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            qWQ qwq = this.EZpvd;
            MarketUserFavorite marketUserFavoriteConvertToUserFavorite$default = qWJ.convertToUserFavorite$default(qWJ.OLrzqt(dexInstrument), null, 1, null);
            watchAddDEXUseCase$onExecute$12.label = 1;
            if (InterfaceC40459qWq.ActionBar.insertUserFavorite$default(qwq, marketUserFavoriteConvertToUserFavorite$default, null, true, watchAddDEXUseCase$onExecute$12, 2, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
