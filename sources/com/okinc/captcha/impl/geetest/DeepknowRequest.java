package com.okinc.captcha.impl.geetest;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class DeepknowRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String areaCode;
    public final String loginName;
    public final String scene;
    public final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeepknowRequest copy$default(DeepknowRequest deepknowRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deepknowRequest.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = deepknowRequest.scene;
        }
        if ((i & 4) != 0) {
            str3 = deepknowRequest.loginName;
        }
        if ((i & 8) != 0) {
            str4 = deepknowRequest.areaCode;
        }
        return deepknowRequest.EZpvd(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeepknowRequest EZpvd(@NotNull String str, @NotNull String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DeepknowRequest(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepknowRequest)) {
            return false;
        }
        DeepknowRequest deepknowRequest = (DeepknowRequest) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) deepknowRequest.sessionId) && Intrinsics.EZpvd((Object) this.scene, (Object) deepknowRequest.scene) && Intrinsics.EZpvd((Object) this.loginName, (Object) deepknowRequest.loginName) && Intrinsics.EZpvd((Object) this.areaCode, (Object) deepknowRequest.areaCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.sessionId.hashCode();
        int iHashCode2 = this.scene.hashCode();
        String str = this.loginName;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.areaCode;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeepknowRequest(sessionId=" + this.sessionId + ", scene=" + this.scene + ", loginName=" + this.loginName + ", areaCode=" + this.areaCode + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.captcha.impl.geetest.DeepknowRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeepknowRequest> serializer() {
            return DeepknowRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeepknowRequest(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DeepknowRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
        this.scene = str2;
        if ((i & 4) == 0) {
            this.loginName = null;
        } else {
            this.loginName = str3;
        }
        if ((i & 8) == 0) {
            this.areaCode = null;
        } else {
            this.areaCode = str4;
        }
    }

    public static final /* synthetic */ void EZpvd(DeepknowRequest deepknowRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, deepknowRequest.sessionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, deepknowRequest.scene);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || deepknowRequest.loginName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, deepknowRequest.loginName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && deepknowRequest.areaCode == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, deepknowRequest.areaCode);
    }

    public DeepknowRequest(@NotNull String str, @NotNull String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sessionId = str;
        this.scene = str2;
        this.loginName = str3;
        this.areaCode = str4;
    }
}
