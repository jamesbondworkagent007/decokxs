package com.okinc.business.invest_biz.ui.page.dialog;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27294jsV;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC24127iVx;
import o.iTP;

/* JADX INFO: loaded from: classes6.dex */
public final class MerklClaimReminderViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ String $investmentId;
    final /* synthetic */ List<String> $unclaimedTokenAddress;
    int label;
    final /* synthetic */ MerklClaimReminderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerklClaimReminderViewModel$loadData$1(MerklClaimReminderViewModel merklClaimReminderViewModel, String str, long j, List<String> list, Continuation<? super MerklClaimReminderViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = merklClaimReminderViewModel;
        this.$investmentId = str;
        this.$chainId = j;
        this.$unclaimedTokenAddress = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MerklClaimReminderViewModel$loadData$1(this.this$0, this.$investmentId, this.$chainId, this.$unclaimedTokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MerklClaimReminderViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MerklClaimReminderViewModel merklClaimReminderViewModel = this.this$0;
                String str = this.$investmentId;
                long j = this.$chainId;
                List<String> list = this.$unclaimedTokenAddress;
                Result.Application application = Result.Companion;
                InterfaceC24127iVx interfaceC24127iVx = merklClaimReminderViewModel.copydefault;
                this.label = 1;
                obj = interfaceC24127iVx.copydefault(str, j, list, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        MerklClaimReminderViewModel merklClaimReminderViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            Pair<String, List<C27294jsV>> pairOLrzqt = merklClaimReminderViewModel2.EZpvd.OLrzqt((List) objM7377constructorimpl);
            merklClaimReminderViewModel2.OLrzqt.setValue(new iTP.Application(pairOLrzqt.getFirst(), pairOLrzqt.getSecond()));
        }
        MerklClaimReminderViewModel merklClaimReminderViewModel3 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            merklClaimReminderViewModel3.OLrzqt.setValue(iTP.StateListAnimator.OLrzqt);
        }
        return Unit.INSTANCE;
    }
}
