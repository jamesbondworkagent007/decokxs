package com.okinc.business.defi.wallet.home.onboarding.ui;

import com.okinc.business.defi.api.bean.CoinPrice;
import com.okinc.business.defi.biz.net.bean.NftCollection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C14728dqt;
import o.C18192fdk;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC18118fcP;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiOnboardingViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefiOnboardingViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiOnboardingViewModel$loadData$1(DefiOnboardingViewModel defiOnboardingViewModel, Continuation<? super DefiOnboardingViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = defiOnboardingViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefiOnboardingViewModel$loadData$1 defiOnboardingViewModel$loadData$1 = new DefiOnboardingViewModel$loadData$1(this.this$0, continuation);
        defiOnboardingViewModel$loadData$1.L$0 = obj;
        return defiOnboardingViewModel$loadData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiOnboardingViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List listAhwBna;
        Object objEZpvd;
        List list;
        AbstractC43419rot abstractC43419rot;
        AbstractC43419rot actionBar;
        String price;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String price2 = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AEQbTJ.copydefault((CoroutineScope) this.L$0);
            if (C14728dqt.KWHzl.KWHzl()) {
                DefiOnboardingViewModel defiOnboardingViewModel = this.this$0;
                this.label = 1;
                obj = defiOnboardingViewModel.EZpvd((Continuation<? super Boolean>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            C18192fdk c18192fdk = this.this$0.AEQbTJ;
            this.label = 2;
            obj = c18192fdk.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            listAhwBna = (List) ((AbstractC43419rot) obj).copydefault();
            if (listAhwBna == null) {
            }
            C13934dbu c13934dbu = this.this$0.OLrzqt;
            List<Long> listEZpvd = C56402yEa.EZpvd(C56443yFo.KWHzl(3L));
            this.L$0 = listAhwBna;
            this.label = 3;
            objEZpvd = c13934dbu.EZpvd(listEZpvd, (List<Long>) null, this);
            if (objEZpvd == objCopydefault) {
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    listAhwBna = (List) ((AbstractC43419rot) obj).copydefault();
                    if (listAhwBna == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    C13934dbu c13934dbu2 = this.this$0.OLrzqt;
                    List<Long> listEZpvd2 = C56402yEa.EZpvd(C56443yFo.KWHzl(3L));
                    this.L$0 = listAhwBna;
                    this.label = 3;
                    objEZpvd = c13934dbu2.EZpvd(listEZpvd2, (List<Long>) null, this);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    list = listAhwBna;
                    obj = objEZpvd;
                    abstractC43419rot = (AbstractC43419rot) obj;
                    if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                    }
                    this.this$0.KWHzl.setValue(new InterfaceC18118fcP.Activity(this.this$0.copydefault((List<NftCollection>) list, (String) actionBar.copydefault())));
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                    CoinPrice coinPrice = (CoinPrice) CollectionsKt___CollectionsKt.firstOrNull((List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
                    if (coinPrice != null && coinPrice.getHasPrice() && (price = coinPrice.getPrice()) != null && price.length() != 0) {
                        price2 = coinPrice.getPrice();
                    }
                    actionBar = new AbstractC43419rot.StateListAnimator(price2);
                } else {
                    if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    actionBar = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
                }
                this.this$0.KWHzl.setValue(new InterfaceC18118fcP.Activity(this.this$0.copydefault((List<NftCollection>) list, (String) actionBar.copydefault())));
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C14728dqt.KWHzl.KWHzl(((Boolean) obj).booleanValue());
        C18192fdk c18192fdk2 = this.this$0.AEQbTJ;
        this.label = 2;
        obj = c18192fdk2.copydefault(this);
        if (obj == objCopydefault) {
        }
        listAhwBna = (List) ((AbstractC43419rot) obj).copydefault();
        if (listAhwBna == null) {
        }
        C13934dbu c13934dbu22 = this.this$0.OLrzqt;
        List<Long> listEZpvd22 = C56402yEa.EZpvd(C56443yFo.KWHzl(3L));
        this.L$0 = listAhwBna;
        this.label = 3;
        objEZpvd = c13934dbu22.EZpvd(listEZpvd22, (List<Long>) null, this);
        if (objEZpvd == objCopydefault) {
        }
    }
}
