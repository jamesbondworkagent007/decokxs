package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class ActivatePayRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ActivatePayRequest> CREATOR = new Creator();
    private final String customDialogTitle;
    private final String customResultPageTCText;
    private final boolean needShowAddFundsPage;
    private final Web3PayProjectId projectId;
    private final boolean showSplashView;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<ActivatePayRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActivatePayRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ActivatePayRequest(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, Web3PayProjectId.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActivatePayRequest[] newArray(int i) {
            return new ActivatePayRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ActivatePayRequest() {
        this(null, false, false, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomDialogTitle() {
        return this.customDialogTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomResultPageTCText() {
        return this.customResultPageTCText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedShowAddFundsPage() {
        return this.needShowAddFundsPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3PayProjectId getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowSplashView() {
        return this.showSplashView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.customDialogTitle);
        parcel.writeInt(this.needShowAddFundsPage ? 1 : 0);
        parcel.writeInt(this.showSplashView ? 1 : 0);
        parcel.writeString(this.projectId.name());
        parcel.writeString(this.customResultPageTCText);
    }

    public ActivatePayRequest(@NotNull String str, boolean z, boolean z2, @NotNull Web3PayProjectId web3PayProjectId, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(web3PayProjectId, "");
        this.customDialogTitle = str;
        this.needShowAddFundsPage = z;
        this.showSplashView = z2;
        this.projectId = web3PayProjectId;
        this.customResultPageTCText = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 boolean) : false)
  (wrap:com.okinc.business.web3pay.api.model.Web3PayProjectId:0x001a: TERNARY null = ((wrap:int:0x0014: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.web3pay.api.model.Web3PayProjectId:0x0018: SGET  A[WRAPPED] (LINE:22) com.okinc.business.web3pay.api.model.Web3PayProjectId.NATIVE_PAY com.okinc.business.web3pay.api.model.Web3PayProjectId) : (r7v0 com.okinc.business.web3pay.api.model.Web3PayProjectId))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
 A[MD:(java.lang.String, boolean, boolean, com.okinc.business.web3pay.api.model.Web3PayProjectId, java.lang.String):void (m)] (LINE:18) call: com.okinc.business.web3pay.api.model.ActivatePayRequest.<init>(java.lang.String, boolean, boolean, com.okinc.business.web3pay.api.model.Web3PayProjectId, java.lang.String):void type: THIS */
    public /* synthetic */ ActivatePayRequest(String str, boolean z, boolean z2, Web3PayProjectId web3PayProjectId, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) == 0 ? z2 : false, (i & 8) != 0 ? Web3PayProjectId.NATIVE_PAY : web3PayProjectId, (i & 16) != 0 ? null : str2);
    }
}
