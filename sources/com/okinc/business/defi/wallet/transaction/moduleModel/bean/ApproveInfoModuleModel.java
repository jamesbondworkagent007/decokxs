package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import com.okinc.business.defi.api.model.tx.signdata.EVM5792Call;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.fZM;

/* JADX INFO: loaded from: classes5.dex */
public final class ApproveInfoModuleModel extends BaseModel<ApproveInfoItem> {
    public static final int $stable = 0;

    public ApproveInfoModuleModel() {
        super("approveInfo");
    }

    public static final class ApproveInfoItem implements fZM {
        public static final int $stable = 8;
        private final List<ApproveInfoListItem> approveInfoList;
        private final EVM5792Call eip5792Call;
        private final RiskPopupInfo riskPopupInfo;
        private final String subTitle;
        private final String title;
        private final TitleModuleModel txTitle;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel$ApproveInfoItem */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApproveInfoItem copy$default(ApproveInfoItem approveInfoItem, String str, String str2, RiskPopupInfo riskPopupInfo, List list, EVM5792Call eVM5792Call, TitleModuleModel titleModuleModel, int i, Object obj) {
            if ((i & 1) != 0) {
                str = approveInfoItem.title;
            }
            if ((i & 2) != 0) {
                str2 = approveInfoItem.subTitle;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                riskPopupInfo = approveInfoItem.riskPopupInfo;
            }
            RiskPopupInfo riskPopupInfo2 = riskPopupInfo;
            if ((i & 8) != 0) {
                list = approveInfoItem.approveInfoList;
            }
            List list2 = list;
            if ((i & 16) != 0) {
                eVM5792Call = approveInfoItem.eip5792Call;
            }
            EVM5792Call eVM5792Call2 = eVM5792Call;
            if ((i & 32) != 0) {
                titleModuleModel = approveInfoItem.txTitle;
            }
            return approveInfoItem.copy(str, str3, riskPopupInfo2, list2, eVM5792Call2, titleModuleModel);
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
        public final List<ApproveInfoListItem> component4() {
            return this.approveInfoList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EVM5792Call component5() {
            return this.eip5792Call;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TitleModuleModel component6() {
            return this.txTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ApproveInfoItem copy(String str, String str2, RiskPopupInfo riskPopupInfo, List<ApproveInfoListItem> list, EVM5792Call eVM5792Call, TitleModuleModel titleModuleModel) {
            return new ApproveInfoItem(str, str2, riskPopupInfo, list, eVM5792Call, titleModuleModel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApproveInfoItem)) {
                return false;
            }
            ApproveInfoItem approveInfoItem = (ApproveInfoItem) obj;
            return Intrinsics.EZpvd((Object) this.title, (Object) approveInfoItem.title) && Intrinsics.EZpvd((Object) this.subTitle, (Object) approveInfoItem.subTitle) && Intrinsics.EZpvd(this.riskPopupInfo, approveInfoItem.riskPopupInfo) && Intrinsics.EZpvd(this.approveInfoList, approveInfoItem.approveInfoList) && Intrinsics.EZpvd(this.eip5792Call, approveInfoItem.eip5792Call) && Intrinsics.EZpvd(this.txTitle, approveInfoItem.txTitle);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<ApproveInfoListItem> getApproveInfoList() {
            return this.approveInfoList;
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
        public final TitleModuleModel getTxTitle() {
            return this.txTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.title;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.subTitle;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            RiskPopupInfo riskPopupInfo = this.riskPopupInfo;
            int iHashCode3 = riskPopupInfo == null ? 0 : riskPopupInfo.hashCode();
            List<ApproveInfoListItem> list = this.approveInfoList;
            int iHashCode4 = list == null ? 0 : list.hashCode();
            EVM5792Call eVM5792Call = this.eip5792Call;
            int iHashCode5 = eVM5792Call == null ? 0 : eVM5792Call.hashCode();
            TitleModuleModel titleModuleModel = this.txTitle;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (titleModuleModel != null ? titleModuleModel.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ApproveInfoItem(title=" + this.title + ", subTitle=" + this.subTitle + ", riskPopupInfo=" + this.riskPopupInfo + ", approveInfoList=" + this.approveInfoList + ", eip5792Call=" + this.eip5792Call + ", txTitle=" + this.txTitle + ")";
        }

        public ApproveInfoItem(String str, String str2, RiskPopupInfo riskPopupInfo, List<ApproveInfoListItem> list, EVM5792Call eVM5792Call, TitleModuleModel titleModuleModel) {
            this.title = str;
            this.subTitle = str2;
            this.riskPopupInfo = riskPopupInfo;
            this.approveInfoList = list;
            this.eip5792Call = eVM5792Call;
            this.txTitle = titleModuleModel;
        }
    }

    public static final class ApproveInfoListItem {
        public static final int $stable = 8;
        private String amount;
        private final AuthQuantity authQuantity;
        private transient String displayAmount;
        private transient EVM5792Call eip5792Call;
        private final String expiration;
        private final Spender spender;
        private final TxInfoItem tokenInfo;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ApproveInfoListItem copy$default(ApproveInfoListItem approveInfoListItem, String str, String str2, TxInfoItem txInfoItem, Spender spender, AuthQuantity authQuantity, EVM5792Call eVM5792Call, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = approveInfoListItem.amount;
            }
            if ((i & 2) != 0) {
                str2 = approveInfoListItem.expiration;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                txInfoItem = approveInfoListItem.tokenInfo;
            }
            TxInfoItem txInfoItem2 = txInfoItem;
            if ((i & 8) != 0) {
                spender = approveInfoListItem.spender;
            }
            Spender spender2 = spender;
            if ((i & 16) != 0) {
                authQuantity = approveInfoListItem.authQuantity;
            }
            AuthQuantity authQuantity2 = authQuantity;
            if ((i & 32) != 0) {
                eVM5792Call = approveInfoListItem.eip5792Call;
            }
            EVM5792Call eVM5792Call2 = eVM5792Call;
            if ((i & 64) != 0) {
                str3 = approveInfoListItem.displayAmount;
            }
            return approveInfoListItem.copy(str, str4, txInfoItem2, spender2, authQuantity2, eVM5792Call2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.expiration;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TxInfoItem component3() {
            return this.tokenInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Spender component4() {
            return this.spender;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthQuantity component5() {
            return this.authQuantity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EVM5792Call component6() {
            return this.eip5792Call;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.displayAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ApproveInfoListItem copy(String str, String str2, TxInfoItem txInfoItem, Spender spender, AuthQuantity authQuantity, EVM5792Call eVM5792Call, String str3) {
            return new ApproveInfoListItem(str, str2, txInfoItem, spender, authQuantity, eVM5792Call, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApproveInfoListItem)) {
                return false;
            }
            ApproveInfoListItem approveInfoListItem = (ApproveInfoListItem) obj;
            return Intrinsics.EZpvd((Object) this.amount, (Object) approveInfoListItem.amount) && Intrinsics.EZpvd((Object) this.expiration, (Object) approveInfoListItem.expiration) && Intrinsics.EZpvd(this.tokenInfo, approveInfoListItem.tokenInfo) && Intrinsics.EZpvd(this.spender, approveInfoListItem.spender) && Intrinsics.EZpvd(this.authQuantity, approveInfoListItem.authQuantity) && Intrinsics.EZpvd(this.eip5792Call, approveInfoListItem.eip5792Call) && Intrinsics.EZpvd((Object) this.displayAmount, (Object) approveInfoListItem.displayAmount);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAmount() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthQuantity getAuthQuantity() {
            return this.authQuantity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDisplayAmount() {
            return this.displayAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EVM5792Call getEip5792Call() {
            return this.eip5792Call;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getExpiration() {
            return this.expiration;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Spender getSpender() {
            return this.spender;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TxInfoItem getTokenInfo() {
            return this.tokenInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.amount;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.expiration;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            TxInfoItem txInfoItem = this.tokenInfo;
            int iHashCode3 = txInfoItem == null ? 0 : txInfoItem.hashCode();
            Spender spender = this.spender;
            int iHashCode4 = spender == null ? 0 : spender.hashCode();
            AuthQuantity authQuantity = this.authQuantity;
            int iHashCode5 = authQuantity == null ? 0 : authQuantity.hashCode();
            EVM5792Call eVM5792Call = this.eip5792Call;
            int iHashCode6 = eVM5792Call == null ? 0 : eVM5792Call.hashCode();
            String str3 = this.displayAmount;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAmount(String str) {
            this.amount = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDisplayAmount(String str) {
            this.displayAmount = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setEip5792Call(EVM5792Call eVM5792Call) {
            this.eip5792Call = eVM5792Call;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ApproveInfoListItem(amount=" + this.amount + ", expiration=" + this.expiration + ", tokenInfo=" + this.tokenInfo + ", spender=" + this.spender + ", authQuantity=" + this.authQuantity + ", eip5792Call=" + this.eip5792Call + ", displayAmount=" + this.displayAmount + ")";
        }

        public ApproveInfoListItem(String str, String str2, TxInfoItem txInfoItem, Spender spender, AuthQuantity authQuantity, EVM5792Call eVM5792Call, String str3) {
            this.amount = str;
            this.expiration = str2;
            this.tokenInfo = txInfoItem;
            this.spender = spender;
            this.authQuantity = authQuantity;
            this.eip5792Call = eVM5792Call;
            this.displayAmount = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel$TxInfoItem)
  (r14v0 com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel$Spender)
  (r15v0 com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel$AuthQuantity)
  (wrap:com.okinc.business.defi.api.model.tx.signdata.EVM5792Call:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.model.tx.signdata.EVM5792Call) : (r16v0 com.okinc.business.defi.api.model.tx.signdata.EVM5792Call))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel$TxInfoItem, com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel$Spender, com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel$AuthQuantity, com.okinc.business.defi.api.model.tx.signdata.EVM5792Call, java.lang.String):void (m)] (LINE:294) call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel.ApproveInfoListItem.<init>(java.lang.String, java.lang.String, com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel$TxInfoItem, com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel$Spender, com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel$AuthQuantity, com.okinc.business.defi.api.model.tx.signdata.EVM5792Call, java.lang.String):void type: THIS */
        public /* synthetic */ ApproveInfoListItem(String str, String str2, TxInfoItem txInfoItem, Spender spender, AuthQuantity authQuantity, EVM5792Call eVM5792Call, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, txInfoItem, spender, authQuantity, (i & 32) != 0 ? null : eVM5792Call, (i & 64) != 0 ? null : str3);
        }
    }

    public static final class AuthQuantity {
        public static final int $stable = 0;
        private final Boolean autoEdit;
        private final Boolean canEdit;
        private final String defaultAmount;
        private final String warnTip;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AuthQuantity copy$default(AuthQuantity authQuantity, Boolean bool, Boolean bool2, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = authQuantity.canEdit;
            }
            if ((i & 2) != 0) {
                bool2 = authQuantity.autoEdit;
            }
            if ((i & 4) != 0) {
                str = authQuantity.defaultAmount;
            }
            if ((i & 8) != 0) {
                str2 = authQuantity.warnTip;
            }
            return authQuantity.copy(bool, bool2, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component1() {
            return this.canEdit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component2() {
            return this.autoEdit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.defaultAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.warnTip;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthQuantity copy(Boolean bool, Boolean bool2, String str, String str2) {
            return new AuthQuantity(bool, bool2, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AuthQuantity)) {
                return false;
            }
            AuthQuantity authQuantity = (AuthQuantity) obj;
            return Intrinsics.EZpvd(this.canEdit, authQuantity.canEdit) && Intrinsics.EZpvd(this.autoEdit, authQuantity.autoEdit) && Intrinsics.EZpvd((Object) this.defaultAmount, (Object) authQuantity.defaultAmount) && Intrinsics.EZpvd((Object) this.warnTip, (Object) authQuantity.warnTip);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getAutoEdit() {
            return this.autoEdit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getCanEdit() {
            return this.canEdit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDefaultAmount() {
            return this.defaultAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getWarnTip() {
            return this.warnTip;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Boolean bool = this.canEdit;
            int iHashCode = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.autoEdit;
            int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
            String str = this.defaultAmount;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.warnTip;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AuthQuantity(canEdit=" + this.canEdit + ", autoEdit=" + this.autoEdit + ", defaultAmount=" + this.defaultAmount + ", warnTip=" + this.warnTip + ")";
        }

        public AuthQuantity(Boolean bool, Boolean bool2, String str, String str2) {
            this.canEdit = bool;
            this.autoEdit = bool2;
            this.defaultAmount = str;
            this.warnTip = str2;
        }
    }

    public static final class Spender {
        public static final int $stable = 0;
        private final String address;
        private final Integer approvalType;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Spender copy$default(Spender spender, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = spender.address;
            }
            if ((i & 2) != 0) {
                num = spender.approvalType;
            }
            return spender.copy(str, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component2() {
            return this.approvalType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Spender copy(String str, Integer num) {
            return new Spender(str, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Spender)) {
                return false;
            }
            Spender spender = (Spender) obj;
            return Intrinsics.EZpvd((Object) this.address, (Object) spender.address) && Intrinsics.EZpvd(this.approvalType, spender.approvalType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getApprovalType() {
            return this.approvalType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.address;
            int iHashCode = str == null ? 0 : str.hashCode();
            Integer num = this.approvalType;
            return (iHashCode * 31) + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Spender(address=" + this.address + ", approvalType=" + this.approvalType + ")";
        }

        public Spender(String str, Integer num) {
            this.address = str;
            this.approvalType = num;
        }
    }

    public static final class TxInfoItem {
        public static final int $stable = 0;
        private final String address;
        private final Integer decimals;
        private final String imageUrl;
        private final Integer signTokenPrecision;
        private final String symbol;
        private final String tokenId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TxInfoItem copy$default(TxInfoItem txInfoItem, Integer num, String str, String str2, String str3, String str4, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = txInfoItem.decimals;
            }
            if ((i & 2) != 0) {
                str = txInfoItem.address;
            }
            String str5 = str;
            if ((i & 4) != 0) {
                str2 = txInfoItem.imageUrl;
            }
            String str6 = str2;
            if ((i & 8) != 0) {
                str3 = txInfoItem.symbol;
            }
            String str7 = str3;
            if ((i & 16) != 0) {
                str4 = txInfoItem.tokenId;
            }
            String str8 = str4;
            if ((i & 32) != 0) {
                num2 = txInfoItem.signTokenPrecision;
            }
            return txInfoItem.copy(num, str5, str6, str7, str8, num2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component1() {
            return this.decimals;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.imageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.symbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component6() {
            return this.signTokenPrecision;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TxInfoItem copy(Integer num, String str, String str2, String str3, String str4, Integer num2) {
            return new TxInfoItem(num, str, str2, str3, str4, num2);
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
            return Intrinsics.EZpvd(this.decimals, txInfoItem.decimals) && Intrinsics.EZpvd((Object) this.address, (Object) txInfoItem.address) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) txInfoItem.imageUrl) && Intrinsics.EZpvd((Object) this.symbol, (Object) txInfoItem.symbol) && Intrinsics.EZpvd((Object) this.tokenId, (Object) txInfoItem.tokenId) && Intrinsics.EZpvd(this.signTokenPrecision, txInfoItem.signTokenPrecision);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getDecimals() {
            return this.decimals;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getSignTokenPrecision() {
            return this.signTokenPrecision;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSymbol() {
            return this.symbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.decimals;
            int iHashCode = num == null ? 0 : num.hashCode();
            String str = this.address;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.imageUrl;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.symbol;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.tokenId;
            int iHashCode5 = str4 == null ? 0 : str4.hashCode();
            Integer num2 = this.signTokenPrecision;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TxInfoItem(decimals=" + this.decimals + ", address=" + this.address + ", imageUrl=" + this.imageUrl + ", symbol=" + this.symbol + ", tokenId=" + this.tokenId + ", signTokenPrecision=" + this.signTokenPrecision + ")";
        }

        public TxInfoItem(Integer num, String str, String str2, String str3, String str4, Integer num2) {
            this.decimals = num;
            this.address = str;
            this.imageUrl = str2;
            this.symbol = str3;
            this.tokenId = str4;
            this.signTokenPrecision = num2;
        }
    }
}
