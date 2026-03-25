package com.okinc.business.market.data.model.alert;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class AlertDataUiItem extends AlertUiItem {
    public static final Parcelable.Creator<AlertDataUiItem> CREATOR = new Creator();
    public final String AEQbTJ;
    public boolean AYXKKw;
    public final AlertRepeatType AhwBna;
    public final String AkhnZx;
    public final boolean EZpvd;
    public boolean KWHzl;
    public final AlertType OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String gEmmrt;
    public final AlertPromptType valueOf;

    public static final class Creator implements Parcelable.Creator<AlertDataUiItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertDataUiItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AlertDataUiItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), AlertType.valueOf(parcel.readString()), AlertPromptType.valueOf(parcel.readString()), AlertRepeatType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertDataUiItem[] newArray(int i) {
            return new AlertDataUiItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertDataUiItem AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull AlertType alertType, @NotNull AlertPromptType alertPromptType, @NotNull AlertRepeatType alertRepeatType, @NotNull String str5, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(alertType, "");
        Intrinsics.checkNotNullParameter(alertPromptType, "");
        Intrinsics.checkNotNullParameter(alertRepeatType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new AlertDataUiItem(str, str2, str3, str4, alertType, alertPromptType, alertRepeatType, str5, z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertType AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.market.data.model.alert.AlertUiItem
    public boolean AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.market.data.model.alert.AlertUiItem
    public String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.market.data.model.alert.AlertUiItem
    public String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertPromptType copydefault() {
        return this.valueOf;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertDataUiItem)) {
            return false;
        }
        AlertDataUiItem alertDataUiItem = (AlertDataUiItem) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) alertDataUiItem.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) alertDataUiItem.copydefault) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) alertDataUiItem.gEmmrt) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) alertDataUiItem.AkhnZx) && this.OLrzqt == alertDataUiItem.OLrzqt && this.valueOf == alertDataUiItem.valueOf && this.AhwBna == alertDataUiItem.AhwBna && Intrinsics.EZpvd((Object) this.djBIcL, (Object) alertDataUiItem.djBIcL) && this.EZpvd == alertDataUiItem.EZpvd && this.KWHzl == alertDataUiItem.KWHzl && this.AYXKKw == alertDataUiItem.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.market.data.model.alert.AlertUiItem
    public boolean fetchVPNInfo() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + Boolean.hashCode(this.KWHzl)) * 31) + Boolean.hashCode(this.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AlertDataUiItem(id=" + this.AEQbTJ + ", chainId=" + this.copydefault + ", tokenAddress=" + this.gEmmrt + ", tokenSymbol=" + this.AkhnZx + ", alertType=" + this.OLrzqt + ", promptType=" + this.valueOf + ", repeatType=" + this.AhwBna + ", threshold=" + this.djBIcL + ", active=" + this.EZpvd + ", isDeleting=" + this.KWHzl + ", isSelectedForDeleting=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertRepeatType valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.OLrzqt.name());
        parcel.writeString(this.valueOf.name());
        parcel.writeString(this.AhwBna.name());
        parcel.writeString(this.djBIcL);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeInt(this.KWHzl ? 1 : 0);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 com.okinc.business.market.data.model.alert.AlertType)
  (r21v0 com.okinc.business.market.data.model.alert.AlertPromptType)
  (r22v0 com.okinc.business.market.data.model.alert.AlertRepeatType)
  (r23v0 java.lang.String)
  (r24v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.model.alert.AlertType, com.okinc.business.market.data.model.alert.AlertPromptType, com.okinc.business.market.data.model.alert.AlertRepeatType, java.lang.String, boolean, boolean, boolean):void (m)] (LINE:38) call: com.okinc.business.market.data.model.alert.AlertDataUiItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.model.alert.AlertType, com.okinc.business.market.data.model.alert.AlertPromptType, com.okinc.business.market.data.model.alert.AlertRepeatType, java.lang.String, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ AlertDataUiItem(String str, String str2, String str3, String str4, AlertType alertType, AlertPromptType alertPromptType, AlertRepeatType alertRepeatType, String str5, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, alertType, alertPromptType, alertRepeatType, str5, z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDataUiItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull AlertType alertType, @NotNull AlertPromptType alertPromptType, @NotNull AlertRepeatType alertRepeatType, @NotNull String str5, boolean z, boolean z2, boolean z3) {
        super(str, str2, z2, z3, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(alertType, "");
        Intrinsics.checkNotNullParameter(alertPromptType, "");
        Intrinsics.checkNotNullParameter(alertRepeatType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.gEmmrt = str3;
        this.AkhnZx = str4;
        this.OLrzqt = alertType;
        this.valueOf = alertPromptType;
        this.AhwBna = alertRepeatType;
        this.djBIcL = str5;
        this.EZpvd = z;
        this.KWHzl = z2;
        this.AYXKKw = z3;
    }

    public final boolean EZpvd(@NotNull AlertUiItem alertUiItem) {
        Intrinsics.checkNotNullParameter(alertUiItem, "");
        return (alertUiItem instanceof AlertDataUiItem) && Intrinsics.EZpvd((Object) OLrzqt(), (Object) ((AlertDataUiItem) alertUiItem).OLrzqt());
    }

    public final boolean OLrzqt(@NotNull AlertGroupUiItem alertGroupUiItem) {
        Intrinsics.checkNotNullParameter(alertGroupUiItem, "");
        return Intrinsics.EZpvd((Object) this.gEmmrt, (Object) alertGroupUiItem.djBIcL()) && Intrinsics.EZpvd((Object) KWHzl(), (Object) alertGroupUiItem.KWHzl());
    }

    public final boolean EZpvd(TokenInfoForAlert tokenInfoForAlert) {
        return Intrinsics.EZpvd((Object) this.gEmmrt, (Object) (tokenInfoForAlert != null ? tokenInfoForAlert.valueOf() : null)) && Intrinsics.EZpvd((Object) KWHzl(), (Object) tokenInfoForAlert.copydefault());
    }
}
