package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.CurrencySuggestionPairsResponseBean;
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
public final class CurrencySuggestionPairsBean implements Parcelable {
    private ConvertCurrencyBean from;
    private ConvertCurrencyBean to;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CurrencySuggestionPairsBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<CurrencySuggestionPairsBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencySuggestionPairsBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CurrencySuggestionPairsBean(parcel.readInt() == 0 ? null : ConvertCurrencyBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ConvertCurrencyBean.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencySuggestionPairsBean[] newArray(int i) {
            return new CurrencySuggestionPairsBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CurrencySuggestionPairsBean() {
        this((ConvertCurrencyBean) null, (ConvertCurrencyBean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CurrencySuggestionPairsBean copy$default(CurrencySuggestionPairsBean currencySuggestionPairsBean, ConvertCurrencyBean convertCurrencyBean, ConvertCurrencyBean convertCurrencyBean2, int i, Object obj) {
        if ((i & 1) != 0) {
            convertCurrencyBean = currencySuggestionPairsBean.from;
        }
        if ((i & 2) != 0) {
            convertCurrencyBean2 = currencySuggestionPairsBean.to;
        }
        return currencySuggestionPairsBean.copy(convertCurrencyBean, convertCurrencyBean2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertCurrencyBean component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertCurrencyBean component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencySuggestionPairsBean copy(ConvertCurrencyBean convertCurrencyBean, ConvertCurrencyBean convertCurrencyBean2) {
        return new CurrencySuggestionPairsBean(convertCurrencyBean, convertCurrencyBean2);
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
        if (!(obj instanceof CurrencySuggestionPairsBean)) {
            return false;
        }
        CurrencySuggestionPairsBean currencySuggestionPairsBean = (CurrencySuggestionPairsBean) obj;
        return Intrinsics.EZpvd(this.from, currencySuggestionPairsBean.from) && Intrinsics.EZpvd(this.to, currencySuggestionPairsBean.to);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertCurrencyBean getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertCurrencyBean getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ConvertCurrencyBean convertCurrencyBean = this.from;
        int iHashCode = convertCurrencyBean == null ? 0 : convertCurrencyBean.hashCode();
        ConvertCurrencyBean convertCurrencyBean2 = this.to;
        return (iHashCode * 31) + (convertCurrencyBean2 != null ? convertCurrencyBean2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(ConvertCurrencyBean convertCurrencyBean) {
        this.from = convertCurrencyBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(ConvertCurrencyBean convertCurrencyBean) {
        this.to = convertCurrencyBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CurrencySuggestionPairsBean(from=" + this.from + ", to=" + this.to + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ConvertCurrencyBean convertCurrencyBean = this.from;
        if (convertCurrencyBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            convertCurrencyBean.writeToParcel(parcel, i);
        }
        ConvertCurrencyBean convertCurrencyBean2 = this.to;
        if (convertCurrencyBean2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            convertCurrencyBean2.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ CurrencySuggestionPairsBean(int i, ConvertCurrencyBean convertCurrencyBean, ConvertCurrencyBean convertCurrencyBean2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.from = null;
        } else {
            this.from = convertCurrencyBean;
        }
        if ((i & 2) == 0) {
            this.to = null;
        } else {
            this.to = convertCurrencyBean2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CurrencySuggestionPairsBean currencySuggestionPairsBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || currencySuggestionPairsBean.from != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ConvertCurrencyBean$$serializer.INSTANCE, currencySuggestionPairsBean.from);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && currencySuggestionPairsBean.to == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ConvertCurrencyBean$$serializer.INSTANCE, currencySuggestionPairsBean.to);
    }

    public CurrencySuggestionPairsBean(ConvertCurrencyBean convertCurrencyBean, ConvertCurrencyBean convertCurrencyBean2) {
        this.from = convertCurrencyBean;
        this.to = convertCurrencyBean2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean) : (r2v0 com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean))
  (wrap:com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean) : (r3v0 com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean))
 A[MD:(com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean, com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.CurrencySuggestionPairsBean.<init>(com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean, com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean):void type: THIS */
    public /* synthetic */ CurrencySuggestionPairsBean(ConvertCurrencyBean convertCurrencyBean, ConvertCurrencyBean convertCurrencyBean2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : convertCurrencyBean, (i & 2) != 0 ? null : convertCurrencyBean2);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.CurrencySuggestionPairsBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CurrencySuggestionPairsBean> serializer() {
            return CurrencySuggestionPairsBean$$serializer.INSTANCE;
        }

        public final CurrencySuggestionPairsBean copydefault(@NotNull CurrencySuggestionPairsResponseBean currencySuggestionPairsResponseBean) {
            Intrinsics.checkNotNullParameter(currencySuggestionPairsResponseBean, "");
            ConvertCurrencyResponseBean from = currencySuggestionPairsResponseBean.getFrom();
            ConvertCurrencyBean convertCurrencyBeanKWHzl = from != null ? ConvertCurrencyBean.Companion.KWHzl(from) : null;
            ConvertCurrencyResponseBean to = currencySuggestionPairsResponseBean.getTo();
            return new CurrencySuggestionPairsBean(convertCurrencyBeanKWHzl, to != null ? ConvertCurrencyBean.Companion.KWHzl(to) : null);
        }
    }
}
