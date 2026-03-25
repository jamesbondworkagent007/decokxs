package com.okinc.business.defi.wallet.common.okxconnect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.errorprone.annotations.Keep;
import com.okinc.business.defi.api.bean.SignType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public interface DAppWrapper extends Parcelable {

    @Keep
    public static final class DAppSignWrapper implements DAppWrapper {
        public static final Parcelable.Creator<DAppSignWrapper> CREATOR = new Creator();
        public final String AEQbTJ;
        public final boolean EZpvd;
        public final String KWHzl;
        public final Long OLrzqt;
        public final String copydefault;
        public final SignType gEmmrt;
        public final String valueOf;

        public static final class Creator implements Parcelable.Creator<DAppSignWrapper> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DAppSignWrapper createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new DAppSignWrapper(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : SignType.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DAppSignWrapper[] newArray(int i) {
                return new DAppSignWrapper[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DAppSignWrapper copy$default(DAppSignWrapper dAppSignWrapper, String str, String str2, Long l, String str3, boolean z, SignType signType, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dAppSignWrapper.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = dAppSignWrapper.AEQbTJ;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                l = dAppSignWrapper.OLrzqt;
            }
            Long l2 = l;
            if ((i & 8) != 0) {
                str3 = dAppSignWrapper.valueOf;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                z = dAppSignWrapper.EZpvd;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                signType = dAppSignWrapper.gEmmrt;
            }
            SignType signType2 = signType;
            if ((i & 64) != 0) {
                str4 = dAppSignWrapper.KWHzl;
            }
            return dAppSignWrapper.AEQbTJ(str, str5, l2, str6, z2, signType2, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DAppSignWrapper AEQbTJ(@NotNull String str, @NotNull String str2, Long l, String str3, boolean z, SignType signType, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new DAppSignWrapper(str, str2, l, str3, z, signType, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignType OLrzqt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Long copydefault() {
            return this.OLrzqt;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DAppSignWrapper)) {
                return false;
            }
            DAppSignWrapper dAppSignWrapper = (DAppSignWrapper) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) dAppSignWrapper.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) dAppSignWrapper.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, dAppSignWrapper.OLrzqt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) dAppSignWrapper.valueOf) && this.EZpvd == dAppSignWrapper.EZpvd && this.gEmmrt == dAppSignWrapper.gEmmrt && Intrinsics.EZpvd((Object) this.KWHzl, (Object) dAppSignWrapper.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            int iHashCode2 = this.AEQbTJ.hashCode();
            Long l = this.OLrzqt;
            int iHashCode3 = l == null ? 0 : l.hashCode();
            String str = this.valueOf;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            int iHashCode5 = Boolean.hashCode(this.EZpvd);
            SignType signType = this.gEmmrt;
            int iHashCode6 = signType == null ? 0 : signType.hashCode();
            String str2 = this.KWHzl;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DAppSignWrapper(chainId=" + this.copydefault + ", data=" + this.AEQbTJ + ", requestId=" + this.OLrzqt + ", topic=" + this.valueOf + ", isPersonSign=" + this.EZpvd + ", signType=" + this.gEmmrt + ", raw=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
            parcel.writeString(this.AEQbTJ);
            Long l = this.OLrzqt;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            parcel.writeString(this.valueOf);
            parcel.writeInt(this.EZpvd ? 1 : 0);
            SignType signType = this.gEmmrt;
            if (signType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(signType.name());
            }
            parcel.writeString(this.KWHzl);
        }

        public DAppSignWrapper(@NotNull String str, @NotNull String str2, Long l, String str3, boolean z, SignType signType, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.AEQbTJ = str2;
            this.OLrzqt = l;
            this.valueOf = str3;
            this.EZpvd = z;
            this.gEmmrt = signType;
            this.KWHzl = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r13v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r15v0 boolean))
  (wrap:com.okinc.business.defi.api.bean.SignType:?: TERNARY null = ((wrap:int:0x0017: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.SignType) : (r16v0 com.okinc.business.defi.api.bean.SignType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, boolean, com.okinc.business.defi.api.bean.SignType, java.lang.String):void (m)] (LINE:18) call: com.okinc.business.defi.wallet.common.okxconnect.model.DAppWrapper.DAppSignWrapper.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, boolean, com.okinc.business.defi.api.bean.SignType, java.lang.String):void type: THIS */
        public /* synthetic */ DAppSignWrapper(String str, String str2, Long l, String str3, boolean z, SignType signType, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : signType, (i & 64) != 0 ? "" : str4);
        }
    }

    @Keep
    public static final class DAppInteractionWrapper implements DAppWrapper {
        public static final Parcelable.Creator<DAppInteractionWrapper> CREATOR = new Creator();
        public final String AEQbTJ;
        public final Integer AYXKKw;
        public final String AhwBna;
        public final Long EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final String copydefault;
        public final String djBIcL;
        public final Long gEmmrt;
        public final boolean valueOf;

        public static final class Creator implements Parcelable.Creator<DAppInteractionWrapper> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DAppInteractionWrapper createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new DAppInteractionWrapper(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DAppInteractionWrapper[] newArray(int i) {
                return new DAppInteractionWrapper[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Long AEQbTJ() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DAppInteractionWrapper EZpvd(@NotNull String str, String str2, Long l, String str3, @NotNull String str4, Long l2, String str5, String str6, boolean z, Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new DAppInteractionWrapper(str, str2, l, str3, str4, l2, str5, str6, z, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.AhwBna;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DAppInteractionWrapper)) {
                return false;
            }
            DAppInteractionWrapper dAppInteractionWrapper = (DAppInteractionWrapper) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) dAppInteractionWrapper.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) dAppInteractionWrapper.AEQbTJ) && Intrinsics.EZpvd(this.gEmmrt, dAppInteractionWrapper.gEmmrt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) dAppInteractionWrapper.djBIcL) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) dAppInteractionWrapper.AhwBna) && Intrinsics.EZpvd(this.EZpvd, dAppInteractionWrapper.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) dAppInteractionWrapper.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) dAppInteractionWrapper.KWHzl) && this.valueOf == dAppInteractionWrapper.valueOf && Intrinsics.EZpvd(this.AYXKKw, dAppInteractionWrapper.AYXKKw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            String str = this.AEQbTJ;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            Long l = this.gEmmrt;
            int iHashCode3 = l == null ? 0 : l.hashCode();
            String str2 = this.djBIcL;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            int iHashCode5 = this.AhwBna.hashCode();
            Long l2 = this.EZpvd;
            int iHashCode6 = l2 == null ? 0 : l2.hashCode();
            String str3 = this.OLrzqt;
            int iHashCode7 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.KWHzl;
            int iHashCode8 = str4 == null ? 0 : str4.hashCode();
            int iHashCode9 = Boolean.hashCode(this.valueOf);
            Integer num = this.AYXKKw;
            return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DAppInteractionWrapper(chainId=" + this.copydefault + ", data=" + this.AEQbTJ + ", requestId=" + this.gEmmrt + ", topic=" + this.djBIcL + ", signDataJson=" + this.AhwBna + ", coinId=" + this.EZpvd + ", approvalAddress=" + this.OLrzqt + ", approveAmt=" + this.KWHzl + ", isCancelApproveInfo=" + this.valueOf + ", txToastCheckBizLine=" + this.AYXKKw + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
            parcel.writeString(this.AEQbTJ);
            Long l = this.gEmmrt;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            parcel.writeString(this.djBIcL);
            parcel.writeString(this.AhwBna);
            Long l2 = this.EZpvd;
            if (l2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l2.longValue());
            }
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.KWHzl);
            parcel.writeInt(this.valueOf ? 1 : 0);
            Integer num = this.AYXKKw;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
        }

        public DAppInteractionWrapper(@NotNull String str, String str2, Long l, String str3, @NotNull String str4, Long l2, String str5, String str6, boolean z, Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.copydefault = str;
            this.AEQbTJ = str2;
            this.gEmmrt = l;
            this.djBIcL = str3;
            this.AhwBna = str4;
            this.EZpvd = l2;
            this.OLrzqt = str5;
            this.KWHzl = str6;
            this.valueOf = z;
            this.AYXKKw = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0059: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r13v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0020: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r16v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0038: ARITH (r21v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0040: ARITH (r21v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, boolean, java.lang.Integer):void (m)] (LINE:30) call: com.okinc.business.defi.wallet.common.okxconnect.model.DAppWrapper.DAppInteractionWrapper.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, boolean, java.lang.Integer):void type: THIS */
        public /* synthetic */ DAppInteractionWrapper(String str, String str2, Long l, String str3, String str4, Long l2, String str5, String str6, boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? false : z, (i & 512) == 0 ? num : null);
        }
    }
}
