package com.okinc.crcore.shared.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.bsc.AvailableCurrencyBalanceResponseBean;
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
public final class AvailableCurrencyBalanceBean implements Parcelable {
    public static final int $stable = 0;
    private final String availableBalance;
    private final String maxWithdrawalBalance;
    private final String name;
    private final String target;
    private final String unavailableBalance;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AvailableCurrencyBalanceBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<AvailableCurrencyBalanceBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvailableCurrencyBalanceBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AvailableCurrencyBalanceBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvailableCurrencyBalanceBean[] newArray(int i) {
            return new AvailableCurrencyBalanceBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AvailableCurrencyBalanceBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AvailableCurrencyBalanceBean copy$default(AvailableCurrencyBalanceBean availableCurrencyBalanceBean, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = availableCurrencyBalanceBean.availableBalance;
        }
        if ((i & 2) != 0) {
            str2 = availableCurrencyBalanceBean.name;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = availableCurrencyBalanceBean.maxWithdrawalBalance;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = availableCurrencyBalanceBean.target;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = availableCurrencyBalanceBean.unavailableBalance;
        }
        return availableCurrencyBalanceBean.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.availableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxWithdrawalBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.unavailableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AvailableCurrencyBalanceBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new AvailableCurrencyBalanceBean(str, str2, str3, str4, str5);
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
        if (!(obj instanceof AvailableCurrencyBalanceBean)) {
            return false;
        }
        AvailableCurrencyBalanceBean availableCurrencyBalanceBean = (AvailableCurrencyBalanceBean) obj;
        return Intrinsics.EZpvd((Object) this.availableBalance, (Object) availableCurrencyBalanceBean.availableBalance) && Intrinsics.EZpvd((Object) this.name, (Object) availableCurrencyBalanceBean.name) && Intrinsics.EZpvd((Object) this.maxWithdrawalBalance, (Object) availableCurrencyBalanceBean.maxWithdrawalBalance) && Intrinsics.EZpvd((Object) this.target, (Object) availableCurrencyBalanceBean.target) && Intrinsics.EZpvd((Object) this.unavailableBalance, (Object) availableCurrencyBalanceBean.unavailableBalance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxWithdrawalBalance() {
        return this.maxWithdrawalBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTarget() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnavailableBalance() {
        return this.unavailableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.availableBalance.hashCode() * 31) + this.name.hashCode()) * 31) + this.maxWithdrawalBalance.hashCode()) * 31) + this.target.hashCode()) * 31) + this.unavailableBalance.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AvailableCurrencyBalanceBean(availableBalance=" + this.availableBalance + ", name=" + this.name + ", maxWithdrawalBalance=" + this.maxWithdrawalBalance + ", target=" + this.target + ", unavailableBalance=" + this.unavailableBalance + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.availableBalance);
        parcel.writeString(this.name);
        parcel.writeString(this.maxWithdrawalBalance);
        parcel.writeString(this.target);
        parcel.writeString(this.unavailableBalance);
    }

    public /* synthetic */ AvailableCurrencyBalanceBean(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.availableBalance = "";
        } else {
            this.availableBalance = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.maxWithdrawalBalance = "";
        } else {
            this.maxWithdrawalBalance = str3;
        }
        if ((i & 8) == 0) {
            this.target = "";
        } else {
            this.target = str4;
        }
        if ((i & 16) == 0) {
            this.unavailableBalance = "";
        } else {
            this.unavailableBalance = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(AvailableCurrencyBalanceBean availableCurrencyBalanceBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) availableCurrencyBalanceBean.availableBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, availableCurrencyBalanceBean.availableBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) availableCurrencyBalanceBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, availableCurrencyBalanceBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) availableCurrencyBalanceBean.maxWithdrawalBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, availableCurrencyBalanceBean.maxWithdrawalBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) availableCurrencyBalanceBean.target, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, availableCurrencyBalanceBean.target);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) availableCurrencyBalanceBean.unavailableBalance, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, availableCurrencyBalanceBean.unavailableBalance);
    }

    public AvailableCurrencyBalanceBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.availableBalance = str;
        this.name = str2;
        this.maxWithdrawalBalance = str3;
        this.target = str4;
        this.unavailableBalance = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.bsc.AvailableCurrencyBalanceBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AvailableCurrencyBalanceBean(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.AvailableCurrencyBalanceBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AvailableCurrencyBalanceBean> serializer() {
            return AvailableCurrencyBalanceBean$$serializer.INSTANCE;
        }

        public final AvailableCurrencyBalanceBean KWHzl(@NotNull AvailableCurrencyBalanceResponseBean availableCurrencyBalanceResponseBean) {
            Intrinsics.checkNotNullParameter(availableCurrencyBalanceResponseBean, "");
            return new AvailableCurrencyBalanceBean(availableCurrencyBalanceResponseBean.getAvailableBalance(), availableCurrencyBalanceResponseBean.getName(), availableCurrencyBalanceResponseBean.getMaxWithdrawalBalance(), availableCurrencyBalanceResponseBean.getTarget(), availableCurrencyBalanceResponseBean.getUnavailableBalance());
        }
    }
}
