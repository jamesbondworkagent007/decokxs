package com.okinc.dexkline.market.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.ibm.icu.text.DateFormat;
import com.okinc.dexkline.market.common.constants.StringBooleanType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class CompactTagData implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("e")
    private final TagExtraData extra;

    @SerializedName(DateFormat.MINUTE)
    private final StringBooleanType hasMetadata;

    @SerializedName("k")
    private final String key;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CompactTagData> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, StringBooleanType.Companion.serializer(), null};

    public static final class Creator implements Parcelable.Creator<CompactTagData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompactTagData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CompactTagData(parcel.readString(), StringBooleanType.valueOf(parcel.readString()), TagExtraData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompactTagData[] newArray(int i) {
            return new CompactTagData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CompactTagData() {
        this((String) null, (StringBooleanType) null, (TagExtraData) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CompactTagData copy$default(CompactTagData compactTagData, String str, StringBooleanType stringBooleanType, TagExtraData tagExtraData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = compactTagData.key;
        }
        if ((i & 2) != 0) {
            stringBooleanType = compactTagData.hasMetadata;
        }
        if ((i & 4) != 0) {
            tagExtraData = compactTagData.extra;
        }
        return compactTagData.AEQbTJ(str, stringBooleanType, tagExtraData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringBooleanType AEQbTJ() {
        return this.hasMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CompactTagData AEQbTJ(@NotNull String str, @NotNull StringBooleanType stringBooleanType, @NotNull TagExtraData tagExtraData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        Intrinsics.checkNotNullParameter(tagExtraData, "");
        return new CompactTagData(str, stringBooleanType, tagExtraData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagExtraData copydefault() {
        return this.extra;
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
        if (!(obj instanceof CompactTagData)) {
            return false;
        }
        CompactTagData compactTagData = (CompactTagData) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) compactTagData.key) && this.hasMetadata == compactTagData.hasMetadata && Intrinsics.EZpvd(this.extra, compactTagData.extra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.key.hashCode() * 31) + this.hasMetadata.hashCode()) * 31) + this.extra.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CompactTagData(key=" + this.key + ", hasMetadata=" + this.hasMetadata + ", extra=" + this.extra + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.hasMetadata.name());
        this.extra.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.CompactTagData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CompactTagData> serializer() {
            return CompactTagData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CompactTagData(int i, String str, StringBooleanType stringBooleanType, TagExtraData tagExtraData, SerializationConstructorMarker serializationConstructorMarker) {
        this.key = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.hasMetadata = StringBooleanType.FALSE;
        } else {
            this.hasMetadata = stringBooleanType;
        }
        if ((i & 4) == 0) {
            this.extra = new TagExtraData((String) null, (String) null, (String) null, (String) null, (String) null, (StringBooleanType) null, 63, (DefaultConstructorMarker) null);
        } else {
            this.extra = tagExtraData;
        }
    }

    public static final /* synthetic */ void EZpvd(CompactTagData compactTagData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) compactTagData.key, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, compactTagData.key);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || compactTagData.hasMetadata != StringBooleanType.FALSE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], compactTagData.hasMetadata);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(compactTagData.extra, new TagExtraData((String) null, (String) null, (String) null, (String) null, (String) null, (StringBooleanType) null, 63, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, TagExtraData$$serializer.INSTANCE, compactTagData.extra);
    }

    public CompactTagData(@NotNull String str, @NotNull StringBooleanType stringBooleanType, @NotNull TagExtraData tagExtraData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        Intrinsics.checkNotNullParameter(tagExtraData, "");
        this.key = str;
        this.hasMetadata = stringBooleanType;
        this.extra = tagExtraData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:com.okinc.dexkline.market.common.constants.StringBooleanType:?: TERNARY null = ((wrap:int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.dexkline.market.common.constants.StringBooleanType:0x000a: SGET  A[WRAPPED] (LINE:18) com.okinc.dexkline.market.common.constants.StringBooleanType.FALSE com.okinc.dexkline.market.common.constants.StringBooleanType) : (r11v0 com.okinc.dexkline.market.common.constants.StringBooleanType))
  (wrap:com.okinc.dexkline.market.data.model.TagExtraData:?: TERNARY null = ((wrap:int:0x000c: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.dexkline.market.data.model.TagExtraData:0x001c: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.dexkline.market.common.constants.StringBooleanType:?: CAST (com.okinc.dexkline.market.common.constants.StringBooleanType) (null com.okinc.dexkline.market.common.constants.StringBooleanType))
  (63 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.dexkline.market.common.constants.StringBooleanType, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:21) call: com.okinc.dexkline.market.data.model.TagExtraData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.dexkline.market.common.constants.StringBooleanType, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r12v0 com.okinc.dexkline.market.data.model.TagExtraData))
 A[MD:(java.lang.String, com.okinc.dexkline.market.common.constants.StringBooleanType, com.okinc.dexkline.market.data.model.TagExtraData):void (m)] (LINE:12) call: com.okinc.dexkline.market.data.model.CompactTagData.<init>(java.lang.String, com.okinc.dexkline.market.common.constants.StringBooleanType, com.okinc.dexkline.market.data.model.TagExtraData):void type: THIS */
    public /* synthetic */ CompactTagData(String str, StringBooleanType stringBooleanType, TagExtraData tagExtraData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? StringBooleanType.FALSE : stringBooleanType, (i & 4) != 0 ? new TagExtraData((String) null, (String) null, (String) null, (String) null, (String) null, (StringBooleanType) null, 63, (DefaultConstructorMarker) null) : tagExtraData);
    }
}
