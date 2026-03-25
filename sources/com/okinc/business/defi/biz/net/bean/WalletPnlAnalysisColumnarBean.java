package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletPnlAnalysisColumnarBean implements Comparable<WalletPnlAnalysisColumnarBean>, Parcelable {
    private String profit;
    private final String timestamp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletPnlAnalysisColumnarBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WalletPnlAnalysisColumnarBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletPnlAnalysisColumnarBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletPnlAnalysisColumnarBean(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletPnlAnalysisColumnarBean[] newArray(int i) {
            return new WalletPnlAnalysisColumnarBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletPnlAnalysisColumnarBean() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletPnlAnalysisColumnarBean copy$default(WalletPnlAnalysisColumnarBean walletPnlAnalysisColumnarBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletPnlAnalysisColumnarBean.timestamp;
        }
        if ((i & 2) != 0) {
            str2 = walletPnlAnalysisColumnarBean.profit;
        }
        return walletPnlAnalysisColumnarBean.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletPnlAnalysisColumnarBean copy(String str, String str2) {
        return new WalletPnlAnalysisColumnarBean(str, str2);
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
        if (!(obj instanceof WalletPnlAnalysisColumnarBean)) {
            return false;
        }
        WalletPnlAnalysisColumnarBean walletPnlAnalysisColumnarBean = (WalletPnlAnalysisColumnarBean) obj;
        return Intrinsics.EZpvd((Object) this.timestamp, (Object) walletPnlAnalysisColumnarBean.timestamp) && Intrinsics.EZpvd((Object) this.profit, (Object) walletPnlAnalysisColumnarBean.profit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfit() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.timestamp;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.profit;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfit(String str) {
        this.profit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletPnlAnalysisColumnarBean(timestamp=" + this.timestamp + ", profit=" + this.profit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.timestamp);
        parcel.writeString(this.profit);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisColumnarBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletPnlAnalysisColumnarBean> serializer() {
            return WalletPnlAnalysisColumnarBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletPnlAnalysisColumnarBean(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = str;
        }
        if ((i & 2) == 0) {
            this.profit = null;
        } else {
            this.profit = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletPnlAnalysisColumnarBean walletPnlAnalysisColumnarBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || walletPnlAnalysisColumnarBean.timestamp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, walletPnlAnalysisColumnarBean.timestamp);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && walletPnlAnalysisColumnarBean.profit == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, walletPnlAnalysisColumnarBean.profit);
    }

    public WalletPnlAnalysisColumnarBean(String str, String str2) {
        this.timestamp = str;
        this.profit = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:79) call: com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisColumnarBean.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WalletPnlAnalysisColumnarBean(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(@NotNull WalletPnlAnalysisColumnarBean walletPnlAnalysisColumnarBean) {
        Intrinsics.checkNotNullParameter(walletPnlAnalysisColumnarBean, "");
        if (C33129mqd.OLrzqt(this.profit, walletPnlAnalysisColumnarBean.profit)) {
            return 0;
        }
        return C33129mqd.AEQbTJ(this.profit, walletPnlAnalysisColumnarBean.profit) ? -1 : 1;
    }
}
