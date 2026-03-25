package com.okinc.ok_kyc_core.data.travel_rule;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class ExchangeReminderGroupBean implements Parcelable {
    private String name;
    private ArrayList<ExchangeReminderBean> values;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ExchangeReminderGroupBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(ExchangeReminderBean$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<ExchangeReminderGroupBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeReminderGroupBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ExchangeReminderBean.CREATOR.createFromParcel(parcel));
            }
            return new ExchangeReminderGroupBean(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeReminderGroupBean[] newArray(int i) {
            return new ExchangeReminderGroupBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ExchangeReminderGroupBean() {
        this((String) null, (ArrayList) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.ok_kyc_core.data.travel_rule.ExchangeReminderGroupBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExchangeReminderGroupBean copy$default(ExchangeReminderGroupBean exchangeReminderGroupBean, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exchangeReminderGroupBean.name;
        }
        if ((i & 2) != 0) {
            arrayList = exchangeReminderGroupBean.values;
        }
        return exchangeReminderGroupBean.copy(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ExchangeReminderBean> component2() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeReminderGroupBean copy(@NotNull String str, @NotNull ArrayList<ExchangeReminderBean> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new ExchangeReminderGroupBean(str, arrayList);
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
        if (!(obj instanceof ExchangeReminderGroupBean)) {
            return false;
        }
        ExchangeReminderGroupBean exchangeReminderGroupBean = (ExchangeReminderGroupBean) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) exchangeReminderGroupBean.name) && Intrinsics.EZpvd(this.values, exchangeReminderGroupBean.values);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ExchangeReminderBean> getValues() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.name.hashCode() * 31) + this.values.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValues(@NotNull ArrayList<ExchangeReminderBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.values = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExchangeReminderGroupBean(name=" + this.name + ", values=" + this.values + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        ArrayList<ExchangeReminderBean> arrayList = this.values;
        parcel.writeInt(arrayList.size());
        Iterator<ExchangeReminderBean> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.travel_rule.ExchangeReminderGroupBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExchangeReminderGroupBean> serializer() {
            return ExchangeReminderGroupBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExchangeReminderGroupBean(int i, String str, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        this.name = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.values = new ArrayList<>();
        } else {
            this.values = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ExchangeReminderGroupBean exchangeReminderGroupBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) exchangeReminderGroupBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, exchangeReminderGroupBean.name);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(exchangeReminderGroupBean.values, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], exchangeReminderGroupBean.values);
    }

    public ExchangeReminderGroupBean(@NotNull String str, @NotNull ArrayList<ExchangeReminderBean> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.name = str;
        this.values = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:21) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.util.ArrayList<com.okinc.ok_kyc_core.data.travel_rule.ExchangeReminderBean>):void (m)] (LINE:19) call: com.okinc.ok_kyc_core.data.travel_rule.ExchangeReminderGroupBean.<init>(java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ ExchangeReminderGroupBean(String str, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : arrayList);
    }
}
