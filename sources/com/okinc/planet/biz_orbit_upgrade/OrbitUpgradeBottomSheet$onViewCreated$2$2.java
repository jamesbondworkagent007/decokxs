package com.okinc.planet.biz_orbit_upgrade;

import android.widget.TextView;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import com.okinc.planet.serializer.PlanetNumericString;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C46367tRs;
import o.C46392tSq;
import o.C47501trL;
import o.C52761wXj;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.tAB;
import o.tNP;

/* JADX INFO: loaded from: classes10.dex */
public final class OrbitUpgradeBottomSheet$onViewCreated$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OrbitBeanResp $it;
    int label;
    final /* synthetic */ tAB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrbitUpgradeBottomSheet$onViewCreated$2$2(OrbitBeanResp orbitBeanResp, tAB tab, Continuation<? super OrbitUpgradeBottomSheet$onViewCreated$2$2> continuation) {
        super(2, continuation);
        this.$it = orbitBeanResp;
        this.this$0 = tab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrbitUpgradeBottomSheet$onViewCreated$2$2(this.$it, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrbitUpgradeBottomSheet$onViewCreated$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C46392tSq c46392tSq = C46392tSq.EZpvd;
            this.label = 1;
            if (c46392tSq.AEQbTJ(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        String balance = this.$it.getBalance();
        if (balance == null) {
            balance = "";
        }
        String strM8764formatLocalCurrencyaKjyv6w$default = C46367tRs.m8764formatLocalCurrencyaKjyv6w$default(PlanetNumericString.AEQbTJ(balance), null, null, 3, null);
        String targetBalance = this.$it.getTargetBalance();
        String strM8764formatLocalCurrencyaKjyv6w$default2 = C46367tRs.m8764formatLocalCurrencyaKjyv6w$default(PlanetNumericString.AEQbTJ(targetBalance != null ? targetBalance : ""), null, null, 3, null);
        tNP tnp = this.this$0.AEQbTJ;
        if (tnp != null && (textView4 = tnp.AkhnZx) != null) {
            textView4.setText(C33069mpW.copydefault(C47501trL.Fragment.aJZHYI, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strM8764formatLocalCurrencyaKjyv6w$default2))));
        }
        if (C33129mqd.djBIcL(this.$it.getBalance()) < C33129mqd.djBIcL(this.$it.getTargetBalance())) {
            tNP tnp2 = this.this$0.AEQbTJ;
            if (tnp2 != null && (textView3 = tnp2.isConnected) != null) {
                textView3.setText(C33069mpW.copydefault(C47501trL.Fragment.DPHsZd, C56424yEw.gEmmrt(C56390yDp.OLrzqt("currentAmt", strM8764formatLocalCurrencyaKjyv6w$default), C56390yDp.OLrzqt("goalAmt", strM8764formatLocalCurrencyaKjyv6w$default2))));
            }
        } else {
            tNP tnp3 = this.this$0.AEQbTJ;
            if (tnp3 != null && (textView2 = tnp3.isConnected) != null) {
                textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ));
            }
            tNP tnp4 = this.this$0.AEQbTJ;
            if (tnp4 != null && (textView = tnp4.isConnected) != null) {
                textView.setText(C33070mpX.AYXKKw(C47501trL.Fragment.DrNnAm));
            }
        }
        return Unit.INSTANCE;
    }
}
