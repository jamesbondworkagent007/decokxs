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
import o.C56391yDq;
import o.C56442yFn;
import o.oAO;
import o.oGY;

/* JADX INFO: loaded from: classes18.dex */
public final class BaseTextReceiveMessageViewProvider$onBindViewHolder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ oGY<AbstractC44111sDt> $holder;
    final /* synthetic */ C35254nrp $item;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ oAO<C> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTextReceiveMessageViewProvider$onBindViewHolder$1(oAO<C> oao, C35254nrp c35254nrp, oGY<AbstractC44111sDt> ogy, Continuation<? super BaseTextReceiveMessageViewProvider$onBindViewHolder$1> continuation) {
        super(2, continuation);
        this.this$0 = oao;
        this.$item = c35254nrp;
        this.$holder = ogy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseTextReceiveMessageViewProvider$onBindViewHolder$1 baseTextReceiveMessageViewProvider$onBindViewHolder$1 = new BaseTextReceiveMessageViewProvider$onBindViewHolder$1(this.this$0, this.$item, this.$holder, continuation);
        baseTextReceiveMessageViewProvider$onBindViewHolder$1.L$0 = obj;
        return baseTextReceiveMessageViewProvider$onBindViewHolder$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseTextReceiveMessageViewProvider$onBindViewHolder$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.okinc.im.message.provider.direction.BaseTextReceiveMessageViewProvider$onBindViewHolder$1 for r9v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            o.C56391yDq.AEQbTJ(r10)
            goto L70
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            o.C56391yDq.AEQbTJ(r10)     // Catch: java.lang.Throwable -> L3f
            goto L38
        L1e:
            o.C56391yDq.AEQbTJ(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            o.oAO<C> r10 = r9.this$0
            o.nrp r1 = r9.$item
            kotlin.Result$Application r4 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L3f
            com.okinc.okimcore.model.im.OKMessage r1 = r1.OLrzqt()     // Catch: java.lang.Throwable -> L3f
            r9.label = r3     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r10 = r10.AEQbTJ(r1, r9)     // Catch: java.lang.Throwable -> L3f
            if (r10 != r0) goto L38
            return r0
        L38:
            com.okinc.im.bean.IMUserInfo r10 = (com.okinc.im.bean.IMUserInfo) r10     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r10 = kotlin.Result.m7377constructorimpl(r10)     // Catch: java.lang.Throwable -> L3f
            goto L4a
        L3f:
            r10 = move-exception
            kotlin.Result$Application r1 = kotlin.Result.Companion
            java.lang.Object r10 = o.C56391yDq.EZpvd(r10)
            java.lang.Object r10 = kotlin.Result.m7377constructorimpl(r10)
        L4a:
            boolean r1 = kotlin.Result.m7383isFailureimpl(r10)
            if (r1 == 0) goto L51
            r10 = 0
        L51:
            r7 = r10
            com.okinc.im.bean.IMUserInfo r7 = (com.okinc.im.bean.IMUserInfo) r7
            o.sDN r10 = o.sDN.copydefault
            kotlinx.coroutines.MainCoroutineDispatcher r10 = r10.AEQbTJ()
            com.okinc.im.message.provider.direction.BaseTextReceiveMessageViewProvider$onBindViewHolder$1$1 r1 = new com.okinc.im.message.provider.direction.BaseTextReceiveMessageViewProvider$onBindViewHolder$1$1
            o.oAO<C> r4 = r9.this$0
            o.oGY<o.sDt> r5 = r9.$holder
            o.nrp r6 = r9.$item
            r8 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r9.label = r2
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r10, r1, r9)
            if (r10 != r0) goto L70
            return r0
        L70:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.im.message.provider.direction.BaseTextReceiveMessageViewProvider$onBindViewHolder$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.okinc.im.message.provider.direction.BaseTextReceiveMessageViewProvider$onBindViewHolder$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ oGY<AbstractC44111sDt> $holder;
        final /* synthetic */ IMUserInfo $imUserInfo;
        final /* synthetic */ C35254nrp $item;
        int label;
        final /* synthetic */ oAO<C> this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(oAO<C> oao, oGY<AbstractC44111sDt> ogy, C35254nrp c35254nrp, IMUserInfo iMUserInfo, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = oao;
            this.$holder = ogy;
            this.$item = c35254nrp;
            this.$imUserInfo = iMUserInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$holder, this.$item, this.$imUserInfo, continuation);
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
                oAO<C> oao = this.this$0;
                oGY<AbstractC44111sDt> ogy = this.$holder;
                C35254nrp c35254nrp = this.$item;
                IMUserInfo iMUserInfo = this.$imUserInfo;
                TextView textView = ((AbstractC44111sDt) ogy.copydefault()).ejfBZ;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                TextView textView2 = ((AbstractC44111sDt) this.$holder.copydefault()).uzCIH;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                oao.KWHzl((oGY<AbstractC44111sDt>) ogy, c35254nrp, iMUserInfo, textView, textView2);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
