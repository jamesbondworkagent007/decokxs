package o;

import com.okinc.im.call.model.CallSessionV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC35234nrV {
    java.lang.Object AEQbTJ(@NotNull CallSessionV2 callSessionV2, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> continuation);

    boolean AEQbTJ();

    java.lang.Object AhwBna(@NotNull CallSessionV2 callSessionV2, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation);

    java.lang.Object EZpvd(@NotNull CallSessionV2 callSessionV2, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation);

    boolean EZpvd();

    boolean EZpvd(boolean z);

    java.lang.Object KWHzl(@NotNull CallSessionV2 callSessionV2, long j, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation);

    java.lang.Object KWHzl(@NotNull CallSessionV2 callSessionV2, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object KWHzl(@NotNull C35251nrm c35251nrm, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation);

    Flow<AbstractC35238nrZ> KWHzl();

    java.lang.Object OLrzqt(@NotNull CallSessionV2 callSessionV2, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation);

    boolean OLrzqt();

    boolean OLrzqt(boolean z);

    java.lang.Object copydefault(@NotNull CallSessionV2 callSessionV2, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, java.lang.String str7, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation);

    void copydefault();
}
