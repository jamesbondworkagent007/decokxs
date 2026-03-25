package com.okinc.okimcore.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OfficialTagInfo implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private List<Integer> markTypes;
    private List<? extends OfficialMark> supportMarkTypes;
    private List<? extends OfficialTagType> supportTagTypes;
    private final List<Integer> tagTypes;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OfficialTagInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OfficialTagInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OfficialTagInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(Integer.valueOf(parcel.readInt()));
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(parcel.readParcelable(OfficialTagInfo.class.getClassLoader()));
            }
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList4.add(parcel.readParcelable(OfficialTagInfo.class.getClassLoader()));
            }
            return new OfficialTagInfo(arrayList, arrayList2, arrayList3, arrayList4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OfficialTagInfo[] newArray(int i) {
            return new OfficialTagInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OfficialTagInfo() {
        this((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.remote.OfficialTagInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OfficialTagInfo copy$default(OfficialTagInfo officialTagInfo, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = officialTagInfo.markTypes;
        }
        if ((i & 2) != 0) {
            list2 = officialTagInfo.tagTypes;
        }
        if ((i & 4) != 0) {
            list3 = officialTagInfo.supportMarkTypes;
        }
        if ((i & 8) != 0) {
            list4 = officialTagInfo.supportTagTypes;
        }
        return officialTagInfo.copy(list, list2, list3, list4);
    }

    @SerialName("marks")
    public static /* synthetic */ void getMarkTypes$annotations() {
    }

    @SerialName("supportMarkTypes")
    public static /* synthetic */ void getSupportMarkTypes$annotations() {
    }

    @SerialName("supportTagTypes")
    public static /* synthetic */ void getSupportTagTypes$annotations() {
    }

    @SerialName("tags")
    public static /* synthetic */ void getTagTypes$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component1() {
        return this.markTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component2() {
        return this.tagTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.okimcore.model.remote.OfficialMark>, java.util.List<com.okinc.okimcore.model.remote.OfficialMark> */
    public final List<OfficialMark> component3() {
        return this.supportMarkTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.okimcore.model.remote.OfficialTagType>, java.util.List<com.okinc.okimcore.model.remote.OfficialTagType> */
    public final List<OfficialTagType> component4() {
        return this.supportTagTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo copy(@NotNull List<Integer> list, @NotNull List<Integer> list2, @NotNull List<? extends OfficialMark> list3, @NotNull List<? extends OfficialTagType> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new OfficialTagInfo(list, list2, list3, list4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getMarkTypes() {
        return this.markTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.okimcore.model.remote.OfficialMark>, java.util.List<com.okinc.okimcore.model.remote.OfficialMark> */
    public final List<OfficialMark> getSupportMarkTypes() {
        return this.supportMarkTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.okimcore.model.remote.OfficialTagType>, java.util.List<com.okinc.okimcore.model.remote.OfficialTagType> */
    public final List<OfficialTagType> getSupportTagTypes() {
        return this.supportTagTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getTagTypes() {
        return this.tagTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.markTypes.hashCode() * 31) + this.tagTypes.hashCode()) * 31) + this.supportMarkTypes.hashCode()) * 31) + this.supportTagTypes.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarkTypes(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.markTypes = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportMarkTypes(@NotNull List<? extends OfficialMark> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.supportMarkTypes = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportTagTypes(@NotNull List<? extends OfficialTagType> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.supportTagTypes = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OfficialTagInfo(markTypes=" + this.markTypes + ", tagTypes=" + this.tagTypes + ", supportMarkTypes=" + this.supportMarkTypes + ", supportTagTypes=" + this.supportTagTypes + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<Integer> list = this.markTypes;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        List<Integer> list2 = this.tagTypes;
        parcel.writeInt(list2.size());
        Iterator<Integer> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
        List<? extends OfficialMark> list3 = this.supportMarkTypes;
        parcel.writeInt(list3.size());
        Iterator<? extends OfficialMark> it3 = list3.iterator();
        while (it3.hasNext()) {
            parcel.writeParcelable(it3.next(), i);
        }
        List<? extends OfficialTagType> list4 = this.supportTagTypes;
        parcel.writeInt(list4.size());
        Iterator<? extends OfficialTagType> it4 = list4.iterator();
        while (it4.hasNext()) {
            parcel.writeParcelable(it4.next(), i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.OfficialTagInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OfficialTagInfo> serializer() {
            return OfficialTagInfo$$serializer.INSTANCE;
        }
    }

    static {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(intSerializer), new ArrayListSerializer(intSerializer), new ArrayListSerializer(OfficialMark.CREATOR.serializer()), new ArrayListSerializer(OfficialTagType.CREATOR.serializer())};
    }

    public /* synthetic */ OfficialTagInfo(int i, List list, List list2, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        this.markTypes = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.tagTypes = yDY.AhwBna();
        } else {
            this.tagTypes = list2;
        }
        if ((i & 4) == 0) {
            this.supportMarkTypes = yDY.AhwBna();
        } else {
            this.supportMarkTypes = list3;
        }
        if ((i & 8) == 0) {
            this.supportTagTypes = yDY.AhwBna();
        } else {
            this.supportTagTypes = list4;
        }
        handleSupportMarkTypes();
        handleSupportTagTypes();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [9=5] */
    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OfficialTagInfo officialTagInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(officialTagInfo.markTypes, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], officialTagInfo.markTypes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(officialTagInfo.tagTypes, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], officialTagInfo.tagTypes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(officialTagInfo.supportMarkTypes, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], officialTagInfo.supportMarkTypes);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(officialTagInfo.supportTagTypes, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], officialTagInfo.supportTagTypes);
    }

    public OfficialTagInfo(@NotNull List<Integer> list, @NotNull List<Integer> list2, @NotNull List<? extends OfficialMark> list3, @NotNull List<? extends OfficialTagType> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.markTypes = list;
        this.tagTypes = list2;
        this.supportMarkTypes = list3;
        this.supportTagTypes = list4;
        handleSupportMarkTypes();
        handleSupportTagTypes();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:18)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:24)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:27)) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0018: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:30)) : (r4v0 java.util.List))
 A[MD:(java.util.List<java.lang.Integer>, java.util.List<java.lang.Integer>, java.util.List<? extends com.okinc.okimcore.model.remote.OfficialMark>, java.util.List<? extends com.okinc.okimcore.model.remote.OfficialTagType>):void (m)] (LINE:12) call: com.okinc.okimcore.model.remote.OfficialTagInfo.<init>(java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ OfficialTagInfo(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3, (i & 8) != 0 ? yDY.AhwBna() : list4);
    }

    private final void handleSupportMarkTypes() {
        if (this.supportMarkTypes.isEmpty()) {
            List<Integer> list = this.markTypes;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                OfficialMark officialMarkValueOf = OfficialMark.CREATOR.valueOf(((Number) it.next()).intValue());
                if (officialMarkValueOf != null) {
                    arrayList.add(officialMarkValueOf);
                }
            }
            this.supportMarkTypes = arrayList;
        }
    }

    private final void handleSupportTagTypes() {
        if (this.supportTagTypes.isEmpty()) {
            List<Integer> list = this.tagTypes;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                OfficialTagType officialTagTypeValueOf = OfficialTagType.CREATOR.valueOf(((Number) it.next()).intValue());
                if (officialTagTypeValueOf != null) {
                    arrayList.add(officialTagTypeValueOf);
                }
            }
            this.supportTagTypes = arrayList;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof OfficialTagInfo) {
            OfficialTagInfo officialTagInfo = (OfficialTagInfo) obj;
            return Intrinsics.EZpvd(this.markTypes, officialTagInfo.markTypes) && Intrinsics.EZpvd(this.tagTypes, officialTagInfo.tagTypes) && Intrinsics.EZpvd(this.supportMarkTypes, officialTagInfo.tagTypes) && Intrinsics.EZpvd(this.supportTagTypes, officialTagInfo.supportTagTypes);
        }
        return super.equals(obj);
    }

    public final boolean containOfficialTypeOnly() {
        return this.supportTagTypes.size() == 1 && containOfficialType();
    }

    public final boolean containOfficialType() {
        List<? extends OfficialTagType> list = this.supportTagTypes;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (OfficialTagType officialTagType : list) {
                if (officialTagType == OfficialTagType.CommunityOperation || officialTagType == OfficialTagType.Official || officialTagType == OfficialTagType.VipManager) {
                    return true;
                }
            }
        }
        return false;
    }

    public final List<OfficialTagType> getSupportTagsWithoutOfficial() {
        List<? extends OfficialTagType> list = this.supportTagTypes;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            OfficialTagType officialTagType = (OfficialTagType) obj;
            if (officialTagType != OfficialTagType.CommunityOperation && officialTagType != OfficialTagType.Official && officialTagType != OfficialTagType.VipManager) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
