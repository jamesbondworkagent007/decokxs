package com.okinc.planet.biz_positions;

import androidx.fragment.app.FragmentActivity;
import com.okinc.planet.biz_userprofile.data.PlanetTradeTypes;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C43251rlk;
import o.C46068tGq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC46387tSl;
import o.InterfaceC49317umK;
import o.tFJ;
import o.tRU;

/* JADX INFO: loaded from: classes19.dex */
public final class ProfilePositionsHistoryFragment$adapter$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C46068tGq $item;
    int label;
    final /* synthetic */ tFJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePositionsHistoryFragment$adapter$2$1$1(tFJ tfj, C46068tGq c46068tGq, Continuation<? super ProfilePositionsHistoryFragment$adapter$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = tfj;
        this.$item = c46068tGq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfilePositionsHistoryFragment$adapter$2$1$1(this.this$0, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfilePositionsHistoryFragment$adapter$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class);
            boolean zCopydefault = InterfaceC46387tSl.Companion.KWHzl().copydefault(null, this.this$0.values(), null);
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            String strValues = this.this$0.values();
            String string = PlanetTradeTypes.Swap.toString();
            String strAEQbTJ = this.$item.AEQbTJ();
            String strAEQbTJ2 = this.$item.AubY().AEQbTJ();
            boolean z = this.$item.AubY() instanceof tRU.ActionBar;
            String strAuCTel = this.$item.AuCTel();
            String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.OLrzqt(this.$item.zsXlph()));
            String strUzCIH = this.$item.uzCIH();
            String strDbNXlk = this.$item.DbNXlk();
            String strValues2 = this.$item.values();
            String strAkhnZx = this.this$0.AkhnZx();
            this.label = 1;
            if (interfaceC49317umK.OLrzqt(fragmentActivityRequireActivity, strValues, string, strAEQbTJ, strAEQbTJ2, z, strAuCTel, strGEmmrt, strUzCIH, strDbNXlk, strValues2, zCopydefault, strAkhnZx, this) == objCopydefault) {
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
