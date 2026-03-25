package com.okinc.business.defi.wallet.mpc.viewModel;

import com.okinc.business.defi.biz.model.wallet.EsCapeData;
import com.okinc.business.defi.wallet.mpc.viewModel.EscapeMpcWalletAccountListViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapeMpcWalletAccountListViewModel$handleShowDataList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HashMap<Integer, String> $indexNameMap;
    final /* synthetic */ int $serverIndex;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ EscapeMpcWalletAccountListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapeMpcWalletAccountListViewModel$handleShowDataList$1(EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModel, int i, HashMap<Integer, String> map, Continuation<? super EscapeMpcWalletAccountListViewModel$handleShowDataList$1> continuation) {
        super(2, continuation);
        this.this$0 = escapeMpcWalletAccountListViewModel;
        this.$serverIndex = i;
        this.$indexNameMap = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapeMpcWalletAccountListViewModel$handleShowDataList$1(this.this$0, this.$serverIndex, this.$indexNameMap, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapeMpcWalletAccountListViewModel$handleShowDataList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010d A[Catch: all -> 0x016f, CancellationException -> 0x01b8, TryCatch #2 {CancellationException -> 0x01b8, all -> 0x016f, blocks: (B:12:0x002f, B:63:0x0168, B:15:0x003c, B:60:0x0154, B:18:0x004d, B:45:0x00fe, B:46:0x0107, B:48:0x010d, B:50:0x0115, B:52:0x011f, B:54:0x0132, B:55:0x013a, B:56:0x013e, B:21:0x005f, B:27:0x008b, B:28:0x009d, B:30:0x00a3, B:32:0x00b1, B:33:0x00b5, B:37:0x00c2, B:38:0x00c6, B:40:0x00cc, B:41:0x00e2, B:36:0x00bd, B:24:0x006e), top: B:78:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0167 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0182  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModel;
        Throwable th;
        EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModel2;
        int size;
        HashMap<Integer, String> map;
        Object objAwait;
        AbstractC12784ctX abstractC12784ctX;
        Object objAwait2;
        HashMap<Integer, String> map2;
        EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModel3;
        List<EsCapeData> list;
        Channel channel;
        EscapeMpcWalletAccountListViewModel.RequestStatus requestStatus;
        EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModel4;
        Channel channel2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            escapeMpcWalletAccountListViewModel2 = this.this$0;
            size = this.$serverIndex;
            map = this.$indexNameMap;
            Result.Application application2 = Result.Companion;
            AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtDjBIcL = escapeMpcWalletAccountListViewModel2.isConnected.djBIcL(escapeMpcWalletAccountListViewModel2.AYXKKw);
            this.L$0 = escapeMpcWalletAccountListViewModel2;
            this.L$1 = map;
            this.I$0 = size;
            this.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtDjBIcL, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    AbstractC12784ctX abstractC12784ctX2 = (AbstractC12784ctX) this.L$2;
                    map2 = (HashMap) this.L$1;
                    escapeMpcWalletAccountListViewModel3 = (EscapeMpcWalletAccountListViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    abstractC12784ctX = abstractC12784ctX2;
                    objAwait2 = obj;
                    list = (List) objAwait2;
                    Intrinsics.copydefault(list);
                    for (EsCapeData esCapeData : list) {
                        esCapeData.setCopied(abstractC12784ctX != null ? abstractC12784ctX.copydefault(esCapeData.getAddressIndex()) : false);
                        String strOLrzqt = map2.get(C56443yFo.AEQbTJ(esCapeData.getAddressIndex()));
                        if (strOLrzqt == null) {
                            strOLrzqt = escapeMpcWalletAccountListViewModel3.OLrzqt(esCapeData.getAddressIndex());
                        }
                        esCapeData.setAccountName(strOLrzqt);
                    }
                    channel = escapeMpcWalletAccountListViewModel3.gEmmrt;
                    requestStatus = EscapeMpcWalletAccountListViewModel.RequestStatus.SUCCESS;
                    this.L$0 = escapeMpcWalletAccountListViewModel3;
                    this.L$1 = list;
                    this.L$2 = null;
                    this.label = 3;
                    if (channel.send(requestStatus, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    escapeMpcWalletAccountListViewModel4 = escapeMpcWalletAccountListViewModel3;
                    channel2 = escapeMpcWalletAccountListViewModel4.EZpvd;
                    Intrinsics.copydefault(list);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    if (channel2.send(list, this) == objCopydefault) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModel5 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i == 3) {
                    list = (List) this.L$1;
                    escapeMpcWalletAccountListViewModel4 = (EscapeMpcWalletAccountListViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    channel2 = escapeMpcWalletAccountListViewModel4.EZpvd;
                    Intrinsics.copydefault(list);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    if (channel2.send(list, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModel52 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.L$2;
                    escapeMpcWalletAccountListViewModel = (EscapeMpcWalletAccountListViewModel) this.L$1;
                    C56391yDq.AEQbTJ(obj);
                    pUU.copydefault(escapeMpcWalletAccountListViewModel.valueOf, "handleShowDataList error message =" + th.getMessage());
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModel522 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    Channel channel3 = escapeMpcWalletAccountListViewModel522.gEmmrt;
                    EscapeMpcWalletAccountListViewModel.RequestStatus requestStatus2 = EscapeMpcWalletAccountListViewModel.RequestStatus.FAILED;
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = escapeMpcWalletAccountListViewModel522;
                    this.L$2 = thM7380exceptionOrNullimpl;
                    this.label = 5;
                    if (channel3.send(requestStatus2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    escapeMpcWalletAccountListViewModel = escapeMpcWalletAccountListViewModel522;
                    th = thM7380exceptionOrNullimpl;
                    pUU.copydefault(escapeMpcWalletAccountListViewModel.valueOf, "handleShowDataList error message =" + th.getMessage());
                }
                return Unit.INSTANCE;
            }
            size = this.I$0;
            map = (HashMap) this.L$1;
            escapeMpcWalletAccountListViewModel2 = (EscapeMpcWalletAccountListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAwait = obj;
        }
        abstractC12784ctX = (AbstractC12784ctX) objAwait;
        escapeMpcWalletAccountListViewModel2.OLrzqt(abstractC12784ctX);
        List<AbstractC12782ctV> listKWHzl = abstractC12784ctX.KWHzl();
        ArrayList<AbstractC12782ctV> arrayList = new ArrayList();
        for (Object obj2 : listKWHzl) {
            if (!((AbstractC12782ctV) obj2).wlaJM()) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() - 1 >= size) {
            size = arrayList.size() - 1;
        }
        for (AbstractC12782ctV abstractC12782ctV : arrayList) {
            map.put(C56443yFo.AEQbTJ(abstractC12782ctV.finit()), abstractC12782ctV.AkhnZx());
        }
        C12827cuN c12827cuN = escapeMpcWalletAccountListViewModel2.isConnected;
        Intrinsics.copydefault(abstractC12784ctX);
        AbstractC58260yxt<List<EsCapeData>> abstractC58260yxtEZpvd = c12827cuN.EZpvd(abstractC12784ctX, size);
        this.L$0 = escapeMpcWalletAccountListViewModel2;
        this.L$1 = map;
        this.L$2 = abstractC12784ctX;
        this.label = 2;
        objAwait2 = RxAwaitKt.await(abstractC58260yxtEZpvd, this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        map2 = map;
        escapeMpcWalletAccountListViewModel3 = escapeMpcWalletAccountListViewModel2;
        list = (List) objAwait2;
        Intrinsics.copydefault(list);
        while (r9.hasNext()) {
        }
        channel = escapeMpcWalletAccountListViewModel3.gEmmrt;
        requestStatus = EscapeMpcWalletAccountListViewModel.RequestStatus.SUCCESS;
        this.L$0 = escapeMpcWalletAccountListViewModel3;
        this.L$1 = list;
        this.L$2 = null;
        this.label = 3;
        if (channel.send(requestStatus, this) != objCopydefault) {
        }
    }
}
