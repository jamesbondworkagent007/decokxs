package com.okinc.business.defi.wallet.common.okxconnect.util;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.common.okxconnect.model.wallet.SyncAllAddress;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import o.AbstractC12782ctV;
import o.C15974ebF;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$onSyncAllAddresses$2$1$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ C15974ebF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppMethodHelper$onSyncAllAddresses$2$1$1(C15974ebF c15974ebF, String str, Continuation<? super DAppMethodHelper$onSyncAllAddresses$2$1$1> continuation) {
        super(1, continuation);
        this.this$0 = c15974ebF;
        this.$walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DAppMethodHelper$onSyncAllAddresses$2$1$1(this.this$0, this.$walletId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((DAppMethodHelper$onSyncAllAddresses$2$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15974ebF c15974ebF = this.this$0;
            String str = this.$walletId;
            this.label = 1;
            obj = c15974ebF.KWHzl(str, (Continuation<? super AbstractC12782ctV>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
        ArrayList<ChainAddress> arrayListIsConnected = abstractC12782ctV.isConnected();
        ArrayList<ChainAddress> arrayList = new ArrayList();
        for (Object obj2 : arrayListIsConnected) {
            if (((ChainAddress) obj2).isDefault()) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ChainAddress) next).getChainId() == 1) {
                break;
            }
        }
        ChainAddress chainAddress = (ChainAddress) next;
        String address = chainAddress != null ? chainAddress.getAddress() : null;
        if (address == null) {
            address = "";
        }
        String str2 = address;
        Json json = this.this$0.fetchVPNInfo;
        int newProxyInstance = abstractC12782ctV.getNewProxyInstance();
        boolean zAuCTelauCTel = abstractC12782ctV.AuCTelauCTel();
        String strFJNWhG = abstractC12782ctV.fJNWhG();
        String strAkhnZx = abstractC12782ctV.AkhnZx();
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (ChainAddress chainAddress2 : arrayList) {
            long coinId = chainAddress2.getCoinId();
            String address2 = chainAddress2.getAddress();
            if (!(!Intrinsics.EZpvd((Object) address2, (Object) str2))) {
                address2 = null;
            }
            arrayList2.add(new SyncAllAddress.Address(coinId, address2));
        }
        SyncAllAddress syncAllAddress = new SyncAllAddress(newProxyInstance, zAuCTelauCTel ? 1 : 0, strFJNWhG, strAkhnZx, str2, arrayList2);
        json.getSerializersModule();
        return json.encodeToString(SyncAllAddress.Companion.serializer(), syncAllAddress);
    }
}
