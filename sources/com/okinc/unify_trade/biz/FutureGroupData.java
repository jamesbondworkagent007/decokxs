package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class FutureGroupData {
    private final String instType;
    private List<FutureGroupInfo> list;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(FutureGroupInfo$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.FutureGroupData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FutureGroupData copy$default(FutureGroupData futureGroupData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futureGroupData.instType;
        }
        if ((i & 2) != 0) {
            list = futureGroupData.list;
        }
        return futureGroupData.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FutureGroupInfo> component2() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FutureGroupData copy(String str, @NotNull List<FutureGroupInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new FutureGroupData(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FutureGroupData)) {
            return false;
        }
        FutureGroupData futureGroupData = (FutureGroupData) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) futureGroupData.instType) && Intrinsics.EZpvd(this.list, futureGroupData.list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FutureGroupInfo> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instType;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setList(@NotNull List<FutureGroupInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.list = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FutureGroupData(instType=" + this.instType + ", list=" + this.list + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.FutureGroupData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FutureGroupData> serializer() {
            return FutureGroupData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FutureGroupData(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, FutureGroupData$$serializer.INSTANCE.getDescriptor());
        }
        this.instType = str;
        this.list = list;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(FutureGroupData futureGroupData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, futureGroupData.instType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], futureGroupData.list);
    }

    public FutureGroupData(String str, @NotNull List<FutureGroupInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.instType = str;
        this.list = list;
    }
}
