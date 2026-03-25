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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class RecurringEditPriceRangeReq implements Parcelable {
    private String algoId;
    private List<RecurringPriceRangeItem> recurringList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringEditPriceRangeReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(RecurringPriceRangeItem$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<RecurringEditPriceRangeReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringEditPriceRangeReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(RecurringPriceRangeItem.CREATOR.createFromParcel(parcel));
            }
            return new RecurringEditPriceRangeReq(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringEditPriceRangeReq[] newArray(int i) {
            return new RecurringEditPriceRangeReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.RecurringEditPriceRangeReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringEditPriceRangeReq copy$default(RecurringEditPriceRangeReq recurringEditPriceRangeReq, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recurringEditPriceRangeReq.algoId;
        }
        if ((i & 2) != 0) {
            list = recurringEditPriceRangeReq.recurringList;
        }
        return recurringEditPriceRangeReq.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecurringPriceRangeItem> component2() {
        return this.recurringList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringEditPriceRangeReq copy(@NotNull String str, @NotNull List<RecurringPriceRangeItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new RecurringEditPriceRangeReq(str, list);
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
        if (!(obj instanceof RecurringEditPriceRangeReq)) {
            return false;
        }
        RecurringEditPriceRangeReq recurringEditPriceRangeReq = (RecurringEditPriceRangeReq) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) recurringEditPriceRangeReq.algoId) && Intrinsics.EZpvd(this.recurringList, recurringEditPriceRangeReq.recurringList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecurringPriceRangeItem> getRecurringList() {
        return this.recurringList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.algoId.hashCode() * 31) + this.recurringList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringList(@NotNull List<RecurringPriceRangeItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.recurringList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringEditPriceRangeReq(algoId=" + this.algoId + ", recurringList=" + this.recurringList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        List<RecurringPriceRangeItem> list = this.recurringList;
        parcel.writeInt(list.size());
        Iterator<RecurringPriceRangeItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RecurringEditPriceRangeReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringEditPriceRangeReq> serializer() {
            return RecurringEditPriceRangeReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringEditPriceRangeReq(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, RecurringEditPriceRangeReq$$serializer.INSTANCE.getDescriptor());
        }
        this.algoId = str;
        this.recurringList = list;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RecurringEditPriceRangeReq recurringEditPriceRangeReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, recurringEditPriceRangeReq.algoId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], recurringEditPriceRangeReq.recurringList);
    }

    public RecurringEditPriceRangeReq(@NotNull String str, @NotNull List<RecurringPriceRangeItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.algoId = str;
        this.recurringList = list;
    }
}
