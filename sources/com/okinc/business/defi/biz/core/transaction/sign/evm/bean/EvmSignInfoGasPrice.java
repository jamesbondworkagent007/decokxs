package com.okinc.business.defi.biz.core.transaction.sign.evm.bean;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class EvmSignInfoGasPrice implements Parcelable {
    private final String baseFee;
    private final List<EstimateTime> estimateTimeList;
    private final String fastPriorityFee;
    private String max;
    private final String maxCost;
    private String min;
    private final String minCost;
    private final String minGasPrice;
    private String normal;
    private String normalCost;
    private final String oriMax;
    private final String oriMin;
    private String oriNormal;
    private final String original;
    private final String proposePriorityFee;
    private final String safePriorityFee;
    private final String suggestBaseFee;
    private final Boolean supportEip1559;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EvmSignInfoGasPrice> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(EstimateTime$$serializer.INSTANCE), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<EvmSignInfoGasPrice> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EvmSignInfoGasPrice createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String str;
            ArrayList arrayList;
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
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
                str = string12;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                str = string12;
                int i2 = 0;
                while (i2 != i) {
                    arrayList2.add(EstimateTime.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList2;
            }
            return new EvmSignInfoGasPrice(string, string2, string3, string4, string5, string6, string7, string8, string9, boolValueOf, string10, string11, str, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EvmSignInfoGasPrice[] newArray(int i) {
            return new EvmSignInfoGasPrice[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EvmSignInfoGasPrice() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseFee() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EstimateTime> getEstimateTimeList() {
        return this.estimateTimeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastPriorityFee() {
        return this.fastPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMax() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxCost() {
        return this.maxCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMin() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinCost() {
        return this.minCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinGasPrice() {
        return this.minGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNormal() {
        return this.normal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNormalCost() {
        return this.normalCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriMax() {
        return this.oriMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriMin() {
        return this.oriMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriNormal() {
        return this.oriNormal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginal() {
        return this.original;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProposePriorityFee() {
        return this.proposePriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafePriorityFee() {
        return this.safePriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuggestBaseFee() {
        return this.suggestBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSupportEip1559() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMax(String str) {
        this.max = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMin(String str) {
        this.min = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNormal(String str) {
        this.normal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNormalCost(String str) {
        this.normalCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriNormal(String str) {
        this.oriNormal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.min);
        parcel.writeString(this.normal);
        parcel.writeString(this.max);
        parcel.writeString(this.minCost);
        parcel.writeString(this.normalCost);
        parcel.writeString(this.maxCost);
        parcel.writeString(this.safePriorityFee);
        parcel.writeString(this.proposePriorityFee);
        parcel.writeString(this.fastPriorityFee);
        Boolean bool = this.supportEip1559;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.suggestBaseFee);
        parcel.writeString(this.baseFee);
        parcel.writeString(this.minGasPrice);
        List<EstimateTime> list = this.estimateTimeList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<EstimateTime> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.oriMin);
        parcel.writeString(this.oriNormal);
        parcel.writeString(this.oriMax);
        parcel.writeString(this.original);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EvmSignInfoGasPrice> serializer() {
            return EvmSignInfoGasPrice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EvmSignInfoGasPrice(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, List list, String str13, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.min = null;
        } else {
            this.min = str;
        }
        if ((i & 2) == 0) {
            this.normal = null;
        } else {
            this.normal = str2;
        }
        if ((i & 4) == 0) {
            this.max = null;
        } else {
            this.max = str3;
        }
        if ((i & 8) == 0) {
            this.minCost = null;
        } else {
            this.minCost = str4;
        }
        if ((i & 16) == 0) {
            this.normalCost = null;
        } else {
            this.normalCost = str5;
        }
        if ((i & 32) == 0) {
            this.maxCost = null;
        } else {
            this.maxCost = str6;
        }
        if ((i & 64) == 0) {
            this.safePriorityFee = null;
        } else {
            this.safePriorityFee = str7;
        }
        if ((i & 128) == 0) {
            this.proposePriorityFee = null;
        } else {
            this.proposePriorityFee = str8;
        }
        if ((i & 256) == 0) {
            this.fastPriorityFee = null;
        } else {
            this.fastPriorityFee = str9;
        }
        this.supportEip1559 = (i & 512) == 0 ? Boolean.FALSE : bool;
        if ((i & 1024) == 0) {
            this.suggestBaseFee = null;
        } else {
            this.suggestBaseFee = str10;
        }
        if ((i & 2048) == 0) {
            this.baseFee = null;
        } else {
            this.baseFee = str11;
        }
        if ((i & 4096) == 0) {
            this.minGasPrice = null;
        } else {
            this.minGasPrice = str12;
        }
        if ((i & 8192) == 0) {
            this.estimateTimeList = null;
        } else {
            this.estimateTimeList = list;
        }
        if ((i & 16384) == 0) {
            this.oriMin = null;
        } else {
            this.oriMin = str13;
        }
        if ((32768 & i) == 0) {
            this.oriNormal = null;
        } else {
            this.oriNormal = str14;
        }
        if ((65536 & i) == 0) {
            this.oriMax = null;
        } else {
            this.oriMax = str15;
        }
        if ((i & 131072) == 0) {
            this.original = null;
        } else {
            this.original = str16;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EvmSignInfoGasPrice evmSignInfoGasPrice, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || evmSignInfoGasPrice.min != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, evmSignInfoGasPrice.min);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || evmSignInfoGasPrice.normal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, evmSignInfoGasPrice.normal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || evmSignInfoGasPrice.max != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, evmSignInfoGasPrice.max);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || evmSignInfoGasPrice.minCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, evmSignInfoGasPrice.minCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || evmSignInfoGasPrice.normalCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, evmSignInfoGasPrice.normalCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || evmSignInfoGasPrice.maxCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, evmSignInfoGasPrice.maxCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || evmSignInfoGasPrice.safePriorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, evmSignInfoGasPrice.safePriorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || evmSignInfoGasPrice.proposePriorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, evmSignInfoGasPrice.proposePriorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || evmSignInfoGasPrice.fastPriorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, evmSignInfoGasPrice.fastPriorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(evmSignInfoGasPrice.supportEip1559, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, evmSignInfoGasPrice.supportEip1559);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || evmSignInfoGasPrice.suggestBaseFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, evmSignInfoGasPrice.suggestBaseFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || evmSignInfoGasPrice.baseFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, evmSignInfoGasPrice.baseFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || evmSignInfoGasPrice.minGasPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, evmSignInfoGasPrice.minGasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || evmSignInfoGasPrice.estimateTimeList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr[13], evmSignInfoGasPrice.estimateTimeList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || evmSignInfoGasPrice.oriMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, evmSignInfoGasPrice.oriMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || evmSignInfoGasPrice.oriNormal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, evmSignInfoGasPrice.oriNormal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || evmSignInfoGasPrice.oriMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, evmSignInfoGasPrice.oriMax);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && evmSignInfoGasPrice.original == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, evmSignInfoGasPrice.original);
    }

    public EvmSignInfoGasPrice(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, List<EstimateTime> list, String str13, String str14, String str15, String str16) {
        this.min = str;
        this.normal = str2;
        this.max = str3;
        this.minCost = str4;
        this.normalCost = str5;
        this.maxCost = str6;
        this.safePriorityFee = str7;
        this.proposePriorityFee = str8;
        this.fastPriorityFee = str9;
        this.supportEip1559 = bool;
        this.suggestBaseFee = str10;
        this.baseFee = str11;
        this.minGasPrice = str12;
        this.estimateTimeList = list;
        this.oriMin = str13;
        this.oriNormal = str14;
        this.oriMax = str15;
        this.original = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c2: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r38v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r38v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r38v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r38v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r38v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006b: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r33v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0073: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007e: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r38v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0094: ARITH (r38v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EstimateTime>, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:53) call: com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EvmSignInfoGasPrice(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, List list, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? Boolean.FALSE : bool, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : list, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? null : str15, (i & 131072) != 0 ? null : str16);
    }
}
