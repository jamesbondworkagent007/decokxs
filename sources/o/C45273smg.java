package o;

import androidx.core.os.BundleKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ActivityC45850szP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.smg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45273smg implements InterfaceC45302snI {
    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        C44760scx.log$default("CommonArticleHandler: invoke > data type: " + (obj != null ? C56524yIo.AEQbTJ(obj.getClass()).gEmmrt() : AbstractJsonLexerKt.NULL), null, 2, null);
        if (obj instanceof android.os.Bundle) {
            ActivityC45850szP.ActionBar.openPage$default(ActivityC45850szP.Companion, context, (android.os.Bundle) obj, null, 4, null);
        } else if (obj instanceof java.lang.String) {
            ActivityC45850szP.ActionBar.openPage$default(ActivityC45850szP.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", obj)), null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
