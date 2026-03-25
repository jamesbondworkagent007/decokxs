package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AS;
import o.C4131Az;
import o.C56395yDu;
import o.InterfaceC4078Ay;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AS extends C4131Az {
    public static final Application fetchVPNInfo = new Application(null);
    public static final AS values = new AS(new StateListAnimator());
    public final int DbNXlk;

    public static final class StateListAnimator extends C4131Az.ActionBar {
        public FZ AkhnZx = FU.OLrzqt(FZ.AYXKKw);
        public C56395yDu fetchVPNInfo;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C4131Az.ActionBar, o.InterfaceC4078Ay.ActionBar
        public FZ AYXKKw() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C4131Az.ActionBar, o.InterfaceC4078Ay.ActionBar
        public void EZpvd(@NotNull FZ fz) {
            Intrinsics.checkNotNullParameter(fz, "");
            this.AkhnZx = fz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C56395yDu c56395yDu) {
            this.fetchVPNInfo = c56395yDu;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C56395yDu isConnected() {
            return this.fetchVPNInfo;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AS$StateListAnimator) A[MD:(o.AS$StateListAnimator):void (m)] call: o.AS.<init>(o.AS$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AS(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return this.DbNXlk;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AS.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final AS OLrzqt(@NotNull Function1<? super StateListAnimator, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            StateListAnimator stateListAnimator = new StateListAnimator();
            function1.invoke(stateListAnimator);
            return new AS(stateListAnimator, null);
        }

        public final AS KWHzl() {
            return AS.values;
        }
    }

    public AS(StateListAnimator stateListAnimator) {
        super(stateListAnimator);
        C56395yDu c56395yDuIsConnected = stateListAnimator.isConnected();
        this.DbNXlk = c56395yDuIsConnected != null ? c56395yDuIsConnected.copydefault() : stateListAnimator.EZpvd();
    }

    @Override // o.C4131Az, o.InterfaceC4078Ay
    public Function1<InterfaceC4078Ay.ActionBar, Unit> OLrzqt() {
        return new Function1<InterfaceC4078Ay.ActionBar, Unit>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.OkHttpEngineConfig$toBuilderApplicator$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC4078Ay.ActionBar actionBar) {
                invoke2(actionBar);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC4078Ay.ActionBar actionBar) {
                Intrinsics.checkNotNullParameter(actionBar, "");
                super/*o.Az*/.OLrzqt().invoke(actionBar);
                if (actionBar instanceof AS.StateListAnimator) {
                    ((AS.StateListAnimator) actionBar).copydefault(C56395yDu.AEQbTJ(this.this$0.isConnected()));
                }
            }
        };
    }
}
