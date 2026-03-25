package com.okinc.business.defi.wallet.mine.checkversion.domain.usecase;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC18810fpT;
import o.AbstractC58260yxt;
import o.C13912dbY;
import o.C13934dbu;
import o.C18814fpX;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckWalletTermsVersionUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends AbstractC18810fpT>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C18814fpX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckWalletTermsVersionUseCase$invoke$2(C18814fpX c18814fpX, Continuation<? super CheckWalletTermsVersionUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c18814fpX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckWalletTermsVersionUseCase$invoke$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends AbstractC18810fpT>> continuation) {
        return ((CheckWalletTermsVersionUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objDbNXlk;
        String str;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.this$0.OLrzqt && !this.this$0.AEQbTJ()) {
                this.this$0.OLrzqt = true;
                C13934dbu c13934dbu = this.this$0.EZpvd;
                this.label = 1;
                objDbNXlk = c13934dbu.DbNXlk(this);
                if (objDbNXlk == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                Result.Application application = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(AbstractC18810fpT.StateListAnimator.copydefault));
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (((Boolean) obj).booleanValue()) {
                    C13912dbY.copydefault.copydefault(str);
                    Result.Application application2 = Result.Companion;
                    return Result.m7376boximpl(Result.m7377constructorimpl(AbstractC18810fpT.TaskDescription.copydefault));
                }
                if (!Intrinsics.EZpvd((Object) str, (Object) C13912dbY.copydefault.valueOf())) {
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(new AbstractC18810fpT.ActionBar(str));
                } else {
                    Result.Application application4 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(AbstractC18810fpT.StateListAnimator.copydefault);
                }
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objDbNXlk = ((Result) obj).m7386unboximpl();
        }
        C18814fpX c18814fpX = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objDbNXlk);
        if (thM7380exceptionOrNullimpl == null) {
            String str2 = (String) objDbNXlk;
            if (str2.length() != 0) {
                AbstractC58260yxt<Boolean> abstractC58260yxtOLrzqt = c18814fpX.KWHzl.OLrzqt(false);
                this.L$0 = str2;
                this.label = 2;
                Object objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                str = str2;
                obj = objAwait;
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                Result.Application application5 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(AbstractC18810fpT.Activity.copydefault));
            }
        } else {
            Result.Application application6 = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
        }
    }
}
