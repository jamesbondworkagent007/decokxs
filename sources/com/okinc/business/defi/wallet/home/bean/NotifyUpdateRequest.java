package com.okinc.business.defi.wallet.home.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class NotifyUpdateRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String collectAddress;
    public final int notifyType;
    public final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NotifyUpdateRequest copy$default(NotifyUpdateRequest notifyUpdateRequest, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = notifyUpdateRequest.walletAddress;
        }
        if ((i2 & 2) != 0) {
            str2 = notifyUpdateRequest.collectAddress;
        }
        if ((i2 & 4) != 0) {
            i = notifyUpdateRequest.notifyType;
        }
        return notifyUpdateRequest.AEQbTJ(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotifyUpdateRequest AEQbTJ(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new NotifyUpdateRequest(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotifyUpdateRequest)) {
            return false;
        }
        NotifyUpdateRequest notifyUpdateRequest = (NotifyUpdateRequest) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) notifyUpdateRequest.walletAddress) && Intrinsics.EZpvd((Object) this.collectAddress, (Object) notifyUpdateRequest.collectAddress) && this.notifyType == notifyUpdateRequest.notifyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.walletAddress.hashCode() * 31) + this.collectAddress.hashCode()) * 31) + Integer.hashCode(this.notifyType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NotifyUpdateRequest(walletAddress=" + this.walletAddress + ", collectAddress=" + this.collectAddress + ", notifyType=" + this.notifyType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.bean.NotifyUpdateRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NotifyUpdateRequest> serializer() {
            return NotifyUpdateRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NotifyUpdateRequest(int i, String str, String str2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, NotifyUpdateRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.walletAddress = str;
        this.collectAddress = str2;
        this.notifyType = i2;
    }

    public static final /* synthetic */ void AEQbTJ(NotifyUpdateRequest notifyUpdateRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, notifyUpdateRequest.walletAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, notifyUpdateRequest.collectAddress);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, notifyUpdateRequest.notifyType);
    }

    public NotifyUpdateRequest(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.walletAddress = str;
        this.collectAddress = str2;
        this.notifyType = i;
    }
}
