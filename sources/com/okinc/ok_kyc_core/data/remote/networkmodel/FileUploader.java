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
@SerialName("file-uploader")
@Serializable
public final class FileUploader extends UIComponent implements Parcelable {
    private Float bottomMargin;
    private final List<String> extensions;
    private final Integer fileSize;
    private final List<File> files;
    private final String id;
    private final int imageType;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Long limit;
    private final Boolean required;
    private final Boolean shouldCallOcr;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FileUploader> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), new ArrayListSerializer(File$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<FileUploader> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FileUploader createFromParcel(Parcel parcel) {
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
            return new FileUploader(arrayListCreateStringArrayList, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FileUploader[] newArray(int i) {
            return new FileUploader[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.extensions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component11() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component12() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<File> component2() {
        return this.files;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.fileSize;
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
    public final Boolean component6() {
        return this.shouldCallOcr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FileUploader copy(@NotNull List<String> list, List<File> list2, Integer num, int i, Long l, Boolean bool, @NotNull String str, Boolean bool2, String str2, String str3, Float f, Float f2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new FileUploader(list, list2, num, i, l, bool, str, bool2, str2, str3, f, f2, bool3);
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
        if (!(obj instanceof FileUploader)) {
            return false;
        }
        FileUploader fileUploader = (FileUploader) obj;
        return Intrinsics.EZpvd(this.extensions, fileUploader.extensions) && Intrinsics.EZpvd(this.files, fileUploader.files) && Intrinsics.EZpvd(this.fileSize, fileUploader.fileSize) && this.imageType == fileUploader.imageType && Intrinsics.EZpvd(this.limit, fileUploader.limit) && Intrinsics.EZpvd(this.shouldCallOcr, fileUploader.shouldCallOcr) && Intrinsics.EZpvd((Object) this.id, (Object) fileUploader.id) && Intrinsics.EZpvd(this.required, fileUploader.required) && Intrinsics.EZpvd((Object) this.version, (Object) fileUploader.version) && Intrinsics.EZpvd((Object) this.value, (Object) fileUploader.value) && Intrinsics.EZpvd(this.bottomMargin, fileUploader.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, fileUploader.leftMargin) && Intrinsics.EZpvd(this.isHidden, fileUploader.isHidden);
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
    public int hashCode() {
        int iHashCode = this.extensions.hashCode();
        List<File> list = this.files;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        Integer num = this.fileSize;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        int iHashCode4 = Integer.hashCode(this.imageType);
        Long l = this.limit;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        Boolean bool = this.shouldCallOcr;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        int iHashCode7 = this.id.hashCode();
        Boolean bool2 = this.required;
        int iHashCode8 = bool2 == null ? 0 : bool2.hashCode();
        String str = this.version;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        String str2 = this.value;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        Float f = this.bottomMargin;
        int iHashCode11 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        int iHashCode12 = f2 == null ? 0 : f2.hashCode();
        Boolean bool3 = this.isHidden;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (bool3 != null ? bool3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean isHidden() {
        return this.isHidden;
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
        return "FileUploader(extensions=" + this.extensions + ", files=" + this.files + ", fileSize=" + this.fileSize + ", imageType=" + this.imageType + ", limit=" + this.limit + ", shouldCallOcr=" + this.shouldCallOcr + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isHidden=" + this.isHidden + ")";
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
        Boolean bool = this.shouldCallOcr;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.id);
        Boolean bool2 = this.required;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
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
        Boolean bool3 = this.isHidden;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.FileUploader.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FileUploader> serializer() {
            return FileUploader$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileUploader(int i, List list, List list2, Integer num, int i2, Long l, Boolean bool, String str, Boolean bool2, String str2, String str3, Float f, Float f2, Boolean bool3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (3917 != (i & 3917)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3917, FileUploader$$serializer.INSTANCE.getDescriptor());
        }
        this.extensions = list;
        if ((i & 2) == 0) {
            this.files = null;
        } else {
            this.files = list2;
        }
        this.fileSize = num;
        this.imageType = i2;
        if ((i & 16) == 0) {
            this.limit = null;
        } else {
            this.limit = l;
        }
        this.shouldCallOcr = (i & 32) == 0 ? Boolean.FALSE : bool;
        this.id = str;
        this.required = (i & 128) == 0 ? Boolean.FALSE : bool2;
        this.version = str2;
        this.value = str3;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = (i & 4096) == 0 ? Boolean.FALSE : bool3;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(FileUploader fileUploader, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(fileUploader, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], fileUploader.extensions);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || fileUploader.files != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], fileUploader.files);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, fileUploader.fileSize);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, fileUploader.imageType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || fileUploader.limit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, fileUploader.limit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(fileUploader.shouldCallOcr, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, fileUploader.shouldCallOcr);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, fileUploader.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(fileUploader.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, fileUploader.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, fileUploader.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, fileUploader.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, fileUploader.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, fileUploader.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd(fileUploader.isHidden(), Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, fileUploader.isHidden());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0044: CONSTRUCTOR 
  (r18v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r19v0 java.util.List))
  (r20v0 java.lang.Integer)
  (r21v0 int)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r22v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (r24v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0023: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.Float)
  (r29v0 java.lang.Float)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0027: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r30v0 java.lang.Boolean))
 A[MD:(java.util.List<java.lang.String>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>, java.lang.Integer, int, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void (m)] (LINE:1182) call: com.okinc.ok_kyc_core.data.remote.networkmodel.FileUploader.<init>(java.util.List, java.util.List, java.lang.Integer, int, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void type: THIS */
    public /* synthetic */ FileUploader(List list, List list2, Integer num, int i, Long l, Boolean bool, String str, Boolean bool2, String str2, String str3, Float f, Float f2, Boolean bool3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, num, i, (i2 & 16) != 0 ? null : l, (i2 & 32) != 0 ? Boolean.FALSE : bool, str, (i2 & 128) != 0 ? Boolean.FALSE : bool2, str2, str3, f, f2, (i2 & 4096) != 0 ? Boolean.FALSE : bool3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileUploader(@NotNull List<String> list, List<File> list2, Integer num, int i, Long l, Boolean bool, @NotNull String str, Boolean bool2, String str2, String str3, Float f, Float f2, Boolean bool3) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.extensions = list;
        this.files = list2;
        this.fileSize = num;
        this.imageType = i;
        this.limit = l;
        this.shouldCallOcr = bool;
        this.id = str;
        this.required = bool2;
        this.version = str2;
        this.value = str3;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = bool3;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public FileUploaderAppModel toAppModel() {
        List<String> list = this.extensions;
        List<File> list2 = this.files;
        int i = this.imageType;
        Long l = this.limit;
        Integer num = this.fileSize;
        int iIntValue = num != null ? num.intValue() : 5;
        Boolean bool = this.shouldCallOcr;
        return new FileUploaderAppModel(list, list2, i, l, iIntValue, bool != null ? bool.booleanValue() : false, getId(), getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin(), isHidden());
    }
}
