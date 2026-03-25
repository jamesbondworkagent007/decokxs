package com.okinc.im.imui.group.joinreview.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.nUK;
import o.oDS;

/* JADX INFO: loaded from: classes18.dex */
public final class JoinReviewViewModel$submitApprovalReviews$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isApproved;
    final /* synthetic */ List<String> $selectedIds;
    Object L$0;
    int label;
    final /* synthetic */ JoinReviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinReviewViewModel$submitApprovalReviews$1(JoinReviewViewModel joinReviewViewModel, List<String> list, boolean z, Continuation<? super JoinReviewViewModel$submitApprovalReviews$1> continuation) {
        super(2, continuation);
        this.this$0 = joinReviewViewModel;
        this.$selectedIds = list;
        this.$isApproved = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JoinReviewViewModel$submitApprovalReviews$1(this.this$0, this.$selectedIds, this.$isApproved, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JoinReviewViewModel$submitApprovalReviews$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        oDS.Activity activity;
        oDS.Activity.StateListAnimator stateListAnimator;
        Object fragment;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.djBIcL.set("KEY_REQUEST_LIST", nUK.copydefault(this.this$0.ejfBZ(), this.$selectedIds, true));
            MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
            JoinReviewViewModel.Application applicationDjBIcL = this.this$0.djBIcL();
            this.label = 1;
            if (mutableStateFlow.emit(applicationDjBIcL, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    activity = (oDS.Activity) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    stateListAnimator = (oDS.Activity.StateListAnimator) activity;
                    if (stateListAnimator.OLrzqt()) {
                        if (this.this$0.fJNWhG().getValue().booleanValue()) {
                            fragment = new JoinReviewViewModel.ActionBar.Fragment(C33129mqd.gEmmrt(C56443yFo.KWHzl(this.this$0.fetchVPNInfo())), stateListAnimator.EZpvd());
                        } else {
                            fragment = JoinReviewViewModel.ActionBar.TaskDescription.copydefault;
                        }
                        MutableSharedFlow mutableSharedFlow = this.this$0.AEQbTJ;
                        this.L$0 = null;
                        this.label = 4;
                        if (mutableSharedFlow.emit(fragment, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                activity = (oDS.Activity) obj;
                if (!(activity instanceof oDS.Activity.StateListAnimator)) {
                    oDS.Activity.StateListAnimator stateListAnimator2 = (oDS.Activity.StateListAnimator) activity;
                    this.this$0.djBIcL.set("KEY_REQUEST_LIST", nUK.setLoading$default(nUK.AEQbTJ(this.this$0.ejfBZ(), stateListAnimator2.AEQbTJ()), null, false, 1, null));
                    this.this$0.djBIcL.set("KEY_REQUEST_FULL_TOTAL", C56443yFo.AEQbTJ(this.this$0.OLrzqt() - stateListAnimator2.AEQbTJ().size()));
                    MutableStateFlow mutableStateFlow2 = this.this$0.EZpvd;
                    JoinReviewViewModel.Application applicationDjBIcL2 = this.this$0.djBIcL();
                    this.L$0 = activity;
                    this.label = 3;
                    if (mutableStateFlow2.emit(applicationDjBIcL2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    stateListAnimator = (oDS.Activity.StateListAnimator) activity;
                    if (stateListAnimator.OLrzqt()) {
                    }
                    return Unit.INSTANCE;
                }
                if (!(activity instanceof oDS.Activity.Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.djBIcL.set("KEY_REQUEST_LIST", nUK.setLoading$default(this.this$0.ejfBZ(), null, false, 1, null));
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this.this$0), null, null, new AnonymousClass1(this.this$0, activity, null), 3, null);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        oDS ods = this.this$0.isConnected;
        long jFetchVPNInfo = this.this$0.fetchVPNInfo();
        List<String> list = this.$selectedIds;
        boolean z = this.$isApproved;
        this.label = 2;
        obj = ods.AEQbTJ(jFetchVPNInfo, list, z, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        activity = (oDS.Activity) obj;
        if (!(activity instanceof oDS.Activity.StateListAnimator)) {
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel$submitApprovalReviews$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ oDS.Activity $result;
        int label;
        final /* synthetic */ JoinReviewViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JoinReviewViewModel joinReviewViewModel, oDS.Activity activity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = joinReviewViewModel;
            this.$result = activity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$result, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                JoinReviewViewModel joinReviewViewModel = this.this$0;
                Throwable thCopydefault = ((oDS.Activity.Application) this.$result).copydefault();
                this.label = 1;
                if (joinReviewViewModel.EZpvd(thCopydefault, this) == objCopydefault) {
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
}
