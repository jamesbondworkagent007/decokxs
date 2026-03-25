package com.okinc.business.defi.wallet.smart;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.bean.WalletCreatedData;
import com.okinc.business.defi.wallet.smart.AACreateUtils$addWalletAccount$3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12784ctX;
import o.C12827cuN;
import o.C13754dXa;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.fAJ;
import o.fNC;

/* JADX INFO: loaded from: classes5.dex */
public final class AACreateUtils$addWalletAccount$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Function2<WalletCreatedData, Integer, Unit> $callback;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ AbstractC12784ctX $rootWallet;
    final /* synthetic */ String $sourceFrom;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.business.defi.wallet.bean.WalletCreatedData, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AACreateUtils$addWalletAccount$3(AbstractC12784ctX abstractC12784ctX, String str, FragmentManager fragmentManager, FragmentActivity fragmentActivity, Function2<? super WalletCreatedData, ? super Integer, Unit> function2, Continuation<? super AACreateUtils$addWalletAccount$3> continuation) {
        super(2, continuation);
        this.$rootWallet = abstractC12784ctX;
        this.$sourceFrom = str;
        this.$fragmentManager = fragmentManager;
        this.$activity = fragmentActivity;
        this.$callback = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AACreateUtils$addWalletAccount$3(this.$rootWallet, this.$sourceFrom, this.$fragmentManager, this.$activity, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AACreateUtils$addWalletAccount$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C12827cuN instance$default = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
            String strEZpvd = this.$rootWallet.EZpvd();
            this.label = 1;
            objOLrzqt = instance$default.OLrzqt(strEZpvd, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        final int iIntValue = ((Number) objOLrzqt).intValue();
        if (this.$rootWallet.DbNXlk() > this.$rootWallet.values() && this.$rootWallet.djBIcL()) {
            fAJ.TaskDescription taskDescription = fAJ.Companion;
            String strEZpvd2 = this.$rootWallet.EZpvd();
            String strAuCTel = this.$rootWallet.AuCTel();
            int iOrdinal = WalletType.MPCWallet.ordinal();
            String str = this.$sourceFrom;
            boolean zDjBIcL = this.$rootWallet.djBIcL();
            boolean z = this.$rootWallet.DbNXlk() > 0;
            final AbstractC12784ctX abstractC12784ctX = this.$rootWallet;
            final FragmentManager fragmentManager = this.$fragmentManager;
            final FragmentActivity fragmentActivity = this.$activity;
            final String str2 = this.$sourceFrom;
            final Function2<WalletCreatedData, Integer, Unit> function2 = this.$callback;
            taskDescription.AEQbTJ(strEZpvd2, strAuCTel, iOrdinal, str, zDjBIcL, false, z, new Function1() { // from class: o.fPt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return AACreateUtils$addWalletAccount$3.invokeSuspend$lambda$2(iIntValue, abstractC12784ctX, fragmentManager, fragmentActivity, str2, function2, ((java.lang.Integer) obj2).intValue());
                }
            }).show(this.$fragmentManager, "AAAccountSelectFragment");
        } else if (this.$rootWallet.djBIcL()) {
            fNC fnc = fNC.OLrzqt;
            FragmentManager fragmentManager2 = this.$fragmentManager;
            FragmentActivity fragmentActivity2 = this.$activity;
            WalletType walletType = WalletType.MPCWallet;
            String strEZpvd3 = this.$rootWallet.EZpvd();
            String str3 = this.$sourceFrom;
            final Function2<WalletCreatedData, Integer, Unit> function22 = this.$callback;
            fnc.copydefault(fragmentManager2, fragmentActivity2, 2, walletType, strEZpvd3, str3, new Function1() { // from class: o.fPu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return AACreateUtils$addWalletAccount$3.invokeSuspend$lambda$3(function22, (WalletCreatedData) obj2);
                }
            });
        } else if (this.$rootWallet.DbNXlk() > this.$rootWallet.values()) {
            if (iIntValue >= this.$rootWallet.DbNXlk()) {
                C55326xho.toast$default(C13754dXa.FragmentManager.fACtfg, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                return Unit.INSTANCE;
            }
            fNC fnc2 = fNC.OLrzqt;
            FragmentManager fragmentManager3 = this.$fragmentManager;
            FragmentActivity fragmentActivity3 = this.$activity;
            WalletType walletType2 = WalletType.MPCWallet;
            String strEZpvd4 = this.$rootWallet.EZpvd();
            String str4 = this.$sourceFrom;
            final Function2<WalletCreatedData, Integer, Unit> function23 = this.$callback;
            fnc2.copydefault(fragmentManager3, fragmentActivity3, 1, walletType2, strEZpvd4, str4, new Function1() { // from class: o.fPv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return AACreateUtils$addWalletAccount$3.invokeSuspend$lambda$4(function23, (WalletCreatedData) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(int i, AbstractC12784ctX abstractC12784ctX, FragmentManager fragmentManager, FragmentActivity fragmentActivity, String str, final Function2 function2, int i2) {
        if (i2 != 1) {
            fNC.OLrzqt.copydefault(fragmentManager, fragmentActivity, 2, WalletType.MPCWallet, abstractC12784ctX.EZpvd(), str, new Function1() { // from class: o.fPq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AACreateUtils$addWalletAccount$3.invokeSuspend$lambda$2$lambda$1(function2, (WalletCreatedData) obj);
                }
            });
        } else if (i < abstractC12784ctX.DbNXlk()) {
            fNC.OLrzqt.copydefault(fragmentManager, fragmentActivity, 1, WalletType.MPCWallet, abstractC12784ctX.EZpvd(), str, new Function1() { // from class: o.fPn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AACreateUtils$addWalletAccount$3.invokeSuspend$lambda$2$lambda$0(function2, (WalletCreatedData) obj);
                }
            });
        } else {
            C55326xho.toast$default(C13754dXa.FragmentManager.fACtfg, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$0(Function2 function2, WalletCreatedData walletCreatedData) {
        function2.invoke(walletCreatedData, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1(Function2 function2, WalletCreatedData walletCreatedData) {
        function2.invoke(walletCreatedData, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(Function2 function2, WalletCreatedData walletCreatedData) {
        function2.invoke(walletCreatedData, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4(Function2 function2, WalletCreatedData walletCreatedData) {
        function2.invoke(walletCreatedData, null);
        return Unit.INSTANCE;
    }
}
