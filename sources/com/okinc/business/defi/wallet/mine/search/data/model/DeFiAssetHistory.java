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
@SerialName("asset_defi")
@Keep
@Serializable
public final class DeFiAssetHistory extends SearchHistoryItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String chainLogoUrl;
    public final String displayName;
    public final long generalChainId;
    public final String iconUrl;
    public final String metaId;
    public final long platformId;
    public final String platformName;
    public final long timestamp;
    public final String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.generalChainId;
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
    public final String OLrzqt() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeFiAssetHistory copydefault(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, long j2, @NotNull String str4, String str5, String str6, long j3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new DeFiAssetHistory(j, str, str2, str3, j2, str4, str5, str6, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.metaId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long djBIcL() {
        return this.platformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeFiAssetHistory)) {
            return false;
        }
        DeFiAssetHistory deFiAssetHistory = (DeFiAssetHistory) obj;
        return this.platformId == deFiAssetHistory.platformId && Intrinsics.EZpvd((Object) this.platformName, (Object) deFiAssetHistory.platformName) && Intrinsics.EZpvd((Object) this.metaId, (Object) deFiAssetHistory.metaId) && Intrinsics.EZpvd((Object) this.walletId, (Object) deFiAssetHistory.walletId) && this.generalChainId == deFiAssetHistory.generalChainId && Intrinsics.EZpvd((Object) this.displayName, (Object) deFiAssetHistory.displayName) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) deFiAssetHistory.iconUrl) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) deFiAssetHistory.chainLogoUrl) && this.timestamp == deFiAssetHistory.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.platformId);
        int iHashCode2 = this.platformName.hashCode();
        int iHashCode3 = this.metaId.hashCode();
        int iHashCode4 = this.walletId.hashCode();
        int iHashCode5 = Long.hashCode(this.generalChainId);
        int iHashCode6 = this.displayName.hashCode();
        String str = this.iconUrl;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.chainLogoUrl;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeFiAssetHistory(platformId=" + this.platformId + ", platformName=" + this.platformName + ", metaId=" + this.metaId + ", walletId=" + this.walletId + ", generalChainId=" + this.generalChainId + ", displayName=" + this.displayName + ", iconUrl=" + this.iconUrl + ", chainLogoUrl=" + this.chainLogoUrl + ", timestamp=" + this.timestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.DeFiAssetHistory.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeFiAssetHistory> serializer() {
            return DeFiAssetHistory$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeFiAssetHistory(int i, long j, String str, String str2, String str3, long j2, String str4, String str5, String str6, long j3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, DeFiAssetHistory$$serializer.INSTANCE.getDescriptor());
        }
        this.platformId = j;
        this.platformName = str;
        this.metaId = str2;
        this.walletId = str3;
        this.generalChainId = j2;
        this.displayName = str4;
        if ((i & 64) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str5;
        }
        if ((i & 128) == 0) {
            this.chainLogoUrl = null;
        } else {
            this.chainLogoUrl = str6;
        }
        this.timestamp = (i & 256) == 0 ? System.currentTimeMillis() : j3;
    }

    public static final /* synthetic */ void copydefault(DeFiAssetHistory deFiAssetHistory, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        SearchHistoryItem.copydefault(deFiAssetHistory, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeLongElement(serialDescriptor, 0, deFiAssetHistory.platformId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, deFiAssetHistory.platformName);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, deFiAssetHistory.metaId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, deFiAssetHistory.walletId);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, deFiAssetHistory.generalChainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, deFiAssetHistory.displayName);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || deFiAssetHistory.iconUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, deFiAssetHistory.iconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || deFiAssetHistory.chainLogoUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, deFiAssetHistory.chainLogoUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && deFiAssetHistory.AhwBna() == System.currentTimeMillis()) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 8, deFiAssetHistory.AhwBna());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002d: CONSTRUCTOR 
  (r17v0 long)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 long)
  (r24v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0013: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001b: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:22)) : (r27v0 long))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, long):void (m)] (LINE:13) call: com.okinc.business.defi.wallet.mine.search.data.model.DeFiAssetHistory.<init>(long, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ DeFiAssetHistory(long j, String str, String str2, String str3, long j2, String str4, String str5, String str6, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, j2, str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? System.currentTimeMillis() : j3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiAssetHistory(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, long j2, @NotNull String str4, String str5, String str6, long j3) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.platformId = j;
        this.platformName = str;
        this.metaId = str2;
        this.walletId = str3;
        this.generalChainId = j2;
        this.displayName = str4;
        this.iconUrl = str5;
        this.chainLogoUrl = str6;
        this.timestamp = j3;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String valueOf() {
        return "asset_defi_" + this.walletId + "_" + this.platformId;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public SearchType gEmmrt() {
        return SearchType.DEFI_ASSET;
    }
}
