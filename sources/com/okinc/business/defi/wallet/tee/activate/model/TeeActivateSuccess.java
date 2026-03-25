package com.okinc.business.defi.wallet.tee.activate.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.AbstractC17786fSf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class TeeActivateSuccess extends AbstractC17786fSf {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final String accountName;
    private final String addressOfWalletAvatar;
    private final boolean autoRenew;
    private final long expirePeriodDay;
    private final long expireTimestamp;
    private final String nftAssets;
    private final String teeId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.expirePeriodDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.addressOfWalletAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.nftAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeActivateSuccess copy(long j, long j2, boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new TeeActivateSuccess(j, j2, z, str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeeActivateSuccess)) {
            return false;
        }
        TeeActivateSuccess teeActivateSuccess = (TeeActivateSuccess) obj;
        return this.expireTimestamp == teeActivateSuccess.expireTimestamp && this.expirePeriodDay == teeActivateSuccess.expirePeriodDay && this.autoRenew == teeActivateSuccess.autoRenew && Intrinsics.EZpvd((Object) this.teeId, (Object) teeActivateSuccess.teeId) && Intrinsics.EZpvd((Object) this.accountId, (Object) teeActivateSuccess.accountId) && Intrinsics.EZpvd((Object) this.accountName, (Object) teeActivateSuccess.accountName) && Intrinsics.EZpvd((Object) this.addressOfWalletAvatar, (Object) teeActivateSuccess.addressOfWalletAvatar) && Intrinsics.EZpvd((Object) this.nftAssets, (Object) teeActivateSuccess.nftAssets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressOfWalletAvatar() {
        return this.addressOfWalletAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoRenew() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpirePeriodDay() {
        return this.expirePeriodDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpireTimestamp() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftAssets() {
        return this.nftAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((Long.hashCode(this.expireTimestamp) * 31) + Long.hashCode(this.expirePeriodDay)) * 31) + Boolean.hashCode(this.autoRenew)) * 31) + this.teeId.hashCode()) * 31) + this.accountId.hashCode()) * 31) + this.accountName.hashCode()) * 31) + this.addressOfWalletAvatar.hashCode()) * 31) + this.nftAssets.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeActivateSuccess(expireTimestamp=" + this.expireTimestamp + ", expirePeriodDay=" + this.expirePeriodDay + ", autoRenew=" + this.autoRenew + ", teeId=" + this.teeId + ", accountId=" + this.accountId + ", accountName=" + this.accountName + ", addressOfWalletAvatar=" + this.addressOfWalletAvatar + ", nftAssets=" + this.nftAssets + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.tee.activate.model.TeeActivateSuccess.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TeeActivateSuccess> serializer() {
            return TeeActivateSuccess$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TeeActivateSuccess(int i, long j, long j2, boolean z, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, TeeActivateSuccess$$serializer.INSTANCE.getDescriptor());
        }
        this.expireTimestamp = j;
        this.expirePeriodDay = j2;
        this.autoRenew = z;
        this.teeId = str;
        this.accountId = str2;
        this.accountName = str3;
        this.addressOfWalletAvatar = str4;
        this.nftAssets = str5;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TeeActivateSuccess teeActivateSuccess, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, teeActivateSuccess.expireTimestamp);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, teeActivateSuccess.expirePeriodDay);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, teeActivateSuccess.autoRenew);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, teeActivateSuccess.teeId);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, teeActivateSuccess.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, teeActivateSuccess.accountName);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, teeActivateSuccess.addressOfWalletAvatar);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, teeActivateSuccess.nftAssets);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeActivateSuccess(long j, long j2, boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.expireTimestamp = j;
        this.expirePeriodDay = j2;
        this.autoRenew = z;
        this.teeId = str;
        this.accountId = str2;
        this.accountName = str3;
        this.addressOfWalletAvatar = str4;
        this.nftAssets = str5;
    }
}
