package com.okinc.business.defi.assets.utxo.list;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.assets.utxo.utxomanagement.InvestUtxoAction;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoItem;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoItemIdentity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C10296bll;
import o.C10303bls;
import o.C10304blt;
import o.C10854bwM;
import o.C10954byG;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class InvestUtxoListViewModel extends ViewModel {
    public final CoroutineDispatcher AEQbTJ;
    public final MutableStateFlow<C10296bll> EZpvd;
    public final StateFlow<C10296bll> KWHzl;
    public final MutableStateFlow<C10304blt> OLrzqt;
    public final StateFlow<C10304blt> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C10304blt> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C10296bll> KWHzl() {
        return this.KWHzl;
    }

    @yCM
    public InvestUtxoListViewModel(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = coroutineDispatcher;
        MutableStateFlow<C10296bll> MutableStateFlow = StateFlowKt.MutableStateFlow(new C10296bll(yDY.AhwBna(), 0L, 0, 6, null));
        this.EZpvd = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C10304blt> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C10304blt(0, 0, 0L, false));
        this.OLrzqt = MutableStateFlow2;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow2);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), coroutineDispatcher, null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.assets.utxo.list.InvestUtxoListViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestUtxoListViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow = InvestUtxoListViewModel.this.EZpvd;
                final InvestUtxoListViewModel investUtxoListViewModel = InvestUtxoListViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.assets.utxo.list.InvestUtxoListViewModel.1.2
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public final Object emit(C10296bll c10296bll, Continuation<? super Unit> continuation) {
                        int i2;
                        List<C10303bls> listEZpvd = c10296bll.EZpvd();
                        if ((listEZpvd instanceof Collection) && listEZpvd.isEmpty()) {
                            i2 = 0;
                        } else {
                            Iterator<T> it = listEZpvd.iterator();
                            int i3 = 0;
                            while (it.hasNext()) {
                                if (((C10303bls) it.next()).AhwBna() && (i3 = i3 + 1) < 0) {
                                    yDY.djBIcL();
                                }
                            }
                            i2 = i3;
                        }
                        List<C10303bls> listEZpvd2 = c10296bll.EZpvd();
                        ArrayList arrayList = new ArrayList();
                        for (T t : listEZpvd2) {
                            if (((C10303bls) t).AhwBna()) {
                                arrayList.add(t);
                            }
                        }
                        Iterator<T> it2 = arrayList.iterator();
                        long jEZpvd = 0;
                        while (it2.hasNext()) {
                            jEZpvd += ((C10303bls) it2.next()).EZpvd();
                        }
                        Object objEmit = investUtxoListViewModel.OLrzqt.emit(new C10304blt(i2, c10296bll.OLrzqt(), jEZpvd, i2 == c10296bll.EZpvd().size()), continuation);
                        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (mutableStateFlow.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public final int KWHzl(Integer num) {
        if (num != null && num.intValue() == 8) {
            return 2;
        }
        return (num != null && num.intValue() == 7) ? 1 : -1;
    }

    public final void EZpvd(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        List<C10303bls> listEZpvd = this.KWHzl.getValue().EZpvd();
        Iterator<C10303bls> it = listEZpvd.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.EZpvd((Object) it.next().copydefault(), (Object) str)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0 || i >= listEZpvd.size()) {
            return;
        }
        List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) listEZpvd);
        listFJNWhG.set(i, C10303bls.copy$default((C10303bls) listFJNWhG.get(i), null, null, 0, 0L, 0, z, 31, null));
        this.EZpvd.setValue(C10296bll.copy$default(this.KWHzl.getValue(), listFJNWhG, 0L, 0, 6, null));
    }

    public final void OLrzqt() {
        List<C10303bls> listEZpvd = this.KWHzl.getValue().EZpvd();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        Iterator<T> it = listEZpvd.iterator();
        while (it.hasNext()) {
            arrayList.add(C10303bls.copy$default((C10303bls) it.next(), null, null, 0, 0L, 0, true, 31, null));
        }
        this.EZpvd.setValue(C10296bll.copy$default(this.KWHzl.getValue(), arrayList, 0L, 0, 6, null));
    }

    public final void copydefault() {
        List<C10303bls> listEZpvd = this.KWHzl.getValue().EZpvd();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        Iterator<T> it = listEZpvd.iterator();
        while (it.hasNext()) {
            arrayList.add(C10303bls.copy$default((C10303bls) it.next(), null, null, 0, 0L, 0, false, 31, null));
        }
        this.EZpvd.setValue(C10296bll.copy$default(this.KWHzl.getValue(), arrayList, 0L, 0, 6, null));
    }

    public final InvestUtxoAction AEQbTJ(long j) {
        List<C10303bls> listEZpvd = this.KWHzl.getValue().EZpvd();
        ArrayList<C10303bls> arrayList = new ArrayList();
        for (Object obj : listEZpvd) {
            if (((C10303bls) obj).AhwBna()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        long jEZpvd = 0;
        for (C10303bls c10303bls : arrayList) {
            jEZpvd += c10303bls.EZpvd();
            arrayList2.add(new UtxoItemIdentity(c10303bls.KWHzl(), c10303bls.AEQbTJ()));
        }
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(j);
        String strFJNWhG = c10854bwMCopydefault != null ? c10854bwMCopydefault.fJNWhG() : null;
        if (strFJNWhG == null) {
            strFJNWhG = "";
        }
        return new InvestUtxoAction(jEZpvd, arrayList2, strFJNWhG, null, 8, null);
    }

    public final void KWHzl(@NotNull List<UtxoItem> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((UtxoItem) it.next()).copydefault(false));
        }
        MutableStateFlow<C10296bll> mutableStateFlow = this.EZpvd;
        Iterator it2 = arrayList.iterator();
        long jEZpvd = 0;
        while (it2.hasNext()) {
            jEZpvd += ((C10303bls) it2.next()).EZpvd();
        }
        mutableStateFlow.setValue(new C10296bll(arrayList, jEZpvd, i));
    }
}
