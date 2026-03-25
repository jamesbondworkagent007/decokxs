package com.okinc.business.market.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ProtocolInfoData implements Parcelable {
    private final String progressFlag;
    private final String protocolColorNumber;
    private final List<String> protocolGradientColor;
    private final String protocolGradientColorUrl;
    private final String protocolGrayLogo;
    private final String protocolId;
    private final String protocolLogo;
    private final String protocolName;
    private final String protocolTagKey;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ProtocolInfoData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<ProtocolInfoData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProtocolInfoData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ProtocolInfoData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProtocolInfoData[] newArray(int i) {
            return new ProtocolInfoData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProtocolInfoData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    @SerialName("progressFlag")
    public static /* synthetic */ void getProgressFlag$annotations() {
    }

    @SerialName("protocolColorNumber")
    public static /* synthetic */ void getProtocolColorNumber$annotations() {
    }

    @SerialName("protocolGradientColor")
    public static /* synthetic */ void getProtocolGradientColor$annotations() {
    }

    @SerialName("protocolGradientColorUrl")
    public static /* synthetic */ void getProtocolGradientColorUrl$annotations() {
    }

    @SerialName("protocolGrayLogo")
    public static /* synthetic */ void getProtocolGrayLogo$annotations() {
    }

    @SerialName("protocolId")
    public static /* synthetic */ void getProtocolId$annotations() {
    }

    @SerialName("protocolLogo")
    public static /* synthetic */ void getProtocolLogo$annotations() {
    }

    @SerialName("protocolName")
    public static /* synthetic */ void getProtocolName$annotations() {
    }

    @SerialName("protocolTagKey")
    public static /* synthetic */ void getProtocolTagKey$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.protocolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.protocolLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.protocolGrayLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.protocolTagKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.protocolColorNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.protocolGradientColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.protocolGradientColorUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.progressFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtocolInfoData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<String> list, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new ProtocolInfoData(str, str2, str3, str4, str5, str6, list, str7, str8);
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
        if (!(obj instanceof ProtocolInfoData)) {
            return false;
        }
        ProtocolInfoData protocolInfoData = (ProtocolInfoData) obj;
        return Intrinsics.EZpvd((Object) this.protocolId, (Object) protocolInfoData.protocolId) && Intrinsics.EZpvd((Object) this.protocolName, (Object) protocolInfoData.protocolName) && Intrinsics.EZpvd((Object) this.protocolLogo, (Object) protocolInfoData.protocolLogo) && Intrinsics.EZpvd((Object) this.protocolGrayLogo, (Object) protocolInfoData.protocolGrayLogo) && Intrinsics.EZpvd((Object) this.protocolTagKey, (Object) protocolInfoData.protocolTagKey) && Intrinsics.EZpvd((Object) this.protocolColorNumber, (Object) protocolInfoData.protocolColorNumber) && Intrinsics.EZpvd(this.protocolGradientColor, protocolInfoData.protocolGradientColor) && Intrinsics.EZpvd((Object) this.protocolGradientColorUrl, (Object) protocolInfoData.protocolGradientColorUrl) && Intrinsics.EZpvd((Object) this.progressFlag, (Object) protocolInfoData.progressFlag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProgressFlag() {
        return this.progressFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProtocolColorNumber() {
        return this.protocolColorNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getProtocolGradientColor() {
        return this.protocolGradientColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProtocolGradientColorUrl() {
        return this.protocolGradientColorUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProtocolGrayLogo() {
        return this.protocolGrayLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProtocolLogo() {
        return this.protocolLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProtocolName() {
        return this.protocolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProtocolTagKey() {
        return this.protocolTagKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.protocolId.hashCode() * 31) + this.protocolName.hashCode()) * 31) + this.protocolLogo.hashCode()) * 31) + this.protocolGrayLogo.hashCode()) * 31) + this.protocolTagKey.hashCode()) * 31) + this.protocolColorNumber.hashCode()) * 31) + this.protocolGradientColor.hashCode()) * 31) + this.protocolGradientColorUrl.hashCode()) * 31) + this.progressFlag.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProtocolInfoData(protocolId=" + this.protocolId + ", protocolName=" + this.protocolName + ", protocolLogo=" + this.protocolLogo + ", protocolGrayLogo=" + this.protocolGrayLogo + ", protocolTagKey=" + this.protocolTagKey + ", protocolColorNumber=" + this.protocolColorNumber + ", protocolGradientColor=" + this.protocolGradientColor + ", protocolGradientColorUrl=" + this.protocolGradientColorUrl + ", progressFlag=" + this.progressFlag + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.protocolId);
        parcel.writeString(this.protocolName);
        parcel.writeString(this.protocolLogo);
        parcel.writeString(this.protocolGrayLogo);
        parcel.writeString(this.protocolTagKey);
        parcel.writeString(this.protocolColorNumber);
        parcel.writeStringList(this.protocolGradientColor);
        parcel.writeString(this.protocolGradientColorUrl);
        parcel.writeString(this.progressFlag);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.common.ProtocolInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProtocolInfoData> serializer() {
            return ProtocolInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProtocolInfoData(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.protocolId = "";
        } else {
            this.protocolId = str;
        }
        if ((i & 2) == 0) {
            this.protocolName = "";
        } else {
            this.protocolName = str2;
        }
        if ((i & 4) == 0) {
            this.protocolLogo = "";
        } else {
            this.protocolLogo = str3;
        }
        if ((i & 8) == 0) {
            this.protocolGrayLogo = "";
        } else {
            this.protocolGrayLogo = str4;
        }
        if ((i & 16) == 0) {
            this.protocolTagKey = "";
        } else {
            this.protocolTagKey = str5;
        }
        if ((i & 32) == 0) {
            this.protocolColorNumber = "";
        } else {
            this.protocolColorNumber = str6;
        }
        if ((i & 64) == 0) {
            this.protocolGradientColor = yDY.AhwBna();
        } else {
            this.protocolGradientColor = list;
        }
        if ((i & 128) == 0) {
            this.protocolGradientColorUrl = "";
        } else {
            this.protocolGradientColorUrl = str7;
        }
        if ((i & 256) == 0) {
            this.progressFlag = "";
        } else {
            this.progressFlag = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ProtocolInfoData protocolInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) protocolInfoData.protocolId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, protocolInfoData.protocolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) protocolInfoData.protocolName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, protocolInfoData.protocolName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) protocolInfoData.protocolLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, protocolInfoData.protocolLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) protocolInfoData.protocolGrayLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, protocolInfoData.protocolGrayLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) protocolInfoData.protocolTagKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, protocolInfoData.protocolTagKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) protocolInfoData.protocolColorNumber, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, protocolInfoData.protocolColorNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(protocolInfoData.protocolGradientColor, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], protocolInfoData.protocolGradientColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) protocolInfoData.protocolGradientColorUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, protocolInfoData.protocolGradientColorUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) protocolInfoData.progressFlag, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, protocolInfoData.progressFlag);
    }

    public ProtocolInfoData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<String> list, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.protocolId = str;
        this.protocolName = str2;
        this.protocolLogo = str3;
        this.protocolGrayLogo = str4;
        this.protocolTagKey = str5;
        this.protocolColorNumber = str6;
        this.protocolGradientColor = list;
        this.protocolGradientColorUrl = str7;
        this.progressFlag = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0058: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:26)) : (r17v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.business.market.data.model.common.ProtocolInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ProtocolInfoData(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? yDY.AhwBna() : list, (i & 128) != 0 ? "" : str7, (i & 256) == 0 ? str8 : "");
    }
}
