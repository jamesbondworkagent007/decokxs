package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.QuickChangeOrderDetailResponseBean;
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
public final class QuickChangeOrderDetailBean implements Parcelable {
    private String baseCcy;
    private String baseCurrencyId;
    private String quoteCcy;
    private String quoteCurrencyId;
    private String side;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<QuickChangeOrderDetailBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<QuickChangeOrderDetailBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuickChangeOrderDetailBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new QuickChangeOrderDetailBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuickChangeOrderDetailBean[] newArray(int i) {
            return new QuickChangeOrderDetailBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QuickChangeOrderDetailBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ QuickChangeOrderDetailBean copy$default(QuickChangeOrderDetailBean quickChangeOrderDetailBean, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quickChangeOrderDetailBean.baseCcy;
        }
        if ((i & 2) != 0) {
            str2 = quickChangeOrderDetailBean.quoteCcy;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = quickChangeOrderDetailBean.baseCurrencyId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = quickChangeOrderDetailBean.quoteCurrencyId;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = quickChangeOrderDetailBean.side;
        }
        return quickChangeOrderDetailBean.copy(str, str6, str7, str8, str5);
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
        return this.baseCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.quoteCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuickChangeOrderDetailBean copy(String str, String str2, String str3, String str4, String str5) {
        return new QuickChangeOrderDetailBean(str, str2, str3, str4, str5);
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
        if (!(obj instanceof QuickChangeOrderDetailBean)) {
            return false;
        }
        QuickChangeOrderDetailBean quickChangeOrderDetailBean = (QuickChangeOrderDetailBean) obj;
        return Intrinsics.EZpvd((Object) this.baseCcy, (Object) quickChangeOrderDetailBean.baseCcy) && Intrinsics.EZpvd((Object) this.quoteCcy, (Object) quickChangeOrderDetailBean.quoteCcy) && Intrinsics.EZpvd((Object) this.baseCurrencyId, (Object) quickChangeOrderDetailBean.baseCurrencyId) && Intrinsics.EZpvd((Object) this.quoteCurrencyId, (Object) quickChangeOrderDetailBean.quoteCurrencyId) && Intrinsics.EZpvd((Object) this.side, (Object) quickChangeOrderDetailBean.side);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCcy() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencyId() {
        return this.baseCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCcy() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrencyId() {
        return this.quoteCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.baseCcy;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.quoteCcy;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.baseCurrencyId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.quoteCurrencyId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.side;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCcy(String str) {
        this.baseCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrencyId(String str) {
        this.baseCurrencyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCcy(String str) {
        this.quoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCurrencyId(String str) {
        this.quoteCurrencyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(String str) {
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuickChangeOrderDetailBean(baseCcy=" + this.baseCcy + ", quoteCcy=" + this.quoteCcy + ", baseCurrencyId=" + this.baseCurrencyId + ", quoteCurrencyId=" + this.quoteCurrencyId + ", side=" + this.side + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.baseCcy);
        parcel.writeString(this.quoteCcy);
        parcel.writeString(this.baseCurrencyId);
        parcel.writeString(this.quoteCurrencyId);
        parcel.writeString(this.side);
    }

    public /* synthetic */ QuickChangeOrderDetailBean(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseCcy = null;
        } else {
            this.baseCcy = str;
        }
        if ((i & 2) == 0) {
            this.quoteCcy = null;
        } else {
            this.quoteCcy = str2;
        }
        if ((i & 4) == 0) {
            this.baseCurrencyId = null;
        } else {
            this.baseCurrencyId = str3;
        }
        if ((i & 8) == 0) {
            this.quoteCurrencyId = null;
        } else {
            this.quoteCurrencyId = str4;
        }
        if ((i & 16) == 0) {
            this.side = null;
        } else {
            this.side = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(QuickChangeOrderDetailBean quickChangeOrderDetailBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || quickChangeOrderDetailBean.baseCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, quickChangeOrderDetailBean.baseCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || quickChangeOrderDetailBean.quoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, quickChangeOrderDetailBean.quoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || quickChangeOrderDetailBean.baseCurrencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, quickChangeOrderDetailBean.baseCurrencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || quickChangeOrderDetailBean.quoteCurrencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, quickChangeOrderDetailBean.quoteCurrencyId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && quickChangeOrderDetailBean.side == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, quickChangeOrderDetailBean.side);
    }

    public QuickChangeOrderDetailBean(String str, String str2, String str3, String str4, String str5) {
        this.baseCcy = str;
        this.quoteCcy = str2;
        this.baseCurrencyId = str3;
        this.quoteCurrencyId = str4;
        this.side = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.QuickChangeOrderDetailBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ QuickChangeOrderDetailBean(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.QuickChangeOrderDetailBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<QuickChangeOrderDetailBean> serializer() {
            return QuickChangeOrderDetailBean$$serializer.INSTANCE;
        }

        public final QuickChangeOrderDetailBean KWHzl(@NotNull QuickChangeOrderDetailResponseBean quickChangeOrderDetailResponseBean) {
            Intrinsics.checkNotNullParameter(quickChangeOrderDetailResponseBean, "");
            return new QuickChangeOrderDetailBean(quickChangeOrderDetailResponseBean.getBaseCcy(), quickChangeOrderDetailResponseBean.getQuoteCcy(), quickChangeOrderDetailResponseBean.getBaseCurrencyId(), quickChangeOrderDetailResponseBean.getQuoteCurrencyId(), quickChangeOrderDetailResponseBean.getSide());
        }
    }
}
