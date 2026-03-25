package com.okinc.im.imui.preview;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.imui.preview.IMMediaPagerActivity$trackPageEntry$1;
import com.okinc.im.imui.preview.viewmodel.IMMediaPagerViewModel;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC37218opg;
import o.C32866mlf;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.sEF;

/* JADX INFO: loaded from: classes16.dex */
public final class IMMediaPagerActivity$trackPageEntry$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC37218opg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMMediaPagerActivity$trackPageEntry$1(ActivityC37218opg activityC37218opg, Continuation<? super IMMediaPagerActivity$trackPageEntry$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC37218opg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IMMediaPagerActivity$trackPageEntry$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IMMediaPagerActivity$trackPageEntry$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            IMMediaPagerViewModel iMMediaPagerViewModelValueOf = this.this$0.valueOf();
            OKMessage oKMessageGEmmrt = this.this$0.gEmmrt();
            this.label = 1;
            obj = iMMediaPagerViewModelValueOf.copydefault(oKMessageGEmmrt, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        final IMMediaPagerViewModel.TaskDescription taskDescription = (IMMediaPagerViewModel.TaskDescription) obj;
        C32866mlf.onEvent$default("IMChat_File_Open_Click", (TrackChannel[]) null, new Function1() { // from class: o.opj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return IMMediaPagerActivity$trackPageEntry$1.invokeSuspend$lambda$3(taskDescription, (EventParamsList) obj2);
            }
        }, 1, (Object) null);
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("File open click");
        Pair[] pairArr = new Pair[6];
        String strEZpvd = taskDescription.EZpvd();
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("isRunningInEmulator", strEZpvd);
        Integer numKWHzl = taskDescription.KWHzl();
        String string = numKWHzl != null ? numKWHzl.toString() : null;
        if (string == null) {
            string = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("path", string);
        Integer numValueOf = taskDescription.valueOf();
        String string2 = numValueOf != null ? numValueOf.toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        pairArr[2] = C56390yDp.OLrzqt("isAppDebuggable", string2);
        pairArr[3] = C56390yDp.OLrzqt("totalTime", String.valueOf(taskDescription.copydefault()));
        String strAEQbTJ = taskDescription.AEQbTJ();
        pairArr[4] = C56390yDp.OLrzqt("attr_1", strAEQbTJ != null ? strAEQbTJ : "");
        pairArr[5] = C56390yDp.OLrzqt("attr_2", taskDescription.OLrzqt());
        eventDataAEQbTJ.setAttrs(C56424yEw.gEmmrt(pairArr));
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(IMMediaPagerViewModel.TaskDescription taskDescription, EventParamsList eventParamsList) {
        String strEZpvd = taskDescription.EZpvd();
        if (strEZpvd != null) {
            eventParamsList.put("file_type", strEZpvd, true);
        }
        Integer numKWHzl = taskDescription.KWHzl();
        if (numKWHzl != null) {
            eventParamsList.put("group_type", String.valueOf(numKWHzl.intValue()), true);
        }
        Integer numValueOf = taskDescription.valueOf();
        if (numValueOf != null) {
            eventParamsList.put("sender_group_role", String.valueOf(numValueOf.intValue()), true);
        }
        eventParamsList.put("channel_type", String.valueOf(taskDescription.copydefault()), true);
        String strAEQbTJ = taskDescription.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        eventParamsList.put("chat_name", strAEQbTJ, false);
        String strOLrzqt = taskDescription.OLrzqt();
        eventParamsList.put("channel_id", strOLrzqt != null ? strOLrzqt : "", false);
        return Unit.INSTANCE;
    }
}
