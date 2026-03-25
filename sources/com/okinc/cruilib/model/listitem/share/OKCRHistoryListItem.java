package com.okinc.cruilib.model.listitem.share;

import com.okinc.cruilib.model.listitem.OKCRListItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class OKCRHistoryListItem extends OKCRListItem {
    public static final int $stable = 0;
    private final String id;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.okinc.cruilib.model.listitem.share.OKCRHistoryListItem.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OKCRHistoryListItem(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.cruilib.model.listitem.OKCRListItem
    public String getId() {
        return this.id;
    }

    public abstract long getTimeStamp();

    public OKCRHistoryListItem(String str) {
        this.id = str;
    }

    public static final class HistoryPairListItem extends OKCRHistoryListItem {
        public static final int $stable = 8;
        private String baseImageUrl;
        private final String baseName;
        private final String instId;
        private String quoteImageUrl;
        private final String quoteName;
        private final long timeStamp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ HistoryPairListItem copy$default(HistoryPairListItem historyPairListItem, String str, String str2, String str3, String str4, String str5, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = historyPairListItem.instId;
            }
            if ((i & 2) != 0) {
                str2 = historyPairListItem.baseName;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = historyPairListItem.quoteName;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = historyPairListItem.baseImageUrl;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = historyPairListItem.quoteImageUrl;
            }
            String str9 = str5;
            if ((i & 32) != 0) {
                j = historyPairListItem.timeStamp;
            }
            return historyPairListItem.copy(str, str6, str7, str8, str9, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.baseName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.quoteName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.baseImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.quoteImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component6() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HistoryPairListItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new HistoryPairListItem(str, str2, str3, str4, str5, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HistoryPairListItem)) {
                return false;
            }
            HistoryPairListItem historyPairListItem = (HistoryPairListItem) obj;
            return Intrinsics.EZpvd((Object) this.instId, (Object) historyPairListItem.instId) && Intrinsics.EZpvd((Object) this.baseName, (Object) historyPairListItem.baseName) && Intrinsics.EZpvd((Object) this.quoteName, (Object) historyPairListItem.quoteName) && Intrinsics.EZpvd((Object) this.baseImageUrl, (Object) historyPairListItem.baseImageUrl) && Intrinsics.EZpvd((Object) this.quoteImageUrl, (Object) historyPairListItem.quoteImageUrl) && this.timeStamp == historyPairListItem.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBaseImageUrl() {
            return this.baseImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBaseName() {
            return this.baseName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInstId() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getQuoteImageUrl() {
            return this.quoteImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getQuoteName() {
            return this.quoteName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.share.OKCRHistoryListItem
        public long getTimeStamp() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.instId.hashCode() * 31) + this.baseName.hashCode()) * 31) + this.quoteName.hashCode()) * 31) + this.baseImageUrl.hashCode()) * 31) + this.quoteImageUrl.hashCode()) * 31) + Long.hashCode(this.timeStamp);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBaseImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.baseImageUrl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setQuoteImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.quoteImageUrl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "HistoryPairListItem(instId=" + this.instId + ", baseName=" + this.baseName + ", quoteName=" + this.quoteName + ", baseImageUrl=" + this.baseImageUrl + ", quoteImageUrl=" + this.quoteImageUrl + ", timeStamp=" + this.timeStamp + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HistoryPairListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.instId = str;
            this.baseName = str2;
            this.quoteName = str3;
            this.baseImageUrl = str4;
            this.quoteImageUrl = str5;
            this.timeStamp = j;
        }
    }

    public static final class HistoryTokenListItem extends OKCRHistoryListItem {
        public static final int $stable = 0;
        private final long timeStamp;
        private final String tokenId;
        private final String tokenImageUrl;
        private final String tokenName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ HistoryTokenListItem copy$default(HistoryTokenListItem historyTokenListItem, String str, String str2, String str3, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = historyTokenListItem.tokenId;
            }
            if ((i & 2) != 0) {
                str2 = historyTokenListItem.tokenName;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                str3 = historyTokenListItem.tokenImageUrl;
            }
            String str5 = str3;
            if ((i & 8) != 0) {
                j = historyTokenListItem.timeStamp;
            }
            return historyTokenListItem.copy(str, str4, str5, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.tokenName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.tokenImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component4() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HistoryTokenListItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new HistoryTokenListItem(str, str2, str3, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HistoryTokenListItem)) {
                return false;
            }
            HistoryTokenListItem historyTokenListItem = (HistoryTokenListItem) obj;
            return Intrinsics.EZpvd((Object) this.tokenId, (Object) historyTokenListItem.tokenId) && Intrinsics.EZpvd((Object) this.tokenName, (Object) historyTokenListItem.tokenName) && Intrinsics.EZpvd((Object) this.tokenImageUrl, (Object) historyTokenListItem.tokenImageUrl) && this.timeStamp == historyTokenListItem.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.share.OKCRHistoryListItem
        public long getTimeStamp() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenImageUrl() {
            return this.tokenImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenName() {
            return this.tokenName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.tokenId.hashCode() * 31) + this.tokenName.hashCode()) * 31) + this.tokenImageUrl.hashCode()) * 31) + Long.hashCode(this.timeStamp);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "HistoryTokenListItem(tokenId=" + this.tokenId + ", tokenName=" + this.tokenName + ", tokenImageUrl=" + this.tokenImageUrl + ", timeStamp=" + this.timeStamp + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HistoryTokenListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, long j) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.tokenId = str;
            this.tokenName = str2;
            this.tokenImageUrl = str3;
            this.timeStamp = j;
        }
    }

    public static final class HistoryBotListItem extends OKCRHistoryListItem {
        public static final int $stable = 0;
        private final String bizType;
        private final String displayId;
        private final String instId;
        private final String strategyToDisplay;
        private final String strategyType;
        private final long timeStamp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ HistoryBotListItem copy$default(HistoryBotListItem historyBotListItem, String str, String str2, String str3, String str4, String str5, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = historyBotListItem.instId;
            }
            if ((i & 2) != 0) {
                str2 = historyBotListItem.displayId;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = historyBotListItem.bizType;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = historyBotListItem.strategyType;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = historyBotListItem.strategyToDisplay;
            }
            String str9 = str5;
            if ((i & 32) != 0) {
                j = historyBotListItem.timeStamp;
            }
            return historyBotListItem.copy(str, str6, str7, str8, str9, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.displayId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.bizType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.strategyType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.strategyToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component6() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HistoryBotListItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new HistoryBotListItem(str, str2, str3, str4, str5, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HistoryBotListItem)) {
                return false;
            }
            HistoryBotListItem historyBotListItem = (HistoryBotListItem) obj;
            return Intrinsics.EZpvd((Object) this.instId, (Object) historyBotListItem.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) historyBotListItem.displayId) && Intrinsics.EZpvd((Object) this.bizType, (Object) historyBotListItem.bizType) && Intrinsics.EZpvd((Object) this.strategyType, (Object) historyBotListItem.strategyType) && Intrinsics.EZpvd((Object) this.strategyToDisplay, (Object) historyBotListItem.strategyToDisplay) && this.timeStamp == historyBotListItem.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBizType() {
            return this.bizType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDisplayId() {
            return this.displayId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInstId() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStrategyToDisplay() {
            return this.strategyToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStrategyType() {
            return this.strategyType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.share.OKCRHistoryListItem
        public long getTimeStamp() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.instId.hashCode() * 31) + this.displayId.hashCode()) * 31) + this.bizType.hashCode()) * 31) + this.strategyType.hashCode()) * 31) + this.strategyToDisplay.hashCode()) * 31) + Long.hashCode(this.timeStamp);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "HistoryBotListItem(instId=" + this.instId + ", displayId=" + this.displayId + ", bizType=" + this.bizType + ", strategyType=" + this.strategyType + ", strategyToDisplay=" + this.strategyToDisplay + ", timeStamp=" + this.timeStamp + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HistoryBotListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.instId = str;
            this.displayId = str2;
            this.bizType = str3;
            this.strategyType = str4;
            this.strategyToDisplay = str5;
            this.timeStamp = j;
        }
    }

    public static final class HistoryTraderListItem extends OKCRHistoryListItem {
        public static final int $stable = 0;
        private final String imageUrl;
        private final String instId;
        private final String jumpParam;
        private final String name;
        private final long timeStamp;
        private final String type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ HistoryTraderListItem copy$default(HistoryTraderListItem historyTraderListItem, String str, String str2, String str3, String str4, String str5, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = historyTraderListItem.instId;
            }
            if ((i & 2) != 0) {
                str2 = historyTraderListItem.name;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = historyTraderListItem.imageUrl;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = historyTraderListItem.type;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = historyTraderListItem.jumpParam;
            }
            String str9 = str5;
            if ((i & 32) != 0) {
                j = historyTraderListItem.timeStamp;
            }
            return historyTraderListItem.copy(str, str6, str7, str8, str9, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.imageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.jumpParam;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component6() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HistoryTraderListItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new HistoryTraderListItem(str, str2, str3, str4, str5, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HistoryTraderListItem)) {
                return false;
            }
            HistoryTraderListItem historyTraderListItem = (HistoryTraderListItem) obj;
            return Intrinsics.EZpvd((Object) this.instId, (Object) historyTraderListItem.instId) && Intrinsics.EZpvd((Object) this.name, (Object) historyTraderListItem.name) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) historyTraderListItem.imageUrl) && Intrinsics.EZpvd((Object) this.type, (Object) historyTraderListItem.type) && Intrinsics.EZpvd((Object) this.jumpParam, (Object) historyTraderListItem.jumpParam) && this.timeStamp == historyTraderListItem.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInstId() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getJumpParam() {
            return this.jumpParam;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getName() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.share.OKCRHistoryListItem
        public long getTimeStamp() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.instId.hashCode() * 31) + this.name.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.type.hashCode()) * 31) + this.jumpParam.hashCode()) * 31) + Long.hashCode(this.timeStamp);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "HistoryTraderListItem(instId=" + this.instId + ", name=" + this.name + ", imageUrl=" + this.imageUrl + ", type=" + this.type + ", jumpParam=" + this.jumpParam + ", timeStamp=" + this.timeStamp + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HistoryTraderListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.instId = str;
            this.name = str2;
            this.imageUrl = str3;
            this.type = str4;
            this.jumpParam = str5;
            this.timeStamp = j;
        }
    }

    public static final class HistoryDexTokenListItem extends OKCRHistoryListItem {
        public static final int $stable = 0;
        private final String chainId;
        private final String chainLogo;
        private final String chainName;
        private final long timeStamp;
        private final String tokenContractAddress;
        private final String tokenId;
        private final String tokenLogo;
        private final String tokenName;
        private final String tokenSymbol;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.tokenName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.tokenLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.tokenSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.tokenContractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.chainName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.chainLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component9() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HistoryDexTokenListItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            return new HistoryDexTokenListItem(str, str2, str3, str4, str5, str6, str7, str8, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HistoryDexTokenListItem)) {
                return false;
            }
            HistoryDexTokenListItem historyDexTokenListItem = (HistoryDexTokenListItem) obj;
            return Intrinsics.EZpvd((Object) this.tokenId, (Object) historyDexTokenListItem.tokenId) && Intrinsics.EZpvd((Object) this.tokenName, (Object) historyDexTokenListItem.tokenName) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) historyDexTokenListItem.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) historyDexTokenListItem.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) historyDexTokenListItem.tokenContractAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) historyDexTokenListItem.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) historyDexTokenListItem.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) historyDexTokenListItem.chainLogo) && this.timeStamp == historyDexTokenListItem.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainLogo() {
            return this.chainLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainName() {
            return this.chainName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.share.OKCRHistoryListItem
        public long getTimeStamp() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenContractAddress() {
            return this.tokenContractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenLogo() {
            return this.tokenLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenName() {
            return this.tokenName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenSymbol() {
            return this.tokenSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((this.tokenId.hashCode() * 31) + this.tokenName.hashCode()) * 31) + this.tokenLogo.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + Long.hashCode(this.timeStamp);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "HistoryDexTokenListItem(tokenId=" + this.tokenId + ", tokenName=" + this.tokenName + ", tokenLogo=" + this.tokenLogo + ", tokenSymbol=" + this.tokenSymbol + ", tokenContractAddress=" + this.tokenContractAddress + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", timeStamp=" + this.timeStamp + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HistoryDexTokenListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, long j) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            this.tokenId = str;
            this.tokenName = str2;
            this.tokenLogo = str3;
            this.tokenSymbol = str4;
            this.tokenContractAddress = str5;
            this.chainId = str6;
            this.chainName = str7;
            this.chainLogo = str8;
            this.timeStamp = j;
        }
    }
}
