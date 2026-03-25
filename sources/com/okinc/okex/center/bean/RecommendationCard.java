package com.okinc.okex.center.bean;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class RecommendationCard implements Parcelable {
    private final Long createdDate;
    private final String dataTrackingKey;
    private final String description;
    private final String iconBright;
    private final String iconDark;
    private final String id;
    private final List<RecommendationCardLabel> labels;
    private final SelfServiceToolBean primaryAction;
    private final String scenario;
    private final String slug;
    private final List<String> tags;
    private final String title;
    private final String titleListMode;
    private final String type;
    private final String typeIconBright;
    private final String typeIconDark;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecommendationCard> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, new ArrayListSerializer(RecommendationCardLabel$$serializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<RecommendationCard> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendationCard createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string12;
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                str = string12;
                int i2 = 0;
                while (i2 != i) {
                    arrayList2.add(RecommendationCardLabel.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList2;
            }
            return new RecommendationCard(string, string2, string3, string4, string5, string6, arrayListCreateStringArrayList, string7, string8, string9, string10, string11, str, arrayList, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : SelfServiceToolBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendationCard[] newArray(int i) {
            return new RecommendationCard[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecommendationCard() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Long) null, (SelfServiceToolBean) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.typeIconBright;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.typeIconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecommendationCardLabel> component14() {
        return this.labels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component15() {
        return this.createdDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceToolBean component16() {
        return this.primaryAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.dataTrackingKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.iconBright;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.iconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.titleListMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendationCard copy(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7, String str8, String str9, String str10, String str11, String str12, List<RecommendationCardLabel> list2, Long l, SelfServiceToolBean selfServiceToolBean) {
        return new RecommendationCard(str, str2, str3, str4, str5, str6, list, str7, str8, str9, str10, str11, str12, list2, l, selfServiceToolBean);
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
        if (!(obj instanceof RecommendationCard)) {
            return false;
        }
        RecommendationCard recommendationCard = (RecommendationCard) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) recommendationCard.id) && Intrinsics.EZpvd((Object) this.dataTrackingKey, (Object) recommendationCard.dataTrackingKey) && Intrinsics.EZpvd((Object) this.iconBright, (Object) recommendationCard.iconBright) && Intrinsics.EZpvd((Object) this.iconDark, (Object) recommendationCard.iconDark) && Intrinsics.EZpvd((Object) this.scenario, (Object) recommendationCard.scenario) && Intrinsics.EZpvd((Object) this.slug, (Object) recommendationCard.slug) && Intrinsics.EZpvd(this.tags, recommendationCard.tags) && Intrinsics.EZpvd((Object) this.title, (Object) recommendationCard.title) && Intrinsics.EZpvd((Object) this.titleListMode, (Object) recommendationCard.titleListMode) && Intrinsics.EZpvd((Object) this.description, (Object) recommendationCard.description) && Intrinsics.EZpvd((Object) this.type, (Object) recommendationCard.type) && Intrinsics.EZpvd((Object) this.typeIconBright, (Object) recommendationCard.typeIconBright) && Intrinsics.EZpvd((Object) this.typeIconDark, (Object) recommendationCard.typeIconDark) && Intrinsics.EZpvd(this.labels, recommendationCard.labels) && Intrinsics.EZpvd(this.createdDate, recommendationCard.createdDate) && Intrinsics.EZpvd(this.primaryAction, recommendationCard.primaryAction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDataTrackingKey() {
        return this.dataTrackingKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconBright() {
        return this.iconBright;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconDark() {
        return this.iconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecommendationCardLabel> getLabels() {
        return this.labels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceToolBean getPrimaryAction() {
        return this.primaryAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScenario() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlug() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitleListMode() {
        return this.titleListMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTypeIconBright() {
        return this.typeIconBright;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTypeIconDark() {
        return this.typeIconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.dataTrackingKey;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.iconBright;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.iconDark;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.scenario;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.slug;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        List<String> list = this.tags;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        String str7 = this.title;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.titleListMode;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.description;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.type;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.typeIconBright;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.typeIconDark;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        List<RecommendationCardLabel> list2 = this.labels;
        int iHashCode14 = list2 == null ? 0 : list2.hashCode();
        Long l = this.createdDate;
        int iHashCode15 = l == null ? 0 : l.hashCode();
        SelfServiceToolBean selfServiceToolBean = this.primaryAction;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (selfServiceToolBean == null ? 0 : selfServiceToolBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecommendationCard(id=" + this.id + ", dataTrackingKey=" + this.dataTrackingKey + ", iconBright=" + this.iconBright + ", iconDark=" + this.iconDark + ", scenario=" + this.scenario + ", slug=" + this.slug + ", tags=" + this.tags + ", title=" + this.title + ", titleListMode=" + this.titleListMode + ", description=" + this.description + ", type=" + this.type + ", typeIconBright=" + this.typeIconBright + ", typeIconDark=" + this.typeIconDark + ", labels=" + this.labels + ", createdDate=" + this.createdDate + ", primaryAction=" + this.primaryAction + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.dataTrackingKey);
        parcel.writeString(this.iconBright);
        parcel.writeString(this.iconDark);
        parcel.writeString(this.scenario);
        parcel.writeString(this.slug);
        parcel.writeStringList(this.tags);
        parcel.writeString(this.title);
        parcel.writeString(this.titleListMode);
        parcel.writeString(this.description);
        parcel.writeString(this.type);
        parcel.writeString(this.typeIconBright);
        parcel.writeString(this.typeIconDark);
        List<RecommendationCardLabel> list = this.labels;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<RecommendationCardLabel> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Long l = this.createdDate;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        SelfServiceToolBean selfServiceToolBean = this.primaryAction;
        if (selfServiceToolBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selfServiceToolBean.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.RecommendationCard.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecommendationCard> serializer() {
            return RecommendationCard$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecommendationCard(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, String str11, String str12, List list2, Long l, SelfServiceToolBean selfServiceToolBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.dataTrackingKey = "";
        } else {
            this.dataTrackingKey = str2;
        }
        if ((i & 4) == 0) {
            this.iconBright = "";
        } else {
            this.iconBright = str3;
        }
        if ((i & 8) == 0) {
            this.iconDark = "";
        } else {
            this.iconDark = str4;
        }
        if ((i & 16) == 0) {
            this.scenario = "";
        } else {
            this.scenario = str5;
        }
        if ((i & 32) == 0) {
            this.slug = "";
        } else {
            this.slug = str6;
        }
        if ((i & 64) == 0) {
            this.tags = null;
        } else {
            this.tags = list;
        }
        if ((i & 128) == 0) {
            this.title = "";
        } else {
            this.title = str7;
        }
        if ((i & 256) == 0) {
            this.titleListMode = "";
        } else {
            this.titleListMode = str8;
        }
        if ((i & 512) == 0) {
            this.description = "";
        } else {
            this.description = str9;
        }
        if ((i & 1024) == 0) {
            this.type = "";
        } else {
            this.type = str10;
        }
        if ((i & 2048) == 0) {
            this.typeIconBright = "";
        } else {
            this.typeIconBright = str11;
        }
        if ((i & 4096) == 0) {
            this.typeIconDark = "";
        } else {
            this.typeIconDark = str12;
        }
        if ((i & 8192) == 0) {
            this.labels = null;
        } else {
            this.labels = list2;
        }
        if ((i & 16384) == 0) {
            this.createdDate = null;
        } else {
            this.createdDate = l;
        }
        if ((i & 32768) == 0) {
            this.primaryAction = null;
        } else {
            this.primaryAction = selfServiceToolBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(RecommendationCard recommendationCard, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) recommendationCard.id, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, recommendationCard.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) recommendationCard.dataTrackingKey, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, recommendationCard.dataTrackingKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) recommendationCard.iconBright, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, recommendationCard.iconBright);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) recommendationCard.iconDark, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, recommendationCard.iconDark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) recommendationCard.scenario, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, recommendationCard.scenario);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) recommendationCard.slug, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, recommendationCard.slug);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || recommendationCard.tags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], recommendationCard.tags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) recommendationCard.title, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, recommendationCard.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) recommendationCard.titleListMode, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, recommendationCard.titleListMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) recommendationCard.description, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, recommendationCard.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) recommendationCard.type, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, recommendationCard.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) recommendationCard.typeIconBright, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, recommendationCard.typeIconBright);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) recommendationCard.typeIconDark, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, recommendationCard.typeIconDark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || recommendationCard.labels != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr[13], recommendationCard.labels);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || recommendationCard.createdDate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, LongSerializer.INSTANCE, recommendationCard.createdDate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && recommendationCard.primaryAction == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, SelfServiceToolBean$$serializer.INSTANCE, recommendationCard.primaryAction);
    }

    public RecommendationCard(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7, String str8, String str9, String str10, String str11, String str12, List<RecommendationCardLabel> list2, Long l, SelfServiceToolBean selfServiceToolBean) {
        this.id = str;
        this.dataTrackingKey = str2;
        this.iconBright = str3;
        this.iconDark = str4;
        this.scenario = str5;
        this.slug = str6;
        this.tags = list;
        this.title = str7;
        this.titleListMode = str8;
        this.description = str9;
        this.type = str10;
        this.typeIconBright = str11;
        this.typeIconDark = str12;
        this.labels = list2;
        this.createdDate = l;
        this.primaryAction = selfServiceToolBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a8: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0034: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r24v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006b: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r31v0 java.util.List))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0073: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r32v0 java.lang.Long))
  (wrap:com.okinc.okex.center.bean.SelfServiceToolBean:?: TERNARY null = ((wrap:int:0x007e: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.SelfServiceToolBean) : (r33v0 com.okinc.okex.center.bean.SelfServiceToolBean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.okex.center.bean.RecommendationCardLabel>, java.lang.Long, com.okinc.okex.center.bean.SelfServiceToolBean):void (m)] (LINE:36) call: com.okinc.okex.center.bean.RecommendationCard.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Long, com.okinc.okex.center.bean.SelfServiceToolBean):void type: THIS */
    public /* synthetic */ RecommendationCard(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, String str11, String str12, List list2, Long l, SelfServiceToolBean selfServiceToolBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : list, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) == 0 ? str12 : "", (i & 8192) != 0 ? null : list2, (i & 16384) != 0 ? null : l, (i & 32768) != 0 ? null : selfServiceToolBean);
    }
}
