package com.okinc.business.defi.wallet.smart;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.bean.WalletCreatedData;
import com.okinc.business.defi.wallet.smart.AACreateUtils$addWalletAccount$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC12784ctX;
import o.C13754dXa;
import o.C56391yDq;
import o.C56442yFn;
import o.DialogC55112xdm;
import o.fAJ;
import o.fNC;

/* JADX INFO: loaded from: classes5.dex */
public final class AACreateUtils$addWalletAccount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Function2<WalletCreatedData, Integer, Unit> $callback;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ AbstractC12784ctX $rootWallet;
    final /* synthetic */ String $sourceFrom;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.business.defi.wallet.bean.WalletCreatedData, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AACreateUtils$addWalletAccount$1(FragmentActivity fragmentActivity, FragmentManager fragmentManager, AbstractC12784ctX abstractC12784ctX, String str, Function2<? super WalletCreatedData, ? super Integer, Unit> function2, Continuation<? super AACreateUtils$addWalletAccount$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$fragmentManager = fragmentManager;
        this.$rootWallet = abstractC12784ctX;
        this.$sourceFrom = str;
        this.$callback = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AACreateUtils$addWalletAccount$1(this.$activity, this.$fragmentManager, this.$rootWallet, this.$sourceFrom, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AACreateUtils$addWalletAccount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        DialogC55112xdm dialogC55112xdm;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            DialogC55112xdm dialogC55112xdm2 = new DialogC55112xdm(this.$activity, C13754dXa.LoaderManager.isConnected);
            dialogC55112xdm2.show();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AACreateUtils$addWalletAccount$1$result$1 aACreateUtils$addWalletAccount$1$result$1 = new AACreateUtils$addWalletAccount$1$result$1(this.$rootWallet, null);
            this.L$0 = dialogC55112xdm2;
            this.label = 1;
            Object objWithContext = BuildersKt.withContext(io2, aACreateUtils$addWalletAccount$1$result$1, this);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            dialogC55112xdm = dialogC55112xdm2;
            obj = objWithContext;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dialogC55112xdm = (DialogC55112xdm) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        dialogC55112xdm.dismiss();
        if (this.$fragmentManager.isStateSaved()) {
            return Unit.INSTANCE;
        }
        fAJ.TaskDescription taskDescription = fAJ.Companion;
        String strEZpvd = this.$rootWallet.EZpvd();
        String strAuCTel = this.$rootWallet.AuCTel();
        int iOrdinal = WalletType.HDWallet.ordinal();
        final String str = this.$sourceFrom;
        final FragmentManager fragmentManager = this.$fragmentManager;
        final FragmentActivity fragmentActivity = this.$activity;
        final AbstractC12784ctX abstractC12784ctX = this.$rootWallet;
        final Function2<WalletCreatedData, Integer, Unit> function2 = this.$callback;
        taskDescription.AEQbTJ((115 & 1) != 0 ? "" : strEZpvd, (115 & 2) != 0 ? "" : strAuCTel, iOrdinal, str, (115 & 16) != 0 ? true : zBooleanValue, (115 & 32) != 0, (115 & 64) != 0, new Function1() { // from class: o.fPp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return AACreateUtils$addWalletAccount$1.invokeSuspend$lambda$1(fragmentManager, fragmentActivity, abstractC12784ctX, str, function2, ((java.lang.Integer) obj2).intValue());
            }
        }).show(this.$fragmentManager, "AAAccountSelectFragment");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(FragmentManager fragmentManager, FragmentActivity fragmentActivity, AbstractC12784ctX abstractC12784ctX, String str, final Function2 function2, final int i) {
        fNC.OLrzqt.copydefault(fragmentManager, fragmentActivity, i, WalletType.HDWallet, abstractC12784ctX.EZpvd(), str, new Function1() { // from class: o.fPr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AACreateUtils$addWalletAccount$1.invokeSuspend$lambda$1$lambda$0(function2, i, (WalletCreatedData) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(Function2 function2, int i, WalletCreatedData walletCreatedData) {
        function2.invoke(walletCreatedData, Integer.valueOf(i));
        return Unit.INSTANCE;
    }
}
