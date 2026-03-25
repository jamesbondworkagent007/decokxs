package com.okinc.business.market.data.model.alert;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class AlertListResponse {
    public final List<AlertDataResponse> alerts;
    public final String chainId;
    public final String chainLogoUrl;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final boolean f77native;
    public final String tokenAddress;
    public final String tokenLogoUrl;
    public final String tokenName;
    public final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(AlertDataResponse$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertListResponse EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6, @NotNull List<AlertDataResponse> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new AlertListResponse(str, str2, str3, str4, z, str5, str6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.f77native;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AlertDataResponse> KWHzl() {
        return this.alerts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertListResponse)) {
            return false;
        }
        AlertListResponse alertListResponse = (AlertListResponse) obj;
        return Intrinsics.EZpvd((Object) this.tokenAddress, (Object) alertListResponse.tokenAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) alertListResponse.chainId) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) alertListResponse.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) alertListResponse.tokenName) && this.f77native == alertListResponse.f77native && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) alertListResponse.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) alertListResponse.chainLogoUrl) && Intrinsics.EZpvd(this.alerts, alertListResponse.alerts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.tokenAddress.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + Boolean.hashCode(this.f77native)) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.chainLogoUrl.hashCode()) * 31) + this.alerts.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AlertListResponse(tokenAddress=" + this.tokenAddress + ", chainId=" + this.chainId + ", tokenSymbol=" + this.tokenSymbol + ", tokenName=" + this.tokenName + ", native=" + this.f77native + ", tokenLogoUrl=" + this.tokenLogoUrl + ", chainLogoUrl=" + this.chainLogoUrl + ", alerts=" + this.alerts + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.tokenAddress;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.alert.AlertListResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AlertListResponse> serializer() {
            return AlertListResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AlertListResponse(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (239 != (i & 239)) {
            PluginExceptionsKt.throwMissingFieldException(i, 239, AlertListResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenAddress = str;
        this.chainId = str2;
        this.tokenSymbol = str3;
        this.tokenName = str4;
        if ((i & 16) == 0) {
            this.f77native = true;
        } else {
            this.f77native = z;
        }
        this.tokenLogoUrl = str5;
        this.chainLogoUrl = str6;
        this.alerts = list;
    }

    public static final /* synthetic */ void EZpvd(AlertListResponse alertListResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, alertListResponse.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, alertListResponse.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, alertListResponse.tokenSymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, alertListResponse.tokenName);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !alertListResponse.f77native) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, alertListResponse.f77native);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, alertListResponse.tokenLogoUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, alertListResponse.chainLogoUrl);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], alertListResponse.alerts);
    }

    public AlertListResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6, @NotNull List<AlertDataResponse> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.tokenAddress = str;
        this.chainId = str2;
        this.tokenSymbol = str3;
        this.tokenName = str4;
        this.f77native = z;
        this.tokenLogoUrl = str5;
        this.chainLogoUrl = str6;
        this.alerts = list;
    }
}
