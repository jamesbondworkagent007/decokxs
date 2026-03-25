package com.okinc.tradingbot.impl.aiBot.ui.indicators;

import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorSectionUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56406yEe;
import o.C56442yFn;
import o.uCM;
import o.uDT;
import o.uDU;
import o.uLU;
import o.yDY;

/* JADX INFO: loaded from: classes11.dex */
public final class TechnicalIndicatorsViewModel$loadFromApi$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TechnicalIndicatorsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TechnicalIndicatorsViewModel$loadFromApi$1(TechnicalIndicatorsViewModel technicalIndicatorsViewModel, Continuation<? super TechnicalIndicatorsViewModel$loadFromApi$1> continuation) {
        super(2, continuation);
        this.this$0 = technicalIndicatorsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TechnicalIndicatorsViewModel$loadFromApi$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TechnicalIndicatorsViewModel$loadFromApi$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List listAhwBna;
        List list;
        List<IndicatorSectionUiModel> listAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                uDU udu = (uDU) ((uLU) this.this$0.KWHzl.getValue()).OLrzqt();
                if (udu == null || (listAEQbTJ = udu.AEQbTJ()) == null) {
                    listAhwBna = yDY.AhwBna();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = listAEQbTJ.iterator();
                    while (it.hasNext()) {
                        C56406yEe.KWHzl(arrayList, ((IndicatorSectionUiModel) it.next()).OLrzqt());
                    }
                    listAhwBna = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (((Indicator) obj2).gEmmrt()) {
                            listAhwBna.add(obj2);
                        }
                    }
                }
                this.this$0.KWHzl.setValue(uLU.Companion.EZpvd(true));
                uCM ucm = this.this$0.OLrzqt;
                Unit unit = Unit.INSTANCE;
                this.L$0 = listAhwBna;
                this.label = 1;
                Object objKWHzl = ucm.KWHzl(unit, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                list = listAhwBna;
                obj = objKWHzl;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            List listEZpvd = (List) obj;
            if (!list.isEmpty()) {
                listEZpvd = this.this$0.EZpvd(listEZpvd, list);
            }
            this.this$0.KWHzl.setValue(uLU.Companion.AEQbTJ(uDT.EZpvd(new uDU(listEZpvd, 0, this.this$0.copydefault, false, 10, null))));
        } catch (Exception e) {
            this.this$0.KWHzl.setValue(uLU.Companion.KWHzl(e));
        }
        return Unit.INSTANCE;
    }
}
