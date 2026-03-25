package com.okinc.crcore.shared.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.okinc.crcore.coreapi.net.responsebean.bsc.QuoteCurrencyResponseBean;
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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class QuoteCurrencyBean implements Parcelable {
    private final String currency;
    private final String currencyId;
    private final String currencyName;
    private final String displayName;
    private final String icon;
    private final boolean multipleQuoteCurrency;
    private final String nightIcon;
    private final List<Integer> quickAmountList;
    private final int scale;
    private final String symbol;
    private final double usdRate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<QuoteCurrencyBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null, null};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<QuoteCurrencyBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuoteCurrencyBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new QuoteCurrencyBean(z, i, string, string2, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuoteCurrencyBean[] newArray(int i) {
            return new QuoteCurrencyBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QuoteCurrencyBean() {
        this(false, 0, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.multipleQuoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component11() {
        return this.usdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component5() {
        return this.quickAmountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteCurrencyBean copy(boolean z, int i, @NotNull String str, @NotNull String str2, @NotNull List<Integer> list, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, double d) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new QuoteCurrencyBean(z, i, str, str2, list, str3, str4, str5, str6, str7, d);
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
        if (!(obj instanceof QuoteCurrencyBean)) {
            return false;
        }
        QuoteCurrencyBean quoteCurrencyBean = (QuoteCurrencyBean) obj;
        return this.multipleQuoteCurrency == quoteCurrencyBean.multipleQuoteCurrency && this.scale == quoteCurrencyBean.scale && Intrinsics.EZpvd((Object) this.currencyName, (Object) quoteCurrencyBean.currencyName) && Intrinsics.EZpvd((Object) this.nightIcon, (Object) quoteCurrencyBean.nightIcon) && Intrinsics.EZpvd(this.quickAmountList, quoteCurrencyBean.quickAmountList) && Intrinsics.EZpvd((Object) this.symbol, (Object) quoteCurrencyBean.symbol) && Intrinsics.EZpvd((Object) this.currencyId, (Object) quoteCurrencyBean.currencyId) && Intrinsics.EZpvd((Object) this.icon, (Object) quoteCurrencyBean.icon) && Intrinsics.EZpvd((Object) this.currency, (Object) quoteCurrencyBean.currency) && Intrinsics.EZpvd((Object) this.displayName, (Object) quoteCurrencyBean.displayName) && Double.compare(this.usdRate, quoteCurrencyBean.usdRate) == 0;
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
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMultipleQuoteCurrency() {
        return this.multipleQuoteCurrency;
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
    public final int getScale() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getUsdRate() {
        return this.usdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((Boolean.hashCode(this.multipleQuoteCurrency) * 31) + Integer.hashCode(this.scale)) * 31) + this.currencyName.hashCode()) * 31) + this.nightIcon.hashCode()) * 31) + this.quickAmountList.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.currencyId.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.displayName.hashCode()) * 31) + Double.hashCode(this.usdRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuoteCurrencyBean(multipleQuoteCurrency=" + this.multipleQuoteCurrency + ", scale=" + this.scale + ", currencyName=" + this.currencyName + ", nightIcon=" + this.nightIcon + ", quickAmountList=" + this.quickAmountList + ", symbol=" + this.symbol + ", currencyId=" + this.currencyId + ", icon=" + this.icon + ", currency=" + this.currency + ", displayName=" + this.displayName + ", usdRate=" + this.usdRate + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.multipleQuoteCurrency ? 1 : 0);
        parcel.writeInt(this.scale);
        parcel.writeString(this.currencyName);
        parcel.writeString(this.nightIcon);
        List<Integer> list = this.quickAmountList;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        parcel.writeString(this.symbol);
        parcel.writeString(this.currencyId);
        parcel.writeString(this.icon);
        parcel.writeString(this.currency);
        parcel.writeString(this.displayName);
        parcel.writeDouble(this.usdRate);
    }

    public /* synthetic */ QuoteCurrencyBean(int i, boolean z, int i2, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, double d, SerializationConstructorMarker serializationConstructorMarker) {
        this.multipleQuoteCurrency = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.scale = 2;
        } else {
            this.scale = i2;
        }
        if ((i & 4) == 0) {
            this.currencyName = "";
        } else {
            this.currencyName = str;
        }
        if ((i & 8) == 0) {
            this.nightIcon = "";
        } else {
            this.nightIcon = str2;
        }
        if ((i & 16) == 0) {
            this.quickAmountList = yDY.AhwBna();
        } else {
            this.quickAmountList = list;
        }
        if ((i & 32) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str3;
        }
        if ((i & 64) == 0) {
            this.currencyId = "";
        } else {
            this.currencyId = str4;
        }
        if ((i & 128) == 0) {
            this.icon = "";
        } else {
            this.icon = str5;
        }
        if ((i & 256) == 0) {
            this.currency = "";
        } else {
            this.currency = str6;
        }
        if ((i & 512) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str7;
        }
        if ((i & 1024) == 0) {
            this.usdRate = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.usdRate = d;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(QuoteCurrencyBean quoteCurrencyBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || quoteCurrencyBean.multipleQuoteCurrency) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, quoteCurrencyBean.multipleQuoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || quoteCurrencyBean.scale != 2) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, quoteCurrencyBean.scale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) quoteCurrencyBean.currencyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, quoteCurrencyBean.currencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) quoteCurrencyBean.nightIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, quoteCurrencyBean.nightIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(quoteCurrencyBean.quickAmountList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], quoteCurrencyBean.quickAmountList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) quoteCurrencyBean.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, quoteCurrencyBean.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) quoteCurrencyBean.currencyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, quoteCurrencyBean.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) quoteCurrencyBean.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, quoteCurrencyBean.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) quoteCurrencyBean.currency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, quoteCurrencyBean.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) quoteCurrencyBean.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, quoteCurrencyBean.displayName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Double.compare(quoteCurrencyBean.usdRate, AudioStats.AUDIO_AMPLITUDE_NONE) == 0) {
            return;
        }
        compositeEncoder.encodeDoubleElement(serialDescriptor, 10, quoteCurrencyBean.usdRate);
    }

    public QuoteCurrencyBean(boolean z, int i, @NotNull String str, @NotNull String str2, @NotNull List<Integer> list, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, double d) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.multipleQuoteCurrency = z;
        this.scale = i;
        this.currencyName = str;
        this.nightIcon = str2;
        this.quickAmountList = list;
        this.symbol = str3;
        this.currencyId = str4;
        this.icon = str5;
        this.currency = str6;
        this.displayName = str7;
        this.usdRate = d;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0073: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0009: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r15v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0026: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r18v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r26v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0054: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0058: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r24v0 double))
 A[MD:(boolean, int, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.bsc.QuoteCurrencyBean.<init>(boolean, int, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double):void type: THIS */
    public /* synthetic */ QuoteCurrencyBean(boolean z, int i, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 2 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? yDY.AhwBna() : list, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) == 0 ? str7 : "", (i2 & 1024) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.QuoteCurrencyBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<QuoteCurrencyBean> serializer() {
            return QuoteCurrencyBean$$serializer.INSTANCE;
        }

        public final QuoteCurrencyBean KWHzl(@NotNull QuoteCurrencyResponseBean quoteCurrencyResponseBean) {
            Intrinsics.checkNotNullParameter(quoteCurrencyResponseBean, "");
            return new QuoteCurrencyBean(quoteCurrencyResponseBean.getMultipleQuoteCurrency(), quoteCurrencyResponseBean.getScale(), quoteCurrencyResponseBean.getCurrencyName(), quoteCurrencyResponseBean.getNightIcon(), quoteCurrencyResponseBean.getQuickAmountList(), quoteCurrencyResponseBean.getSymbol(), quoteCurrencyResponseBean.getCurrencyId(), quoteCurrencyResponseBean.getIcon(), quoteCurrencyResponseBean.getCurrency(), quoteCurrencyResponseBean.getDisplayName(), quoteCurrencyResponseBean.getUsdRate());
        }
    }
}
