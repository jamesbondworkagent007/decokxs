package com.okinc.business.dex.tee.common.ws.data.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TeeWsPnLData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final WsPnlStatDto pnlStatDTO;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TeeWsPnLData() {
        this((WsPnlStatDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TeeWsPnLData copy$default(TeeWsPnLData teeWsPnLData, WsPnlStatDto wsPnlStatDto, int i, Object obj) {
        if ((i & 1) != 0) {
            wsPnlStatDto = teeWsPnLData.pnlStatDTO;
        }
        return teeWsPnLData.copy(wsPnlStatDto);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WsPnlStatDto component1() {
        return this.pnlStatDTO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeWsPnLData copy(WsPnlStatDto wsPnlStatDto) {
        return new TeeWsPnLData(wsPnlStatDto);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TeeWsPnLData) && Intrinsics.EZpvd(this.pnlStatDTO, ((TeeWsPnLData) obj).pnlStatDTO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WsPnlStatDto getPnlStatDTO() {
        return this.pnlStatDTO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        WsPnlStatDto wsPnlStatDto = this.pnlStatDTO;
        if (wsPnlStatDto == null) {
            return 0;
        }
        return wsPnlStatDto.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeWsPnLData(pnlStatDTO=" + this.pnlStatDTO + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsPnLData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TeeWsPnLData> serializer() {
            return TeeWsPnLData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TeeWsPnLData(int i, WsPnlStatDto wsPnlStatDto, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pnlStatDTO = null;
        } else {
            this.pnlStatDTO = wsPnlStatDto;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TeeWsPnLData teeWsPnLData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && teeWsPnLData.pnlStatDTO == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, WsPnlStatDto$$serializer.INSTANCE, teeWsPnLData.pnlStatDTO);
    }

    public TeeWsPnLData(WsPnlStatDto wsPnlStatDto) {
        this.pnlStatDTO = wsPnlStatDto;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.tee.common.ws.data.domain.model.WsPnlStatDto:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.tee.common.ws.data.domain.model.WsPnlStatDto) : (r1v0 com.okinc.business.dex.tee.common.ws.data.domain.model.WsPnlStatDto))
 A[MD:(com.okinc.business.dex.tee.common.ws.data.domain.model.WsPnlStatDto):void (m)] (LINE:96) call: com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsPnLData.<init>(com.okinc.business.dex.tee.common.ws.data.domain.model.WsPnlStatDto):void type: THIS */
    public /* synthetic */ TeeWsPnLData(WsPnlStatDto wsPnlStatDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wsPnlStatDto);
    }
}
