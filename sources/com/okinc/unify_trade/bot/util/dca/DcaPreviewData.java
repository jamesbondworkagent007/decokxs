package com.okinc.unify_trade.bot.util.dca;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class DcaPreviewData implements Parcelable {
    public static final BigDecimal OLrzqt;
    public final BigDecimal AEQbTJ;
    public final String AYXKKw;
    public final BigDecimal AhwBna;
    public final BigDecimal KWHzl;
    public final BigDecimal copydefault;
    public final BigDecimal djBIcL;
    public final BigDecimal gEmmrt;
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public static final Parcelable.Creator<DcaPreviewData> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<DcaPreviewData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcaPreviewData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DcaPreviewData(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcaPreviewData[] newArray(int i) {
            return new DcaPreviewData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DcaPreviewData copy$default(DcaPreviewData dcaPreviewData, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dcaPreviewData.AYXKKw;
        }
        if ((i & 2) != 0) {
            bigDecimal = dcaPreviewData.djBIcL;
        }
        BigDecimal bigDecimal7 = bigDecimal;
        if ((i & 4) != 0) {
            bigDecimal2 = dcaPreviewData.AEQbTJ;
        }
        BigDecimal bigDecimal8 = bigDecimal2;
        if ((i & 8) != 0) {
            bigDecimal3 = dcaPreviewData.KWHzl;
        }
        BigDecimal bigDecimal9 = bigDecimal3;
        if ((i & 16) != 0) {
            bigDecimal4 = dcaPreviewData.gEmmrt;
        }
        BigDecimal bigDecimal10 = bigDecimal4;
        if ((i & 32) != 0) {
            bigDecimal5 = dcaPreviewData.copydefault;
        }
        BigDecimal bigDecimal11 = bigDecimal5;
        if ((i & 64) != 0) {
            bigDecimal6 = dcaPreviewData.AhwBna;
        }
        return dcaPreviewData.EZpvd(str, bigDecimal7, bigDecimal8, bigDecimal9, bigDecimal10, bigDecimal11, bigDecimal6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaPreviewData EZpvd(@NotNull String str, @NotNull BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @NotNull BigDecimal bigDecimal3, @NotNull BigDecimal bigDecimal4, @NotNull BigDecimal bigDecimal5, @NotNull BigDecimal bigDecimal6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(bigDecimal2, "");
        Intrinsics.checkNotNullParameter(bigDecimal3, "");
        Intrinsics.checkNotNullParameter(bigDecimal4, "");
        Intrinsics.checkNotNullParameter(bigDecimal5, "");
        Intrinsics.checkNotNullParameter(bigDecimal6, "");
        return new DcaPreviewData(str, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal copydefault() {
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
        if (!(obj instanceof DcaPreviewData)) {
            return false;
        }
        DcaPreviewData dcaPreviewData = (DcaPreviewData) obj;
        return Intrinsics.EZpvd((Object) this.AYXKKw, (Object) dcaPreviewData.AYXKKw) && Intrinsics.EZpvd(this.djBIcL, dcaPreviewData.djBIcL) && Intrinsics.EZpvd(this.AEQbTJ, dcaPreviewData.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, dcaPreviewData.KWHzl) && Intrinsics.EZpvd(this.gEmmrt, dcaPreviewData.gEmmrt) && Intrinsics.EZpvd(this.copydefault, dcaPreviewData.copydefault) && Intrinsics.EZpvd(this.AhwBna, dcaPreviewData.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.AYXKKw.hashCode() * 31) + this.djBIcL.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AhwBna.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DcaPreviewData(type=" + this.AYXKKw + ", tradeAmount=" + this.djBIcL + ", orderPrice=" + this.AEQbTJ + ", orderAmount=" + this.KWHzl + ", priceDeviation=" + this.gEmmrt + ", avgCost=" + this.copydefault + ", tpPrice=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AYXKKw);
        parcel.writeSerializable(this.djBIcL);
        parcel.writeSerializable(this.AEQbTJ);
        parcel.writeSerializable(this.KWHzl);
        parcel.writeSerializable(this.gEmmrt);
        parcel.writeSerializable(this.copydefault);
        parcel.writeSerializable(this.AhwBna);
    }

    public DcaPreviewData(@NotNull String str, @NotNull BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @NotNull BigDecimal bigDecimal3, @NotNull BigDecimal bigDecimal4, @NotNull BigDecimal bigDecimal5, @NotNull BigDecimal bigDecimal6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(bigDecimal2, "");
        Intrinsics.checkNotNullParameter(bigDecimal3, "");
        Intrinsics.checkNotNullParameter(bigDecimal4, "");
        Intrinsics.checkNotNullParameter(bigDecimal5, "");
        Intrinsics.checkNotNullParameter(bigDecimal6, "");
        this.AYXKKw = str;
        this.djBIcL = bigDecimal;
        this.AEQbTJ = bigDecimal2;
        this.KWHzl = bigDecimal3;
        this.gEmmrt = bigDecimal4;
        this.copydefault = bigDecimal5;
        this.AhwBna = bigDecimal6;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.util.dca.DcaPreviewData.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final BigDecimal OLrzqt() {
            return DcaPreviewData.OLrzqt;
        }
    }

    static {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        OLrzqt = bigDecimal;
    }
}
