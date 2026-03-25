package com.okinc.captcha.impl.geetest;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class DeepknowResponse {
    public int jiyanCheck;
    public String riskType;
    public final String status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeepknowResponse copy$default(DeepknowResponse deepknowResponse, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deepknowResponse.status;
        }
        if ((i2 & 2) != 0) {
            str2 = deepknowResponse.riskType;
        }
        if ((i2 & 4) != 0) {
            i = deepknowResponse.jiyanCheck;
        }
        return deepknowResponse.AEQbTJ(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeepknowResponse AEQbTJ(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DeepknowResponse(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.jiyanCheck == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.riskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepknowResponse)) {
            return false;
        }
        DeepknowResponse deepknowResponse = (DeepknowResponse) obj;
        return Intrinsics.EZpvd((Object) this.status, (Object) deepknowResponse.status) && Intrinsics.EZpvd((Object) this.riskType, (Object) deepknowResponse.riskType) && this.jiyanCheck == deepknowResponse.jiyanCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.status.hashCode() * 31) + this.riskType.hashCode()) * 31) + Integer.hashCode(this.jiyanCheck);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeepknowResponse(status=" + this.status + ", riskType=" + this.riskType + ", jiyanCheck=" + this.jiyanCheck + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.captcha.impl.geetest.DeepknowResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeepknowResponse> serializer() {
            return DeepknowResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeepknowResponse(int i, String str, String str2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, DeepknowResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.status = str;
        this.riskType = str2;
        this.jiyanCheck = i2;
    }

    public static final /* synthetic */ void OLrzqt(DeepknowResponse deepknowResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, deepknowResponse.status);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, deepknowResponse.riskType);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, deepknowResponse.jiyanCheck);
    }

    public DeepknowResponse(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.status = str;
        this.riskType = str2;
        this.jiyanCheck = i;
    }
}
