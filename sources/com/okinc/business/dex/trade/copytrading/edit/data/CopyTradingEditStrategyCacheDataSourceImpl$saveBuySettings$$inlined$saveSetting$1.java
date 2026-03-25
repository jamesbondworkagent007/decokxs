package com.okinc.business.dex.trade.copytrading.edit.data;

import android.content.SharedPreferences;
import com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import o.C19865gSe;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingEditStrategyCacheDataSourceImpl$saveBuySettings$$inlined$saveSetting$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $keyPrefix;
    final /* synthetic */ Object $setting;
    int label;
    final /* synthetic */ C19865gSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyCacheDataSourceImpl$saveBuySettings$$inlined$saveSetting$1(C19865gSe c19865gSe, String str, String str2, Object obj, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c19865gSe;
        this.$keyPrefix = str;
        this.$chainId = str2;
        this.$setting = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyCacheDataSourceImpl$saveBuySettings$$inlined$saveSetting$1(this.this$0, this.$keyPrefix, this.$chainId, this.$setting, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingEditStrategyCacheDataSourceImpl$saveBuySettings$$inlined$saveSetting$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String strAEQbTJ = this.this$0.AEQbTJ(this.$keyPrefix, this.$chainId);
            C19865gSe c19865gSe = this.this$0;
            Object obj2 = this.$setting;
            try {
                Result.Application application = Result.Companion;
                Json json = c19865gSe.KWHzl;
                json.getSerializersModule();
                objM7377constructorimpl = Result.m7377constructorimpl(json.encodeToString(BuySettings.Companion.serializer(), obj2));
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
            SharedPreferences.Editor editorEdit = this.this$0.AEQbTJ.edit();
            Intrinsics.checkNotNullExpressionValue(editorEdit, "");
            editorEdit.putString(strAEQbTJ, (String) objM7377constructorimpl);
            editorEdit.apply();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
