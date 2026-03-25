package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oLz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36011oLz implements InterfaceC43234rlT {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.oLz$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oLz.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("coin");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = map.get("symbol");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.Object obj3 = map.get("from");
        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC38484paM.class);
        if (str != null) {
            intent.putExtra("coin", str);
        }
        if (str2 != null) {
            intent.putExtra("symbol", str2);
        }
        if (str3 != null) {
            intent.putExtra("from", str3);
        }
        context.startActivity(intent);
        pUU.KWHzl("CoinDetailKlineDeeplinkHandler", "executeDeeplink -> metadata is " + interfaceC43233rlS + ", params is " + map + " ");
    }
}
