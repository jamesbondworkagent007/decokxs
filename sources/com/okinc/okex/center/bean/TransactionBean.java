package com.okinc.okex.center.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okex.center.bean.enums.TransactionTagLabel;
import com.okinc.okex.center.bean.enums.TransactionType;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class TransactionBean implements Parcelable {
    private final String amount;
    private final CoachMarkBean coachMark;
    private final Long createdDate;
    private final String currency;
    private final Integer currencyId;
    private final String displayedDescription;
    private final String displayedStatus;
    private final HighlightBean highlight;
    private final String id;
    private final String label;
    private final String labelColor;
    private final List<TransactionTagLabel> labels;
    private final String quoteAmount;
    private final String quoteCurrency;
    private final Integer sign;
    private final String status;
    private final TransactionType transactionType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TransactionBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, TransactionType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(TransactionTagLabel.Companion.serializer()), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<TransactionBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            TransactionType transactionTypeValueOf = parcel.readInt() == 0 ? null : TransactionType.valueOf(parcel.readString());
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int i2 = 0;
                while (i2 != i) {
                    arrayList.add(TransactionTagLabel.valueOf(parcel.readString()));
                    i2++;
                    i = i;
                }
            }
            return new TransactionBean(string, transactionTypeValueOf, string2, numValueOf, string3, string4, string5, string6, string7, string8, lValueOf, numValueOf2, arrayList, parcel.readInt() == 0 ? null : CoachMarkBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : HighlightBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionBean[] newArray(int i) {
            return new TransactionBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.displayedStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component11() {
        return this.createdDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionTagLabel> component13() {
        return this.labels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoachMarkBean component14() {
        return this.coachMark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HighlightBean component15() {
        return this.highlight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.labelColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionType component2() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.displayedDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionBean copy(@NotNull String str, TransactionType transactionType, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Integer num2, List<? extends TransactionTagLabel> list, CoachMarkBean coachMarkBean, HighlightBean highlightBean, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TransactionBean(str, transactionType, str2, num, str3, str4, str5, str6, str7, str8, l, num2, list, coachMarkBean, highlightBean, str9, str10);
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
        if (!(obj instanceof TransactionBean)) {
            return false;
        }
        TransactionBean transactionBean = (TransactionBean) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) transactionBean.id) && this.transactionType == transactionBean.transactionType && Intrinsics.EZpvd((Object) this.amount, (Object) transactionBean.amount) && Intrinsics.EZpvd(this.currencyId, transactionBean.currencyId) && Intrinsics.EZpvd((Object) this.currency, (Object) transactionBean.currency) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) transactionBean.quoteAmount) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) transactionBean.quoteCurrency) && Intrinsics.EZpvd((Object) this.displayedDescription, (Object) transactionBean.displayedDescription) && Intrinsics.EZpvd((Object) this.status, (Object) transactionBean.status) && Intrinsics.EZpvd((Object) this.displayedStatus, (Object) transactionBean.displayedStatus) && Intrinsics.EZpvd(this.createdDate, transactionBean.createdDate) && Intrinsics.EZpvd(this.sign, transactionBean.sign) && Intrinsics.EZpvd(this.labels, transactionBean.labels) && Intrinsics.EZpvd(this.coachMark, transactionBean.coachMark) && Intrinsics.EZpvd(this.highlight, transactionBean.highlight) && Intrinsics.EZpvd((Object) this.label, (Object) transactionBean.label) && Intrinsics.EZpvd((Object) this.labelColor, (Object) transactionBean.labelColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoachMarkBean getCoachMark() {
        return this.coachMark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayedDescription() {
        return this.displayedDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayedStatus() {
        return this.displayedStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HighlightBean getHighlight() {
        return this.highlight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabelColor() {
        return this.labelColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionTagLabel> getLabels() {
        return this.labels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteAmount() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSign() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionType getTransactionType() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        TransactionType transactionType = this.transactionType;
        int iHashCode2 = transactionType == null ? 0 : transactionType.hashCode();
        String str = this.amount;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Integer num = this.currencyId;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str2 = this.currency;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.quoteAmount;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.quoteCurrency;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.displayedDescription;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.status;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.displayedStatus;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        Long l = this.createdDate;
        int iHashCode11 = l == null ? 0 : l.hashCode();
        Integer num2 = this.sign;
        int iHashCode12 = num2 == null ? 0 : num2.hashCode();
        List<TransactionTagLabel> list = this.labels;
        int iHashCode13 = list == null ? 0 : list.hashCode();
        CoachMarkBean coachMarkBean = this.coachMark;
        int iHashCode14 = coachMarkBean == null ? 0 : coachMarkBean.hashCode();
        HighlightBean highlightBean = this.highlight;
        int iHashCode15 = highlightBean == null ? 0 : highlightBean.hashCode();
        String str8 = this.label;
        int iHashCode16 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.labelColor;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str9 == null ? 0 : str9.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionBean(id=" + this.id + ", transactionType=" + this.transactionType + ", amount=" + this.amount + ", currencyId=" + this.currencyId + ", currency=" + this.currency + ", quoteAmount=" + this.quoteAmount + ", quoteCurrency=" + this.quoteCurrency + ", displayedDescription=" + this.displayedDescription + ", status=" + this.status + ", displayedStatus=" + this.displayedStatus + ", createdDate=" + this.createdDate + ", sign=" + this.sign + ", labels=" + this.labels + ", coachMark=" + this.coachMark + ", highlight=" + this.highlight + ", label=" + this.label + ", labelColor=" + this.labelColor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        TransactionType transactionType = this.transactionType;
        if (transactionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(transactionType.name());
        }
        parcel.writeString(this.amount);
        Integer num = this.currencyId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.currency);
        parcel.writeString(this.quoteAmount);
        parcel.writeString(this.quoteCurrency);
        parcel.writeString(this.displayedDescription);
        parcel.writeString(this.status);
        parcel.writeString(this.displayedStatus);
        Long l = this.createdDate;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num2 = this.sign;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        List<TransactionTagLabel> list = this.labels;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<TransactionTagLabel> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().name());
            }
        }
        CoachMarkBean coachMarkBean = this.coachMark;
        if (coachMarkBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            coachMarkBean.writeToParcel(parcel, i);
        }
        HighlightBean highlightBean = this.highlight;
        if (highlightBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            highlightBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.label);
        parcel.writeString(this.labelColor);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.TransactionBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionBean> serializer() {
            return TransactionBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionBean(int i, String str, TransactionType transactionType, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Integer num2, List list, CoachMarkBean coachMarkBean, HighlightBean highlightBean, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, TransactionBean$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.transactionType = null;
        } else {
            this.transactionType = transactionType;
        }
        if ((i & 4) == 0) {
            this.amount = null;
        } else {
            this.amount = str2;
        }
        if ((i & 8) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = num;
        }
        if ((i & 16) == 0) {
            this.currency = null;
        } else {
            this.currency = str3;
        }
        if ((i & 32) == 0) {
            this.quoteAmount = null;
        } else {
            this.quoteAmount = str4;
        }
        if ((i & 64) == 0) {
            this.quoteCurrency = null;
        } else {
            this.quoteCurrency = str5;
        }
        if ((i & 128) == 0) {
            this.displayedDescription = null;
        } else {
            this.displayedDescription = str6;
        }
        if ((i & 256) == 0) {
            this.status = null;
        } else {
            this.status = str7;
        }
        if ((i & 512) == 0) {
            this.displayedStatus = null;
        } else {
            this.displayedStatus = str8;
        }
        if ((i & 1024) == 0) {
            this.createdDate = null;
        } else {
            this.createdDate = l;
        }
        if ((i & 2048) == 0) {
            this.sign = null;
        } else {
            this.sign = num2;
        }
        if ((i & 4096) == 0) {
            this.labels = null;
        } else {
            this.labels = list;
        }
        if ((i & 8192) == 0) {
            this.coachMark = null;
        } else {
            this.coachMark = coachMarkBean;
        }
        if ((i & 16384) == 0) {
            this.highlight = null;
        } else {
            this.highlight = highlightBean;
        }
        if ((32768 & i) == 0) {
            this.label = null;
        } else {
            this.label = str9;
        }
        if ((i & 65536) == 0) {
            this.labelColor = null;
        } else {
            this.labelColor = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(TransactionBean transactionBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, transactionBean.id);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || transactionBean.transactionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], transactionBean.transactionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || transactionBean.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, transactionBean.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || transactionBean.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, transactionBean.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || transactionBean.currency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, transactionBean.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || transactionBean.quoteAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, transactionBean.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || transactionBean.quoteCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, transactionBean.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || transactionBean.displayedDescription != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, transactionBean.displayedDescription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || transactionBean.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, transactionBean.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || transactionBean.displayedStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, transactionBean.displayedStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || transactionBean.createdDate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.INSTANCE, transactionBean.createdDate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || transactionBean.sign != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, transactionBean.sign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || transactionBean.labels != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], transactionBean.labels);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || transactionBean.coachMark != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, CoachMarkBean$$serializer.INSTANCE, transactionBean.coachMark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || transactionBean.highlight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, HighlightBean$$serializer.INSTANCE, transactionBean.highlight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || transactionBean.label != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, transactionBean.label);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && transactionBean.labelColor == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, transactionBean.labelColor);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: java.util.List<? extends com.okinc.okex.center.bean.enums.TransactionTagLabel> */
    /* JADX WARN: Multi-variable type inference failed */
    public TransactionBean(@NotNull String str, TransactionType transactionType, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Integer num2, List<? extends TransactionTagLabel> list, CoachMarkBean coachMarkBean, HighlightBean highlightBean, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.transactionType = transactionType;
        this.amount = str2;
        this.currencyId = num;
        this.currency = str3;
        this.quoteAmount = str4;
        this.quoteCurrency = str5;
        this.displayedDescription = str6;
        this.status = str7;
        this.displayedStatus = str8;
        this.createdDate = l;
        this.sign = num2;
        this.labels = list;
        this.coachMark = coachMarkBean;
        this.highlight = highlightBean;
        this.label = str9;
        this.labelColor = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ac: CONSTRUCTOR 
  (r19v0 java.lang.String)
  (wrap:com.okinc.okex.center.bean.enums.TransactionType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.enums.TransactionType) : (r20v0 com.okinc.okex.center.bean.enums.TransactionType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0013: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x004b: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r29v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0053: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r30v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005b: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r31v0 java.util.List))
  (wrap:com.okinc.okex.center.bean.CoachMarkBean:?: TERNARY null = ((wrap:int:0x0063: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.CoachMarkBean) : (r32v0 com.okinc.okex.center.bean.CoachMarkBean))
  (wrap:com.okinc.okex.center.bean.HighlightBean:?: TERNARY null = ((wrap:int:0x006b: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.HighlightBean) : (r33v0 com.okinc.okex.center.bean.HighlightBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0081: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) == (0 int)) ? (r35v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, com.okinc.okex.center.bean.enums.TransactionType, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.util.List<? extends com.okinc.okex.center.bean.enums.TransactionTagLabel>, com.okinc.okex.center.bean.CoachMarkBean, com.okinc.okex.center.bean.HighlightBean, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.okex.center.bean.TransactionBean.<init>(java.lang.String, com.okinc.okex.center.bean.enums.TransactionType, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.util.List, com.okinc.okex.center.bean.CoachMarkBean, com.okinc.okex.center.bean.HighlightBean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TransactionBean(String str, TransactionType transactionType, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Integer num2, List list, CoachMarkBean coachMarkBean, HighlightBean highlightBean, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : transactionType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : l, (i & 2048) != 0 ? null : num2, (i & 4096) != 0 ? null : list, (i & 8192) != 0 ? null : coachMarkBean, (i & 16384) != 0 ? null : highlightBean, (i & 32768) != 0 ? null : str9, (i & 65536) == 0 ? str10 : null);
    }
}
