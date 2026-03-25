package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class JitoData implements Parcelable {
    public static final int $stable = 0;
    private final String jitoMarketFee;
    private final String jitoMarketFeeUsd;
    private final String jitoTotalFee;
    private final String jitoUnsignedTx;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<JitoData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<JitoData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JitoData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new JitoData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JitoData[] newArray(int i) {
            return new JitoData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JitoData() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ JitoData copy$default(JitoData jitoData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jitoData.jitoMarketFee;
        }
        if ((i & 2) != 0) {
            str2 = jitoData.jitoMarketFeeUsd;
        }
        if ((i & 4) != 0) {
            str3 = jitoData.jitoUnsignedTx;
        }
        if ((i & 8) != 0) {
            str4 = jitoData.jitoTotalFee;
        }
        return jitoData.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.jitoMarketFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.jitoMarketFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.jitoUnsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.jitoTotalFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JitoData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new JitoData(str, str2, str3, str4);
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
        if (!(obj instanceof JitoData)) {
            return false;
        }
        JitoData jitoData = (JitoData) obj;
        return Intrinsics.EZpvd((Object) this.jitoMarketFee, (Object) jitoData.jitoMarketFee) && Intrinsics.EZpvd((Object) this.jitoMarketFeeUsd, (Object) jitoData.jitoMarketFeeUsd) && Intrinsics.EZpvd((Object) this.jitoUnsignedTx, (Object) jitoData.jitoUnsignedTx) && Intrinsics.EZpvd((Object) this.jitoTotalFee, (Object) jitoData.jitoTotalFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJitoMarketFee() {
        return this.jitoMarketFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJitoMarketFeeUsd() {
        return this.jitoMarketFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJitoTotalFee() {
        return this.jitoTotalFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJitoUnsignedTx() {
        return this.jitoUnsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.jitoMarketFee.hashCode() * 31) + this.jitoMarketFeeUsd.hashCode()) * 31) + this.jitoUnsignedTx.hashCode()) * 31) + this.jitoTotalFee.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "JitoData(jitoMarketFee=" + this.jitoMarketFee + ", jitoMarketFeeUsd=" + this.jitoMarketFeeUsd + ", jitoUnsignedTx=" + this.jitoUnsignedTx + ", jitoTotalFee=" + this.jitoTotalFee + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.jitoMarketFee);
        parcel.writeString(this.jitoMarketFeeUsd);
        parcel.writeString(this.jitoUnsignedTx);
        parcel.writeString(this.jitoTotalFee);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.JitoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<JitoData> serializer() {
            return JitoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ JitoData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.jitoMarketFee = "";
        } else {
            this.jitoMarketFee = str;
        }
        if ((i & 2) == 0) {
            this.jitoMarketFeeUsd = "";
        } else {
            this.jitoMarketFeeUsd = str2;
        }
        if ((i & 4) == 0) {
            this.jitoUnsignedTx = "";
        } else {
            this.jitoUnsignedTx = str3;
        }
        if ((i & 8) == 0) {
            this.jitoTotalFee = "";
        } else {
            this.jitoTotalFee = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(JitoData jitoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) jitoData.jitoMarketFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, jitoData.jitoMarketFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) jitoData.jitoMarketFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, jitoData.jitoMarketFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) jitoData.jitoUnsignedTx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, jitoData.jitoUnsignedTx);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) jitoData.jitoTotalFee, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, jitoData.jitoTotalFee);
    }

    public JitoData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.jitoMarketFee = str;
        this.jitoMarketFeeUsd = str2;
        this.jitoUnsignedTx = str3;
        this.jitoTotalFee = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1860) call: com.okinc.business.dexlogic.bean.JitoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ JitoData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
