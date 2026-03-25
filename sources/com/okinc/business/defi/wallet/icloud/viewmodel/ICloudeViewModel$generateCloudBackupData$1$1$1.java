package com.okinc.business.defi.wallet.icloud.viewmodel;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.drivers.bean.HDWalletBackupAddressBean;
import com.okinc.business.defi.biz.drivers.bean.HDWalletBackupTypeBean;
import com.okinc.business.defi.biz.drivers.bean.HDWalletCloudBackupBean;
import com.okinc.business.defi.biz.model.ChainAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC58260yxt;
import o.C10854bwM;
import o.C10954byG;
import o.C12827cuN;
import o.C18336fgV;
import o.C18338fgX;
import o.C18397fhd;
import o.C18399fhf;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes18.dex */
public final class ICloudeViewModel$generateCloudBackupData$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountName;
    final /* synthetic */ List<HDWalletCloudBackupBean> $cloudBackupList;
    final /* synthetic */ ArrayList<Object> $dataList;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C18399fhf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ICloudeViewModel$generateCloudBackupData$1$1$1(C18399fhf c18399fhf, String str, List<HDWalletCloudBackupBean> list, ArrayList<Object> arrayList, Continuation<? super ICloudeViewModel$generateCloudBackupData$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c18399fhf;
        this.$accountName = str;
        this.$cloudBackupList = list;
        this.$dataList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ICloudeViewModel$generateCloudBackupData$1$1$1(this.this$0, this.$accountName, this.$cloudBackupList, this.$dataList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ICloudeViewModel$generateCloudBackupData$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0367 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x029b A[EDGE_INSN: B:177:0x029b->B:124:0x029b BREAK  A[LOOP:5: B:103:0x0250->B:178:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[LOOP:5: B:103:0x0250->B:178:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01db  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAwait;
        List list;
        List<HDWalletCloudBackupBean> list2;
        Long l;
        Long l2;
        HDWalletBackupTypeBean backupTypeBean;
        Iterator it;
        Channel channel;
        ArrayList<Object> arrayList;
        boolean z;
        ArrayList<HDWalletBackupAddressBean> addressList;
        Object next;
        String address;
        boolean zEZpvd;
        Object next2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Integer num = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.IntRef intRef = new Ref.IntRef();
            Ref.IntRef intRef2 = new Ref.IntRef();
            this.this$0.AEQbTJ().postValue(this.$accountName);
            for (HDWalletCloudBackupBean hDWalletCloudBackupBean : this.$cloudBackupList) {
                HDWalletBackupTypeBean backupTypeBean2 = hDWalletCloudBackupBean.getBackupTypeBean();
                if ((backupTypeBean2 == null || backupTypeBean2.getWalletType() != WalletType.HDWallet.ordinal()) && ((backupTypeBean = hDWalletCloudBackupBean.getBackupTypeBean()) == null || backupTypeBean.getWalletType() != WalletType.TonWallet.ordinal())) {
                    HDWalletBackupTypeBean backupTypeBean3 = hDWalletCloudBackupBean.getBackupTypeBean();
                    if (backupTypeBean3 != null && backupTypeBean3.getWalletType() == WalletType.KeyWallet.ordinal()) {
                        intRef2.element++;
                    }
                } else {
                    intRef.element++;
                }
            }
            this.this$0.KWHzl().postValue(C56443yFo.AEQbTJ(intRef.element));
            this.this$0.OLrzqt().postValue(C56443yFo.AEQbTJ(intRef2.element));
            if (intRef.element == 0 && intRef2.element == 0) {
                Channel channel2 = this.this$0.EZpvd;
                ArrayList<Object> arrayList2 = this.$dataList;
                this.label = 1;
                if (channel2.send(arrayList2, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            C10954byG c10954byG = C10954byG.EZpvd;
            C10854bwM c10854bwMIsConnected = c10954byG.valueOf().isConnected();
            Long lKWHzl = c10854bwMIsConnected != null ? C56443yFo.KWHzl(c10854bwMIsConnected.AEQbTJ()) : null;
            C10854bwM c10854bwMCopydefault = c10954byG.valueOf().copydefault(607L);
            Long lKWHzl2 = c10854bwMCopydefault != null ? C56443yFo.KWHzl(c10854bwMCopydefault.AEQbTJ()) : null;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(this.this$0.djBIcL(), false, false, 3, null);
            this.L$0 = lKWHzl;
            this.L$1 = lKWHzl2;
            this.L$2 = arrayList3;
            this.L$3 = arrayList4;
            this.label = 2;
            objAwait = RxAwaitKt.await(allRootWallets$default, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            Long l3 = lKWHzl2;
            list = arrayList3;
            list2 = arrayList4;
            l = lKWHzl;
            l2 = l3;
            Intrinsics.checkNotNullExpressionValue(objAwait, "");
            ArrayList arrayList5 = new ArrayList();
            while (r3.hasNext()) {
            }
            ArrayList arrayList6 = new ArrayList(C56403yEb.AYXKKw(arrayList5, 10));
            it = arrayList5.iterator();
            while (it.hasNext()) {
            }
            while (r4.hasNext()) {
            }
            if (!list2.isEmpty()) {
            }
            if (!list.isEmpty()) {
            }
            channel = this.this$0.EZpvd;
            arrayList = this.$dataList;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
            if (channel.send(arrayList, this) == objCopydefault) {
            }
        } else {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            } else {
                list2 = (List) this.L$3;
                List list3 = (List) this.L$2;
                Long l4 = (Long) this.L$1;
                Long l5 = (Long) this.L$0;
                C56391yDq.AEQbTJ(obj);
                l = l5;
                l2 = l4;
                list = list3;
                objAwait = obj;
                Intrinsics.checkNotNullExpressionValue(objAwait, "");
                ArrayList arrayList52 = new ArrayList();
                for (Object obj2 : (Iterable) objAwait) {
                    AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) obj2;
                    if (abstractC12784ctX.fJNWhG() == WalletType.HDWallet || abstractC12784ctX.fJNWhG() == WalletType.TonWallet) {
                        arrayList52.add(obj2);
                    }
                }
                ArrayList arrayList62 = new ArrayList(C56403yEb.AYXKKw(arrayList52, 10));
                it = arrayList52.iterator();
                while (it.hasNext()) {
                    Iterator<T> it2 = ((AbstractC12784ctX) it.next()).KWHzl().iterator();
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (it2.hasNext()) {
                            int iFinit = ((AbstractC12782ctV) next2).finit();
                            do {
                                Object next3 = it2.next();
                                int iFinit2 = ((AbstractC12782ctV) next3).finit();
                                if (iFinit > iFinit2) {
                                    iFinit = iFinit2;
                                    next2 = next3;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next2 = null;
                    }
                    arrayList62.add((AbstractC12782ctV) next2);
                }
                for (HDWalletCloudBackupBean hDWalletCloudBackupBean2 : this.$cloudBackupList) {
                    HDWalletBackupTypeBean backupTypeBean4 = hDWalletCloudBackupBean2.getBackupTypeBean();
                    Integer numAEQbTJ = backupTypeBean4 != null ? C56443yFo.AEQbTJ(backupTypeBean4.getWalletType()) : num;
                    HDWalletBackupTypeBean backupTypeBean5 = hDWalletCloudBackupBean2.getBackupTypeBean();
                    if (backupTypeBean5 != null && (addressList = backupTypeBean5.getAddressList()) != null) {
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj3 : addressList) {
                            HDWalletBackupAddressBean hDWalletBackupAddressBean = (HDWalletBackupAddressBean) obj3;
                            int iOrdinal = WalletType.TonWallet.ordinal();
                            if (numAEQbTJ != null && numAEQbTJ.intValue() == iOrdinal) {
                                zEZpvd = Intrinsics.EZpvd((Object) hDWalletBackupAddressBean.getChainId(), (Object) String.valueOf(l2));
                            } else {
                                zEZpvd = Intrinsics.EZpvd((Object) hDWalletBackupAddressBean.getChainId(), (Object) String.valueOf(l));
                            }
                            if (zEZpvd) {
                                arrayList7.add(obj3);
                            }
                        }
                        HDWalletBackupAddressBean hDWalletBackupAddressBean2 = (HDWalletBackupAddressBean) CollectionsKt___CollectionsKt.firstOrNull(arrayList7);
                        if (hDWalletBackupAddressBean2 != null) {
                            Iterator it3 = arrayList62.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) next;
                                Long l6 = (numAEQbTJ != null && numAEQbTJ.intValue() == WalletType.TonWallet.ordinal()) ? l2 : l;
                                if (abstractC12782ctV == null) {
                                    address = null;
                                    if (!Intrinsics.EZpvd((Object) address, (Object) hDWalletBackupAddressBean2.getAddress())) {
                                        break;
                                    }
                                } else {
                                    ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, l6 != null ? l6.longValue() : 0L, null, 2, null);
                                    if (chainAddressAddressFromChainId$default != null) {
                                        address = chainAddressAddressFromChainId$default.getAddress();
                                    }
                                    if (!Intrinsics.EZpvd((Object) address, (Object) hDWalletBackupAddressBean2.getAddress())) {
                                    }
                                }
                            }
                            if (((AbstractC12782ctV) next) != null) {
                                list.add(hDWalletCloudBackupBean2);
                            } else {
                                list2.add(hDWalletCloudBackupBean2);
                            }
                        }
                    }
                    num = null;
                }
                if (!list2.isEmpty()) {
                    this.$dataList.add(new C18338fgX(0, 1, null));
                    this.$dataList.add(new C18397fhd(0, list2.size()));
                    ArrayList<Object> arrayList8 = this.$dataList;
                    C18399fhf c18399fhf = this.this$0;
                    for (HDWalletCloudBackupBean hDWalletCloudBackupBean3 : list2) {
                        if (!c18399fhf.copydefault().isEmpty()) {
                            List<Integer> listCopydefault = c18399fhf.copydefault();
                            HDWalletBackupTypeBean backupTypeBean6 = hDWalletCloudBackupBean3.getBackupTypeBean();
                            z = CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends Integer>) ((Iterable<? extends Object>) listCopydefault), backupTypeBean6 != null ? C56443yFo.AEQbTJ(backupTypeBean6.getWalletType()) : null);
                        }
                        arrayList8.add(new C18336fgV(false, hDWalletCloudBackupBean3, z));
                    }
                }
                if (!list.isEmpty()) {
                    this.$dataList.add(new C18338fgX(0, 1, null));
                    this.$dataList.add(new C18397fhd(1, list.size()));
                    ArrayList<Object> arrayList9 = this.$dataList;
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList9.add(new C18336fgV(true, (HDWalletCloudBackupBean) it4.next(), true));
                    }
                }
                channel = this.this$0.EZpvd;
                arrayList = this.$dataList;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                if (channel.send(arrayList, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
