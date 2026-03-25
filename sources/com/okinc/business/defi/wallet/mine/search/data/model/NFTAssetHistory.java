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
@SerialName("asset_nft")
@Keep
@Serializable
public final class NFTAssetHistory extends SearchHistoryItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String displayName;
    public final long generalChainId;
    public final String iconUrl;
    public final String metaId;
    public final String platform;
    public final String project;
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
        return this.metaId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NFTAssetHistory copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull String str5, String str6, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new NFTAssetHistory(str, str2, str3, str4, j, str5, str6, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.project;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NFTAssetHistory)) {
            return false;
        }
        NFTAssetHistory nFTAssetHistory = (NFTAssetHistory) obj;
        return Intrinsics.EZpvd((Object) this.project, (Object) nFTAssetHistory.project) && Intrinsics.EZpvd((Object) this.platform, (Object) nFTAssetHistory.platform) && Intrinsics.EZpvd((Object) this.metaId, (Object) nFTAssetHistory.metaId) && Intrinsics.EZpvd((Object) this.walletId, (Object) nFTAssetHistory.walletId) && this.generalChainId == nFTAssetHistory.generalChainId && Intrinsics.EZpvd((Object) this.displayName, (Object) nFTAssetHistory.displayName) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) nFTAssetHistory.iconUrl) && this.timestamp == nFTAssetHistory.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.project.hashCode();
        int iHashCode2 = this.platform.hashCode();
        int iHashCode3 = this.metaId.hashCode();
        int iHashCode4 = this.walletId.hashCode();
        int iHashCode5 = Long.hashCode(this.generalChainId);
        int iHashCode6 = this.displayName.hashCode();
        String str = this.iconUrl;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NFTAssetHistory(project=" + this.project + ", platform=" + this.platform + ", metaId=" + this.metaId + ", walletId=" + this.walletId + ", generalChainId=" + this.generalChainId + ", displayName=" + this.displayName + ", iconUrl=" + this.iconUrl + ", timestamp=" + this.timestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.NFTAssetHistory.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NFTAssetHistory> serializer() {
            return NFTAssetHistory$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NFTAssetHistory(int i, String str, String str2, String str3, String str4, long j, String str5, String str6, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, NFTAssetHistory$$serializer.INSTANCE.getDescriptor());
        }
        this.project = str;
        this.platform = str2;
        this.metaId = str3;
        this.walletId = str4;
        this.generalChainId = j;
        this.displayName = str5;
        if ((i & 64) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str6;
        }
        if ((i & 128) == 0) {
            this.timestamp = System.currentTimeMillis();
        } else {
            this.timestamp = j2;
        }
    }

    public static final /* synthetic */ void AEQbTJ(NFTAssetHistory nFTAssetHistory, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        SearchHistoryItem.copydefault(nFTAssetHistory, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, nFTAssetHistory.project);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, nFTAssetHistory.platform);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, nFTAssetHistory.metaId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, nFTAssetHistory.walletId);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, nFTAssetHistory.generalChainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, nFTAssetHistory.displayName);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || nFTAssetHistory.iconUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, nFTAssetHistory.iconUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && nFTAssetHistory.AhwBna() == System.currentTimeMillis()) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 7, nFTAssetHistory.AhwBna());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 long)
  (r20v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0013: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:21)) : (r22v0 long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, long):void (m)] (LINE:13) call: com.okinc.business.defi.wallet.mine.search.data.model.NFTAssetHistory.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ NFTAssetHistory(String str, String str2, String str3, String str4, long j, String str5, String str6, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, j, str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? System.currentTimeMillis() : j2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NFTAssetHistory(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull String str5, String str6, long j2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.project = str;
        this.platform = str2;
        this.metaId = str3;
        this.walletId = str4;
        this.generalChainId = j;
        this.displayName = str5;
        this.iconUrl = str6;
        this.timestamp = j2;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String valueOf() {
        return "asset_nft_" + this.walletId + "_" + this.platform;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public SearchType gEmmrt() {
        return SearchType.NFT_ASSET;
    }
}
