package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class DebtQuoteBean implements Parcelable {
    private ArrayList<DebtReferBean> debtList;
    private String repayCcy;
    private int source;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DebtQuoteBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(DebtReferBean$$serializer.INSTANCE), null};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<DebtQuoteBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DebtQuoteBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(DebtReferBean.CREATOR.createFromParcel(parcel));
            }
            return new DebtQuoteBean(string, arrayList, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DebtQuoteBean[] newArray(int i) {
            return new DebtQuoteBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.DebtQuoteBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DebtQuoteBean copy$default(DebtQuoteBean debtQuoteBean, String str, ArrayList arrayList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = debtQuoteBean.repayCcy;
        }
        if ((i2 & 2) != 0) {
            arrayList = debtQuoteBean.debtList;
        }
        if ((i2 & 4) != 0) {
            i = debtQuoteBean.source;
        }
        return debtQuoteBean.copy(str, arrayList, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.repayCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DebtReferBean> component2() {
        return this.debtList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DebtQuoteBean copy(@NotNull String str, @NotNull ArrayList<DebtReferBean> arrayList, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new DebtQuoteBean(str, arrayList, i);
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
        if (!(obj instanceof DebtQuoteBean)) {
            return false;
        }
        DebtQuoteBean debtQuoteBean = (DebtQuoteBean) obj;
        return Intrinsics.EZpvd((Object) this.repayCcy, (Object) debtQuoteBean.repayCcy) && Intrinsics.EZpvd(this.debtList, debtQuoteBean.debtList) && this.source == debtQuoteBean.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DebtReferBean> getDebtList() {
        return this.debtList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRepayCcy() {
        return this.repayCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.repayCcy.hashCode() * 31) + this.debtList.hashCode()) * 31) + Integer.hashCode(this.source);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDebtList(@NotNull ArrayList<DebtReferBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.debtList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRepayCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.repayCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSource(int i) {
        this.source = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DebtQuoteBean(repayCcy=" + this.repayCcy + ", debtList=" + this.debtList + ", source=" + this.source + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.repayCcy);
        ArrayList<DebtReferBean> arrayList = this.debtList;
        parcel.writeInt(arrayList.size());
        Iterator<DebtReferBean> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.source);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DebtQuoteBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DebtQuoteBean> serializer() {
            return DebtQuoteBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DebtQuoteBean(int i, String str, ArrayList arrayList, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, DebtQuoteBean$$serializer.INSTANCE.getDescriptor());
        }
        this.repayCcy = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.debtList = new ArrayList<>();
        } else {
            this.debtList = arrayList;
        }
        this.source = i2;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DebtQuoteBean debtQuoteBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) debtQuoteBean.repayCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, debtQuoteBean.repayCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(debtQuoteBean.debtList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], debtQuoteBean.debtList);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, debtQuoteBean.source);
    }

    public DebtQuoteBean(@NotNull String str, @NotNull ArrayList<DebtReferBean> arrayList, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.repayCcy = str;
        this.debtList = arrayList;
        this.source = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:53) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.ArrayList))
  (r3v0 int)
 A[MD:(java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.DebtReferBean>, int):void (m)] (LINE:51) call: com.okinc.unify_trade.biz.DebtQuoteBean.<init>(java.lang.String, java.util.ArrayList, int):void type: THIS */
    public /* synthetic */ DebtQuoteBean(String str, ArrayList arrayList, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? new ArrayList() : arrayList, i);
    }
}
