package com.okinc.business.defi.deeplink;

import android.content.Context;
import com.okinc.business.defi.biz.net.bean.ListChainResponse;
import com.okinc.business.defi.common.utils.ReferralManager;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C13411dKi;
import o.C13458dMb;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletReferralTokenDetailLinkHandler$executeLink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $acContext;
    final /* synthetic */ String $address;
    final /* synthetic */ String $chain;
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ C13411dKi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletReferralTokenDetailLinkHandler$executeLink$1(Context context, C13411dKi c13411dKi, String str, String str2, String str3, Continuation<? super DefiWalletReferralTokenDetailLinkHandler$executeLink$1> continuation) {
        super(2, continuation);
        this.$acContext = context;
        this.this$0 = c13411dKi;
        this.$chain = str;
        this.$address = str2;
        this.$code = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletReferralTokenDetailLinkHandler$executeLink$1(this.$acContext, this.this$0, this.$chain, this.$address, this.$code, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletReferralTokenDetailLinkHandler$executeLink$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("DefiWalletReferralTokenDetailLinkHandler", "Failed to get chain list: " + e.getMessage(), e);
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13934dbu c13934dbuDTwDnp = C13458dMb.EZpvd(this.$acContext).DTwDnp();
            this.label = 1;
            obj = c13934dbuDTwDnp.isConnected(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        if (abstractC43419rot.EZpvd() && (list = (List) abstractC43419rot.copydefault()) != null && (!list.isEmpty())) {
            ReferralManager instance$default = ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null);
            Object objCopydefault2 = abstractC43419rot.copydefault();
            Intrinsics.copydefault(objCopydefault2);
            instance$default.AEQbTJ((List<ListChainResponse>) objCopydefault2);
            C13411dKi c13411dKi = this.this$0;
            String str = this.$chain;
            String str2 = this.$address;
            String str3 = this.$code;
            Object objCopydefault3 = abstractC43419rot.copydefault();
            Intrinsics.copydefault(objCopydefault3);
            this.label = 2;
            if (c13411dKi.EZpvd(str, str2, str3, (List) objCopydefault3, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            pUU.valueOf("DefiWalletReferralTokenDetailLinkHandler", "Chain list API returned empty or failed");
            C13411dKi c13411dKi2 = this.this$0;
            String str4 = this.$chain;
            String str5 = this.$address;
            String str6 = this.$code;
            List<ListChainResponse> listAkhnZx = ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null).AkhnZx();
            this.label = 3;
            if (c13411dKi2.EZpvd(str4, str5, str6, listAkhnZx, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
