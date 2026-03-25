package com.okinc.ok_kyc_core.presentation.verify;

import android.content.Intent;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncRequest;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import com.okinc.ok_kyc_core.presentation.verify.OcrVerifyFragment$syncCardResult$2;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import o.AbstractC43419rot;
import o.AbstractC43846rww;
import o.C32866mlf;
import o.C32868mlh;
import o.C33129mqd;
import o.C43251rlk;
import o.C43401rob;
import o.C43422row;
import o.C55113xdn;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43709ruR;
import o.pUU;
import o.rJF;
import o.rTM;

/* JADX INFO: loaded from: classes23.dex */
public final class OcrVerifyFragment$syncCardResult$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ rJF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrVerifyFragment$syncCardResult$2(rJF rjf, Continuation<? super OcrVerifyFragment$syncCardResult$2> continuation) {
        super(2, continuation);
        this.this$0 = rjf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OcrVerifyFragment$syncCardResult$2 ocrVerifyFragment$syncCardResult$2 = new OcrVerifyFragment$syncCardResult$2(this.this$0, continuation);
        ocrVerifyFragment$syncCardResult$2.L$0 = obj;
        return ocrVerifyFragment$syncCardResult$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OcrVerifyFragment$syncCardResult$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0292  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        Job jobFJNWhG;
        CoroutineScope coroutineScope;
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            rJF rjf = this.this$0;
            InterfaceC43709ruR interfaceC43709ruRAEQbTJ = InterfaceC43709ruR.Companion.AEQbTJ(rjf.AYXKKw(), rjf.valueOf());
            String str = rjf.DTwDnp;
            CardSyncRequest cardSyncRequest = new CardSyncRequest(str == null ? "" : str, rjf.wlaJM, (String) null, 4, (DefaultConstructorMarker) null);
            this.L$0 = coroutineScope;
            this.label = 1;
            objOLrzqt = interfaceC43709ruRAEQbTJ.OLrzqt(cardSyncRequest, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                jobFJNWhG = this.this$0.fJNWhG();
                if (jobFJNWhG != null) {
                    Job.DefaultImpls.cancel$default(jobFJNWhG, (CancellationException) null, 1, (Object) null);
                }
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        ResponseData responseData = (ResponseData) objOLrzqt;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            actionBar = new AbstractC43419rot.StateListAnimator(data);
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        }
        CoroutineScope coroutineScope2 = coroutineScope;
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            CardSyncResponse cardSyncResponse = (CardSyncResponse) ((AbstractC43419rot.StateListAnimator) actionBar).copydefault();
            final String status = cardSyncResponse != null ? cardSyncResponse.getStatus() : null;
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            TrackChannel[] trackChannelArr = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length);
            final rJF rjf2 = this.this$0;
            C32866mlf.EZpvd("OKCard_Get_AsyncResult_Result", trackChannelArr, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rJU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return OcrVerifyFragment$syncCardResult$2.invokeSuspend$lambda$1(status, rjf2, (EventParamsList) obj2);
                }
            });
            if (status != null) {
                int iHashCode = status.hashCode();
                if (iHashCode != -562638271) {
                    if (iHashCode != 35394935) {
                        if (iHashCode == 2066319421 && status.equals(CardSyncResponse.FAILED)) {
                            AbstractC43846rww abstractC43846rwwAEQbTJ = this.this$0.AEQbTJ();
                            if (abstractC43846rwwAEQbTJ != null) {
                                final rJF rjf3 = this.this$0;
                                abstractC43846rwwAEQbTJ.KWHzl.cancelAnimation();
                                abstractC43846rwwAEQbTJ.KWHzl.setVisibility(8);
                                abstractC43846rwwAEQbTJ.EZpvd.getRoot().setVisibility(0);
                                abstractC43846rwwAEQbTJ.copydefault.getRoot().setVisibility(8);
                                abstractC43846rwwAEQbTJ.EZpvd.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.rJW
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(android.view.View view) {
                                        OcrVerifyFragment$syncCardResult$2.invokeSuspend$lambda$5$lambda$3(rjf3, view);
                                    }
                                });
                                abstractC43846rwwAEQbTJ.EZpvd.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.rJV
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(android.view.View view) {
                                        OcrVerifyFragment$syncCardResult$2.invokeSuspend$lambda$5$lambda$4(rjf3, view);
                                    }
                                });
                            }
                            Job jobFJNWhG2 = this.this$0.fJNWhG();
                            if (jobFJNWhG2 != null) {
                                Job.DefaultImpls.cancel$default(jobFJNWhG2, (CancellationException) null, 1, (Object) null);
                            }
                        }
                    } else if (status.equals(CardSyncResponse.PENDING)) {
                        try {
                            AbstractC43846rww abstractC43846rwwAEQbTJ2 = this.this$0.AEQbTJ();
                            if (abstractC43846rwwAEQbTJ2 != null) {
                                abstractC43846rwwAEQbTJ2.KWHzl.setVisibility(0);
                                abstractC43846rwwAEQbTJ2.KWHzl.setAutoMirrored(true);
                                abstractC43846rwwAEQbTJ2.KWHzl.KWHzl(0L);
                                abstractC43846rwwAEQbTJ2.copydefault.getRoot().setVisibility(8);
                                abstractC43846rwwAEQbTJ2.EZpvd.getRoot().setVisibility(8);
                            }
                            rJF rjf4 = this.this$0;
                            rjf4.copydefault(BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass5(rjf4, null), 3, null));
                        } catch (TimeoutCancellationException unused) {
                            AbstractC43846rww abstractC43846rwwAEQbTJ3 = this.this$0.AEQbTJ();
                            if (abstractC43846rwwAEQbTJ3 != null) {
                                final rJF rjf5 = this.this$0;
                                abstractC43846rwwAEQbTJ3.KWHzl.cancelAnimation();
                                abstractC43846rwwAEQbTJ3.EZpvd.getRoot().setVisibility(0);
                                abstractC43846rwwAEQbTJ3.copydefault.getRoot().setVisibility(8);
                                abstractC43846rwwAEQbTJ3.EZpvd.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.rJY
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(android.view.View view) {
                                        OcrVerifyFragment$syncCardResult$2.invokeSuspend$lambda$9$lambda$7(rjf5, view);
                                    }
                                });
                                abstractC43846rwwAEQbTJ3.EZpvd.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.rKb
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(android.view.View view) {
                                        OcrVerifyFragment$syncCardResult$2.invokeSuspend$lambda$9$lambda$8(rjf5, view);
                                    }
                                });
                            }
                        }
                    }
                } else if (status.equals(CardSyncResponse.SUCCEEDED)) {
                    AbstractC43846rww abstractC43846rwwAEQbTJ4 = this.this$0.AEQbTJ();
                    if (abstractC43846rwwAEQbTJ4 != null) {
                        abstractC43846rwwAEQbTJ4.KWHzl.cancelAnimation();
                        abstractC43846rwwAEQbTJ4.KWHzl.setVisibility(8);
                        abstractC43846rwwAEQbTJ4.copydefault.getRoot().setVisibility(8);
                        abstractC43846rwwAEQbTJ4.EZpvd.getRoot().setVisibility(8);
                    }
                    rTM rtm = rTM.KWHzl;
                    FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    VendorConfig vendorConfig = this.this$0.ORxRYg;
                    if (vendorConfig == null) {
                        vendorConfig = new VendorConfig((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 1048575, (DefaultConstructorMarker) null);
                    }
                    String str2 = this.this$0.DTwDnp;
                    String str3 = str2 != null ? str2 : "";
                    String str4 = this.this$0.AuCTelauCTel;
                    ActivityResultLauncher<Intent> activityResultLauncher = this.this$0.zsXlph;
                    this.L$0 = null;
                    this.label = 2;
                    if (rtm.OLrzqt(fragmentActivityRequireActivity, vendorConfig, str3, str4, activityResultLauncher, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    jobFJNWhG = this.this$0.fJNWhG();
                    if (jobFJNWhG != null) {
                    }
                }
            }
        } else if (actionBar instanceof AbstractC43419rot.ActionBar) {
            AbstractC43846rww abstractC43846rwwAEQbTJ5 = this.this$0.AEQbTJ();
            if (abstractC43846rwwAEQbTJ5 != null && (c55113xdn2 = abstractC43846rwwAEQbTJ5.KWHzl) != null) {
                c55113xdn2.cancelAnimation();
            }
            AbstractC43846rww abstractC43846rwwAEQbTJ6 = this.this$0.AEQbTJ();
            if (abstractC43846rwwAEQbTJ6 != null && (c55113xdn = abstractC43846rwwAEQbTJ6.KWHzl) != null) {
                c55113xdn.setVisibility(8);
            }
            AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
            final String message = ((OKServerException) actionBar2.KWHzl()).getMessage();
            pUU.KWHzl("OcrVerifyFragment", "syncCardResult code=" + ((OKServerException) actionBar2.KWHzl()).getCode() + ",message=" + message + ",origin=" + ((OKServerException) actionBar2.KWHzl()).getOrigin() + " ");
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            TrackChannel[] trackChannelArr2 = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length);
            final rJF rjf6 = this.this$0;
            C32866mlf.EZpvd("OKCard_Get_AsyncResult_Result", trackChannelArr2, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rJZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return OcrVerifyFragment$syncCardResult$2.invokeSuspend$lambda$10(message, rjf6, (EventParamsList) obj2);
                }
            });
            if (((OKServerException) actionBar2.KWHzl()).getOrigin() != null) {
                AbstractC43846rww abstractC43846rwwAEQbTJ7 = this.this$0.AEQbTJ();
                if (abstractC43846rwwAEQbTJ7 != null) {
                    final rJF rjf7 = this.this$0;
                    abstractC43846rwwAEQbTJ7.copydefault.getRoot().setVisibility(0);
                    abstractC43846rwwAEQbTJ7.EZpvd.getRoot().setVisibility(8);
                    abstractC43846rwwAEQbTJ7.copydefault.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.rKa
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            rJF.AuCTel(rjf7);
                        }
                    });
                }
            } else {
                AbstractC43846rww abstractC43846rwwAEQbTJ8 = this.this$0.AEQbTJ();
                if (abstractC43846rwwAEQbTJ8 != null) {
                    final rJF rjf8 = this.this$0;
                    abstractC43846rwwAEQbTJ8.EZpvd.getRoot().setVisibility(0);
                    abstractC43846rwwAEQbTJ8.copydefault.getRoot().setVisibility(8);
                    abstractC43846rwwAEQbTJ8.EZpvd.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.rKc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            OcrVerifyFragment$syncCardResult$2.invokeSuspend$lambda$15$lambda$13(rjf8, view);
                        }
                    });
                    abstractC43846rwwAEQbTJ8.EZpvd.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.rKh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            OcrVerifyFragment$syncCardResult$2.invokeSuspend$lambda$15$lambda$14(rjf8, view);
                        }
                    });
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(String str, rJF rjf, EventParamsList eventParamsList) {
        eventParamsList.put("result", C33129mqd.gEmmrt(str), false);
        VendorConfig vendorConfig = rjf.ORxRYg;
        eventParamsList.put("flow_source", C33129mqd.gEmmrt(vendorConfig != null ? vendorConfig.getSource() : null), false);
        VendorConfig vendorConfig2 = rjf.ORxRYg;
        eventParamsList.put(EopTrackEvent.KEY_SOURCE_CODE, C33129mqd.gEmmrt(vendorConfig2 != null ? vendorConfig2.getSourceCode() : null), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$5$lambda$3(rJF rjf, View view) {
        rjf.fetchVPNInfo().wlaJM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$5$lambda$4(rJF rjf, View view) {
        rjf.fetchVPNInfo().wlaJM();
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.verify.OcrVerifyFragment$syncCardResult$2$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ rJF this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(rJF rjf, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = rjf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (TimeoutKt.withTimeout(15000L, anonymousClass1, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.verify.OcrVerifyFragment$syncCardResult$2$5$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ rJF this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(rJF rjf, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = rjf;
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
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineScope coroutineScope;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (DelayKt.delay(1000L, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope = (CoroutineScope) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                }
                while (CoroutineScopeKt.isActive(coroutineScope)) {
                    rJF rjf = this.this$0;
                    this.L$0 = coroutineScope;
                    this.label = 2;
                    if (rjf.OLrzqt((Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$9$lambda$7(rJF rjf, View view) {
        rjf.fetchVPNInfo().wlaJM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$9$lambda$8(rJF rjf, View view) {
        rjf.fetchVPNInfo().wlaJM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$10(String str, rJF rjf, EventParamsList eventParamsList) {
        eventParamsList.put("result", EopTrackEvent.KEY_RESULT_FAILED, false);
        eventParamsList.put(EopTrackEvent.KEY_ERROR_MESSAGE, C33129mqd.gEmmrt(str), false);
        VendorConfig vendorConfig = rjf.ORxRYg;
        eventParamsList.put("flow_source", C33129mqd.gEmmrt(vendorConfig != null ? vendorConfig.getSource() : null), false);
        VendorConfig vendorConfig2 = rjf.ORxRYg;
        eventParamsList.put(EopTrackEvent.KEY_SOURCE_CODE, C33129mqd.gEmmrt(vendorConfig2 != null ? vendorConfig2.getSourceCode() : null), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$15$lambda$13(rJF rjf, View view) {
        rjf.fetchVPNInfo().wlaJM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$15$lambda$14(rJF rjf, View view) {
        rjf.fetchVPNInfo().wlaJM();
    }
}
