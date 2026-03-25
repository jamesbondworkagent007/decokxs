package o;

import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.okex.deeplink.ChatbotAuthDeeplinkHandler$handleDeeplink$1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sqo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45493sqo implements InterfaceC43234rlT {
    public static final Activity Companion = new Activity(null);

    /* JADX INFO: renamed from: o.sqo$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sqo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        KWHzl(context, map);
    }

    public final void KWHzl(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Object obj = map.get("from");
        final java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        java.lang.Object obj2 = map.get("chatbot_message");
        final java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str2 == null) {
            str2 = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            if (!Intrinsics.EZpvd((java.lang.Object) entry.getKey(), (java.lang.Object) "from") && !Intrinsics.EZpvd((java.lang.Object) entry.getKey(), (java.lang.Object) "chatbot_message")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), entry2.getValue().toString());
        }
        java.lang.Object obj3 = map.get("contextual_params");
        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        final java.lang.String str4 = str3 != null ? str3 : "";
        C45357soK.KWHzl.copydefault(context, new ChatbotAuthDeeplinkHandler$handleDeeplink$1(C6805aWM.OLrzqt(new Function1() { // from class: o.sqp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj4) {
                return C45493sqo.copydefault(str, str2, str4, linkedHashMap2, (ChatBotRequest) obj4);
            }
        }), null));
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, ChatBotRequest chatBotRequest) {
        Intrinsics.checkNotNullParameter(chatBotRequest, "");
        chatBotRequest.setOkaFrom(str);
        chatBotRequest.setOkaChatbotMessage(str2);
        chatBotRequest.setContextualParams(str3);
        chatBotRequest.getExtraParams().putAll(map);
        return Unit.INSTANCE;
    }
}
