package com.okinc.dexkline.dexui.main.market.detail.fragment;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.market.bean.TokenInfoForAlert;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43033rhe;
import o.InterfaceC43036rhh;

/* JADX INFO: loaded from: classes15.dex */
public final class DexMarketDetailFragment$showPriceAlert$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DexMarketDetailFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexMarketDetailFragment$showPriceAlert$1(DexMarketDetailFragment dexMarketDetailFragment, Context context, Continuation<? super DexMarketDetailFragment$showPriceAlert$1> continuation) {
        super(2, continuation);
        this.this$0 = dexMarketDetailFragment;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexMarketDetailFragment$showPriceAlert$1(this.this$0, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DexMarketDetailFragment$showPriceAlert$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        DexMarketDetailFragment dexMarketDetailFragment;
        TokenInfoForAlert tokenInfoForAlert;
        Context context;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TokenInfoForAlert tokenInfoForAlertFetchVPNInfo = this.this$0.fetchVPNInfo();
            if (tokenInfoForAlertFetchVPNInfo != null) {
                dexMarketDetailFragment = this.this$0;
                Context context2 = this.$context;
                InterfaceC43036rhh interfaceC43036rhhAEQbTJ = ((InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class)).AEQbTJ();
                FragmentManager childFragmentManager = dexMarketDetailFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                this.L$0 = dexMarketDetailFragment;
                this.L$1 = context2;
                this.L$2 = tokenInfoForAlertFetchVPNInfo;
                this.label = 1;
                Object objOLrzqt = interfaceC43036rhhAEQbTJ.OLrzqt("", "", 2, tokenInfoForAlertFetchVPNInfo, childFragmentManager, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                tokenInfoForAlert = tokenInfoForAlertFetchVPNInfo;
                obj = objOLrzqt;
                context = context2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        TokenInfoForAlert tokenInfoForAlert2 = (TokenInfoForAlert) this.L$2;
        Context context3 = (Context) this.L$1;
        DexMarketDetailFragment dexMarketDetailFragment2 = (DexMarketDetailFragment) this.L$0;
        C56391yDq.AEQbTJ(obj);
        tokenInfoForAlert = tokenInfoForAlert2;
        context = context3;
        dexMarketDetailFragment = dexMarketDetailFragment2;
        if (((Boolean) obj).booleanValue()) {
            InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
            if (interfaceC43033rhe != null) {
                InterfaceC43033rhe.StateListAnimator.gotoAllPriceRemindActivity$default(interfaceC43033rhe, context, null, tokenInfoForAlert, 2, null);
            }
            dexMarketDetailFragment.AEQbTJ(true);
        }
        return Unit.INSTANCE;
    }
}
