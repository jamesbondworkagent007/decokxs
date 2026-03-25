package com.okinc.business.defi.wallet.transfer;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C10854bwM;
import o.C20598gjs;
import o.C20634gkb;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class TransferSelectCoinFragment$registerAdapter$1$handleClickLogic$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    final /* synthetic */ C10854bwM $coinMeta;
    final /* synthetic */ C20598gjs $it;
    final /* synthetic */ C20634gkb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferSelectCoinFragment$registerAdapter$1$handleClickLogic$1(C20598gjs c20598gjs, C20634gkb c20634gkb, C10854bwM c10854bwM) {
        super(1, Intrinsics.StateListAnimator.class, "toReceiveCoin", "registerAdapter$lambda$32$handleClickLogic$toReceiveCoin(Lcom/okinc/business/defi/wallet/transfer/TransferCoinData;Lcom/okinc/business/defi/wallet/transfer/TransferSelectCoinFragment;Lcom/okinc/business/defi/biz/core/meta/CoinMeta;Ljava/lang/String;)V", 0);
        this.$it = c20598gjs;
        this.this$0 = c20634gkb;
        this.$coinMeta = c10854bwM;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C20634gkb.KWHzl(this.$it, this.this$0, this.$coinMeta, str);
    }
}
