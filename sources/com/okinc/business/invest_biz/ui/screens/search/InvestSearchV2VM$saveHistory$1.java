package com.okinc.business.invest_biz.ui.screens.search;

import com.okinc.business.invest_biz.data.bean.FilterChip;
import com.okinc.business.invest_biz.data.bean.FilterRecord;
import com.okinc.business.invest_biz.data.bean.InvestChip;
import com.okinc.business.invest_biz.data.bean.InvestSearchData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23542iAf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestSearchV2VM$saveHistory$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<InvestChip> $chips;
    int label;
    final /* synthetic */ InvestSearchV2VM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestSearchV2VM$saveHistory$1(InvestSearchV2VM investSearchV2VM, List<InvestChip> list, Continuation<? super InvestSearchV2VM$saveHistory$1> continuation) {
        super(2, continuation);
        this.this$0 = investSearchV2VM;
        this.$chips = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestSearchV2VM$saveHistory$1(this.this$0, this.$chips, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestSearchV2VM$saveHistory$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FilterChip filterChip;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C23542iAf c23542iAf = this.this$0.values;
            List<InvestChip> list = this.$chips;
            ArrayList arrayList = new ArrayList();
            for (InvestChip investChip : list) {
                InvestSearchData investSearchDataAEQbTJ = investChip.AEQbTJ();
                if (investSearchDataAEQbTJ != null) {
                    filterChip = new FilterChip(FilterChip.ItemType.PLATFORM, investSearchDataAEQbTJ);
                } else {
                    InvestSearchData investSearchDataOLrzqt = investChip.OLrzqt();
                    filterChip = investSearchDataOLrzqt != null ? new FilterChip(FilterChip.ItemType.TOKEN, investSearchDataOLrzqt) : null;
                }
                if (filterChip != null) {
                    arrayList.add(filterChip);
                }
            }
            FilterRecord filterRecord = new FilterRecord(arrayList);
            this.label = 1;
            if (c23542iAf.AEQbTJ(filterRecord, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
