package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sTi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC44531sTi extends InterfaceC43216rlB {
    java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.Integer num, @NotNull Continuation<? super Unit> continuation);

    AbstractC32996moC EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, InterfaceC44530sTh interfaceC44530sTh);

    java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: o.sTi$Application */
    public static final class Application {
        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.sTi */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object navigateToLiveStreamPage$default(InterfaceC44531sTi interfaceC44531sTi, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC44531sTi.AEQbTJ(context, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : map, (i & 32) != 0 ? null : num, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToLiveStreamPage");
        }

        public static /* synthetic */ AbstractC32996moC getLiveStreamListPage$default(InterfaceC44531sTi interfaceC44531sTi, java.lang.String str, java.lang.String str2, InterfaceC44530sTh interfaceC44530sTh, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLiveStreamListPage");
            }
            if ((i & 4) != 0) {
                interfaceC44530sTh = null;
            }
            return interfaceC44531sTi.EZpvd(str, str2, interfaceC44530sTh);
        }
    }
}
