package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ClaimableBalanceVO {
    public final List<InsufficientReward> insufficientRewardList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(InsufficientReward$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ClaimableBalanceVO() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.ClaimableBalanceVO */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClaimableBalanceVO copy$default(ClaimableBalanceVO claimableBalanceVO, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = claimableBalanceVO.insufficientRewardList;
        }
        return claimableBalanceVO.EZpvd(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClaimableBalanceVO EZpvd(List<InsufficientReward> list) {
        return new ClaimableBalanceVO(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InsufficientReward> KWHzl() {
        return this.insufficientRewardList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClaimableBalanceVO) && Intrinsics.EZpvd(this.insufficientRewardList, ((ClaimableBalanceVO) obj).insufficientRewardList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<InsufficientReward> list = this.insufficientRewardList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ClaimableBalanceVO(insufficientRewardList=" + this.insufficientRewardList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.ClaimableBalanceVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ClaimableBalanceVO> serializer() {
            return ClaimableBalanceVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ClaimableBalanceVO(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.insufficientRewardList = yDY.AhwBna();
        } else {
            this.insufficientRewardList = list;
        }
    }

    public static final /* synthetic */ void OLrzqt(ClaimableBalanceVO claimableBalanceVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(claimableBalanceVO.insufficientRewardList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], claimableBalanceVO.insufficientRewardList);
    }

    public ClaimableBalanceVO(List<InsufficientReward> list) {
        this.insufficientRewardList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:1037)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InsufficientReward>):void (m)] (LINE:1035) call: com.okinc.business.invest_biz.data.bean.ClaimableBalanceVO.<init>(java.util.List):void type: THIS */
    public /* synthetic */ ClaimableBalanceVO(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
