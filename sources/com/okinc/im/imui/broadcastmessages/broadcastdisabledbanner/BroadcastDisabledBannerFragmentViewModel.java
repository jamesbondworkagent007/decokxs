package com.okinc.im.imui.broadcastmessages.broadcastdisabledbanner;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C35386nuP;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastDisabledBannerFragmentViewModel extends ViewModel {
    public final C35386nuP KWHzl;
    public final Flow<Boolean> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<Boolean> EZpvd() {
        return this.copydefault;
    }

    @yCM
    public BroadcastDisabledBannerFragmentViewModel(@NotNull C35386nuP c35386nuP) {
        Intrinsics.checkNotNullParameter(c35386nuP, "");
        this.KWHzl = c35386nuP;
        this.copydefault = new Activity(c35386nuP.OLrzqt());
    }

    public final void EZpvd(@NotNull List<OKMessage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BroadcastDisabledBannerFragmentViewModel$onMessageEvent$1(this, list, null), 3, null);
    }

    public static final class Activity implements Flow<Boolean> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.im.imui.broadcastmessages.broadcastdisabledbanner.BroadcastDisabledBannerFragmentViewModel$Activity$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                BroadcastDisabledBannerFragmentViewModel$special$$inlined$map$1$2$1 broadcastDisabledBannerFragmentViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof BroadcastDisabledBannerFragmentViewModel$special$$inlined$map$1$2$1) {
                    broadcastDisabledBannerFragmentViewModel$special$$inlined$map$1$2$1 = (BroadcastDisabledBannerFragmentViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = broadcastDisabledBannerFragmentViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        broadcastDisabledBannerFragmentViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        broadcastDisabledBannerFragmentViewModel$special$$inlined$map$1$2$1 = new BroadcastDisabledBannerFragmentViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = broadcastDisabledBannerFragmentViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = broadcastDisabledBannerFragmentViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    Boolean boolKWHzl = C56443yFo.KWHzl(((Number) obj).intValue() >= 20);
                    broadcastDisabledBannerFragmentViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, broadcastDisabledBannerFragmentViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
