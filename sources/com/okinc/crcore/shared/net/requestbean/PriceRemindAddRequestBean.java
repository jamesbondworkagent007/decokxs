package com.okinc.crcore.shared.net.requestbean;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PriceRemindAddRequestBean implements Parcelable {
    private int bizType;
    private String instrumentName;
    private String promptThreshold;
    private int promptType;
    private int repeatType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PriceRemindAddRequestBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PriceRemindAddRequestBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceRemindAddRequestBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PriceRemindAddRequestBean(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceRemindAddRequestBean[] newArray(int i) {
            return new PriceRemindAddRequestBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PriceRemindAddRequestBean() {
        this(0, (String) null, 0, 0, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PriceRemindAddRequestBean copy$default(PriceRemindAddRequestBean priceRemindAddRequestBean, int i, String str, int i2, int i3, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = priceRemindAddRequestBean.bizType;
        }
        if ((i4 & 2) != 0) {
            str = priceRemindAddRequestBean.instrumentName;
        }
        String str3 = str;
        if ((i4 & 4) != 0) {
            i2 = priceRemindAddRequestBean.promptType;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = priceRemindAddRequestBean.repeatType;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            str2 = priceRemindAddRequestBean.promptThreshold;
        }
        return priceRemindAddRequestBean.copy(i, str3, i5, i6, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instrumentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.promptThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRemindAddRequestBean copy(int i, @NotNull String str, int i2, int i3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PriceRemindAddRequestBean(i, str, i2, i3, str2);
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
        if (!(obj instanceof PriceRemindAddRequestBean)) {
            return false;
        }
        PriceRemindAddRequestBean priceRemindAddRequestBean = (PriceRemindAddRequestBean) obj;
        return this.bizType == priceRemindAddRequestBean.bizType && Intrinsics.EZpvd((Object) this.instrumentName, (Object) priceRemindAddRequestBean.instrumentName) && this.promptType == priceRemindAddRequestBean.promptType && this.repeatType == priceRemindAddRequestBean.repeatType && Intrinsics.EZpvd((Object) this.promptThreshold, (Object) priceRemindAddRequestBean.promptThreshold);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstrumentName() {
        return this.instrumentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPromptThreshold() {
        return this.promptThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPromptType() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRepeatType() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Integer.hashCode(this.bizType) * 31) + this.instrumentName.hashCode()) * 31) + Integer.hashCode(this.promptType)) * 31) + Integer.hashCode(this.repeatType)) * 31) + this.promptThreshold.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(int i) {
        this.bizType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstrumentName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instrumentName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPromptThreshold(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.promptThreshold = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPromptType(int i) {
        this.promptType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRepeatType(int i) {
        this.repeatType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PriceRemindAddRequestBean(bizType=" + this.bizType + ", instrumentName=" + this.instrumentName + ", promptType=" + this.promptType + ", repeatType=" + this.repeatType + ", promptThreshold=" + this.promptThreshold + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.bizType);
        parcel.writeString(this.instrumentName);
        parcel.writeInt(this.promptType);
        parcel.writeInt(this.repeatType);
        parcel.writeString(this.promptThreshold);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.requestbean.PriceRemindAddRequestBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PriceRemindAddRequestBean> serializer() {
            return PriceRemindAddRequestBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PriceRemindAddRequestBean(int i, int i2, String str, int i3, int i4, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bizType = 0;
        } else {
            this.bizType = i2;
        }
        if ((i & 2) == 0) {
            this.instrumentName = "";
        } else {
            this.instrumentName = str;
        }
        if ((i & 4) == 0) {
            this.promptType = 0;
        } else {
            this.promptType = i3;
        }
        if ((i & 8) == 0) {
            this.repeatType = 0;
        } else {
            this.repeatType = i4;
        }
        if ((i & 16) == 0) {
            this.promptThreshold = "";
        } else {
            this.promptThreshold = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(PriceRemindAddRequestBean priceRemindAddRequestBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || priceRemindAddRequestBean.bizType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, priceRemindAddRequestBean.bizType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) priceRemindAddRequestBean.instrumentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, priceRemindAddRequestBean.instrumentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || priceRemindAddRequestBean.promptType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, priceRemindAddRequestBean.promptType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || priceRemindAddRequestBean.repeatType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, priceRemindAddRequestBean.repeatType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) priceRemindAddRequestBean.promptThreshold, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, priceRemindAddRequestBean.promptThreshold);
    }

    public PriceRemindAddRequestBean(int i, @NotNull String str, int i2, int i3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.bizType = i;
        this.instrumentName = str;
        this.promptType = i2;
        this.repeatType = i3;
        this.promptThreshold = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r10v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(int, java.lang.String, int, int, java.lang.String):void (m)] (LINE:13) call: com.okinc.crcore.shared.net.requestbean.PriceRemindAddRequestBean.<init>(int, java.lang.String, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ PriceRemindAddRequestBean(int i, String str, int i2, int i3, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) == 0 ? i3 : 0, (i4 & 16) != 0 ? "" : str2);
    }
}
