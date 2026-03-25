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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43788rvr;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class ImageListAppModel extends UIComponentAppModel implements Parcelable {
    private final String adaptiveMode;
    private final UIAlignment align;
    private Float bottomMargin;
    private final Integer height;
    private String id;
    private Boolean isHidden;
    private final List<ImageItem> items;
    private final Float leftMargin;
    private final Boolean required;
    private final String type;
    private String value;
    private final String version;
    private final Integer width;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ImageListAppModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(ImageItem$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<ImageListAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageListAppModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            UIAlignment uIAlignmentValueOf = parcel.readInt() == 0 ? null : UIAlignment.valueOf(parcel.readString());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ImageItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new ImageListAppModel(string, uIAlignmentValueOf, numValueOf, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageListAppModel[] newArray(int i) {
            return new ImageListAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.ImageListAppModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageListAppModel copy$default(ImageListAppModel imageListAppModel, String str, UIAlignment uIAlignment, Integer num, List list, String str2, Integer num2, Boolean bool, String str3, Boolean bool2, String str4, String str5, Float f, Float f2, int i, Object obj) {
        return imageListAppModel.copy((i & 1) != 0 ? imageListAppModel.adaptiveMode : str, (i & 2) != 0 ? imageListAppModel.align : uIAlignment, (i & 4) != 0 ? imageListAppModel.height : num, (i & 8) != 0 ? imageListAppModel.items : list, (i & 16) != 0 ? imageListAppModel.type : str2, (i & 32) != 0 ? imageListAppModel.width : num2, (i & 64) != 0 ? imageListAppModel.isHidden : bool, (i & 128) != 0 ? imageListAppModel.id : str3, (i & 256) != 0 ? imageListAppModel.required : bool2, (i & 512) != 0 ? imageListAppModel.version : str4, (i & 1024) != 0 ? imageListAppModel.value : str5, (i & 2048) != 0 ? imageListAppModel.bottomMargin : f, (i & 4096) != 0 ? imageListAppModel.leftMargin : f2);
    }

    @Serializable(with = C43788rvr.class)
    public static /* synthetic */ void getAlign$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.adaptiveMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component12() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component13() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIAlignment component2() {
        return this.align;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ImageItem> component4() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageListAppModel copy(String str, UIAlignment uIAlignment, Integer num, List<ImageItem> list, String str2, Integer num2, Boolean bool, @NotNull String str3, Boolean bool2, String str4, String str5, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str3, "");
        return new ImageListAppModel(str, uIAlignment, num, list, str2, num2, bool, str3, bool2, str4, str5, f, f2);
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
        if (!(obj instanceof ImageListAppModel)) {
            return false;
        }
        ImageListAppModel imageListAppModel = (ImageListAppModel) obj;
        return Intrinsics.EZpvd((Object) this.adaptiveMode, (Object) imageListAppModel.adaptiveMode) && this.align == imageListAppModel.align && Intrinsics.EZpvd(this.height, imageListAppModel.height) && Intrinsics.EZpvd(this.items, imageListAppModel.items) && Intrinsics.EZpvd((Object) this.type, (Object) imageListAppModel.type) && Intrinsics.EZpvd(this.width, imageListAppModel.width) && Intrinsics.EZpvd(this.isHidden, imageListAppModel.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) imageListAppModel.id) && Intrinsics.EZpvd(this.required, imageListAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) imageListAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) imageListAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, imageListAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, imageListAppModel.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdaptiveMode() {
        return this.adaptiveMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIAlignment getAlign() {
        return this.align;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ImageItem> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
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
    public final Integer getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.adaptiveMode;
        int iHashCode = str == null ? 0 : str.hashCode();
        UIAlignment uIAlignment = this.align;
        int iHashCode2 = uIAlignment == null ? 0 : uIAlignment.hashCode();
        Integer num = this.height;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        List<ImageItem> list = this.items;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        String str2 = this.type;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.width;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode7 = bool == null ? 0 : bool.hashCode();
        int iHashCode8 = this.id.hashCode();
        Boolean bool2 = this.required;
        int iHashCode9 = bool2 == null ? 0 : bool2.hashCode();
        String str3 = this.version;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.value;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        Float f = this.bottomMargin;
        int iHashCode12 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (f2 != null ? f2.hashCode() : 0);
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
        return "ImageListAppModel(adaptiveMode=" + this.adaptiveMode + ", align=" + this.align + ", height=" + this.height + ", items=" + this.items + ", type=" + this.type + ", width=" + this.width + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.adaptiveMode);
        UIAlignment uIAlignment = this.align;
        if (uIAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(uIAlignment.name());
        }
        Integer num = this.height;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<ImageItem> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ImageItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.type);
        Integer num2 = this.width;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool = this.isHidden;
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
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ImageListAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ImageListAppModel> serializer() {
            return ImageListAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageListAppModel(int i, String str, UIAlignment uIAlignment, Integer num, List list, String str2, Integer num2, Boolean bool, String str3, Boolean bool2, String str4, String str5, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (5762 != (i & 5762)) {
            PluginExceptionsKt.throwMissingFieldException(i, 5762, ImageListAppModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.adaptiveMode = "";
        } else {
            this.adaptiveMode = str;
        }
        this.align = uIAlignment;
        this.height = (i & 4) == 0 ? 0 : num;
        this.items = (i & 8) == 0 ? yDY.AhwBna() : list;
        if ((i & 16) == 0) {
            this.type = "";
        } else {
            this.type = str2;
        }
        this.width = (i & 32) == 0 ? 0 : num2;
        this.isHidden = (i & 64) == 0 ? Boolean.FALSE : bool;
        this.id = str3;
        this.required = (i & 256) == 0 ? Boolean.FALSE : bool2;
        this.version = str4;
        this.value = str5;
        this.bottomMargin = (i & 2048) == 0 ? Float.valueOf(0.0f) : f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ImageListAppModel imageListAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        UIComponentAppModel.write$Self(imageListAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) imageListAppModel.adaptiveMode, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, imageListAppModel.adaptiveMode);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, C43788rvr.KWHzl, imageListAppModel.align);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || (num2 = imageListAppModel.height) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, imageListAppModel.height);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(imageListAppModel.items, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], imageListAppModel.items);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) imageListAppModel.type, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, imageListAppModel.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || (num = imageListAppModel.width) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, imageListAppModel.width);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(imageListAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, imageListAppModel.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, imageListAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(imageListAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, imageListAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, imageListAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, imageListAppModel.getValue());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(imageListAppModel.getBottomMargin(), Float.valueOf(0.0f))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, imageListAppModel.getBottomMargin());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, FloatSerializer.INSTANCE, imageListAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0066: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (r19v0 com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000c: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r20v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0019: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0021: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:2363)) : (r21v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002d: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r23v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0039: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (r25v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0043: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0049: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r26v0 java.lang.Boolean))
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x004d: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0056: INVOKE (0.0f float) STATIC call: java.lang.Float.valueOf(float):java.lang.Float A[MD:(float):java.lang.Float (c), WRAPPED] (LINE:2371)) : (r29v0 java.lang.Float))
  (r30v0 java.lang.Float)
 A[MD:(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.Integer, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.ImageItem>, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:2359) call: com.okinc.ok_kyc_core.data.remote.networkmodel.ImageListAppModel.<init>(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.Integer, java.util.List, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ ImageListAppModel(String str, UIAlignment uIAlignment, Integer num, List list, String str2, Integer num2, Boolean bool, String str3, Boolean bool2, String str4, String str5, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, uIAlignment, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? 0 : num2, (i & 64) != 0 ? Boolean.FALSE : bool, str3, (i & 256) != 0 ? Boolean.FALSE : bool2, str4, str5, (i & 2048) != 0 ? Float.valueOf(0.0f) : f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageListAppModel(String str, UIAlignment uIAlignment, Integer num, List<ImageItem> list, String str2, Integer num2, Boolean bool, @NotNull String str3, Boolean bool2, String str4, String str5, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str3, "");
        this.adaptiveMode = str;
        this.align = uIAlignment;
        this.height = num;
        this.items = list;
        this.type = str2;
        this.width = num2;
        this.isHidden = bool;
        this.id = str3;
        this.required = bool2;
        this.version = str4;
        this.value = str5;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public ImageListAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
}
