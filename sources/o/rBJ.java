package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public interface rBJ {
    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str4, @NotNull C41957rBa c41957rBa, @NotNull java.util.Map<java.lang.String, java.lang.String> map2, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, @NotNull Continuation<? super AbstractC43728ruk<OnDemandKYCAppModel, ResponseFailedException>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str4, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map2, @NotNull java.util.Map<java.lang.String, java.lang.String> map3, java.lang.String str5, java.lang.String str6, @NotNull Continuation<? super AbstractC43728ruk<OnDemandKYCAppModel, ResponseFailedException>> continuation);

    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: o.rBJ */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object invoke$default(rBJ rbj, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, java.lang.String str4, C41957rBa c41957rBa, java.util.Map map2, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return rbj.EZpvd(str, str2, str3, (i & 8) != 0 ? new LinkedHashMap() : map, str4, c41957rBa, map2, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: o.rBJ */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object invoke$default(rBJ rbj, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, java.lang.String str4, java.util.Map map2, java.util.Map map3, java.lang.String str5, java.lang.String str6, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return rbj.KWHzl(str, str2, str3, (i & 8) != 0 ? new LinkedHashMap() : map, str4, map2, map3, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }
}
