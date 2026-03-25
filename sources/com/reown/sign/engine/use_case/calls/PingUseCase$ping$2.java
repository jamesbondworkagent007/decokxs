package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.utils.Time;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class PingUseCase$ping$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Function1<Throwable, Unit> $onFailure;
    public final /* synthetic */ Function1<String, Unit> $onSuccess;
    public final /* synthetic */ long $timeout;
    public final /* synthetic */ String $topic;
    public int label;
    public final /* synthetic */ PingUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PingUseCase$ping$2(PingUseCase pingUseCase, String str, Function1<? super Throwable, Unit> function1, long j, Function1<? super String, Unit> function12, Continuation<? super PingUseCase$ping$2> continuation) {
        super(2, continuation);
        this.this$0 = pingUseCase;
        this.$topic = str;
        this.$onFailure = function1;
        this.$timeout = j;
        this.$onSuccess = function12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new PingUseCase$ping$2(this.this$0, this.$topic, this.$onFailure, this.$timeout, this.$onSuccess, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PingUseCase$ping$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.sessionStorageRepository.isSessionValid(new Topic(this.$topic))) {
                final SignRpc.SessionPing sessionPing = new SignRpc.SessionPing(0L, null, null, new SignParams.PingParams(), 7, null);
                IrnParams irnParams = new IrnParams(Tags.SESSION_PING, new Ttl(Time.getThirtySeconds()), false, 4, null);
                this.this$0.logger.log("Sending ping... topic: " + this.$topic);
                RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = this.this$0.jsonRpcInteractor;
                Topic topic = new Topic(this.$topic);
                final PingUseCase pingUseCase = this.this$0;
                final String str = this.$topic;
                final long j = this.$timeout;
                final Function1<String, Unit> function1 = this.$onSuccess;
                final Function1<Throwable, Unit> function12 = this.$onFailure;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: com.reown.sign.engine.use_case.calls.PingUseCase$ping$2.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
                    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        pingUseCase.logger.log("Ping sent successfully, topic: " + str);
                        pingUseCase.m7347onPingSuccessgRj5Bb8(j, sessionPing, function1, str, function12);
                    }
                };
                final PingUseCase pingUseCase2 = this.this$0;
                final String str2 = this.$topic;
                final Function1<Throwable, Unit> function13 = this.$onFailure;
                RelayJsonRpcInteractorInterface.DefaultImpls.publishJsonRpcRequest$default(relayJsonRpcInteractorInterface, topic, irnParams, sessionPing, null, null, function0, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.PingUseCase$ping$2.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Throwable th) {
                        Intrinsics.checkNotNullParameter(th, "");
                        pingUseCase2.logger.error("Ping sent error: " + th + ", topic: " + str2);
                        function13.invoke(th);
                    }
                }, 24, null);
            } else {
                this.$onFailure.invoke(new Throwable("Session topic is not valid"));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
