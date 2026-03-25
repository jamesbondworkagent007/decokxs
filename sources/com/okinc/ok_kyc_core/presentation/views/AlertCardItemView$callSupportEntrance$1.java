package com.okinc.ok_kyc_core.presentation.views;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.biz.model.SupportService;
import com.okinc.ok_kyc_core.presentation.views.AlertCardItemView$callSupportEntrance$1;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C42224rKy;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C6811aWS;
import o.InterfaceC6804aWL;

/* JADX INFO: loaded from: classes23.dex */
public final class AlertCardItemView$callSupportEntrance$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $entranceId;
    final /* synthetic */ boolean $isPrimaryButton;
    final /* synthetic */ LifecycleCoroutineScope $lifecycleScope;
    private /* synthetic */ Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ C42224rKy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertCardItemView$callSupportEntrance$1(String str, boolean z, C42224rKy c42224rKy, LifecycleCoroutineScope lifecycleCoroutineScope, Continuation<? super AlertCardItemView$callSupportEntrance$1> continuation) {
        super(2, continuation);
        this.$entranceId = str;
        this.$isPrimaryButton = z;
        this.this$0 = c42224rKy;
        this.$lifecycleScope = lifecycleCoroutineScope;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AlertCardItemView$callSupportEntrance$1 alertCardItemView$callSupportEntrance$1 = new AlertCardItemView$callSupportEntrance$1(this.$entranceId, this.$isPrimaryButton, this.this$0, this.$lifecycleScope, continuation);
        alertCardItemView$callSupportEntrance$1.L$0 = obj;
        return alertCardItemView$callSupportEntrance$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AlertCardItemView$callSupportEntrance$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x00a8, TRY_ENTER, TryCatch #0 {all -> 0x00a8, blocks: (B:6:0x0015, B:17:0x0064, B:22:0x0071, B:24:0x0079, B:28:0x0081, B:36:0x00a2, B:29:0x008a, B:31:0x0092, B:35:0x009a, B:11:0x0030, B:13:0x0051), top: B:42:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:6:0x0015, B:17:0x0064, B:22:0x0071, B:24:0x0079, B:28:0x0081, B:36:0x00a2, B:29:0x008a, B:31:0x0092, B:35:0x009a, B:11:0x0030, B:13:0x0051), top: B:42:0x0007 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        final C42224rKy c42224rKy;
        final LifecycleCoroutineScope lifecycleCoroutineScope;
        final SupportService supportService;
        boolean z2;
        C42224rKy c42224rKy2;
        LifecycleCoroutineScope lifecycleCoroutineScope2;
        String serviceLabel;
        String serviceLabel2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$entranceId;
            z = this.$isPrimaryButton;
            c42224rKy = this.this$0;
            lifecycleCoroutineScope = this.$lifecycleScope;
            Result.Application application2 = Result.Companion;
            ChatBotRequest chatBotRequest = new ChatBotRequest();
            chatBotRequest.setOkaFrom("kyc");
            C6811aWS c6811aWS = new C6811aWS(str, chatBotRequest, null, null, 12, null);
            InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.OLrzqt(InterfaceC6804aWL.class);
            if (interfaceC6804aWL == null) {
                supportService = null;
                String str2 = "";
                if (!z) {
                    OKAlertBanner oKAlertBanner = c42224rKy.KWHzl.copydefault;
                    if (supportService != null && (serviceLabel2 = supportService.getServiceLabel()) != null) {
                        str2 = serviceLabel2;
                    }
                    oKAlertBanner.setPrimaryAction(str2, new Function0() { // from class: o.rKD
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return AlertCardItemView$callSupportEntrance$1.invokeSuspend$lambda$3$lambda$1(lifecycleCoroutineScope, supportService, c42224rKy);
                        }
                    });
                } else {
                    OKAlertBanner oKAlertBanner2 = c42224rKy.KWHzl.copydefault;
                    if (supportService != null && (serviceLabel = supportService.getServiceLabel()) != null) {
                        str2 = serviceLabel;
                    }
                    oKAlertBanner2.setSecondaryAction(str2, new Function0() { // from class: o.rKC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return AlertCardItemView$callSupportEntrance$1.invokeSuspend$lambda$3$lambda$2(lifecycleCoroutineScope, supportService, c42224rKy);
                        }
                    });
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            this.L$0 = c42224rKy;
            this.L$1 = lifecycleCoroutineScope;
            this.Z$0 = z;
            this.label = 1;
            Object objAEQbTJ = interfaceC6804aWL.AEQbTJ(c6811aWS, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            z2 = z;
            obj = objAEQbTJ;
            c42224rKy2 = c42224rKy;
            lifecycleCoroutineScope2 = lifecycleCoroutineScope;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = this.Z$0;
            lifecycleCoroutineScope2 = (LifecycleCoroutineScope) this.L$1;
            c42224rKy2 = (C42224rKy) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        lifecycleCoroutineScope = lifecycleCoroutineScope2;
        c42224rKy = c42224rKy2;
        boolean z3 = z2;
        supportService = (SupportService) obj;
        z = z3;
        String str22 = "";
        if (!z) {
        }
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$1(LifecycleCoroutineScope lifecycleCoroutineScope, SupportService supportService, C42224rKy c42224rKy) {
        BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, null, null, new AlertCardItemView$callSupportEntrance$1$1$1$1(supportService, c42224rKy, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$2(LifecycleCoroutineScope lifecycleCoroutineScope, SupportService supportService, C42224rKy c42224rKy) {
        BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, null, null, new AlertCardItemView$callSupportEntrance$1$1$2$1(supportService, c42224rKy, null), 3, null);
        return Unit.INSTANCE;
    }
}
