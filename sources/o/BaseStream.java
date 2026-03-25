package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.BaseStream;
import o.UnaryOperator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class BaseStream {
    public static final Activity copydefault = new Activity(null);
    public final boolean AEQbTJ;
    public final UnaryOperator KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.BaseStream$Application) A[MD:(o.BaseStream$Application):void (m)] call: o.BaseStream.<init>(o.BaseStream$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BaseStream(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnaryOperator AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    public BaseStream(Application application) {
        UnaryOperator unaryOperatorCopydefault = application.copydefault();
        if (unaryOperatorCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for eventAction".toString());
        }
        this.KWHzl = unaryOperatorCopydefault;
        this.AEQbTJ = application.KWHzl();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BaseStream.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AccountTakeoverActionType(");
        sb.append("eventAction=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("notify=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BaseStream.class != obj.getClass()) {
            return false;
        }
        BaseStream baseStream = (BaseStream) obj;
        return Intrinsics.EZpvd(this.KWHzl, baseStream.KWHzl) && this.AEQbTJ == baseStream.AEQbTJ;
    }

    public static /* synthetic */ BaseStream copy$default(BaseStream baseStream, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AccountTakeoverActionType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BaseStream.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BaseStream.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(baseStream);
        function1.invoke(application);
        return application.EZpvd();
    }

    public static final class Application {
        public boolean EZpvd;
        public UnaryOperator KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(UnaryOperator unaryOperator) {
            this.KWHzl = unaryOperator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(boolean z) {
            this.EZpvd = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UnaryOperator copydefault() {
            return this.KWHzl;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull BaseStream baseStream) {
            this();
            Intrinsics.checkNotNullParameter(baseStream, "");
            this.KWHzl = baseStream.AEQbTJ();
            this.EZpvd = baseStream.KWHzl();
        }

        public final BaseStream EZpvd() {
            return new BaseStream(this, null);
        }

        public final Application AEQbTJ() {
            if (this.KWHzl == null) {
                this.KWHzl = new UnaryOperator.Fragment("no value provided");
            }
            return this;
        }
    }
}
