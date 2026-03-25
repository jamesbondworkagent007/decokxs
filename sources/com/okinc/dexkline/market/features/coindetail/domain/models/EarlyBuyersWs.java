package com.okinc.dexkline.market.features.coindetail.domain.models;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class EarlyBuyersWs {
    private final EarlyBuyers earlyBuyerVO;
    private final int pageNum;
    private final int pageSize;
    private final int totalPage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarlyBuyersWs() {
        this((EarlyBuyers) null, 0, 0, 0, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EarlyBuyersWs copy$default(EarlyBuyersWs earlyBuyersWs, EarlyBuyers earlyBuyers, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            earlyBuyers = earlyBuyersWs.earlyBuyerVO;
        }
        if ((i4 & 2) != 0) {
            i = earlyBuyersWs.pageNum;
        }
        if ((i4 & 4) != 0) {
            i2 = earlyBuyersWs.pageSize;
        }
        if ((i4 & 8) != 0) {
            i3 = earlyBuyersWs.totalPage;
        }
        return earlyBuyersWs.copy(earlyBuyers, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarlyBuyers component1() {
        return this.earlyBuyerVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.totalPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarlyBuyersWs copy(@NotNull EarlyBuyers earlyBuyers, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(earlyBuyers, "");
        return new EarlyBuyersWs(earlyBuyers, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyBuyersWs)) {
            return false;
        }
        EarlyBuyersWs earlyBuyersWs = (EarlyBuyersWs) obj;
        return Intrinsics.EZpvd(this.earlyBuyerVO, earlyBuyersWs.earlyBuyerVO) && this.pageNum == earlyBuyersWs.pageNum && this.pageSize == earlyBuyersWs.pageSize && this.totalPage == earlyBuyersWs.totalPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarlyBuyers getEarlyBuyerVO() {
        return this.earlyBuyerVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageNum() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotalPage() {
        return this.totalPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.earlyBuyerVO.hashCode() * 31) + Integer.hashCode(this.pageNum)) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.totalPage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarlyBuyersWs(earlyBuyerVO=" + this.earlyBuyerVO + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", totalPage=" + this.totalPage + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.features.coindetail.domain.models.EarlyBuyersWs.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarlyBuyersWs> serializer() {
            return EarlyBuyersWs$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarlyBuyersWs(int i, EarlyBuyers earlyBuyers, int i2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        this.earlyBuyerVO = (i & 1) == 0 ? new EarlyBuyers((String) null, (String) null, (String) null, (String) null, (List) null, 31, (DefaultConstructorMarker) null) : earlyBuyers;
        if ((i & 2) == 0) {
            this.pageNum = 0;
        } else {
            this.pageNum = i2;
        }
        if ((i & 4) == 0) {
            this.pageSize = 0;
        } else {
            this.pageSize = i3;
        }
        if ((i & 8) == 0) {
            this.totalPage = 0;
        } else {
            this.totalPage = i4;
        }
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(EarlyBuyersWs earlyBuyersWs, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(earlyBuyersWs.earlyBuyerVO, new EarlyBuyers((String) null, (String) null, (String) null, (String) null, (List) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, EarlyBuyers$$serializer.INSTANCE, earlyBuyersWs.earlyBuyerVO);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || earlyBuyersWs.pageNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, earlyBuyersWs.pageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || earlyBuyersWs.pageSize != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, earlyBuyersWs.pageSize);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && earlyBuyersWs.totalPage == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, earlyBuyersWs.totalPage);
    }

    public EarlyBuyersWs(@NotNull EarlyBuyers earlyBuyers, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(earlyBuyers, "");
        this.earlyBuyerVO = earlyBuyers;
        this.pageNum = i;
        this.pageSize = i2;
        this.totalPage = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (wrap:com.okinc.dexkline.market.features.coindetail.domain.models.EarlyBuyers:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.dexkline.market.features.coindetail.domain.models.EarlyBuyers:0x000f: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:23) call: com.okinc.dexkline.market.features.coindetail.domain.models.EarlyBuyers.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r9v0 com.okinc.dexkline.market.features.coindetail.domain.models.EarlyBuyers))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
 A[MD:(com.okinc.dexkline.market.features.coindetail.domain.models.EarlyBuyers, int, int, int):void (m)] (LINE:22) call: com.okinc.dexkline.market.features.coindetail.domain.models.EarlyBuyersWs.<init>(com.okinc.dexkline.market.features.coindetail.domain.models.EarlyBuyers, int, int, int):void type: THIS */
    public /* synthetic */ EarlyBuyersWs(EarlyBuyers earlyBuyers, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new EarlyBuyers((String) null, (String) null, (String) null, (String) null, (List) null, 31, (DefaultConstructorMarker) null) : earlyBuyers, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3);
    }
}
