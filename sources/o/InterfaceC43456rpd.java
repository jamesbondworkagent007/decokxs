package o;

import com.okinc.network.model.ConnectTestResult;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rpd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC43456rpd {
    java.lang.Object OLrzqt(@NotNull OkHttpClient okHttpClient, @NotNull java.lang.String str, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, int i, int i2, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super ConnectTestResult> continuation);

    /* JADX INFO: renamed from: o.rpd$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ java.lang.Object getConnectableIPV4FromDomain$default(InterfaceC43456rpd interfaceC43456rpd, java.lang.String str, int i, int i2, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConnectableIPV4FromDomain");
            }
            if ((i3 & 2) != 0) {
                i = 443;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                i2 = 2000;
            }
            int i5 = i2;
            if ((i3 & 8) != 0) {
                coroutineDispatcher = Dispatchers.getIO();
            }
            return interfaceC43456rpd.copydefault(str, i4, i5, coroutineDispatcher, continuation);
        }
    }
}
