package com.reown.android.internal.common.explorer.domain.usecase;

import com.reown.android.internal.common.explorer.ExplorerRepository;
import com.reown.android.internal.common.explorer.data.model.NotifyConfig;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GetNotifyConfigUseCase {
    public final ExplorerRepository explorerRepository;

    public GetNotifyConfigUseCase(@NotNull ExplorerRepository explorerRepository) {
        Intrinsics.checkNotNullParameter(explorerRepository, "");
        this.explorerRepository = explorerRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7191invokegIAlus(@NotNull String str, @NotNull Continuation<? super Result<NotifyConfig>> continuation) {
        GetNotifyConfigUseCase$invoke$1 getNotifyConfigUseCase$invoke$1;
        if (continuation instanceof GetNotifyConfigUseCase$invoke$1) {
            getNotifyConfigUseCase$invoke$1 = (GetNotifyConfigUseCase$invoke$1) continuation;
            int i = getNotifyConfigUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getNotifyConfigUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getNotifyConfigUseCase$invoke$1 = new GetNotifyConfigUseCase$invoke$1(this, continuation);
            }
        }
        Object notifyConfig = getNotifyConfigUseCase$invoke$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = getNotifyConfigUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(notifyConfig);
                Result.Application application = Result.Companion;
                ExplorerRepository explorerRepository = this.explorerRepository;
                getNotifyConfigUseCase$invoke$1.label = 1;
                notifyConfig = explorerRepository.getNotifyConfig(str, getNotifyConfigUseCase$invoke$1);
                if (notifyConfig == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(notifyConfig);
            }
            return Result.m7377constructorimpl((NotifyConfig) notifyConfig);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
