package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DexAutoSlippageInfoParam implements Parcelable {
    private final String autoFromSlippage;
    private final String autoSlippage;
    private final String autoToSlippage;
    private final String autoTotalSlippage;
    private final String dynamicSlippageRangeMax;
    private final String dynamicSlippageRangeMin;
    private final String limitOrderDynamicSpecialSlippage;
    private final String recommendSlippageRangeMax;
    private final String recommendSlippageRangeMin;
    private final String referenceSlippage;
    private final List<String> shortcutFixSlippage;
    private final int slippageType;
    private final String slippageValue;
    private final boolean supportMaxSlippage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DexAutoSlippageInfoParam> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<DexAutoSlippageInfoParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexAutoSlippageInfoParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexAutoSlippageInfoParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexAutoSlippageInfoParam[] newArray(int i) {
            return new DexAutoSlippageInfoParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexAutoSlippageInfoParam() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.autoSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.recommendSlippageRangeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.referenceSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.limitOrderDynamicSpecialSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.slippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.autoFromSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.autoToSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.autoTotalSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.shortcutFixSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.supportMaxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.dynamicSlippageRangeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.dynamicSlippageRangeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.recommendSlippageRangeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, List<String> list, boolean z, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new DexAutoSlippageInfoParam(str, str2, str3, str4, list, z, str5, str6, str7, str8, str9, str10, i, str11);
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
        if (!(obj instanceof DexAutoSlippageInfoParam)) {
            return false;
        }
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam = (DexAutoSlippageInfoParam) obj;
        return Intrinsics.EZpvd((Object) this.autoSlippage, (Object) dexAutoSlippageInfoParam.autoSlippage) && Intrinsics.EZpvd((Object) this.autoFromSlippage, (Object) dexAutoSlippageInfoParam.autoFromSlippage) && Intrinsics.EZpvd((Object) this.autoToSlippage, (Object) dexAutoSlippageInfoParam.autoToSlippage) && Intrinsics.EZpvd((Object) this.autoTotalSlippage, (Object) dexAutoSlippageInfoParam.autoTotalSlippage) && Intrinsics.EZpvd(this.shortcutFixSlippage, dexAutoSlippageInfoParam.shortcutFixSlippage) && this.supportMaxSlippage == dexAutoSlippageInfoParam.supportMaxSlippage && Intrinsics.EZpvd((Object) this.dynamicSlippageRangeMin, (Object) dexAutoSlippageInfoParam.dynamicSlippageRangeMin) && Intrinsics.EZpvd((Object) this.dynamicSlippageRangeMax, (Object) dexAutoSlippageInfoParam.dynamicSlippageRangeMax) && Intrinsics.EZpvd((Object) this.recommendSlippageRangeMin, (Object) dexAutoSlippageInfoParam.recommendSlippageRangeMin) && Intrinsics.EZpvd((Object) this.recommendSlippageRangeMax, (Object) dexAutoSlippageInfoParam.recommendSlippageRangeMax) && Intrinsics.EZpvd((Object) this.referenceSlippage, (Object) dexAutoSlippageInfoParam.referenceSlippage) && Intrinsics.EZpvd((Object) this.limitOrderDynamicSpecialSlippage, (Object) dexAutoSlippageInfoParam.limitOrderDynamicSpecialSlippage) && this.slippageType == dexAutoSlippageInfoParam.slippageType && Intrinsics.EZpvd((Object) this.slippageValue, (Object) dexAutoSlippageInfoParam.slippageValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoFromSlippage() {
        return this.autoFromSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoSlippage() {
        return this.autoSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoToSlippage() {
        return this.autoToSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoTotalSlippage() {
        return this.autoTotalSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDynamicSlippageRangeMax() {
        return this.dynamicSlippageRangeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDynamicSlippageRangeMin() {
        return this.dynamicSlippageRangeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitOrderDynamicSpecialSlippage() {
        return this.limitOrderDynamicSpecialSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendSlippageRangeMax() {
        return this.recommendSlippageRangeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendSlippageRangeMin() {
        return this.recommendSlippageRangeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferenceSlippage() {
        return this.referenceSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getShortcutFixSlippage() {
        return this.shortcutFixSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageValue() {
        return this.slippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportMaxSlippage() {
        return this.supportMaxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.autoSlippage.hashCode();
        int iHashCode2 = this.autoFromSlippage.hashCode();
        int iHashCode3 = this.autoToSlippage.hashCode();
        int iHashCode4 = this.autoTotalSlippage.hashCode();
        List<String> list = this.shortcutFixSlippage;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.supportMaxSlippage)) * 31) + this.dynamicSlippageRangeMin.hashCode()) * 31) + this.dynamicSlippageRangeMax.hashCode()) * 31) + this.recommendSlippageRangeMin.hashCode()) * 31) + this.recommendSlippageRangeMax.hashCode()) * 31) + this.referenceSlippage.hashCode()) * 31) + this.limitOrderDynamicSpecialSlippage.hashCode()) * 31) + Integer.hashCode(this.slippageType)) * 31) + this.slippageValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexAutoSlippageInfoParam(autoSlippage=" + this.autoSlippage + ", autoFromSlippage=" + this.autoFromSlippage + ", autoToSlippage=" + this.autoToSlippage + ", autoTotalSlippage=" + this.autoTotalSlippage + ", shortcutFixSlippage=" + this.shortcutFixSlippage + ", supportMaxSlippage=" + this.supportMaxSlippage + ", dynamicSlippageRangeMin=" + this.dynamicSlippageRangeMin + ", dynamicSlippageRangeMax=" + this.dynamicSlippageRangeMax + ", recommendSlippageRangeMin=" + this.recommendSlippageRangeMin + ", recommendSlippageRangeMax=" + this.recommendSlippageRangeMax + ", referenceSlippage=" + this.referenceSlippage + ", limitOrderDynamicSpecialSlippage=" + this.limitOrderDynamicSpecialSlippage + ", slippageType=" + this.slippageType + ", slippageValue=" + this.slippageValue + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.autoSlippage);
        parcel.writeString(this.autoFromSlippage);
        parcel.writeString(this.autoToSlippage);
        parcel.writeString(this.autoTotalSlippage);
        parcel.writeStringList(this.shortcutFixSlippage);
        parcel.writeInt(this.supportMaxSlippage ? 1 : 0);
        parcel.writeString(this.dynamicSlippageRangeMin);
        parcel.writeString(this.dynamicSlippageRangeMax);
        parcel.writeString(this.recommendSlippageRangeMin);
        parcel.writeString(this.recommendSlippageRangeMax);
        parcel.writeString(this.referenceSlippage);
        parcel.writeString(this.limitOrderDynamicSpecialSlippage);
        parcel.writeInt(this.slippageType);
        parcel.writeString(this.slippageValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexAutoSlippageInfoParam> serializer() {
            return DexAutoSlippageInfoParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexAutoSlippageInfoParam(int i, String str, String str2, String str3, String str4, List list, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, int i2, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.autoSlippage = "";
        } else {
            this.autoSlippage = str;
        }
        if ((i & 2) == 0) {
            this.autoFromSlippage = "";
        } else {
            this.autoFromSlippage = str2;
        }
        if ((i & 4) == 0) {
            this.autoToSlippage = "";
        } else {
            this.autoToSlippage = str3;
        }
        if ((i & 8) == 0) {
            this.autoTotalSlippage = "";
        } else {
            this.autoTotalSlippage = str4;
        }
        this.shortcutFixSlippage = (i & 16) == 0 ? null : list;
        if ((i & 32) == 0) {
            this.supportMaxSlippage = false;
        } else {
            this.supportMaxSlippage = z;
        }
        if ((i & 64) == 0) {
            this.dynamicSlippageRangeMin = "";
        } else {
            this.dynamicSlippageRangeMin = str5;
        }
        if ((i & 128) == 0) {
            this.dynamicSlippageRangeMax = "";
        } else {
            this.dynamicSlippageRangeMax = str6;
        }
        if ((i & 256) == 0) {
            this.recommendSlippageRangeMin = "";
        } else {
            this.recommendSlippageRangeMin = str7;
        }
        if ((i & 512) == 0) {
            this.recommendSlippageRangeMax = "";
        } else {
            this.recommendSlippageRangeMax = str8;
        }
        if ((i & 1024) == 0) {
            this.referenceSlippage = "";
        } else {
            this.referenceSlippage = str9;
        }
        if ((i & 2048) == 0) {
            this.limitOrderDynamicSpecialSlippage = "";
        } else {
            this.limitOrderDynamicSpecialSlippage = str10;
        }
        if ((i & 4096) == 0) {
            this.slippageType = 0;
        } else {
            this.slippageType = i2;
        }
        if ((i & 8192) == 0) {
            this.slippageValue = "";
        } else {
            this.slippageValue = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DexAutoSlippageInfoParam dexAutoSlippageInfoParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexAutoSlippageInfoParam.autoSlippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexAutoSlippageInfoParam.autoSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexAutoSlippageInfoParam.autoFromSlippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexAutoSlippageInfoParam.autoFromSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexAutoSlippageInfoParam.autoToSlippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexAutoSlippageInfoParam.autoToSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexAutoSlippageInfoParam.autoTotalSlippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexAutoSlippageInfoParam.autoTotalSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || dexAutoSlippageInfoParam.shortcutFixSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], dexAutoSlippageInfoParam.shortcutFixSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || dexAutoSlippageInfoParam.supportMaxSlippage) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, dexAutoSlippageInfoParam.supportMaxSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dexAutoSlippageInfoParam.dynamicSlippageRangeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dexAutoSlippageInfoParam.dynamicSlippageRangeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dexAutoSlippageInfoParam.dynamicSlippageRangeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dexAutoSlippageInfoParam.dynamicSlippageRangeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) dexAutoSlippageInfoParam.recommendSlippageRangeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, dexAutoSlippageInfoParam.recommendSlippageRangeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) dexAutoSlippageInfoParam.recommendSlippageRangeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, dexAutoSlippageInfoParam.recommendSlippageRangeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) dexAutoSlippageInfoParam.referenceSlippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, dexAutoSlippageInfoParam.referenceSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) dexAutoSlippageInfoParam.limitOrderDynamicSpecialSlippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, dexAutoSlippageInfoParam.limitOrderDynamicSpecialSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || dexAutoSlippageInfoParam.slippageType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, dexAutoSlippageInfoParam.slippageType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) dexAutoSlippageInfoParam.slippageValue, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, dexAutoSlippageInfoParam.slippageValue);
    }

    public DexAutoSlippageInfoParam(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, List<String> list, boolean z, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.autoSlippage = str;
        this.autoFromSlippage = str2;
        this.autoToSlippage = str3;
        this.autoTotalSlippage = str4;
        this.shortcutFixSlippage = list;
        this.supportMaxSlippage = z;
        this.dynamicSlippageRangeMin = str5;
        this.dynamicSlippageRangeMax = str6;
        this.recommendSlippageRangeMin = str7;
        this.recommendSlippageRangeMax = str8;
        this.referenceSlippage = str9;
        this.limitOrderDynamicSpecialSlippage = str10;
        this.slippageType = i;
        this.slippageValue = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0091: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0024: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r21v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0065: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r29v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r31v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void (m)] (LINE:1142) call: com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ DexAutoSlippageInfoParam(String str, String str2, String str3, String str4, List list, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, int i, String str11, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) != 0 ? "" : str9, (i2 & 2048) != 0 ? "" : str10, (i2 & 4096) == 0 ? i : 0, (i2 & 8192) == 0 ? str11 : "");
    }

    public final AutoSlippageInfo toAutoSlippageInfo() {
        String str = this.autoSlippage;
        String str2 = this.autoFromSlippage;
        String str3 = this.referenceSlippage;
        List<String> list = this.shortcutFixSlippage;
        boolean z = this.supportMaxSlippage;
        return new AutoSlippageInfo(str, str2, str3, list, Boolean.valueOf(z), this.dynamicSlippageRangeMin, this.dynamicSlippageRangeMax, this.recommendSlippageRangeMin, this.recommendSlippageRangeMax, this.limitOrderDynamicSpecialSlippage);
    }
}
