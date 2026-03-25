package com.okinc.business.defi.biz.walletconnect;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C33070mpX;

/* JADX INFO: loaded from: classes4.dex */
public final class WCSessionMeta {
    public static final int $stable = 8;
    private String description;
    private List<String> icons;
    private String name;
    private String pairingTopic;
    private String topic;
    private String url;
    private String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WCSessionMeta() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component4() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.defi.biz.walletconnect.WCSessionMeta */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WCSessionMeta copy$default(WCSessionMeta wCSessionMeta, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wCSessionMeta.walletId;
        }
        if ((i & 2) != 0) {
            str2 = wCSessionMeta.pairingTopic;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = wCSessionMeta.topic;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = wCSessionMeta.name;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = wCSessionMeta.url;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = wCSessionMeta.description;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            list = wCSessionMeta.icons;
        }
        return wCSessionMeta.copy(str, str7, str8, str9, str10, str11, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pairingTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WCSessionMeta copy(String str, String str2, String str3, String str4, String str5, String str6, List<String> list) {
        return new WCSessionMeta(str, str2, str3, str4, str5, str6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCSessionMeta)) {
            return false;
        }
        WCSessionMeta wCSessionMeta = (WCSessionMeta) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) wCSessionMeta.walletId) && Intrinsics.EZpvd((Object) this.pairingTopic, (Object) wCSessionMeta.pairingTopic) && Intrinsics.EZpvd((Object) this.topic, (Object) wCSessionMeta.topic) && Intrinsics.EZpvd((Object) this.name, (Object) wCSessionMeta.name) && Intrinsics.EZpvd((Object) this.url, (Object) wCSessionMeta.url) && Intrinsics.EZpvd((Object) this.description, (Object) wCSessionMeta.description) && Intrinsics.EZpvd(this.icons, wCSessionMeta.icons);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getIcons() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPairingTopic() {
        return this.pairingTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.walletId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.pairingTopic;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.topic;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.name;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.url;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.description;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        List<String> list = this.icons;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDescription(String str) {
        this.description = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcons(List<String> list) {
        this.icons = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPairingTopic(String str) {
        this.pairingTopic = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopic(String str) {
        this.topic = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(String str) {
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletId(String str) {
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WCSessionMeta(walletId=" + this.walletId + ", pairingTopic=" + this.pairingTopic + ", topic=" + this.topic + ", name=" + this.name + ", url=" + this.url + ", description=" + this.description + ", icons=" + this.icons + ")";
    }

    public WCSessionMeta(String str, String str2, String str3, String str4, String str5, String str6, List<String> list) {
        this.walletId = str;
        this.pairingTopic = str2;
        this.topic = str3;
        this.name = str4;
        this.url = str5;
        this.description = str6;
        this.icons = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002c: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:59) call: com.okinc.business.defi.biz.walletconnect.WCSessionMeta.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ WCSessionMeta(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : list);
    }

    public final String getProjectName() {
        String str = this.name;
        if (str != null) {
            if (!(!StringsKt__StringsKt.fARcdN((CharSequence) str))) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.getSubtitle);
    }
}
