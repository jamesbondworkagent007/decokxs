package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastType;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gMy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19723gMy implements gMJ {
    public final TeeWsToastType AEQbTJ = TeeWsToastType.CreateStrategyOrderSuccess;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gMJ
    public TeeWsToastType AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.gMJ
    public gML AEQbTJ(@NotNull gMA gma) {
        Intrinsics.checkNotNullParameter(gma, "");
        return new gML(2, java.lang.Integer.valueOf(C23274hvD.Fragment.setEnabledChangedCallbackactivity_release), null, null, null, null, new Function0() { // from class: o.gMx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19723gMy.EZpvd();
            }
        }, 60, null);
    }

    public static final Unit EZpvd() {
        C23243huZ.OLrzqt(DexTrackEventParameter.TxStatus.SUCCESS.getStatus());
        return Unit.INSTANCE;
    }
}
