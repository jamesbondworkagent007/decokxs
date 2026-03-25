package com.okinc.planet.biz_positions.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.InterfaceC46071tGt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface YieldDetails {

    public interface Activity extends YieldDetails {
    }

    /* JADX INFO: loaded from: classes16.dex */
    public interface TaskDescription {
    }

    String KWHzl();

    public static final class ContractCurrentYieldDetails implements Parcelable, Activity {
        public static final Parcelable.Creator<ContractCurrentYieldDetails> CREATOR = new Creator();
        public final BigDecimal AEQbTJ;
        public final BigDecimal AYXKKw;
        public final BigDecimal AhwBna;
        public final CurrentPosType EZpvd;
        public final BigDecimal KWHzl;
        public final String OLrzqt;
        public final BigDecimal copydefault;
        public final String djBIcL;
        public final BigDecimal valueOf;

        public static final class Creator implements Parcelable.Creator<ContractCurrentYieldDetails> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ContractCurrentYieldDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ContractCurrentYieldDetails((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), Ccy.CREATOR.createFromParcel(parcel).m6969unboximpl(), parcel.readString(), (BigDecimal) parcel.readSerializable(), CurrentPosType.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ContractCurrentYieldDetails[] newArray(int i) {
                return new ContractCurrentYieldDetails[i];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.math.BigDecimal)
  (r2v0 java.math.BigDecimal)
  (r3v0 java.math.BigDecimal)
  (r4v0 java.math.BigDecimal)
  (r5v0 java.lang.String)
  (r6v0 java.lang.String)
  (r7v0 java.math.BigDecimal)
  (r8v0 com.okinc.planet.biz_positions.data.CurrentPosType)
  (r9v0 java.math.BigDecimal)
 A[MD:(java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String, java.math.BigDecimal, com.okinc.planet.biz_positions.data.CurrentPosType, java.math.BigDecimal):void (m)] call: com.okinc.planet.biz_positions.data.YieldDetails.ContractCurrentYieldDetails.<init>(java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String, java.math.BigDecimal, com.okinc.planet.biz_positions.data.CurrentPosType, java.math.BigDecimal):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ContractCurrentYieldDetails(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str, String str2, BigDecimal bigDecimal5, CurrentPosType currentPosType, BigDecimal bigDecimal6, DefaultConstructorMarker defaultConstructorMarker) {
            this(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, str, str2, bigDecimal5, currentPosType, bigDecimal6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContractCurrentYieldDetails AEQbTJ(@NotNull BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @NotNull BigDecimal bigDecimal3, @NotNull BigDecimal bigDecimal4, @NotNull String str, @NotNull String str2, @NotNull BigDecimal bigDecimal5, @NotNull CurrentPosType currentPosType, BigDecimal bigDecimal6) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            Intrinsics.checkNotNullParameter(bigDecimal2, "");
            Intrinsics.checkNotNullParameter(bigDecimal3, "");
            Intrinsics.checkNotNullParameter(bigDecimal4, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(bigDecimal5, "");
            Intrinsics.checkNotNullParameter(currentPosType, "");
            return new ContractCurrentYieldDetails(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, str, str2, bigDecimal5, currentPosType, bigDecimal6, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigDecimal AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigDecimal EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet.biz_positions.data.YieldDetails
        public String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigDecimal OLrzqt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigDecimal copydefault() {
            return this.copydefault;
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
            if (!(obj instanceof ContractCurrentYieldDetails)) {
                return false;
            }
            ContractCurrentYieldDetails contractCurrentYieldDetails = (ContractCurrentYieldDetails) obj;
            return Intrinsics.EZpvd(this.KWHzl, contractCurrentYieldDetails.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, contractCurrentYieldDetails.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, contractCurrentYieldDetails.copydefault) && Intrinsics.EZpvd(this.AYXKKw, contractCurrentYieldDetails.AYXKKw) && Ccy.m6965equalsimpl0(this.OLrzqt, contractCurrentYieldDetails.OLrzqt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) contractCurrentYieldDetails.djBIcL) && Intrinsics.EZpvd(this.valueOf, contractCurrentYieldDetails.valueOf) && this.EZpvd == contractCurrentYieldDetails.EZpvd && Intrinsics.EZpvd(this.AhwBna, contractCurrentYieldDetails.AhwBna);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigDecimal gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.AEQbTJ.hashCode();
            int iHashCode3 = this.copydefault.hashCode();
            int iHashCode4 = this.AYXKKw.hashCode();
            int iM6966hashCodeimpl = Ccy.m6966hashCodeimpl(this.OLrzqt);
            int iHashCode5 = this.djBIcL.hashCode();
            int iHashCode6 = this.valueOf.hashCode();
            int iHashCode7 = this.EZpvd.hashCode();
            BigDecimal bigDecimal = this.AhwBna;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iM6966hashCodeimpl) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ContractCurrentYieldDetails(fee=" + this.KWHzl + ", closePnl=" + this.AEQbTJ + ", fundingFee=" + this.copydefault + ", liquidationFee=" + this.AYXKKw + ", ccy=" + Ccy.m6967toStringimpl(this.OLrzqt) + ", tradeItemId=" + this.djBIcL + ", pnl=" + this.valueOf + ", currentPosType=" + this.EZpvd + ", realizedPnl=" + this.AhwBna + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeSerializable(this.KWHzl);
            parcel.writeSerializable(this.AEQbTJ);
            parcel.writeSerializable(this.copydefault);
            parcel.writeSerializable(this.AYXKKw);
            Ccy.m6968writeToParcelimpl(this.OLrzqt, parcel, i);
            parcel.writeString(this.djBIcL);
            parcel.writeSerializable(this.valueOf);
            parcel.writeString(this.EZpvd.name());
            parcel.writeSerializable(this.AhwBna);
        }

        public ContractCurrentYieldDetails(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str, String str2, BigDecimal bigDecimal5, CurrentPosType currentPosType, BigDecimal bigDecimal6) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            Intrinsics.checkNotNullParameter(bigDecimal2, "");
            Intrinsics.checkNotNullParameter(bigDecimal3, "");
            Intrinsics.checkNotNullParameter(bigDecimal4, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(bigDecimal5, "");
            Intrinsics.checkNotNullParameter(currentPosType, "");
            this.KWHzl = bigDecimal;
            this.AEQbTJ = bigDecimal2;
            this.copydefault = bigDecimal3;
            this.AYXKKw = bigDecimal4;
            this.OLrzqt = str;
            this.djBIcL = str2;
            this.valueOf = bigDecimal5;
            this.EZpvd = currentPosType;
            this.AhwBna = bigDecimal6;
        }

        public BigDecimal AYXKKw() {
            BigDecimal bigDecimal = this.AhwBna;
            if (bigDecimal != null) {
                return bigDecimal;
            }
            BigDecimal bigDecimalAdd = AEQbTJ().add(EZpvd());
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "");
            BigDecimal bigDecimalAdd2 = bigDecimalAdd.add(copydefault());
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "");
            BigDecimal bigDecimalAdd3 = bigDecimalAdd2.add(OLrzqt());
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd3, "");
            return bigDecimalAdd3;
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class ContractHistoryYieldDetails implements Parcelable, Activity, TaskDescription {
        public static final Parcelable.Creator<ContractHistoryYieldDetails> CREATOR = new Creator();
        public final BigDecimal AEQbTJ;
        public final BigDecimal EZpvd;
        public final String KWHzl;
        public final HistoryPosType OLrzqt;
        public final BigDecimal copydefault;
        public final BigDecimal djBIcL;
        public final BigDecimal valueOf;

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Creator implements Parcelable.Creator<ContractHistoryYieldDetails> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ContractHistoryYieldDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ContractHistoryYieldDetails((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), Ccy.CREATOR.createFromParcel(parcel).m6969unboximpl(), HistoryPosType.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ContractHistoryYieldDetails[] newArray(int i) {
                return new ContractHistoryYieldDetails[i];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.math.BigDecimal)
  (r2v0 java.math.BigDecimal)
  (r3v0 java.math.BigDecimal)
  (r4v0 java.math.BigDecimal)
  (r5v0 java.lang.String)
  (r6v0 com.okinc.planet.biz_positions.data.HistoryPosType)
  (r7v0 java.math.BigDecimal)
 A[MD:(java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, com.okinc.planet.biz_positions.data.HistoryPosType, java.math.BigDecimal):void (m)] call: com.okinc.planet.biz_positions.data.YieldDetails.ContractHistoryYieldDetails.<init>(java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, com.okinc.planet.biz_positions.data.HistoryPosType, java.math.BigDecimal):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ContractHistoryYieldDetails(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str, HistoryPosType historyPosType, BigDecimal bigDecimal5, DefaultConstructorMarker defaultConstructorMarker) {
            this(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, str, historyPosType, bigDecimal5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-dZB6_28$default, reason: not valid java name */
        public static /* synthetic */ ContractHistoryYieldDetails m7040copydZB6_28$default(ContractHistoryYieldDetails contractHistoryYieldDetails, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str, HistoryPosType historyPosType, BigDecimal bigDecimal5, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = contractHistoryYieldDetails.AEQbTJ;
            }
            if ((i & 2) != 0) {
                bigDecimal2 = contractHistoryYieldDetails.EZpvd;
            }
            BigDecimal bigDecimal6 = bigDecimal2;
            if ((i & 4) != 0) {
                bigDecimal3 = contractHistoryYieldDetails.copydefault;
            }
            BigDecimal bigDecimal7 = bigDecimal3;
            if ((i & 8) != 0) {
                bigDecimal4 = contractHistoryYieldDetails.djBIcL;
            }
            BigDecimal bigDecimal8 = bigDecimal4;
            if ((i & 16) != 0) {
                str = contractHistoryYieldDetails.KWHzl;
            }
            String str2 = str;
            if ((i & 32) != 0) {
                historyPosType = contractHistoryYieldDetails.OLrzqt;
            }
            HistoryPosType historyPosType2 = historyPosType;
            if ((i & 64) != 0) {
                bigDecimal5 = contractHistoryYieldDetails.valueOf;
            }
            return contractHistoryYieldDetails.KWHzl(bigDecimal, bigDecimal6, bigDecimal7, bigDecimal8, str2, historyPosType2, bigDecimal5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigDecimal AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigDecimal EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContractHistoryYieldDetails KWHzl(@NotNull BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @NotNull BigDecimal bigDecimal3, @NotNull BigDecimal bigDecimal4, @NotNull String str, @NotNull HistoryPosType historyPosType, BigDecimal bigDecimal5) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            Intrinsics.checkNotNullParameter(bigDecimal2, "");
            Intrinsics.checkNotNullParameter(bigDecimal3, "");
            Intrinsics.checkNotNullParameter(bigDecimal4, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(historyPosType, "");
            return new ContractHistoryYieldDetails(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, str, historyPosType, bigDecimal5, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet.biz_positions.data.YieldDetails
        public String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigDecimal copydefault() {
            return this.copydefault;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigDecimal djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContractHistoryYieldDetails)) {
                return false;
            }
            ContractHistoryYieldDetails contractHistoryYieldDetails = (ContractHistoryYieldDetails) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, contractHistoryYieldDetails.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, contractHistoryYieldDetails.EZpvd) && Intrinsics.EZpvd(this.copydefault, contractHistoryYieldDetails.copydefault) && Intrinsics.EZpvd(this.djBIcL, contractHistoryYieldDetails.djBIcL) && Ccy.m6965equalsimpl0(this.KWHzl, contractHistoryYieldDetails.KWHzl) && this.OLrzqt == contractHistoryYieldDetails.OLrzqt && Intrinsics.EZpvd(this.valueOf, contractHistoryYieldDetails.valueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            int iHashCode2 = this.EZpvd.hashCode();
            int iHashCode3 = this.copydefault.hashCode();
            int iHashCode4 = this.djBIcL.hashCode();
            int iM6966hashCodeimpl = Ccy.m6966hashCodeimpl(this.KWHzl);
            int iHashCode5 = this.OLrzqt.hashCode();
            BigDecimal bigDecimal = this.valueOf;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iM6966hashCodeimpl) * 31) + iHashCode5) * 31) + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ContractHistoryYieldDetails(fee=" + this.AEQbTJ + ", closePnl=" + this.EZpvd + ", fundingFee=" + this.copydefault + ", liquidationFee=" + this.djBIcL + ", ccy=" + Ccy.m6967toStringimpl(this.KWHzl) + ", historyPosType=" + this.OLrzqt + ", realizedPnl=" + this.valueOf + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeSerializable(this.AEQbTJ);
            parcel.writeSerializable(this.EZpvd);
            parcel.writeSerializable(this.copydefault);
            parcel.writeSerializable(this.djBIcL);
            Ccy.m6968writeToParcelimpl(this.KWHzl, parcel, i);
            parcel.writeString(this.OLrzqt.name());
            parcel.writeSerializable(this.valueOf);
        }

        public ContractHistoryYieldDetails(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str, HistoryPosType historyPosType, BigDecimal bigDecimal5) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            Intrinsics.checkNotNullParameter(bigDecimal2, "");
            Intrinsics.checkNotNullParameter(bigDecimal3, "");
            Intrinsics.checkNotNullParameter(bigDecimal4, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(historyPosType, "");
            this.AEQbTJ = bigDecimal;
            this.EZpvd = bigDecimal2;
            this.copydefault = bigDecimal3;
            this.djBIcL = bigDecimal4;
            this.KWHzl = str;
            this.OLrzqt = historyPosType;
            this.valueOf = bigDecimal5;
        }

        public BigDecimal AYXKKw() {
            BigDecimal bigDecimal = this.valueOf;
            if (bigDecimal != null) {
                return bigDecimal;
            }
            BigDecimal bigDecimalAdd = AEQbTJ().add(EZpvd());
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "");
            BigDecimal bigDecimalAdd2 = bigDecimalAdd.add(copydefault());
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "");
            BigDecimal bigDecimalAdd3 = bigDecimalAdd2.add(djBIcL());
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd3, "");
            return bigDecimalAdd3;
        }

        public final boolean OLrzqt() {
            return C33129mqd.AhwBna(djBIcL(), "0");
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class SpotCurrentYieldDetails implements Parcelable, InterfaceC46071tGt {
        public static final Parcelable.Creator<SpotCurrentYieldDetails> CREATOR = new Creator();
        public final BigDecimal AEQbTJ;
        public final String AYXKKw;
        public final BigDecimal EZpvd;
        public final String KWHzl;
        public final CurrentPosType OLrzqt;
        public final BigDecimal copydefault;

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<SpotCurrentYieldDetails> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpotCurrentYieldDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SpotCurrentYieldDetails((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), Ccy.CREATOR.createFromParcel(parcel).m6969unboximpl(), parcel.readString(), (BigDecimal) parcel.readSerializable(), CurrentPosType.valueOf(parcel.readString()), null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpotCurrentYieldDetails[] newArray(int i) {
                return new SpotCurrentYieldDetails[i];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.math.BigDecimal)
  (r2v0 java.math.BigDecimal)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.math.BigDecimal)
  (r6v0 com.okinc.planet.biz_positions.data.CurrentPosType)
 A[MD:(java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String, java.math.BigDecimal, com.okinc.planet.biz_positions.data.CurrentPosType):void (m)] call: com.okinc.planet.biz_positions.data.YieldDetails.SpotCurrentYieldDetails.<init>(java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String, java.math.BigDecimal, com.okinc.planet.biz_positions.data.CurrentPosType):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ SpotCurrentYieldDetails(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, BigDecimal bigDecimal3, CurrentPosType currentPosType, DefaultConstructorMarker defaultConstructorMarker) {
            this(bigDecimal, bigDecimal2, str, str2, bigDecimal3, currentPosType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-de3sMyI$default, reason: not valid java name */
        public static /* synthetic */ SpotCurrentYieldDetails m7041copyde3sMyI$default(SpotCurrentYieldDetails spotCurrentYieldDetails, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, BigDecimal bigDecimal3, CurrentPosType currentPosType, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = spotCurrentYieldDetails.AEQbTJ;
            }
            if ((i & 2) != 0) {
                bigDecimal2 = spotCurrentYieldDetails.EZpvd;
            }
            BigDecimal bigDecimal4 = bigDecimal2;
            if ((i & 4) != 0) {
                str = spotCurrentYieldDetails.KWHzl;
            }
            String str3 = str;
            if ((i & 8) != 0) {
                str2 = spotCurrentYieldDetails.AYXKKw;
            }
            String str4 = str2;
            if ((i & 16) != 0) {
                bigDecimal3 = spotCurrentYieldDetails.copydefault;
            }
            BigDecimal bigDecimal5 = bigDecimal3;
            if ((i & 32) != 0) {
                currentPosType = spotCurrentYieldDetails.OLrzqt;
            }
            return spotCurrentYieldDetails.EZpvd(bigDecimal, bigDecimal4, str3, str4, bigDecimal5, currentPosType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SpotCurrentYieldDetails EZpvd(@NotNull BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @NotNull String str, @NotNull String str2, @NotNull BigDecimal bigDecimal3, @NotNull CurrentPosType currentPosType) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            Intrinsics.checkNotNullParameter(bigDecimal2, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(bigDecimal3, "");
            Intrinsics.checkNotNullParameter(currentPosType, "");
            return new SpotCurrentYieldDetails(bigDecimal, bigDecimal2, str, str2, bigDecimal3, currentPosType, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet.biz_positions.data.YieldDetails
        public String KWHzl() {
            return this.KWHzl;
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
            if (!(obj instanceof SpotCurrentYieldDetails)) {
                return false;
            }
            SpotCurrentYieldDetails spotCurrentYieldDetails = (SpotCurrentYieldDetails) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, spotCurrentYieldDetails.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, spotCurrentYieldDetails.EZpvd) && Ccy.m6965equalsimpl0(this.KWHzl, spotCurrentYieldDetails.KWHzl) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) spotCurrentYieldDetails.AYXKKw) && Intrinsics.EZpvd(this.copydefault, spotCurrentYieldDetails.copydefault) && this.OLrzqt == spotCurrentYieldDetails.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + Ccy.m6966hashCodeimpl(this.KWHzl)) * 31) + this.AYXKKw.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SpotCurrentYieldDetails(fee=" + this.AEQbTJ + ", closePnl=" + this.EZpvd + ", ccy=" + Ccy.m6967toStringimpl(this.KWHzl) + ", tradeItemId=" + this.AYXKKw + ", pnl=" + this.copydefault + ", currentPosType=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeSerializable(this.AEQbTJ);
            parcel.writeSerializable(this.EZpvd);
            Ccy.m6968writeToParcelimpl(this.KWHzl, parcel, i);
            parcel.writeString(this.AYXKKw);
            parcel.writeSerializable(this.copydefault);
            parcel.writeString(this.OLrzqt.name());
        }

        public SpotCurrentYieldDetails(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, BigDecimal bigDecimal3, CurrentPosType currentPosType) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            Intrinsics.checkNotNullParameter(bigDecimal2, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(bigDecimal3, "");
            Intrinsics.checkNotNullParameter(currentPosType, "");
            this.AEQbTJ = bigDecimal;
            this.EZpvd = bigDecimal2;
            this.KWHzl = str;
            this.AYXKKw = str2;
            this.copydefault = bigDecimal3;
            this.OLrzqt = currentPosType;
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class SpotHistoryYieldDetails implements Parcelable, InterfaceC46071tGt, TaskDescription {
        public static final Parcelable.Creator<SpotHistoryYieldDetails> CREATOR = new Creator();
        public final HistoryPosType AEQbTJ;
        public final BigDecimal KWHzl;
        public final BigDecimal OLrzqt;
        public final String copydefault;

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<SpotHistoryYieldDetails> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpotHistoryYieldDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SpotHistoryYieldDetails((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), Ccy.CREATOR.createFromParcel(parcel).m6969unboximpl(), HistoryPosType.valueOf(parcel.readString()), null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpotHistoryYieldDetails[] newArray(int i) {
                return new SpotHistoryYieldDetails[i];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.math.BigDecimal)
  (r2v0 java.math.BigDecimal)
  (r3v0 java.lang.String)
  (r4v0 com.okinc.planet.biz_positions.data.HistoryPosType)
 A[MD:(java.math.BigDecimal, java.math.BigDecimal, java.lang.String, com.okinc.planet.biz_positions.data.HistoryPosType):void (m)] call: com.okinc.planet.biz_positions.data.YieldDetails.SpotHistoryYieldDetails.<init>(java.math.BigDecimal, java.math.BigDecimal, java.lang.String, com.okinc.planet.biz_positions.data.HistoryPosType):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ SpotHistoryYieldDetails(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, HistoryPosType historyPosType, DefaultConstructorMarker defaultConstructorMarker) {
            this(bigDecimal, bigDecimal2, str, historyPosType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-luk3dts$default, reason: not valid java name */
        public static /* synthetic */ SpotHistoryYieldDetails m7042copyluk3dts$default(SpotHistoryYieldDetails spotHistoryYieldDetails, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, HistoryPosType historyPosType, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = spotHistoryYieldDetails.OLrzqt;
            }
            if ((i & 2) != 0) {
                bigDecimal2 = spotHistoryYieldDetails.KWHzl;
            }
            if ((i & 4) != 0) {
                str = spotHistoryYieldDetails.copydefault;
            }
            if ((i & 8) != 0) {
                historyPosType = spotHistoryYieldDetails.AEQbTJ;
            }
            return spotHistoryYieldDetails.AEQbTJ(bigDecimal, bigDecimal2, str, historyPosType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SpotHistoryYieldDetails AEQbTJ(@NotNull BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @NotNull String str, @NotNull HistoryPosType historyPosType) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            Intrinsics.checkNotNullParameter(bigDecimal2, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(historyPosType, "");
            return new SpotHistoryYieldDetails(bigDecimal, bigDecimal2, str, historyPosType, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet.biz_positions.data.YieldDetails
        public String KWHzl() {
            return this.copydefault;
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
            if (!(obj instanceof SpotHistoryYieldDetails)) {
                return false;
            }
            SpotHistoryYieldDetails spotHistoryYieldDetails = (SpotHistoryYieldDetails) obj;
            return Intrinsics.EZpvd(this.OLrzqt, spotHistoryYieldDetails.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, spotHistoryYieldDetails.KWHzl) && Ccy.m6965equalsimpl0(this.copydefault, spotHistoryYieldDetails.copydefault) && this.AEQbTJ == spotHistoryYieldDetails.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + Ccy.m6966hashCodeimpl(this.copydefault)) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SpotHistoryYieldDetails(fee=" + this.OLrzqt + ", closePnl=" + this.KWHzl + ", ccy=" + Ccy.m6967toStringimpl(this.copydefault) + ", historyPosType=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeSerializable(this.OLrzqt);
            parcel.writeSerializable(this.KWHzl);
            Ccy.m6968writeToParcelimpl(this.copydefault, parcel, i);
            parcel.writeString(this.AEQbTJ.name());
        }

        public SpotHistoryYieldDetails(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, HistoryPosType historyPosType) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            Intrinsics.checkNotNullParameter(bigDecimal2, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(historyPosType, "");
            this.OLrzqt = bigDecimal;
            this.KWHzl = bigDecimal2;
            this.copydefault = str;
            this.AEQbTJ = historyPosType;
        }
    }
}
