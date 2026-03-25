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
public final class GridReinvestedProfitsQueryRecordVO {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String reinvestProfitsAmount;
    public final long time;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GridReinvestedProfitsQueryRecordVO copy$default(GridReinvestedProfitsQueryRecordVO gridReinvestedProfitsQueryRecordVO, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = gridReinvestedProfitsQueryRecordVO.time;
        }
        if ((i & 2) != 0) {
            str = gridReinvestedProfitsQueryRecordVO.reinvestProfitsAmount;
        }
        return gridReinvestedProfitsQueryRecordVO.EZpvd(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridReinvestedProfitsQueryRecordVO EZpvd(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GridReinvestedProfitsQueryRecordVO(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridReinvestedProfitsQueryRecordVO)) {
            return false;
        }
        GridReinvestedProfitsQueryRecordVO gridReinvestedProfitsQueryRecordVO = (GridReinvestedProfitsQueryRecordVO) obj;
        return this.time == gridReinvestedProfitsQueryRecordVO.time && Intrinsics.EZpvd((Object) this.reinvestProfitsAmount, (Object) gridReinvestedProfitsQueryRecordVO.reinvestProfitsAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + this.reinvestProfitsAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridReinvestedProfitsQueryRecordVO(time=" + this.time + ", reinvestProfitsAmount=" + this.reinvestProfitsAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.GridReinvestedProfitsQueryRecordVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GridReinvestedProfitsQueryRecordVO> serializer() {
            return GridReinvestedProfitsQueryRecordVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GridReinvestedProfitsQueryRecordVO(int i, long j, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, GridReinvestedProfitsQueryRecordVO$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.time = 0L;
        } else {
            this.time = j;
        }
        this.reinvestProfitsAmount = str;
    }

    public static final /* synthetic */ void KWHzl(GridReinvestedProfitsQueryRecordVO gridReinvestedProfitsQueryRecordVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || gridReinvestedProfitsQueryRecordVO.time != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, gridReinvestedProfitsQueryRecordVO.time);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, gridReinvestedProfitsQueryRecordVO.reinvestProfitsAmount);
    }

    public GridReinvestedProfitsQueryRecordVO(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.time = j;
        this.reinvestProfitsAmount = str;
    }
}
