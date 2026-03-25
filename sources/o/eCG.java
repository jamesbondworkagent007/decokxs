package o;

import com.okinc.business.defi.api.model.tx.signdata.EVMContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eCG {
    public static final eCG OLrzqt = new eCG();

    private eCG() {
    }

    public final void KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, long j, @NotNull EVMContractSignData eVMContractSignData, PlatformItem platformItem, @NotNull final Function1<? super android.os.Bundle, Unit> function1) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(eVMContractSignData, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C9694baS.Companion.EZpvd(abstractActivityC33041mov, fXY.Companion.OLrzqt(abstractActivityC33041mov, new SignDataArgs<>(str, null, j, eVMContractSignData, platformItem, null, null, null, null, null, 1, null, null, 0, null, null, null, false, false, null, false, false, false, false, 16767970, null)), new Function2() { // from class: o.eCE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return eCG.KWHzl(function1, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit KWHzl(Function1 function1, int i, android.content.Intent intent) {
        if (i == -1) {
            function1.invoke(intent != null ? intent.getExtras() : null);
        } else {
            function1.invoke(null);
        }
        return Unit.INSTANCE;
    }
}
