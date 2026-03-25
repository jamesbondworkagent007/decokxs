package com.okinc.business.defi.biz.net.bean;

import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import o.C56391yDq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class PreferRefCodeCacheBean {
    private final PreferRefCodeInfoResponse bean;
    private final String code;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PreferRefCodeCacheBean copy$default(PreferRefCodeCacheBean preferRefCodeCacheBean, String str, PreferRefCodeInfoResponse preferRefCodeInfoResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preferRefCodeCacheBean.code;
        }
        if ((i & 2) != 0) {
            preferRefCodeInfoResponse = preferRefCodeCacheBean.bean;
        }
        return preferRefCodeCacheBean.copy(str, preferRefCodeInfoResponse);
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
    public final PreferRefCodeCacheBean copy(@NotNull String str, @NotNull PreferRefCodeInfoResponse preferRefCodeInfoResponse) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(preferRefCodeInfoResponse, "");
        return new PreferRefCodeCacheBean(str, preferRefCodeInfoResponse);
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
        return "PreferRefCodeCacheBean(code=" + this.code + ", bean=" + this.bean + ")";
    }

    public /* synthetic */ PreferRefCodeCacheBean(int i, String str, PreferRefCodeInfoResponse preferRefCodeInfoResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PreferRefCodeCacheBean$$serializer.INSTANCE.getDescriptor());
        }
        this.code = str;
        this.bean = preferRefCodeInfoResponse;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(PreferRefCodeCacheBean preferRefCodeCacheBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, preferRefCodeCacheBean.code);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, PreferRefCodeInfoResponse$$serializer.INSTANCE, preferRefCodeCacheBean.bean);
    }

    public PreferRefCodeCacheBean(@NotNull String str, @NotNull PreferRefCodeInfoResponse preferRefCodeInfoResponse) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(preferRefCodeInfoResponse, "");
        this.code = str;
        this.bean = preferRefCodeInfoResponse;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferRefCodeCacheBean)) {
            return false;
        }
        PreferRefCodeCacheBean preferRefCodeCacheBean = (PreferRefCodeCacheBean) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) preferRefCodeCacheBean.code) && Intrinsics.EZpvd(this.bean, preferRefCodeCacheBean.bean);
    }

    public int hashCode() {
        return (this.code.hashCode() * 31) + this.bean.hashCode();
    }

    public final String toJson() {
        Json.Default r0 = Json.Default;
        r0.getSerializersModule();
        return r0.encodeToString(Companion.serializer(), this);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.PreferRefCodeCacheBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PreferRefCodeCacheBean> serializer() {
            return PreferRefCodeCacheBean$$serializer.INSTANCE;
        }

        public final PreferRefCodeCacheBean KWHzl(@NotNull String str) {
            Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(str, "");
            try {
                Result.Application application = Result.Companion;
                Json.Default r0 = Json.Default;
                r0.getSerializersModule();
                objM7377constructorimpl = Result.m7377constructorimpl((PreferRefCodeCacheBean) r0.decodeFromString(PreferRefCodeCacheBean.Companion.serializer(), str));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            return (PreferRefCodeCacheBean) objM7377constructorimpl;
        }
    }
}
