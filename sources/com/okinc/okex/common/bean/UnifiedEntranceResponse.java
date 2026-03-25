package com.okinc.okex.common.bean;

import com.okinc.biz.bean.enums.SupportChannelType;
import com.okinc.okex.common.model.SupportServiceData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C45296snC;

/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = C45296snC.class)
public final class UnifiedEntranceResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final SupportChannelType channel;
    private final SupportServiceData channelData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UnifiedEntranceResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UnifiedEntranceResponse copy$default(UnifiedEntranceResponse unifiedEntranceResponse, SupportChannelType supportChannelType, SupportServiceData supportServiceData, int i, Object obj) {
        if ((i & 1) != 0) {
            supportChannelType = unifiedEntranceResponse.channel;
        }
        if ((i & 2) != 0) {
            supportServiceData = unifiedEntranceResponse.channelData;
        }
        return unifiedEntranceResponse.copy(supportChannelType, supportServiceData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportChannelType component1() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportServiceData component2() {
        return this.channelData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnifiedEntranceResponse copy(SupportChannelType supportChannelType, SupportServiceData supportServiceData) {
        return new UnifiedEntranceResponse(supportChannelType, supportServiceData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedEntranceResponse)) {
            return false;
        }
        UnifiedEntranceResponse unifiedEntranceResponse = (UnifiedEntranceResponse) obj;
        return this.channel == unifiedEntranceResponse.channel && Intrinsics.EZpvd(this.channelData, unifiedEntranceResponse.channelData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportChannelType getChannel() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportServiceData getChannelData() {
        return this.channelData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        SupportChannelType supportChannelType = this.channel;
        int iHashCode = supportChannelType == null ? 0 : supportChannelType.hashCode();
        SupportServiceData supportServiceData = this.channelData;
        return (iHashCode * 31) + (supportServiceData != null ? supportServiceData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnifiedEntranceResponse(channel=" + this.channel + ", channelData=" + this.channelData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.bean.UnifiedEntranceResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UnifiedEntranceResponse> serializer() {
            return C45296snC.AEQbTJ;
        }
    }

    public UnifiedEntranceResponse(SupportChannelType supportChannelType, SupportServiceData supportServiceData) {
        this.channel = supportChannelType;
        this.channelData = supportServiceData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.biz.bean.enums.SupportChannelType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.biz.bean.enums.SupportChannelType) : (r2v0 com.okinc.biz.bean.enums.SupportChannelType))
  (wrap:com.okinc.okex.common.model.SupportServiceData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.common.model.SupportServiceData) : (r3v0 com.okinc.okex.common.model.SupportServiceData))
 A[MD:(com.okinc.biz.bean.enums.SupportChannelType, com.okinc.okex.common.model.SupportServiceData):void (m)] (LINE:25) call: com.okinc.okex.common.bean.UnifiedEntranceResponse.<init>(com.okinc.biz.bean.enums.SupportChannelType, com.okinc.okex.common.model.SupportServiceData):void type: THIS */
    public /* synthetic */ UnifiedEntranceResponse(SupportChannelType supportChannelType, SupportServiceData supportServiceData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : supportChannelType, (i & 2) != 0 ? null : supportServiceData);
    }
}
