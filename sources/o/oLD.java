package o;

import com.okinc.kline.api.bean.MarketCoinInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oLD implements InterfaceC43234rlT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final java.lang.String copydefault = "Deep_Link";

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oLD.StateListAnimator.<init>():void type: THIS */
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
        java.lang.Object obj = map.get("id");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.Object obj2 = map.get("type");
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.Object obj3 = map.get("refreshWidget");
        java.lang.String str5 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str5 == null) {
            str5 = "";
        }
        java.lang.Object obj4 = map.get("source");
        java.lang.String str6 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        if (str6 == null) {
            str6 = this.copydefault;
        }
        java.lang.String str7 = str6;
        java.lang.Object obj5 = map.get("firstTab");
        java.lang.String str8 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        java.lang.String str9 = str8 == null ? "" : str8;
        java.lang.Object obj6 = map.get("isCedefiOnline");
        java.lang.String str10 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
        if (str10 == null) {
            str10 = "0";
        }
        java.lang.String str11 = str10;
        java.lang.Object obj7 = map.get("tag");
        java.lang.String str12 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
        java.lang.String str13 = str12 == null ? "" : str12;
        if (str2.length() > 0 && str4.length() > 0) {
            MarketCoinInfo marketCoinInfo = new MarketCoinInfo(str2, str4, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC38834pgs.class);
            intent.putExtra("market_detail_info", marketCoinInfo);
            intent.putExtra("refreshWidget", str5);
            intent.putExtra("from_scene", str7);
            intent.putExtra("firstTab", str9);
            intent.putExtra("isCedefiOnline", str11);
            intent.putExtra("tag", str13);
            if (Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "1")) {
                intent.addFlags(67108864);
            }
            context.startActivity(intent);
        }
        pUU.KWHzl("MarketDetailDeeplinkHandler", "executeDeeplink -> metadata is " + interfaceC43233rlS + ", params is " + map + " ");
    }
}
