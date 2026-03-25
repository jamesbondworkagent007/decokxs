package com.okinc.im.picker;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.im.picker.viewmodel.MediaPickerPreviewViewModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC35726oBk;
import o.C33070mpX;
import o.C35399nuc;
import o.C52794wYp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.C56529yIt;
import o.nIF;
import o.pUU;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class MediaPickerPreviewActivity$initViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC35726oBk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPickerPreviewActivity$initViewModel$1(ActivityC35726oBk activityC35726oBk, Continuation<? super MediaPickerPreviewActivity$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC35726oBk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaPickerPreviewActivity$initViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaPickerPreviewActivity$initViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.picker.MediaPickerPreviewActivity$initViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ActivityC35726oBk this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC35726oBk activityC35726oBk, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC35726oBk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.im.picker.MediaPickerPreviewActivity$initViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04871 extends SuspendLambda implements Function2<MediaPickerPreviewViewModel.TaskDescription, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ActivityC35726oBk this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04871(ActivityC35726oBk activityC35726oBk, Continuation<? super C04871> continuation) {
                super(2, continuation);
                this.this$0 = activityC35726oBk;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04871 c04871 = new C04871(this.this$0, continuation);
                c04871.L$0 = obj;
                return c04871;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MediaPickerPreviewViewModel.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
                return ((C04871) create(taskDescription, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C52794wYp c52794wYp;
                String strAYXKKw;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    MediaPickerPreviewViewModel.TaskDescription taskDescription = (MediaPickerPreviewViewModel.TaskDescription) this.L$0;
                    if (!(taskDescription instanceof MediaPickerPreviewViewModel.TaskDescription.Activity)) {
                        if (!(taskDescription instanceof MediaPickerPreviewViewModel.TaskDescription.Application)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        MediaPickerPreviewViewModel.TaskDescription.Application application = (MediaPickerPreviewViewModel.TaskDescription.Application) taskDescription;
                        List<MediaPickerPreviewViewModel.MediaItem> listEZpvd = application.EZpvd();
                        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
                        Iterator<T> it = listEZpvd.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((MediaPickerPreviewViewModel.MediaItem) it.next()).AEQbTJ().toString());
                        }
                        pUU.KWHzl("MediaPickerPreviewActivity", "Previewing media: " + arrayList);
                        if (application.EZpvd().isEmpty()) {
                            this.this$0.djBIcL();
                        } else {
                            this.this$0.AhwBna().OLrzqt(application.EZpvd());
                            nIF nif = this.this$0.djBIcL;
                            if (nif != null && (c52794wYp = nif.EZpvd) != null) {
                                if (application.EZpvd().size() > 1) {
                                    C56529yIt c56529yIt = C56529yIt.KWHzl;
                                    strAYXKKw = String.format(Locale.getDefault(), "%s (%d)", Arrays.copyOf(new Object[]{C33070mpX.AYXKKw(C35399nuc.LoaderManager.ibrGus), C56443yFo.AEQbTJ(application.EZpvd().size())}, 2));
                                    Intrinsics.checkNotNullExpressionValue(strAYXKKw, "");
                                } else {
                                    strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.ibrGus);
                                }
                                c52794wYp.setText(strAYXKKw);
                            }
                            rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                        }
                    }
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
                StateFlow<MediaPickerPreviewViewModel.TaskDescription> stateFlowAEQbTJ = this.this$0.gEmmrt().AEQbTJ();
                C04871 c04871 = new C04871(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowAEQbTJ, c04871, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityC35726oBk activityC35726oBk = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC35726oBk, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC35726oBk, state, anonymousClass1, this) == objCopydefault) {
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
