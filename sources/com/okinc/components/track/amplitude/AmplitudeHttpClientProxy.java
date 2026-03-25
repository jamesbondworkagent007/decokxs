package com.okinc.components.track.amplitude;

import com.amplitude.core.ServerZone;
import com.amplitude.core.utilities.http.HttpStatus;
import com.google.common.net.HttpHeaders;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C5216Je;
import o.InterfaceC5265Lb;
import o.InterfaceC5268Le;
import o.KZ;
import o.pUU;
import o.yFA;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AmplitudeHttpClientProxy implements InterfaceC5265Lb {
    private static final String TAG = "AmpHttpProxy";
    private final C5216Je configuration;
    private final OkHttpClient okHttpClient;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;

    public AmplitudeHttpClientProxy(@NotNull C5216Je c5216Je, @NotNull OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(c5216Je, "");
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        this.configuration = c5216Je;
        this.okHttpClient = okHttpClient;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // o.InterfaceC5265Lb
    public InterfaceC5268Le upload(@NotNull String str, String str2) {
        InterfaceC5268Le interfaceC5268LeKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Response responseExecute = this.okHttpClient.newCall(new Request.Builder().url(getRequestUrl$OKAnalytics_track(this.configuration)).post(RequestBody.Companion.create(new KZ(this.configuration.ORxRYg(), str, this.configuration.fIwbmz(), str2, 0L, 16, null).AEQbTJ(), MediaType.Companion.parse(EIP1271Verifier.mediaTypeString))).addHeader(HttpHeaders.ACCEPT, "application/json").build()).execute();
            try {
                int iCode = responseExecute.code();
                pUU.KWHzl(TAG, "amp upload response.code " + iCode);
                if (iCode == HttpStatus.BAD_REQUEST.getCode()) {
                    pUU.KWHzl(TAG, "upload, responseCode from 400 -> 500. response:" + responseExecute);
                    interfaceC5268LeKWHzl = InterfaceC5268Le.Companion.KWHzl(HttpStatus.FAILED.getCode(), null);
                } else {
                    ResponseBody responseBodyBody = responseExecute.body();
                    interfaceC5268LeKWHzl = InterfaceC5268Le.Companion.KWHzl(iCode, responseBodyBody != null ? responseBodyBody.string() : null);
                }
                yFA.copydefault(responseExecute, null);
                return interfaceC5268LeKWHzl;
            } finally {
            }
        } catch (IOException unused) {
            return InterfaceC5268Le.Companion.KWHzl(HttpStatus.TIMEOUT.getCode(), null);
        } catch (Exception e) {
            pUU.AEQbTJ(TAG, "upload", e);
            return InterfaceC5268Le.Companion.KWHzl(HttpStatus.FAILED.getCode(), null);
        }
    }

    public final String getRequestUrl$OKAnalytics_track(@NotNull C5216Je c5216Je) {
        String str;
        Intrinsics.checkNotNullParameter(c5216Je, "");
        String strAubY = c5216Je.AubY();
        if (strAubY != null) {
            return strAubY;
        }
        ServerZone serverZoneAuCTelauCTel = c5216Je.AuCTelauCTel();
        ServerZone serverZone = ServerZone.EU;
        if (serverZoneAuCTelauCTel == serverZone && c5216Je.sSMYrx()) {
            str = "https://api.eu.amplitude.com/batch";
        } else if (c5216Je.AuCTelauCTel() == serverZone) {
            str = "https://api.eu.amplitude.com/2/httpapi";
        } else {
            str = c5216Je.sSMYrx() ? "https://api2.amplitude.com/batch" : "https://api2.amplitude.com/2/httpapi";
        }
        return str;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.components.track.amplitude.AmplitudeHttpClientProxy.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
