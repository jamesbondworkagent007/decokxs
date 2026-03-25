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
public final class GridWithdrawnProfitsQueryVO {
    public final String algoId;
    public final String ccy;
    public final List<GridWithdrawnProfitsQueryRecordVO> details;
    public final String totalWithdrawnProfits;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(GridWithdrawnProfitsQueryRecordVO$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GridWithdrawnProfitsQueryVO() {
        this((String) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.dto.GridWithdrawnProfitsQueryVO */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GridWithdrawnProfitsQueryVO copy$default(GridWithdrawnProfitsQueryVO gridWithdrawnProfitsQueryVO, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gridWithdrawnProfitsQueryVO.algoId;
        }
        if ((i & 2) != 0) {
            str2 = gridWithdrawnProfitsQueryVO.ccy;
        }
        if ((i & 4) != 0) {
            str3 = gridWithdrawnProfitsQueryVO.totalWithdrawnProfits;
        }
        if ((i & 8) != 0) {
            list = gridWithdrawnProfitsQueryVO.details;
        }
        return gridWithdrawnProfitsQueryVO.OLrzqt(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridWithdrawnProfitsQueryVO OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<GridWithdrawnProfitsQueryRecordVO> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new GridWithdrawnProfitsQueryVO(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.totalWithdrawnProfits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridWithdrawnProfitsQueryVO)) {
            return false;
        }
        GridWithdrawnProfitsQueryVO gridWithdrawnProfitsQueryVO = (GridWithdrawnProfitsQueryVO) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) gridWithdrawnProfitsQueryVO.algoId) && Intrinsics.EZpvd((Object) this.ccy, (Object) gridWithdrawnProfitsQueryVO.ccy) && Intrinsics.EZpvd((Object) this.totalWithdrawnProfits, (Object) gridWithdrawnProfitsQueryVO.totalWithdrawnProfits) && Intrinsics.EZpvd(this.details, gridWithdrawnProfitsQueryVO.details);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.algoId.hashCode() * 31) + this.ccy.hashCode()) * 31) + this.totalWithdrawnProfits.hashCode()) * 31) + this.details.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridWithdrawnProfitsQueryVO(algoId=" + this.algoId + ", ccy=" + this.ccy + ", totalWithdrawnProfits=" + this.totalWithdrawnProfits + ", details=" + this.details + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.GridWithdrawnProfitsQueryVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GridWithdrawnProfitsQueryVO> serializer() {
            return GridWithdrawnProfitsQueryVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GridWithdrawnProfitsQueryVO(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.totalWithdrawnProfits = "";
        } else {
            this.totalWithdrawnProfits = str3;
        }
        if ((i & 8) == 0) {
            this.details = yDY.AhwBna();
        } else {
            this.details = list;
        }
    }

    public static final /* synthetic */ void KWHzl(GridWithdrawnProfitsQueryVO gridWithdrawnProfitsQueryVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) gridWithdrawnProfitsQueryVO.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, gridWithdrawnProfitsQueryVO.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) gridWithdrawnProfitsQueryVO.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, gridWithdrawnProfitsQueryVO.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) gridWithdrawnProfitsQueryVO.totalWithdrawnProfits, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, gridWithdrawnProfitsQueryVO.totalWithdrawnProfits);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(gridWithdrawnProfitsQueryVO.details, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], gridWithdrawnProfitsQueryVO.details);
    }

    public GridWithdrawnProfitsQueryVO(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<GridWithdrawnProfitsQueryRecordVO> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.algoId = str;
        this.ccy = str2;
        this.totalWithdrawnProfits = str3;
        this.details = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.tradingbot.impl.dto.GridWithdrawnProfitsQueryRecordVO>):void (m)] (LINE:7) call: com.okinc.tradingbot.impl.dto.GridWithdrawnProfitsQueryVO.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ GridWithdrawnProfitsQueryVO(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? yDY.AhwBna() : list);
    }
}
