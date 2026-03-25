package com.okinc.business.market.features.address_tracker_sa.ui.tracker.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TrackerAddressGroup {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final int collectNum;
    public final String groupName;
    public final int groupStatus;
    public final long id;
    public final int sortOrder;
    public final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TrackerAddressGroup copy$default(TrackerAddressGroup trackerAddressGroup, int i, String str, int i2, long j, int i3, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = trackerAddressGroup.collectNum;
        }
        if ((i4 & 2) != 0) {
            str = trackerAddressGroup.groupName;
        }
        String str3 = str;
        if ((i4 & 4) != 0) {
            i2 = trackerAddressGroup.groupStatus;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            j = trackerAddressGroup.id;
        }
        long j2 = j;
        if ((i4 & 16) != 0) {
            i3 = trackerAddressGroup.sortOrder;
        }
        int i6 = i3;
        if ((i4 & 32) != 0) {
            str2 = trackerAddressGroup.walletAddress;
        }
        return trackerAddressGroup.KWHzl(i, str3, i5, j2, i6, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerAddressGroup KWHzl(int i, @NotNull String str, int i2, long j, int i3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TrackerAddressGroup(i, str, i2, j, i3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.collectNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerAddressGroup)) {
            return false;
        }
        TrackerAddressGroup trackerAddressGroup = (TrackerAddressGroup) obj;
        return this.collectNum == trackerAddressGroup.collectNum && Intrinsics.EZpvd((Object) this.groupName, (Object) trackerAddressGroup.groupName) && this.groupStatus == trackerAddressGroup.groupStatus && this.id == trackerAddressGroup.id && this.sortOrder == trackerAddressGroup.sortOrder && Intrinsics.EZpvd((Object) this.walletAddress, (Object) trackerAddressGroup.walletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Integer.hashCode(this.collectNum) * 31) + this.groupName.hashCode()) * 31) + Integer.hashCode(this.groupStatus)) * 31) + Long.hashCode(this.id)) * 31) + Integer.hashCode(this.sortOrder)) * 31) + this.walletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerAddressGroup(collectNum=" + this.collectNum + ", groupName=" + this.groupName + ", groupStatus=" + this.groupStatus + ", id=" + this.id + ", sortOrder=" + this.sortOrder + ", walletAddress=" + this.walletAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressGroup.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrackerAddressGroup> serializer() {
            return TrackerAddressGroup$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrackerAddressGroup(int i, int i2, String str, int i3, long j, int i4, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, TrackerAddressGroup$$serializer.INSTANCE.getDescriptor());
        }
        this.collectNum = i2;
        this.groupName = str;
        this.groupStatus = i3;
        this.id = j;
        this.sortOrder = i4;
        this.walletAddress = str2;
    }

    public static final /* synthetic */ void OLrzqt(TrackerAddressGroup trackerAddressGroup, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, trackerAddressGroup.collectNum);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, trackerAddressGroup.groupName);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, trackerAddressGroup.groupStatus);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, trackerAddressGroup.id);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, trackerAddressGroup.sortOrder);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, trackerAddressGroup.walletAddress);
    }

    public TrackerAddressGroup(int i, @NotNull String str, int i2, long j, int i3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.collectNum = i;
        this.groupName = str;
        this.groupStatus = i2;
        this.id = j;
        this.sortOrder = i3;
        this.walletAddress = str2;
    }
}
