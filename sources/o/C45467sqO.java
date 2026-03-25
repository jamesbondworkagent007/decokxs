package o;

import com.okinc.okex.deeplink.SupportCenterDeeplinkHandler$handleDeeplink$1$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sqO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45467sqO implements InterfaceC43234rlT {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.sqO$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sqO.StateListAnimator.<init>():void type: THIS */
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
        KWHzl(context, map);
    }

    private final void KWHzl(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Object obj = map.get("entrance_id");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.Object obj2 = map.get("type");
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.Object obj3 = map.get("meeting_id");
        java.lang.String str5 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.Object obj4 = map.get("source");
        java.lang.String str7 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        C6807aWO c6807aWO = new C6807aWO(str4, str6, null, str7 == null ? "" : str7, null, null, 52, null);
        InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.OLrzqt(InterfaceC6804aWL.class);
        if (interfaceC6804aWL != null) {
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new SupportCenterDeeplinkHandler$handleDeeplink$1$1(str2, c6807aWO, interfaceC6804aWL, context, null), 3, null);
            } else {
                interfaceC6804aWL.OLrzqt(context, c6807aWO);
            }
        }
    }
}
