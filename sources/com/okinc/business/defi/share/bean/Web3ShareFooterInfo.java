package com.okinc.business.defi.share.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class Web3ShareFooterInfo {
    private final String footQRCode;
    private final CharSequence footSubTitle;
    private final CharSequence footTitle;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Web3ShareFooterInfo copy$default(Web3ShareFooterInfo web3ShareFooterInfo, CharSequence charSequence, CharSequence charSequence2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = web3ShareFooterInfo.footTitle;
        }
        if ((i & 2) != 0) {
            charSequence2 = web3ShareFooterInfo.footSubTitle;
        }
        if ((i & 4) != 0) {
            str = web3ShareFooterInfo.footQRCode;
        }
        return web3ShareFooterInfo.copy(charSequence, charSequence2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component1() {
        return this.footTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component2() {
        return this.footSubTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.footQRCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3ShareFooterInfo copy(CharSequence charSequence, CharSequence charSequence2, String str) {
        return new Web3ShareFooterInfo(charSequence, charSequence2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Web3ShareFooterInfo)) {
            return false;
        }
        Web3ShareFooterInfo web3ShareFooterInfo = (Web3ShareFooterInfo) obj;
        return Intrinsics.EZpvd(this.footTitle, web3ShareFooterInfo.footTitle) && Intrinsics.EZpvd(this.footSubTitle, web3ShareFooterInfo.footSubTitle) && Intrinsics.EZpvd((Object) this.footQRCode, (Object) web3ShareFooterInfo.footQRCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFootQRCode() {
        return this.footQRCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getFootSubTitle() {
        return this.footSubTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getFootTitle() {
        return this.footTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        CharSequence charSequence = this.footTitle;
        int iHashCode = charSequence == null ? 0 : charSequence.hashCode();
        CharSequence charSequence2 = this.footSubTitle;
        int iHashCode2 = charSequence2 == null ? 0 : charSequence2.hashCode();
        String str = this.footQRCode;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        CharSequence charSequence = this.footTitle;
        CharSequence charSequence2 = this.footSubTitle;
        return "Web3ShareFooterInfo(footTitle=" + ((Object) charSequence) + ", footSubTitle=" + ((Object) charSequence2) + ", footQRCode=" + this.footQRCode + ")";
    }

    public Web3ShareFooterInfo(CharSequence charSequence, CharSequence charSequence2, String str) {
        this.footTitle = charSequence;
        this.footSubTitle = charSequence2;
        this.footQRCode = str;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.share.bean.Web3ShareFooterInfo.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ Web3ShareFooterInfo create$default(Application application, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            return application.copydefault(str, str2);
        }

        public final Web3ShareFooterInfo copydefault(String str, String str2) {
            return new Web3ShareFooterInfo(str, str2, null);
        }
    }
}
