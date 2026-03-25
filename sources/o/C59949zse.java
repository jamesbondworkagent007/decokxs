package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.p2p.api.OtcRouteConst;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;

/* JADX INFO: renamed from: o.zse, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C59949zse {
    public static final java.lang.String[] AEQbTJ;
    public static final java.util.Map<java.lang.String, C59949zse> AhwBna = new java.util.HashMap();
    public static final java.lang.String[] EZpvd;
    public static final java.lang.String[] KWHzl;
    public static final java.lang.String[] OLrzqt;
    public static final java.lang.String[] copydefault;
    public java.lang.String values;
    public boolean DbNXlk = true;
    public boolean AYXKKw = true;
    public boolean valueOf = true;
    public boolean gEmmrt = true;
    public boolean djBIcL = false;
    public boolean isConnected = false;
    public boolean AkhnZx = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.djBIcL || this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59949zse djBIcL() {
        this.isConnected = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.values;
    }

    static {
        java.lang.String[] strArr = {"html", TtmlNode.TAG_HEAD, "body", "frameset", "script", "noscript", TtmlNode.TAG_STYLE, "meta", "link", "title", TypedValues.AttributesType.S_FRAME, "noframes", "section", OtcRouteConst.MAIN_ROUTE_NAV, "aside", "hgroup", "header", "footer", TtmlNode.TAG_P, "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", TtmlNode.TAG_DIV, "blockquote", "hr", WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "figure", "figcaption", "form", "fieldset", "ins", "del", com.ibm.icu.text.DateFormat.SECOND, "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", MimeTypes.BASE_TYPE_VIDEO, MimeTypes.BASE_TYPE_AUDIO, "canvas", "details", "menu", "plaintext"};
        KWHzl = strArr;
        copydefault = new java.lang.String[]{"object", TtmlNode.RUBY_BASE, "font", TtmlNode.TAG_TT, "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", CrashHianalyticsData.TIME, "acronym", "mark", TtmlNode.ATTR_TTS_RUBY, "rt", "rp", IEncryptorType.DEFAULT_ENCRYPTOR, "img", TtmlNode.TAG_BR, "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", TtmlNode.TAG_SPAN, Web3SecurityTrackEvent.VALUE_INPUT, "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", OtcExtraKeys.AREA, "param", "source", "track", "summary", "command", "device"};
        EZpvd = new java.lang.String[]{"meta", "link", TtmlNode.RUBY_BASE, TypedValues.AttributesType.S_FRAME, "img", TtmlNode.TAG_BR, "wbr", "embed", "hr", Web3SecurityTrackEvent.VALUE_INPUT, "keygen", "col", "command", "device"};
        AEQbTJ = new java.lang.String[]{"title", IEncryptorType.DEFAULT_ENCRYPTOR, TtmlNode.TAG_P, "h1", "h2", "h3", "h4", "h5", "h6", "pre", WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "li", "th", "td", "script", TtmlNode.TAG_STYLE, "ins", "del", com.ibm.icu.text.DateFormat.SECOND};
        OLrzqt = new java.lang.String[]{"pre", "plaintext", "title", "textarea"};
        for (int i = 0; i < 59; i++) {
            OLrzqt(new C59949zse(strArr[i]));
        }
        for (java.lang.String str : copydefault) {
            C59949zse c59949zse = new C59949zse(str);
            c59949zse.DbNXlk = false;
            c59949zse.valueOf = false;
            c59949zse.AYXKKw = false;
            OLrzqt(c59949zse);
        }
        for (java.lang.String str2 : EZpvd) {
            C59949zse c59949zse2 = AhwBna.get(str2);
            C59912zrU.KWHzl(c59949zse2);
            c59949zse2.valueOf = false;
            c59949zse2.gEmmrt = false;
            c59949zse2.djBIcL = true;
        }
        for (java.lang.String str3 : AEQbTJ) {
            C59949zse c59949zse3 = AhwBna.get(str3);
            C59912zrU.KWHzl(c59949zse3);
            c59949zse3.AYXKKw = false;
        }
        for (java.lang.String str4 : OLrzqt) {
            C59949zse c59949zse4 = AhwBna.get(str4);
            C59912zrU.KWHzl(c59949zse4);
            c59949zse4.AkhnZx = true;
        }
    }

    public C59949zse(java.lang.String str) {
        this.values = str.toLowerCase();
    }

    public static C59949zse EZpvd(java.lang.String str) {
        C59912zrU.KWHzl((java.lang.Object) str);
        java.util.Map<java.lang.String, C59949zse> map = AhwBna;
        C59949zse c59949zse = map.get(str);
        if (c59949zse != null) {
            return c59949zse;
        }
        java.lang.String lowerCase = str.trim().toLowerCase();
        C59912zrU.copydefault(lowerCase);
        C59949zse c59949zse2 = map.get(lowerCase);
        if (c59949zse2 != null) {
            return c59949zse2;
        }
        C59949zse c59949zse3 = new C59949zse(lowerCase);
        c59949zse3.DbNXlk = false;
        c59949zse3.valueOf = true;
        return c59949zse3;
    }

    public boolean OLrzqt() {
        return AhwBna.containsKey(this.values);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59949zse)) {
            return false;
        }
        C59949zse c59949zse = (C59949zse) obj;
        return this.valueOf == c59949zse.valueOf && this.gEmmrt == c59949zse.gEmmrt && this.djBIcL == c59949zse.djBIcL && this.AYXKKw == c59949zse.AYXKKw && this.DbNXlk == c59949zse.DbNXlk && this.AkhnZx == c59949zse.AkhnZx && this.isConnected == c59949zse.isConnected && this.values.equals(c59949zse.values);
    }

    public int hashCode() {
        return (((((((((((((this.values.hashCode() * 31) + (this.DbNXlk ? 1 : 0)) * 31) + (this.AYXKKw ? 1 : 0)) * 31) + (this.valueOf ? 1 : 0)) * 31) + (this.gEmmrt ? 1 : 0)) * 31) + (this.djBIcL ? 1 : 0)) * 31) + (this.isConnected ? 1 : 0)) * 31) + (this.AkhnZx ? 1 : 0);
    }

    public static void OLrzqt(C59949zse c59949zse) {
        AhwBna.put(c59949zse.values, c59949zse);
    }
}
