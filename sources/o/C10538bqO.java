package o;

import com.okinc.business.defi.biz.core.asset.totalasset.WalletTotalAssetLocalDataSource$updateWalletTotalAssets$2;
import com.okinc.business.defi.biz.database.wallet.entity.WalletTotalAssetEntity;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10538bqO {
    public final cSN KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C10538bqO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C10538bqO(@NotNull cSN csn) {
        Intrinsics.checkNotNullParameter(csn, "");
        this.KWHzl = csn;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:o.cSN:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cSN:0x000e: INVOKE 
  (wrap:o.dKx:0x000a: INVOKE 
  (wrap:android.app.Application:0x0006: INVOKE (wrap:o.baC$Activity:0x0004: SGET  A[WRAPPED] (LINE:16) o.baC.Companion o.baC$Activity) VIRTUAL call: o.baC.Activity.AEQbTJ():android.app.Application A[MD:():android.app.Application (m), WRAPPED] (LINE:16))
 STATIC call: o.dMb.EZpvd(android.content.Context):o.dKx A[MD:(android.content.Context):o.dKx (m), WRAPPED] (LINE:16))
 INTERFACE call: o.dKx.QUSxYX():o.cSN A[MD:():o.cSN (m), WRAPPED] (LINE:16)) : (r1v0 o.cSN))
 A[MD:(o.cSN):void (m)] (LINE:15) call: o.bqO.<init>(o.cSN):void type: THIS */
    public /* synthetic */ C10538bqO(cSN csn, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13458dMb.EZpvd(C9678baC.Companion.AEQbTJ()).QUSxYX() : csn);
    }

    public final java.lang.Object copydefault(@NotNull java.util.List<WalletTotalAssetEntity> list, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) {
        return BuildersKt.withContext(coroutineDispatcher, new WalletTotalAssetLocalDataSource$updateWalletTotalAssets$2(this, list, null), continuation);
    }
}
