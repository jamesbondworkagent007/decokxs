package com.okinc.auth.impl.facerecognition.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class FaceRecognitionViewModel$getFaceRecognitionResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ FaceRecognitionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceRecognitionViewModel$getFaceRecognitionResult$1(FaceRecognitionViewModel faceRecognitionViewModel, Continuation<? super FaceRecognitionViewModel$getFaceRecognitionResult$1> continuation) {
        super(2, continuation);
        this.this$0 = faceRecognitionViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FaceRecognitionViewModel$getFaceRecognitionResult$1 faceRecognitionViewModel$getFaceRecognitionResult$1 = new FaceRecognitionViewModel$getFaceRecognitionResult$1(this.this$0, continuation);
        faceRecognitionViewModel$getFaceRecognitionResult$1.L$0 = obj;
        return faceRecognitionViewModel$getFaceRecognitionResult$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FaceRecognitionViewModel$getFaceRecognitionResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r13.label
            r2 = 2
            r3 = 3
            r4 = 0
            r5 = 1
            r6 = 0
            java.lang.String r7 = "FaceRecognitionViewModel"
            java.lang.String r8 = ""
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L29
            if (r1 == r2) goto L20
            if (r1 != r3) goto L18
            goto L24
        L18:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L20:
            java.lang.Object r0 = r13.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
        L24:
            o.C56391yDq.AEQbTJ(r14)
            goto L1ba
        L29:
            java.lang.Object r1 = r13.L$2
            com.okinc.auth.impl.facerecognition.model.FaceVerifyCreateSessionResponse r1 = (com.okinc.auth.impl.facerecognition.model.FaceVerifyCreateSessionResponse) r1
            java.lang.Object r3 = r13.L$1
            com.okinc.auth.impl.facerecognition.ui.FaceRecognitionViewModel r3 = (com.okinc.auth.impl.facerecognition.ui.FaceRecognitionViewModel) r3
            java.lang.Object r9 = r13.L$0
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            o.C56391yDq.AEQbTJ(r14)     // Catch: java.lang.Exception -> L39
            goto L9a
        L39:
            r14 = move-exception
            goto L14c
        L3c:
            o.C56391yDq.AEQbTJ(r14)
            java.lang.Object r14 = r13.L$0
            r9 = r14
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            com.okinc.auth.impl.facerecognition.ui.FaceRecognitionViewModel r14 = r13.this$0
            com.okinc.auth.api.facerecognition.FacialRecognitionRequest r14 = com.okinc.auth.impl.facerecognition.ui.FaceRecognitionViewModel.KWHzl(r14)
            if (r14 == 0) goto L199
            com.okinc.auth.impl.facerecognition.ui.FaceRecognitionViewModel r3 = r13.this$0
            java.lang.String r1 = "getFaceRecognitionResult"
            o.pUU.KWHzl(r7, r1)
            androidx.lifecycle.MutableLiveData r1 = com.okinc.auth.impl.facerecognition.ui.FaceRecognitionViewModel.EZpvd(r3)
            java.lang.Object r1 = r1.getValue()
            com.okinc.auth.impl.facerecognition.model.FaceVerifyCreateSessionResponse r1 = (com.okinc.auth.impl.facerecognition.model.FaceVerifyCreateSessionResponse) r1
            if (r1 != 0) goto L62
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L62:
            androidx.lifecycle.MutableLiveData r10 = com.okinc.auth.impl.facerecognition.ui.FaceRecognitionViewModel.gEmmrt(r3)
            o.mnw r11 = new o.mnw
            java.lang.Boolean r12 = o.C56443yFo.KWHzl(r5)
            r11.<init>(r12)
            r10.setValue(r11)
            o.aBx r10 = com.okinc.auth.impl.facerecognition.ui.FaceRecognitionViewModel.OLrzqt(r3)     // Catch: java.lang.Exception -> L39
            androidx.lifecycle.MutableLiveData r11 = com.okinc.auth.impl.facerecognition.ui.FaceRecognitionViewModel.EZpvd(r3)     // Catch: java.lang.Exception -> L39
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Exception -> L39
            com.okinc.auth.impl.facerecognition.model.FaceVerifyCreateSessionResponse r11 = (com.okinc.auth.impl.facerecognition.model.FaceVerifyCreateSessionResponse) r11     // Catch: java.lang.Exception -> L39
            if (r11 == 0) goto L87
            java.lang.String r11 = r11.OLrzqt()     // Catch: java.lang.Exception -> L39
            goto L88
        L87:
            r11 = r4
        L88:
            if (r11 != 0) goto L8b
            r11 = r8
        L8b:
            r13.L$0 = r9     // Catch: java.lang.Exception -> L39
            r13.L$1 = r3     // Catch: java.lang.Exception -> L39
            r13.L$2 = r1     // Catch: java.lang.Exception -> L39
            r13.label = r5     // Catch: java.lang.Exception -> L39
            java.lang.Object r14 = r10.KWHzl(r14, r11, r13)     // Catch: java.lang.Exception -> L39
            if (r14 != r0) goto L9a
            return r0
        L9a:
            o.aBx$Application r14 = (o.C5731aBx.Application) r14     // Catch: java.lang.Exception -> L39
            androidx.lifecycle.MutableLiveData r10 = com.okinc.auth.impl.facerecognition.ui.FaceRecognitionViewModel.gEmmrt(r3)     // Catch: java.lang.Exception -> L39
            o.mnw r11 = new o.mnw     // Catch: java.lang.Exception -> L39
            java.lang.Boolean r12 = o.C56443yFo.KWHzl(r6)     // Catch: java.lang.Exception -> L39
            r11.<init>(r12)     // Catch: java.lang.Exception -> L39
            r10.setValue(r11)     // Catch: java.lang.Exception -> L39
            boolean r10 = r14 instanceof o.C5731aBx.Application.TaskDescription     // Catch: java.lang.Exception -> L39
            if (r10 == 0) goto L100
            o.aBx$Application$TaskDescription r14 = (o.C5731aBx.Application.TaskDescription) r14     // Catch: java.lang.Exception -> L39
            java.lang.String r14 = r14.OLrzqt()     // Catch: java.lang.Exception -> L39
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L39
            r8.<init>()     // Catch: java.lang.Exception -> L39
            java.lang.String r10 = "Failure: "
            r8.append(r10)     // Catch: java.lang.Exception -> L39
            r8.append(r14)     // Catch: java.lang.Exception -> L39
            java.lang.String r14 = r8.toString()     // Catch: java.lang.Exception -> L39
            o.pUU.KWHzl(r7, r14)     // Catch: java.lang.Exception -> L39
            java.lang.Integer r14 = r1.EZpvd()     // Catch: java.lang.Exception -> L39
            if (r14 == 0) goto Ld5
            int r14 = r14.intValue()     // Catch: java.lang.Exception -> L39
            goto Ld6
        Ld5:
            r14 = r6
        Ld6:
            int r14 = r14 - r5
            if (r14 > 0) goto Lec
            o.aBG$Application r14 = new o.aBG$Application     // Catch: java.lang.Exception -> L39
            java.lang.Integer r1 = r1.AEQbTJ()     // Catch: java.lang.Exception -> L39
            if (r1 == 0) goto Le6
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L39
            goto Le7
        Le6:
            r1 = r6
        Le7:
            r14.<init>(r1)     // Catch: java.lang.Exception -> L39
            goto L186
        Lec:
            java.lang.Integer r1 = r1.AEQbTJ()     // Catch: java.lang.Exception -> L39
            if (r1 == 0) goto Lf7
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L39
            goto Lf8
        Lf7:
            r1 = r6
        Lf8:
            o.aBG$StateListAnimator r5 = new o.aBG$StateListAnimator     // Catch: java.lang.Exception -> L39
            r5.<init>(r14, r1)     // Catch: java.lang.Exception -> L39
            r14 = r5
            goto L186
        L100:
            boolean r1 = r14 instanceof o.C5731aBx.Application.Activity     // Catch: java.lang.Exception -> L39
            if (r1 == 0) goto L117
            java.lang.String r1 = "FacialRecognitionViewModel"
            java.lang.String r5 = "Success"
            o.pUU.KWHzl(r1, r5)     // Catch: java.lang.Exception -> L39
            o.aBG$Activity r1 = new o.aBG$Activity     // Catch: java.lang.Exception -> L39
            o.aBx$Application$Activity r14 = (o.C5731aBx.Application.Activity) r14     // Catch: java.lang.Exception -> L39
            java.lang.String r14 = r14.EZpvd()     // Catch: java.lang.Exception -> L39
            r1.<init>(r14)     // Catch: java.lang.Exception -> L39
            goto L185
        L117:
            boolean r1 = r14 instanceof o.C5731aBx.Application.C0812Application     // Catch: java.lang.Exception -> L39
            if (r1 == 0) goto L146
            r1 = r14
            o.aBx$Application$Application r1 = (o.C5731aBx.Application.C0812Application) r1     // Catch: java.lang.Exception -> L39
            java.lang.String r1 = r1.KWHzl()     // Catch: java.lang.Exception -> L39
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L39
            r5.<init>()     // Catch: java.lang.Exception -> L39
            java.lang.String r10 = "Error: "
            r5.append(r10)     // Catch: java.lang.Exception -> L39
            r5.append(r1)     // Catch: java.lang.Exception -> L39
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L39
            o.pUU.copydefault(r7, r1)     // Catch: java.lang.Exception -> L39
            o.aBx$Application$Application r14 = (o.C5731aBx.Application.C0812Application) r14     // Catch: java.lang.Exception -> L39
            java.lang.String r14 = r14.KWHzl()     // Catch: java.lang.Exception -> L39
            if (r14 != 0) goto L13f
            goto L140
        L13f:
            r8 = r14
        L140:
            o.aBG$TaskDescription r14 = new o.aBG$TaskDescription     // Catch: java.lang.Exception -> L39
            r14.<init>(r8)     // Catch: java.lang.Exception -> L39
            goto L186
        L146:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L39
            r14.<init>()     // Catch: java.lang.Exception -> L39
            throw r14     // Catch: java.lang.Exception -> L39
        L14c:
            androidx.lifecycle.MutableLiveData r1 = com.okinc.auth.impl.facerecognition.ui.FaceRecognitionViewModel.gEmmrt(r3)
            o.mnw r5 = new o.mnw
            java.lang.Boolean r6 = o.C56443yFo.KWHzl(r6)
            r5.<init>(r6)
            r1.setValue(r5)
            java.lang.String r1 = r14.getMessage()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getFaceRecognitionResult error: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            o.pUU.copydefault(r7, r1)
            java.lang.String r14 = r14.getMessage()
            if (r14 != 0) goto L180
            int r14 = o.C8206ayP.Dialog.DPHNDa
            java.lang.String r14 = r3.DbNXlk(r14)
        L180:
            o.aBG$TaskDescription r1 = new o.aBG$TaskDescription
            r1.<init>(r14)
        L185:
            r14 = r1
        L186:
            kotlinx.coroutines.flow.MutableSharedFlow r1 = com.okinc.auth.impl.facerecognition.ui.FaceRecognitionViewModel.AEQbTJ(r3)
            r13.L$0 = r9
            r13.L$1 = r4
            r13.L$2 = r4
            r13.label = r2
            java.lang.Object r14 = r1.emit(r14, r13)
            if (r14 != r0) goto L1ba
            return r0
        L199:
            com.okinc.auth.impl.facerecognition.ui.FaceRecognitionViewModel r14 = r13.this$0
            java.lang.String r1 = "request is null"
            o.pUU.copydefault(r7, r1)
            kotlinx.coroutines.flow.MutableSharedFlow r1 = com.okinc.auth.impl.facerecognition.ui.FaceRecognitionViewModel.AEQbTJ(r14)
            o.aBG$TaskDescription r2 = new o.aBG$TaskDescription
            int r5 = o.C8206ayP.Dialog.DPHNDa
            java.lang.String r14 = r14.DbNXlk(r5)
            r2.<init>(r14)
            r13.L$0 = r4
            r13.label = r3
            java.lang.Object r14 = r1.emit(r2, r13)
            if (r14 != r0) goto L1ba
            return r0
        L1ba:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.auth.impl.facerecognition.ui.FaceRecognitionViewModel$getFaceRecognitionResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
