package com.okinc.buysell.ui.bsc.convert;

import com.okinc.buysell.domain.BothTokenSwitchedUseCase;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31351lsQ;
import o.C31389ltB;
import o.C33069mpW;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.lyP;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class ConvertViewModel$onBothTokenSwitched$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTokenPrefillEvent;
    final /* synthetic */ ConvertCurrencyBean $newFromCcy;
    final /* synthetic */ ConvertCurrencyBean $newToCcy;
    int label;
    final /* synthetic */ ConvertViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertViewModel$onBothTokenSwitched$1(boolean z, ConvertCurrencyBean convertCurrencyBean, ConvertCurrencyBean convertCurrencyBean2, ConvertViewModel convertViewModel, Continuation<? super ConvertViewModel$onBothTokenSwitched$1> continuation) {
        super(2, continuation);
        this.$isTokenPrefillEvent = z;
        this.$newFromCcy = convertCurrencyBean;
        this.$newToCcy = convertCurrencyBean2;
        this.this$0 = convertViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConvertViewModel$onBothTokenSwitched$1(this.$isTokenPrefillEvent, this.$newFromCcy, this.$newToCcy, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConvertViewModel$onBothTokenSwitched$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb A[Catch: Exception -> 0x0150, TryCatch #0 {Exception -> 0x0150, blocks: (B:6:0x000f, B:26:0x0104, B:28:0x010c, B:29:0x0129, B:31:0x012f, B:10:0x001c, B:19:0x005c, B:20:0x00a6, B:22:0x00bb, B:23:0x00d0, B:13:0x0023, B:15:0x0027, B:16:0x0030), top: B:39:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010c A[Catch: Exception -> 0x0150, TryCatch #0 {Exception -> 0x0150, blocks: (B:6:0x000f, B:26:0x0104, B:28:0x010c, B:29:0x0129, B:31:0x012f, B:10:0x001c, B:19:0x005c, B:20:0x00a6, B:22:0x00bb, B:23:0x00d0, B:13:0x0023, B:15:0x0027, B:16:0x0030), top: B:39:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012f A[Catch: Exception -> 0x0150, TRY_LEAVE, TryCatch #0 {Exception -> 0x0150, blocks: (B:6:0x000f, B:26:0x0104, B:28:0x010c, B:29:0x0129, B:31:0x012f, B:10:0x001c, B:19:0x005c, B:20:0x00a6, B:22:0x00bb, B:23:0x00d0, B:13:0x0023, B:15:0x0027, B:16:0x0030), top: B:39:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pairOLrzqt;
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            mHA mha = mHA.OLrzqt;
            mha.OLrzqt(this.this$0.zuBGHE, C56443yFo.KWHzl(false));
            if (e instanceof OKServerException) {
                mha.OLrzqt(this.this$0.QOLQEE, e.getMessage());
            }
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.$isTokenPrefillEvent) {
                mHA.OLrzqt.OLrzqt(this.this$0.zuBGHE, C56443yFo.KWHzl(true));
                BothTokenSwitchedUseCase bothTokenSwitchedUseCaseAkhnZx = this.this$0.AkhnZx();
                ConvertCurrencyBean convertCurrencyBean = this.$newFromCcy;
                ConvertCurrencyBean convertCurrencyBean2 = this.$newToCcy;
                String isoCode = this.this$0.fIwbmz().getIsoCode();
                this.label = 1;
                obj = bothTokenSwitchedUseCaseAkhnZx.KWHzl(convertCurrencyBean, convertCurrencyBean2, isoCode, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(this.$newFromCcy, this.$newToCcy);
                ConvertCurrencyBean convertCurrencyBean3 = (ConvertCurrencyBean) pairOLrzqt.component1();
                ConvertCurrencyBean convertCurrencyBean4 = (ConvertCurrencyBean) pairOLrzqt.component2();
                this.this$0.EZpvd(convertCurrencyBean3, convertCurrencyBean4);
                if (!this.$isTokenPrefillEvent) {
                    mHA.OLrzqt.OLrzqt(this.this$0.fJNWhG, C56443yFo.KWHzl(this.this$0.OLrzqt(convertCurrencyBean3, convertCurrencyBean4)));
                }
                mHA.OLrzqt.OLrzqt(this.this$0.fIwbmz, C56443yFo.KWHzl(Intrinsics.EZpvd(convertCurrencyBean3.getFiatFlag(), C56443yFo.KWHzl(true))));
                this.this$0.copydefault(new Pair<>(convertCurrencyBean3, convertCurrencyBean4));
                lyP lypZLjUOn = this.this$0.zLjUOn();
                this.label = 2;
                obj = lypZLjUOn.copydefault(convertCurrencyBean3, convertCurrencyBean4, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                abstractC43419rot = (AbstractC43419rot) obj;
                ConvertViewModel convertViewModel = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                }
                ConvertViewModel convertViewModel2 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                ConvertViewModel convertViewModel3 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    C31389ltB c31389ltB = (C31389ltB) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                    mHA mha2 = mHA.OLrzqt;
                    mha2.OLrzqt(convertViewModel3.zuBGHE, C56443yFo.KWHzl(false));
                    mha2.OLrzqt(convertViewModel3.DbNXlk, c31389ltB);
                }
                ConvertViewModel convertViewModel22 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                    mHA mha3 = mHA.OLrzqt;
                    mha3.OLrzqt(convertViewModel22.zuBGHE, C56443yFo.KWHzl(false));
                    mha3.OLrzqt(convertViewModel22.QOLQEE, oKServerException.getMessage());
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        Triple triple = (Triple) ((AbstractC43419rot) obj).AEQbTJ();
        C33069mpW.copydefault(C31351lsQ.Activity.zsXlph, C56424yEw.gEmmrt(C56390yDp.OLrzqt("badToken", this.$newFromCcy.getCcy()), C56390yDp.OLrzqt("newToken", ((ConvertCurrencyBean) triple.getFirst()).getCcy())));
        this.this$0.copydefault((List<ConvertCurrencyBean>) triple.getThird());
        pairOLrzqt = C56390yDp.OLrzqt(triple.getFirst(), triple.getSecond());
        ConvertCurrencyBean convertCurrencyBean32 = (ConvertCurrencyBean) pairOLrzqt.component1();
        ConvertCurrencyBean convertCurrencyBean42 = (ConvertCurrencyBean) pairOLrzqt.component2();
        this.this$0.EZpvd(convertCurrencyBean32, convertCurrencyBean42);
        if (!this.$isTokenPrefillEvent) {
        }
        mHA.OLrzqt.OLrzqt(this.this$0.fIwbmz, C56443yFo.KWHzl(Intrinsics.EZpvd(convertCurrencyBean32.getFiatFlag(), C56443yFo.KWHzl(true))));
        this.this$0.copydefault(new Pair<>(convertCurrencyBean32, convertCurrencyBean42));
        lyP lypZLjUOn2 = this.this$0.zLjUOn();
        this.label = 2;
        obj = lypZLjUOn2.copydefault(convertCurrencyBean32, convertCurrencyBean42, this);
        if (obj == objCopydefault) {
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        ConvertViewModel convertViewModel32 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
        }
        ConvertViewModel convertViewModel222 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
