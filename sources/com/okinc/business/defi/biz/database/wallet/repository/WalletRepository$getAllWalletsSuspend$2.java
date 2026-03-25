package com.okinc.business.defi.biz.database.wallet.repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.AbstractC12782ctV;
import o.C11571cTe;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56548yJl;
import o.cQM;
import o.cSX;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletRepository$getAllWalletsSuspend$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends AbstractC12782ctV>>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ cQM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletRepository$getAllWalletsSuspend$2(cQM cqm, Continuation<? super WalletRepository$getAllWalletsSuspend$2> continuation) {
        super(2, continuation);
        this.this$0 = cqm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletRepository$getAllWalletsSuspend$2 walletRepository$getAllWalletsSuspend$2 = new WalletRepository$getAllWalletsSuspend$2(this.this$0, continuation);
        walletRepository$getAllWalletsSuspend$2.L$0 = obj;
        return walletRepository$getAllWalletsSuspend$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AbstractC12782ctV>> continuation) {
        return ((WalletRepository$getAllWalletsSuspend$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100 A[LOOP:1: B:32:0x00fa->B:34:0x0100, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAwait;
        CoroutineScope coroutineScope;
        Deferred deferred;
        Object objAwait2;
        CoroutineScope coroutineScope2;
        Map map;
        Object objAwaitAll;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new WalletRepository$getAllWalletsSuspend$2$rootWalletViews$1(this.this$0, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new WalletRepository$getAllWalletsSuspend$2$walletViews$1(this.this$0, null), 3, null);
            this.L$0 = coroutineScope3;
            this.L$1 = deferredAsync$default2;
            this.label = 1;
            objAwait = deferredAsync$default.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            coroutineScope = coroutineScope3;
            deferred = deferredAsync$default2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objAwaitAll = obj;
                    return C56403yEb.QOLQEE((Iterable) objAwaitAll);
                }
                Map map2 = (Map) this.L$1;
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                coroutineScope2 = coroutineScope4;
                map = map2;
                objAwait2 = obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : (Iterable) objAwait2) {
                    String strAxsJAYsNCnLh = ((C11571cTe) obj2).AxsJAYsNCnLh();
                    Object arrayList = linkedHashMap.get(strAxsJAYsNCnLh);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(strAxsJAYsNCnLh, arrayList);
                    }
                    ((List) arrayList).add(obj2);
                }
                cQM cqm = this.this$0;
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new WalletRepository$getAllWalletsSuspend$2$1$1(map, (String) entry.getKey(), (List) entry.getValue(), cqm, null), 3, null));
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                objAwaitAll = AwaitKt.awaitAll(arrayList2, this);
                if (objAwaitAll == objCopydefault) {
                    return objCopydefault;
                }
                return C56403yEb.QOLQEE((Iterable) objAwaitAll);
            }
            deferred = (Deferred) this.L$1;
            CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            coroutineScope = coroutineScope5;
            objAwait = obj;
        }
        Iterable iterable = (Iterable) objAwait;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(iterable, 10)), 16));
        for (Object obj3 : iterable) {
            linkedHashMap2.put(((cSX) obj3).getNewProxyInstance(), obj3);
        }
        this.L$0 = coroutineScope;
        this.L$1 = linkedHashMap2;
        this.label = 2;
        objAwait2 = deferred.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        coroutineScope2 = coroutineScope;
        map = linkedHashMap2;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        while (r2.hasNext()) {
        }
        cQM cqm2 = this.this$0;
        ArrayList arrayList22 = new ArrayList(linkedHashMap3.size());
        while (r14.hasNext()) {
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        objAwaitAll = AwaitKt.awaitAll(arrayList22, this);
        if (objAwaitAll == objCopydefault) {
        }
        return C56403yEb.QOLQEE((Iterable) objAwaitAll);
    }
}
