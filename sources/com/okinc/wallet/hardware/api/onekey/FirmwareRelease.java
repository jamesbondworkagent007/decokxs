package com.okinc.wallet.hardware.api.onekey;

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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class FirmwareRelease {
    private final List<Changelog> changelog;
    private final IFirmwareReleaseInfo release;
    private final String status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(Changelog$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Changelog> getChangelog() {
        return this.changelog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IFirmwareReleaseInfo getRelease() {
        return this.release;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.FirmwareRelease.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FirmwareRelease> serializer() {
            return FirmwareRelease$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FirmwareRelease(int i, String str, List list, IFirmwareReleaseInfo iFirmwareReleaseInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, FirmwareRelease$$serializer.INSTANCE.getDescriptor());
        }
        this.status = str;
        this.changelog = list;
        if ((i & 4) == 0) {
            this.release = null;
        } else {
            this.release = iFirmwareReleaseInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(FirmwareRelease firmwareRelease, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, firmwareRelease.status);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], firmwareRelease.changelog);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && firmwareRelease.release == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IFirmwareReleaseInfo$$serializer.INSTANCE, firmwareRelease.release);
    }

    public FirmwareRelease(@NotNull String str, @NotNull List<Changelog> list, IFirmwareReleaseInfo iFirmwareReleaseInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.status = str;
        this.changelog = list;
        this.release = iFirmwareReleaseInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.util.List)
  (wrap:com.okinc.wallet.hardware.api.onekey.IFirmwareReleaseInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.IFirmwareReleaseInfo) : (r3v0 com.okinc.wallet.hardware.api.onekey.IFirmwareReleaseInfo))
 A[MD:(java.lang.String, java.util.List<com.okinc.wallet.hardware.api.onekey.Changelog>, com.okinc.wallet.hardware.api.onekey.IFirmwareReleaseInfo):void (m)] (LINE:29) call: com.okinc.wallet.hardware.api.onekey.FirmwareRelease.<init>(java.lang.String, java.util.List, com.okinc.wallet.hardware.api.onekey.IFirmwareReleaseInfo):void type: THIS */
    public /* synthetic */ FirmwareRelease(String str, List list, IFirmwareReleaseInfo iFirmwareReleaseInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : iFirmwareReleaseInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(FirmwareRelease.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        FirmwareRelease firmwareRelease = (FirmwareRelease) obj;
        return Intrinsics.EZpvd((Object) this.status, (Object) firmwareRelease.status) && Intrinsics.EZpvd(this.changelog, firmwareRelease.changelog) && Intrinsics.EZpvd(this.release, firmwareRelease.release);
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode();
        int iHashCode2 = this.changelog.hashCode();
        IFirmwareReleaseInfo iFirmwareReleaseInfo = this.release;
        return (((iHashCode * 31) + iHashCode2) * 31) + (iFirmwareReleaseInfo != null ? iFirmwareReleaseInfo.hashCode() : 0);
    }

    public String toString() {
        return "FirmwareRelease(status='" + this.status + "', changelog=" + this.changelog + ", release=" + this.release + ")";
    }
}
