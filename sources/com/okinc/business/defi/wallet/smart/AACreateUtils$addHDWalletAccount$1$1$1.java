package com.okinc.business.defi.wallet.smart;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.wallet.smart.AACreateUtils$addHDWalletAccount$1$1$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC58260yxt;
import o.C13458dMb;
import o.C13754dXa;
import o.C13758dXe;
import o.C13786dYf;
import o.C14140dfo;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.DialogC55112xdm;

/* JADX INFO: loaded from: classes5.dex */
public final class AACreateUtils$addHDWalletAccount$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Function1<AbstractC12782ctV, Unit> $callback;
    final /* synthetic */ DialogC55112xdm $loadingDialog;
    final /* synthetic */ String $psw;
    final /* synthetic */ AbstractC12784ctX $rootWallet;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AACreateUtils$addHDWalletAccount$1$1$1(FragmentActivity fragmentActivity, AbstractC12784ctX abstractC12784ctX, String str, DialogC55112xdm dialogC55112xdm, Function1<? super AbstractC12782ctV, Unit> function1, Continuation<? super AACreateUtils$addHDWalletAccount$1$1$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$rootWallet = abstractC12784ctX;
        this.$psw = str;
        this.$loadingDialog = dialogC55112xdm;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AACreateUtils$addHDWalletAccount$1$1$1(this.$activity, this.$rootWallet, this.$psw, this.$loadingDialog, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AACreateUtils$addHDWalletAccount$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objKWHzl;
        AbstractC12784ctX abstractC12784ctX;
        Object objAwait;
        String str;
        final DialogC55112xdm dialogC55112xdm;
        final Function1<AbstractC12782ctV, Unit> function1;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13758dXe c13758dXeIsConnected = C13458dMb.EZpvd(this.$activity).isConnected();
            String strEZpvd = this.$rootWallet.EZpvd();
            String str2 = this.$psw;
            this.label = 1;
            objKWHzl = c13758dXeIsConnected.KWHzl(strEZpvd, str2, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.L$3;
                dialogC55112xdm = (DialogC55112xdm) this.L$2;
                String str3 = (String) this.L$1;
                abstractC12784ctX = (AbstractC12784ctX) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str = str3;
                objAwait = obj;
                Integer num = (Integer) objAwait;
                C14140dfo.TaskDescription taskDescription = C14140dfo.Companion;
                C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(taskDescription, null, 1, null);
                String strEZpvd2 = abstractC12784ctX.EZpvd();
                String strCreateWalletName$default = C14140dfo.createWalletName$default(C14140dfo.TaskDescription.getInstance$default(taskDescription, null, 1, null), null, num.intValue() + 1, false, 5, null);
                Intrinsics.copydefault(num);
                objM7377constructorimpl = Result.m7377constructorimpl(instance$default.OLrzqt(strEZpvd2, strCreateWalletName$default, num.intValue(), str, (C13786dYf) null, (FragmentManager) null, (64 & 64) != 0, (64 & 128) != 0, (Function1<? super AbstractC12782ctV, Unit>) new Function1() { // from class: o.fPo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return AACreateUtils$addHDWalletAccount$1$1$1.invokeSuspend$lambda$1$lambda$0(dialogC55112xdm, function1, (AbstractC12782ctV) obj2);
                    }
                }));
                Result.m7376boximpl(objM7377constructorimpl);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        if (!((Boolean) objKWHzl).booleanValue()) {
            this.$loadingDialog.dismiss();
            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.launchUnitdefault, 0, 1, (Object) null);
            return Unit.INSTANCE;
        }
        abstractC12784ctX = this.$rootWallet;
        String str4 = this.$psw;
        DialogC55112xdm dialogC55112xdm2 = this.$loadingDialog;
        Function1<AbstractC12782ctV, Unit> function12 = this.$callback;
        Result.Application application2 = Result.Companion;
        AbstractC58260yxt<Integer> abstractC58260yxtCopydefault = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).copydefault(abstractC12784ctX.EZpvd());
        this.L$0 = abstractC12784ctX;
        this.L$1 = str4;
        this.L$2 = dialogC55112xdm2;
        this.L$3 = function12;
        this.label = 2;
        objAwait = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
        if (objAwait == objCopydefault) {
            return objCopydefault;
        }
        str = str4;
        dialogC55112xdm = dialogC55112xdm2;
        function1 = function12;
        Integer num2 = (Integer) objAwait;
        C14140dfo.TaskDescription taskDescription2 = C14140dfo.Companion;
        C14140dfo instance$default2 = C14140dfo.TaskDescription.getInstance$default(taskDescription2, null, 1, null);
        String strEZpvd22 = abstractC12784ctX.EZpvd();
        String strCreateWalletName$default2 = C14140dfo.createWalletName$default(C14140dfo.TaskDescription.getInstance$default(taskDescription2, null, 1, null), null, num2.intValue() + 1, false, 5, null);
        Intrinsics.copydefault(num2);
        objM7377constructorimpl = Result.m7377constructorimpl(instance$default2.OLrzqt(strEZpvd22, strCreateWalletName$default2, num2.intValue(), str, (C13786dYf) null, (FragmentManager) null, (64 & 64) != 0, (64 & 128) != 0, (Function1<? super AbstractC12782ctV, Unit>) new Function1() { // from class: o.fPo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return AACreateUtils$addHDWalletAccount$1$1$1.invokeSuspend$lambda$1$lambda$0(dialogC55112xdm, function1, (AbstractC12782ctV) obj2);
            }
        }));
        Result.m7376boximpl(objM7377constructorimpl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(DialogC55112xdm dialogC55112xdm, Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        dialogC55112xdm.dismiss();
        function1.invoke(abstractC12782ctV);
        return Unit.INSTANCE;
    }
}
