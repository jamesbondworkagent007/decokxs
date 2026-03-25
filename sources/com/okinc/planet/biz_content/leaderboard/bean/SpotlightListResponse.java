package com.okinc.planet.biz_content.leaderboard.bean;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SpotlightListResponse implements Parcelable {
    private final List<SpotlightArticle> contentDataList;
    private final String nextCursor;
    private final String recMetadata;
    private final Long updateTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SpotlightListResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SpotlightArticle$$serializer.INSTANCE), null, null, null};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SpotlightListResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotlightListResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SpotlightArticle.CREATOR.createFromParcel(parcel));
                }
            }
            return new SpotlightListResponse(arrayList, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotlightListResponse[] newArray(int i) {
            return new SpotlightListResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotlightListResponse() {
        this((List) null, (Long) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.planet.biz_content.leaderboard.bean.SpotlightListResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpotlightListResponse copy$default(SpotlightListResponse spotlightListResponse, List list, Long l, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = spotlightListResponse.contentDataList;
        }
        if ((i & 2) != 0) {
            l = spotlightListResponse.updateTime;
        }
        if ((i & 4) != 0) {
            str = spotlightListResponse.nextCursor;
        }
        if ((i & 8) != 0) {
            str2 = spotlightListResponse.recMetadata;
        }
        return spotlightListResponse.copy(list, l, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotlightArticle> component1() {
        return this.contentDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.recMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotlightListResponse copy(List<SpotlightArticle> list, Long l, String str, String str2) {
        return new SpotlightListResponse(list, l, str, str2);
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
        if (!(obj instanceof SpotlightListResponse)) {
            return false;
        }
        SpotlightListResponse spotlightListResponse = (SpotlightListResponse) obj;
        return Intrinsics.EZpvd(this.contentDataList, spotlightListResponse.contentDataList) && Intrinsics.EZpvd(this.updateTime, spotlightListResponse.updateTime) && Intrinsics.EZpvd((Object) this.nextCursor, (Object) spotlightListResponse.nextCursor) && Intrinsics.EZpvd((Object) this.recMetadata, (Object) spotlightListResponse.recMetadata);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotlightArticle> getContentDataList() {
        return this.contentDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecMetadata() {
        return this.recMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<SpotlightArticle> list = this.contentDataList;
        int iHashCode = list == null ? 0 : list.hashCode();
        Long l = this.updateTime;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        String str = this.nextCursor;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.recMetadata;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotlightListResponse(contentDataList=" + this.contentDataList + ", updateTime=" + this.updateTime + ", nextCursor=" + this.nextCursor + ", recMetadata=" + this.recMetadata + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<SpotlightArticle> list = this.contentDataList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SpotlightArticle> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Long l = this.updateTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.nextCursor);
        parcel.writeString(this.recMetadata);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_content.leaderboard.bean.SpotlightListResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotlightListResponse> serializer() {
            return SpotlightListResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotlightListResponse(int i, List list, Long l, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contentDataList = null;
        } else {
            this.contentDataList = list;
        }
        if ((i & 2) == 0) {
            this.updateTime = null;
        } else {
            this.updateTime = l;
        }
        if ((i & 4) == 0) {
            this.nextCursor = null;
        } else {
            this.nextCursor = str;
        }
        if ((i & 8) == 0) {
            this.recMetadata = null;
        } else {
            this.recMetadata = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(SpotlightListResponse spotlightListResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || spotlightListResponse.contentDataList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], spotlightListResponse.contentDataList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || spotlightListResponse.updateTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, spotlightListResponse.updateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || spotlightListResponse.nextCursor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, spotlightListResponse.nextCursor);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && spotlightListResponse.recMetadata == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, spotlightListResponse.recMetadata);
    }

    public SpotlightListResponse(List<SpotlightArticle> list, Long l, String str, String str2) {
        this.contentDataList = list;
        this.updateTime = l;
        this.nextCursor = str;
        this.recMetadata = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.planet.biz_content.leaderboard.bean.SpotlightArticle>, java.lang.Long, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.planet.biz_content.leaderboard.bean.SpotlightListResponse.<init>(java.util.List, java.lang.Long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotlightListResponse(List list, Long l, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
