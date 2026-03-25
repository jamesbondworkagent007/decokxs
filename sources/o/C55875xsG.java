package o;

import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.bot.list.CardStyle;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55875xsG implements InterfaceC55876xsH {
    public static final C55875xsG copydefault = new C55875xsG();
    public static final java.util.Map<java.lang.String, CardStyle> KWHzl = new LinkedHashMap();
    public static final java.util.Map<java.lang.String, java.lang.Integer> AEQbTJ = new LinkedHashMap();
    public static final int EZpvd = 8;

    private C55875xsG() {
    }

    public final java.lang.String OLrzqt() {
        return C55697xoo.OLrzqt.gEmmrt();
    }

    @Override // o.InterfaceC55876xsH
    public CardStyle KWHzl() {
        CardStyle cardStyleValueOf;
        java.lang.String strOLrzqt = OLrzqt();
        CardStyle cardStyle = KWHzl.get(strOLrzqt);
        if (cardStyle != null) {
            return cardStyle;
        }
        try {
            java.lang.String string = SPUtils.getString(strOLrzqt + "key_card_style", "DETAILED", "BOT_ONGOING_STYLE_FILE");
            Intrinsics.checkNotNullExpressionValue(string, "");
            cardStyleValueOf = CardStyle.valueOf(string);
        } catch (java.lang.Exception unused) {
            cardStyleValueOf = CardStyle.DETAILED;
        }
        KWHzl.put(strOLrzqt, cardStyleValueOf);
        return cardStyleValueOf;
    }

    @Override // o.InterfaceC55876xsH
    public void OLrzqt(@NotNull CardStyle cardStyle) {
        Intrinsics.checkNotNullParameter(cardStyle, "");
        java.lang.String strOLrzqt = OLrzqt();
        SPUtils.put(strOLrzqt + "key_card_style", cardStyle.name(), "BOT_ONGOING_STYLE_FILE");
        KWHzl.put(strOLrzqt, cardStyle);
    }

    public int copydefault() {
        java.lang.String strOLrzqt = OLrzqt();
        java.util.Map<java.lang.String, java.lang.Integer> map = AEQbTJ;
        java.lang.Integer num = map.get(strOLrzqt);
        if (num != null) {
            return num.intValue();
        }
        java.lang.Integer num2 = SPUtils.getInt(strOLrzqt + "key_pin_count", 0, "BOT_ONGOING_STYLE_FILE");
        map.put(strOLrzqt, num2);
        Intrinsics.copydefault(num2);
        return num2.intValue();
    }

    @Override // o.InterfaceC55876xsH
    public void KWHzl(int i) {
        java.lang.String strOLrzqt = OLrzqt();
        SPUtils.put(strOLrzqt + "key_pin_count", java.lang.Integer.valueOf(i), "BOT_ONGOING_STYLE_FILE");
        AEQbTJ.put(strOLrzqt, java.lang.Integer.valueOf(i));
    }

    public final void EZpvd(boolean z) {
        SPUtils.put(OLrzqt() + "KEY_COIN_LIST_VISIBLE", java.lang.Boolean.valueOf(z), "BOT_ONGOING_STYLE_FILE");
    }

    public final boolean AEQbTJ() {
        return SPUtils.getBoolean(OLrzqt() + "KEY_COIN_LIST_VISIBLE", false, "BOT_ONGOING_STYLE_FILE");
    }
}
