package o;

import com.okinc.okex.common.navigator.CommonServiceKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.smP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45256smP implements InterfaceC45302snI {
    public final C45300snG OLrzqt;
    public final InterfaceC47278tmy copydefault;

    @yCM
    public C45256smP(@NotNull C45300snG c45300snG, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(c45300snG, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.OLrzqt = c45300snG;
        this.copydefault = interfaceC47278tmy;
    }

    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        C44760scx.log$default("CommonLoggedInChatbotHandler: invoke > data type: " + (obj != null ? C56524yIo.AEQbTJ(obj.getClass()).gEmmrt() : AbstractJsonLexerKt.NULL), null, 2, null);
        if (this.copydefault.values()) {
            java.lang.Object objCopydefault = this.OLrzqt.copydefault(CommonServiceKey.Chatbot, context, obj, continuation);
            return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
        }
        java.lang.Object objRunCommonService$OKSupport_support_impl$default = C45300snG.runCommonService$OKSupport_support_impl$default(this.OLrzqt, CommonServiceKey.OpenLogin, context, null, continuation, 4, null);
        return objRunCommonService$OKSupport_support_impl$default == C56442yFn.copydefault() ? objRunCommonService$OKSupport_support_impl$default : Unit.INSTANCE;
    }
}
