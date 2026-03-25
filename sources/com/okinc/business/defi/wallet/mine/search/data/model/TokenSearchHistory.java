package com.okinc.business.defi.wallet.mine.search.data.model;

import com.google.errorprone.annotations.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C59454zhO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SerialName("token")
@Keep
@Serializable
public final class TokenSearchHistory extends SearchHistoryItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final long chainId;
    public final String chainLogoUrl;
    public final String contractAddress;
    public final boolean searchedByContract;
    public final String symbol;
    public final long timestamp;
    public final String tokenLogoUrl;
    public final String tokenName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String AYXKKw() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public long AhwBna() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenSearchHistory KWHzl(@NotNull String str, String str2, long j, String str3, String str4, String str5, boolean z, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TokenSearchHistory(str, str2, j, str3, str4, str5, z, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String KWHzl() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenSearchHistory)) {
            return false;
        }
        TokenSearchHistory tokenSearchHistory = (TokenSearchHistory) obj;
        return Intrinsics.EZpvd((Object) this.symbol, (Object) tokenSearchHistory.symbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) tokenSearchHistory.tokenName) && this.chainId == tokenSearchHistory.chainId && Intrinsics.EZpvd((Object) this.contractAddress, (Object) tokenSearchHistory.contractAddress) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) tokenSearchHistory.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) tokenSearchHistory.chainLogoUrl) && this.searchedByContract == tokenSearchHistory.searchedByContract && this.timestamp == tokenSearchHistory.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.symbol.hashCode();
        String str = this.tokenName;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = Long.hashCode(this.chainId);
        String str2 = this.contractAddress;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tokenLogoUrl;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.chainLogoUrl;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.searchedByContract)) * 31) + Long.hashCode(this.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenSearchHistory(symbol=" + this.symbol + ", tokenName=" + this.tokenName + ", chainId=" + this.chainId + ", contractAddress=" + this.contractAddress + ", tokenLogoUrl=" + this.tokenLogoUrl + ", chainLogoUrl=" + this.chainLogoUrl + ", searchedByContract=" + this.searchedByContract + ", timestamp=" + this.timestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.TokenSearchHistory.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenSearchHistory> serializer() {
            return TokenSearchHistory$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TokenSearchHistory(int i, String str, String str2, long j, String str3, String str4, String str5, boolean z, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (5 != (i & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i, 5, TokenSearchHistory$$serializer.INSTANCE.getDescriptor());
        }
        this.symbol = str;
        if ((i & 2) == 0) {
            this.tokenName = null;
        } else {
            this.tokenName = str2;
        }
        this.chainId = j;
        if ((i & 8) == 0) {
            this.contractAddress = null;
        } else {
            this.contractAddress = str3;
        }
        if ((i & 16) == 0) {
            this.tokenLogoUrl = null;
        } else {
            this.tokenLogoUrl = str4;
        }
        if ((i & 32) == 0) {
            this.chainLogoUrl = null;
        } else {
            this.chainLogoUrl = str5;
        }
        if ((i & 64) == 0) {
            this.searchedByContract = false;
        } else {
            this.searchedByContract = z;
        }
        if ((i & 128) == 0) {
            this.timestamp = System.currentTimeMillis();
        } else {
            this.timestamp = j2;
        }
    }

    public static final /* synthetic */ void KWHzl(TokenSearchHistory tokenSearchHistory, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        SearchHistoryItem.copydefault(tokenSearchHistory, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenSearchHistory.symbol);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tokenSearchHistory.tokenName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tokenSearchHistory.tokenName);
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 2, tokenSearchHistory.chainId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tokenSearchHistory.contractAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, tokenSearchHistory.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tokenSearchHistory.tokenLogoUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, tokenSearchHistory.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tokenSearchHistory.chainLogoUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tokenSearchHistory.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tokenSearchHistory.searchedByContract) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, tokenSearchHistory.searchedByContract);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && tokenSearchHistory.AhwBna() == System.currentTimeMillis()) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 7, tokenSearchHistory.AhwBna());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
  (r15v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (r17v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002c: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0034: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:21)) : (r23v0 long))
 A[MD:(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, boolean, long):void (m)] (LINE:13) call: com.okinc.business.defi.wallet.mine.search.data.model.TokenSearchHistory.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, boolean, long):void type: THIS */
    public /* synthetic */ TokenSearchHistory(String str, String str2, long j, String str3, String str4, String str5, boolean z, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, j, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? false : z, (i & 128) != 0 ? System.currentTimeMillis() : j2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenSearchHistory(@NotNull String str, String str2, long j, String str3, String str4, String str5, boolean z, long j2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
        this.tokenName = str2;
        this.chainId = j;
        this.contractAddress = str3;
        this.tokenLogoUrl = str4;
        this.chainLogoUrl = str5;
        this.searchedByContract = z;
        this.timestamp = j2;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String EZpvd() {
        String str = this.contractAddress;
        if (str != null) {
            if (str.length() >= 11) {
                str = C59454zhO.AkhnZx(str, 6) + "..." + C59454zhO.isConnected(str, 4);
            }
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String valueOf() {
        long j = this.chainId;
        String str = this.contractAddress;
        if (str == null) {
            str = this.symbol;
        }
        return "token_" + j + "_" + str;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public SearchType gEmmrt() {
        return SearchType.TOKEN;
    }
}
