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
public final class UnregisterInviteUseCase {
    public final KeyServerService service;

    public UnregisterInviteUseCase(@NotNull KeyServerService keyServerService) {
        Intrinsics.checkNotNullParameter(keyServerService, "");
        this.service = keyServerService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7303invokegIAlus(@NotNull String str, @NotNull Continuation<? super Result<Unit>> continuation) {
        UnregisterInviteUseCase$invoke$1 unregisterInviteUseCase$invoke$1;
        if (continuation instanceof UnregisterInviteUseCase$invoke$1) {
            unregisterInviteUseCase$invoke$1 = (UnregisterInviteUseCase$invoke$1) continuation;
            int i = unregisterInviteUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unregisterInviteUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                unregisterInviteUseCase$invoke$1 = new UnregisterInviteUseCase$invoke$1(this, continuation);
            }
        }
        Object objUnregisterInvite = unregisterInviteUseCase$invoke$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = unregisterInviteUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objUnregisterInvite);
                Result.Application application = Result.Companion;
                KeyServerService keyServerService = this.service;
                KeyServerBody.UnregisterInvite unregisterInvite = new KeyServerBody.UnregisterInvite(str);
                unregisterInviteUseCase$invoke$1.label = 1;
                objUnregisterInvite = keyServerService.unregisterInvite(unregisterInvite, unregisterInviteUseCase$invoke$1);
                if (objUnregisterInvite == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objUnregisterInvite);
            }
            UtilsKt.unwrapUnit((Response) objUnregisterInvite);
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
