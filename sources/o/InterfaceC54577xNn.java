package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.unify_trade.biz.FavoriteBizInfo;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xNn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC54577xNn extends InterfaceC49424uoL {
    java.lang.Object AEQbTJ(boolean z, @NotNull C54588xNy c54588xNy, @NotNull Continuation<? super Result<? extends InterfaceC54581xNr>> continuation);

    java.lang.String AEQbTJ();

    void EZpvd(FavoriteBizInfo favoriteBizInfo);

    boolean EZpvd();

    InterfaceC55813xqy KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6);

    void KWHzl(@NotNull InterfaceC54612xOv interfaceC54612xOv);

    boolean KWHzl();

    InterfaceC54581xNr OLrzqt();

    void OLrzqt(@NotNull MutableLiveData<java.lang.Boolean> mutableLiveData, boolean z);

    InterfaceC54581xNr copydefault();

    /* JADX INFO: renamed from: o.xNn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC55813xqy KWHzl(@NotNull InterfaceC54577xNn interfaceC54577xNn, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void copydefault(@NotNull InterfaceC54577xNn interfaceC54577xNn, @NotNull MutableLiveData<java.lang.Boolean> mutableLiveData, boolean z) {
            Intrinsics.checkNotNullParameter(mutableLiveData, "");
        }

        /* JADX INFO: renamed from: ensureInitialize-0E7RQCE$default, reason: not valid java name */
        public static /* synthetic */ java.lang.Object m8790ensureInitialize0E7RQCE$default(InterfaceC54577xNn interfaceC54577xNn, boolean z, C54588xNy c54588xNy, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureInitialize-0E7RQCE");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                c54588xNy = new C54588xNy();
            }
            return interfaceC54577xNn.AEQbTJ(z, c54588xNy, continuation);
        }

        public static /* synthetic */ void ensureInitArbitrageTrade$default(InterfaceC54577xNn interfaceC54577xNn, MutableLiveData mutableLiveData, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureInitArbitrageTrade");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            interfaceC54577xNn.OLrzqt(mutableLiveData, z);
        }
    }
}
