package com.okinc.crcore.shared.net.responsebean.bsc.recurring;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyFrequencyResponseBean;
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
public final class RecurringBuyFrequencyBean implements Parcelable {
    public static final int $stable = 0;
    private final int code;
    private final String frequency;
    private final String localizedName;
    private final String nextPurchaseTime;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RecurringBuyFrequencyBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<RecurringBuyFrequencyBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyFrequencyBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecurringBuyFrequencyBean(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyFrequencyBean[] newArray(int i) {
            return new RecurringBuyFrequencyBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecurringBuyFrequencyBean() {
        this(0, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecurringBuyFrequencyBean copy$default(RecurringBuyFrequencyBean recurringBuyFrequencyBean, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recurringBuyFrequencyBean.code;
        }
        if ((i2 & 2) != 0) {
            str = recurringBuyFrequencyBean.frequency;
        }
        if ((i2 & 4) != 0) {
            str2 = recurringBuyFrequencyBean.localizedName;
        }
        if ((i2 & 8) != 0) {
            str3 = recurringBuyFrequencyBean.nextPurchaseTime;
        }
        return recurringBuyFrequencyBean.copy(i, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.localizedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nextPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyFrequencyBean copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new RecurringBuyFrequencyBean(i, str, str2, str3);
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
        if (!(obj instanceof RecurringBuyFrequencyBean)) {
            return false;
        }
        RecurringBuyFrequencyBean recurringBuyFrequencyBean = (RecurringBuyFrequencyBean) obj;
        return this.code == recurringBuyFrequencyBean.code && Intrinsics.EZpvd((Object) this.frequency, (Object) recurringBuyFrequencyBean.frequency) && Intrinsics.EZpvd((Object) this.localizedName, (Object) recurringBuyFrequencyBean.localizedName) && Intrinsics.EZpvd((Object) this.nextPurchaseTime, (Object) recurringBuyFrequencyBean.nextPurchaseTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrequency() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalizedName() {
        return this.localizedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextPurchaseTime() {
        return this.nextPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.code) * 31) + this.frequency.hashCode()) * 31) + this.localizedName.hashCode()) * 31) + this.nextPurchaseTime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyFrequencyBean(code=" + this.code + ", frequency=" + this.frequency + ", localizedName=" + this.localizedName + ", nextPurchaseTime=" + this.nextPurchaseTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.code);
        parcel.writeString(this.frequency);
        parcel.writeString(this.localizedName);
        parcel.writeString(this.nextPurchaseTime);
    }

    public /* synthetic */ RecurringBuyFrequencyBean(int i, int i2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.code = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.frequency = "";
        } else {
            this.frequency = str;
        }
        if ((i & 4) == 0) {
            this.localizedName = "";
        } else {
            this.localizedName = str2;
        }
        if ((i & 8) == 0) {
            this.nextPurchaseTime = "";
        } else {
            this.nextPurchaseTime = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RecurringBuyFrequencyBean recurringBuyFrequencyBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || recurringBuyFrequencyBean.code != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, recurringBuyFrequencyBean.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) recurringBuyFrequencyBean.frequency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, recurringBuyFrequencyBean.frequency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) recurringBuyFrequencyBean.localizedName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, recurringBuyFrequencyBean.localizedName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) recurringBuyFrequencyBean.nextPurchaseTime, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, recurringBuyFrequencyBean.nextPurchaseTime);
    }

    public RecurringBuyFrequencyBean(int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.code = i;
        this.frequency = str;
        this.localizedName = str2;
        this.nextPurchaseTime = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyFrequencyBean.<init>(int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RecurringBuyFrequencyBean(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyFrequencyBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RecurringBuyFrequencyBean> serializer() {
            return RecurringBuyFrequencyBean$$serializer.INSTANCE;
        }

        public final RecurringBuyFrequencyBean OLrzqt(@NotNull RecurringBuyFrequencyResponseBean recurringBuyFrequencyResponseBean) {
            Intrinsics.checkNotNullParameter(recurringBuyFrequencyResponseBean, "");
            return new RecurringBuyFrequencyBean(recurringBuyFrequencyResponseBean.getCode(), recurringBuyFrequencyResponseBean.getFrequency(), recurringBuyFrequencyResponseBean.getLocalizedName(), recurringBuyFrequencyResponseBean.getNextPurchaseTime());
        }
    }
}
