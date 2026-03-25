package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestTransactionLossInfo implements Parcelable {
    public static final int $stable = 0;
    private final String lossRate;
    private final String networkFee;
    private final int numDays;
    private final String swapLoss;
    private final String totalTransactionLoss;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestTransactionLossInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestTransactionLossInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTransactionLossInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestTransactionLossInfo(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTransactionLossInfo[] newArray(int i) {
            return new InvestTransactionLossInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestTransactionLossInfo() {
        this((String) null, 0, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestTransactionLossInfo copy$default(InvestTransactionLossInfo investTransactionLossInfo, String str, int i, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = investTransactionLossInfo.networkFee;
        }
        if ((i2 & 2) != 0) {
            i = investTransactionLossInfo.numDays;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = investTransactionLossInfo.swapLoss;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = investTransactionLossInfo.totalTransactionLoss;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = investTransactionLossInfo.lossRate;
        }
        return investTransactionLossInfo.copy(str, i3, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.numDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.swapLoss;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalTransactionLoss;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.lossRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTransactionLossInfo copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InvestTransactionLossInfo(str, i, str2, str3, str4);
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
        if (!(obj instanceof InvestTransactionLossInfo)) {
            return false;
        }
        InvestTransactionLossInfo investTransactionLossInfo = (InvestTransactionLossInfo) obj;
        return Intrinsics.EZpvd((Object) this.networkFee, (Object) investTransactionLossInfo.networkFee) && this.numDays == investTransactionLossInfo.numDays && Intrinsics.EZpvd((Object) this.swapLoss, (Object) investTransactionLossInfo.swapLoss) && Intrinsics.EZpvd((Object) this.totalTransactionLoss, (Object) investTransactionLossInfo.totalTransactionLoss) && Intrinsics.EZpvd((Object) this.lossRate, (Object) investTransactionLossInfo.lossRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLossRate() {
        return this.lossRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkFee() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNumDays() {
        return this.numDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapLoss() {
        return this.swapLoss;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalTransactionLoss() {
        return this.totalTransactionLoss;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.networkFee.hashCode();
        int iHashCode2 = Integer.hashCode(this.numDays);
        int iHashCode3 = this.swapLoss.hashCode();
        int iHashCode4 = this.totalTransactionLoss.hashCode();
        String str = this.lossRate;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestTransactionLossInfo(networkFee=" + this.networkFee + ", numDays=" + this.numDays + ", swapLoss=" + this.swapLoss + ", totalTransactionLoss=" + this.totalTransactionLoss + ", lossRate=" + this.lossRate + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.networkFee);
        parcel.writeInt(this.numDays);
        parcel.writeString(this.swapLoss);
        parcel.writeString(this.totalTransactionLoss);
        parcel.writeString(this.lossRate);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestTransactionLossInfo> serializer() {
            return InvestTransactionLossInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestTransactionLossInfo(int i, String str, int i2, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.networkFee = "";
        } else {
            this.networkFee = str;
        }
        if ((i & 2) == 0) {
            this.numDays = 0;
        } else {
            this.numDays = i2;
        }
        if ((i & 4) == 0) {
            this.swapLoss = "";
        } else {
            this.swapLoss = str2;
        }
        if ((i & 8) == 0) {
            this.totalTransactionLoss = "";
        } else {
            this.totalTransactionLoss = str3;
        }
        if ((i & 16) == 0) {
            this.lossRate = "";
        } else {
            this.lossRate = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestTransactionLossInfo investTransactionLossInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investTransactionLossInfo.networkFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investTransactionLossInfo.networkFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investTransactionLossInfo.numDays != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, investTransactionLossInfo.numDays);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investTransactionLossInfo.swapLoss, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investTransactionLossInfo.swapLoss);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investTransactionLossInfo.totalTransactionLoss, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investTransactionLossInfo.totalTransactionLoss);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) investTransactionLossInfo.lossRate, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investTransactionLossInfo.lossRate);
    }

    public InvestTransactionLossInfo(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.networkFee = str;
        this.numDays = i;
        this.swapLoss = str2;
        this.totalTransactionLoss = str3;
        this.lossRate = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:int:0x000e: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:975) call: com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestTransactionLossInfo(String str, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4);
    }
}
