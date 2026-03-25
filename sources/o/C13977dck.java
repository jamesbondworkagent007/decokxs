package o;

import com.okinc.business.defi.biz.walletconnect.OKXAuthPayloadParams;
import com.reown.walletkit.client.Wallet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13977dck {
    public static final OKXAuthPayloadParams AEQbTJ(@NotNull Wallet.Model.PayloadAuthRequestParams payloadAuthRequestParams) {
        Intrinsics.checkNotNullParameter(payloadAuthRequestParams, "");
        return new OKXAuthPayloadParams(payloadAuthRequestParams.getChains(), payloadAuthRequestParams.getDomain(), payloadAuthRequestParams.getNonce(), payloadAuthRequestParams.getAud(), payloadAuthRequestParams.getType(), payloadAuthRequestParams.getIat(), payloadAuthRequestParams.getNbf(), payloadAuthRequestParams.getExp(), payloadAuthRequestParams.getStatement(), payloadAuthRequestParams.getRequestId(), payloadAuthRequestParams.getResources());
    }

    public static final Wallet.Model.PayloadAuthRequestParams EZpvd(@NotNull OKXAuthPayloadParams oKXAuthPayloadParams) {
        Intrinsics.checkNotNullParameter(oKXAuthPayloadParams, "");
        return new Wallet.Model.PayloadAuthRequestParams(oKXAuthPayloadParams.getChains(), oKXAuthPayloadParams.getDomain(), oKXAuthPayloadParams.getNonce(), oKXAuthPayloadParams.getAud(), oKXAuthPayloadParams.getType(), oKXAuthPayloadParams.getIat(), oKXAuthPayloadParams.getNbf(), oKXAuthPayloadParams.getExp(), oKXAuthPayloadParams.getStatement(), oKXAuthPayloadParams.getRequestId(), oKXAuthPayloadParams.getResources());
    }
}
