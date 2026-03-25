package com.reown.foundation.network.data.adapter;

import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.reactive.ChannelKt;
import o.C56391yDq;
import o.C56442yFn;
import o.C58137yvc;
import o.InterfaceC58090yui;
import o.InterfaceC58091yuj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowStreamAdapter<T> implements InterfaceC58091yuj<T, Flow<? extends T>> {

    /* JADX INFO: renamed from: com.reown.foundation.network.data.adapter.FlowStreamAdapter$adapt$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC58090yui<T> $stream;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC58090yui<T> interfaceC58090yui, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$stream = interfaceC58090yui;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$stream, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:7:0x001b, B:16:0x004a, B:19:0x0059, B:21:0x0061, B:24:0x0074, B:12:0x0033, B:15:0x0046), top: B:32:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:7:0x001b, B:16:0x004a, B:19:0x0059, B:21:0x0061, B:24:0x0074, B:12:0x0033, B:15:0x0046), top: B:32:0x0009 }] */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v12 */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Type inference failed for: r6v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0071 -> B:16:0x004a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ReceiveChannel receiveChannelOpenSubscription$default;
            ChannelIterator it;
            ?? r6;
            ?? r62;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    receiveChannelOpenSubscription$default = ChannelKt.openSubscription$default(this.$stream, 0, 1, null);
                    it = receiveChannelOpenSubscription$default.iterator();
                    r62 = flowCollector;
                } else if (i == 1) {
                    it = (ChannelIterator) this.L$2;
                    receiveChannelOpenSubscription$default = (ReceiveChannel) this.L$1;
                    FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    r6 = flowCollector2;
                    if (!((Boolean) obj).booleanValue()) {
                        Object next = it.next();
                        this.L$0 = r6;
                        this.L$1 = receiveChannelOpenSubscription$default;
                        this.L$2 = it;
                        this.label = 2;
                        Object objEmit = r6.emit(next, this);
                        r62 = r6;
                        if (objEmit == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        Unit unit = Unit.INSTANCE;
                        ChannelsKt.cancelConsumed(receiveChannelOpenSubscription$default, null);
                        return unit;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (ChannelIterator) this.L$2;
                    receiveChannelOpenSubscription$default = (ReceiveChannel) this.L$1;
                    FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    r62 = flowCollector3;
                }
                this.L$0 = r62;
                this.L$1 = receiveChannelOpenSubscription$default;
                this.L$2 = it;
                this.label = 1;
                obj = it.hasNext(this);
                r6 = r62;
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                if (!((Boolean) obj).booleanValue()) {
                }
            } finally {
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: adapt(Lo/yui;)Ljava/lang/Object; */
    @Override // o.InterfaceC58091yuj
    public Flow<T> adapt(@NotNull InterfaceC58090yui<T> interfaceC58090yui) {
        Intrinsics.checkNotNullParameter(interfaceC58090yui, "");
        return FlowKt.flow(new AnonymousClass1(interfaceC58090yui, null));
    }

    public static final class Factory implements InterfaceC58091yuj.TaskDescription {
        @Override // o.InterfaceC58091yuj.TaskDescription
        public InterfaceC58091yuj<Object, Object> create(@NotNull Type type) {
            Intrinsics.checkNotNullParameter(type, "");
            if (Intrinsics.EZpvd(C58137yvc.copydefault(type), Flow.class)) {
                return new FlowStreamAdapter();
            }
            throw new IllegalArgumentException();
        }
    }
}
