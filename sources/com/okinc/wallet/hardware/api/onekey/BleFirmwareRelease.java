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
public final class BleFirmwareRelease {
    private final List<Changelog> changelog;
    private final IBLEFirmwareReleaseInfo release;
    private final String status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(Changelog$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Changelog> getChangelog() {
        return this.changelog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IBLEFirmwareReleaseInfo getRelease() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.BleFirmwareRelease.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BleFirmwareRelease> serializer() {
            return BleFirmwareRelease$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BleFirmwareRelease(int i, String str, List list, IBLEFirmwareReleaseInfo iBLEFirmwareReleaseInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, BleFirmwareRelease$$serializer.INSTANCE.getDescriptor());
        }
        this.status = str;
        this.changelog = list;
        if ((i & 4) == 0) {
            this.release = null;
        } else {
            this.release = iBLEFirmwareReleaseInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(BleFirmwareRelease bleFirmwareRelease, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, bleFirmwareRelease.status);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], bleFirmwareRelease.changelog);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && bleFirmwareRelease.release == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IBLEFirmwareReleaseInfo$$serializer.INSTANCE, bleFirmwareRelease.release);
    }

    public BleFirmwareRelease(@NotNull String str, @NotNull List<Changelog> list, IBLEFirmwareReleaseInfo iBLEFirmwareReleaseInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.status = str;
        this.changelog = list;
        this.release = iBLEFirmwareReleaseInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.util.List)
  (wrap:com.okinc.wallet.hardware.api.onekey.IBLEFirmwareReleaseInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.IBLEFirmwareReleaseInfo) : (r3v0 com.okinc.wallet.hardware.api.onekey.IBLEFirmwareReleaseInfo))
 A[MD:(java.lang.String, java.util.List<com.okinc.wallet.hardware.api.onekey.Changelog>, com.okinc.wallet.hardware.api.onekey.IBLEFirmwareReleaseInfo):void (m)] (LINE:132) call: com.okinc.wallet.hardware.api.onekey.BleFirmwareRelease.<init>(java.lang.String, java.util.List, com.okinc.wallet.hardware.api.onekey.IBLEFirmwareReleaseInfo):void type: THIS */
    public /* synthetic */ BleFirmwareRelease(String str, List list, IBLEFirmwareReleaseInfo iBLEFirmwareReleaseInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : iBLEFirmwareReleaseInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(BleFirmwareRelease.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        BleFirmwareRelease bleFirmwareRelease = (BleFirmwareRelease) obj;
        return Intrinsics.EZpvd((Object) this.status, (Object) bleFirmwareRelease.status) && Intrinsics.EZpvd(this.changelog, bleFirmwareRelease.changelog) && Intrinsics.EZpvd(this.release, bleFirmwareRelease.release);
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode();
        int iHashCode2 = this.changelog.hashCode();
        IBLEFirmwareReleaseInfo iBLEFirmwareReleaseInfo = this.release;
        return (((iHashCode * 31) + iHashCode2) * 31) + (iBLEFirmwareReleaseInfo != null ? iBLEFirmwareReleaseInfo.hashCode() : 0);
    }

    public String toString() {
        return "BleFirmwareRelease(status='" + this.status + "', changelog=" + this.changelog + ", release=" + this.release + ")";
    }
}
