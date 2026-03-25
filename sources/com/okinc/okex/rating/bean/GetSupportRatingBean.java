package com.okinc.okex.rating.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.biz.model.RatingDisplayStatus;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C45303snJ;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GetSupportRatingBean implements Parcelable {
    private final AppLayoutType appLayoutType;
    private final String bizType;
    private final String checkbox;
    private final Layout fullLayout;
    private final String genericRequiredFeedbackContent;
    private final Layout halfLayout;
    private final Long id;
    private final List<Label> labelsWithStarRating;
    private final Label labelsWithoutStarRating;
    private final String moduleTitle;
    private final String moduleType;
    private final RatingDisplayStatus status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GetSupportRatingBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {AppLayoutType.Companion.serializer(), null, null, null, null, null, new ArrayListSerializer(GetSupportRatingBean$Label$$serializer.INSTANCE), null, null, null, RatingDisplayStatus.Companion.serializer(), null};

    public static final class Creator implements Parcelable.Creator<GetSupportRatingBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetSupportRatingBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            AppLayoutType appLayoutTypeValueOf = parcel.readInt() == 0 ? null : AppLayoutType.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Layout layoutCreateFromParcel = parcel.readInt() == 0 ? null : Layout.CREATOR.createFromParcel(parcel);
            Layout layoutCreateFromParcel2 = parcel.readInt() == 0 ? null : Layout.CREATOR.createFromParcel(parcel);
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(Label.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new GetSupportRatingBean(appLayoutTypeValueOf, string, string2, layoutCreateFromParcel, layoutCreateFromParcel2, lValueOf, arrayList, parcel.readInt() == 0 ? null : Label.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? RatingDisplayStatus.valueOf(parcel.readString()) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetSupportRatingBean[] newArray(int i) {
            return new GetSupportRatingBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetSupportRatingBean() {
        this((AppLayoutType) null, (String) null, (String) null, (Layout) null, (Layout) null, (Long) null, (List) null, (Label) null, (String) null, (String) null, (RatingDisplayStatus) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    @SerialName("appLayoutType")
    public static /* synthetic */ void getAppLayoutType$annotations() {
    }

    @SerialName("bizType")
    public static /* synthetic */ void getBizType$annotations() {
    }

    @SerialName("checkbox")
    public static /* synthetic */ void getCheckbox$annotations() {
    }

    @SerialName("fullLayout")
    public static /* synthetic */ void getFullLayout$annotations() {
    }

    @SerialName("genericRequiredFeedbackContent")
    public static /* synthetic */ void getGenericRequiredFeedbackContent$annotations() {
    }

    @SerialName("halfLayout")
    public static /* synthetic */ void getHalfLayout$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("labelsWithStarRating")
    public static /* synthetic */ void getLabelsWithStarRating$annotations() {
    }

    @SerialName("labelsWithoutStarRating")
    public static /* synthetic */ void getLabelsWithoutStarRating$annotations() {
    }

    @SerialName("moduleTitle")
    public static /* synthetic */ void getModuleTitle$annotations() {
    }

    @SerialName("moduleType")
    public static /* synthetic */ void getModuleType$annotations() {
    }

    @SerialName("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLayoutType component1() {
        return this.appLayoutType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.moduleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RatingDisplayStatus component11() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.genericRequiredFeedbackContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.checkbox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Layout component4() {
        return this.fullLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Layout component5() {
        return this.halfLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Label> component7() {
        return this.labelsWithStarRating;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Label component8() {
        return this.labelsWithoutStarRating;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.moduleTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetSupportRatingBean copy(AppLayoutType appLayoutType, String str, String str2, Layout layout, Layout layout2, Long l, List<Label> list, Label label, String str3, String str4, RatingDisplayStatus ratingDisplayStatus, String str5) {
        return new GetSupportRatingBean(appLayoutType, str, str2, layout, layout2, l, list, label, str3, str4, ratingDisplayStatus, str5);
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
        if (!(obj instanceof GetSupportRatingBean)) {
            return false;
        }
        GetSupportRatingBean getSupportRatingBean = (GetSupportRatingBean) obj;
        return this.appLayoutType == getSupportRatingBean.appLayoutType && Intrinsics.EZpvd((Object) this.bizType, (Object) getSupportRatingBean.bizType) && Intrinsics.EZpvd((Object) this.checkbox, (Object) getSupportRatingBean.checkbox) && Intrinsics.EZpvd(this.fullLayout, getSupportRatingBean.fullLayout) && Intrinsics.EZpvd(this.halfLayout, getSupportRatingBean.halfLayout) && Intrinsics.EZpvd(this.id, getSupportRatingBean.id) && Intrinsics.EZpvd(this.labelsWithStarRating, getSupportRatingBean.labelsWithStarRating) && Intrinsics.EZpvd(this.labelsWithoutStarRating, getSupportRatingBean.labelsWithoutStarRating) && Intrinsics.EZpvd((Object) this.moduleTitle, (Object) getSupportRatingBean.moduleTitle) && Intrinsics.EZpvd((Object) this.moduleType, (Object) getSupportRatingBean.moduleType) && this.status == getSupportRatingBean.status && Intrinsics.EZpvd((Object) this.genericRequiredFeedbackContent, (Object) getSupportRatingBean.genericRequiredFeedbackContent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLayoutType getAppLayoutType() {
        return this.appLayoutType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCheckbox() {
        return this.checkbox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Layout getFullLayout() {
        return this.fullLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGenericRequiredFeedbackContent() {
        return this.genericRequiredFeedbackContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Layout getHalfLayout() {
        return this.halfLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Label> getLabelsWithStarRating() {
        return this.labelsWithStarRating;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Label getLabelsWithoutStarRating() {
        return this.labelsWithoutStarRating;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleTitle() {
        return this.moduleTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleType() {
        return this.moduleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RatingDisplayStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        AppLayoutType appLayoutType = this.appLayoutType;
        int iHashCode = appLayoutType == null ? 0 : appLayoutType.hashCode();
        String str = this.bizType;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.checkbox;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Layout layout = this.fullLayout;
        int iHashCode4 = layout == null ? 0 : layout.hashCode();
        Layout layout2 = this.halfLayout;
        int iHashCode5 = layout2 == null ? 0 : layout2.hashCode();
        Long l = this.id;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        List<Label> list = this.labelsWithStarRating;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        Label label = this.labelsWithoutStarRating;
        int iHashCode8 = label == null ? 0 : label.hashCode();
        String str3 = this.moduleTitle;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.moduleType;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        RatingDisplayStatus ratingDisplayStatus = this.status;
        int iHashCode11 = ratingDisplayStatus == null ? 0 : ratingDisplayStatus.hashCode();
        String str5 = this.genericRequiredFeedbackContent;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetSupportRatingBean(appLayoutType=" + this.appLayoutType + ", bizType=" + this.bizType + ", checkbox=" + this.checkbox + ", fullLayout=" + this.fullLayout + ", halfLayout=" + this.halfLayout + ", id=" + this.id + ", labelsWithStarRating=" + this.labelsWithStarRating + ", labelsWithoutStarRating=" + this.labelsWithoutStarRating + ", moduleTitle=" + this.moduleTitle + ", moduleType=" + this.moduleType + ", status=" + this.status + ", genericRequiredFeedbackContent=" + this.genericRequiredFeedbackContent + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        AppLayoutType appLayoutType = this.appLayoutType;
        if (appLayoutType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(appLayoutType.name());
        }
        parcel.writeString(this.bizType);
        parcel.writeString(this.checkbox);
        Layout layout = this.fullLayout;
        if (layout == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            layout.writeToParcel(parcel, i);
        }
        Layout layout2 = this.halfLayout;
        if (layout2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            layout2.writeToParcel(parcel, i);
        }
        Long l = this.id;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        List<Label> list = this.labelsWithStarRating;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Label> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Label label = this.labelsWithoutStarRating;
        if (label == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            label.writeToParcel(parcel, i);
        }
        parcel.writeString(this.moduleTitle);
        parcel.writeString(this.moduleType);
        RatingDisplayStatus ratingDisplayStatus = this.status;
        if (ratingDisplayStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(ratingDisplayStatus.name());
        }
        parcel.writeString(this.genericRequiredFeedbackContent);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.rating.bean.GetSupportRatingBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetSupportRatingBean> serializer() {
            return GetSupportRatingBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetSupportRatingBean(int i, AppLayoutType appLayoutType, String str, String str2, Layout layout, Layout layout2, Long l, List list, Label label, String str3, String str4, RatingDisplayStatus ratingDisplayStatus, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.appLayoutType = null;
        } else {
            this.appLayoutType = appLayoutType;
        }
        if ((i & 2) == 0) {
            this.bizType = null;
        } else {
            this.bizType = str;
        }
        if ((i & 4) == 0) {
            this.checkbox = null;
        } else {
            this.checkbox = str2;
        }
        if ((i & 8) == 0) {
            this.fullLayout = null;
        } else {
            this.fullLayout = layout;
        }
        if ((i & 16) == 0) {
            this.halfLayout = null;
        } else {
            this.halfLayout = layout2;
        }
        if ((i & 32) == 0) {
            this.id = null;
        } else {
            this.id = l;
        }
        if ((i & 64) == 0) {
            this.labelsWithStarRating = null;
        } else {
            this.labelsWithStarRating = list;
        }
        if ((i & 128) == 0) {
            this.labelsWithoutStarRating = null;
        } else {
            this.labelsWithoutStarRating = label;
        }
        if ((i & 256) == 0) {
            this.moduleTitle = null;
        } else {
            this.moduleTitle = str3;
        }
        if ((i & 512) == 0) {
            this.moduleType = null;
        } else {
            this.moduleType = str4;
        }
        if ((i & 1024) == 0) {
            this.status = null;
        } else {
            this.status = ratingDisplayStatus;
        }
        if ((i & 2048) == 0) {
            this.genericRequiredFeedbackContent = null;
        } else {
            this.genericRequiredFeedbackContent = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(GetSupportRatingBean getSupportRatingBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || getSupportRatingBean.appLayoutType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], getSupportRatingBean.appLayoutType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || getSupportRatingBean.bizType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, getSupportRatingBean.bizType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || getSupportRatingBean.checkbox != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, getSupportRatingBean.checkbox);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || getSupportRatingBean.fullLayout != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, GetSupportRatingBean$Layout$$serializer.INSTANCE, getSupportRatingBean.fullLayout);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || getSupportRatingBean.halfLayout != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, GetSupportRatingBean$Layout$$serializer.INSTANCE, getSupportRatingBean.halfLayout);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || getSupportRatingBean.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, getSupportRatingBean.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || getSupportRatingBean.labelsWithStarRating != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], getSupportRatingBean.labelsWithStarRating);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || getSupportRatingBean.labelsWithoutStarRating != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, GetSupportRatingBean$Label$$serializer.INSTANCE, getSupportRatingBean.labelsWithoutStarRating);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || getSupportRatingBean.moduleTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, getSupportRatingBean.moduleTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || getSupportRatingBean.moduleType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, getSupportRatingBean.moduleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || getSupportRatingBean.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], getSupportRatingBean.status);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && getSupportRatingBean.genericRequiredFeedbackContent == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, getSupportRatingBean.genericRequiredFeedbackContent);
    }

    public GetSupportRatingBean(AppLayoutType appLayoutType, String str, String str2, Layout layout, Layout layout2, Long l, List<Label> list, Label label, String str3, String str4, RatingDisplayStatus ratingDisplayStatus, String str5) {
        this.appLayoutType = appLayoutType;
        this.bizType = str;
        this.checkbox = str2;
        this.fullLayout = layout;
        this.halfLayout = layout2;
        this.id = l;
        this.labelsWithStarRating = list;
        this.labelsWithoutStarRating = label;
        this.moduleTitle = str3;
        this.moduleType = str4;
        this.status = ratingDisplayStatus;
        this.genericRequiredFeedbackContent = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:com.okinc.okex.rating.bean.GetSupportRatingBean$AppLayoutType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.rating.bean.GetSupportRatingBean$AppLayoutType) : (r14v0 com.okinc.okex.rating.bean.GetSupportRatingBean$AppLayoutType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:com.okinc.okex.rating.bean.GetSupportRatingBean$Layout:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.rating.bean.GetSupportRatingBean$Layout) : (r17v0 com.okinc.okex.rating.bean.GetSupportRatingBean$Layout))
  (wrap:com.okinc.okex.rating.bean.GetSupportRatingBean$Layout:?: TERNARY null = ((wrap:int:0x0021: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.rating.bean.GetSupportRatingBean$Layout) : (r18v0 com.okinc.okex.rating.bean.GetSupportRatingBean$Layout))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0029: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r19v0 java.lang.Long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0031: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r20v0 java.util.List))
  (wrap:com.okinc.okex.rating.bean.GetSupportRatingBean$Label:?: TERNARY null = ((wrap:int:0x0039: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.rating.bean.GetSupportRatingBean$Label) : (r21v0 com.okinc.okex.rating.bean.GetSupportRatingBean$Label))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:com.okinc.biz.model.RatingDisplayStatus:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.biz.model.RatingDisplayStatus) : (r24v0 com.okinc.biz.model.RatingDisplayStatus))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(com.okinc.okex.rating.bean.GetSupportRatingBean$AppLayoutType, java.lang.String, java.lang.String, com.okinc.okex.rating.bean.GetSupportRatingBean$Layout, com.okinc.okex.rating.bean.GetSupportRatingBean$Layout, java.lang.Long, java.util.List<com.okinc.okex.rating.bean.GetSupportRatingBean$Label>, com.okinc.okex.rating.bean.GetSupportRatingBean$Label, java.lang.String, java.lang.String, com.okinc.biz.model.RatingDisplayStatus, java.lang.String):void (m)] (LINE:17) call: com.okinc.okex.rating.bean.GetSupportRatingBean.<init>(com.okinc.okex.rating.bean.GetSupportRatingBean$AppLayoutType, java.lang.String, java.lang.String, com.okinc.okex.rating.bean.GetSupportRatingBean$Layout, com.okinc.okex.rating.bean.GetSupportRatingBean$Layout, java.lang.Long, java.util.List, com.okinc.okex.rating.bean.GetSupportRatingBean$Label, java.lang.String, java.lang.String, com.okinc.biz.model.RatingDisplayStatus, java.lang.String):void type: THIS */
    public /* synthetic */ GetSupportRatingBean(AppLayoutType appLayoutType, String str, String str2, Layout layout, Layout layout2, Long l, List list, Label label, String str3, String str4, RatingDisplayStatus ratingDisplayStatus, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : appLayoutType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : layout, (i & 16) != 0 ? null : layout2, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : label, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : ratingDisplayStatus, (i & 2048) == 0 ? str5 : null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Serializable(with = StateListAnimator.class)
    public static final class AppLayoutType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ AppLayoutType[] $VALUES;
        private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        public static final AppLayoutType FullScreen = new AppLayoutType("FullScreen", 0, 1);
        public static final AppLayoutType HalfScreen = new AppLayoutType("HalfScreen", 1, 2);
        public static final AppLayoutType HalfScreenRedirectToFullScreen = new AppLayoutType("HalfScreenRedirectToFullScreen", 2, 3);
        public static final AppLayoutType Unknown = new AppLayoutType("Unknown", 3, -1);
        private final int value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ AppLayoutType[] $values() {
            return new AppLayoutType[]{FullScreen, HalfScreen, HalfScreenRedirectToFullScreen, Unknown};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<AppLayoutType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.rating.bean.GetSupportRatingBean.AppLayoutType.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ KSerializer AEQbTJ() {
                return (KSerializer) AppLayoutType.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<AppLayoutType> serializer() {
                return AEQbTJ();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new StateListAnimator();
        }

        private AppLayoutType(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            AppLayoutType[] appLayoutTypeArr$values = $values();
            $VALUES = appLayoutTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(appLayoutTypeArr$values);
            Companion = new Companion(null);
            $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sxE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return GetSupportRatingBean.AppLayoutType._init_$_anonymous_();
                }
            });
        }

        public static AppLayoutType valueOf(String str) {
            return (AppLayoutType) Enum.valueOf(AppLayoutType.class, str);
        }

        public static AppLayoutType[] values() {
            return (AppLayoutType[]) $VALUES.clone();
        }
    }

    public static final class StateListAnimator extends C45303snJ<AppLayoutType> {
        public StateListAnimator() {
            super("AppLayoutType", new Function1() { // from class: o.sxF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(GetSupportRatingBean.StateListAnimator.EZpvd((GetSupportRatingBean.AppLayoutType) obj));
                }
            }, new Function1() { // from class: o.sxN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return GetSupportRatingBean.StateListAnimator.OLrzqt(((java.lang.Integer) obj).intValue());
                }
            });
        }

        public static final int EZpvd(AppLayoutType appLayoutType) {
            Intrinsics.checkNotNullParameter(appLayoutType, "");
            return appLayoutType.getValue();
        }

        public static final AppLayoutType OLrzqt(int i) {
            AppLayoutType appLayoutType;
            AppLayoutType[] appLayoutTypeArrValues = AppLayoutType.values();
            int length = appLayoutTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    appLayoutType = null;
                    break;
                }
                appLayoutType = appLayoutTypeArrValues[i2];
                if (appLayoutType.getValue() == i) {
                    break;
                }
                i2++;
            }
            return appLayoutType == null ? AppLayoutType.Unknown : appLayoutType;
        }
    }

    @Serializable
    public static final class Layout implements Parcelable {
        public static final int $stable = 0;
        private final Boolean displayCheckBox;
        private final Boolean displayEffortLessScore;
        private final Boolean displayFeedback;
        private final Boolean displayLabel;
        private final Boolean displaySolveStatus;
        private final Boolean displayStarRating;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Layout> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Layout> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Layout createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Boolean boolValueOf3;
                Boolean boolValueOf4;
                Boolean boolValueOf5;
                Intrinsics.checkNotNullParameter(parcel, "");
                Boolean boolValueOf6 = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf5 = null;
                } else {
                    boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Layout(boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Layout[] newArray(int i) {
                return new Layout[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Layout() {
            this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Layout copy$default(Layout layout, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = layout.displayCheckBox;
            }
            if ((i & 2) != 0) {
                bool2 = layout.displayFeedback;
            }
            Boolean bool7 = bool2;
            if ((i & 4) != 0) {
                bool3 = layout.displayLabel;
            }
            Boolean bool8 = bool3;
            if ((i & 8) != 0) {
                bool4 = layout.displayStarRating;
            }
            Boolean bool9 = bool4;
            if ((i & 16) != 0) {
                bool5 = layout.displaySolveStatus;
            }
            Boolean bool10 = bool5;
            if ((i & 32) != 0) {
                bool6 = layout.displayEffortLessScore;
            }
            return layout.copy(bool, bool7, bool8, bool9, bool10, bool6);
        }

        @SerialName("displayCheckBox")
        public static /* synthetic */ void getDisplayCheckBox$annotations() {
        }

        @SerialName("displayEffortLessScore")
        public static /* synthetic */ void getDisplayEffortLessScore$annotations() {
        }

        @SerialName("displayFeedback")
        public static /* synthetic */ void getDisplayFeedback$annotations() {
        }

        @SerialName("displayLabel")
        public static /* synthetic */ void getDisplayLabel$annotations() {
        }

        @SerialName("displaySolveStatus")
        public static /* synthetic */ void getDisplaySolveStatus$annotations() {
        }

        @SerialName("displayStarRating")
        public static /* synthetic */ void getDisplayStarRating$annotations() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component1() {
            return this.displayCheckBox;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component2() {
            return this.displayFeedback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component3() {
            return this.displayLabel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component4() {
            return this.displayStarRating;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component5() {
            return this.displaySolveStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component6() {
            return this.displayEffortLessScore;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Layout copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
            return new Layout(bool, bool2, bool3, bool4, bool5, bool6);
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
            if (!(obj instanceof Layout)) {
                return false;
            }
            Layout layout = (Layout) obj;
            return Intrinsics.EZpvd(this.displayCheckBox, layout.displayCheckBox) && Intrinsics.EZpvd(this.displayFeedback, layout.displayFeedback) && Intrinsics.EZpvd(this.displayLabel, layout.displayLabel) && Intrinsics.EZpvd(this.displayStarRating, layout.displayStarRating) && Intrinsics.EZpvd(this.displaySolveStatus, layout.displaySolveStatus) && Intrinsics.EZpvd(this.displayEffortLessScore, layout.displayEffortLessScore);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getDisplayCheckBox() {
            return this.displayCheckBox;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getDisplayEffortLessScore() {
            return this.displayEffortLessScore;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getDisplayFeedback() {
            return this.displayFeedback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getDisplayLabel() {
            return this.displayLabel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getDisplaySolveStatus() {
            return this.displaySolveStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getDisplayStarRating() {
            return this.displayStarRating;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Boolean bool = this.displayCheckBox;
            int iHashCode = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.displayFeedback;
            int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
            Boolean bool3 = this.displayLabel;
            int iHashCode3 = bool3 == null ? 0 : bool3.hashCode();
            Boolean bool4 = this.displayStarRating;
            int iHashCode4 = bool4 == null ? 0 : bool4.hashCode();
            Boolean bool5 = this.displaySolveStatus;
            int iHashCode5 = bool5 == null ? 0 : bool5.hashCode();
            Boolean bool6 = this.displayEffortLessScore;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (bool6 != null ? bool6.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Layout(displayCheckBox=" + this.displayCheckBox + ", displayFeedback=" + this.displayFeedback + ", displayLabel=" + this.displayLabel + ", displayStarRating=" + this.displayStarRating + ", displaySolveStatus=" + this.displaySolveStatus + ", displayEffortLessScore=" + this.displayEffortLessScore + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean bool = this.displayCheckBox;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.displayFeedback;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            Boolean bool3 = this.displayLabel;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool3.booleanValue() ? 1 : 0);
            }
            Boolean bool4 = this.displayStarRating;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool4.booleanValue() ? 1 : 0);
            }
            Boolean bool5 = this.displaySolveStatus;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool5.booleanValue() ? 1 : 0);
            }
            Boolean bool6 = this.displayEffortLessScore;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool6.booleanValue() ? 1 : 0);
            }
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.rating.bean.GetSupportRatingBean.Layout.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Layout> serializer() {
                return GetSupportRatingBean$Layout$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Layout(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.displayCheckBox = null;
            } else {
                this.displayCheckBox = bool;
            }
            if ((i & 2) == 0) {
                this.displayFeedback = null;
            } else {
                this.displayFeedback = bool2;
            }
            if ((i & 4) == 0) {
                this.displayLabel = null;
            } else {
                this.displayLabel = bool3;
            }
            if ((i & 8) == 0) {
                this.displayStarRating = null;
            } else {
                this.displayStarRating = bool4;
            }
            if ((i & 16) == 0) {
                this.displaySolveStatus = null;
            } else {
                this.displaySolveStatus = bool5;
            }
            if ((i & 32) == 0) {
                this.displayEffortLessScore = null;
            } else {
                this.displayEffortLessScore = bool6;
            }
        }

        public static final /* synthetic */ void write$Self$OKSupport_support_impl(Layout layout, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || layout.displayCheckBox != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, layout.displayCheckBox);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || layout.displayFeedback != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, layout.displayFeedback);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || layout.displayLabel != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, layout.displayLabel);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || layout.displayStarRating != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, layout.displayStarRating);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || layout.displaySolveStatus != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, layout.displaySolveStatus);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && layout.displayEffortLessScore == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, layout.displayEffortLessScore);
        }

        public Layout(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
            this.displayCheckBox = bool;
            this.displayFeedback = bool2;
            this.displayLabel = bool3;
            this.displayStarRating = bool4;
            this.displaySolveStatus = bool5;
            this.displayEffortLessScore = bool6;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r6v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r7v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r8v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r9v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r11v0 java.lang.Boolean))
 A[MD:(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:65) call: com.okinc.okex.rating.bean.GetSupportRatingBean.Layout.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void type: THIS */
        public /* synthetic */ Layout(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : bool5, (i & 32) != 0 ? null : bool6);
        }
    }

    @Serializable
    public static final class Label implements Parcelable {
        private final List<LabelDetail> labelDetailList;
        private final String labelTitle;
        private final Integer score;
        private final String starLabel;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Label> CREATOR = new Creator();
        private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(GetSupportRatingBean$Label$LabelDetail$$serializer.INSTANCE), null, null};

        public static final class Creator implements Parcelable.Creator<Label> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Label createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(LabelDetail.CREATOR.createFromParcel(parcel));
                    }
                }
                return new Label(string, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Label[] newArray(int i) {
                return new Label[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Label() {
            this((String) null, (List) null, (Integer) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.rating.bean.GetSupportRatingBean$Label */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Label copy$default(Label label, String str, List list, Integer num, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = label.labelTitle;
            }
            if ((i & 2) != 0) {
                list = label.labelDetailList;
            }
            if ((i & 4) != 0) {
                num = label.score;
            }
            if ((i & 8) != 0) {
                str2 = label.starLabel;
            }
            return label.copy(str, list, num, str2);
        }

        @SerialName("labelDetailList")
        public static /* synthetic */ void getLabelDetailList$annotations() {
        }

        @SerialName("labelTitle")
        public static /* synthetic */ void getLabelTitle$annotations() {
        }

        @SerialName(FirebaseAnalytics.Param.SCORE)
        public static /* synthetic */ void getScore$annotations() {
        }

        @SerialName("starLabel")
        public static /* synthetic */ void getStarLabel$annotations() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.labelTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<LabelDetail> component2() {
            return this.labelDetailList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component3() {
            return this.score;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.starLabel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Label copy(String str, List<LabelDetail> list, Integer num, String str2) {
            return new Label(str, list, num, str2);
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
            if (!(obj instanceof Label)) {
                return false;
            }
            Label label = (Label) obj;
            return Intrinsics.EZpvd((Object) this.labelTitle, (Object) label.labelTitle) && Intrinsics.EZpvd(this.labelDetailList, label.labelDetailList) && Intrinsics.EZpvd(this.score, label.score) && Intrinsics.EZpvd((Object) this.starLabel, (Object) label.starLabel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<LabelDetail> getLabelDetailList() {
            return this.labelDetailList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLabelTitle() {
            return this.labelTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getScore() {
            return this.score;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStarLabel() {
            return this.starLabel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.labelTitle;
            int iHashCode = str == null ? 0 : str.hashCode();
            List<LabelDetail> list = this.labelDetailList;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            Integer num = this.score;
            int iHashCode3 = num == null ? 0 : num.hashCode();
            String str2 = this.starLabel;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Label(labelTitle=" + this.labelTitle + ", labelDetailList=" + this.labelDetailList + ", score=" + this.score + ", starLabel=" + this.starLabel + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.labelTitle);
            List<LabelDetail> list = this.labelDetailList;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<LabelDetail> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(parcel, i);
                }
            }
            Integer num = this.score;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.starLabel);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.rating.bean.GetSupportRatingBean.Label.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Label> serializer() {
                return GetSupportRatingBean$Label$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Label(int i, String str, List list, Integer num, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.labelTitle = null;
            } else {
                this.labelTitle = str;
            }
            if ((i & 2) == 0) {
                this.labelDetailList = null;
            } else {
                this.labelDetailList = list;
            }
            if ((i & 4) == 0) {
                this.score = null;
            } else {
                this.score = num;
            }
            if ((i & 8) == 0) {
                this.starLabel = null;
            } else {
                this.starLabel = str2;
            }
        }

        public static final /* synthetic */ void write$Self$OKSupport_support_impl(Label label, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || label.labelTitle != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, label.labelTitle);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || label.labelDetailList != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], label.labelDetailList);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || label.score != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, label.score);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && label.starLabel == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, label.starLabel);
        }

        public Label(String str, List<LabelDetail> list, Integer num, String str2) {
            this.labelTitle = str;
            this.labelDetailList = list;
            this.score = num;
            this.starLabel = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<com.okinc.okex.rating.bean.GetSupportRatingBean$Label$LabelDetail>, java.lang.Integer, java.lang.String):void (m)] (LINE:83) call: com.okinc.okex.rating.bean.GetSupportRatingBean.Label.<init>(java.lang.String, java.util.List, java.lang.Integer, java.lang.String):void type: THIS */
        public /* synthetic */ Label(String str, List list, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2);
        }

        @Serializable
        public static final class LabelDetail implements Parcelable {
            public static final int $stable = 0;
            private final String feedbackContent;
            private final boolean feedbackRequired;
            private final Long id;
            private final String placeholder;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<LabelDetail> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<LabelDetail> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LabelDetail createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new LabelDetail(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LabelDetail[] newArray(int i) {
                    return new LabelDetail[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public LabelDetail() {
                this((Long) null, (String) null, false, (String) null, 15, (DefaultConstructorMarker) null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ LabelDetail copy$default(LabelDetail labelDetail, Long l, String str, boolean z, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    l = labelDetail.id;
                }
                if ((i & 2) != 0) {
                    str = labelDetail.placeholder;
                }
                if ((i & 4) != 0) {
                    z = labelDetail.feedbackRequired;
                }
                if ((i & 8) != 0) {
                    str2 = labelDetail.feedbackContent;
                }
                return labelDetail.copy(l, str, z, str2);
            }

            @SerialName("feedbackContent")
            public static /* synthetic */ void getFeedbackContent$annotations() {
            }

            @SerialName("feedbackRequired")
            public static /* synthetic */ void getFeedbackRequired$annotations() {
            }

            @SerialName("id")
            public static /* synthetic */ void getId$annotations() {
            }

            @SerialName("placeholder")
            public static /* synthetic */ void getPlaceholder$annotations() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Long component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.placeholder;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean component3() {
                return this.feedbackRequired;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component4() {
                return this.feedbackContent;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LabelDetail copy(Long l, String str, boolean z, String str2) {
                return new LabelDetail(l, str, z, str2);
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
                if (!(obj instanceof LabelDetail)) {
                    return false;
                }
                LabelDetail labelDetail = (LabelDetail) obj;
                return Intrinsics.EZpvd(this.id, labelDetail.id) && Intrinsics.EZpvd((Object) this.placeholder, (Object) labelDetail.placeholder) && this.feedbackRequired == labelDetail.feedbackRequired && Intrinsics.EZpvd((Object) this.feedbackContent, (Object) labelDetail.feedbackContent);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getFeedbackContent() {
                return this.feedbackContent;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean getFeedbackRequired() {
                return this.feedbackRequired;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Long getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                Long l = this.id;
                int iHashCode = l == null ? 0 : l.hashCode();
                String str = this.placeholder;
                int iHashCode2 = str == null ? 0 : str.hashCode();
                int iHashCode3 = Boolean.hashCode(this.feedbackRequired);
                String str2 = this.feedbackContent;
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "LabelDetail(id=" + this.id + ", placeholder=" + this.placeholder + ", feedbackRequired=" + this.feedbackRequired + ", feedbackContent=" + this.feedbackContent + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                Long l = this.id;
                if (l == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeLong(l.longValue());
                }
                parcel.writeString(this.placeholder);
                parcel.writeInt(this.feedbackRequired ? 1 : 0);
                parcel.writeString(this.feedbackContent);
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.rating.bean.GetSupportRatingBean.Label.LabelDetail.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<LabelDetail> serializer() {
                    return GetSupportRatingBean$Label$LabelDetail$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ LabelDetail(int i, Long l, String str, boolean z, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.id = null;
                } else {
                    this.id = l;
                }
                if ((i & 2) == 0) {
                    this.placeholder = null;
                } else {
                    this.placeholder = str;
                }
                if ((i & 4) == 0) {
                    this.feedbackRequired = false;
                } else {
                    this.feedbackRequired = z;
                }
                if ((i & 8) == 0) {
                    this.feedbackContent = null;
                } else {
                    this.feedbackContent = str2;
                }
            }

            public static final /* synthetic */ void write$Self$OKSupport_support_impl(LabelDetail labelDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || labelDetail.id != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, labelDetail.id);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || labelDetail.placeholder != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, labelDetail.placeholder);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || labelDetail.feedbackRequired) {
                    compositeEncoder.encodeBooleanElement(serialDescriptor, 2, labelDetail.feedbackRequired);
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && labelDetail.feedbackContent == null) {
                    return;
                }
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, labelDetail.feedbackContent);
            }

            public LabelDetail(Long l, String str, boolean z, String str2) {
                this.id = l;
                this.placeholder = str;
                this.feedbackRequired = z;
                this.feedbackContent = str2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, boolean, java.lang.String):void (m)] (LINE:97) call: com.okinc.okex.rating.bean.GetSupportRatingBean.Label.LabelDetail.<init>(java.lang.Long, java.lang.String, boolean, java.lang.String):void type: THIS */
            public /* synthetic */ LabelDetail(Long l, String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2);
            }
        }
    }
}
