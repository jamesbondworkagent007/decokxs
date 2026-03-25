package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupVoiceCallData implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private List<GroupVoiceCallUser> activeUsers;
    private String endTime;
    private List<String> historicalUids;
    private String initiatorUid;
    private Integer maxParticipants;
    private String startTime;
    private Integer state;
    private List<String> targetUids;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GroupVoiceCallData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<GroupVoiceCallData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupVoiceCallData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(GroupVoiceCallUser.CREATOR.createFromParcel(parcel));
                }
            }
            return new GroupVoiceCallData(string, arrayListCreateStringArrayList, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupVoiceCallData[] newArray(int i) {
            return new GroupVoiceCallData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupVoiceCallData() {
        this((String) null, (List) null, (List) null, (Integer) null, (String) null, (List) null, (Integer) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.initiatorUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.historicalUids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupVoiceCallUser> component3() {
        return this.activeUsers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.targetUids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.maxParticipants;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupVoiceCallData copy(String str, List<String> list, List<GroupVoiceCallUser> list2, Integer num, String str2, List<String> list3, Integer num2, String str3) {
        return new GroupVoiceCallData(str, list, list2, num, str2, list3, num2, str3);
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
        if (!(obj instanceof GroupVoiceCallData)) {
            return false;
        }
        GroupVoiceCallData groupVoiceCallData = (GroupVoiceCallData) obj;
        return Intrinsics.EZpvd((Object) this.initiatorUid, (Object) groupVoiceCallData.initiatorUid) && Intrinsics.EZpvd(this.historicalUids, groupVoiceCallData.historicalUids) && Intrinsics.EZpvd(this.activeUsers, groupVoiceCallData.activeUsers) && Intrinsics.EZpvd(this.state, groupVoiceCallData.state) && Intrinsics.EZpvd((Object) this.startTime, (Object) groupVoiceCallData.startTime) && Intrinsics.EZpvd(this.targetUids, groupVoiceCallData.targetUids) && Intrinsics.EZpvd(this.maxParticipants, groupVoiceCallData.maxParticipants) && Intrinsics.EZpvd((Object) this.endTime, (Object) groupVoiceCallData.endTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupVoiceCallUser> getActiveUsers() {
        return this.activeUsers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getHistoricalUids() {
        return this.historicalUids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitiatorUid() {
        return this.initiatorUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMaxParticipants() {
        return this.maxParticipants;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTargetUids() {
        return this.targetUids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.initiatorUid;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<String> list = this.historicalUids;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List<GroupVoiceCallUser> list2 = this.activeUsers;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        Integer num = this.state;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str2 = this.startTime;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        List<String> list3 = this.targetUids;
        int iHashCode6 = list3 == null ? 0 : list3.hashCode();
        Integer num2 = this.maxParticipants;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.endTime;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActiveUsers(List<GroupVoiceCallUser> list) {
        this.activeUsers = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndTime(String str) {
        this.endTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHistoricalUids(List<String> list) {
        this.historicalUids = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitiatorUid(String str) {
        this.initiatorUid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxParticipants(Integer num) {
        this.maxParticipants = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStartTime(String str) {
        this.startTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(Integer num) {
        this.state = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetUids(List<String> list) {
        this.targetUids = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupVoiceCallData(initiatorUid=" + this.initiatorUid + ", historicalUids=" + this.historicalUids + ", activeUsers=" + this.activeUsers + ", state=" + this.state + ", startTime=" + this.startTime + ", targetUids=" + this.targetUids + ", maxParticipants=" + this.maxParticipants + ", endTime=" + this.endTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.initiatorUid);
        parcel.writeStringList(this.historicalUids);
        List<GroupVoiceCallUser> list = this.activeUsers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<GroupVoiceCallUser> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.state;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.startTime);
        parcel.writeStringList(this.targetUids);
        Integer num2 = this.maxParticipants;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.endTime);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.GroupVoiceCallData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupVoiceCallData> serializer() {
            return GroupVoiceCallData$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(GroupVoiceCallUser$$serializer.INSTANCE), null, null, new ArrayListSerializer(stringSerializer), null, null};
    }

    public /* synthetic */ GroupVoiceCallData(int i, String str, List list, List list2, Integer num, String str2, List list3, Integer num2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.initiatorUid = null;
        } else {
            this.initiatorUid = str;
        }
        if ((i & 2) == 0) {
            this.historicalUids = null;
        } else {
            this.historicalUids = list;
        }
        if ((i & 4) == 0) {
            this.activeUsers = null;
        } else {
            this.activeUsers = list2;
        }
        if ((i & 8) == 0) {
            this.state = null;
        } else {
            this.state = num;
        }
        if ((i & 16) == 0) {
            this.startTime = null;
        } else {
            this.startTime = str2;
        }
        if ((i & 32) == 0) {
            this.targetUids = null;
        } else {
            this.targetUids = list3;
        }
        if ((i & 64) == 0) {
            this.maxParticipants = null;
        } else {
            this.maxParticipants = num2;
        }
        if ((i & 128) == 0) {
            this.endTime = null;
        } else {
            this.endTime = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupVoiceCallData groupVoiceCallData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || groupVoiceCallData.initiatorUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, groupVoiceCallData.initiatorUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupVoiceCallData.historicalUids != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], groupVoiceCallData.historicalUids);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || groupVoiceCallData.activeUsers != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], groupVoiceCallData.activeUsers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || groupVoiceCallData.state != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, groupVoiceCallData.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || groupVoiceCallData.startTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, groupVoiceCallData.startTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || groupVoiceCallData.targetUids != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], groupVoiceCallData.targetUids);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || groupVoiceCallData.maxParticipants != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, groupVoiceCallData.maxParticipants);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && groupVoiceCallData.endTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, groupVoiceCallData.endTime);
    }

    public GroupVoiceCallData(String str, List<String> list, List<GroupVoiceCallUser> list2, Integer num, String str2, List<String> list3, Integer num2, String str3) {
        this.initiatorUid = str;
        this.historicalUids = list;
        this.activeUsers = list2;
        this.state = num;
        this.startTime = str2;
        this.targetUids = list3;
        this.maxParticipants = num2;
        this.endTime = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r15v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.util.List<com.okinc.okimcore.model.im.GroupVoiceCallUser>, java.lang.Integer, java.lang.String, java.util.List<java.lang.String>, java.lang.Integer, java.lang.String):void (m)] (LINE:11) call: com.okinc.okimcore.model.im.GroupVoiceCallData.<init>(java.lang.String, java.util.List, java.util.List, java.lang.Integer, java.lang.String, java.util.List, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ GroupVoiceCallData(String str, List list, List list2, Integer num, String str2, List list3, Integer num2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : num2, (i & 128) == 0 ? str3 : null);
    }
}
