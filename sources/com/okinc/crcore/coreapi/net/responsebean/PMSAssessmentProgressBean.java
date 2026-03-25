package com.okinc.crcore.coreapi.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PMSAssessmentProgressBean implements Parcelable {
    public static final int $stable = 0;
    private final String pillarId;
    private final String pillarType;
    private final String questionId;
    private final String status;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PMSAssessmentProgressBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PMSAssessmentProgressBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PMSAssessmentProgressBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PMSAssessmentProgressBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PMSAssessmentProgressBean[] newArray(int i) {
            return new PMSAssessmentProgressBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PMSAssessmentProgressBean copy$default(PMSAssessmentProgressBean pMSAssessmentProgressBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pMSAssessmentProgressBean.pillarId;
        }
        if ((i & 2) != 0) {
            str2 = pMSAssessmentProgressBean.pillarType;
        }
        if ((i & 4) != 0) {
            str3 = pMSAssessmentProgressBean.questionId;
        }
        if ((i & 8) != 0) {
            str4 = pMSAssessmentProgressBean.status;
        }
        return pMSAssessmentProgressBean.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pillarId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pillarType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.questionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PMSAssessmentProgressBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new PMSAssessmentProgressBean(str, str2, str3, str4);
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
        if (!(obj instanceof PMSAssessmentProgressBean)) {
            return false;
        }
        PMSAssessmentProgressBean pMSAssessmentProgressBean = (PMSAssessmentProgressBean) obj;
        return Intrinsics.EZpvd((Object) this.pillarId, (Object) pMSAssessmentProgressBean.pillarId) && Intrinsics.EZpvd((Object) this.pillarType, (Object) pMSAssessmentProgressBean.pillarType) && Intrinsics.EZpvd((Object) this.questionId, (Object) pMSAssessmentProgressBean.questionId) && Intrinsics.EZpvd((Object) this.status, (Object) pMSAssessmentProgressBean.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPillarId() {
        return this.pillarId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPillarType() {
        return this.pillarType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuestionId() {
        return this.questionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.pillarId.hashCode() * 31) + this.pillarType.hashCode()) * 31) + this.questionId.hashCode()) * 31) + this.status.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PMSAssessmentProgressBean(pillarId=" + this.pillarId + ", pillarType=" + this.pillarType + ", questionId=" + this.questionId + ", status=" + this.status + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.pillarId);
        parcel.writeString(this.pillarType);
        parcel.writeString(this.questionId);
        parcel.writeString(this.status);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.PMSAssessmentProgressBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PMSAssessmentProgressBean> serializer() {
            return PMSAssessmentProgressBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PMSAssessmentProgressBean(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, PMSAssessmentProgressBean$$serializer.INSTANCE.getDescriptor());
        }
        this.pillarId = str;
        this.pillarType = str2;
        this.questionId = str3;
        this.status = str4;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(PMSAssessmentProgressBean pMSAssessmentProgressBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, pMSAssessmentProgressBean.pillarId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, pMSAssessmentProgressBean.pillarType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, pMSAssessmentProgressBean.questionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, pMSAssessmentProgressBean.status);
    }

    public PMSAssessmentProgressBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.pillarId = str;
        this.pillarType = str2;
        this.questionId = str3;
        this.status = str4;
    }
}
