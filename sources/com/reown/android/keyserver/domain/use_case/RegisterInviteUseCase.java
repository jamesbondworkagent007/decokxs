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
public final class RegisterInviteUseCase {
    public final KeyServerService service;

    public RegisterInviteUseCase(@NotNull KeyServerService keyServerService) {
        Intrinsics.checkNotNullParameter(keyServerService, "");
        this.service = keyServerService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7299invokegIAlus(@NotNull String str, @NotNull Continuation<? super Result<Unit>> continuation) {
        RegisterInviteUseCase$invoke$1 registerInviteUseCase$invoke$1;
        if (continuation instanceof RegisterInviteUseCase$invoke$1) {
            registerInviteUseCase$invoke$1 = (RegisterInviteUseCase$invoke$1) continuation;
            int i = registerInviteUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                registerInviteUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                registerInviteUseCase$invoke$1 = new RegisterInviteUseCase$invoke$1(this, continuation);
            }
        }
        Object objRegisterInvite = registerInviteUseCase$invoke$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = registerInviteUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objRegisterInvite);
                Result.Application application = Result.Companion;
                KeyServerService keyServerService = this.service;
                KeyServerBody.RegisterInvite registerInvite = new KeyServerBody.RegisterInvite(str);
                registerInviteUseCase$invoke$1.label = 1;
                objRegisterInvite = keyServerService.registerInvite(registerInvite, registerInviteUseCase$invoke$1);
                if (objRegisterInvite == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objRegisterInvite);
            }
            UtilsKt.unwrapUnit((Response) objRegisterInvite);
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
