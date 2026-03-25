package com.okinc.business.invest_biz.utils;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestSlippageBean implements Parcelable {
    public static final int $stable = 0;
    private final Boolean isAuto;
    private final Boolean isSafemoonAuto;
    private final String safemoonSlippage;
    private final String slippage;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestSlippageBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestSlippageBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestSlippageBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new InvestSlippageBean(string, boolValueOf, string2, boolValueOf2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestSlippageBean[] newArray(int i) {
            return new InvestSlippageBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestSlippageBean() {
        this((String) null, (Boolean) null, (String) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestSlippageBean copy$default(InvestSlippageBean investSlippageBean, String str, Boolean bool, String str2, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investSlippageBean.slippage;
        }
        if ((i & 2) != 0) {
            bool = investSlippageBean.isAuto;
        }
        if ((i & 4) != 0) {
            str2 = investSlippageBean.safemoonSlippage;
        }
        if ((i & 8) != 0) {
            bool2 = investSlippageBean.isSafemoonAuto;
        }
        return investSlippageBean.copy(str, bool, str2, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.isAuto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.safemoonSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isSafemoonAuto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSlippageBean copy(String str, Boolean bool, String str2, Boolean bool2) {
        return new InvestSlippageBean(str, bool, str2, bool2);
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
        if (!(obj instanceof InvestSlippageBean)) {
            return false;
        }
        InvestSlippageBean investSlippageBean = (InvestSlippageBean) obj;
        return Intrinsics.EZpvd((Object) this.slippage, (Object) investSlippageBean.slippage) && Intrinsics.EZpvd(this.isAuto, investSlippageBean.isAuto) && Intrinsics.EZpvd((Object) this.safemoonSlippage, (Object) investSlippageBean.safemoonSlippage) && Intrinsics.EZpvd(this.isSafemoonAuto, investSlippageBean.isSafemoonAuto);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafemoonSlippage() {
        return this.safemoonSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.slippage;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.isAuto;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        String str2 = this.safemoonSlippage;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Boolean bool2 = this.isSafemoonAuto;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isAuto() {
        return this.isAuto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSafemoonAuto() {
        return this.isSafemoonAuto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestSlippageBean(slippage=" + this.slippage + ", isAuto=" + this.isAuto + ", safemoonSlippage=" + this.safemoonSlippage + ", isSafemoonAuto=" + this.isSafemoonAuto + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.slippage);
        Boolean bool = this.isAuto;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.safemoonSlippage);
        Boolean bool2 = this.isSafemoonAuto;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.utils.InvestSlippageBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestSlippageBean> serializer() {
            return InvestSlippageBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestSlippageBean(int i, String str, Boolean bool, String str2, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.slippage = null;
        } else {
            this.slippage = str;
        }
        if ((i & 2) == 0) {
            this.isAuto = null;
        } else {
            this.isAuto = bool;
        }
        if ((i & 4) == 0) {
            this.safemoonSlippage = null;
        } else {
            this.safemoonSlippage = str2;
        }
        if ((i & 8) == 0) {
            this.isSafemoonAuto = null;
        } else {
            this.isSafemoonAuto = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestSlippageBean investSlippageBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investSlippageBean.slippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, investSlippageBean.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investSlippageBean.isAuto != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, investSlippageBean.isAuto);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investSlippageBean.safemoonSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investSlippageBean.safemoonSlippage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && investSlippageBean.isSafemoonAuto == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, investSlippageBean.isSafemoonAuto);
    }

    public InvestSlippageBean(String str, Boolean bool, String str2, Boolean bool2) {
        this.slippage = str;
        this.isAuto = bool;
        this.safemoonSlippage = str2;
        this.isSafemoonAuto = bool2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r5v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean):void (m)] (LINE:18) call: com.okinc.business.invest_biz.utils.InvestSlippageBean.<init>(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ InvestSlippageBean(String str, Boolean bool, String str2, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool2);
    }
}
