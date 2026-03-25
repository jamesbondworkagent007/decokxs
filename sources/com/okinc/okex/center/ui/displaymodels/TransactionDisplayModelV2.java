package com.okinc.okex.center.ui.displaymodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okex.center.bean.ContextualScenarioModel;
import com.okinc.okex.center.bean.ContextualScenarioModel$$serializer;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.SelfServiceToolBean$$serializer;
import com.okinc.okex.center.ui.adapter.ActivityHighlightCardAdapter;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class TransactionDisplayModelV2 extends ActivityHighlightCardAdapter.TaskDescription implements Parcelable {
    private final ContextualScenarioModel contextualScenario;
    private final List<SelfServiceToolBean> selfServiceTools;
    private final TransactionDisplayModel transaction;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TransactionDisplayModelV2> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(SelfServiceToolBean$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<TransactionDisplayModelV2> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionDisplayModelV2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            TransactionDisplayModel transactionDisplayModelCreateFromParcel = parcel.readInt() == 0 ? null : TransactionDisplayModel.CREATOR.createFromParcel(parcel);
            ContextualScenarioModel contextualScenarioModelCreateFromParcel = parcel.readInt() == 0 ? null : ContextualScenarioModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(SelfServiceToolBean.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new TransactionDisplayModelV2(transactionDisplayModelCreateFromParcel, contextualScenarioModelCreateFromParcel, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionDisplayModelV2[] newArray(int i) {
            return new TransactionDisplayModelV2[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionDisplayModelV2() {
        this((TransactionDisplayModel) null, (ContextualScenarioModel) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2 */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionDisplayModelV2 copy$default(TransactionDisplayModelV2 transactionDisplayModelV2, TransactionDisplayModel transactionDisplayModel, ContextualScenarioModel contextualScenarioModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            transactionDisplayModel = transactionDisplayModelV2.transaction;
        }
        if ((i & 2) != 0) {
            contextualScenarioModel = transactionDisplayModelV2.contextualScenario;
        }
        if ((i & 4) != 0) {
            list = transactionDisplayModelV2.selfServiceTools;
        }
        return transactionDisplayModelV2.copy(transactionDisplayModel, contextualScenarioModel, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionDisplayModel component1() {
        return this.transaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenarioModel component2() {
        return this.contextualScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SelfServiceToolBean> component3() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionDisplayModelV2 copy(TransactionDisplayModel transactionDisplayModel, ContextualScenarioModel contextualScenarioModel, List<SelfServiceToolBean> list) {
        return new TransactionDisplayModelV2(transactionDisplayModel, contextualScenarioModel, list);
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
        if (!(obj instanceof TransactionDisplayModelV2)) {
            return false;
        }
        TransactionDisplayModelV2 transactionDisplayModelV2 = (TransactionDisplayModelV2) obj;
        return Intrinsics.EZpvd(this.transaction, transactionDisplayModelV2.transaction) && Intrinsics.EZpvd(this.contextualScenario, transactionDisplayModelV2.contextualScenario) && Intrinsics.EZpvd(this.selfServiceTools, transactionDisplayModelV2.selfServiceTools);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenarioModel getContextualScenario() {
        return this.contextualScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SelfServiceToolBean> getSelfServiceTools() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionDisplayModel getTransaction() {
        return this.transaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        TransactionDisplayModel transactionDisplayModel = this.transaction;
        int iHashCode = transactionDisplayModel == null ? 0 : transactionDisplayModel.hashCode();
        ContextualScenarioModel contextualScenarioModel = this.contextualScenario;
        int iHashCode2 = contextualScenarioModel == null ? 0 : contextualScenarioModel.hashCode();
        List<SelfServiceToolBean> list = this.selfServiceTools;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionDisplayModelV2(transaction=" + this.transaction + ", contextualScenario=" + this.contextualScenario + ", selfServiceTools=" + this.selfServiceTools + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        TransactionDisplayModel transactionDisplayModel = this.transaction;
        if (transactionDisplayModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transactionDisplayModel.writeToParcel(parcel, i);
        }
        ContextualScenarioModel contextualScenarioModel = this.contextualScenario;
        if (contextualScenarioModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contextualScenarioModel.writeToParcel(parcel, i);
        }
        List<SelfServiceToolBean> list = this.selfServiceTools;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<SelfServiceToolBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionDisplayModelV2> serializer() {
            return TransactionDisplayModelV2$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionDisplayModelV2(int i, TransactionDisplayModel transactionDisplayModel, ContextualScenarioModel contextualScenarioModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.transaction = null;
        } else {
            this.transaction = transactionDisplayModel;
        }
        if ((i & 2) == 0) {
            this.contextualScenario = null;
        } else {
            this.contextualScenario = contextualScenarioModel;
        }
        if ((i & 4) == 0) {
            this.selfServiceTools = null;
        } else {
            this.selfServiceTools = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(TransactionDisplayModelV2 transactionDisplayModelV2, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || transactionDisplayModelV2.transaction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, TransactionDisplayModel$$serializer.INSTANCE, transactionDisplayModelV2.transaction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || transactionDisplayModelV2.contextualScenario != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ContextualScenarioModel$$serializer.INSTANCE, transactionDisplayModelV2.contextualScenario);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && transactionDisplayModelV2.selfServiceTools == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], transactionDisplayModelV2.selfServiceTools);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel) : (r2v0 com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel))
  (wrap:com.okinc.okex.center.bean.ContextualScenarioModel:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.ContextualScenarioModel) : (r3v0 com.okinc.okex.center.bean.ContextualScenarioModel))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel, com.okinc.okex.center.bean.ContextualScenarioModel, java.util.List<com.okinc.okex.center.bean.SelfServiceToolBean>):void (m)] (LINE:15) call: com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2.<init>(com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel, com.okinc.okex.center.bean.ContextualScenarioModel, java.util.List):void type: THIS */
    public /* synthetic */ TransactionDisplayModelV2(TransactionDisplayModel transactionDisplayModel, ContextualScenarioModel contextualScenarioModel, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : transactionDisplayModel, (i & 2) != 0 ? null : contextualScenarioModel, (i & 4) != 0 ? null : list);
    }

    public TransactionDisplayModelV2(TransactionDisplayModel transactionDisplayModel, ContextualScenarioModel contextualScenarioModel, List<SelfServiceToolBean> list) {
        this.transaction = transactionDisplayModel;
        this.contextualScenario = contextualScenarioModel;
        this.selfServiceTools = list;
    }
}
