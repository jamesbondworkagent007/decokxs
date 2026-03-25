package com.okinc.business.market.features.address_tracker_sa.ui.tracker.model;

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
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TrackerTrendDetailRequest {
    public static final KSerializer<Object>[] $childSerializers;
    public final String chainId;
    public final List<String> groupIdList;
    public final int pageNum;
    public final int pageSize;
    public final List<String> tagTypeList;
    public final String timeType;
    public final String tokenContractAddress;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerTrendDetailRequest EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, @NotNull List<String> list2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new TrackerTrendDetailRequest(str, str2, str3, str4, list, list2, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerTrendDetailRequest)) {
            return false;
        }
        TrackerTrendDetailRequest trackerTrendDetailRequest = (TrackerTrendDetailRequest) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) trackerTrendDetailRequest.walletAddress) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) trackerTrendDetailRequest.tokenContractAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) trackerTrendDetailRequest.chainId) && Intrinsics.EZpvd((Object) this.timeType, (Object) trackerTrendDetailRequest.timeType) && Intrinsics.EZpvd(this.tagTypeList, trackerTrendDetailRequest.tagTypeList) && Intrinsics.EZpvd(this.groupIdList, trackerTrendDetailRequest.groupIdList) && this.pageNum == trackerTrendDetailRequest.pageNum && this.pageSize == trackerTrendDetailRequest.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.walletAddress.hashCode() * 31) + this.tokenContractAddress.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.timeType.hashCode()) * 31) + this.tagTypeList.hashCode()) * 31) + this.groupIdList.hashCode()) * 31) + Integer.hashCode(this.pageNum)) * 31) + Integer.hashCode(this.pageSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerTrendDetailRequest(walletAddress=" + this.walletAddress + ", tokenContractAddress=" + this.tokenContractAddress + ", chainId=" + this.chainId + ", timeType=" + this.timeType + ", tagTypeList=" + this.tagTypeList + ", groupIdList=" + this.groupIdList + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendDetailRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrackerTrendDetailRequest> serializer() {
            return TrackerTrendDetailRequest$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null};
    }

    public /* synthetic */ TrackerTrendDetailRequest(int i, String str, String str2, String str3, String str4, List list, List list2, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, TrackerTrendDetailRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.walletAddress = str;
        this.tokenContractAddress = str2;
        this.chainId = str3;
        this.timeType = str4;
        if ((i & 16) == 0) {
            this.tagTypeList = yDY.AhwBna();
        } else {
            this.tagTypeList = list;
        }
        if ((i & 32) == 0) {
            this.groupIdList = yDY.AhwBna();
        } else {
            this.groupIdList = list2;
        }
        if ((i & 64) == 0) {
            this.pageNum = 1;
        } else {
            this.pageNum = i2;
        }
        if ((i & 128) == 0) {
            this.pageSize = 10;
        } else {
            this.pageSize = i3;
        }
    }

    public static final /* synthetic */ void EZpvd(TrackerTrendDetailRequest trackerTrendDetailRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, trackerTrendDetailRequest.walletAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, trackerTrendDetailRequest.tokenContractAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, trackerTrendDetailRequest.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, trackerTrendDetailRequest.timeType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(trackerTrendDetailRequest.tagTypeList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], trackerTrendDetailRequest.tagTypeList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(trackerTrendDetailRequest.groupIdList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], trackerTrendDetailRequest.groupIdList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || trackerTrendDetailRequest.pageNum != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, trackerTrendDetailRequest.pageNum);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && trackerTrendDetailRequest.pageSize == 10) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 7, trackerTrendDetailRequest.pageSize);
    }

    public TrackerTrendDetailRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, @NotNull List<String> list2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.walletAddress = str;
        this.tokenContractAddress = str2;
        this.chainId = str3;
        this.timeType = str4;
        this.tagTypeList = list;
        this.groupIdList = list2;
        this.pageNum = i;
        this.pageSize = i2;
    }
}
