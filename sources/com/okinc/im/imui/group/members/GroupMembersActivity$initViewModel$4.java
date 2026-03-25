package com.okinc.im.imui.group.members;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.group.members.GroupMembersActivity$initViewModel$4;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33869nIw;
import o.C56391yDq;
import o.C56442yFn;
import o.nWQ;
import o.nXY;
import o.yHO;

/* JADX INFO: loaded from: classes23.dex */
public final class GroupMembersActivity$initViewModel$4 extends SuspendLambda implements yHO<CoroutineScope, List<? extends GroupMemberInfo>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nWQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupMembersActivity$initViewModel$4(nWQ nwq, Continuation<? super GroupMembersActivity$initViewModel$4> continuation) {
        super(3, continuation);
        this.this$0 = nwq;
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
        GroupMembersActivity$initViewModel$4 groupMembersActivity$initViewModel$4 = new GroupMembersActivity$initViewModel$4(this.this$0, continuation);
        groupMembersActivity$initViewModel$4.L$0 = list;
        return groupMembersActivity$initViewModel$4.invokeSuspend(Unit.INSTANCE);
    }

    public static final class ActionBar implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ List AEQbTJ;
        public final /* synthetic */ AbstractC33869nIw KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ ViewTreeObserver copydefault;

        public ActionBar(ViewTreeObserver viewTreeObserver, View view, AbstractC33869nIw abstractC33869nIw, List list) {
            this.copydefault = viewTreeObserver;
            this.OLrzqt = view;
            this.KWHzl = abstractC33869nIw;
            this.AEQbTJ = list;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.copydefault.isAlive() ? this.copydefault : this.OLrzqt.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            RecyclerView recyclerView = this.KWHzl.AhwBna;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(this.AEQbTJ.isEmpty() ^ true ? 0 : 8);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            final List list = (List) this.L$0;
            nXY nxyEZpvd = this.this$0.EZpvd();
            final nWQ nwq = this.this$0;
            nxyEZpvd.OLrzqt(list, new Function0() { // from class: o.nXe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return GroupMembersActivity$initViewModel$4.invokeSuspend$lambda$2(nwq, list);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit invokeSuspend$lambda$2(nWQ nwq, List list) {
        AbstractC33869nIw abstractC33869nIw = (AbstractC33869nIw) nwq.KWHzl();
        RecyclerView recyclerView = abstractC33869nIw.AhwBna;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        ViewTreeObserver viewTreeObserver = recyclerView.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new ActionBar(viewTreeObserver, recyclerView, abstractC33869nIw, list));
        return Unit.INSTANCE;
    }
}
