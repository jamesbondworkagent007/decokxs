package com.okinc.business.market.market.fragment.watchlist;

import android.view.View;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C27931kIq;
import o.C46796tdt;
import o.C56391yDq;
import o.C56442yFn;
import o.kKI;
import o.pUU;
import o.qZH;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListQuoteFragment$updateContent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ kKI $parentFragment;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C27931kIq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListQuoteFragment$updateContent$2(C27931kIq c27931kIq, kKI kki, Continuation<? super GroupWatchListQuoteFragment$updateContent$2> continuation) {
        super(2, continuation);
        this.this$0 = c27931kIq;
        this.$parentFragment = kki;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupWatchListQuoteFragment$updateContent$2(this.this$0, this.$parentFragment, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupWatchListQuoteFragment$updateContent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:34:0x008e, B:36:0x0092, B:39:0x009e, B:41:0x00b8, B:43:0x00c2, B:28:0x006d, B:30:0x007e), top: B:61:0x000c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:34:0x008e, B:36:0x0092, B:39:0x009e, B:41:0x00b8, B:43:0x00c2, B:28:0x006d, B:30:0x007e), top: B:61:0x000c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        kKI kki;
        C27931kIq c27931kIq;
        C27931kIq c27931kIq2;
        C27931kIq c27931kIq3;
        kKI kki2;
        View viewFindViewById;
        View view;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Object obj2 = null;
        try {
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } catch (Throwable th2) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.fetchVPNInfo = true;
            kki = this.$parentFragment;
            c27931kIq = this.this$0;
            Result.Application application3 = Result.Companion;
            this.L$0 = kki;
            this.L$1 = c27931kIq;
            this.label = 1;
            if (DelayKt.delay(150L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c27931kIq2 = (C27931kIq) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    c27931kIq2.fIwbmz();
                    obj2 = Unit.INSTANCE;
                    Result.m7377constructorimpl(obj2);
                    this.this$0.fetchVPNInfo = false;
                    return Unit.INSTANCE;
                }
                c27931kIq3 = (C27931kIq) this.L$1;
                kki2 = (kKI) this.L$0;
                C56391yDq.AEQbTJ(obj);
                view = (View) obj;
                if (view == null) {
                    viewFindViewById = view.findViewById(qZH.StateListAnimator.DLGVGj);
                    pUU.KWHzl(c27931kIq3.getTAG(), "showEditCoachMark  scroll end start call registerFirstItem " + viewFindViewById);
                    if (viewFindViewById != null) {
                        kki2.KWHzl(viewFindViewById, new GroupWatchListQuoteFragment$updateContent$2$1$1$1$1(c27931kIq3));
                    } else {
                        viewFindViewById = null;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(viewFindViewById);
                    if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        obj2 = objM7377constructorimpl;
                    }
                    Result.m7377constructorimpl(obj2);
                    this.this$0.fetchVPNInfo = false;
                    return Unit.INSTANCE;
                }
                kki = kki2;
                c27931kIq = c27931kIq3;
                c27931kIq3 = c27931kIq;
                kki2 = kki;
                viewFindViewById = null;
                pUU.KWHzl(c27931kIq3.getTAG(), "showEditCoachMark  scroll end start call registerFirstItem " + viewFindViewById);
                if (viewFindViewById != null) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(viewFindViewById);
                if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                Result.m7377constructorimpl(obj2);
                this.this$0.fetchVPNInfo = false;
                return Unit.INSTANCE;
            }
            c27931kIq = (C27931kIq) this.L$1;
            kKI kki3 = (kKI) this.L$0;
            C56391yDq.AEQbTJ(obj);
            kki = kki3;
        }
        if (kki != null && kki.ejfBZ()) {
            pUU.KWHzl(c27931kIq.getTAG(), "showEditCoachMark start");
            Result.Application application4 = Result.Companion;
            pUU.KWHzl(c27931kIq.getTAG(), "showEditCoachMark start scroll");
            C46796tdt c46796tdtAhwBna = c27931kIq.AhwBna();
            if (c46796tdtAhwBna != null) {
                this.L$0 = kki;
                this.L$1 = c27931kIq;
                this.label = 2;
                Object objKWHzl = c27931kIq.KWHzl(c46796tdtAhwBna, (Continuation<? super View>) this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c27931kIq3 = c27931kIq;
                kki2 = kki;
                obj = objKWHzl;
                view = (View) obj;
                if (view == null) {
                }
            }
            c27931kIq3 = c27931kIq;
            kki2 = kki;
            viewFindViewById = null;
            pUU.KWHzl(c27931kIq3.getTAG(), "showEditCoachMark  scroll end start call registerFirstItem " + viewFindViewById);
            if (viewFindViewById != null) {
            }
            objM7377constructorimpl = Result.m7377constructorimpl(viewFindViewById);
            if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
            }
            Result.m7377constructorimpl(obj2);
            this.this$0.fetchVPNInfo = false;
            return Unit.INSTANCE;
        }
        this.L$0 = c27931kIq;
        this.L$1 = null;
        this.label = 3;
        if (DelayKt.delay(150L, this) == objCopydefault) {
            return objCopydefault;
        }
        c27931kIq2 = c27931kIq;
        c27931kIq2.fIwbmz();
        obj2 = Unit.INSTANCE;
        Result.m7377constructorimpl(obj2);
        this.this$0.fetchVPNInfo = false;
        return Unit.INSTANCE;
    }
}
