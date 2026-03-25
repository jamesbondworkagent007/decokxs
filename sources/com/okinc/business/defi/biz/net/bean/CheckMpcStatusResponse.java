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
public final class CheckMpcStatusResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int accountStatus;
    private final String mpcId;
    private final int mpcStatus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CheckMpcStatusResponse copy$default(CheckMpcStatusResponse checkMpcStatusResponse, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = checkMpcStatusResponse.mpcId;
        }
        if ((i3 & 2) != 0) {
            i = checkMpcStatusResponse.mpcStatus;
        }
        if ((i3 & 4) != 0) {
            i2 = checkMpcStatusResponse.accountStatus;
        }
        return checkMpcStatusResponse.copy(str, i, i2);
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
    public final CheckMpcStatusResponse copy(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CheckMpcStatusResponse(str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckMpcStatusResponse)) {
            return false;
        }
        CheckMpcStatusResponse checkMpcStatusResponse = (CheckMpcStatusResponse) obj;
        return Intrinsics.EZpvd((Object) this.mpcId, (Object) checkMpcStatusResponse.mpcId) && this.mpcStatus == checkMpcStatusResponse.mpcStatus && this.accountStatus == checkMpcStatusResponse.accountStatus;
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
    public int hashCode() {
        return (((this.mpcId.hashCode() * 31) + Integer.hashCode(this.mpcStatus)) * 31) + Integer.hashCode(this.accountStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckMpcStatusResponse(mpcId=" + this.mpcId + ", mpcStatus=" + this.mpcStatus + ", accountStatus=" + this.accountStatus + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CheckMpcStatusResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckMpcStatusResponse> serializer() {
            return CheckMpcStatusResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckMpcStatusResponse(int i, String str, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, CheckMpcStatusResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.mpcId = str;
        this.mpcStatus = i2;
        this.accountStatus = i3;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CheckMpcStatusResponse checkMpcStatusResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, checkMpcStatusResponse.mpcId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, checkMpcStatusResponse.mpcStatus);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, checkMpcStatusResponse.accountStatus);
    }

    public CheckMpcStatusResponse(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mpcId = str;
        this.mpcStatus = i;
        this.accountStatus = i2;
    }
}
