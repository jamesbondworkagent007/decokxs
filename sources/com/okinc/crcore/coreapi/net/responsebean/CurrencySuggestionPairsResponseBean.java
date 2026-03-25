package com.okinc.crcore.coreapi.net.responsebean;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CurrencySuggestionPairsResponseBean implements Parcelable {
    private ConvertCurrencyResponseBean from;
    private ConvertCurrencyResponseBean to;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CurrencySuggestionPairsResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<CurrencySuggestionPairsResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencySuggestionPairsResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CurrencySuggestionPairsResponseBean(parcel.readInt() == 0 ? null : ConvertCurrencyResponseBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ConvertCurrencyResponseBean.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencySuggestionPairsResponseBean[] newArray(int i) {
            return new CurrencySuggestionPairsResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CurrencySuggestionPairsResponseBean() {
        this((ConvertCurrencyResponseBean) null, (ConvertCurrencyResponseBean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CurrencySuggestionPairsResponseBean copy$default(CurrencySuggestionPairsResponseBean currencySuggestionPairsResponseBean, ConvertCurrencyResponseBean convertCurrencyResponseBean, ConvertCurrencyResponseBean convertCurrencyResponseBean2, int i, Object obj) {
        if ((i & 1) != 0) {
            convertCurrencyResponseBean = currencySuggestionPairsResponseBean.from;
        }
        if ((i & 2) != 0) {
            convertCurrencyResponseBean2 = currencySuggestionPairsResponseBean.to;
        }
        return currencySuggestionPairsResponseBean.copy(convertCurrencyResponseBean, convertCurrencyResponseBean2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertCurrencyResponseBean component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertCurrencyResponseBean component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencySuggestionPairsResponseBean copy(ConvertCurrencyResponseBean convertCurrencyResponseBean, ConvertCurrencyResponseBean convertCurrencyResponseBean2) {
        return new CurrencySuggestionPairsResponseBean(convertCurrencyResponseBean, convertCurrencyResponseBean2);
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
        if (!(obj instanceof CurrencySuggestionPairsResponseBean)) {
            return false;
        }
        CurrencySuggestionPairsResponseBean currencySuggestionPairsResponseBean = (CurrencySuggestionPairsResponseBean) obj;
        return Intrinsics.EZpvd(this.from, currencySuggestionPairsResponseBean.from) && Intrinsics.EZpvd(this.to, currencySuggestionPairsResponseBean.to);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertCurrencyResponseBean getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertCurrencyResponseBean getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ConvertCurrencyResponseBean convertCurrencyResponseBean = this.from;
        int iHashCode = convertCurrencyResponseBean == null ? 0 : convertCurrencyResponseBean.hashCode();
        ConvertCurrencyResponseBean convertCurrencyResponseBean2 = this.to;
        return (iHashCode * 31) + (convertCurrencyResponseBean2 != null ? convertCurrencyResponseBean2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(ConvertCurrencyResponseBean convertCurrencyResponseBean) {
        this.from = convertCurrencyResponseBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(ConvertCurrencyResponseBean convertCurrencyResponseBean) {
        this.to = convertCurrencyResponseBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CurrencySuggestionPairsResponseBean(from=" + this.from + ", to=" + this.to + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ConvertCurrencyResponseBean convertCurrencyResponseBean = this.from;
        if (convertCurrencyResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            convertCurrencyResponseBean.writeToParcel(parcel, i);
        }
        ConvertCurrencyResponseBean convertCurrencyResponseBean2 = this.to;
        if (convertCurrencyResponseBean2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            convertCurrencyResponseBean2.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.CurrencySuggestionPairsResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CurrencySuggestionPairsResponseBean> serializer() {
            return CurrencySuggestionPairsResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CurrencySuggestionPairsResponseBean(int i, ConvertCurrencyResponseBean convertCurrencyResponseBean, ConvertCurrencyResponseBean convertCurrencyResponseBean2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.from = null;
        } else {
            this.from = convertCurrencyResponseBean;
        }
        if ((i & 2) == 0) {
            this.to = null;
        } else {
            this.to = convertCurrencyResponseBean2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CurrencySuggestionPairsResponseBean currencySuggestionPairsResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || currencySuggestionPairsResponseBean.from != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ConvertCurrencyResponseBean$$serializer.INSTANCE, currencySuggestionPairsResponseBean.from);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && currencySuggestionPairsResponseBean.to == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ConvertCurrencyResponseBean$$serializer.INSTANCE, currencySuggestionPairsResponseBean.to);
    }

    public CurrencySuggestionPairsResponseBean(ConvertCurrencyResponseBean convertCurrencyResponseBean, ConvertCurrencyResponseBean convertCurrencyResponseBean2) {
        this.from = convertCurrencyResponseBean;
        this.to = convertCurrencyResponseBean2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyResponseBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyResponseBean) : (r2v0 com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyResponseBean))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyResponseBean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyResponseBean) : (r3v0 com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyResponseBean))
 A[MD:(com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyResponseBean, com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyResponseBean):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.CurrencySuggestionPairsResponseBean.<init>(com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyResponseBean, com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyResponseBean):void type: THIS */
    public /* synthetic */ CurrencySuggestionPairsResponseBean(ConvertCurrencyResponseBean convertCurrencyResponseBean, ConvertCurrencyResponseBean convertCurrencyResponseBean2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : convertCurrencyResponseBean, (i & 2) != 0 ? null : convertCurrencyResponseBean2);
    }
}
