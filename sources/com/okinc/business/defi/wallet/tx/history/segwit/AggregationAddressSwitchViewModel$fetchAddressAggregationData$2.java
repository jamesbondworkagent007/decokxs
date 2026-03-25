package com.okinc.business.defi.wallet.tx.history.segwit;

import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C10525bqB;
import o.C10537bqN;
import o.C10854bwM;
import o.C19434gCf;
import o.C19437gCi;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.Point;

/* JADX INFO: loaded from: classes5.dex */
public final class AggregationAddressSwitchViewModel$fetchAddressAggregationData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ long $coinId;
    final /* synthetic */ String $currentAddress;
    final /* synthetic */ boolean $sortAddressByAssets;
    final /* synthetic */ String $walletId;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    final /* synthetic */ C19434gCf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregationAddressSwitchViewModel$fetchAddressAggregationData$2(C19434gCf c19434gCf, long j, String str, long j2, String str2, boolean z, Continuation<? super AggregationAddressSwitchViewModel$fetchAddressAggregationData$2> continuation) {
        super(2, continuation);
        this.this$0 = c19434gCf;
        this.$coinId = j;
        this.$walletId = str;
        this.$chainId = j2;
        this.$currentAddress = str2;
        this.$sortAddressByAssets = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AggregationAddressSwitchViewModel$fetchAddressAggregationData$2(this.this$0, this.$coinId, this.$walletId, this.$chainId, this.$currentAddress, this.$sortAddressByAssets, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AggregationAddressSwitchViewModel$fetchAddressAggregationData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x0175 */
    /* JADX DEBUG: Type inference failed for r5v5. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013c A[Catch: all -> 0x019a, CancellationException -> 0x01c7, TryCatch #2 {CancellationException -> 0x01c7, all -> 0x019a, blocks: (B:8:0x0029, B:36:0x012b, B:37:0x0136, B:39:0x013c, B:42:0x0150, B:43:0x0167, B:45:0x0177, B:46:0x017d, B:47:0x0181, B:49:0x0193, B:13:0x004e, B:32:0x0109, B:16:0x0073, B:22:0x00c4, B:24:0x00cc, B:25:0x00d0, B:27:0x00d6, B:28:0x00e4, B:19:0x0088), top: B:62:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0177 A[Catch: all -> 0x019a, CancellationException -> 0x01c7, TryCatch #2 {CancellationException -> 0x01c7, all -> 0x019a, blocks: (B:8:0x0029, B:36:0x012b, B:37:0x0136, B:39:0x013c, B:42:0x0150, B:43:0x0167, B:45:0x0177, B:46:0x017d, B:47:0x0181, B:49:0x0193, B:13:0x004e, B:32:0x0109, B:16:0x0073, B:22:0x00c4, B:24:0x00cc, B:25:0x00d0, B:27:0x00d6, B:28:0x00e4, B:19:0x0088), top: B:62:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ad  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object value;
        C19434gCf c19434gCf;
        long j;
        String str;
        long j2;
        String str2;
        boolean z;
        HashMap map;
        ArrayList arrayList;
        C10854bwM c10854bwMKWHzl;
        Object objAwait;
        AbstractC12782ctV abstractC12782ctV;
        C19434gCf c19434gCf2;
        C10854bwM c10854bwM;
        ArrayList arrayList2;
        HashMap map2;
        Object objAwait2;
        boolean z2;
        AbstractC12782ctV abstractC12782ctV2;
        ?? EZpvd;
        C19434gCf c19434gCf3;
        MutableStateFlow mutableStateFlow;
        Object value2;
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
            c19434gCf = this.this$0;
            j = this.$coinId;
            str = this.$walletId;
            j2 = this.$chainId;
            str2 = this.$currentAddress;
            z = this.$sortAddressByAssets;
            Result.Application application2 = Result.Companion;
            map = new HashMap();
            arrayList = new ArrayList();
            c10854bwMKWHzl = c19434gCf.KWHzl.KWHzl(C56443yFo.KWHzl(j));
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = c19434gCf.djBIcL.OLrzqt(str, false);
            this.L$0 = c19434gCf;
            this.L$1 = str;
            this.L$2 = str2;
            this.L$3 = map;
            this.L$4 = arrayList;
            this.L$5 = c10854bwMKWHzl;
            this.J$0 = j;
            this.J$1 = j2;
            this.Z$0 = z;
            this.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    z = this.Z$0;
                    abstractC12782ctV = (AbstractC12782ctV) this.L$4;
                    C10854bwM c10854bwM2 = (C10854bwM) this.L$3;
                    arrayList2 = (ArrayList) this.L$2;
                    HashMap map3 = (HashMap) this.L$1;
                    c19434gCf2 = (C19434gCf) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    c10854bwM = c10854bwM2;
                    map2 = map3;
                    AbstractC58260yxt<List<AddressData>> abstractC58260yxtEZpvd = c19434gCf2.EZpvd.EZpvd();
                    this.L$0 = c19434gCf2;
                    this.L$1 = map2;
                    this.L$2 = arrayList2;
                    this.L$3 = c10854bwM;
                    this.L$4 = abstractC12782ctV;
                    this.Z$0 = z;
                    this.label = 3;
                    objAwait2 = RxAwaitKt.await(abstractC58260yxtEZpvd, this);
                    if (objAwait2 != objCopydefault) {
                        return objCopydefault;
                    }
                    z2 = z;
                    abstractC12782ctV2 = abstractC12782ctV;
                    EZpvd = arrayList2;
                    c19434gCf3 = c19434gCf2;
                    Intrinsics.checkNotNullExpressionValue(objAwait2, "");
                    while (r5.hasNext()) {
                    }
                    if (z2) {
                    }
                    mutableStateFlow = c19434gCf3.copydefault;
                    do {
                        value2 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value2, new Point.Application(EZpvd)));
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    C19434gCf c19434gCf4 = this.this$0;
                    if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = this.Z$0;
                abstractC12782ctV2 = (AbstractC12782ctV) this.L$4;
                c10854bwM = (C10854bwM) this.L$3;
                ArrayList arrayList3 = (ArrayList) this.L$2;
                map2 = (HashMap) this.L$1;
                c19434gCf3 = (C19434gCf) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwait2 = obj;
                EZpvd = arrayList3;
                Intrinsics.checkNotNullExpressionValue(objAwait2, "");
                for (AddressData addressData : (Iterable) objAwait2) {
                    C10525bqB c10525bqB = (C10525bqB) map2.get(addressData.getAddress());
                    if (c10525bqB != null) {
                        C56443yFo.KWHzl(EZpvd.add(C19437gCi.Companion.AEQbTJ(c10525bqB, addressData)));
                    } else if (c10854bwM != null) {
                        C10525bqB.StateListAnimator stateListAnimator = C10525bqB.Companion;
                        Intrinsics.copydefault(abstractC12782ctV2);
                        EZpvd.add(C19437gCi.Companion.AEQbTJ(stateListAnimator.AEQbTJ(c10854bwM, abstractC12782ctV2, addressData.getAddress()), addressData));
                    }
                }
                if (z2) {
                    EZpvd = CollectionsKt___CollectionsKt.EZpvd((Iterable) EZpvd, C10537bqN.EZpvd);
                }
                mutableStateFlow = c19434gCf3.copydefault;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, new Point.Application(EZpvd)));
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                C19434gCf c19434gCf42 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    MutableStateFlow mutableStateFlow2 = c19434gCf42.copydefault;
                    do {
                        value = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value, new Point.TaskDescription(null, 1, null)));
                }
                return Unit.INSTANCE;
            }
            z = this.Z$0;
            j2 = this.J$1;
            j = this.J$0;
            c10854bwMKWHzl = (C10854bwM) this.L$5;
            arrayList = (ArrayList) this.L$4;
            map = (HashMap) this.L$3;
            str2 = (String) this.L$2;
            str = (String) this.L$1;
            c19434gCf = (C19434gCf) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAwait = obj;
        }
        abstractC12782ctV = (AbstractC12782ctV) objAwait;
        List<C10525bqB> listAYXKKw = abstractC12782ctV.AYXKKw(j);
        if (listAYXKKw != null) {
            for (C10525bqB c10525bqB2 : listAYXKKw) {
                map.put(c10525bqB2.zuBGHE(), c10525bqB2);
            }
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtKWHzl = c19434gCf.EZpvd.KWHzl(str, j2, str2);
        this.L$0 = c19434gCf;
        this.L$1 = map;
        this.L$2 = arrayList;
        this.L$3 = c10854bwMKWHzl;
        this.L$4 = abstractC12782ctV;
        this.L$5 = null;
        this.Z$0 = z;
        this.label = 2;
        if (RxAwaitKt.await(abstractC58260yxtKWHzl, this) == objCopydefault) {
            return objCopydefault;
        }
        c19434gCf2 = c19434gCf;
        c10854bwM = c10854bwMKWHzl;
        arrayList2 = arrayList;
        map2 = map;
        AbstractC58260yxt<List<AddressData>> abstractC58260yxtEZpvd2 = c19434gCf2.EZpvd.EZpvd();
        this.L$0 = c19434gCf2;
        this.L$1 = map2;
        this.L$2 = arrayList2;
        this.L$3 = c10854bwM;
        this.L$4 = abstractC12782ctV;
        this.Z$0 = z;
        this.label = 3;
        objAwait2 = RxAwaitKt.await(abstractC58260yxtEZpvd2, this);
        if (objAwait2 != objCopydefault) {
        }
    }
}
