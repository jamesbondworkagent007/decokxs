package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.WebViewProviderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class WebViewProviderInfo {
    public static final ActionBar copydefault = new ActionBar(null);
    public final long EZpvd;
    public final WebViewProviderResponse KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.WebViewProviderInfo$TaskDescription) A[MD:(o.WebViewProviderInfo$TaskDescription):void (m)] call: o.WebViewProviderInfo.<init>(o.WebViewProviderInfo$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WebViewProviderInfo(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewProviderResponse OLrzqt() {
        return this.KWHzl;
    }

    public WebViewProviderInfo(TaskDescription taskDescription) {
        this.KWHzl = taskDescription.AEQbTJ();
        this.EZpvd = taskDescription.copydefault();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.WebViewProviderInfo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CelebrityRecognition(");
        sb.append("celebrity=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("timestamp=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        WebViewProviderResponse webViewProviderResponse = this.KWHzl;
        return ((webViewProviderResponse != null ? webViewProviderResponse.hashCode() : 0) * 31) + java.lang.Long.hashCode(this.EZpvd);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WebViewProviderInfo.class != obj.getClass()) {
            return false;
        }
        WebViewProviderInfo webViewProviderInfo = (WebViewProviderInfo) obj;
        return Intrinsics.EZpvd(this.KWHzl, webViewProviderInfo.KWHzl) && this.EZpvd == webViewProviderInfo.EZpvd;
    }

    public static /* synthetic */ WebViewProviderInfo copy$default(WebViewProviderInfo webViewProviderInfo, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.CelebrityRecognition$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull WebViewProviderInfo.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WebViewProviderInfo.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(webViewProviderInfo);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    public static final class TaskDescription {
        public WebViewProviderResponse EZpvd;
        public long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewProviderResponse AEQbTJ() {
            return this.EZpvd;
        }

        public final TaskDescription KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(long j) {
            this.KWHzl = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(WebViewProviderResponse webViewProviderResponse) {
            this.EZpvd = webViewProviderResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.KWHzl;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull WebViewProviderInfo webViewProviderInfo) {
            this();
            Intrinsics.checkNotNullParameter(webViewProviderInfo, "");
            this.EZpvd = webViewProviderInfo.OLrzqt();
            this.KWHzl = webViewProviderInfo.KWHzl();
        }

        public final WebViewProviderInfo EZpvd() {
            return new WebViewProviderInfo(this, null);
        }
    }
}
