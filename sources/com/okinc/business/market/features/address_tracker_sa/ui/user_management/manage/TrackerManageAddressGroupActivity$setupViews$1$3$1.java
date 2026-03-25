package com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage;

import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC25769jFr;
import o.C23274hvD;
import o.C33070mpX;
import o.C33129mqd;
import o.C46526tXp;
import o.C52761wXj;
import o.C55328xhq;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.jBN;
import o.jFP;
import o.pTD;

/* JADX INFO: loaded from: classes15.dex */
public final class TrackerManageAddressGroupActivity$setupViews$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ jFP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerManageAddressGroupActivity$setupViews$1$3$1(jFP jfp, Continuation<? super TrackerManageAddressGroupActivity$setupViews$1$3$1> continuation) {
        super(2, continuation);
        this.this$0 = jfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerManageAddressGroupActivity$setupViews$1$3$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerManageAddressGroupActivity$setupViews$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TrackerManageAddressGroupViewModel trackerManageAddressGroupViewModelAhwBna = this.this$0.AhwBna();
            this.label = 1;
            Object objEZpvd = trackerManageAddressGroupViewModelAhwBna.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        jFP jfp = this.this$0;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            ResponseData responseData = (ResponseData) objM7386unboximpl;
            int code = responseData.getCode();
            if (code == 0) {
                jBN.copydefault.KWHzl(jfp.AhwBna().AuCTel().getValue().intValue() == 2 ? DexTrackEventParameter.AddressManagementButtonName.TURN_OFF : DexTrackEventParameter.AddressManagementButtonName.TURN_ON);
                C55328xhq.show$default(C55328xhq.OLrzqt, pTD.EZpvd(jfp, jfp.AhwBna().AuCTel().getValue().intValue() == 2 ? C23274hvD.FragmentManager.djBIcL : C23274hvD.FragmentManager.AhwBna, C33129mqd.AhwBna(responseData.getData()), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C56443yFo.AEQbTJ(C33129mqd.AhwBna(responseData.getData()))))), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 0, (Integer) null, 0, 0, 60, (Object) null);
                AbstractC25769jFr.loadAddresses$default(jfp.AhwBna(), false, 1, null);
                Unit unit = Unit.INSTANCE;
            } else if (code == 10064) {
                C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.dNxZaP), C33070mpX.KWHzl(C52761wXj.TaskDescription.dPkBzA), 0, (Integer) null, 0, 0, 60, (Object) null);
            } else {
                C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C46526tXp.TaskDescription.AhwBna), C33070mpX.KWHzl(C52761wXj.TaskDescription.dPkBzA), 0, (Integer) null, 0, 0, 60, (Object) null);
            }
        }
        if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
            C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C46526tXp.TaskDescription.AhwBna), C33070mpX.KWHzl(C52761wXj.TaskDescription.dPkBzA), 0, (Integer) null, 0, 0, 60, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
