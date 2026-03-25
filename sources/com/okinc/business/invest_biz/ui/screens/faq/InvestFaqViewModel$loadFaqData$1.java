package com.okinc.business.invest_biz.ui.screens.faq;

import com.okinc.business.invest_biz.data.models.InvestQaVo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC26375jbD;
import o.AbstractC43419rot;
import o.C27284jsL;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23641iDx;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestFaqViewModel$loadFaqData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InvestFaqViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestFaqViewModel$loadFaqData$1(InvestFaqViewModel investFaqViewModel, Continuation<? super InvestFaqViewModel$loadFaqData$1> continuation) {
        super(2, continuation);
        this.this$0 = investFaqViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestFaqViewModel$loadFaqData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestFaqViewModel$loadFaqData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl.setValue(AbstractC26375jbD.ActionBar.KWHzl);
            InterfaceC23641iDx interfaceC23641iDx = this.this$0.EZpvd;
            this.label = 1;
            obj = interfaceC23641iDx.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        InvestFaqViewModel investFaqViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            List<InvestQaVo> list = (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            ArrayList arrayList = new ArrayList();
            for (InvestQaVo investQaVo : list) {
                arrayList.add(new C27284jsL.StateListAnimator(investQaVo.getQuestion(), investQaVo.getAnswer()));
            }
            investFaqViewModel.KWHzl.setValue(new AbstractC26375jbD.Activity(arrayList));
        }
        InvestFaqViewModel investFaqViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            investFaqViewModel2.KWHzl.setValue(AbstractC26375jbD.Application.KWHzl);
        }
        return Unit.INSTANCE;
    }
}
