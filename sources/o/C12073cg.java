package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C12073cg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C12073cg {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final java.util.List<AbstractC6211aL> AEQbTJ;
    public final SmartSelectSprite OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.cg$Application) A[MD:(o.cg$Application):void (m)] call: o.cg.<init>(o.cg$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C12073cg(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartSelectSprite OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC6211aL> copydefault() {
        return this.AEQbTJ;
    }

    public C12073cg(Application application) {
        this.OLrzqt = application.copydefault();
        this.AEQbTJ = application.KWHzl();
    }

    /* JADX INFO: renamed from: o.cg$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cg.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UnindexedFace(");
        sb.append("faceDetail=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("reasons=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        SmartSelectSprite smartSelectSprite = this.OLrzqt;
        int iHashCode = smartSelectSprite != null ? smartSelectSprite.hashCode() : 0;
        java.util.List<AbstractC6211aL> list = this.AEQbTJ;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12073cg.class != obj.getClass()) {
            return false;
        }
        C12073cg c12073cg = (C12073cg) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c12073cg.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c12073cg.AEQbTJ);
    }

    public static /* synthetic */ C12073cg copy$default(C12073cg c12073cg, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.UnindexedFace$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C12073cg.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C12073cg.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c12073cg);
        function1.invoke(application);
        return application.OLrzqt();
    }

    /* JADX INFO: renamed from: o.cg$Application */
    public static final class Application {
        public java.util.List<? extends AbstractC6211aL> AEQbTJ;
        public SmartSelectSprite OLrzqt;

        public final Application AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<? extends AbstractC6211aL> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.aL>, java.util.List<o.aL> */
        public final java.util.List<AbstractC6211aL> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(SmartSelectSprite smartSelectSprite) {
            this.OLrzqt = smartSelectSprite;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SmartSelectSprite copydefault() {
            return this.OLrzqt;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C12073cg c12073cg) {
            this();
            Intrinsics.checkNotNullParameter(c12073cg, "");
            this.OLrzqt = c12073cg.OLrzqt();
            this.AEQbTJ = c12073cg.copydefault();
        }

        public final C12073cg OLrzqt() {
            return new C12073cg(this, null);
        }
    }
}
