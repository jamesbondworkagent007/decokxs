package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC30792lho {
    java.lang.Object EZpvd(@NotNull C21668hHx c21668hHx, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull C21668hHx c21668hHx, InterfaceC30595leC interfaceC30595leC, @NotNull Continuation<? super java.lang.Boolean> continuation);

    void OLrzqt();

    boolean OLrzqt(@NotNull C30626leh c30626leh);

    Flow<C30626leh> copydefault(@NotNull MutableStateFlow<DexMultiTokenInfoBean> mutableStateFlow, @NotNull MutableStateFlow<DexMultiTokenInfoBean> mutableStateFlow2, @NotNull MutableStateFlow<java.lang.String> mutableStateFlow3, @NotNull StateFlow<java.lang.String> stateFlow, @NotNull MutableStateFlow<C30805liA> mutableStateFlow4, @NotNull Flow<? extends java.util.List<java.lang.String>> flow, @NotNull MutableStateFlow<java.lang.String> mutableStateFlow5, @NotNull MutableStateFlow<java.lang.Boolean> mutableStateFlow6, @NotNull MutableStateFlow<java.lang.String> mutableStateFlow7);
}
