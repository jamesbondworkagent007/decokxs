package com.okinc.im.message.provider.direction;

import com.okinc.im.bean.IMUserInfo;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35254nrp;
import o.C35893oHp;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35179nqT;
import o.oAA;

/* JADX INFO: loaded from: classes18.dex */
public final class BaseSendMessageViewProvider$updateSenderAvatar$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C35893oHp $imageView;
    final /* synthetic */ C35254nrp $item;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ oAA<C, CVB> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSendMessageViewProvider$updateSenderAvatar$1(oAA<C, CVB> oaa, C35254nrp c35254nrp, C35893oHp c35893oHp, Continuation<? super BaseSendMessageViewProvider$updateSenderAvatar$1> continuation) {
        super(2, continuation);
        this.this$0 = oaa;
        this.$item = c35254nrp;
        this.$imageView = c35893oHp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseSendMessageViewProvider$updateSenderAvatar$1 baseSendMessageViewProvider$updateSenderAvatar$1 = new BaseSendMessageViewProvider$updateSenderAvatar$1(this.this$0, this.$item, this.$imageView, continuation);
        baseSendMessageViewProvider$updateSenderAvatar$1.L$0 = obj;
        return baseSendMessageViewProvider$updateSenderAvatar$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseSendMessageViewProvider$updateSenderAvatar$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.okinc.im.message.provider.direction.BaseSendMessageViewProvider$updateSenderAvatar$1 for r8v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r8.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            o.C56391yDq.AEQbTJ(r9)     // Catch: java.lang.Throwable -> L13
            goto L3b
        L13:
            r9 = move-exception
            goto L46
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            o.C56391yDq.AEQbTJ(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            o.oAA<C, CVB> r1 = r8.this$0
            o.nrp r3 = r8.$item
            kotlin.Result$Application r4 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L42
            com.okinc.okimcore.model.im.OKMessage r3 = r3.OLrzqt()     // Catch: java.lang.Throwable -> L42
            r8.L$0 = r9     // Catch: java.lang.Throwable -> L42
            r8.label = r2     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.AEQbTJ(r3, r8)     // Catch: java.lang.Throwable -> L42
            if (r1 != r0) goto L39
            return r0
        L39:
            r0 = r9
            r9 = r1
        L3b:
            com.okinc.im.bean.IMUserInfo r9 = (com.okinc.im.bean.IMUserInfo) r9     // Catch: java.lang.Throwable -> L13
            java.lang.Object r9 = kotlin.Result.m7377constructorimpl(r9)     // Catch: java.lang.Throwable -> L13
            goto L50
        L42:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L46:
            kotlin.Result$Application r1 = kotlin.Result.Companion
            java.lang.Object r9 = o.C56391yDq.EZpvd(r9)
            java.lang.Object r9 = kotlin.Result.m7377constructorimpl(r9)
        L50:
            boolean r1 = kotlin.Result.m7383isFailureimpl(r9)
            r2 = 0
            if (r1 == 0) goto L58
            r9 = r2
        L58:
            com.okinc.im.bean.IMUserInfo r9 = (com.okinc.im.bean.IMUserInfo) r9
            if (r9 == 0) goto L65
            o.oAA<C, CVB> r1 = r8.this$0
            boolean r1 = r1.getNewProxyInstance()
            if (r1 == 0) goto L65
            goto L66
        L65:
            r9 = r2
        L66:
            o.sDN r1 = o.sDN.copydefault
            kotlinx.coroutines.MainCoroutineDispatcher r1 = r1.AEQbTJ()
            r3 = 0
            com.okinc.im.message.provider.direction.BaseSendMessageViewProvider$updateSenderAvatar$1$1 r4 = new com.okinc.im.message.provider.direction.BaseSendMessageViewProvider$updateSenderAvatar$1$1
            o.oAA<C, CVB> r5 = r8.this$0
            o.oHp r6 = r8.$imageView
            r4.<init>(r5, r6, r9, r2)
            r9 = 2
            r5 = 0
            r2 = r3
            r3 = r4
            r4 = r9
            kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.im.message.provider.direction.BaseSendMessageViewProvider$updateSenderAvatar$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.okinc.im.message.provider.direction.BaseSendMessageViewProvider$updateSenderAvatar$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ IMUserInfo $actualImUserInfo;
        final /* synthetic */ C35893oHp $imageView;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ oAA<C, CVB> this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(oAA<C, CVB> oaa, C35893oHp c35893oHp, IMUserInfo iMUserInfo, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = oaa;
            this.$imageView = c35893oHp;
            this.$actualImUserInfo = iMUserInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$imageView, this.$actualImUserInfo, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            OKConversation oKConversation;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                oAA<C, CVB> oaa = this.this$0;
                C35893oHp c35893oHp = this.$imageView;
                IMUserInfo iMUserInfo = this.$actualImUserInfo;
                try {
                    Result.Application application = Result.Companion;
                    Function0 function0FetchVPNInfo = oaa.fetchVPNInfo();
                    Unit unit = null;
                    if (((function0FetchVPNInfo == null || (oKConversation = (OKConversation) function0FetchVPNInfo.invoke()) == null) ? null : oKConversation.getGroupType()) == GroupTagType.RM_VIP_GROUP) {
                        InterfaceC35179nqT interfaceC35179nqT = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class);
                        if (interfaceC35179nqT != null) {
                            interfaceC35179nqT.AEQbTJ(c35893oHp, iMUserInfo);
                            unit = Unit.INSTANCE;
                        }
                    } else {
                        InterfaceC35179nqT interfaceC35179nqT2 = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class);
                        if (interfaceC35179nqT2 != null) {
                            interfaceC35179nqT2.KWHzl(c35893oHp, iMUserInfo);
                            unit = Unit.INSTANCE;
                        }
                    }
                    Result.m7377constructorimpl(unit);
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
