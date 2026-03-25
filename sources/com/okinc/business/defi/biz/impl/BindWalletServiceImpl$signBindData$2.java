package com.okinc.business.defi.biz.impl;

import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.net.bean.VerifyResp;
import com.okinc.wallet.api.bean.SignStatus;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC43419rot;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C13934dbu;
import o.C54834xXa;
import o.C54837xXd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.cUH;
import o.pUU;
import o.xYW;

/* JADX INFO: loaded from: classes4.dex */
public final class BindWalletServiceImpl$signBindData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C54837xXd>>, Object> {
    final /* synthetic */ C54834xXa $data;
    final /* synthetic */ FragmentManager $fragmentManager;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ cUH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BindWalletServiceImpl$signBindData$2(cUH cuh, C54834xXa c54834xXa, FragmentManager fragmentManager, Continuation<? super BindWalletServiceImpl$signBindData$2> continuation) {
        super(2, continuation);
        this.this$0 = cuh;
        this.$data = c54834xXa;
        this.$fragmentManager = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BindWalletServiceImpl$signBindData$2(this.this$0, this.$data, this.$fragmentManager, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C54837xXd>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<C54837xXd>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<C54837xXd>> continuation) {
        return ((BindWalletServiceImpl$signBindData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [303=6] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3 A[Catch: all -> 0x02f0, CancellationException -> 0x030b, TRY_ENTER, TryCatch #2 {CancellationException -> 0x030b, all -> 0x02f0, blocks: (B:7:0x001b, B:82:0x0241, B:91:0x0290, B:10:0x0026, B:74:0x01fc, B:13:0x0041, B:63:0x0193, B:65:0x019b, B:67:0x01a3, B:69:0x01b1, B:70:0x01dc, B:16:0x005e, B:57:0x015e, B:59:0x016c, B:76:0x0215, B:78:0x0221, B:84:0x025f, B:19:0x0079, B:54:0x0139, B:22:0x008e, B:48:0x010c, B:50:0x0116, B:85:0x026c, B:25:0x00a5, B:31:0x00cb, B:34:0x00d3, B:38:0x00dc, B:40:0x00e0, B:42:0x00e6, B:44:0x00ea, B:86:0x0279, B:88:0x027f, B:89:0x0289, B:28:0x00ba), top: B:102:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116 A[Catch: all -> 0x02f0, CancellationException -> 0x030b, TryCatch #2 {CancellationException -> 0x030b, all -> 0x02f0, blocks: (B:7:0x001b, B:82:0x0241, B:91:0x0290, B:10:0x0026, B:74:0x01fc, B:13:0x0041, B:63:0x0193, B:65:0x019b, B:67:0x01a3, B:69:0x01b1, B:70:0x01dc, B:16:0x005e, B:57:0x015e, B:59:0x016c, B:76:0x0215, B:78:0x0221, B:84:0x025f, B:19:0x0079, B:54:0x0139, B:22:0x008e, B:48:0x010c, B:50:0x0116, B:85:0x026c, B:25:0x00a5, B:31:0x00cb, B:34:0x00d3, B:38:0x00dc, B:40:0x00e0, B:42:0x00e6, B:44:0x00ea, B:86:0x0279, B:88:0x027f, B:89:0x0289, B:28:0x00ba), top: B:102:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016c A[Catch: all -> 0x02f0, CancellationException -> 0x030b, TryCatch #2 {CancellationException -> 0x030b, all -> 0x02f0, blocks: (B:7:0x001b, B:82:0x0241, B:91:0x0290, B:10:0x0026, B:74:0x01fc, B:13:0x0041, B:63:0x0193, B:65:0x019b, B:67:0x01a3, B:69:0x01b1, B:70:0x01dc, B:16:0x005e, B:57:0x015e, B:59:0x016c, B:76:0x0215, B:78:0x0221, B:84:0x025f, B:19:0x0079, B:54:0x0139, B:22:0x008e, B:48:0x010c, B:50:0x0116, B:85:0x026c, B:25:0x00a5, B:31:0x00cb, B:34:0x00d3, B:38:0x00dc, B:40:0x00e0, B:42:0x00e6, B:44:0x00ea, B:86:0x0279, B:88:0x027f, B:89:0x0289, B:28:0x00ba), top: B:102:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0215 A[Catch: all -> 0x02f0, CancellationException -> 0x030b, TryCatch #2 {CancellationException -> 0x030b, all -> 0x02f0, blocks: (B:7:0x001b, B:82:0x0241, B:91:0x0290, B:10:0x0026, B:74:0x01fc, B:13:0x0041, B:63:0x0193, B:65:0x019b, B:67:0x01a3, B:69:0x01b1, B:70:0x01dc, B:16:0x005e, B:57:0x015e, B:59:0x016c, B:76:0x0215, B:78:0x0221, B:84:0x025f, B:19:0x0079, B:54:0x0139, B:22:0x008e, B:48:0x010c, B:50:0x0116, B:85:0x026c, B:25:0x00a5, B:31:0x00cb, B:34:0x00d3, B:38:0x00dc, B:40:0x00e0, B:42:0x00e6, B:44:0x00ea, B:86:0x0279, B:88:0x027f, B:89:0x0289, B:28:0x00ba), top: B:102:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026c A[Catch: all -> 0x02f0, CancellationException -> 0x030b, TryCatch #2 {CancellationException -> 0x030b, all -> 0x02f0, blocks: (B:7:0x001b, B:82:0x0241, B:91:0x0290, B:10:0x0026, B:74:0x01fc, B:13:0x0041, B:63:0x0193, B:65:0x019b, B:67:0x01a3, B:69:0x01b1, B:70:0x01dc, B:16:0x005e, B:57:0x015e, B:59:0x016c, B:76:0x0215, B:78:0x0221, B:84:0x025f, B:19:0x0079, B:54:0x0139, B:22:0x008e, B:48:0x010c, B:50:0x0116, B:85:0x026c, B:25:0x00a5, B:31:0x00cb, B:34:0x00d3, B:38:0x00dc, B:40:0x00e0, B:42:0x00e6, B:44:0x00ea, B:86:0x0279, B:88:0x027f, B:89:0x0289, B:28:0x00ba), top: B:102:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027f A[Catch: all -> 0x02f0, CancellationException -> 0x030b, TryCatch #2 {CancellationException -> 0x030b, all -> 0x02f0, blocks: (B:7:0x001b, B:82:0x0241, B:91:0x0290, B:10:0x0026, B:74:0x01fc, B:13:0x0041, B:63:0x0193, B:65:0x019b, B:67:0x01a3, B:69:0x01b1, B:70:0x01dc, B:16:0x005e, B:57:0x015e, B:59:0x016c, B:76:0x0215, B:78:0x0221, B:84:0x025f, B:19:0x0079, B:54:0x0139, B:22:0x008e, B:48:0x010c, B:50:0x0116, B:85:0x026c, B:25:0x00a5, B:31:0x00cb, B:34:0x00d3, B:38:0x00dc, B:40:0x00e0, B:42:0x00e6, B:44:0x00ea, B:86:0x0279, B:88:0x027f, B:89:0x0289, B:28:0x00ba), top: B:102:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0289 A[Catch: all -> 0x02f0, CancellationException -> 0x030b, TryCatch #2 {CancellationException -> 0x030b, all -> 0x02f0, blocks: (B:7:0x001b, B:82:0x0241, B:91:0x0290, B:10:0x0026, B:74:0x01fc, B:13:0x0041, B:63:0x0193, B:65:0x019b, B:67:0x01a3, B:69:0x01b1, B:70:0x01dc, B:16:0x005e, B:57:0x015e, B:59:0x016c, B:76:0x0215, B:78:0x0221, B:84:0x025f, B:19:0x0079, B:54:0x0139, B:22:0x008e, B:48:0x010c, B:50:0x0116, B:85:0x026c, B:25:0x00a5, B:31:0x00cb, B:34:0x00d3, B:38:0x00dc, B:40:0x00e0, B:42:0x00e6, B:44:0x00ea, B:86:0x0279, B:88:0x027f, B:89:0x0289, B:28:0x00ba), top: B:102:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0301  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        cUH cuh;
        C54834xXa c54834xXa;
        FragmentManager fragmentManager;
        Object objKWHzl;
        String str;
        SignStatus status;
        SignStatus signStatus;
        Long l;
        String strOLrzqt;
        String str2;
        Object objAwaitFirst;
        C54834xXa c54834xXa2;
        cUH cuh2;
        String str3;
        Triple triple;
        String str4;
        Object objAwait;
        AbstractC12782ctV abstractC12782ctV;
        Object objAEQbTJ;
        C54834xXa c54834xXa3;
        Object objKWHzl2;
        String str5;
        AbstractC12782ctV abstractC12782ctV2;
        cUH cuh3;
        AbstractC43419rot abstractC43419rot;
        Object objAEQbTJ2;
        VerifyResp verifyResp;
        SignStatus signStatusKWHzl;
        Long lAEQbTJ;
        Integer numEZpvd;
        String strOLrzqt2;
        String strCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        Integer num = null;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                cuh = this.this$0;
                c54834xXa = this.$data;
                fragmentManager = this.$fragmentManager;
                Result.Application application2 = Result.Companion;
                this.L$0 = cuh;
                this.L$1 = c54834xXa;
                this.L$2 = fragmentManager;
                this.label = 1;
                objKWHzl = cuh.KWHzl(c54834xXa, (Continuation<? super Result<PreCheckResult>>) this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                str = "";
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                    PreCheckResult preCheckResult = (PreCheckResult) (Result.m7383isFailureimpl(objKWHzl) ? null : objKWHzl);
                    if ((preCheckResult != null ? preCheckResult.getStatus() : null) == SignStatus.Success) {
                        C56391yDq.AEQbTJ(objKWHzl);
                        AbstractC58185ywX abstractC58185ywXCopydefault = cuh.copydefault(fragmentManager, ((PreCheckResult) objKWHzl).getWallet());
                        this.L$0 = cuh;
                        this.L$1 = c54834xXa;
                        this.L$2 = "";
                        this.L$3 = "";
                        this.label = 2;
                        objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXCopydefault, this);
                        if (objAwaitFirst == objCopydefault) {
                            return objCopydefault;
                        }
                        c54834xXa2 = c54834xXa;
                        cuh2 = cuh;
                        str3 = "";
                        triple = (Triple) objAwaitFirst;
                        if (triple.getFirst() == SignStatus.Success) {
                            signStatus = (SignStatus) triple.getFirst();
                            l = null;
                            str2 = str3;
                            c54834xXa = c54834xXa2;
                            strOLrzqt = str;
                            String strCopydefault2 = xYW.AEQbTJ.copydefault("status=" + signStatus + " chainIndex=" + l + " addressType=" + num + " msg=" + c54834xXa.EZpvd() + " accountId=" + c54834xXa.KWHzl());
                            StringBuilder sb = new StringBuilder();
                            sb.append("signBindData ");
                            sb.append(strCopydefault2);
                            pUU.KWHzl("BindWalletServiceImpl", sb.toString());
                            objM7377constructorimpl = Result.m7377constructorimpl(new C54837xXd(signStatus, strOLrzqt, str2, l, num));
                            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                            if (thM7380exceptionOrNullimpl != null) {
                            }
                            return Result.m7376boximpl(objM7377constructorimpl);
                        }
                        AbstractC58185ywX abstractC58185ywXOLrzqt = cuh2.OLrzqt((String) triple.getThird(), c54834xXa2.KWHzl());
                        this.L$0 = cuh2;
                        this.L$1 = c54834xXa2;
                        this.L$2 = str;
                        this.L$3 = str3;
                        this.L$4 = triple;
                        this.label = 3;
                        if (AwaitKt.awaitFirst(abstractC58185ywXOLrzqt, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        str4 = str;
                        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtAEQbTJ = cuh2.AYXKKw.AhwBna().AEQbTJ(c54834xXa2.KWHzl(), false);
                        this.L$0 = cuh2;
                        this.L$1 = c54834xXa2;
                        this.L$2 = str4;
                        this.L$3 = str3;
                        this.L$4 = triple;
                        this.label = 4;
                        objAwait = RxAwaitKt.await(abstractC58260yxtAEQbTJ, this);
                        if (objAwait == objCopydefault) {
                            return objCopydefault;
                        }
                        abstractC12782ctV = (AbstractC12782ctV) objAwait;
                        if (abstractC12782ctV.QCjLjM() != WalletSyncStatus.HasSync.getValue()) {
                            if (abstractC12782ctV.QCjLjM() != WalletSyncStatus.HasCreate.getValue()) {
                                pUU.EZpvd("BindWalletServiceImpl", "signBindData NotSync");
                                signStatus = SignStatus.SyncFailed;
                                l = null;
                                str2 = str3;
                                strOLrzqt = str4;
                                c54834xXa = c54834xXa2;
                                String strCopydefault22 = xYW.AEQbTJ.copydefault("status=" + signStatus + " chainIndex=" + l + " addressType=" + num + " msg=" + c54834xXa.EZpvd() + " accountId=" + c54834xXa.KWHzl());
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("signBindData ");
                                sb2.append(strCopydefault22);
                                pUU.KWHzl("BindWalletServiceImpl", sb2.toString());
                                objM7377constructorimpl = Result.m7377constructorimpl(new C54837xXd(signStatus, strOLrzqt, str2, l, num));
                                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                                if (thM7380exceptionOrNullimpl != null) {
                                }
                                return Result.m7376boximpl(objM7377constructorimpl);
                            }
                            pUU.EZpvd("BindWalletServiceImpl", "signBindData HasCreate");
                            String str6 = (String) triple.getSecond();
                            this.L$0 = c54834xXa2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.label = 7;
                            objAEQbTJ = cuh2.AEQbTJ(abstractC12782ctV, str6, c54834xXa2, this);
                            if (objAEQbTJ == objCopydefault) {
                                return objCopydefault;
                            }
                            c54834xXa3 = c54834xXa2;
                            C54837xXd c54837xXd = (C54837xXd) objAEQbTJ;
                            signStatusKWHzl = c54837xXd.KWHzl();
                            lAEQbTJ = c54837xXd.AEQbTJ();
                            numEZpvd = c54837xXd.EZpvd();
                            strOLrzqt2 = c54837xXd.OLrzqt();
                            strCopydefault = c54837xXd.copydefault();
                            signStatus = signStatusKWHzl;
                            l = lAEQbTJ;
                            num = numEZpvd;
                            strOLrzqt = strOLrzqt2;
                            str2 = strCopydefault;
                            c54834xXa = c54834xXa3;
                            String strCopydefault222 = xYW.AEQbTJ.copydefault("status=" + signStatus + " chainIndex=" + l + " addressType=" + num + " msg=" + c54834xXa.EZpvd() + " accountId=" + c54834xXa.KWHzl());
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append("signBindData ");
                            sb22.append(strCopydefault222);
                            pUU.KWHzl("BindWalletServiceImpl", sb22.toString());
                            objM7377constructorimpl = Result.m7377constructorimpl(new C54837xXd(signStatus, strOLrzqt, str2, l, num));
                            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                            if (thM7380exceptionOrNullimpl != null) {
                            }
                            return Result.m7376boximpl(objM7377constructorimpl);
                        }
                        pUU.EZpvd("BindWalletServiceImpl", "signBindData HasSync");
                        C13934dbu c13934dbu = cuh2.OLrzqt;
                        String strKWHzl = c54834xXa2.KWHzl();
                        this.L$0 = cuh2;
                        this.L$1 = c54834xXa2;
                        this.L$2 = str3;
                        this.L$3 = abstractC12782ctV;
                        this.L$4 = triple;
                        this.label = 5;
                        objKWHzl2 = c13934dbu.KWHzl(strKWHzl, this);
                        if (objKWHzl2 == objCopydefault) {
                            return objCopydefault;
                        }
                        cUH cuh4 = cuh2;
                        str5 = str3;
                        abstractC12782ctV2 = abstractC12782ctV;
                        cuh3 = cuh4;
                        abstractC43419rot = (AbstractC43419rot) objKWHzl2;
                        if (!abstractC43419rot.EZpvd() && (verifyResp = (VerifyResp) abstractC43419rot.copydefault()) != null && Intrinsics.EZpvd(verifyResp.getRes(), C56443yFo.KWHzl(true))) {
                            pUU.EZpvd("BindWalletServiceImpl", "signBindData checkWalletSignStatus success");
                            C54837xXd c54837xXdCopydefault = cuh3.copydefault(abstractC12782ctV2, (String) triple.getSecond(), c54834xXa2.EZpvd());
                            SignStatus signStatusKWHzl2 = c54837xXdCopydefault.KWHzl();
                            Long lAEQbTJ2 = c54837xXdCopydefault.AEQbTJ();
                            Integer numEZpvd2 = c54837xXdCopydefault.EZpvd();
                            signStatus = signStatusKWHzl2;
                            l = lAEQbTJ2;
                            c54834xXa = c54834xXa2;
                            str2 = str5;
                            strOLrzqt = c54837xXdCopydefault.OLrzqt();
                            num = numEZpvd2;
                            String strCopydefault2222 = xYW.AEQbTJ.copydefault("status=" + signStatus + " chainIndex=" + l + " addressType=" + num + " msg=" + c54834xXa.EZpvd() + " accountId=" + c54834xXa.KWHzl());
                            StringBuilder sb222 = new StringBuilder();
                            sb222.append("signBindData ");
                            sb222.append(strCopydefault2222);
                            pUU.KWHzl("BindWalletServiceImpl", sb222.toString());
                            objM7377constructorimpl = Result.m7377constructorimpl(new C54837xXd(signStatus, strOLrzqt, str2, l, num));
                            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                            if (thM7380exceptionOrNullimpl != null) {
                            }
                            return Result.m7376boximpl(objM7377constructorimpl);
                        }
                        pUU.EZpvd("BindWalletServiceImpl", "signBindData checkWalletSignStatus failed");
                        String str7 = (String) triple.getSecond();
                        this.L$0 = c54834xXa2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 6;
                        objAEQbTJ2 = cuh3.AEQbTJ(abstractC12782ctV2, str7, c54834xXa2, this);
                        if (objAEQbTJ2 != objCopydefault) {
                            return objCopydefault;
                        }
                        c54834xXa3 = c54834xXa2;
                        C54837xXd c54837xXd2 = (C54837xXd) objAEQbTJ2;
                        signStatusKWHzl = c54837xXd2.KWHzl();
                        lAEQbTJ = c54837xXd2.AEQbTJ();
                        numEZpvd = c54837xXd2.EZpvd();
                        strOLrzqt2 = c54837xXd2.OLrzqt();
                        strCopydefault = c54837xXd2.copydefault();
                        signStatus = signStatusKWHzl;
                        l = lAEQbTJ;
                        num = numEZpvd;
                        strOLrzqt = strOLrzqt2;
                        str2 = strCopydefault;
                        c54834xXa = c54834xXa3;
                        String strCopydefault22222 = xYW.AEQbTJ.copydefault("status=" + signStatus + " chainIndex=" + l + " addressType=" + num + " msg=" + c54834xXa.EZpvd() + " accountId=" + c54834xXa.KWHzl());
                        StringBuilder sb2222 = new StringBuilder();
                        sb2222.append("signBindData ");
                        sb2222.append(strCopydefault22222);
                        pUU.KWHzl("BindWalletServiceImpl", sb2222.toString());
                        objM7377constructorimpl = Result.m7377constructorimpl(new C54837xXd(signStatus, strOLrzqt, str2, l, num));
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            pUU.AEQbTJ("BindWalletServiceImpl", "signBindData onFailure", thM7380exceptionOrNullimpl);
                        }
                        return Result.m7376boximpl(objM7377constructorimpl);
                    }
                }
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                    status = SignStatus.AccountNotExist;
                } else {
                    C56391yDq.AEQbTJ(objKWHzl);
                    status = ((PreCheckResult) objKWHzl).getStatus();
                }
                signStatus = status;
                l = null;
                strOLrzqt = "";
                str2 = strOLrzqt;
                String strCopydefault222222 = xYW.AEQbTJ.copydefault("status=" + signStatus + " chainIndex=" + l + " addressType=" + num + " msg=" + c54834xXa.EZpvd() + " accountId=" + c54834xXa.KWHzl());
                StringBuilder sb22222 = new StringBuilder();
                sb22222.append("signBindData ");
                sb22222.append(strCopydefault222222);
                pUU.KWHzl("BindWalletServiceImpl", sb22222.toString());
                objM7377constructorimpl = Result.m7377constructorimpl(new C54837xXd(signStatus, strOLrzqt, str2, l, num));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Result.m7376boximpl(objM7377constructorimpl);
            case 1:
                fragmentManager = (FragmentManager) this.L$2;
                c54834xXa = (C54834xXa) this.L$1;
                cuh = (cUH) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                str = "";
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                }
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                }
                signStatus = status;
                l = null;
                strOLrzqt = "";
                str2 = strOLrzqt;
                String strCopydefault2222222 = xYW.AEQbTJ.copydefault("status=" + signStatus + " chainIndex=" + l + " addressType=" + num + " msg=" + c54834xXa.EZpvd() + " accountId=" + c54834xXa.KWHzl());
                StringBuilder sb222222 = new StringBuilder();
                sb222222.append("signBindData ");
                sb222222.append(strCopydefault2222222);
                pUU.KWHzl("BindWalletServiceImpl", sb222222.toString());
                objM7377constructorimpl = Result.m7377constructorimpl(new C54837xXd(signStatus, strOLrzqt, str2, l, num));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Result.m7376boximpl(objM7377constructorimpl);
            case 2:
                String str8 = (String) this.L$3;
                String str9 = (String) this.L$2;
                C54834xXa c54834xXa4 = (C54834xXa) this.L$1;
                cUH cuh5 = (cUH) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str = str9;
                cuh2 = cuh5;
                str3 = str8;
                c54834xXa2 = c54834xXa4;
                objAwaitFirst = obj;
                triple = (Triple) objAwaitFirst;
                if (triple.getFirst() == SignStatus.Success) {
                }
                break;
            case 3:
                triple = (Triple) this.L$4;
                str3 = (String) this.L$3;
                str4 = (String) this.L$2;
                c54834xXa2 = (C54834xXa) this.L$1;
                cuh2 = (cUH) this.L$0;
                C56391yDq.AEQbTJ(obj);
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtAEQbTJ2 = cuh2.AYXKKw.AhwBna().AEQbTJ(c54834xXa2.KWHzl(), false);
                this.L$0 = cuh2;
                this.L$1 = c54834xXa2;
                this.L$2 = str4;
                this.L$3 = str3;
                this.L$4 = triple;
                this.label = 4;
                objAwait = RxAwaitKt.await(abstractC58260yxtAEQbTJ2, this);
                if (objAwait == objCopydefault) {
                }
                abstractC12782ctV = (AbstractC12782ctV) objAwait;
                if (abstractC12782ctV.QCjLjM() != WalletSyncStatus.HasSync.getValue()) {
                }
                break;
            case 4:
                triple = (Triple) this.L$4;
                str3 = (String) this.L$3;
                str4 = (String) this.L$2;
                c54834xXa2 = (C54834xXa) this.L$1;
                cuh2 = (cUH) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwait = obj;
                abstractC12782ctV = (AbstractC12782ctV) objAwait;
                if (abstractC12782ctV.QCjLjM() != WalletSyncStatus.HasSync.getValue()) {
                }
                break;
            case 5:
                triple = (Triple) this.L$4;
                abstractC12782ctV2 = (AbstractC12782ctV) this.L$3;
                String str10 = (String) this.L$2;
                c54834xXa2 = (C54834xXa) this.L$1;
                cUH cuh6 = (cUH) this.L$0;
                C56391yDq.AEQbTJ(obj);
                cuh3 = cuh6;
                str5 = str10;
                objKWHzl2 = obj;
                abstractC43419rot = (AbstractC43419rot) objKWHzl2;
                if (!abstractC43419rot.EZpvd()) {
                }
                pUU.EZpvd("BindWalletServiceImpl", "signBindData checkWalletSignStatus failed");
                String str72 = (String) triple.getSecond();
                this.L$0 = c54834xXa2;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 6;
                objAEQbTJ2 = cuh3.AEQbTJ(abstractC12782ctV2, str72, c54834xXa2, this);
                if (objAEQbTJ2 != objCopydefault) {
                }
                break;
            case 6:
                c54834xXa3 = (C54834xXa) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ2 = obj;
                C54837xXd c54837xXd22 = (C54837xXd) objAEQbTJ2;
                signStatusKWHzl = c54837xXd22.KWHzl();
                lAEQbTJ = c54837xXd22.AEQbTJ();
                numEZpvd = c54837xXd22.EZpvd();
                strOLrzqt2 = c54837xXd22.OLrzqt();
                strCopydefault = c54837xXd22.copydefault();
                signStatus = signStatusKWHzl;
                l = lAEQbTJ;
                num = numEZpvd;
                strOLrzqt = strOLrzqt2;
                str2 = strCopydefault;
                c54834xXa = c54834xXa3;
                String strCopydefault22222222 = xYW.AEQbTJ.copydefault("status=" + signStatus + " chainIndex=" + l + " addressType=" + num + " msg=" + c54834xXa.EZpvd() + " accountId=" + c54834xXa.KWHzl());
                StringBuilder sb2222222 = new StringBuilder();
                sb2222222.append("signBindData ");
                sb2222222.append(strCopydefault22222222);
                pUU.KWHzl("BindWalletServiceImpl", sb2222222.toString());
                objM7377constructorimpl = Result.m7377constructorimpl(new C54837xXd(signStatus, strOLrzqt, str2, l, num));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Result.m7376boximpl(objM7377constructorimpl);
            case 7:
                c54834xXa3 = (C54834xXa) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
                C54837xXd c54837xXd3 = (C54837xXd) objAEQbTJ;
                signStatusKWHzl = c54837xXd3.KWHzl();
                lAEQbTJ = c54837xXd3.AEQbTJ();
                numEZpvd = c54837xXd3.EZpvd();
                strOLrzqt2 = c54837xXd3.OLrzqt();
                strCopydefault = c54837xXd3.copydefault();
                signStatus = signStatusKWHzl;
                l = lAEQbTJ;
                num = numEZpvd;
                strOLrzqt = strOLrzqt2;
                str2 = strCopydefault;
                c54834xXa = c54834xXa3;
                String strCopydefault222222222 = xYW.AEQbTJ.copydefault("status=" + signStatus + " chainIndex=" + l + " addressType=" + num + " msg=" + c54834xXa.EZpvd() + " accountId=" + c54834xXa.KWHzl());
                StringBuilder sb22222222 = new StringBuilder();
                sb22222222.append("signBindData ");
                sb22222222.append(strCopydefault222222222);
                pUU.KWHzl("BindWalletServiceImpl", sb22222222.toString());
                objM7377constructorimpl = Result.m7377constructorimpl(new C54837xXd(signStatus, strOLrzqt, str2, l, num));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Result.m7376boximpl(objM7377constructorimpl);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
