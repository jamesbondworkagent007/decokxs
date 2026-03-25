package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AlertsHighlightsScoreInfo implements Parcelable {
    private final String gradingTitle;
    private final List<String> scoreList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AlertsHighlightsScoreInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<AlertsHighlightsScoreInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertsHighlightsScoreInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AlertsHighlightsScoreInfo(parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertsHighlightsScoreInfo[] newArray(int i) {
            return new AlertsHighlightsScoreInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AlertsHighlightsScoreInfo() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.AlertsHighlightsScoreInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlertsHighlightsScoreInfo copy$default(AlertsHighlightsScoreInfo alertsHighlightsScoreInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alertsHighlightsScoreInfo.gradingTitle;
        }
        if ((i & 2) != 0) {
            list = alertsHighlightsScoreInfo.scoreList;
        }
        return alertsHighlightsScoreInfo.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.gradingTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.scoreList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertsHighlightsScoreInfo copy(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new AlertsHighlightsScoreInfo(str, list);
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
        if (!(obj instanceof AlertsHighlightsScoreInfo)) {
            return false;
        }
        AlertsHighlightsScoreInfo alertsHighlightsScoreInfo = (AlertsHighlightsScoreInfo) obj;
        return Intrinsics.EZpvd((Object) this.gradingTitle, (Object) alertsHighlightsScoreInfo.gradingTitle) && Intrinsics.EZpvd(this.scoreList, alertsHighlightsScoreInfo.scoreList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGradingTitle() {
        return this.gradingTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getScoreList() {
        return this.scoreList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.gradingTitle.hashCode() * 31) + this.scoreList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AlertsHighlightsScoreInfo(gradingTitle=" + this.gradingTitle + ", scoreList=" + this.scoreList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.gradingTitle);
        parcel.writeStringList(this.scoreList);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.AlertsHighlightsScoreInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AlertsHighlightsScoreInfo> serializer() {
            return AlertsHighlightsScoreInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AlertsHighlightsScoreInfo(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.gradingTitle = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.scoreList = yDY.AhwBna();
        } else {
            this.scoreList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(AlertsHighlightsScoreInfo alertsHighlightsScoreInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) alertsHighlightsScoreInfo.gradingTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, alertsHighlightsScoreInfo.gradingTitle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(alertsHighlightsScoreInfo.scoreList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], alertsHighlightsScoreInfo.scoreList);
    }

    public AlertsHighlightsScoreInfo(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.gradingTitle = str;
        this.scoreList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:104)) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:102) call: com.okinc.business.invest_biz.data.bean.AlertsHighlightsScoreInfo.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ AlertsHighlightsScoreInfo(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
