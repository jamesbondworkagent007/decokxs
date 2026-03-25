package com.reown.android.internal.common.modal.domain.usecase;

import com.reown.android.internal.common.modal.AppKitApiRepository;
import com.reown.android.internal.common.modal.data.model.WalletListing;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GetWalletsUseCase implements GetWalletsUseCaseInterface {
    public final AppKitApiRepository appKitApiRepository;

    /* JADX INFO: renamed from: com.reown.android.internal.common.modal.domain.usecase.GetWalletsUseCase$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetWalletsUseCase.this.invoke(null, 0, null, null, null, this);
        }
    }

    public GetWalletsUseCase(@NotNull AppKitApiRepository appKitApiRepository) {
        Intrinsics.checkNotNullParameter(appKitApiRepository, "");
        this.appKitApiRepository = appKitApiRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.reown.android.internal.common.modal.domain.usecase.GetWalletsUseCaseInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull String str, int i, String str2, List<String> list, List<String> list2, @NotNull Continuation<? super WalletListing> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object objM7208getWalletshUnOzRk;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object obj = anonymousClass12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = anonymousClass12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            AppKitApiRepository appKitApiRepository = this.appKitApiRepository;
            anonymousClass12.label = 1;
            objM7208getWalletshUnOzRk = appKitApiRepository.m7208getWalletshUnOzRk(str, i, str2, list, list2, anonymousClass12);
            if (objM7208getWalletshUnOzRk == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7208getWalletshUnOzRk = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objM7208getWalletshUnOzRk);
        return objM7208getWalletshUnOzRk;
    }
}
