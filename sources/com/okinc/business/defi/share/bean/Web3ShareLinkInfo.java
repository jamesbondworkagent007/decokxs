package com.okinc.business.defi.share.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Web3ShareLinkInfo extends Web3ShareBaseInfo {
    private String directShareLink;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirectShareLink() {
        return this.directShareLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirectShareLink(String str) {
        this.directShareLink = str;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.share.bean.Web3ShareLinkInfo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ Web3ShareLinkInfo create$default(Activity activity, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return activity.KWHzl(str);
        }

        public final Web3ShareLinkInfo KWHzl(String str) {
            Web3ShareLinkInfo web3ShareLinkInfo = new Web3ShareLinkInfo();
            web3ShareLinkInfo.setDirectShareLink(str);
            return web3ShareLinkInfo;
        }
    }
}
