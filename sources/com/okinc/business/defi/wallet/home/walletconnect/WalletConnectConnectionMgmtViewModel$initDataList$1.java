package com.okinc.business.defi.wallet.home.walletconnect;

import com.okinc.business.defi.biz.walletconnect.WCSessionMeta;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C15935eaT;
import o.C18345fge;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletConnectConnectionMgmtViewModel$initDataList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18345fge this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletConnectConnectionMgmtViewModel$initDataList$1(C18345fge c18345fge, Continuation<? super WalletConnectConnectionMgmtViewModel$initDataList$1> continuation) {
        super(2, continuation);
        this.this$0 = c18345fge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletConnectConnectionMgmtViewModel$initDataList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletConnectConnectionMgmtViewModel$initDataList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15935eaT c15935eaT = this.this$0.EZpvd;
            String str = this.this$0.valueOf;
            this.label = 1;
            obj = c15935eaT.EZpvd(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Iterable<DAppSession> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
        for (DAppSession dAppSession : iterable) {
            arrayList.add(new WalletConnectedData(3, dAppSession.getDAppInfo().getIcon(), dAppSession.getDAppInfo().getName(), dAppSession.getDAppInfo().getUrl(), dAppSession.getClientId()));
        }
        List<com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession> listKWHzl = this.this$0.AEQbTJ.KWHzl(this.this$0.valueOf);
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        for (com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession dAppSession2 : listKWHzl) {
            arrayList2.add(new WalletConnectedData(2, dAppSession2.getManifest().getIconUrl(), dAppSession2.getManifest().getName(), dAppSession2.getManifest().getUrl(), dAppSession2.getClientId()));
        }
        List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) arrayList, (Iterable) arrayList2);
        List<WCSessionMeta> listAhwBna = this.this$0.KWHzl.AhwBna(this.this$0.valueOf);
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        for (WCSessionMeta wCSessionMeta : listAhwBna) {
            List<String> icons = wCSessionMeta.getIcons();
            String str2 = icons != null ? (String) CollectionsKt___CollectionsKt.firstOrNull(icons) : null;
            String str3 = str2 == null ? "" : str2;
            String projectName = wCSessionMeta.getProjectName();
            String url = wCSessionMeta.getUrl();
            String str4 = url == null ? "" : url;
            String topic = wCSessionMeta.getTopic();
            arrayList3.add(new WalletConnectedData(0, str3, projectName, str4, topic == null ? "" : topic));
        }
        List listDjBIcL2 = CollectionsKt___CollectionsKt.djBIcL((Collection) listDjBIcL, (Iterable) arrayList3);
        MutableStateFlow mutableStateFlow = this.this$0.copydefault;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, listDjBIcL2));
        return Unit.INSTANCE;
    }
}
