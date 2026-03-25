package com.okinc.business.defi.biz.core.transaction.sign.utxo.bean;

import com.okinc.wallet.core.sign.utxo.UTXOTxIn;
import com.okinc.wallet.core.sign.utxo.UTXOTxIn$$serializer;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class TxInsBean {
    private String balance;
    private ArrayList<UTXOTxIn> txIns;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(UTXOTxIn$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TxInsBean() {
        this((String) null, (ArrayList) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.TxInsBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TxInsBean copy$default(TxInsBean txInsBean, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = txInsBean.balance;
        }
        if ((i & 2) != 0) {
            arrayList = txInsBean.txIns;
        }
        return txInsBean.copy(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<UTXOTxIn> component2() {
        return this.txIns;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxInsBean copy(@NotNull String str, @NotNull ArrayList<UTXOTxIn> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new TxInsBean(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TxInsBean)) {
            return false;
        }
        TxInsBean txInsBean = (TxInsBean) obj;
        return Intrinsics.EZpvd((Object) this.balance, (Object) txInsBean.balance) && Intrinsics.EZpvd(this.txIns, txInsBean.txIns);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<UTXOTxIn> getTxIns() {
        return this.txIns;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.balance.hashCode() * 31) + this.txIns.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.balance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxIns(@NotNull ArrayList<UTXOTxIn> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.txIns = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxInsBean(balance=" + this.balance + ", txIns=" + this.txIns + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.TxInsBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TxInsBean> serializer() {
            return TxInsBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TxInsBean(int i, String str, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        this.balance = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.txIns = new ArrayList<>();
        } else {
            this.txIns = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TxInsBean txInsBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) txInsBean.balance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, txInsBean.balance);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(txInsBean.txIns, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], txInsBean.txIns);
    }

    public TxInsBean(@NotNull String str, @NotNull ArrayList<UTXOTxIn> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.balance = str;
        this.txIns = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:50) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.util.ArrayList<com.okinc.wallet.core.sign.utxo.UTXOTxIn>):void (m)] (LINE:48) call: com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.TxInsBean.<init>(java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ TxInsBean(String str, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : arrayList);
    }
}
