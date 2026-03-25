package com.okinc.crcore.coreapi.net.requestbean;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class ExchangeQuoteRequestBean implements Parcelable {
    public static final int $stable = 0;
    private final String baseCcy;
    private final String quoteCcy;
    private final String rfqSz;
    private final String rfqSzCcy;
    private final int settleSourceType;
    private final String side;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ExchangeQuoteRequestBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ExchangeQuoteRequestBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeQuoteRequestBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ExchangeQuoteRequestBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeQuoteRequestBean[] newArray(int i) {
            return new ExchangeQuoteRequestBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ExchangeQuoteRequestBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 0, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExchangeQuoteRequestBean copy$default(ExchangeQuoteRequestBean exchangeQuoteRequestBean, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = exchangeQuoteRequestBean.baseCcy;
        }
        if ((i2 & 2) != 0) {
            str2 = exchangeQuoteRequestBean.quoteCcy;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = exchangeQuoteRequestBean.rfqSz;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = exchangeQuoteRequestBean.rfqSzCcy;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = exchangeQuoteRequestBean.side;
        }
        String str9 = str5;
        if ((i2 & 32) != 0) {
            i = exchangeQuoteRequestBean.settleSourceType;
        }
        return exchangeQuoteRequestBean.copy(str, str6, str7, str8, str9, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.rfqSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.rfqSzCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.settleSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeQuoteRequestBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ExchangeQuoteRequestBean(str, str2, str3, str4, str5, i);
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
        if (!(obj instanceof ExchangeQuoteRequestBean)) {
            return false;
        }
        ExchangeQuoteRequestBean exchangeQuoteRequestBean = (ExchangeQuoteRequestBean) obj;
        return Intrinsics.EZpvd((Object) this.baseCcy, (Object) exchangeQuoteRequestBean.baseCcy) && Intrinsics.EZpvd((Object) this.quoteCcy, (Object) exchangeQuoteRequestBean.quoteCcy) && Intrinsics.EZpvd((Object) this.rfqSz, (Object) exchangeQuoteRequestBean.rfqSz) && Intrinsics.EZpvd((Object) this.rfqSzCcy, (Object) exchangeQuoteRequestBean.rfqSzCcy) && Intrinsics.EZpvd((Object) this.side, (Object) exchangeQuoteRequestBean.side) && this.settleSourceType == exchangeQuoteRequestBean.settleSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCcy() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCcy() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRfqSz() {
        return this.rfqSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRfqSzCcy() {
        return this.rfqSzCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSettleSourceType() {
        return this.settleSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.baseCcy.hashCode() * 31) + this.quoteCcy.hashCode()) * 31) + this.rfqSz.hashCode()) * 31) + this.rfqSzCcy.hashCode()) * 31) + this.side.hashCode()) * 31) + Integer.hashCode(this.settleSourceType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExchangeQuoteRequestBean(baseCcy=" + this.baseCcy + ", quoteCcy=" + this.quoteCcy + ", rfqSz=" + this.rfqSz + ", rfqSzCcy=" + this.rfqSzCcy + ", side=" + this.side + ", settleSourceType=" + this.settleSourceType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.baseCcy);
        parcel.writeString(this.quoteCcy);
        parcel.writeString(this.rfqSz);
        parcel.writeString(this.rfqSzCcy);
        parcel.writeString(this.side);
        parcel.writeInt(this.settleSourceType);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.requestbean.ExchangeQuoteRequestBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExchangeQuoteRequestBean> serializer() {
            return ExchangeQuoteRequestBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExchangeQuoteRequestBean(int i, String str, String str2, String str3, String str4, String str5, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseCcy = "";
        } else {
            this.baseCcy = str;
        }
        if ((i & 2) == 0) {
            this.quoteCcy = "";
        } else {
            this.quoteCcy = str2;
        }
        if ((i & 4) == 0) {
            this.rfqSz = "";
        } else {
            this.rfqSz = str3;
        }
        if ((i & 8) == 0) {
            this.rfqSzCcy = "";
        } else {
            this.rfqSzCcy = str4;
        }
        if ((i & 16) == 0) {
            this.side = "";
        } else {
            this.side = str5;
        }
        if ((i & 32) == 0) {
            this.settleSourceType = 0;
        } else {
            this.settleSourceType = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(ExchangeQuoteRequestBean exchangeQuoteRequestBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) exchangeQuoteRequestBean.baseCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, exchangeQuoteRequestBean.baseCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) exchangeQuoteRequestBean.quoteCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, exchangeQuoteRequestBean.quoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) exchangeQuoteRequestBean.rfqSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, exchangeQuoteRequestBean.rfqSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) exchangeQuoteRequestBean.rfqSzCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, exchangeQuoteRequestBean.rfqSzCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) exchangeQuoteRequestBean.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, exchangeQuoteRequestBean.side);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && exchangeQuoteRequestBean.settleSourceType == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 5, exchangeQuoteRequestBean.settleSourceType);
    }

    public ExchangeQuoteRequestBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.baseCcy = str;
        this.quoteCcy = str2;
        this.rfqSz = str3;
        this.rfqSzCcy = str4;
        this.side = str5;
        this.settleSourceType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.requestbean.ExchangeQuoteRequestBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ ExchangeQuoteRequestBean(String str, String str2, String str3, String str4, String str5, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) == 0 ? str5 : "", (i2 & 32) != 0 ? 0 : i);
    }
}
