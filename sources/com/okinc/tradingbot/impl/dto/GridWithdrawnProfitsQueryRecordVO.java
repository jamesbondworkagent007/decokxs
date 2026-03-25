package com.okinc.tradingbot.impl.dto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class GridWithdrawnProfitsQueryRecordVO {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final long time;
    public final String withdrawnProfitsAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GridWithdrawnProfitsQueryRecordVO copy$default(GridWithdrawnProfitsQueryRecordVO gridWithdrawnProfitsQueryRecordVO, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = gridWithdrawnProfitsQueryRecordVO.time;
        }
        if ((i & 2) != 0) {
            str = gridWithdrawnProfitsQueryRecordVO.withdrawnProfitsAmount;
        }
        return gridWithdrawnProfitsQueryRecordVO.copydefault(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridWithdrawnProfitsQueryRecordVO copydefault(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GridWithdrawnProfitsQueryRecordVO(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridWithdrawnProfitsQueryRecordVO)) {
            return false;
        }
        GridWithdrawnProfitsQueryRecordVO gridWithdrawnProfitsQueryRecordVO = (GridWithdrawnProfitsQueryRecordVO) obj;
        return this.time == gridWithdrawnProfitsQueryRecordVO.time && Intrinsics.EZpvd((Object) this.withdrawnProfitsAmount, (Object) gridWithdrawnProfitsQueryRecordVO.withdrawnProfitsAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + this.withdrawnProfitsAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridWithdrawnProfitsQueryRecordVO(time=" + this.time + ", withdrawnProfitsAmount=" + this.withdrawnProfitsAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.GridWithdrawnProfitsQueryRecordVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GridWithdrawnProfitsQueryRecordVO> serializer() {
            return GridWithdrawnProfitsQueryRecordVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GridWithdrawnProfitsQueryRecordVO(int i, long j, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, GridWithdrawnProfitsQueryRecordVO$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.time = 0L;
        } else {
            this.time = j;
        }
        this.withdrawnProfitsAmount = str;
    }

    public static final /* synthetic */ void OLrzqt(GridWithdrawnProfitsQueryRecordVO gridWithdrawnProfitsQueryRecordVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || gridWithdrawnProfitsQueryRecordVO.time != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, gridWithdrawnProfitsQueryRecordVO.time);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, gridWithdrawnProfitsQueryRecordVO.withdrawnProfitsAmount);
    }

    public GridWithdrawnProfitsQueryRecordVO(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.time = j;
        this.withdrawnProfitsAmount = str;
    }
}
