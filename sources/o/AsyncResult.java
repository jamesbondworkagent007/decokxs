package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AsyncResult;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class AsyncResult {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final java.util.List<HwBlob> AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AsyncResult$Application) A[MD:(o.AsyncResult$Application):void (m)] call: o.AsyncResult.<init>(o.AsyncResult$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AsyncResult(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<HwBlob> EZpvd() {
        return this.AEQbTJ;
    }

    public AsyncResult(Application application) {
        this.AEQbTJ = application.copydefault();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AsyncResult.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "DetectDominantLanguageResponse(*** Sensitive Data Redacted ***)";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        java.util.List<HwBlob> list = this.AEQbTJ;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && AsyncResult.class == obj.getClass() && Intrinsics.EZpvd(this.AEQbTJ, ((AsyncResult) obj).AEQbTJ);
    }

    public static /* synthetic */ AsyncResult copy$default(AsyncResult asyncResult, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DetectDominantLanguageResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AsyncResult.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AsyncResult.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(asyncResult);
        function1.invoke(application);
        return application.OLrzqt();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        public java.util.List<HwBlob> KWHzl;

        public final Application EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<HwBlob> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<HwBlob> copydefault() {
            return this.KWHzl;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull AsyncResult asyncResult) {
            this();
            Intrinsics.checkNotNullParameter(asyncResult, "");
            this.KWHzl = asyncResult.EZpvd();
        }

        public final AsyncResult OLrzqt() {
            return new AsyncResult(this, null);
        }
    }
}
