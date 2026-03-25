package com.okinc.business.market.features.home_token_list.repo;

import com.okinc.business.market.data.model.AdvancedFilterData;
import com.okinc.business.market.data.model.AdvancedFilterData$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class WsExtraParams {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String accountId;
    public final int categoryType;
    public final AdvancedFilterData marketRankingFilter;
    public final int page;
    public final int pageSize;
    public final int totalPage;
    public final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WsExtraParams() {
        this(0, 0, 0, 0, (AdvancedFilterData) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WsExtraParams copy$default(WsExtraParams wsExtraParams, int i, int i2, int i3, int i4, AdvancedFilterData advancedFilterData, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = wsExtraParams.totalPage;
        }
        if ((i5 & 2) != 0) {
            i2 = wsExtraParams.page;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = wsExtraParams.pageSize;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = wsExtraParams.categoryType;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            advancedFilterData = wsExtraParams.marketRankingFilter;
        }
        AdvancedFilterData advancedFilterData2 = advancedFilterData;
        if ((i5 & 32) != 0) {
            str = wsExtraParams.accountId;
        }
        String str3 = str;
        if ((i5 & 64) != 0) {
            str2 = wsExtraParams.walletAddress;
        }
        return wsExtraParams.EZpvd(i, i6, i7, i8, advancedFilterData2, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WsExtraParams EZpvd(int i, int i2, int i3, int i4, AdvancedFilterData advancedFilterData, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new WsExtraParams(i, i2, i3, i4, advancedFilterData, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsExtraParams)) {
            return false;
        }
        WsExtraParams wsExtraParams = (WsExtraParams) obj;
        return this.totalPage == wsExtraParams.totalPage && this.page == wsExtraParams.page && this.pageSize == wsExtraParams.pageSize && this.categoryType == wsExtraParams.categoryType && Intrinsics.EZpvd(this.marketRankingFilter, wsExtraParams.marketRankingFilter) && Intrinsics.EZpvd((Object) this.accountId, (Object) wsExtraParams.accountId) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) wsExtraParams.walletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.totalPage);
        int iHashCode2 = Integer.hashCode(this.page);
        int iHashCode3 = Integer.hashCode(this.pageSize);
        int iHashCode4 = Integer.hashCode(this.categoryType);
        AdvancedFilterData advancedFilterData = this.marketRankingFilter;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (advancedFilterData == null ? 0 : advancedFilterData.hashCode())) * 31) + this.accountId.hashCode()) * 31) + this.walletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WsExtraParams(totalPage=" + this.totalPage + ", page=" + this.page + ", pageSize=" + this.pageSize + ", categoryType=" + this.categoryType + ", marketRankingFilter=" + this.marketRankingFilter + ", accountId=" + this.accountId + ", walletAddress=" + this.walletAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.home_token_list.repo.WsExtraParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WsExtraParams> serializer() {
            return WsExtraParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WsExtraParams(int i, int i2, int i3, int i4, int i5, AdvancedFilterData advancedFilterData, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.totalPage = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.page = 1;
        } else {
            this.page = i3;
        }
        if ((i & 4) == 0) {
            this.pageSize = 200;
        } else {
            this.pageSize = i4;
        }
        if ((i & 8) == 0) {
            this.categoryType = 4;
        } else {
            this.categoryType = i5;
        }
        if ((i & 16) == 0) {
            this.marketRankingFilter = null;
        } else {
            this.marketRankingFilter = advancedFilterData;
        }
        if ((i & 32) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str;
        }
        if ((i & 64) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str2;
        }
    }

    public static final /* synthetic */ void copydefault(WsExtraParams wsExtraParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || wsExtraParams.totalPage != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, wsExtraParams.totalPage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || wsExtraParams.page != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, wsExtraParams.page);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || wsExtraParams.pageSize != 200) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, wsExtraParams.pageSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || wsExtraParams.categoryType != 4) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, wsExtraParams.categoryType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || wsExtraParams.marketRankingFilter != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, AdvancedFilterData$$serializer.INSTANCE, wsExtraParams.marketRankingFilter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) wsExtraParams.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, wsExtraParams.accountId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) wsExtraParams.walletAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, wsExtraParams.walletAddress);
    }

    public WsExtraParams(int i, int i2, int i3, int i4, AdvancedFilterData advancedFilterData, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.totalPage = i;
        this.page = i2;
        this.pageSize = i3;
        this.categoryType = i4;
        this.marketRankingFilter = advancedFilterData;
        this.accountId = str;
        this.walletAddress = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:int:0x000a: TERNARY null = ((wrap:int:0x0005: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r7v0 int))
  (wrap:int:0x0011: TERNARY null = ((wrap:int:0x000b: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (200 int) : (r8v0 int))
  (wrap:int:0x0017: TERNARY null = ((wrap:int:0x0012: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (4 int) : (r9v0 int))
  (wrap:com.okinc.business.market.data.model.AdvancedFilterData:0x001d: TERNARY null = ((wrap:int:0x0018: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.data.model.AdvancedFilterData) : (r10v0 com.okinc.business.market.data.model.AdvancedFilterData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(int, int, int, int, com.okinc.business.market.data.model.AdvancedFilterData, java.lang.String, java.lang.String):void (m)] (LINE:43) call: com.okinc.business.market.features.home_token_list.repo.WsExtraParams.<init>(int, int, int, int, com.okinc.business.market.data.model.AdvancedFilterData, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WsExtraParams(int i, int i2, int i3, int i4, AdvancedFilterData advancedFilterData, String str, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 1 : i2, (i5 & 4) != 0 ? 200 : i3, (i5 & 8) != 0 ? 4 : i4, (i5 & 16) != 0 ? null : advancedFilterData, (i5 & 32) != 0 ? "" : str, (i5 & 64) != 0 ? "" : str2);
    }
}
