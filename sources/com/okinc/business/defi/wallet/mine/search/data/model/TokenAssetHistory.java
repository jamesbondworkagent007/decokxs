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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SerialName("asset_token")
@Keep
@Serializable
public final class TokenAssetHistory extends SearchHistoryItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String chainLogoUrl;
    public final String displayName;
    public final long generalChainId;
    public final String iconUrl;
    public final String metaId;
    public final String symbol;
    public final long timestamp;
    public final String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String AYXKKw() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public long AhwBna() {
        return this.timestamp;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String EZpvd() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String KWHzl() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAssetHistory OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, String str5, String str6, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new TokenAssetHistory(str, str2, str3, j, str4, str5, str6, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.metaId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenAssetHistory)) {
            return false;
        }
        TokenAssetHistory tokenAssetHistory = (TokenAssetHistory) obj;
        return Intrinsics.EZpvd((Object) this.metaId, (Object) tokenAssetHistory.metaId) && Intrinsics.EZpvd((Object) this.symbol, (Object) tokenAssetHistory.symbol) && Intrinsics.EZpvd((Object) this.walletId, (Object) tokenAssetHistory.walletId) && this.generalChainId == tokenAssetHistory.generalChainId && Intrinsics.EZpvd((Object) this.displayName, (Object) tokenAssetHistory.displayName) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) tokenAssetHistory.iconUrl) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) tokenAssetHistory.chainLogoUrl) && this.timestamp == tokenAssetHistory.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.metaId.hashCode();
        int iHashCode2 = this.symbol.hashCode();
        int iHashCode3 = this.walletId.hashCode();
        int iHashCode4 = Long.hashCode(this.generalChainId);
        int iHashCode5 = this.displayName.hashCode();
        String str = this.iconUrl;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.chainLogoUrl;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenAssetHistory(metaId=" + this.metaId + ", symbol=" + this.symbol + ", walletId=" + this.walletId + ", generalChainId=" + this.generalChainId + ", displayName=" + this.displayName + ", iconUrl=" + this.iconUrl + ", chainLogoUrl=" + this.chainLogoUrl + ", timestamp=" + this.timestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.TokenAssetHistory.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenAssetHistory> serializer() {
            return TokenAssetHistory$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TokenAssetHistory(int i, String str, String str2, String str3, long j, String str4, String str5, String str6, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, TokenAssetHistory$$serializer.INSTANCE.getDescriptor());
        }
        this.metaId = str;
        this.symbol = str2;
        this.walletId = str3;
        this.generalChainId = j;
        this.displayName = str4;
        if ((i & 32) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str5;
        }
        if ((i & 64) == 0) {
            this.chainLogoUrl = null;
        } else {
            this.chainLogoUrl = str6;
        }
        if ((i & 128) == 0) {
            this.timestamp = System.currentTimeMillis();
        } else {
            this.timestamp = j2;
        }
    }

    public static final /* synthetic */ void EZpvd(TokenAssetHistory tokenAssetHistory, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        SearchHistoryItem.copydefault(tokenAssetHistory, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenAssetHistory.metaId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenAssetHistory.symbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenAssetHistory.walletId);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, tokenAssetHistory.generalChainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, tokenAssetHistory.displayName);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tokenAssetHistory.iconUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tokenAssetHistory.iconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tokenAssetHistory.chainLogoUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tokenAssetHistory.chainLogoUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && tokenAssetHistory.AhwBna() == System.currentTimeMillis()) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 7, tokenAssetHistory.AhwBna());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 long)
  (r20v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0013: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001b: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:21)) : (r23v0 long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, long):void (m)] (LINE:13) call: com.okinc.business.defi.wallet.mine.search.data.model.TokenAssetHistory.<init>(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ TokenAssetHistory(String str, String str2, String str3, long j, String str4, String str5, String str6, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? System.currentTimeMillis() : j2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenAssetHistory(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, String str5, String str6, long j2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.metaId = str;
        this.symbol = str2;
        this.walletId = str3;
        this.generalChainId = j;
        this.displayName = str4;
        this.iconUrl = str5;
        this.chainLogoUrl = str6;
        this.timestamp = j2;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String valueOf() {
        return "asset_token_" + this.walletId + "_" + this.metaId;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public SearchType gEmmrt() {
        return SearchType.TOKEN_ASSET;
    }
}
