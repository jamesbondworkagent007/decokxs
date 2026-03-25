package com.okinc.business.dexui.main.swap.route.dag.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class UiTokenInfoModel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<UiTokenInfoModel> CREATOR = new Creator();
    private final String chainLogoUrl;
    private final String tokenContractAddress;
    private final String tokenLogoUrl;
    private final String tokenSymbol;

    public static final class Creator implements Parcelable.Creator<UiTokenInfoModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiTokenInfoModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UiTokenInfoModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiTokenInfoModel[] newArray(int i) {
            return new UiTokenInfoModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UiTokenInfoModel() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UiTokenInfoModel copy$default(UiTokenInfoModel uiTokenInfoModel, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiTokenInfoModel.tokenSymbol;
        }
        if ((i & 2) != 0) {
            str2 = uiTokenInfoModel.tokenContractAddress;
        }
        if ((i & 4) != 0) {
            str3 = uiTokenInfoModel.tokenLogoUrl;
        }
        if ((i & 8) != 0) {
            str4 = uiTokenInfoModel.chainLogoUrl;
        }
        return uiTokenInfoModel.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiTokenInfoModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new UiTokenInfoModel(str, str2, str3, str4);
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
        if (!(obj instanceof UiTokenInfoModel)) {
            return false;
        }
        UiTokenInfoModel uiTokenInfoModel = (UiTokenInfoModel) obj;
        return Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) uiTokenInfoModel.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) uiTokenInfoModel.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) uiTokenInfoModel.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) uiTokenInfoModel.chainLogoUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
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
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.tokenSymbol.hashCode() * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.chainLogoUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UiTokenInfoModel(tokenSymbol=" + this.tokenSymbol + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogoUrl=" + this.tokenLogoUrl + ", chainLogoUrl=" + this.chainLogoUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.tokenLogoUrl);
        parcel.writeString(this.chainLogoUrl);
    }

    public UiTokenInfoModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.tokenSymbol = str;
        this.tokenContractAddress = str2;
        this.tokenLogoUrl = str3;
        this.chainLogoUrl = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.business.dexui.main.swap.route.dag.model.UiTokenInfoModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UiTokenInfoModel(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
