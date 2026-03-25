package com.okinc.planet.biz_positions;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.okinc.planet.biz_positions.ProfileLatestRecordsFragment$initView$2$1;
import com.okinc.planet.biz_setting.TopPadding;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.AbstractC46197tLk;
import o.C33070mpX;
import o.C46095tHq;
import o.C46099tHu;
import o.C47501trL;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC46104tHz;
import o.rVN;
import o.tEF;
import o.tEH;
import o.tEM;
import o.tEV;
import o.tNO;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class ProfileLatestRecordsFragment$initView$2$1 extends SuspendLambda implements Function2<AbstractC46197tLk<? extends tEM.TaskDescription>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tEV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileLatestRecordsFragment$initView$2$1(tEV tev, Continuation<? super ProfileLatestRecordsFragment$initView$2$1> continuation) {
        super(2, continuation);
        this.this$0 = tev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfileLatestRecordsFragment$initView$2$1 profileLatestRecordsFragment$initView$2$1 = new ProfileLatestRecordsFragment$initView$2$1(this.this$0, continuation);
        profileLatestRecordsFragment$initView$2$1.L$0 = obj;
        return profileLatestRecordsFragment$initView$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AbstractC46197tLk<? extends tEM.TaskDescription> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return invoke2((AbstractC46197tLk<tEM.TaskDescription>) abstractC46197tLk, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AbstractC46197tLk<tEM.TaskDescription> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return ((ProfileLatestRecordsFragment$initView$2$1) create(abstractC46197tLk, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) this.L$0;
            if (abstractC46197tLk instanceof AbstractC46197tLk.Activity) {
                this.this$0.AEQbTJ().submitList(yDY.AhwBna());
                C46099tHu c46099tHu = this.this$0.copydefault;
                Throwable thEZpvd = ((AbstractC46197tLk.Activity) abstractC46197tLk).EZpvd();
                boolean zValueOf = this.this$0.valueOf();
                TopPadding topPadding = this.this$0.valueOf() ? TopPadding.None : TopPadding.Default;
                final tEV tev = this.this$0;
                c46099tHu.submitList(new InterfaceC46104tHz.TaskDescription(topPadding, 0.0f, new C46095tHq(null, null, null, null, false, new Function0() { // from class: o.tFj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ProfileLatestRecordsFragment$initView$2$1.invokeSuspend$lambda$0(tev);
                    }
                }, 31, null), zValueOf, false, thEZpvd, false, 82, null).valueOf());
                if (!this.this$0.gEmmrt) {
                    this.this$0.gEmmrt = true;
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                }
            } else if (abstractC46197tLk instanceof AbstractC46197tLk.Application) {
                AbstractC46197tLk.Application application = (AbstractC46197tLk.Application) abstractC46197tLk;
                if (((tEM.TaskDescription) application.copydefault()).KWHzl().isEmpty()) {
                    this.this$0.AEQbTJ().submitList(yDY.AhwBna());
                    this.this$0.copydefault.submitList(new InterfaceC46104tHz.StateListAnimator(null, this.this$0.valueOf() ? TopPadding.None : TopPadding.Default, 0.0f, null, C33070mpX.AYXKKw(C47501trL.Fragment.fetchVPNInfo), this.this$0.valueOf(), false, 0, false, 461, null).valueOf());
                } else {
                    tEH tehAEQbTJ = this.this$0.AEQbTJ();
                    List<tEF> listKWHzl = ((tEM.TaskDescription) application.copydefault()).KWHzl();
                    final tEV tev2 = this.this$0;
                    tehAEQbTJ.submitList(listKWHzl, new Runnable() { // from class: o.tFi
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProfileLatestRecordsFragment$initView$2$1.invokeSuspend$lambda$1(tev2);
                        }
                    });
                    this.this$0.copydefault.submitList(yDY.AhwBna());
                }
                if (!this.this$0.gEmmrt) {
                    this.this$0.gEmmrt = true;
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                }
            } else if (!(abstractC46197tLk instanceof AbstractC46197tLk.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(tEV tev) {
        tev.copydefault().AEQbTJ(tev.AhwBna, tev.AYXKKw, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(tEV tev) {
        tNO tnoOLrzqt;
        FrameLayout root;
        if (!tev.valueOf() || (tnoOLrzqt = tev.OLrzqt()) == null || (root = tnoOLrzqt.getRoot()) == null) {
            return;
        }
        root.requestLayout();
    }
}
