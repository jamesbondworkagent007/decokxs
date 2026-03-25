package com.okinc.business.defi.wallet.smart;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.wallet.bean.WalletCreatedData;
import com.okinc.business.defi.wallet.smart.AACreateUtils$createNormalOrTeeOrAAAccount$1$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C13458dMb;
import o.C13754dXa;
import o.C13758dXe;
import o.C13788dYh;
import o.C14140dfo;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.DialogC55112xdm;

/* JADX INFO: loaded from: classes5.dex */
public final class AACreateUtils$createNormalOrTeeOrAAAccount$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<WalletCreatedData, Unit> $callback;
    final /* synthetic */ FragmentActivity $context;
    final /* synthetic */ DialogC55112xdm $loadingDialog;
    final /* synthetic */ String $psw;
    final /* synthetic */ String $rootWalletId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.wallet.bean.WalletCreatedData, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AACreateUtils$createNormalOrTeeOrAAAccount$1$2(FragmentActivity fragmentActivity, String str, String str2, DialogC55112xdm dialogC55112xdm, Function1<? super WalletCreatedData, Unit> function1, Continuation<? super AACreateUtils$createNormalOrTeeOrAAAccount$1$2> continuation) {
        super(2, continuation);
        this.$context = fragmentActivity;
        this.$rootWalletId = str;
        this.$psw = str2;
        this.$loadingDialog = dialogC55112xdm;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AACreateUtils$createNormalOrTeeOrAAAccount$1$2(this.$context, this.$rootWalletId, this.$psw, this.$loadingDialog, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AACreateUtils$createNormalOrTeeOrAAAccount$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13758dXe c13758dXeIsConnected = C13458dMb.EZpvd(this.$context).isConnected();
            String str = this.$rootWalletId;
            String str2 = this.$psw;
            this.label = 1;
            obj = c13758dXeIsConnected.KWHzl(str, str2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null);
            String str3 = this.$rootWalletId;
            String str4 = this.$psw;
            final DialogC55112xdm dialogC55112xdm = this.$loadingDialog;
            final Function1<WalletCreatedData, Unit> function1 = this.$callback;
            instance$default.EZpvd(str3, str4, (FragmentManager) null, (24 & 8) != 0, (24 & 16) != 0, (Function1<? super AbstractC12782ctV, Unit>) new Function1() { // from class: o.fPw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return AACreateUtils$createNormalOrTeeOrAAAccount$1$2.invokeSuspend$lambda$0(dialogC55112xdm, function1, (AbstractC12782ctV) obj2);
                }
            });
        } else {
            this.$loadingDialog.dismiss();
            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.launchUnitdefault, 0, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(DialogC55112xdm dialogC55112xdm, Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        dialogC55112xdm.dismiss();
        function1.invoke(abstractC12782ctV != null ? C13788dYh.copydefault(abstractC12782ctV) : null);
        return Unit.INSTANCE;
    }
}
