package com.okinc.wallet.hardware.impl.onekey.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.InterfaceC57144ycq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class CheckFirmwareRelease implements InterfaceC57144ycq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String connectId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CheckFirmwareRelease copy$default(CheckFirmwareRelease checkFirmwareRelease, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkFirmwareRelease.connectId;
        }
        return checkFirmwareRelease.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.connectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckFirmwareRelease copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CheckFirmwareRelease(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckFirmwareRelease) && Intrinsics.EZpvd((Object) this.connectId, (Object) ((CheckFirmwareRelease) obj).connectId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57144ycq
    public String getConnectId() {
        return this.connectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.connectId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckFirmwareRelease(connectId=" + this.connectId + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.impl.onekey.data.CheckFirmwareRelease.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckFirmwareRelease> serializer() {
            return CheckFirmwareRelease$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckFirmwareRelease(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CheckFirmwareRelease$$serializer.INSTANCE.getDescriptor());
        }
        this.connectId = str;
    }

    public CheckFirmwareRelease(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.connectId = str;
    }
}
