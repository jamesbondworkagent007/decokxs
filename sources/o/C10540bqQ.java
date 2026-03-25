package o;

import com.okinc.business.defi.biz.core.asset.totalasset.WalletTotalAssetRemoteDataSource$fetchTotalAssets$2;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.net.bean.WalletTotalAssetModel;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC13426dKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10540bqQ {
    public final C13934dbu KWHzl;
    public final InterfaceC9852bdR OLrzqt;
    public final WalletUpdateWorker copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C10540bqQ() {
        this(null, null, null, 7, null);
    }

    public C10540bqQ(@NotNull C13934dbu c13934dbu, @NotNull WalletUpdateWorker walletUpdateWorker, InterfaceC9852bdR interfaceC9852bdR) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(walletUpdateWorker, "");
        this.KWHzl = c13934dbu;
        this.copydefault = walletUpdateWorker;
        this.OLrzqt = interfaceC9852bdR;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:o.dbu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dbu:0x000c: INVOKE 
  (wrap:o.dKx:0x0008: INVOKE 
  (wrap:o.dKx$TaskDescription:0x0006: SGET  A[WRAPPED] (LINE:23) o.dKx.Companion o.dKx$TaskDescription)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.dKx.TaskDescription.getInstance$default(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx A[MD:(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx (m), WRAPPED] (LINE:23))
 INTERFACE call: o.dKx.DTwDnp():o.dbu A[MD:():o.dbu (m), WRAPPED] (LINE:23)) : (r3v0 o.dbu))
  (wrap:com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker:0x0016: INVOKE 
  (wrap:com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker$Application:0x0014: SGET  A[WRAPPED] (LINE:24) com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.Companion com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.Application.getInstance$default(com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker$Application, android.content.Context, int, java.lang.Object):com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker A[MD:(com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker$Application, android.content.Context, int, java.lang.Object):com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker (m), WRAPPED] (LINE:24)) : (r4v0 com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker))
  (wrap:o.bdR:?: TERNARY null = ((wrap:int:0x001a: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bdR:0x0028: CHECK_CAST (o.bdR) (wrap:o.rlB:0x0024: INVOKE 
  (wrap:o.yJo:0x0020: INVOKE (wrap:java.lang.Class:0x001e: CONST_CLASS  A[WRAPPED] (LINE:25) o.bdR.class) STATIC call: o.yIo.AEQbTJ(java.lang.Class):o.yJo A[MD:(java.lang.Class):o.yJo (m), WRAPPED] (LINE:25))
 STATIC call: o.rlk.OLrzqt(o.yJo):o.rlB A[MD:<S extends o.rlB>:(o.yJo<S extends o.rlB>):S extends o.rlB (m), WRAPPED] (LINE:25))) : (r5v0 o.bdR))
 A[MD:(o.dbu, com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker, o.bdR):void (m)] (LINE:22) call: o.bqQ.<init>(o.dbu, com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker, o.bdR):void type: THIS */
    public /* synthetic */ C10540bqQ(C13934dbu c13934dbu, WalletUpdateWorker walletUpdateWorker, InterfaceC9852bdR interfaceC9852bdR, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).DTwDnp() : c13934dbu, (i & 2) != 0 ? WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null) : walletUpdateWorker, (i & 4) != 0 ? (InterfaceC9852bdR) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC9852bdR.class)) : interfaceC9852bdR);
    }

    public final java.lang.Object KWHzl(@NotNull java.util.List<? extends AbstractC12782ctV> list, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super ResponseData<java.util.List<WalletTotalAssetModel>>> continuation) {
        return BuildersKt.withContext(coroutineDispatcher, new WalletTotalAssetRemoteDataSource$fetchTotalAssets$2(list, this, null), continuation);
    }
}
