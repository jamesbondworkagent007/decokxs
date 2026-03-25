package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SignalBotSignalListBean implements Parcelable {
    private final String page;
    private final List<SignalProviderSignalBean> signals;
    private final String totalCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignalBotSignalListBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(SignalProviderSignalBean$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SignalBotSignalListBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotSignalListBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SignalProviderSignalBean.CREATOR.createFromParcel(parcel));
            }
            return new SignalBotSignalListBean(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotSignalListBean[] newArray(int i) {
            return new SignalBotSignalListBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalBotSignalListBean() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.SignalBotSignalListBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalBotSignalListBean copy$default(SignalBotSignalListBean signalBotSignalListBean, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signalBotSignalListBean.page;
        }
        if ((i & 2) != 0) {
            str2 = signalBotSignalListBean.totalCount;
        }
        if ((i & 4) != 0) {
            list = signalBotSignalListBean.signals;
        }
        return signalBotSignalListBean.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignalProviderSignalBean> component3() {
        return this.signals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalBotSignalListBean copy(String str, String str2, @NotNull List<SignalProviderSignalBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SignalBotSignalListBean(str, str2, list);
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
        if (!(obj instanceof SignalBotSignalListBean)) {
            return false;
        }
        SignalBotSignalListBean signalBotSignalListBean = (SignalBotSignalListBean) obj;
        return Intrinsics.EZpvd((Object) this.page, (Object) signalBotSignalListBean.page) && Intrinsics.EZpvd((Object) this.totalCount, (Object) signalBotSignalListBean.totalCount) && Intrinsics.EZpvd(this.signals, signalBotSignalListBean.signals);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPage() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignalProviderSignalBean> getSignals() {
        return this.signals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalCount() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.page;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.totalCount;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.signals.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalBotSignalListBean(page=" + this.page + ", totalCount=" + this.totalCount + ", signals=" + this.signals + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.page);
        parcel.writeString(this.totalCount);
        List<SignalProviderSignalBean> list = this.signals;
        parcel.writeInt(list.size());
        Iterator<SignalProviderSignalBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SignalBotSignalListBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalBotSignalListBean> serializer() {
            return SignalBotSignalListBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalBotSignalListBean(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.page = null;
        } else {
            this.page = str;
        }
        if ((i & 2) == 0) {
            this.totalCount = null;
        } else {
            this.totalCount = str2;
        }
        if ((i & 4) == 0) {
            this.signals = yDY.AhwBna();
        } else {
            this.signals = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SignalBotSignalListBean signalBotSignalListBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signalBotSignalListBean.page != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, signalBotSignalListBean.page);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signalBotSignalListBean.totalCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, signalBotSignalListBean.totalCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(signalBotSignalListBean.signals, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], signalBotSignalListBean.signals);
    }

    public SignalBotSignalListBean(String str, String str2, @NotNull List<SignalProviderSignalBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.page = str;
        this.totalCount = str2;
        this.signals = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:4068)) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.SignalProviderSignalBean>):void (m)] (LINE:4065) call: com.okinc.unify_trade.biz.SignalBotSignalListBean.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ SignalBotSignalListBean(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
