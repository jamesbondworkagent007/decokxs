package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import com.okinc.business.defi.api.model.tx.signdata.EVM5792Call;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.fZM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class AssetDiffModuleModel extends BaseModel<AssetDiffItem> {
    public static final int $stable = 0;

    public AssetDiffModuleModel() {
        super("assetDiff");
    }

    public static final class AssetDiffItem implements fZM {
        public static final int $stable = 8;
        private final List<AssetDiff> assetDiffList;
        private final EVM5792Call eip5792Call;
        private final RiskPopupInfo riskPopupInfo;
        private final String subTitle;
        private final String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.wallet.transaction.moduleModel.bean.AssetDiffModuleModel$AssetDiffItem */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AssetDiffItem copy$default(AssetDiffItem assetDiffItem, String str, String str2, RiskPopupInfo riskPopupInfo, List list, EVM5792Call eVM5792Call, int i, Object obj) {
            if ((i & 1) != 0) {
                str = assetDiffItem.title;
            }
            if ((i & 2) != 0) {
                str2 = assetDiffItem.subTitle;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                riskPopupInfo = assetDiffItem.riskPopupInfo;
            }
            RiskPopupInfo riskPopupInfo2 = riskPopupInfo;
            if ((i & 8) != 0) {
                list = assetDiffItem.assetDiffList;
            }
            List list2 = list;
            if ((i & 16) != 0) {
                eVM5792Call = assetDiffItem.eip5792Call;
            }
            return assetDiffItem.copy(str, str3, riskPopupInfo2, list2, eVM5792Call);
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
        public final List<AssetDiff> component4() {
            return this.assetDiffList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EVM5792Call component5() {
            return this.eip5792Call;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssetDiffItem copy(String str, String str2, RiskPopupInfo riskPopupInfo, @NotNull List<AssetDiff> list, EVM5792Call eVM5792Call) {
            Intrinsics.checkNotNullParameter(list, "");
            return new AssetDiffItem(str, str2, riskPopupInfo, list, eVM5792Call);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssetDiffItem)) {
                return false;
            }
            AssetDiffItem assetDiffItem = (AssetDiffItem) obj;
            return Intrinsics.EZpvd((Object) this.title, (Object) assetDiffItem.title) && Intrinsics.EZpvd((Object) this.subTitle, (Object) assetDiffItem.subTitle) && Intrinsics.EZpvd(this.riskPopupInfo, assetDiffItem.riskPopupInfo) && Intrinsics.EZpvd(this.assetDiffList, assetDiffItem.assetDiffList) && Intrinsics.EZpvd(this.eip5792Call, assetDiffItem.eip5792Call);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<AssetDiff> getAssetDiffList() {
            return this.assetDiffList;
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
        public int hashCode() {
            String str = this.title;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.subTitle;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            RiskPopupInfo riskPopupInfo = this.riskPopupInfo;
            int iHashCode3 = riskPopupInfo == null ? 0 : riskPopupInfo.hashCode();
            int iHashCode4 = this.assetDiffList.hashCode();
            EVM5792Call eVM5792Call = this.eip5792Call;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (eVM5792Call != null ? eVM5792Call.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AssetDiffItem(title=" + this.title + ", subTitle=" + this.subTitle + ", riskPopupInfo=" + this.riskPopupInfo + ", assetDiffList=" + this.assetDiffList + ", eip5792Call=" + this.eip5792Call + ")";
        }

        public AssetDiffItem(String str, String str2, RiskPopupInfo riskPopupInfo, @NotNull List<AssetDiff> list, EVM5792Call eVM5792Call) {
            Intrinsics.checkNotNullParameter(list, "");
            this.title = str;
            this.subTitle = str2;
            this.riskPopupInfo = riskPopupInfo;
            this.assetDiffList = list;
            this.eip5792Call = eVM5792Call;
        }
    }

    public static final class AssetDiff {
        public static final String segmentation = "segmentation";
        private final String title;
        private final List<TokenAssetDifflist> tokenAssetDifflist;
        public static final ActionBar Companion = new ActionBar(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.transaction.moduleModel.bean.AssetDiffModuleModel$AssetDiff */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AssetDiff copy$default(AssetDiff assetDiff, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = assetDiff.title;
            }
            if ((i & 2) != 0) {
                list = assetDiff.tokenAssetDifflist;
            }
            return assetDiff.copy(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<TokenAssetDifflist> component2() {
            return this.tokenAssetDifflist;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssetDiff copy(String str, List<TokenAssetDifflist> list) {
            return new AssetDiff(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssetDiff)) {
                return false;
            }
            AssetDiff assetDiff = (AssetDiff) obj;
            return Intrinsics.EZpvd((Object) this.title, (Object) assetDiff.title) && Intrinsics.EZpvd(this.tokenAssetDifflist, assetDiff.tokenAssetDifflist);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<TokenAssetDifflist> getTokenAssetDifflist() {
            return this.tokenAssetDifflist;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.title;
            int iHashCode = str == null ? 0 : str.hashCode();
            List<TokenAssetDifflist> list = this.tokenAssetDifflist;
            return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AssetDiff(title=" + this.title + ", tokenAssetDifflist=" + this.tokenAssetDifflist + ")";
        }

        public AssetDiff(String str, List<TokenAssetDifflist> list) {
            this.title = str;
            this.tokenAssetDifflist = list;
        }

        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.AssetDiffModuleModel.AssetDiff.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }
        }
    }

    public static final class TokenAssetDifflist {
        public static final int $stable = 8;
        private final String amount;
        private transient String displayAmount;
        private transient String displayCurrency;
        private transient Integer roundedRadius;
        private final TokenInfo tokenInfo;
        private final String type;
        private final String usdAmount;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TokenAssetDifflist copy$default(TokenAssetDifflist tokenAssetDifflist, String str, TokenInfo tokenInfo, String str2, String str3, String str4, String str5, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tokenAssetDifflist.amount;
            }
            if ((i & 2) != 0) {
                tokenInfo = tokenAssetDifflist.tokenInfo;
            }
            TokenInfo tokenInfo2 = tokenInfo;
            if ((i & 4) != 0) {
                str2 = tokenAssetDifflist.type;
            }
            String str6 = str2;
            if ((i & 8) != 0) {
                str3 = tokenAssetDifflist.usdAmount;
            }
            String str7 = str3;
            if ((i & 16) != 0) {
                str4 = tokenAssetDifflist.displayAmount;
            }
            String str8 = str4;
            if ((i & 32) != 0) {
                str5 = tokenAssetDifflist.displayCurrency;
            }
            String str9 = str5;
            if ((i & 64) != 0) {
                num = tokenAssetDifflist.roundedRadius;
            }
            return tokenAssetDifflist.copy(str, tokenInfo2, str6, str7, str8, str9, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenInfo component2() {
            return this.tokenInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.usdAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.displayAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.displayCurrency;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component7() {
            return this.roundedRadius;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenAssetDifflist copy(String str, @NotNull TokenInfo tokenInfo, @NotNull String str2, String str3, String str4, String str5, Integer num) {
            Intrinsics.checkNotNullParameter(tokenInfo, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TokenAssetDifflist(str, tokenInfo, str2, str3, str4, str5, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TokenAssetDifflist)) {
                return false;
            }
            TokenAssetDifflist tokenAssetDifflist = (TokenAssetDifflist) obj;
            return Intrinsics.EZpvd((Object) this.amount, (Object) tokenAssetDifflist.amount) && Intrinsics.EZpvd(this.tokenInfo, tokenAssetDifflist.tokenInfo) && Intrinsics.EZpvd((Object) this.type, (Object) tokenAssetDifflist.type) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) tokenAssetDifflist.usdAmount) && Intrinsics.EZpvd((Object) this.displayAmount, (Object) tokenAssetDifflist.displayAmount) && Intrinsics.EZpvd((Object) this.displayCurrency, (Object) tokenAssetDifflist.displayCurrency) && Intrinsics.EZpvd(this.roundedRadius, tokenAssetDifflist.roundedRadius);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAmount() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDisplayAmount() {
            return this.displayAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDisplayCurrency() {
            return this.displayCurrency;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getRoundedRadius() {
            return this.roundedRadius;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenInfo getTokenInfo() {
            return this.tokenInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUsdAmount() {
            return this.usdAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.amount;
            int iHashCode = str == null ? 0 : str.hashCode();
            int iHashCode2 = this.tokenInfo.hashCode();
            int iHashCode3 = this.type.hashCode();
            String str2 = this.usdAmount;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.displayAmount;
            int iHashCode5 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.displayCurrency;
            int iHashCode6 = str4 == null ? 0 : str4.hashCode();
            Integer num = this.roundedRadius;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDisplayAmount(String str) {
            this.displayAmount = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDisplayCurrency(String str) {
            this.displayCurrency = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setRoundedRadius(Integer num) {
            this.roundedRadius = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TokenAssetDifflist(amount=" + this.amount + ", tokenInfo=" + this.tokenInfo + ", type=" + this.type + ", usdAmount=" + this.usdAmount + ", displayAmount=" + this.displayAmount + ", displayCurrency=" + this.displayCurrency + ", roundedRadius=" + this.roundedRadius + ")";
        }

        public TokenAssetDifflist(String str, @NotNull TokenInfo tokenInfo, @NotNull String str2, String str3, String str4, String str5, Integer num) {
            Intrinsics.checkNotNullParameter(tokenInfo, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.amount = str;
            this.tokenInfo = tokenInfo;
            this.type = str2;
            this.usdAmount = str3;
            this.displayAmount = str4;
            this.displayCurrency = str5;
            this.roundedRadius = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 com.okinc.business.defi.wallet.transaction.moduleModel.bean.AssetDiffModuleModel$TokenInfo)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
 A[MD:(java.lang.String, com.okinc.business.defi.wallet.transaction.moduleModel.bean.AssetDiffModuleModel$TokenInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:353) call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.AssetDiffModuleModel.TokenAssetDifflist.<init>(java.lang.String, com.okinc.business.defi.wallet.transaction.moduleModel.bean.AssetDiffModuleModel$TokenInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
        public /* synthetic */ TokenAssetDifflist(String str, TokenInfo tokenInfo, String str2, String str3, String str4, String str5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, tokenInfo, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num);
        }
    }

    public static final class TokenInfo {
        public static final int $stable = 8;
        private final String address;
        private final int decimals;
        private final transient Object displayImage;
        private transient String displaySymbol;
        private final String imageUrl;
        private final Integer signTokenPrecision;
        private final String symbol;
        private final String tokenId;
        private final transient String tokenTag;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component2() {
            return this.decimals;
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
        public final String component7() {
            return this.tokenTag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object component8() {
            return this.displayImage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.displaySymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenInfo copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, Integer num, String str5, Object obj, String str6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new TokenInfo(str, i, str2, str3, str4, num, str5, obj, str6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TokenInfo)) {
                return false;
            }
            TokenInfo tokenInfo = (TokenInfo) obj;
            return Intrinsics.EZpvd((Object) this.address, (Object) tokenInfo.address) && this.decimals == tokenInfo.decimals && Intrinsics.EZpvd((Object) this.imageUrl, (Object) tokenInfo.imageUrl) && Intrinsics.EZpvd((Object) this.symbol, (Object) tokenInfo.symbol) && Intrinsics.EZpvd((Object) this.tokenId, (Object) tokenInfo.tokenId) && Intrinsics.EZpvd(this.signTokenPrecision, tokenInfo.signTokenPrecision) && Intrinsics.EZpvd((Object) this.tokenTag, (Object) tokenInfo.tokenTag) && Intrinsics.EZpvd(this.displayImage, tokenInfo.displayImage) && Intrinsics.EZpvd((Object) this.displaySymbol, (Object) tokenInfo.displaySymbol);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getDecimals() {
            return this.decimals;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object getDisplayImage() {
            return this.displayImage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDisplaySymbol() {
            return this.displaySymbol;
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
        public final String getTokenTag() {
            return this.tokenTag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.address.hashCode();
            int iHashCode2 = Integer.hashCode(this.decimals);
            int iHashCode3 = this.imageUrl.hashCode();
            int iHashCode4 = this.symbol.hashCode();
            int iHashCode5 = this.tokenId.hashCode();
            Integer num = this.signTokenPrecision;
            int iHashCode6 = num == null ? 0 : num.hashCode();
            String str = this.tokenTag;
            int iHashCode7 = str == null ? 0 : str.hashCode();
            Object obj = this.displayImage;
            int iHashCode8 = obj == null ? 0 : obj.hashCode();
            String str2 = this.displaySymbol;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDisplaySymbol(String str) {
            this.displaySymbol = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TokenInfo(address=" + this.address + ", decimals=" + this.decimals + ", imageUrl=" + this.imageUrl + ", symbol=" + this.symbol + ", tokenId=" + this.tokenId + ", signTokenPrecision=" + this.signTokenPrecision + ", tokenTag=" + this.tokenTag + ", displayImage=" + this.displayImage + ", displaySymbol=" + this.displaySymbol + ")";
        }

        public TokenInfo(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, Integer num, String str5, Object obj, String str6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.address = str;
            this.decimals = i;
            this.imageUrl = str2;
            this.symbol = str3;
            this.tokenId = str4;
            this.signTokenPrecision = num;
            this.tokenTag = str5;
            this.displayImage = obj;
            this.displaySymbol = str6;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 int)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0013: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r21v0 java.lang.Object))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Object, java.lang.String):void (m)] (LINE:366) call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.AssetDiffModuleModel.TokenInfo.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Object, java.lang.String):void type: THIS */
        public /* synthetic */ TokenInfo(String str, int i, String str2, String str3, String str4, Integer num, String str5, Object obj, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, str3, str4, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : obj, (i2 & 256) != 0 ? null : str6);
        }
    }
}
