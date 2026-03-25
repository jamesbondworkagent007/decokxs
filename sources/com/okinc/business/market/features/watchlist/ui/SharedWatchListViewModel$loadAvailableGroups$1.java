package com.okinc.business.market.features.watchlist.ui;

import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;

/* JADX INFO: loaded from: classes7.dex */
public final class SharedWatchListViewModel$loadAvailableGroups$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $currentGroupId;
    int label;
    final /* synthetic */ SharedWatchListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedWatchListViewModel$loadAvailableGroups$1(SharedWatchListViewModel sharedWatchListViewModel, int i, Continuation<? super SharedWatchListViewModel$loadAvailableGroups$1> continuation) {
        super(2, continuation);
        this.this$0 = sharedWatchListViewModel;
        this.$currentGroupId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SharedWatchListViewModel$loadAvailableGroups$1(this.this$0, this.$currentGroupId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SharedWatchListViewModel$loadAvailableGroups$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            SharedWatchListViewModel sharedWatchListViewModel = this.this$0;
            this.label = 1;
            obj = sharedWatchListViewModel.OLrzqt(true, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        }
        List list = (List) obj;
        this.this$0.OLrzqt.setValue(list);
        int i2 = this.$currentGroupId;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((CommonGroupData) obj2).OLrzqt() != i2) {
                arrayList.add(obj2);
            }
        }
        SharedWatchListViewModel sharedWatchListViewModel2 = this.this$0;
        ArrayList<CommonGroupUiModel> arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(sharedWatchListViewModel2.gEmmrt.OLrzqt((CommonGroupData) it.next()));
        }
        this.this$0.isConnected.clear();
        Map map = this.this$0.isConnected;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList2, 10)), 16));
        for (CommonGroupUiModel commonGroupUiModel : arrayList2) {
            Pair pairOLrzqt = C56390yDp.OLrzqt(C56443yFo.AEQbTJ(commonGroupUiModel.KWHzl()), C56443yFo.KWHzl(commonGroupUiModel.copydefault()));
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        map.putAll(linkedHashMap);
        this.this$0.EZpvd.setValue(arrayList2);
        this.this$0.copydefault.setValue(arrayList2);
        return Unit.INSTANCE;
    }
}
