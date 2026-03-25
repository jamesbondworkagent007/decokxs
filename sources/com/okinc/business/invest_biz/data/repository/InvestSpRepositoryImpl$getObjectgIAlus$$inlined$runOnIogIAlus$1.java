package com.okinc.business.invest_biz.data.repository;

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
import o.C23642iDy;
import o.C56391yDq;
import o.C56442yFn;
import o.C56519yIj;
import o.InterfaceC56559yJw;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: com.okinc.business.invest_biz.data.repository.InvestSpRepositoryImpl$getObject-gIAlu-s$$inlined$runOnIo-gIAlu-s$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class InvestSpRepositoryImpl$getObjectgIAlus$$inlined$runOnIogIAlus$1<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends T>>, Object> {
    final /* synthetic */ String $key$inlined;
    int label;
    final /* synthetic */ C23642iDy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestSpRepositoryImpl$getObjectgIAlus$$inlined$runOnIogIAlus$1(Continuation continuation, C23642iDy c23642iDy, String str) {
        super(2, continuation);
        this.this$0 = c23642iDy;
        this.$key$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestSpRepositoryImpl$getObjectgIAlus$$inlined$runOnIogIAlus$1(continuation, this.this$0, this.$key$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends T>> continuation) {
        return ((InvestSpRepositoryImpl$getObjectgIAlus$$inlined$runOnIogIAlus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String str = "";
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        try {
            Result.Application application = Result.Companion;
            String string = this.this$0.copydefault().getString(this.$key$inlined, "");
            if (string != null) {
                str = string;
            }
            Json json = this.this$0.copydefault;
            Intrinsics.KWHzl(6, ExifInterface.GPS_DIRECTION_TRUE);
            C56519yIj.copydefault("kotlinx.serialization.serializer.simple");
            objM7377constructorimpl = Result.m7377constructorimpl(json.decodeFromString(SerializersKt.serializer((InterfaceC56559yJw) null), str));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        Object objM7377constructorimpl;
        String str = "";
        try {
            Result.Application application = Result.Companion;
            String string = this.this$0.copydefault().getString(this.$key$inlined, "");
            if (string != null) {
                str = string;
            }
            Json json = this.this$0.copydefault;
            Intrinsics.KWHzl(6, ExifInterface.GPS_DIRECTION_TRUE);
            C56519yIj.copydefault("kotlinx.serialization.serializer.simple");
            objM7377constructorimpl = Result.m7377constructorimpl(json.decodeFromString(SerializersKt.serializer((InterfaceC56559yJw) null), str));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
