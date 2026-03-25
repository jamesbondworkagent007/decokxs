package com.okinc.business.appupdate.update;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AppUpdateRequest {
    private String appID;
    private String appVersion;
    private String channel;
    private String displayMode;
    private int ignoreGray;
    private boolean isHarmony;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppID() {
        return this.appID;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayMode() {
        return this.displayMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIgnoreGray() {
        return this.ignoreGray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHarmony() {
        return this.isHarmony;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAppID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.appID = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAppVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.appVersion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHarmony(boolean z) {
        this.isHarmony = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIgnoreGray(int i) {
        this.ignoreGray = i;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.update.AppUpdateRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AppUpdateRequest> serializer() {
            return AppUpdateRequest$$serializer.INSTANCE;
        }
    }

    public AppUpdateRequest() {
        this.appID = "";
        this.displayMode = "";
        this.channel = "";
        this.appVersion = "";
    }

    public /* synthetic */ AppUpdateRequest(int i, String str, String str2, boolean z, String str3, String str4, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.appID = "";
        } else {
            this.appID = str;
        }
        if ((i & 2) == 0) {
            this.displayMode = "";
        } else {
            this.displayMode = str2;
        }
        if ((i & 4) == 0) {
            this.isHarmony = false;
        } else {
            this.isHarmony = z;
        }
        if ((i & 8) == 0) {
            this.channel = "";
        } else {
            this.channel = str3;
        }
        if ((i & 16) == 0) {
            this.appVersion = "";
        } else {
            this.appVersion = str4;
        }
        if ((i & 32) == 0) {
            this.ignoreGray = 0;
        } else {
            this.ignoreGray = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKUpgrade_ok_upgrade(AppUpdateRequest appUpdateRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) appUpdateRequest.appID, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, appUpdateRequest.appID);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) appUpdateRequest.displayMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, appUpdateRequest.displayMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || appUpdateRequest.isHarmony) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, appUpdateRequest.isHarmony);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) appUpdateRequest.channel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, appUpdateRequest.channel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) appUpdateRequest.appVersion, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, appUpdateRequest.appVersion);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && appUpdateRequest.ignoreGray == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 5, appUpdateRequest.ignoreGray);
    }
}
