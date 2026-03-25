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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TrackerActivityRequest {
    public static final KSerializer<Object>[] $childSerializers;
    public final String chainId;
    public final List<String> groupIdList;
    public final String holderCountMin;
    public final String liquidityMax;
    public final String liquidityMin;
    public final String marketCapMax;
    public final String marketCapMin;
    public final List<String> tagTypeList;
    public final String timeType;
    public final String tokenAgeMax;
    public final String tokenAgeMin;
    public final List<String> userActionTypeList;
    public final String volumeMax;
    public final String volumeMin;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerActivityRequest OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new TrackerActivityRequest(str, str2, str3, list, list2, list3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerActivityRequest)) {
            return false;
        }
        TrackerActivityRequest trackerActivityRequest = (TrackerActivityRequest) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) trackerActivityRequest.walletAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) trackerActivityRequest.chainId) && Intrinsics.EZpvd((Object) this.timeType, (Object) trackerActivityRequest.timeType) && Intrinsics.EZpvd(this.userActionTypeList, trackerActivityRequest.userActionTypeList) && Intrinsics.EZpvd(this.tagTypeList, trackerActivityRequest.tagTypeList) && Intrinsics.EZpvd(this.groupIdList, trackerActivityRequest.groupIdList) && Intrinsics.EZpvd((Object) this.holderCountMin, (Object) trackerActivityRequest.holderCountMin) && Intrinsics.EZpvd((Object) this.liquidityMax, (Object) trackerActivityRequest.liquidityMax) && Intrinsics.EZpvd((Object) this.liquidityMin, (Object) trackerActivityRequest.liquidityMin) && Intrinsics.EZpvd((Object) this.marketCapMax, (Object) trackerActivityRequest.marketCapMax) && Intrinsics.EZpvd((Object) this.marketCapMin, (Object) trackerActivityRequest.marketCapMin) && Intrinsics.EZpvd((Object) this.volumeMax, (Object) trackerActivityRequest.volumeMax) && Intrinsics.EZpvd((Object) this.volumeMin, (Object) trackerActivityRequest.volumeMin) && Intrinsics.EZpvd((Object) this.tokenAgeMin, (Object) trackerActivityRequest.tokenAgeMin) && Intrinsics.EZpvd((Object) this.tokenAgeMax, (Object) trackerActivityRequest.tokenAgeMax);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((this.walletAddress.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.timeType.hashCode()) * 31) + this.userActionTypeList.hashCode()) * 31) + this.tagTypeList.hashCode()) * 31) + this.groupIdList.hashCode()) * 31) + this.holderCountMin.hashCode()) * 31) + this.liquidityMax.hashCode()) * 31) + this.liquidityMin.hashCode()) * 31) + this.marketCapMax.hashCode()) * 31) + this.marketCapMin.hashCode()) * 31) + this.volumeMax.hashCode()) * 31) + this.volumeMin.hashCode()) * 31) + this.tokenAgeMin.hashCode()) * 31) + this.tokenAgeMax.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerActivityRequest(walletAddress=" + this.walletAddress + ", chainId=" + this.chainId + ", timeType=" + this.timeType + ", userActionTypeList=" + this.userActionTypeList + ", tagTypeList=" + this.tagTypeList + ", groupIdList=" + this.groupIdList + ", holderCountMin=" + this.holderCountMin + ", liquidityMax=" + this.liquidityMax + ", liquidityMin=" + this.liquidityMin + ", marketCapMax=" + this.marketCapMax + ", marketCapMin=" + this.marketCapMin + ", volumeMax=" + this.volumeMax + ", volumeMin=" + this.volumeMin + ", tokenAgeMin=" + this.tokenAgeMin + ", tokenAgeMax=" + this.tokenAgeMax + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrackerActivityRequest> serializer() {
            return TrackerActivityRequest$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ TrackerActivityRequest(int i, String str, String str2, String str3, List list, List list2, List list3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if (32767 != (i & 32767)) {
            PluginExceptionsKt.throwMissingFieldException(i, 32767, TrackerActivityRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.walletAddress = str;
        this.chainId = str2;
        this.timeType = str3;
        this.userActionTypeList = list;
        this.tagTypeList = list2;
        this.groupIdList = list3;
        this.holderCountMin = str4;
        this.liquidityMax = str5;
        this.liquidityMin = str6;
        this.marketCapMax = str7;
        this.marketCapMin = str8;
        this.volumeMax = str9;
        this.volumeMin = str10;
        this.tokenAgeMin = str11;
        this.tokenAgeMax = str12;
    }

    public static final /* synthetic */ void OLrzqt(TrackerActivityRequest trackerActivityRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, trackerActivityRequest.walletAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, trackerActivityRequest.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, trackerActivityRequest.timeType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], trackerActivityRequest.userActionTypeList);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], trackerActivityRequest.tagTypeList);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], trackerActivityRequest.groupIdList);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, trackerActivityRequest.holderCountMin);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, trackerActivityRequest.liquidityMax);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, trackerActivityRequest.liquidityMin);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, trackerActivityRequest.marketCapMax);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, trackerActivityRequest.marketCapMin);
        compositeEncoder.encodeStringElement(serialDescriptor, 11, trackerActivityRequest.volumeMax);
        compositeEncoder.encodeStringElement(serialDescriptor, 12, trackerActivityRequest.volumeMin);
        compositeEncoder.encodeStringElement(serialDescriptor, 13, trackerActivityRequest.tokenAgeMin);
        compositeEncoder.encodeStringElement(serialDescriptor, 14, trackerActivityRequest.tokenAgeMax);
    }

    public TrackerActivityRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.walletAddress = str;
        this.chainId = str2;
        this.timeType = str3;
        this.userActionTypeList = list;
        this.tagTypeList = list2;
        this.groupIdList = list3;
        this.holderCountMin = str4;
        this.liquidityMax = str5;
        this.liquidityMin = str6;
        this.marketCapMax = str7;
        this.marketCapMin = str8;
        this.volumeMax = str9;
        this.volumeMin = str10;
        this.tokenAgeMin = str11;
        this.tokenAgeMax = str12;
    }
}
