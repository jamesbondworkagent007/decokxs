package com.okinc.planet.biz_performance.copytrading;

import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.okinc.planet.biz_performance.data.UserProfileCopyTradingRes;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC46197tLk;
import o.C46189tLc;
import o.C46275tOh;
import o.C56391yDq;
import o.C56442yFn;
import o.C59534zip;
import o.rVN;
import o.tBB;

/* JADX INFO: loaded from: classes19.dex */
public final class ProfileCopyTradingFragment$initView$1$2 extends SuspendLambda implements Function2<AbstractC46197tLk<? extends C46189tLc>, Continuation<? super Unit>, Object> {
    final /* synthetic */ C46275tOh $this_requireBinding;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tBB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileCopyTradingFragment$initView$1$2(tBB tbb, C46275tOh c46275tOh, Continuation<? super ProfileCopyTradingFragment$initView$1$2> continuation) {
        super(2, continuation);
        this.this$0 = tbb;
        this.$this_requireBinding = c46275tOh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfileCopyTradingFragment$initView$1$2 profileCopyTradingFragment$initView$1$2 = new ProfileCopyTradingFragment$initView$1$2(this.this$0, this.$this_requireBinding, continuation);
        profileCopyTradingFragment$initView$1$2.L$0 = obj;
        return profileCopyTradingFragment$initView$1$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AbstractC46197tLk<? extends C46189tLc> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return invoke2((AbstractC46197tLk<C46189tLc>) abstractC46197tLk, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AbstractC46197tLk<C46189tLc> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return ((ProfileCopyTradingFragment$initView$1$2) create(abstractC46197tLk, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        PlanetBasicUserInfoResp planetBasicUserInfoRespEZpvd;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) this.L$0;
            if (abstractC46197tLk instanceof AbstractC46197tLk.Application) {
                if (this.this$0.copydefault()) {
                    LinearLayout linearLayout = this.$this_requireBinding.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                    linearLayout.setVisibility(0);
                    C59534zip c59534zip = this.this$0.copydefault;
                    C46189tLc c46189tLcAEQbTJ = this.this$0.KWHzl().AEQbTJ();
                    List<UserProfileCopyTradingRes> listAYXKKw = (c46189tLcAEQbTJ == null || (planetBasicUserInfoRespEZpvd = c46189tLcAEQbTJ.EZpvd()) == null) ? null : planetBasicUserInfoRespEZpvd.AYXKKw();
                    Intrinsics.copydefault(listAYXKKw);
                    c59534zip.setItems(listAYXKKw);
                    this.this$0.copydefault.notifyDataSetChanged();
                } else {
                    LinearLayout linearLayout2 = this.$this_requireBinding.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                    linearLayout2.setVisibility(8);
                }
                if (!this.this$0.EZpvd) {
                    this.this$0.EZpvd = true;
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                }
            } else if ((abstractC46197tLk instanceof AbstractC46197tLk.Activity) && !this.this$0.EZpvd) {
                this.this$0.EZpvd = true;
                rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
