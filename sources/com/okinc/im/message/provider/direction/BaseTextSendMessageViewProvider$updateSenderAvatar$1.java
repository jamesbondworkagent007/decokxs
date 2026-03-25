package com.okinc.im.message.provider.direction;

import com.okinc.im.bean.IMUserInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35254nrp;
import o.C35893oHp;
import o.C43251rlk;
import o.C44170sFx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35179nqT;
import o.oAT;

/* JADX INFO: loaded from: classes18.dex */
public final class BaseTextSendMessageViewProvider$updateSenderAvatar$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C35893oHp $imageView;
    final /* synthetic */ C35254nrp $item;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ oAT<C> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTextSendMessageViewProvider$updateSenderAvatar$1(oAT<C> oat, C35254nrp c35254nrp, C35893oHp c35893oHp, Continuation<? super BaseTextSendMessageViewProvider$updateSenderAvatar$1> continuation) {
        super(2, continuation);
        this.this$0 = oat;
        this.$item = c35254nrp;
        this.$imageView = c35893oHp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseTextSendMessageViewProvider$updateSenderAvatar$1 baseTextSendMessageViewProvider$updateSenderAvatar$1 = new BaseTextSendMessageViewProvider$updateSenderAvatar$1(this.this$0, this.$item, this.$imageView, continuation);
        baseTextSendMessageViewProvider$updateSenderAvatar$1.L$0 = obj;
        return baseTextSendMessageViewProvider$updateSenderAvatar$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseTextSendMessageViewProvider$updateSenderAvatar$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.okinc.im.message.provider.direction.BaseTextSendMessageViewProvider$updateSenderAvatar$1 for r10v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r10.label
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r10.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            o.C56391yDq.AEQbTJ(r11)     // Catch: java.lang.Throwable -> L13
            goto L3b
        L13:
            r11 = move-exception
            goto L46
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            o.C56391yDq.AEQbTJ(r11)
            java.lang.Object r11 = r10.L$0
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            o.oAT<C> r1 = r10.this$0
            o.nrp r3 = r10.$item
            kotlin.Result$Application r4 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L42
            com.okinc.okimcore.model.im.OKMessage r3 = r3.OLrzqt()     // Catch: java.lang.Throwable -> L42
            r10.L$0 = r11     // Catch: java.lang.Throwable -> L42
            r10.label = r2     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.AEQbTJ(r3, r10)     // Catch: java.lang.Throwable -> L42
            if (r1 != r0) goto L39
            return r0
        L39:
            r0 = r11
            r11 = r1
        L3b:
            com.okinc.im.bean.IMUserInfo r11 = (com.okinc.im.bean.IMUserInfo) r11     // Catch: java.lang.Throwable -> L13
            java.lang.Object r11 = kotlin.Result.m7377constructorimpl(r11)     // Catch: java.lang.Throwable -> L13
            goto L50
        L42:
            r0 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
        L46:
            kotlin.Result$Application r1 = kotlin.Result.Companion
            java.lang.Object r11 = o.C56391yDq.EZpvd(r11)
            java.lang.Object r11 = kotlin.Result.m7377constructorimpl(r11)
        L50:
            r3 = r0
            boolean r0 = kotlin.Result.m7383isFailureimpl(r11)
            r1 = 0
            if (r0 == 0) goto L59
            r11 = r1
        L59:
            com.okinc.im.bean.IMUserInfo r11 = (com.okinc.im.bean.IMUserInfo) r11
            if (r11 == 0) goto L66
            o.oAT<C> r0 = r10.this$0
            boolean r0 = r0.getNewProxyInstance()
            if (r0 == 0) goto L66
            goto L67
        L66:
            r11 = r1
        L67:
            o.oAT<C> r0 = r10.this$0
            kotlin.jvm.functions.Function0 r0 = o.oAT.KWHzl(r0)
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r0.invoke()
            com.okinc.okimcore.model.im.OKConversation r0 = (com.okinc.okimcore.model.im.OKConversation) r0
            if (r0 == 0) goto L7c
            com.okinc.okimcore.model.room.inhouseim.GroupTagType r0 = r0.getGroupType()
            goto L7d
        L7c:
            r0 = r1
        L7d:
            com.okinc.okimcore.model.room.inhouseim.GroupTagType r4 = com.okinc.okimcore.model.room.inhouseim.GroupTagType.RM_VIP_GROUP
            if (r0 != r4) goto L82
            goto L83
        L82:
            r2 = 0
        L83:
            o.sDN r0 = o.sDN.copydefault
            kotlinx.coroutines.MainCoroutineDispatcher r4 = r0.AEQbTJ()
            r5 = 0
            com.okinc.im.message.provider.direction.BaseTextSendMessageViewProvider$updateSenderAvatar$1$1 r6 = new com.okinc.im.message.provider.direction.BaseTextSendMessageViewProvider$updateSenderAvatar$1$1
            o.oHp r0 = r10.$imageView
            r6.<init>(r2, r11, r0, r1)
            r7 = 2
            r8 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r3, r4, r5, r6, r7, r8)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.im.message.provider.direction.BaseTextSendMessageViewProvider$updateSenderAvatar$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.okinc.im.message.provider.direction.BaseTextSendMessageViewProvider$updateSenderAvatar$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ IMUserInfo $actualImUserInfo;
        final /* synthetic */ C35893oHp $imageView;
        final /* synthetic */ boolean $isVipGroup;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, IMUserInfo iMUserInfo, C35893oHp c35893oHp, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$isVipGroup = z;
            this.$actualImUserInfo = iMUserInfo;
            this.$imageView = c35893oHp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isVipGroup, this.$actualImUserInfo, this.$imageView, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Unit unit;
            OfficialTagInfo officialTagInfo;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                boolean z = this.$isVipGroup;
                IMUserInfo iMUserInfo = this.$actualImUserInfo;
                C35893oHp c35893oHp = this.$imageView;
                try {
                    Result.Application application = Result.Companion;
                    if (z && iMUserInfo != null && (officialTagInfo = iMUserInfo.getOfficialTagInfo()) != null && C44170sFx.valueOf(officialTagInfo)) {
                        InterfaceC35179nqT interfaceC35179nqT = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class);
                        if (interfaceC35179nqT != null) {
                            interfaceC35179nqT.AEQbTJ(c35893oHp, iMUserInfo);
                            unit = Unit.INSTANCE;
                        }
                        Result.m7377constructorimpl(unit);
                    } else {
                        InterfaceC35179nqT interfaceC35179nqT2 = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class);
                        if (interfaceC35179nqT2 != null) {
                            interfaceC35179nqT2.KWHzl(c35893oHp, iMUserInfo);
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                        Result.m7377constructorimpl(unit);
                    }
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
