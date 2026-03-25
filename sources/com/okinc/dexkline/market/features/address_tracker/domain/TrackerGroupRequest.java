package com.okinc.dexkline.market.features.address_tracker.domain;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TrackerGroupRequest {
    public static final int $stable = 0;
    public final Integer groupId;
    public final String groupName;
    public final TrackerOperationType operationType;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, TrackerOperationType.Companion.serializer()};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrackerGroupRequest() {
        this((String) null, (String) null, (Integer) null, (TrackerOperationType) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TrackerGroupRequest copy$default(TrackerGroupRequest trackerGroupRequest, String str, String str2, Integer num, TrackerOperationType trackerOperationType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackerGroupRequest.walletAddress;
        }
        if ((i & 2) != 0) {
            str2 = trackerGroupRequest.groupName;
        }
        if ((i & 4) != 0) {
            num = trackerGroupRequest.groupId;
        }
        if ((i & 8) != 0) {
            trackerOperationType = trackerGroupRequest.operationType;
        }
        return trackerGroupRequest.OLrzqt(str, str2, num, trackerOperationType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerGroupRequest OLrzqt(@NotNull String str, String str2, Integer num, @NotNull TrackerOperationType trackerOperationType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackerOperationType, "");
        return new TrackerGroupRequest(str, str2, num, trackerOperationType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerGroupRequest)) {
            return false;
        }
        TrackerGroupRequest trackerGroupRequest = (TrackerGroupRequest) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) trackerGroupRequest.walletAddress) && Intrinsics.EZpvd((Object) this.groupName, (Object) trackerGroupRequest.groupName) && Intrinsics.EZpvd(this.groupId, trackerGroupRequest.groupId) && this.operationType == trackerGroupRequest.operationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.walletAddress.hashCode();
        String str = this.groupName;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.groupId;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.operationType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerGroupRequest(walletAddress=" + this.walletAddress + ", groupName=" + this.groupName + ", groupId=" + this.groupId + ", operationType=" + this.operationType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.features.address_tracker.domain.TrackerGroupRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrackerGroupRequest> serializer() {
            return TrackerGroupRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrackerGroupRequest(int i, String str, String str2, Integer num, TrackerOperationType trackerOperationType, SerializationConstructorMarker serializationConstructorMarker) {
        this.walletAddress = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.groupName = null;
        } else {
            this.groupName = str2;
        }
        if ((i & 4) == 0) {
            this.groupId = null;
        } else {
            this.groupId = num;
        }
        if ((i & 8) == 0) {
            this.operationType = TrackerOperationType.ADD;
        } else {
            this.operationType = trackerOperationType;
        }
    }

    public static final /* synthetic */ void copydefault(TrackerGroupRequest trackerGroupRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) trackerGroupRequest.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, trackerGroupRequest.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || trackerGroupRequest.groupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, trackerGroupRequest.groupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || trackerGroupRequest.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, trackerGroupRequest.groupId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && trackerGroupRequest.operationType == TrackerOperationType.ADD) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], trackerGroupRequest.operationType);
    }

    public TrackerGroupRequest(@NotNull String str, String str2, Integer num, @NotNull TrackerOperationType trackerOperationType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackerOperationType, "");
        this.walletAddress = str;
        this.groupName = str2;
        this.groupId = num;
        this.operationType = trackerOperationType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:com.okinc.dexkline.market.features.address_tracker.domain.TrackerOperationType:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.dexkline.market.features.address_tracker.domain.TrackerOperationType:0x0015: SGET  A[WRAPPED] (LINE:25) com.okinc.dexkline.market.features.address_tracker.domain.TrackerOperationType.ADD com.okinc.dexkline.market.features.address_tracker.domain.TrackerOperationType) : (r5v0 com.okinc.dexkline.market.features.address_tracker.domain.TrackerOperationType))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, com.okinc.dexkline.market.features.address_tracker.domain.TrackerOperationType):void (m)] (LINE:17) call: com.okinc.dexkline.market.features.address_tracker.domain.TrackerGroupRequest.<init>(java.lang.String, java.lang.String, java.lang.Integer, com.okinc.dexkline.market.features.address_tracker.domain.TrackerOperationType):void type: THIS */
    public /* synthetic */ TrackerGroupRequest(String str, String str2, Integer num, TrackerOperationType trackerOperationType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? TrackerOperationType.ADD : trackerOperationType);
    }
}
