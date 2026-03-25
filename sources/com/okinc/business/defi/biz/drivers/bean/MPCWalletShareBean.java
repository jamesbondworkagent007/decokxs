package com.okinc.business.defi.biz.drivers.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class MPCWalletShareBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<MPCWalletShareBean> CREATOR = new Creator();
    private String ecdsaP3;
    private String ecdsaShare3;
    private String ed25519Share3;

    public static final class Creator implements Parcelable.Creator<MPCWalletShareBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MPCWalletShareBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MPCWalletShareBean(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MPCWalletShareBean[] newArray(int i) {
            return new MPCWalletShareBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MPCWalletShareBean() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEcdsaP3() {
        return this.ecdsaP3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEcdsaShare3() {
        return this.ecdsaShare3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEd25519Share3() {
        return this.ed25519Share3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEcdsaP3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ecdsaP3 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEcdsaShare3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ecdsaShare3 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEd25519Share3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ed25519Share3 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ed25519Share3);
        parcel.writeString(this.ecdsaShare3);
        parcel.writeString(this.ecdsaP3);
    }

    public MPCWalletShareBean(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.ed25519Share3 = str;
        this.ecdsaShare3 = str2;
        this.ecdsaP3 = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:27) call: com.okinc.business.defi.biz.drivers.bean.MPCWalletShareBean.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MPCWalletShareBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public String toString() {
        return "MpcShareBean(ed25519Share3='" + this.ed25519Share3 + "', ecdsaShare3='" + this.ecdsaShare3 + "', ecdsaP3='" + this.ecdsaP3 + "')";
    }
}
