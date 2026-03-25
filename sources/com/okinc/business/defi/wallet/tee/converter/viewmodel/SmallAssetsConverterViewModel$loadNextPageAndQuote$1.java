package com.okinc.business.defi.wallet.tee.converter.viewmodel;

import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetQuoteData;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.fTY;
import o.fTZ;
import o.fUX;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetsConverterViewModel$loadNextPageAndQuote$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $startIndex;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ fUX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallAssetsConverterViewModel$loadNextPageAndQuote$1(fUX fux, int i, Continuation<? super SmallAssetsConverterViewModel$loadNextPageAndQuote$1> continuation) {
        super(2, continuation);
        this.this$0 = fux;
        this.$startIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmallAssetsConverterViewModel$loadNextPageAndQuote$1(this.this$0, this.$startIndex, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmallAssetsConverterViewModel$loadNextPageAndQuote$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0123  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        int iMin;
        List listAxsJAYsNCnLh;
        Object objCopydefault;
        List list;
        List list2;
        int i;
        List list3;
        List list4;
        List listDjBIcL;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.AhwBna;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, fTY.copy$default((fTY) value, 0, 0, true, false, null, null, null, 123, null)));
            iMin = Math.min(this.$startIndex + 50, this.this$0.isConnected.size());
            listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.this$0.isConnected.subList(this.$startIndex, iMin));
            fUX fux = this.this$0;
            this.L$0 = listAxsJAYsNCnLh;
            this.I$0 = iMin;
            this.label = 1;
            objCopydefault = fux.copydefault(listAxsJAYsNCnLh, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                list3 = (List) this.L$1;
                list4 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                list2 = list3;
                list = list4;
                iMin = i;
                fTY fty = (fTY) this.this$0.AhwBna.getValue();
                listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) fty.KWHzl(), (Iterable) list);
                List listDjBIcL2 = CollectionsKt___CollectionsKt.djBIcL((Collection) fty.OLrzqt(), (Iterable) list2);
                int iCopydefault = fty.copydefault();
                boolean z = iMin >= this.this$0.isConnected.size();
                this.this$0.AhwBna.setValue(fTY.copy$default(fty, iCopydefault + 1, 0, false, z, null, listDjBIcL, listDjBIcL2, 18, null));
                if (listDjBIcL.size() < 6 && z) {
                    this.this$0.fIwbmz();
                }
                return Unit.INSTANCE;
            }
            iMin = this.I$0;
            listAxsJAYsNCnLh = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        List listOLrzqt = this.this$0.OLrzqt((List<fTZ.Application>) listAxsJAYsNCnLh, (AbstractC43419rot<SmallAssetQuoteData, OKServerException>) objCopydefault);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listOLrzqt) {
            if (((fTZ.Application) obj2).EZpvd()) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        list = (List) pair.component1();
        list2 = (List) pair.component2();
        if (!list2.isEmpty()) {
            MutableSharedFlow mutableSharedFlow = this.this$0.djBIcL;
            Integer numAEQbTJ = C56443yFo.AEQbTJ(list2.size());
            this.L$0 = list;
            this.L$1 = list2;
            this.I$0 = iMin;
            this.label = 2;
            if (mutableSharedFlow.emit(numAEQbTJ, this) == objCopydefault2) {
                return objCopydefault2;
            }
            i = iMin;
            list3 = list2;
            list4 = list;
            list2 = list3;
            list = list4;
            iMin = i;
        }
        fTY fty2 = (fTY) this.this$0.AhwBna.getValue();
        listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) fty2.KWHzl(), (Iterable) list);
        List listDjBIcL22 = CollectionsKt___CollectionsKt.djBIcL((Collection) fty2.OLrzqt(), (Iterable) list2);
        int iCopydefault2 = fty2.copydefault();
        if (iMin >= this.this$0.isConnected.size()) {
        }
        this.this$0.AhwBna.setValue(fTY.copy$default(fty2, iCopydefault2 + 1, 0, false, z, null, listDjBIcL, listDjBIcL22, 18, null));
        if (listDjBIcL.size() < 6) {
            this.this$0.fIwbmz();
        }
        return Unit.INSTANCE;
    }
}
