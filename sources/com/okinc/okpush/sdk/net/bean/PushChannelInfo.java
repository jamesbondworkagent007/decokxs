package com.okinc.okpush.sdk.net.bean;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PushChannelInfo {
    public String channelId;
    private String channelName;
    private String channelReason;
    private String deviceToken;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PushChannelInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PushChannelInfo copy$default(PushChannelInfo pushChannelInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushChannelInfo.channelName;
        }
        if ((i & 2) != 0) {
            str2 = pushChannelInfo.deviceToken;
        }
        if ((i & 4) != 0) {
            str3 = pushChannelInfo.channelReason;
        }
        return pushChannelInfo.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.channelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.deviceToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.channelReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PushChannelInfo copy(@NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PushChannelInfo(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushChannelInfo)) {
            return false;
        }
        PushChannelInfo pushChannelInfo = (PushChannelInfo) obj;
        return Intrinsics.EZpvd((Object) this.channelName, (Object) pushChannelInfo.channelName) && Intrinsics.EZpvd((Object) this.deviceToken, (Object) pushChannelInfo.deviceToken) && Intrinsics.EZpvd((Object) this.channelReason, (Object) pushChannelInfo.channelReason);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelName() {
        return this.channelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelReason() {
        return this.channelReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeviceToken() {
        return this.deviceToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.channelName.hashCode();
        String str = this.deviceToken;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.channelReason;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannelId$OKPush_okpush_notification(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannelName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannelReason(String str) {
        this.channelReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeviceToken(String str) {
        this.deviceToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PushChannelInfo(channelName=" + this.channelName + ", deviceToken=" + this.deviceToken + ", channelReason=" + this.channelReason + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpush.sdk.net.bean.PushChannelInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PushChannelInfo> serializer() {
            return PushChannelInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PushChannelInfo(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8, PushChannelInfo$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.channelName = "";
        } else {
            this.channelName = str;
        }
        if ((i & 2) == 0) {
            this.deviceToken = "";
        } else {
            this.deviceToken = str2;
        }
        if ((i & 4) == 0) {
            this.channelReason = "";
        } else {
            this.channelReason = str3;
        }
        this.channelId = str4;
    }

    public static final /* synthetic */ void write$Self$OKPush_okpush_notification(PushChannelInfo pushChannelInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) pushChannelInfo.channelName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, pushChannelInfo.channelName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) pushChannelInfo.deviceToken, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, pushChannelInfo.deviceToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) pushChannelInfo.channelReason, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, pushChannelInfo.channelReason);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, pushChannelInfo.getChannelId$OKPush_okpush_notification());
    }

    public PushChannelInfo(@NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelName = str;
        this.deviceToken = str2;
        this.channelReason = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.okpush.sdk.net.bean.PushChannelInfo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PushChannelInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public final String getChannelId$OKPush_okpush_notification() {
        String str = this.channelId;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }
}
