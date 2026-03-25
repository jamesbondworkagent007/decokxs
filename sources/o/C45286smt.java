package o;

import com.okinc.biz.bean.ChatBotRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.smt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45286smt implements InterfaceC45302snI {
    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        C44760scx.log$default("CommonChatbotHandler: invoke > data type: " + (obj != null ? C56524yIo.AEQbTJ(obj.getClass()).gEmmrt() : AbstractJsonLexerKt.NULL), null, 2, null);
        if (obj instanceof ChatBotRequest) {
            java.lang.Object objEZpvd = C45193slF.copydefault.EZpvd(context, (ChatBotRequest) obj, continuation);
            return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
        }
        C44760scx.log$default("CommonChatbotHandler: No Chatbot request object provided", null, 2, null);
        return Unit.INSTANCE;
    }
}
