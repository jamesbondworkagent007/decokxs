package com.okinc.business.defi.wallet.mine.walletbind.viewmodel;

import com.okinc.account.api.model.wallet.BoundWalletAccount;
import com.okinc.account.api.model.wallet.BoundWalletAccountsResult;
import com.okinc.business.defi.wallet.mine.data.BoundWallet;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.WalletBindApiService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C17304fAj;
import o.C18877fqh;
import o.C34703nhO;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC8107awW;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBindViewModel$getBoundWallets$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends C18877fqh>>>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WalletBindViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBindViewModel$getBoundWallets$2(WalletBindViewModel walletBindViewModel, Continuation<? super WalletBindViewModel$getBoundWallets$2> continuation) {
        super(2, continuation);
        this.this$0 = walletBindViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletBindViewModel$getBoundWallets$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends C18877fqh>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<C18877fqh>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<C18877fqh>>> continuation) {
        return ((WalletBindViewModel$getBoundWallets$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x022b A[Catch: all -> 0x0235, CancellationException -> 0x0245, TryCatch #5 {CancellationException -> 0x0245, all -> 0x0235, blocks: (B:8:0x001c, B:73:0x0149, B:75:0x0150, B:77:0x0156, B:79:0x0161, B:84:0x0172, B:86:0x0178, B:87:0x0181, B:89:0x0187, B:91:0x0198, B:92:0x01a0, B:93:0x01a6, B:94:0x01b2, B:96:0x01b8, B:97:0x01cb, B:99:0x01d1, B:101:0x01dd, B:103:0x01e9, B:106:0x01f2, B:107:0x0216, B:109:0x021c, B:112:0x022f, B:111:0x022b, B:13:0x0039, B:65:0x0131, B:33:0x0081, B:37:0x008c, B:39:0x0094, B:40:0x009a, B:41:0x00ac, B:43:0x00b2, B:44:0x00c0, B:45:0x00cd, B:47:0x00d3, B:49:0x00e0, B:50:0x00e4, B:51:0x00f1, B:53:0x00f7, B:54:0x0105, B:56:0x010b, B:57:0x0111, B:59:0x0117, B:61:0x011d, B:67:0x0135, B:69:0x013b, B:80:0x0166, B:82:0x016c, B:36:0x0088, B:32:0x0076, B:113:0x0234, B:23:0x0055, B:16:0x0045, B:28:0x006c, B:24:0x0057), top: B:122:0x000c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0156 A[Catch: all -> 0x0235, CancellationException -> 0x0245, TryCatch #5 {CancellationException -> 0x0245, all -> 0x0235, blocks: (B:8:0x001c, B:73:0x0149, B:75:0x0150, B:77:0x0156, B:79:0x0161, B:84:0x0172, B:86:0x0178, B:87:0x0181, B:89:0x0187, B:91:0x0198, B:92:0x01a0, B:93:0x01a6, B:94:0x01b2, B:96:0x01b8, B:97:0x01cb, B:99:0x01d1, B:101:0x01dd, B:103:0x01e9, B:106:0x01f2, B:107:0x0216, B:109:0x021c, B:112:0x022f, B:111:0x022b, B:13:0x0039, B:65:0x0131, B:33:0x0081, B:37:0x008c, B:39:0x0094, B:40:0x009a, B:41:0x00ac, B:43:0x00b2, B:44:0x00c0, B:45:0x00cd, B:47:0x00d3, B:49:0x00e0, B:50:0x00e4, B:51:0x00f1, B:53:0x00f7, B:54:0x0105, B:56:0x010b, B:57:0x0111, B:59:0x0117, B:61:0x011d, B:67:0x0135, B:69:0x013b, B:80:0x0166, B:82:0x016c, B:36:0x0088, B:32:0x0076, B:113:0x0234, B:23:0x0055, B:16:0x0045, B:28:0x006c, B:24:0x0057), top: B:122:0x000c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0161 A[Catch: all -> 0x0235, CancellationException -> 0x0245, TryCatch #5 {CancellationException -> 0x0245, all -> 0x0235, blocks: (B:8:0x001c, B:73:0x0149, B:75:0x0150, B:77:0x0156, B:79:0x0161, B:84:0x0172, B:86:0x0178, B:87:0x0181, B:89:0x0187, B:91:0x0198, B:92:0x01a0, B:93:0x01a6, B:94:0x01b2, B:96:0x01b8, B:97:0x01cb, B:99:0x01d1, B:101:0x01dd, B:103:0x01e9, B:106:0x01f2, B:107:0x0216, B:109:0x021c, B:112:0x022f, B:111:0x022b, B:13:0x0039, B:65:0x0131, B:33:0x0081, B:37:0x008c, B:39:0x0094, B:40:0x009a, B:41:0x00ac, B:43:0x00b2, B:44:0x00c0, B:45:0x00cd, B:47:0x00d3, B:49:0x00e0, B:50:0x00e4, B:51:0x00f1, B:53:0x00f7, B:54:0x0105, B:56:0x010b, B:57:0x0111, B:59:0x0117, B:61:0x011d, B:67:0x0135, B:69:0x013b, B:80:0x0166, B:82:0x016c, B:36:0x0088, B:32:0x0076, B:113:0x0234, B:23:0x0055, B:16:0x0045, B:28:0x006c, B:24:0x0057), top: B:122:0x000c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0172 A[Catch: all -> 0x0235, CancellationException -> 0x0245, TryCatch #5 {CancellationException -> 0x0245, all -> 0x0235, blocks: (B:8:0x001c, B:73:0x0149, B:75:0x0150, B:77:0x0156, B:79:0x0161, B:84:0x0172, B:86:0x0178, B:87:0x0181, B:89:0x0187, B:91:0x0198, B:92:0x01a0, B:93:0x01a6, B:94:0x01b2, B:96:0x01b8, B:97:0x01cb, B:99:0x01d1, B:101:0x01dd, B:103:0x01e9, B:106:0x01f2, B:107:0x0216, B:109:0x021c, B:112:0x022f, B:111:0x022b, B:13:0x0039, B:65:0x0131, B:33:0x0081, B:37:0x008c, B:39:0x0094, B:40:0x009a, B:41:0x00ac, B:43:0x00b2, B:44:0x00c0, B:45:0x00cd, B:47:0x00d3, B:49:0x00e0, B:50:0x00e4, B:51:0x00f1, B:53:0x00f7, B:54:0x0105, B:56:0x010b, B:57:0x0111, B:59:0x0117, B:61:0x011d, B:67:0x0135, B:69:0x013b, B:80:0x0166, B:82:0x016c, B:36:0x0088, B:32:0x0076, B:113:0x0234, B:23:0x0055, B:16:0x0045, B:28:0x006c, B:24:0x0057), top: B:122:0x000c, inners: #2 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        WalletBindViewModel walletBindViewModel;
        Object objAwait;
        WalletBindViewModel walletBindViewModel2;
        Object objM7377constructorimpl2;
        List<AbstractC12784ctX> list;
        BoundWalletAccountsResult boundWalletAccountsResult;
        Object objOLrzqt;
        WalletBindViewModel walletBindViewModel3;
        Object objCopydefault;
        List listAhwBna;
        List list2;
        BoundWalletAccount boundWalletAccount;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        List<BoundWalletAccount> listOLrzqt = null;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                walletBindViewModel = this.this$0;
                Result.Application application2 = Result.Companion;
                try {
                    AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(walletBindViewModel.QfsBiF, true, false, 2, null);
                    this.L$0 = walletBindViewModel;
                    this.label = 1;
                    objAwait = RxAwaitKt.await(allRootWallets$default, this);
                    if (objAwait == objCopydefault2) {
                        return objCopydefault2;
                    }
                    walletBindViewModel2 = walletBindViewModel;
                } catch (Throwable th2) {
                    th = th2;
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    walletBindViewModel2 = walletBindViewModel;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        list = (List) this.L$1;
                        walletBindViewModel3 = (WalletBindViewModel) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        objCopydefault = obj;
                        boundWalletAccountsResult = (BoundWalletAccountsResult) objCopydefault;
                        walletBindViewModel2 = walletBindViewModel3;
                        if (walletBindViewModel2.fARcdN()) {
                        }
                        if (boundWalletAccountsResult != null) {
                        }
                        if (listOLrzqt != null) {
                            listAhwBna = yDY.AhwBna();
                            objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
                        }
                        return Result.m7376boximpl(objM7377constructorimpl);
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.L$1;
                    walletBindViewModel3 = (WalletBindViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objOLrzqt = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objOLrzqt);
                    boundWalletAccountsResult = (BoundWalletAccountsResult) objOLrzqt;
                    walletBindViewModel2 = walletBindViewModel3;
                    if (walletBindViewModel2.fARcdN()) {
                        walletBindViewModel2.QKVWgx.set("BOUND_WALLET_RESULT", boundWalletAccountsResult);
                    }
                    if (boundWalletAccountsResult != null) {
                        listOLrzqt = boundWalletAccountsResult.getWalletAccounts();
                    }
                    if (listOLrzqt != null || listOLrzqt.isEmpty()) {
                        listAhwBna = yDY.AhwBna();
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : listOLrzqt) {
                            String accountId = ((BoundWalletAccount) obj2).getAccountId();
                            Object arrayList = linkedHashMap.get(accountId);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(accountId, arrayList);
                            }
                            ((List) arrayList).add(obj2);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Intrinsics.copydefault(list);
                        for (AbstractC12784ctX abstractC12784ctX : list) {
                            ArrayList arrayList3 = new ArrayList();
                            for (AbstractC12782ctV abstractC12782ctV : abstractC12784ctX.KWHzl()) {
                                if (abstractC12782ctV.fZBcTu() && (list2 = (List) linkedHashMap.get(abstractC12782ctV.DbNXlk())) != null && (boundWalletAccount = (BoundWalletAccount) CollectionsKt___CollectionsKt.firstOrNull(list2)) != null) {
                                    arrayList3.add(new BoundWallet(abstractC12782ctV.DbNXlk(), abstractC12782ctV.AkhnZx(), abstractC12782ctV.zuWLRA(), abstractC12782ctV.AYXKKw(), abstractC12782ctV.AEQbTJ(), boundWalletAccount.getUserName()));
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                arrayList2.add(new C18877fqh(abstractC12784ctX.AuCTel(), arrayList3));
                            }
                        }
                        listAhwBna = arrayList2;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                walletBindViewModel2 = (WalletBindViewModel) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    objAwait = obj;
                } catch (Throwable th3) {
                    th = th3;
                    walletBindViewModel = walletBindViewModel2;
                    Result.Application application32 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    walletBindViewModel2 = walletBindViewModel;
                }
            }
            objM7377constructorimpl2 = Result.m7377constructorimpl((List) objAwait);
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl2) != null) {
                objM7377constructorimpl2 = yDY.AhwBna();
            }
            list = (List) objM7377constructorimpl2;
            if (list.isEmpty()) {
                listAhwBna = yDY.AhwBna();
            } else {
                Intrinsics.copydefault(list);
                ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((AbstractC12784ctX) it.next()).KWHzl());
                }
                List listQOLQEE = C56403yEb.QOLQEE(arrayList4);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : listQOLQEE) {
                    if (((AbstractC12782ctV) obj3).fZBcTu()) {
                        arrayList5.add(obj3);
                    }
                }
                ArrayList arrayList6 = new ArrayList(C56403yEb.AYXKKw(arrayList5, 10));
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    arrayList6.add(((AbstractC12782ctV) it2.next()).DbNXlk());
                }
                if (!arrayList6.isEmpty()) {
                    if (!walletBindViewModel2.AYXKKw()) {
                        listOLrzqt = walletBindViewModel2.OLrzqt();
                        if (listOLrzqt == null) {
                            listOLrzqt = yDY.AhwBna();
                        }
                        if (listOLrzqt != null) {
                        }
                        return Result.m7376boximpl(objM7377constructorimpl);
                    }
                    if (!C34703nhO.copydefault()) {
                        InterfaceC8107awW interfaceC8107awW = walletBindViewModel2.fJNWhG;
                        if (interfaceC8107awW == null) {
                            boundWalletAccountsResult = null;
                            if (walletBindViewModel2.fARcdN()) {
                            }
                            if (boundWalletAccountsResult != null) {
                            }
                            if (listOLrzqt != null) {
                            }
                            return Result.m7376boximpl(objM7377constructorimpl);
                        }
                        this.L$0 = walletBindViewModel2;
                        this.L$1 = list;
                        this.label = 3;
                        objOLrzqt = interfaceC8107awW.OLrzqt(arrayList6, this);
                        if (objOLrzqt == objCopydefault2) {
                            return objCopydefault2;
                        }
                        walletBindViewModel3 = walletBindViewModel2;
                        C56391yDq.AEQbTJ(objOLrzqt);
                        boundWalletAccountsResult = (BoundWalletAccountsResult) objOLrzqt;
                        walletBindViewModel2 = walletBindViewModel3;
                        if (walletBindViewModel2.fARcdN()) {
                        }
                        if (boundWalletAccountsResult != null) {
                        }
                        if (listOLrzqt != null) {
                        }
                        return Result.m7376boximpl(objM7377constructorimpl);
                    }
                    C17304fAj c17304fAj = C17304fAj.EZpvd;
                    WalletBindApiService walletBindApiService = walletBindViewModel2.QUSxYX;
                    this.L$0 = walletBindViewModel2;
                    this.L$1 = list;
                    this.label = 2;
                    objCopydefault = c17304fAj.copydefault(arrayList6, walletBindApiService, this);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    walletBindViewModel3 = walletBindViewModel2;
                    boundWalletAccountsResult = (BoundWalletAccountsResult) objCopydefault;
                    walletBindViewModel2 = walletBindViewModel3;
                    if (walletBindViewModel2.fARcdN()) {
                    }
                    if (boundWalletAccountsResult != null) {
                    }
                    if (listOLrzqt != null) {
                    }
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                listAhwBna = yDY.AhwBna();
            }
            objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
            return Result.m7376boximpl(objM7377constructorimpl);
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
