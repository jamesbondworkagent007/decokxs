package com.okinc.im.imui.messageV2.view.keyboard;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class KeyboardViewModel$debugSendMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Integer $delayTime;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ KeyboardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardViewModel$debugSendMessage$1(KeyboardViewModel keyboardViewModel, Integer num, Continuation<? super KeyboardViewModel$debugSendMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = keyboardViewModel;
        this.$delayTime = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KeyboardViewModel$debugSendMessage$1(this.this$0, this.$delayTime, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KeyboardViewModel$debugSendMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00af -> B:19:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r9.label
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L22
            if (r1 != r3) goto L1a
            int r1 = r9.I$0
            java.lang.Object r6 = r9.L$0
            java.lang.String r6 = (java.lang.String) r6
            o.C56391yDq.AEQbTJ(r10)
            goto L55
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            int r1 = r9.I$0
            java.lang.Object r6 = r9.L$0
            java.lang.String r6 = (java.lang.String) r6
            o.C56391yDq.AEQbTJ(r10)
            goto L98
        L2c:
            o.C56391yDq.AEQbTJ(r10)
            com.okinc.im.imui.messageV2.view.keyboard.KeyboardViewModel r10 = r9.this$0
            androidx.lifecycle.MutableLiveData r10 = com.okinc.im.imui.messageV2.view.keyboard.KeyboardViewModel.copydefault(r10)
            java.lang.Object r10 = r10.getValue()
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            if (r10 == 0) goto L4d
            java.lang.String r10 = r10.toString()
            if (r10 == 0) goto L4d
            java.lang.CharSequence r10 = kotlin.text.StringsKt.isConnected(r10)
            java.lang.String r10 = r10.toString()
            r6 = r10
            goto L4e
        L4d:
            r6 = r4
        L4e:
            boolean r10 = o.C33129mqd.OLrzqt(r6)
            if (r10 == 0) goto Lb2
            r1 = r2
        L55:
            int r1 = r1 + r5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r7 = " "
            r10.append(r7)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            if (r10 != 0) goto L6e
            java.lang.String r10 = ""
        L6e:
            com.okinc.im.config.serviceprovider.SendMessageRequestParam$Text r7 = new com.okinc.im.config.serviceprovider.SendMessageRequestParam$Text
            r7.<init>(r10, r4, r3, r4)
            com.okinc.im.config.serviceprovider.SendMessageRequestParam[] r10 = new com.okinc.im.config.serviceprovider.SendMessageRequestParam[r5]
            r10[r2] = r7
            java.util.ArrayList r10 = kotlin.collections.CollectionsKt.AEQbTJ(r10)
            com.okinc.im.config.serviceprovider.GeneralAction$SendMessages r7 = new com.okinc.im.config.serviceprovider.GeneralAction$SendMessages
            r7.<init>(r10)
            com.okinc.im.imui.messageV2.view.keyboard.KeyboardViewModel r10 = r9.this$0
            androidx.lifecycle.MutableLiveData r10 = com.okinc.im.imui.messageV2.view.keyboard.KeyboardViewModel.values(r10)
            o.mnw r8 = new o.mnw
            r8.<init>(r7)
            r9.L$0 = r6
            r9.I$0 = r1
            r9.label = r5
            java.lang.Object r10 = o.C36588odm.KWHzl(r10, r8, r9)
            if (r10 != r0) goto L98
            return r0
        L98:
            com.okinc.im.imui.messageV2.view.keyboard.KeyboardViewModel r10 = r9.this$0
            r7 = 0
            com.okinc.im.imui.messageV2.view.keyboard.KeyboardViewModel.EZpvd(r10, r7)
            java.lang.Integer r10 = r9.$delayTime
            long r7 = o.C33129mqd.valueOf(r10)
            r9.L$0 = r6
            r9.I$0 = r1
            r9.label = r3
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r7, r9)
            if (r10 != r0) goto L55
            return r0
        Lb2:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.im.imui.messageV2.view.keyboard.KeyboardViewModel$debugSendMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
