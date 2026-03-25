package com.okinc.im.imui.messageV2.view.keyboard.sticker.view;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.messageV2.view.keyboard.sticker.viewmodel.StickerBoardViewModel;
import com.okinc.im.imui.sticker.model.StickerPackModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C36965oks;
import o.C55113xdn;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC36962okp;
import o.nKF;
import o.rVN;
import o.yDY;

/* JADX INFO: loaded from: classes23.dex */
public final class StickerBoardFragment$observeData$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C36965oks this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerBoardFragment$observeData$3(C36965oks c36965oks, Continuation<? super StickerBoardFragment$observeData$3> continuation) {
        super(2, continuation);
        this.this$0 = c36965oks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StickerBoardFragment$observeData$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StickerBoardFragment$observeData$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$observeData$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC36962okp, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C36965oks this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C36965oks c36965oks, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c36965oks;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC36962okp interfaceC36962okp, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC36962okp, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC36962okp interfaceC36962okp = (InterfaceC36962okp) this.L$0;
                if (interfaceC36962okp instanceof InterfaceC36962okp.Application) {
                    nKF nkf = this.this$0.AkhnZx;
                    if (nkf != null) {
                        LinearLayoutCompat linearLayoutCompat = nkf.AhwBna;
                        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                        linearLayoutCompat.setVisibility(8);
                        nkf.EZpvd.copydefault();
                        RecyclerView recyclerView = nkf.fetchVPNInfo;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                        recyclerView.setVisibility(0);
                        LinearLayoutCompat linearLayoutCompat2 = nkf.AkhnZx;
                        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
                        linearLayoutCompat2.setVisibility(0);
                    }
                    InterfaceC36962okp.Application application = (InterfaceC36962okp.Application) interfaceC36962okp;
                    this.this$0.djBIcL().AEQbTJ(application.EZpvd());
                    if ((!application.EZpvd().isEmpty()) && this.this$0.gEmmrt().AYXKKw().getValue() == null) {
                        StickerBoardViewModel stickerBoardViewModelGEmmrt = this.this$0.gEmmrt();
                        List<StickerPackModel> listEZpvd = application.EZpvd();
                        this.label = 1;
                        obj = stickerBoardViewModelGEmmrt.copydefault(listEZpvd, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                    return Unit.INSTANCE;
                }
                if (Intrinsics.EZpvd(interfaceC36962okp, InterfaceC36962okp.ActionBar.OLrzqt)) {
                    nKF nkf2 = this.this$0.AkhnZx;
                    if (nkf2 != null) {
                        LinearLayoutCompat linearLayoutCompat3 = nkf2.AhwBna;
                        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
                        linearLayoutCompat3.setVisibility(0);
                        C55113xdn c55113xdn = nkf2.EZpvd;
                        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                        c55113xdn.setVisibility(0);
                        C55113xdn.showLoading$default(nkf2.EZpvd, 0L, 1, null);
                        LinearLayoutCompat root = nkf2.copydefault.getRoot();
                        Intrinsics.checkNotNullExpressionValue(root, "");
                        root.setVisibility(8);
                        RecyclerView recyclerView2 = nkf2.fetchVPNInfo;
                        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                        recyclerView2.setVisibility(8);
                        LinearLayoutCompat linearLayoutCompat4 = nkf2.AkhnZx;
                        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat4, "");
                        linearLayoutCompat4.setVisibility(8);
                    }
                } else if (Intrinsics.EZpvd(interfaceC36962okp, InterfaceC36962okp.StateListAnimator.copydefault)) {
                    nKF nkf3 = this.this$0.AkhnZx;
                    if (nkf3 != null) {
                        C36965oks c36965oks = this.this$0;
                        LinearLayoutCompat linearLayoutCompat5 = nkf3.AhwBna;
                        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat5, "");
                        linearLayoutCompat5.setVisibility(0);
                        C55113xdn c55113xdn2 = nkf3.EZpvd;
                        Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                        c55113xdn2.setVisibility(8);
                        nkf3.EZpvd.copydefault();
                        LinearLayoutCompat root2 = nkf3.copydefault.getRoot();
                        Intrinsics.checkNotNullExpressionValue(root2, "");
                        root2.setVisibility(0);
                        RecyclerView recyclerView3 = nkf3.fetchVPNInfo;
                        Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
                        recyclerView3.setVisibility(8);
                        c36965oks.djBIcL().AEQbTJ(yDY.AhwBna());
                        LinearLayoutCompat linearLayoutCompat6 = nkf3.AkhnZx;
                        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat6, "");
                        linearLayoutCompat6.setVisibility(8);
                    }
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            StickerPackModel stickerPackModel = (StickerPackModel) obj;
            if (stickerPackModel != null) {
                this.this$0.gEmmrt().copydefault(stickerPackModel);
            }
            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<InterfaceC36962okp> stateFlowCopydefault = this.this$0.gEmmrt().copydefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowCopydefault, anonymousClass1, this) == objCopydefault) {
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
