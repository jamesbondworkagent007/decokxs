package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class TriggerPrice extends BaseModel<TriggerItem> {
    public static final int $stable = 0;

    public TriggerPrice() {
        super("triggerPrice");
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class TriggerItem {
        public static final int $stable = 0;
        private final String marketCap;
        private final String title;
        private final String usdPrice;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TriggerItem copy$default(TriggerItem triggerItem, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = triggerItem.marketCap;
            }
            if ((i & 2) != 0) {
                str2 = triggerItem.title;
            }
            if ((i & 4) != 0) {
                str3 = triggerItem.usdPrice;
            }
            return triggerItem.copy(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.marketCap;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.usdPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TriggerItem copy(String str, String str2, String str3) {
            return new TriggerItem(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TriggerItem)) {
                return false;
            }
            TriggerItem triggerItem = (TriggerItem) obj;
            return Intrinsics.EZpvd((Object) this.marketCap, (Object) triggerItem.marketCap) && Intrinsics.EZpvd((Object) this.title, (Object) triggerItem.title) && Intrinsics.EZpvd((Object) this.usdPrice, (Object) triggerItem.usdPrice);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMarketCap() {
            return this.marketCap;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUsdPrice() {
            return this.usdPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.marketCap;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.title;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.usdPrice;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TriggerItem(marketCap=" + this.marketCap + ", title=" + this.title + ", usdPrice=" + this.usdPrice + ")";
        }

        public TriggerItem(String str, String str2, String str3) {
            this.marketCap = str;
            this.title = str2;
            this.usdPrice = str3;
        }
    }
}
