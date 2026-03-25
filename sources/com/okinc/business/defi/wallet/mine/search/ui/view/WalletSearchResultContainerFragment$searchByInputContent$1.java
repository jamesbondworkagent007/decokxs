package com.okinc.business.defi.wallet.mine.search.ui.view;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C16691eoh;
import o.C19155fvu;
import o.C55113xdn;
import o.C55173xeu;
import o.C55244xgL;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchResultContainerFragment$searchByInputContent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $inputContent;
    int label;
    final /* synthetic */ C19155fvu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSearchResultContainerFragment$searchByInputContent$1(C19155fvu c19155fvu, String str, Continuation<? super WalletSearchResultContainerFragment$searchByInputContent$1> continuation) {
        super(2, continuation);
        this.this$0 = c19155fvu;
        this.$inputContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSearchResultContainerFragment$searchByInputContent$1(this.this$0, this.$inputContent, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSearchResultContainerFragment$searchByInputContent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C55113xdn c55113xdn;
        ViewPager2 viewPager2;
        C55244xgL c55244xgL;
        C55173xeu c55173xeu;
        C55113xdn c55113xdn2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!Intrinsics.EZpvd((Object) this.this$0.djBIcL, (Object) this.$inputContent)) {
                this.this$0.djBIcL = this.$inputContent;
                C16691eoh c16691eoh = this.this$0.valueOf;
                if (c16691eoh != null && (c55113xdn2 = c16691eoh.AEQbTJ) != null) {
                    c55113xdn2.setVisibility(0);
                }
                C16691eoh c16691eoh2 = this.this$0.valueOf;
                if (c16691eoh2 != null && (c55173xeu = c16691eoh2.copydefault) != null) {
                    c55173xeu.setVisibility(8);
                }
                C16691eoh c16691eoh3 = this.this$0.valueOf;
                if (c16691eoh3 != null && (c55244xgL = c16691eoh3.OLrzqt) != null) {
                    c55244xgL.setVisibility(8);
                }
                C16691eoh c16691eoh4 = this.this$0.valueOf;
                if (c16691eoh4 != null && (viewPager2 = c16691eoh4.valueOf) != null) {
                    viewPager2.setVisibility(8);
                }
                C16691eoh c16691eoh5 = this.this$0.valueOf;
                if (c16691eoh5 != null && (c55113xdn = c16691eoh5.AEQbTJ) != null) {
                    c55113xdn.KWHzl(0L);
                }
                this.this$0.djBIcL().AYXKKw();
                this.this$0.AhwBna().valueOf();
                this.this$0.AhwBna().AEQbTJ(this.$inputContent);
                this.this$0.EZpvd().copydefault(this.$inputContent);
                this.this$0.djBIcL().KWHzl(this.$inputContent);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
