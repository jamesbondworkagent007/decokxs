package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.smY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45265smY implements InterfaceC45302snI {
    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        InterfaceC43294rma interfaceC43294rma;
        C44760scx.log$default("CommonOpenDeeplinkHandler: invoke > data type: " + (obj != null ? C56524yIo.AEQbTJ(obj.getClass()).gEmmrt() : AbstractJsonLexerKt.NULL), null, 2, null);
        if ((obj instanceof java.lang.String) && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) obj)) && (interfaceC43294rma = (InterfaceC43294rma) C43251rlk.OLrzqt(InterfaceC43294rma.class)) != null) {
            InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, context, (java.lang.String) obj, null, new Function1() { // from class: o.smW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C45265smY.copydefault((AbstractC43238rlX) obj2);
                }
            }, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }
}
