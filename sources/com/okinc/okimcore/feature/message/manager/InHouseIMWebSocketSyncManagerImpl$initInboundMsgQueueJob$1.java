package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44124sEe;
import o.C44302sKu;
import o.C44391sOb;
import o.C56391yDq;
import o.C56442yFn;
import o.sMS;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$initInboundMsgQueueJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$initInboundMsgQueueJob$1(C44302sKu c44302sKu, Continuation<? super InHouseIMWebSocketSyncManagerImpl$initInboundMsgQueueJob$1> continuation) {
        super(2, continuation);
        this.this$0 = c44302sKu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMWebSocketSyncManagerImpl$initInboundMsgQueueJob$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$initInboundMsgQueueJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0121 -> B:11:0x0020). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x013a -> B:11:0x0020). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            r47 = this;
            r0 = r47
            java.lang.Object r1 = o.C56437yFi.OLrzqt()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1d
            if (r2 == r4) goto L19
            if (r2 != r3) goto L11
            goto L1d
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L19:
            o.C56391yDq.AEQbTJ(r48)
            goto L2b
        L1d:
            o.C56391yDq.AEQbTJ(r48)
        L20:
            r0.label = r4
            r5 = 300(0x12c, double:1.48E-321)
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.delay(r5, r0)
            if (r2 != r1) goto L2b
            return r1
        L2b:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L30:
            o.sKu r2 = r0.this$0
            java.util.concurrent.ConcurrentLinkedQueue r2 = r2.isConnected()
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r4
            if (r2 == 0) goto L118
            o.sKu r2 = r0.this$0
            java.util.concurrent.ConcurrentLinkedQueue r2 = r2.isConnected()
            java.lang.Object r2 = r2.poll()
            com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData r2 = (com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData) r2
            if (r2 == 0) goto L30
            com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType r5 = r2.getContentType()
            com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType r6 = com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType.RecallMessageByAdmin
            if (r5 != r6) goto L10f
            com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData r5 = r2.getAdminRecallMessage()
            if (r5 == 0) goto L10f
            java.lang.Boolean r5 = r5.isInternal()
            java.lang.Boolean r6 = o.C56443yFo.KWHzl(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.EZpvd(r5, r6)
            if (r5 == 0) goto L10f
            com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData r5 = r2.getAdminRecallMessage()
            r6 = 0
            if (r5 == 0) goto L104
            java.util.List r5 = r5.getMsgSeqs()
            if (r5 == 0) goto L104
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = kotlin.collections.CollectionsKt.copydefault(r5, r8)
            r7.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L83:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L103
            java.lang.Object r8 = r5.next()
            java.lang.Number r8 = (java.lang.Number) r8
            long r10 = r8.longValue()
            com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData r12 = r2.getAdminRecallMessage()
            if (r12 == 0) goto Lb6
            java.lang.Long r13 = o.C56443yFo.KWHzl(r10)
            com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData r8 = r2.getAdminRecallMessage()
            if (r8 == 0) goto La9
            java.lang.Boolean r8 = r8.isInternal()
            r14 = r8
            goto Laa
        La9:
            r14 = r6
        Laa:
            r15 = 0
            r16 = 4
            r17 = 0
            com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData r8 = com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData.copy$default(r12, r13, r14, r15, r16, r17)
            r29 = r8
            goto Lb8
        Lb6:
            r29 = r6
        Lb8:
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = -262145(0xfffffffffffbffff, float:NaN)
            r45 = 1
            r46 = 0
            r10 = r2
            com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData r8 = com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData.copy$default(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r7.add(r8)
            goto L83
        L103:
            r6 = r7
        L104:
            if (r6 != 0) goto L10a
            java.util.List r6 = kotlin.collections.CollectionsKt.EZpvd()
        L10a:
            boolean r2 = r9.addAll(r6)
            goto L113
        L10f:
            boolean r2 = r9.add(r2)
        L113:
            o.C56443yFo.KWHzl(r2)
            goto L30
        L118:
            long r6 = java.lang.System.currentTimeMillis()
            boolean r2 = r9.isEmpty()
            r2 = r2 ^ r4
            if (r2 == 0) goto L20
            o.sKu r2 = r0.this$0
            o.sMV r2 = r2.fJNWhG()
            com.okinc.okimcore.feature.message.utility.TaskPriority r11 = com.okinc.okimcore.feature.message.utility.TaskPriority.HIGH
            com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$initInboundMsgQueueJob$1$2 r12 = new com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$initInboundMsgQueueJob$1$2
            o.sKu r8 = r0.this$0
            r10 = 0
            r5 = r12
            r5.<init>(r6, r8, r9, r10)
            r0.label = r3
            java.lang.Object r2 = r2.AEQbTJ(r11, r12, r0)
            if (r2 != r1) goto L20
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$initInboundMsgQueueJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$initInboundMsgQueueJob$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<WSSendMessageDetailData> $inBoundList;
        final /* synthetic */ long $queueStartTime;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C44302sKu this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, C44302sKu c44302sKu, List<WSSendMessageDetailData> list, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$queueStartTime = j;
            this.this$0 = c44302sKu;
            this.$inBoundList = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$queueStartTime, this.this$0, this.$inBoundList, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            Object objM7377constructorimpl2;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                try {
                } catch (Throwable th) {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } catch (Throwable th2) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                C44124sEe.imLogSync$default("incoming message => taskQueue waiting time: " + (System.currentTimeMillis() - this.$queueStartTime), null, null, 6, null);
                C44302sKu c44302sKu = this.this$0;
                List<WSSendMessageDetailData> list = this.$inBoundList;
                Result.Application application3 = Result.Companion;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!sMS.djBIcL.KWHzl((WSSendMessageDetailData) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                this.L$0 = coroutineScope;
                this.label = 1;
                if (c44302sKu.OLrzqt(arrayList, true, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    List<WSSendMessageDetailData> list2 = this.$inBoundList;
                    if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                        C44124sEe.imLogSync$default("insertInboundConversationTransactions => fail to update, " + list2, null, null, 6, null);
                    }
                    this.this$0.djBIcL();
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
            List<WSSendMessageDetailData> list3 = this.$inBoundList;
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl2) != null) {
                C44124sEe.imLogSync$default("insertInboundConversationTransactions => fail to insert, " + list3, null, null, 6, null);
            }
            List<WSSendMessageDetailData> list4 = this.$inBoundList;
            C44302sKu c44302sKu2 = this.this$0;
            Result.Application application4 = Result.Companion;
            ArrayList<WSSendMessageDetailData> arrayList2 = new ArrayList();
            for (Object obj3 : list4) {
                if (sMS.djBIcL.KWHzl((WSSendMessageDetailData) obj3)) {
                    arrayList2.add(obj3);
                }
            }
            for (WSSendMessageDetailData wSSendMessageDetailData : arrayList2) {
                String channelId = wSSendMessageDetailData.getChannelId();
                SystemMessageData systemMessage = wSSendMessageDetailData.getSystemMessage();
                if (channelId != null && systemMessage != null) {
                    c44302sKu2.copydefault.tryEmit(new C44391sOb(channelId, systemMessage));
                }
            }
            this.L$0 = null;
            this.label = 2;
            if (c44302sKu2.OLrzqt(arrayList2, this) == objCopydefault) {
                return objCopydefault;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            List<WSSendMessageDetailData> list22 = this.$inBoundList;
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            }
            this.this$0.djBIcL();
            return Unit.INSTANCE;
        }
    }
}
