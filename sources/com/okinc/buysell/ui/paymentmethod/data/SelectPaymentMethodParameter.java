package com.okinc.buysell.ui.paymentmethod.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.experience.Fiat;
import com.okinc.okpaymentapi.data.remote.model.experience.Fiat$$serializer;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.Channel$$serializer;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod$$serializer;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.service.DexTokenParameters;
import com.okinc.okx.paymentapi.service.DexTokenParameters$$serializer;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class SelectPaymentMethodParameter implements Parcelable {
    private String accountId;
    private final BuySellParameter buySellParameter;
    private final List<Channel> cachedChannelList;
    private final DexTokenParameters dexTokenParameters;
    private final List<Fiat> fiatList;
    private String firstName;
    private final boolean hasSingleFiat;
    private final boolean isFromBSC;
    private final boolean isRecurring;
    private final boolean isRecurringEdit;
    private String lastName;
    private final int precisionDigits;
    private final TradeType tradeType;
    private final Channel userSelectedChannel;
    private final PaymentMethod userSelectedPaymentMethod;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SelectPaymentMethodParameter> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, TradeType.Companion.serializer(), null, null, null, null, new ArrayListSerializer(Fiat$$serializer.INSTANCE), null, null, null, null, new ArrayListSerializer(Channel$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<SelectPaymentMethodParameter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectPaymentMethodParameter createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            TradeType tradeType = (TradeType) parcel.readParcelable(SelectPaymentMethodParameter.class.getClassLoader());
            BuySellParameter buySellParameterCreateFromParcel = parcel.readInt() == 0 ? null : BuySellParameter.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            int i2 = 0;
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(parcel.readParcelable(SelectPaymentMethodParameter.class.getClassLoader()));
                }
            }
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            Channel channel = (Channel) parcel.readParcelable(SelectPaymentMethodParameter.class.getClassLoader());
            PaymentMethod paymentMethod = (PaymentMethod) parcel.readParcelable(SelectPaymentMethodParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                while (i2 != i5) {
                    arrayList3.add(parcel.readParcelable(SelectPaymentMethodParameter.class.getClassLoader()));
                    i2++;
                    i5 = i5;
                }
                arrayList2 = arrayList3;
            }
            return new SelectPaymentMethodParameter(string, string2, string3, tradeType, buySellParameterCreateFromParcel, i, z, z2, arrayList, z3, z4, channel, paymentMethod, arrayList2, (DexTokenParameters) parcel.readParcelable(SelectPaymentMethodParameter.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectPaymentMethodParameter[] newArray(int i) {
            return new SelectPaymentMethodParameter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SelectPaymentMethodParameter() {
        this((String) null, (String) null, (String) null, (TradeType) null, (BuySellParameter) null, 0, false, false, (List) null, false, false, (Channel) null, (PaymentMethod) null, (List) null, (DexTokenParameters) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.firstName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.isRecurring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isRecurringEdit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Channel component12() {
        return this.userSelectedChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentMethod component13() {
        return this.userSelectedPaymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Channel> component14() {
        return this.cachedChannelList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTokenParameters component15() {
        return this.dexTokenParameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.lastName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeType component4() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellParameter component5() {
        return this.buySellParameter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.precisionDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.hasSingleFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isFromBSC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Fiat> component9() {
        return this.fiatList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelectPaymentMethodParameter copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TradeType tradeType, BuySellParameter buySellParameter, int i, boolean z, boolean z2, List<Fiat> list, boolean z3, boolean z4, Channel channel, PaymentMethod paymentMethod, List<Channel> list2, DexTokenParameters dexTokenParameters) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        return new SelectPaymentMethodParameter(str, str2, str3, tradeType, buySellParameter, i, z, z2, list, z3, z4, channel, paymentMethod, list2, dexTokenParameters);
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
        if (!(obj instanceof SelectPaymentMethodParameter)) {
            return false;
        }
        SelectPaymentMethodParameter selectPaymentMethodParameter = (SelectPaymentMethodParameter) obj;
        return Intrinsics.EZpvd((Object) this.firstName, (Object) selectPaymentMethodParameter.firstName) && Intrinsics.EZpvd((Object) this.lastName, (Object) selectPaymentMethodParameter.lastName) && Intrinsics.EZpvd((Object) this.accountId, (Object) selectPaymentMethodParameter.accountId) && this.tradeType == selectPaymentMethodParameter.tradeType && Intrinsics.EZpvd(this.buySellParameter, selectPaymentMethodParameter.buySellParameter) && this.precisionDigits == selectPaymentMethodParameter.precisionDigits && this.hasSingleFiat == selectPaymentMethodParameter.hasSingleFiat && this.isFromBSC == selectPaymentMethodParameter.isFromBSC && Intrinsics.EZpvd(this.fiatList, selectPaymentMethodParameter.fiatList) && this.isRecurring == selectPaymentMethodParameter.isRecurring && this.isRecurringEdit == selectPaymentMethodParameter.isRecurringEdit && Intrinsics.EZpvd(this.userSelectedChannel, selectPaymentMethodParameter.userSelectedChannel) && Intrinsics.EZpvd(this.userSelectedPaymentMethod, selectPaymentMethodParameter.userSelectedPaymentMethod) && Intrinsics.EZpvd(this.cachedChannelList, selectPaymentMethodParameter.cachedChannelList) && Intrinsics.EZpvd(this.dexTokenParameters, selectPaymentMethodParameter.dexTokenParameters);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellParameter getBuySellParameter() {
        return this.buySellParameter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Channel> getCachedChannelList() {
        return this.cachedChannelList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTokenParameters getDexTokenParameters() {
        return this.dexTokenParameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Fiat> getFiatList() {
        return this.fiatList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasSingleFiat() {
        return this.hasSingleFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPrecisionDigits() {
        return this.precisionDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeType getTradeType() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Channel getUserSelectedChannel() {
        return this.userSelectedChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentMethod getUserSelectedPaymentMethod() {
        return this.userSelectedPaymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.firstName.hashCode();
        int iHashCode2 = this.lastName.hashCode();
        int iHashCode3 = this.accountId.hashCode();
        int iHashCode4 = this.tradeType.hashCode();
        BuySellParameter buySellParameter = this.buySellParameter;
        int iHashCode5 = buySellParameter == null ? 0 : buySellParameter.hashCode();
        int iHashCode6 = Integer.hashCode(this.precisionDigits);
        int iHashCode7 = Boolean.hashCode(this.hasSingleFiat);
        int iHashCode8 = Boolean.hashCode(this.isFromBSC);
        List<Fiat> list = this.fiatList;
        int iHashCode9 = list == null ? 0 : list.hashCode();
        int iHashCode10 = Boolean.hashCode(this.isRecurring);
        int iHashCode11 = Boolean.hashCode(this.isRecurringEdit);
        Channel channel = this.userSelectedChannel;
        int iHashCode12 = channel == null ? 0 : channel.hashCode();
        PaymentMethod paymentMethod = this.userSelectedPaymentMethod;
        int iHashCode13 = paymentMethod == null ? 0 : paymentMethod.hashCode();
        List<Channel> list2 = this.cachedChannelList;
        int iHashCode14 = list2 == null ? 0 : list2.hashCode();
        DexTokenParameters dexTokenParameters = this.dexTokenParameters;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (dexTokenParameters == null ? 0 : dexTokenParameters.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFromBSC() {
        return this.isFromBSC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRecurring() {
        return this.isRecurring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRecurringEdit() {
        return this.isRecurringEdit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFirstName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.firstName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lastName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SelectPaymentMethodParameter(firstName=" + this.firstName + ", lastName=" + this.lastName + ", accountId=" + this.accountId + ", tradeType=" + this.tradeType + ", buySellParameter=" + this.buySellParameter + ", precisionDigits=" + this.precisionDigits + ", hasSingleFiat=" + this.hasSingleFiat + ", isFromBSC=" + this.isFromBSC + ", fiatList=" + this.fiatList + ", isRecurring=" + this.isRecurring + ", isRecurringEdit=" + this.isRecurringEdit + ", userSelectedChannel=" + this.userSelectedChannel + ", userSelectedPaymentMethod=" + this.userSelectedPaymentMethod + ", cachedChannelList=" + this.cachedChannelList + ", dexTokenParameters=" + this.dexTokenParameters + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.accountId);
        parcel.writeParcelable(this.tradeType, i);
        BuySellParameter buySellParameter = this.buySellParameter;
        if (buySellParameter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buySellParameter.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.precisionDigits);
        parcel.writeInt(this.hasSingleFiat ? 1 : 0);
        parcel.writeInt(this.isFromBSC ? 1 : 0);
        List<Fiat> list = this.fiatList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Fiat> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }
        parcel.writeInt(this.isRecurring ? 1 : 0);
        parcel.writeInt(this.isRecurringEdit ? 1 : 0);
        parcel.writeParcelable(this.userSelectedChannel, i);
        parcel.writeParcelable(this.userSelectedPaymentMethod, i);
        List<Channel> list2 = this.cachedChannelList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Channel> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeParcelable(this.dexTokenParameters, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodParameter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SelectPaymentMethodParameter> serializer() {
            return SelectPaymentMethodParameter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SelectPaymentMethodParameter(int i, String str, String str2, String str3, TradeType tradeType, BuySellParameter buySellParameter, int i2, boolean z, boolean z2, List list, boolean z3, boolean z4, Channel channel, PaymentMethod paymentMethod, List list2, DexTokenParameters dexTokenParameters, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.firstName = "";
        } else {
            this.firstName = str;
        }
        if ((i & 2) == 0) {
            this.lastName = "";
        } else {
            this.lastName = str2;
        }
        if ((i & 4) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str3;
        }
        this.tradeType = (i & 8) == 0 ? TradeType.BUY : tradeType;
        if ((i & 16) == 0) {
            this.buySellParameter = null;
        } else {
            this.buySellParameter = buySellParameter;
        }
        this.precisionDigits = (i & 32) == 0 ? 2 : i2;
        if ((i & 64) == 0) {
            this.hasSingleFiat = false;
        } else {
            this.hasSingleFiat = z;
        }
        if ((i & 128) == 0) {
            this.isFromBSC = false;
        } else {
            this.isFromBSC = z2;
        }
        if ((i & 256) == 0) {
            this.fiatList = null;
        } else {
            this.fiatList = list;
        }
        if ((i & 512) == 0) {
            this.isRecurring = false;
        } else {
            this.isRecurring = z3;
        }
        if ((i & 1024) == 0) {
            this.isRecurringEdit = false;
        } else {
            this.isRecurringEdit = z4;
        }
        if ((i & 2048) == 0) {
            this.userSelectedChannel = null;
        } else {
            this.userSelectedChannel = channel;
        }
        if ((i & 4096) == 0) {
            this.userSelectedPaymentMethod = null;
        } else {
            this.userSelectedPaymentMethod = paymentMethod;
        }
        if ((i & 8192) == 0) {
            this.cachedChannelList = null;
        } else {
            this.cachedChannelList = list2;
        }
        if ((i & 16384) == 0) {
            this.dexTokenParameters = null;
        } else {
            this.dexTokenParameters = dexTokenParameters;
        }
    }

    public static final /* synthetic */ void write$Self$OKBuySell_buysell_impl(SelectPaymentMethodParameter selectPaymentMethodParameter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) selectPaymentMethodParameter.firstName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, selectPaymentMethodParameter.firstName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) selectPaymentMethodParameter.lastName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, selectPaymentMethodParameter.lastName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) selectPaymentMethodParameter.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, selectPaymentMethodParameter.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || selectPaymentMethodParameter.tradeType != TradeType.BUY) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], selectPaymentMethodParameter.tradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || selectPaymentMethodParameter.buySellParameter != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BuySellParameter$$serializer.INSTANCE, selectPaymentMethodParameter.buySellParameter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || selectPaymentMethodParameter.precisionDigits != 2) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, selectPaymentMethodParameter.precisionDigits);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || selectPaymentMethodParameter.hasSingleFiat) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, selectPaymentMethodParameter.hasSingleFiat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || selectPaymentMethodParameter.isFromBSC) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, selectPaymentMethodParameter.isFromBSC);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || selectPaymentMethodParameter.fiatList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], selectPaymentMethodParameter.fiatList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || selectPaymentMethodParameter.isRecurring) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, selectPaymentMethodParameter.isRecurring);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || selectPaymentMethodParameter.isRecurringEdit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, selectPaymentMethodParameter.isRecurringEdit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || selectPaymentMethodParameter.userSelectedChannel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, Channel$$serializer.INSTANCE, selectPaymentMethodParameter.userSelectedChannel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || selectPaymentMethodParameter.userSelectedPaymentMethod != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, PaymentMethod$$serializer.INSTANCE, selectPaymentMethodParameter.userSelectedPaymentMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || selectPaymentMethodParameter.cachedChannelList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr[13], selectPaymentMethodParameter.cachedChannelList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && selectPaymentMethodParameter.dexTokenParameters == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, DexTokenParameters$$serializer.INSTANCE, selectPaymentMethodParameter.dexTokenParameters);
    }

    public SelectPaymentMethodParameter(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TradeType tradeType, BuySellParameter buySellParameter, int i, boolean z, boolean z2, List<Fiat> list, boolean z3, boolean z4, Channel channel, PaymentMethod paymentMethod, List<Channel> list2, DexTokenParameters dexTokenParameters) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        this.firstName = str;
        this.lastName = str2;
        this.accountId = str3;
        this.tradeType = tradeType;
        this.buySellParameter = buySellParameter;
        this.precisionDigits = i;
        this.hasSingleFiat = z;
        this.isFromBSC = z2;
        this.fiatList = list;
        this.isRecurring = z3;
        this.isRecurringEdit = z4;
        this.userSelectedChannel = channel;
        this.userSelectedPaymentMethod = paymentMethod;
        this.cachedChannelList = list2;
        this.dexTokenParameters = dexTokenParameters;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.TradeType:?: TERNARY null = ((wrap:int:0x001b: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: SGET  A[WRAPPED] (LINE:22) com.okinc.okpaymentapi.data.remote.model.management.TradeType.BUY com.okinc.okpaymentapi.data.remote.model.management.TradeType) : (r20v0 com.okinc.okpaymentapi.data.remote.model.management.TradeType))
  (wrap:com.okinc.buysell.ui.paymentmethod.data.BuySellParameter:?: TERNARY null = ((wrap:int:0x0024: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.buysell.ui.paymentmethod.data.BuySellParameter) : (r21v0 com.okinc.buysell.ui.paymentmethod.data.BuySellParameter))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002d: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r22v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0046: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r25v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004e: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0056: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r27v0 boolean) : false)
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.Channel:?: TERNARY null = ((wrap:int:0x005d: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.Channel) : (r28v0 com.okinc.okpaymentapi.data.remote.model.management.Channel))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod:?: TERNARY null = ((wrap:int:0x0065: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod) : (r29v0 com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006d: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r30v0 java.util.List))
  (wrap:com.okinc.okx.paymentapi.service.DexTokenParameters:?: TERNARY null = ((wrap:int:0x0075: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 com.okinc.okx.paymentapi.service.DexTokenParameters) : (null com.okinc.okx.paymentapi.service.DexTokenParameters))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.TradeType, com.okinc.buysell.ui.paymentmethod.data.BuySellParameter, int, boolean, boolean, java.util.List<com.okinc.okpaymentapi.data.remote.model.experience.Fiat>, boolean, boolean, com.okinc.okpaymentapi.data.remote.model.management.Channel, com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod, java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel>, com.okinc.okx.paymentapi.service.DexTokenParameters):void (m)] (LINE:18) call: com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodParameter.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.TradeType, com.okinc.buysell.ui.paymentmethod.data.BuySellParameter, int, boolean, boolean, java.util.List, boolean, boolean, com.okinc.okpaymentapi.data.remote.model.management.Channel, com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod, java.util.List, com.okinc.okx.paymentapi.service.DexTokenParameters):void type: THIS */
    public /* synthetic */ SelectPaymentMethodParameter(String str, String str2, String str3, TradeType tradeType, BuySellParameter buySellParameter, int i, boolean z, boolean z2, List list, boolean z3, boolean z4, Channel channel, PaymentMethod paymentMethod, List list2, DexTokenParameters dexTokenParameters, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? TradeType.BUY : tradeType, (i2 & 16) != 0 ? null : buySellParameter, (i2 & 32) != 0 ? 2 : i, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? null : list, (i2 & 512) != 0 ? false : z3, (i2 & 1024) == 0 ? z4 : false, (i2 & 2048) != 0 ? null : channel, (i2 & 4096) != 0 ? null : paymentMethod, (i2 & 8192) != 0 ? null : list2, (i2 & 16384) == 0 ? dexTokenParameters : null);
    }
}
