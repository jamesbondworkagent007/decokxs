package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.okex.deeplink.ChatbotOkAssistantDeeplinkHandler$handleDeeplink$1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sqB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45454sqB implements InterfaceC43234rlT {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.sqB$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sqB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        copydefault(context, map);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Object obj = map.get("from");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.Object obj2 = map.get("chatbot_message");
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String str4 = str3 == null ? "" : str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            if (!Intrinsics.EZpvd((java.lang.Object) entry.getKey(), (java.lang.Object) "from") && !Intrinsics.EZpvd((java.lang.Object) entry.getKey(), (java.lang.Object) "chatbot_message")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), entry2.getValue().toString());
        }
        java.lang.Object obj3 = map.get("contextual_params");
        java.lang.String str5 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.String str6 = str5 == null ? "" : str5;
        if (context instanceof LifecycleOwner) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) context), null, null, new ChatbotOkAssistantDeeplinkHandler$handleDeeplink$1(context, str2, str4, str6, linkedHashMap2, null), 3, null);
        }
    }
}
