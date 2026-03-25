package com.okinc.okex.lite.onboarding.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okex.lite.onboarding.api.TradingModeBean;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class TradingModeRecommendationBean implements Parcelable {
    private final Boolean applicableToDisplayQuestionnaire;
    private TradingModeBean initialPreference;
    private List<QuestionnaireResponses> questionnaires;
    private TradingModeBean recommend;
    private SegmentationRecommendationStatus status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradingModeRecommendationBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(QuestionnaireResponses$$serializer.INSTANCE), null, EnumsKt.createSimpleEnumSerializer("com.okinc.okex.lite.onboarding.api.TradingModeBean", TradingModeBean.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.okex.lite.onboarding.bean.SegmentationRecommendationStatus", SegmentationRecommendationStatus.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.okex.lite.onboarding.api.TradingModeBean", TradingModeBean.values())};

    public static final class Creator implements Parcelable.Creator<TradingModeRecommendationBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradingModeRecommendationBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(QuestionnaireResponses.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new TradingModeRecommendationBean(arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), (TradingModeBean) parcel.readParcelable(TradingModeRecommendationBean.class.getClassLoader()), parcel.readInt() != 0 ? SegmentationRecommendationStatus.valueOf(parcel.readString()) : null, (TradingModeBean) parcel.readParcelable(TradingModeRecommendationBean.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradingModeRecommendationBean[] newArray(int i) {
            return new TradingModeRecommendationBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.okex.lite.onboarding.bean.TradingModeRecommendationBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TradingModeRecommendationBean copy$default(TradingModeRecommendationBean tradingModeRecommendationBean, List list, Boolean bool, TradingModeBean tradingModeBean, SegmentationRecommendationStatus segmentationRecommendationStatus, TradingModeBean tradingModeBean2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tradingModeRecommendationBean.questionnaires;
        }
        if ((i & 2) != 0) {
            bool = tradingModeRecommendationBean.applicableToDisplayQuestionnaire;
        }
        Boolean bool2 = bool;
        if ((i & 4) != 0) {
            tradingModeBean = tradingModeRecommendationBean.recommend;
        }
        TradingModeBean tradingModeBean3 = tradingModeBean;
        if ((i & 8) != 0) {
            segmentationRecommendationStatus = tradingModeRecommendationBean.status;
        }
        SegmentationRecommendationStatus segmentationRecommendationStatus2 = segmentationRecommendationStatus;
        if ((i & 16) != 0) {
            tradingModeBean2 = tradingModeRecommendationBean.initialPreference;
        }
        return tradingModeRecommendationBean.copy(list, bool2, tradingModeBean3, segmentationRecommendationStatus2, tradingModeBean2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<QuestionnaireResponses> component1() {
        return this.questionnaires;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.applicableToDisplayQuestionnaire;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingModeBean component3() {
        return this.recommend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SegmentationRecommendationStatus component4() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingModeBean component5() {
        return this.initialPreference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingModeRecommendationBean copy(List<QuestionnaireResponses> list, Boolean bool, TradingModeBean tradingModeBean, SegmentationRecommendationStatus segmentationRecommendationStatus, TradingModeBean tradingModeBean2) {
        return new TradingModeRecommendationBean(list, bool, tradingModeBean, segmentationRecommendationStatus, tradingModeBean2);
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
        if (!(obj instanceof TradingModeRecommendationBean)) {
            return false;
        }
        TradingModeRecommendationBean tradingModeRecommendationBean = (TradingModeRecommendationBean) obj;
        return Intrinsics.EZpvd(this.questionnaires, tradingModeRecommendationBean.questionnaires) && Intrinsics.EZpvd(this.applicableToDisplayQuestionnaire, tradingModeRecommendationBean.applicableToDisplayQuestionnaire) && this.recommend == tradingModeRecommendationBean.recommend && this.status == tradingModeRecommendationBean.status && this.initialPreference == tradingModeRecommendationBean.initialPreference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getApplicableToDisplayQuestionnaire() {
        return this.applicableToDisplayQuestionnaire;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingModeBean getInitialPreference() {
        return this.initialPreference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<QuestionnaireResponses> getQuestionnaires() {
        return this.questionnaires;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingModeBean getRecommend() {
        return this.recommend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SegmentationRecommendationStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<QuestionnaireResponses> list = this.questionnaires;
        int iHashCode = list == null ? 0 : list.hashCode();
        Boolean bool = this.applicableToDisplayQuestionnaire;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        TradingModeBean tradingModeBean = this.recommend;
        int iHashCode3 = tradingModeBean == null ? 0 : tradingModeBean.hashCode();
        SegmentationRecommendationStatus segmentationRecommendationStatus = this.status;
        int iHashCode4 = segmentationRecommendationStatus == null ? 0 : segmentationRecommendationStatus.hashCode();
        TradingModeBean tradingModeBean2 = this.initialPreference;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (tradingModeBean2 != null ? tradingModeBean2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitialPreference(TradingModeBean tradingModeBean) {
        this.initialPreference = tradingModeBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuestionnaires(List<QuestionnaireResponses> list) {
        this.questionnaires = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommend(TradingModeBean tradingModeBean) {
        this.recommend = tradingModeBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(SegmentationRecommendationStatus segmentationRecommendationStatus) {
        this.status = segmentationRecommendationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradingModeRecommendationBean(questionnaires=" + this.questionnaires + ", applicableToDisplayQuestionnaire=" + this.applicableToDisplayQuestionnaire + ", recommend=" + this.recommend + ", status=" + this.status + ", initialPreference=" + this.initialPreference + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<QuestionnaireResponses> list = this.questionnaires;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<QuestionnaireResponses> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.applicableToDisplayQuestionnaire;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.recommend, i);
        SegmentationRecommendationStatus segmentationRecommendationStatus = this.status;
        if (segmentationRecommendationStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(segmentationRecommendationStatus.name());
        }
        parcel.writeParcelable(this.initialPreference, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.onboarding.bean.TradingModeRecommendationBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradingModeRecommendationBean> serializer() {
            return TradingModeRecommendationBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradingModeRecommendationBean(int i, List list, Boolean bool, TradingModeBean tradingModeBean, SegmentationRecommendationStatus segmentationRecommendationStatus, TradingModeBean tradingModeBean2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, TradingModeRecommendationBean$$serializer.INSTANCE.getDescriptor());
        }
        this.questionnaires = list;
        this.applicableToDisplayQuestionnaire = bool;
        this.recommend = tradingModeBean;
        this.status = segmentationRecommendationStatus;
        this.initialPreference = tradingModeBean2;
    }

    public static final /* synthetic */ void write$Self$OKOnboarding_onboarding_impl(TradingModeRecommendationBean tradingModeRecommendationBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], tradingModeRecommendationBean.questionnaires);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, tradingModeRecommendationBean.applicableToDisplayQuestionnaire);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], tradingModeRecommendationBean.recommend);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], tradingModeRecommendationBean.status);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], tradingModeRecommendationBean.initialPreference);
    }

    public TradingModeRecommendationBean(List<QuestionnaireResponses> list, Boolean bool, TradingModeBean tradingModeBean, SegmentationRecommendationStatus segmentationRecommendationStatus, TradingModeBean tradingModeBean2) {
        this.questionnaires = list;
        this.applicableToDisplayQuestionnaire = bool;
        this.recommend = tradingModeBean;
        this.status = segmentationRecommendationStatus;
        this.initialPreference = tradingModeBean2;
    }
}
