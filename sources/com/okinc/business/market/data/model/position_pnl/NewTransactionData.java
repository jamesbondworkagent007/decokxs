package com.okinc.business.market.data.model.position_pnl;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class NewTransactionData {
    private final List<HoldingTransactionData> holdingList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(HoldingTransactionData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.position_pnl.NewTransactionData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewTransactionData copy$default(NewTransactionData newTransactionData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newTransactionData.holdingList;
        }
        return newTransactionData.copy(list);
    }

    @SerialName("pnlPushList")
    public static /* synthetic */ void getHoldingList$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HoldingTransactionData> component1() {
        return this.holdingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewTransactionData copy(@NotNull List<HoldingTransactionData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new NewTransactionData(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewTransactionData) && Intrinsics.EZpvd(this.holdingList, ((NewTransactionData) obj).holdingList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HoldingTransactionData> getHoldingList() {
        return this.holdingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.holdingList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewTransactionData(holdingList=" + this.holdingList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.position_pnl.NewTransactionData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewTransactionData> serializer() {
            return NewTransactionData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewTransactionData(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, NewTransactionData$$serializer.INSTANCE.getDescriptor());
        }
        this.holdingList = list;
    }

    public NewTransactionData(@NotNull List<HoldingTransactionData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.holdingList = list;
    }
}
