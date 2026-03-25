package o;

import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageWithReactions;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.C44502sSe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sKt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC44301sKt {
    java.lang.Object AEQbTJ(@NotNull sNO sno, @NotNull Continuation<? super java.util.List<InHouseIMMessageWithReactions>> continuation);

    Flow<C44502sSe.Dialog> AEQbTJ(@NotNull WSSendReactionData wSSendReactionData);

    void AEQbTJ();

    java.lang.Object EZpvd(@NotNull sNH snh, @NotNull Continuation<? super sNQ> continuation);

    StateFlow<sNJ> EZpvd();

    java.lang.Object KWHzl(@NotNull java.lang.String str, long j, @NotNull OKConversationType oKConversationType, @NotNull OKMessageContent oKMessageContent, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation);

    Flow<C44502sSe.StateListAnimator> KWHzl(@NotNull OKMessage oKMessage);

    StateFlow<OKWsConnectionState> KWHzl();

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object OLrzqt(@NotNull sNO sno, @NotNull Continuation<? super java.util.List<InHouseIMMessageWithReactions>> continuation);

    SharedFlow<C44391sOb> OLrzqt();

    void OLrzqt(@NotNull java.lang.String str, long j);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    void copydefault();

    void copydefault(InterfaceC44228sIa interfaceC44228sIa);

    void gEmmrt();

    StateFlow<java.lang.String> valueOf();
}
