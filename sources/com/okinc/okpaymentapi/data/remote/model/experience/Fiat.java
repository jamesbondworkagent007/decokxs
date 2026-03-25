package com.okinc.okpaymentapi.data.remote.model.experience;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class Fiat implements Parcelable {
    private final String availableBalance;
    private final String currency;
    private final String currencyId;
    private final String currencyName;
    private final String displayName;
    private final String earnRate;
    private final String icon;
    private final String nightIcon;
    private final List<Integer> quickAmountList;
    private final boolean stablecoinCurrency;
    private final String symbol;
    private final String totalBalance;
    private final String unavailableBalance;
    private final double usdRate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Fiat> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<Fiat> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Fiat createFromParcel(Parcel parcel) {
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
            return new Fiat(string, string2, string3, string4, string5, string6, string7, string8, arrayList, parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Fiat[] newArray(int i) {
            return new Fiat[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Fiat() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, (String) null, (String) null, false, 16383, (DefaultConstructorMarker) null);
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
    public final String component11() {
        return this.earnRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.nightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.stablecoinCurrency;
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
    public final Fiat copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<Integer> list, double d, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new Fiat(str, str2, str3, str4, str5, str6, str7, str8, list, d, str9, str10, str11, z);
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
        if (!(obj instanceof Fiat)) {
            return false;
        }
        Fiat fiat = (Fiat) obj;
        return Intrinsics.EZpvd((Object) this.currency, (Object) fiat.currency) && Intrinsics.EZpvd((Object) this.currencyName, (Object) fiat.currencyName) && Intrinsics.EZpvd((Object) this.currencyId, (Object) fiat.currencyId) && Intrinsics.EZpvd((Object) this.displayName, (Object) fiat.displayName) && Intrinsics.EZpvd((Object) this.symbol, (Object) fiat.symbol) && Intrinsics.EZpvd((Object) this.availableBalance, (Object) fiat.availableBalance) && Intrinsics.EZpvd((Object) this.unavailableBalance, (Object) fiat.unavailableBalance) && Intrinsics.EZpvd((Object) this.totalBalance, (Object) fiat.totalBalance) && Intrinsics.EZpvd(this.quickAmountList, fiat.quickAmountList) && Double.compare(this.usdRate, fiat.usdRate) == 0 && Intrinsics.EZpvd((Object) this.earnRate, (Object) fiat.earnRate) && Intrinsics.EZpvd((Object) this.icon, (Object) fiat.icon) && Intrinsics.EZpvd((Object) this.nightIcon, (Object) fiat.nightIcon) && this.stablecoinCurrency == fiat.stablecoinCurrency;
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
    public final String getEarnRate() {
        return this.earnRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNightIcon() {
        return this.nightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getQuickAmountList() {
        return this.quickAmountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getStablecoinCurrency() {
        return this.stablecoinCurrency;
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
        return (((((((((((((((((((((((((this.currency.hashCode() * 31) + this.currencyName.hashCode()) * 31) + this.currencyId.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.availableBalance.hashCode()) * 31) + this.unavailableBalance.hashCode()) * 31) + this.totalBalance.hashCode()) * 31) + this.quickAmountList.hashCode()) * 31) + Double.hashCode(this.usdRate)) * 31) + this.earnRate.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.nightIcon.hashCode()) * 31) + Boolean.hashCode(this.stablecoinCurrency);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Fiat(currency=" + this.currency + ", currencyName=" + this.currencyName + ", currencyId=" + this.currencyId + ", displayName=" + this.displayName + ", symbol=" + this.symbol + ", availableBalance=" + this.availableBalance + ", unavailableBalance=" + this.unavailableBalance + ", totalBalance=" + this.totalBalance + ", quickAmountList=" + this.quickAmountList + ", usdRate=" + this.usdRate + ", earnRate=" + this.earnRate + ", icon=" + this.icon + ", nightIcon=" + this.nightIcon + ", stablecoinCurrency=" + this.stablecoinCurrency + ")";
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
        parcel.writeString(this.earnRate);
        parcel.writeString(this.icon);
        parcel.writeString(this.nightIcon);
        parcel.writeInt(this.stablecoinCurrency ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.Fiat.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Fiat> serializer() {
            return Fiat$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Fiat(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, double d, String str9, String str10, String str11, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
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
        this.quickAmountList = (i & 256) == 0 ? yDY.AhwBna() : list;
        this.usdRate = (i & 512) == 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d;
        if ((i & 1024) == 0) {
            this.earnRate = "";
        } else {
            this.earnRate = str9;
        }
        if ((i & 2048) == 0) {
            this.icon = "";
        } else {
            this.icon = str10;
        }
        if ((i & 4096) == 0) {
            this.nightIcon = "";
        } else {
            this.nightIcon = str11;
        }
        this.stablecoinCurrency = (i & 8192) == 0 ? false : z;
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(Fiat fiat, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) fiat.currency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fiat.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) fiat.currencyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fiat.currencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) fiat.currencyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, fiat.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) fiat.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, fiat.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) fiat.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, fiat.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) fiat.availableBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, fiat.availableBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) fiat.unavailableBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, fiat.unavailableBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) fiat.totalBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, fiat.totalBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(fiat.quickAmountList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], fiat.quickAmountList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || Double.compare(fiat.usdRate, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 9, fiat.usdRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) fiat.earnRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, fiat.earnRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) fiat.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, fiat.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) fiat.nightIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, fiat.nightIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || fiat.stablecoinCurrency) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, fiat.stablecoinCurrency);
        }
    }

    public Fiat(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<Integer> list, double d, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
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
        this.earnRate = str9;
        this.icon = str10;
        this.nightIcon = str11;
        this.stablecoinCurrency = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0095: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0044: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0048: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:20)) : (r25v0 java.util.List))
  (wrap:double:?: TERNARY null = ((wrap:int:0x004f: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0053: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r26v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0060: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006f: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>, double, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:11) call: com.okinc.okpaymentapi.data.remote.model.experience.Fiat.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, double, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ Fiat(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, double d, String str9, String str10, String str11, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? yDY.AhwBna() : list, (i & 512) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "" : str10, (i & 4096) == 0 ? str11 : "", (i & 8192) != 0 ? false : z);
    }
}
