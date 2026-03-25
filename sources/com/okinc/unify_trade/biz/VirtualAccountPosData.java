package com.okinc.unify_trade.biz;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class VirtualAccountPosData {
    private String bizRefType;
    private String posAmt;
    private int privateType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizRefType() {
        return this.bizRefType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosAmt() {
        return this.posAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPrivateType() {
        return this.privateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizRefType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bizRefType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrivateType(int i) {
        this.privateType = i;
    }

    public VirtualAccountPosData() {
        this.bizRefType = "";
        this.posAmt = "";
    }

    public /* synthetic */ VirtualAccountPosData(int i, String str, String str2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bizRefType = "";
        } else {
            this.bizRefType = str;
        }
        if ((i & 2) == 0) {
            this.posAmt = "";
        } else {
            this.posAmt = str2;
        }
        if ((i & 4) == 0) {
            this.privateType = 0;
        } else {
            this.privateType = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(VirtualAccountPosData virtualAccountPosData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) virtualAccountPosData.bizRefType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, virtualAccountPosData.bizRefType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) virtualAccountPosData.posAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, virtualAccountPosData.posAmt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && virtualAccountPosData.privateType == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, virtualAccountPosData.privateType);
    }

    public static final class Companion {

        public static final class StateListAnimator extends TypeToken<List<? extends VirtualAccountPosData>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.VirtualAccountPosData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VirtualAccountPosData> serializer() {
            return VirtualAccountPosData$$serializer.INSTANCE;
        }

        public final List<VirtualAccountPosData> EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                List<VirtualAccountPosData> list = (List) new Gson().fromJson(str, new StateListAnimator().getType());
                if (list == null) {
                    return list;
                }
                list.isEmpty();
                return list;
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "VirtualAccount-jsonConvert" + e.getMessage());
                return null;
            }
        }
    }
}
