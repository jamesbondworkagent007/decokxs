package com.okinc.im.imui.inputpanelV2.pluginV2;

import androidx.fragment.app.Fragment;
import com.okinc.im.imui.inputpanelV2.pluginV2.VoiceCallPlugin$launchAudioCallCheck$1;
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
import o.C36492obw;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class VoiceCallPlugin$launchAudioCallCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $currentTimeMs;
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ long $previousTimeMs;
    final /* synthetic */ String $targetId;
    int label;
    final /* synthetic */ C36492obw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallPlugin$launchAudioCallCheck$1(C36492obw c36492obw, String str, Fragment fragment, long j, long j2, Continuation<? super VoiceCallPlugin$launchAudioCallCheck$1> continuation) {
        super(2, continuation);
        this.this$0 = c36492obw;
        this.$targetId = str;
        this.$fragment = fragment;
        this.$previousTimeMs = j;
        this.$currentTimeMs = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VoiceCallPlugin$launchAudioCallCheck$1(this.this$0, this.$targetId, this.$fragment, this.$previousTimeMs, this.$currentTimeMs, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VoiceCallPlugin$launchAudioCallCheck$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final C36492obw c36492obw = this.this$0;
            final String str = this.$targetId;
            final Fragment fragment = this.$fragment;
            final long j = this.$previousTimeMs;
            final long j2 = this.$currentTimeMs;
            Function0 function0 = new Function0() { // from class: o.oca
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return VoiceCallPlugin$launchAudioCallCheck$1.invokeSuspend$lambda$2(c36492obw, str, fragment, j, j2);
                }
            };
            final C36492obw c36492obw2 = this.this$0;
            final long j3 = this.$previousTimeMs;
            final long j4 = this.$currentTimeMs;
            final String str2 = this.$targetId;
            Function0 function02 = new Function0() { // from class: o.ocg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return VoiceCallPlugin$launchAudioCallCheck$1.invokeSuspend$lambda$5(c36492obw2, j3, j4, str2);
                }
            };
            this.label = 1;
            if (c36492obw.KWHzl(str, (Function0<Unit>) function0, (Function0<Unit>) function02, (Continuation<? super Unit>) this) == objCopydefault) {
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
    public static final Unit invokeSuspend$lambda$2(C36492obw c36492obw, final String str, Fragment fragment, final long j, final long j2) {
        c36492obw.KWHzl("onClick", (Function1<? super JsonArrayBuilder, Unit>) new Function1() { // from class: o.occ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return VoiceCallPlugin$launchAudioCallCheck$1.invokeSuspend$lambda$2$lambda$0((JsonArrayBuilder) obj);
            }
        }, (Function1<? super JsonObjectBuilder, Unit>) new Function1() { // from class: o.obZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return VoiceCallPlugin$launchAudioCallCheck$1.invokeSuspend$lambda$2$lambda$1(j, j2, str, (JsonObjectBuilder) obj);
            }
        });
        c36492obw.copydefault(str, fragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$0(JsonArrayBuilder jsonArrayBuilder) {
        JsonElementBuildersKt.add(jsonArrayBuilder, "VoiceCallPlugin");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onClick");
        JsonElementBuildersKt.add(jsonArrayBuilder, "ableToMakeCall");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1(long j, long j2, String str, JsonObjectBuilder jsonObjectBuilder) {
        JsonElementBuildersKt.put(jsonObjectBuilder, "previousTimeMs", Long.valueOf(j));
        JsonElementBuildersKt.put(jsonObjectBuilder, "currentTimeMs", Long.valueOf(j2));
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
        Boolean bool = Boolean.TRUE;
        JsonElementBuildersKt.put(jsonObjectBuilder, "hasActivity", bool);
        JsonElementBuildersKt.put(jsonObjectBuilder, "ableToMakeCall", bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5(C36492obw c36492obw, final long j, final long j2, final String str) {
        c36492obw.KWHzl("onClick", (Function1<? super JsonArrayBuilder, Unit>) new Function1() { // from class: o.ocd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return VoiceCallPlugin$launchAudioCallCheck$1.invokeSuspend$lambda$5$lambda$3((JsonArrayBuilder) obj);
            }
        }, (Function1<? super JsonObjectBuilder, Unit>) new Function1() { // from class: o.ocb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return VoiceCallPlugin$launchAudioCallCheck$1.invokeSuspend$lambda$5$lambda$4(j, j2, str, (JsonObjectBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5$lambda$3(JsonArrayBuilder jsonArrayBuilder) {
        JsonElementBuildersKt.add(jsonArrayBuilder, "VoiceCallPlugin");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onClick");
        JsonElementBuildersKt.add(jsonArrayBuilder, "ableToMakeCall");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5$lambda$4(long j, long j2, String str, JsonObjectBuilder jsonObjectBuilder) {
        JsonElementBuildersKt.put(jsonObjectBuilder, "previousTimeMs", Long.valueOf(j));
        JsonElementBuildersKt.put(jsonObjectBuilder, "currentTimeMs", Long.valueOf(j2));
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, "hasActivity", Boolean.TRUE);
        JsonElementBuildersKt.put(jsonObjectBuilder, "ableToMakeCall", Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
