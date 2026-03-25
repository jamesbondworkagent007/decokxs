package com.okinc.okex.center.ui.displaymodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okex.center.bean.CoachMarkBean;
import com.okinc.okex.center.bean.CoachMarkBean$$serializer;
import com.okinc.okex.center.bean.HighlightBean;
import com.okinc.okex.center.bean.HighlightBean$$serializer;
import com.okinc.okex.center.bean.enums.TransactionTagLabel;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.adapter.ActivityHighlightCardAdapter;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class TransactionDisplayModel extends ActivityHighlightCardAdapter.TaskDescription implements Parcelable {
    private final CoachMarkBean coachMarkBean;
    private final String contextualCause;
    private final String contextualIconUrl;
    private final Integer currencyId;
    private final String displayAmount;
    private final boolean displayAmountFullColour;
    private final String displayAmountHeader;
    private final String displayDate;
    private final String displayDateTime;
    private final String displayDescription;
    private final String displayStatus;
    private final String displayTransactionTag;
    private final HighlightBean highlightBean;
    private final String id;
    private final String label;
    private final String labelColor;
    private final String statusValue;
    private final List<TransactionBannerDisplayModel> transactionBanners;
    private final TransactionTagLabel transactionTag;
    private final TransactionType transactionType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TransactionDisplayModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, TransactionType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, TransactionTagLabel.Companion.serializer(), null, new ArrayListSerializer(TransactionBannerDisplayModel$$serializer.INSTANCE), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<TransactionDisplayModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionDisplayModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            TransactionType transactionTypeValueOf = TransactionType.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            TransactionTagLabel transactionTagLabelValueOf = TransactionTagLabel.valueOf(parcel.readString());
            String string10 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(TransactionBannerDisplayModel.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            return new TransactionDisplayModel(string, transactionTypeValueOf, string2, string3, z, numValueOf, string4, string5, string6, string7, string8, string9, transactionTagLabelValueOf, string10, arrayList, parcel.readInt() == 0 ? null : CoachMarkBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : HighlightBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionDisplayModel[] newArray(int i) {
            return new TransactionDisplayModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.displayDateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.contextualCause;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.contextualIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionTagLabel component13() {
        return this.transactionTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.displayTransactionTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionBannerDisplayModel> component15() {
        return this.transactionBanners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoachMarkBean component16() {
        return this.coachMarkBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HighlightBean component17() {
        return this.highlightBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.labelColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionType component2() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.displayDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.displayAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.displayAmountHeader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.displayAmountFullColour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.displayDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.statusValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.displayStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionDisplayModel copy(@NotNull String str, @NotNull TransactionType transactionType, @NotNull String str2, @NotNull String str3, boolean z, Integer num, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull TransactionTagLabel transactionTagLabel, @NotNull String str10, @NotNull List<TransactionBannerDisplayModel> list, CoachMarkBean coachMarkBean, HighlightBean highlightBean, String str11, String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(transactionTagLabel, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str13, "");
        return new TransactionDisplayModel(str, transactionType, str2, str3, z, num, str4, str5, str6, str7, str8, str9, transactionTagLabel, str10, list, coachMarkBean, highlightBean, str11, str12, str13);
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
        if (!(obj instanceof TransactionDisplayModel)) {
            return false;
        }
        TransactionDisplayModel transactionDisplayModel = (TransactionDisplayModel) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) transactionDisplayModel.id) && this.transactionType == transactionDisplayModel.transactionType && Intrinsics.EZpvd((Object) this.displayAmount, (Object) transactionDisplayModel.displayAmount) && Intrinsics.EZpvd((Object) this.displayAmountHeader, (Object) transactionDisplayModel.displayAmountHeader) && this.displayAmountFullColour == transactionDisplayModel.displayAmountFullColour && Intrinsics.EZpvd(this.currencyId, transactionDisplayModel.currencyId) && Intrinsics.EZpvd((Object) this.displayDescription, (Object) transactionDisplayModel.displayDescription) && Intrinsics.EZpvd((Object) this.statusValue, (Object) transactionDisplayModel.statusValue) && Intrinsics.EZpvd((Object) this.displayStatus, (Object) transactionDisplayModel.displayStatus) && Intrinsics.EZpvd((Object) this.displayDateTime, (Object) transactionDisplayModel.displayDateTime) && Intrinsics.EZpvd((Object) this.contextualCause, (Object) transactionDisplayModel.contextualCause) && Intrinsics.EZpvd((Object) this.contextualIconUrl, (Object) transactionDisplayModel.contextualIconUrl) && this.transactionTag == transactionDisplayModel.transactionTag && Intrinsics.EZpvd((Object) this.displayTransactionTag, (Object) transactionDisplayModel.displayTransactionTag) && Intrinsics.EZpvd(this.transactionBanners, transactionDisplayModel.transactionBanners) && Intrinsics.EZpvd(this.coachMarkBean, transactionDisplayModel.coachMarkBean) && Intrinsics.EZpvd(this.highlightBean, transactionDisplayModel.highlightBean) && Intrinsics.EZpvd((Object) this.label, (Object) transactionDisplayModel.label) && Intrinsics.EZpvd((Object) this.labelColor, (Object) transactionDisplayModel.labelColor) && Intrinsics.EZpvd((Object) this.displayDate, (Object) transactionDisplayModel.displayDate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoachMarkBean getCoachMarkBean() {
        return this.coachMarkBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContextualCause() {
        return this.contextualCause;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContextualIconUrl() {
        return this.contextualIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayAmount() {
        return this.displayAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDisplayAmountFullColour() {
        return this.displayAmountFullColour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayAmountHeader() {
        return this.displayAmountHeader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayDate() {
        return this.displayDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayDateTime() {
        return this.displayDateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayDescription() {
        return this.displayDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayStatus() {
        return this.displayStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayTransactionTag() {
        return this.displayTransactionTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HighlightBean getHighlightBean() {
        return this.highlightBean;
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
    public final String getStatusValue() {
        return this.statusValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionBannerDisplayModel> getTransactionBanners() {
        return this.transactionBanners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionTagLabel getTransactionTag() {
        return this.transactionTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionType getTransactionType() {
        return this.transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.transactionType.hashCode();
        int iHashCode3 = this.displayAmount.hashCode();
        int iHashCode4 = this.displayAmountHeader.hashCode();
        int iHashCode5 = Boolean.hashCode(this.displayAmountFullColour);
        Integer num = this.currencyId;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        int iHashCode7 = this.displayDescription.hashCode();
        int iHashCode8 = this.statusValue.hashCode();
        int iHashCode9 = this.displayStatus.hashCode();
        int iHashCode10 = this.displayDateTime.hashCode();
        int iHashCode11 = this.contextualCause.hashCode();
        int iHashCode12 = this.contextualIconUrl.hashCode();
        int iHashCode13 = this.transactionTag.hashCode();
        int iHashCode14 = this.displayTransactionTag.hashCode();
        int iHashCode15 = this.transactionBanners.hashCode();
        CoachMarkBean coachMarkBean = this.coachMarkBean;
        int iHashCode16 = coachMarkBean == null ? 0 : coachMarkBean.hashCode();
        HighlightBean highlightBean = this.highlightBean;
        int iHashCode17 = highlightBean == null ? 0 : highlightBean.hashCode();
        String str = this.label;
        int iHashCode18 = str == null ? 0 : str.hashCode();
        String str2 = this.labelColor;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.displayDate.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionDisplayModel(id=" + this.id + ", transactionType=" + this.transactionType + ", displayAmount=" + this.displayAmount + ", displayAmountHeader=" + this.displayAmountHeader + ", displayAmountFullColour=" + this.displayAmountFullColour + ", currencyId=" + this.currencyId + ", displayDescription=" + this.displayDescription + ", statusValue=" + this.statusValue + ", displayStatus=" + this.displayStatus + ", displayDateTime=" + this.displayDateTime + ", contextualCause=" + this.contextualCause + ", contextualIconUrl=" + this.contextualIconUrl + ", transactionTag=" + this.transactionTag + ", displayTransactionTag=" + this.displayTransactionTag + ", transactionBanners=" + this.transactionBanners + ", coachMarkBean=" + this.coachMarkBean + ", highlightBean=" + this.highlightBean + ", label=" + this.label + ", labelColor=" + this.labelColor + ", displayDate=" + this.displayDate + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.transactionType.name());
        parcel.writeString(this.displayAmount);
        parcel.writeString(this.displayAmountHeader);
        parcel.writeInt(this.displayAmountFullColour ? 1 : 0);
        Integer num = this.currencyId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.displayDescription);
        parcel.writeString(this.statusValue);
        parcel.writeString(this.displayStatus);
        parcel.writeString(this.displayDateTime);
        parcel.writeString(this.contextualCause);
        parcel.writeString(this.contextualIconUrl);
        parcel.writeString(this.transactionTag.name());
        parcel.writeString(this.displayTransactionTag);
        List<TransactionBannerDisplayModel> list = this.transactionBanners;
        parcel.writeInt(list.size());
        Iterator<TransactionBannerDisplayModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        CoachMarkBean coachMarkBean = this.coachMarkBean;
        if (coachMarkBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            coachMarkBean.writeToParcel(parcel, i);
        }
        HighlightBean highlightBean = this.highlightBean;
        if (highlightBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            highlightBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.label);
        parcel.writeString(this.labelColor);
        parcel.writeString(this.displayDate);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionDisplayModel> serializer() {
            return TransactionDisplayModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionDisplayModel(int i, String str, TransactionType transactionType, String str2, String str3, boolean z, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, TransactionTagLabel transactionTagLabel, String str10, List list, CoachMarkBean coachMarkBean, HighlightBean highlightBean, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, TransactionDisplayModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.transactionType = (i & 2) == 0 ? TransactionType.Unknown : transactionType;
        if ((i & 4) == 0) {
            this.displayAmount = "";
        } else {
            this.displayAmount = str2;
        }
        if ((i & 8) == 0) {
            this.displayAmountHeader = "";
        } else {
            this.displayAmountHeader = str3;
        }
        if ((i & 16) == 0) {
            this.displayAmountFullColour = true;
        } else {
            this.displayAmountFullColour = z;
        }
        if ((i & 32) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = num;
        }
        if ((i & 64) == 0) {
            this.displayDescription = "";
        } else {
            this.displayDescription = str4;
        }
        if ((i & 128) == 0) {
            this.statusValue = "";
        } else {
            this.statusValue = str5;
        }
        if ((i & 256) == 0) {
            this.displayStatus = "";
        } else {
            this.displayStatus = str6;
        }
        if ((i & 512) == 0) {
            this.displayDateTime = "";
        } else {
            this.displayDateTime = str7;
        }
        if ((i & 1024) == 0) {
            this.contextualCause = "";
        } else {
            this.contextualCause = str8;
        }
        if ((i & 2048) == 0) {
            this.contextualIconUrl = "";
        } else {
            this.contextualIconUrl = str9;
        }
        this.transactionTag = (i & 4096) == 0 ? TransactionTagLabel.NoTag : transactionTagLabel;
        if ((i & 8192) == 0) {
            this.displayTransactionTag = "";
        } else {
            this.displayTransactionTag = str10;
        }
        this.transactionBanners = (i & 16384) == 0 ? yDY.AhwBna() : list;
        if ((32768 & i) == 0) {
            this.coachMarkBean = null;
        } else {
            this.coachMarkBean = coachMarkBean;
        }
        if ((65536 & i) == 0) {
            this.highlightBean = null;
        } else {
            this.highlightBean = highlightBean;
        }
        if ((131072 & i) == 0) {
            this.label = null;
        } else {
            this.label = str11;
        }
        if ((262144 & i) == 0) {
            this.labelColor = null;
        } else {
            this.labelColor = str12;
        }
        if ((i & 524288) == 0) {
            this.displayDate = "";
        } else {
            this.displayDate = str13;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [28=4] */
    public static final /* synthetic */ void write$Self$OKSupport_support_impl(TransactionDisplayModel transactionDisplayModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, transactionDisplayModel.id);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || transactionDisplayModel.transactionType != TransactionType.Unknown) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], transactionDisplayModel.transactionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) transactionDisplayModel.displayAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, transactionDisplayModel.displayAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) transactionDisplayModel.displayAmountHeader, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, transactionDisplayModel.displayAmountHeader);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !transactionDisplayModel.displayAmountFullColour) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, transactionDisplayModel.displayAmountFullColour);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || transactionDisplayModel.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, transactionDisplayModel.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) transactionDisplayModel.displayDescription, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, transactionDisplayModel.displayDescription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) transactionDisplayModel.statusValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, transactionDisplayModel.statusValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) transactionDisplayModel.displayStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, transactionDisplayModel.displayStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) transactionDisplayModel.displayDateTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, transactionDisplayModel.displayDateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) transactionDisplayModel.contextualCause, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, transactionDisplayModel.contextualCause);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) transactionDisplayModel.contextualIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, transactionDisplayModel.contextualIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || transactionDisplayModel.transactionTag != TransactionTagLabel.NoTag) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], transactionDisplayModel.transactionTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) transactionDisplayModel.displayTransactionTag, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, transactionDisplayModel.displayTransactionTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(transactionDisplayModel.transactionBanners, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], transactionDisplayModel.transactionBanners);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || transactionDisplayModel.coachMarkBean != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, CoachMarkBean$$serializer.INSTANCE, transactionDisplayModel.coachMarkBean);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || transactionDisplayModel.highlightBean != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, HighlightBean$$serializer.INSTANCE, transactionDisplayModel.highlightBean);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || transactionDisplayModel.label != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, transactionDisplayModel.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || transactionDisplayModel.labelColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, transactionDisplayModel.labelColor);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) && Intrinsics.EZpvd((Object) transactionDisplayModel.displayDate, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 19, transactionDisplayModel.displayDate);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00d9: CONSTRUCTOR 
  (r22v0 java.lang.String)
  (wrap:com.okinc.okex.center.bean.enums.TransactionType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:33) com.okinc.okex.center.bean.enums.TransactionType.Unknown com.okinc.okex.center.bean.enums.TransactionType) : (r23v0 com.okinc.okex.center.bean.enums.TransactionType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r42v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r42v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r26v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0025: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r27v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r42v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r42v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:com.okinc.okex.center.bean.enums.TransactionTagLabel:?: TERNARY null = ((wrap:int:0x005d: ARITH (r42v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0061: SGET  A[WRAPPED] (LINE:50) com.okinc.okex.center.bean.enums.TransactionTagLabel.NoTag com.okinc.okex.center.bean.enums.TransactionTagLabel) : (r34v0 com.okinc.okex.center.bean.enums.TransactionTagLabel))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006e: ARITH (r42v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0072: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:52)) : (r36v0 java.util.List))
  (wrap:com.okinc.okex.center.bean.CoachMarkBean:?: TERNARY null = ((wrap:int:0x007c: ARITH (r42v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.CoachMarkBean) : (r37v0 com.okinc.okex.center.bean.CoachMarkBean))
  (wrap:com.okinc.okex.center.bean.HighlightBean:?: TERNARY null = ((wrap:int:0x0087: ARITH (r42v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.HighlightBean) : (r38v0 com.okinc.okex.center.bean.HighlightBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r42v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009d: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r42v0 int) & (524288 int) A[WRAPPED]) == (0 int)) ? (r41v0 java.lang.String) : (""))
 A[MD:(java.lang.String, com.okinc.okex.center.bean.enums.TransactionType, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.center.bean.enums.TransactionTagLabel, java.lang.String, java.util.List<com.okinc.okex.center.ui.displaymodels.TransactionBannerDisplayModel>, com.okinc.okex.center.bean.CoachMarkBean, com.okinc.okex.center.bean.HighlightBean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:31) call: com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel.<init>(java.lang.String, com.okinc.okex.center.bean.enums.TransactionType, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.center.bean.enums.TransactionTagLabel, java.lang.String, java.util.List, com.okinc.okex.center.bean.CoachMarkBean, com.okinc.okex.center.bean.HighlightBean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TransactionDisplayModel(String str, TransactionType transactionType, String str2, String str3, boolean z, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, TransactionTagLabel transactionTagLabel, String str10, List list, CoachMarkBean coachMarkBean, HighlightBean highlightBean, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? TransactionType.Unknown : transactionType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : num, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? TransactionTagLabel.NoTag : transactionTagLabel, (i & 8192) != 0 ? "" : str10, (i & 16384) != 0 ? yDY.AhwBna() : list, (i & 32768) != 0 ? null : coachMarkBean, (i & 65536) != 0 ? null : highlightBean, (i & 131072) != 0 ? null : str11, (i & 262144) != 0 ? null : str12, (i & 524288) == 0 ? str13 : "");
    }

    public TransactionDisplayModel(@NotNull String str, @NotNull TransactionType transactionType, @NotNull String str2, @NotNull String str3, boolean z, Integer num, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull TransactionTagLabel transactionTagLabel, @NotNull String str10, @NotNull List<TransactionBannerDisplayModel> list, CoachMarkBean coachMarkBean, HighlightBean highlightBean, String str11, String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(transactionTagLabel, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str13, "");
        this.id = str;
        this.transactionType = transactionType;
        this.displayAmount = str2;
        this.displayAmountHeader = str3;
        this.displayAmountFullColour = z;
        this.currencyId = num;
        this.displayDescription = str4;
        this.statusValue = str5;
        this.displayStatus = str6;
        this.displayDateTime = str7;
        this.contextualCause = str8;
        this.contextualIconUrl = str9;
        this.transactionTag = transactionTagLabel;
        this.displayTransactionTag = str10;
        this.transactionBanners = list;
        this.coachMarkBean = coachMarkBean;
        this.highlightBean = highlightBean;
        this.label = str11;
        this.labelColor = str12;
        this.displayDate = str13;
    }
}
