package com.okinc.business.dexui.app;

import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28148kQr;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class DexApplicationDelegate$onCreate$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C28148kQr $autoSellRepository;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexApplicationDelegate$onCreate$1$1(C28148kQr c28148kQr, Continuation<? super DexApplicationDelegate$onCreate$1$1> continuation) {
        super(2, continuation);
        this.$autoSellRepository = c28148kQr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexApplicationDelegate$onCreate$1$1(this.$autoSellRepository, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DexApplicationDelegate$onCreate$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("DexApplicationDelegate", "Clearing stored cache for AutoSell on wallet change");
            C28148kQr c28148kQr = this.$autoSellRepository;
            this.label = 1;
            if (c28148kQr.KWHzl(false, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C28148kQr c28148kQr2 = this.$autoSellRepository;
        List<? extends AdvancedAutoSellStrategy> listAhwBna = yDY.AhwBna();
        this.label = 2;
        if (c28148kQr2.copydefault(listAhwBna, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
