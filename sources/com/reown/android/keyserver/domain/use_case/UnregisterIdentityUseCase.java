package com.reown.android.keyserver.domain.use_case;

import com.reown.android.keyserver.data.service.KeyServerService;
import com.reown.android.keyserver.model.KeyServerBody;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

/* JADX INFO: loaded from: classes12.dex */
public final class UnregisterIdentityUseCase {
    public final KeyServerService service;

    public UnregisterIdentityUseCase(@NotNull KeyServerService keyServerService) {
        Intrinsics.checkNotNullParameter(keyServerService, "");
        this.service = keyServerService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7302invokegIAlus(@NotNull String str, @NotNull Continuation<? super Result<Unit>> continuation) {
        UnregisterIdentityUseCase$invoke$1 unregisterIdentityUseCase$invoke$1;
        if (continuation instanceof UnregisterIdentityUseCase$invoke$1) {
            unregisterIdentityUseCase$invoke$1 = (UnregisterIdentityUseCase$invoke$1) continuation;
            int i = unregisterIdentityUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unregisterIdentityUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                unregisterIdentityUseCase$invoke$1 = new UnregisterIdentityUseCase$invoke$1(this, continuation);
            }
        }
        Object objUnregisterIdentity = unregisterIdentityUseCase$invoke$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = unregisterIdentityUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objUnregisterIdentity);
                Result.Application application = Result.Companion;
                KeyServerService keyServerService = this.service;
                KeyServerBody.UnregisterIdentity unregisterIdentity = new KeyServerBody.UnregisterIdentity(str);
                unregisterIdentityUseCase$invoke$1.label = 1;
                objUnregisterIdentity = keyServerService.unregisterIdentity(unregisterIdentity, unregisterIdentityUseCase$invoke$1);
                if (objUnregisterIdentity == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objUnregisterIdentity);
            }
            UtilsKt.unwrapUnit((Response) objUnregisterIdentity);
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
