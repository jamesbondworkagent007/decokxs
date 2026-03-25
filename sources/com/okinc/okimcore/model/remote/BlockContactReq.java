package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class BlockContactReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int blockStatus;
    private final long contactUid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BlockContactReq copy$default(BlockContactReq blockContactReq, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = blockContactReq.contactUid;
        }
        if ((i2 & 2) != 0) {
            i = blockContactReq.blockStatus;
        }
        return blockContactReq.copy(j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.contactUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.blockStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BlockContactReq copy(long j, int i) {
        return new BlockContactReq(j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockContactReq)) {
            return false;
        }
        BlockContactReq blockContactReq = (BlockContactReq) obj;
        return this.contactUid == blockContactReq.contactUid && this.blockStatus == blockContactReq.blockStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBlockStatus() {
        return this.blockStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getContactUid() {
        return this.contactUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.contactUid) * 31) + Integer.hashCode(this.blockStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BlockContactReq(contactUid=" + this.contactUid + ", blockStatus=" + this.blockStatus + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.BlockContactReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BlockContactReq> serializer() {
            return BlockContactReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BlockContactReq(int i, long j, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, BlockContactReq$$serializer.INSTANCE.getDescriptor());
        }
        this.contactUid = j;
        this.blockStatus = i2;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(BlockContactReq blockContactReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, blockContactReq.contactUid);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, blockContactReq.blockStatus);
    }

    public BlockContactReq(long j, int i) {
        this.contactUid = j;
        this.blockStatus = i;
    }
}
