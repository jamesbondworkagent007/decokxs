package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class NetworkFeeModuleModel extends BaseModel<NetworkFeeItem> {
    public static final int $stable = 0;

    public NetworkFeeModuleModel() {
        super("networkFee");
    }

    public static final class NetworkFeeItem {
        public static final int $stable = 8;
        private transient String feeValue;
        private final Boolean showFee;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public NetworkFeeItem() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ NetworkFeeItem copy$default(NetworkFeeItem networkFeeItem, Boolean bool, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = networkFeeItem.showFee;
            }
            if ((i & 2) != 0) {
                str = networkFeeItem.feeValue;
            }
            return networkFeeItem.copy(bool, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component1() {
            return this.showFee;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.feeValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkFeeItem copy(Boolean bool, String str) {
            return new NetworkFeeItem(bool, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkFeeItem)) {
                return false;
            }
            NetworkFeeItem networkFeeItem = (NetworkFeeItem) obj;
            return Intrinsics.EZpvd(this.showFee, networkFeeItem.showFee) && Intrinsics.EZpvd((Object) this.feeValue, (Object) networkFeeItem.feeValue);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFeeValue() {
            return this.feeValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getShowFee() {
            return this.showFee;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Boolean bool = this.showFee;
            int iHashCode = bool == null ? 0 : bool.hashCode();
            String str = this.feeValue;
            return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFeeValue(String str) {
            this.feeValue = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "NetworkFeeItem(showFee=" + this.showFee + ", feeValue=" + this.feeValue + ")";
        }

        public NetworkFeeItem(Boolean bool, String str) {
            this.showFee = bool;
            this.feeValue = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r1v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.String):void (m)] (LINE:227) call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.NetworkFeeModuleModel.NetworkFeeItem.<init>(java.lang.Boolean, java.lang.String):void type: THIS */
        public /* synthetic */ NetworkFeeItem(Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : str);
        }
    }
}
