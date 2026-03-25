package com.okinc.business.trade.features.home.advanced.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C27614jyX;
import o.C28179kRv;
import o.C28222kTk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketInfoVM$subscribeMarketInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenAddress;
    Object L$0;
    int label;
    final /* synthetic */ AdvancedMarketInfoVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketInfoVM$subscribeMarketInfo$1(AdvancedMarketInfoVM advancedMarketInfoVM, String str, String str2, Continuation<? super AdvancedMarketInfoVM$subscribeMarketInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedMarketInfoVM;
        this.$chainId = str;
        this.$tokenAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMarketInfoVM$subscribeMarketInfo$1(this.this$0, this.$chainId, this.$tokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedMarketInfoVM$subscribeMarketInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objOLrzqt;
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28179kRv c28179kRv = this.this$0.AuCTel;
            String str = this.$chainId;
            String str2 = this.$tokenAddress;
            this.label = 1;
            objEZpvd = c28179kRv.EZpvd(str, str2, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objOLrzqt = obj;
                    abstractC43419rot = (AbstractC43419rot) objOLrzqt;
                    AdvancedMarketInfoVM advancedMarketInfoVM = this.this$0;
                    if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                        C28222kTk c28222kTk = (C28222kTk) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                        advancedMarketInfoVM.AEQbTJ.setValue(C28222kTk.copy$default((C28222kTk) advancedMarketInfoVM.AEQbTJ.getValue(), null, null, c28222kTk.copydefault(), c28222kTk.AEQbTJ(), c28222kTk.djBIcL(), null, 35, null));
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
                C28179kRv c28179kRv2 = this.this$0.AuCTel;
                String str3 = this.$chainId;
                String str4 = this.$tokenAddress;
                this.L$0 = null;
                this.label = 3;
                objOLrzqt = c28179kRv2.OLrzqt(str3, str4, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                abstractC43419rot = (AbstractC43419rot) objOLrzqt;
                AdvancedMarketInfoVM advancedMarketInfoVM2 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
        }
        AbstractC43419rot abstractC43419rot2 = (AbstractC43419rot) objEZpvd;
        AdvancedMarketInfoVM advancedMarketInfoVM3 = this.this$0;
        String str5 = this.$chainId;
        String str6 = this.$tokenAddress;
        if (abstractC43419rot2 instanceof AbstractC43419rot.StateListAnimator) {
            C28222kTk c28222kTk2 = (C28222kTk) ((AbstractC43419rot.StateListAnimator) abstractC43419rot2).KWHzl();
            advancedMarketInfoVM3.AEQbTJ.setValue(C28222kTk.copy$default((C28222kTk) advancedMarketInfoVM3.AEQbTJ.getValue(), c28222kTk2.EZpvd(), c28222kTk2.KWHzl(), null, null, c28222kTk2.djBIcL(), c28222kTk2.OLrzqt(), 12, null));
            C28179kRv c28179kRv3 = advancedMarketInfoVM3.AuCTel;
            C27614jyX c27614jyX = new C27614jyX(str5, str6, null, 4, null);
            this.L$0 = abstractC43419rot2;
            this.label = 2;
            if (c28179kRv3.KWHzl(c27614jyX, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        C28179kRv c28179kRv22 = this.this$0.AuCTel;
        String str32 = this.$chainId;
        String str42 = this.$tokenAddress;
        this.L$0 = null;
        this.label = 3;
        objOLrzqt = c28179kRv22.OLrzqt(str32, str42, this);
        if (objOLrzqt == objCopydefault) {
        }
        abstractC43419rot = (AbstractC43419rot) objOLrzqt;
        AdvancedMarketInfoVM advancedMarketInfoVM22 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
        }
        return Unit.INSTANCE;
    }
}
