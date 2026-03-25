package com.okinc.tradingbot.impl.order.strategy.grid.dialog;

import com.okinc.unify_trade.biz.bot.EditEarnRequestDto;
import com.okinc.unify_trade.biz.bot.SmartEarnProperties;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C50503vQv;
import o.C50545vSj;
import o.C50546vSk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartEarnAllocationBottomSheetViewModel$trigger$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C50503vQv.Application $action;
    int label;
    final /* synthetic */ C50503vQv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartEarnAllocationBottomSheetViewModel$trigger$2(C50503vQv.Application application, C50503vQv c50503vQv, Continuation<? super SmartEarnAllocationBottomSheetViewModel$trigger$2> continuation) {
        super(2, continuation);
        this.$action = application;
        this.this$0 = c50503vQv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartEarnAllocationBottomSheetViewModel$trigger$2(this.$action, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartEarnAllocationBottomSheetViewModel$trigger$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x021d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        C50546vSk c50546vSkKWHzl;
        Object value3;
        Object value4;
        C50545vSj c50545vSj;
        EditEarnRequestDto editEarnRequestDto;
        MutableSharedFlow mutableSharedFlow;
        C50503vQv.Activity.TaskDescription taskDescription;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                C50503vQv.Application application = this.$action;
                if (application instanceof C50503vQv.Application.C0982Application) {
                    this.this$0.AEQbTJ((C50503vQv.Application.C0982Application) application);
                } else if (application instanceof C50503vQv.Application.TaskDescription) {
                    this.this$0.KWHzl(((C50503vQv.Application.TaskDescription) application).copydefault());
                } else if (application instanceof C50503vQv.Application.Fragment) {
                    MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
                    C50503vQv.Application application2 = this.$action;
                    do {
                        value4 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value4, C50503vQv.ActionBar.copy$default((C50503vQv.ActionBar) value4, 0L, null, ((C50503vQv.Application.Fragment) application2).AEQbTJ(), null, false, 27, null)));
                } else if (application instanceof C50503vQv.Application.Dialog) {
                    MutableStateFlow mutableStateFlow2 = this.this$0.AEQbTJ;
                    C50503vQv.Application application3 = this.$action;
                    do {
                        value3 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value3, C50503vQv.ActionBar.copy$default((C50503vQv.ActionBar) value3, 0L, null, null, ((C50503vQv.Application.Dialog) application3).AEQbTJ(), false, 23, null)));
                } else if (application instanceof C50503vQv.Application.ActionBar) {
                    SmartEarnProperties smartEarnPropertiesAEQbTJ = this.this$0.AEQbTJ();
                    if (((C50503vQv.ActionBar) this.this$0.AEQbTJ.getValue()).EZpvd() || this.this$0.copydefault().copydefault()) {
                        if (StringsKt__StringsKt.fARcdN((CharSequence) ((C50503vQv.ActionBar) this.this$0.AEQbTJ.getValue()).OLrzqt())) {
                            MutableSharedFlow mutableSharedFlow2 = this.this$0.EZpvd;
                            C50503vQv.Activity.ActionBar actionBar = C50503vQv.Activity.ActionBar.KWHzl;
                            this.label = 2;
                            if (mutableSharedFlow2.emit(actionBar, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else if (StringsKt__StringsKt.fARcdN((CharSequence) ((C50503vQv.ActionBar) this.this$0.AEQbTJ.getValue()).AEQbTJ())) {
                            MutableSharedFlow mutableSharedFlow3 = this.this$0.EZpvd;
                            C50503vQv.Activity.Application application4 = C50503vQv.Activity.Application.EZpvd;
                            this.label = 3;
                            if (mutableSharedFlow3.emit(application4, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            C50546vSk c50546vSkEZpvd = this.this$0.KWHzl().getValue().KWHzl().EZpvd();
                            if ((c50546vSkEZpvd == null || c50546vSkEZpvd.KWHzl()) && ((c50546vSkKWHzl = this.this$0.KWHzl().getValue().KWHzl().KWHzl()) == null || c50546vSkKWHzl.KWHzl())) {
                                Pair pairAhwBna = this.this$0.AhwBna();
                                String str = (String) pairAhwBna.component1();
                                String str2 = (String) pairAhwBna.component2();
                                if (this.this$0.copydefault().copydefault()) {
                                    if (!((C50503vQv.ActionBar) this.this$0.AEQbTJ.getValue()).EZpvd()) {
                                        if (smartEarnPropertiesAEQbTJ == null || !smartEarnPropertiesAEQbTJ.getEnabled()) {
                                            MutableSharedFlow mutableSharedFlow4 = this.this$0.EZpvd;
                                            C50503vQv.Activity.C0981Activity c0981Activity = C50503vQv.Activity.C0981Activity.copydefault;
                                            this.label = 7;
                                            if (mutableSharedFlow4.emit(c0981Activity, this) == objCopydefault) {
                                                return objCopydefault;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        MutableSharedFlow mutableSharedFlow5 = this.this$0.EZpvd;
                                        C50503vQv.Activity.FragmentManager fragmentManager = C50503vQv.Activity.FragmentManager.copydefault;
                                        this.label = 4;
                                        if (mutableSharedFlow5.emit(fragmentManager, this) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        c50545vSj = this.this$0.AYXKKw;
                                        editEarnRequestDto = new EditEarnRequestDto(this.this$0.copydefault().EZpvd(), C56443yFo.KWHzl(false), null, null, null);
                                        this.label = 5;
                                        if (c50545vSj.KWHzl(editEarnRequestDto, this) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        mutableSharedFlow = this.this$0.EZpvd;
                                        taskDescription = C50503vQv.Activity.TaskDescription.copydefault;
                                        this.label = 6;
                                        if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    if (smartEarnPropertiesAEQbTJ == null || !smartEarnPropertiesAEQbTJ.getHasParametersSet()) {
                                        C50503vQv c50503vQv = this.this$0;
                                        this.label = 9;
                                        if (c50503vQv.copydefault((Continuation<? super Unit>) this) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    SmartEarnRequestParam smartEarnRequestParam = new SmartEarnRequestParam(smartEarnPropertiesAEQbTJ.getEnabled(), smartEarnPropertiesAEQbTJ.getEarnMinLimit(), smartEarnPropertiesAEQbTJ.getEarnMaxLimit(), smartEarnPropertiesAEQbTJ.getEarnType(), (String) null, 16, (DefaultConstructorMarker) null);
                                    SmartEarnRequestParam smartEarnRequestParam2 = new SmartEarnRequestParam(((C50503vQv.ActionBar) this.this$0.AEQbTJ.getValue()).EZpvd(), str, str2, ((C50503vQv.ActionBar) this.this$0.AEQbTJ.getValue()).KWHzl(), (String) null, 16, (DefaultConstructorMarker) null);
                                    if (true ^ Intrinsics.EZpvd(smartEarnRequestParam, smartEarnRequestParam2)) {
                                        MutableSharedFlow mutableSharedFlow6 = this.this$0.EZpvd;
                                        C50503vQv.Activity.Dialog dialog = new C50503vQv.Activity.Dialog(smartEarnRequestParam, smartEarnRequestParam2);
                                        this.label = 8;
                                        if (mutableSharedFlow6.emit(dialog, this) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                MutableSharedFlow mutableSharedFlow7 = this.this$0.EZpvd;
                                C50503vQv.Activity.StateListAnimator stateListAnimator = new C50503vQv.Activity.StateListAnimator(str, str2, ((C50503vQv.ActionBar) this.this$0.AEQbTJ.getValue()).KWHzl(), ((C50503vQv.ActionBar) this.this$0.AEQbTJ.getValue()).EZpvd());
                                this.label = 10;
                                if (mutableSharedFlow7.emit(stateListAnimator, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        MutableSharedFlow mutableSharedFlow8 = this.this$0.EZpvd;
                        C50503vQv.Activity.StateListAnimator stateListAnimator2 = new C50503vQv.Activity.StateListAnimator(((C50503vQv.ActionBar) this.this$0.AEQbTJ.getValue()).OLrzqt(), ((C50503vQv.ActionBar) this.this$0.AEQbTJ.getValue()).AEQbTJ(), ((C50503vQv.ActionBar) this.this$0.AEQbTJ.getValue()).KWHzl(), false);
                        this.label = 1;
                        if (mutableSharedFlow8.emit(stateListAnimator2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else if (application instanceof C50503vQv.Application.StateListAnimator) {
                    MutableStateFlow mutableStateFlow3 = this.this$0.AEQbTJ;
                    C50503vQv c50503vQv2 = this.this$0;
                    do {
                        value2 = mutableStateFlow3.getValue();
                    } while (!mutableStateFlow3.compareAndSet(value2, C50503vQv.ActionBar.copy$default((C50503vQv.ActionBar) value2, System.currentTimeMillis(), null, (String) c50503vQv2.KWHzl().getValue().EZpvd().getStart(), (String) c50503vQv2.KWHzl().getValue().EZpvd().getEndInclusive(), false, 18, null)));
                } else if (application instanceof C50503vQv.Application.Activity) {
                    MutableStateFlow mutableStateFlow4 = this.this$0.AEQbTJ;
                    C50503vQv.Application application5 = this.$action;
                    do {
                        value = mutableStateFlow4.getValue();
                    } while (!mutableStateFlow4.compareAndSet(value, C50503vQv.ActionBar.copy$default((C50503vQv.ActionBar) value, 0L, null, null, null, ((C50503vQv.Application.Activity) application5).AEQbTJ(), 15, null)));
                } else if (application instanceof C50503vQv.Application.PendingIntent) {
                    C50503vQv c50503vQv3 = this.this$0;
                    this.label = 11;
                    if (c50503vQv3.copydefault((Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            case 1:
            case 2:
            case 3:
            case 10:
            case 11:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 4:
                C56391yDq.AEQbTJ(obj);
                c50545vSj = this.this$0.AYXKKw;
                editEarnRequestDto = new EditEarnRequestDto(this.this$0.copydefault().EZpvd(), C56443yFo.KWHzl(false), null, null, null);
                this.label = 5;
                if (c50545vSj.KWHzl(editEarnRequestDto, this) == objCopydefault) {
                }
                mutableSharedFlow = this.this$0.EZpvd;
                taskDescription = C50503vQv.Activity.TaskDescription.copydefault;
                this.label = 6;
                if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 5:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.EZpvd;
                taskDescription = C50503vQv.Activity.TaskDescription.copydefault;
                this.label = 6;
                if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 8:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 9:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
