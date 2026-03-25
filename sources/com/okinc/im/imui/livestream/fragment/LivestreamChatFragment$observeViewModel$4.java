package com.okinc.im.imui.livestream.fragment;

import android.text.Editable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.okinc.uilab.edit.OKEditText;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33054mpH;
import o.C34041nPf;
import o.C35399nuc;
import o.C36536ocn;
import o.C55113xdn;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC36545ocw;
import o.nJT;
import o.rVN;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class LivestreamChatFragment$observeViewModel$4 extends SuspendLambda implements yHO<CoroutineScope, InterfaceC36545ocw, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C36536ocn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamChatFragment$observeViewModel$4(C36536ocn c36536ocn, Continuation<? super LivestreamChatFragment$observeViewModel$4> continuation) {
        super(3, continuation);
        this.this$0 = c36536ocn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, InterfaceC36545ocw interfaceC36545ocw, Continuation<? super Unit> continuation) {
        LivestreamChatFragment$observeViewModel$4 livestreamChatFragment$observeViewModel$4 = new LivestreamChatFragment$observeViewModel$4(this.this$0, continuation);
        livestreamChatFragment$observeViewModel$4.L$0 = interfaceC36545ocw;
        return livestreamChatFragment$observeViewModel$4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC36545ocw interfaceC36545ocw = (InterfaceC36545ocw) this.L$0;
            InterfaceC36545ocw.StateListAnimator stateListAnimator = InterfaceC36545ocw.StateListAnimator.KWHzl;
            if (!Intrinsics.EZpvd(interfaceC36545ocw, stateListAnimator)) {
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            }
            nJT njtCopydefault = this.this$0.copydefault();
            if (njtCopydefault != null) {
                C36536ocn c36536ocn = this.this$0;
                View view = njtCopydefault.KWHzl;
                Intrinsics.checkNotNullExpressionValue(view, "");
                InterfaceC36545ocw.ActionBar actionBar = InterfaceC36545ocw.ActionBar.copydefault;
                view.setVisibility((Intrinsics.EZpvd(interfaceC36545ocw, actionBar) || Intrinsics.EZpvd(interfaceC36545ocw, InterfaceC36545ocw.Dialog.EZpvd) || Intrinsics.EZpvd(interfaceC36545ocw, InterfaceC36545ocw.TaskDescription.OLrzqt)) ? 0 : 8);
                if (Intrinsics.EZpvd(interfaceC36545ocw, stateListAnimator)) {
                    ConstraintLayout root = njtCopydefault.AEQbTJ.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "");
                    root.setVisibility(8);
                    TextView root2 = njtCopydefault.fetchVPNInfo.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root2, "");
                    root2.setVisibility(8);
                } else if (Intrinsics.EZpvd(interfaceC36545ocw, InterfaceC36545ocw.Activity.OLrzqt)) {
                    ConstraintLayout root3 = njtCopydefault.AEQbTJ.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root3, "");
                    root3.setVisibility(0);
                    TextView root4 = njtCopydefault.fetchVPNInfo.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root4, "");
                    root4.setVisibility(8);
                    OKEditText oKEditText = njtCopydefault.AEQbTJ.EZpvd;
                    oKEditText.setFocusable(false);
                    oKEditText.setFocusableInTouchMode(false);
                    oKEditText.clearFocus();
                    LinearLayoutCompat linearLayoutCompat = njtCopydefault.AEQbTJ.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                    linearLayoutCompat.setVisibility(8);
                } else if (Intrinsics.EZpvd(interfaceC36545ocw, InterfaceC36545ocw.Dialog.EZpvd)) {
                    ConstraintLayout root5 = njtCopydefault.AEQbTJ.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root5, "");
                    root5.setVisibility(8);
                    TextView root6 = njtCopydefault.fetchVPNInfo.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root6, "");
                    root6.setVisibility(0);
                    njtCopydefault.fetchVPNInfo.OLrzqt.setText(c36536ocn.getString(C35399nuc.LoaderManager.updateVisuals));
                    njtCopydefault.fetchVPNInfo.OLrzqt.setGravity(17);
                } else if (Intrinsics.EZpvd(interfaceC36545ocw, InterfaceC36545ocw.TaskDescription.OLrzqt)) {
                    ConstraintLayout root7 = njtCopydefault.AEQbTJ.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root7, "");
                    root7.setVisibility(8);
                    TextView root8 = njtCopydefault.fetchVPNInfo.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root8, "");
                    root8.setVisibility(0);
                    njtCopydefault.fetchVPNInfo.OLrzqt.setText(c36536ocn.getString(C35399nuc.LoaderManager.requestPostMessageChannel));
                } else if (Intrinsics.EZpvd(interfaceC36545ocw, actionBar)) {
                    ConstraintLayout root9 = njtCopydefault.AEQbTJ.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root9, "");
                    root9.setVisibility(8);
                    TextView root10 = njtCopydefault.fetchVPNInfo.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root10, "");
                    root10.setVisibility(0);
                    njtCopydefault.fetchVPNInfo.OLrzqt.setText(c36536ocn.getString(C35399nuc.LoaderManager.getSerial));
                } else {
                    if (!(interfaceC36545ocw instanceof InterfaceC36545ocw.Application)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ConstraintLayout root11 = njtCopydefault.AEQbTJ.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root11, "");
                    root11.setVisibility(0);
                    TextView root12 = njtCopydefault.fetchVPNInfo.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root12, "");
                    root12.setVisibility(8);
                    OKEditText oKEditText2 = njtCopydefault.AEQbTJ.EZpvd;
                    oKEditText2.setFocusable(true);
                    oKEditText2.setFocusableInTouchMode(true);
                    oKEditText2.requestFocus();
                    C33054mpH.EZpvd(c36536ocn);
                    C34041nPf c34041nPf = njtCopydefault.AEQbTJ;
                    LinearLayoutCompat linearLayoutCompat2 = c34041nPf.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
                    Editable text = c34041nPf.EZpvd.getText();
                    linearLayoutCompat2.setVisibility((text == null || text.length() <= 0) ? 8 : 0);
                    C55113xdn c55113xdn = c34041nPf.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                    InterfaceC36545ocw.Application application = (InterfaceC36545ocw.Application) interfaceC36545ocw;
                    c55113xdn.setVisibility(application.AEQbTJ() ? 0 : 8);
                    ImageView imageView = c34041nPf.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    imageView.setVisibility(application.AEQbTJ() ^ true ? 0 : 8);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
