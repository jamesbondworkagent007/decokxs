package com.okinc.im.imui.group.announcement;

import android.text.Editable;
import com.okinc.im.imui.group.announcement.CreateEditNoticeActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C35399nuc;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.nHV;

/* JADX INFO: loaded from: classes18.dex */
public final class CreateEditNoticeActivity$observeData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CreateEditNoticeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateEditNoticeActivity$observeData$1(CreateEditNoticeActivity createEditNoticeActivity, Continuation<? super CreateEditNoticeActivity$observeData$1> continuation) {
        super(2, continuation);
        this.this$0 = createEditNoticeActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateEditNoticeActivity$observeData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateEditNoticeActivity$observeData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.group.announcement.CreateEditNoticeActivity$observeData$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ CreateEditNoticeActivity this$0;

        /* JADX INFO: renamed from: com.okinc.im.imui.group.announcement.CreateEditNoticeActivity$observeData$1$1$Application */
        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[CreateEditNoticeActivity.Mode.values().length];
                try {
                    iArr[CreateEditNoticeActivity.Mode.CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CreateEditNoticeActivity.Mode.EDIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CreateEditNoticeActivity createEditNoticeActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = createEditNoticeActivity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String string;
            Editable text;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                boolean z = this.Z$0;
                ((nHV) this.this$0.KWHzl()).copydefault.setLoading(z);
                ((nHV) this.this$0.KWHzl()).copydefault.setEnabled((z || (text = ((nHV) this.this$0.KWHzl()).AEQbTJ.getText()) == null || text.length() <= 0) ? false : true);
                C52794wYp c52794wYp = ((nHV) this.this$0.KWHzl()).copydefault;
                if (z) {
                    int i = Application.AEQbTJ[this.this$0.AEQbTJ.ordinal()];
                    if (i == 1) {
                        string = this.this$0.getString(C35399nuc.LoaderManager.iRgjgR);
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        string = this.this$0.getString(C35399nuc.LoaderManager.hfeTOA);
                    }
                } else {
                    int i2 = Application.AEQbTJ[this.this$0.AEQbTJ.ordinal()];
                    if (i2 == 1) {
                        string = this.this$0.getString(C35399nuc.LoaderManager.DcqEDu);
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        string = this.this$0.getString(C35399nuc.LoaderManager.gqOnQv);
                    }
                }
                c52794wYp.setText(string);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Boolean> stateFlowAYXKKw = this.this$0.OLrzqt().AYXKKw();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowAYXKKw, anonymousClass1, this) == objCopydefault) {
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
