package com.okinc.business.appupdate.update;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class AppRelease {
    private final String appId;
    private final AppInfo appInfo;
    private final String channel;
    private final int id;
    private final String platform;
    private final List<ReleaseNote> releaseNotes;
    private final int status;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(ReleaseNote$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.appId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppInfo component2() {
        return this.appInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReleaseNote> component6() {
        return this.releaseNotes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppRelease copy(@NotNull String str, @NotNull AppInfo appInfo, @NotNull String str2, int i, @NotNull String str3, List<ReleaseNote> list, int i2, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appInfo, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AppRelease(str, appInfo, str2, i, str3, list, i2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppRelease)) {
            return false;
        }
        AppRelease appRelease = (AppRelease) obj;
        return Intrinsics.EZpvd((Object) this.appId, (Object) appRelease.appId) && Intrinsics.EZpvd(this.appInfo, appRelease.appInfo) && Intrinsics.EZpvd((Object) this.channel, (Object) appRelease.channel) && this.id == appRelease.id && Intrinsics.EZpvd((Object) this.platform, (Object) appRelease.platform) && Intrinsics.EZpvd(this.releaseNotes, appRelease.releaseNotes) && this.status == appRelease.status && Intrinsics.EZpvd((Object) this.version, (Object) appRelease.version);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppId() {
        return this.appId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReleaseNote> getReleaseNotes() {
        return this.releaseNotes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.appId.hashCode();
        int iHashCode2 = this.appInfo.hashCode();
        int iHashCode3 = this.channel.hashCode();
        int iHashCode4 = Integer.hashCode(this.id);
        int iHashCode5 = this.platform.hashCode();
        List<ReleaseNote> list = this.releaseNotes;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.status)) * 31) + this.version.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AppRelease(appId=" + this.appId + ", appInfo=" + this.appInfo + ", channel=" + this.channel + ", id=" + this.id + ", platform=" + this.platform + ", releaseNotes=" + this.releaseNotes + ", status=" + this.status + ", version=" + this.version + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.update.AppRelease.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AppRelease> serializer() {
            return AppRelease$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AppRelease(int i, String str, AppInfo appInfo, String str2, int i2, String str3, List list, int i3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, AppRelease$$serializer.INSTANCE.getDescriptor());
        }
        this.appId = str;
        this.appInfo = appInfo;
        this.channel = str2;
        this.id = i2;
        this.platform = str3;
        this.releaseNotes = list;
        this.status = i3;
        this.version = str4;
    }

    public static final /* synthetic */ void write$Self$OKUpgrade_ok_upgrade(AppRelease appRelease, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, appRelease.appId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, AppInfo$$serializer.INSTANCE, appRelease.appInfo);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, appRelease.channel);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, appRelease.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, appRelease.platform);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], appRelease.releaseNotes);
        compositeEncoder.encodeIntElement(serialDescriptor, 6, appRelease.status);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, appRelease.version);
    }

    public AppRelease(@NotNull String str, @NotNull AppInfo appInfo, @NotNull String str2, int i, @NotNull String str3, List<ReleaseNote> list, int i2, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appInfo, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.appId = str;
        this.appInfo = appInfo;
        this.channel = str2;
        this.id = i;
        this.platform = str3;
        this.releaseNotes = list;
        this.status = i2;
        this.version = str4;
    }
}
