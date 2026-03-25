package com.okinc.tradingbot.impl.order.strategy.contractdca.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ContractDcaAdvancedParams implements Parcelable {
    public static final Parcelable.Creator<ContractDcaAdvancedParams> CREATOR = new Creator();
    public DcaTriggerParam AEQbTJ;
    public String AYXKKw;
    public String EZpvd;
    public String KWHzl;
    public String OLrzqt;
    public Boolean copydefault;
    public DcaTriggerParam gEmmrt;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<ContractDcaAdvancedParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractDcaAdvancedParams createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            DcaTriggerParam dcaTriggerParam = (DcaTriggerParam) parcel.readParcelable(ContractDcaAdvancedParams.class.getClassLoader());
            DcaTriggerParam dcaTriggerParam2 = (DcaTriggerParam) parcel.readParcelable(ContractDcaAdvancedParams.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ContractDcaAdvancedParams(dcaTriggerParam, dcaTriggerParam2, string, string2, string3, string4, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractDcaAdvancedParams[] newArray(int i) {
            return new ContractDcaAdvancedParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ContractDcaAdvancedParams copy$default(ContractDcaAdvancedParams contractDcaAdvancedParams, DcaTriggerParam dcaTriggerParam, DcaTriggerParam dcaTriggerParam2, String str, String str2, String str3, String str4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            dcaTriggerParam = contractDcaAdvancedParams.AEQbTJ;
        }
        if ((i & 2) != 0) {
            dcaTriggerParam2 = contractDcaAdvancedParams.gEmmrt;
        }
        DcaTriggerParam dcaTriggerParam3 = dcaTriggerParam2;
        if ((i & 4) != 0) {
            str = contractDcaAdvancedParams.KWHzl;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = contractDcaAdvancedParams.AYXKKw;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = contractDcaAdvancedParams.EZpvd;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = contractDcaAdvancedParams.OLrzqt;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            bool = contractDcaAdvancedParams.copydefault;
        }
        return contractDcaAdvancedParams.KWHzl(dcaTriggerParam, dcaTriggerParam3, str5, str6, str7, str8, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(String str) {
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaTriggerParam AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaTriggerParam EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractDcaAdvancedParams KWHzl(DcaTriggerParam dcaTriggerParam, DcaTriggerParam dcaTriggerParam2, String str, String str2, String str3, String str4, Boolean bool) {
        return new ContractDcaAdvancedParams(dcaTriggerParam, dcaTriggerParam2, str, str2, str3, str4, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(DcaTriggerParam dcaTriggerParam) {
        this.gEmmrt = dcaTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(DcaTriggerParam dcaTriggerParam) {
        this.AEQbTJ = dcaTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(String str) {
        this.KWHzl = str;
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
        if (!(obj instanceof ContractDcaAdvancedParams)) {
            return false;
        }
        ContractDcaAdvancedParams contractDcaAdvancedParams = (ContractDcaAdvancedParams) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, contractDcaAdvancedParams.AEQbTJ) && Intrinsics.EZpvd(this.gEmmrt, contractDcaAdvancedParams.gEmmrt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) contractDcaAdvancedParams.KWHzl) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) contractDcaAdvancedParams.AYXKKw) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) contractDcaAdvancedParams.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) contractDcaAdvancedParams.OLrzqt) && Intrinsics.EZpvd(this.copydefault, contractDcaAdvancedParams.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        DcaTriggerParam dcaTriggerParam = this.AEQbTJ;
        int iHashCode = dcaTriggerParam == null ? 0 : dcaTriggerParam.hashCode();
        DcaTriggerParam dcaTriggerParam2 = this.gEmmrt;
        int iHashCode2 = dcaTriggerParam2 == null ? 0 : dcaTriggerParam2.hashCode();
        String str = this.KWHzl;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.AYXKKw;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.EZpvd;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.OLrzqt;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        Boolean bool = this.copydefault;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContractDcaAdvancedParams(startTriggerParam=" + this.AEQbTJ + ", stopTriggerParam=" + this.gEmmrt + ", slPct=" + this.KWHzl + ", volMult=" + this.AYXKKw + ", pxStepsMult=" + this.EZpvd + ", slMode=" + this.OLrzqt + ", fromCopy=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.AEQbTJ, i);
        parcel.writeParcelable(this.gEmmrt, i);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.OLrzqt);
        Boolean bool = this.copydefault;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public ContractDcaAdvancedParams(DcaTriggerParam dcaTriggerParam, DcaTriggerParam dcaTriggerParam2, String str, String str2, String str3, String str4, Boolean bool) {
        this.AEQbTJ = dcaTriggerParam;
        this.gEmmrt = dcaTriggerParam2;
        this.KWHzl = str;
        this.AYXKKw = str2;
        this.EZpvd = str3;
        this.OLrzqt = str4;
        this.copydefault = bool;
    }
}
