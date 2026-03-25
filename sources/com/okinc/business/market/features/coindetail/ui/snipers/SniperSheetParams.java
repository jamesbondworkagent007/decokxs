package com.okinc.business.market.features.coindetail.ui.snipers;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SniperSheetParams implements Parcelable {
    public static final Parcelable.Creator<SniperSheetParams> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<SniperSheetParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SniperSheetParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SniperSheetParams(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SniperSheetParams[] newArray(int i) {
            return new SniperSheetParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SniperSheetParams() {
        this(null, null, false, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SniperSheetParams copy$default(SniperSheetParams sniperSheetParams, String str, String str2, boolean z, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sniperSheetParams.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = sniperSheetParams.KWHzl;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            z = sniperSheetParams.AEQbTJ;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = sniperSheetParams.copydefault;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = sniperSheetParams.valueOf;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = sniperSheetParams.OLrzqt;
        }
        return sniperSheetParams.OLrzqt(str, str6, z2, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SniperSheetParams OLrzqt(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new SniperSheetParams(str, str2, z, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof SniperSheetParams)) {
            return false;
        }
        SniperSheetParams sniperSheetParams = (SniperSheetParams) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) sniperSheetParams.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) sniperSheetParams.KWHzl) && this.AEQbTJ == sniperSheetParams.AEQbTJ && Intrinsics.EZpvd((Object) this.copydefault, (Object) sniperSheetParams.copydefault) && Intrinsics.EZpvd((Object) this.valueOf, (Object) sniperSheetParams.valueOf) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) sniperSheetParams.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + this.copydefault.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SniperSheetParams(chainId=" + this.EZpvd + ", tokenContractAddress=" + this.KWHzl + ", isSupportHolderDetail=" + this.AEQbTJ + ", source=" + this.copydefault + ", tokenName=" + this.valueOf + ", chainName=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.OLrzqt);
    }

    public SniperSheetParams(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.EZpvd = str;
        this.KWHzl = str2;
        this.AEQbTJ = z;
        this.copydefault = str3;
        this.valueOf = str4;
        this.OLrzqt = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:boolean:0x0015: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:java.lang.String:0x001c: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("header") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:36) call: com.okinc.business.market.features.coindetail.ui.snipers.SniperSheetParams.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SniperSheetParams(String str, String str2, boolean z, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "header" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
    }
}
