package o;

import com.okinc.market.search.features.navigation.history.domain.AddNavSearchHistoryUseCase$onExecute$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.trade.source.SearchTradeBizInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qLO implements InterfaceC49404uns<InterfaceC55797xqi, Unit> {
    public final qLR copydefault;

    @yCM
    public qLO(@NotNull qLR qlr) {
        Intrinsics.checkNotNullParameter(qlr, "");
        this.copydefault = qlr;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    public /* bridge */ /* synthetic */ java.lang.Object copydefault(java.lang.Object obj, Continuation continuation) {
        return copydefault((InterfaceC55797xqi) obj, (Continuation<? super Unit>) continuation);
    }

    public java.lang.Object copydefault(@NotNull InterfaceC55797xqi interfaceC55797xqi, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, interfaceC55797xqi, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull InterfaceC55797xqi interfaceC55797xqi, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AddNavSearchHistoryUseCase$onExecute$1 addNavSearchHistoryUseCase$onExecute$1;
        SearchTradeBizInfo searchTradeBizInfo;
        if (continuation instanceof AddNavSearchHistoryUseCase$onExecute$1) {
            addNavSearchHistoryUseCase$onExecute$1 = (AddNavSearchHistoryUseCase$onExecute$1) continuation;
            int i = addNavSearchHistoryUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addNavSearchHistoryUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                addNavSearchHistoryUseCase$onExecute$1 = new AddNavSearchHistoryUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = addNavSearchHistoryUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = addNavSearchHistoryUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (interfaceC55797xqi instanceof FutureInstrument) {
                FutureInstrument futureInstrument = (FutureInstrument) interfaceC55797xqi;
                searchTradeBizInfo = new SearchTradeBizInfo(null, futureInstrument.getInstType(), futureInstrument.getInstFamily(), futureInstrument.getAlias(), null, null, 49, null);
            } else if (interfaceC55797xqi instanceof DexInstrument) {
                DexInstrument dexInstrument = (DexInstrument) interfaceC55797xqi;
                searchTradeBizInfo = new SearchTradeBizInfo(dexInstrument.getChainId() + dexInstrument.getTokenContractAddress(), "CEDEFI", null, null, null, dexInstrument, 28, null);
            } else {
                if (!(interfaceC55797xqi instanceof BizInstrument)) {
                    throw new NoWhenBranchMatchedException();
                }
                BizInstrument bizInstrument = (BizInstrument) interfaceC55797xqi;
                searchTradeBizInfo = new SearchTradeBizInfo(bizInstrument.getInstId(), bizInstrument.getInstType(), null, null, null, null, 60, null);
            }
            qLR qlr = this.copydefault;
            addNavSearchHistoryUseCase$onExecute$1.label = 1;
            if (qlr.AEQbTJ(searchTradeBizInfo, addNavSearchHistoryUseCase$onExecute$1) == objCopydefault) {
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
