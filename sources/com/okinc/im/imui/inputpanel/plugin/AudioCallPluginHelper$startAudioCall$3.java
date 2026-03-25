package com.okinc.im.imui.inputpanel.plugin;

import android.content.Context;
import com.okinc.im.imui.inputpanel.plugin.AudioCallPluginHelper$startAudioCall$3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonArrayBuilder;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.C36442oaz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class AudioCallPluginHelper$startAudioCall$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $isP2P;
    final /* synthetic */ Function2<String[], Integer, Unit> $requestPermsCallback;
    final /* synthetic */ String $targetId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String[], ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AudioCallPluginHelper$startAudioCall$3(String str, Context context, Function2<? super String[], ? super Integer, Unit> function2, boolean z, Continuation<? super AudioCallPluginHelper$startAudioCall$3> continuation) {
        super(2, continuation);
        this.$targetId = str;
        this.$context = context;
        this.$requestPermsCallback = function2;
        this.$isP2P = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioCallPluginHelper$startAudioCall$3(this.$targetId, this.$context, this.$requestPermsCallback, this.$isP2P, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioCallPluginHelper$startAudioCall$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C36442oaz c36442oaz = C36442oaz.EZpvd;
            String str = this.$targetId;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, str, this.$requestPermsCallback, this.$isP2P, null);
            final String str2 = this.$targetId;
            final boolean z = this.$isP2P;
            Function0<Unit> function0 = new Function0() { // from class: o.oaH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AudioCallPluginHelper$startAudioCall$3.invokeSuspend$lambda$2(str2, z);
                }
            };
            this.label = 1;
            if (c36442oaz.AEQbTJ(str, anonymousClass1, function0, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.inputpanel.plugin.AudioCallPluginHelper$startAudioCall$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $isP2P;
        final /* synthetic */ Function2<String[], Integer, Unit> $requestPermsCallback;
        final /* synthetic */ String $targetId;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String[], ? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Context context, String str, Function2<? super String[], ? super Integer, Unit> function2, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$context = context;
            this.$targetId = str;
            this.$requestPermsCallback = function2;
            this.$isP2P = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$context, this.$targetId, this.$requestPermsCallback, this.$isP2P, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C36442oaz c36442oaz = C36442oaz.EZpvd;
                Function1 function1 = new Function1() { // from class: o.oaP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return AudioCallPluginHelper$startAudioCall$3.AnonymousClass1.invokeSuspend$lambda$0((JsonArrayBuilder) obj2);
                    }
                };
                final String str = this.$targetId;
                final boolean z = this.$isP2P;
                c36442oaz.KWHzl("startAudioCall", (Function1<? super JsonArrayBuilder, Unit>) function1, (Function1<? super JsonObjectBuilder, Unit>) new Function1() { // from class: o.oaO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return AudioCallPluginHelper$startAudioCall$3.AnonymousClass1.invokeSuspend$lambda$1(str, z, (JsonObjectBuilder) obj2);
                    }
                });
                Context context = this.$context;
                String str2 = this.$targetId;
                Function2<String[], Integer, Unit> function2 = this.$requestPermsCallback;
                this.label = 1;
                if (c36442oaz.EZpvd(context, str2, function2, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(JsonArrayBuilder jsonArrayBuilder) {
            JsonElementBuildersKt.add(jsonArrayBuilder, "AudioCallPluginHelper");
            JsonElementBuildersKt.add(jsonArrayBuilder, "startAudioCall");
            JsonElementBuildersKt.add(jsonArrayBuilder, "OKIMServiceImpl");
            JsonElementBuildersKt.add(jsonArrayBuilder, "ableToMakeCall");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(String str, boolean z, JsonObjectBuilder jsonObjectBuilder) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
            JsonElementBuildersKt.put(jsonObjectBuilder, "isP2P", Boolean.valueOf(z));
            JsonElementBuildersKt.put(jsonObjectBuilder, "ableToMakeCall", Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(final String str, final boolean z) {
        C36442oaz.EZpvd.KWHzl("startAudioCall", (Function1<? super JsonArrayBuilder, Unit>) new Function1() { // from class: o.oaK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AudioCallPluginHelper$startAudioCall$3.invokeSuspend$lambda$2$lambda$0((JsonArrayBuilder) obj);
            }
        }, (Function1<? super JsonObjectBuilder, Unit>) new Function1() { // from class: o.oaI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AudioCallPluginHelper$startAudioCall$3.invokeSuspend$lambda$2$lambda$1(str, z, (JsonObjectBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$0(JsonArrayBuilder jsonArrayBuilder) {
        JsonElementBuildersKt.add(jsonArrayBuilder, "AudioCallPluginHelper");
        JsonElementBuildersKt.add(jsonArrayBuilder, "startAudioCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "OKIMServiceImpl");
        JsonElementBuildersKt.add(jsonArrayBuilder, "ableToMakeCall");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1(String str, boolean z, JsonObjectBuilder jsonObjectBuilder) {
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, "isP2P", Boolean.valueOf(z));
        JsonElementBuildersKt.put(jsonObjectBuilder, "ableToMakeCall", Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
