package com.okinc.planet.biz_userprofile.data;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PlanetProfileGroupInfo implements Parcelable {
    public final String groupAvatar;
    public final String groupId;
    public final int memberCount;
    public final List<PlanetProfileSampleMember> sampleMembers;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PlanetProfileGroupInfo> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(PlanetProfileSampleMember$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<PlanetProfileGroupInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetProfileGroupInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(PlanetProfileSampleMember.CREATOR.createFromParcel(parcel));
            }
            return new PlanetProfileGroupInfo(string, string2, i, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetProfileGroupInfo[] newArray(int i) {
            return new PlanetProfileGroupInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetProfileGroupInfo() {
        this((String) null, (String) null, 0, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.planet.biz_userprofile.data.PlanetProfileGroupInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlanetProfileGroupInfo copy$default(PlanetProfileGroupInfo planetProfileGroupInfo, String str, String str2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = planetProfileGroupInfo.groupId;
        }
        if ((i2 & 2) != 0) {
            str2 = planetProfileGroupInfo.groupAvatar;
        }
        if ((i2 & 4) != 0) {
            i = planetProfileGroupInfo.memberCount;
        }
        if ((i2 & 8) != 0) {
            list = planetProfileGroupInfo.sampleMembers;
        }
        return planetProfileGroupInfo.copydefault(str, str2, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetProfileGroupInfo copydefault(@NotNull String str, @NotNull String str2, int i, @NotNull List<PlanetProfileSampleMember> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new PlanetProfileGroupInfo(str, str2, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.groupAvatar;
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
        if (!(obj instanceof PlanetProfileGroupInfo)) {
            return false;
        }
        PlanetProfileGroupInfo planetProfileGroupInfo = (PlanetProfileGroupInfo) obj;
        return Intrinsics.EZpvd((Object) this.groupId, (Object) planetProfileGroupInfo.groupId) && Intrinsics.EZpvd((Object) this.groupAvatar, (Object) planetProfileGroupInfo.groupAvatar) && this.memberCount == planetProfileGroupInfo.memberCount && Intrinsics.EZpvd(this.sampleMembers, planetProfileGroupInfo.sampleMembers);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.groupId.hashCode() * 31) + this.groupAvatar.hashCode()) * 31) + Integer.hashCode(this.memberCount)) * 31) + this.sampleMembers.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlanetProfileGroupInfo(groupId=" + this.groupId + ", groupAvatar=" + this.groupAvatar + ", memberCount=" + this.memberCount + ", sampleMembers=" + this.sampleMembers + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.groupId);
        parcel.writeString(this.groupAvatar);
        parcel.writeInt(this.memberCount);
        List<PlanetProfileSampleMember> list = this.sampleMembers;
        parcel.writeInt(list.size());
        Iterator<PlanetProfileSampleMember> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetProfileGroupInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlanetProfileGroupInfo> serializer() {
            return PlanetProfileGroupInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlanetProfileGroupInfo(int i, String str, String str2, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.groupId = "";
        } else {
            this.groupId = str;
        }
        if ((i & 2) == 0) {
            this.groupAvatar = "";
        } else {
            this.groupAvatar = str2;
        }
        if ((i & 4) == 0) {
            this.memberCount = 0;
        } else {
            this.memberCount = i2;
        }
        if ((i & 8) == 0) {
            this.sampleMembers = yDY.AhwBna();
        } else {
            this.sampleMembers = list;
        }
    }

    public static final /* synthetic */ void copydefault(PlanetProfileGroupInfo planetProfileGroupInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) planetProfileGroupInfo.groupId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, planetProfileGroupInfo.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) planetProfileGroupInfo.groupAvatar, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, planetProfileGroupInfo.groupAvatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || planetProfileGroupInfo.memberCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, planetProfileGroupInfo.memberCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(planetProfileGroupInfo.sampleMembers, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], planetProfileGroupInfo.sampleMembers);
    }

    public PlanetProfileGroupInfo(@NotNull String str, @NotNull String str2, int i, @NotNull List<PlanetProfileSampleMember> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.groupId = str;
        this.groupAvatar = str2;
        this.memberCount = i;
        this.sampleMembers = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, int, java.util.List<com.okinc.planet.biz_userprofile.data.PlanetProfileSampleMember>):void (m)] (LINE:9) call: com.okinc.planet.biz_userprofile.data.PlanetProfileGroupInfo.<init>(java.lang.String, java.lang.String, int, java.util.List):void type: THIS */
    public /* synthetic */ PlanetProfileGroupInfo(String str, String str2, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? yDY.AhwBna() : list);
    }
}
