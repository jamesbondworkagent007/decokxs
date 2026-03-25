package com.okinc.crcore.coreapi.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CampaignResponseBean implements Parcelable {
    private final String campaignCode;
    private final long endTime;
    private final int inactiveCode;
    private final List<MissionResponseBean> missions;
    private final String nextAction;
    private final String recordKey;
    private final List<RewardResponseBean> rewards;
    private final long startTime;
    private final String status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CampaignResponseBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(MissionResponseBean$$serializer.INSTANCE), null, null, new ArrayListSerializer(RewardResponseBean$$serializer.INSTANCE), null, null};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<CampaignResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CampaignResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            long j = parcel.readLong();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(MissionResponseBean.CREATOR.createFromParcel(parcel));
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList2.add(RewardResponseBean.CREATOR.createFromParcel(parcel));
            }
            return new CampaignResponseBean(string, j, i, arrayList, string2, string3, arrayList2, parcel.readLong(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CampaignResponseBean[] newArray(int i) {
            return new CampaignResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CampaignResponseBean() {
        this((String) null, 0L, 0, (List) null, (String) null, (String) null, (List) null, 0L, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.campaignCode;
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
    public final List<MissionResponseBean> component4() {
        return this.missions;
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
    public final List<RewardResponseBean> component7() {
        return this.rewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component8() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CampaignResponseBean copy(@NotNull String str, long j, int i, @NotNull List<MissionResponseBean> list, @NotNull String str2, @NotNull String str3, @NotNull List<RewardResponseBean> list2, long j2, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new CampaignResponseBean(str, j, i, list, str2, str3, list2, j2, str4);
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
        if (!(obj instanceof CampaignResponseBean)) {
            return false;
        }
        CampaignResponseBean campaignResponseBean = (CampaignResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.campaignCode, (Object) campaignResponseBean.campaignCode) && this.endTime == campaignResponseBean.endTime && this.inactiveCode == campaignResponseBean.inactiveCode && Intrinsics.EZpvd(this.missions, campaignResponseBean.missions) && Intrinsics.EZpvd((Object) this.nextAction, (Object) campaignResponseBean.nextAction) && Intrinsics.EZpvd((Object) this.recordKey, (Object) campaignResponseBean.recordKey) && Intrinsics.EZpvd(this.rewards, campaignResponseBean.rewards) && this.startTime == campaignResponseBean.startTime && Intrinsics.EZpvd((Object) this.status, (Object) campaignResponseBean.status);
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
    public final List<MissionResponseBean> getMissions() {
        return this.missions;
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
    public final List<RewardResponseBean> getRewards() {
        return this.rewards;
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
        return (((((((((((((((this.campaignCode.hashCode() * 31) + Long.hashCode(this.endTime)) * 31) + Integer.hashCode(this.inactiveCode)) * 31) + this.missions.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.recordKey.hashCode()) * 31) + this.rewards.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + this.status.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CampaignResponseBean(campaignCode=" + this.campaignCode + ", endTime=" + this.endTime + ", inactiveCode=" + this.inactiveCode + ", missions=" + this.missions + ", nextAction=" + this.nextAction + ", recordKey=" + this.recordKey + ", rewards=" + this.rewards + ", startTime=" + this.startTime + ", status=" + this.status + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.campaignCode);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.inactiveCode);
        List<MissionResponseBean> list = this.missions;
        parcel.writeInt(list.size());
        Iterator<MissionResponseBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextAction);
        parcel.writeString(this.recordKey);
        List<RewardResponseBean> list2 = this.rewards;
        parcel.writeInt(list2.size());
        Iterator<RewardResponseBean> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeLong(this.startTime);
        parcel.writeString(this.status);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.CampaignResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CampaignResponseBean> serializer() {
            return CampaignResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CampaignResponseBean(int i, String str, long j, int i2, List list, String str2, String str3, List list2, long j2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
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
        this.missions = (i & 8) == 0 ? yDY.AhwBna() : list;
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
        this.rewards = (i & 64) == 0 ? yDY.AhwBna() : list2;
        this.startTime = (i & 128) != 0 ? j2 : 0L;
        if ((i & 256) == 0) {
            this.status = "";
        } else {
            this.status = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CampaignResponseBean campaignResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) campaignResponseBean.campaignCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, campaignResponseBean.campaignCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || campaignResponseBean.endTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, campaignResponseBean.endTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || campaignResponseBean.inactiveCode != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, campaignResponseBean.inactiveCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(campaignResponseBean.missions, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], campaignResponseBean.missions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) campaignResponseBean.nextAction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, campaignResponseBean.nextAction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) campaignResponseBean.recordKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, campaignResponseBean.recordKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(campaignResponseBean.rewards, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], campaignResponseBean.rewards);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || campaignResponseBean.startTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 7, campaignResponseBean.startTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) campaignResponseBean.status, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, campaignResponseBean.status);
    }

    public CampaignResponseBean(@NotNull String str, long j, int i, @NotNull List<MissionResponseBean> list, @NotNull String str2, @NotNull String str3, @NotNull List<RewardResponseBean> list2, long j2, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.campaignCode = str;
        this.endTime = j;
        this.inactiveCode = i;
        this.missions = list;
        this.nextAction = str2;
        this.recordKey = str3;
        this.rewards = list2;
        this.startTime = j2;
        this.status = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0062: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001c: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:20)) : (r18v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0037: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:23)) : (r21v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0042: ARITH (r25v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r22v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r25v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (""))
 A[MD:(java.lang.String, long, int, java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.MissionResponseBean>, java.lang.String, java.lang.String, java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.RewardResponseBean>, long, java.lang.String):void (m)] (LINE:15) call: com.okinc.crcore.coreapi.net.responsebean.bsc.CampaignResponseBean.<init>(java.lang.String, long, int, java.util.List, java.lang.String, java.lang.String, java.util.List, long, java.lang.String):void type: THIS */
    public /* synthetic */ CampaignResponseBean(String str, long j, int i, List list, String str2, String str3, List list2, long j2, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? yDY.AhwBna() : list, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? yDY.AhwBna() : list2, (i2 & 128) == 0 ? j2 : 0L, (i2 & 256) == 0 ? str4 : "");
    }
}
