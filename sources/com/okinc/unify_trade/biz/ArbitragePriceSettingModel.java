package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class ArbitragePriceSettingModel {
    private String sCode;
    private String sMsg;
    private ArbitragePriceSetting userStrategyConfig;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSCode() {
        return this.sCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSMsg() {
        return this.sMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitragePriceSetting getUserStrategyConfig() {
        return this.userStrategyConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSCode(String str) {
        this.sCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSMsg(String str) {
        this.sMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserStrategyConfig(ArbitragePriceSetting arbitragePriceSetting) {
        this.userStrategyConfig = arbitragePriceSetting;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ArbitragePriceSettingModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArbitragePriceSettingModel> serializer() {
            return ArbitragePriceSettingModel$$serializer.INSTANCE;
        }
    }

    public ArbitragePriceSettingModel() {
    }

    public /* synthetic */ ArbitragePriceSettingModel(int i, ArbitragePriceSetting arbitragePriceSetting, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.userStrategyConfig = null;
        } else {
            this.userStrategyConfig = arbitragePriceSetting;
        }
        if ((i & 2) == 0) {
            this.sCode = null;
        } else {
            this.sCode = str;
        }
        if ((i & 4) == 0) {
            this.sMsg = null;
        } else {
            this.sMsg = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ArbitragePriceSettingModel arbitragePriceSettingModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || arbitragePriceSettingModel.userStrategyConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ArbitragePriceSetting$$serializer.INSTANCE, arbitragePriceSettingModel.userStrategyConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || arbitragePriceSettingModel.sCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, arbitragePriceSettingModel.sCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && arbitragePriceSettingModel.sMsg == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, arbitragePriceSettingModel.sMsg);
    }
}
