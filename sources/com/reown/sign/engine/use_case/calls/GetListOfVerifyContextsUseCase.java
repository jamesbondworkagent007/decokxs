package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.storage.verify.VerifyContextStorageRepository;
import com.reown.android.verify.model.VerifyContext;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GetListOfVerifyContextsUseCase implements GetListOfVerifyContextsUseCaseInterface {
    public final VerifyContextStorageRepository verifyContextStorageRepository;

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.GetListOfVerifyContextsUseCase$getListOfVerifyContexts$1, reason: invalid class name */
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
            return GetListOfVerifyContextsUseCase.this.getListOfVerifyContexts(this);
        }
    }

    public GetListOfVerifyContextsUseCase(@NotNull VerifyContextStorageRepository verifyContextStorageRepository) {
        Intrinsics.checkNotNullParameter(verifyContextStorageRepository, "");
        this.verifyContextStorageRepository = verifyContextStorageRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.reown.sign.engine.use_case.calls.GetListOfVerifyContextsUseCaseInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getListOfVerifyContexts(@NotNull Continuation<? super List<EngineDO.VerifyContext>> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object all = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(all);
            VerifyContextStorageRepository verifyContextStorageRepository = this.verifyContextStorageRepository;
            anonymousClass1.label = 1;
            all = verifyContextStorageRepository.getAll(anonymousClass1);
            if (all == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(all);
        }
        Iterable iterable = (Iterable) all;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(EngineMapperKt.toEngineDO((VerifyContext) it.next()));
        }
        return arrayList;
    }
}
