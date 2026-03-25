package com.okinc.business.defi.wallet.tx.history.segwit;

import com.okinc.business.defi.biz.model.ChainAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C10854bwM;
import o.C10954byG;
import o.C11205cFp;
import o.C19434gCf;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.Point;
import o.gCC;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class AggregationAddressSwitchViewModel$updateDefaultAggregationAddress$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ int $addressType;
    final /* synthetic */ long $chainId;
    final /* synthetic */ AbstractC12782ctV $wallet;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C19434gCf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregationAddressSwitchViewModel$updateDefaultAggregationAddress$2(AbstractC12782ctV abstractC12782ctV, long j, String str, int i, C19434gCf c19434gCf, Continuation<? super AggregationAddressSwitchViewModel$updateDefaultAggregationAddress$2> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.$chainId = j;
        this.$address = str;
        this.$addressType = i;
        this.this$0 = c19434gCf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AggregationAddressSwitchViewModel$updateDefaultAggregationAddress$2(this.$wallet, this.$chainId, this.$address, this.$addressType, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AggregationAddressSwitchViewModel$updateDefaultAggregationAddress$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Object value;
        Object value2;
        String strDjBIcL;
        AbstractC12782ctV abstractC12782ctV;
        C19434gCf c19434gCf;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            abstractC12782ctV = this.$wallet;
            long j = this.$chainId;
            String str = this.$address;
            int i2 = this.$addressType;
            C19434gCf c19434gCf2 = this.this$0;
            Result.Application application2 = Result.Companion;
            AbstractC58185ywX<Integer> abstractC58185ywXOLrzqt = abstractC12782ctV.OLrzqt(j, str, i2);
            this.L$0 = abstractC12782ctV;
            this.L$1 = c19434gCf2;
            this.label = 1;
            if (AwaitKt.awaitFirst(abstractC58185ywXOLrzqt, this) == objCopydefault) {
                return objCopydefault;
            }
            c19434gCf = c19434gCf2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) obj);
                C19434gCf c19434gCf3 = this.this$0;
                String str2 = this.$address;
                int i3 = this.$addressType;
                long j2 = this.$chainId;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) objM7377constructorimpl;
                    C11205cFp c11205cFp = c19434gCf3.AYXKKw;
                    ArrayList<ChainAddress> arrayListIsConnected = abstractC12782ctV2.isConnected();
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(arrayListIsConnected, 10));
                    Iterator<T> it = arrayListIsConnected.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ChainAddress) it.next()).getAddress());
                    }
                    c11205cFp.OLrzqt(arrayList);
                    MutableStateFlow mutableStateFlow = c19434gCf3.OLrzqt;
                    do {
                        value2 = mutableStateFlow.getValue();
                        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(C56443yFo.KWHzl(j2));
                        strDjBIcL = c10854bwMKWHzl != null ? c10854bwMKWHzl.djBIcL() : null;
                        if (strDjBIcL == null) {
                            strDjBIcL = "";
                        }
                        Intrinsics.copydefault(abstractC12782ctV2);
                    } while (!mutableStateFlow.compareAndSet(value2, new Point.Application(new gCC(str2, i3, strDjBIcL, abstractC12782ctV2))));
                }
                C19434gCf c19434gCf4 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableStateFlow mutableStateFlow2 = c19434gCf4.OLrzqt;
                    do {
                        value = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value, new Point.TaskDescription(null, 1, null)));
                    pUU.copydefault("updateDefaultAggregationAddress error: " + thM7380exceptionOrNullimpl.getLocalizedMessage());
                }
                return Unit.INSTANCE;
            }
            c19434gCf = (C19434gCf) this.L$1;
            abstractC12782ctV = (AbstractC12782ctV) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = c19434gCf.djBIcL.OLrzqt(abstractC12782ctV.DbNXlk(), true);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) obj);
        C19434gCf c19434gCf32 = this.this$0;
        String str22 = this.$address;
        int i32 = this.$addressType;
        long j22 = this.$chainId;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        C19434gCf c19434gCf42 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
