package com.okinc.business.defi.wallet.home.addressDetail.domain.usecase;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.gKN;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileInfoUseCase$updateAddressAlias$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $collectAddress;
    final /* synthetic */ CancellableContinuation<String> $cont;
    final /* synthetic */ Context $context;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ String $originalAlias;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.String> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressProfileInfoUseCase$updateAddressAlias$2$1(Context context, FragmentManager fragmentManager, String str, String str2, CancellableContinuation<? super String> cancellableContinuation, Continuation<? super AddressProfileInfoUseCase$updateAddressAlias$2$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$fragmentManager = fragmentManager;
        this.$collectAddress = str;
        this.$originalAlias = str2;
        this.$cont = cancellableContinuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressProfileInfoUseCase$updateAddressAlias$2$1(this.$context, this.$fragmentManager, this.$collectAddress, this.$originalAlias, this.$cont, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressProfileInfoUseCase$updateAddressAlias$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                gKN gkn = (gKN) C43251rlk.copydefault(gKN.class);
                Context context = this.$context;
                FragmentManager fragmentManager = this.$fragmentManager;
                String str = this.$collectAddress;
                String str2 = this.$originalAlias;
                final CancellableContinuation<String> cancellableContinuation = this.$cont;
                Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.domain.usecase.AddressProfileInfoUseCase$updateAddressAlias$2$1.1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(String str3) {
                        OLrzqt(str3);
                        return Unit.INSTANCE;
                    }

                    public final void OLrzqt(String str3) {
                        Intrinsics.checkNotNullParameter(str3, "");
                        if (cancellableContinuation.isActive()) {
                            CancellableContinuation<String> cancellableContinuation2 = cancellableContinuation;
                            Result.Application application = Result.Companion;
                            cancellableContinuation2.resumeWith(Result.m7377constructorimpl(str3));
                        }
                    }
                };
                this.label = 1;
                if (gkn.AEQbTJ(context, fragmentManager, str, str2, function1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e) {
            if (this.$cont.isActive()) {
                CancellableContinuation<String> cancellableContinuation2 = this.$cont;
                Result.Application application = Result.Companion;
                cancellableContinuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(e)));
            }
        }
        return Unit.INSTANCE;
    }
}
