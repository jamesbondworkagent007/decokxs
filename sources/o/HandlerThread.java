package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.FactoryTest;
import o.HandlerThread;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class HandlerThread {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final java.util.List<HidlSupport> KWHzl;
    public final FactoryTest OLrzqt;
    public final GraphicsEnvironment copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.HandlerThread$Application) A[MD:(o.HandlerThread$Application):void (m)] call: o.HandlerThread.<init>(o.HandlerThread$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ HandlerThread(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<HidlSupport> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GraphicsEnvironment OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FactoryTest copydefault() {
        return this.OLrzqt;
    }

    public HandlerThread(Application application) {
        FactoryTest factoryTestCopydefault = application.copydefault();
        if (factoryTestCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for documentReadAction".toString());
        }
        this.OLrzqt = factoryTestCopydefault;
        this.copydefault = application.OLrzqt();
        this.KWHzl = application.KWHzl();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.HandlerThread.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DocumentReaderConfig(");
        sb.append("documentReadAction=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("documentReadMode=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("featureTypes=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        GraphicsEnvironment graphicsEnvironment = this.copydefault;
        int iHashCode2 = graphicsEnvironment != null ? graphicsEnvironment.hashCode() : 0;
        java.util.List<HidlSupport> list = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HandlerThread.class != obj.getClass()) {
            return false;
        }
        HandlerThread handlerThread = (HandlerThread) obj;
        return Intrinsics.EZpvd(this.OLrzqt, handlerThread.OLrzqt) && Intrinsics.EZpvd(this.copydefault, handlerThread.copydefault) && Intrinsics.EZpvd(this.KWHzl, handlerThread.KWHzl);
    }

    public static /* synthetic */ HandlerThread copy$default(HandlerThread handlerThread, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DocumentReaderConfig$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HandlerThread.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HandlerThread.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(handlerThread);
        function1.invoke(application);
        return application.EZpvd();
    }

    public static final class Application {
        public FactoryTest AEQbTJ;
        public GraphicsEnvironment OLrzqt;
        public java.util.List<? extends HidlSupport> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(GraphicsEnvironment graphicsEnvironment) {
            this.OLrzqt = graphicsEnvironment;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<? extends HidlSupport> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(FactoryTest factoryTest) {
            this.AEQbTJ = factoryTest;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.HidlSupport>, java.util.List<o.HidlSupport> */
        public final java.util.List<HidlSupport> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GraphicsEnvironment OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FactoryTest copydefault() {
            return this.AEQbTJ;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull HandlerThread handlerThread) {
            this();
            Intrinsics.checkNotNullParameter(handlerThread, "");
            this.AEQbTJ = handlerThread.copydefault();
            this.OLrzqt = handlerThread.OLrzqt();
            this.copydefault = handlerThread.AEQbTJ();
        }

        public final HandlerThread EZpvd() {
            return new HandlerThread(this, null);
        }

        public final Application AEQbTJ() {
            if (this.AEQbTJ == null) {
                this.AEQbTJ = new FactoryTest.Activity("no value provided");
            }
            return this;
        }
    }
}
