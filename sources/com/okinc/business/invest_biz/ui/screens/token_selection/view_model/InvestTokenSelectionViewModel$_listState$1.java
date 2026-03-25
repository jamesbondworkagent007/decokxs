package com.okinc.business.invest_biz.ui.screens.token_selection.view_model;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__StringsKt;
import o.C26608jfY;
import o.C26663jga;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestTokenSelectionViewModel$_listState$1 extends SuspendLambda implements yHO<C26663jga, String, Continuation<? super List<? extends C26608jfY>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestTokenSelectionViewModel$_listState$1(Continuation<? super InvestTokenSelectionViewModel$_listState$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(C26663jga c26663jga, String str, Continuation<? super List<? extends C26608jfY>> continuation) {
        return invoke2(c26663jga, str, (Continuation<? super List<C26608jfY>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C26663jga c26663jga, String str, Continuation<? super List<C26608jfY>> continuation) {
        InvestTokenSelectionViewModel$_listState$1 investTokenSelectionViewModel$_listState$1 = new InvestTokenSelectionViewModel$_listState$1(continuation);
        investTokenSelectionViewModel$_listState$1.L$0 = c26663jga;
        investTokenSelectionViewModel$_listState$1.L$1 = str;
        return investTokenSelectionViewModel$_listState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C26663jga c26663jga = (C26663jga) this.L$0;
            String str = (String) this.L$1;
            List<InvestTokenWithAmount> listKWHzl = c26663jga.KWHzl();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listKWHzl) {
                if (StringsKt__StringsKt.AhwBna((CharSequence) ((InvestTokenWithAmount) obj2).getTokenSymbol(), (CharSequence) str, true)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(C26608jfY.Companion.AEQbTJ((InvestTokenWithAmount) it.next()));
            }
            return arrayList2;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
