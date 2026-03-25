package com.okinc.business.invest_biz.ui.screens.token_selection.view_model;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C26608jfY;
import o.C26663jga;
import o.C27493jwI;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC26664jgb;
import o.iDA;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class RedeemTokenSelectionViewModel extends ViewModel implements InterfaceC26664jgb {
    public final StateFlow<C26663jga> AEQbTJ;
    public final MutableStateFlow<List<C26608jfY>> EZpvd;
    public final StateFlow<List<C26608jfY>> KWHzl;
    public final iDA OLrzqt;
    public final MutableStateFlow<C26663jga> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Lkotlinx/coroutines/flow/Flow; */
    @Override // o.InterfaceC26664jgb
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateFlow<C26663jga> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lkotlinx/coroutines/flow/Flow; */
    @Override // o.InterfaceC26664jgb
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public StateFlow<List<C26608jfY>> OLrzqt() {
        return this.KWHzl;
    }

    @yCM
    public RedeemTokenSelectionViewModel(@NotNull iDA ida) {
        Intrinsics.checkNotNullParameter(ida, "");
        this.OLrzqt = ida;
        MutableStateFlow<C26663jga> MutableStateFlow = StateFlowKt.MutableStateFlow(new C26663jga(null, true, null, 5, null));
        this.copydefault = MutableStateFlow;
        MutableStateFlow<List<C26608jfY>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.EZpvd = MutableStateFlow2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow2);
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.token_selection.view_model.RedeemTokenSelectionViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RedeemTokenSelectionViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow = RedeemTokenSelectionViewModel.this.copydefault;
                final RedeemTokenSelectionViewModel redeemTokenSelectionViewModel = RedeemTokenSelectionViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.invest_biz.ui.screens.token_selection.view_model.RedeemTokenSelectionViewModel.1.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(C26663jga c26663jga, Continuation<? super Unit> continuation) {
                        if (!c26663jga.EZpvd() && c26663jga.OLrzqt() == null) {
                            MutableStateFlow mutableStateFlow2 = redeemTokenSelectionViewModel.EZpvd;
                            List<InvestTokenWithAmount> listKWHzl = c26663jga.KWHzl();
                            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
                            Iterator<T> it = listKWHzl.iterator();
                            while (it.hasNext()) {
                                arrayList.add(C26608jfY.Companion.AEQbTJ((InvestTokenWithAmount) it.next()));
                            }
                            mutableStateFlow2.setValue(arrayList);
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (mutableStateFlow.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // o.InterfaceC26664jgb
    public void AEQbTJ(@NotNull TokenSelectionParams tokenSelectionParams) {
        Intrinsics.checkNotNullParameter(tokenSelectionParams, "");
        AEQbTJ("", tokenSelectionParams);
    }

    @Override // o.InterfaceC26664jgb
    public void OLrzqt(@NotNull String str, @NotNull TokenSelectionParams tokenSelectionParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tokenSelectionParams, "");
        AEQbTJ(str, tokenSelectionParams);
    }

    @Override // o.InterfaceC26664jgb
    public InvestTokenWithAmount copydefault(@NotNull C26608jfY c26608jfY) {
        Object next;
        Intrinsics.checkNotNullParameter(c26608jfY, "");
        Iterator<T> it = this.copydefault.getValue().KWHzl().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next).getTokenAddress(), (Object) c26608jfY.copydefault())) {
                break;
            }
        }
        return (InvestTokenWithAmount) next;
    }

    public final void AEQbTJ(String str, TokenSelectionParams tokenSelectionParams) {
        MutableStateFlow<C26663jga> mutableStateFlow = this.copydefault;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new C26663jga(null, true, null, 5, null))) {
        }
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new RedeemTokenSelectionViewModel$reload$2(str, this, tokenSelectionParams, null), 3, null);
    }
}
