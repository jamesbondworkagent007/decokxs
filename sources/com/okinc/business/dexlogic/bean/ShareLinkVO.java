package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ShareLinkVO {
    public static final int $stable = 0;
    private final String deeplink;
    private final String webUrl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ShareLinkVO() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ShareLinkVO copy$default(ShareLinkVO shareLinkVO, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareLinkVO.deeplink;
        }
        if ((i & 2) != 0) {
            str2 = shareLinkVO.webUrl;
        }
        return shareLinkVO.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.webUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareLinkVO copy(String str, String str2) {
        return new ShareLinkVO(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareLinkVO)) {
            return false;
        }
        ShareLinkVO shareLinkVO = (ShareLinkVO) obj;
        return Intrinsics.EZpvd((Object) this.deeplink, (Object) shareLinkVO.deeplink) && Intrinsics.EZpvd((Object) this.webUrl, (Object) shareLinkVO.webUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWebUrl() {
        return this.webUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.deeplink;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.webUrl;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShareLinkVO(deeplink=" + this.deeplink + ", webUrl=" + this.webUrl + ")";
    }

    public ShareLinkVO(String str, String str2) {
        this.deeplink = str;
        this.webUrl = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:47) call: com.okinc.business.dexlogic.bean.ShareLinkVO.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ShareLinkVO(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
