package com.okinc.planet.biz_performance.assets;

import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.okinc.planet.biz_performance.assets.ProfileAssetsFragment$initView$2$1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC46197tLk;
import o.C46471tVo;
import o.C46500tWq;
import o.C47501trL;
import o.C55113xdn;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC46504tWu;
import o.rVN;
import o.tAU;
import o.tBG;
import o.tNU;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class ProfileAssetsFragment$initView$2$1 extends SuspendLambda implements Function2<AbstractC46197tLk<? extends List<? extends tBG>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ tNU $this_requireBinding;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tAU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAssetsFragment$initView$2$1(tNU tnu, tAU tau, Continuation<? super ProfileAssetsFragment$initView$2$1> continuation) {
        super(2, continuation);
        this.$this_requireBinding = tnu;
        this.this$0 = tau;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfileAssetsFragment$initView$2$1 profileAssetsFragment$initView$2$1 = new ProfileAssetsFragment$initView$2$1(this.$this_requireBinding, this.this$0, continuation);
        profileAssetsFragment$initView$2$1.L$0 = obj;
        return profileAssetsFragment$initView$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AbstractC46197tLk<? extends List<? extends tBG>> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return invoke2((AbstractC46197tLk<? extends List<tBG>>) abstractC46197tLk, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AbstractC46197tLk<? extends List<tBG>> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return ((ProfileAssetsFragment$initView$2$1) create(abstractC46197tLk, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) this.L$0;
            if (abstractC46197tLk instanceof AbstractC46197tLk.Activity) {
                C55113xdn c55113xdn = this.$this_requireBinding.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(8);
                LinearLayout linearLayout = this.$this_requireBinding.EZpvd;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(8);
                C46471tVo c46471tVo = this.$this_requireBinding.KWHzl;
                Throwable thEZpvd = ((AbstractC46197tLk.Activity) abstractC46197tLk).EZpvd();
                final tAU tau = this.this$0;
                c46471tVo.setNetworkError(thEZpvd, new Function0() { // from class: o.tBa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ProfileAssetsFragment$initView$2$1.invokeSuspend$lambda$0(tau);
                    }
                });
                this.this$0.EZpvd().EZpvd(yDY.AhwBna());
                if (!this.this$0.copydefault) {
                    this.this$0.copydefault = true;
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                }
            } else if (abstractC46197tLk instanceof AbstractC46197tLk.StateListAnimator) {
                C55113xdn c55113xdn2 = this.$this_requireBinding.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                c55113xdn2.setVisibility(0);
                LinearLayout linearLayout2 = this.$this_requireBinding.EZpvd;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                linearLayout2.setVisibility(8);
            } else {
                if (!(abstractC46197tLk instanceof AbstractC46197tLk.Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                C55113xdn c55113xdn3 = this.$this_requireBinding.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                c55113xdn3.setVisibility(8);
                LinearLayout linearLayout3 = this.$this_requireBinding.EZpvd;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                linearLayout3.setVisibility(0);
                AbstractC46197tLk.Application application = (AbstractC46197tLk.Application) abstractC46197tLk;
                boolean zIsEmpty = ((List) application.copydefault()).isEmpty();
                C46471tVo c46471tVo2 = this.$this_requireBinding.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c46471tVo2, "");
                c46471tVo2.setVisibility(zIsEmpty ? 0 : 8);
                if (zIsEmpty) {
                    C46471tVo.setEmpty$default(this.$this_requireBinding.KWHzl, C47501trL.Fragment.fetchVPNInfo, null, null, 6, null);
                    this.this$0.EZpvd().EZpvd(yDY.AhwBna());
                } else {
                    C46500tWq c46500tWq = this.$this_requireBinding.AEQbTJ;
                    List<? extends InterfaceC46504tWu> list = (List) application.copydefault();
                    final tAU tau2 = this.this$0;
                    C56443yFo.KWHzl(c46500tWq.EZpvd(list, true, new Function1() { // from class: o.tBb
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return ProfileAssetsFragment$initView$2$1.invokeSuspend$lambda$1(tau2, (java.util.List) obj2);
                        }
                    }));
                }
                if (!this.this$0.copydefault) {
                    this.this$0.copydefault = true;
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(tAU tau) {
        tau.valueOf().EZpvd();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(tAU tau, List list) {
        tau.EZpvd().EZpvd(list);
        return Unit.INSTANCE;
    }
}
