package com.okinc.crcore.shared.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.okinc.crcore.coreapi.net.responsebean.bsc.FiatResponseBean;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class FiatBean implements Parcelable {
    private final String availableBalance;
    private final String currency;
    private final String currencyId;
    private final String currencyName;
    private final String displayName;
    private final List<Integer> quickAmountList;
    private final String symbol;
    private final String totalBalance;
    private final String unavailableBalance;
    private final double usdRate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FiatBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<FiatBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new FiatBean(string, string2, string3, string4, string5, string6, string7, string8, arrayList, parcel.readDouble());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatBean[] newArray(int i) {
            return new FiatBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FiatBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, AudioStats.AUDIO_AMPLITUDE_NONE, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component10() {
        return this.usdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.availableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.unavailableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.totalBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component9() {
        return this.quickAmountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiatBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<Integer> list, double d) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new FiatBean(str, str2, str3, str4, str5, str6, str7, str8, list, d);
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
        if (!(obj instanceof FiatBean)) {
            return false;
        }
        FiatBean fiatBean = (FiatBean) obj;
        return Intrinsics.EZpvd((Object) this.currency, (Object) fiatBean.currency) && Intrinsics.EZpvd((Object) this.currencyName, (Object) fiatBean.currencyName) && Intrinsics.EZpvd((Object) this.currencyId, (Object) fiatBean.currencyId) && Intrinsics.EZpvd((Object) this.displayName, (Object) fiatBean.displayName) && Intrinsics.EZpvd((Object) this.symbol, (Object) fiatBean.symbol) && Intrinsics.EZpvd((Object) this.availableBalance, (Object) fiatBean.availableBalance) && Intrinsics.EZpvd((Object) this.unavailableBalance, (Object) fiatBean.unavailableBalance) && Intrinsics.EZpvd((Object) this.totalBalance, (Object) fiatBean.totalBalance) && Intrinsics.EZpvd(this.quickAmountList, fiatBean.quickAmountList) && Double.compare(this.usdRate, fiatBean.usdRate) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getQuickAmountList() {
        return this.quickAmountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnavailableBalance() {
        return this.unavailableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getUsdRate() {
        return this.usdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.currency.hashCode() * 31) + this.currencyName.hashCode()) * 31) + this.currencyId.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.availableBalance.hashCode()) * 31) + this.unavailableBalance.hashCode()) * 31) + this.totalBalance.hashCode()) * 31) + this.quickAmountList.hashCode()) * 31) + Double.hashCode(this.usdRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FiatBean(currency=" + this.currency + ", currencyName=" + this.currencyName + ", currencyId=" + this.currencyId + ", displayName=" + this.displayName + ", symbol=" + this.symbol + ", availableBalance=" + this.availableBalance + ", unavailableBalance=" + this.unavailableBalance + ", totalBalance=" + this.totalBalance + ", quickAmountList=" + this.quickAmountList + ", usdRate=" + this.usdRate + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.currency);
        parcel.writeString(this.currencyName);
        parcel.writeString(this.currencyId);
        parcel.writeString(this.displayName);
        parcel.writeString(this.symbol);
        parcel.writeString(this.availableBalance);
        parcel.writeString(this.unavailableBalance);
        parcel.writeString(this.totalBalance);
        List<Integer> list = this.quickAmountList;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        parcel.writeDouble(this.usdRate);
    }

    public /* synthetic */ FiatBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, double d, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.currency = "";
        } else {
            this.currency = str;
        }
        if ((i & 2) == 0) {
            this.currencyName = "";
        } else {
            this.currencyName = str2;
        }
        if ((i & 4) == 0) {
            this.currencyId = "";
        } else {
            this.currencyId = str3;
        }
        if ((i & 8) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str4;
        }
        if ((i & 16) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str5;
        }
        if ((i & 32) == 0) {
            this.availableBalance = "";
        } else {
            this.availableBalance = str6;
        }
        if ((i & 64) == 0) {
            this.unavailableBalance = "";
        } else {
            this.unavailableBalance = str7;
        }
        if ((i & 128) == 0) {
            this.totalBalance = "";
        } else {
            this.totalBalance = str8;
        }
        if ((i & 256) == 0) {
            this.quickAmountList = yDY.AhwBna();
        } else {
            this.quickAmountList = list;
        }
        if ((i & 512) == 0) {
            this.usdRate = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.usdRate = d;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(FiatBean fiatBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) fiatBean.currency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fiatBean.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) fiatBean.currencyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fiatBean.currencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) fiatBean.currencyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, fiatBean.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) fiatBean.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, fiatBean.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) fiatBean.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, fiatBean.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) fiatBean.availableBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, fiatBean.availableBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) fiatBean.unavailableBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, fiatBean.unavailableBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) fiatBean.totalBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, fiatBean.totalBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(fiatBean.quickAmountList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], fiatBean.quickAmountList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Double.compare(fiatBean.usdRate, AudioStats.AUDIO_AMPLITUDE_NONE) == 0) {
            return;
        }
        compositeEncoder.encodeDoubleElement(serialDescriptor, 9, fiatBean.usdRate);
    }

    public FiatBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<Integer> list, double d) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.currency = str;
        this.currencyName = str2;
        this.currencyId = str3;
        this.displayName = str4;
        this.symbol = str5;
        this.availableBalance = str6;
        this.unavailableBalance = str7;
        this.totalBalance = str8;
        this.quickAmountList = list;
        this.usdRate = d;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0067: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0044: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:24)) : (r21v0 java.util.List))
  (wrap:double:?: TERNARY null = ((wrap:int:0x004b: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004f: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r22v0 double))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>, double):void (m)] (LINE:15) call: com.okinc.crcore.shared.net.responsebean.bsc.FiatBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, double):void type: THIS */
    public /* synthetic */ FiatBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "", (i & 256) != 0 ? yDY.AhwBna() : list, (i & 512) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.FiatBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FiatBean> serializer() {
            return FiatBean$$serializer.INSTANCE;
        }

        public final FiatBean AEQbTJ(@NotNull FiatResponseBean fiatResponseBean) {
            Intrinsics.checkNotNullParameter(fiatResponseBean, "");
            return new FiatBean(fiatResponseBean.getCurrency(), fiatResponseBean.getCurrencyName(), fiatResponseBean.getCurrencyId(), fiatResponseBean.getDisplayName(), fiatResponseBean.getSymbol(), fiatResponseBean.getAvailableBalance(), fiatResponseBean.getUnavailableBalance(), fiatResponseBean.getTotalBalance(), fiatResponseBean.getQuickAmountList(), fiatResponseBean.getUsdRate());
        }
    }
}
