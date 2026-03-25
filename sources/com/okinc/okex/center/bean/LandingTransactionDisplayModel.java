package com.okinc.okex.center.bean;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class LandingTransactionDisplayModel implements Parcelable {
    private final ContextualScenarioModel contextualScenario;
    private final List<SelfServiceToolBean> selfServiceTools;
    private final TransactionBean transaction;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LandingTransactionDisplayModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SelfServiceToolBean$$serializer.INSTANCE), null};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<LandingTransactionDisplayModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LandingTransactionDisplayModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ContextualScenarioModel contextualScenarioModelCreateFromParcel = parcel.readInt() == 0 ? null : ContextualScenarioModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SelfServiceToolBean.CREATOR.createFromParcel(parcel));
                }
            }
            return new LandingTransactionDisplayModel(contextualScenarioModelCreateFromParcel, arrayList, parcel.readInt() != 0 ? TransactionBean.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LandingTransactionDisplayModel[] newArray(int i) {
            return new LandingTransactionDisplayModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LandingTransactionDisplayModel() {
        this((ContextualScenarioModel) null, (List) null, (TransactionBean) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.center.bean.LandingTransactionDisplayModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LandingTransactionDisplayModel copy$default(LandingTransactionDisplayModel landingTransactionDisplayModel, ContextualScenarioModel contextualScenarioModel, List list, TransactionBean transactionBean, int i, Object obj) {
        if ((i & 1) != 0) {
            contextualScenarioModel = landingTransactionDisplayModel.contextualScenario;
        }
        if ((i & 2) != 0) {
            list = landingTransactionDisplayModel.selfServiceTools;
        }
        if ((i & 4) != 0) {
            transactionBean = landingTransactionDisplayModel.transaction;
        }
        return landingTransactionDisplayModel.copy(contextualScenarioModel, list, transactionBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenarioModel component1() {
        return this.contextualScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SelfServiceToolBean> component2() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionBean component3() {
        return this.transaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LandingTransactionDisplayModel copy(ContextualScenarioModel contextualScenarioModel, List<SelfServiceToolBean> list, TransactionBean transactionBean) {
        return new LandingTransactionDisplayModel(contextualScenarioModel, list, transactionBean);
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
        if (!(obj instanceof LandingTransactionDisplayModel)) {
            return false;
        }
        LandingTransactionDisplayModel landingTransactionDisplayModel = (LandingTransactionDisplayModel) obj;
        return Intrinsics.EZpvd(this.contextualScenario, landingTransactionDisplayModel.contextualScenario) && Intrinsics.EZpvd(this.selfServiceTools, landingTransactionDisplayModel.selfServiceTools) && Intrinsics.EZpvd(this.transaction, landingTransactionDisplayModel.transaction);
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
    public final TransactionBean getTransaction() {
        return this.transaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ContextualScenarioModel contextualScenarioModel = this.contextualScenario;
        int iHashCode = contextualScenarioModel == null ? 0 : contextualScenarioModel.hashCode();
        List<SelfServiceToolBean> list = this.selfServiceTools;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        TransactionBean transactionBean = this.transaction;
        return (((iHashCode * 31) + iHashCode2) * 31) + (transactionBean != null ? transactionBean.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LandingTransactionDisplayModel(contextualScenario=" + this.contextualScenario + ", selfServiceTools=" + this.selfServiceTools + ", transaction=" + this.transaction + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
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
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SelfServiceToolBean> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        TransactionBean transactionBean = this.transaction;
        if (transactionBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transactionBean.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.LandingTransactionDisplayModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LandingTransactionDisplayModel> serializer() {
            return LandingTransactionDisplayModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LandingTransactionDisplayModel(int i, ContextualScenarioModel contextualScenarioModel, List list, TransactionBean transactionBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contextualScenario = null;
        } else {
            this.contextualScenario = contextualScenarioModel;
        }
        if ((i & 2) == 0) {
            this.selfServiceTools = null;
        } else {
            this.selfServiceTools = list;
        }
        if ((i & 4) == 0) {
            this.transaction = null;
        } else {
            this.transaction = transactionBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(LandingTransactionDisplayModel landingTransactionDisplayModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || landingTransactionDisplayModel.contextualScenario != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ContextualScenarioModel$$serializer.INSTANCE, landingTransactionDisplayModel.contextualScenario);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || landingTransactionDisplayModel.selfServiceTools != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], landingTransactionDisplayModel.selfServiceTools);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && landingTransactionDisplayModel.transaction == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, TransactionBean$$serializer.INSTANCE, landingTransactionDisplayModel.transaction);
    }

    public LandingTransactionDisplayModel(ContextualScenarioModel contextualScenarioModel, List<SelfServiceToolBean> list, TransactionBean transactionBean) {
        this.contextualScenario = contextualScenarioModel;
        this.selfServiceTools = list;
        this.transaction = transactionBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.okex.center.bean.ContextualScenarioModel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.ContextualScenarioModel) : (r2v0 com.okinc.okex.center.bean.ContextualScenarioModel))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:com.okinc.okex.center.bean.TransactionBean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.TransactionBean) : (r4v0 com.okinc.okex.center.bean.TransactionBean))
 A[MD:(com.okinc.okex.center.bean.ContextualScenarioModel, java.util.List<com.okinc.okex.center.bean.SelfServiceToolBean>, com.okinc.okex.center.bean.TransactionBean):void (m)] (LINE:26) call: com.okinc.okex.center.bean.LandingTransactionDisplayModel.<init>(com.okinc.okex.center.bean.ContextualScenarioModel, java.util.List, com.okinc.okex.center.bean.TransactionBean):void type: THIS */
    public /* synthetic */ LandingTransactionDisplayModel(ContextualScenarioModel contextualScenarioModel, List list, TransactionBean transactionBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : contextualScenarioModel, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : transactionBean);
    }
}
