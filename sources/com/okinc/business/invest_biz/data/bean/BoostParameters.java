package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class BoostParameters implements Parcelable {
    private final List<String> gainsTokenList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BoostParameters> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<BoostParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BoostParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BoostParameters(parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BoostParameters[] newArray(int i) {
            return new BoostParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BoostParameters() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.BoostParameters */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoostParameters copy$default(BoostParameters boostParameters, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = boostParameters.gainsTokenList;
        }
        return boostParameters.copy(list);
    }

    @SerialName("gainTokenTags")
    public static /* synthetic */ void getGainsTokenList$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.gainsTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoostParameters copy(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new BoostParameters(list);
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
        return (obj instanceof BoostParameters) && Intrinsics.EZpvd(this.gainsTokenList, ((BoostParameters) obj).gainsTokenList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getGainsTokenList() {
        return this.gainsTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.gainsTokenList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BoostParameters(gainsTokenList=" + this.gainsTokenList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.gainsTokenList);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.BoostParameters.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BoostParameters> serializer() {
            return BoostParameters$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BoostParameters(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.gainsTokenList = yDY.AhwBna();
        } else {
            this.gainsTokenList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(BoostParameters boostParameters, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(boostParameters.gainsTokenList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], boostParameters.gainsTokenList);
    }

    public BoostParameters(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.gainsTokenList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:211)) : (r1v0 java.util.List))
 A[MD:(java.util.List<java.lang.String>):void (m)] (LINE:209) call: com.okinc.business.invest_biz.data.bean.BoostParameters.<init>(java.util.List):void type: THIS */
    public /* synthetic */ BoostParameters(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
