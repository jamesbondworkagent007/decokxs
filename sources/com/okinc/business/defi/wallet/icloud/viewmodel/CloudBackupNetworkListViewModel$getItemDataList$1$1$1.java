package com.okinc.business.defi.wallet.icloud.viewmodel;

import com.okinc.business.defi.biz.drivers.bean.HDWalletBackupAddressBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import o.C10854bwM;
import o.C18333fgS;
import o.C18339fgY;
import o.C18396fhc;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes18.dex */
public final class CloudBackupNetworkListViewModel$getItemDataList$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<HDWalletBackupAddressBean> $cloudBackupAddressList;
    final /* synthetic */ ArrayList<Object> $dataList;
    int label;
    final /* synthetic */ C18396fhc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudBackupNetworkListViewModel$getItemDataList$1$1$1(List<HDWalletBackupAddressBean> list, ArrayList<Object> arrayList, C18396fhc c18396fhc, Continuation<? super CloudBackupNetworkListViewModel$getItemDataList$1$1$1> continuation) {
        super(2, continuation);
        this.$cloudBackupAddressList = list;
        this.$dataList = arrayList;
        this.this$0 = c18396fhc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CloudBackupNetworkListViewModel$getItemDataList$1$1$1(this.$cloudBackupAddressList, this.$dataList, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CloudBackupNetworkListViewModel$getItemDataList$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            ArrayList arrayList = new ArrayList();
            List<HDWalletBackupAddressBean> list = this.$cloudBackupAddressList;
            C18396fhc c18396fhc = this.this$0;
            ArrayList<Object> arrayList2 = this.$dataList;
            for (HDWalletBackupAddressBean hDWalletBackupAddressBean : list) {
                C10854bwM c10854bwMKWHzl = c18396fhc.OLrzqt().KWHzl(C56443yFo.KWHzl(C33129mqd.valueOf(hDWalletBackupAddressBean.getChainId())));
                if (c10854bwMKWHzl != null) {
                    if (c10854bwMKWHzl.ejfBZ()) {
                        objectRef.element = hDWalletBackupAddressBean.getAddress();
                        arrayList.add(c10854bwMKWHzl);
                    } else {
                        arrayList2.add(new C18333fgS(hDWalletBackupAddressBean.getAddress(), c10854bwMKWHzl));
                    }
                }
            }
            if (((CharSequence) objectRef.element).length() > 0) {
                this.$dataList.add(0, new C18339fgY((String) objectRef.element, arrayList));
            }
            Channel channel = this.this$0.OLrzqt;
            ArrayList<Object> arrayList3 = this.$dataList;
            this.label = 1;
            if (channel.send(arrayList3, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
