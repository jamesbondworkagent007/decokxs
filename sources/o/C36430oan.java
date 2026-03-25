package o;

import com.okinc.im.imui.impl.OKIMMessageCenterServiceImpl$observeEntryIconRes$$inlined$map$1$2$1;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.MessageCenterNavigation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C52761wXj;

/* JADX INFO: renamed from: o.oan, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36430oan extends AbstractC43215rlA implements InterfaceC35175nqP {

    /* JADX INFO: renamed from: o.oan$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MessageCenterNavigation.values().length];
            try {
                iArr[MessageCenterNavigation.IM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MessageCenterNavigation.Notification.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageCenterNavigation.Invalid.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX INFO: renamed from: o.oan$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar implements Flow<java.lang.Integer> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C36430oan KWHzl;

        /* JADX INFO: renamed from: o.oan$ActionBar$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ C36430oan EZpvd;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C36430oan c36430oan) {
                this.OLrzqt = flowCollector;
                this.EZpvd = c36430oan;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                OKIMMessageCenterServiceImpl$observeEntryIconRes$$inlined$map$1$2$1 oKIMMessageCenterServiceImpl$observeEntryIconRes$$inlined$map$1$2$1;
                if (continuation instanceof OKIMMessageCenterServiceImpl$observeEntryIconRes$$inlined$map$1$2$1) {
                    oKIMMessageCenterServiceImpl$observeEntryIconRes$$inlined$map$1$2$1 = (OKIMMessageCenterServiceImpl$observeEntryIconRes$$inlined$map$1$2$1) continuation;
                    int i = oKIMMessageCenterServiceImpl$observeEntryIconRes$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        oKIMMessageCenterServiceImpl$observeEntryIconRes$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        oKIMMessageCenterServiceImpl$observeEntryIconRes$$inlined$map$1$2$1 = new OKIMMessageCenterServiceImpl$observeEntryIconRes$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = oKIMMessageCenterServiceImpl$observeEntryIconRes$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = oKIMMessageCenterServiceImpl$observeEntryIconRes$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.lang.Integer numEZpvd = this.EZpvd.EZpvd((MessageCenterNavigation) obj);
                    oKIMMessageCenterServiceImpl$observeEntryIconRes$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(numEZpvd, oKIMMessageCenterServiceImpl$observeEntryIconRes$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Integer> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final java.lang.Integer EZpvd(MessageCenterNavigation messageCenterNavigation) {
        int i = Application.KWHzl[messageCenterNavigation.ordinal()];
        if (i == 1) {
            return java.lang.Integer.valueOf(C52761wXj.TaskDescription.Qsauvs);
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return java.lang.Integer.valueOf(C52761wXj.TaskDescription.UeEOUB);
        }
        if (oGU.isInPlanetMode$default(oGU.KWHzl, null, 1, null)) {
            return null;
        }
        return java.lang.Integer.valueOf(C52761wXj.TaskDescription.UeEOUB);
    }
}
