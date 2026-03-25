package com.okinc.business.defi.wallet.mine.search.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchExtraInfo {
    public static final int $stable = 0;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int DISCOVER_SEARCH_TYPE_URL = 3;
    private final Integer discoverSearchType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletSearchExtraInfo copy$default(WalletSearchExtraInfo walletSearchExtraInfo, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = walletSearchExtraInfo.discoverSearchType;
        }
        return walletSearchExtraInfo.copy(num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.discoverSearchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSearchExtraInfo copy(Integer num) {
        return new WalletSearchExtraInfo(num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WalletSearchExtraInfo) && Intrinsics.EZpvd(this.discoverSearchType, ((WalletSearchExtraInfo) obj).discoverSearchType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDiscoverSearchType() {
        return this.discoverSearchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.discoverSearchType;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletSearchExtraInfo(discoverSearchType=" + this.discoverSearchType + ")";
    }

    public WalletSearchExtraInfo(Integer num) {
        this.discoverSearchType = num;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchExtraInfo.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final boolean isSearchTypeUrl() {
        Integer num = this.discoverSearchType;
        return num != null && num.intValue() == 3;
    }
}
