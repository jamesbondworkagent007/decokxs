package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.oklive.app.deeplink.LivePageDeeplinkHandler$handleDeeplink$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sTF implements InterfaceC43234rlT {
    public static final Application Companion = new Application(null);

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sTF.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        KWHzl(context, map);
    }

    private final void KWHzl(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.String strValueOf;
        java.lang.String strValueOf2;
        InterfaceC44531sTi interfaceC44531sTi = (InterfaceC44531sTi) C43251rlk.OLrzqt(InterfaceC44531sTi.class);
        java.lang.Object obj = map.get("shareCode");
        if (obj instanceof java.lang.Long) {
            strValueOf = java.lang.String.valueOf(((java.lang.Number) obj).longValue());
        } else if (obj instanceof java.lang.String) {
            strValueOf = (java.lang.String) obj;
        } else if (obj instanceof java.lang.Integer) {
            strValueOf = java.lang.String.valueOf(((java.lang.Number) obj).intValue());
        } else {
            pUU.valueOf("LivePageDeeplinkHandler", "No valid shareCode found in params, using default");
            strValueOf = "";
        }
        java.lang.String str = strValueOf;
        java.lang.Object obj2 = map.get(RemoteMessageConst.Notification.CHANNEL_ID);
        if (obj2 instanceof java.lang.Long) {
            strValueOf2 = java.lang.String.valueOf(((java.lang.Number) obj2).longValue());
        } else if (obj2 instanceof java.lang.String) {
            strValueOf2 = (java.lang.String) obj2;
        } else if (obj2 instanceof java.lang.Integer) {
            strValueOf2 = java.lang.String.valueOf(((java.lang.Number) obj2).intValue());
        } else {
            pUU.valueOf("LivePageDeeplinkHandler", "No valid affiliate channel id  found in params, using default");
            strValueOf2 = null;
        }
        java.lang.Object obj3 = map.get("entrySource");
        java.lang.String string = obj3 instanceof java.lang.String ? ((java.lang.String) obj3).toString() : null;
        pUU.EZpvd("LivePageDeeplinkHandler", "Handling deeplink for livestream, shareCode: " + str + ", affiliateChannelId: " + strValueOf2 + ", sourcePage: " + string + ", params: " + map);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getMain())), null, null, new LivePageDeeplinkHandler$handleDeeplink$1(interfaceC44531sTi, context, str, strValueOf2, string, map, null), 3, null);
    }
}
