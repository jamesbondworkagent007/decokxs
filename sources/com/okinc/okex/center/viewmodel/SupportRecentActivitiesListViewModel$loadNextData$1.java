package com.okinc.okex.center.viewmodel;

import com.okinc.okex.center.bean.enums.TransactionType;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC45154skT;
import o.C45224slk;
import o.C45351soE;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportRecentActivitiesListViewModel$loadNextData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $page;
    final /* synthetic */ int $size;
    final /* synthetic */ TransactionType $type;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C45224slk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportRecentActivitiesListViewModel$loadNextData$1(C45224slk c45224slk, int i, int i2, TransactionType transactionType, Continuation<? super SupportRecentActivitiesListViewModel$loadNextData$1> continuation) {
        super(2, continuation);
        this.this$0 = c45224slk;
        this.$page = i;
        this.$size = i2;
        this.$type = transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportRecentActivitiesListViewModel$loadNextData$1 supportRecentActivitiesListViewModel$loadNextData$1 = new SupportRecentActivitiesListViewModel$loadNextData$1(this.this$0, this.$page, this.$size, this.$type, continuation);
        supportRecentActivitiesListViewModel$loadNextData$1.L$0 = obj;
        return supportRecentActivitiesListViewModel$loadNextData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportRecentActivitiesListViewModel$loadNextData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                C45224slk c45224slk = this.this$0;
                int i2 = this.$page;
                int i3 = this.$size;
                TransactionType transactionType = this.$type;
                Result.Application application = Result.Companion;
                C45351soE c45351soEDjBIcL = c45224slk.djBIcL();
                this.L$0 = coroutineScope;
                this.label = 1;
                objCopydefault = c45351soEDjBIcL.copydefault(i2, i3, transactionType, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(objCopydefault));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C45224slk c45224slk2 = this.this$0;
        TransactionType transactionType2 = this.$type;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            Object objM7386unboximpl = ((Result) objM7377constructorimpl).m7386unboximpl();
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            Pair pair = (Pair) objM7386unboximpl;
            if (pair != null) {
                boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
                c45224slk2.OLrzqt.setValue(new AbstractC45154skT.TaskDescription(transactionType2, (List) pair.component2(), zBooleanValue));
                c45224slk2.KWHzl.setValue(C56443yFo.KWHzl(zBooleanValue));
            } else {
                c45224slk2.OLrzqt.setValue(AbstractC45154skT.Activity.OLrzqt);
            }
        }
        C45224slk c45224slk3 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            c45224slk3.OLrzqt.setValue(AbstractC45154skT.Activity.OLrzqt);
        }
        return Unit.INSTANCE;
    }
}
