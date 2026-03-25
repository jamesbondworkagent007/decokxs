package o;

import com.okinc.account.api.model.login.LoginRoute;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sna, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45320sna implements InterfaceC45302snI {
    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        C44760scx.log$default("CommonOpenLoginHandler: invoke > data type: " + (obj != null ? C56524yIo.AEQbTJ(obj.getClass()).gEmmrt() : AbstractJsonLexerKt.NULL), null, 2, null);
        InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
        if (interfaceC8104awT != null) {
            if (obj instanceof LoginRoute) {
                interfaceC8104awT.OLrzqt(context, (LoginRoute) obj);
            } else {
                InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, context, null, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}
