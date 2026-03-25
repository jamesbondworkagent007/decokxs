package com.okinc.okimcore.model.im.inhouseim.ws;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class WSGetNewestSeqData {
    private final List<String> channelIdList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.im.inhouseim.ws.WSGetNewestSeqData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WSGetNewestSeqData copy$default(WSGetNewestSeqData wSGetNewestSeqData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wSGetNewestSeqData.channelIdList;
        }
        return wSGetNewestSeqData.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.channelIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSGetNewestSeqData copy(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new WSGetNewestSeqData(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WSGetNewestSeqData) && Intrinsics.EZpvd(this.channelIdList, ((WSGetNewestSeqData) obj).channelIdList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getChannelIdList() {
        return this.channelIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.channelIdList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSGetNewestSeqData(channelIdList=" + this.channelIdList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSGetNewestSeqData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSGetNewestSeqData> serializer() {
            return WSGetNewestSeqData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSGetNewestSeqData(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WSGetNewestSeqData$$serializer.INSTANCE.getDescriptor());
        }
        this.channelIdList = list;
    }

    public WSGetNewestSeqData(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.channelIdList = list;
    }
}
