package o;

import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.firebase.messaging.Constants;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.imui.inputpanelV2.pluginV2.VoiceCallPlugin$ableToMakeCall$1;
import com.okinc.im.imui.inputpanelV2.pluginV2.VoiceCallPlugin$ableToMakeCall$4$1;
import com.okinc.im.imui.inputpanelV2.pluginV2.VoiceCallPlugin$launchAudioCallCheck$1;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okimcore.model.im.OKCallSession;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.unify_trade.biz.BotWebHook;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.JsonArrayBuilder;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.AbstractC37162ood;
import o.C35399nuc;
import o.C60123zwM;
import o.ServiceC37177oos;
import o.sNK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.obw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36492obw extends AbstractC35291nsZ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public Function0<Unit> EZpvd;
    public long KWHzl;

    @Override // o.InterfaceC35288nsW
    public android.graphics.drawable.Drawable EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C35399nuc.ActionBar.sSMYrx);
        Intrinsics.copydefault(drawable);
        return drawable;
    }

    @Override // o.InterfaceC35288nsW
    public java.lang.String KWHzl() {
        java.lang.String string = C32979mnm.EZpvd.OLrzqt().getApplicationContext().getString(C35399nuc.LoaderManager.addPreRequisiteCollector);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.InterfaceC35288nsW
    public void copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("IMChat_Btm_Send_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.obx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36492obw.KWHzl((EventParamsList) obj);
            }
        });
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("Input panel button click");
        eventDataAEQbTJ.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("isRunningInEmulator", "voice_callV2")));
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
        java.lang.String[] strArrOLrzqt = C37724ozI.EZpvd.OLrzqt();
        if (C60121zwJ.KWHzl(fragment.requireContext(), (java.lang.String[]) java.util.Arrays.copyOf(strArrOLrzqt, strArrOLrzqt.length))) {
            OLrzqt(fragment);
            return;
        }
        C60123zwM c60123zwMAEQbTJ = new C60123zwM.ActionBar(fragment, 100, (java.lang.String[]) java.util.Arrays.copyOf(strArrOLrzqt, strArrOLrzqt.length)).AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(c60123zwMAEQbTJ, "");
        C60121zwJ.copydefault(c60123zwMAEQbTJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "voice_call", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(androidx.fragment.app.Fragment fragment) {
        java.lang.String targetId;
        java.lang.String string;
        OKConversation oKConversationKWHzl;
        java.lang.String targetId2;
        OKConversation oKConversationKWHzl2;
        final C35287nsV c35287nsVCopydefault = copydefault();
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        final long j = this.KWHzl;
        KWHzl("onClick", new Function1() { // from class: o.obH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36492obw.fJNWhG((JsonArrayBuilder) obj);
            }
        }, new Function1() { // from class: o.obL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36492obw.EZpvd(j, jCurrentTimeMillis, (JsonObjectBuilder) obj);
            }
        });
        if (jCurrentTimeMillis - j > 1000) {
            Function0<Unit> function0 = this.EZpvd;
            if (function0 != null) {
                function0.invoke();
            }
            final FragmentActivity activity = fragment.getActivity();
            KWHzl("onClick", new Function1() { // from class: o.obM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36492obw.AuCTel((JsonArrayBuilder) obj);
                }
            }, new Function1() { // from class: o.obO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36492obw.EZpvd(j, jCurrentTimeMillis, c35287nsVCopydefault, activity, (JsonObjectBuilder) obj);
                }
            });
            if (c35287nsVCopydefault == null || (oKConversationKWHzl2 = c35287nsVCopydefault.KWHzl()) == null || (targetId = oKConversationKWHzl2.getTargetId()) == null) {
                targetId = "";
            }
            if (!android.text.TextUtils.isEmpty(targetId) && activity != null) {
                KWHzl("onClick", new Function1() { // from class: o.obK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C36492obw.fARcdN((JsonArrayBuilder) obj);
                    }
                }, new Function1() { // from class: o.obT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C36492obw.KWHzl(j, jCurrentTimeMillis, c35287nsVCopydefault, (JsonObjectBuilder) obj);
                    }
                });
                AEQbTJ(fragment, (c35287nsVCopydefault == null || (oKConversationKWHzl = c35287nsVCopydefault.KWHzl()) == null || (targetId2 = oKConversationKWHzl.getTargetId()) == null) ? "" : targetId2, j, jCurrentTimeMillis);
            } else {
                android.content.res.Resources resources = C32979mnm.EZpvd.OLrzqt().getResources();
                if (resources != null && (string = resources.getString(C35399nuc.LoaderManager.vLaW)) != null) {
                    C37127onv.AEQbTJ.copydefault(string);
                }
            }
            this.KWHzl = java.lang.System.currentTimeMillis();
        }
    }

    public static final Unit fJNWhG(JsonArrayBuilder jsonArrayBuilder) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        JsonElementBuildersKt.add(jsonArrayBuilder, "VoiceCallPlugin");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onClick");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(long j, long j2, JsonObjectBuilder jsonObjectBuilder) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "previousTimeMs", java.lang.Long.valueOf(j));
        JsonElementBuildersKt.put(jsonObjectBuilder, "currentTimeMs", java.lang.Long.valueOf(j2));
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(JsonArrayBuilder jsonArrayBuilder) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        JsonElementBuildersKt.add(jsonArrayBuilder, "VoiceCallPlugin");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onClick");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(long j, long j2, C35287nsV c35287nsV, FragmentActivity fragmentActivity, JsonObjectBuilder jsonObjectBuilder) {
        OKConversation oKConversationKWHzl;
        java.lang.String targetId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "previousTimeMs", java.lang.Long.valueOf(j));
        JsonElementBuildersKt.put(jsonObjectBuilder, "currentTimeMs", java.lang.Long.valueOf(j2));
        if (c35287nsV != null && (oKConversationKWHzl = c35287nsV.KWHzl()) != null && (targetId = oKConversationKWHzl.getTargetId()) != null) {
            str = targetId;
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, "hasActivity", java.lang.Boolean.valueOf(fragmentActivity != null));
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(JsonArrayBuilder jsonArrayBuilder) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        JsonElementBuildersKt.add(jsonArrayBuilder, "VoiceCallPlugin");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onClick");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(long j, long j2, C35287nsV c35287nsV, JsonObjectBuilder jsonObjectBuilder) {
        OKConversation oKConversationKWHzl;
        java.lang.String targetId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "previousTimeMs", java.lang.Long.valueOf(j));
        JsonElementBuildersKt.put(jsonObjectBuilder, "currentTimeMs", java.lang.Long.valueOf(j2));
        if (c35287nsV != null && (oKConversationKWHzl = c35287nsV.KWHzl()) != null && (targetId = oKConversationKWHzl.getTargetId()) != null) {
            str = targetId;
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, "hasActivity", java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(androidx.fragment.app.Fragment fragment, java.lang.String str, long j, long j2) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new VoiceCallPlugin$launchAudioCallCheck$1(this, str, fragment, j, j2, null), 3, null);
    }

    @Override // o.InterfaceC35288nsW
    public void OLrzqt(int i, int i2, android.content.Intent intent, @NotNull android.content.Context context) {
        java.lang.String string;
        java.lang.String string2;
        Intrinsics.checkNotNullParameter(context, "");
        if (i == 100 && intent != null) {
            final boolean z = i2 == 1;
            final java.lang.String stringExtra = intent.getStringExtra("key_audio_call_target_id");
            final java.lang.String stringExtra2 = intent.getStringExtra("key_audio_call_contact_id");
            KWHzl("onActivityResult", new Function1() { // from class: o.obR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36492obw.getNewProxyInstance((JsonArrayBuilder) obj);
                }
            }, new Function1() { // from class: o.obS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36492obw.AEQbTJ(z, stringExtra, stringExtra2, (JsonObjectBuilder) obj);
                }
            });
            if (z && stringExtra != null && stringExtra2 != null) {
                copydefault(stringExtra, stringExtra2);
                return;
            }
            android.content.res.Resources resources = C32979mnm.EZpvd.OLrzqt().getResources();
            if (resources == null || (string2 = resources.getString(C35399nuc.LoaderManager.vLaW)) == null) {
                return;
            }
            C37127onv.AEQbTJ.copydefault(string2);
            return;
        }
        android.content.res.Resources resources2 = C32979mnm.EZpvd.OLrzqt().getResources();
        if (resources2 == null || (string = resources2.getString(C35399nuc.LoaderManager.vLaW)) == null) {
            return;
        }
        C37127onv.AEQbTJ.copydefault(string);
    }

    public static final Unit getNewProxyInstance(JsonArrayBuilder jsonArrayBuilder) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        JsonElementBuildersKt.add(jsonArrayBuilder, "VoiceCallPlugin");
        JsonElementBuildersKt.add(jsonArrayBuilder, "judgePermissionAndMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onRequestPermissionResult");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onActivityResult");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(boolean z, java.lang.String str, java.lang.String str2, JsonObjectBuilder jsonObjectBuilder) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "isReady", java.lang.Boolean.valueOf(z));
        JsonElementBuildersKt.put(jsonObjectBuilder, "conversationId", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, "remoteUserId", str2);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC35291nsZ, o.InterfaceC35288nsW
    public java.lang.Integer AEQbTJ() {
        return 100;
    }

    public final void copydefault(final java.lang.String str, final java.lang.String str2) {
        KWHzl("startCall", new Function1() { // from class: o.obX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36492obw.AuCTelauCTel((JsonArrayBuilder) obj);
            }
        }, new Function1() { // from class: o.obV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36492obw.KWHzl(str, str2, (JsonObjectBuilder) obj);
            }
        });
        C37127onv.AEQbTJ.AhwBna().copydefault(true);
        ServiceC37177oos.StateListAnimator stateListAnimator = ServiceC37177oos.Companion;
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        c32979mnm.OLrzqt().startService(stateListAnimator.copydefault(c32979mnm.OLrzqt(), new AbstractC37162ood.Activity("action_audio_call_start_call", str, str2, null, null, null, null, 120, null)));
    }

    public static final Unit AuCTelauCTel(JsonArrayBuilder jsonArrayBuilder) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        JsonElementBuildersKt.add(jsonArrayBuilder, "VoiceCallPlugin");
        JsonElementBuildersKt.add(jsonArrayBuilder, "startCall");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, JsonObjectBuilder jsonObjectBuilder) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "conversationId", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, "remoteUserId", str2);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC35288nsW
    public void OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, int i, @NotNull java.lang.String[] strArr, @NotNull int[] iArr) {
        OKConversation oKConversationKWHzl;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        final C35287nsV c35287nsVCopydefault = copydefault();
        final boolean zKWHzl = C60121zwJ.KWHzl(fragment.requireContext(), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        KWHzl("onRequestPermissionResult", new Function1() { // from class: o.obW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36492obw.fIwbmz((JsonArrayBuilder) obj);
            }
        }, new Function1() { // from class: o.obC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36492obw.AEQbTJ(zKWHzl, c35287nsVCopydefault, (JsonObjectBuilder) obj);
            }
        });
        if (i == 100) {
            if (zKWHzl) {
                final boolean z = ((c35287nsVCopydefault == null || (oKConversationKWHzl = c35287nsVCopydefault.KWHzl()) == null) ? null : oKConversationKWHzl.getConversationType()) == OKConversationType.PRIVATE;
                KWHzl("onRequestPermissionResult", new Function1() { // from class: o.obB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C36492obw.hDKMBd((JsonArrayBuilder) obj);
                    }
                }, new Function1() { // from class: o.obA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C36492obw.KWHzl(zKWHzl, c35287nsVCopydefault, z, (JsonObjectBuilder) obj);
                    }
                });
                OLrzqt(fragment);
                return;
            }
            C37127onv.AEQbTJ.AhwBna().copydefault(false);
        }
    }

    public static final Unit fIwbmz(JsonArrayBuilder jsonArrayBuilder) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        JsonElementBuildersKt.add(jsonArrayBuilder, "VoiceCallPlugin");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onClick");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onRequestPermissionResult");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(boolean z, C35287nsV c35287nsV, JsonObjectBuilder jsonObjectBuilder) {
        OKConversation oKConversationKWHzl;
        java.lang.String targetId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "hasPermissions", java.lang.Boolean.valueOf(z));
        if (c35287nsV != null && (oKConversationKWHzl = c35287nsV.KWHzl()) != null && (targetId = oKConversationKWHzl.getTargetId()) != null) {
            str = targetId;
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(JsonArrayBuilder jsonArrayBuilder) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        JsonElementBuildersKt.add(jsonArrayBuilder, "VoiceCallPlugin");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onClick");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onRequestPermissionResult");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(boolean z, C35287nsV c35287nsV, boolean z2, JsonObjectBuilder jsonObjectBuilder) {
        OKConversation oKConversationKWHzl;
        java.lang.String targetId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "hasPermissions", java.lang.Boolean.valueOf(z));
        if (c35287nsV != null && (oKConversationKWHzl = c35287nsV.KWHzl()) != null && (targetId = oKConversationKWHzl.getTargetId()) != null) {
            str = targetId;
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, "isPrivateChat", java.lang.Boolean.valueOf(z2));
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(androidx.fragment.app.Fragment fragment, final java.lang.String str) {
        java.lang.String contactsId;
        RelationInfo relationInfoEZpvd;
        java.lang.String string;
        java.lang.String string2;
        final C35287nsV c35287nsVCopydefault = copydefault();
        C37127onv c37127onv = C37127onv.AEQbTJ;
        InterfaceC35259nru interfaceC35259nruAhwBna = c37127onv.AhwBna();
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        final boolean zKWHzl = c43453rpa.KWHzl(c32979mnm.OLrzqt());
        final boolean zKWHzl2 = interfaceC35259nruAhwBna.KWHzl();
        OKCallSession second = interfaceC35259nruAhwBna.OLrzqt().getSecond();
        final java.lang.String targetId = second != null ? second.getTargetId() : null;
        KWHzl("jumpToAudioCall", new Function1() { // from class: o.obv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36492obw.getFieldNames((JsonArrayBuilder) obj);
            }
        }, new Function1() { // from class: o.obN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36492obw.EZpvd(str, zKWHzl, zKWHzl2, targetId, (JsonObjectBuilder) obj);
            }
        });
        if (!zKWHzl) {
            android.content.res.Resources resources = c32979mnm.OLrzqt().getResources();
            if (resources == null || (string2 = resources.getString(C35399nuc.LoaderManager.vLaW)) == null) {
                return;
            }
            c37127onv.copydefault(string2);
            return;
        }
        if (zKWHzl2 && !C59449zhJ.equals$default(str, targetId, false, 2, null)) {
            android.content.res.Resources resources2 = c32979mnm.OLrzqt().getResources();
            if (resources2 == null || (string = resources2.getString(C35399nuc.LoaderManager.zKcAg)) == null) {
                return;
            }
            c37127onv.copydefault(string);
            return;
        }
        KWHzl("jumpToAudioCall", new Function1() { // from class: o.obP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36492obw.iwGUEr((JsonArrayBuilder) obj);
            }
        }, new Function1() { // from class: o.obQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36492obw.AEQbTJ(str, c35287nsVCopydefault, zKWHzl, zKWHzl2, targetId, (JsonObjectBuilder) obj);
            }
        });
        android.content.Intent intentOLrzqt = ActivityC42573rXw.Companion.OLrzqt(c32979mnm.OLrzqt());
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = C56390yDp.OLrzqt("key_audio_call_target_id", str);
        if (c35287nsVCopydefault == null || (relationInfoEZpvd = c35287nsVCopydefault.EZpvd()) == null || (contactsId = relationInfoEZpvd.getContactsId()) == null) {
            contactsId = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("key_audio_call_contact_id", contactsId);
        intentOLrzqt.putExtras(BundleKt.bundleOf(pairArr));
        if (!fragment.isAdded() || fragment.isDetached() || fragment.isRemoving()) {
            return;
        }
        fragment.startActivityForResult(intentOLrzqt, 100);
    }

    public static final Unit getFieldNames(JsonArrayBuilder jsonArrayBuilder) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        JsonElementBuildersKt.add(jsonArrayBuilder, "VoiceCallPlugin");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onClick");
        JsonElementBuildersKt.add(jsonArrayBuilder, "ableToMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "judgePermissionAndMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onRequestPermissionResult");
        JsonElementBuildersKt.add(jsonArrayBuilder, "jumpToAudioCall");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str, boolean z, boolean z2, java.lang.String str2, JsonObjectBuilder jsonObjectBuilder) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, "isNetworkConnected", java.lang.Boolean.valueOf(z));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isOnCall", java.lang.Boolean.valueOf(z2));
        JsonElementBuildersKt.put(jsonObjectBuilder, "currentCallConversationId", str2);
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr(JsonArrayBuilder jsonArrayBuilder) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        JsonElementBuildersKt.add(jsonArrayBuilder, "VoiceCallPlugin");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onClick");
        JsonElementBuildersKt.add(jsonArrayBuilder, "ableToMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "judgePermissionAndMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onRequestPermissionResult");
        JsonElementBuildersKt.add(jsonArrayBuilder, "jumpToAudioCall");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str, C35287nsV c35287nsV, boolean z, boolean z2, java.lang.String str2, JsonObjectBuilder jsonObjectBuilder) {
        RelationInfo relationInfoEZpvd;
        java.lang.String contactsId;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
        if (c35287nsV != null && (relationInfoEZpvd = c35287nsV.EZpvd()) != null && (contactsId = relationInfoEZpvd.getContactsId()) != null) {
            str3 = contactsId;
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, "remoteUserId", str3);
        JsonElementBuildersKt.put(jsonObjectBuilder, "isNetworkConnected", java.lang.Boolean.valueOf(z));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isOnCall", java.lang.Boolean.valueOf(z2));
        JsonElementBuildersKt.put(jsonObjectBuilder, "currentCallConversationId", str2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(final java.lang.String str, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        VoiceCallPlugin$ableToMakeCall$1 voiceCallPlugin$ableToMakeCall$1;
        C36492obw c36492obw;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof VoiceCallPlugin$ableToMakeCall$1) {
            voiceCallPlugin$ableToMakeCall$1 = (VoiceCallPlugin$ableToMakeCall$1) continuation;
            int i = voiceCallPlugin$ableToMakeCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                voiceCallPlugin$ableToMakeCall$1.label = i - Integer.MIN_VALUE;
            } else {
                voiceCallPlugin$ableToMakeCall$1 = new VoiceCallPlugin$ableToMakeCall$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = voiceCallPlugin$ableToMakeCall$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = voiceCallPlugin$ableToMakeCall$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            KWHzl("ableToMakeCall", new Function1() { // from class: o.obD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36492obw.isConnected((JsonArrayBuilder) obj);
                }
            }, new Function1() { // from class: o.obE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36492obw.OLrzqt(str, (JsonObjectBuilder) obj);
                }
            });
            try {
                Result.Application application = Result.Companion;
                CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
                VoiceCallPlugin$ableToMakeCall$4$1 voiceCallPlugin$ableToMakeCall$4$1 = new VoiceCallPlugin$ableToMakeCall$4$1(str, null);
                voiceCallPlugin$ableToMakeCall$1.L$0 = this;
                voiceCallPlugin$ableToMakeCall$1.L$1 = str;
                voiceCallPlugin$ableToMakeCall$1.L$2 = function0;
                voiceCallPlugin$ableToMakeCall$1.L$3 = function02;
                voiceCallPlugin$ableToMakeCall$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherCopydefault, voiceCallPlugin$ableToMakeCall$4$1, voiceCallPlugin$ableToMakeCall$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                c36492obw = this;
            } catch (java.lang.Throwable th) {
                th = th;
                c36492obw = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function02 = (Function0) voiceCallPlugin$ableToMakeCall$1.L$3;
            function0 = (Function0) voiceCallPlugin$ableToMakeCall$1.L$2;
            str = (java.lang.String) voiceCallPlugin$ableToMakeCall$1.L$1;
            c36492obw = (C36492obw) voiceCallPlugin$ableToMakeCall$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((sNK) objWithContext);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            final sNK snk = (sNK) objM7377constructorimpl;
            final boolean z = snk instanceof sNK.Application;
            c36492obw.KWHzl("ableToMakeCall", new Function1() { // from class: o.obI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36492obw.DbNXlk((JsonArrayBuilder) obj);
                }
            }, new Function1() { // from class: o.obJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36492obw.AEQbTJ(str, z, snk, (JsonObjectBuilder) obj);
                }
            });
            if (z) {
                function0.invoke();
            } else {
                C37127onv.AEQbTJ.copydefault(C36442oaz.EZpvd.EZpvd(snk));
                function02.invoke();
            }
        }
        final java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            c36492obw.KWHzl("ableToMakeCall", new Function1() { // from class: o.obG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36492obw.ejfBZ((JsonArrayBuilder) obj);
                }
            }, new Function1() { // from class: o.obF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36492obw.OLrzqt(str, thM7380exceptionOrNullimpl, (JsonObjectBuilder) obj);
                }
            });
            function02.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(JsonArrayBuilder jsonArrayBuilder) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        JsonElementBuildersKt.add(jsonArrayBuilder, "VoiceCallPlugin");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onClick");
        JsonElementBuildersKt.add(jsonArrayBuilder, "ableToMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "judgePermissionAndMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onRequestPermissionResult");
        JsonElementBuildersKt.add(jsonArrayBuilder, "jumpToAudioCall");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, JsonObjectBuilder jsonObjectBuilder) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(JsonArrayBuilder jsonArrayBuilder) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        JsonElementBuildersKt.add(jsonArrayBuilder, "VoiceCallPlugin");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onClick");
        JsonElementBuildersKt.add(jsonArrayBuilder, "ableToMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "judgePermissionAndMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onRequestPermissionResult");
        JsonElementBuildersKt.add(jsonArrayBuilder, "jumpToAudioCall");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str, boolean z, sNK snk, JsonObjectBuilder jsonObjectBuilder) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, "canCall", java.lang.Boolean.valueOf(z));
        JsonElementBuildersKt.put(jsonObjectBuilder, "cannotCallReason", snk.toString());
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(JsonArrayBuilder jsonArrayBuilder) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        JsonElementBuildersKt.add(jsonArrayBuilder, "VoiceCallPlugin");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onClick");
        JsonElementBuildersKt.add(jsonArrayBuilder, "ableToMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "judgePermissionAndMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onRequestPermissionResult");
        JsonElementBuildersKt.add(jsonArrayBuilder, "jumpToAudioCall");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.Throwable th, JsonObjectBuilder jsonObjectBuilder) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, Constants.IPC_BUNDLE_KEY_SEND_ERROR, C56379yDe.AEQbTJ(th));
        return Unit.INSTANCE;
    }

    public final void copydefault(final java.lang.String str, androidx.fragment.app.Fragment fragment) {
        OKConversation oKConversationKWHzl;
        C35287nsV c35287nsVCopydefault = copydefault();
        java.lang.String[] strArrOLrzqt = C37724ozI.EZpvd.OLrzqt();
        final boolean zKWHzl = C60121zwJ.KWHzl(fragment.requireContext(), (java.lang.String[]) java.util.Arrays.copyOf(strArrOLrzqt, strArrOLrzqt.length));
        final boolean z = ((c35287nsVCopydefault == null || (oKConversationKWHzl = c35287nsVCopydefault.KWHzl()) == null) ? null : oKConversationKWHzl.getConversationType()) == OKConversationType.PRIVATE;
        KWHzl("judgePermissionAndMakeCall", new Function1() { // from class: o.obU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36492obw.uzCIH((JsonArrayBuilder) obj);
            }
        }, new Function1() { // from class: o.obY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36492obw.OLrzqt(str, zKWHzl, z, (JsonObjectBuilder) obj);
            }
        });
        if (zKWHzl) {
            if (z) {
                AEQbTJ(fragment, str);
            }
        } else {
            C60123zwM c60123zwMAEQbTJ = new C60123zwM.ActionBar(fragment, 100, (java.lang.String[]) java.util.Arrays.copyOf(strArrOLrzqt, strArrOLrzqt.length)).AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(c60123zwMAEQbTJ, "");
            C60121zwJ.copydefault(c60123zwMAEQbTJ);
        }
    }

    public static final Unit uzCIH(JsonArrayBuilder jsonArrayBuilder) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "");
        JsonElementBuildersKt.add(jsonArrayBuilder, "VoiceCallPlugin");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onClick");
        JsonElementBuildersKt.add(jsonArrayBuilder, "ableToMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "judgePermissionAndMakeCall");
        JsonElementBuildersKt.add(jsonArrayBuilder, "onRequestPermissionResult");
        JsonElementBuildersKt.add(jsonArrayBuilder, "jumpToAudioCall");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, boolean z, boolean z2, JsonObjectBuilder jsonObjectBuilder) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetId", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, "hasPermissions", java.lang.Boolean.valueOf(z));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isPrivateChat", java.lang.Boolean.valueOf(z2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.obw$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.obw.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
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
