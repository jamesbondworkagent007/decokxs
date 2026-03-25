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
public final class FileUploaderAppModel extends UIComponentAppModel implements Parcelable {
    private Float bottomMargin;
    private final List<String> extensions;
    private final int fileSize;
    private List<File> files;
    private String id;
    private final int imageType;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Long limit;
    private final Boolean required;
    private final boolean shouldCallOcr;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FileUploaderAppModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), new ArrayListSerializer(File$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<FileUploaderAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FileUploaderAppModel createFromParcel(Parcel parcel) {
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
            return new FileUploaderAppModel(arrayListCreateStringArrayList, arrayList, parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FileUploaderAppModel[] newArray(int i) {
            return new FileUploaderAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.FileUploaderAppModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileUploaderAppModel copy$default(FileUploaderAppModel fileUploaderAppModel, List list, List list2, int i, Long l, int i2, boolean z, String str, Boolean bool, String str2, String str3, Float f, Float f2, Boolean bool2, int i3, Object obj) {
        return fileUploaderAppModel.copy((i3 & 1) != 0 ? fileUploaderAppModel.extensions : list, (i3 & 2) != 0 ? fileUploaderAppModel.files : list2, (i3 & 4) != 0 ? fileUploaderAppModel.imageType : i, (i3 & 8) != 0 ? fileUploaderAppModel.limit : l, (i3 & 16) != 0 ? fileUploaderAppModel.fileSize : i2, (i3 & 32) != 0 ? fileUploaderAppModel.shouldCallOcr : z, (i3 & 64) != 0 ? fileUploaderAppModel.id : str, (i3 & 128) != 0 ? fileUploaderAppModel.required : bool, (i3 & 256) != 0 ? fileUploaderAppModel.version : str2, (i3 & 512) != 0 ? fileUploaderAppModel.value : str3, (i3 & 1024) != 0 ? fileUploaderAppModel.bottomMargin : f, (i3 & 2048) != 0 ? fileUploaderAppModel.leftMargin : f2, (i3 & 4096) != 0 ? fileUploaderAppModel.isHidden : bool2);
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
    public final int component3() {
        return this.imageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.fileSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
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
    public final FileUploaderAppModel copy(@NotNull List<String> list, List<File> list2, int i, Long l, int i2, boolean z, @NotNull String str, Boolean bool, String str2, String str3, Float f, Float f2, Boolean bool2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new FileUploaderAppModel(list, list2, i, l, i2, z, str, bool, str2, str3, f, f2, bool2);
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
        if (!(obj instanceof FileUploaderAppModel)) {
            return false;
        }
        FileUploaderAppModel fileUploaderAppModel = (FileUploaderAppModel) obj;
        return Intrinsics.EZpvd(this.extensions, fileUploaderAppModel.extensions) && Intrinsics.EZpvd(this.files, fileUploaderAppModel.files) && this.imageType == fileUploaderAppModel.imageType && Intrinsics.EZpvd(this.limit, fileUploaderAppModel.limit) && this.fileSize == fileUploaderAppModel.fileSize && this.shouldCallOcr == fileUploaderAppModel.shouldCallOcr && Intrinsics.EZpvd((Object) this.id, (Object) fileUploaderAppModel.id) && Intrinsics.EZpvd(this.required, fileUploaderAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) fileUploaderAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) fileUploaderAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, fileUploaderAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, fileUploaderAppModel.leftMargin) && Intrinsics.EZpvd(this.isHidden, fileUploaderAppModel.isHidden);
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
    public int hashCode() {
        int iHashCode = this.extensions.hashCode();
        List<File> list = this.files;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        int iHashCode3 = Integer.hashCode(this.imageType);
        Long l = this.limit;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        int iHashCode5 = Integer.hashCode(this.fileSize);
        int iHashCode6 = Boolean.hashCode(this.shouldCallOcr);
        int iHashCode7 = this.id.hashCode();
        Boolean bool = this.required;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        String str = this.version;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        String str2 = this.value;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        Float f = this.bottomMargin;
        int iHashCode11 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        int iHashCode12 = f2 == null ? 0 : f2.hashCode();
        Boolean bool2 = this.isHidden;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean isHidden() {
        return this.isHidden;
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
        return "FileUploaderAppModel(extensions=" + this.extensions + ", files=" + this.files + ", imageType=" + this.imageType + ", limit=" + this.limit + ", fileSize=" + this.fileSize + ", shouldCallOcr=" + this.shouldCallOcr + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isHidden=" + this.isHidden + ")";
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
        parcel.writeInt(this.imageType);
        Long l = this.limit;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.fileSize);
        parcel.writeInt(this.shouldCallOcr ? 1 : 0);
        parcel.writeString(this.id);
        Boolean bool = this.required;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
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
        Boolean bool2 = this.isHidden;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.FileUploaderAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FileUploaderAppModel> serializer() {
            return FileUploaderAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileUploaderAppModel(int i, List list, List list2, int i2, Long l, int i3, boolean z, String str, Boolean bool, String str2, String str3, Float f, Float f2, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (3925 != (i & 3925)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3925, FileUploaderAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.extensions = list;
        if ((i & 2) == 0) {
            this.files = null;
        } else {
            this.files = list2;
        }
        this.imageType = i2;
        if ((i & 8) == 0) {
            this.limit = null;
        } else {
            this.limit = l;
        }
        this.fileSize = i3;
        this.shouldCallOcr = (i & 32) == 0 ? false : z;
        this.id = str;
        this.required = (i & 128) == 0 ? Boolean.FALSE : bool;
        this.version = str2;
        this.value = str3;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = (i & 4096) == 0 ? Boolean.FALSE : bool2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(FileUploaderAppModel fileUploaderAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(fileUploaderAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], fileUploaderAppModel.extensions);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || fileUploaderAppModel.files != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], fileUploaderAppModel.files);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, fileUploaderAppModel.imageType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || fileUploaderAppModel.limit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, fileUploaderAppModel.limit);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 4, fileUploaderAppModel.fileSize);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || fileUploaderAppModel.shouldCallOcr) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, fileUploaderAppModel.shouldCallOcr);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, fileUploaderAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(fileUploaderAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, fileUploaderAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, fileUploaderAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, fileUploaderAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, fileUploaderAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, fileUploaderAppModel.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd(fileUploaderAppModel.isHidden(), Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, fileUploaderAppModel.isHidden());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0043: CONSTRUCTOR 
  (r18v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r19v0 java.util.List))
  (r20v0 int)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r21v0 java.lang.Long))
  (r22v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (r24v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0022: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.Float)
  (r29v0 java.lang.Float)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002c: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r30v0 java.lang.Boolean))
 A[MD:(java.util.List<java.lang.String>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>, int, java.lang.Long, int, boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void (m)] (LINE:1217) call: com.okinc.ok_kyc_core.data.remote.networkmodel.FileUploaderAppModel.<init>(java.util.List, java.util.List, int, java.lang.Long, int, boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void type: THIS */
    public /* synthetic */ FileUploaderAppModel(List list, List list2, int i, Long l, int i2, boolean z, String str, Boolean bool, String str2, String str3, Float f, Float f2, Boolean bool2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i3 & 2) != 0 ? null : list2, i, (i3 & 8) != 0 ? null : l, i2, (i3 & 32) != 0 ? false : z, str, (i3 & 128) != 0 ? Boolean.FALSE : bool, str2, str3, f, f2, (i3 & 4096) != 0 ? Boolean.FALSE : bool2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileUploaderAppModel(@NotNull List<String> list, List<File> list2, int i, Long l, int i2, boolean z, @NotNull String str, Boolean bool, String str2, String str3, Float f, Float f2, Boolean bool2) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.extensions = list;
        this.files = list2;
        this.imageType = i;
        this.limit = l;
        this.fileSize = i2;
        this.shouldCallOcr = z;
        this.id = str;
        this.required = bool;
        this.version = str2;
        this.value = str3;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = bool2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public FileUploaderAppModel clone() {
        return copy$default(this, null, null, 0, null, 0, false, null, null, null, null, null, null, null, 8191, null);
    }
}
