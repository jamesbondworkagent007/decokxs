package com.okinc.business.trade.features.home.advanced.datasource;

import android.content.SharedPreferences;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import o.C56391yDq;
import o.C56442yFn;
import o.kPP;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedAutoSellStrategiesDataSourceImpl$saveStrategies$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<AdvancedAutoSellStrategy> $strategies;
    int label;
    final /* synthetic */ kPP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdvancedAutoSellStrategiesDataSourceImpl$saveStrategies$2(kPP kpp, List<? extends AdvancedAutoSellStrategy> list, Continuation<? super AdvancedAutoSellStrategiesDataSourceImpl$saveStrategies$2> continuation) {
        super(2, continuation);
        this.this$0 = kpp;
        this.$strategies = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedAutoSellStrategiesDataSourceImpl$saveStrategies$2(this.this$0, this.$strategies, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedAutoSellStrategiesDataSourceImpl$saveStrategies$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            kPP kpp = this.this$0;
            List<AdvancedAutoSellStrategy> list = this.$strategies;
            try {
                Result.Application application = Result.Companion;
                Json json = kpp.copydefault;
                json.getSerializersModule();
                objM7377constructorimpl = Result.m7377constructorimpl(json.encodeToString(new ArrayListSerializer(AdvancedAutoSellStrategy.Companion.serializer()), list));
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                pUU.AEQbTJ("DEX", "dexRunCatching", th);
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            SharedPreferences.Editor editorEdit = this.this$0.OLrzqt.edit();
            Intrinsics.checkNotNullExpressionValue(editorEdit, "");
            editorEdit.putString("key_dex_advanced_auto_sell_strategies", (String) objM7377constructorimpl);
            editorEdit.apply();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
