package com.okinc.core.ok_app.modeswitch.view;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33244msm;
import o.C33301mtq;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.InterfaceC33210msE;

/* JADX INFO: loaded from: classes8.dex */
public final class ModeSegmentView$createView$2 extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {
    final /* synthetic */ C33301mtq $binding;
    final /* synthetic */ Context $context;
    final /* synthetic */ Pair<AbstractC33244msm, AbstractC33244msm> $modes;
    /* synthetic */ int I$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.Pair<? extends o.msm, ? extends o.msm> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModeSegmentView$createView$2(C33301mtq c33301mtq, Pair<? extends AbstractC33244msm, ? extends AbstractC33244msm> pair, Context context, Continuation<? super ModeSegmentView$createView$2> continuation) {
        super(2, continuation);
        this.$binding = c33301mtq;
        this.$modes = pair;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ModeSegmentView$createView$2 modeSegmentView$createView$2 = new ModeSegmentView$createView$2(this.$binding, this.$modes, this.$context, continuation);
        modeSegmentView$createView$2.I$0 = ((Number) obj).intValue();
        return modeSegmentView$createView$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(int i, Continuation<? super Boolean> continuation) {
        return ((ModeSegmentView$createView$2) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Integer num, Continuation<? super Boolean> continuation) {
        return invoke(num.intValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean zBooleanValue = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            int i2 = this.I$0;
            this.$binding.copydefault.getTabAt(i2);
            AbstractC33244msm first = i2 == 0 ? this.$modes.getFirst() : this.$modes.getSecond();
            List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33210msE.class));
            if (listKWHzl != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listKWHzl) {
                    if (Intrinsics.EZpvd(((InterfaceC33210msE) obj2).AEQbTJ(), first)) {
                        arrayList.add(obj2);
                    }
                }
                InterfaceC33210msE interfaceC33210msE = (InterfaceC33210msE) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
                if (interfaceC33210msE != null) {
                    Context context = this.$context;
                    this.label = 1;
                    obj = interfaceC33210msE.EZpvd(context, "mode_switch", this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                }
            }
            return C56443yFo.KWHzl(zBooleanValue);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        zBooleanValue = ((Boolean) obj).booleanValue();
        return C56443yFo.KWHzl(zBooleanValue);
    }
}
