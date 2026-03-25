package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class InhouseIMQueryMyQRCodeResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String qrcode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InhouseIMQueryMyQRCodeResponse copy$default(InhouseIMQueryMyQRCodeResponse inhouseIMQueryMyQRCodeResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inhouseIMQueryMyQRCodeResponse.qrcode;
        }
        return inhouseIMQueryMyQRCodeResponse.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.qrcode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InhouseIMQueryMyQRCodeResponse copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InhouseIMQueryMyQRCodeResponse(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InhouseIMQueryMyQRCodeResponse) && Intrinsics.EZpvd((Object) this.qrcode, (Object) ((InhouseIMQueryMyQRCodeResponse) obj).qrcode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQrcode() {
        return this.qrcode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.qrcode.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InhouseIMQueryMyQRCodeResponse(qrcode=" + this.qrcode + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InhouseIMQueryMyQRCodeResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InhouseIMQueryMyQRCodeResponse> serializer() {
            return InhouseIMQueryMyQRCodeResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InhouseIMQueryMyQRCodeResponse(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, InhouseIMQueryMyQRCodeResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.qrcode = str;
    }

    public InhouseIMQueryMyQRCodeResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.qrcode = str;
    }
}
