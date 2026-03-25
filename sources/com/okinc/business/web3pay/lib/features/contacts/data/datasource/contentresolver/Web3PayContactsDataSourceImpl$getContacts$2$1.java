package com.okinc.business.web3pay.lib.features.contacts.data.datasource.contentresolver;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C31252lqX;
import o.C31253lqY;
import o.C31313lrf;
import o.C31314lrg;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;
import o.yET;

/* JADX INFO: loaded from: classes23.dex */
public final class Web3PayContactsDataSourceImpl$getContacts$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends C31314lrg>>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C31313lrf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3PayContactsDataSourceImpl$getContacts$2$1(C31313lrf c31313lrf, Continuation<? super Web3PayContactsDataSourceImpl$getContacts$2$1> continuation) {
        super(2, continuation);
        this.this$0 = c31313lrf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Web3PayContactsDataSourceImpl$getContacts$2$1 web3PayContactsDataSourceImpl$getContacts$2$1 = new Web3PayContactsDataSourceImpl$getContacts$2$1(this.this$0, continuation);
        web3PayContactsDataSourceImpl$getContacts$2$1.L$0 = obj;
        return web3PayContactsDataSourceImpl$getContacts$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends C31314lrg>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<C31314lrg>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<C31314lrg>> continuation) {
        return ((Web3PayContactsDataSourceImpl$getContacts$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        HashMap map;
        Deferred deferredAsync$default;
        Object objAwait;
        Object objAwait2;
        HashMap map2;
        C31314lrg c31314lrg;
        C31314lrg c31314lrg2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            map = new HashMap();
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new Web3PayContactsDataSourceImpl$getContacts$2$1$phoneContacts$1(this.this$0, null), 3, null);
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new Web3PayContactsDataSourceImpl$getContacts$2$1$emailContacts$1(this.this$0, null), 3, null);
            this.L$0 = map;
            this.L$1 = deferredAsync$default;
            this.label = 1;
            objAwait = deferredAsync$default2.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map2 = (HashMap) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwait2 = obj;
                for (C31253lqY c31253lqY : (Iterable) objAwait2) {
                    C31314lrg c31314lrg3 = (C31314lrg) map2.get(C56443yFo.KWHzl(c31253lqY.EZpvd()));
                    Long lKWHzl = C56443yFo.KWHzl(c31253lqY.EZpvd());
                    if (c31314lrg3 == null || (c31314lrg2 = C31314lrg.copy$default(c31314lrg3, 0L, null, null, CollectionsKt___CollectionsKt.copydefault((Collection<? extends String>) c31314lrg3.EZpvd(), c31253lqY.KWHzl()), 7, null)) == null) {
                        c31314lrg2 = new C31314lrg(c31253lqY.EZpvd(), c31253lqY.OLrzqt(), yDY.AhwBna(), C56402yEa.EZpvd(c31253lqY.KWHzl()));
                    }
                    map2.put(lKWHzl, c31314lrg2);
                }
                Collection collectionValues = map2.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "");
                return CollectionsKt___CollectionsKt.EZpvd(collectionValues, new TaskDescription());
            }
            deferredAsync$default = (Deferred) this.L$1;
            HashMap map3 = (HashMap) this.L$0;
            C56391yDq.AEQbTJ(obj);
            map = map3;
            objAwait = obj;
        }
        for (C31252lqX c31252lqX : (Iterable) objAwait) {
            C31314lrg c31314lrg4 = (C31314lrg) map.get(C56443yFo.KWHzl(c31252lqX.copydefault()));
            Long lKWHzl2 = C56443yFo.KWHzl(c31252lqX.copydefault());
            if (c31314lrg4 == null || (c31314lrg = C31314lrg.copy$default(c31314lrg4, 0L, null, CollectionsKt___CollectionsKt.copydefault((Collection<? extends String>) c31314lrg4.OLrzqt(), c31252lqX.OLrzqt()), null, 11, null)) == null) {
                c31314lrg = new C31314lrg(c31252lqX.copydefault(), c31252lqX.AEQbTJ(), C56402yEa.EZpvd(c31252lqX.OLrzqt()), yDY.AhwBna());
            }
            map.put(lKWHzl2, c31314lrg);
        }
        this.L$0 = map;
        this.L$1 = null;
        this.label = 2;
        objAwait2 = deferredAsync$default.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        map2 = map;
        while (r2.hasNext()) {
        }
        Collection collectionValues2 = map2.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues2, "");
        return CollectionsKt___CollectionsKt.EZpvd(collectionValues2, new TaskDescription());
    }

    public static final class TaskDescription<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((C31314lrg) t).KWHzl(), ((C31314lrg) t2).KWHzl());
        }
    }
}
