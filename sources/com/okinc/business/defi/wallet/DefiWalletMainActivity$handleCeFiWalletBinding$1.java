package com.okinc.business.defi.wallet;

import androidx.fragment.app.FragmentManager;
import com.okinc.wallet.api.WalletCefiBindingService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletMainActivity$handleCeFiWalletBinding$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $redirect;
    final /* synthetic */ String $requestId;
    final /* synthetic */ WalletCefiBindingService.Source $source;
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ DefiWalletMainActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMainActivity$handleCeFiWalletBinding$1(DefiWalletMainActivity defiWalletMainActivity, String str, String str2, WalletCefiBindingService.Source source, String str3, String str4, Continuation<? super DefiWalletMainActivity$handleCeFiWalletBinding$1> continuation) {
        super(2, continuation);
        this.this$0 = defiWalletMainActivity;
        this.$walletAddress = str;
        this.$chainId = str2;
        this.$source = source;
        this.$requestId = str3;
        this.$redirect = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletMainActivity$handleCeFiWalletBinding$1(this.this$0, this.$walletAddress, this.$chainId, this.$source, this.$requestId, this.$redirect, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletMainActivity$handleCeFiWalletBinding$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            WalletCefiBindingService walletCefiBindingService = (WalletCefiBindingService) C43251rlk.copydefault(WalletCefiBindingService.class);
            DefiWalletMainActivity defiWalletMainActivity = this.this$0;
            FragmentManager supportFragmentManager = defiWalletMainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            String str = this.$walletAddress;
            String str2 = this.$chainId;
            WalletCefiBindingService.Source source = this.$source;
            if (source == null) {
                source = WalletCefiBindingService.Source.NATIVE;
            }
            WalletCefiBindingService.FragmentManager fragmentManager = new WalletCefiBindingService.FragmentManager(str, str2, source, this.$requestId, this.$redirect);
            this.label = 1;
            if (WalletCefiBindingService.ActionBar.startCefiBindingProcess$default(walletCefiBindingService, defiWalletMainActivity, supportFragmentManager, fragmentManager, null, null, this, 24, null) == objCopydefault) {
                return objCopydefault;
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
