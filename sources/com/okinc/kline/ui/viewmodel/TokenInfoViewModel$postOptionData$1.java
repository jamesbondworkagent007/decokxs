package com.okinc.kline.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C33069mpW;
import o.C35964oKf;
import o.C35966oKh;
import o.C37858pDh;
import o.C48916ueh;
import o.C54588xNy;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.pWO;
import o.xLJ;

/* JADX INFO: loaded from: classes9.dex */
public final class TokenInfoViewModel$postOptionData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $ccy;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C37858pDh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenInfoViewModel$postOptionData$1(C37858pDh c37858pDh, String str, Continuation<? super TokenInfoViewModel$postOptionData$1> continuation) {
        super(2, continuation);
        this.this$0 = c37858pDh;
        this.$ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenInfoViewModel$postOptionData$1(this.this$0, this.$ccy, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenInfoViewModel$postOptionData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        C37858pDh c37858pDh;
        String str;
        AbstractC54531xLw abstractC54531xLw;
        Object next;
        List list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            C54588xNy c54588xNy = new C54588xNy();
            this.label = 1;
            objAEQbTJ = interfaceC54577xNnKWHzl.AEQbTJ(false, c54588xNy, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$2;
                c37858pDh = (C37858pDh) this.L$1;
                C56391yDq.AEQbTJ(obj);
                abstractC54531xLw = (AbstractC54531xLw) obj;
                if (abstractC54531xLw != null) {
                    String str2 = null;
                    if (!c37858pDh.valueOf || (list = c37858pDh.values) == null || list.isEmpty()) {
                        c37858pDh.valueOf = true;
                        xLJ xlj = abstractC54531xLw instanceof xLJ ? (xLJ) abstractC54531xLw : null;
                        c37858pDh.values = xlj != null ? xlj.zsXlph() : null;
                    }
                    List list2 = c37858pDh.values;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (Intrinsics.EZpvd(((Pair) next).getFirst(), (Object) str)) {
                                break;
                            }
                        }
                        Pair pair = (Pair) next;
                        if (pair != null) {
                            str2 = (String) pair.getSecond();
                        }
                    }
                    MutableLiveData<List<C48916ueh>> mutableLiveDataHDKMBd = c37858pDh.hDKMBd();
                    String strKWHzl = C33069mpW.KWHzl(c37858pDh.copydefault, C35964oKf.Fragment.dPkBzA, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", str)));
                    String str3 = c37858pDh.djBIcL;
                    String strKWHzl2 = C33069mpW.KWHzl(c37858pDh.copydefault, C35966oKh.TaskDescription.AEQbTJ, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("value1", str), C56390yDp.OLrzqt("value2", c37858pDh.AhwBna)));
                    if (str2 == null) {
                        str2 = str + "-USD";
                    }
                    mutableLiveDataHDKMBd.postValue(C56402yEa.EZpvd(new C48916ueh(strKWHzl, str3, strKWHzl2, str2)));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        c37858pDh = this.this$0;
        String str4 = this.$ccy;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            this.L$0 = objAEQbTJ;
            this.L$1 = c37858pDh;
            this.L$2 = str4;
            this.label = 2;
            obj = ((InterfaceC54581xNr) objAEQbTJ).EZpvd("OPTION", this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            str = str4;
            abstractC54531xLw = (AbstractC54531xLw) obj;
            if (abstractC54531xLw != null) {
            }
        }
        return Unit.INSTANCE;
    }
}
