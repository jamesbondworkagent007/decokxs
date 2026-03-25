package o;

import androidx.core.os.BundleKt;
import com.appsflyer.AppsFlyerProperties;
import com.okinc.biz.bean.ChatBotRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC45197slJ;
import o.C47315tni;
import o.InterfaceC6804aWL;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.slF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45193slF {
    public static boolean EZpvd;
    public static final C45193slF copydefault = new C45193slF();
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        EZpvd = z;
    }

    private C45193slF() {
    }

    public final java.lang.Object EZpvd(@NotNull android.content.Context context, @NotNull ChatBotRequest chatBotRequest, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCopydefault = copydefault(context, OLrzqt(chatBotRequest), continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull AbstractC45197slJ abstractC45197slJ, @NotNull Continuation<? super Unit> continuation) {
        if (abstractC45197slJ instanceof AbstractC45197slJ.StateListAnimator) {
            AbstractC45197slJ.StateListAnimator stateListAnimator = (AbstractC45197slJ.StateListAnimator) abstractC45197slJ;
            java.lang.Object objOpenChatBotPage$default = InterfaceC6804aWL.Application.openChatBotPage$default((InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class), context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", stateListAnimator.EZpvd()), C56390yDp.OLrzqt("cache", C56443yFo.KWHzl(stateListAnimator.KWHzl()))), null, continuation, 4, null);
            return objOpenChatBotPage$default == C56442yFn.copydefault() ? objOpenChatBotPage$default : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final AbstractC45197slJ.StateListAnimator OLrzqt(@NotNull ChatBotRequest chatBotRequest) {
        Intrinsics.checkNotNullParameter(chatBotRequest, "");
        InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class);
        java.lang.String str = (interfaceC33171mrS == null || interfaceC33171mrS.ejfBZ()) ? "lite" : "pro";
        java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("source", java.lang.String.valueOf(chatBotRequest.getFormSource())), C56390yDp.OLrzqt("greeting", chatBotRequest.getGreetings()), C56390yDp.OLrzqt("greeting_oversea", chatBotRequest.getGreetingAda()), C56390yDp.OLrzqt("contextualBot", chatBotRequest.getContextualBot()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapGEmmrt.entrySet()) {
            if (((java.lang.String) entry.getValue()) != null && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) r7))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (interfaceC33171mrS != null && interfaceC33171mrS.fIwbmz()) {
            java.lang.String str2 = chatBotRequest.getExtraParams().get("options");
            java.util.Map<java.lang.String, java.lang.String> extraParams = chatBotRequest.getExtraParams();
            java.lang.String str3 = "no-login";
            if (str2 != null && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2))) {
                C56529yIt c56529yIt = C56529yIt.KWHzl;
                str3 = java.lang.String.format("%s,%s", java.util.Arrays.copyOf(new java.lang.Object[]{str2, "no-login"}, 2));
                Intrinsics.checkNotNullExpressionValue(str3, "");
            }
            extraParams.put("options", str3);
        }
        java.util.Map mapOLrzqt = C56424yEw.OLrzqt(C56424yEw.OLrzqt(C56424yEw.gEmmrt(C56390yDp.OLrzqt("titleBarVisibility", "0"), C56390yDp.OLrzqt(AppsFlyerProperties.CHANNEL, str), C56390yDp.OLrzqt("from", chatBotRequest.getOkaFrom()), C56390yDp.OLrzqt("chatbot_message", chatBotRequest.getOkaChatbotMessage())), chatBotRequest.getExtraParams()), linkedHashMap);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C47315tni.PendingIntent.isConnected);
        if (interfaceC33171mrS != null && interfaceC33171mrS.fIwbmz()) {
            strAYXKKw = C33070mpX.AYXKKw(C47315tni.PendingIntent.DsrFlB) + strAYXKKw;
        }
        HttpUrl.Builder builderNewBuilder = HttpUrl.Companion.get(C6813aWU.AEQbTJ(strAYXKKw)).newBuilder();
        for (Map.Entry entry2 : mapOLrzqt.entrySet()) {
            java.lang.String str4 = (java.lang.String) entry2.getKey();
            java.lang.String str5 = (java.lang.String) entry2.getValue();
            if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "options")) {
                builderNewBuilder.addEncodedQueryParameter(str4, str5);
            } else {
                builderNewBuilder.addQueryParameter(str4, str5);
            }
        }
        if (EZpvd) {
            builderNewBuilder.addQueryParameter("load_history", "true");
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) chatBotRequest.getContextualParams())) {
            builderNewBuilder.addQueryParameter("contextual_params", chatBotRequest.getContextualParams());
        }
        java.lang.String string = builderNewBuilder.build().url().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        C44760scx.log$default("getOkAssistantService: url=" + string, null, 2, null);
        return new AbstractC45197slJ.StateListAnimator(string, true);
    }
}
