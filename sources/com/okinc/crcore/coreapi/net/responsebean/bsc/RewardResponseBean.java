package com.okinc.crcore.coreapi.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class RewardResponseBean implements Parcelable {
    private final String campaignCode;
    private final long endTime;
    private final int inactiveCode;
    private final RewardMetadataResponseBean metadata;
    private final String nextAction;
    private final String recordKey;
    private final List<String> relatedMissions;
    private final String rewardCode;
    private final long startTime;
    private final String status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RewardResponseBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<RewardResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RewardResponseBean(parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt() == 0 ? null : RewardMetadataResponseBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardResponseBean[] newArray(int i) {
            return new RewardResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RewardResponseBean() {
        this((String) null, 0L, 0, (RewardMetadataResponseBean) null, (String) null, (String) null, (List) null, (String) null, 0L, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.campaignCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.inactiveCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardMetadataResponseBean component4() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.nextAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.recordKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.relatedMissions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.rewardCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component9() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardResponseBean copy(@NotNull String str, long j, int i, RewardMetadataResponseBean rewardMetadataResponseBean, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, @NotNull String str4, long j2, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new RewardResponseBean(str, j, i, rewardMetadataResponseBean, str2, str3, list, str4, j2, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardResponseBean)) {
            return false;
        }
        RewardResponseBean rewardResponseBean = (RewardResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.campaignCode, (Object) rewardResponseBean.campaignCode) && this.endTime == rewardResponseBean.endTime && this.inactiveCode == rewardResponseBean.inactiveCode && Intrinsics.EZpvd(this.metadata, rewardResponseBean.metadata) && Intrinsics.EZpvd((Object) this.nextAction, (Object) rewardResponseBean.nextAction) && Intrinsics.EZpvd((Object) this.recordKey, (Object) rewardResponseBean.recordKey) && Intrinsics.EZpvd(this.relatedMissions, rewardResponseBean.relatedMissions) && Intrinsics.EZpvd((Object) this.rewardCode, (Object) rewardResponseBean.rewardCode) && this.startTime == rewardResponseBean.startTime && Intrinsics.EZpvd((Object) this.status, (Object) rewardResponseBean.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInactiveCode() {
        return this.inactiveCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardMetadataResponseBean getMetadata() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextAction() {
        return this.nextAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecordKey() {
        return this.recordKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getRelatedMissions() {
        return this.relatedMissions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardCode() {
        return this.rewardCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.campaignCode.hashCode();
        int iHashCode2 = Long.hashCode(this.endTime);
        int iHashCode3 = Integer.hashCode(this.inactiveCode);
        RewardMetadataResponseBean rewardMetadataResponseBean = this.metadata;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (rewardMetadataResponseBean == null ? 0 : rewardMetadataResponseBean.hashCode())) * 31) + this.nextAction.hashCode()) * 31) + this.recordKey.hashCode()) * 31) + this.relatedMissions.hashCode()) * 31) + this.rewardCode.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + this.status.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RewardResponseBean(campaignCode=" + this.campaignCode + ", endTime=" + this.endTime + ", inactiveCode=" + this.inactiveCode + ", metadata=" + this.metadata + ", nextAction=" + this.nextAction + ", recordKey=" + this.recordKey + ", relatedMissions=" + this.relatedMissions + ", rewardCode=" + this.rewardCode + ", startTime=" + this.startTime + ", status=" + this.status + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.campaignCode);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.inactiveCode);
        RewardMetadataResponseBean rewardMetadataResponseBean = this.metadata;
        if (rewardMetadataResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rewardMetadataResponseBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextAction);
        parcel.writeString(this.recordKey);
        parcel.writeStringList(this.relatedMissions);
        parcel.writeString(this.rewardCode);
        parcel.writeLong(this.startTime);
        parcel.writeString(this.status);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.RewardResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RewardResponseBean> serializer() {
            return RewardResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RewardResponseBean(int i, String str, long j, int i2, RewardMetadataResponseBean rewardMetadataResponseBean, String str2, String str3, List list, String str4, long j2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.campaignCode = "";
        } else {
            this.campaignCode = str;
        }
        if ((i & 2) == 0) {
            this.endTime = 0L;
        } else {
            this.endTime = j;
        }
        this.inactiveCode = (i & 4) == 0 ? 0 : i2;
        this.metadata = (i & 8) == 0 ? null : rewardMetadataResponseBean;
        if ((i & 16) == 0) {
            this.nextAction = "";
        } else {
            this.nextAction = str2;
        }
        if ((i & 32) == 0) {
            this.recordKey = "";
        } else {
            this.recordKey = str3;
        }
        this.relatedMissions = (i & 64) == 0 ? yDY.AhwBna() : list;
        if ((i & 128) == 0) {
            this.rewardCode = "";
        } else {
            this.rewardCode = str4;
        }
        this.startTime = (i & 256) != 0 ? j2 : 0L;
        if ((i & 512) == 0) {
            this.status = "";
        } else {
            this.status = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RewardResponseBean rewardResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) rewardResponseBean.campaignCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, rewardResponseBean.campaignCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rewardResponseBean.endTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, rewardResponseBean.endTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || rewardResponseBean.inactiveCode != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, rewardResponseBean.inactiveCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || rewardResponseBean.metadata != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, RewardMetadataResponseBean$$serializer.INSTANCE, rewardResponseBean.metadata);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) rewardResponseBean.nextAction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, rewardResponseBean.nextAction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) rewardResponseBean.recordKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, rewardResponseBean.recordKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(rewardResponseBean.relatedMissions, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], rewardResponseBean.relatedMissions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) rewardResponseBean.rewardCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, rewardResponseBean.rewardCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || rewardResponseBean.startTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 8, rewardResponseBean.startTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) rewardResponseBean.status, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, rewardResponseBean.status);
    }

    public RewardResponseBean(@NotNull String str, long j, int i, RewardMetadataResponseBean rewardMetadataResponseBean, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, @NotNull String str4, long j2, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.campaignCode = str;
        this.endTime = j;
        this.inactiveCode = i;
        this.metadata = rewardMetadataResponseBean;
        this.nextAction = str2;
        this.recordKey = str3;
        this.relatedMissions = list;
        this.rewardCode = str4;
        this.startTime = j2;
        this.status = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r18v0 int))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.RewardMetadataResponseBean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.RewardMetadataResponseBean) : (r19v0 com.okinc.crcore.coreapi.net.responsebean.bsc.RewardMetadataResponseBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0035: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:94)) : (r22v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0048: ARITH (r27v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r24v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r27v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : (""))
 A[MD:(java.lang.String, long, int, com.okinc.crcore.coreapi.net.responsebean.bsc.RewardMetadataResponseBean, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, long, java.lang.String):void (m)] (LINE:87) call: com.okinc.crcore.coreapi.net.responsebean.bsc.RewardResponseBean.<init>(java.lang.String, long, int, com.okinc.crcore.coreapi.net.responsebean.bsc.RewardMetadataResponseBean, java.lang.String, java.lang.String, java.util.List, java.lang.String, long, java.lang.String):void type: THIS */
    public /* synthetic */ RewardResponseBean(String str, long j, int i, RewardMetadataResponseBean rewardMetadataResponseBean, String str2, String str3, List list, String str4, long j2, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : rewardMetadataResponseBean, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? yDY.AhwBna() : list, (i2 & 128) != 0 ? "" : str4, (i2 & 256) == 0 ? j2 : 0L, (i2 & 512) == 0 ? str5 : "");
    }
}
