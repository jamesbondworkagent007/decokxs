package o;

import com.okinc.market.ranking.core.engine.domain.CupTickerUseCase$onExecute$1;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41612quB extends AbstractC49400uno<Unit, java.util.Map<java.lang.String, ? extends TickersData>> {
    public final C40430qVo EZpvd;
    public java.util.Map<java.lang.String, TickersData> KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public C41612quB(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40430qVo c40430qVo) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40430qVo, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = c40430qVo;
        this.KWHzl = C56424yEw.KWHzl();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super java.util.Map<java.lang.String, TickersData>> continuation) throws java.lang.Throwable {
        CupTickerUseCase$onExecute$1 cupTickerUseCase$onExecute$1;
        C41612quB c41612quB;
        if (continuation instanceof CupTickerUseCase$onExecute$1) {
            cupTickerUseCase$onExecute$1 = (CupTickerUseCase$onExecute$1) continuation;
            int i = cupTickerUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cupTickerUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                cupTickerUseCase$onExecute$1 = new CupTickerUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = cupTickerUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = cupTickerUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C40429qVn c40429qVn = new C40429qVn(C56424yEw.KWHzl(), yDY.AhwBna(), true);
            if (!this.KWHzl.isEmpty()) {
                return this.KWHzl;
            }
            C40430qVo c40430qVo = this.EZpvd;
            cupTickerUseCase$onExecute$1.L$0 = this;
            cupTickerUseCase$onExecute$1.label = 1;
            objEZpvd = c40430qVo.EZpvd(c40429qVn, cupTickerUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41612quB = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41612quB = (C41612quB) cupTickerUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.util.Map<java.lang.String, TickersData> map = (java.util.Map) objEZpvd;
        C56424yEw.KWHzl();
        c41612quB.KWHzl = map;
        return map;
    }
}
