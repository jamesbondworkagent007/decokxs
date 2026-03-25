package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57554ykc {
    public static final Application Companion = new Application(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final AbstractC57556yke KWHzl(@NotNull java.lang.String str, @NotNull C57567ykp c57567ykp, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, @NotNull Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit> function2) {
        return Companion.AEQbTJ(str, c57567ykp, arrayList, function2);
    }

    private C57554ykc() {
    }

    /* JADX INFO: renamed from: o.ykc$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ykc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ykc$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC57572yku createCommonSimplifiedListener$default(Application application, C57573ykv c57573ykv, Function1 function1, Function2 function2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                function1 = null;
            }
            return application.OLrzqt(c57573ykv, function1, function2);
        }

        /* JADX INFO: renamed from: o.ykc$Application$Activity */
        public static final class Activity extends AbstractC57572yku {
            public final /* synthetic */ Function2<AbstractC33132mqg, OKIncomingData, Unit> AEQbTJ;
            public final /* synthetic */ Function1<OKWsConnectionState, Unit> copydefault;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super o.mqg, ? super com.okinc.core.livelistener.OKIncomingData, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.core.livelistener.OKWsConnectionState, kotlin.Unit> */
            /* JADX WARN: Multi-variable type inference failed */
            public Activity(Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit> function2, Function1<? super OKWsConnectionState, Unit> function1) {
                this.AEQbTJ = function2;
                this.copydefault = function1;
            }

            @Override // o.AbstractC33132mqg
            public void OLrzqt(AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
                Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
                Intrinsics.checkNotNullParameter(oKIncomingData, "");
                this.AEQbTJ.invoke(abstractC33132mqg, oKIncomingData);
            }

            @Override // o.AbstractC33132mqg
            public void AEQbTJ(OKWsConnectionState oKWsConnectionState) {
                Intrinsics.checkNotNullParameter(oKWsConnectionState, "");
                Function1<OKWsConnectionState, Unit> function1 = this.copydefault;
                if (function1 != null) {
                    function1.invoke(oKWsConnectionState);
                }
            }
        }

        public final AbstractC57572yku OLrzqt(@NotNull C57573ykv c57573ykv, Function1<? super OKWsConnectionState, Unit> function1, @NotNull Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit> function2) {
            Intrinsics.checkNotNullParameter(c57573ykv, "");
            Intrinsics.checkNotNullParameter(function2, "");
            Activity activity = new Activity(function2, function1);
            activity.OLrzqt(c57573ykv);
            return activity;
        }

        public final AbstractC57556yke AEQbTJ(@NotNull java.lang.String str, @NotNull C57567ykp c57567ykp, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, @NotNull Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit> function2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c57567ykp, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(function2, "");
            return copydefault(str, c57567ykp, arrayList, null, function2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.ykc$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC57556yke createSimpleListenerWithChannelId$default(Application application, java.lang.String str, C57567ykp c57567ykp, java.util.ArrayList arrayList, Function1 function1, Function2 function2, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                function1 = null;
            }
            return application.copydefault(str, c57567ykp, arrayList, function1, function2);
        }

        public final AbstractC57556yke copydefault(@NotNull java.lang.String str, @NotNull C57567ykp c57567ykp, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, Function1<? super OKWsConnectionState, Unit> function1, @NotNull Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit> function2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c57567ykp, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(function2, "");
            return EZpvd(str, c57567ykp, arrayList, copydefault(arrayList), function1, function2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ykc$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC57556yke createSimpleListenerWithChannelId$default(Application application, java.lang.String str, C57567ykp c57567ykp, java.util.ArrayList arrayList, C57574ykw c57574ykw, Function1 function1, Function2 function2, int i, java.lang.Object obj) {
            if ((i & 16) != 0) {
                function1 = null;
            }
            return application.EZpvd(str, c57567ykp, arrayList, c57574ykw, function1, function2);
        }

        /* JADX INFO: renamed from: o.ykc$Application$StateListAnimator */
        public static final class StateListAnimator extends AbstractC57556yke {
            public final /* synthetic */ Function1<OKWsConnectionState, Unit> AYXKKw;
            public final /* synthetic */ Function2<AbstractC33132mqg, OKIncomingData, Unit> djBIcL;

            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super o.mqg, ? super com.okinc.core.livelistener.OKIncomingData, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.core.livelistener.OKWsConnectionState, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public StateListAnimator(java.lang.String str, java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit> function2, Function1<? super OKWsConnectionState, Unit> function1) {
                super(str, arrayList);
                this.djBIcL = function2;
                this.AYXKKw = function1;
            }

            @Override // o.AbstractC33132mqg
            public void OLrzqt(AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
                Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
                Intrinsics.checkNotNullParameter(oKIncomingData, "");
                this.djBIcL.invoke(abstractC33132mqg, oKIncomingData);
            }

            @Override // o.AbstractC33132mqg
            public void AEQbTJ(OKWsConnectionState oKWsConnectionState) {
                Intrinsics.checkNotNullParameter(oKWsConnectionState, "");
                Function1<OKWsConnectionState, Unit> function1 = this.AYXKKw;
                if (function1 != null) {
                    function1.invoke(oKWsConnectionState);
                }
            }
        }

        public final AbstractC57556yke EZpvd(@NotNull java.lang.String str, @NotNull C57567ykp c57567ykp, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, @NotNull C57574ykw c57574ykw, Function1<? super OKWsConnectionState, Unit> function1, @NotNull Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit> function2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c57567ykp, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(c57574ykw, "");
            Intrinsics.checkNotNullParameter(function2, "");
            StateListAnimator stateListAnimator = new StateListAnimator(str, arrayList, function2, function1);
            InterfaceC57564ykm interfaceC57564ykmOLrzqt = c57567ykp.OLrzqt();
            Intrinsics.copydefault(interfaceC57564ykmOLrzqt, "");
            ((C57527ykB) interfaceC57564ykmOLrzqt).copydefault(str, c57574ykw);
            stateListAnimator.KWHzl(c57567ykp);
            return stateListAnimator;
        }

        public final AbstractC57556yke OLrzqt(@NotNull java.lang.String str, @NotNull C57567ykp c57567ykp, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, @NotNull Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit> function2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c57567ykp, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(function2, "");
            return EZpvd(str, c57567ykp, arrayList, null, function2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.ykc$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC57556yke createDepthListenerWithChannelId$default(Application application, java.lang.String str, C57567ykp c57567ykp, java.util.ArrayList arrayList, Function1 function1, Function2 function2, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                function1 = null;
            }
            return application.EZpvd(str, c57567ykp, arrayList, function1, function2);
        }

        public final AbstractC57556yke EZpvd(@NotNull java.lang.String str, @NotNull C57567ykp c57567ykp, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, Function1<? super OKWsConnectionState, Unit> function1, @NotNull Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit> function2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c57567ykp, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(function2, "");
            InterfaceC57564ykm interfaceC57564ykmOLrzqt = c57567ykp.OLrzqt();
            Intrinsics.copydefault(interfaceC57564ykmOLrzqt, "");
            C57527ykB c57527ykB = (C57527ykB) interfaceC57564ykmOLrzqt;
            if (((C57533ykH) c57527ykB.EZpvd(str)) == null) {
                c57527ykB.copydefault(str, new C57533ykH());
            }
            TaskDescription taskDescription = new TaskDescription(str, arrayList, function2, function1);
            taskDescription.KWHzl(c57567ykp);
            return taskDescription;
        }

        /* JADX INFO: renamed from: o.ykc$Application$TaskDescription */
        public static final class TaskDescription extends AbstractC57556yke {
            public final /* synthetic */ Function1<OKWsConnectionState, Unit> AYXKKw;
            public final /* synthetic */ Function2<AbstractC33132mqg, OKIncomingData, Unit> djBIcL;

            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super o.mqg, ? super com.okinc.core.livelistener.OKIncomingData, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.core.livelistener.OKWsConnectionState, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public TaskDescription(java.lang.String str, java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit> function2, Function1<? super OKWsConnectionState, Unit> function1) {
                super(str, arrayList);
                this.djBIcL = function2;
                this.AYXKKw = function1;
            }

            @Override // o.AbstractC33132mqg
            public void OLrzqt(AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
                Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
                Intrinsics.checkNotNullParameter(oKIncomingData, "");
                this.djBIcL.invoke(abstractC33132mqg, oKIncomingData);
            }

            @Override // o.AbstractC33132mqg
            public void AEQbTJ(OKWsConnectionState oKWsConnectionState) {
                Intrinsics.checkNotNullParameter(oKWsConnectionState, "");
                Function1<OKWsConnectionState, Unit> function1 = this.AYXKKw;
                if (function1 != null) {
                    function1.invoke(oKWsConnectionState);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ykc$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C57528ykC createDictListenerWithChannelId$default(Application application, java.lang.String str, C57567ykp c57567ykp, java.lang.String str2, java.util.ArrayList arrayList, Function1 function1, Function2 function2, int i, java.lang.Object obj) {
            if ((i & 16) != 0) {
                function1 = null;
            }
            return application.AEQbTJ(str, c57567ykp, str2, (java.util.ArrayList<? extends InterfaceC57559ykh>) arrayList, (Function1<? super OKWsConnectionState, Unit>) function1, (Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit>) function2);
        }

        public final C57528ykC AEQbTJ(@NotNull java.lang.String str, @NotNull C57567ykp c57567ykp, @NotNull java.lang.String str2, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, Function1<? super OKWsConnectionState, Unit> function1, Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit> function2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c57567ykp, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            return EZpvd(str, c57567ykp, str2, -1, arrayList, function1, function2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ykc$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C57528ykC createDictListenerWithChannelId$default(Application application, java.lang.String str, C57567ykp c57567ykp, int i, java.util.ArrayList arrayList, Function1 function1, Function2 function2, int i2, java.lang.Object obj) {
            if ((i2 & 16) != 0) {
                function1 = null;
            }
            return application.AEQbTJ(str, c57567ykp, i, (java.util.ArrayList<? extends InterfaceC57559ykh>) arrayList, (Function1<? super OKWsConnectionState, Unit>) function1, (Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit>) function2);
        }

        public final C57528ykC AEQbTJ(@NotNull java.lang.String str, @NotNull C57567ykp c57567ykp, int i, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, Function1<? super OKWsConnectionState, Unit> function1, Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit> function2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c57567ykp, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            return EZpvd(str, c57567ykp, null, i, arrayList, function1, function2);
        }

        public final C57528ykC EZpvd(java.lang.String str, C57567ykp c57567ykp, java.lang.String str2, int i, java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, Function1<? super OKWsConnectionState, Unit> function1, Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit> function2) {
            InterfaceC57564ykm interfaceC57564ykmOLrzqt = c57567ykp.OLrzqt();
            Intrinsics.copydefault(interfaceC57564ykmOLrzqt, "");
            C57527ykB c57527ykB = (C57527ykB) interfaceC57564ykmOLrzqt;
            if (((C57530ykE) c57527ykB.EZpvd(str)) == null) {
                C57530ykE c57530ykE = new C57530ykE();
                c57530ykE.AEQbTJ(str2);
                c57530ykE.AEQbTJ(i);
                c57527ykB.copydefault(str, c57530ykE);
            }
            C57528ykC c57528ykC = new C57528ykC(str, arrayList, function1, function2);
            c57528ykC.KWHzl(c57567ykp);
            return c57528ykC;
        }

        public final C57574ykw copydefault(java.util.ArrayList<? extends InterfaceC57559ykh> arrayList) {
            if (arrayList.isEmpty()) {
                return new C57574ykw();
            }
            InterfaceC57559ykh interfaceC57559ykh = arrayList.get(0);
            Intrinsics.checkNotNullExpressionValue(interfaceC57559ykh, "");
            java.lang.String simpleName = interfaceC57559ykh.getClass().getSimpleName();
            java.util.Iterator<? extends InterfaceC57559ykh> it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                if (!Intrinsics.EZpvd((java.lang.Object) simpleName, (java.lang.Object) it.next().getClass().getSimpleName())) {
                    pUU.copydefault("OKWSListenerFactory", "error in createSimpleListenerWithChannelId, args not allow mixed!!!");
                }
            }
            if (Intrinsics.EZpvd((java.lang.Object) simpleName, (java.lang.Object) WsArgV5.class.getSimpleName())) {
                return new C57574ykw();
            }
            return new C57536ykK();
        }
    }
}
