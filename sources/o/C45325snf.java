package o;

import androidx.core.os.BundleKt;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.snf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45325snf implements InterfaceC45302snI {
    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        C44760scx.log$default("CommonOpenWebViewHandler: invoke > data type: " + (obj != null ? C56524yIo.AEQbTJ(obj.getClass()).gEmmrt() : AbstractJsonLexerKt.NULL), null, 2, null);
        if (obj instanceof android.os.Bundle) {
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, (android.os.Bundle) obj, null, 4, null);
        } else if (obj instanceof java.lang.String) {
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", obj)), null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
