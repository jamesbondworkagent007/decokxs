package com.okinc.im.imui.broadcastmessages.pluginpanel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.im.config.serviceprovider.GeneralAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC35291nsZ;
import o.C35287nsV;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC35289nsX;
import o.yHT;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastMessagePluginPanelFragmentViewModel$pluginList$1 extends SuspendLambda implements yHT<C35287nsV, Integer, Integer, Continuation<? super List<? extends AbstractC35291nsZ>>, Object> {
    /* synthetic */ int I$0;
    /* synthetic */ int I$1;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BroadcastMessagePluginPanelFragmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessagePluginPanelFragmentViewModel$pluginList$1(BroadcastMessagePluginPanelFragmentViewModel broadcastMessagePluginPanelFragmentViewModel, Continuation<? super BroadcastMessagePluginPanelFragmentViewModel$pluginList$1> continuation) {
        super(4, continuation);
        this.this$0 = broadcastMessagePluginPanelFragmentViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* synthetic */ Object invoke(C35287nsV c35287nsV, Integer num, Integer num2, Continuation<? super List<? extends AbstractC35291nsZ>> continuation) {
        return invoke(c35287nsV, num.intValue(), num2.intValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(C35287nsV c35287nsV, int i, int i2, Continuation<? super List<? extends AbstractC35291nsZ>> continuation) {
        BroadcastMessagePluginPanelFragmentViewModel$pluginList$1 broadcastMessagePluginPanelFragmentViewModel$pluginList$1 = new BroadcastMessagePluginPanelFragmentViewModel$pluginList$1(this.this$0, continuation);
        broadcastMessagePluginPanelFragmentViewModel$pluginList$1.L$0 = c35287nsV;
        broadcastMessagePluginPanelFragmentViewModel$pluginList$1.I$0 = i;
        broadcastMessagePluginPanelFragmentViewModel$pluginList$1.I$1 = i2;
        return broadcastMessagePluginPanelFragmentViewModel$pluginList$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C35287nsV c35287nsV = (C35287nsV) this.L$0;
            List<AbstractC35291nsZ> listOLrzqt = this.this$0.EZpvd.OLrzqt(this.I$0, this.I$1);
            BroadcastMessagePluginPanelFragmentViewModel broadcastMessagePluginPanelFragmentViewModel = this.this$0;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            for (AbstractC35291nsZ abstractC35291nsZ : listOLrzqt) {
                abstractC35291nsZ.KWHzl(c35287nsV, new Application(broadcastMessagePluginPanelFragmentViewModel));
                arrayList.add(abstractC35291nsZ);
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static final class Application implements InterfaceC35289nsX {
        public final /* synthetic */ BroadcastMessagePluginPanelFragmentViewModel copydefault;

        public Application(BroadcastMessagePluginPanelFragmentViewModel broadcastMessagePluginPanelFragmentViewModel) {
            this.copydefault = broadcastMessagePluginPanelFragmentViewModel;
        }

        @Override // o.InterfaceC35289nsX
        public void KWHzl(GeneralAction generalAction) {
            InterfaceC35289nsX.ActionBar.OLrzqt(this, generalAction);
        }

        @Override // o.InterfaceC35289nsX
        public void AEQbTJ(List<? extends GeneralAction> list) {
            Intrinsics.checkNotNullParameter(list, "");
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this.copydefault), null, null, new BroadcastMessagePluginPanelFragmentViewModel$pluginList$1$1$1$1$execute$1(this.copydefault, list, null), 3, null);
        }
    }
}
