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
public final class TrackerTrendRequest {
    public static final KSerializer<Object>[] $childSerializers;
    public final String chainId;
    public final List<String> groupIdList;
    public final String holderCountMin;
    public final String liquidityMax;
    public final String liquidityMin;
    public final String marketCapMax;
    public final String marketCapMin;
    public final int pageNum;
    public final int pageSize;
    public final List<String> tagTypeList;
    public final String timeType;
    public final String tokenAgeMax;
    public final String tokenAgeMin;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerTrendRequest OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, @NotNull List<String> list2, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new TrackerTrendRequest(str, str2, str3, list, list2, str4, str5, str6, str7, str8, str9, str10, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerTrendRequest)) {
            return false;
        }
        TrackerTrendRequest trackerTrendRequest = (TrackerTrendRequest) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) trackerTrendRequest.walletAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) trackerTrendRequest.chainId) && Intrinsics.EZpvd((Object) this.timeType, (Object) trackerTrendRequest.timeType) && Intrinsics.EZpvd(this.tagTypeList, trackerTrendRequest.tagTypeList) && Intrinsics.EZpvd(this.groupIdList, trackerTrendRequest.groupIdList) && Intrinsics.EZpvd((Object) this.holderCountMin, (Object) trackerTrendRequest.holderCountMin) && Intrinsics.EZpvd((Object) this.liquidityMax, (Object) trackerTrendRequest.liquidityMax) && Intrinsics.EZpvd((Object) this.liquidityMin, (Object) trackerTrendRequest.liquidityMin) && Intrinsics.EZpvd((Object) this.marketCapMax, (Object) trackerTrendRequest.marketCapMax) && Intrinsics.EZpvd((Object) this.marketCapMin, (Object) trackerTrendRequest.marketCapMin) && Intrinsics.EZpvd((Object) this.tokenAgeMin, (Object) trackerTrendRequest.tokenAgeMin) && Intrinsics.EZpvd((Object) this.tokenAgeMax, (Object) trackerTrendRequest.tokenAgeMax) && this.pageNum == trackerTrendRequest.pageNum && this.pageSize == trackerTrendRequest.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((this.walletAddress.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.timeType.hashCode()) * 31) + this.tagTypeList.hashCode()) * 31) + this.groupIdList.hashCode()) * 31) + this.holderCountMin.hashCode()) * 31) + this.liquidityMax.hashCode()) * 31) + this.liquidityMin.hashCode()) * 31) + this.marketCapMax.hashCode()) * 31) + this.marketCapMin.hashCode()) * 31) + this.tokenAgeMin.hashCode()) * 31) + this.tokenAgeMax.hashCode()) * 31) + Integer.hashCode(this.pageNum)) * 31) + Integer.hashCode(this.pageSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerTrendRequest(walletAddress=" + this.walletAddress + ", chainId=" + this.chainId + ", timeType=" + this.timeType + ", tagTypeList=" + this.tagTypeList + ", groupIdList=" + this.groupIdList + ", holderCountMin=" + this.holderCountMin + ", liquidityMax=" + this.liquidityMax + ", liquidityMin=" + this.liquidityMin + ", marketCapMax=" + this.marketCapMax + ", marketCapMin=" + this.marketCapMin + ", tokenAgeMin=" + this.tokenAgeMin + ", tokenAgeMax=" + this.tokenAgeMax + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrackerTrendRequest> serializer() {
            return TrackerTrendRequest$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ TrackerTrendRequest(int i, String str, String str2, String str3, List list, List list2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, TrackerTrendRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.walletAddress = str;
        this.chainId = str2;
        this.timeType = str3;
        this.tagTypeList = (i & 8) == 0 ? yDY.AhwBna() : list;
        this.groupIdList = (i & 16) == 0 ? yDY.AhwBna() : list2;
        if ((i & 32) == 0) {
            this.holderCountMin = "";
        } else {
            this.holderCountMin = str4;
        }
        if ((i & 64) == 0) {
            this.liquidityMax = "";
        } else {
            this.liquidityMax = str5;
        }
        if ((i & 128) == 0) {
            this.liquidityMin = "";
        } else {
            this.liquidityMin = str6;
        }
        if ((i & 256) == 0) {
            this.marketCapMax = "";
        } else {
            this.marketCapMax = str7;
        }
        if ((i & 512) == 0) {
            this.marketCapMin = "";
        } else {
            this.marketCapMin = str8;
        }
        if ((i & 1024) == 0) {
            this.tokenAgeMin = "";
        } else {
            this.tokenAgeMin = str9;
        }
        if ((i & 2048) == 0) {
            this.tokenAgeMax = "";
        } else {
            this.tokenAgeMax = str10;
        }
        this.pageNum = (i & 4096) == 0 ? 1 : i2;
        this.pageSize = (i & 8192) == 0 ? 10 : i3;
    }

    public static final /* synthetic */ void EZpvd(TrackerTrendRequest trackerTrendRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, trackerTrendRequest.walletAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, trackerTrendRequest.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, trackerTrendRequest.timeType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(trackerTrendRequest.tagTypeList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], trackerTrendRequest.tagTypeList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(trackerTrendRequest.groupIdList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], trackerTrendRequest.groupIdList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) trackerTrendRequest.holderCountMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, trackerTrendRequest.holderCountMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) trackerTrendRequest.liquidityMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, trackerTrendRequest.liquidityMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) trackerTrendRequest.liquidityMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, trackerTrendRequest.liquidityMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) trackerTrendRequest.marketCapMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, trackerTrendRequest.marketCapMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) trackerTrendRequest.marketCapMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, trackerTrendRequest.marketCapMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) trackerTrendRequest.tokenAgeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, trackerTrendRequest.tokenAgeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) trackerTrendRequest.tokenAgeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, trackerTrendRequest.tokenAgeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || trackerTrendRequest.pageNum != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, trackerTrendRequest.pageNum);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && trackerTrendRequest.pageSize == 10) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 13, trackerTrendRequest.pageSize);
    }

    public TrackerTrendRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, @NotNull List<String> list2, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.walletAddress = str;
        this.chainId = str2;
        this.timeType = str3;
        this.tagTypeList = list;
        this.groupIdList = list2;
        this.holderCountMin = str4;
        this.liquidityMax = str5;
        this.liquidityMin = str6;
        this.marketCapMax = str7;
        this.marketCapMin = str8;
        this.tokenAgeMin = str9;
        this.tokenAgeMax = str10;
        this.pageNum = i;
        this.pageSize = i2;
    }
}
