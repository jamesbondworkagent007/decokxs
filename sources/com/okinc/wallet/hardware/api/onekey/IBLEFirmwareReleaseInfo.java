package com.okinc.wallet.hardware.api.onekey;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class IBLEFirmwareReleaseInfo {
    private final Changelog changelog;
    private final String fingerprint;
    private final String fingerprintWeb;
    private final boolean required;
    private final String url;
    private final List<Long> version;
    private final String webUpdate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(LongSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Changelog getChangelog() {
        return this.changelog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFingerprintWeb() {
        return this.fingerprintWeb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWebUpdate() {
        return this.webUpdate;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.IBLEFirmwareReleaseInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IBLEFirmwareReleaseInfo> serializer() {
            return IBLEFirmwareReleaseInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IBLEFirmwareReleaseInfo(int i, boolean z, String str, String str2, String str3, String str4, List list, Changelog changelog, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, IBLEFirmwareReleaseInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.required = z;
        this.url = str;
        this.webUpdate = str2;
        this.fingerprint = str3;
        this.fingerprintWeb = str4;
        this.version = list;
        this.changelog = changelog;
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(IBLEFirmwareReleaseInfo iBLEFirmwareReleaseInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, iBLEFirmwareReleaseInfo.required);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, iBLEFirmwareReleaseInfo.url);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, iBLEFirmwareReleaseInfo.webUpdate);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, iBLEFirmwareReleaseInfo.fingerprint);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, iBLEFirmwareReleaseInfo.fingerprintWeb);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], iBLEFirmwareReleaseInfo.version);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, Changelog$$serializer.INSTANCE, iBLEFirmwareReleaseInfo.changelog);
    }

    public IBLEFirmwareReleaseInfo(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<Long> list, @NotNull Changelog changelog) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(changelog, "");
        this.required = z;
        this.url = str;
        this.webUpdate = str2;
        this.fingerprint = str3;
        this.fingerprintWeb = str4;
        this.version = list;
        this.changelog = changelog;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(IBLEFirmwareReleaseInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        IBLEFirmwareReleaseInfo iBLEFirmwareReleaseInfo = (IBLEFirmwareReleaseInfo) obj;
        return this.required == iBLEFirmwareReleaseInfo.required && Intrinsics.EZpvd((Object) this.url, (Object) iBLEFirmwareReleaseInfo.url) && Intrinsics.EZpvd((Object) this.webUpdate, (Object) iBLEFirmwareReleaseInfo.webUpdate) && Intrinsics.EZpvd((Object) this.fingerprint, (Object) iBLEFirmwareReleaseInfo.fingerprint) && Intrinsics.EZpvd((Object) this.fingerprintWeb, (Object) iBLEFirmwareReleaseInfo.fingerprintWeb) && Intrinsics.EZpvd(this.version, iBLEFirmwareReleaseInfo.version) && Intrinsics.EZpvd(this.changelog, iBLEFirmwareReleaseInfo.changelog);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.required);
        int iHashCode2 = this.url.hashCode();
        int iHashCode3 = this.webUpdate.hashCode();
        int iHashCode4 = this.fingerprint.hashCode();
        int iHashCode5 = this.fingerprintWeb.hashCode();
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + this.version.hashCode()) * 31) + this.changelog.hashCode();
    }

    public String toString() {
        return "IBLEFirmwareReleaseInfo(required=" + this.required + ", url='" + this.url + "', webUpdate='" + this.webUpdate + "', fingerprint='" + this.fingerprint + "', fingerprintWeb='" + this.fingerprintWeb + "', version=" + this.version + ", changelog=" + this.changelog + ")";
    }
}
