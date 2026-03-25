package com.okinc.im.imui.inputpanel.plugin;

import android.content.Context;
import android.content.res.Resources;
import com.okinc.im.imui.inputpanel.plugin.AudioCallPluginHelper$jumpToAudioCall$6;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonArrayBuilder;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.AbstractC37162ood;
import o.C35399nuc;
import o.C36442oaz;
import o.C37127onv;
import o.C56391yDq;
import o.C56442yFn;
import o.ServiceC37177oos;
import o.sDN;

/* JADX INFO: loaded from: classes23.dex */
public final class AudioCallPluginHelper$jumpToAudioCall$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $currentCallConversationId;
    final /* synthetic */ boolean $isNetworkConnected;
    final /* synthetic */ boolean $isOnCall;
    final /* synthetic */ String $targetId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioCallPluginHelper$jumpToAudioCall$6(Context context, String str, boolean z, boolean z2, String str2, Continuation<? super AudioCallPluginHelper$jumpToAudioCall$6> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$targetId = str;
        this.$isNetworkConnected = z;
        this.$isOnCall = z2;
        this.$currentCallConversationId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioCallPluginHelper$jumpToAudioCall$6(this.$context, this.$targetId, this.$isNetworkConnected, this.$isOnCall, this.$currentCallConversationId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioCallPluginHelper$jumpToAudioCall$6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Resources resources;
        String string;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
            AudioCallPluginHelper$jumpToAudioCall$6$conversation$1 audioCallPluginHelper$jumpToAudioCall$6$conversation$1 = new AudioCallPluginHelper$jumpToAudioCall$6$conversation$1(this.$targetId, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcherCopydefault, audioCallPluginHelper$jumpToAudioCall$6$conversation$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        final OKConversation oKConversation = (OKConversation) obj;
        C36442oaz c36442oaz = C36442oaz.EZpvd;
        Function1 function1 = new Function1() { // from class: o.oaL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return AudioCallPluginHelper$jumpToAudioCall$6.invokeSuspend$lambda$0((JsonArrayBuilder) obj2);
            }
        };
        final String str = this.$targetId;
        final boolean z = this.$isNetworkConnected;
        final boolean z2 = this.$isOnCall;
        final String str2 = this.$currentCallConversationId;
        c36442oaz.KWHzl("jumpToAudioCall", (Function1<? super JsonArrayBuilder, Unit>) function1, (Function1<? super JsonObjectBuilder, Unit>) new Function1() { // from class: o.oaJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return AudioCallPluginHelper$jumpToAudioCall$6.invokeSuspend$lambda$1(str, z, z2, str2, oKConversation, (JsonObjectBuilder) obj2);
            }
        });
        if (oKConversation == null) {
            Context context = this.$context;
            if (context != null && (resources = context.getResources()) != null && (string = resources.getString(C35399nuc.LoaderManager.vLaW)) != null) {
                C37127onv.AEQbTJ.copydefault(string);
            }
            return Unit.INSTANCE;
        }
        C37127onv.AEQbTJ.AhwBna().copydefault(true);
        Context context2 = this.$context;
        if (context2 != null) {
            context2.startService(ServiceC37177oos.Companion.copydefault(context2, new AbstractC37162ood.Activity("action_audio_call_start_call", oKConversation.getTargetId(), this.$targetId, null, null, null, null, 120, null)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(JsonArrayBuilder jsonArrayBuilder) {
        JsonElementBuildersKt.add(jsonArrayBuilder, "OKIMServiceImpl");
        JsonElementBuildersKt.add(jsonArrayBuilder, "AudioCallPluginHelper");
        JsonElementBuildersKt.add(jsonArrayBuilder, "startAudioCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "ableToMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "judgePermissionAndMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "jumpToAudioCall:launch");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(String str, boolean z, boolean z2, String str2, OKConversation oKConversation, JsonObjectBuilder jsonObjectBuilder) {
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, "isNetworkConnected", Boolean.valueOf(z));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isOnCall", Boolean.valueOf(z2));
        JsonElementBuildersKt.put(jsonObjectBuilder, "currentCallConversationId", str2);
        JsonElementBuildersKt.put(jsonObjectBuilder, "conversation", String.valueOf(oKConversation));
        return Unit.INSTANCE;
    }
}
