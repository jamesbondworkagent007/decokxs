package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class UnBindBackendReferralCodeCacheBean {
    private final PreferRefCodeInfoResponse bean;
    private final String code;
    private final InviteeInfoItemResponse inviteeInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UnBindBackendReferralCodeCacheBean copy$default(UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBean, String str, PreferRefCodeInfoResponse preferRefCodeInfoResponse, InviteeInfoItemResponse inviteeInfoItemResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unBindBackendReferralCodeCacheBean.code;
        }
        if ((i & 2) != 0) {
            preferRefCodeInfoResponse = unBindBackendReferralCodeCacheBean.bean;
        }
        if ((i & 4) != 0) {
            inviteeInfoItemResponse = unBindBackendReferralCodeCacheBean.inviteeInfo;
        }
        return unBindBackendReferralCodeCacheBean.copy(str, preferRefCodeInfoResponse, inviteeInfoItemResponse);
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
    public final InviteeInfoItemResponse component3() {
        return this.inviteeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnBindBackendReferralCodeCacheBean copy(@NotNull String str, @NotNull PreferRefCodeInfoResponse preferRefCodeInfoResponse, @NotNull InviteeInfoItemResponse inviteeInfoItemResponse) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(preferRefCodeInfoResponse, "");
        Intrinsics.checkNotNullParameter(inviteeInfoItemResponse, "");
        return new UnBindBackendReferralCodeCacheBean(str, preferRefCodeInfoResponse, inviteeInfoItemResponse);
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
    public final InviteeInfoItemResponse getInviteeInfo() {
        return this.inviteeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnBindBackendReferralCodeCacheBean(code=" + this.code + ", bean=" + this.bean + ", inviteeInfo=" + this.inviteeInfo + ")";
    }

    public /* synthetic */ UnBindBackendReferralCodeCacheBean(int i, String str, PreferRefCodeInfoResponse preferRefCodeInfoResponse, InviteeInfoItemResponse inviteeInfoItemResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, UnBindBackendReferralCodeCacheBean$$serializer.INSTANCE.getDescriptor());
        }
        this.code = str;
        this.bean = preferRefCodeInfoResponse;
        this.inviteeInfo = inviteeInfoItemResponse;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, unBindBackendReferralCodeCacheBean.code);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, PreferRefCodeInfoResponse$$serializer.INSTANCE, unBindBackendReferralCodeCacheBean.bean);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, InviteeInfoItemResponse$$serializer.INSTANCE, unBindBackendReferralCodeCacheBean.inviteeInfo);
    }

    public UnBindBackendReferralCodeCacheBean(@NotNull String str, @NotNull PreferRefCodeInfoResponse preferRefCodeInfoResponse, @NotNull InviteeInfoItemResponse inviteeInfoItemResponse) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(preferRefCodeInfoResponse, "");
        Intrinsics.checkNotNullParameter(inviteeInfoItemResponse, "");
        this.code = str;
        this.bean = preferRefCodeInfoResponse;
        this.inviteeInfo = inviteeInfoItemResponse;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnBindBackendReferralCodeCacheBean)) {
            return false;
        }
        UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBean = (UnBindBackendReferralCodeCacheBean) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) unBindBackendReferralCodeCacheBean.code) && Intrinsics.EZpvd(this.bean, unBindBackendReferralCodeCacheBean.bean) && Intrinsics.EZpvd(this.inviteeInfo, unBindBackendReferralCodeCacheBean.inviteeInfo);
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode();
        return (((iHashCode * 31) + this.bean.hashCode()) * 31) + this.inviteeInfo.hashCode();
    }

    public final String toJson() {
        Json.Default r0 = Json.Default;
        r0.getSerializersModule();
        return r0.encodeToString(Companion.serializer(), this);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.UnBindBackendReferralCodeCacheBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UnBindBackendReferralCodeCacheBean> serializer() {
            return UnBindBackendReferralCodeCacheBean$$serializer.INSTANCE;
        }
    }
}
