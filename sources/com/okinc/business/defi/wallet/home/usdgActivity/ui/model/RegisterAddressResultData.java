package com.okinc.business.defi.wallet.home.usdgActivity.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class RegisterAddressResultData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RegisterAddressResultData> CREATOR = new Creator();
    private final Integer addressType;
    private final Long coinId;
    private final int resultType;
    private final boolean supportRetryRegister;
    private final String uidByIndependentApp;
    private final String walletId;

    public static final class Creator implements Parcelable.Creator<RegisterAddressResultData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegisterAddressResultData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RegisterAddressResultData(parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegisterAddressResultData[] newArray(int i) {
            return new RegisterAddressResultData[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getResultType() {
        return this.resultType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportRetryRegister() {
        return this.supportRetryRegister;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUidByIndependentApp() {
        return this.uidByIndependentApp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.resultType);
        Long l = this.coinId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.walletId);
        Integer num = this.addressType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.supportRetryRegister ? 1 : 0);
        parcel.writeString(this.uidByIndependentApp);
    }

    public RegisterAddressResultData(int i, Long l, String str, Integer num, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.resultType = i;
        this.coinId = l;
        this.walletId = str;
        this.addressType = num;
        this.supportRetryRegister = z;
        this.uidByIndependentApp = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r8v0 int)
  (r9v0 java.lang.Long)
  (r10v0 java.lang.String)
  (wrap:java.lang.Integer:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (r12v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(int, java.lang.Long, java.lang.String, java.lang.Integer, boolean, java.lang.String):void (m)] (LINE:30) call: com.okinc.business.defi.wallet.home.usdgActivity.ui.model.RegisterAddressResultData.<init>(int, java.lang.Long, java.lang.String, java.lang.Integer, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ RegisterAddressResultData(int i, Long l, String str, Integer num, boolean z, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, l, str, (i2 & 8) != 0 ? null : num, z, (i2 & 32) != 0 ? "" : str2);
    }
}
