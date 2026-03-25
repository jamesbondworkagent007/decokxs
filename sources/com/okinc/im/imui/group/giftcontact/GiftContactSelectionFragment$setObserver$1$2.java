package com.okinc.im.imui.group.giftcontact;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C34123nSg;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.nJC;
import o.rVN;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class GiftContactSelectionFragment$setObserver$1$2 extends SuspendLambda implements yHO<CoroutineScope, List<? extends GroupMemberInfo>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34123nSg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftContactSelectionFragment$setObserver$1$2(C34123nSg c34123nSg, Continuation<? super GiftContactSelectionFragment$setObserver$1$2> continuation) {
        super(3, continuation);
        this.this$0 = c34123nSg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, List<? extends GroupMemberInfo> list, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (List<GroupMemberInfo>) list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, List<GroupMemberInfo> list, Continuation<? super Unit> continuation) {
        GiftContactSelectionFragment$setObserver$1$2 giftContactSelectionFragment$setObserver$1$2 = new GiftContactSelectionFragment$setObserver$1$2(this.this$0, continuation);
        giftContactSelectionFragment$setObserver$1$2.L$0 = list;
        return giftContactSelectionFragment$setObserver$1$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            if (list != null) {
                C34123nSg c34123nSg = this.this$0;
                c34123nSg.OLrzqt((List<GroupMemberInfo>) list);
                boolean zIsEmpty = list.isEmpty();
                nJC njc = c34123nSg.KWHzl;
                if (njc == null) {
                    Intrinsics.gEmmrt("");
                    njc = null;
                }
                RecyclerView recyclerView = njc.KWHzl;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                recyclerView.setVisibility(zIsEmpty ^ true ? 0 : 8);
                nJC njc2 = c34123nSg.KWHzl;
                if (njc2 == null) {
                    Intrinsics.gEmmrt("");
                    njc2 = null;
                }
                C55173xeu c55173xeu = njc2.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                c55173xeu.setVisibility(zIsEmpty ? 0 : 8);
                rVN.reportFullyDrawn$default((Fragment) c34123nSg, true, (String) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
