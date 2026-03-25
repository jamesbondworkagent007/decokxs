package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C37715oz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C37715oz {
    public static final Activity EZpvd = new Activity(null);
    public final java.util.List<C35688oA> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oz$Application) A[MD:(o.oz$Application):void (m)] call: o.oz.<init>(o.oz$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C37715oz(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C35688oA> copydefault() {
        return this.OLrzqt;
    }

    public C37715oz(Application application) {
        java.util.List<C35688oA> listKWHzl = application.KWHzl();
        if (listKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for queries".toString());
        }
        this.OLrzqt = listKWHzl;
    }

    /* JADX INFO: renamed from: o.oz$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oz.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("QueriesConfig(");
        sb.append("queries=" + this.OLrzqt);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C37715oz.class == obj.getClass() && Intrinsics.EZpvd(this.OLrzqt, ((C37715oz) obj).OLrzqt);
    }

    public static /* synthetic */ C37715oz copy$default(C37715oz c37715oz, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.QueriesConfig$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C37715oz.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C37715oz.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c37715oz);
        function1.invoke(application);
        return application.EZpvd();
    }

    /* JADX INFO: renamed from: o.oz$Application */
    public static final class Application {
        public java.util.List<C35688oA> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C35688oA> KWHzl() {
            return this.EZpvd;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C37715oz c37715oz) {
            this();
            Intrinsics.checkNotNullParameter(c37715oz, "");
            this.EZpvd = c37715oz.copydefault();
        }

        public final C37715oz EZpvd() {
            return new C37715oz(this, null);
        }
    }
}
