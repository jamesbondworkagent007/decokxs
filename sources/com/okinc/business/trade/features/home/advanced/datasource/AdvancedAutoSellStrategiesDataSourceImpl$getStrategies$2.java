package com.okinc.business.trade.features.home.advanced.datasource;

import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import o.C56391yDq;
import o.C56442yFn;
import o.kPP;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedAutoSellStrategiesDataSourceImpl$getStrategies$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends AdvancedAutoSellStrategy>>, Object> {
    int label;
    final /* synthetic */ kPP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedAutoSellStrategiesDataSourceImpl$getStrategies$2(kPP kpp, Continuation<? super AdvancedAutoSellStrategiesDataSourceImpl$getStrategies$2> continuation) {
        super(2, continuation);
        this.this$0 = kpp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedAutoSellStrategiesDataSourceImpl$getStrategies$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AdvancedAutoSellStrategy>> continuation) {
        return ((AdvancedAutoSellStrategiesDataSourceImpl$getStrategies$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String string = this.this$0.OLrzqt.getString("key_dex_advanced_auto_sell_strategies", null);
            if (string == null) {
                return yDY.AhwBna();
            }
            kPP kpp = this.this$0;
            try {
                Result.Application application = Result.Companion;
                Json json = kpp.copydefault;
                json.getSerializersModule();
                objM7377constructorimpl = Result.m7377constructorimpl((List) json.decodeFromString(new ArrayListSerializer(AdvancedAutoSellStrategy.Companion.serializer()), string));
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                pUU.AEQbTJ("DEX", "dexRunCatching", th);
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return Result.m7380exceptionOrNullimpl(objM7377constructorimpl) == null ? objM7377constructorimpl : yDY.AhwBna();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
