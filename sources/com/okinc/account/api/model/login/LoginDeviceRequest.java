package com.okinc.account.api.model.login;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class LoginDeviceRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String applyId;
    private final String channelId;
    private final String venus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LoginDeviceRequest() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LoginDeviceRequest copy$default(LoginDeviceRequest loginDeviceRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginDeviceRequest.applyId;
        }
        if ((i & 2) != 0) {
            str2 = loginDeviceRequest.venus;
        }
        if ((i & 4) != 0) {
            str3 = loginDeviceRequest.channelId;
        }
        return loginDeviceRequest.copy(str, str2, str3);
    }

    @SerialName("applyId")
    public static /* synthetic */ void getApplyId$annotations() {
    }

    @SerialName(RemoteMessageConst.Notification.CHANNEL_ID)
    public static /* synthetic */ void getChannelId$annotations() {
    }

    @SerialName("venus")
    public static /* synthetic */ void getVenus$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.applyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.venus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LoginDeviceRequest copy(String str, String str2, String str3) {
        return new LoginDeviceRequest(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginDeviceRequest)) {
            return false;
        }
        LoginDeviceRequest loginDeviceRequest = (LoginDeviceRequest) obj;
        return Intrinsics.EZpvd((Object) this.applyId, (Object) loginDeviceRequest.applyId) && Intrinsics.EZpvd((Object) this.venus, (Object) loginDeviceRequest.venus) && Intrinsics.EZpvd((Object) this.channelId, (Object) loginDeviceRequest.channelId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApplyId() {
        return this.applyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVenus() {
        return this.venus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.applyId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.venus;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.channelId;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LoginDeviceRequest(applyId=" + this.applyId + ", venus=" + this.venus + ", channelId=" + this.channelId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.login.LoginDeviceRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LoginDeviceRequest> serializer() {
            return LoginDeviceRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LoginDeviceRequest(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.applyId = null;
        } else {
            this.applyId = str;
        }
        if ((i & 2) == 0) {
            this.venus = null;
        } else {
            this.venus = str2;
        }
        if ((i & 4) == 0) {
            this.channelId = null;
        } else {
            this.channelId = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKAccount_account_api(LoginDeviceRequest loginDeviceRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || loginDeviceRequest.applyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, loginDeviceRequest.applyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || loginDeviceRequest.venus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, loginDeviceRequest.venus);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && loginDeviceRequest.channelId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, loginDeviceRequest.channelId);
    }

    public LoginDeviceRequest(String str, String str2, String str3) {
        this.applyId = str;
        this.venus = str2;
        this.channelId = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:83) call: com.okinc.account.api.model.login.LoginDeviceRequest.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LoginDeviceRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
