package com.okinc.planet.biz_social_feeds;

import com.okinc.planet.biz_social_feeds.domain.FollowDynamicData;
import com.okinc.planet.biz_social_feeds.domain.FollowInnerData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C46133tJa;
import o.C46139tJg;
import o.C46147tJo;
import o.C46392tSq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.tIX;

/* JADX INFO: loaded from: classes24.dex */
public final class FollowerDataViewModel$internalRefresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ C46133tJa.Activity $previousIfSuccessData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C46133tJa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowerDataViewModel$internalRefresh$1(C46133tJa c46133tJa, boolean z, C46133tJa.Activity activity, Continuation<? super FollowerDataViewModel$internalRefresh$1> continuation) {
        super(2, continuation);
        this.this$0 = c46133tJa;
        this.$isRefresh = z;
        this.$previousIfSuccessData = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FollowerDataViewModel$internalRefresh$1 followerDataViewModel$internalRefresh$1 = new FollowerDataViewModel$internalRefresh$1(this.this$0, this.$isRefresh, this.$previousIfSuccessData, continuation);
        followerDataViewModel$internalRefresh$1.L$0 = obj;
        return followerDataViewModel$internalRefresh$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FollowerDataViewModel$internalRefresh$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0137  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        List<FollowInnerData> list;
        C46133tJa.Activity activity;
        List<C46139tJg> listOLrzqt;
        String strFIwbmz;
        C46133tJa.Activity activity2;
        List<C46139tJg> listOLrzqt2;
        C46139tJg c46139tJg;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            C46392tSq c46392tSq = C46392tSq.EZpvd;
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = c46392tSq.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (((Boolean) obj).booleanValue()) {
                    C46133tJa.setErrorViewState$default(this.this$0, null, 1, null);
                    return Unit.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                if (!this.$isRefresh && (activity = this.$previousIfSuccessData) != null && (listOLrzqt = activity.OLrzqt()) != null) {
                    C56443yFo.KWHzl(arrayList.addAll(listOLrzqt));
                }
                arrayList.addAll(tIX.KWHzl.AEQbTJ(list));
                C46133tJa.setSuccessViewState$default(this.this$0, arrayList, false, 2, null);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objM7377constructorimpl = Result.m7377constructorimpl((FollowDynamicData) obj);
            C46133tJa c46133tJa = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
                c46133tJa.KWHzl(thM7380exceptionOrNullimpl);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(objM7377constructorimpl);
            FollowDynamicData followDynamicData = (FollowDynamicData) objM7377constructorimpl;
            if (Intrinsics.EZpvd((Object) followDynamicData.AEQbTJ(), (Object) "0")) {
                C46133tJa.setSuccessViewState$default(this.this$0, null, false, 2, null);
                return Unit.INSTANCE;
            }
            List<FollowInnerData> listOLrzqt3 = followDynamicData.OLrzqt();
            if (listOLrzqt3.isEmpty()) {
                if (this.$isRefresh) {
                    C46133tJa.setSuccessViewState$default(this.this$0, null, false, 3, null);
                } else {
                    C46133tJa.setSuccessViewState$default(this.this$0, null, true, 1, null);
                }
                return Unit.INSTANCE;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : listOLrzqt3) {
                String strGEmmrt = ((FollowInnerData) obj2).gEmmrt();
                Object arrayList2 = linkedHashMap.get(strGEmmrt);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(strGEmmrt, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            Set<String> setKeySet = linkedHashMap.keySet();
            C46392tSq c46392tSq2 = C46392tSq.EZpvd;
            this.L$0 = listOLrzqt3;
            this.label = 3;
            Object objEZpvd = c46392tSq2.EZpvd(setKeySet, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            list = listOLrzqt3;
            obj = objEZpvd;
            if (((Boolean) obj).booleanValue()) {
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            C46133tJa.setErrorViewState$default(this.this$0, null, 1, null);
            return Unit.INSTANCE;
        }
        if (this.$isRefresh || (activity2 = this.$previousIfSuccessData) == null || (listOLrzqt2 = activity2.OLrzqt()) == null || (c46139tJg = (C46139tJg) CollectionsKt___CollectionsKt.wlaJM(listOLrzqt2)) == null || (strFIwbmz = c46139tJg.fIwbmz()) == null || StringsKt__StringsKt.fARcdN((CharSequence) strFIwbmz)) {
            strFIwbmz = null;
        }
        C46133tJa c46133tJa2 = this.this$0;
        Result.Application application2 = Result.Companion;
        C46147tJo c46147tJo = c46133tJa2.copydefault;
        C46147tJo.ActionBar actionBar = new C46147tJo.ActionBar(strFIwbmz);
        this.L$0 = null;
        this.label = 2;
        obj = c46147tJo.KWHzl(actionBar, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((FollowDynamicData) obj);
        C46133tJa c46133tJa3 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
        }
    }
}
