package com.okinc.dexkline.market.features.history.ui;

import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32380mZw;
import o.C34374naq;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class HistoryChangeViewModel$reloadInternally$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFirstPage;
    final /* synthetic */ String $lastItemId;
    int label;
    final /* synthetic */ HistoryChangeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryChangeViewModel$reloadInternally$1(boolean z, HistoryChangeViewModel historyChangeViewModel, String str, Continuation<? super HistoryChangeViewModel$reloadInternally$1> continuation) {
        super(2, continuation);
        this.$isFirstPage = z;
        this.this$0 = historyChangeViewModel;
        this.$lastItemId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryChangeViewModel$reloadInternally$1(this.$isFirstPage, this.this$0, this.$lastItemId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HistoryChangeViewModel$reloadInternally$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C34374naq c34374naq;
        Object objM8689invokeBWLJW6A$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$isFirstPage) {
                c34374naq = new C34374naq(false, true, false, false, null, false, 61, null);
            } else {
                c34374naq = new C34374naq(false, false, true, false, null, false, 59, null);
            }
            this.this$0.AhwBna.setValue(c34374naq);
            C32380mZw c32380mZw = this.this$0.fIwbmz;
            String str = this.$lastItemId;
            TokenFilter tokenFilterEZpvd = this.this$0.EZpvd();
            this.label = 1;
            objM8689invokeBWLJW6A$default = C32380mZw.m8689invokeBWLJW6A$default(c32380mZw, str, tokenFilterEZpvd, false, this, 4, null);
            if (objM8689invokeBWLJW6A$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8689invokeBWLJW6A$default = ((Result) obj).m7386unboximpl();
        }
        HistoryChangeViewModel historyChangeViewModel = this.this$0;
        boolean z = this.$isFirstPage;
        if (Result.m7384isSuccessimpl(objM8689invokeBWLJW6A$default)) {
            historyChangeViewModel.AhwBna.setValue(new C34374naq(((Boolean) objM8689invokeBWLJW6A$default).booleanValue(), false, false, false, null, false, 62, null));
            if (z) {
                historyChangeViewModel.KWHzl(historyChangeViewModel.EZpvd());
            }
        }
        boolean z2 = this.$isFirstPage;
        HistoryChangeViewModel historyChangeViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8689invokeBWLJW6A$default);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl(thM7380exceptionOrNullimpl);
            if (!z2) {
                historyChangeViewModel2.AhwBna.setValue(new C34374naq(false, false, false, true, null, false, 55, null));
            } else {
                historyChangeViewModel2.AhwBna.setValue(new C34374naq(false, false, false, false, thM7380exceptionOrNullimpl, false, 47, null));
            }
        }
        return Unit.INSTANCE;
    }
}
