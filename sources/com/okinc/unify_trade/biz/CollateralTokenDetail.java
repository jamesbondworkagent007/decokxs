package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class CollateralTokenDetail implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final String ccy;
    private String collateralEnabled;
    private final List<String> disableRelationCcyList;
    private final List<String> enableRelationCcyList;
    private final String existBorrowing;
    private final String existOrdOrPos;
    private boolean isSelected;
    private final String required;
    private final String stableCoin;
    private final String topCoin;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CollateralTokenDetail> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CollateralTokenDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollateralTokenDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CollateralTokenDetail(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollateralTokenDetail[] newArray(int i) {
            return new CollateralTokenDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CollateralTokenDetail() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, false, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.collateralEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.stableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.topCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.existOrdOrPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.existBorrowing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component8() {
        return this.enableRelationCcyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component9() {
        return this.disableRelationCcyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CollateralTokenDetail copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, List<String> list, List<String> list2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new CollateralTokenDetail(str, str2, str3, str4, str5, str6, str7, list, list2, z);
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
        if (!(obj instanceof CollateralTokenDetail)) {
            return false;
        }
        CollateralTokenDetail collateralTokenDetail = (CollateralTokenDetail) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) collateralTokenDetail.ccy) && Intrinsics.EZpvd((Object) this.collateralEnabled, (Object) collateralTokenDetail.collateralEnabled) && Intrinsics.EZpvd((Object) this.stableCoin, (Object) collateralTokenDetail.stableCoin) && Intrinsics.EZpvd((Object) this.topCoin, (Object) collateralTokenDetail.topCoin) && Intrinsics.EZpvd((Object) this.existOrdOrPos, (Object) collateralTokenDetail.existOrdOrPos) && Intrinsics.EZpvd((Object) this.required, (Object) collateralTokenDetail.required) && Intrinsics.EZpvd((Object) this.existBorrowing, (Object) collateralTokenDetail.existBorrowing) && Intrinsics.EZpvd(this.enableRelationCcyList, collateralTokenDetail.enableRelationCcyList) && Intrinsics.EZpvd(this.disableRelationCcyList, collateralTokenDetail.disableRelationCcyList) && this.isSelected == collateralTokenDetail.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCollateralEnabled() {
        return this.collateralEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDisableRelationCcyList() {
        return this.disableRelationCcyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getEnableRelationCcyList() {
        return this.enableRelationCcyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExistBorrowing() {
        return this.existBorrowing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExistOrdOrPos() {
        return this.existOrdOrPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStableCoin() {
        return this.stableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopCoin() {
        return this.topCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.ccy.hashCode();
        int iHashCode2 = this.collateralEnabled.hashCode();
        int iHashCode3 = this.stableCoin.hashCode();
        int iHashCode4 = this.topCoin.hashCode();
        int iHashCode5 = this.existOrdOrPos.hashCode();
        int iHashCode6 = this.required.hashCode();
        int iHashCode7 = this.existBorrowing.hashCode();
        List<String> list = this.enableRelationCcyList;
        int iHashCode8 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.disableRelationCcyList;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (list2 != null ? list2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSelected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollateralEnabled(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.collateralEnabled = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CollateralTokenDetail(ccy=" + this.ccy + ", collateralEnabled=" + this.collateralEnabled + ", stableCoin=" + this.stableCoin + ", topCoin=" + this.topCoin + ", existOrdOrPos=" + this.existOrdOrPos + ", required=" + this.required + ", existBorrowing=" + this.existBorrowing + ", enableRelationCcyList=" + this.enableRelationCcyList + ", disableRelationCcyList=" + this.disableRelationCcyList + ", isSelected=" + this.isSelected + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ccy);
        parcel.writeString(this.collateralEnabled);
        parcel.writeString(this.stableCoin);
        parcel.writeString(this.topCoin);
        parcel.writeString(this.existOrdOrPos);
        parcel.writeString(this.required);
        parcel.writeString(this.existBorrowing);
        parcel.writeStringList(this.enableRelationCcyList);
        parcel.writeStringList(this.disableRelationCcyList);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.CollateralTokenDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CollateralTokenDetail> serializer() {
            return CollateralTokenDetail$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null};
    }

    public /* synthetic */ CollateralTokenDetail(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str;
        }
        if ((i & 2) == 0) {
            this.collateralEnabled = "";
        } else {
            this.collateralEnabled = str2;
        }
        if ((i & 4) == 0) {
            this.stableCoin = "";
        } else {
            this.stableCoin = str3;
        }
        if ((i & 8) == 0) {
            this.topCoin = "";
        } else {
            this.topCoin = str4;
        }
        if ((i & 16) == 0) {
            this.existOrdOrPos = "";
        } else {
            this.existOrdOrPos = str5;
        }
        if ((i & 32) == 0) {
            this.required = "";
        } else {
            this.required = str6;
        }
        if ((i & 64) == 0) {
            this.existBorrowing = "";
        } else {
            this.existBorrowing = str7;
        }
        if ((i & 128) == 0) {
            this.enableRelationCcyList = null;
        } else {
            this.enableRelationCcyList = list;
        }
        if ((i & 256) == 0) {
            this.disableRelationCcyList = null;
        } else {
            this.disableRelationCcyList = list2;
        }
        if ((i & 512) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(CollateralTokenDetail collateralTokenDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) collateralTokenDetail.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, collateralTokenDetail.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) collateralTokenDetail.collateralEnabled, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, collateralTokenDetail.collateralEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) collateralTokenDetail.stableCoin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, collateralTokenDetail.stableCoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) collateralTokenDetail.topCoin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, collateralTokenDetail.topCoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) collateralTokenDetail.existOrdOrPos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, collateralTokenDetail.existOrdOrPos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) collateralTokenDetail.required, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, collateralTokenDetail.required);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) collateralTokenDetail.existBorrowing, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, collateralTokenDetail.existBorrowing);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || collateralTokenDetail.enableRelationCcyList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], collateralTokenDetail.enableRelationCcyList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || collateralTokenDetail.disableRelationCcyList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], collateralTokenDetail.disableRelationCcyList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || collateralTokenDetail.isSelected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, collateralTokenDetail.isSelected);
        }
    }

    public CollateralTokenDetail(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, List<String> list, List<String> list2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.ccy = str;
        this.collateralEnabled = str2;
        this.stableCoin = str3;
        this.topCoin = str4;
        this.existOrdOrPos = str5;
        this.required = str6;
        this.existBorrowing = str7;
        this.enableRelationCcyList = list;
        this.disableRelationCcyList = list2;
        this.isSelected = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r19v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.util.List) : (null java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, boolean):void (m)] (LINE:4969) call: com.okinc.unify_trade.biz.CollateralTokenDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean):void type: THIS */
    public /* synthetic */ CollateralTokenDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? null : list, (i & 256) == 0 ? list2 : null, (i & 512) != 0 ? false : z);
    }

    public final boolean canUnSelect() {
        return Intrinsics.EZpvd((Object) this.required, (Object) "0") && Intrinsics.EZpvd((Object) this.existOrdOrPos, (Object) "0") && Intrinsics.EZpvd((Object) this.existBorrowing, (Object) "0");
    }
}
