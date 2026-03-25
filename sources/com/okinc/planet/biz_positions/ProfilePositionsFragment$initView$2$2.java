package com.okinc.planet.biz_positions;

import androidx.fragment.app.Fragment;
import com.okinc.planet.biz_positions.ProfilePositionsFragment$initView$2$2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.AbstractC46197tLk;
import o.C33070mpX;
import o.C46036tFl;
import o.C46043tFs;
import o.C46095tHq;
import o.C46098tHt;
import o.C47501trL;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC46072tGu;
import o.InterfaceC46104tHz;
import o.rVN;
import o.tNV;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class ProfilePositionsFragment$initView$2$2 extends SuspendLambda implements Function2<AbstractC46197tLk<? extends List<? extends InterfaceC46072tGu>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ tNV $this_requireBinding;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C46043tFs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePositionsFragment$initView$2$2(tNV tnv, C46043tFs c46043tFs, Continuation<? super ProfilePositionsFragment$initView$2$2> continuation) {
        super(2, continuation);
        this.$this_requireBinding = tnv;
        this.this$0 = c46043tFs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfilePositionsFragment$initView$2$2 profilePositionsFragment$initView$2$2 = new ProfilePositionsFragment$initView$2$2(this.$this_requireBinding, this.this$0, continuation);
        profilePositionsFragment$initView$2$2.L$0 = obj;
        return profilePositionsFragment$initView$2$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC46197tLk<? extends List<? extends InterfaceC46072tGu>> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return ((ProfilePositionsFragment$initView$2$2) create(abstractC46197tLk, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<InterfaceC46104tHz> listValueOf;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) this.L$0;
            boolean z = false;
            if (abstractC46197tLk instanceof AbstractC46197tLk.Activity) {
                this.$this_requireBinding.copydefault.AEQbTJ(false);
                this.this$0.KWHzl().submitList(yDY.AhwBna());
                C46098tHt c46098tHtAYXKKw = this.this$0.AYXKKw();
                Throwable thEZpvd = ((AbstractC46197tLk.Activity) abstractC46197tLk).EZpvd();
                final C46043tFs c46043tFs = this.this$0;
                c46098tHtAYXKKw.submitList(new InterfaceC46104tHz.TaskDescription(null, 0.0f, new C46095tHq(null, null, null, null, false, new Function0() { // from class: o.tFM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ProfilePositionsFragment$initView$2$2.invokeSuspend$lambda$0(c46043tFs);
                    }
                }, 31, null), true, false, thEZpvd, false, 83, null).valueOf());
                if (!this.this$0.djBIcL) {
                    this.this$0.djBIcL = true;
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                }
            } else if (!(abstractC46197tLk instanceof AbstractC46197tLk.StateListAnimator)) {
                if (!(abstractC46197tLk instanceof AbstractC46197tLk.Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC46197tLk.Application application = (AbstractC46197tLk.Application) abstractC46197tLk;
                List listAhwBna = (List) application.copydefault();
                Iterable iterable = (Iterable) application.copydefault();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((InterfaceC46072tGu) it.next()) instanceof InterfaceC46072tGu.Activity) {
                            z = true;
                            break;
                        }
                    }
                }
                this.$this_requireBinding.copydefault.AEQbTJ(z);
                C46036tFl c46036tFlKWHzl = this.this$0.KWHzl();
                if (!z) {
                    listAhwBna = yDY.AhwBna();
                }
                c46036tFlKWHzl.submitList(listAhwBna);
                C46098tHt c46098tHtAYXKKw2 = this.this$0.AYXKKw();
                if (z) {
                    listValueOf = yDY.AhwBna();
                } else {
                    listValueOf = new InterfaceC46104tHz.StateListAnimator(null, null, 0.0f, null, C33070mpX.AYXKKw(C47501trL.Fragment.QOLQEE), true, false, 0, false, 463, null).valueOf();
                }
                c46098tHtAYXKKw2.submitList(listValueOf);
                if (!this.this$0.djBIcL) {
                    this.this$0.djBIcL = true;
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C46043tFs c46043tFs) {
        c46043tFs.DbNXlk();
        return Unit.INSTANCE;
    }
}
