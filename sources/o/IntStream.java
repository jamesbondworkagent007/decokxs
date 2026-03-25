package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.IntStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class IntStream {
    public static final Application EZpvd = new Application(null);
    public final BaseStream AEQbTJ;
    public final BaseStream OLrzqt;
    public final BaseStream copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.IntStream$Activity) A[MD:(o.IntStream$Activity):void (m)] call: o.IntStream.<init>(o.IntStream$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ IntStream(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseStream AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseStream EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseStream OLrzqt() {
        return this.AEQbTJ;
    }

    public IntStream(Activity activity) {
        this.AEQbTJ = activity.EZpvd();
        this.copydefault = activity.OLrzqt();
        this.OLrzqt = activity.AEQbTJ();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IntStream.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AccountTakeoverActionsType(");
        sb.append("highAction=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("lowAction=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("mediumAction=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        BaseStream baseStream = this.AEQbTJ;
        int iHashCode = baseStream != null ? baseStream.hashCode() : 0;
        BaseStream baseStream2 = this.copydefault;
        int iHashCode2 = baseStream2 != null ? baseStream2.hashCode() : 0;
        BaseStream baseStream3 = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (baseStream3 != null ? baseStream3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IntStream.class != obj.getClass()) {
            return false;
        }
        IntStream intStream = (IntStream) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, intStream.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, intStream.copydefault) && Intrinsics.EZpvd(this.OLrzqt, intStream.OLrzqt);
    }

    public static /* synthetic */ IntStream copy$default(IntStream intStream, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AccountTakeoverActionsType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IntStream.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IntStream.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(intStream);
        function1.invoke(activity);
        return activity.copydefault();
    }

    public static final class Activity {
        public BaseStream EZpvd;
        public BaseStream KWHzl;
        public BaseStream OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BaseStream AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(BaseStream baseStream) {
            this.KWHzl = baseStream;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BaseStream EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(BaseStream baseStream) {
            this.OLrzqt = baseStream;
        }

        public final Activity KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BaseStream OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(BaseStream baseStream) {
            this.EZpvd = baseStream;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull IntStream intStream) {
            this();
            Intrinsics.checkNotNullParameter(intStream, "");
            this.OLrzqt = intStream.OLrzqt();
            this.KWHzl = intStream.AEQbTJ();
            this.EZpvd = intStream.EZpvd();
        }

        public final IntStream copydefault() {
            return new IntStream(this, null);
        }
    }
}
