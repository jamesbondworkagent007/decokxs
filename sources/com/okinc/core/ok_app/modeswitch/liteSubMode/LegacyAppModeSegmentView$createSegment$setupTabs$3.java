package com.okinc.core.ok_app.modeswitch.liteSubMode;

import android.content.Context;
import com.google.android.material.tabs.TabLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33234msc;
import o.C33301mtq;
import o.C33377mvM;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.InterfaceC33210msE;

/* JADX INFO: loaded from: classes8.dex */
public final class LegacyAppModeSegmentView$createSegment$setupTabs$3 extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {
    final /* synthetic */ C33301mtq $binding;
    final /* synthetic */ Context $context;
    /* synthetic */ int I$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyAppModeSegmentView$createSegment$setupTabs$3(C33301mtq c33301mtq, Context context, Continuation<? super LegacyAppModeSegmentView$createSegment$setupTabs$3> continuation) {
        super(2, continuation);
        this.$binding = c33301mtq;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LegacyAppModeSegmentView$createSegment$setupTabs$3 legacyAppModeSegmentView$createSegment$setupTabs$3 = new LegacyAppModeSegmentView$createSegment$setupTabs$3(this.$binding, this.$context, continuation);
        legacyAppModeSegmentView$createSegment$setupTabs$3.I$0 = ((Number) obj).intValue();
        return legacyAppModeSegmentView$createSegment$setupTabs$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(int i, Continuation<? super Boolean> continuation) {
        return ((LegacyAppModeSegmentView$createSegment$setupTabs$3) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
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
            TabLayout.Tab tabAt = this.$binding.copydefault.getTabAt(this.I$0);
            Object obj2 = null;
            Integer numAEQbTJ = tabAt != null ? C56443yFo.AEQbTJ(C33377mvM.copydefault.copydefault(tabAt)) : null;
            List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33210msE.class));
            if (listKWHzl != null) {
                Iterator it = listKWHzl.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    int iEZpvd = C33234msc.EZpvd(((InterfaceC33210msE) next).AEQbTJ());
                    if (numAEQbTJ != null && iEZpvd == numAEQbTJ.intValue()) {
                        obj2 = next;
                        break;
                    }
                }
                InterfaceC33210msE interfaceC33210msE = (InterfaceC33210msE) obj2;
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
