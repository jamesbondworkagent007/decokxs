package com.okinc.okimcore.usecase;

import com.okinc.okimcore.model.im.GetMessageDirection;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageWithReactions;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sNH;
import o.sNO;
import o.yET;

/* JADX INFO: loaded from: classes10.dex */
public final class MessagesUseCase$loadOfflineMessagesInBothDirections$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends List<? extends InHouseIMMessageWithReactions>, ? extends Long>>, Object> {
    final /* synthetic */ Long $lastReadMsgSeq;
    final /* synthetic */ long $maxSeq;
    final /* synthetic */ sNH $request;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44502sSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesUseCase$loadOfflineMessagesInBothDirections$2(C44502sSe c44502sSe, sNH snh, Long l, long j, Continuation<? super MessagesUseCase$loadOfflineMessagesInBothDirections$2> continuation) {
        super(2, continuation);
        this.this$0 = c44502sSe;
        this.$request = snh;
        this.$lastReadMsgSeq = l;
        this.$maxSeq = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessagesUseCase$loadOfflineMessagesInBothDirections$2 messagesUseCase$loadOfflineMessagesInBothDirections$2 = new MessagesUseCase$loadOfflineMessagesInBothDirections$2(this.this$0, this.$request, this.$lastReadMsgSeq, this.$maxSeq, continuation);
        messagesUseCase$loadOfflineMessagesInBothDirections$2.L$0 = obj;
        return messagesUseCase$loadOfflineMessagesInBothDirections$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends List<? extends InHouseIMMessageWithReactions>, ? extends Long>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<? extends List<InHouseIMMessageWithReactions>, Long>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<? extends List<InHouseIMMessageWithReactions>, Long>> continuation) {
        return ((MessagesUseCase$loadOfflineMessagesInBothDirections$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class ActionBar<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Long.valueOf(((InHouseIMMessageWithReactions) t).getImMessageEntity().getSeq()), Long.valueOf(((InHouseIMMessageWithReactions) t2).getImMessageEntity().getSeq()));
        }
    }

    public static final class StateListAnimator<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Long.valueOf(((InHouseIMMessageWithReactions) t2).getImMessageEntity().getSeq()), Long.valueOf(((InHouseIMMessageWithReactions) t).getImMessageEntity().getSeq()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0178  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineScope coroutineScope;
        long jCurrentTimeMillis;
        Object objCopydefault;
        long jLongValue;
        long j;
        Object objOLrzqt;
        Object objAwaitAll;
        long j2;
        long j3;
        Boolean boolEZpvd;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            jCurrentTimeMillis = System.currentTimeMillis();
            C44502sSe c44502sSe = this.this$0;
            String strCopydefault = this.$request.copydefault();
            Long l = this.$lastReadMsgSeq;
            long jLongValue2 = l != null ? l.longValue() : this.$maxSeq;
            this.L$0 = coroutineScope;
            this.J$0 = jCurrentTimeMillis;
            this.label = 1;
            objCopydefault = c44502sSe.copydefault(strCopydefault, jLongValue2, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j4 = this.J$0;
                    C56391yDq.AEQbTJ(obj);
                    j = j4;
                    objOLrzqt = obj;
                    return new Pair((List) objOLrzqt, C56443yFo.KWHzl(j));
                }
                long j5 = this.J$1;
                long j6 = this.J$0;
                C56391yDq.AEQbTJ(obj);
                j2 = j6;
                j3 = j5;
                objAwaitAll = obj;
                List list = (List) objAwaitAll;
                List list2 = (List) list.get(0);
                List list3 = (List) list.get(1);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                pUU.KWHzl("MessagesUseCase", "channelId is " + this.$request.copydefault() + ", loadOfflineMessagesInBothDirections => completed, timeCost: " + (jCurrentTimeMillis2 - j3) + "ms, topResult size: " + list2.size() + ", bottomResult size: " + list3.size());
                List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) list2, (Iterable) list3);
                boolEZpvd = this.$request.EZpvd();
                if (boolEZpvd != null) {
                    if (!Intrinsics.EZpvd(boolEZpvd, C56443yFo.KWHzl(true))) {
                        if (!Intrinsics.EZpvd(boolEZpvd, C56443yFo.KWHzl(false))) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listDjBIcL = CollectionsKt___CollectionsKt.EZpvd(listDjBIcL, new StateListAnimator());
                    } else {
                        listDjBIcL = CollectionsKt___CollectionsKt.EZpvd(listDjBIcL, new ActionBar());
                    }
                }
                return new Pair(listDjBIcL, C56443yFo.KWHzl(j2));
            }
            jCurrentTimeMillis = this.J$0;
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        long jLongValue3 = ((Number) objCopydefault).longValue();
        if (this.$request.valueOf()) {
            jLongValue = jLongValue3;
        } else {
            Long lKWHzl = this.$request.KWHzl();
            jLongValue = lKWHzl != null ? lKWHzl.longValue() : 0L;
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        pUU.KWHzl("MessagesUseCase", "channelId is " + this.$request.copydefault() + ",loadOfflineMessagesInBothDirections => targetSeq: " + jLongValue + ", timeCost: " + (jCurrentTimeMillis3 - jCurrentTimeMillis) + "ms, ");
        if (jLongValue > 0) {
            long jCurrentTimeMillis4 = System.currentTimeMillis();
            long j7 = jLongValue;
            Deferred[] deferredArr = {BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MessagesUseCase$loadOfflineMessagesInBothDirections$2$topDeferred$1(this.this$0, this.$request, j7, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MessagesUseCase$loadOfflineMessagesInBothDirections$2$bottomDeferred$1(this.this$0, this.$request, j7, null), 3, null)};
            this.L$0 = null;
            this.J$0 = jLongValue3;
            this.J$1 = jCurrentTimeMillis4;
            this.label = 2;
            objAwaitAll = AwaitKt.awaitAll(deferredArr, this);
            if (objAwaitAll == objCopydefault2) {
                return objCopydefault2;
            }
            j2 = jLongValue3;
            j3 = jCurrentTimeMillis4;
            List list4 = (List) objAwaitAll;
            List list22 = (List) list4.get(0);
            List list32 = (List) list4.get(1);
            long jCurrentTimeMillis22 = System.currentTimeMillis();
            pUU.KWHzl("MessagesUseCase", "channelId is " + this.$request.copydefault() + ", loadOfflineMessagesInBothDirections => completed, timeCost: " + (jCurrentTimeMillis22 - j3) + "ms, topResult size: " + list22.size() + ", bottomResult size: " + list32.size());
            List listDjBIcL2 = CollectionsKt___CollectionsKt.djBIcL((Collection) list22, (Iterable) list32);
            boolEZpvd = this.$request.EZpvd();
            if (boolEZpvd != null) {
            }
            return new Pair(listDjBIcL2, C56443yFo.KWHzl(j2));
        }
        j = jLongValue3;
        pUU.KWHzl("MessagesUseCase", "channelId is " + this.$request.copydefault() + ",loadOfflineMessagesInBothDirections => no unread messages found, targetSeq: " + jLongValue);
        C44502sSe c44502sSe2 = this.this$0;
        sNO sno = new sNO(this.$request.copydefault(), this.$request.KWHzl(), this.$request.djBIcL(), this.$request.EZpvd(), this.$request.AEQbTJ() == GetMessageDirection.TOP, 0, true, 32, null);
        this.L$0 = null;
        this.J$0 = j;
        this.label = 3;
        objOLrzqt = c44502sSe2.OLrzqt(sno, this);
        if (objOLrzqt == objCopydefault2) {
            return objCopydefault2;
        }
        return new Pair((List) objOLrzqt, C56443yFo.KWHzl(j));
    }
}
