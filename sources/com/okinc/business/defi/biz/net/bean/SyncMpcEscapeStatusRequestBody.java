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
public final class SyncMpcEscapeStatusRequestBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String mpcId;
    private final String uId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SyncMpcEscapeStatusRequestBody copy$default(SyncMpcEscapeStatusRequestBody syncMpcEscapeStatusRequestBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = syncMpcEscapeStatusRequestBody.mpcId;
        }
        if ((i & 2) != 0) {
            str2 = syncMpcEscapeStatusRequestBody.uId;
        }
        return syncMpcEscapeStatusRequestBody.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SyncMpcEscapeStatusRequestBody copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SyncMpcEscapeStatusRequestBody(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncMpcEscapeStatusRequestBody)) {
            return false;
        }
        SyncMpcEscapeStatusRequestBody syncMpcEscapeStatusRequestBody = (SyncMpcEscapeStatusRequestBody) obj;
        return Intrinsics.EZpvd((Object) this.mpcId, (Object) syncMpcEscapeStatusRequestBody.mpcId) && Intrinsics.EZpvd((Object) this.uId, (Object) syncMpcEscapeStatusRequestBody.uId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUId() {
        return this.uId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.mpcId.hashCode() * 31) + this.uId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SyncMpcEscapeStatusRequestBody(mpcId=" + this.mpcId + ", uId=" + this.uId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SyncMpcEscapeStatusRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SyncMpcEscapeStatusRequestBody> serializer() {
            return SyncMpcEscapeStatusRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SyncMpcEscapeStatusRequestBody(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SyncMpcEscapeStatusRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.mpcId = str;
        this.uId = str2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SyncMpcEscapeStatusRequestBody syncMpcEscapeStatusRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, syncMpcEscapeStatusRequestBody.mpcId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, syncMpcEscapeStatusRequestBody.uId);
    }

    public SyncMpcEscapeStatusRequestBody(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.mpcId = str;
        this.uId = str2;
    }
}
