package com.okinc.remote.config;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SwapSwitchResponse {
    private String bundleId;
    private String info;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBundleId() {
        return this.bundleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInfo() {
        return this.info;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBundleId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bundleId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.info = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.remote.config.SwapSwitchResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SwapSwitchResponse> serializer() {
            return SwapSwitchResponse$$serializer.INSTANCE;
        }
    }

    public SwapSwitchResponse() {
        this.bundleId = "";
        this.info = "";
    }

    public /* synthetic */ SwapSwitchResponse(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bundleId = "";
        } else {
            this.bundleId = str;
        }
        if ((i & 2) == 0) {
            this.info = "";
        } else {
            this.info = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKRemoteConfig_remote_config(SwapSwitchResponse swapSwitchResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) swapSwitchResponse.bundleId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, swapSwitchResponse.bundleId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) swapSwitchResponse.info, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, swapSwitchResponse.info);
    }
}
