package com.okinc.tradingbot.impl.dto;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class GridReinvestedProfitsQueryVO {
    public final String algoId;
    public final String ccy;
    public final List<GridReinvestedProfitsQueryRecordVO> details;
    public final String totalReinvestedProfits;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(GridReinvestedProfitsQueryRecordVO$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GridReinvestedProfitsQueryVO() {
        this((String) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.dto.GridReinvestedProfitsQueryVO */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GridReinvestedProfitsQueryVO copy$default(GridReinvestedProfitsQueryVO gridReinvestedProfitsQueryVO, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gridReinvestedProfitsQueryVO.algoId;
        }
        if ((i & 2) != 0) {
            str2 = gridReinvestedProfitsQueryVO.ccy;
        }
        if ((i & 4) != 0) {
            str3 = gridReinvestedProfitsQueryVO.totalReinvestedProfits;
        }
        if ((i & 8) != 0) {
            list = gridReinvestedProfitsQueryVO.details;
        }
        return gridReinvestedProfitsQueryVO.OLrzqt(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.totalReinvestedProfits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridReinvestedProfitsQueryVO OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<GridReinvestedProfitsQueryRecordVO> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new GridReinvestedProfitsQueryVO(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridReinvestedProfitsQueryVO)) {
            return false;
        }
        GridReinvestedProfitsQueryVO gridReinvestedProfitsQueryVO = (GridReinvestedProfitsQueryVO) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) gridReinvestedProfitsQueryVO.algoId) && Intrinsics.EZpvd((Object) this.ccy, (Object) gridReinvestedProfitsQueryVO.ccy) && Intrinsics.EZpvd((Object) this.totalReinvestedProfits, (Object) gridReinvestedProfitsQueryVO.totalReinvestedProfits) && Intrinsics.EZpvd(this.details, gridReinvestedProfitsQueryVO.details);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.algoId.hashCode() * 31) + this.ccy.hashCode()) * 31) + this.totalReinvestedProfits.hashCode()) * 31) + this.details.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridReinvestedProfitsQueryVO(algoId=" + this.algoId + ", ccy=" + this.ccy + ", totalReinvestedProfits=" + this.totalReinvestedProfits + ", details=" + this.details + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.GridReinvestedProfitsQueryVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GridReinvestedProfitsQueryVO> serializer() {
            return GridReinvestedProfitsQueryVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GridReinvestedProfitsQueryVO(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str2;
        }
        if ((i & 4) == 0) {
            this.totalReinvestedProfits = "";
        } else {
            this.totalReinvestedProfits = str3;
        }
        if ((i & 8) == 0) {
            this.details = yDY.AhwBna();
        } else {
            this.details = list;
        }
    }

    public static final /* synthetic */ void OLrzqt(GridReinvestedProfitsQueryVO gridReinvestedProfitsQueryVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) gridReinvestedProfitsQueryVO.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, gridReinvestedProfitsQueryVO.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) gridReinvestedProfitsQueryVO.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, gridReinvestedProfitsQueryVO.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) gridReinvestedProfitsQueryVO.totalReinvestedProfits, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, gridReinvestedProfitsQueryVO.totalReinvestedProfits);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(gridReinvestedProfitsQueryVO.details, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], gridReinvestedProfitsQueryVO.details);
    }

    public GridReinvestedProfitsQueryVO(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<GridReinvestedProfitsQueryRecordVO> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.algoId = str;
        this.ccy = str2;
        this.totalReinvestedProfits = str3;
        this.details = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.tradingbot.impl.dto.GridReinvestedProfitsQueryRecordVO>):void (m)] (LINE:7) call: com.okinc.tradingbot.impl.dto.GridReinvestedProfitsQueryVO.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ GridReinvestedProfitsQueryVO(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? yDY.AhwBna() : list);
    }
}
