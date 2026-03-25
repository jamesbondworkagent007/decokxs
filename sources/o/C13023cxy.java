package o;

import com.okinc.business.defi.biz.core.wallet.Web3Manager$hasMpcWallet$1;
import com.okinc.business.defi.biz.core.wallet.Web3Manager$setShowWeb3Mode$1;
import com.okinc.business.defi.biz.core.wallet.Web3Manager$unbindWalletAndDevice$1;
import com.okinc.business.defi.biz.core.wallet.Web3Manager$verifyWalletAssetApi$1;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.net.bean.AccountMpcResponse;
import com.okinc.business.defi.biz.net.bean.WalletHaveAssetResp;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cxy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13023cxy {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final C13934dbu AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final cQM KWHzl;
    public Job OLrzqt;
    public Job valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13934dbu AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final cQM EZpvd() {
        return this.KWHzl;
    }

    public C13023cxy(@NotNull C13934dbu c13934dbu, @NotNull cQM cqm, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(cqm, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = c13934dbu;
        this.KWHzl = cqm;
        this.EZpvd = coroutineDispatcher;
    }

    public boolean KWHzl() {
        return eVN.AEQbTJ.KWHzl();
    }

    public void djBIcL() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(mNP.AEQbTJ.copydefault()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = java.lang.Boolean.FALSE;
        }
        boolean zBooleanValue = ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
        pUU.KWHzl("Web3Manager", "outer-EnvironmentUtil.isE2EEnv() = " + zBooleanValue + "}");
        Job job = this.OLrzqt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.OLrzqt = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.EZpvd), null, null, new Web3Manager$setShowWeb3Mode$1(zBooleanValue, this, null), 3, null);
    }

    public void AhwBna() {
        Job job = this.valueOf;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.valueOf = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.EZpvd), null, null, new Web3Manager$unbindWalletAndDevice$1(this, null), 3, null);
    }

    public final boolean OLrzqt() {
        boolean zAEQbTJ = C35202nqq.OLrzqt.AEQbTJ("web3_mode_available_check");
        pUU.KWHzl("Web3Manager", "isHitGray: " + zAEQbTJ);
        return zAEQbTJ;
    }

    public final boolean copydefault() {
        boolean zAEQbTJ = ((OKComplianceRestrictionService) C43248rlh.KWHzl.AEQbTJ(OKComplianceRestrictionService.class)).AEQbTJ(C12976cxD.AEQbTJ());
        pUU.KWHzl("Web3Manager", "isFeatureHidden: " + zAEQbTJ);
        return zAEQbTJ;
    }

    public final java.lang.Object OLrzqt(Continuation<? super java.lang.Boolean> continuation) {
        return RxAwaitKt.await(this.KWHzl.values(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        Web3Manager$hasMpcWallet$1 web3Manager$hasMpcWallet$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.String str;
        AccountMpcResponse accountMpcResponse;
        if (continuation instanceof Web3Manager$hasMpcWallet$1) {
            web3Manager$hasMpcWallet$1 = (Web3Manager$hasMpcWallet$1) continuation;
            int i = web3Manager$hasMpcWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                web3Manager$hasMpcWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                web3Manager$hasMpcWallet$1 = new Web3Manager$hasMpcWallet$1(this, continuation);
            }
        }
        java.lang.Object obj = web3Manager$hasMpcWallet$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = web3Manager$hasMpcWallet$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                dZP dzp = dZP.OLrzqt;
                if (dzp.valueOf()) {
                    if (dzp.values()) {
                        return C56443yFo.KWHzl(false);
                    }
                    if (dzp.gEmmrt()) {
                        return C56443yFo.KWHzl(false);
                    }
                    Result.Application application = Result.Companion;
                    java.lang.String strEZpvd = dzp.EZpvd();
                    java.lang.String strKWHzl = eVN.AEQbTJ.KWHzl(strEZpvd);
                    if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) {
                        return C56443yFo.KWHzl(java.lang.Boolean.parseBoolean(strKWHzl));
                    }
                    AbstractC58185ywX<ResponseData<AccountMpcResponse>> abstractC58185ywXValueOf = this.AEQbTJ.valueOf(strEZpvd);
                    web3Manager$hasMpcWallet$1.L$0 = strEZpvd;
                    web3Manager$hasMpcWallet$1.label = 1;
                    java.lang.Object objAwaitFirstOrNull = AwaitKt.awaitFirstOrNull(abstractC58185ywXValueOf, web3Manager$hasMpcWallet$1);
                    if (objAwaitFirstOrNull == objCopydefault) {
                        return objCopydefault;
                    }
                    str = strEZpvd;
                    obj = objAwaitFirstOrNull;
                } else {
                    return C56443yFo.KWHzl(false);
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) web3Manager$hasMpcWallet$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) ((responseData == null || (accountMpcResponse = (AccountMpcResponse) responseData.getData()) == null) ? null : accountMpcResponse.getMpcId()));
            eVN.AEQbTJ.AEQbTJ(str, zOLrzqt);
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(zOLrzqt));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7383isFailureimpl(objM7377constructorimpl) ? C56443yFo.KWHzl(false) : objM7377constructorimpl;
    }

    public static /* synthetic */ java.lang.Object verifyWalletAssetApi$default(C13023cxy c13023cxy, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c13023cxy.OLrzqt(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(boolean z, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        Web3Manager$verifyWalletAssetApi$1 web3Manager$verifyWalletAssetApi$1;
        boolean haveAsset;
        if (continuation instanceof Web3Manager$verifyWalletAssetApi$1) {
            web3Manager$verifyWalletAssetApi$1 = (Web3Manager$verifyWalletAssetApi$1) continuation;
            int i = web3Manager$verifyWalletAssetApi$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                web3Manager$verifyWalletAssetApi$1.label = i - Integer.MIN_VALUE;
            } else {
                web3Manager$verifyWalletAssetApi$1 = new Web3Manager$verifyWalletAssetApi$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = web3Manager$verifyWalletAssetApi$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = web3Manager$verifyWalletAssetApi$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C13934dbu c13934dbu = this.AEQbTJ;
            java.lang.String strAhwBna = WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).AhwBna();
            web3Manager$verifyWalletAssetApi$1.Z$0 = z;
            web3Manager$verifyWalletAssetApi$1.label = 1;
            objEZpvd = c13934dbu.EZpvd(strAhwBna, web3Manager$verifyWalletAssetApi$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = web3Manager$verifyWalletAssetApi$1.Z$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        WalletHaveAssetResp walletHaveAssetResp = (WalletHaveAssetResp) ((AbstractC43419rot) objEZpvd).copydefault();
        pUU.KWHzl("Web3Manager", "checkWalletHaveAsset: " + walletHaveAssetResp);
        eVN evn = eVN.AEQbTJ;
        if (!z || (walletHaveAssetResp != null && walletHaveAssetResp.getHaveWallet())) {
            haveAsset = walletHaveAssetResp != null ? walletHaveAssetResp.getHaveAsset() : evn.KWHzl();
        } else {
            haveAsset = false;
        }
        evn.OLrzqt(haveAsset);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.cxy$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cxy.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C13023cxy getInstance$default(Application application, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9687baL.Companion.EZpvd();
            }
            return application.KWHzl(context);
        }

        public final C13023cxy KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).dNCPSb();
        }
    }
}
