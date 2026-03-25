package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class CardAuthResultCTAConfig implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CardAuthResultCTAConfig> CREATOR = new Creator();
    private final String failPagePrimaryCTAText;
    private final String failPageSecondaryCTAText;
    private final boolean isFirstTimeAuth;
    private final String processingPagePrimaryCTAText;
    private final String processingPageSecondaryCTAText;
    private final String successPagePrimaryCTAText;
    private final String successPageSecondaryCTAText;

    public static final class Creator implements Parcelable.Creator<CardAuthResultCTAConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardAuthResultCTAConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CardAuthResultCTAConfig(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardAuthResultCTAConfig[] newArray(int i) {
            return new CardAuthResultCTAConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CardAuthResultCTAConfig() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CardAuthResultCTAConfig copy$default(CardAuthResultCTAConfig cardAuthResultCTAConfig, boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cardAuthResultCTAConfig.isFirstTimeAuth;
        }
        if ((i & 2) != 0) {
            str = cardAuthResultCTAConfig.processingPagePrimaryCTAText;
        }
        String str7 = str;
        if ((i & 4) != 0) {
            str2 = cardAuthResultCTAConfig.processingPageSecondaryCTAText;
        }
        String str8 = str2;
        if ((i & 8) != 0) {
            str3 = cardAuthResultCTAConfig.successPagePrimaryCTAText;
        }
        String str9 = str3;
        if ((i & 16) != 0) {
            str4 = cardAuthResultCTAConfig.successPageSecondaryCTAText;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = cardAuthResultCTAConfig.failPagePrimaryCTAText;
        }
        String str11 = str5;
        if ((i & 64) != 0) {
            str6 = cardAuthResultCTAConfig.failPageSecondaryCTAText;
        }
        return cardAuthResultCTAConfig.copy(z, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isFirstTimeAuth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.processingPagePrimaryCTAText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.processingPageSecondaryCTAText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.successPagePrimaryCTAText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.successPageSecondaryCTAText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.failPagePrimaryCTAText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.failPageSecondaryCTAText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardAuthResultCTAConfig copy(boolean z, @NotNull String str, String str2, @NotNull String str3, String str4, @NotNull String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new CardAuthResultCTAConfig(z, str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof CardAuthResultCTAConfig)) {
            return false;
        }
        CardAuthResultCTAConfig cardAuthResultCTAConfig = (CardAuthResultCTAConfig) obj;
        return this.isFirstTimeAuth == cardAuthResultCTAConfig.isFirstTimeAuth && Intrinsics.EZpvd((Object) this.processingPagePrimaryCTAText, (Object) cardAuthResultCTAConfig.processingPagePrimaryCTAText) && Intrinsics.EZpvd((Object) this.processingPageSecondaryCTAText, (Object) cardAuthResultCTAConfig.processingPageSecondaryCTAText) && Intrinsics.EZpvd((Object) this.successPagePrimaryCTAText, (Object) cardAuthResultCTAConfig.successPagePrimaryCTAText) && Intrinsics.EZpvd((Object) this.successPageSecondaryCTAText, (Object) cardAuthResultCTAConfig.successPageSecondaryCTAText) && Intrinsics.EZpvd((Object) this.failPagePrimaryCTAText, (Object) cardAuthResultCTAConfig.failPagePrimaryCTAText) && Intrinsics.EZpvd((Object) this.failPageSecondaryCTAText, (Object) cardAuthResultCTAConfig.failPageSecondaryCTAText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailPagePrimaryCTAText() {
        return this.failPagePrimaryCTAText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailPageSecondaryCTAText() {
        return this.failPageSecondaryCTAText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProcessingPagePrimaryCTAText() {
        return this.processingPagePrimaryCTAText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProcessingPageSecondaryCTAText() {
        return this.processingPageSecondaryCTAText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuccessPagePrimaryCTAText() {
        return this.successPagePrimaryCTAText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuccessPageSecondaryCTAText() {
        return this.successPageSecondaryCTAText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isFirstTimeAuth);
        int iHashCode2 = this.processingPagePrimaryCTAText.hashCode();
        String str = this.processingPageSecondaryCTAText;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.successPagePrimaryCTAText.hashCode();
        String str2 = this.successPageSecondaryCTAText;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        int iHashCode6 = this.failPagePrimaryCTAText.hashCode();
        String str3 = this.failPageSecondaryCTAText;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFirstTimeAuth() {
        return this.isFirstTimeAuth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardAuthResultCTAConfig(isFirstTimeAuth=" + this.isFirstTimeAuth + ", processingPagePrimaryCTAText=" + this.processingPagePrimaryCTAText + ", processingPageSecondaryCTAText=" + this.processingPageSecondaryCTAText + ", successPagePrimaryCTAText=" + this.successPagePrimaryCTAText + ", successPageSecondaryCTAText=" + this.successPageSecondaryCTAText + ", failPagePrimaryCTAText=" + this.failPagePrimaryCTAText + ", failPageSecondaryCTAText=" + this.failPageSecondaryCTAText + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isFirstTimeAuth ? 1 : 0);
        parcel.writeString(this.processingPagePrimaryCTAText);
        parcel.writeString(this.processingPageSecondaryCTAText);
        parcel.writeString(this.successPagePrimaryCTAText);
        parcel.writeString(this.successPageSecondaryCTAText);
        parcel.writeString(this.failPagePrimaryCTAText);
        parcel.writeString(this.failPageSecondaryCTAText);
    }

    public CardAuthResultCTAConfig(boolean z, @NotNull String str, String str2, @NotNull String str3, String str4, @NotNull String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.isFirstTimeAuth = z;
        this.processingPagePrimaryCTAText = str;
        this.processingPageSecondaryCTAText = str2;
        this.successPagePrimaryCTAText = str3;
        this.successPageSecondaryCTAText = str4;
        this.failPagePrimaryCTAText = str5;
        this.failPageSecondaryCTAText = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r6v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (null java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:33) call: com.okinc.business.web3pay.api.model.CardAuthResultCTAConfig.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CardAuthResultCTAConfig(boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? str5 : "", (i & 64) == 0 ? str6 : null);
    }
}
