package o;

import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.unreadcount.UnReadCountManagerImpl$addUserLoginStatusListener$1;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.unreadcount.UnReadCountManagerImpl$observeIMUnreadMessageCountChanges$1;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.unreadcount.UnReadCountManagerImpl$observeNotificationUnreadCountChanges$1;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.unreadcount.UnReadCountManagerImpl$observeUnreadCount$$inlined$map$1$2$1;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.unreadcount.UnReadCountManagerImpl$refreshUnreadCount$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.saY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44629saY implements InterfaceC44628saX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final MutableStateFlow<C44627saW> AEQbTJ;
    public final rXO AYXKKw;
    public final StateFlow<java.lang.Integer> AhwBna;
    public final InterfaceC47278tmy DbNXlk;
    public final MutableStateFlow<java.lang.Integer> EZpvd;
    public final Activity OLrzqt;
    public final CoroutineScope copydefault;
    public final CoroutineDispatcher djBIcL;
    public final rYZ gEmmrt;
    public final StateFlow<C44627saW> isConnected;
    public final C42608rZd valueOf;

    /* JADX INFO: renamed from: o.saY$Application */
    public static final class Application implements Flow<rXZ> {
        public final /* synthetic */ C44629saY AEQbTJ;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.saY$Application$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ C44629saY AEQbTJ;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, C44629saY c44629saY) {
                this.copydefault = flowCollector;
                this.AEQbTJ = c44629saY;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                UnReadCountManagerImpl$observeUnreadCount$$inlined$map$1$2$1 unReadCountManagerImpl$observeUnreadCount$$inlined$map$1$2$1;
                int iOLrzqt;
                if (continuation instanceof UnReadCountManagerImpl$observeUnreadCount$$inlined$map$1$2$1) {
                    unReadCountManagerImpl$observeUnreadCount$$inlined$map$1$2$1 = (UnReadCountManagerImpl$observeUnreadCount$$inlined$map$1$2$1) continuation;
                    int i = unReadCountManagerImpl$observeUnreadCount$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        unReadCountManagerImpl$observeUnreadCount$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        unReadCountManagerImpl$observeUnreadCount$$inlined$map$1$2$1 = new UnReadCountManagerImpl$observeUnreadCount$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = unReadCountManagerImpl$observeUnreadCount$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = unReadCountManagerImpl$observeUnreadCount$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    C44627saW c44627saW = (C44627saW) obj;
                    rXO rxo = this.AEQbTJ.AYXKKw;
                    boolean zAEQbTJ = rxo != null ? rxo.AEQbTJ() : false;
                    rXO rxo2 = this.AEQbTJ.AYXKKw;
                    boolean zOLrzqt = rxo2 != null ? rxo2.OLrzqt() : false;
                    if (zAEQbTJ || zOLrzqt) {
                        iOLrzqt = c44627saW.OLrzqt() + c44627saW.EZpvd();
                    } else {
                        iOLrzqt = c44627saW.OLrzqt();
                    }
                    xVV.djBIcL(C32979mnm.EZpvd.OLrzqt(), iOLrzqt);
                    rXZ rxz = new rXZ(iOLrzqt, 0, 2, null);
                    unReadCountManagerImpl$observeUnreadCount$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(rxz, unReadCountManagerImpl$observeUnreadCount$$inlined$map$1$2$1) == objCopydefault) {
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

        public Application(Flow flow, C44629saY c44629saY) {
            this.copydefault = flow;
            this.AEQbTJ = c44629saY;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super rXZ> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public C44629saY(@NotNull rYZ ryz, @NotNull C42608rZd c42608rZd, @NotNull InterfaceC47278tmy interfaceC47278tmy, rXO rxo, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ryz, "");
        Intrinsics.checkNotNullParameter(c42608rZd, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.gEmmrt = ryz;
        this.valueOf = c42608rZd;
        this.DbNXlk = interfaceC47278tmy;
        this.AYXKKw = rxo;
        this.djBIcL = coroutineDispatcher;
        MutableStateFlow<C44627saW> MutableStateFlow = StateFlowKt.MutableStateFlow(new C44627saW(0, 0, 3, null));
        this.AEQbTJ = MutableStateFlow;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<java.lang.Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.EZpvd = MutableStateFlow2;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow2);
        this.OLrzqt = new Activity();
        this.copydefault = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        valueOf();
        EZpvd();
        AYXKKw();
        gEmmrt();
        OLrzqt();
    }

    /* JADX INFO: renamed from: o.saY$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.saY.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.saY$Activity */
    public static final class Activity implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
        }

        public Activity() {
        }

        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            C44629saY.this.KWHzl();
        }
    }

    /* JADX INFO: renamed from: o.saY$StateListAnimator */
    public static final class StateListAnimator implements rXM {
        public StateListAnimator() {
        }
    }

    public final void gEmmrt() {
        this.gEmmrt.AEQbTJ(new StateListAnimator());
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(this.copydefault, null, null, new UnReadCountManagerImpl$observeIMUnreadMessageCountChanges$1(this, null), 3, null);
    }

    public final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(this.copydefault, null, null, new UnReadCountManagerImpl$observeNotificationUnreadCountChanges$1(this, null), 3, null);
    }

    @Override // o.InterfaceC44628saX
    public Flow<rXZ> copydefault() {
        EZpvd();
        AYXKKw();
        return new Application(this.isConnected, this);
    }

    @Override // o.InterfaceC44628saX
    public Flow<java.lang.Integer> AEQbTJ() {
        AYXKKw();
        return this.AhwBna;
    }

    @Override // o.InterfaceC44628saX
    public void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(this.copydefault, null, null, new UnReadCountManagerImpl$refreshUnreadCount$1(this, null), 3, null);
    }

    public void OLrzqt(int i) {
        MutableStateFlow<C44627saW> mutableStateFlow = this.AEQbTJ;
        mutableStateFlow.setValue(C44627saW.copy$default(mutableStateFlow.getValue(), 0, i, 1, null));
        this.EZpvd.setValue(java.lang.Integer.valueOf(i));
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(this.copydefault, null, null, new UnReadCountManagerImpl$addUserLoginStatusListener$1(this, null), 3, null);
    }

    public final void valueOf() {
        C54819xWm.KWHzl().AEQbTJ(this.OLrzqt);
    }
}
