package com.okinc.ok_kyc_core.presentation.views;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Choices;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputConditionalTextOrSelectAppModel;
import com.okinc.ok_kyc_core.presentation.views.InputConditionalTextOrSelectItemView$observe$1$1$9$1$1;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC42074rFj;
import o.C33070mpX;
import o.C33129mqd;
import o.C43662rtX;
import o.C52761wXj;
import o.C54957xaq;
import o.C55001xbh;
import o.C55008xbo;
import o.C55009xbp;
import o.C56391yDq;
import o.C56442yFn;
import o.rAX;
import o.rBF;
import o.rGL;
import o.rNB;
import o.rRH;

/* JADX INFO: loaded from: classes23.dex */
public final class InputConditionalTextOrSelectItemView$observe$1$1$9$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InputConditionalTextOrSelectAppModel $appModel;
    final /* synthetic */ rAX<String> $cur;
    final /* synthetic */ Ref.ObjectRef<List<rRH.TaskDescription>> $dataSet;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ Map<String, String> $queryMap;
    final /* synthetic */ Ref.ObjectRef<String> $uri;
    final /* synthetic */ AbstractC42074rFj $viewModel;
    int label;
    final /* synthetic */ rNB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputConditionalTextOrSelectItemView$observe$1$1$9$1$1(InputConditionalTextOrSelectAppModel inputConditionalTextOrSelectAppModel, rNB rnb, Ref.ObjectRef<List<rRH.TaskDescription>> objectRef, rAX<String> rax, AbstractC42074rFj abstractC42074rFj, Ref.ObjectRef<String> objectRef2, Map<String, String> map, FragmentManager fragmentManager, Continuation<? super InputConditionalTextOrSelectItemView$observe$1$1$9$1$1> continuation) {
        super(2, continuation);
        this.$appModel = inputConditionalTextOrSelectAppModel;
        this.this$0 = rnb;
        this.$dataSet = objectRef;
        this.$cur = rax;
        this.$viewModel = abstractC42074rFj;
        this.$uri = objectRef2;
        this.$queryMap = map;
        this.$fragmentManager = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InputConditionalTextOrSelectItemView$observe$1$1$9$1$1(this.$appModel, this.this$0, this.$dataSet, this.$cur, this.$viewModel, this.$uri, this.$queryMap, this.$fragmentManager, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InputConditionalTextOrSelectItemView$observe$1$1$9$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        C55009xbp c55009xbpFIwbmz;
        C54957xaq c54957xaqAEQbTJ2;
        C55001xbh c55001xbh2;
        String subtitle;
        String title;
        C55009xbp c55009xbpFIwbmz2;
        C55009xbp c55009xbpFIwbmz3;
        C55009xbp c55009xbpFIwbmz4;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$dataSet, this.$viewModel, this.$uri, this.$queryMap, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        String placeholder = this.$appModel.getPlaceholder();
        if (placeholder == null) {
            placeholder = this.this$0.AEQbTJ;
        }
        if (C33129mqd.KWHzl((Collection) this.$dataSet.element)) {
            this.this$0.copydefault = false;
            TypedValue typedValue = new TypedValue();
            this.this$0.getContext().getTheme().resolveAttribute(C43662rtX.Application.djBIcL, typedValue, true);
            C55008xbo c55008xbo = this.this$0.EZpvd.copydefault;
            if (c55008xbo != null && (c55009xbpFIwbmz4 = c55008xbo.fIwbmz()) != null) {
                C55009xbp.setIconImage$default(c55009xbpFIwbmz4, typedValue.resourceId, 0, 0, 0, 14, null);
            }
            C55008xbo c55008xbo2 = this.this$0.EZpvd.copydefault;
            if (c55008xbo2 != null && (c55009xbpFIwbmz3 = c55008xbo2.fIwbmz()) != null) {
                c55009xbpFIwbmz3.setImageTint(C33070mpX.copydefault(C52761wXj.Activity.GzAsTt));
            }
            C55008xbo c55008xbo3 = this.this$0.EZpvd.copydefault;
            if (c55008xbo3 != null && (c55009xbpFIwbmz2 = c55008xbo3.fIwbmz()) != null) {
                c55009xbpFIwbmz2.setInterceptEvent(true);
            }
            this.this$0.EZpvd.copydefault.setHintText(placeholder);
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            Context context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Choices choices = this.$appModel.getChoices();
            String str = (choices == null || (title = choices.getTitle()) == null) ? "" : title;
            Choices choices2 = this.$appModel.getChoices();
            String str2 = (choices2 == null || (subtitle = choices2.getSubtitle()) == null) ? "" : subtitle;
            Function0 function0 = new Function0() { // from class: o.rNN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return InputConditionalTextOrSelectItemView$observe$1$1$9$1$1.invokeSuspend$lambda$0(booleanRef);
                }
            };
            final rAX<String> rax = this.$cur;
            final Ref.ObjectRef<List<rRH.TaskDescription>> objectRef = this.$dataSet;
            final InputConditionalTextOrSelectAppModel inputConditionalTextOrSelectAppModel = this.$appModel;
            final rNB rnb = this.this$0;
            final rRH rrh = new rRH(context, str, str2, false, null, false, function0, new Function1() { // from class: o.rNP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return InputConditionalTextOrSelectItemView$observe$1$1$9$1$1.invokeSuspend$lambda$1(rax, objectRef, inputConditionalTextOrSelectAppModel, rnb, (rRH.TaskDescription) obj2);
                }
            }, 48, null);
            C55009xbp c55009xbpFIwbmz5 = this.this$0.EZpvd.copydefault.fIwbmz();
            if (c55009xbpFIwbmz5 != null) {
                final FragmentManager fragmentManager = this.$fragmentManager;
                final Ref.ObjectRef<List<rRH.TaskDescription>> objectRef2 = this.$dataSet;
                final rAX<String> rax2 = this.$cur;
                c55009xbpFIwbmz5.setOnClickListener(new View.OnClickListener() { // from class: o.rNO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        InputConditionalTextOrSelectItemView$observe$1$1$9$1$1.invokeSuspend$lambda$3(booleanRef, rrh, fragmentManager, objectRef2, rax2, view);
                    }
                });
            }
            if (this.this$0.OLrzqt && C33129mqd.OLrzqt((CharSequence) this.this$0.KWHzl) && C33129mqd.OLrzqt((CharSequence) this.this$0.AhwBna)) {
                this.this$0.OLrzqt = false;
                this.$cur.setValue(this.this$0.KWHzl);
                C55008xbo c55008xbo4 = this.this$0.EZpvd.copydefault;
                if (c55008xbo4 != null && (c55009xbpFIwbmz = c55008xbo4.fIwbmz()) != null && (c54957xaqAEQbTJ2 = c55009xbpFIwbmz.AEQbTJ()) != null && (c55001xbh2 = c54957xaqAEQbTJ2.AEQbTJ) != null) {
                    c55001xbh2.setText(this.this$0.AhwBna);
                }
                List<rRH.TaskDescription> list = this.$dataSet.element;
                rNB rnb2 = this.this$0;
                for (rRH.TaskDescription taskDescription : list) {
                    taskDescription.KWHzl(Intrinsics.EZpvd((Object) taskDescription.fetchVPNInfo(), (Object) rnb2.KWHzl));
                }
            }
        } else {
            this.this$0.copydefault = true;
            this.this$0.EZpvd.copydefault.setState(0);
            this.this$0.EZpvd.copydefault.setHintText(placeholder);
            C55001xbh c55001xbhAkhnZx = this.this$0.EZpvd.copydefault.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.addTextChangedListener(new rNB.ActionBar(this.this$0, this.$cur));
            }
            if (this.this$0.OLrzqt && C33129mqd.OLrzqt((CharSequence) this.this$0.KWHzl)) {
                this.this$0.OLrzqt = false;
                C55009xbp c55009xbpFIwbmz6 = this.this$0.EZpvd.copydefault.fIwbmz();
                if (c55009xbpFIwbmz6 != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz6.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
                    c55001xbh.setText(this.this$0.KWHzl);
                }
            }
            final C55009xbp c55009xbpFIwbmz7 = this.this$0.EZpvd.copydefault.fIwbmz();
            if (c55009xbpFIwbmz7 != null) {
                final AbstractC42074rFj abstractC42074rFj = this.$viewModel;
                final rAX<String> rax3 = this.$cur;
                c55009xbpFIwbmz7.setOnFocusChangeCallback(new Function1() { // from class: o.rNL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return InputConditionalTextOrSelectItemView$observe$1$1$9$1$1.invokeSuspend$lambda$6$lambda$5(c55009xbpFIwbmz7, abstractC42074rFj, rax3, ((java.lang.Boolean) obj2).booleanValue());
                    }
                });
            }
        }
        String label = this.$appModel.getLabel();
        if (label != null) {
            this.this$0.EZpvd.copydefault.setLabelText(label);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.views.InputConditionalTextOrSelectItemView$observe$1$1$9$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<List<rRH.TaskDescription>> $dataSet;
        final /* synthetic */ Map<String, String> $queryMap;
        final /* synthetic */ Ref.ObjectRef<String> $uri;
        final /* synthetic */ AbstractC42074rFj $viewModel;
        Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<List<rRH.TaskDescription>> objectRef, AbstractC42074rFj abstractC42074rFj, Ref.ObjectRef<String> objectRef2, Map<String, String> map, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$dataSet = objectRef;
            this.$viewModel = abstractC42074rFj;
            this.$uri = objectRef2;
            this.$queryMap = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$dataSet, this.$viewModel, this.$uri, this.$queryMap, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v6, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref.ObjectRef<List<rRH.TaskDescription>> objectRef;
            T t;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Ref.ObjectRef<List<rRH.TaskDescription>> objectRef2 = this.$dataSet;
                rBF rbfDjBIcL = ((rGL) this.$viewModel).gHZMYf().djBIcL();
                String str = this.$uri.element;
                Map<String, String> map = this.$queryMap;
                this.L$0 = objectRef2;
                this.label = 1;
                Object objAEQbTJ = rbfDjBIcL.AEQbTJ(str, map, "", this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                objectRef = objectRef2;
                t = objAEQbTJ;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                t = obj;
            }
            objectRef.element = t;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Ref.BooleanRef booleanRef) {
        booleanRef.element = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(rAX rax, Ref.ObjectRef objectRef, InputConditionalTextOrSelectAppModel inputConditionalTextOrSelectAppModel, rNB rnb, rRH.TaskDescription taskDescription) {
        C55009xbp c55009xbpFIwbmz;
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        if (Intrinsics.EZpvd((Object) rax.getValue(), (Object) taskDescription.fetchVPNInfo())) {
            return Unit.INSTANCE;
        }
        for (rRH.TaskDescription taskDescription2 : (List) objectRef.element) {
            if (!(taskDescription2 instanceof rRH.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            taskDescription2.KWHzl(Intrinsics.EZpvd((Object) taskDescription2.fetchVPNInfo(), (Object) taskDescription.fetchVPNInfo()));
        }
        rax.setValue(taskDescription.fetchVPNInfo());
        inputConditionalTextOrSelectAppModel.setValueName(taskDescription.values());
        C55008xbo c55008xbo = rnb.EZpvd.copydefault;
        if (c55008xbo != null && (c55009xbpFIwbmz = c55008xbo.fIwbmz()) != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
            c55001xbh.setText(taskDescription.values());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3(Ref.BooleanRef booleanRef, rRH rrh, FragmentManager fragmentManager, Ref.ObjectRef objectRef, rAX rax, View view) {
        if (booleanRef.element) {
            return;
        }
        booleanRef.element = true;
        rrh.showNow(fragmentManager, rRH.class.getCanonicalName());
        for (rRH.TaskDescription taskDescription : (Iterable) objectRef.element) {
            taskDescription.KWHzl(Intrinsics.EZpvd(taskDescription.fetchVPNInfo(), rax.getValue()));
        }
        rRH.updateDataSet$default(rrh, (List) objectRef.element, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$6$lambda$5(C55009xbp c55009xbp, AbstractC42074rFj abstractC42074rFj, rAX rax, boolean z) {
        int[] iArr = new int[2];
        c55009xbp.getLocationOnScreen(iArr);
        if (!z) {
            ((rGL) abstractC42074rFj).AwvSrB().setValue(0);
            rax.OLrzqt(true);
        } else {
            rGL rgl = (rGL) abstractC42074rFj;
            rgl.AwvSrB().setValue(Integer.valueOf(iArr[1] + c55009xbp.getMeasuredHeight()));
            rgl.OLrzqt(c55009xbp.getContext().getResources().getDimensionPixelSize(C43662rtX.StateListAnimator.copydefault));
        }
        return Unit.INSTANCE;
    }
}
