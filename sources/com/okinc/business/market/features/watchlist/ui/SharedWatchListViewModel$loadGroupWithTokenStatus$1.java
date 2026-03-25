package com.okinc.business.market.features.watchlist.ui;

import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27767kCp;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class SharedWatchListViewModel$loadGroupWithTokenStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeToken $token;
    int label;
    final /* synthetic */ SharedWatchListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedWatchListViewModel$loadGroupWithTokenStatus$1(SharedWatchListViewModel sharedWatchListViewModel, HomeToken homeToken, Continuation<? super SharedWatchListViewModel$loadGroupWithTokenStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = sharedWatchListViewModel;
        this.$token = homeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SharedWatchListViewModel$loadGroupWithTokenStatus$1(this.this$0, this.$token, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SharedWatchListViewModel$loadGroupWithTokenStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Collection collectionAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C27767kCp c27767kCp = this.this$0.AhwBna;
            String strOLrzqt = this.$token.OLrzqt();
            String strAYXKKw = this.$token.AYXKKw();
            this.label = 1;
            objKWHzl = c27767kCp.KWHzl(strOLrzqt, strAYXKKw, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        List listAhwBna = yDY.AhwBna();
        if (Result.m7383isFailureimpl(objKWHzl)) {
            objKWHzl = listAhwBna;
        }
        Iterable iterable = (Iterable) objKWHzl;
        SharedWatchListViewModel sharedWatchListViewModel = this.this$0;
        ArrayList<CommonGroupUiModel> arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(sharedWatchListViewModel.gEmmrt.OLrzqt((CommonGroupData) it.next()));
        }
        if (!(!((Collection) this.this$0.EZpvd.getValue()).isEmpty())) {
            collectionAhwBna = yDY.AhwBna();
        } else {
            SharedWatchListViewModel sharedWatchListViewModel2 = this.this$0;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                CommonGroupUiModel commonGroupUiModel = (CommonGroupUiModel) obj2;
                Iterable iterable2 = (Iterable) sharedWatchListViewModel2.EZpvd.getValue();
                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((CommonGroupUiModel) it2.next()).KWHzl() == commonGroupUiModel.KWHzl()) {
                            break;
                        }
                    }
                }
                arrayList2.add(obj2);
            }
            collectionAhwBna = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                collectionAhwBna.add(CommonGroupUiModel.copy$default((CommonGroupUiModel) it3.next(), 0, null, 0, 0, 0, true, false, 95, null));
            }
        }
        this.this$0.isConnected.clear();
        Map map = this.this$0.isConnected;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
        for (CommonGroupUiModel commonGroupUiModel2 : arrayList) {
            Pair pairOLrzqt = C56390yDp.OLrzqt(C56443yFo.AEQbTJ(commonGroupUiModel2.KWHzl()), C56443yFo.KWHzl(commonGroupUiModel2.copydefault()));
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        map.putAll(linkedHashMap);
        this.this$0.EZpvd.setValue(arrayList);
        this.this$0.copydefault.setValue(arrayList);
        SharedWatchListViewModel sharedWatchListViewModel3 = this.this$0;
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(collectionAhwBna, 10));
        Iterator it4 = collectionAhwBna.iterator();
        while (it4.hasNext()) {
            sharedWatchListViewModel3.EZpvd(((CommonGroupUiModel) it4.next()).KWHzl());
            arrayList3.add(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
