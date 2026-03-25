package com.okinc.business.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TokenAggregateData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String avgChange;
    public final String totalMarketCap;
    public final TotalTokensData totalTokens;
    public final String totalTurnover;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenAggregateData() {
        this((String) null, (String) null, (String) null, (TotalTokensData) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenAggregateData copy$default(TokenAggregateData tokenAggregateData, String str, String str2, String str3, TotalTokensData totalTokensData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenAggregateData.avgChange;
        }
        if ((i & 2) != 0) {
            str2 = tokenAggregateData.totalMarketCap;
        }
        if ((i & 4) != 0) {
            str3 = tokenAggregateData.totalTurnover;
        }
        if ((i & 8) != 0) {
            totalTokensData = tokenAggregateData.totalTokens;
        }
        return tokenAggregateData.copydefault(str, str2, str3, totalTokensData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.avgChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.totalTurnover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TotalTokensData KWHzl() {
        return this.totalTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAggregateData copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, TotalTokensData totalTokensData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TokenAggregateData(str, str2, str3, totalTokensData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.totalMarketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenAggregateData)) {
            return false;
        }
        TokenAggregateData tokenAggregateData = (TokenAggregateData) obj;
        return Intrinsics.EZpvd((Object) this.avgChange, (Object) tokenAggregateData.avgChange) && Intrinsics.EZpvd((Object) this.totalMarketCap, (Object) tokenAggregateData.totalMarketCap) && Intrinsics.EZpvd((Object) this.totalTurnover, (Object) tokenAggregateData.totalTurnover) && Intrinsics.EZpvd(this.totalTokens, tokenAggregateData.totalTokens);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.avgChange.hashCode();
        int iHashCode2 = this.totalMarketCap.hashCode();
        int iHashCode3 = this.totalTurnover.hashCode();
        TotalTokensData totalTokensData = this.totalTokens;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (totalTokensData == null ? 0 : totalTokensData.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenAggregateData(avgChange=" + this.avgChange + ", totalMarketCap=" + this.totalMarketCap + ", totalTurnover=" + this.totalTurnover + ", totalTokens=" + this.totalTokens + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.TokenAggregateData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenAggregateData> serializer() {
            return TokenAggregateData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenAggregateData(int i, String str, String str2, String str3, TotalTokensData totalTokensData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.avgChange = "";
        } else {
            this.avgChange = str;
        }
        if ((i & 2) == 0) {
            this.totalMarketCap = "";
        } else {
            this.totalMarketCap = str2;
        }
        if ((i & 4) == 0) {
            this.totalTurnover = "";
        } else {
            this.totalTurnover = str3;
        }
        if ((i & 8) == 0) {
            this.totalTokens = null;
        } else {
            this.totalTokens = totalTokensData;
        }
    }

    public static final /* synthetic */ void copydefault(TokenAggregateData tokenAggregateData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tokenAggregateData.avgChange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenAggregateData.avgChange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tokenAggregateData.totalMarketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenAggregateData.totalMarketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tokenAggregateData.totalTurnover, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenAggregateData.totalTurnover);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && tokenAggregateData.totalTokens == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, TotalTokensData$$serializer.INSTANCE, tokenAggregateData.totalTokens);
    }

    public TokenAggregateData(@NotNull String str, @NotNull String str2, @NotNull String str3, TotalTokensData totalTokensData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.avgChange = str;
        this.totalMarketCap = str2;
        this.totalTurnover = str3;
        this.totalTokens = totalTokensData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:com.okinc.business.market.data.model.TotalTokensData:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.data.model.TotalTokensData) : (r5v0 com.okinc.business.market.data.model.TotalTokensData))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.model.TotalTokensData):void (m)] (LINE:18) call: com.okinc.business.market.data.model.TokenAggregateData.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.model.TotalTokensData):void type: THIS */
    public /* synthetic */ TokenAggregateData(String str, String str2, String str3, TotalTokensData totalTokensData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : totalTokensData);
    }
}
