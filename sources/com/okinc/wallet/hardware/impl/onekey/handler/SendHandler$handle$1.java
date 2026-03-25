package com.okinc.wallet.hardware.impl.onekey.handler;

import com.okinc.wallet.hardware.impl.onekey.data.Empty;
import com.okinc.wallet.hardware.impl.onekey.handler.SendHandler;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.DeserializationStrategy;
import o.C33489mxS;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C57149ycv;
import okio.ByteString;

/* JADX INFO: loaded from: classes24.dex */
public final class SendHandler$handle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $params;
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ SendHandler this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendHandler$handle$1(SendHandler sendHandler, String str, String str2, Continuation<? super SendHandler$handle$1> continuation) {
        super(2, continuation);
        this.this$0 = sendHandler;
        this.$requestId = str;
        this.$params = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SendHandler$handle$1(this.this$0, this.$requestId, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SendHandler$handle$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.wallet.hardware.impl.onekey.handler.SendHandler$handle$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends String, ? extends byte[]>>, Object> {
        final /* synthetic */ String $params;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$params = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$params, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends String, ? extends byte[]>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Pair<String, byte[]>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<String, byte[]>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                SendHandler.Send send = (SendHandler.Send) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) SendHandler.Send.Companion.serializer(), this.$params);
                return C56390yDp.OLrzqt(send.getUuid(), ByteString.Companion.decodeHex(send.getData()).toByteArray());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcherKWHzl = this.this$0.KWHzl();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$params, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcherKWHzl, anonymousClass1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Pair pair = (Pair) obj;
        this.this$0.EZpvd().OLrzqt((String) pair.component1(), (byte[]) pair.component2());
        C57149ycv c57149ycvDjBIcL = this.this$0.EZpvd().djBIcL();
        BuildersKt__Builders_commonKt.launch$default(c57149ycvDjBIcL.valueOf, null, null, new SendHandler$handle$1$invokeSuspend$$inlined$nativeResponse$1(c57149ycvDjBIcL, this.$requestId, Empty.INSTANCE, null), 3, null);
        return Unit.INSTANCE;
    }
}
