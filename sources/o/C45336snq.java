package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.snq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45336snq implements InterfaceC45302snI {
    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        C44760scx.log$default("CommonSupportCenterHandler: invoke > data type: " + (obj != null ? C56524yIo.AEQbTJ(obj.getClass()).gEmmrt() : AbstractJsonLexerKt.NULL), null, 2, null);
        C6807aWO c6807aWO = obj instanceof C6807aWO ? (C6807aWO) obj : null;
        if (c6807aWO != null) {
            context.startActivity(((InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class)).EZpvd(context, c6807aWO));
        }
        return Unit.INSTANCE;
    }
}
