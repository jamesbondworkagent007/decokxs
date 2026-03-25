package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletPnlAnalysisResponse implements Parcelable {
    private final List<WalletPnlAnalysisColumnarBean> datePnlList;
    private final String totalPnl;
    private final String totalPnlRoi;
    private final String totalTxsBuy;
    private final String totalTxsSell;
    private final String totalVolumeBuy;
    private final String totalVolumeSell;
    private final String totalWinRate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletPnlAnalysisResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(WalletPnlAnalysisColumnarBean$$serializer.INSTANCE), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<WalletPnlAnalysisResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletPnlAnalysisResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(WalletPnlAnalysisColumnarBean.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new WalletPnlAnalysisResponse(string, string2, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletPnlAnalysisResponse[] newArray(int i) {
            return new WalletPnlAnalysisResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletPnlAnalysisResponse() {
        this((String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalPnlRoi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WalletPnlAnalysisColumnarBean> component3() {
        return this.datePnlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalWinRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.totalTxsBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.totalTxsSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.totalVolumeBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.totalVolumeSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletPnlAnalysisResponse copy(String str, String str2, List<WalletPnlAnalysisColumnarBean> list, String str3, String str4, String str5, String str6, String str7) {
        return new WalletPnlAnalysisResponse(str, str2, list, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof WalletPnlAnalysisResponse)) {
            return false;
        }
        WalletPnlAnalysisResponse walletPnlAnalysisResponse = (WalletPnlAnalysisResponse) obj;
        return Intrinsics.EZpvd((Object) this.totalPnl, (Object) walletPnlAnalysisResponse.totalPnl) && Intrinsics.EZpvd((Object) this.totalPnlRoi, (Object) walletPnlAnalysisResponse.totalPnlRoi) && Intrinsics.EZpvd(this.datePnlList, walletPnlAnalysisResponse.datePnlList) && Intrinsics.EZpvd((Object) this.totalWinRate, (Object) walletPnlAnalysisResponse.totalWinRate) && Intrinsics.EZpvd((Object) this.totalTxsBuy, (Object) walletPnlAnalysisResponse.totalTxsBuy) && Intrinsics.EZpvd((Object) this.totalTxsSell, (Object) walletPnlAnalysisResponse.totalTxsSell) && Intrinsics.EZpvd((Object) this.totalVolumeBuy, (Object) walletPnlAnalysisResponse.totalVolumeBuy) && Intrinsics.EZpvd((Object) this.totalVolumeSell, (Object) walletPnlAnalysisResponse.totalVolumeSell);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WalletPnlAnalysisColumnarBean> getDatePnlList() {
        return this.datePnlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnlRoi() {
        return this.totalPnlRoi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalTxsBuy() {
        return this.totalTxsBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalTxsSell() {
        return this.totalTxsSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalVolumeBuy() {
        return this.totalVolumeBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalVolumeSell() {
        return this.totalVolumeSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalWinRate() {
        return this.totalWinRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.totalPnl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.totalPnlRoi;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<WalletPnlAnalysisColumnarBean> list = this.datePnlList;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str3 = this.totalWinRate;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.totalTxsBuy;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.totalTxsSell;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.totalVolumeBuy;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.totalVolumeSell;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletPnlAnalysisResponse(totalPnl=" + this.totalPnl + ", totalPnlRoi=" + this.totalPnlRoi + ", datePnlList=" + this.datePnlList + ", totalWinRate=" + this.totalWinRate + ", totalTxsBuy=" + this.totalTxsBuy + ", totalTxsSell=" + this.totalTxsSell + ", totalVolumeBuy=" + this.totalVolumeBuy + ", totalVolumeSell=" + this.totalVolumeSell + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalPnl);
        parcel.writeString(this.totalPnlRoi);
        List<WalletPnlAnalysisColumnarBean> list = this.datePnlList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<WalletPnlAnalysisColumnarBean> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.totalWinRate);
        parcel.writeString(this.totalTxsBuy);
        parcel.writeString(this.totalTxsSell);
        parcel.writeString(this.totalVolumeBuy);
        parcel.writeString(this.totalVolumeSell);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletPnlAnalysisResponse> serializer() {
            return WalletPnlAnalysisResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletPnlAnalysisResponse(int i, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalPnl = null;
        } else {
            this.totalPnl = str;
        }
        if ((i & 2) == 0) {
            this.totalPnlRoi = null;
        } else {
            this.totalPnlRoi = str2;
        }
        if ((i & 4) == 0) {
            this.datePnlList = null;
        } else {
            this.datePnlList = list;
        }
        if ((i & 8) == 0) {
            this.totalWinRate = null;
        } else {
            this.totalWinRate = str3;
        }
        if ((i & 16) == 0) {
            this.totalTxsBuy = null;
        } else {
            this.totalTxsBuy = str4;
        }
        if ((i & 32) == 0) {
            this.totalTxsSell = null;
        } else {
            this.totalTxsSell = str5;
        }
        if ((i & 64) == 0) {
            this.totalVolumeBuy = null;
        } else {
            this.totalVolumeBuy = str6;
        }
        if ((i & 128) == 0) {
            this.totalVolumeSell = null;
        } else {
            this.totalVolumeSell = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletPnlAnalysisResponse walletPnlAnalysisResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || walletPnlAnalysisResponse.totalPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, walletPnlAnalysisResponse.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || walletPnlAnalysisResponse.totalPnlRoi != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, walletPnlAnalysisResponse.totalPnlRoi);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || walletPnlAnalysisResponse.datePnlList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], walletPnlAnalysisResponse.datePnlList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || walletPnlAnalysisResponse.totalWinRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, walletPnlAnalysisResponse.totalWinRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || walletPnlAnalysisResponse.totalTxsBuy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, walletPnlAnalysisResponse.totalTxsBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || walletPnlAnalysisResponse.totalTxsSell != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, walletPnlAnalysisResponse.totalTxsSell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || walletPnlAnalysisResponse.totalVolumeBuy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, walletPnlAnalysisResponse.totalVolumeBuy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && walletPnlAnalysisResponse.totalVolumeSell == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, walletPnlAnalysisResponse.totalVolumeSell);
    }

    public WalletPnlAnalysisResponse(String str, String str2, List<WalletPnlAnalysisColumnarBean> list, String str3, String str4, String str5, String str6, String str7) {
        this.totalPnl = str;
        this.totalPnlRoi = str2;
        this.datePnlList = list;
        this.totalWinRate = str3;
        this.totalTxsBuy = str4;
        this.totalTxsSell = str5;
        this.totalVolumeBuy = str6;
        this.totalVolumeSell = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisColumnarBean>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:65) call: com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisResponse.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WalletPnlAnalysisResponse(String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) == 0 ? str7 : null);
    }
}
