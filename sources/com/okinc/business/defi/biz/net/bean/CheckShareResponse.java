package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CheckShareResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int accountStatus;
    private final String mpcId;
    private final int mpcStatus;
    private final boolean shareStatus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CheckShareResponse copy$default(CheckShareResponse checkShareResponse, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = checkShareResponse.mpcId;
        }
        if ((i3 & 2) != 0) {
            i = checkShareResponse.mpcStatus;
        }
        if ((i3 & 4) != 0) {
            i2 = checkShareResponse.accountStatus;
        }
        if ((i3 & 8) != 0) {
            z = checkShareResponse.shareStatus;
        }
        return checkShareResponse.copy(str, i, i2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.mpcStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.accountStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.shareStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckShareResponse copy(@NotNull String str, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CheckShareResponse(str, i, i2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckShareResponse)) {
            return false;
        }
        CheckShareResponse checkShareResponse = (CheckShareResponse) obj;
        return Intrinsics.EZpvd((Object) this.mpcId, (Object) checkShareResponse.mpcId) && this.mpcStatus == checkShareResponse.mpcStatus && this.accountStatus == checkShareResponse.accountStatus && this.shareStatus == checkShareResponse.shareStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAccountStatus() {
        return this.accountStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMpcStatus() {
        return this.mpcStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShareStatus() {
        return this.shareStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.mpcId.hashCode() * 31) + Integer.hashCode(this.mpcStatus)) * 31) + Integer.hashCode(this.accountStatus)) * 31) + Boolean.hashCode(this.shareStatus);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CheckShareResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckShareResponse> serializer() {
            return CheckShareResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckShareResponse(int i, String str, int i2, int i3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, CheckShareResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.mpcId = str;
        this.mpcStatus = i2;
        this.accountStatus = i3;
        this.shareStatus = z;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CheckShareResponse checkShareResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, checkShareResponse.mpcId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, checkShareResponse.mpcStatus);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, checkShareResponse.accountStatus);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, checkShareResponse.shareStatus);
    }

    public CheckShareResponse(@NotNull String str, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mpcId = str;
        this.mpcStatus = i;
        this.accountStatus = i2;
        this.shareStatus = z;
    }

    public String toString() {
        return "CheckShareResponse(mpcId='" + this.mpcId + "', mpcStatus=" + this.mpcStatus + ", accountStatus=" + this.accountStatus + ", shareStatus=" + this.shareStatus + ")";
    }
}
