package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C54536xML;
import o.C54589xNz;
import o.C56033xvF;
import o.InterfaceC54581xNr;
import o.xMV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class PotentialBorrowingData implements Parcelable {
    public static final int $stable = 0;
    private final String coinBorrowFrozenMargin;
    private final String coinLeverage;
    private final String coinRealBorrowAmt;
    private final String leverageBorrowLimit;
    private final String masterAccountLimit;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PotentialBorrowingData> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<PotentialBorrowingData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PotentialBorrowingData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PotentialBorrowingData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PotentialBorrowingData[] newArray(int i) {
            return new PotentialBorrowingData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PotentialBorrowingData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PotentialBorrowingData copy$default(PotentialBorrowingData potentialBorrowingData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = potentialBorrowingData.coinRealBorrowAmt;
        }
        if ((i & 2) != 0) {
            str2 = potentialBorrowingData.coinLeverage;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = potentialBorrowingData.coinBorrowFrozenMargin;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = potentialBorrowingData.leverageBorrowLimit;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = potentialBorrowingData.masterAccountLimit;
        }
        return potentialBorrowingData.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinRealBorrowAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coinLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.coinBorrowFrozenMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.leverageBorrowLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.masterAccountLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PotentialBorrowingData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new PotentialBorrowingData(str, str2, str3, str4, str5);
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
        if (!(obj instanceof PotentialBorrowingData)) {
            return false;
        }
        PotentialBorrowingData potentialBorrowingData = (PotentialBorrowingData) obj;
        return Intrinsics.EZpvd((Object) this.coinRealBorrowAmt, (Object) potentialBorrowingData.coinRealBorrowAmt) && Intrinsics.EZpvd((Object) this.coinLeverage, (Object) potentialBorrowingData.coinLeverage) && Intrinsics.EZpvd((Object) this.coinBorrowFrozenMargin, (Object) potentialBorrowingData.coinBorrowFrozenMargin) && Intrinsics.EZpvd((Object) this.leverageBorrowLimit, (Object) potentialBorrowingData.leverageBorrowLimit) && Intrinsics.EZpvd((Object) this.masterAccountLimit, (Object) potentialBorrowingData.masterAccountLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinBorrowFrozenMargin() {
        return this.coinBorrowFrozenMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinLeverage() {
        return this.coinLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinRealBorrowAmt() {
        return this.coinRealBorrowAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverageBorrowLimit() {
        return this.leverageBorrowLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterAccountLimit() {
        return this.masterAccountLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.coinRealBorrowAmt.hashCode() * 31) + this.coinLeverage.hashCode()) * 31) + this.coinBorrowFrozenMargin.hashCode()) * 31) + this.leverageBorrowLimit.hashCode()) * 31) + this.masterAccountLimit.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PotentialBorrowingData(coinRealBorrowAmt=" + this.coinRealBorrowAmt + ", coinLeverage=" + this.coinLeverage + ", coinBorrowFrozenMargin=" + this.coinBorrowFrozenMargin + ", leverageBorrowLimit=" + this.leverageBorrowLimit + ", masterAccountLimit=" + this.masterAccountLimit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coinRealBorrowAmt);
        parcel.writeString(this.coinLeverage);
        parcel.writeString(this.coinBorrowFrozenMargin);
        parcel.writeString(this.leverageBorrowLimit);
        parcel.writeString(this.masterAccountLimit);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.PotentialBorrowingData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PotentialBorrowingData> serializer() {
            return PotentialBorrowingData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PotentialBorrowingData(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinRealBorrowAmt = "";
        } else {
            this.coinRealBorrowAmt = str;
        }
        if ((i & 2) == 0) {
            this.coinLeverage = "";
        } else {
            this.coinLeverage = str2;
        }
        if ((i & 4) == 0) {
            this.coinBorrowFrozenMargin = "";
        } else {
            this.coinBorrowFrozenMargin = str3;
        }
        if ((i & 8) == 0) {
            this.leverageBorrowLimit = "";
        } else {
            this.leverageBorrowLimit = str4;
        }
        if ((i & 16) == 0) {
            this.masterAccountLimit = "";
        } else {
            this.masterAccountLimit = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(PotentialBorrowingData potentialBorrowingData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) potentialBorrowingData.coinRealBorrowAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, potentialBorrowingData.coinRealBorrowAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) potentialBorrowingData.coinLeverage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, potentialBorrowingData.coinLeverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) potentialBorrowingData.coinBorrowFrozenMargin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, potentialBorrowingData.coinBorrowFrozenMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) potentialBorrowingData.leverageBorrowLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, potentialBorrowingData.leverageBorrowLimit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) potentialBorrowingData.masterAccountLimit, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, potentialBorrowingData.masterAccountLimit);
    }

    public PotentialBorrowingData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.coinRealBorrowAmt = str;
        this.coinLeverage = str2;
        this.coinBorrowFrozenMargin = str3;
        this.leverageBorrowLimit = str4;
        this.masterAccountLimit = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:262) call: com.okinc.unify_trade.biz.subscribe.PotentialBorrowingData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PotentialBorrowingData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }

    private final String getPotentialDataFormat(String str, String str2) {
        String sizeDig;
        String safeString$default;
        xMV xmvAEQbTJ;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLEZpvd;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLFetchVPNInfo;
        TradeCoinInfo tradeCoinInfoAhwBna;
        if (str2 != null && !StringsKt__StringsKt.fARcdN((CharSequence) str2)) {
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(str)) == null || (sizeDig = tradeCoinInfoAhwBna.getSizeDig()) == null) {
                sizeDig = "4";
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            C54536xML c54536xMLDjBIcL = (interfaceC54581xNrOLrzqt2 == null || (xmvAEQbTJ = interfaceC54581xNrOLrzqt2.AEQbTJ(str)) == null || (c54536xMLCopydefault = xmvAEQbTJ.copydefault(str2)) == null || (c54536xMLEZpvd = c54536xMLCopydefault.EZpvd(sizeDig)) == null || (c54536xMLAEQbTJ = c54536xMLEZpvd.AEQbTJ(true)) == null || (c54536xMLFetchVPNInfo = c54536xMLAEQbTJ.fetchVPNInfo()) == null) ? null : c54536xMLFetchVPNInfo.djBIcL();
            if (c54536xMLDjBIcL != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
                return safeString$default;
            }
        }
        return "--";
    }

    public final String getCoinRealBorrowAmtWithCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getPotentialDataFormat(str, this.coinRealBorrowAmt);
    }

    public final String getCoinLeverageWithSymbol() {
        return C56033xvF.getBotLever$default(this.coinLeverage, false, 2, null);
    }

    public final String getCoinBorrowFrozenMarginWithCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getPotentialDataFormat(str, this.coinBorrowFrozenMargin);
    }

    public final String getLeverageBorrowLimitWithCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getPotentialDataFormat(str, this.leverageBorrowLimit);
    }

    public final String getMasterAccountLimitWithCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getPotentialDataFormat(str, this.masterAccountLimit);
    }
}
