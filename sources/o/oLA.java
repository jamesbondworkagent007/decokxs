package o;

import com.okinc.dexkline.dex.api.bean.TokenBase;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oLA implements InterfaceC43234rlT {
    public static final Activity Companion = new Activity(null);

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oLA.Activity.<init>():void type: THIS */
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
        if (C54586xNw.OLrzqt.EZpvd()) {
            java.lang.Object obj = map.get("chainId");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            java.lang.String str2 = str == null ? "" : str;
            java.lang.Object obj2 = map.get("tokenaddr");
            java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            java.lang.String str4 = str3 == null ? "" : str3;
            java.lang.Object obj3 = map.get("tokenName");
            java.lang.String str5 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            java.lang.String str6 = str5 == null ? "" : str5;
            java.lang.Object obj4 = map.get("isShowPriceAlert");
            java.lang.String str7 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
            if (str7 == null) {
                str7 = "0";
            }
            java.lang.String str8 = str7;
            java.lang.Object obj5 = map.get("tab");
            java.lang.String str9 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
            java.lang.String str10 = str9 == null ? "" : str9;
            pUU.KWHzl("CedefiMarketDetailDeeplinkHandler", "metadata is " + interfaceC43233rlS + ", params is " + map);
            if (str2.length() > 0 && str4.length() > 0) {
                mUO.openMarketDetailPage$default(context, "deeplink", new TokenBase(str2, str4, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str6, (java.lang.String) null, 0, 0, 0, 0, (java.lang.String) null, "deeplink", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, false, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, 1073737692, (DefaultConstructorMarker) null), "deeplink", null, str8, str10, 8, null);
            }
        } else {
            pUU.copydefault("CedefiMarketDetailDeeplinkHandler", "CedefiMarketDetailDeeplinkHandler not support CEDEFI");
        }
        pUU.KWHzl("CedefiMarketDetailDeeplinkHandler", "executeDeeplink -> metadata is " + interfaceC43233rlS + ", params is " + map + " ");
    }
}
