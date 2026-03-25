package com.okinc.business.defi.common.ui;

import com.okinc.business.defi.common.ui.DefiImportWalletTypeDialogFragment$trackImportWalletSheetEvent$1;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C14494dmX;
import o.C14616don;
import o.C56391yDq;
import o.C56442yFn;
import o.dTU;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiImportWalletTypeDialogFragment$trackImportWalletSheetEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $buttonName;
    final /* synthetic */ String $event;
    Object L$0;
    int label;
    final /* synthetic */ C14616don this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiImportWalletTypeDialogFragment$trackImportWalletSheetEvent$1(C14616don c14616don, String str, String str2, Continuation<? super DefiImportWalletTypeDialogFragment$trackImportWalletSheetEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = c14616don;
        this.$event = str;
        this.$buttonName = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiImportWalletTypeDialogFragment$trackImportWalletSheetEvent$1(this.this$0, this.$event, this.$buttonName, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiImportWalletTypeDialogFragment$trackImportWalletSheetEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        final String str2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.gEmmrt()) {
                str = "onboarding";
            } else if (this.this$0.AuCTel() == 1) {
                str = "wallet_list_import";
            } else {
                str = this.this$0.AuCTel() == 2 ? "other" : null;
            }
            C14494dmX c14494dmX = C14494dmX.KWHzl;
            this.L$0 = str;
            this.label = 1;
            Object objEZpvd = c14494dmX.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            str2 = str;
            obj = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        final String str3 = (String) obj;
        String str4 = this.$event;
        final String str5 = this.$buttonName;
        dTU.onWeb3Event$default(str4, null, new Function1() { // from class: o.doF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return DefiImportWalletTypeDialogFragment$trackImportWalletSheetEvent$1.invokeSuspend$lambda$2(str2, str3, str5, (EventParamsList) obj2);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(String str, String str2, String str3, EventParamsList eventParamsList) {
        if (str != null) {
            eventParamsList.add(new EventParam("in_wallet_scene", str, true));
        }
        C14494dmX c14494dmX = C14494dmX.KWHzl;
        c14494dmX.OLrzqt(eventParamsList, str2);
        C14494dmX.addIsExchangeUserParam$default(c14494dmX, eventParamsList, false, 1, null);
        if (str3 != null) {
            eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str3, true));
        }
        return Unit.INSTANCE;
    }
}
