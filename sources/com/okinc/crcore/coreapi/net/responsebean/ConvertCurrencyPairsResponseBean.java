package com.okinc.crcore.coreapi.net.responsebean;

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
public final class ConvertCurrencyPairsResponseBean implements Parcelable {
    private String baseCcy;
    private String baseSingleMax;
    private String baseSingleMin;
    private String instId;
    private String quoteCcy;
    private String quoteSingleMax;
    private String quoteSingleMin;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ConvertCurrencyPairsResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ConvertCurrencyPairsResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConvertCurrencyPairsResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ConvertCurrencyPairsResponseBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConvertCurrencyPairsResponseBean[] newArray(int i) {
            return new ConvertCurrencyPairsResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConvertCurrencyPairsResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ConvertCurrencyPairsResponseBean copy$default(ConvertCurrencyPairsResponseBean convertCurrencyPairsResponseBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = convertCurrencyPairsResponseBean.baseCcy;
        }
        if ((i & 2) != 0) {
            str2 = convertCurrencyPairsResponseBean.baseSingleMax;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = convertCurrencyPairsResponseBean.baseSingleMin;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = convertCurrencyPairsResponseBean.instId;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = convertCurrencyPairsResponseBean.quoteCcy;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = convertCurrencyPairsResponseBean.quoteSingleMax;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = convertCurrencyPairsResponseBean.quoteSingleMin;
        }
        return convertCurrencyPairsResponseBean.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.baseSingleMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseSingleMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.quoteSingleMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.quoteSingleMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertCurrencyPairsResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new ConvertCurrencyPairsResponseBean(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof ConvertCurrencyPairsResponseBean)) {
            return false;
        }
        ConvertCurrencyPairsResponseBean convertCurrencyPairsResponseBean = (ConvertCurrencyPairsResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.baseCcy, (Object) convertCurrencyPairsResponseBean.baseCcy) && Intrinsics.EZpvd((Object) this.baseSingleMax, (Object) convertCurrencyPairsResponseBean.baseSingleMax) && Intrinsics.EZpvd((Object) this.baseSingleMin, (Object) convertCurrencyPairsResponseBean.baseSingleMin) && Intrinsics.EZpvd((Object) this.instId, (Object) convertCurrencyPairsResponseBean.instId) && Intrinsics.EZpvd((Object) this.quoteCcy, (Object) convertCurrencyPairsResponseBean.quoteCcy) && Intrinsics.EZpvd((Object) this.quoteSingleMax, (Object) convertCurrencyPairsResponseBean.quoteSingleMax) && Intrinsics.EZpvd((Object) this.quoteSingleMin, (Object) convertCurrencyPairsResponseBean.quoteSingleMin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCcy() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseSingleMax() {
        return this.baseSingleMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseSingleMin() {
        return this.baseSingleMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCcy() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSingleMax() {
        return this.quoteSingleMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSingleMin() {
        return this.quoteSingleMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.baseCcy.hashCode() * 31) + this.baseSingleMax.hashCode()) * 31) + this.baseSingleMin.hashCode()) * 31) + this.instId.hashCode()) * 31) + this.quoteCcy.hashCode()) * 31) + this.quoteSingleMax.hashCode()) * 31) + this.quoteSingleMin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseSingleMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseSingleMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseSingleMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseSingleMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSingleMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteSingleMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSingleMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteSingleMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConvertCurrencyPairsResponseBean(baseCcy=" + this.baseCcy + ", baseSingleMax=" + this.baseSingleMax + ", baseSingleMin=" + this.baseSingleMin + ", instId=" + this.instId + ", quoteCcy=" + this.quoteCcy + ", quoteSingleMax=" + this.quoteSingleMax + ", quoteSingleMin=" + this.quoteSingleMin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.baseCcy);
        parcel.writeString(this.baseSingleMax);
        parcel.writeString(this.baseSingleMin);
        parcel.writeString(this.instId);
        parcel.writeString(this.quoteCcy);
        parcel.writeString(this.quoteSingleMax);
        parcel.writeString(this.quoteSingleMin);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyPairsResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConvertCurrencyPairsResponseBean> serializer() {
            return ConvertCurrencyPairsResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConvertCurrencyPairsResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseCcy = "";
        } else {
            this.baseCcy = str;
        }
        if ((i & 2) == 0) {
            this.baseSingleMax = "";
        } else {
            this.baseSingleMax = str2;
        }
        if ((i & 4) == 0) {
            this.baseSingleMin = "";
        } else {
            this.baseSingleMin = str3;
        }
        if ((i & 8) == 0) {
            this.instId = "";
        } else {
            this.instId = str4;
        }
        if ((i & 16) == 0) {
            this.quoteCcy = "";
        } else {
            this.quoteCcy = str5;
        }
        if ((i & 32) == 0) {
            this.quoteSingleMax = "";
        } else {
            this.quoteSingleMax = str6;
        }
        if ((i & 64) == 0) {
            this.quoteSingleMin = "";
        } else {
            this.quoteSingleMin = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(ConvertCurrencyPairsResponseBean convertCurrencyPairsResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) convertCurrencyPairsResponseBean.baseCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, convertCurrencyPairsResponseBean.baseCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) convertCurrencyPairsResponseBean.baseSingleMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, convertCurrencyPairsResponseBean.baseSingleMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) convertCurrencyPairsResponseBean.baseSingleMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, convertCurrencyPairsResponseBean.baseSingleMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) convertCurrencyPairsResponseBean.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, convertCurrencyPairsResponseBean.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) convertCurrencyPairsResponseBean.quoteCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, convertCurrencyPairsResponseBean.quoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) convertCurrencyPairsResponseBean.quoteSingleMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, convertCurrencyPairsResponseBean.quoteSingleMax);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) convertCurrencyPairsResponseBean.quoteSingleMin, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, convertCurrencyPairsResponseBean.quoteSingleMin);
    }

    public ConvertCurrencyPairsResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.baseCcy = str;
        this.baseSingleMax = str2;
        this.baseSingleMin = str3;
        this.instId = str4;
        this.quoteCcy = str5;
        this.quoteSingleMax = str6;
        this.quoteSingleMin = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyPairsResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ConvertCurrencyPairsResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
