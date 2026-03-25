package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.biz.net.bean.DeviceRefCodeCacheBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DeviceRefCodeCacheBean {
    private final PreferRefCodeInfoResponse bean;
    private final String code;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Json jsonWithDefaults = JsonKt.Json$default(null, new Function1() { // from class: o.dbe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return DeviceRefCodeCacheBean.jsonWithDefaults$lambda$0((JsonBuilder) obj);
        }
    }, 1, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeviceRefCodeCacheBean copy$default(DeviceRefCodeCacheBean deviceRefCodeCacheBean, String str, PreferRefCodeInfoResponse preferRefCodeInfoResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceRefCodeCacheBean.code;
        }
        if ((i & 2) != 0) {
            preferRefCodeInfoResponse = deviceRefCodeCacheBean.bean;
        }
        return deviceRefCodeCacheBean.copy(str, preferRefCodeInfoResponse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreferRefCodeInfoResponse component2() {
        return this.bean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeviceRefCodeCacheBean copy(@NotNull String str, @NotNull PreferRefCodeInfoResponse preferRefCodeInfoResponse) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(preferRefCodeInfoResponse, "");
        return new DeviceRefCodeCacheBean(str, preferRefCodeInfoResponse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreferRefCodeInfoResponse getBean() {
        return this.bean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeviceRefCodeCacheBean(code=" + this.code + ", bean=" + this.bean + ")";
    }

    public /* synthetic */ DeviceRefCodeCacheBean(int i, String str, PreferRefCodeInfoResponse preferRefCodeInfoResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DeviceRefCodeCacheBean$$serializer.INSTANCE.getDescriptor());
        }
        this.code = str;
        this.bean = preferRefCodeInfoResponse;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DeviceRefCodeCacheBean deviceRefCodeCacheBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, deviceRefCodeCacheBean.code);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, PreferRefCodeInfoResponse$$serializer.INSTANCE, deviceRefCodeCacheBean.bean);
    }

    public DeviceRefCodeCacheBean(@NotNull String str, @NotNull PreferRefCodeInfoResponse preferRefCodeInfoResponse) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(preferRefCodeInfoResponse, "");
        this.code = str;
        this.bean = preferRefCodeInfoResponse;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceRefCodeCacheBean)) {
            return false;
        }
        DeviceRefCodeCacheBean deviceRefCodeCacheBean = (DeviceRefCodeCacheBean) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) deviceRefCodeCacheBean.code) && Intrinsics.EZpvd(this.bean, deviceRefCodeCacheBean.bean);
    }

    public int hashCode() {
        return (this.code.hashCode() * 31) + this.bean.hashCode();
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.DeviceRefCodeCacheBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DeviceRefCodeCacheBean> serializer() {
            return DeviceRefCodeCacheBean$$serializer.INSTANCE;
        }

        public final DeviceRefCodeCacheBean copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                Json json = DeviceRefCodeCacheBean.jsonWithDefaults;
                json.getSerializersModule();
                return (DeviceRefCodeCacheBean) json.decodeFromString(DeviceRefCodeCacheBean.Companion.serializer(), str);
            } catch (Exception e) {
                pUU.KWHzl("DexReferral", "DeviceRefCodeCacheBean fromJson", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jsonWithDefaults$lambda$0(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    public final String toJson() {
        Json json = jsonWithDefaults;
        json.getSerializersModule();
        return json.encodeToString(Companion.serializer(), this);
    }
}
