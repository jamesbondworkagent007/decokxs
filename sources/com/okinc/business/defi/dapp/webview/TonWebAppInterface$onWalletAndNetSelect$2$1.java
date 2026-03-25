package com.okinc.business.defi.dapp.webview;

import android.os.Bundle;
import com.google.gson.Gson;
import com.okinc.business.defi.dapp.net.TonConnectItem;
import com.okinc.business.defi.dapp.net.TonConnectRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C15112dyF;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.dES;
import o.dFE;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class TonWebAppInterface$onWalletAndNetSelect$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $id;
    final /* synthetic */ String $method;
    final /* synthetic */ TonConnectRequest $tonConnectRequest;
    final /* synthetic */ InterfaceC9738bbJ $wallet;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ dFE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TonWebAppInterface$onWalletAndNetSelect$2$1(TonConnectRequest tonConnectRequest, dFE dfe, InterfaceC9738bbJ interfaceC9738bbJ, Object obj, String str, Continuation<? super TonWebAppInterface$onWalletAndNetSelect$2$1> continuation) {
        super(2, continuation);
        this.$tonConnectRequest = tonConnectRequest;
        this.this$0 = dfe;
        this.$wallet = interfaceC9738bbJ;
        this.$id = obj;
        this.$method = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TonWebAppInterface$onWalletAndNetSelect$2$1(this.$tonConnectRequest, this.this$0, this.$wallet, this.$id, this.$method, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TonWebAppInterface$onWalletAndNetSelect$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[Catch: Exception -> 0x0097, TryCatch #0 {Exception -> 0x0097, blocks: (B:6:0x0025, B:26:0x0092, B:15:0x0054, B:17:0x005a, B:19:0x006c, B:20:0x0074, B:22:0x007c, B:29:0x0099, B:31:0x00af, B:33:0x00b5, B:35:0x00bb, B:36:0x00d5, B:11:0x0034, B:14:0x003d), top: B:50:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af A[Catch: Exception -> 0x0097, TryCatch #0 {Exception -> 0x0097, blocks: (B:6:0x0025, B:26:0x0092, B:15:0x0054, B:17:0x005a, B:19:0x006c, B:20:0x0074, B:22:0x007c, B:29:0x0099, B:31:0x00af, B:33:0x00b5, B:35:0x00bb, B:36:0x00d5, B:11:0x0034, B:14:0x003d), top: B:50:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5 A[Catch: Exception -> 0x0097, TryCatch #0 {Exception -> 0x0097, blocks: (B:6:0x0025, B:26:0x0092, B:15:0x0054, B:17:0x005a, B:19:0x006c, B:20:0x0074, B:22:0x007c, B:29:0x0099, B:31:0x00af, B:33:0x00b5, B:35:0x00bb, B:36:0x00d5, B:11:0x0034, B:14:0x003d), top: B:50:0x0009 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0091 -> B:26:0x0092). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List arrayList;
        Iterator it;
        String str;
        dFE dfe;
        InterfaceC9738bbJ interfaceC9738bbJ;
        Object obj2;
        DappTabData dappTabDataOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            dES des = this.this$0.copydefault().get();
            if (des != null) {
                des.dismissLoading();
            }
            String message = e.getMessage();
            pUU.copydefault("tonWebAppInterface", message != null ? message : "");
            Object obj3 = this.$id;
            if (obj3 != null) {
                dFE.notifySendError$default(this.this$0, obj3, "", this.$method, null, 8, null);
            }
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String manifestUrl = this.$tonConnectRequest.getManifestUrl();
            if (manifestUrl == null) {
                manifestUrl = "";
            }
            arrayList = new ArrayList();
            List<TonConnectItem> items = this.$tonConnectRequest.getItems();
            dFE dfe2 = this.this$0;
            InterfaceC9738bbJ interfaceC9738bbJ2 = this.$wallet;
            it = items.iterator();
            str = manifestUrl;
            dfe = dfe2;
            interfaceC9738bbJ = interfaceC9738bbJ2;
            while (it.hasNext()) {
            }
            String strCopydefault = this.this$0.copydefault(this.$wallet);
            obj2 = this.$id;
            dFE dfe3 = this.this$0;
            InterfaceC9738bbJ interfaceC9738bbJ3 = this.$wallet;
            dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
            if (dappTabDataOLrzqt != null) {
            }
            if (obj2 != null) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        arrayList = (List) this.L$5;
        it = (Iterator) this.L$4;
        interfaceC9738bbJ = (InterfaceC9738bbJ) this.L$3;
        dfe = (dFE) this.L$2;
        List list = (List) this.L$1;
        str = (String) this.L$0;
        C56391yDq.AEQbTJ(obj);
        arrayList.add(obj);
        arrayList = list;
        while (it.hasNext()) {
            TonConnectItem tonConnectItem = (TonConnectItem) it.next();
            String name = tonConnectItem.getName();
            if (Intrinsics.EZpvd((Object) name, (Object) "ton_addr")) {
                arrayList.add(dfe.AYXKKw(interfaceC9738bbJ));
            } else if (Intrinsics.EZpvd((Object) name, (Object) "ton_proof")) {
                this.L$0 = str;
                this.L$1 = arrayList;
                this.L$2 = dfe;
                this.L$3 = interfaceC9738bbJ;
                this.L$4 = it;
                this.L$5 = arrayList;
                this.label = 1;
                obj = dfe.OLrzqt(str, tonConnectItem, interfaceC9738bbJ, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                list = arrayList;
                arrayList.add(obj);
                arrayList = list;
                while (it.hasNext()) {
                }
            }
        }
        String strCopydefault2 = this.this$0.copydefault(this.$wallet);
        obj2 = this.$id;
        dFE dfe32 = this.this$0;
        InterfaceC9738bbJ interfaceC9738bbJ32 = this.$wallet;
        dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt != null) {
            dappTabDataOLrzqt.setConnectedByWalletConnect(false);
        }
        if (obj2 != null) {
            dFE.Application application = dfe32.AhwBna;
            if (application != null) {
                Bundle bundle = new Bundle();
                bundle.putString("result", new Gson().toJson(arrayList));
                Unit unit = Unit.INSTANCE;
                application.copydefault(obj2, bundle, "tonConnect_connect");
            }
            dfe32.EZpvd(interfaceC9738bbJ32);
            dfe32.djBIcL();
            dfe32.OLrzqt(strCopydefault2);
        }
        return Unit.INSTANCE;
    }
}
