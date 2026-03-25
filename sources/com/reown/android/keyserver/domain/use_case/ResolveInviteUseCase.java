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
public final class ResolveInviteUseCase {
    public final KeyServerService service;

    public ResolveInviteUseCase(@NotNull KeyServerService keyServerService) {
        Intrinsics.checkNotNullParameter(keyServerService, "");
        this.service = keyServerService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: invoke-t8EI80o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7301invoket8EI80o(@NotNull String str, @NotNull Continuation<? super Result<KeyServerResponse.ResolveInvite>> continuation) {
        ResolveInviteUseCase$invoke$1 resolveInviteUseCase$invoke$1;
        if (continuation instanceof ResolveInviteUseCase$invoke$1) {
            resolveInviteUseCase$invoke$1 = (ResolveInviteUseCase$invoke$1) continuation;
            int i = resolveInviteUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resolveInviteUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                resolveInviteUseCase$invoke$1 = new ResolveInviteUseCase$invoke$1(this, continuation);
            }
        }
        Object objResolveInvite = resolveInviteUseCase$invoke$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = resolveInviteUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objResolveInvite);
                Result.Application application = Result.Companion;
                KeyServerService keyServerService = this.service;
                resolveInviteUseCase$invoke$1.label = 1;
                objResolveInvite = keyServerService.resolveInvite(str, resolveInviteUseCase$invoke$1);
                if (objResolveInvite == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objResolveInvite);
            }
            return Result.m7377constructorimpl((KeyServerResponse.ResolveInvite) UtilsKt.unwrapValue((Response) objResolveInvite));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
