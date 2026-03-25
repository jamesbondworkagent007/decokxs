package o;

import com.okinc.okimcore.model.im.CacheStrategy;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKGetMessageDirection;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.RelationSourceType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDetail;
import com.okinc.okimcore.model.other.IMSource;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sNm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC44375sNm {
    java.lang.Object AEQbTJ(@NotNull OKConversationType oKConversationType, @NotNull java.lang.String str, boolean z, @NotNull CacheStrategy cacheStrategy, java.lang.String str2, @NotNull Continuation<? super OKConversation> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, long j, @NotNull Continuation<? super OKMessage> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull CacheStrategy cacheStrategy, @NotNull Continuation<? super OKConversation> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull RelationSourceType relationSourceType, java.lang.String str2, @NotNull Continuation<? super Result<OKConversation>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull InHouseIMChannelType inHouseIMChannelType, int i, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Long> continuation);

    Flow<java.util.List<OKConversation>> AEQbTJ();

    Flow<java.util.List<OKConversation>> AEQbTJ(int i, boolean z, boolean z2, boolean z3);

    void AEQbTJ(@NotNull java.util.List<OKMessage> list);

    Flow<java.lang.Integer> AYXKKw();

    java.lang.Object EZpvd(@NotNull OKConversation oKConversation, @NotNull OKMessage oKMessage, int i, @NotNull OKGetMessageDirection oKGetMessageDirection, @NotNull Continuation<? super java.util.List<OKMessage>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, long j, @NotNull Continuation<? super java.util.List<ReactionDetail>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list, @NotNull Continuation<? super Unit> continuation);

    Flow<java.lang.Integer> EZpvd();

    Flow<Result<OKConversation>> EZpvd(@NotNull java.lang.String str, @NotNull OKConversationType oKConversationType, @NotNull IMSource iMSource, java.lang.String str2);

    void EZpvd(@NotNull OKMessage oKMessage, @NotNull InterfaceC44372sNj interfaceC44372sNj);

    java.lang.Object KWHzl(@NotNull java.lang.String str, long j, @NotNull Continuation<? super java.util.List<ReactionDetail>> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object KWHzl(@NotNull sNH snh, @NotNull Continuation<? super sNM> continuation);

    void KWHzl(@NotNull java.lang.String str, long j);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object OLrzqt(@NotNull sNO sno, @NotNull Continuation<? super java.util.List<OKMessage>> continuation);

    Flow<java.util.Set<java.lang.String>> OLrzqt();

    Flow<OKConversation> OLrzqt(@NotNull java.lang.String str);

    Flow<OKMessage> OLrzqt(@NotNull java.lang.String str, long j);

    java.lang.Object copydefault(@NotNull java.lang.String str, long j, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Long> continuation);

    Flow<java.lang.Integer> copydefault();

    Flow<java.lang.Integer> djBIcL();
}
