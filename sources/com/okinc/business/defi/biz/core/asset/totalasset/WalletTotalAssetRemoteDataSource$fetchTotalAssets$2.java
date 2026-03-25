package com.okinc.business.defi.biz.core.asset.totalasset;

import com.okinc.business.defi.api.bean.OKWalletHiddenSmallAssetTokenModel;
import com.okinc.business.defi.biz.net.bean.WalletAccountDetail;
import com.okinc.business.defi.biz.net.bean.WalletTotalAssetModel;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C10540bqQ;
import o.C10854bwM;
import o.C13934dbu;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9852bdR;
import o.yDY;

/* JADX INFO: loaded from: classes3.dex */
public final class WalletTotalAssetRemoteDataSource$fetchTotalAssets$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<List<? extends WalletTotalAssetModel>>>, Object> {
    final /* synthetic */ List<AbstractC12782ctV> $wallets;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C10540bqQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends o.ctV> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletTotalAssetRemoteDataSource$fetchTotalAssets$2(List<? extends AbstractC12782ctV> list, C10540bqQ c10540bqQ, Continuation<? super WalletTotalAssetRemoteDataSource$fetchTotalAssets$2> continuation) {
        super(2, continuation);
        this.$wallets = list;
        this.this$0 = c10540bqQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletTotalAssetRemoteDataSource$fetchTotalAssets$2(this.$wallets, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<? extends WalletTotalAssetModel>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super ResponseData<List<WalletTotalAssetModel>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<WalletTotalAssetModel>>> continuation) {
        return ((WalletTotalAssetRemoteDataSource$fetchTotalAssets$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        ArrayList arrayList;
        String str;
        String str2;
        Double d;
        ResponseData responseData;
        Object objKWHzl2;
        ResponseData responseData2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            String strUSBtdM = ((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(this.$wallets)).USBtdM();
            String strDbNXlk = ((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(this.$wallets)).DbNXlk();
            int i2 = 0;
            for (Object obj2 : this.$wallets) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj2;
                if (i2 < 50) {
                    String strDbNXlk2 = abstractC12782ctV.DbNXlk();
                    List<C10854bwM> listIZzfmt = abstractC12782ctV.iZzfmt();
                    ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(listIZzfmt, 10));
                    Iterator<T> it = listIZzfmt.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(C56443yFo.KWHzl(((C10854bwM) it.next()).AhwBna()));
                    }
                    arrayList2.add(new WalletAccountDetail(strDbNXlk2, arrayList4));
                } else {
                    String strDbNXlk3 = abstractC12782ctV.DbNXlk();
                    List<C10854bwM> listIZzfmt2 = abstractC12782ctV.iZzfmt();
                    ArrayList arrayList5 = new ArrayList(C56403yEb.AYXKKw(listIZzfmt2, 10));
                    Iterator<T> it2 = listIZzfmt2.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(C56443yFo.KWHzl(((C10854bwM) it2.next()).AhwBna()));
                    }
                    arrayList3.add(new WalletAccountDetail(strDbNXlk3, arrayList5));
                }
                i2++;
            }
            InterfaceC9852bdR interfaceC9852bdR = this.this$0.OLrzqt;
            OKWalletHiddenSmallAssetTokenModel oKWalletHiddenSmallAssetTokenModelOLrzqt = interfaceC9852bdR != null ? interfaceC9852bdR.OLrzqt() : null;
            Double dAEQbTJ = (oKWalletHiddenSmallAssetTokenModelOLrzqt == null || !oKWalletHiddenSmallAssetTokenModelOLrzqt.getEnableHidden()) ? null : C56443yFo.AEQbTJ(C33129mqd.AEQbTJ(oKWalletHiddenSmallAssetTokenModelOLrzqt.getHiddenValue()));
            C13934dbu c13934dbu = this.this$0.KWHzl;
            String strAhwBna = this.this$0.copydefault.AhwBna();
            this.L$0 = arrayList3;
            this.L$1 = strUSBtdM;
            this.L$2 = strDbNXlk;
            this.L$3 = dAEQbTJ;
            this.label = 1;
            objKWHzl = c13934dbu.KWHzl(strUSBtdM, strDbNXlk, arrayList2, strAhwBna, dAEQbTJ, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            arrayList = arrayList3;
            str = strUSBtdM;
            str2 = strDbNXlk;
            d = dAEQbTJ;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResponseData responseData3 = (ResponseData) this.L$0;
                C56391yDq.AEQbTJ(obj);
                responseData = responseData3;
                objKWHzl2 = obj;
                responseData2 = (ResponseData) objKWHzl2;
                if (responseData.getCode() != 0 && responseData2.getCode() != 0) {
                    return responseData;
                }
                ArrayList arrayList6 = new ArrayList();
                if (C33129mqd.KWHzl((Collection) responseData.getData())) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    arrayList6.addAll((Collection) data);
                }
                if (C33129mqd.KWHzl((Collection) responseData2.getData())) {
                    Object data2 = responseData2.getData();
                    Intrinsics.copydefault(data2);
                    arrayList6.addAll((Collection) data2);
                }
                Unit unit = Unit.INSTANCE;
                return new ResponseData(0, null, null, null, arrayList6, null, 46, null);
            }
            Double d2 = (Double) this.L$3;
            String str3 = (String) this.L$2;
            String str4 = (String) this.L$1;
            arrayList = (ArrayList) this.L$0;
            C56391yDq.AEQbTJ(obj);
            d = d2;
            objKWHzl = obj;
            str2 = str3;
            str = str4;
        }
        responseData = (ResponseData) objKWHzl;
        if (!(!arrayList.isEmpty())) {
            return responseData;
        }
        C13934dbu c13934dbu2 = this.this$0.KWHzl;
        String strAhwBna2 = this.this$0.copydefault.AhwBna();
        this.L$0 = responseData;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        objKWHzl2 = c13934dbu2.KWHzl(str, str2, arrayList, strAhwBna2, d, this);
        if (objKWHzl2 == objCopydefault) {
            return objCopydefault;
        }
        responseData2 = (ResponseData) objKWHzl2;
        if (responseData.getCode() != 0) {
            return responseData;
        }
        ArrayList arrayList62 = new ArrayList();
        if (C33129mqd.KWHzl((Collection) responseData.getData())) {
        }
        if (C33129mqd.KWHzl((Collection) responseData2.getData())) {
        }
        Unit unit2 = Unit.INSTANCE;
        return new ResponseData(0, null, null, null, arrayList62, null, 46, null);
    }
}
