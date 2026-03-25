package com.okinc.planet.domain.remote.dto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class PluginData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String createTime;
    public final String deepLink;
    public final String metaData;
    public final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PluginData copy$default(PluginData pluginData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pluginData.type;
        }
        if ((i & 2) != 0) {
            str2 = pluginData.deepLink;
        }
        if ((i & 4) != 0) {
            str3 = pluginData.createTime;
        }
        if ((i & 8) != 0) {
            str4 = pluginData.metaData;
        }
        return pluginData.OLrzqt(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PluginData OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new PluginData(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginData)) {
            return false;
        }
        PluginData pluginData = (PluginData) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) pluginData.type) && Intrinsics.EZpvd((Object) this.deepLink, (Object) pluginData.deepLink) && Intrinsics.EZpvd((Object) this.createTime, (Object) pluginData.createTime) && Intrinsics.EZpvd((Object) this.metaData, (Object) pluginData.metaData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.deepLink.hashCode()) * 31) + this.createTime.hashCode()) * 31) + this.metaData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PluginData(type=" + this.type + ", deepLink=" + this.deepLink + ", createTime=" + this.createTime + ", metaData=" + this.metaData + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.PluginData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PluginData> serializer() {
            return PluginData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PluginData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (13 != (i & 13)) {
            PluginExceptionsKt.throwMissingFieldException(i, 13, PluginData$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.deepLink = "";
        } else {
            this.deepLink = str2;
        }
        this.createTime = str3;
        this.metaData = str4;
    }

    public static final /* synthetic */ void EZpvd(PluginData pluginData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, pluginData.type);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) pluginData.deepLink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, pluginData.deepLink);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, pluginData.createTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, pluginData.metaData);
    }

    public PluginData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.type = str;
        this.deepLink = str2;
        this.createTime = str3;
        this.metaData = str4;
    }
}
