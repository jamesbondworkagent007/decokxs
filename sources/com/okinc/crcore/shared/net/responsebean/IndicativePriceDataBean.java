package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.IndicativePriceDataResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class IndicativePriceDataBean implements Parcelable {
    private String baseCcy;
    private String price;
    private String quoteCcy;
    private String side;
    private String ttlMs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<IndicativePriceDataBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<IndicativePriceDataBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IndicativePriceDataBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new IndicativePriceDataBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IndicativePriceDataBean[] newArray(int i) {
            return new IndicativePriceDataBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IndicativePriceDataBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IndicativePriceDataBean copy$default(IndicativePriceDataBean indicativePriceDataBean, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = indicativePriceDataBean.quoteCcy;
        }
        if ((i & 2) != 0) {
            str2 = indicativePriceDataBean.baseCcy;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = indicativePriceDataBean.price;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = indicativePriceDataBean.side;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = indicativePriceDataBean.ttlMs;
        }
        return indicativePriceDataBean.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ttlMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IndicativePriceDataBean copy(String str, String str2, String str3, String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str5, "");
        return new IndicativePriceDataBean(str, str2, str3, str4, str5);
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
        if (!(obj instanceof IndicativePriceDataBean)) {
            return false;
        }
        IndicativePriceDataBean indicativePriceDataBean = (IndicativePriceDataBean) obj;
        return Intrinsics.EZpvd((Object) this.quoteCcy, (Object) indicativePriceDataBean.quoteCcy) && Intrinsics.EZpvd((Object) this.baseCcy, (Object) indicativePriceDataBean.baseCcy) && Intrinsics.EZpvd((Object) this.price, (Object) indicativePriceDataBean.price) && Intrinsics.EZpvd((Object) this.side, (Object) indicativePriceDataBean.side) && Intrinsics.EZpvd((Object) this.ttlMs, (Object) indicativePriceDataBean.ttlMs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCcy() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCcy() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTtlMs() {
        return this.ttlMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.quoteCcy;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.baseCcy;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.price;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.side;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.ttlMs.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCcy(String str) {
        this.baseCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(String str) {
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCcy(String str) {
        this.quoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(String str) {
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTtlMs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ttlMs = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IndicativePriceDataBean(quoteCcy=" + this.quoteCcy + ", baseCcy=" + this.baseCcy + ", price=" + this.price + ", side=" + this.side + ", ttlMs=" + this.ttlMs + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.quoteCcy);
        parcel.writeString(this.baseCcy);
        parcel.writeString(this.price);
        parcel.writeString(this.side);
        parcel.writeString(this.ttlMs);
    }

    public /* synthetic */ IndicativePriceDataBean(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.quoteCcy = null;
        } else {
            this.quoteCcy = str;
        }
        if ((i & 2) == 0) {
            this.baseCcy = null;
        } else {
            this.baseCcy = str2;
        }
        if ((i & 4) == 0) {
            this.price = null;
        } else {
            this.price = str3;
        }
        if ((i & 8) == 0) {
            this.side = null;
        } else {
            this.side = str4;
        }
        if ((i & 16) == 0) {
            this.ttlMs = "";
        } else {
            this.ttlMs = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(IndicativePriceDataBean indicativePriceDataBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || indicativePriceDataBean.quoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, indicativePriceDataBean.quoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || indicativePriceDataBean.baseCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, indicativePriceDataBean.baseCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || indicativePriceDataBean.price != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, indicativePriceDataBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || indicativePriceDataBean.side != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, indicativePriceDataBean.side);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) indicativePriceDataBean.ttlMs, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, indicativePriceDataBean.ttlMs);
    }

    public IndicativePriceDataBean(String str, String str2, String str3, String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str5, "");
        this.quoteCcy = str;
        this.baseCcy = str2;
        this.price = str3;
        this.side = str4;
        this.ttlMs = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.IndicativePriceDataBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ IndicativePriceDataBean(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, (i & 16) != 0 ? "" : str5);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.IndicativePriceDataBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IndicativePriceDataBean> serializer() {
            return IndicativePriceDataBean$$serializer.INSTANCE;
        }

        public final IndicativePriceDataBean OLrzqt(@NotNull IndicativePriceDataResponseBean indicativePriceDataResponseBean) {
            Intrinsics.checkNotNullParameter(indicativePriceDataResponseBean, "");
            return new IndicativePriceDataBean(indicativePriceDataResponseBean.getQuoteCcy(), indicativePriceDataResponseBean.getBaseCcy(), indicativePriceDataResponseBean.getPrice(), indicativePriceDataResponseBean.getSide(), indicativePriceDataResponseBean.getTtlMs());
        }
    }
}
