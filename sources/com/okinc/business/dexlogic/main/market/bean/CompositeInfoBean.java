package com.okinc.business.dexlogic.main.market.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class CompositeInfoBean implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CompositeInfoBean> CREATOR = new Creator();
    private final int chainId;
    private final String change24H;
    private final String price;
    private final String tokenContractAddress;
    private final String tokenLogoUrl;
    private final String tokenName;
    private final String tokenSymbol;

    public static final class Creator implements Parcelable.Creator<CompositeInfoBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompositeInfoBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CompositeInfoBean(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompositeInfoBean[] newArray(int i) {
            return new CompositeInfoBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CompositeInfoBean() {
        this(0, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CompositeInfoBean copy$default(CompositeInfoBean compositeInfoBean, int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = compositeInfoBean.chainId;
        }
        if ((i2 & 2) != 0) {
            str = compositeInfoBean.change24H;
        }
        String str7 = str;
        if ((i2 & 4) != 0) {
            str2 = compositeInfoBean.price;
        }
        String str8 = str2;
        if ((i2 & 8) != 0) {
            str3 = compositeInfoBean.tokenContractAddress;
        }
        String str9 = str3;
        if ((i2 & 16) != 0) {
            str4 = compositeInfoBean.tokenLogoUrl;
        }
        String str10 = str4;
        if ((i2 & 32) != 0) {
            str5 = compositeInfoBean.tokenName;
        }
        String str11 = str5;
        if ((i2 & 64) != 0) {
            str6 = compositeInfoBean.tokenSymbol;
        }
        return compositeInfoBean.copy(i, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.change24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CompositeInfoBean copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new CompositeInfoBean(i, str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof CompositeInfoBean)) {
            return false;
        }
        CompositeInfoBean compositeInfoBean = (CompositeInfoBean) obj;
        return this.chainId == compositeInfoBean.chainId && Intrinsics.EZpvd((Object) this.change24H, (Object) compositeInfoBean.change24H) && Intrinsics.EZpvd((Object) this.price, (Object) compositeInfoBean.price) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) compositeInfoBean.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) compositeInfoBean.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenName, (Object) compositeInfoBean.tokenName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) compositeInfoBean.tokenSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChange24H() {
        return this.change24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Integer.hashCode(this.chainId) * 31) + this.change24H.hashCode()) * 31) + this.price.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenSymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CompositeInfoBean(chainId=" + this.chainId + ", change24H=" + this.change24H + ", price=" + this.price + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenName=" + this.tokenName + ", tokenSymbol=" + this.tokenSymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.chainId);
        parcel.writeString(this.change24H);
        parcel.writeString(this.price);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.tokenLogoUrl);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenSymbol);
    }

    public CompositeInfoBean(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.chainId = i;
        this.change24H = str;
        this.price = str2;
        this.tokenContractAddress = str3;
        this.tokenLogoUrl = str4;
        this.tokenName = str5;
        this.tokenSymbol = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (""))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:209) call: com.okinc.business.dexlogic.main.market.bean.CompositeInfoBean.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CompositeInfoBean(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) == 0 ? str6 : "");
    }
}
