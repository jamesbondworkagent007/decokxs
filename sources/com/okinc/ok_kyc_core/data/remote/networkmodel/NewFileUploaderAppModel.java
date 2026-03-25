package com.okinc.ok_kyc_core.data.remote.networkmodel;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class NewFileUploaderAppModel extends UIComponentAppModel implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private Float bottomMargin;
    private final List<String> extensions;
    private final int fileSize;
    private List<File> files;
    private String id;
    private final int imageType;
    private Boolean isHidden;
    private final Boolean isShowCamera;
    private final Float leftMargin;
    private final Long limit;
    private final Boolean required;
    private final boolean shouldCallOcr;
    private final Boolean shouldShowOnLoad;
    private final String tipsTitle;
    private String value;
    private final String version;
    private final List<String> viewIdsToCollapse;
    private final List<String> viewIdsToHide;
    private final List<String> viewIdsToShow;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<NewFileUploaderAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NewFileUploaderAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewFileUploaderAppModel createFromParcel(Parcel parcel) {
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
            return new NewFileUploaderAppModel(arrayListCreateStringArrayList, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewFileUploaderAppModel[] newArray(int i) {
            return new NewFileUploaderAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.NewFileUploaderAppModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewFileUploaderAppModel copy$default(NewFileUploaderAppModel newFileUploaderAppModel, List list, List list2, Boolean bool, int i, Long l, String str, int i2, boolean z, Boolean bool2, List list3, List list4, List list5, String str2, Boolean bool3, String str3, String str4, Float f, Float f2, Boolean bool4, int i3, Object obj) {
        return newFileUploaderAppModel.copy((i3 & 1) != 0 ? newFileUploaderAppModel.extensions : list, (i3 & 2) != 0 ? newFileUploaderAppModel.files : list2, (i3 & 4) != 0 ? newFileUploaderAppModel.isShowCamera : bool, (i3 & 8) != 0 ? newFileUploaderAppModel.imageType : i, (i3 & 16) != 0 ? newFileUploaderAppModel.limit : l, (i3 & 32) != 0 ? newFileUploaderAppModel.tipsTitle : str, (i3 & 64) != 0 ? newFileUploaderAppModel.fileSize : i2, (i3 & 128) != 0 ? newFileUploaderAppModel.shouldCallOcr : z, (i3 & 256) != 0 ? newFileUploaderAppModel.shouldShowOnLoad : bool2, (i3 & 512) != 0 ? newFileUploaderAppModel.viewIdsToShow : list3, (i3 & 1024) != 0 ? newFileUploaderAppModel.viewIdsToHide : list4, (i3 & 2048) != 0 ? newFileUploaderAppModel.viewIdsToCollapse : list5, (i3 & 4096) != 0 ? newFileUploaderAppModel.id : str2, (i3 & 8192) != 0 ? newFileUploaderAppModel.required : bool3, (i3 & 16384) != 0 ? newFileUploaderAppModel.version : str3, (i3 & 32768) != 0 ? newFileUploaderAppModel.value : str4, (i3 & 65536) != 0 ? newFileUploaderAppModel.bottomMargin : f, (i3 & 131072) != 0 ? newFileUploaderAppModel.leftMargin : f2, (i3 & 262144) != 0 ? newFileUploaderAppModel.isHidden : bool4);
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
    public final int component4() {
        return this.imageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tipsTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.fileSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.shouldCallOcr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.shouldShowOnLoad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewFileUploaderAppModel copy(@NotNull List<String> list, List<File> list2, Boolean bool, int i, Long l, String str, int i2, boolean z, Boolean bool2, List<String> list3, List<String> list4, List<String> list5, @NotNull String str2, Boolean bool3, String str3, String str4, Float f, Float f2, Boolean bool4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new NewFileUploaderAppModel(list, list2, bool, i, l, str, i2, z, bool2, list3, list4, list5, str2, bool3, str3, str4, f, f2, bool4);
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
        if (!(obj instanceof NewFileUploaderAppModel)) {
            return false;
        }
        NewFileUploaderAppModel newFileUploaderAppModel = (NewFileUploaderAppModel) obj;
        return Intrinsics.EZpvd(this.extensions, newFileUploaderAppModel.extensions) && Intrinsics.EZpvd(this.files, newFileUploaderAppModel.files) && Intrinsics.EZpvd(this.isShowCamera, newFileUploaderAppModel.isShowCamera) && this.imageType == newFileUploaderAppModel.imageType && Intrinsics.EZpvd(this.limit, newFileUploaderAppModel.limit) && Intrinsics.EZpvd((Object) this.tipsTitle, (Object) newFileUploaderAppModel.tipsTitle) && this.fileSize == newFileUploaderAppModel.fileSize && this.shouldCallOcr == newFileUploaderAppModel.shouldCallOcr && Intrinsics.EZpvd(this.shouldShowOnLoad, newFileUploaderAppModel.shouldShowOnLoad) && Intrinsics.EZpvd(this.viewIdsToShow, newFileUploaderAppModel.viewIdsToShow) && Intrinsics.EZpvd(this.viewIdsToHide, newFileUploaderAppModel.viewIdsToHide) && Intrinsics.EZpvd(this.viewIdsToCollapse, newFileUploaderAppModel.viewIdsToCollapse) && Intrinsics.EZpvd((Object) this.id, (Object) newFileUploaderAppModel.id) && Intrinsics.EZpvd(this.required, newFileUploaderAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) newFileUploaderAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) newFileUploaderAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, newFileUploaderAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, newFileUploaderAppModel.leftMargin) && Intrinsics.EZpvd(this.isHidden, newFileUploaderAppModel.isHidden);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getExtensions() {
        return this.extensions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFileSize() {
        return this.fileSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<File> getFiles() {
        return this.files;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getImageType() {
        return this.imageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShouldCallOcr() {
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
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
        int iHashCode4 = Integer.hashCode(this.imageType);
        Long l = this.limit;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        String str = this.tipsTitle;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = Integer.hashCode(this.fileSize);
        int iHashCode8 = Boolean.hashCode(this.shouldCallOcr);
        Boolean bool2 = this.shouldShowOnLoad;
        int iHashCode9 = bool2 == null ? 0 : bool2.hashCode();
        List<String> list2 = this.viewIdsToShow;
        int iHashCode10 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.viewIdsToHide;
        int iHashCode11 = list3 == null ? 0 : list3.hashCode();
        List<String> list4 = this.viewIdsToCollapse;
        int iHashCode12 = list4 == null ? 0 : list4.hashCode();
        int iHashCode13 = this.id.hashCode();
        Boolean bool3 = this.required;
        int iHashCode14 = bool3 == null ? 0 : bool3.hashCode();
        String str2 = this.version;
        int iHashCode15 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        int iHashCode16 = str3 == null ? 0 : str3.hashCode();
        Float f = this.bottomMargin;
        int iHashCode17 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        int iHashCode18 = f2 == null ? 0 : f2.hashCode();
        Boolean bool4 = this.isHidden;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (bool4 == null ? 0 : bool4.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isShowCamera() {
        return this.isShowCamera;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setBottomMargin(Float f) {
        this.bottomMargin = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFiles(List<File> list) {
        this.files = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setHidden(Boolean bool) {
        this.isHidden = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewFileUploaderAppModel(extensions=" + this.extensions + ", files=" + this.files + ", isShowCamera=" + this.isShowCamera + ", imageType=" + this.imageType + ", limit=" + this.limit + ", tipsTitle=" + this.tipsTitle + ", fileSize=" + this.fileSize + ", shouldCallOcr=" + this.shouldCallOcr + ", shouldShowOnLoad=" + this.shouldShowOnLoad + ", viewIdsToShow=" + this.viewIdsToShow + ", viewIdsToHide=" + this.viewIdsToHide + ", viewIdsToCollapse=" + this.viewIdsToCollapse + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isHidden=" + this.isHidden + ")";
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
        parcel.writeInt(this.imageType);
        Long l = this.limit;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.tipsTitle);
        parcel.writeInt(this.fileSize);
        parcel.writeInt(this.shouldCallOcr ? 1 : 0);
        Boolean bool2 = this.shouldShowOnLoad;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeStringList(this.viewIdsToShow);
        parcel.writeStringList(this.viewIdsToHide);
        parcel.writeStringList(this.viewIdsToCollapse);
        parcel.writeString(this.id);
        Boolean bool3 = this.required;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
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
        Boolean bool4 = this.isHidden;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.NewFileUploaderAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewFileUploaderAppModel> serializer() {
            return NewFileUploaderAppModel$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(stringSerializer), new ArrayListSerializer(File$$serializer.INSTANCE), null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewFileUploaderAppModel(int i, List list, List list2, Boolean bool, int i2, Long l, String str, int i3, boolean z, Boolean bool2, List list3, List list4, List list5, String str2, Boolean bool3, String str3, String str4, Float f, Float f2, Boolean bool4, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (249929 != (i & 249929)) {
            PluginExceptionsKt.throwMissingFieldException(i, 249929, NewFileUploaderAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.extensions = list;
        if ((i & 2) == 0) {
            this.files = null;
        } else {
            this.files = list2;
        }
        this.isShowCamera = (i & 4) == 0 ? Boolean.FALSE : bool;
        this.imageType = i2;
        if ((i & 16) == 0) {
            this.limit = null;
        } else {
            this.limit = l;
        }
        if ((i & 32) == 0) {
            this.tipsTitle = null;
        } else {
            this.tipsTitle = str;
        }
        this.fileSize = i3;
        this.shouldCallOcr = (i & 128) == 0 ? false : z;
        this.shouldShowOnLoad = (i & 256) == 0 ? Boolean.FALSE : bool2;
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
        this.required = (i & 8192) == 0 ? Boolean.FALSE : bool3;
        this.version = str3;
        this.value = str4;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = (i & 262144) == 0 ? Boolean.FALSE : bool4;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(NewFileUploaderAppModel newFileUploaderAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(newFileUploaderAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], newFileUploaderAppModel.extensions);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || newFileUploaderAppModel.files != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], newFileUploaderAppModel.files);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(newFileUploaderAppModel.isShowCamera, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, newFileUploaderAppModel.isShowCamera);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, newFileUploaderAppModel.imageType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || newFileUploaderAppModel.limit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, newFileUploaderAppModel.limit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || newFileUploaderAppModel.tipsTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, newFileUploaderAppModel.tipsTitle);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 6, newFileUploaderAppModel.fileSize);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || newFileUploaderAppModel.shouldCallOcr) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, newFileUploaderAppModel.shouldCallOcr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(newFileUploaderAppModel.shouldShowOnLoad, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, newFileUploaderAppModel.shouldShowOnLoad);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || newFileUploaderAppModel.viewIdsToShow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], newFileUploaderAppModel.viewIdsToShow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || newFileUploaderAppModel.viewIdsToHide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], newFileUploaderAppModel.viewIdsToHide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || newFileUploaderAppModel.viewIdsToCollapse != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], newFileUploaderAppModel.viewIdsToCollapse);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, newFileUploaderAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(newFileUploaderAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, newFileUploaderAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, newFileUploaderAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, newFileUploaderAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, floatSerializer, newFileUploaderAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, floatSerializer, newFileUploaderAppModel.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && Intrinsics.EZpvd(newFileUploaderAppModel.isHidden(), Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, newFileUploaderAppModel.isHidden());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (r24v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r43v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r25v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r43v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0011: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r26v0 java.lang.Boolean))
  (r27v0 int)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0015: ARITH (r43v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r28v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r43v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (r30v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r43v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002e: ARITH (r43v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0034: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r32v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0038: ARITH (r43v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r33v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0040: ARITH (r43v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r34v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0048: ARITH (r43v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r35v0 java.util.List))
  (r36v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0050: ARITH (r43v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0056: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r37v0 java.lang.Boolean))
  (r38v0 java.lang.String)
  (r39v0 java.lang.String)
  (r40v0 java.lang.Float)
  (r41v0 java.lang.Float)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005d: ARITH (r43v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0062: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r42v0 java.lang.Boolean))
 A[MD:(java.util.List<java.lang.String>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>, java.lang.Boolean, int, java.lang.Long, java.lang.String, int, boolean, java.lang.Boolean, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void (m)] (LINE:1289) call: com.okinc.ok_kyc_core.data.remote.networkmodel.NewFileUploaderAppModel.<init>(java.util.List, java.util.List, java.lang.Boolean, int, java.lang.Long, java.lang.String, int, boolean, java.lang.Boolean, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void type: THIS */
    public /* synthetic */ NewFileUploaderAppModel(List list, List list2, Boolean bool, int i, Long l, String str, int i2, boolean z, Boolean bool2, List list3, List list4, List list5, String str2, Boolean bool3, String str3, String str4, Float f, Float f2, Boolean bool4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i3 & 2) != 0 ? null : list2, (i3 & 4) != 0 ? Boolean.FALSE : bool, i, (i3 & 16) != 0 ? null : l, (i3 & 32) != 0 ? null : str, i2, (i3 & 128) != 0 ? false : z, (i3 & 256) != 0 ? Boolean.FALSE : bool2, (i3 & 512) != 0 ? null : list3, (i3 & 1024) != 0 ? null : list4, (i3 & 2048) != 0 ? null : list5, str2, (i3 & 8192) != 0 ? Boolean.FALSE : bool3, str3, str4, f, f2, (i3 & 262144) != 0 ? Boolean.FALSE : bool4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewFileUploaderAppModel(@NotNull List<String> list, List<File> list2, Boolean bool, int i, Long l, String str, int i2, boolean z, Boolean bool2, List<String> list3, List<String> list4, List<String> list5, @NotNull String str2, Boolean bool3, String str3, String str4, Float f, Float f2, Boolean bool4) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.extensions = list;
        this.files = list2;
        this.isShowCamera = bool;
        this.imageType = i;
        this.limit = l;
        this.tipsTitle = str;
        this.fileSize = i2;
        this.shouldCallOcr = z;
        this.shouldShowOnLoad = bool2;
        this.viewIdsToShow = list3;
        this.viewIdsToHide = list4;
        this.viewIdsToCollapse = list5;
        this.id = str2;
        this.required = bool3;
        this.version = str3;
        this.value = str4;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = bool4;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public NewFileUploaderAppModel clone() {
        return copy$default(this, null, null, null, 0, null, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }
}
