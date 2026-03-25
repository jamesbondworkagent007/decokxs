package o;

import com.okinc.business.defi.biz.database.wallet.entity.WalletTotalAssetEntity;
import com.okinc.business.defi.biz.database.wallet.repository.WalletTotalAssetRepository$insertTotalAssets$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cSN {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final InterfaceC11443cOk KWHzl;

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cSN.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ cSN getInstance$default(ActionBar actionBar, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return actionBar.AEQbTJ(context);
        }

        public final cSN AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).QUSxYX();
        }
    }

    public cSN(@NotNull InterfaceC11443cOk interfaceC11443cOk) {
        Intrinsics.checkNotNullParameter(interfaceC11443cOk, "");
        this.KWHzl = interfaceC11443cOk;
    }

    public final java.lang.Object KWHzl(@NotNull java.util.List<WalletTotalAssetEntity> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletTotalAssetRepository$insertTotalAssets$2(this, list, null), continuation);
    }
}
