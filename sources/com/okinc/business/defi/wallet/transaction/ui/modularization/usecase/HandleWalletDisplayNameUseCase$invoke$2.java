package com.okinc.business.defi.wallet.transaction.ui.modularization.usecase;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AddressModuleModel;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C10854bwM;
import o.C12827cuN;
import o.C20325gek;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C59449zhJ;

/* JADX INFO: loaded from: classes5.dex */
public final class HandleWalletDisplayNameUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<AddressModuleModel> $addressModuleList;
    final /* synthetic */ C10854bwM $chainMeta;
    final /* synthetic */ AbstractC12782ctV $wallet;
    final /* synthetic */ ChainAddress $walletAddress;
    boolean Z$0;
    int label;
    final /* synthetic */ C20325gek this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleWalletDisplayNameUseCase$invoke$2(C10854bwM c10854bwM, List<AddressModuleModel> list, C20325gek c20325gek, ChainAddress chainAddress, AbstractC12782ctV abstractC12782ctV, Continuation<? super HandleWalletDisplayNameUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$chainMeta = c10854bwM;
        this.$addressModuleList = list;
        this.this$0 = c20325gek;
        this.$walletAddress = chainAddress;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HandleWalletDisplayNameUseCase$invoke$2(this.$chainMeta, this.$addressModuleList, this.this$0, this.$walletAddress, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HandleWalletDisplayNameUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        String address;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            boolean zFinit = this.$chainMeta.finit();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            List<AddressModuleModel> list = this.$addressModuleList;
            ChainAddress chainAddress = this.$walletAddress;
            AbstractC12782ctV abstractC12782ctV = this.$wallet;
            C10854bwM c10854bwM = this.$chainMeta;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AddressModuleModel.AddressItem data = ((AddressModuleModel) it.next()).getData();
                if (data != null && (address = data.getAddress()) != null && address.length() != 0) {
                    if (C59449zhJ.gEmmrt(address, chainAddress.getAddress(), zFinit)) {
                        data.setTag(abstractC12782ctV.AYXKKw());
                        data.setAddressType(c10854bwM.iRxXKY() ? chainAddress.getAddressTypeText() : null);
                    } else {
                        C56443yFo.KWHzl(linkedHashSet.add(address));
                    }
                }
            }
            if (linkedHashSet.isEmpty()) {
                return Unit.INSTANCE;
            }
            C12827cuN c12827cuN = this.this$0.EZpvd;
            C10854bwM c10854bwM2 = this.$chainMeta;
            this.Z$0 = zFinit;
            this.label = 1;
            Object objEZpvd = c12827cuN.EZpvd(c10854bwM2, linkedHashSet, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            z = zFinit;
            obj = objEZpvd;
        }
        List<AddressModuleModel> list2 = this.$addressModuleList;
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            String str = (String) entry.getKey();
            AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) entry.getValue();
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                AddressModuleModel.AddressItem data2 = ((AddressModuleModel) it2.next()).getData();
                if (data2 != null && C59449zhJ.gEmmrt(data2.getAddress(), str, z)) {
                    data2.setTag(abstractC12782ctV2.AYXKKw());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
