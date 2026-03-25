package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("file-uploader-preview")
@Serializable
public final class NewFileUploader extends UIComponent implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private Float bottomMargin;
    private final List<String> extensions;
    private final Integer fileSize;
    private final List<File> files;
    private final String id;
    private final int imageType;
    private Boolean isHidden;
    private final Boolean isShowCamera;
    private final Float leftMargin;
    private final Long limit;
    private final Boolean required;
    private final Boolean shouldCallOcr;
    private final Boolean shouldShowOnLoad;
    private final String tipsTitle;
    private String value;
    private final String version;
    private final List<String> viewIdsToCollapse;
    private final List<String> viewIdsToHide;
    private final List<String> viewIdsToShow;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<NewFileUploader> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NewFileUploader> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewFileUploader createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(File.CREATOR.createFromParcel(parcel));
                }
            }
            return new NewFileUploader(arrayListCreateStringArrayList, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewFileUploader[] newArray(int i) {
            return new NewFileUploader[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.extensions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component10() {
        return this.viewIdsToShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component11() {
        return this.viewIdsToHide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component12() {
        return this.viewIdsToCollapse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component14() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component17() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component18() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component19() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<File> component2() {
        return this.files;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.isShowCamera;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.fileSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.imageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tipsTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.shouldCallOcr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.shouldShowOnLoad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewFileUploader copy(@NotNull List<String> list, List<File> list2, Boolean bool, Integer num, int i, Long l, String str, Boolean bool2, Boolean bool3, List<String> list3, List<String> list4, List<String> list5, @NotNull String str2, Boolean bool4, String str3, String str4, Float f, Float f2, Boolean bool5) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new NewFileUploader(list, list2, bool, num, i, l, str, bool2, bool3, list3, list4, list5, str2, bool4, str3, str4, f, f2, bool5);
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
        if (!(obj instanceof NewFileUploader)) {
            return false;
        }
        NewFileUploader newFileUploader = (NewFileUploader) obj;
        return Intrinsics.EZpvd(this.extensions, newFileUploader.extensions) && Intrinsics.EZpvd(this.files, newFileUploader.files) && Intrinsics.EZpvd(this.isShowCamera, newFileUploader.isShowCamera) && Intrinsics.EZpvd(this.fileSize, newFileUploader.fileSize) && this.imageType == newFileUploader.imageType && Intrinsics.EZpvd(this.limit, newFileUploader.limit) && Intrinsics.EZpvd((Object) this.tipsTitle, (Object) newFileUploader.tipsTitle) && Intrinsics.EZpvd(this.shouldCallOcr, newFileUploader.shouldCallOcr) && Intrinsics.EZpvd(this.shouldShowOnLoad, newFileUploader.shouldShowOnLoad) && Intrinsics.EZpvd(this.viewIdsToShow, newFileUploader.viewIdsToShow) && Intrinsics.EZpvd(this.viewIdsToHide, newFileUploader.viewIdsToHide) && Intrinsics.EZpvd(this.viewIdsToCollapse, newFileUploader.viewIdsToCollapse) && Intrinsics.EZpvd((Object) this.id, (Object) newFileUploader.id) && Intrinsics.EZpvd(this.required, newFileUploader.required) && Intrinsics.EZpvd((Object) this.version, (Object) newFileUploader.version) && Intrinsics.EZpvd((Object) this.value, (Object) newFileUploader.value) && Intrinsics.EZpvd(this.bottomMargin, newFileUploader.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, newFileUploader.leftMargin) && Intrinsics.EZpvd(this.isHidden, newFileUploader.isHidden);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getExtensions() {
        return this.extensions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFileSize() {
        return this.fileSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<File> getFiles() {
        return this.files;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getImageType() {
        return this.imageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShouldCallOcr() {
        return this.shouldCallOcr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShouldShowOnLoad() {
        return this.shouldShowOnLoad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTipsTitle() {
        return this.tipsTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getViewIdsToCollapse() {
        return this.viewIdsToCollapse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getViewIdsToHide() {
        return this.viewIdsToHide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getViewIdsToShow() {
        return this.viewIdsToShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.extensions.hashCode();
        List<File> list = this.files;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        Boolean bool = this.isShowCamera;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        Integer num = this.fileSize;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        int iHashCode5 = Integer.hashCode(this.imageType);
        Long l = this.limit;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        String str = this.tipsTitle;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        Boolean bool2 = this.shouldCallOcr;
        int iHashCode8 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.shouldShowOnLoad;
        int iHashCode9 = bool3 == null ? 0 : bool3.hashCode();
        List<String> list2 = this.viewIdsToShow;
        int iHashCode10 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.viewIdsToHide;
        int iHashCode11 = list3 == null ? 0 : list3.hashCode();
        List<String> list4 = this.viewIdsToCollapse;
        int iHashCode12 = list4 == null ? 0 : list4.hashCode();
        int iHashCode13 = this.id.hashCode();
        Boolean bool4 = this.required;
        int iHashCode14 = bool4 == null ? 0 : bool4.hashCode();
        String str2 = this.version;
        int iHashCode15 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        int iHashCode16 = str3 == null ? 0 : str3.hashCode();
        Float f = this.bottomMargin;
        int iHashCode17 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        int iHashCode18 = f2 == null ? 0 : f2.hashCode();
        Boolean bool5 = this.isHidden;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (bool5 == null ? 0 : bool5.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isShowCamera() {
        return this.isShowCamera;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBottomMargin(Float f) {
        this.bottomMargin = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public void setHidden(Boolean bool) {
        this.isHidden = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewFileUploader(extensions=" + this.extensions + ", files=" + this.files + ", isShowCamera=" + this.isShowCamera + ", fileSize=" + this.fileSize + ", imageType=" + this.imageType + ", limit=" + this.limit + ", tipsTitle=" + this.tipsTitle + ", shouldCallOcr=" + this.shouldCallOcr + ", shouldShowOnLoad=" + this.shouldShowOnLoad + ", viewIdsToShow=" + this.viewIdsToShow + ", viewIdsToHide=" + this.viewIdsToHide + ", viewIdsToCollapse=" + this.viewIdsToCollapse + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isHidden=" + this.isHidden + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.extensions);
        List<File> list = this.files;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<File> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.isShowCamera;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.fileSize;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.imageType);
        Long l = this.limit;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.tipsTitle);
        Boolean bool2 = this.shouldCallOcr;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.shouldShowOnLoad;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeStringList(this.viewIdsToShow);
        parcel.writeStringList(this.viewIdsToHide);
        parcel.writeStringList(this.viewIdsToCollapse);
        parcel.writeString(this.id);
        Boolean bool4 = this.required;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.version);
        parcel.writeString(this.value);
        Float f = this.bottomMargin;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.leftMargin;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Boolean bool5 = this.isHidden;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.NewFileUploader.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewFileUploader> serializer() {
            return NewFileUploader$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(stringSerializer), new ArrayListSerializer(File$$serializer.INSTANCE), null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewFileUploader(int i, List list, List list2, Boolean bool, Integer num, int i2, Long l, String str, Boolean bool2, Boolean bool3, List list3, List list4, List list5, String str2, Boolean bool4, String str3, String str4, Float f, Float f2, Boolean bool5, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (249881 != (i & 249881)) {
            PluginExceptionsKt.throwMissingFieldException(i, 249881, NewFileUploader$$serializer.INSTANCE.getDescriptor());
        }
        this.extensions = list;
        if ((i & 2) == 0) {
            this.files = null;
        } else {
            this.files = list2;
        }
        if ((i & 4) == 0) {
            this.isShowCamera = null;
        } else {
            this.isShowCamera = bool;
        }
        this.fileSize = num;
        this.imageType = i2;
        if ((i & 32) == 0) {
            this.limit = null;
        } else {
            this.limit = l;
        }
        if ((i & 64) == 0) {
            this.tipsTitle = null;
        } else {
            this.tipsTitle = str;
        }
        this.shouldCallOcr = (i & 128) == 0 ? Boolean.FALSE : bool2;
        this.shouldShowOnLoad = (i & 256) == 0 ? Boolean.FALSE : bool3;
        if ((i & 512) == 0) {
            this.viewIdsToShow = null;
        } else {
            this.viewIdsToShow = list3;
        }
        if ((i & 1024) == 0) {
            this.viewIdsToHide = null;
        } else {
            this.viewIdsToHide = list4;
        }
        if ((i & 2048) == 0) {
            this.viewIdsToCollapse = null;
        } else {
            this.viewIdsToCollapse = list5;
        }
        this.id = str2;
        this.required = (i & 8192) == 0 ? Boolean.FALSE : bool4;
        this.version = str3;
        this.value = str4;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = (i & 262144) == 0 ? Boolean.FALSE : bool5;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(NewFileUploader newFileUploader, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(newFileUploader, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], newFileUploader.extensions);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || newFileUploader.files != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], newFileUploader.files);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || newFileUploader.isShowCamera != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, newFileUploader.isShowCamera);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, newFileUploader.fileSize);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, newFileUploader.imageType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || newFileUploader.limit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, newFileUploader.limit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || newFileUploader.tipsTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, newFileUploader.tipsTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(newFileUploader.shouldCallOcr, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, newFileUploader.shouldCallOcr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(newFileUploader.shouldShowOnLoad, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, newFileUploader.shouldShowOnLoad);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || newFileUploader.viewIdsToShow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], newFileUploader.viewIdsToShow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || newFileUploader.viewIdsToHide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], newFileUploader.viewIdsToHide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || newFileUploader.viewIdsToCollapse != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], newFileUploader.viewIdsToCollapse);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, newFileUploader.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(newFileUploader.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, newFileUploader.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, newFileUploader.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, newFileUploader.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, floatSerializer, newFileUploader.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, floatSerializer, newFileUploader.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && Intrinsics.EZpvd(newFileUploader.isHidden(), Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, newFileUploader.isHidden());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (r24v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r43v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r25v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r43v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r26v0 java.lang.Boolean))
  (r27v0 java.lang.Integer)
  (r28v0 int)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0013: ARITH (r43v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r29v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r43v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r43v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0029: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r31v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r43v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r32v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0037: ARITH (r43v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r33v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003f: ARITH (r43v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r34v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0047: ARITH (r43v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r35v0 java.util.List))
  (r36v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004f: ARITH (r43v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0055: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r37v0 java.lang.Boolean))
  (r38v0 java.lang.String)
  (r39v0 java.lang.String)
  (r40v0 java.lang.Float)
  (r41v0 java.lang.Float)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005c: ARITH (r43v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0061: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r42v0 java.lang.Boolean))
 A[MD:(java.util.List<java.lang.String>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>, java.lang.Boolean, java.lang.Integer, int, java.lang.Long, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void (m)] (LINE:1242) call: com.okinc.ok_kyc_core.data.remote.networkmodel.NewFileUploader.<init>(java.util.List, java.util.List, java.lang.Boolean, java.lang.Integer, int, java.lang.Long, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void type: THIS */
    public /* synthetic */ NewFileUploader(List list, List list2, Boolean bool, Integer num, int i, Long l, String str, Boolean bool2, Boolean bool3, List list3, List list4, List list5, String str2, Boolean bool4, String str3, String str4, Float f, Float f2, Boolean bool5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, (i2 & 4) != 0 ? null : bool, num, i, (i2 & 32) != 0 ? null : l, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? Boolean.FALSE : bool2, (i2 & 256) != 0 ? Boolean.FALSE : bool3, (i2 & 512) != 0 ? null : list3, (i2 & 1024) != 0 ? null : list4, (i2 & 2048) != 0 ? null : list5, str2, (i2 & 8192) != 0 ? Boolean.FALSE : bool4, str3, str4, f, f2, (i2 & 262144) != 0 ? Boolean.FALSE : bool5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewFileUploader(@NotNull List<String> list, List<File> list2, Boolean bool, Integer num, int i, Long l, String str, Boolean bool2, Boolean bool3, List<String> list3, List<String> list4, List<String> list5, @NotNull String str2, Boolean bool4, String str3, String str4, Float f, Float f2, Boolean bool5) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.extensions = list;
        this.files = list2;
        this.isShowCamera = bool;
        this.fileSize = num;
        this.imageType = i;
        this.limit = l;
        this.tipsTitle = str;
        this.shouldCallOcr = bool2;
        this.shouldShowOnLoad = bool3;
        this.viewIdsToShow = list3;
        this.viewIdsToHide = list4;
        this.viewIdsToCollapse = list5;
        this.id = str2;
        this.required = bool4;
        this.version = str3;
        this.value = str4;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = bool5;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public NewFileUploaderAppModel toAppModel() {
        List<String> list = this.extensions;
        List<File> list2 = this.files;
        Boolean bool = this.isShowCamera;
        int i = this.imageType;
        Long l = this.limit;
        String str = this.tipsTitle;
        Integer num = this.fileSize;
        int iIntValue = num != null ? num.intValue() : 5;
        Boolean bool2 = this.shouldCallOcr;
        return new NewFileUploaderAppModel(list, list2, bool, i, l, str, iIntValue, bool2 != null ? bool2.booleanValue() : false, this.shouldShowOnLoad, this.viewIdsToShow, this.viewIdsToHide, this.viewIdsToCollapse, getId(), getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin(), isHidden());
    }
}
