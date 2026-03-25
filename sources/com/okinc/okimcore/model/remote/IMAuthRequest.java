package com.okinc.okimcore.model.remote;

import com.engagelab.privates.push.constants.MTPushConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class IMAuthRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String deviceId;
    private final int platform;
    private final int source;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IMAuthRequest copy$default(IMAuthRequest iMAuthRequest, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = iMAuthRequest.deviceId;
        }
        if ((i3 & 2) != 0) {
            i = iMAuthRequest.source;
        }
        if ((i3 & 4) != 0) {
            i2 = iMAuthRequest.platform;
        }
        return iMAuthRequest.copy(str, i, i2);
    }

    @SerialName("deviceId")
    public static /* synthetic */ void getDeviceId$annotations() {
    }

    @SerialName(MTPushConstants.PlatformNode.KEY_PLATFORM)
    public static /* synthetic */ void getPlatform$annotations() {
    }

    @SerialName("source")
    public static /* synthetic */ void getSource$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IMAuthRequest copy(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new IMAuthRequest(str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMAuthRequest)) {
            return false;
        }
        IMAuthRequest iMAuthRequest = (IMAuthRequest) obj;
        return Intrinsics.EZpvd((Object) this.deviceId, (Object) iMAuthRequest.deviceId) && this.source == iMAuthRequest.source && this.platform == iMAuthRequest.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPlatform() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.deviceId.hashCode() * 31) + Integer.hashCode(this.source)) * 31) + Integer.hashCode(this.platform);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IMAuthRequest(deviceId=" + this.deviceId + ", source=" + this.source + ", platform=" + this.platform + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.IMAuthRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IMAuthRequest> serializer() {
            return IMAuthRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IMAuthRequest(int i, String str, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, IMAuthRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.deviceId = str;
        if ((i & 2) == 0) {
            this.source = 6;
        } else {
            this.source = i2;
        }
        if ((i & 4) == 0) {
            this.platform = 2;
        } else {
            this.platform = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(IMAuthRequest iMAuthRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, iMAuthRequest.deviceId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || iMAuthRequest.source != 6) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, iMAuthRequest.source);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && iMAuthRequest.platform == 2) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, iMAuthRequest.platform);
    }

    public IMAuthRequest(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deviceId = str;
        this.source = i;
        this.platform = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (6 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r3v0 int))
 A[MD:(java.lang.String, int, int):void (m)] (LINE:9) call: com.okinc.okimcore.model.remote.IMAuthRequest.<init>(java.lang.String, int, int):void type: THIS */
    public /* synthetic */ IMAuthRequest(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 6 : i, (i3 & 4) != 0 ? 2 : i2);
    }
}
