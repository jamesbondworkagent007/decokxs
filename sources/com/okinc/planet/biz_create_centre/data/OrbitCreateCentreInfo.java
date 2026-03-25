package com.okinc.planet.biz_create_centre.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class OrbitCreateCentreInfo implements Parcelable {
    public static final int $stable = 0;
    private final ContentsData contentsData;
    private final Long endTime;
    private final GroupsData groupsData;
    private final LiveStreamsData liveStreamsData;
    private final Long startTime;
    private final String totalPaidOutUsd;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OrbitCreateCentreInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<OrbitCreateCentreInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrbitCreateCentreInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OrbitCreateCentreInfo(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : ContentsData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LiveStreamsData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GroupsData.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrbitCreateCentreInfo[] newArray(int i) {
            return new OrbitCreateCentreInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrbitCreateCentreInfo() {
        this((Long) null, (Long) null, (String) null, (ContentsData) null, (LiveStreamsData) null, (GroupsData) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OrbitCreateCentreInfo copy$default(OrbitCreateCentreInfo orbitCreateCentreInfo, Long l, Long l2, String str, ContentsData contentsData, LiveStreamsData liveStreamsData, GroupsData groupsData, int i, Object obj) {
        if ((i & 1) != 0) {
            l = orbitCreateCentreInfo.startTime;
        }
        if ((i & 2) != 0) {
            l2 = orbitCreateCentreInfo.endTime;
        }
        Long l3 = l2;
        if ((i & 4) != 0) {
            str = orbitCreateCentreInfo.totalPaidOutUsd;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            contentsData = orbitCreateCentreInfo.contentsData;
        }
        ContentsData contentsData2 = contentsData;
        if ((i & 16) != 0) {
            liveStreamsData = orbitCreateCentreInfo.liveStreamsData;
        }
        LiveStreamsData liveStreamsData2 = liveStreamsData;
        if ((i & 32) != 0) {
            groupsData = orbitCreateCentreInfo.groupsData;
        }
        return orbitCreateCentreInfo.copy(l, l3, str2, contentsData2, liveStreamsData2, groupsData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.totalPaidOutUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentsData component4() {
        return this.contentsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveStreamsData component5() {
        return this.liveStreamsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupsData component6() {
        return this.groupsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrbitCreateCentreInfo copy(Long l, Long l2, String str, ContentsData contentsData, LiveStreamsData liveStreamsData, GroupsData groupsData) {
        return new OrbitCreateCentreInfo(l, l2, str, contentsData, liveStreamsData, groupsData);
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
        if (!(obj instanceof OrbitCreateCentreInfo)) {
            return false;
        }
        OrbitCreateCentreInfo orbitCreateCentreInfo = (OrbitCreateCentreInfo) obj;
        return Intrinsics.EZpvd(this.startTime, orbitCreateCentreInfo.startTime) && Intrinsics.EZpvd(this.endTime, orbitCreateCentreInfo.endTime) && Intrinsics.EZpvd((Object) this.totalPaidOutUsd, (Object) orbitCreateCentreInfo.totalPaidOutUsd) && Intrinsics.EZpvd(this.contentsData, orbitCreateCentreInfo.contentsData) && Intrinsics.EZpvd(this.liveStreamsData, orbitCreateCentreInfo.liveStreamsData) && Intrinsics.EZpvd(this.groupsData, orbitCreateCentreInfo.groupsData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentsData getContentsData() {
        return this.contentsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupsData getGroupsData() {
        return this.groupsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveStreamsData getLiveStreamsData() {
        return this.liveStreamsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPaidOutUsd() {
        return this.totalPaidOutUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.startTime;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.endTime;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        String str = this.totalPaidOutUsd;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        ContentsData contentsData = this.contentsData;
        int iHashCode4 = contentsData == null ? 0 : contentsData.hashCode();
        LiveStreamsData liveStreamsData = this.liveStreamsData;
        int iHashCode5 = liveStreamsData == null ? 0 : liveStreamsData.hashCode();
        GroupsData groupsData = this.groupsData;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (groupsData != null ? groupsData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrbitCreateCentreInfo(startTime=" + this.startTime + ", endTime=" + this.endTime + ", totalPaidOutUsd=" + this.totalPaidOutUsd + ", contentsData=" + this.contentsData + ", liveStreamsData=" + this.liveStreamsData + ", groupsData=" + this.groupsData + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.startTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.endTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.totalPaidOutUsd);
        ContentsData contentsData = this.contentsData;
        if (contentsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contentsData.writeToParcel(parcel, i);
        }
        LiveStreamsData liveStreamsData = this.liveStreamsData;
        if (liveStreamsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            liveStreamsData.writeToParcel(parcel, i);
        }
        GroupsData groupsData = this.groupsData;
        if (groupsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsData.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_create_centre.data.OrbitCreateCentreInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrbitCreateCentreInfo> serializer() {
            return OrbitCreateCentreInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrbitCreateCentreInfo(int i, Long l, Long l2, String str, ContentsData contentsData, LiveStreamsData liveStreamsData, GroupsData groupsData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.startTime = null;
        } else {
            this.startTime = l;
        }
        if ((i & 2) == 0) {
            this.endTime = null;
        } else {
            this.endTime = l2;
        }
        if ((i & 4) == 0) {
            this.totalPaidOutUsd = null;
        } else {
            this.totalPaidOutUsd = str;
        }
        if ((i & 8) == 0) {
            this.contentsData = null;
        } else {
            this.contentsData = contentsData;
        }
        if ((i & 16) == 0) {
            this.liveStreamsData = null;
        } else {
            this.liveStreamsData = liveStreamsData;
        }
        if ((i & 32) == 0) {
            this.groupsData = null;
        } else {
            this.groupsData = groupsData;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(OrbitCreateCentreInfo orbitCreateCentreInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || orbitCreateCentreInfo.startTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, orbitCreateCentreInfo.startTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || orbitCreateCentreInfo.endTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, orbitCreateCentreInfo.endTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || orbitCreateCentreInfo.totalPaidOutUsd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, orbitCreateCentreInfo.totalPaidOutUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || orbitCreateCentreInfo.contentsData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, ContentsData$$serializer.INSTANCE, orbitCreateCentreInfo.contentsData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || orbitCreateCentreInfo.liveStreamsData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LiveStreamsData$$serializer.INSTANCE, orbitCreateCentreInfo.liveStreamsData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && orbitCreateCentreInfo.groupsData == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, GroupsData$$serializer.INSTANCE, orbitCreateCentreInfo.groupsData);
    }

    public OrbitCreateCentreInfo(Long l, Long l2, String str, ContentsData contentsData, LiveStreamsData liveStreamsData, GroupsData groupsData) {
        this.startTime = l;
        this.endTime = l2;
        this.totalPaidOutUsd = str;
        this.contentsData = contentsData;
        this.liveStreamsData = liveStreamsData;
        this.groupsData = groupsData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:com.okinc.planet.biz_create_centre.data.ContentsData:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet.biz_create_centre.data.ContentsData) : (r9v0 com.okinc.planet.biz_create_centre.data.ContentsData))
  (wrap:com.okinc.planet.biz_create_centre.data.LiveStreamsData:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet.biz_create_centre.data.LiveStreamsData) : (r10v0 com.okinc.planet.biz_create_centre.data.LiveStreamsData))
  (wrap:com.okinc.planet.biz_create_centre.data.GroupsData:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet.biz_create_centre.data.GroupsData) : (r11v0 com.okinc.planet.biz_create_centre.data.GroupsData))
 A[MD:(java.lang.Long, java.lang.Long, java.lang.String, com.okinc.planet.biz_create_centre.data.ContentsData, com.okinc.planet.biz_create_centre.data.LiveStreamsData, com.okinc.planet.biz_create_centre.data.GroupsData):void (m)] (LINE:11) call: com.okinc.planet.biz_create_centre.data.OrbitCreateCentreInfo.<init>(java.lang.Long, java.lang.Long, java.lang.String, com.okinc.planet.biz_create_centre.data.ContentsData, com.okinc.planet.biz_create_centre.data.LiveStreamsData, com.okinc.planet.biz_create_centre.data.GroupsData):void type: THIS */
    public /* synthetic */ OrbitCreateCentreInfo(Long l, Long l2, String str, ContentsData contentsData, LiveStreamsData liveStreamsData, GroupsData groupsData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : contentsData, (i & 16) != 0 ? null : liveStreamsData, (i & 32) != 0 ? null : groupsData);
    }
}
