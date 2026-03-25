package com.okinc.business.defi.biz.core.wallet.create;

import com.okinc.network.okg.response.ResponseData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C32935mmv;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC48694uaX;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSyncManager$createWalletsToServer$2$channelDef$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<HashMap<String, String>>>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletSyncManager$createWalletsToServer$2$channelDef$1(Continuation<? super WalletSyncManager$createWalletsToServer$2$channelDef$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSyncManager$createWalletsToServer$2$channelDef$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<HashMap<String, String>>> continuation) {
        return ((WalletSyncManager$createWalletsToServer$2$channelDef$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC58260yxt abstractC58260yxtValueOf;
        AbstractC58260yxt abstractC58260yxtOLrzqt;
        Object objAwait;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C32935mmv c32935mmv = C32935mmv.KWHzl;
            CharSequence charSequence = (CharSequence) c32935mmv.get("channel_id");
            if (charSequence == null || charSequence.length() == 0) {
                return new ResponseData(0, null, null, null, null, null, 62, null);
            }
            InterfaceC48694uaX interfaceC48694uaX = (InterfaceC48694uaX) C43251rlk.OLrzqt(InterfaceC48694uaX.class);
            if (interfaceC48694uaX != null) {
                String str = (String) c32935mmv.get("channel_id");
                if (str == null) {
                    str = "";
                }
                AbstractC58185ywX abstractC58185ywXCheckChannelId$default = InterfaceC48694uaX.StateListAnimator.checkChannelId$default(interfaceC48694uaX, str, null, 2, null);
                if (abstractC58185ywXCheckChannelId$default != null && (abstractC58260yxtValueOf = abstractC58185ywXCheckChannelId$default.valueOf()) != null && (abstractC58260yxtOLrzqt = abstractC58260yxtValueOf.OLrzqt(AbstractC58260yxt.copydefault(new ResponseData(0, null, null, null, null, null, 62, null)))) != null) {
                    this.label = 1;
                    objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
                    if (objAwait == objCopydefault) {
                        return objCopydefault;
                    }
                }
            }
            return new ResponseData(0, null, null, null, null, null, 62, null);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        objAwait = obj;
        ResponseData responseData = (ResponseData) objAwait;
        if (responseData != null) {
            return responseData;
        }
        return new ResponseData(0, null, null, null, null, null, 62, null);
    }
}
