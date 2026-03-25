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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class ConvertCanWithdrawBeanNew implements Parcelable {
    private final List<ConvertCanWithdrawBean> maxAvailBals;
    private final String quantityUpperLimit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ConvertCanWithdrawBeanNew> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(ConvertCanWithdrawBean$$serializer.INSTANCE), null};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<ConvertCanWithdrawBeanNew> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConvertCanWithdrawBeanNew createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ConvertCanWithdrawBean.CREATOR.createFromParcel(parcel));
            }
            return new ConvertCanWithdrawBeanNew(arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConvertCanWithdrawBeanNew[] newArray(int i) {
            return new ConvertCanWithdrawBeanNew[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.ConvertCanWithdrawBeanNew */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConvertCanWithdrawBeanNew copy$default(ConvertCanWithdrawBeanNew convertCanWithdrawBeanNew, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = convertCanWithdrawBeanNew.maxAvailBals;
        }
        if ((i & 2) != 0) {
            str = convertCanWithdrawBeanNew.quantityUpperLimit;
        }
        return convertCanWithdrawBeanNew.copy(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConvertCanWithdrawBean> component1() {
        return this.maxAvailBals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.quantityUpperLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertCanWithdrawBeanNew copy(@NotNull List<ConvertCanWithdrawBean> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new ConvertCanWithdrawBeanNew(list, str);
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
        if (!(obj instanceof ConvertCanWithdrawBeanNew)) {
            return false;
        }
        ConvertCanWithdrawBeanNew convertCanWithdrawBeanNew = (ConvertCanWithdrawBeanNew) obj;
        return Intrinsics.EZpvd(this.maxAvailBals, convertCanWithdrawBeanNew.maxAvailBals) && Intrinsics.EZpvd((Object) this.quantityUpperLimit, (Object) convertCanWithdrawBeanNew.quantityUpperLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConvertCanWithdrawBean> getMaxAvailBals() {
        return this.maxAvailBals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuantityUpperLimit() {
        return this.quantityUpperLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.maxAvailBals.hashCode() * 31) + this.quantityUpperLimit.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConvertCanWithdrawBeanNew(maxAvailBals=" + this.maxAvailBals + ", quantityUpperLimit=" + this.quantityUpperLimit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<ConvertCanWithdrawBean> list = this.maxAvailBals;
        parcel.writeInt(list.size());
        Iterator<ConvertCanWithdrawBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.quantityUpperLimit);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ConvertCanWithdrawBeanNew.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConvertCanWithdrawBeanNew> serializer() {
            return ConvertCanWithdrawBeanNew$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConvertCanWithdrawBeanNew(int i, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ConvertCanWithdrawBeanNew$$serializer.INSTANCE.getDescriptor());
        }
        this.maxAvailBals = list;
        this.quantityUpperLimit = str;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ConvertCanWithdrawBeanNew convertCanWithdrawBeanNew, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], convertCanWithdrawBeanNew.maxAvailBals);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, convertCanWithdrawBeanNew.quantityUpperLimit);
    }

    public ConvertCanWithdrawBeanNew(@NotNull List<ConvertCanWithdrawBean> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.maxAvailBals = list;
        this.quantityUpperLimit = str;
    }
}
