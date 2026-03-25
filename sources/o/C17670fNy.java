package o;

import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.business.defi.wallet.referral.Web3DexReferralCheckManager$launchDexBindReferralCheckProcess$1;
import com.okinc.wallet.api.WalletReferralSource;
import com.okinc.wallet.api.bean.Web3ReferralCodeInfo;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.xWP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fNy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17670fNy {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final AtomicBoolean AEQbTJ;
    public final xWP AYXKKw;
    public final Mutex KWHzl;
    public final ReferralManager OLrzqt;
    public final C12827cuN copydefault;
    public final xWO valueOf;

    public C17670fNy(@NotNull ReferralManager referralManager, @NotNull xWO xwo, @NotNull xWP xwp, @NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(referralManager, "");
        Intrinsics.checkNotNullParameter(xwo, "");
        Intrinsics.checkNotNullParameter(xwp, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.OLrzqt = referralManager;
        this.valueOf = xwo;
        this.AYXKKw = xwp;
        this.copydefault = c12827cuN;
        this.AEQbTJ = new AtomicBoolean(false);
        this.KWHzl = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX INFO: renamed from: o.fNy$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fNy.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C17670fNy getInstance$default(TaskDescription taskDescription, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return taskDescription.OLrzqt(context);
        }

        public final C17670fNy OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).aKErDB();
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xWP.TaskDescription.bindShortReferralCode$default(o.xWP, android.content.Context, java.lang.String, boolean, com.okinc.wallet.api.WalletReferralSource, java.util.Map, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [86=4] */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:104:0x002b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x0062 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:99:? */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|(1:104)|(1:(1:(1:(1:(1:(9:15|98|16|79|80|85|92|(1:94)|95)(2:20|21))(9:22|102|23|24|100|63|(3:68|(3:71|(2:109|73)(1:110)|69)|108)(1:67)|75|(1:77)(7:78|79|80|85|92|(0)|95)))(6:27|28|55|(5:84|85|92|(0)|95)(2:59|(1:61)(7:62|100|63|(6:65|68|(1:69)|108|75|(0)(0))(0)|92|(0)|95))|88|89))(4:30|31|51|(1:53)(8:54|55|(1:57)|84|85|92|(0)|95)))(3:35|36|37))(3:38|39|(1:41)(1:42))|106|43|(5:45|85|92|(0)|95)(2:47|(1:49)(3:50|51|(0)(0)))|88|89|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0180, code lost:
    
        r5 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0131 A[Catch: all -> 0x0172, TryCatch #1 {all -> 0x0172, blocks: (B:63:0x0121, B:65:0x012a, B:75:0x014d, B:68:0x0131, B:69:0x0135, B:71:0x013b), top: B:100:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013b A[Catch: all -> 0x0172, TRY_LEAVE, TryCatch #1 {all -> 0x0172, blocks: (B:63:0x0121, B:65:0x012a, B:75:0x014d, B:68:0x0131, B:69:0x0135, B:71:0x013b), top: B:100:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0168 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0196  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r2v11, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        Web3DexReferralCheckManager$launchDexBindReferralCheckProcess$1 web3DexReferralCheckManager$launchDexBindReferralCheckProcess$1;
        java.lang.Object objM7377constructorimpl;
        ?? r5;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        AbstractActivityC33041mov abstractActivityC33041mov2;
        Mutex mutex;
        C17670fNy c17670fNy;
        AbstractActivityC33041mov abstractActivityC33041mov3;
        Mutex mutex2;
        C17670fNy c17670fNy2;
        AbstractActivityC33041mov abstractActivityC33041mov4;
        C17670fNy c17670fNy3;
        Web3ReferralCodeInfo web3ReferralCodeInfo;
        java.lang.String referralCode;
        ?? r13;
        java.lang.String str;
        java.util.List list;
        java.util.Iterator it;
        xWP xwp;
        WalletReferralSource walletReferralSource;
        ?? r2;
        if (continuation instanceof Web3DexReferralCheckManager$launchDexBindReferralCheckProcess$1) {
            web3DexReferralCheckManager$launchDexBindReferralCheckProcess$1 = (Web3DexReferralCheckManager$launchDexBindReferralCheckProcess$1) continuation;
            int i = web3DexReferralCheckManager$launchDexBindReferralCheckProcess$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                web3DexReferralCheckManager$launchDexBindReferralCheckProcess$1.label = i - Integer.MIN_VALUE;
            } else {
                web3DexReferralCheckManager$launchDexBindReferralCheckProcess$1 = new Web3DexReferralCheckManager$launchDexBindReferralCheckProcess$1(this, continuation);
            }
        }
        Web3DexReferralCheckManager$launchDexBindReferralCheckProcess$1 web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12 = web3DexReferralCheckManager$launchDexBindReferralCheckProcess$1;
        java.lang.Object objEZpvd = web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        ?? r3 = web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.label;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (java.lang.Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            r5 = r3;
        }
        if (r3 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            Result.Application application2 = Result.Companion;
            Mutex mutex3 = this.KWHzl;
            web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$0 = this;
            abstractActivityC33041mov2 = abstractActivityC33041mov;
            web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$1 = abstractActivityC33041mov2;
            web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$2 = mutex3;
            web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.label = 1;
            if (mutex3.lock(null, web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12) == objCopydefault) {
                return objCopydefault;
            }
            mutex = mutex3;
            c17670fNy = this;
        } else if (r3 == 1) {
            Mutex mutex4 = (Mutex) web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$2;
            AbstractActivityC33041mov abstractActivityC33041mov5 = (AbstractActivityC33041mov) web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$1;
            c17670fNy = (C17670fNy) web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            mutex = mutex4;
            abstractActivityC33041mov2 = abstractActivityC33041mov5;
        } else {
            if (r3 == 2) {
                Mutex mutex5 = (Mutex) web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$2;
                abstractActivityC33041mov3 = (AbstractActivityC33041mov) web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$1;
                c17670fNy2 = (C17670fNy) web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                mutex2 = mutex5;
                xWO xwo = c17670fNy2.valueOf;
                web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$0 = c17670fNy2;
                web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$1 = abstractActivityC33041mov3;
                web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$2 = mutex2;
                web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.label = 3;
                objEZpvd = xwo.EZpvd(web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12);
                if (objEZpvd != objCopydefault) {
                    return objCopydefault;
                }
                abstractActivityC33041mov4 = abstractActivityC33041mov3;
                c17670fNy3 = c17670fNy2;
                r3 = mutex2;
                web3ReferralCodeInfo = (Web3ReferralCodeInfo) objEZpvd;
                if (web3ReferralCodeInfo != null) {
                }
                r3.unlock(null);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return objM7377constructorimpl;
            }
            if (r3 == 3) {
                Mutex mutex6 = (Mutex) web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$2;
                abstractActivityC33041mov4 = (AbstractActivityC33041mov) web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$1;
                c17670fNy3 = (C17670fNy) web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r3 = mutex6;
                web3ReferralCodeInfo = (Web3ReferralCodeInfo) objEZpvd;
                if (web3ReferralCodeInfo != null || (referralCode = web3ReferralCodeInfo.getReferralCode()) == null) {
                    r3.unlock(null);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return objM7377constructorimpl;
                }
                AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(c17670fNy3.copydefault, false, false, false, 7, null);
                web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$0 = c17670fNy3;
                web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$1 = abstractActivityC33041mov4;
                web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$2 = r3;
                web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$3 = referralCode;
                web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.label = 4;
                java.lang.Object objAwait = RxAwaitKt.await(abstractC58260yxtFetchAllWallets$default, web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                r13 = r3;
                str = referralCode;
                objEZpvd = objAwait;
                list = (java.util.List) objEZpvd;
                Intrinsics.copydefault(list);
                if (list instanceof java.util.Collection) {
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    xwp = c17670fNy3.AYXKKw;
                    walletReferralSource = WalletReferralSource.DEVICE_CACHED;
                    web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$0 = r13;
                    web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$1 = null;
                    web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$2 = null;
                    web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$3 = null;
                    web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.label = 5;
                    if (xWP.TaskDescription.bindShortReferralCode$default(xwp, abstractActivityC33041mov4, str, true, walletReferralSource, null, web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12, 16, null) != objCopydefault) {
                    }
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return objM7377constructorimpl;
                r5.unlock(null);
                throw th;
            }
            if (r3 == 4) {
                java.lang.String str2 = (java.lang.String) web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$3;
                r5 = (Mutex) web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$2;
                abstractActivityC33041mov4 = (AbstractActivityC33041mov) web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$1;
                c17670fNy3 = (C17670fNy) web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$0;
                try {
                    C56391yDq.AEQbTJ(objEZpvd);
                    r13 = r5;
                    str = str2;
                    try {
                        list = (java.util.List) objEZpvd;
                        Intrinsics.copydefault(list);
                        if ((list instanceof java.util.Collection) || !list.isEmpty()) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (c17670fNy3.OLrzqt.valueOf((AbstractC12782ctV) it.next())) {
                                    r13.unlock(null);
                                    break;
                                }
                            }
                        }
                        xwp = c17670fNy3.AYXKKw;
                        walletReferralSource = WalletReferralSource.DEVICE_CACHED;
                        web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$0 = r13;
                        web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$1 = null;
                        web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$2 = null;
                        web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$3 = null;
                        web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.label = 5;
                        if (xWP.TaskDescription.bindShortReferralCode$default(xwp, abstractActivityC33041mov4, str, true, walletReferralSource, null, web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12, 16, null) != objCopydefault) {
                            return objCopydefault;
                        }
                        r2 = r13;
                        Unit unit = Unit.INSTANCE;
                        r2.unlock(null);
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                        }
                        return objM7377constructorimpl;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        r5 = r13;
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                }
            } else {
                if (r3 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r2 = (Mutex) web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$0;
                try {
                    C56391yDq.AEQbTJ(objEZpvd);
                    r2 = r2;
                    Unit unit2 = Unit.INSTANCE;
                    r2.unlock(null);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.AEQbTJ("Web3DexReferralCheckManager", "processDexBindReferralCode failed", thM7380exceptionOrNullimpl);
                    }
                    return objM7377constructorimpl;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    r5 = r2;
                }
            }
        }
        if (c17670fNy.AEQbTJ.get()) {
            mutex.unlock(null);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return objM7377constructorimpl;
        }
        c17670fNy.AEQbTJ.set(true);
        xWP xwp2 = c17670fNy.AYXKKw;
        web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$0 = c17670fNy;
        web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$1 = abstractActivityC33041mov2;
        web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$2 = mutex;
        web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.label = 2;
        if (xwp2.copydefault(web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12) == objCopydefault) {
            return objCopydefault;
        }
        abstractActivityC33041mov3 = abstractActivityC33041mov2;
        mutex2 = mutex;
        c17670fNy2 = c17670fNy;
        xWO xwo2 = c17670fNy2.valueOf;
        web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$0 = c17670fNy2;
        web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$1 = abstractActivityC33041mov3;
        web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.L$2 = mutex2;
        web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12.label = 3;
        objEZpvd = xwo2.EZpvd(web3DexReferralCheckManager$launchDexBindReferralCheckProcess$12);
        if (objEZpvd != objCopydefault) {
        }
        r5.unlock(null);
        throw th;
    }

    public final void OLrzqt(boolean z) {
        this.AEQbTJ.set(z);
    }
}
