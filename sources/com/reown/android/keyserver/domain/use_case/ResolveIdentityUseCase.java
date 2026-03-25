package com.reown.android.keyserver.domain.use_case;

import com.reown.android.keyserver.data.service.KeyServerService;
import com.reown.android.keyserver.model.KeyServerResponse;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

/* JADX INFO: loaded from: classes12.dex */
public final class ResolveIdentityUseCase {
    public final KeyServerService service;

    public ResolveIdentityUseCase(@NotNull KeyServerService keyServerService) {
        Intrinsics.checkNotNullParameter(keyServerService, "");
        this.service = keyServerService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7300invokegIAlus(@NotNull String str, @NotNull Continuation<? super Result<KeyServerResponse.ResolveIdentity>> continuation) {
        ResolveIdentityUseCase$invoke$1 resolveIdentityUseCase$invoke$1;
        if (continuation instanceof ResolveIdentityUseCase$invoke$1) {
            resolveIdentityUseCase$invoke$1 = (ResolveIdentityUseCase$invoke$1) continuation;
            int i = resolveIdentityUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resolveIdentityUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                resolveIdentityUseCase$invoke$1 = new ResolveIdentityUseCase$invoke$1(this, continuation);
            }
        }
        Object objResolveIdentity = resolveIdentityUseCase$invoke$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = resolveIdentityUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objResolveIdentity);
                Result.Application application = Result.Companion;
                KeyServerService keyServerService = this.service;
                resolveIdentityUseCase$invoke$1.label = 1;
                objResolveIdentity = keyServerService.resolveIdentity(str, resolveIdentityUseCase$invoke$1);
                if (objResolveIdentity == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objResolveIdentity);
            }
            return Result.m7377constructorimpl((KeyServerResponse.ResolveIdentity) UtilsKt.unwrapValue((Response) objResolveIdentity));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
