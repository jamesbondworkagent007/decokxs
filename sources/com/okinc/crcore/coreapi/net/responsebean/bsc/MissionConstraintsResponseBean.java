package com.okinc.crcore.coreapi.net.responsebean.bsc;

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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class MissionConstraintsResponseBean implements Parcelable {
    private final List<String> excludedCurrencies;
    private final String limitAmountUnit;
    private final String minAmount;
    private final boolean oneTimeOnly;
    private final String orderType;
    private final String tradeType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MissionConstraintsResponseBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<MissionConstraintsResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionConstraintsResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MissionConstraintsResponseBean(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionConstraintsResponseBean[] newArray(int i) {
            return new MissionConstraintsResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MissionConstraintsResponseBean() {
        this((String) null, (String) null, false, (String) null, (String) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.bsc.MissionConstraintsResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MissionConstraintsResponseBean copy$default(MissionConstraintsResponseBean missionConstraintsResponseBean, String str, String str2, boolean z, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = missionConstraintsResponseBean.minAmount;
        }
        if ((i & 2) != 0) {
            str2 = missionConstraintsResponseBean.limitAmountUnit;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            z = missionConstraintsResponseBean.oneTimeOnly;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = missionConstraintsResponseBean.orderType;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = missionConstraintsResponseBean.tradeType;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            list = missionConstraintsResponseBean.excludedCurrencies;
        }
        return missionConstraintsResponseBean.copy(str, str5, z2, str6, str7, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.limitAmountUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.oneTimeOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.excludedCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionConstraintsResponseBean copy(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new MissionConstraintsResponseBean(str, str2, z, str3, str4, list);
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
        if (!(obj instanceof MissionConstraintsResponseBean)) {
            return false;
        }
        MissionConstraintsResponseBean missionConstraintsResponseBean = (MissionConstraintsResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.minAmount, (Object) missionConstraintsResponseBean.minAmount) && Intrinsics.EZpvd((Object) this.limitAmountUnit, (Object) missionConstraintsResponseBean.limitAmountUnit) && this.oneTimeOnly == missionConstraintsResponseBean.oneTimeOnly && Intrinsics.EZpvd((Object) this.orderType, (Object) missionConstraintsResponseBean.orderType) && Intrinsics.EZpvd((Object) this.tradeType, (Object) missionConstraintsResponseBean.tradeType) && Intrinsics.EZpvd(this.excludedCurrencies, missionConstraintsResponseBean.excludedCurrencies);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getExcludedCurrencies() {
        return this.excludedCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitAmountUnit() {
        return this.limitAmountUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAmount() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOneTimeOnly() {
        return this.oneTimeOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeType() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.minAmount.hashCode() * 31) + this.limitAmountUnit.hashCode()) * 31) + Boolean.hashCode(this.oneTimeOnly)) * 31) + this.orderType.hashCode()) * 31) + this.tradeType.hashCode()) * 31) + this.excludedCurrencies.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MissionConstraintsResponseBean(minAmount=" + this.minAmount + ", limitAmountUnit=" + this.limitAmountUnit + ", oneTimeOnly=" + this.oneTimeOnly + ", orderType=" + this.orderType + ", tradeType=" + this.tradeType + ", excludedCurrencies=" + this.excludedCurrencies + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.minAmount);
        parcel.writeString(this.limitAmountUnit);
        parcel.writeInt(this.oneTimeOnly ? 1 : 0);
        parcel.writeString(this.orderType);
        parcel.writeString(this.tradeType);
        parcel.writeStringList(this.excludedCurrencies);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.MissionConstraintsResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MissionConstraintsResponseBean> serializer() {
            return MissionConstraintsResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MissionConstraintsResponseBean(int i, String str, String str2, boolean z, String str3, String str4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.minAmount = "";
        } else {
            this.minAmount = str;
        }
        if ((i & 2) == 0) {
            this.limitAmountUnit = "";
        } else {
            this.limitAmountUnit = str2;
        }
        if ((i & 4) == 0) {
            this.oneTimeOnly = false;
        } else {
            this.oneTimeOnly = z;
        }
        if ((i & 8) == 0) {
            this.orderType = "";
        } else {
            this.orderType = str3;
        }
        if ((i & 16) == 0) {
            this.tradeType = "";
        } else {
            this.tradeType = str4;
        }
        if ((i & 32) == 0) {
            this.excludedCurrencies = yDY.AhwBna();
        } else {
            this.excludedCurrencies = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(MissionConstraintsResponseBean missionConstraintsResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) missionConstraintsResponseBean.minAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, missionConstraintsResponseBean.minAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) missionConstraintsResponseBean.limitAmountUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, missionConstraintsResponseBean.limitAmountUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || missionConstraintsResponseBean.oneTimeOnly) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, missionConstraintsResponseBean.oneTimeOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) missionConstraintsResponseBean.orderType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, missionConstraintsResponseBean.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) missionConstraintsResponseBean.tradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, missionConstraintsResponseBean.tradeType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd(missionConstraintsResponseBean.excludedCurrencies, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], missionConstraintsResponseBean.excludedCurrencies);
    }

    public MissionConstraintsResponseBean(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.minAmount = str;
        this.limitAmountUnit = str2;
        this.oneTimeOnly = z;
        this.orderType = str3;
        this.tradeType = str4;
        this.excludedCurrencies = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:boolean:0x0015: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0027: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:61)) : (r10v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:55) call: com.okinc.crcore.coreapi.net.responsebean.bsc.MissionConstraintsResponseBean.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ MissionConstraintsResponseBean(String str, String str2, boolean z, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "", (i & 32) != 0 ? yDY.AhwBna() : list);
    }
}
