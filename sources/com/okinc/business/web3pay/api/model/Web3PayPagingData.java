package com.okinc.business.web3pay.api.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class Web3PayPagingData<T> {
    private static final SerialDescriptor $cachedDescriptor;
    private final String nextCursor;
    private final List<T> orderList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.api.model.Web3PayPagingData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Web3PayPagingData copy$default(Web3PayPagingData web3PayPagingData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = web3PayPagingData.nextCursor;
        }
        if ((i & 2) != 0) {
            list = web3PayPagingData.orderList;
        }
        return web3PayPagingData.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<T> component2() {
        return this.orderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3PayPagingData<T> copy(@NotNull String str, @NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new Web3PayPagingData<>(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Web3PayPagingData)) {
            return false;
        }
        Web3PayPagingData web3PayPagingData = (Web3PayPagingData) obj;
        return Intrinsics.EZpvd((Object) this.nextCursor, (Object) web3PayPagingData.nextCursor) && Intrinsics.EZpvd(this.orderList, web3PayPagingData.orderList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNextCursor() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<T> getOrderList() {
        return this.orderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.nextCursor.hashCode() * 31) + this.orderList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Web3PayPagingData(nextCursor=" + this.nextCursor + ", orderList=" + this.orderList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.Web3PayPagingData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> KSerializer<Web3PayPagingData<T>> serializer(@NotNull KSerializer<T> kSerializer) {
            Intrinsics.checkNotNullParameter(kSerializer, "");
            return new Web3PayPagingData$$serializer(kSerializer);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.api.model.Web3PayPagingData", null, 2);
        pluginGeneratedSerialDescriptor.addElement("nextCursor", false);
        pluginGeneratedSerialDescriptor.addElement("orderList", false);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ Web3PayPagingData(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, $cachedDescriptor);
        }
        this.nextCursor = str;
        this.orderList = list;
    }

    public static final /* synthetic */ void write$Self$OKPay_web3pay_api(Web3PayPagingData web3PayPagingData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, web3PayPagingData.getNextCursor());
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, new ArrayListSerializer(kSerializer), web3PayPagingData.getOrderList());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public Web3PayPagingData(@NotNull String str, @NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.nextCursor = str;
        this.orderList = list;
    }
}
