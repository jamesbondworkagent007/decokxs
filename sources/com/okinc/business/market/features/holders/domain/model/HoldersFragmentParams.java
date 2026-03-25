package com.okinc.business.market.features.holders.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HoldersFragmentParams implements Parcelable {
    public final boolean AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final Parcelable.Creator<HoldersFragmentParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HoldersFragmentParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HoldersFragmentParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HoldersFragmentParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HoldersFragmentParams[] newArray(int i) {
            return new HoldersFragmentParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HoldersFragmentParams() {
        this(null, null, null, null, false, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HoldersFragmentParams copy$default(HoldersFragmentParams holdersFragmentParams, String str, String str2, String str3, String str4, boolean z, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = holdersFragmentParams.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = holdersFragmentParams.KWHzl;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = holdersFragmentParams.djBIcL;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = holdersFragmentParams.valueOf;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            z = holdersFragmentParams.AEQbTJ;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = holdersFragmentParams.OLrzqt;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            str6 = holdersFragmentParams.copydefault;
        }
        return holdersFragmentParams.copydefault(str, str7, str8, str9, z2, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HoldersFragmentParams copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new HoldersFragmentParams(str, str2, str3, str4, z, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
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
        if (!(obj instanceof HoldersFragmentParams)) {
            return false;
        }
        HoldersFragmentParams holdersFragmentParams = (HoldersFragmentParams) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) holdersFragmentParams.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) holdersFragmentParams.KWHzl) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) holdersFragmentParams.djBIcL) && Intrinsics.EZpvd((Object) this.valueOf, (Object) holdersFragmentParams.valueOf) && this.AEQbTJ == holdersFragmentParams.AEQbTJ && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) holdersFragmentParams.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) holdersFragmentParams.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HoldersFragmentParams(chainId=" + this.EZpvd + ", chainName=" + this.KWHzl + ", tokenContractAddress=" + this.djBIcL + ", tokenSymbol=" + this.valueOf + ", isChainSupportExpandData=" + this.AEQbTJ + ", chainLogo=" + this.OLrzqt + ", pageFrom=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.valueOf);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.copydefault);
    }

    public HoldersFragmentParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.EZpvd = str;
        this.KWHzl = str2;
        this.djBIcL = str3;
        this.valueOf = str4;
        this.AEQbTJ = z;
        this.OLrzqt = str5;
        this.copydefault = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:boolean:0x0023: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.market.features.holders.domain.model.HoldersFragmentParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HoldersFragmentParams(String str, String str2, String str3, String str4, boolean z, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.holders.domain.model.HoldersFragmentParams.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
