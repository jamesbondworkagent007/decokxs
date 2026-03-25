package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class P2pPaymentParameters implements Parcelable {
    public static final Parcelable.Creator<P2pPaymentParameters> CREATOR = new Creator();
    public String AEQbTJ;
    public String EZpvd;
    public String KWHzl;
    public String OLrzqt;
    public String copydefault;
    public String djBIcL;
    public String valueOf;

    public static final class Creator implements Parcelable.Creator<P2pPaymentParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final P2pPaymentParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new P2pPaymentParameters(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final P2pPaymentParameters[] newArray(int i) {
            return new P2pPaymentParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public P2pPaymentParameters() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ P2pPaymentParameters copy$default(P2pPaymentParameters p2pPaymentParameters, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = p2pPaymentParameters.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = p2pPaymentParameters.KWHzl;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = p2pPaymentParameters.EZpvd;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = p2pPaymentParameters.djBIcL;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = p2pPaymentParameters.copydefault;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = p2pPaymentParameters.valueOf;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = p2pPaymentParameters.OLrzqt;
        }
        return p2pPaymentParameters.OLrzqt(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final P2pPaymentParameters OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new P2pPaymentParameters(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof P2pPaymentParameters)) {
            return false;
        }
        P2pPaymentParameters p2pPaymentParameters = (P2pPaymentParameters) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) p2pPaymentParameters.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) p2pPaymentParameters.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) p2pPaymentParameters.EZpvd) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) p2pPaymentParameters.djBIcL) && Intrinsics.EZpvd((Object) this.copydefault, (Object) p2pPaymentParameters.copydefault) && Intrinsics.EZpvd((Object) this.valueOf, (Object) p2pPaymentParameters.valueOf) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) p2pPaymentParameters.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "P2pPaymentParameters(p2pConvertBaseCurrency=" + this.AEQbTJ + ", p2pConvertBaseAmount=" + this.KWHzl + ", p2pBasePrice=" + this.EZpvd + ", p2pPaymentOrder=" + this.djBIcL + ", p2pPaymentAmount=" + this.copydefault + ", p2pQPAmount=" + this.valueOf + ", p2pPayment=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.OLrzqt);
    }

    public P2pPaymentParameters(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.AEQbTJ = str;
        this.KWHzl = str2;
        this.EZpvd = str3;
        this.djBIcL = str4;
        this.copydefault = str5;
        this.valueOf = str6;
        this.OLrzqt = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:939) call: com.okinc.okx.paymentapi.service.P2pPaymentParameters.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ P2pPaymentParameters(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
