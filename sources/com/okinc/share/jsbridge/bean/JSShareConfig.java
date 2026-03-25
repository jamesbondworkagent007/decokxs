package com.okinc.share.jsbridge.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class JSShareConfig {
    private JSPreviewConfig previewConfig;
    private JSShareParams shareParams;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ JSShareConfig copy$default(JSShareConfig jSShareConfig, JSShareParams jSShareParams, JSPreviewConfig jSPreviewConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            jSShareParams = jSShareConfig.shareParams;
        }
        if ((i & 2) != 0) {
            jSPreviewConfig = jSShareConfig.previewConfig;
        }
        return jSShareConfig.copy(jSShareParams, jSPreviewConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSShareParams component1() {
        return this.shareParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSPreviewConfig component2() {
        return this.previewConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSShareConfig copy(@NotNull JSShareParams jSShareParams, JSPreviewConfig jSPreviewConfig) {
        Intrinsics.checkNotNullParameter(jSShareParams, "");
        return new JSShareConfig(jSShareParams, jSPreviewConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JSShareConfig)) {
            return false;
        }
        JSShareConfig jSShareConfig = (JSShareConfig) obj;
        return Intrinsics.EZpvd(this.shareParams, jSShareConfig.shareParams) && Intrinsics.EZpvd(this.previewConfig, jSShareConfig.previewConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSPreviewConfig getPreviewConfig() {
        return this.previewConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSShareParams getShareParams() {
        return this.shareParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.shareParams.hashCode();
        JSPreviewConfig jSPreviewConfig = this.previewConfig;
        return (iHashCode * 31) + (jSPreviewConfig == null ? 0 : jSPreviewConfig.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreviewConfig(JSPreviewConfig jSPreviewConfig) {
        this.previewConfig = jSPreviewConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareParams(@NotNull JSShareParams jSShareParams) {
        Intrinsics.checkNotNullParameter(jSShareParams, "");
        this.shareParams = jSShareParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "JSShareConfig(shareParams=" + this.shareParams + ", previewConfig=" + this.previewConfig + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.jsbridge.bean.JSShareConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<JSShareConfig> serializer() {
            return JSShareConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ JSShareConfig(int i, JSShareParams jSShareParams, JSPreviewConfig jSPreviewConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, JSShareConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.shareParams = jSShareParams;
        if ((i & 2) == 0) {
            this.previewConfig = null;
        } else {
            this.previewConfig = jSPreviewConfig;
        }
    }

    public static final /* synthetic */ void write$Self$OKShare_sdk_share_impl(JSShareConfig jSShareConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, JSShareParams$$serializer.INSTANCE, jSShareConfig.shareParams);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && jSShareConfig.previewConfig == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, JSPreviewConfig$$serializer.INSTANCE, jSShareConfig.previewConfig);
    }

    public JSShareConfig(@NotNull JSShareParams jSShareParams, JSPreviewConfig jSPreviewConfig) {
        Intrinsics.checkNotNullParameter(jSShareParams, "");
        this.shareParams = jSShareParams;
        this.previewConfig = jSPreviewConfig;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.share.jsbridge.bean.JSShareParams)
  (wrap:com.okinc.share.jsbridge.bean.JSPreviewConfig:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.jsbridge.bean.JSPreviewConfig) : (r2v0 com.okinc.share.jsbridge.bean.JSPreviewConfig))
 A[MD:(com.okinc.share.jsbridge.bean.JSShareParams, com.okinc.share.jsbridge.bean.JSPreviewConfig):void (m)] (LINE:12) call: com.okinc.share.jsbridge.bean.JSShareConfig.<init>(com.okinc.share.jsbridge.bean.JSShareParams, com.okinc.share.jsbridge.bean.JSPreviewConfig):void type: THIS */
    public /* synthetic */ JSShareConfig(JSShareParams jSShareParams, JSPreviewConfig jSPreviewConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSShareParams, (i & 2) != 0 ? null : jSPreviewConfig);
    }
}
