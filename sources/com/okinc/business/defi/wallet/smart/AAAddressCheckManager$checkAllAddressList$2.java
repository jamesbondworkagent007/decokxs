package com.okinc.business.defi.wallet.smart;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.CheckAaAddressRequest;
import com.okinc.business.defi.biz.net.bean.CheckAaAddressResponse;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC43419rot;
import o.AbstractC58260yxt;
import o.C10854bwM;
import o.C12827cuN;
import o.C13934dbu;
import o.C17671fNz;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class AAAddressCheckManager$checkAllAddressList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C17671fNz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AAAddressCheckManager$checkAllAddressList$2(C17671fNz c17671fNz, Continuation<? super AAAddressCheckManager$checkAllAddressList$2> continuation) {
        super(2, continuation);
        this.this$0 = c17671fNz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AAAddressCheckManager$checkAllAddressList$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Boolean>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Boolean>> continuation) {
        return ((AAAddressCheckManager$checkAllAddressList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ae A[Catch: all -> 0x022e, CancellationException -> 0x025c, TryCatch #2 {CancellationException -> 0x025c, all -> 0x022e, blocks: (B:7:0x0017, B:96:0x01f4, B:100:0x021f, B:12:0x002e, B:85:0x01a8, B:87:0x01ae, B:88:0x01bd, B:90:0x01c3, B:92:0x01d7, B:93:0x01e3, B:97:0x01fb, B:99:0x01ff, B:101:0x0228, B:102:0x022d, B:15:0x003b, B:26:0x0073, B:27:0x0081, B:29:0x0087, B:31:0x0095, B:33:0x009b, B:34:0x00a3, B:36:0x00a9, B:38:0x00b5, B:40:0x00ca, B:43:0x00d2, B:46:0x00d9, B:48:0x00e3, B:52:0x00f3, B:54:0x00fe, B:56:0x0106, B:57:0x010e, B:59:0x0114, B:61:0x0120, B:63:0x012d, B:66:0x0135, B:69:0x013c, B:71:0x0146, B:73:0x0150, B:74:0x0162, B:76:0x0168, B:77:0x017b, B:79:0x0181, B:81:0x0195, B:19:0x0047, B:21:0x0057, B:23:0x005e), top: B:112:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fb A[Catch: all -> 0x022e, CancellationException -> 0x025c, TryCatch #2 {CancellationException -> 0x025c, all -> 0x022e, blocks: (B:7:0x0017, B:96:0x01f4, B:100:0x021f, B:12:0x002e, B:85:0x01a8, B:87:0x01ae, B:88:0x01bd, B:90:0x01c3, B:92:0x01d7, B:93:0x01e3, B:97:0x01fb, B:99:0x01ff, B:101:0x0228, B:102:0x022d, B:15:0x003b, B:26:0x0073, B:27:0x0081, B:29:0x0087, B:31:0x0095, B:33:0x009b, B:34:0x00a3, B:36:0x00a9, B:38:0x00b5, B:40:0x00ca, B:43:0x00d2, B:46:0x00d9, B:48:0x00e3, B:52:0x00f3, B:54:0x00fe, B:56:0x0106, B:57:0x010e, B:59:0x0114, B:61:0x0120, B:63:0x012d, B:66:0x0135, B:69:0x013c, B:71:0x0146, B:73:0x0150, B:74:0x0162, B:76:0x0168, B:77:0x017b, B:79:0x0181, B:81:0x0195, B:19:0x0047, B:21:0x0057, B:23:0x005e), top: B:112:0x000f }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        C17671fNz c17671fNz;
        long jFetchVPNInfo;
        Object objAwait;
        Object objKWHzl;
        C17671fNz c17671fNz2;
        List list;
        LinkedHashSet linkedHashSet;
        long j;
        LinkedHashSet linkedHashSet2;
        long j2;
        AbstractC43419rot abstractC43419rot;
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean zBooleanValue = false;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            c17671fNz = this.this$0;
            Result.Application application2 = Result.Companion;
            C10854bwM c10854bwMIsConnected = c17671fNz.OLrzqt.valueOf().isConnected();
            jFetchVPNInfo = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L;
            AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(c17671fNz.AhwBna, true, false, 2, null);
            this.L$0 = c17671fNz;
            this.J$0 = jFetchVPNInfo;
            this.label = 1;
            objAwait = RxAwaitKt.await(allRootWallets$default, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = obj;
                    zBooleanValue = ((Boolean) objEZpvd).booleanValue();
                    objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(zBooleanValue));
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.copydefault("AAAddressCheckManager", "checkAllAddressList error message = " + thM7380exceptionOrNullimpl.getMessage());
                    }
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                list = (List) this.L$1;
                c17671fNz2 = (C17671fNz) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj;
                abstractC43419rot = (AbstractC43419rot) objKWHzl;
                if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                    c17671fNz2.copydefault(false);
                    for (CheckAaAddressResponse checkAaAddressResponse : (Iterable) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()) {
                        if (!c17671fNz2.AEQbTJ.containsKey(checkAaAddressResponse.getEoaAddress())) {
                            c17671fNz2.AEQbTJ.put(checkAaAddressResponse.getEoaAddress(), checkAaAddressResponse);
                        }
                    }
                    Intrinsics.copydefault(list);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    objEZpvd = c17671fNz2.EZpvd((List<? extends AbstractC12784ctX>) list, (Continuation<? super Boolean>) this);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    zBooleanValue = ((Boolean) objEZpvd).booleanValue();
                    objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(zBooleanValue));
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                pUU.copydefault("AAAddressCheckManager", "checkAaAddressStatus error message = " + ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getMessage());
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(zBooleanValue));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            jFetchVPNInfo = this.J$0;
            c17671fNz = (C17671fNz) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAwait = obj;
        }
        long j3 = jFetchVPNInfo;
        List<AbstractC12784ctX> list2 = (List) objAwait;
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Intrinsics.copydefault(list2);
        for (AbstractC12784ctX abstractC12784ctX : list2) {
            if (abstractC12784ctX.fJNWhG() != WalletType.HDWallet || !c17671fNz.OLrzqt()) {
                linkedHashSet = linkedHashSet3;
                j = j3;
                if (abstractC12784ctX.fJNWhG() == WalletType.KeyWallet || abstractC12784ctX.fJNWhG() == WalletType.MPCWallet) {
                    for (AbstractC12782ctV abstractC12782ctV : abstractC12784ctX.KWHzl()) {
                        if (!abstractC12782ctV.getFieldNames()) {
                            ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, j, null, 2, null);
                            String address = chainAddress != null ? chainAddress.getAddress() : null;
                            if (address != null && address.length() != 0 && !c17671fNz.AEQbTJ.containsKey(address)) {
                                linkedHashSet.add(address);
                            }
                        }
                    }
                }
            } else {
                for (AbstractC12782ctV abstractC12782ctV2 : abstractC12784ctX.KWHzl()) {
                    if (abstractC12782ctV2.getFieldNames()) {
                        linkedHashSet2 = linkedHashSet3;
                        j2 = j3;
                        ChainAddress chainAddress2 = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV2, j3, null, 2, null);
                        String eoaAddress = chainAddress2 != null ? chainAddress2.getEoaAddress() : null;
                        if (eoaAddress != null && eoaAddress.length() != 0 && !c17671fNz.AEQbTJ.containsKey(eoaAddress)) {
                            linkedHashSet2.add(eoaAddress);
                        }
                    } else {
                        linkedHashSet2 = linkedHashSet3;
                        j2 = j3;
                    }
                    linkedHashSet3 = linkedHashSet2;
                    j3 = j2;
                }
                linkedHashSet = linkedHashSet3;
                j = j3;
            }
            linkedHashSet3 = linkedHashSet;
            j3 = j;
        }
        LinkedHashSet linkedHashSet4 = linkedHashSet3;
        long j4 = j3;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(linkedHashSet4, 10));
        Iterator it = linkedHashSet4.iterator();
        while (it.hasNext()) {
            long j5 = j4;
            arrayList.add(new CheckAaAddressRequest((String) it.next(), j5));
            j4 = j5;
        }
        if (!arrayList.isEmpty()) {
            C13934dbu c13934dbu = c17671fNz.AYXKKw;
            this.L$0 = c17671fNz;
            this.L$1 = list2;
            this.label = 2;
            objKWHzl = c13934dbu.KWHzl(arrayList, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c17671fNz2 = c17671fNz;
            list = list2;
            abstractC43419rot = (AbstractC43419rot) objKWHzl;
            if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault("AAAddressCheckManager", "checkAllAddressList wallet result is empty");
            Result.Application application3 = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(C56443yFo.KWHzl(false)));
        }
    }
}
