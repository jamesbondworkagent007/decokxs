package com.okinc.business.defi.wallet.common.tonconnect.ui.viewmodel;

import com.okinc.business.defi.api.bean.VerifyDAppDomainResponse;
import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
import com.okinc.business.defi.wallet.common.okxconnect.track.ConnectEventTracking;
import com.okinc.business.defi.wallet.common.tonconnect.model.DAppManifest;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C10854bwM;
import o.C13754dXa;
import o.C15935eaT;
import o.C15937eaV;
import o.C16026ecE;
import o.C16029ecH;
import o.C16033ecL;
import o.C16058eck;
import o.C33070mpX;
import o.C33488mxR;
import o.C48787ucK;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppConnectionViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ C16029ecH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppConnectionViewModel$1(C16029ecH c16029ecH, Continuation<? super DAppConnectionViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = c16029ecH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppConnectionViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DAppConnectionViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [53=4] */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse */
    /* JADX DEBUG: Multi-variable search result rejected for r14v1, resolved type: com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse */
    /* JADX DEBUG: Multi-variable search result rejected for r14v9, resolved type: com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0445 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a4  */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x02e7 -> B:106:0x02f5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objM7377constructorimpl2;
        Throwable thM7380exceptionOrNullimpl;
        AbstractC12782ctV abstractC12782ctV;
        DAppConnectRequest dAppConnectRequestCopydefault;
        C16029ecH c16029ecH;
        Object objOLrzqt;
        AbstractC12782ctV abstractC12782ctV2;
        DAppConnectRequest dAppConnectRequest;
        C16029ecH c16029ecH2;
        Object value;
        C16026ecE c16026ecE;
        Object objKWHzl;
        Object objCopydefault;
        C16029ecH c16029ecH3;
        AbstractC12782ctV abstractC12782ctV3;
        DAppManifest dAppManifest;
        VerifyDAppDomainResponse verifyDAppDomainResponse;
        MutableStateFlow mutableStateFlow;
        Object value2;
        C16026ecE c16026ecE2;
        C16033ecL c16033ecL;
        List listEZpvd;
        List list;
        boolean zEZpvd;
        String originUrl;
        AbstractC12782ctV abstractC12782ctV4;
        DAppConnectRequest dAppConnectRequest2;
        MutableStateFlow mutableStateFlow2;
        Object value3;
        Object objCopydefault2;
        String str;
        List<C10854bwM> list2;
        String str2;
        C16033ecL c16033ecL2;
        C16026ecE c16026ecE3;
        C16029ecH c16029ecH4;
        int i;
        int i2;
        ?? r14;
        Throwable thM7380exceptionOrNullimpl2;
        AbstractC12782ctV abstractC12782ctV5;
        Object objEZpvd;
        Object next;
        DAppManifest manifest;
        Object value4;
        C16026ecE c16026ecE4;
        C16033ecL c16033ecL3;
        List listEZpvd2;
        Iterator it;
        DAppSession dAppSession;
        Object value5;
        C16026ecE c16026ecE5;
        Object objAwait;
        Object objAwait2;
        Object objCopydefault3 = C56442yFn.copydefault();
        int i3 = 0;
        Object obj2 = null;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th2) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                if (this.this$0.AEQbTJ().length() != 0) {
                    C16029ecH c16029ecH5 = this.this$0;
                    Result.Application application3 = Result.Companion;
                    AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = c16029ecH5.gEmmrt.copydefault(false);
                    this.label = 6;
                    objAwait = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
                    if (objAwait == objCopydefault3) {
                        return objCopydefault3;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) objAwait);
                    thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl2 != null) {
                        pUU.AEQbTJ("DAppConnectionViewModel", "init: clientId.isNotEmpty()", thM7380exceptionOrNullimpl2);
                    }
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = null;
                    }
                    abstractC12782ctV5 = (AbstractC12782ctV) objM7377constructorimpl;
                    if (abstractC12782ctV5 != null) {
                        return Unit.INSTANCE;
                    }
                    if (this.this$0.OLrzqt() == 2) {
                        List<com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession> listKWHzl = this.this$0.OLrzqt.KWHzl(abstractC12782ctV5.DbNXlk());
                        C16029ecH c16029ecH6 = this.this$0;
                        Iterator<T> it2 = listKWHzl.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.EZpvd((Object) ((com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession) next).getClientId(), (Object) c16029ecH6.AEQbTJ())) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession dAppSession2 = (com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession) next;
                        if (dAppSession2 == null || (manifest = dAppSession2.getManifest()) == null) {
                            return Unit.INSTANCE;
                        }
                        MutableStateFlow mutableStateFlow3 = this.this$0.copydefault;
                        C16029ecH c16029ecH7 = this.this$0;
                        do {
                            value4 = mutableStateFlow3.getValue();
                            c16026ecE4 = (C16026ecE) value4;
                            c16033ecL3 = new C16033ecL(manifest.getName(), manifest.getUrl(), manifest.getIconUrl());
                            C10854bwM c10854bwMGEmmrt = c16029ecH7.OLrzqt.gEmmrt();
                            listEZpvd2 = c10854bwMGEmmrt != null ? C56402yEa.EZpvd(c10854bwMGEmmrt) : null;
                            if (listEZpvd2 == null) {
                                listEZpvd2 = yDY.AhwBna();
                            }
                        } while (!mutableStateFlow3.compareAndSet(value4, c16026ecE4.copydefault((1022 & 1) != 0 ? c16026ecE4.KWHzl : C56443yFo.AEQbTJ(3), (1022 & 2) != 0 ? c16026ecE4.gEmmrt : c16033ecL3, (1022 & 4) != 0 ? c16026ecE4.djBIcL : abstractC12782ctV5, (1022 & 8) != 0 ? c16026ecE4.AYXKKw : null, (1022 & 16) != 0 ? c16026ecE4.AhwBna : listEZpvd2, (1022 & 32) != 0 ? c16026ecE4.EZpvd : false, (1022 & 64) != 0 ? c16026ecE4.AEQbTJ : null, (1022 & 128) != 0 ? c16026ecE4.valueOf : null, (1022 & 256) != 0 ? c16026ecE4.OLrzqt : false, (1022 & 512) != 0 ? c16026ecE4.copydefault : null)));
                    } else if (this.this$0.OLrzqt() == 3) {
                        C15935eaT c15935eaT = this.this$0.AEQbTJ;
                        String strDbNXlk = abstractC12782ctV5.DbNXlk();
                        this.L$0 = abstractC12782ctV5;
                        this.label = 7;
                        objEZpvd = c15935eaT.EZpvd(strDbNXlk, this);
                        if (objEZpvd == objCopydefault3) {
                            return objCopydefault3;
                        }
                        C16029ecH c16029ecH8 = this.this$0;
                        it = ((Iterable) objEZpvd).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                Object next2 = it.next();
                                if (Intrinsics.EZpvd((Object) ((DAppSession) next2).getClientId(), (Object) c16029ecH8.AEQbTJ())) {
                                    obj2 = next2;
                                }
                            }
                        }
                        dAppSession = (DAppSession) obj2;
                        if (dAppSession != null) {
                            return Unit.INSTANCE;
                        }
                        MutableStateFlow mutableStateFlow4 = this.this$0.copydefault;
                        C16029ecH c16029ecH9 = this.this$0;
                        do {
                            value5 = mutableStateFlow4.getValue();
                            c16026ecE5 = (C16026ecE) value5;
                        } while (!mutableStateFlow4.compareAndSet(value5, c16026ecE5.copydefault((1022 & 1) != 0 ? c16026ecE5.KWHzl : C56443yFo.AEQbTJ(3), (1022 & 2) != 0 ? c16026ecE5.gEmmrt : new C16033ecL(dAppSession.getDAppInfo().getName(), dAppSession.getDAppInfo().getUrl(), dAppSession.getDAppInfo().getIcon()), (1022 & 4) != 0 ? c16026ecE5.djBIcL : abstractC12782ctV5, (1022 & 8) != 0 ? c16026ecE5.AYXKKw : null, (1022 & 16) != 0 ? c16026ecE5.AhwBna : c16029ecH9.AEQbTJ.copydefault(dAppSession.getConnectedCaipChains(), dAppSession.isTonConnected()), (1022 & 32) != 0 ? c16026ecE5.EZpvd : false, (1022 & 64) != 0 ? c16026ecE5.AEQbTJ : null, (1022 & 128) != 0 ? c16026ecE5.valueOf : null, (1022 & 256) != 0 ? c16026ecE5.OLrzqt : false, (1022 & 512) != 0 ? c16026ecE5.copydefault : null)));
                    }
                    return Unit.INSTANCE;
                }
                C16029ecH c16029ecH10 = this.this$0;
                Result.Application application4 = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault2 = c16029ecH10.gEmmrt.copydefault(false);
                this.label = 1;
                objAwait2 = RxAwaitKt.await(abstractC58260yxtCopydefault2, this);
                if (objAwait2 == objCopydefault3) {
                    return objCopydefault3;
                }
                objM7377constructorimpl2 = Result.m7377constructorimpl((AbstractC12782ctV) objAwait2);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("DAppConnectionViewModel", "init: clientId.isEmpty()", thM7380exceptionOrNullimpl);
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                    objM7377constructorimpl2 = null;
                }
                abstractC12782ctV = (AbstractC12782ctV) objM7377constructorimpl2;
                if (abstractC12782ctV != null) {
                    return Unit.INSTANCE;
                }
                if (this.this$0.OLrzqt() == 2) {
                    C16058eck c16058eck = this.this$0.OLrzqt;
                    this.L$0 = abstractC12782ctV;
                    this.label = 2;
                    objKWHzl = c16058eck.KWHzl(this);
                    if (objKWHzl == objCopydefault3) {
                        return objCopydefault3;
                    }
                    C16029ecH c16029ecH11 = this.this$0;
                    if (Result.m7384isSuccessimpl(objKWHzl)) {
                        DAppManifest dAppManifest2 = (DAppManifest) objKWHzl;
                        String strEZpvd = c16029ecH11.OLrzqt.EZpvd();
                        String strEZpvd2 = C33488mxR.EZpvd(dAppManifest2);
                        this.L$0 = abstractC12782ctV;
                        this.L$1 = objKWHzl;
                        this.L$2 = c16029ecH11;
                        this.L$3 = dAppManifest2;
                        this.label = 3;
                        objCopydefault = c16029ecH11.copydefault(strEZpvd, strEZpvd2, this);
                        if (objCopydefault == objCopydefault3) {
                            return objCopydefault3;
                        }
                        c16029ecH3 = c16029ecH11;
                        abstractC12782ctV3 = abstractC12782ctV;
                        dAppManifest = dAppManifest2;
                        verifyDAppDomainResponse = (VerifyDAppDomainResponse) objCopydefault;
                        mutableStateFlow = c16029ecH3.copydefault;
                        do {
                            value2 = mutableStateFlow.getValue();
                            c16026ecE2 = (C16026ecE) value2;
                            c16033ecL = new C16033ecL(dAppManifest.getName(), dAppManifest.getUrl(), dAppManifest.getIconUrl());
                            C10854bwM c10854bwMGEmmrt2 = c16029ecH3.OLrzqt.gEmmrt();
                            listEZpvd = c10854bwMGEmmrt2 == null ? C56402yEa.EZpvd(c10854bwMGEmmrt2) : null;
                            if (listEZpvd == null) {
                                listEZpvd = yDY.AhwBna();
                            }
                            list = listEZpvd;
                            zEZpvd = Intrinsics.EZpvd((Object) (verifyDAppDomainResponse == null ? verifyDAppDomainResponse.getLevel() : null), (Object) VerifyDAppDomainResponse.LEVEL_RISK);
                            originUrl = verifyDAppDomainResponse == null ? verifyDAppDomainResponse.getOriginUrl() : null;
                            if (originUrl == null) {
                                originUrl = "";
                            }
                        } while (!mutableStateFlow.compareAndSet(value2, c16026ecE2.copydefault((1022 & 1) != 0 ? c16026ecE2.KWHzl : C56443yFo.AEQbTJ(0), (1022 & 2) != 0 ? c16026ecE2.gEmmrt : c16033ecL, (1022 & 4) != 0 ? c16026ecE2.djBIcL : abstractC12782ctV3, (1022 & 8) != 0 ? c16026ecE2.AYXKKw : null, (1022 & 16) != 0 ? c16026ecE2.AhwBna : list, (1022 & 32) != 0 ? c16026ecE2.EZpvd : zEZpvd, (1022 & 64) != 0 ? c16026ecE2.AEQbTJ : originUrl, (1022 & 128) != 0 ? c16026ecE2.valueOf : null, (1022 & 256) != 0 ? c16026ecE2.OLrzqt : !c16029ecH3.OLrzqt(abstractC12782ctV3), (1022 & 512) != 0 ? c16026ecE2.copydefault : null)));
                    }
                    return Unit.INSTANCE;
                }
                if (this.this$0.OLrzqt() == 3 && (dAppConnectRequestCopydefault = this.this$0.AEQbTJ.copydefault()) != null) {
                    c16029ecH = this.this$0;
                    String strAEQbTJ = c16029ecH.AEQbTJ.AEQbTJ();
                    ConnectEventTracking.AEQbTJ.copydefault(strAEQbTJ != null);
                    pUU.EZpvd("DAppConnectionViewModel", "subscribeAndFetch: " + strAEQbTJ);
                    boolean zCopydefault = C48787ucK.AEQbTJ.copydefault("okxConnectConfiguration.isInterceptEmptyOrigin", false);
                    if (strAEQbTJ == null && zCopydefault) {
                        MutableStateFlow mutableStateFlow5 = c16029ecH.copydefault;
                        do {
                            value = mutableStateFlow5.getValue();
                            c16026ecE = (C16026ecE) value;
                        } while (!mutableStateFlow5.compareAndSet(value, c16026ecE.copydefault((1022 & 1) != 0 ? c16026ecE.KWHzl : C56443yFo.AEQbTJ(5), (1022 & 2) != 0 ? c16026ecE.gEmmrt : null, (1022 & 4) != 0 ? c16026ecE.djBIcL : null, (1022 & 8) != 0 ? c16026ecE.AYXKKw : null, (1022 & 16) != 0 ? c16026ecE.AhwBna : null, (1022 & 32) != 0 ? c16026ecE.EZpvd : false, (1022 & 64) != 0 ? c16026ecE.AEQbTJ : null, (1022 & 128) != 0 ? c16026ecE.valueOf : C33070mpX.AYXKKw(C13754dXa.FragmentManager.reportRunnablelambda2), (1022 & 256) != 0 ? c16026ecE.OLrzqt : false, (1022 & 512) != 0 ? c16026ecE.copydefault : null)));
                    } else {
                        if (strAEQbTJ != null) {
                            this.L$0 = abstractC12782ctV;
                            this.L$1 = c16029ecH;
                            this.L$2 = dAppConnectRequestCopydefault;
                            this.label = 4;
                            objOLrzqt = c16029ecH.OLrzqt(strAEQbTJ, this);
                            if (objOLrzqt == objCopydefault3) {
                                return objCopydefault3;
                            }
                            abstractC12782ctV2 = abstractC12782ctV;
                            dAppConnectRequest = dAppConnectRequestCopydefault;
                            c16029ecH2 = c16029ecH;
                            obj2 = (VerifyDAppDomainUrlResponse) objOLrzqt;
                            C16029ecH c16029ecH12 = c16029ecH2;
                            dAppConnectRequestCopydefault = dAppConnectRequest;
                            abstractC12782ctV = abstractC12782ctV2;
                            c16029ecH = c16029ecH12;
                        }
                        abstractC12782ctV4 = abstractC12782ctV;
                        dAppConnectRequest2 = dAppConnectRequestCopydefault;
                        C16029ecH c16029ecH13 = c16029ecH;
                        mutableStateFlow2 = c16029ecH.copydefault;
                        VerifyDAppDomainUrlResponse verifyDAppDomainUrlResponse = obj2;
                        value3 = mutableStateFlow2.getValue();
                        C16026ecE c16026ecE6 = (C16026ecE) value3;
                        C16033ecL c16033ecL4 = new C16033ecL(dAppConnectRequest2.getDAppInfo().getName(), dAppConnectRequest2.getDAppInfo().getUrl(), dAppConnectRequest2.getDAppInfo().getIcon());
                        String topic = dAppConnectRequest2.getTopic();
                        List<C10854bwM> listCopydefault = c16029ecH13.AEQbTJ.copydefault(dAppConnectRequest2.getRequestedCaipChains(), dAppConnectRequest2.getHasLegacyTonRequest());
                        int i4 = (verifyDAppDomainUrlResponse == 0 || !verifyDAppDomainUrlResponse.getHasRisk()) ? i3 : 1;
                        String url = dAppConnectRequest2.getDAppInfo().getUrl();
                        int i5 = !c16029ecH13.OLrzqt(abstractC12782ctV4) ? 1 : 0;
                        C15935eaT c15935eaT2 = c16029ecH13.AEQbTJ;
                        this.L$0 = abstractC12782ctV4;
                        this.L$1 = c16029ecH13;
                        this.L$2 = dAppConnectRequest2;
                        this.L$3 = verifyDAppDomainUrlResponse;
                        this.L$4 = mutableStateFlow2;
                        this.L$5 = value3;
                        this.L$6 = c16026ecE6;
                        this.L$7 = c16033ecL4;
                        this.L$8 = topic;
                        this.L$9 = listCopydefault;
                        this.L$10 = url;
                        this.I$0 = i4;
                        this.I$1 = i5;
                        C16029ecH c16029ecH14 = c16029ecH13;
                        this.label = 5;
                        objCopydefault2 = c15935eaT2.copydefault(dAppConnectRequest2, abstractC12782ctV4, this);
                        if (objCopydefault2 == objCopydefault3) {
                            return objCopydefault3;
                        }
                        str = url;
                        list2 = listCopydefault;
                        str2 = topic;
                        c16033ecL2 = c16033ecL4;
                        c16026ecE3 = c16026ecE6;
                        c16029ecH4 = c16029ecH14;
                        i = i4;
                        i2 = i5;
                        r14 = verifyDAppDomainUrlResponse;
                        if (!mutableStateFlow2.compareAndSet(value3, c16026ecE3.copydefault((1022 & 1) != 0 ? c16026ecE3.KWHzl : C56443yFo.AEQbTJ(0), (1022 & 2) != 0 ? c16026ecE3.gEmmrt : c16033ecL2, (1022 & 4) != 0 ? c16026ecE3.djBIcL : abstractC12782ctV4, (1022 & 8) != 0 ? c16026ecE3.AYXKKw : str2, (1022 & 16) != 0 ? c16026ecE3.AhwBna : list2, (1022 & 32) != 0 ? c16026ecE3.EZpvd : i == 0, (1022 & 64) != 0 ? c16026ecE3.AEQbTJ : str, (1022 & 128) != 0 ? c16026ecE3.valueOf : null, (1022 & 256) != 0 ? c16026ecE3.OLrzqt : i2 == 0, (1022 & 512) != 0 ? c16026ecE3.copydefault : (C15937eaV) objCopydefault2))) {
                            c16029ecH13 = c16029ecH4;
                            i3 = 0;
                            verifyDAppDomainUrlResponse = r14;
                            value3 = mutableStateFlow2.getValue();
                            C16026ecE c16026ecE62 = (C16026ecE) value3;
                            C16033ecL c16033ecL42 = new C16033ecL(dAppConnectRequest2.getDAppInfo().getName(), dAppConnectRequest2.getDAppInfo().getUrl(), dAppConnectRequest2.getDAppInfo().getIcon());
                            String topic2 = dAppConnectRequest2.getTopic();
                            List<C10854bwM> listCopydefault2 = c16029ecH13.AEQbTJ.copydefault(dAppConnectRequest2.getRequestedCaipChains(), dAppConnectRequest2.getHasLegacyTonRequest());
                            if (verifyDAppDomainUrlResponse == 0) {
                            }
                            String url2 = dAppConnectRequest2.getDAppInfo().getUrl();
                            int i52 = !c16029ecH13.OLrzqt(abstractC12782ctV4) ? 1 : 0;
                            C15935eaT c15935eaT22 = c16029ecH13.AEQbTJ;
                            this.L$0 = abstractC12782ctV4;
                            this.L$1 = c16029ecH13;
                            this.L$2 = dAppConnectRequest2;
                            this.L$3 = verifyDAppDomainUrlResponse;
                            this.L$4 = mutableStateFlow2;
                            this.L$5 = value3;
                            this.L$6 = c16026ecE62;
                            this.L$7 = c16033ecL42;
                            this.L$8 = topic2;
                            this.L$9 = listCopydefault2;
                            this.L$10 = url2;
                            this.I$0 = i4;
                            this.I$1 = i52;
                            C16029ecH c16029ecH142 = c16029ecH13;
                            this.label = 5;
                            objCopydefault2 = c15935eaT22.copydefault(dAppConnectRequest2, abstractC12782ctV4, this);
                            if (objCopydefault2 == objCopydefault3) {
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                objAwait2 = obj;
                objM7377constructorimpl2 = Result.m7377constructorimpl((AbstractC12782ctV) objAwait2);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                }
                abstractC12782ctV = (AbstractC12782ctV) objM7377constructorimpl2;
                if (abstractC12782ctV != null) {
                }
                break;
            case 2:
                abstractC12782ctV = (AbstractC12782ctV) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                C16029ecH c16029ecH112 = this.this$0;
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                }
                return Unit.INSTANCE;
            case 3:
                dAppManifest = (DAppManifest) this.L$3;
                c16029ecH3 = (C16029ecH) this.L$2;
                AbstractC12782ctV abstractC12782ctV6 = (AbstractC12782ctV) this.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC12782ctV3 = abstractC12782ctV6;
                objCopydefault = obj;
                verifyDAppDomainResponse = (VerifyDAppDomainResponse) objCopydefault;
                mutableStateFlow = c16029ecH3.copydefault;
                do {
                    value2 = mutableStateFlow.getValue();
                    c16026ecE2 = (C16026ecE) value2;
                    c16033ecL = new C16033ecL(dAppManifest.getName(), dAppManifest.getUrl(), dAppManifest.getIconUrl());
                    C10854bwM c10854bwMGEmmrt22 = c16029ecH3.OLrzqt.gEmmrt();
                    if (c10854bwMGEmmrt22 == null) {
                    }
                    if (listEZpvd == null) {
                    }
                    list = listEZpvd;
                    zEZpvd = Intrinsics.EZpvd((Object) (verifyDAppDomainResponse == null ? verifyDAppDomainResponse.getLevel() : null), (Object) VerifyDAppDomainResponse.LEVEL_RISK);
                    if (verifyDAppDomainResponse == null) {
                    }
                    if (originUrl == null) {
                    }
                } while (!mutableStateFlow.compareAndSet(value2, c16026ecE2.copydefault((1022 & 1) != 0 ? c16026ecE2.KWHzl : C56443yFo.AEQbTJ(0), (1022 & 2) != 0 ? c16026ecE2.gEmmrt : c16033ecL, (1022 & 4) != 0 ? c16026ecE2.djBIcL : abstractC12782ctV3, (1022 & 8) != 0 ? c16026ecE2.AYXKKw : null, (1022 & 16) != 0 ? c16026ecE2.AhwBna : list, (1022 & 32) != 0 ? c16026ecE2.EZpvd : zEZpvd, (1022 & 64) != 0 ? c16026ecE2.AEQbTJ : originUrl, (1022 & 128) != 0 ? c16026ecE2.valueOf : null, (1022 & 256) != 0 ? c16026ecE2.OLrzqt : !c16029ecH3.OLrzqt(abstractC12782ctV3), (1022 & 512) != 0 ? c16026ecE2.copydefault : null)));
                return Unit.INSTANCE;
            case 4:
                dAppConnectRequest = (DAppConnectRequest) this.L$2;
                c16029ecH2 = (C16029ecH) this.L$1;
                abstractC12782ctV2 = (AbstractC12782ctV) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
                obj2 = (VerifyDAppDomainUrlResponse) objOLrzqt;
                C16029ecH c16029ecH122 = c16029ecH2;
                dAppConnectRequestCopydefault = dAppConnectRequest;
                abstractC12782ctV = abstractC12782ctV2;
                c16029ecH = c16029ecH122;
                abstractC12782ctV4 = abstractC12782ctV;
                dAppConnectRequest2 = dAppConnectRequestCopydefault;
                C16029ecH c16029ecH132 = c16029ecH;
                mutableStateFlow2 = c16029ecH.copydefault;
                VerifyDAppDomainUrlResponse verifyDAppDomainUrlResponse2 = obj2;
                value3 = mutableStateFlow2.getValue();
                C16026ecE c16026ecE622 = (C16026ecE) value3;
                C16033ecL c16033ecL422 = new C16033ecL(dAppConnectRequest2.getDAppInfo().getName(), dAppConnectRequest2.getDAppInfo().getUrl(), dAppConnectRequest2.getDAppInfo().getIcon());
                String topic22 = dAppConnectRequest2.getTopic();
                List<C10854bwM> listCopydefault22 = c16029ecH132.AEQbTJ.copydefault(dAppConnectRequest2.getRequestedCaipChains(), dAppConnectRequest2.getHasLegacyTonRequest());
                if (verifyDAppDomainUrlResponse2 == 0) {
                }
                String url22 = dAppConnectRequest2.getDAppInfo().getUrl();
                int i522 = !c16029ecH132.OLrzqt(abstractC12782ctV4) ? 1 : 0;
                C15935eaT c15935eaT222 = c16029ecH132.AEQbTJ;
                this.L$0 = abstractC12782ctV4;
                this.L$1 = c16029ecH132;
                this.L$2 = dAppConnectRequest2;
                this.L$3 = verifyDAppDomainUrlResponse2;
                this.L$4 = mutableStateFlow2;
                this.L$5 = value3;
                this.L$6 = c16026ecE622;
                this.L$7 = c16033ecL422;
                this.L$8 = topic22;
                this.L$9 = listCopydefault22;
                this.L$10 = url22;
                this.I$0 = i4;
                this.I$1 = i522;
                C16029ecH c16029ecH1422 = c16029ecH132;
                this.label = 5;
                objCopydefault2 = c15935eaT222.copydefault(dAppConnectRequest2, abstractC12782ctV4, this);
                if (objCopydefault2 == objCopydefault3) {
                }
                break;
            case 5:
                i2 = this.I$1;
                int i6 = this.I$0;
                String str3 = (String) this.L$10;
                List<C10854bwM> list3 = (List) this.L$9;
                String str4 = (String) this.L$8;
                C16033ecL c16033ecL5 = (C16033ecL) this.L$7;
                C16026ecE c16026ecE7 = (C16026ecE) this.L$6;
                value3 = this.L$5;
                mutableStateFlow2 = (MutableStateFlow) this.L$4;
                VerifyDAppDomainUrlResponse verifyDAppDomainUrlResponse3 = (VerifyDAppDomainUrlResponse) this.L$3;
                dAppConnectRequest2 = (DAppConnectRequest) this.L$2;
                C16029ecH c16029ecH15 = (C16029ecH) this.L$1;
                abstractC12782ctV4 = (AbstractC12782ctV) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str = str3;
                list2 = list3;
                str2 = str4;
                c16033ecL2 = c16033ecL5;
                c16026ecE3 = c16026ecE7;
                c16029ecH4 = c16029ecH15;
                i = i6;
                objCopydefault2 = obj;
                r14 = verifyDAppDomainUrlResponse3;
                if (!mutableStateFlow2.compareAndSet(value3, c16026ecE3.copydefault((1022 & 1) != 0 ? c16026ecE3.KWHzl : C56443yFo.AEQbTJ(0), (1022 & 2) != 0 ? c16026ecE3.gEmmrt : c16033ecL2, (1022 & 4) != 0 ? c16026ecE3.djBIcL : abstractC12782ctV4, (1022 & 8) != 0 ? c16026ecE3.AYXKKw : str2, (1022 & 16) != 0 ? c16026ecE3.AhwBna : list2, (1022 & 32) != 0 ? c16026ecE3.EZpvd : i == 0, (1022 & 64) != 0 ? c16026ecE3.AEQbTJ : str, (1022 & 128) != 0 ? c16026ecE3.valueOf : null, (1022 & 256) != 0 ? c16026ecE3.OLrzqt : i2 == 0, (1022 & 512) != 0 ? c16026ecE3.copydefault : (C15937eaV) objCopydefault2))) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                objAwait = obj;
                objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) objAwait);
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                abstractC12782ctV5 = (AbstractC12782ctV) objM7377constructorimpl;
                if (abstractC12782ctV5 != null) {
                }
                break;
            case 7:
                abstractC12782ctV5 = (AbstractC12782ctV) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = obj;
                C16029ecH c16029ecH82 = this.this$0;
                it = ((Iterable) objEZpvd).iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                dAppSession = (DAppSession) obj2;
                if (dAppSession != null) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
