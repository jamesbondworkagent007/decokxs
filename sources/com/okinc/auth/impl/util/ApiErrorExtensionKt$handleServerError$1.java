package com.okinc.auth.impl.util;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.reflect.TypeToken;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
import o.C43284rmQ;
import o.C56391yDq;
import o.C56442yFn;
import o.C56519yIj;
import o.C6737aUy;
import o.yHO;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes23.dex */
public final class ApiErrorExtensionKt$handleServerError$1<T> extends SuspendLambda implements yHO<FlowCollector<? super ResponseData<T>>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ApiErrorExtensionKt$handleServerError$1(Continuation<? super ApiErrorExtensionKt$handleServerError$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super ResponseData<T>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        Intrinsics.OLrzqt();
        ApiErrorExtensionKt$handleServerError$1 apiErrorExtensionKt$handleServerError$1 = new ApiErrorExtensionKt$handleServerError$1(continuation);
        apiErrorExtensionKt$handleServerError$1.L$0 = th;
        return apiErrorExtensionKt$handleServerError$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: com.okinc.network.okg.response.ResponseData$Companion */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Throwable th = (Throwable) this.L$0;
            if (!(th instanceof OKServerException)) {
                throw th;
            }
            OKServerException oKServerException = (OKServerException) th;
            if (oKServerException.getCode() != -1) {
                try {
                    Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
                    Object objFromJson = C6737aUy.OLrzqt().fromJson(((OKServerException) th).getResponse(), TypeToken.getParameterized(ResponseData.class, Object.class).getType());
                    Intrinsics.copydefault(objFromJson);
                } catch (Throwable unused) {
                    Json jsonKWHzl = C43284rmQ.KWHzl();
                    String strValueOf = String.valueOf(oKServerException.getResponse());
                    SerializersModule serializersModule = jsonKWHzl.getSerializersModule();
                    ResponseData.Companion companion = ResponseData.Companion;
                    Intrinsics.KWHzl(6, ExifInterface.GPS_DIRECTION_TRUE);
                    C56519yIj.copydefault("kotlinx.serialization.serializer.withModule");
                }
                return Unit.INSTANCE;
            }
            throw th;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
