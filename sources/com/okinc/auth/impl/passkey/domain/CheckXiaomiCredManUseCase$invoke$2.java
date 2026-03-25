package com.okinc.auth.impl.passkey.domain;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43246rlf;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5943aFx;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class CheckXiaomiCredManUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5943aFx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckXiaomiCredManUseCase$invoke$2(C5943aFx c5943aFx, Continuation<? super CheckXiaomiCredManUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5943aFx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheckXiaomiCredManUseCase$invoke$2 checkXiaomiCredManUseCase$invoke$2 = new CheckXiaomiCredManUseCase$invoke$2(this.this$0, continuation);
        checkXiaomiCredManUseCase$invoke$2.L$0 = obj;
        return checkXiaomiCredManUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((CheckXiaomiCredManUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                Application applicationValueOf = C43246rlf.OLrzqt.valueOf();
                ApplicationInfo applicationInfo = applicationValueOf.getPackageManager().getApplicationInfo("com.fido.asm", 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "");
                ApplicationInfo applicationInfo2 = applicationValueOf.getPackageManager().getApplicationInfo("com.miui.cloudservice", 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo2, "");
                int i = applicationInfo.metaData.getInt("passkeyVersion");
                int i2 = applicationInfo2.metaData.getInt("support_keybag_ta_version");
                pUU.EZpvd("CheckXiaomiCredManUseCase", "passkeyVersion:" + i + " keyBagTaVersion:" + i2);
                boolean z = true;
                boolean z2 = i > 0 && i2 > 0;
                C5943aFx c5943aFx = this.this$0;
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(c5943aFx.EZpvd.OLrzqt()));
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                Boolean boolKWHzl = C56443yFo.KWHzl(false);
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = boolKWHzl;
                }
                boolean zBooleanValue = ((Boolean) objM7377constructorimpl).booleanValue();
                pUU.EZpvd("CheckXiaomiCredManUseCase", "supportGoogleService: " + zBooleanValue);
                if (!z2 && !zBooleanValue) {
                    z = false;
                }
                return C56443yFo.KWHzl(z);
            } catch (Exception e) {
                pUU.copydefault("CheckXiaomiCredManUseCase", "e: " + e.getMessage());
                pUU.EZpvd("CheckXiaomiCredManUseCase", "not support xiaomi credential manager service");
                return C56443yFo.KWHzl(false);
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
