package com.okinc.ok_kyc_core.presentation.views;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C33129mqd;
import o.C42358rPx;
import o.C56391yDq;
import o.C56442yFn;
import o.rBA;
import o.rGL;

/* JADX INFO: loaded from: classes23.dex */
public final class NewFileUploaderItemView$getOssImageUrl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $imageId;
    final /* synthetic */ long $uploadId;
    final /* synthetic */ rGL $viewModel;
    Object L$0;
    int label;
    final /* synthetic */ C42358rPx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewFileUploaderItemView$getOssImageUrl$1(C42358rPx c42358rPx, long j, rGL rgl, long j2, Continuation<? super NewFileUploaderItemView$getOssImageUrl$1> continuation) {
        super(2, continuation);
        this.this$0 = c42358rPx;
        this.$uploadId = j;
        this.$viewModel = rgl;
        this.$imageId = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewFileUploaderItemView$getOssImageUrl$1(this.this$0, this.$uploadId, this.$viewModel, this.$imageId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NewFileUploaderItemView$getOssImageUrl$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef2, this.$viewModel, this.$imageId, null);
            this.L$0 = objectRef2;
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
            objectRef = objectRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (C33129mqd.OLrzqt((CharSequence) objectRef.element)) {
            this.this$0.OLrzqt().OLrzqt.copydefault(this.$uploadId, (String) objectRef.element);
        } else {
            this.this$0.OLrzqt().OLrzqt.OLrzqt(this.$uploadId);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.views.NewFileUploaderItemView$getOssImageUrl$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $imageId;
        final /* synthetic */ Ref.ObjectRef<String> $imagePath;
        final /* synthetic */ rGL $viewModel;
        Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<String> objectRef, rGL rgl, long j, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$imagePath = objectRef;
            this.$viewModel = rgl;
            this.$imageId = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$imagePath, this.$viewModel, this.$imageId, continuation);
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
            Ref.ObjectRef<String> objectRef;
            T t;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Ref.ObjectRef<String> objectRef2 = this.$imagePath;
                rBA rbaGEmmrt = this.$viewModel.gHZMYf().gEmmrt();
                long j = this.$imageId;
                this.L$0 = objectRef2;
                this.label = 1;
                Object objAEQbTJ = rbaGEmmrt.AEQbTJ(j, this);
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
}
