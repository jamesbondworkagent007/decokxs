package com.okinc.business.dex.trade.copytrading.edit.data;

import android.content.SharedPreferences;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
import o.C19865gSe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56519yIj;
import o.InterfaceC56559yJw;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingEditStrategyCacheDataSourceImpl$saveSetting$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $keyPrefix;
    final /* synthetic */ T $setting;
    int label;
    final /* synthetic */ C19865gSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyCacheDataSourceImpl$saveSetting$2(C19865gSe c19865gSe, String str, String str2, T t, Continuation<? super CopyTradingEditStrategyCacheDataSourceImpl$saveSetting$2> continuation) {
        super(2, continuation);
        this.this$0 = c19865gSe;
        this.$keyPrefix = str;
        this.$chainId = str2;
        this.$setting = t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyCacheDataSourceImpl$saveSetting$2(this.this$0, this.$keyPrefix, this.$chainId, this.$setting, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingEditStrategyCacheDataSourceImpl$saveSetting$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String strAEQbTJ = this.this$0.AEQbTJ(this.$keyPrefix, this.$chainId);
            C19865gSe c19865gSe = this.this$0;
            T t = this.$setting;
            try {
                Result.Application application = Result.Companion;
                Json json = c19865gSe.KWHzl;
                SerializersModule serializersModule = json.getSerializersModule();
                Intrinsics.KWHzl(6, ExifInterface.GPS_DIRECTION_TRUE);
                C56519yIj.copydefault("kotlinx.serialization.serializer.withModule");
                objM7377constructorimpl = Result.m7377constructorimpl(json.encodeToString(SerializersKt.serializer(serializersModule, (InterfaceC56559yJw) null), t));
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                pUU.AEQbTJ("DEX", "dexRunCatching", th);
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Object obj2 = Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl;
            SharedPreferences.Editor editorEdit = this.this$0.AEQbTJ.edit();
            Intrinsics.checkNotNullExpressionValue(editorEdit, "");
            editorEdit.putString(strAEQbTJ, (String) obj2);
            editorEdit.apply();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
