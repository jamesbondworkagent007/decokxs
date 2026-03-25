package com.okinc.business.dex.trade.core.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class AutoSlippageInfo implements Parcelable {
    private final String autoFromSlippage;
    private final String autoSlippage;
    private final String dynamicSlippageRangeMax;
    private final String dynamicSlippageRangeMin;
    private final String limitOrderDynamicSpecialSlippage;
    private final String recommendSlippageRangeMax;
    private final String recommendSlippageRangeMin;
    private final String referenceSlippage;
    private final List<String> shortcutFixSlippage;
    private final Boolean supportMaxSlippage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AutoSlippageInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<AutoSlippageInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoSlippageInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AutoSlippageInfo(string, string2, string3, arrayListCreateStringArrayList, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoSlippageInfo[] newArray(int i) {
            return new AutoSlippageInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AutoSlippageInfo() {
        this((String) null, (String) null, (String) null, (List) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.autoSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.limitOrderDynamicSpecialSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.autoFromSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.referenceSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.shortcutFixSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.supportMaxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.dynamicSlippageRangeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.dynamicSlippageRangeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.recommendSlippageRangeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.recommendSlippageRangeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoSlippageInfo copy(String str, String str2, String str3, List<String> list, Boolean bool, String str4, String str5, String str6, String str7, String str8) {
        return new AutoSlippageInfo(str, str2, str3, list, bool, str4, str5, str6, str7, str8);
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
        if (!(obj instanceof AutoSlippageInfo)) {
            return false;
        }
        AutoSlippageInfo autoSlippageInfo = (AutoSlippageInfo) obj;
        return Intrinsics.EZpvd((Object) this.autoSlippage, (Object) autoSlippageInfo.autoSlippage) && Intrinsics.EZpvd((Object) this.autoFromSlippage, (Object) autoSlippageInfo.autoFromSlippage) && Intrinsics.EZpvd((Object) this.referenceSlippage, (Object) autoSlippageInfo.referenceSlippage) && Intrinsics.EZpvd(this.shortcutFixSlippage, autoSlippageInfo.shortcutFixSlippage) && Intrinsics.EZpvd(this.supportMaxSlippage, autoSlippageInfo.supportMaxSlippage) && Intrinsics.EZpvd((Object) this.dynamicSlippageRangeMin, (Object) autoSlippageInfo.dynamicSlippageRangeMin) && Intrinsics.EZpvd((Object) this.dynamicSlippageRangeMax, (Object) autoSlippageInfo.dynamicSlippageRangeMax) && Intrinsics.EZpvd((Object) this.recommendSlippageRangeMin, (Object) autoSlippageInfo.recommendSlippageRangeMin) && Intrinsics.EZpvd((Object) this.recommendSlippageRangeMax, (Object) autoSlippageInfo.recommendSlippageRangeMax) && Intrinsics.EZpvd((Object) this.limitOrderDynamicSpecialSlippage, (Object) autoSlippageInfo.limitOrderDynamicSpecialSlippage);
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
    public final Boolean getSupportMaxSlippage() {
        return this.supportMaxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.autoSlippage;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.autoFromSlippage;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.referenceSlippage;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        List<String> list = this.shortcutFixSlippage;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        Boolean bool = this.supportMaxSlippage;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        String str4 = this.dynamicSlippageRangeMin;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.dynamicSlippageRangeMax;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.recommendSlippageRangeMin;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.recommendSlippageRangeMax;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.limitOrderDynamicSpecialSlippage;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AutoSlippageInfo(autoSlippage=" + this.autoSlippage + ", autoFromSlippage=" + this.autoFromSlippage + ", referenceSlippage=" + this.referenceSlippage + ", shortcutFixSlippage=" + this.shortcutFixSlippage + ", supportMaxSlippage=" + this.supportMaxSlippage + ", dynamicSlippageRangeMin=" + this.dynamicSlippageRangeMin + ", dynamicSlippageRangeMax=" + this.dynamicSlippageRangeMax + ", recommendSlippageRangeMin=" + this.recommendSlippageRangeMin + ", recommendSlippageRangeMax=" + this.recommendSlippageRangeMax + ", limitOrderDynamicSpecialSlippage=" + this.limitOrderDynamicSpecialSlippage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.autoSlippage);
        parcel.writeString(this.autoFromSlippage);
        parcel.writeString(this.referenceSlippage);
        parcel.writeStringList(this.shortcutFixSlippage);
        Boolean bool = this.supportMaxSlippage;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.dynamicSlippageRangeMin);
        parcel.writeString(this.dynamicSlippageRangeMax);
        parcel.writeString(this.recommendSlippageRangeMin);
        parcel.writeString(this.recommendSlippageRangeMax);
        parcel.writeString(this.limitOrderDynamicSpecialSlippage);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AutoSlippageInfo> serializer() {
            return AutoSlippageInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AutoSlippageInfo(int i, String str, String str2, String str3, List list, Boolean bool, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.autoSlippage = null;
        } else {
            this.autoSlippage = str;
        }
        if ((i & 2) == 0) {
            this.autoFromSlippage = null;
        } else {
            this.autoFromSlippage = str2;
        }
        if ((i & 4) == 0) {
            this.referenceSlippage = null;
        } else {
            this.referenceSlippage = str3;
        }
        if ((i & 8) == 0) {
            this.shortcutFixSlippage = null;
        } else {
            this.shortcutFixSlippage = list;
        }
        if ((i & 16) == 0) {
            this.supportMaxSlippage = null;
        } else {
            this.supportMaxSlippage = bool;
        }
        if ((i & 32) == 0) {
            this.dynamicSlippageRangeMin = null;
        } else {
            this.dynamicSlippageRangeMin = str4;
        }
        if ((i & 64) == 0) {
            this.dynamicSlippageRangeMax = null;
        } else {
            this.dynamicSlippageRangeMax = str5;
        }
        if ((i & 128) == 0) {
            this.recommendSlippageRangeMin = null;
        } else {
            this.recommendSlippageRangeMin = str6;
        }
        if ((i & 256) == 0) {
            this.recommendSlippageRangeMax = null;
        } else {
            this.recommendSlippageRangeMax = str7;
        }
        if ((i & 512) == 0) {
            this.limitOrderDynamicSpecialSlippage = null;
        } else {
            this.limitOrderDynamicSpecialSlippage = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(AutoSlippageInfo autoSlippageInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || autoSlippageInfo.autoSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, autoSlippageInfo.autoSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || autoSlippageInfo.autoFromSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, autoSlippageInfo.autoFromSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || autoSlippageInfo.referenceSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, autoSlippageInfo.referenceSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || autoSlippageInfo.shortcutFixSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], autoSlippageInfo.shortcutFixSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || autoSlippageInfo.supportMaxSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, autoSlippageInfo.supportMaxSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || autoSlippageInfo.dynamicSlippageRangeMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, autoSlippageInfo.dynamicSlippageRangeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || autoSlippageInfo.dynamicSlippageRangeMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, autoSlippageInfo.dynamicSlippageRangeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || autoSlippageInfo.recommendSlippageRangeMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, autoSlippageInfo.recommendSlippageRangeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || autoSlippageInfo.recommendSlippageRangeMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, autoSlippageInfo.recommendSlippageRangeMax);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && autoSlippageInfo.limitOrderDynamicSpecialSlippage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, autoSlippageInfo.limitOrderDynamicSpecialSlippage);
    }

    public AutoSlippageInfo(String str, String str2, String str3, List<String> list, Boolean bool, String str4, String str5, String str6, String str7, String str8) {
        this.autoSlippage = str;
        this.autoFromSlippage = str2;
        this.referenceSlippage = str3;
        this.shortcutFixSlippage = list;
        this.supportMaxSlippage = bool;
        this.dynamicSlippageRangeMin = str4;
        this.dynamicSlippageRangeMax = str5;
        this.recommendSlippageRangeMin = str6;
        this.recommendSlippageRangeMax = str7;
        this.limitOrderDynamicSpecialSlippage = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r15v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:377) call: com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AutoSlippageInfo(String str, String str2, String str3, List list, Boolean bool, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) == 0 ? str8 : null);
    }
}
