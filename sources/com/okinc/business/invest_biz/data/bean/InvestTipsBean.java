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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestTipsBean implements Parcelable {
    public static final int $stable = 0;
    private final String swapTokenSymbol;
    private final int tipsType;
    private final String tokenSymbol;
    private final String valueOffset;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestTipsBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestTipsBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTipsBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestTipsBean(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTipsBean[] newArray(int i) {
            return new InvestTipsBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestTipsBean() {
        this(0, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestTipsBean copy$default(InvestTipsBean investTipsBean, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = investTipsBean.tipsType;
        }
        if ((i2 & 2) != 0) {
            str = investTipsBean.valueOffset;
        }
        if ((i2 & 4) != 0) {
            str2 = investTipsBean.tokenSymbol;
        }
        if ((i2 & 8) != 0) {
            str3 = investTipsBean.swapTokenSymbol;
        }
        return investTipsBean.copy(i, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.tipsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.valueOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.swapTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipsBean copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InvestTipsBean(i, str, str2, str3);
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
        if (!(obj instanceof InvestTipsBean)) {
            return false;
        }
        InvestTipsBean investTipsBean = (InvestTipsBean) obj;
        return this.tipsType == investTipsBean.tipsType && Intrinsics.EZpvd((Object) this.valueOffset, (Object) investTipsBean.valueOffset) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) investTipsBean.tokenSymbol) && Intrinsics.EZpvd((Object) this.swapTokenSymbol, (Object) investTipsBean.swapTokenSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapTokenSymbol() {
        return this.swapTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTipsType() {
        return this.tipsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValueOffset() {
        return this.valueOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.tipsType) * 31) + this.valueOffset.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.swapTokenSymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestTipsBean(tipsType=" + this.tipsType + ", valueOffset=" + this.valueOffset + ", tokenSymbol=" + this.tokenSymbol + ", swapTokenSymbol=" + this.swapTokenSymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.tipsType);
        parcel.writeString(this.valueOffset);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.swapTokenSymbol);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestTipsBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestTipsBean> serializer() {
            return InvestTipsBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestTipsBean(int i, int i2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.tipsType = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.valueOffset = "";
        } else {
            this.valueOffset = str;
        }
        if ((i & 4) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str2;
        }
        if ((i & 8) == 0) {
            this.swapTokenSymbol = "";
        } else {
            this.swapTokenSymbol = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestTipsBean investTipsBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investTipsBean.tipsType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, investTipsBean.tipsType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investTipsBean.valueOffset, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investTipsBean.valueOffset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investTipsBean.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investTipsBean.tokenSymbol);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) investTipsBean.swapTokenSymbol, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, investTipsBean.swapTokenSymbol);
    }

    public InvestTipsBean(int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.tipsType = i;
        this.valueOffset = str;
        this.tokenSymbol = str2;
        this.swapTokenSymbol = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:264) call: com.okinc.business.invest_biz.data.bean.InvestTipsBean.<init>(int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestTipsBean(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}
