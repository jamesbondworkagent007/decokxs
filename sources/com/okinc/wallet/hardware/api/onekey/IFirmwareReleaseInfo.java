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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class IFirmwareReleaseInfo {
    private static final KSerializer<Object>[] $childSerializers;
    private final Changelog bootloaderChangelog;
    private final List<Long> bootloaderRelatedFirmwareVersion;
    private final String bootloaderResource;
    private final List<Long> bootloaderVersion;
    private final Changelog changelog;
    private final String fingerprint;
    private final String fullResource;
    private final List<String> fullResourceRange;
    private final boolean required;
    private final String resource;
    private final String url;
    private final List<Long> version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Changelog getBootloaderChangelog() {
        return this.bootloaderChangelog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getBootloaderRelatedFirmwareVersion() {
        return this.bootloaderRelatedFirmwareVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBootloaderResource() {
        return this.bootloaderResource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getBootloaderVersion() {
        return this.bootloaderVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Changelog getChangelog() {
        return this.changelog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullResource() {
        return this.fullResource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getFullResourceRange() {
        return this.fullResourceRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResource() {
        return this.resource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getVersion() {
        return this.version;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.IFirmwareReleaseInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IFirmwareReleaseInfo> serializer() {
            return IFirmwareReleaseInfo$$serializer.INSTANCE;
        }
    }

    static {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, new ArrayListSerializer(longSerializer), new ArrayListSerializer(longSerializer), null, null, new ArrayListSerializer(longSerializer), null};
    }

    public /* synthetic */ IFirmwareReleaseInfo(int i, boolean z, String str, String str2, String str3, List list, String str4, List list2, List list3, Changelog changelog, String str5, List list4, Changelog changelog2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3587 != (i & 3587)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3587, IFirmwareReleaseInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.required = z;
        this.url = str;
        if ((i & 4) == 0) {
            this.resource = null;
        } else {
            this.resource = str2;
        }
        if ((i & 8) == 0) {
            this.fullResource = null;
        } else {
            this.fullResource = str3;
        }
        if ((i & 16) == 0) {
            this.fullResourceRange = null;
        } else {
            this.fullResourceRange = list;
        }
        if ((i & 32) == 0) {
            this.bootloaderResource = null;
        } else {
            this.bootloaderResource = str4;
        }
        if ((i & 64) == 0) {
            this.bootloaderVersion = null;
        } else {
            this.bootloaderVersion = list2;
        }
        if ((i & 128) == 0) {
            this.bootloaderRelatedFirmwareVersion = null;
        } else {
            this.bootloaderRelatedFirmwareVersion = list3;
        }
        if ((i & 256) == 0) {
            this.bootloaderChangelog = null;
        } else {
            this.bootloaderChangelog = changelog;
        }
        this.fingerprint = str5;
        this.version = list4;
        this.changelog = changelog2;
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(IFirmwareReleaseInfo iFirmwareReleaseInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, iFirmwareReleaseInfo.required);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, iFirmwareReleaseInfo.url);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || iFirmwareReleaseInfo.resource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, iFirmwareReleaseInfo.resource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || iFirmwareReleaseInfo.fullResource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, iFirmwareReleaseInfo.fullResource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || iFirmwareReleaseInfo.fullResourceRange != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], iFirmwareReleaseInfo.fullResourceRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || iFirmwareReleaseInfo.bootloaderResource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, iFirmwareReleaseInfo.bootloaderResource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || iFirmwareReleaseInfo.bootloaderVersion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], iFirmwareReleaseInfo.bootloaderVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || iFirmwareReleaseInfo.bootloaderRelatedFirmwareVersion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], iFirmwareReleaseInfo.bootloaderRelatedFirmwareVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || iFirmwareReleaseInfo.bootloaderChangelog != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, Changelog$$serializer.INSTANCE, iFirmwareReleaseInfo.bootloaderChangelog);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, iFirmwareReleaseInfo.fingerprint);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], iFirmwareReleaseInfo.version);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 11, Changelog$$serializer.INSTANCE, iFirmwareReleaseInfo.changelog);
    }

    public IFirmwareReleaseInfo(boolean z, @NotNull String str, String str2, String str3, List<String> list, String str4, List<Long> list2, List<Long> list3, Changelog changelog, @NotNull String str5, @NotNull List<Long> list4, @NotNull Changelog changelog2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(changelog2, "");
        this.required = z;
        this.url = str;
        this.resource = str2;
        this.fullResource = str3;
        this.fullResourceRange = list;
        this.bootloaderResource = str4;
        this.bootloaderVersion = list2;
        this.bootloaderRelatedFirmwareVersion = list3;
        this.bootloaderChangelog = changelog;
        this.fingerprint = str5;
        this.version = list4;
        this.changelog = changelog2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0047: CONSTRUCTOR 
  (r17v0 boolean)
  (r18v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0013: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r21v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0023: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r23v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002b: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r24v0 java.util.List))
  (wrap:com.okinc.wallet.hardware.api.onekey.Changelog:?: TERNARY null = ((wrap:int:0x0033: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.Changelog) : (r25v0 com.okinc.wallet.hardware.api.onekey.Changelog))
  (r26v0 java.lang.String)
  (r27v0 java.util.List)
  (r28v0 com.okinc.wallet.hardware.api.onekey.Changelog)
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.util.List<java.lang.Long>, java.util.List<java.lang.Long>, com.okinc.wallet.hardware.api.onekey.Changelog, java.lang.String, java.util.List<java.lang.Long>, com.okinc.wallet.hardware.api.onekey.Changelog):void (m)] (LINE:61) call: com.okinc.wallet.hardware.api.onekey.IFirmwareReleaseInfo.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.util.List, com.okinc.wallet.hardware.api.onekey.Changelog, java.lang.String, java.util.List, com.okinc.wallet.hardware.api.onekey.Changelog):void type: THIS */
    public /* synthetic */ IFirmwareReleaseInfo(boolean z, String str, String str2, String str3, List list, String str4, List list2, List list3, Changelog changelog, String str5, List list4, Changelog changelog2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : list3, (i & 256) != 0 ? null : changelog, str5, list4, changelog2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(IFirmwareReleaseInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        IFirmwareReleaseInfo iFirmwareReleaseInfo = (IFirmwareReleaseInfo) obj;
        return this.required == iFirmwareReleaseInfo.required && Intrinsics.EZpvd((Object) this.url, (Object) iFirmwareReleaseInfo.url) && Intrinsics.EZpvd((Object) this.resource, (Object) iFirmwareReleaseInfo.resource) && Intrinsics.EZpvd((Object) this.fullResource, (Object) iFirmwareReleaseInfo.fullResource) && Intrinsics.EZpvd(this.fullResourceRange, iFirmwareReleaseInfo.fullResourceRange) && Intrinsics.EZpvd((Object) this.bootloaderResource, (Object) iFirmwareReleaseInfo.bootloaderResource) && Intrinsics.EZpvd(this.bootloaderVersion, iFirmwareReleaseInfo.bootloaderVersion) && Intrinsics.EZpvd(this.bootloaderRelatedFirmwareVersion, iFirmwareReleaseInfo.bootloaderRelatedFirmwareVersion) && Intrinsics.EZpvd(this.bootloaderChangelog, iFirmwareReleaseInfo.bootloaderChangelog) && Intrinsics.EZpvd((Object) this.fingerprint, (Object) iFirmwareReleaseInfo.fingerprint) && Intrinsics.EZpvd(this.version, iFirmwareReleaseInfo.version) && Intrinsics.EZpvd(this.changelog, iFirmwareReleaseInfo.changelog);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.required);
        int iHashCode2 = this.url.hashCode();
        String str = this.resource;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        String str2 = this.fullResource;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        List<String> list = this.fullResourceRange;
        int iHashCode5 = list != null ? list.hashCode() : 0;
        String str3 = this.bootloaderResource;
        int iHashCode6 = str3 != null ? str3.hashCode() : 0;
        List<Long> list2 = this.bootloaderVersion;
        int iHashCode7 = list2 != null ? list2.hashCode() : 0;
        List<Long> list3 = this.bootloaderRelatedFirmwareVersion;
        int iHashCode8 = list3 != null ? list3.hashCode() : 0;
        Changelog changelog = this.bootloaderChangelog;
        int iHashCode9 = changelog != null ? changelog.hashCode() : 0;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + this.fingerprint.hashCode()) * 31) + this.version.hashCode()) * 31) + this.changelog.hashCode();
    }

    public String toString() {
        return "IFirmwareReleaseInfo(required=" + this.required + ", url='" + this.url + "', resource=" + this.resource + ", fullResource=" + this.fullResource + ", fullResourceRange=" + this.fullResourceRange + ", bootloaderResource=" + this.bootloaderResource + ", bootloaderVersion=" + this.bootloaderVersion + ", bootloaderRelatedFirmwareVersion=" + this.bootloaderRelatedFirmwareVersion + ", bootloaderChangelog=" + this.bootloaderChangelog + ", fingerprint='" + this.fingerprint + "', version=" + this.version + ", changelog=" + this.changelog + ")";
    }
}
