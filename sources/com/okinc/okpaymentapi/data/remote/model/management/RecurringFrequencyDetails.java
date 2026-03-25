package com.okinc.okpaymentapi.data.remote.model.management;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class RecurringFrequencyDetails implements Parcelable {
    private final int code;
    private final List<RecurringFrequency> data;
    private final String detailMsg;
    private final String error_code;
    private final String msg;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringFrequencyDetails> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(RecurringFrequency$$serializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<RecurringFrequencyDetails> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringFrequencyDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(RecurringFrequency.CREATOR.createFromParcel(parcel));
            }
            return new RecurringFrequencyDetails(i, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringFrequencyDetails[] newArray(int i) {
            return new RecurringFrequencyDetails[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.okpaymentapi.data.remote.model.management.RecurringFrequencyDetails */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringFrequencyDetails copy$default(RecurringFrequencyDetails recurringFrequencyDetails, int i, List list, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recurringFrequencyDetails.code;
        }
        if ((i2 & 2) != 0) {
            list = recurringFrequencyDetails.data;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            str = recurringFrequencyDetails.detailMsg;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = recurringFrequencyDetails.error_code;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = recurringFrequencyDetails.msg;
        }
        return recurringFrequencyDetails.copy(i, list2, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecurringFrequency> component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.detailMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.error_code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringFrequencyDetails copy(int i, @NotNull List<RecurringFrequency> list, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new RecurringFrequencyDetails(i, list, str, str2, str3);
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
        if (!(obj instanceof RecurringFrequencyDetails)) {
            return false;
        }
        RecurringFrequencyDetails recurringFrequencyDetails = (RecurringFrequencyDetails) obj;
        return this.code == recurringFrequencyDetails.code && Intrinsics.EZpvd(this.data, recurringFrequencyDetails.data) && Intrinsics.EZpvd((Object) this.detailMsg, (Object) recurringFrequencyDetails.detailMsg) && Intrinsics.EZpvd((Object) this.error_code, (Object) recurringFrequencyDetails.error_code) && Intrinsics.EZpvd((Object) this.msg, (Object) recurringFrequencyDetails.msg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecurringFrequency> getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetailMsg() {
        return this.detailMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getError_code() {
        return this.error_code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Integer.hashCode(this.code) * 31) + this.data.hashCode()) * 31) + this.detailMsg.hashCode()) * 31) + this.error_code.hashCode()) * 31) + this.msg.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringFrequencyDetails(code=" + this.code + ", data=" + this.data + ", detailMsg=" + this.detailMsg + ", error_code=" + this.error_code + ", msg=" + this.msg + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.code);
        List<RecurringFrequency> list = this.data;
        parcel.writeInt(list.size());
        Iterator<RecurringFrequency> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.detailMsg);
        parcel.writeString(this.error_code);
        parcel.writeString(this.msg);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.RecurringFrequencyDetails.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringFrequencyDetails> serializer() {
            return RecurringFrequencyDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringFrequencyDetails(int i, int i2, List list, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, RecurringFrequencyDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.code = i2;
        this.data = list;
        this.detailMsg = str;
        this.error_code = str2;
        this.msg = str3;
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(RecurringFrequencyDetails recurringFrequencyDetails, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, recurringFrequencyDetails.code);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], recurringFrequencyDetails.data);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, recurringFrequencyDetails.detailMsg);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, recurringFrequencyDetails.error_code);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, recurringFrequencyDetails.msg);
    }

    public RecurringFrequencyDetails(int i, @NotNull List<RecurringFrequency> list, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.code = i;
        this.data = list;
        this.detailMsg = str;
        this.error_code = str2;
        this.msg = str3;
    }
}
