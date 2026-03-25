package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.p2p.api.OTCService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sno, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45334sno implements InterfaceC45302snI {
    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        OTCService oTCService;
        C44760scx.log$default("CommonP2pReorderHandler: invoke > data type: " + (obj != null ? C56524yIo.AEQbTJ(obj.getClass()).gEmmrt() : AbstractJsonLexerKt.NULL), null, 2, null);
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null && (oTCService = (OTCService) C43251rlk.OLrzqt(OTCService.class)) != null) {
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str == null) {
                return Unit.INSTANCE;
            }
            oTCService.showReorderFlowWithOrderId(fragmentActivity, str);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
