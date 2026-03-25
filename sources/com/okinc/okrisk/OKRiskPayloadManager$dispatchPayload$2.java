package com.okinc.okrisk;

import android.app.Application;
import android.util.Base64;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32979mnm;
import o.C47212tll;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC46999thk;

/* JADX INFO: loaded from: classes10.dex */
public final class OKRiskPayloadManager$dispatchPayload$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channel;
    final /* synthetic */ String $deviceInfo;
    final /* synthetic */ int $dexId;
    final /* synthetic */ String $did;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ String $timestamp;
    final /* synthetic */ String $userId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKRiskPayloadManager$dispatchPayload$2(String str, String str2, String str3, String str4, String str5, int i, String str6, Continuation<? super OKRiskPayloadManager$dispatchPayload$2> continuation) {
        super(2, continuation);
        this.$userId = str;
        this.$did = str2;
        this.$channel = str3;
        this.$timestamp = str4;
        this.$deviceInfo = str5;
        this.$dexId = i;
        this.$sessionId = str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKRiskPayloadManager$dispatchPayload$2(this.$userId, this.$did, this.$channel, this.$timestamp, this.$deviceInfo, this.$dexId, this.$sessionId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKRiskPayloadManager$dispatchPayload$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC46999thk interfaceC46999thkFJNWhG;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C47212tll.StateListAnimator stateListAnimator = C47212tll.Companion;
            Object obj2 = stateListAnimator.OLrzqt().get("pv");
            Intrinsics.copydefault(obj2, "");
            int iIntValue = ((Integer) obj2).intValue();
            Object obj3 = stateListAnimator.OLrzqt().get("ts");
            Intrinsics.copydefault(obj3, "");
            byte[] bArrDecode = Base64.decode((String) obj3, 0);
            Object obj4 = stateListAnimator.OLrzqt().get("cg");
            Intrinsics.copydefault(obj4, "");
            byte[] bArrDecode2 = Base64.decode((String) obj4, 0);
            try {
                interfaceC46999thkFJNWhG = OKRiskPayloadManager.copydefault.fJNWhG();
            } catch (Exception e) {
                OKRiskPayloadManager oKRiskPayloadManager = OKRiskPayloadManager.copydefault;
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                oKRiskPayloadManager.AEQbTJ("uploadDataMessage (Action.INSTALL - deviceMessage)", message);
            }
            if (interfaceC46999thkFJNWhG != null) {
                Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
                String str = this.$userId;
                String str2 = this.$did;
                String str3 = this.$channel;
                Intrinsics.copydefault((Object) str3);
                String strAEQbTJ = interfaceC46999thkFJNWhG.AEQbTJ(applicationOLrzqt, str, str2, str3, this.$timestamp, this.$deviceInfo, this.$dexId, bArrDecode2, 2, iIntValue, bArrDecode);
                String str4 = strAEQbTJ == null ? "" : strAEQbTJ;
                OKRiskPayloadManager oKRiskPayloadManager2 = OKRiskPayloadManager.copydefault;
                String str5 = this.$timestamp;
                String str6 = this.$sessionId;
                String strAuCTel = oKRiskPayloadManager2.AuCTel();
                this.label = 1;
                if (oKRiskPayloadManager2.OLrzqt(str5, str6, str4, 0, strAuCTel, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
