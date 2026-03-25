package com.okinc.im.message.provider.direction;

import android.widget.TextView;
import com.okinc.im.bean.IMUserInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC44111sDt;
import o.C35254nrp;
import o.C35893oHp;
import o.C56391yDq;
import o.C56442yFn;
import o.oAE;
import o.oGY;

/* JADX INFO: loaded from: classes18.dex */
public final class BaseReceiveMessageViewProvider$onFullBind$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ oGY<AbstractC44111sDt> $holder;
    final /* synthetic */ C35254nrp $item;
    final /* synthetic */ AbstractC44111sDt $this_run;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ oAE<C, CVB> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseReceiveMessageViewProvider$onFullBind$1$1(oAE<C, CVB> oae, C35254nrp c35254nrp, oGY<AbstractC44111sDt> ogy, AbstractC44111sDt abstractC44111sDt, Continuation<? super BaseReceiveMessageViewProvider$onFullBind$1$1> continuation) {
        super(2, continuation);
        this.this$0 = oae;
        this.$item = c35254nrp;
        this.$holder = ogy;
        this.$this_run = abstractC44111sDt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseReceiveMessageViewProvider$onFullBind$1$1 baseReceiveMessageViewProvider$onFullBind$1$1 = new BaseReceiveMessageViewProvider$onFullBind$1$1(this.this$0, this.$item, this.$holder, this.$this_run, continuation);
        baseReceiveMessageViewProvider$onFullBind$1$1.L$0 = obj;
        return baseReceiveMessageViewProvider$onFullBind$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseReceiveMessageViewProvider$onFullBind$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.okinc.im.message.provider.direction.BaseReceiveMessageViewProvider$onFullBind$1$1 for r10v1 'this'  kotlin.coroutines.Continuation
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            o.C56391yDq.AEQbTJ(r11)
            goto L72
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            o.C56391yDq.AEQbTJ(r11)     // Catch: java.lang.Throwable -> L3f
            goto L38
        L1e:
            o.C56391yDq.AEQbTJ(r11)
            java.lang.Object r11 = r10.L$0
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            o.oAE<C, CVB> r11 = r10.this$0
            o.nrp r1 = r10.$item
            kotlin.Result$Application r4 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L3f
            com.okinc.okimcore.model.im.OKMessage r1 = r1.OLrzqt()     // Catch: java.lang.Throwable -> L3f
            r10.label = r3     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r11 = r11.AEQbTJ(r1, r10)     // Catch: java.lang.Throwable -> L3f
            if (r11 != r0) goto L38
            return r0
        L38:
            com.okinc.im.bean.IMUserInfo r11 = (com.okinc.im.bean.IMUserInfo) r11     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r11 = kotlin.Result.m7377constructorimpl(r11)     // Catch: java.lang.Throwable -> L3f
            goto L4a
        L3f:
            r11 = move-exception
            kotlin.Result$Application r1 = kotlin.Result.Companion
            java.lang.Object r11 = o.C56391yDq.EZpvd(r11)
            java.lang.Object r11 = kotlin.Result.m7377constructorimpl(r11)
        L4a:
            boolean r1 = kotlin.Result.m7383isFailureimpl(r11)
            if (r1 == 0) goto L51
            r11 = 0
        L51:
            r6 = r11
            com.okinc.im.bean.IMUserInfo r6 = (com.okinc.im.bean.IMUserInfo) r6
            o.sDN r11 = o.sDN.copydefault
            kotlinx.coroutines.MainCoroutineDispatcher r11 = r11.AEQbTJ()
            com.okinc.im.message.provider.direction.BaseReceiveMessageViewProvider$onFullBind$1$1$1 r1 = new com.okinc.im.message.provider.direction.BaseReceiveMessageViewProvider$onFullBind$1$1$1
            o.oAE<C, CVB> r4 = r10.this$0
            o.oGY<o.sDt> r5 = r10.$holder
            o.nrp r7 = r10.$item
            o.sDt r8 = r10.$this_run
            r9 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.label = r2
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r11, r1, r10)
            if (r11 != r0) goto L72
            return r0
        L72:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.im.message.provider.direction.BaseReceiveMessageViewProvider$onFullBind$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.okinc.im.message.provider.direction.BaseReceiveMessageViewProvider$onFullBind$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ oGY<AbstractC44111sDt> $holder;
        final /* synthetic */ IMUserInfo $imUserInfo;
        final /* synthetic */ C35254nrp $item;
        final /* synthetic */ AbstractC44111sDt $this_run;
        int label;
        final /* synthetic */ oAE<C, CVB> this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(oAE<C, CVB> oae, oGY<AbstractC44111sDt> ogy, IMUserInfo iMUserInfo, C35254nrp c35254nrp, AbstractC44111sDt abstractC44111sDt, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = oae;
            this.$holder = ogy;
            this.$imUserInfo = iMUserInfo;
            this.$item = c35254nrp;
            this.$this_run = abstractC44111sDt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$holder, this.$imUserInfo, this.$item, this.$this_run, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                oAE<C, CVB> oae = this.this$0;
                oGY<AbstractC44111sDt> ogy = this.$holder;
                IMUserInfo iMUserInfo = this.$imUserInfo;
                C35254nrp c35254nrp = this.$item;
                TextView textView = this.$this_run.ejfBZ;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                TextView textView2 = this.$this_run.uzCIH;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                oae.KWHzl((oGY<AbstractC44111sDt>) ogy, iMUserInfo, c35254nrp, textView, textView2);
                oAE<C, CVB> oae2 = this.this$0;
                C35893oHp c35893oHp = this.$this_run.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
                oae2.KWHzl(c35893oHp, this.$imUserInfo);
                oAE<C, CVB> oae3 = this.this$0;
                C35893oHp c35893oHp2 = this.$this_run.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
                oae3.AEQbTJ(c35893oHp2, this.$item, this.$imUserInfo);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
