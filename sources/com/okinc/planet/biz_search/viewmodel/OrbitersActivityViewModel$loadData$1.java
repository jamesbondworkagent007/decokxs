package com.okinc.planet.biz_search.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.okinc.planet.biz_search.model.Kol;
import com.okinc.planet.biz_search.model.OrbitKolSearchResult;
import com.okinc.uilab.stateful.StatefulView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C46097tHs;
import o.C47655tuH;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC46090tHl;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class OrbitersActivityViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isRefresh;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C46097tHs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrbitersActivityViewModel$loadData$1(C46097tHs c46097tHs, boolean z, Continuation<? super OrbitersActivityViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = c46097tHs;
        this.$isRefresh = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OrbitersActivityViewModel$loadData$1 orbitersActivityViewModel$loadData$1 = new OrbitersActivityViewModel$loadData$1(this.this$0, this.$isRefresh, continuation);
        orbitersActivityViewModel$loadData$1.L$0 = obj;
        return orbitersActivityViewModel$loadData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrbitersActivityViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        List<Object> listAhwBna;
        List<Object> listAhwBna2;
        List<Kol> kols;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C46097tHs c46097tHs = this.this$0;
                boolean z = this.$isRefresh;
                Result.Application application = Result.Companion;
                InterfaceC46090tHl interfaceC46090tHl = c46097tHs.AEQbTJ;
                String strAEQbTJ = c46097tHs.AEQbTJ();
                String str = z ? null : c46097tHs.OLrzqt;
                Integer numAEQbTJ = C56443yFo.AEQbTJ(c46097tHs.copydefault());
                this.label = 1;
                obj = interfaceC46090tHl.AEQbTJ(strAEQbTJ, str, numAEQbTJ, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((OrbitKolSearchResult) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = null;
        }
        OrbitKolSearchResult orbitKolSearchResult = (OrbitKolSearchResult) objM7377constructorimpl;
        this.this$0.OLrzqt = orbitKolSearchResult != null ? orbitKolSearchResult.getNextCursor() : null;
        C46097tHs c46097tHs2 = this.this$0;
        String str2 = c46097tHs2.OLrzqt;
        c46097tHs2.copydefault(!(str2 == null || str2.length() == 0));
        if (C33129mqd.KWHzl((Collection) (orbitKolSearchResult != null ? orbitKolSearchResult.getKols() : null))) {
            ArrayList arrayList = new ArrayList();
            if (this.$isRefresh) {
                kols = orbitKolSearchResult != null ? orbitKolSearchResult.getKols() : null;
                Intrinsics.copydefault(kols);
                arrayList.addAll(kols);
            } else {
                C47655tuH value = this.this$0.EZpvd().getValue();
                if (value == null || (listAhwBna2 = value.KWHzl()) == null) {
                    listAhwBna2 = yDY.AhwBna();
                }
                arrayList.addAll(listAhwBna2);
                kols = orbitKolSearchResult != null ? orbitKolSearchResult.getKols() : null;
                Intrinsics.copydefault(kols);
                arrayList.addAll(kols);
            }
            this.this$0.EZpvd().setValue(new C47655tuH(StatefulView.Status.Content, arrayList, this.this$0.KWHzl(), this.$isRefresh, null, 16, null));
        } else if (this.$isRefresh) {
            this.this$0.EZpvd().setValue(new C47655tuH(StatefulView.Status.Empty, yDY.AhwBna(), false, this.$isRefresh, null, 16, null));
        } else {
            MutableLiveData<C47655tuH> mutableLiveDataEZpvd = this.this$0.EZpvd();
            StatefulView.Status status = StatefulView.Status.Content;
            C47655tuH value2 = this.this$0.EZpvd().getValue();
            if (value2 == null || (listAhwBna = value2.KWHzl()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            mutableLiveDataEZpvd.setValue(new C47655tuH(status, listAhwBna, false, this.$isRefresh, null, 16, null));
        }
        return Unit.INSTANCE;
    }
}
