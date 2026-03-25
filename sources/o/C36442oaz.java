package o;

import com.google.firebase.messaging.Constants;
import com.okinc.im.imui.inputpanel.plugin.AudioCallPluginHelper$ableToMakeCall$1;
import com.okinc.im.imui.inputpanel.plugin.AudioCallPluginHelper$ableToMakeCall$2$1;
import com.okinc.im.imui.inputpanel.plugin.AudioCallPluginHelper$jumpToAudioCall$6;
import com.okinc.okimcore.model.im.OKCallSession;
import com.okinc.unify_trade.biz.BotWebHook;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.JsonArrayBuilder;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.C35399nuc;
import o.sNK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oaz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36442oaz {
    public static final C36442oaz EZpvd = new C36442oaz();

    private C36442oaz() {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AudioCallPluginHelper$ableToMakeCall$1 audioCallPluginHelper$ableToMakeCall$1;
        java.lang.Object objM7377constructorimpl;
        final java.lang.String str2;
        java.lang.Object obj;
        Function0<Unit> function02;
        java.lang.String str3;
        final java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof AudioCallPluginHelper$ableToMakeCall$1) {
            audioCallPluginHelper$ableToMakeCall$1 = (AudioCallPluginHelper$ableToMakeCall$1) continuation;
            int i = audioCallPluginHelper$ableToMakeCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                audioCallPluginHelper$ableToMakeCall$1.label = i - Integer.MIN_VALUE;
            } else {
                audioCallPluginHelper$ableToMakeCall$1 = new AudioCallPluginHelper$ableToMakeCall$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = audioCallPluginHelper$ableToMakeCall$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = audioCallPluginHelper$ableToMakeCall$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            Result.Application application2 = Result.Companion;
            CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
            AudioCallPluginHelper$ableToMakeCall$2$1 audioCallPluginHelper$ableToMakeCall$2$1 = new AudioCallPluginHelper$ableToMakeCall$2$1(str, null);
            audioCallPluginHelper$ableToMakeCall$1.L$0 = str;
            audioCallPluginHelper$ableToMakeCall$1.L$1 = function1;
            audioCallPluginHelper$ableToMakeCall$1.L$2 = function0;
            audioCallPluginHelper$ableToMakeCall$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherCopydefault, audioCallPluginHelper$ableToMakeCall$2$1, audioCallPluginHelper$ableToMakeCall$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = audioCallPluginHelper$ableToMakeCall$1.L$2;
                function02 = (Function0) audioCallPluginHelper$ableToMakeCall$1.L$1;
                str3 = (java.lang.String) audioCallPluginHelper$ableToMakeCall$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                str2 = str3;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                if (thM7380exceptionOrNullimpl != null) {
                    EZpvd.KWHzl("ableToMakeCall", new Function1() { // from class: o.oaG
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return C36442oaz.KWHzl((JsonArrayBuilder) obj2);
                        }
                    }, new Function1() { // from class: o.oaC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return C36442oaz.copydefault(str2, thM7380exceptionOrNullimpl, (JsonObjectBuilder) obj2);
                        }
                    });
                    function02.invoke();
                }
                return Unit.INSTANCE;
            }
            function0 = (Function0) audioCallPluginHelper$ableToMakeCall$1.L$2;
            function1 = (Function1) audioCallPluginHelper$ableToMakeCall$1.L$1;
            str = (java.lang.String) audioCallPluginHelper$ableToMakeCall$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        objM7377constructorimpl = Result.m7377constructorimpl((sNK) objWithContext);
        java.lang.Object obj2 = objM7377constructorimpl;
        str2 = str;
        obj = obj2;
        Function0<Unit> function03 = function0;
        Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function12 = function1;
        function02 = function03;
        if (Result.m7384isSuccessimpl(obj)) {
            sNK snk = (sNK) obj;
            if (snk instanceof sNK.Application) {
                audioCallPluginHelper$ableToMakeCall$1.L$0 = str2;
                audioCallPluginHelper$ableToMakeCall$1.L$1 = function02;
                audioCallPluginHelper$ableToMakeCall$1.L$2 = obj;
                audioCallPluginHelper$ableToMakeCall$1.label = 2;
                java.lang.Object objInvoke = function12.invoke(audioCallPluginHelper$ableToMakeCall$1);
                if (objInvoke == objCopydefault) {
                    return objCopydefault;
                }
                objWithContext = objInvoke;
                str3 = str2;
                str2 = str3;
            } else {
                C37127onv.AEQbTJ.copydefault(EZpvd.EZpvd(snk));
                function02.invoke();
            }
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(JsonArrayBuilder jsonArrayBuilder) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        JsonElementBuildersKt.add(jsonArrayBuilder, "AudioCallPlugin");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onClick");
        JsonElementBuildersKt.add(jsonArrayBuilder, "ableToMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "judgePermissionAndMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onRequestPermissionResult");
        JsonElementBuildersKt.add(jsonArrayBuilder, "jumpToAudioCall");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str, java.lang.Throwable th, JsonObjectBuilder jsonObjectBuilder) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, Constants.IPC_BUNDLE_KEY_SEND_ERROR, C56379yDe.AEQbTJ(th));
        return Unit.INSTANCE;
    }

    public final java.lang.String EZpvd(sNK snk) {
        if (snk instanceof sNK.Activity) {
            return C33069mpW.copydefault(C35399nuc.LoaderManager.zlvcHA, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", ((sNK.Activity) snk).OLrzqt())));
        }
        if (snk instanceof sNK.ActionBar) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.hlkKmr);
        }
        if (snk instanceof sNK.StateListAnimator) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.DcMfJKfNUfqk);
        }
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.dESsmu);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Object[], java.lang.String[]] */
    public final java.lang.Object EZpvd(android.content.Context context, final java.lang.String str, Function2<? super java.lang.String[], ? super java.lang.Integer, Unit> function2, Continuation<? super Unit> continuation) {
        ?? OLrzqt = C37724ozI.EZpvd.OLrzqt();
        final boolean zKWHzl = C60121zwJ.KWHzl(context, (java.lang.String[]) java.util.Arrays.copyOf((java.lang.Object[]) OLrzqt, OLrzqt.length));
        KWHzl("judgePermissionAndMakeCall", new Function1() { // from class: o.oaA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36442oaz.OLrzqt((JsonArrayBuilder) obj);
            }
        }, new Function1() { // from class: o.oaE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36442oaz.KWHzl(str, zKWHzl, (JsonObjectBuilder) obj);
            }
        });
        if (zKWHzl) {
            java.lang.Object objEZpvd = EZpvd(context, str, continuation);
            return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
        }
        function2.invoke(OLrzqt, C56443yFo.AEQbTJ(255));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(JsonArrayBuilder jsonArrayBuilder) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        JsonElementBuildersKt.add(jsonArrayBuilder, "AudioCallPluginHelper");
        JsonElementBuildersKt.add(jsonArrayBuilder, "startAudioCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "OKIMServiceImpl");
        JsonElementBuildersKt.add(jsonArrayBuilder, "ableToMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "judgePermissionAndMakeCall");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str, boolean z, JsonObjectBuilder jsonObjectBuilder) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, "hasPermissions", java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public final java.lang.Object EZpvd(android.content.Context context, final java.lang.String str, Continuation<? super Unit> continuation) {
        android.content.res.Resources resources;
        java.lang.String string;
        android.content.res.Resources resources2;
        java.lang.String string2;
        C37127onv c37127onv = C37127onv.AEQbTJ;
        InterfaceC35259nru interfaceC35259nruAhwBna = c37127onv.AhwBna();
        final boolean zKWHzl = C43453rpa.AEQbTJ.KWHzl(C32979mnm.EZpvd.OLrzqt());
        final boolean zKWHzl2 = interfaceC35259nruAhwBna.KWHzl();
        OKCallSession second = interfaceC35259nruAhwBna.OLrzqt().getSecond();
        final java.lang.String targetId = second != null ? second.getTargetId() : null;
        KWHzl("jumpToAudioCall", new Function1() { // from class: o.oaD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36442oaz.djBIcL((JsonArrayBuilder) obj);
            }
        }, new Function1() { // from class: o.oaF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36442oaz.OLrzqt(str, zKWHzl, zKWHzl2, targetId, (JsonObjectBuilder) obj);
            }
        });
        if (!zKWHzl) {
            if (context != null && (resources2 = context.getResources()) != null && (string2 = resources2.getString(C35399nuc.LoaderManager.vLaW)) != null) {
                c37127onv.copydefault(string2);
            }
            return Unit.INSTANCE;
        }
        if (zKWHzl2 && !C59449zhJ.equals$default(str, targetId, false, 2, null)) {
            if (context != null && (resources = context.getResources()) != null && (string = resources.getString(C35399nuc.LoaderManager.zKcAg)) != null) {
                c37127onv.copydefault(string);
            }
            return Unit.INSTANCE;
        }
        java.lang.Object objWithContext = BuildersKt.withContext(sDN.copydefault.AEQbTJ(), new AudioCallPluginHelper$jumpToAudioCall$6(context, str, zKWHzl, zKWHzl2, targetId, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public static final Unit djBIcL(JsonArrayBuilder jsonArrayBuilder) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        JsonElementBuildersKt.add(jsonArrayBuilder, "OKIMServiceImpl");
        JsonElementBuildersKt.add(jsonArrayBuilder, "AudioCallPluginHelper");
        JsonElementBuildersKt.add(jsonArrayBuilder, "startAudioCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "ableToMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "judgePermissionAndMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "jumpToAudioCall");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, boolean z, boolean z2, java.lang.String str2, JsonObjectBuilder jsonObjectBuilder) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, "isNetworkConnected", java.lang.Boolean.valueOf(z));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isOnCall", java.lang.Boolean.valueOf(z2));
        JsonElementBuildersKt.put(jsonObjectBuilder, "currentCallConversationId", str2);
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str, Function1<? super JsonArrayBuilder, Unit> function1, Function1<? super JsonObjectBuilder, Unit> function12) {
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, BotWebHook.KEY_ACTION, str);
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        function1.invoke(jsonArrayBuilder);
        jsonObjectBuilder.put("tags", jsonArrayBuilder.build());
        function12.invoke(jsonObjectBuilder);
        JsonElementBuildersKt.put(jsonObjectBuilder, "thread", java.lang.Thread.currentThread().getName());
        C44124sEe.imLogVoiceCall$default(jsonObjectBuilder.build().toString(), null, 2, null);
    }
}
