package o;

import aws.smithy.kotlin.runtime.ClientException;
import aws.smithy.kotlin.runtime.client.config.ClientSettings$LogMode$1;
import aws.smithy.kotlin.runtime.client.config.RetryMode;
import aws.smithy.kotlin.runtime.net.TlsVersion;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54779xV;
import o.C59449zhJ;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C57525yk {
    public static final C57525yk copydefault = new C57525yk();
    public static final C59492zi<java.lang.Integer> AEQbTJ = C59333zf.copydefault().invoke("sdk.maxAttempts", "SDK_MAX_ATTEMPTS");
    public static final C59492zi<TlsVersion> EZpvd = new C59492zi<>(new Function1<java.lang.String, TlsVersion>() { // from class: aws.smithy.kotlin.runtime.client.config.ClientSettings$special$$inlined$enumEnvSetting$1
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final TlsVersion invoke(@NotNull String str) {
            TlsVersion tlsVersion;
            Intrinsics.checkNotNullParameter(str, "");
            TlsVersion[] tlsVersionArrValues = TlsVersion.values();
            int length = tlsVersionArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    tlsVersion = null;
                    break;
                }
                tlsVersion = tlsVersionArrValues[i];
                if (C59449zhJ.gEmmrt(tlsVersion.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (tlsVersion != null) {
                return tlsVersion;
            }
            throw new ClientException("Value " + str + " is not supported, should be one of " + yDV.joinToString$default(tlsVersionArrValues, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        }
    }, "SDK_MIN_TLS", "sdk.minTls", null, 8, null);
    public static final C59492zi<RetryMode> OLrzqt = new C59492zi<>(new Function1<java.lang.String, RetryMode>() { // from class: aws.smithy.kotlin.runtime.client.config.ClientSettings$special$$inlined$enumEnvSetting$2
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final RetryMode invoke(@NotNull String str) {
            RetryMode retryMode;
            Intrinsics.checkNotNullParameter(str, "");
            RetryMode[] retryModeArrValues = RetryMode.values();
            int length = retryModeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    retryMode = null;
                    break;
                }
                retryMode = retryModeArrValues[i];
                if (C59449zhJ.gEmmrt(retryMode.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (retryMode != null) {
                return retryMode;
            }
            throw new ClientException("Value " + str + " is not supported, should be one of " + yDV.joinToString$default(retryModeArrValues, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        }
    }, "sdk.retryMode", "SDK_RETRY_MODE", null, 8, null);
    public static final C59492zi<AbstractC54779xV> KWHzl = new C59492zi<>(new ClientSettings$LogMode$1(AbstractC54779xV.OLrzqt), "sdk.logMode", "SDK_LOG_MODE", AbstractC54779xV.Application.EZpvd);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<TlsVersion> AEQbTJ() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<AbstractC54779xV> KWHzl() {
        return KWHzl;
    }

    private C57525yk() {
    }
}
