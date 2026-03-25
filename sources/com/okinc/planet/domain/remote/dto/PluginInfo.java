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

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class PluginInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String createTime;
    public final String deepLink;
    public final String metaData;
    public final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PluginInfo copy$default(PluginInfo pluginInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pluginInfo.createTime;
        }
        if ((i & 2) != 0) {
            str2 = pluginInfo.deepLink;
        }
        if ((i & 4) != 0) {
            str3 = pluginInfo.metaData;
        }
        if ((i & 8) != 0) {
            str4 = pluginInfo.type;
        }
        return pluginInfo.copydefault(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PluginInfo copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new PluginInfo(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginInfo)) {
            return false;
        }
        PluginInfo pluginInfo = (PluginInfo) obj;
        return Intrinsics.EZpvd((Object) this.createTime, (Object) pluginInfo.createTime) && Intrinsics.EZpvd((Object) this.deepLink, (Object) pluginInfo.deepLink) && Intrinsics.EZpvd((Object) this.metaData, (Object) pluginInfo.metaData) && Intrinsics.EZpvd((Object) this.type, (Object) pluginInfo.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.createTime.hashCode() * 31) + this.deepLink.hashCode()) * 31) + this.metaData.hashCode()) * 31) + this.type.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PluginInfo(createTime=" + this.createTime + ", deepLink=" + this.deepLink + ", metaData=" + this.metaData + ", type=" + this.type + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.PluginInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PluginInfo> serializer() {
            return PluginInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PluginInfo(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, PluginInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.createTime = str;
        this.deepLink = str2;
        this.metaData = str3;
        this.type = str4;
    }

    public static final /* synthetic */ void KWHzl(PluginInfo pluginInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, pluginInfo.createTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, pluginInfo.deepLink);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, pluginInfo.metaData);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, pluginInfo.type);
    }

    public PluginInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.createTime = str;
        this.deepLink = str2;
        this.metaData = str3;
        this.type = str4;
    }
}
