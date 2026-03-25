package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class MultiAddressReq {
    public List<String> addressList;
    public long coinId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.MultiAddressReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiAddressReq copy$default(MultiAddressReq multiAddressReq, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = multiAddressReq.coinId;
        }
        if ((i & 2) != 0) {
            list = multiAddressReq.addressList;
        }
        return multiAddressReq.EZpvd(j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiAddressReq EZpvd(long j, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new MultiAddressReq(j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiAddressReq)) {
            return false;
        }
        MultiAddressReq multiAddressReq = (MultiAddressReq) obj;
        return this.coinId == multiAddressReq.coinId && Intrinsics.EZpvd(this.addressList, multiAddressReq.addressList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.coinId) * 31) + this.addressList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MultiAddressReq(coinId=" + this.coinId + ", addressList=" + this.addressList + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.MultiAddressReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MultiAddressReq> serializer() {
            return MultiAddressReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MultiAddressReq(int i, long j, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, MultiAddressReq$$serializer.INSTANCE.getDescriptor());
        }
        this.coinId = j;
        this.addressList = list;
    }

    public static final /* synthetic */ void EZpvd(MultiAddressReq multiAddressReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, multiAddressReq.coinId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], multiAddressReq.addressList);
    }

    public MultiAddressReq(long j, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.coinId = j;
        this.addressList = list;
    }
}
