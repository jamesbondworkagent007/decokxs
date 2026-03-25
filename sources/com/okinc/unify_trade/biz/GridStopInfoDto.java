package com.okinc.unify_trade.biz;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class GridStopInfoDto {
    private static final KSerializer<Object>[] $childSerializers;
    public static final String CLOSE_POSITION = "1";
    public static final String KEEP_POSITION = "2";
    private final StopAmtInfo curPosSz;
    private final StopAmtInfo curTotalPnL;
    private final StopAmtInfo estFeeForClose;
    private final StopAmtInfo estTotalPnLAfterClose;
    private final List<StopAmtInfo> returnCoinAmount;
    private final List<StopAmtInfo> sellCoinAmount;
    private final String stopType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GridStopInfoDto() {
        this((String) null, (StopAmtInfo) null, (StopAmtInfo) null, (StopAmtInfo) null, (StopAmtInfo) null, (List) null, (List) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.unify_trade.biz.GridStopInfoDto */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GridStopInfoDto copy$default(GridStopInfoDto gridStopInfoDto, String str, StopAmtInfo stopAmtInfo, StopAmtInfo stopAmtInfo2, StopAmtInfo stopAmtInfo3, StopAmtInfo stopAmtInfo4, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gridStopInfoDto.stopType;
        }
        if ((i & 2) != 0) {
            stopAmtInfo = gridStopInfoDto.estFeeForClose;
        }
        StopAmtInfo stopAmtInfo5 = stopAmtInfo;
        if ((i & 4) != 0) {
            stopAmtInfo2 = gridStopInfoDto.estTotalPnLAfterClose;
        }
        StopAmtInfo stopAmtInfo6 = stopAmtInfo2;
        if ((i & 8) != 0) {
            stopAmtInfo3 = gridStopInfoDto.curTotalPnL;
        }
        StopAmtInfo stopAmtInfo7 = stopAmtInfo3;
        if ((i & 16) != 0) {
            stopAmtInfo4 = gridStopInfoDto.curPosSz;
        }
        StopAmtInfo stopAmtInfo8 = stopAmtInfo4;
        if ((i & 32) != 0) {
            list = gridStopInfoDto.sellCoinAmount;
        }
        List list3 = list;
        if ((i & 64) != 0) {
            list2 = gridStopInfoDto.returnCoinAmount;
        }
        return gridStopInfoDto.copy(str, stopAmtInfo5, stopAmtInfo6, stopAmtInfo7, stopAmtInfo8, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StopAmtInfo component2() {
        return this.estFeeForClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StopAmtInfo component3() {
        return this.estTotalPnLAfterClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StopAmtInfo component4() {
        return this.curTotalPnL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StopAmtInfo component5() {
        return this.curPosSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StopAmtInfo> component6() {
        return this.sellCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StopAmtInfo> component7() {
        return this.returnCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridStopInfoDto copy(@NotNull String str, StopAmtInfo stopAmtInfo, StopAmtInfo stopAmtInfo2, StopAmtInfo stopAmtInfo3, StopAmtInfo stopAmtInfo4, @NotNull List<StopAmtInfo> list, @NotNull List<StopAmtInfo> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new GridStopInfoDto(str, stopAmtInfo, stopAmtInfo2, stopAmtInfo3, stopAmtInfo4, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridStopInfoDto)) {
            return false;
        }
        GridStopInfoDto gridStopInfoDto = (GridStopInfoDto) obj;
        return Intrinsics.EZpvd((Object) this.stopType, (Object) gridStopInfoDto.stopType) && Intrinsics.EZpvd(this.estFeeForClose, gridStopInfoDto.estFeeForClose) && Intrinsics.EZpvd(this.estTotalPnLAfterClose, gridStopInfoDto.estTotalPnLAfterClose) && Intrinsics.EZpvd(this.curTotalPnL, gridStopInfoDto.curTotalPnL) && Intrinsics.EZpvd(this.curPosSz, gridStopInfoDto.curPosSz) && Intrinsics.EZpvd(this.sellCoinAmount, gridStopInfoDto.sellCoinAmount) && Intrinsics.EZpvd(this.returnCoinAmount, gridStopInfoDto.returnCoinAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StopAmtInfo getCurPosSz() {
        return this.curPosSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StopAmtInfo getCurTotalPnL() {
        return this.curTotalPnL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StopAmtInfo getEstFeeForClose() {
        return this.estFeeForClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StopAmtInfo getEstTotalPnLAfterClose() {
        return this.estTotalPnLAfterClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StopAmtInfo> getReturnCoinAmount() {
        return this.returnCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StopAmtInfo> getSellCoinAmount() {
        return this.sellCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopType() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.stopType.hashCode();
        StopAmtInfo stopAmtInfo = this.estFeeForClose;
        int iHashCode2 = stopAmtInfo == null ? 0 : stopAmtInfo.hashCode();
        StopAmtInfo stopAmtInfo2 = this.estTotalPnLAfterClose;
        int iHashCode3 = stopAmtInfo2 == null ? 0 : stopAmtInfo2.hashCode();
        StopAmtInfo stopAmtInfo3 = this.curTotalPnL;
        int iHashCode4 = stopAmtInfo3 == null ? 0 : stopAmtInfo3.hashCode();
        StopAmtInfo stopAmtInfo4 = this.curPosSz;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (stopAmtInfo4 != null ? stopAmtInfo4.hashCode() : 0)) * 31) + this.sellCoinAmount.hashCode()) * 31) + this.returnCoinAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridStopInfoDto(stopType=" + this.stopType + ", estFeeForClose=" + this.estFeeForClose + ", estTotalPnLAfterClose=" + this.estTotalPnLAfterClose + ", curTotalPnL=" + this.curTotalPnL + ", curPosSz=" + this.curPosSz + ", sellCoinAmount=" + this.sellCoinAmount + ", returnCoinAmount=" + this.returnCoinAmount + ")";
    }

    public /* synthetic */ GridStopInfoDto(int i, String str, StopAmtInfo stopAmtInfo, StopAmtInfo stopAmtInfo2, StopAmtInfo stopAmtInfo3, StopAmtInfo stopAmtInfo4, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.stopType = (i & 1) == 0 ? "" : str;
        int i2 = 3;
        String str2 = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        byte b8 = 0;
        byte b9 = 0;
        byte b10 = 0;
        byte b11 = 0;
        if ((i & 2) == 0) {
            this.estFeeForClose = new StopAmtInfo(str2, (String) (b11 == true ? 1 : 0), i2, (DefaultConstructorMarker) (b10 == true ? 1 : 0));
        } else {
            this.estFeeForClose = stopAmtInfo;
        }
        if ((i & 4) == 0) {
            this.estTotalPnLAfterClose = new StopAmtInfo((String) (b9 == true ? 1 : 0), (String) (b8 == true ? 1 : 0), i2, (DefaultConstructorMarker) (b7 == true ? 1 : 0));
        } else {
            this.estTotalPnLAfterClose = stopAmtInfo2;
        }
        if ((i & 8) == 0) {
            this.curTotalPnL = new StopAmtInfo((String) (b6 == true ? 1 : 0), (String) (b5 == true ? 1 : 0), i2, (DefaultConstructorMarker) (b4 == true ? 1 : 0));
        } else {
            this.curTotalPnL = stopAmtInfo3;
        }
        if ((i & 16) == 0) {
            this.curPosSz = new StopAmtInfo((String) (b3 == true ? 1 : 0), (String) (b2 == true ? 1 : 0), i2, (DefaultConstructorMarker) (b == true ? 1 : 0));
        } else {
            this.curPosSz = stopAmtInfo4;
        }
        if ((i & 32) == 0) {
            this.sellCoinAmount = yDY.AhwBna();
        } else {
            this.sellCoinAmount = list;
        }
        if ((i & 64) == 0) {
            this.returnCoinAmount = yDY.AhwBna();
        } else {
            this.returnCoinAmount = list2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [6=7] */
    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(GridStopInfoDto gridStopInfoDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) gridStopInfoDto.stopType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, gridStopInfoDto.stopType);
        }
        int i = 3;
        String str = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        byte b8 = 0;
        byte b9 = 0;
        byte b10 = 0;
        byte b11 = 0;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(gridStopInfoDto.estFeeForClose, new StopAmtInfo(str, (String) (b11 == true ? 1 : 0), i, (DefaultConstructorMarker) (b10 == true ? 1 : 0)))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StopAmtInfo$$serializer.INSTANCE, gridStopInfoDto.estFeeForClose);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(gridStopInfoDto.estTotalPnLAfterClose, new StopAmtInfo((String) (b9 == true ? 1 : 0), (String) (b8 == true ? 1 : 0), i, (DefaultConstructorMarker) (b7 == true ? 1 : 0)))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StopAmtInfo$$serializer.INSTANCE, gridStopInfoDto.estTotalPnLAfterClose);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(gridStopInfoDto.curTotalPnL, new StopAmtInfo((String) (b6 == true ? 1 : 0), (String) (b5 == true ? 1 : 0), i, (DefaultConstructorMarker) (b4 == true ? 1 : 0)))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StopAmtInfo$$serializer.INSTANCE, gridStopInfoDto.curTotalPnL);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(gridStopInfoDto.curPosSz, new StopAmtInfo((String) (b3 == true ? 1 : 0), (String) (b2 == true ? 1 : 0), i, (DefaultConstructorMarker) (b == true ? 1 : 0)))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StopAmtInfo$$serializer.INSTANCE, gridStopInfoDto.curPosSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(gridStopInfoDto.sellCoinAmount, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], gridStopInfoDto.sellCoinAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd(gridStopInfoDto.returnCoinAmount, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], gridStopInfoDto.returnCoinAmount);
    }

    public GridStopInfoDto(@NotNull String str, StopAmtInfo stopAmtInfo, StopAmtInfo stopAmtInfo2, StopAmtInfo stopAmtInfo3, StopAmtInfo stopAmtInfo4, @NotNull List<StopAmtInfo> list, @NotNull List<StopAmtInfo> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.stopType = str;
        this.estFeeForClose = stopAmtInfo;
        this.estTotalPnLAfterClose = stopAmtInfo2;
        this.curTotalPnL = stopAmtInfo3;
        this.curPosSz = stopAmtInfo4;
        this.sellCoinAmount = list;
        this.returnCoinAmount = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GridStopInfoDto(String str, StopAmtInfo stopAmtInfo, StopAmtInfo stopAmtInfo2, StopAmtInfo stopAmtInfo3, StopAmtInfo stopAmtInfo4, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = 3;
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new StopAmtInfo((String) null, (String) (0 == true ? 1 : 0), i2, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : stopAmtInfo, (i & 4) != 0 ? new StopAmtInfo((String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), i2, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : stopAmtInfo2, (i & 8) != 0 ? new StopAmtInfo((String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), i2, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : stopAmtInfo3, (i & 16) != 0 ? new StopAmtInfo((String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), i2, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : stopAmtInfo4, (i & 32) != 0 ? yDY.AhwBna() : list, (i & 64) != 0 ? yDY.AhwBna() : list2);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.GridStopInfoDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GridStopInfoDto> serializer() {
            return GridStopInfoDto$$serializer.INSTANCE;
        }
    }

    static {
        StopAmtInfo$$serializer stopAmtInfo$$serializer = StopAmtInfo$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, new ArrayListSerializer(BuiltinSerializersKt.getNullable(stopAmtInfo$$serializer)), new ArrayListSerializer(BuiltinSerializersKt.getNullable(stopAmtInfo$$serializer))};
    }
}
