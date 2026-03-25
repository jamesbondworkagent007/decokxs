package com.okinc.business.defi.wallet.tee.common.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C54907xZt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class ADOriginData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String command;
    private final long expiredTimestamp;
    private final String identityPKHex;
    private final String teeId;
    private final int teeType;
    private final long timestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.teeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.identityPKHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.expiredTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.command;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ADOriginData copy(@NotNull String str, int i, @NotNull String str2, long j, long j2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ADOriginData(str, i, str2, j, j2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ADOriginData)) {
            return false;
        }
        ADOriginData aDOriginData = (ADOriginData) obj;
        return Intrinsics.EZpvd((Object) this.teeId, (Object) aDOriginData.teeId) && this.teeType == aDOriginData.teeType && Intrinsics.EZpvd((Object) this.identityPKHex, (Object) aDOriginData.identityPKHex) && this.expiredTimestamp == aDOriginData.expiredTimestamp && this.timestamp == aDOriginData.timestamp && Intrinsics.EZpvd((Object) this.command, (Object) aDOriginData.command);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommand() {
        return this.command;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpiredTimestamp() {
        return this.expiredTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdentityPKHex() {
        return this.identityPKHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTeeType() {
        return this.teeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.teeId.hashCode() * 31) + Integer.hashCode(this.teeType)) * 31) + this.identityPKHex.hashCode()) * 31) + Long.hashCode(this.expiredTimestamp)) * 31) + Long.hashCode(this.timestamp)) * 31) + this.command.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ADOriginData(teeId=" + this.teeId + ", teeType=" + this.teeType + ", identityPKHex=" + this.identityPKHex + ", expiredTimestamp=" + this.expiredTimestamp + ", timestamp=" + this.timestamp + ", command=" + this.command + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.tee.common.model.ADOriginData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ADOriginData> serializer() {
            return ADOriginData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ADOriginData(int i, String str, int i2, String str2, long j, long j2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, ADOriginData$$serializer.INSTANCE.getDescriptor());
        }
        this.teeId = str;
        this.teeType = i2;
        this.identityPKHex = str2;
        this.expiredTimestamp = j;
        this.timestamp = j2;
        this.command = str3;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ADOriginData aDOriginData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aDOriginData.teeId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, aDOriginData.teeType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, aDOriginData.identityPKHex);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, aDOriginData.expiredTimestamp);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, aDOriginData.timestamp);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, aDOriginData.command);
    }

    public ADOriginData(@NotNull String str, int i, @NotNull String str2, long j, long j2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.teeId = str;
        this.teeType = i;
        this.identityPKHex = str2;
        this.expiredTimestamp = j;
        this.timestamp = j2;
        this.command = str3;
    }

    public final String toJson() {
        return C54907xZt.encodeToString$default(Companion.serializer(), this, false, 2, null);
    }
}
