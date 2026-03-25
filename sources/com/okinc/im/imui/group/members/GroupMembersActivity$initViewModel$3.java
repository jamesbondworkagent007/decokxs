package com.okinc.im.imui.group.members;

import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33869nIw;
import o.C33070mpX;
import o.C35399nuc;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.nWQ;
import o.pUU;
import o.wYC;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class GroupMembersActivity$initViewModel$3 extends SuspendLambda implements yHO<CoroutineScope, Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ nWQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupMembersActivity$initViewModel$3(nWQ nwq, Continuation<? super GroupMembersActivity$initViewModel$3> continuation) {
        super(3, continuation);
        this.this$0 = nwq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(CoroutineScope coroutineScope, Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(coroutineScope, bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(CoroutineScope coroutineScope, boolean z, Continuation<? super Unit> continuation) {
        GroupMembersActivity$initViewModel$3 groupMembersActivity$initViewModel$3 = new GroupMembersActivity$initViewModel$3(this.this$0, continuation);
        groupMembersActivity$initViewModel$3.Z$0 = z;
        return groupMembersActivity$initViewModel$3.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            pUU.KWHzl(this.this$0.getTAG(), "Edit Mode: " + z);
            AbstractC33869nIw abstractC33869nIw = (AbstractC33869nIw) this.this$0.KWHzl();
            if (z) {
                wYC wyc = abstractC33869nIw.KWHzl;
                Intrinsics.checkNotNullExpressionValue(wyc, "");
                wyc.setVisibility(8);
                ImageView imageView = abstractC33869nIw.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(8);
                ImageView imageView2 = abstractC33869nIw.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(0);
                C52794wYp c52794wYp = abstractC33869nIw.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                c52794wYp.setVisibility(0);
                abstractC33869nIw.DbNXlk.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.sILrnl));
                TextView textView = abstractC33869nIw.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
                TextView textView2 = abstractC33869nIw.isConnected;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(0);
            } else {
                wYC wyc2 = abstractC33869nIw.KWHzl;
                Intrinsics.checkNotNullExpressionValue(wyc2, "");
                wyc2.setVisibility(0);
                ImageView imageView3 = abstractC33869nIw.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(0);
                ImageView imageView4 = abstractC33869nIw.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(imageView4, "");
                imageView4.setVisibility(8);
                C52794wYp c52794wYp2 = abstractC33869nIw.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
                c52794wYp2.setVisibility(8);
                abstractC33869nIw.DbNXlk.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.UkuJRw));
                TextView textView3 = abstractC33869nIw.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(0);
                TextView textView4 = abstractC33869nIw.isConnected;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
