package com.okinc.business.market.features.address_tracker.ui;

import androidx.activity.result.ActivityResultCaller;
import androidx.core.view.KeyEventDispatcher;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25655jBl;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25657jBn;
import o.InterfaceC25659jBp;
import o.InterfaceC25660jBq;
import o.yHO;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerGroupSelectionBottomSheet$onSave$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C25655jBl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerGroupSelectionBottomSheet$onSave$1(C25655jBl c25655jBl, Continuation<? super TrackerGroupSelectionBottomSheet$onSave$1> continuation) {
        super(2, continuation);
        this.this$0 = c25655jBl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerGroupSelectionBottomSheet$onSave$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerGroupSelectionBottomSheet$onSave$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC25657jBn interfaceC25657jBn;
        InterfaceC25657jBn interfaceC25657jBn2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityResultCaller parentFragment = this.this$0.getParentFragment();
            InterfaceC25660jBq interfaceC25660jBq = parentFragment instanceof InterfaceC25660jBq ? (InterfaceC25660jBq) parentFragment : null;
            if (interfaceC25660jBq == null) {
                KeyEventDispatcher.Component activity = this.this$0.getActivity();
                interfaceC25660jBq = activity instanceof InterfaceC25660jBq ? (InterfaceC25660jBq) activity : null;
            }
            InterfaceC25659jBp value = this.this$0.AhwBna().KWHzl().getValue();
            InterfaceC25659jBp.Application application = value instanceof InterfaceC25659jBp.Application ? (InterfaceC25659jBp.Application) value : null;
            if (application != null) {
                C25655jBl c25655jBl = this.this$0;
                if (interfaceC25660jBq != null) {
                    List<CommonGroupUiModel> listEZpvd = c25655jBl.AYXKKw().EZpvd();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listEZpvd) {
                        if (((CommonGroupUiModel) obj2).copydefault()) {
                            arrayList.add(obj2);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        interfaceC25657jBn2 = InterfaceC25657jBn.ActionBar.copydefault;
                    } else {
                        List<CommonGroupUiModel> listOLrzqt = application.OLrzqt();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : listOLrzqt) {
                            if (((CommonGroupUiModel) obj3).copydefault()) {
                                arrayList2.add(obj3);
                            }
                        }
                        interfaceC25657jBn2 = arrayList2.isEmpty() ? InterfaceC25657jBn.StateListAnimator.KWHzl : InterfaceC25657jBn.Application.EZpvd;
                    }
                    interfaceC25660jBq.EZpvd(interfaceC25657jBn2, c25655jBl.AYXKKw(), application.OLrzqt());
                }
                yHO yho = c25655jBl.gEmmrt;
                if (yho != null) {
                    List<CommonGroupUiModel> listEZpvd2 = c25655jBl.AYXKKw().EZpvd();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : listEZpvd2) {
                        if (((CommonGroupUiModel) obj4).copydefault()) {
                            arrayList3.add(obj4);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        interfaceC25657jBn = InterfaceC25657jBn.ActionBar.copydefault;
                    } else {
                        List<CommonGroupUiModel> listOLrzqt2 = application.OLrzqt();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj5 : listOLrzqt2) {
                            if (((CommonGroupUiModel) obj5).copydefault()) {
                                arrayList4.add(obj5);
                            }
                        }
                        interfaceC25657jBn = arrayList4.isEmpty() ? InterfaceC25657jBn.StateListAnimator.KWHzl : InterfaceC25657jBn.Application.EZpvd;
                    }
                    yho.invoke(interfaceC25657jBn, c25655jBl.AYXKKw(), application.OLrzqt());
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
