package com.okinc.business.dex.trade.copytrading.edit.data;

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

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingEditStrategyCacheDataSourceImpl$getSetting$2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $keyPrefix;
    int label;
    final /* synthetic */ C19865gSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyCacheDataSourceImpl$getSetting$2(C19865gSe c19865gSe, String str, String str2, Continuation<? super CopyTradingEditStrategyCacheDataSourceImpl$getSetting$2> continuation) {
        super(2, continuation);
        this.this$0 = c19865gSe;
        this.$keyPrefix = str;
        this.$chainId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.OLrzqt();
        return new CopyTradingEditStrategyCacheDataSourceImpl$getSetting$2(this.this$0, this.$keyPrefix, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        return ((CopyTradingEditStrategyCacheDataSourceImpl$getSetting$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String string = this.this$0.AEQbTJ.getString(this.this$0.AEQbTJ(this.$keyPrefix, this.$chainId), null);
            if (string == null) {
                return null;
            }
            C19865gSe c19865gSe = this.this$0;
            try {
                Result.Application application = Result.Companion;
                Json json = c19865gSe.KWHzl;
                SerializersModule serializersModule = json.getSerializersModule();
                Intrinsics.KWHzl(6, ExifInterface.GPS_DIRECTION_TRUE);
                C56519yIj.copydefault("kotlinx.serialization.serializer.withModule");
                objM7377constructorimpl = Result.m7377constructorimpl(json.decodeFromString(SerializersKt.serializer(serializersModule, (InterfaceC56559yJw) null), string));
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                pUU.AEQbTJ("DEX", "dexRunCatching", th);
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                return null;
            }
            return objM7377constructorimpl;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
