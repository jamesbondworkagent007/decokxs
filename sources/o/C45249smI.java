package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.smI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45249smI implements InterfaceC45302snI {
    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        C44760scx.log$default("CommonErrorLogUploadHandler: invoke > data type: " + (obj != null ? C56524yIo.AEQbTJ(obj.getClass()).gEmmrt() : AbstractJsonLexerKt.NULL), null, 2, null);
        if (obj instanceof sBZ) {
            C45363soQ.onSessionIdEvent$default("SupportCenter_Btm_ErrorLog_Click", false, null, 3, null);
            sBZ sbz = (sBZ) obj;
            context.startActivity(sBJ.Companion.KWHzl(context, sbz.AEQbTJ(), sbz.EZpvd(), sbz.OLrzqt()));
        } else {
            C44760scx.log$default("CommonErrorLogUploadHandler: invoke > data is not ErrorLogNavRequest", null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
