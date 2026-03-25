package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import com.okinc.business.defi.api.model.tx.signdata.EVM5792Call;
import kotlin.jvm.internal.Intrinsics;
import o.fZM;

/* JADX INFO: loaded from: classes5.dex */
public final class DefaultTx extends BaseModel<DefaultTxItem> {
    public static final int $stable = 0;

    public DefaultTx() {
        super("defaultTx");
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class DefaultTxItem implements fZM {
        public static final int $stable = EVM5792Call.$stable;
        private final EVM5792Call eip5792Call;
        private final RiskPopupInfo riskPopupInfo;
        private final String subTitle;
        private final String title;
        private final TxInfoItem txInfo;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DefaultTxItem copy$default(DefaultTxItem defaultTxItem, String str, String str2, RiskPopupInfo riskPopupInfo, EVM5792Call eVM5792Call, TxInfoItem txInfoItem, int i, Object obj) {
            if ((i & 1) != 0) {
                str = defaultTxItem.title;
            }
            if ((i & 2) != 0) {
                str2 = defaultTxItem.subTitle;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                riskPopupInfo = defaultTxItem.riskPopupInfo;
            }
            RiskPopupInfo riskPopupInfo2 = riskPopupInfo;
            if ((i & 8) != 0) {
                eVM5792Call = defaultTxItem.eip5792Call;
            }
            EVM5792Call eVM5792Call2 = eVM5792Call;
            if ((i & 16) != 0) {
                txInfoItem = defaultTxItem.txInfo;
            }
            return defaultTxItem.copy(str, str3, riskPopupInfo2, eVM5792Call2, txInfoItem);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.subTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RiskPopupInfo component3() {
            return this.riskPopupInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EVM5792Call component4() {
            return this.eip5792Call;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TxInfoItem component5() {
            return this.txInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DefaultTxItem copy(String str, String str2, RiskPopupInfo riskPopupInfo, EVM5792Call eVM5792Call, TxInfoItem txInfoItem) {
            return new DefaultTxItem(str, str2, riskPopupInfo, eVM5792Call, txInfoItem);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DefaultTxItem)) {
                return false;
            }
            DefaultTxItem defaultTxItem = (DefaultTxItem) obj;
            return Intrinsics.EZpvd((Object) this.title, (Object) defaultTxItem.title) && Intrinsics.EZpvd((Object) this.subTitle, (Object) defaultTxItem.subTitle) && Intrinsics.EZpvd(this.riskPopupInfo, defaultTxItem.riskPopupInfo) && Intrinsics.EZpvd(this.eip5792Call, defaultTxItem.eip5792Call) && Intrinsics.EZpvd(this.txInfo, defaultTxItem.txInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.fZM
        public EVM5792Call getEip5792Call() {
            return this.eip5792Call;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RiskPopupInfo getRiskPopupInfo() {
            return this.riskPopupInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSubTitle() {
            return this.subTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TxInfoItem getTxInfo() {
            return this.txInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.title;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.subTitle;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            RiskPopupInfo riskPopupInfo = this.riskPopupInfo;
            int iHashCode3 = riskPopupInfo == null ? 0 : riskPopupInfo.hashCode();
            EVM5792Call eVM5792Call = this.eip5792Call;
            int iHashCode4 = eVM5792Call == null ? 0 : eVM5792Call.hashCode();
            TxInfoItem txInfoItem = this.txInfo;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (txInfoItem != null ? txInfoItem.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DefaultTxItem(title=" + this.title + ", subTitle=" + this.subTitle + ", riskPopupInfo=" + this.riskPopupInfo + ", eip5792Call=" + this.eip5792Call + ", txInfo=" + this.txInfo + ")";
        }

        public DefaultTxItem(String str, String str2, RiskPopupInfo riskPopupInfo, EVM5792Call eVM5792Call, TxInfoItem txInfoItem) {
            this.title = str;
            this.subTitle = str2;
            this.riskPopupInfo = riskPopupInfo;
            this.eip5792Call = eVM5792Call;
            this.txInfo = txInfoItem;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class TxInfoItem {
        public static final int $stable = 0;
        private final String icon;
        private final String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TxInfoItem copy$default(TxInfoItem txInfoItem, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = txInfoItem.icon;
            }
            if ((i & 2) != 0) {
                str2 = txInfoItem.title;
            }
            return txInfoItem.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TxInfoItem copy(String str, String str2) {
            return new TxInfoItem(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TxInfoItem)) {
                return false;
            }
            TxInfoItem txInfoItem = (TxInfoItem) obj;
            return Intrinsics.EZpvd((Object) this.icon, (Object) txInfoItem.icon) && Intrinsics.EZpvd((Object) this.title, (Object) txInfoItem.title);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.icon;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.title;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TxInfoItem(icon=" + this.icon + ", title=" + this.title + ")";
        }

        public TxInfoItem(String str, String str2) {
            this.icon = str;
            this.title = str2;
        }
    }
}
