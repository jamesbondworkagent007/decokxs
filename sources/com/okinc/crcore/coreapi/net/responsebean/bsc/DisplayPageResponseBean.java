package com.okinc.crcore.coreapi.net.responsebean.bsc;

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

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class DisplayPageResponseBean implements Parcelable {
    private final String flowType;
    private final List<String> pageNames;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DisplayPageResponseBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<DisplayPageResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisplayPageResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DisplayPageResponseBean(parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisplayPageResponseBean[] newArray(int i) {
            return new DisplayPageResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DisplayPageResponseBean() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.bsc.DisplayPageResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DisplayPageResponseBean copy$default(DisplayPageResponseBean displayPageResponseBean, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = displayPageResponseBean.flowType;
        }
        if ((i & 2) != 0) {
            list = displayPageResponseBean.pageNames;
        }
        return displayPageResponseBean.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.flowType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.pageNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisplayPageResponseBean copy(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new DisplayPageResponseBean(str, list);
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
        if (!(obj instanceof DisplayPageResponseBean)) {
            return false;
        }
        DisplayPageResponseBean displayPageResponseBean = (DisplayPageResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.flowType, (Object) displayPageResponseBean.flowType) && Intrinsics.EZpvd(this.pageNames, displayPageResponseBean.pageNames);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFlowType() {
        return this.flowType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getPageNames() {
        return this.pageNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.flowType.hashCode() * 31) + this.pageNames.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DisplayPageResponseBean(flowType=" + this.flowType + ", pageNames=" + this.pageNames + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.flowType);
        parcel.writeStringList(this.pageNames);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.DisplayPageResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DisplayPageResponseBean> serializer() {
            return DisplayPageResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DisplayPageResponseBean(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.flowType = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.pageNames = yDY.AhwBna();
        } else {
            this.pageNames = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DisplayPageResponseBean displayPageResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) displayPageResponseBean.flowType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, displayPageResponseBean.flowType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(displayPageResponseBean.pageNames, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], displayPageResponseBean.pageNames);
    }

    public DisplayPageResponseBean(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.flowType = str;
        this.pageNames = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.DisplayPageResponseBean.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ DisplayPageResponseBean(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
