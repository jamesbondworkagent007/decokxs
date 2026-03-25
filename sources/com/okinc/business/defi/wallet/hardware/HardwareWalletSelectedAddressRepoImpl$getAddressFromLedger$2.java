package com.okinc.business.defi.wallet.hardware;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.AddressAssetResp;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.other.DerivePath;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C10854bwM;
import o.C15372eFx;
import o.C33129mqd;
import o.C54870xYj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56532yIw;
import o.C8322bAY;
import o.InterfaceC57036yao;
import o.eFI;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class HardwareWalletSelectedAddressRepoImpl$getAddressFromLedger$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends eFI>>, Object> {
    final /* synthetic */ C10854bwM $coinMeta;
    final /* synthetic */ List<DerivePath> $derivePathList;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C15372eFx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HardwareWalletSelectedAddressRepoImpl$getAddressFromLedger$2(C10854bwM c10854bwM, C15372eFx c15372eFx, List<DerivePath> list, Continuation<? super HardwareWalletSelectedAddressRepoImpl$getAddressFromLedger$2> continuation) {
        super(2, continuation);
        this.$coinMeta = c10854bwM;
        this.this$0 = c15372eFx;
        this.$derivePathList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HardwareWalletSelectedAddressRepoImpl$getAddressFromLedger$2(this.$coinMeta, this.this$0, this.$derivePathList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends eFI>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<eFI>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<eFI>> continuation) {
        return ((HardwareWalletSelectedAddressRepoImpl$getAddressFromLedger$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0213  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00fc -> B:34:0x0100). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<eFI> list;
        Iterator it;
        C15372eFx c15372eFx;
        C10854bwM c10854bwM;
        Object next;
        Object next2;
        ChainAddress chainAddressCopydefault;
        Integer numOLrzqt;
        Object next3;
        Iterator it2;
        Object next4;
        ChainAddress chainAddressCopydefault2;
        ChainAddress chainAddressCopydefault3;
        ChainAddress chainAddressCopydefault4;
        ChainAddress chainAddressCopydefault5;
        ChainAddress chainAddressCopydefault6;
        Object objCopydefault;
        Object next5;
        String strEZpvd;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List<eFI> list2 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                list = list2;
                objCopydefault = obj;
                C10854bwM c10854bwM2 = this.$coinMeta;
                for (AddressAssetResp addressAssetResp : (List) objCopydefault) {
                    pUU.OLrzqt(">>>ledger thread:" + Thread.currentThread() + " addressWithAmountList item: " + addressAssetResp);
                    Iterator<T> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next5 = null;
                            break;
                        }
                        next5 = it3.next();
                        if (Intrinsics.EZpvd((Object) ((eFI) next5).copydefault().getAddress(), (Object) addressAssetResp.AEQbTJ())) {
                            break;
                        }
                    }
                    eFI efi = (eFI) next5;
                    if (efi != null) {
                        efi.OLrzqt(addressAssetResp.OLrzqt());
                        String strOLrzqt = addressAssetResp.OLrzqt();
                        if (strOLrzqt != null) {
                            strEZpvd = C54870xYj.EZpvd(strOLrzqt, c10854bwM2.valueOf(), c10854bwM2.fZBcTu(), c10854bwM2.fJNWhG(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                        } else {
                            strEZpvd = null;
                        }
                        efi.copydefault(strEZpvd);
                        efi.KWHzl(addressAssetResp.KWHzl());
                    }
                }
                return list;
            }
            DerivePath derivePath = (DerivePath) this.L$4;
            Iterator it4 = (Iterator) this.L$3;
            C10854bwM c10854bwM3 = (C10854bwM) this.L$2;
            C15372eFx c15372eFx2 = (C15372eFx) this.L$1;
            List<eFI> list3 = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            it = it4;
            c10854bwM = c10854bwM3;
            c15372eFx = c15372eFx2;
            list = list3;
            DerivePath derivePath2 = derivePath;
            Object objAEQbTJ = obj;
            C15372eFx.ActionBar actionBar = (C15372eFx.ActionBar) objAEQbTJ;
            pUU.OLrzqt(">>>ledger 1 derivePath:" + derivePath2 + " getAddressFromLedger results  " + actionBar);
            if (actionBar.copydefault() != null) {
                C56443yFo.KWHzl(list.add(new eFI(new ChainAddress(c10854bwM.AhwBna(), actionBar.AEQbTJ(), derivePath2.getAddressType(), null, null, false, actionBar.OLrzqt(), derivePath2.getPath(), 24, null), derivePath2.getAddressIndex(), null, null, null, 28, null)));
            } else {
                pUU.OLrzqt(">>>ledger 1 getAddressFromLedger results  error :" + actionBar + " thread:" + Thread.currentThread());
            }
            if (it.hasNext()) {
                DerivePath derivePath3 = (DerivePath) it.next();
                InterfaceC57036yao interfaceC57036yao = c15372eFx.EZpvd;
                String path = derivePath3.getPath();
                int addressType = derivePath3.getAddressType();
                this.L$0 = list;
                this.L$1 = c15372eFx;
                this.L$2 = c10854bwM;
                this.L$3 = it;
                this.L$4 = derivePath3;
                this.label = 1;
                C15372eFx c15372eFx3 = c15372eFx;
                objAEQbTJ = c15372eFx.AEQbTJ(interfaceC57036yao, c10854bwM, path, addressType, false, false, this);
                if (objAEQbTJ == objCopydefault2) {
                    return objCopydefault2;
                }
                c15372eFx = c15372eFx3;
                derivePath2 = derivePath3;
                C15372eFx.ActionBar actionBar2 = (C15372eFx.ActionBar) objAEQbTJ;
                pUU.OLrzqt(">>>ledger 1 derivePath:" + derivePath2 + " getAddressFromLedger results  " + actionBar2);
                if (actionBar2.copydefault() != null) {
                }
                if (it.hasNext()) {
                    if (this.$coinMeta.AxsJAYaxsJAY() || this.$coinMeta.DLWbHP()) {
                        Iterator it5 = list.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it5.next();
                            if (((eFI) next).copydefault().getAddressType() == AddressType.P2SHType.getValue()) {
                                break;
                            }
                        }
                        eFI efi2 = (eFI) next;
                        Iterator it6 = list.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it6.next();
                            if (((eFI) next2).copydefault().getAddressType() == AddressType.P2SHCommonType.getValue()) {
                                break;
                            }
                        }
                        eFI efi3 = (eFI) next2;
                        String address = (efi2 == null || (chainAddressCopydefault6 = efi2.copydefault()) == null) ? null : chainAddressCopydefault6.getAddress();
                        if (address == null || address.length() == 0) {
                            String address2 = (efi3 == null || (chainAddressCopydefault = efi3.copydefault()) == null) ? null : chainAddressCopydefault.getAddress();
                            if (address2 == null || address2.length() == 0) {
                                numOLrzqt = C8322bAY.KWHzl.OLrzqt(this.$coinMeta.fetchVPNInfo());
                                int value = AddressType.P2SHType.getValue();
                                if (numOLrzqt == null && numOLrzqt.intValue() == value) {
                                    it2 = list.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            next4 = null;
                                            break;
                                        }
                                        next4 = it2.next();
                                        if (((eFI) next4).copydefault().getAddressType() == AddressType.P2SHCommonType.getValue()) {
                                            break;
                                        }
                                    }
                                    C56532yIw.EZpvd(list).remove(next4);
                                } else {
                                    int value2 = AddressType.P2SHCommonType.getValue();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == value2) {
                                        Iterator it7 = list.iterator();
                                        while (true) {
                                            if (!it7.hasNext()) {
                                                next3 = null;
                                                break;
                                            }
                                            next3 = it7.next();
                                            if (((eFI) next3).copydefault().getAddressType() == AddressType.P2SHType.getValue()) {
                                                break;
                                            }
                                        }
                                        C56532yIw.EZpvd(list).remove(next3);
                                    }
                                }
                            } else {
                                if (C33129mqd.OLrzqt((CharSequence) ((efi2 == null || (chainAddressCopydefault5 = efi2.copydefault()) == null) ? null : chainAddressCopydefault5.getAddress()))) {
                                    if (C33129mqd.OLrzqt((CharSequence) ((efi3 == null || (chainAddressCopydefault4 = efi3.copydefault()) == null) ? null : chainAddressCopydefault4.getAddress()))) {
                                    }
                                    int value3 = AddressType.P2SHType.getValue();
                                    if (numOLrzqt == null) {
                                        it2 = list.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                            }
                                        }
                                        C56532yIw.EZpvd(list).remove(next4);
                                    }
                                }
                                if (C33129mqd.OLrzqt((CharSequence) ((efi2 == null || (chainAddressCopydefault3 = efi2.copydefault()) == null) ? null : chainAddressCopydefault3.getAddress()))) {
                                    numOLrzqt = C56443yFo.AEQbTJ(AddressType.P2SHType.getValue());
                                } else if (C33129mqd.OLrzqt((CharSequence) ((efi3 == null || (chainAddressCopydefault2 = efi3.copydefault()) == null) ? null : chainAddressCopydefault2.getAddress()))) {
                                    numOLrzqt = C56443yFo.AEQbTJ(AddressType.P2SHCommonType.getValue());
                                } else {
                                    numOLrzqt = C8322bAY.KWHzl.OLrzqt(this.$coinMeta.fetchVPNInfo());
                                }
                                int value32 = AddressType.P2SHType.getValue();
                                if (numOLrzqt == null) {
                                }
                            }
                        }
                        C10854bwM c10854bwM22 = this.$coinMeta;
                        while (r0.hasNext()) {
                        }
                        return list;
                    }
                    C15372eFx c15372eFx4 = this.this$0;
                    C10854bwM c10854bwM4 = this.$coinMeta;
                    this.L$0 = list;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                    objCopydefault = c15372eFx4.copydefault(c10854bwM4, list, this);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    C10854bwM c10854bwM222 = this.$coinMeta;
                    while (r0.hasNext()) {
                    }
                    return list;
                }
            }
        } else {
            C56391yDq.AEQbTJ(obj);
            Thread threadCurrentThread = Thread.currentThread();
            C10854bwM c10854bwM5 = this.$coinMeta;
            Long lKWHzl = c10854bwM5 != null ? C56443yFo.KWHzl(c10854bwM5.fetchVPNInfo()) : null;
            C10854bwM c10854bwM6 = this.$coinMeta;
            Long lKWHzl2 = c10854bwM6 != null ? C56443yFo.KWHzl(c10854bwM6.AEQbTJ()) : null;
            C10854bwM c10854bwM7 = this.$coinMeta;
            pUU.OLrzqt(">>>ledger getAddressFromLedger on thread:" + threadCurrentThread + " - coinMeta generalChainId: " + lKWHzl + " - coinMeta chainId :" + lKWHzl2 + " coinId:" + (c10854bwM7 != null ? C56443yFo.KWHzl(c10854bwM7.AhwBna()) : null));
            if (this.this$0.EZpvd == null || this.$coinMeta == null) {
                return yDY.AhwBna();
            }
            ArrayList arrayList = new ArrayList();
            List<DerivePath> list4 = this.$derivePathList;
            C15372eFx c15372eFx5 = this.this$0;
            C10854bwM c10854bwM8 = this.$coinMeta;
            list = arrayList;
            it = list4.iterator();
            c15372eFx = c15372eFx5;
            c10854bwM = c10854bwM8;
            if (it.hasNext()) {
            }
        }
    }
}
