package com.okinc.okmarket.data.watch;

import android.database.sqlite.SQLiteException;
import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.qVD;
import o.qWJ;
import o.qWN;
import o.sZS;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketWatchDataApiIMpl$queryWatchList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends WatchListData>>, Object> {
    final /* synthetic */ boolean $forceRefresh;
    final /* synthetic */ boolean $isNeedDex;
    int label;
    final /* synthetic */ sZS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketWatchDataApiIMpl$queryWatchList$2(boolean z, boolean z2, sZS szs, Continuation<? super MarketWatchDataApiIMpl$queryWatchList$2> continuation) {
        super(2, continuation);
        this.$forceRefresh = z;
        this.$isNeedDex = z2;
        this.this$0 = szs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketWatchDataApiIMpl$queryWatchList$2(this.$forceRefresh, this.$isNeedDex, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends WatchListData>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<WatchListData>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<WatchListData>> continuation) {
        return ((MarketWatchDataApiIMpl$queryWatchList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[Catch: SQLiteException -> 0x00bd, LOOP:2: B:22:0x004e->B:24:0x0054, LOOP_END, TryCatch #0 {SQLiteException -> 0x00bd, blocks: (B:6:0x0010, B:28:0x0071, B:29:0x007c, B:31:0x0082, B:33:0x0096, B:34:0x009a, B:35:0x00a7, B:37:0x00ad, B:10:0x001c, B:21:0x003f, B:22:0x004e, B:24:0x0054, B:13:0x0023, B:15:0x0027, B:16:0x002c, B:18:0x0030, B:25:0x0062), top: B:43:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[Catch: SQLiteException -> 0x00bd, TryCatch #0 {SQLiteException -> 0x00bd, blocks: (B:6:0x0010, B:28:0x0071, B:29:0x007c, B:31:0x0082, B:33:0x0096, B:34:0x009a, B:35:0x00a7, B:37:0x00ad, B:10:0x001c, B:21:0x003f, B:22:0x004e, B:24:0x0054, B:13:0x0023, B:15:0x0027, B:16:0x002c, B:18:0x0030, B:25:0x0062), top: B:43:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad A[Catch: SQLiteException -> 0x00bd, LOOP:1: B:35:0x00a7->B:37:0x00ad, LOOP_END, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00bd, blocks: (B:6:0x0010, B:28:0x0071, B:29:0x007c, B:31:0x0082, B:33:0x0096, B:34:0x009a, B:35:0x00a7, B:37:0x00ad, B:10:0x001c, B:21:0x003f, B:22:0x004e, B:24:0x0054, B:13:0x0023, B:15:0x0027, B:16:0x002c, B:18:0x0030, B:25:0x0062), top: B:43:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator it;
        Iterator it2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    C56391yDq.AEQbTJ(obj);
                    Iterable iterable = (Iterable) obj;
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(qWJ.EZpvd((MarketUserFavorite) it.next()));
                    }
                    return arrayList;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (!Intrinsics.EZpvd((Object) ((MarketUserFavorite) obj2).getInstType(), (Object) "CEDEFI")) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(qWJ.EZpvd((MarketUserFavorite) it2.next()));
                }
                return arrayList3;
            }
            C56391yDq.AEQbTJ(obj);
            if (this.$forceRefresh) {
                qVD.AEQbTJ.AEQbTJ(true);
            }
            if (this.$isNeedDex) {
                qWN qwn = this.this$0.AEQbTJ;
                this.label = 1;
                obj = qwn.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                Iterable iterable2 = (Iterable) obj;
                ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(iterable2, 10));
                it = iterable2.iterator();
                while (it.hasNext()) {
                }
                return arrayList4;
            }
            qWN qwn2 = this.this$0.AEQbTJ;
            this.label = 2;
            obj = qwn2.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            ArrayList arrayList22 = new ArrayList();
            while (r7.hasNext()) {
            }
            ArrayList arrayList32 = new ArrayList(C56403yEb.AYXKKw(arrayList22, 10));
            it2 = arrayList22.iterator();
            while (it2.hasNext()) {
            }
            return arrayList32;
        } catch (SQLiteException e) {
            e.printStackTrace();
            return yDY.AhwBna();
        }
    }
}
