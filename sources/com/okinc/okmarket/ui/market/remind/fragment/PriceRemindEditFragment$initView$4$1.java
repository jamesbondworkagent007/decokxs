package com.okinc.okmarket.ui.market.remind.fragment;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.okinc.business.market.bean.TokenInfoForAlert;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.market.alert.data.MarketUserAlert;
import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initView$4$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32866mlf;
import o.C33129mqd;
import o.C38382pWs;
import o.C38383pWt;
import o.C46768tdR;
import o.C46817teN;
import o.C46825teV;
import o.C55326xho;
import o.C55686xod;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.qZH;

/* JADX INFO: loaded from: classes10.dex */
public final class PriceRemindEditFragment$initView$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C46825teV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceRemindEditFragment$initView$4$1(C46825teV c46825teV, Continuation<? super PriceRemindEditFragment$initView$4$1> continuation) {
        super(2, continuation);
        this.this$0 = c46825teV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PriceRemindEditFragment$initView$4$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PriceRemindEditFragment$initView$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initView$4$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C46825teV this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C46825teV c46825teV, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = c46825teV;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0187  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            DialogFragment dialogFragment;
            Object objKWHzl;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C32866mlf.onEvent$default("PriceAlert_AddAlert_Add_Click", (TrackChannel[]) null, new Function1() { // from class: o.tfj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return PriceRemindEditFragment$initView$4$1.AnonymousClass1.invokeSuspend$lambda$0((EventParamsList) obj2);
                    }
                }, 1, (Object) null);
                Context context = this.this$0.getContext();
                if (context != null) {
                    C46825teV c46825teV = this.this$0;
                    c46825teV.DbNXlk().EZpvd(c46825teV.AkhnZx(), c46825teV.fetchVPNInfo(), context, c46825teV.iwGUEr);
                    c46825teV.DbNXlk().KWHzl(c46825teV.AubY.OLrzqt(), c46825teV.AubY.copydefault());
                }
                C46817teN c46817teNValues = this.this$0.values();
                if (c46817teNValues != null) {
                    c46817teNValues.copydefault(true);
                }
                if (this.this$0.isConnected().AEQbTJ() == 1) {
                    this.this$0.DbNXlk().OLrzqt(false);
                    C32866mlf.onEvent$default("PriceAlert_EditSheet_Save_Click", (TrackChannel[]) null, new Function1() { // from class: o.tfl
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return PriceRemindEditFragment$initView$4$1.AnonymousClass1.invokeSuspend$lambda$2((EventParamsList) obj2);
                        }
                    }, 1, (Object) null);
                }
                PriceEditViewModel priceEditViewModelIsConnected = this.this$0.isConnected();
                int i2 = this.this$0.iwGUEr;
                TokenInfoForAlert tokenInfoForAlert = this.this$0.AubY;
                this.label = 1;
                objKWHzl = priceEditViewModelIsConnected.KWHzl(i2, tokenInfoForAlert, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    C55326xho.toastWithSuccessfulIcon$default(qZH.PendingIntent.iLAtSv, 0, 1, (Object) null);
                    Fragment parentFragment = this.this$0.getParentFragment();
                    dialogFragment = parentFragment instanceof DialogFragment ? (DialogFragment) parentFragment : null;
                    if (dialogFragment != null) {
                        dialogFragment.dismissAllowingStateLoss();
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj;
            }
            if (((ResponseData) objKWHzl).getCode() == 0) {
                if (this.this$0.isConnected().AEQbTJ() == 0) {
                    AlertRemindPo alertRemindPoValueOf = this.this$0.valueOf();
                    if (!Intrinsics.EZpvd((Object) (alertRemindPoValueOf != null ? alertRemindPoValueOf.getInstrumentName() : null), (Object) this.this$0.AkhnZx())) {
                        this.this$0.DbNXlk().OLrzqt(true);
                    }
                    C46825teV c46825teV2 = this.this$0;
                    Result.Application application2 = Result.Companion;
                    C38383pWt c38383pWtHDKMBd = c46825teV2.hDKMBd();
                    MarketUserAlert marketUserAlert = new MarketUserAlert(0L, c46825teV2.AkhnZx(), C55686xod.KWHzl(), C38382pWs.copydefault.OLrzqt(c46825teV2.fetchVPNInfo()), c46825teV2.isConnected().copydefault().getValue().AEQbTJ().getModifyTime(), C33129mqd.gEmmrt(C56443yFo.KWHzl(c46825teV2.isConnected().copydefault().getValue().AEQbTJ().getRuleId())), c46825teV2.AubY.OLrzqt(), c46825teV2.AubY.copydefault(), 1, null);
                    this.label = 2;
                    if (c38383pWtHDKMBd.EZpvd(marketUserAlert, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    C55326xho.toastWithSuccessfulIcon$default(qZH.PendingIntent.iLAtSv, 0, 1, (Object) null);
                } else {
                    C55326xho.toastWithSuccessfulIcon$default(qZH.PendingIntent.HJWChPQPAeHI, 0, 1, (Object) null);
                }
            }
            Fragment parentFragment2 = this.this$0.getParentFragment();
            if (parentFragment2 instanceof DialogFragment) {
            }
            if (dialogFragment != null) {
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(EventParamsList eventParamsList) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(EventParamsList eventParamsList) {
            EventParamsList.put$default(eventParamsList, "entry_point", "mobile_entry_button", false, 4, null);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (C46768tdR.copydefault(anonymousClass1, this) == objCopydefault) {
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
}
