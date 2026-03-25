package com.okinc.business.defi.biz.impl;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.wallet.api.bean.WalletInfo;
import com.okinc.wallet.api.bean.WalletStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C10337bmZ;
import o.C10954byG;
import o.C12827cuN;
import o.C54835xXb;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC9739bbK;
import o.cUH;
import o.cUT;
import o.pUU;
import o.xWZ;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class BindWalletServiceImpl$queryWalletList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends C54835xXb>>>, Object> {
    final /* synthetic */ List<xWZ> $config;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ cUH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BindWalletServiceImpl$queryWalletList$2(List<xWZ> list, cUH cuh, Continuation<? super BindWalletServiceImpl$queryWalletList$2> continuation) {
        super(2, continuation);
        this.$config = list;
        this.this$0 = cuh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BindWalletServiceImpl$queryWalletList$2(this.$config, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends C54835xXb>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<C54835xXb>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<C54835xXb>>> continuation) {
        return ((BindWalletServiceImpl$queryWalletList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:104:0x022c */
    /* JADX DEBUG: Multi-variable search result rejected for r9v10, resolved type: com.okinc.wallet.api.bean.WalletInfo */
    /* JADX DEBUG: Multi-variable search result rejected for r9v7, resolved type: com.okinc.wallet.api.bean.WalletInfo */
    /* JADX DEBUG: Multi-variable search result rejected for r9v8, resolved type: com.okinc.wallet.api.bean.WalletInfo */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092 A[Catch: all -> 0x0241, CancellationException -> 0x025c, TryCatch #2 {CancellationException -> 0x025c, all -> 0x0241, blocks: (B:7:0x001c, B:25:0x007e, B:26:0x008c, B:28:0x0092, B:30:0x009f, B:31:0x00a3, B:32:0x00ac, B:34:0x00b2, B:36:0x00c3, B:37:0x00cb, B:38:0x00d1, B:39:0x00e6, B:41:0x00ec, B:43:0x0112, B:45:0x011e, B:47:0x014a, B:69:0x01e8, B:71:0x01f6, B:73:0x020a, B:78:0x0217, B:80:0x022c, B:49:0x0158, B:51:0x0166, B:55:0x0179, B:56:0x0191, B:58:0x0197, B:60:0x01ae, B:64:0x01c6, B:66:0x01ca, B:68:0x01d8, B:82:0x023c, B:12:0x0032, B:18:0x0057, B:20:0x005d, B:21:0x0063, B:15:0x0042), top: B:93:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[Catch: all -> 0x0241, CancellationException -> 0x025c, TryCatch #2 {CancellationException -> 0x025c, all -> 0x0241, blocks: (B:7:0x001c, B:25:0x007e, B:26:0x008c, B:28:0x0092, B:30:0x009f, B:31:0x00a3, B:32:0x00ac, B:34:0x00b2, B:36:0x00c3, B:37:0x00cb, B:38:0x00d1, B:39:0x00e6, B:41:0x00ec, B:43:0x0112, B:45:0x011e, B:47:0x014a, B:69:0x01e8, B:71:0x01f6, B:73:0x020a, B:78:0x0217, B:80:0x022c, B:49:0x0158, B:51:0x0166, B:55:0x0179, B:56:0x0191, B:58:0x0197, B:60:0x01ae, B:64:0x01c6, B:66:0x01ca, B:68:0x01d8, B:82:0x023c, B:12:0x0032, B:18:0x0057, B:20:0x005d, B:21:0x0063, B:15:0x0042), top: B:93:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec A[Catch: all -> 0x0241, CancellationException -> 0x025c, TryCatch #2 {CancellationException -> 0x025c, all -> 0x0241, blocks: (B:7:0x001c, B:25:0x007e, B:26:0x008c, B:28:0x0092, B:30:0x009f, B:31:0x00a3, B:32:0x00ac, B:34:0x00b2, B:36:0x00c3, B:37:0x00cb, B:38:0x00d1, B:39:0x00e6, B:41:0x00ec, B:43:0x0112, B:45:0x011e, B:47:0x014a, B:69:0x01e8, B:71:0x01f6, B:73:0x020a, B:78:0x0217, B:80:0x022c, B:49:0x0158, B:51:0x0166, B:55:0x0179, B:56:0x0191, B:58:0x0197, B:60:0x01ae, B:64:0x01c6, B:66:0x01ca, B:68:0x01d8, B:82:0x023c, B:12:0x0032, B:18:0x0057, B:20:0x005d, B:21:0x0063, B:15:0x0042), top: B:93:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f6 A[Catch: all -> 0x0241, CancellationException -> 0x025c, TryCatch #2 {CancellationException -> 0x025c, all -> 0x0241, blocks: (B:7:0x001c, B:25:0x007e, B:26:0x008c, B:28:0x0092, B:30:0x009f, B:31:0x00a3, B:32:0x00ac, B:34:0x00b2, B:36:0x00c3, B:37:0x00cb, B:38:0x00d1, B:39:0x00e6, B:41:0x00ec, B:43:0x0112, B:45:0x011e, B:47:0x014a, B:69:0x01e8, B:71:0x01f6, B:73:0x020a, B:78:0x0217, B:80:0x022c, B:49:0x0158, B:51:0x0166, B:55:0x0179, B:56:0x0191, B:58:0x0197, B:60:0x01ae, B:64:0x01c6, B:66:0x01ca, B:68:0x01d8, B:82:0x023c, B:12:0x0032, B:18:0x0057, B:20:0x005d, B:21:0x0063, B:15:0x0042), top: B:93:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0252  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        List<xWZ> list;
        cUH cuh;
        Object objAwait;
        List<xWZ> list2;
        List listAhwBna;
        LinkedHashMap linkedHashMap;
        Object obj2;
        Object next;
        String str;
        Pair pairOLrzqt;
        AbstractC12782ctV abstractC12782ctV;
        WalletInfo walletInfo;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            list = this.$config;
            cuh = this.this$0;
            Result.Application application2 = Result.Companion;
            AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null);
            this.L$0 = list;
            this.L$1 = cuh;
            this.label = 1;
            if (AwaitKt.awaitFirst(abstractC58185ywXEnsureInitialized$default, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwait = obj;
                Intrinsics.checkNotNullExpressionValue(objAwait, "");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (Iterable) objAwait) {
                    if (((AbstractC12782ctV) obj3).fZBcTu()) {
                        arrayList.add(obj3);
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj4 : arrayList) {
                    String strDbNXlk = ((AbstractC12782ctV) obj4).DbNXlk();
                    Object arrayList2 = linkedHashMap2.get(strDbNXlk);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap2.put(strDbNXlk, arrayList2);
                    }
                    ((List) arrayList2).add(obj4);
                }
                HashMap map = new HashMap();
                ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                String str2 = null;
                for (xWZ xwz : list2) {
                    pUU.EZpvd("BindWalletServiceImpl", "queryWalletList queryConfig: " + xwz);
                    List list3 = (List) linkedHashMap2.get(xwz.EZpvd());
                    if (list3 != null) {
                        obj2 = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(list3);
                        linkedHashMap = linkedHashMap2;
                    } else {
                        linkedHashMap = linkedHashMap2;
                        obj2 = str2;
                    }
                    String str3 = xwz.copydefault() + "_" + xwz.KWHzl() + "_" + xwz.AEQbTJ();
                    AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) map.get(str3);
                    if (obj2 != null) {
                        pUU.EZpvd("BindWalletServiceImpl", "queryWalletList same accountId");
                        pairOLrzqt = C56390yDp.OLrzqt(WalletStatus.StatusExist, obj2);
                    } else if (abstractC12782ctV2 != null) {
                        pUU.EZpvd("BindWalletServiceImpl", "queryWalletList same address short way");
                        pairOLrzqt = C56390yDp.OLrzqt(WalletStatus.StatusAccountIdMissMatch, abstractC12782ctV2);
                    } else {
                        pUU.EZpvd("BindWalletServiceImpl", "queryWalletList chainExist: " + (C10954byG.EZpvd.valueOf().copydefault(xwz.copydefault()) != null));
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) next;
                            if (cUT.OLrzqt(WalletType.Companion.OLrzqt(abstractC12782ctV3), xwz.OLrzqt()) && Intrinsics.EZpvd((Object) abstractC12782ctV3.copydefault(xwz.copydefault(), xwz.KWHzl()), (Object) xwz.AEQbTJ())) {
                                break;
                            }
                        }
                        AbstractC12782ctV abstractC12782ctV4 = (AbstractC12782ctV) next;
                        if (abstractC12782ctV4 == null) {
                            pUU.EZpvd("BindWalletServiceImpl", "queryWalletList not exist");
                            str = null;
                            pairOLrzqt = C56390yDp.OLrzqt(WalletStatus.StatusNotExist, null);
                        } else {
                            str = null;
                            map.put(str3, abstractC12782ctV4);
                            pUU.EZpvd("BindWalletServiceImpl", "queryWalletList same address");
                            pairOLrzqt = C56390yDp.OLrzqt(WalletStatus.StatusAccountIdMissMatch, abstractC12782ctV4);
                        }
                        str2 = str;
                        WalletStatus walletStatus = (WalletStatus) pairOLrzqt.component1();
                        abstractC12782ctV = (AbstractC12782ctV) pairOLrzqt.component2();
                        if (abstractC12782ctV == null) {
                            String strDbNXlk2 = abstractC12782ctV.DbNXlk();
                            String strAYXKKw = abstractC12782ctV.AYXKKw();
                            String strAkhnZx = abstractC12782ctV.AkhnZx();
                            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
                            String strAuCTel = abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.AuCTel() : str2;
                            walletInfo = new WalletInfo(strDbNXlk2, strAYXKKw, strAkhnZx, strAuCTel == null ? "" : strAuCTel, WalletType.Companion.OLrzqt(abstractC12782ctV), "", abstractC12782ctV.AEQbTJ(), abstractC12782ctV);
                        } else {
                            walletInfo = str2;
                        }
                        arrayList3.add(new C54835xXb(walletStatus, xwz, walletInfo));
                        linkedHashMap2 = linkedHashMap;
                    }
                    str = null;
                    WalletStatus walletStatus2 = (WalletStatus) pairOLrzqt.component1();
                    abstractC12782ctV = (AbstractC12782ctV) pairOLrzqt.component2();
                    if (abstractC12782ctV == null) {
                    }
                    arrayList3.add(new C54835xXb(walletStatus2, xwz, walletInfo));
                    linkedHashMap2 = linkedHashMap;
                }
                listAhwBna = arrayList3;
                objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("BindWalletServiceImpl", "queryWalletList onFailure", thM7380exceptionOrNullimpl);
                }
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            cUH cuh2 = (cUH) this.L$1;
            List<xWZ> list4 = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            cuh = cuh2;
            list = list4;
        }
        if (!list.isEmpty()) {
            AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(cuh.AYXKKw, false, false, false, 3, null);
            this.L$0 = list;
            this.L$1 = null;
            this.label = 2;
            objAwait = RxAwaitKt.await(abstractC58260yxtFetchAllWallets$default, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            list2 = list;
            Intrinsics.checkNotNullExpressionValue(objAwait, "");
            ArrayList arrayList4 = new ArrayList();
            while (r6.hasNext()) {
            }
            LinkedHashMap linkedHashMap22 = new LinkedHashMap();
            while (r10.hasNext()) {
            }
            HashMap map2 = new HashMap();
            ArrayList arrayList32 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
            String str22 = null;
            while (r3.hasNext()) {
            }
            listAhwBna = arrayList32;
            objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        listAhwBna = yDY.AhwBna();
        objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
