package com.okinc.ok_kyc_core.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.appsflyer.AppsFlyerProperties;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;
import o.AbstractC34718nhd;
import o.C32866mlf;
import o.C32868mlh;
import o.C33129mqd;
import o.C33482mxL;
import o.C34733nhs;
import o.C42463rTu;
import o.C42467rTy;
import o.C55326xho;
import o.C56391yDq;
import o.C56434yFf;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class KycDynamicUtil$loadAliFaceDynamic$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ long $startTime;
    long J$0;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycDynamicUtil$loadAliFaceDynamic$2(Context context, long j, Continuation<? super KycDynamicUtil$loadAliFaceDynamic$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$startTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KycDynamicUtil$loadAliFaceDynamic$2(this.$context, this.$startTime, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((KycDynamicUtil$loadAliFaceDynamic$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Context context = this.$context;
            long j = this.$startTime;
            this.L$0 = context;
            this.J$0 = j;
            this.label = 1;
            C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(this));
            new C34733nhs(context, "kyc_dynamic_impl", true, 0L, 8, null).AEQbTJ(new ActionBar(j, c56434yFf, context));
            obj = c56434yFf.KWHzl();
            if (obj == C56442yFn.copydefault()) {
                C56447yFs.copydefault(this);
            }
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }

    public static final class ActionBar extends AbstractC34718nhd {
        public final /* synthetic */ Continuation<Boolean> EZpvd;
        public final /* synthetic */ Context KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.coroutines.Continuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(long j, Continuation<? super Boolean> continuation, Context context) {
            this.OLrzqt = j;
            this.EZpvd = continuation;
            this.KWHzl = context;
        }

        public static final class Application implements Function1<EventParamsList, Unit> {
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(long j) {
                this.copydefault = j;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                OLrzqt(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void OLrzqt(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                eventParamsList.put("module_name", "kyc_dynamic_impl", false);
                eventParamsList.put("state", "onSuccess", false);
                eventParamsList.put(CrashHianalyticsData.TIME, String.valueOf(this.copydefault), false);
                eventParamsList.put(AppsFlyerProperties.CHANNEL, C33129mqd.gEmmrt(C33482mxL.KWHzl), true);
            }
        }

        @Override // o.AbstractC34718nhd
        public void AEQbTJ() {
            long jCurrentTimeMillis = (System.currentTimeMillis() - this.OLrzqt) / ((long) 1000);
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("KYC_FD_LOAD_EVENT", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), new Application(jCurrentTimeMillis));
            pUU.KWHzl("qjf", "loadAliFaceDynamic success---> ");
            C42463rTu.KWHzl.OLrzqt();
            C42467rTy.KWHzl.aKErDB();
            if (JobKt.isActive(this.EZpvd.getContext())) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new KycDynamicUtil$loadAliFaceDynamic$2$1$1$onSuccess$2(this.EZpvd, null), 3, null);
            }
        }

        public static final class StateListAnimator implements Function1<EventParamsList, Unit> {
            public final /* synthetic */ long KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(long j) {
                this.KWHzl = j;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                EZpvd(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void EZpvd(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                eventParamsList.put("module_name", "kyc_dynamic_impl", false);
                eventParamsList.put("state", "onFailure", false);
                eventParamsList.put(CrashHianalyticsData.TIME, String.valueOf(this.KWHzl), false);
                eventParamsList.put(AppsFlyerProperties.CHANNEL, C33129mqd.gEmmrt(C33482mxL.KWHzl), true);
            }
        }

        @Override // o.AbstractC34718nhd
        public void copydefault(Exception exc, String str) {
            Intrinsics.checkNotNullParameter(exc, "");
            Intrinsics.checkNotNullParameter(str, "");
            long jCurrentTimeMillis = (System.currentTimeMillis() - this.OLrzqt) / ((long) 1000);
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("KYC_FD_LOAD_EVENT", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), new StateListAnimator(jCurrentTimeMillis));
            pUU.copydefault("qjf", "loadAliFaceDynamic onFailure--->exception = " + exc.getMessage() + ",msg = " + str);
            C42463rTu.KWHzl.OLrzqt();
            C55326xho.toast$default(str, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            if (JobKt.isActive(this.EZpvd.getContext())) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new KycDynamicUtil$loadAliFaceDynamic$2$1$1$onFailure$2(this.EZpvd, null), 3, null);
            }
        }

        @Override // o.AbstractC34718nhd
        public void AEQbTJ(int i) {
            C42463rTu.KWHzl.copydefault(this.KWHzl);
        }

        public static final class TaskDescription implements Function1<EventParamsList, Unit> {
            public final /* synthetic */ long AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(long j) {
                this.AEQbTJ = j;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                EZpvd(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void EZpvd(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                eventParamsList.put("module_name", "kyc_dynamic_impl", false);
                eventParamsList.put("state", "onCancel", false);
                eventParamsList.put(CrashHianalyticsData.TIME, String.valueOf(this.AEQbTJ), false);
                eventParamsList.put(AppsFlyerProperties.CHANNEL, C33129mqd.gEmmrt(C33482mxL.KWHzl), true);
            }
        }

        @Override // o.AbstractC34718nhd
        public void copydefault() {
            long jCurrentTimeMillis = (System.currentTimeMillis() - this.OLrzqt) / ((long) 1000);
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("KYC_FD_LOAD_EVENT", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), new TaskDescription(jCurrentTimeMillis));
            pUU.KWHzl("qjf", "loadAliFaceDynamic onCancel--->");
            C42463rTu.KWHzl.OLrzqt();
            if (JobKt.isActive(this.EZpvd.getContext())) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new KycDynamicUtil$loadAliFaceDynamic$2$1$1$onCancel$2(this.EZpvd, null), 3, null);
            }
        }
    }
}
