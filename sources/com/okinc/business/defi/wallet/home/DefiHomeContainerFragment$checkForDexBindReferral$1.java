package com.okinc.business.defi.wallet.home;

import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractActivityC33041mov;
import o.AbstractC58185ywX;
import o.C10337bmZ;
import o.C17670fNy;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9739bbK;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeContainerFragment$checkForDexBindReferral$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ DefiHomeContainerFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeContainerFragment$checkForDexBindReferral$1(DefiHomeContainerFragment defiHomeContainerFragment, Continuation<? super DefiHomeContainerFragment$checkForDexBindReferral$1> continuation) {
        super(2, continuation);
        this.this$0 = defiHomeContainerFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeContainerFragment$checkForDexBindReferral$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeContainerFragment$checkForDexBindReferral$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        DefiHomeContainerFragment defiHomeContainerFragment;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            defiHomeContainerFragment = this.this$0;
            Result.Application application2 = Result.Companion;
            AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null);
            this.L$0 = defiHomeContainerFragment;
            this.label = 1;
            if (AwaitKt.awaitFirst(abstractC58185ywXEnsureInitialized$default, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                DefiHomeContainerFragment defiHomeContainerFragment2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.copydefault(defiHomeContainerFragment2.getTAG(), "checkForDexBindReferral error: " + thM7380exceptionOrNullimpl.getMessage());
                }
                return Unit.INSTANCE;
            }
            defiHomeContainerFragment = (DefiHomeContainerFragment) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C17670fNy instance$default = C17670fNy.TaskDescription.getInstance$default(C17670fNy.Companion, null, 1, null);
        FragmentActivity activity = defiHomeContainerFragment.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            this.L$0 = null;
            this.label = 2;
            if (instance$default.KWHzl(abstractActivityC33041mov, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        DefiHomeContainerFragment defiHomeContainerFragment22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
