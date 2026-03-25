package o;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.biz.net.common.CustomCanceledException;
import com.okinc.biz.net.common.OKNetWorkException;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.network.okg.error.CustomServerErrorException;
import com.okinc.network.okg.response.OKServerException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.http2.StreamResetException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rom, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43412rom {
    public static final C43412rom OLrzqt = new C43412rom();

    private C43412rom() {
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.Throwable th) {
        java.lang.String message;
        java.lang.String message2;
        Intrinsics.checkNotNullParameter(th, "");
        java.lang.String message3 = th.getMessage();
        return ((message3 == null || !StringsKt__StringsKt.AhwBna((java.lang.CharSequence) message3, (java.lang.CharSequence) OtpEventTracker.OTP_EVENT_VALUE_CANCEL, true)) && ((message = th.getMessage()) == null || !StringsKt__StringsKt.AhwBna((java.lang.CharSequence) message, (java.lang.CharSequence) "unexpected end of stream", true)) && !(((message2 = th.getMessage()) != null && StringsKt__StringsKt.AhwBna((java.lang.CharSequence) message2, (java.lang.CharSequence) "No Cache Data", true)) || (th instanceof OKServerException) || (th instanceof CustomCanceledException) || (th instanceof CustomServerErrorException) || (th instanceof StreamResetException))) ? th instanceof OKNetWorkException ? "-10" : th instanceof UnknownHostException ? "-11" : th instanceof ConnectException ? "-12" : th instanceof SocketTimeoutException ? "-13" : th instanceof SSLHandshakeException ? "-15" : th instanceof SSLKeyException ? "-16" : th instanceof SSLPeerUnverifiedException ? "-17" : th instanceof SSLProtocolException ? "-18" : th instanceof SocketException ? "-19" : th instanceof java.io.InterruptedIOException ? MultiTransferSignData.DEFAULT_INTERVAL : th instanceof java.io.IOException ? "-20" : "-999" : MultiTransferSignData.DEFAULT_INTERVAL;
    }

    public final boolean copydefault(@NotNull java.io.IOException iOException) {
        Intrinsics.checkNotNullParameter(iOException, "");
        java.lang.String message = iOException.getMessage();
        return (message != null && StringsKt__StringsKt.AhwBna((java.lang.CharSequence) message, (java.lang.CharSequence) OtpEventTracker.OTP_EVENT_VALUE_CANCEL, true)) || (iOException instanceof CustomCanceledException);
    }

    public final boolean copydefault(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return (th instanceof SSLHandshakeException) || (th instanceof UnknownHostException);
    }

    public final boolean EZpvd(@NotNull java.io.IOException iOException) {
        Intrinsics.checkNotNullParameter(iOException, "");
        return (copydefault(iOException) || (iOException instanceof java.io.InterruptedIOException)) ? false : true;
    }

    public final boolean AEQbTJ(@NotNull java.io.IOException iOException) {
        Intrinsics.checkNotNullParameter(iOException, "");
        C43292rmY c43292rmY = C43292rmY.OLrzqt;
        return c43292rmY.AuCTel() && !c43292rmY.QOLQEE() && EZpvd(iOException);
    }
}
