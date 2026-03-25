package o;

import com.okinc.network.model.ConnectTestResult;
import com.okinc.network.util.ConnectionUtilsImpl$checkHttpConnectivity$2;
import com.okinc.network.util.ConnectionUtilsImpl$getConnectableIPV4FromDomain$2;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.Socket;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rpj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C43462rpj implements InterfaceC43456rpd {
    public static final Activity Companion = new Activity(null);

    @yCM
    public C43462rpj() {
    }

    @Override // o.InterfaceC43456rpd
    public java.lang.Object copydefault(@NotNull java.lang.String str, int i, int i2, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super ConnectTestResult> continuation) {
        return BuildersKt.withContext(coroutineDispatcher, new ConnectionUtilsImpl$getConnectableIPV4FromDomain$2(this, str, i, i2, null), continuation);
    }

    public final ConnectTestResult AEQbTJ(java.lang.String str, int i, int i2) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            java.net.InetAddress[] allByName = java.net.InetAddress.getAllByName(str);
            Intrinsics.checkNotNullExpressionValue(allByName, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.net.InetAddress inetAddress : allByName) {
                if (inetAddress instanceof Inet4Address) {
                    arrayList.add(inetAddress);
                }
            }
            java.util.Iterator it = CollectionsKt___CollectionsKt.QbewEr(arrayList).iterator();
            while (it.hasNext()) {
                java.lang.String hostAddress = ((Inet4Address) it.next()).getHostAddress();
                if (hostAddress != null) {
                    long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                    java.net.InetAddress inetAddressEZpvd = EZpvd(hostAddress, i, i2);
                    if (inetAddressEZpvd instanceof Inet4Address) {
                        return new ConnectTestResult(str, ((Inet4Address) inetAddressEZpvd).getHostAddress(), android.os.SystemClock.elapsedRealtime() - jElapsedRealtime2);
                    }
                }
            }
            pUU.KWHzl("ConnectionUtils", "getConnectableIPV4FromDomainInternal, domain:" + str + ", port:" + i + ", return null");
            return new ConnectTestResult(str, null, android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
        } catch (java.lang.Exception e) {
            pUU.valueOf("ConnectionUtils", "getConnectableIPV4FromDomainInternal, unexpected error for domain:" + str + ", error:" + e);
            return new ConnectTestResult(str, null, android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
        }
    }

    @Override // o.InterfaceC43456rpd
    public java.lang.Object OLrzqt(@NotNull OkHttpClient okHttpClient, @NotNull java.lang.String str, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(coroutineDispatcher, new ConnectionUtilsImpl$checkHttpConnectivity$2(str, okHttpClient, null), continuation);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.net.InetAddress EZpvd(java.lang.String str, int i, int i2) {
        try {
            Socket socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(str, i), i2);
                java.net.InetAddress inetAddress = socket.getInetAddress();
                yFA.copydefault(socket, null);
                return inetAddress;
            } finally {
            }
        } catch (java.lang.Exception e) {
            pUU.valueOf("ConnectionUtils", "checkSocketConnection, error:" + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: o.rpj$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rpj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
