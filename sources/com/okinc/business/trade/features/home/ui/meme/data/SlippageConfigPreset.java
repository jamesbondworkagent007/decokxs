package com.okinc.business.trade.features.home.ui.meme.data;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class SlippageConfigPreset implements Parcelable {
    private final String dynamicMax;
    private String dynamicMaxSlippageValue;
    private final String dynamicMin;
    private final String dynamicRecommendMaxValue;
    private final String dynamicRecommendMinValue;
    private final String fixedMax;
    private final String fixedMin;
    private final String fixedRecommendMax;
    private final String fixedRecommendMin;
    private final List<SlippageRange> slippageRange;
    private int slippageType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SlippageConfigPreset> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SlippageRange$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<SlippageConfigPreset> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlippageConfigPreset createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SlippageRange.CREATOR.createFromParcel(parcel));
            }
            return new SlippageConfigPreset(string, string2, string3, string4, string5, string6, string7, string8, string9, arrayList, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlippageConfigPreset[] newArray(int i) {
            return new SlippageConfigPreset[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SlippageConfigPreset() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.dynamicMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SlippageRange> component10() {
        return this.slippageRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.dynamicMaxSlippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.dynamicMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.dynamicRecommendMaxValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.dynamicRecommendMinValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fixedMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fixedMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.fixedRecommendMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.fixedRecommendMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageConfigPreset copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull List<SlippageRange> list, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SlippageConfigPreset(str, str2, str3, str4, str5, str6, str7, str8, str9, list, i);
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
        if (!(obj instanceof SlippageConfigPreset)) {
            return false;
        }
        SlippageConfigPreset slippageConfigPreset = (SlippageConfigPreset) obj;
        return Intrinsics.EZpvd((Object) this.dynamicMax, (Object) slippageConfigPreset.dynamicMax) && Intrinsics.EZpvd((Object) this.dynamicMaxSlippageValue, (Object) slippageConfigPreset.dynamicMaxSlippageValue) && Intrinsics.EZpvd((Object) this.dynamicMin, (Object) slippageConfigPreset.dynamicMin) && Intrinsics.EZpvd((Object) this.dynamicRecommendMaxValue, (Object) slippageConfigPreset.dynamicRecommendMaxValue) && Intrinsics.EZpvd((Object) this.dynamicRecommendMinValue, (Object) slippageConfigPreset.dynamicRecommendMinValue) && Intrinsics.EZpvd((Object) this.fixedMax, (Object) slippageConfigPreset.fixedMax) && Intrinsics.EZpvd((Object) this.fixedMin, (Object) slippageConfigPreset.fixedMin) && Intrinsics.EZpvd((Object) this.fixedRecommendMax, (Object) slippageConfigPreset.fixedRecommendMax) && Intrinsics.EZpvd((Object) this.fixedRecommendMin, (Object) slippageConfigPreset.fixedRecommendMin) && Intrinsics.EZpvd(this.slippageRange, slippageConfigPreset.slippageRange) && this.slippageType == slippageConfigPreset.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDynamicMax() {
        return this.dynamicMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDynamicMaxSlippageValue() {
        return this.dynamicMaxSlippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDynamicMin() {
        return this.dynamicMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDynamicRecommendMaxValue() {
        return this.dynamicRecommendMaxValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDynamicRecommendMinValue() {
        return this.dynamicRecommendMinValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFixedMax() {
        return this.fixedMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFixedMin() {
        return this.fixedMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFixedRecommendMax() {
        return this.fixedRecommendMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFixedRecommendMin() {
        return this.fixedRecommendMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SlippageRange> getSlippageRange() {
        return this.slippageRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.dynamicMax.hashCode() * 31) + this.dynamicMaxSlippageValue.hashCode()) * 31) + this.dynamicMin.hashCode()) * 31) + this.dynamicRecommendMaxValue.hashCode()) * 31) + this.dynamicRecommendMinValue.hashCode()) * 31) + this.fixedMax.hashCode()) * 31) + this.fixedMin.hashCode()) * 31) + this.fixedRecommendMax.hashCode()) * 31) + this.fixedRecommendMin.hashCode()) * 31) + this.slippageRange.hashCode()) * 31) + Integer.hashCode(this.slippageType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDynamicMaxSlippageValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dynamicMaxSlippageValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippageType(int i) {
        this.slippageType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SlippageConfigPreset(dynamicMax=" + this.dynamicMax + ", dynamicMaxSlippageValue=" + this.dynamicMaxSlippageValue + ", dynamicMin=" + this.dynamicMin + ", dynamicRecommendMaxValue=" + this.dynamicRecommendMaxValue + ", dynamicRecommendMinValue=" + this.dynamicRecommendMinValue + ", fixedMax=" + this.fixedMax + ", fixedMin=" + this.fixedMin + ", fixedRecommendMax=" + this.fixedRecommendMax + ", fixedRecommendMin=" + this.fixedRecommendMin + ", slippageRange=" + this.slippageRange + ", slippageType=" + this.slippageType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.dynamicMax);
        parcel.writeString(this.dynamicMaxSlippageValue);
        parcel.writeString(this.dynamicMin);
        parcel.writeString(this.dynamicRecommendMaxValue);
        parcel.writeString(this.dynamicRecommendMinValue);
        parcel.writeString(this.fixedMax);
        parcel.writeString(this.fixedMin);
        parcel.writeString(this.fixedRecommendMax);
        parcel.writeString(this.fixedRecommendMin);
        List<SlippageRange> list = this.slippageRange;
        parcel.writeInt(list.size());
        Iterator<SlippageRange> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.slippageType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SlippageConfigPreset> serializer() {
            return SlippageConfigPreset$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SlippageConfigPreset(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.dynamicMax = "";
        } else {
            this.dynamicMax = str;
        }
        if ((i & 2) == 0) {
            this.dynamicMaxSlippageValue = "";
        } else {
            this.dynamicMaxSlippageValue = str2;
        }
        if ((i & 4) == 0) {
            this.dynamicMin = "";
        } else {
            this.dynamicMin = str3;
        }
        if ((i & 8) == 0) {
            this.dynamicRecommendMaxValue = "";
        } else {
            this.dynamicRecommendMaxValue = str4;
        }
        if ((i & 16) == 0) {
            this.dynamicRecommendMinValue = "";
        } else {
            this.dynamicRecommendMinValue = str5;
        }
        if ((i & 32) == 0) {
            this.fixedMax = "";
        } else {
            this.fixedMax = str6;
        }
        if ((i & 64) == 0) {
            this.fixedMin = "";
        } else {
            this.fixedMin = str7;
        }
        if ((i & 128) == 0) {
            this.fixedRecommendMax = "";
        } else {
            this.fixedRecommendMax = str8;
        }
        if ((i & 256) == 0) {
            this.fixedRecommendMin = "";
        } else {
            this.fixedRecommendMin = str9;
        }
        if ((i & 512) == 0) {
            this.slippageRange = yDY.AhwBna();
        } else {
            this.slippageRange = list;
        }
        if ((i & 1024) == 0) {
            this.slippageType = 0;
        } else {
            this.slippageType = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SlippageConfigPreset slippageConfigPreset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) slippageConfigPreset.dynamicMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, slippageConfigPreset.dynamicMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) slippageConfigPreset.dynamicMaxSlippageValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, slippageConfigPreset.dynamicMaxSlippageValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) slippageConfigPreset.dynamicMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, slippageConfigPreset.dynamicMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) slippageConfigPreset.dynamicRecommendMaxValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, slippageConfigPreset.dynamicRecommendMaxValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) slippageConfigPreset.dynamicRecommendMinValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, slippageConfigPreset.dynamicRecommendMinValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) slippageConfigPreset.fixedMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, slippageConfigPreset.fixedMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) slippageConfigPreset.fixedMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, slippageConfigPreset.fixedMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) slippageConfigPreset.fixedRecommendMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, slippageConfigPreset.fixedRecommendMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) slippageConfigPreset.fixedRecommendMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, slippageConfigPreset.fixedRecommendMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(slippageConfigPreset.slippageRange, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], slippageConfigPreset.slippageRange);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && slippageConfigPreset.slippageType == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 10, slippageConfigPreset.slippageType);
    }

    public SlippageConfigPreset(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull List<SlippageRange> list, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.dynamicMax = str;
        this.dynamicMaxSlippageValue = str2;
        this.dynamicMin = str3;
        this.dynamicRecommendMaxValue = str4;
        this.dynamicRecommendMinValue = str5;
        this.fixedMax = str6;
        this.fixedMin = str7;
        this.fixedRecommendMax = str8;
        this.fixedRecommendMin = str9;
        this.slippageRange = list;
        this.slippageType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r23v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0047: ARITH (r23v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:129)) : (r21v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0052: ARITH (r23v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r22v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.trade.features.home.ui.meme.data.SlippageRange>, int):void (m)] (LINE:119) call: com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int):void type: THIS */
    public /* synthetic */ SlippageConfigPreset(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) == 0 ? str9 : "", (i2 & 512) != 0 ? yDY.AhwBna() : list, (i2 & 1024) != 0 ? 0 : i);
    }
}
