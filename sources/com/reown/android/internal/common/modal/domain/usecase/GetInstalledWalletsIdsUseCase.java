package com.reown.android.internal.common.modal.domain.usecase;

import com.reown.android.internal.common.modal.AppKitApiRepository;
import com.reown.android.internal.common.modal.data.model.WalletAppData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GetInstalledWalletsIdsUseCase implements GetInstalledWalletsIdsUseCaseInterface {
    public final AppKitApiRepository appKitApiRepository;

    /* JADX INFO: renamed from: com.reown.android.internal.common.modal.domain.usecase.GetInstalledWalletsIdsUseCase$invoke$1, reason: invalid class name */
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
            return GetInstalledWalletsIdsUseCase.this.invoke(null, this);
        }
    }

    public GetInstalledWalletsIdsUseCase(@NotNull AppKitApiRepository appKitApiRepository) {
        Intrinsics.checkNotNullParameter(appKitApiRepository, "");
        this.appKitApiRepository = appKitApiRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.reown.android.internal.common.modal.domain.usecase.GetInstalledWalletsIdsUseCaseInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull String str, @NotNull Continuation<? super List<String>> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object objM7207getAndroidWalletsDatagIAlus;
        Object objM7377constructorimpl;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            AppKitApiRepository appKitApiRepository = this.appKitApiRepository;
            anonymousClass1.label = 1;
            objM7207getAndroidWalletsDatagIAlus = appKitApiRepository.m7207getAndroidWalletsDatagIAlus(str, anonymousClass1);
            if (objM7207getAndroidWalletsDatagIAlus == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7207getAndroidWalletsDatagIAlus = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM7207getAndroidWalletsDatagIAlus)) {
            Result.Application application = Result.Companion;
            List list = (List) objM7207getAndroidWalletsDatagIAlus;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((WalletAppData) it.next()).getId());
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
        } else {
            objM7377constructorimpl = Result.m7377constructorimpl(objM7207getAndroidWalletsDatagIAlus);
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        return objM7377constructorimpl;
    }
}
