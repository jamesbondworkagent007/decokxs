package com.okinc.planet.biz_content.draft;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.planet.domain.remote.dto.ContentTags;
import com.okinc.planet.domain.remote.dto.ContentTags$$serializer;
import com.okinc.planet.domain.remote.dto.PublishImageItem;
import com.okinc.planet.domain.remote.dto.PublishImageItem$$serializer;
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
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class DraftDataInfo implements Parcelable {
    private final String content;
    private final ContentTags contentTags;
    private String createTime;
    private final String draftId;
    private final List<PublishImageItem> imageList;
    private final String modifyTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DraftDataInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(PublishImageItem$$serializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<DraftDataInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DraftDataInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PublishImageItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new DraftDataInfo(string, string2, arrayList, parcel.readInt() != 0 ? ContentTags.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DraftDataInfo[] newArray(int i) {
            return new DraftDataInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DraftDataInfo() {
        this((String) null, (String) null, (List) null, (ContentTags) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.planet.biz_content.draft.DraftDataInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftDataInfo copy$default(DraftDataInfo draftDataInfo, String str, String str2, List list, ContentTags contentTags, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = draftDataInfo.draftId;
        }
        if ((i & 2) != 0) {
            str2 = draftDataInfo.content;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            list = draftDataInfo.imageList;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            contentTags = draftDataInfo.contentTags;
        }
        ContentTags contentTags2 = contentTags;
        if ((i & 16) != 0) {
            str3 = draftDataInfo.createTime;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = draftDataInfo.modifyTime;
        }
        return draftDataInfo.copy(str, str5, list2, contentTags2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.draftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PublishImageItem> component3() {
        return this.imageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentTags component4() {
        return this.contentTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.modifyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DraftDataInfo copy(String str, String str2, List<PublishImageItem> list, ContentTags contentTags, String str3, String str4) {
        return new DraftDataInfo(str, str2, list, contentTags, str3, str4);
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
        if (!(obj instanceof DraftDataInfo)) {
            return false;
        }
        DraftDataInfo draftDataInfo = (DraftDataInfo) obj;
        return Intrinsics.EZpvd((Object) this.draftId, (Object) draftDataInfo.draftId) && Intrinsics.EZpvd((Object) this.content, (Object) draftDataInfo.content) && Intrinsics.EZpvd(this.imageList, draftDataInfo.imageList) && Intrinsics.EZpvd(this.contentTags, draftDataInfo.contentTags) && Intrinsics.EZpvd((Object) this.createTime, (Object) draftDataInfo.createTime) && Intrinsics.EZpvd((Object) this.modifyTime, (Object) draftDataInfo.modifyTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentTags getContentTags() {
        return this.contentTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDraftId() {
        return this.draftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PublishImageItem> getImageList() {
        return this.imageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModifyTime() {
        return this.modifyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.draftId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.content;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<PublishImageItem> list = this.imageList;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        ContentTags contentTags = this.contentTags;
        int iHashCode4 = contentTags == null ? 0 : contentTags.hashCode();
        String str3 = this.createTime;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.modifyTime;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateTime(String str) {
        this.createTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DraftDataInfo(draftId=" + this.draftId + ", content=" + this.content + ", imageList=" + this.imageList + ", contentTags=" + this.contentTags + ", createTime=" + this.createTime + ", modifyTime=" + this.modifyTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.draftId);
        parcel.writeString(this.content);
        List<PublishImageItem> list = this.imageList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PublishImageItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        ContentTags contentTags = this.contentTags;
        if (contentTags == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contentTags.writeToParcel(parcel, i);
        }
        parcel.writeString(this.createTime);
        parcel.writeString(this.modifyTime);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_content.draft.DraftDataInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DraftDataInfo> serializer() {
            return DraftDataInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DraftDataInfo(int i, String str, String str2, List list, ContentTags contentTags, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.draftId = "";
        } else {
            this.draftId = str;
        }
        if ((i & 2) == 0) {
            this.content = "";
        } else {
            this.content = str2;
        }
        if ((i & 4) == 0) {
            this.imageList = yDY.AhwBna();
        } else {
            this.imageList = list;
        }
        if ((i & 8) == 0) {
            this.contentTags = new ContentTags((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            this.contentTags = contentTags;
        }
        if ((i & 16) == 0) {
            this.createTime = "";
        } else {
            this.createTime = str3;
        }
        if ((i & 32) == 0) {
            this.modifyTime = "";
        } else {
            this.modifyTime = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(DraftDataInfo draftDataInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) draftDataInfo.draftId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, draftDataInfo.draftId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) draftDataInfo.content, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, draftDataInfo.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(draftDataInfo.imageList, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], draftDataInfo.imageList);
        }
        int i = 3;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(draftDataInfo.contentTags, new ContentTags((List) null, (List) (0 == true ? 1 : 0), i, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, ContentTags$$serializer.INSTANCE, draftDataInfo.contentTags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) draftDataInfo.createTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, draftDataInfo.createTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) draftDataInfo.modifyTime, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, draftDataInfo.modifyTime);
    }

    public DraftDataInfo(String str, String str2, List<PublishImageItem> list, ContentTags contentTags, String str3, String str4) {
        this.draftId = str;
        this.content = str2;
        this.imageList = list;
        this.contentTags = contentTags;
        this.createTime = str3;
        this.modifyTime = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.util.List:0x0018: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:25)) : (r8v0 java.util.List))
  (wrap:com.okinc.planet.domain.remote.dto.ContentTags:0x0024: TERNARY null = ((wrap:int:0x0019: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.planet.domain.remote.dto.ContentTags:0x0021: CONSTRUCTOR 
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (wrap:byte:?: TERNARY null = ((0 byte) == true) ? (1 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY])))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (wrap:byte:?: TERNARY null = ((0 byte) == true) ? (1 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY])))
 A[MD:(java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:26) call: com.okinc.planet.domain.remote.dto.ContentTags.<init>(java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r9v0 com.okinc.planet.domain.remote.dto.ContentTags))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.planet.domain.remote.dto.PublishImageItem>, com.okinc.planet.domain.remote.dto.ContentTags, java.lang.String, java.lang.String):void (m)] (LINE:22) call: com.okinc.planet.biz_content.draft.DraftDataInfo.<init>(java.lang.String, java.lang.String, java.util.List, com.okinc.planet.domain.remote.dto.ContentTags, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DraftDataInfo(String str, String str2, List list, ContentTags contentTags, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? new ContentTags((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : contentTags, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4);
    }
}
