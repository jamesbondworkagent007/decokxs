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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SignalBotSubsInfoListBean implements Parcelable {
    private final String page;
    private final List<SignalBotSubsInfoBean> signals;
    private final String totalCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignalBotSubsInfoListBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SignalBotSubsInfoBean$$serializer.INSTANCE), null};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<SignalBotSubsInfoListBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotSubsInfoListBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SignalBotSubsInfoBean.CREATOR.createFromParcel(parcel));
            }
            return new SignalBotSubsInfoListBean(string, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotSubsInfoListBean[] newArray(int i) {
            return new SignalBotSubsInfoListBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalBotSubsInfoListBean() {
        this((String) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.SignalBotSubsInfoListBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalBotSubsInfoListBean copy$default(SignalBotSubsInfoListBean signalBotSubsInfoListBean, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signalBotSubsInfoListBean.page;
        }
        if ((i & 2) != 0) {
            list = signalBotSubsInfoListBean.signals;
        }
        if ((i & 4) != 0) {
            str2 = signalBotSubsInfoListBean.totalCount;
        }
        return signalBotSubsInfoListBean.copy(str, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignalBotSubsInfoBean> component2() {
        return this.signals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalBotSubsInfoListBean copy(String str, @NotNull List<SignalBotSubsInfoBean> list, String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SignalBotSubsInfoListBean(str, list, str2);
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
        if (!(obj instanceof SignalBotSubsInfoListBean)) {
            return false;
        }
        SignalBotSubsInfoListBean signalBotSubsInfoListBean = (SignalBotSubsInfoListBean) obj;
        return Intrinsics.EZpvd((Object) this.page, (Object) signalBotSubsInfoListBean.page) && Intrinsics.EZpvd(this.signals, signalBotSubsInfoListBean.signals) && Intrinsics.EZpvd((Object) this.totalCount, (Object) signalBotSubsInfoListBean.totalCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPage() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignalBotSubsInfoBean> getSignals() {
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
        int iHashCode2 = this.signals.hashCode();
        String str2 = this.totalCount;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalBotSubsInfoListBean(page=" + this.page + ", signals=" + this.signals + ", totalCount=" + this.totalCount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.page);
        List<SignalBotSubsInfoBean> list = this.signals;
        parcel.writeInt(list.size());
        Iterator<SignalBotSubsInfoBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.totalCount);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SignalBotSubsInfoListBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalBotSubsInfoListBean> serializer() {
            return SignalBotSubsInfoListBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalBotSubsInfoListBean(int i, String str, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.page = null;
        } else {
            this.page = str;
        }
        if ((i & 2) == 0) {
            this.signals = new ArrayList();
        } else {
            this.signals = list;
        }
        if ((i & 4) == 0) {
            this.totalCount = null;
        } else {
            this.totalCount = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SignalBotSubsInfoListBean signalBotSubsInfoListBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signalBotSubsInfoListBean.page != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, signalBotSubsInfoListBean.page);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(signalBotSubsInfoListBean.signals, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], signalBotSubsInfoListBean.signals);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && signalBotSubsInfoListBean.totalCount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, signalBotSubsInfoListBean.totalCount);
    }

    public SignalBotSubsInfoListBean(String str, @NotNull List<SignalBotSubsInfoBean> list, String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.page = str;
        this.signals = list;
        this.totalCount = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:4108) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<com.okinc.unify_trade.biz.SignalBotSubsInfoBean>, java.lang.String):void (m)] (LINE:4106) call: com.okinc.unify_trade.biz.SignalBotSubsInfoListBean.<init>(java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ SignalBotSubsInfoListBean(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : str2);
    }
}
