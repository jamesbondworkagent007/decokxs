package com.okinc.business.invest_biz.data.bean.request;

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
public final class InvestUserUnstakeInfoParam implements Parcelable {
    public static final int $stable = 0;
    private final long investmentId;
    private final int pageType;
    private final String userAddress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestUserUnstakeInfoParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestUserUnstakeInfoParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserUnstakeInfoParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestUserUnstakeInfoParam(parcel.readString(), parcel.readLong(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserUnstakeInfoParam[] newArray(int i) {
            return new InvestUserUnstakeInfoParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUserUnstakeInfoParam() {
        this((String) null, 0L, 0, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestUserUnstakeInfoParam copy$default(InvestUserUnstakeInfoParam investUserUnstakeInfoParam, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = investUserUnstakeInfoParam.userAddress;
        }
        if ((i2 & 2) != 0) {
            j = investUserUnstakeInfoParam.investmentId;
        }
        if ((i2 & 4) != 0) {
            i = investUserUnstakeInfoParam.pageType;
        }
        return investUserUnstakeInfoParam.copy(str, j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.pageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserUnstakeInfoParam copy(@NotNull String str, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InvestUserUnstakeInfoParam(str, j, i);
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
        if (!(obj instanceof InvestUserUnstakeInfoParam)) {
            return false;
        }
        InvestUserUnstakeInfoParam investUserUnstakeInfoParam = (InvestUserUnstakeInfoParam) obj;
        return Intrinsics.EZpvd((Object) this.userAddress, (Object) investUserUnstakeInfoParam.userAddress) && this.investmentId == investUserUnstakeInfoParam.investmentId && this.pageType == investUserUnstakeInfoParam.pageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageType() {
        return this.pageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserAddress() {
        return this.userAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.userAddress.hashCode() * 31) + Long.hashCode(this.investmentId)) * 31) + Integer.hashCode(this.pageType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUserUnstakeInfoParam(userAddress=" + this.userAddress + ", investmentId=" + this.investmentId + ", pageType=" + this.pageType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.userAddress);
        parcel.writeLong(this.investmentId);
        parcel.writeInt(this.pageType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.InvestUserUnstakeInfoParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUserUnstakeInfoParam> serializer() {
            return InvestUserUnstakeInfoParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUserUnstakeInfoParam(int i, String str, long j, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        this.userAddress = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.investmentId = 0L;
        } else {
            this.investmentId = j;
        }
        if ((i & 4) == 0) {
            this.pageType = 0;
        } else {
            this.pageType = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUserUnstakeInfoParam investUserUnstakeInfoParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investUserUnstakeInfoParam.userAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investUserUnstakeInfoParam.userAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investUserUnstakeInfoParam.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, investUserUnstakeInfoParam.investmentId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && investUserUnstakeInfoParam.pageType == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, investUserUnstakeInfoParam.pageType);
    }

    public InvestUserUnstakeInfoParam(@NotNull String str, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userAddress = str;
        this.investmentId = j;
        this.pageType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r2v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(java.lang.String, long, int):void (m)] (LINE:60) call: com.okinc.business.invest_biz.data.bean.request.InvestUserUnstakeInfoParam.<init>(java.lang.String, long, int):void type: THIS */
    public /* synthetic */ InvestUserUnstakeInfoParam(String str, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0 : i);
    }
}
