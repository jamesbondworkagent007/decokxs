package com.reown.android.internal.common.modal.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class Wallet {
    public final String appPackage;
    public final String homePage;
    public final String id;
    public final String imageUrl;
    public boolean isRecent;
    public final boolean isRecommended;
    public boolean isWalletInstalled;
    public final String linkMode;
    public final String mobileLink;
    public final String name;
    public final String order;
    public final String playStore;
    public final String webAppLink;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.isRecommended;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.homePage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.order;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.mobileLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.playStore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.webAppLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.linkMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Wallet copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, String str9, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new Wallet(str, str2, str3, str4, str5, str6, str7, str8, str9, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wallet)) {
            return false;
        }
        Wallet wallet = (Wallet) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) wallet.id) && Intrinsics.EZpvd((Object) this.name, (Object) wallet.name) && Intrinsics.EZpvd((Object) this.homePage, (Object) wallet.homePage) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) wallet.imageUrl) && Intrinsics.EZpvd((Object) this.order, (Object) wallet.order) && Intrinsics.EZpvd((Object) this.mobileLink, (Object) wallet.mobileLink) && Intrinsics.EZpvd((Object) this.playStore, (Object) wallet.playStore) && Intrinsics.EZpvd((Object) this.webAppLink, (Object) wallet.webAppLink) && Intrinsics.EZpvd((Object) this.linkMode, (Object) wallet.linkMode) && this.isRecommended == wallet.isRecommended;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppPackage() {
        return this.appPackage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasMobileWallet() {
        return this.mobileLink != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasWebApp() {
        return this.webAppLink != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHomePage() {
        return this.homePage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLinkMode() {
        return this.linkMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMobileLink() {
        return this.mobileLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrder() {
        return this.order;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlayStore() {
        return this.playStore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWebAppLink() {
        return this.webAppLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.name.hashCode();
        int iHashCode3 = this.homePage.hashCode();
        int iHashCode4 = this.imageUrl.hashCode();
        int iHashCode5 = this.order.hashCode();
        String str = this.mobileLink;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.playStore;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.webAppLink;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.linkMode;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.isRecommended);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRecent() {
        return this.isRecent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRecommended() {
        return this.isRecommended;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isWalletInstalled() {
        return this.isWalletInstalled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecent(boolean z) {
        this.isRecent = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletInstalled(boolean z) {
        this.isWalletInstalled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Wallet(id=" + this.id + ", name=" + this.name + ", homePage=" + this.homePage + ", imageUrl=" + this.imageUrl + ", order=" + this.order + ", mobileLink=" + this.mobileLink + ", playStore=" + this.playStore + ", webAppLink=" + this.webAppLink + ", linkMode=" + this.linkMode + ", isRecommended=" + this.isRecommended + ")";
    }

    public Wallet(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, String str9, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.id = str;
        this.name = str2;
        this.homePage = str3;
        this.imageUrl = str4;
        this.order = str5;
        this.mobileLink = str6;
        this.playStore = str7;
        this.webAppLink = str8;
        this.linkMode = str9;
        this.isRecommended = z;
        this.appPackage = str7 != null ? WalletKt.extractPackage(str7) : null;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:5) call: com.reown.android.internal.common.modal.data.model.Wallet.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ Wallet(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, (i & 512) != 0 ? false : z);
    }
}
