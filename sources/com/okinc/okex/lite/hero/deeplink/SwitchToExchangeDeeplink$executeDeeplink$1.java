package com.okinc.okex.lite.hero.deeplink;

import android.content.Context;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.core.ok_app.api.bean.LiteNavigationTabEnum;
import com.okinc.okex.lite.hero.deeplink.SwitchToExchangeDeeplink$executeDeeplink$1;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.AbstractC33244msm;
import o.AbstractC43238rlX;
import o.C43251rlk;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC33171mrS;
import o.InterfaceC43294rma;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class SwitchToExchangeDeeplink$executeDeeplink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $acContext;
    final /* synthetic */ Map<String, Object> $params;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchToExchangeDeeplink$executeDeeplink$1(Context context, Map<String, ? extends Object> map, Continuation<? super SwitchToExchangeDeeplink$executeDeeplink$1> continuation) {
        super(2, continuation);
        this.$acContext = context;
        this.$params = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SwitchToExchangeDeeplink$executeDeeplink$1 switchToExchangeDeeplink$executeDeeplink$1 = new SwitchToExchangeDeeplink$executeDeeplink$1(this.$acContext, this.$params, continuation);
        switchToExchangeDeeplink$executeDeeplink$1.L$0 = obj;
        return switchToExchangeDeeplink$executeDeeplink$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwitchToExchangeDeeplink$executeDeeplink$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Boolean bool;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            pUU.copydefault("SwitchToExchangeDeeplink", "executeDeeplink");
            InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class);
            if (interfaceC33171mrS != null) {
                AbstractC33244msm.ActionBar actionBar = AbstractC33244msm.ActionBar.KWHzl;
                Context context = this.$acContext;
                Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("tab_type", LiteNavigationTabEnum.LITE_HOME));
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object objSwitchSubMode$default = InterfaceC33171mrS.Activity.switchSubMode$default(interfaceC33171mrS, actionBar, context, false, bundleBundleOf, this, 4, null);
                if (objSwitchSubMode$default == objCopydefault) {
                    return objCopydefault;
                }
                coroutineScope = coroutineScope2;
                obj = objSwitchSubMode$default;
            } else {
                coroutineScope = coroutineScope2;
                bool = null;
                pUU.copydefault("SwitchToExchangeDeeplink", "executeDeeplink succeed: " + bool);
                if (Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true))) {
                    return Unit.INSTANCE;
                }
                CoroutineScopeKt.ensureActive(coroutineScope);
                Object obj2 = this.$params.get("next");
                if (Intrinsics.EZpvd(obj2, (Object) FirebaseAnalytics.Event.LOGIN)) {
                    str = "okx://exchange/account/login";
                } else {
                    if (!Intrinsics.EZpvd(obj2, (Object) "register")) {
                        return Unit.INSTANCE;
                    }
                    str = "okx://exchange/account/register";
                }
                String str2 = str;
                pUU.copydefault("SwitchToExchangeDeeplink", "executeDeeplink nextLink: " + str2);
                InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.OLrzqt(InterfaceC43294rma.class);
                if (interfaceC43294rma != null) {
                    InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, this.$acContext, str2, null, new Function1() { // from class: o.suV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return SwitchToExchangeDeeplink$executeDeeplink$1.invokeSuspend$lambda$0((AbstractC43238rlX) obj3);
                        }
                    }, 4, null);
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        bool = (Boolean) obj;
        pUU.copydefault("SwitchToExchangeDeeplink", "executeDeeplink succeed: " + bool);
        if (Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true))) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(AbstractC43238rlX abstractC43238rlX) {
        pUU.copydefault("SwitchToExchangeDeeplink", "executeDeeplink processDeeplink done");
        return Unit.INSTANCE;
    }
}
