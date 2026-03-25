package com.okinc.business.defi.wallet.transfer.receive.exchange;

import com.okinc.assets.backend.api.model.ChainData;
import com.okinc.assets.backend.api.model.SupportCurrency;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.AssetWalletNetwork;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeSelectCoinBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.Bitmap;
import o.C14316djE;
import o.C21120gtk;
import o.C33129mqd;
import o.C43251rlk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC46553tYp;
import o.InterfaceC8224ayh;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class WithdrawCoinsViewModel$generateExchangeAssetData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C21120gtk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawCoinsViewModel$generateExchangeAssetData$1(C21120gtk c21120gtk, Continuation<? super WithdrawCoinsViewModel$generateExchangeAssetData$1> continuation) {
        super(2, continuation);
        this.this$0 = c21120gtk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WithdrawCoinsViewModel$generateExchangeAssetData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WithdrawCoinsViewModel$generateExchangeAssetData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        boolean zKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC8224ayh interfaceC8224ayhDjBIcL = this.this$0.djBIcL();
            String strQUSxYX = ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).QUSxYX();
            this.label = 1;
            objAEQbTJ = interfaceC8224ayhDjBIcL.AEQbTJ(strQUSxYX, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
        C21120gtk c21120gtk = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            List list = (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            c21120gtk.OLrzqt.clear();
            c21120gtk.copydefault.clear();
            if (list.isEmpty()) {
                c21120gtk.AEQbTJ().setValue(new Bitmap.StateListAnimator(yDY.copydefault(new C14316djE(null, 1))));
            } else {
                ArrayList<SupportCurrency> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (C33129mqd.copydefault(C33129mqd.EZpvd(((SupportCurrency) obj2).getBalance()).abs(), C56443yFo.AEQbTJ(1.0E-6d))) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                for (SupportCurrency supportCurrency : arrayList) {
                    ArrayList arrayList3 = new ArrayList();
                    if (C33129mqd.KWHzl((Collection) supportCurrency.getNetworks())) {
                        List<ChainData> networks = supportCurrency.getNetworks();
                        ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(networks, 10));
                        for (ChainData chainData : networks) {
                            String gasFee = chainData.getGasFee();
                            String str = gasFee == null ? "" : gasFee;
                            String gasFeeSymbol = chainData.getGasFeeSymbol();
                            String str2 = gasFeeSymbol == null ? "" : gasFeeSymbol;
                            String usdGasFee = chainData.getUsdGasFee();
                            String str3 = usdGasFee == null ? "" : usdGasFee;
                            Integer numAEQbTJ = C56443yFo.AEQbTJ(chainData.getEstimatedArrivalTime());
                            Integer numAEQbTJ2 = C56443yFo.AEQbTJ(chainData.getSubCurrencyId());
                            String usdGasFeeSymbol = chainData.getUsdGasFeeSymbol();
                            arrayList4.add(new AssetWalletNetwork(str, str2, str3, numAEQbTJ, numAEQbTJ2, usdGasFeeSymbol == null ? "" : usdGasFeeSymbol, (String) null, supportCurrency.getCurrency(), 64, (DefaultConstructorMarker) null));
                        }
                        arrayList3.addAll(arrayList4);
                        zKWHzl = C33129mqd.KWHzl((Collection) arrayList4);
                    } else {
                        zKWHzl = false;
                    }
                    arrayList2.add(new ExchangeSelectCoinBean(supportCurrency.getIcon(), supportCurrency.getCurrency(), supportCurrency.getFullName(), supportCurrency.getBalance(), supportCurrency.getValuation(), C56443yFo.AEQbTJ(supportCurrency.getCurrencyId()), C56443yFo.KWHzl(zKWHzl), arrayList3, (String) null, 256, (DefaultConstructorMarker) null));
                }
                c21120gtk.copydefault.addAll(arrayList2);
                c21120gtk.OLrzqt((List<ExchangeSelectCoinBean>) arrayList2);
            }
        }
        C21120gtk c21120gtk2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            Throwable th = (Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
            pUU.copydefault(c21120gtk2.gEmmrt, "accountService getAccountCurrenciesForWallet error message :" + th.getMessage());
            c21120gtk2.AEQbTJ().setValue(new Bitmap.ActionBar(th.getMessage(), c21120gtk2.OLrzqt));
        }
        return Unit.INSTANCE;
    }
}
