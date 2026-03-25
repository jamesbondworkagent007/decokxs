package com.okinc.business.trade.features.home.autoconfirm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class AutoConfirmViewModel$computeViewState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AutoConfirmViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoConfirmViewModel$computeViewState$1(AutoConfirmViewModel autoConfirmViewModel, Continuation<? super AutoConfirmViewModel$computeViewState$1> continuation) {
        super(2, continuation);
        this.this$0 = autoConfirmViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AutoConfirmViewModel$computeViewState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AutoConfirmViewModel$computeViewState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Duplicate block (B:50:0x00d4) to fix multi-entry loop: BACK_EDGE: B:50:0x00d4 -> B:51:0x00d9 */
    /* JADX DEBUG: Duplicate block (B:52:0x00dc) to fix multi-entry loop: BACK_EDGE: B:52:0x00dc -> B:138:0x01f4 */
    /* JADX DEBUG: Duplicate block (B:92:0x015f) to fix multi-entry loop: BACK_EDGE: B:92:0x015f -> B:51:0x00d9 */
    /* JADX DEBUG: Duplicate block (B:93:0x0166) to fix multi-entry loop: BACK_EDGE: B:93:0x0166 -> B:138:0x01f4 */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x0194 -> B:106:0x0197). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0066 -> B:138:0x01f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0070 -> B:138:0x01f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007a -> B:138:0x01f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00f4 -> B:138:0x01f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0107 -> B:138:0x01f4). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.String r5 = ""
            r6 = 0
            if (r1 == 0) goto L48
            if (r1 == r4) goto L3a
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L23
            java.lang.Object r1 = r11.L$2
            java.lang.Object r7 = r11.L$1
            com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel r7 = (com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel) r7
            java.lang.Object r8 = r11.L$0
            kotlinx.coroutines.flow.MutableStateFlow r8 = (kotlinx.coroutines.flow.MutableStateFlow) r8
            o.C56391yDq.AEQbTJ(r12)
            goto L197
        L23:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2b:
            java.lang.Object r1 = r11.L$2
            java.lang.Object r7 = r11.L$1
            com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel r7 = (com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel) r7
            java.lang.Object r8 = r11.L$0
            kotlinx.coroutines.flow.MutableStateFlow r8 = (kotlinx.coroutines.flow.MutableStateFlow) r8
            o.C56391yDq.AEQbTJ(r12)
            goto L122
        L3a:
            java.lang.Object r1 = r11.L$2
            java.lang.Object r7 = r11.L$1
            com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel r7 = (com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel) r7
            java.lang.Object r8 = r11.L$0
            kotlinx.coroutines.flow.MutableStateFlow r8 = (kotlinx.coroutines.flow.MutableStateFlow) r8
            o.C56391yDq.AEQbTJ(r12)
            goto L97
        L48:
            o.C56391yDq.AEQbTJ(r12)
            com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel r12 = r11.this$0
            kotlinx.coroutines.flow.MutableStateFlow r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.KWHzl(r12)
            com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel r1 = r11.this$0
            r8 = r12
            r7 = r1
        L55:
            java.lang.Object r1 = r8.getValue()
            r12 = r1
            o.kTU r12 = (o.kTU) r12
            o.gMb r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.AEQbTJ(r7)
            o.bbJ r12 = r12.KWHzl()
            if (r12 != 0) goto L6a
            o.kTU$Dialog r12 = o.kTU.Dialog.AEQbTJ
            goto L1f4
        L6a:
            boolean r12 = r12.gHZMYf()
            if (r12 == 0) goto L74
            o.kTU$Activity r12 = o.kTU.Activity.copydefault
            goto L1f4
        L74:
            boolean r12 = o.C22416heu.getNewProxyInstance()
            if (r12 == 0) goto L7e
            o.kTU$FragmentManager r12 = o.kTU.FragmentManager.EZpvd
            goto L1f4
        L7e:
            o.gMb r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.AEQbTJ(r7)
            boolean r12 = r12.djBIcL()
            if (r12 == 0) goto Lf7
            r11.L$0 = r8
            r11.L$1 = r7
            r11.L$2 = r1
            r11.label = r4
            java.lang.Object r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.KWHzl(r7, r11)
            if (r12 != r0) goto L97
            return r0
        L97:
            com.okinc.business.dexlogic.bean.QuotaInfoBean r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r12 == 0) goto Le0
            com.okinc.business.dexlogic.bean.QuotaInfoBean r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r12 == 0) goto Laa
            boolean r12 = r12.hasNoQuotaRemaining()
            if (r12 != r4) goto Laa
            goto Le0
        Laa:
            com.okinc.business.dexlogic.bean.QuotaInfoBean r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r12 == 0) goto Ldc
            boolean r12 = r12.showLowQuotaWarning()
            if (r12 != r4) goto Ldc
            com.okinc.business.dexlogic.bean.QuotaInfoBean r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r12 == 0) goto Lc1
            java.lang.String r12 = r12.getRemainingAmount()
            goto Lc2
        Lc1:
            r12 = r6
        Lc2:
            if (r12 != 0) goto Lc5
            r12 = r5
        Lc5:
            com.okinc.business.dexlogic.bean.QuotaInfoBean r9 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r9 == 0) goto Ld0
            java.lang.String r9 = r9.getRemainingSeconds()
            goto Ld1
        Ld0:
            r9 = r6
        Ld1:
            if (r9 != 0) goto Ld4
            r9 = r5
        Ld4:
            o.kTU$AssistContent r10 = new o.kTU$AssistContent
            r10.<init>(r12, r9)
        Ld9:
            r12 = r10
            goto L1f4
        Ldc:
            o.kTU$PendingIntent r12 = o.kTU.PendingIntent.copydefault
            goto L1f4
        Le0:
            com.okinc.business.dexlogic.bean.QuotaInfoBean r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r12 == 0) goto Leb
            java.lang.String r12 = r12.getRemainingSeconds()
            goto Lec
        Leb:
            r12 = r6
        Lec:
            if (r12 != 0) goto Lef
            r12 = r5
        Lef:
            o.kTU$VoiceInteractor r9 = new o.kTU$VoiceInteractor
            r9.<init>(r12)
        Lf4:
            r12 = r9
            goto L1f4
        Lf7:
            o.kTW r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.copydefault(r7)
            o.kUa r12 = r12.OLrzqt()
            o.kUa$StateListAnimator r9 = o.InterfaceC28239kUa.StateListAnimator.AEQbTJ
            boolean r9 = kotlin.jvm.internal.Intrinsics.EZpvd(r12, r9)
            if (r9 == 0) goto L10b
            o.kTU$Activity r12 = o.kTU.Activity.copydefault
            goto L1f4
        L10b:
            o.kUa$TaskDescription r9 = o.InterfaceC28239kUa.TaskDescription.AEQbTJ
            boolean r9 = kotlin.jvm.internal.Intrinsics.EZpvd(r12, r9)
            if (r9 == 0) goto L180
            r11.L$0 = r8
            r11.L$1 = r7
            r11.L$2 = r1
            r11.label = r3
            java.lang.Object r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.KWHzl(r7, r11)
            if (r12 != r0) goto L122
            return r0
        L122:
            com.okinc.business.dexlogic.bean.QuotaInfoBean r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r12 == 0) goto L16a
            com.okinc.business.dexlogic.bean.QuotaInfoBean r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r12 == 0) goto L135
            boolean r12 = r12.hasNoQuotaRemaining()
            if (r12 != r4) goto L135
            goto L16a
        L135:
            com.okinc.business.dexlogic.bean.QuotaInfoBean r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r12 == 0) goto L166
            boolean r12 = r12.showLowQuotaWarning()
            if (r12 != r4) goto L166
            com.okinc.business.dexlogic.bean.QuotaInfoBean r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r12 == 0) goto L14c
            java.lang.String r12 = r12.getRemainingAmount()
            goto L14d
        L14c:
            r12 = r6
        L14d:
            if (r12 != 0) goto L150
            r12 = r5
        L150:
            com.okinc.business.dexlogic.bean.QuotaInfoBean r9 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r9 == 0) goto L15b
            java.lang.String r9 = r9.getRemainingSeconds()
            goto L15c
        L15b:
            r9 = r6
        L15c:
            if (r9 != 0) goto L15f
            r9 = r5
        L15f:
            o.kTU$LoaderManager r10 = new o.kTU$LoaderManager
            r10.<init>(r12, r9)
            goto Ld9
        L166:
            o.kTU$TaskDescription r12 = o.kTU.TaskDescription.OLrzqt
            goto L1f4
        L16a:
            com.okinc.business.dexlogic.bean.QuotaInfoBean r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r12 == 0) goto L175
            java.lang.String r12 = r12.getRemainingSeconds()
            goto L176
        L175:
            r12 = r6
        L176:
            if (r12 != 0) goto L179
            r12 = r5
        L179:
            o.kTU$StateListAnimator r9 = new o.kTU$StateListAnimator
            r9.<init>(r12)
            goto Lf4
        L180:
            o.kUa$Activity r9 = o.InterfaceC28239kUa.Activity.OLrzqt
            boolean r12 = kotlin.jvm.internal.Intrinsics.EZpvd(r12, r9)
            if (r12 == 0) goto L1fd
            r11.L$0 = r8
            r11.L$1 = r7
            r11.L$2 = r1
            r11.label = r2
            java.lang.Object r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.KWHzl(r7, r11)
            if (r12 != r0) goto L197
            return r0
        L197:
            com.okinc.business.dexlogic.bean.QuotaInfoBean r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r12 == 0) goto L1de
            com.okinc.business.dexlogic.bean.QuotaInfoBean r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r12 == 0) goto L1aa
            boolean r12 = r12.hasNoQuotaRemaining()
            if (r12 != r4) goto L1aa
            goto L1de
        L1aa:
            com.okinc.business.dexlogic.bean.QuotaInfoBean r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r12 == 0) goto L1db
            boolean r12 = r12.showLowQuotaWarning()
            if (r12 != r4) goto L1db
            com.okinc.business.dexlogic.bean.QuotaInfoBean r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r12 == 0) goto L1c1
            java.lang.String r12 = r12.getRemainingAmount()
            goto L1c2
        L1c1:
            r12 = r6
        L1c2:
            if (r12 != 0) goto L1c5
            r12 = r5
        L1c5:
            com.okinc.business.dexlogic.bean.QuotaInfoBean r9 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r9 == 0) goto L1d0
            java.lang.String r9 = r9.getRemainingSeconds()
            goto L1d1
        L1d0:
            r9 = r6
        L1d1:
            if (r9 != 0) goto L1d4
            r9 = r5
        L1d4:
            o.kTU$Fragment r10 = new o.kTU$Fragment
            r10.<init>(r12, r9)
            goto Ld9
        L1db:
            o.kTU$Application r12 = o.kTU.Application.KWHzl
            goto L1f4
        L1de:
            com.okinc.business.dexlogic.bean.QuotaInfoBean r12 = com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel.EZpvd(r7)
            if (r12 == 0) goto L1e9
            java.lang.String r12 = r12.getRemainingSeconds()
            goto L1ea
        L1e9:
            r12 = r6
        L1ea:
            if (r12 != 0) goto L1ed
            r12 = r5
        L1ed:
            o.kTU$StateListAnimator r9 = new o.kTU$StateListAnimator
            r9.<init>(r12)
            goto Lf4
        L1f4:
            boolean r12 = r8.compareAndSet(r1, r12)
            if (r12 == 0) goto L55
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L1fd:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel$computeViewState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
