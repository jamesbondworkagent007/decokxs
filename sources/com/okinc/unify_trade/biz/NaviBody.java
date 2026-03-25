package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class NaviBody {
    private String configType;
    private String configValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConfigType() {
        return this.configType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConfigValue() {
        return this.configValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfigType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.configType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfigValue(String str) {
        this.configValue = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.NaviBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NaviBody> serializer() {
            return NaviBody$$serializer.INSTANCE;
        }
    }

    public NaviBody() {
        this.configType = "";
    }

    public /* synthetic */ NaviBody(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.configType = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.configValue = null;
        } else {
            this.configValue = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(NaviBody naviBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) naviBody.configType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, naviBody.configType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && naviBody.configValue == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, naviBody.configValue);
    }
}
