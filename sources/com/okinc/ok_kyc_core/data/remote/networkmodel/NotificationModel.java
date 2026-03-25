package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.ok_kyc_core_api.model.FAQModel;
import com.okinc.ok_kyc_core_api.model.FAQModel$$serializer;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class NotificationModel implements Parcelable {
    private ArrayList<String> conditions;
    private FAQModel faq;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<NotificationModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<NotificationModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NotificationModel(parcel.createStringArrayList(), (FAQModel) parcel.readParcelable(NotificationModel.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationModel[] newArray(int i) {
            return new NotificationModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationModel() {
        this((ArrayList) null, (FAQModel) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationModel copy$default(NotificationModel notificationModel, ArrayList arrayList, FAQModel fAQModel, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = notificationModel.conditions;
        }
        if ((i & 2) != 0) {
            fAQModel = notificationModel.faq;
        }
        return notificationModel.copy(arrayList, fAQModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component1() {
        return this.conditions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FAQModel component2() {
        return this.faq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationModel copy(ArrayList<String> arrayList, FAQModel fAQModel) {
        return new NotificationModel(arrayList, fAQModel);
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
        if (!(obj instanceof NotificationModel)) {
            return false;
        }
        NotificationModel notificationModel = (NotificationModel) obj;
        return Intrinsics.EZpvd(this.conditions, notificationModel.conditions) && Intrinsics.EZpvd(this.faq, notificationModel.faq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getConditions() {
        return this.conditions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FAQModel getFaq() {
        return this.faq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArrayList<String> arrayList = this.conditions;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        FAQModel fAQModel = this.faq;
        return (iHashCode * 31) + (fAQModel != null ? fAQModel.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConditions(ArrayList<String> arrayList) {
        this.conditions = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaq(FAQModel fAQModel) {
        this.faq = fAQModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NotificationModel(conditions=" + this.conditions + ", faq=" + this.faq + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.conditions);
        parcel.writeParcelable(this.faq, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NotificationModel> serializer() {
            return NotificationModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NotificationModel(int i, ArrayList arrayList, FAQModel fAQModel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.conditions = null;
        } else {
            this.conditions = arrayList;
        }
        if ((i & 2) == 0) {
            this.faq = null;
        } else {
            this.faq = fAQModel;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(NotificationModel notificationModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || notificationModel.conditions != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], notificationModel.conditions);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && notificationModel.faq == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, FAQModel$$serializer.INSTANCE, notificationModel.faq);
    }

    public NotificationModel(ArrayList<String> arrayList, FAQModel fAQModel) {
        this.conditions = arrayList;
        this.faq = fAQModel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r2v0 java.util.ArrayList))
  (wrap:com.okinc.ok_kyc_core_api.model.FAQModel:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core_api.model.FAQModel) : (r3v0 com.okinc.ok_kyc_core_api.model.FAQModel))
 A[MD:(java.util.ArrayList<java.lang.String>, com.okinc.ok_kyc_core_api.model.FAQModel):void (m)] (LINE:29) call: com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationModel.<init>(java.util.ArrayList, com.okinc.ok_kyc_core_api.model.FAQModel):void type: THIS */
    public /* synthetic */ NotificationModel(ArrayList arrayList, FAQModel fAQModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : fAQModel);
    }
}
