package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7079ad;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C7079ad {
    public static final Activity OLrzqt = new Activity(null);
    public final C6582aS KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ad$Application) A[MD:(o.ad$Application):void (m)] call: o.ad.<init>(o.ad$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C7079ad(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6582aS EZpvd() {
        return this.KWHzl;
    }

    public C7079ad(Application application) {
        this.KWHzl = application.OLrzqt();
    }

    /* JADX INFO: renamed from: o.ad$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ad.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MediaAnalysisManifestSummary(");
        sb.append("s3Object=" + this.KWHzl);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C6582aS c6582aS = this.KWHzl;
        if (c6582aS != null) {
            return c6582aS.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C7079ad.class == obj.getClass() && Intrinsics.EZpvd(this.KWHzl, ((C7079ad) obj).KWHzl);
    }

    public static /* synthetic */ C7079ad copy$default(C7079ad c7079ad, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.MediaAnalysisManifestSummary$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C7079ad.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C7079ad.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c7079ad);
        function1.invoke(application);
        return application.copydefault();
    }

    /* JADX INFO: renamed from: o.ad$Application */
    public static final class Application {
        public C6582aS KWHzl;

        public final Application AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C6582aS c6582aS) {
            this.KWHzl = c6582aS;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C6582aS OLrzqt() {
            return this.KWHzl;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C7079ad c7079ad) {
            this();
            Intrinsics.checkNotNullParameter(c7079ad, "");
            this.KWHzl = c7079ad.EZpvd();
        }

        public final C7079ad copydefault() {
            return new C7079ad(this, null);
        }
    }
}
