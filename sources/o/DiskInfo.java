package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DiskInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DiskInfo {
    public static final Activity AEQbTJ = new Activity(null);
    public final WebViewMethodCalledOnWrongThreadViolation EZpvd;
    public final UntaggedSocketViolation KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DiskInfo$StateListAnimator) A[MD:(o.DiskInfo$StateListAnimator):void (m)] call: o.DiskInfo.<init>(o.DiskInfo$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DiskInfo(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UntaggedSocketViolation KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewMethodCalledOnWrongThreadViolation OLrzqt() {
        return this.EZpvd;
    }

    public DiskInfo(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.KWHzl();
        this.EZpvd = stateListAnimator.copydefault();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DiskInfo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MentionSentiment(");
        sb.append("sentiment=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("sentimentScore=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        UntaggedSocketViolation untaggedSocketViolation = this.KWHzl;
        int iHashCode = untaggedSocketViolation != null ? untaggedSocketViolation.hashCode() : 0;
        WebViewMethodCalledOnWrongThreadViolation webViewMethodCalledOnWrongThreadViolation = this.EZpvd;
        return (iHashCode * 31) + (webViewMethodCalledOnWrongThreadViolation != null ? webViewMethodCalledOnWrongThreadViolation.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DiskInfo.class != obj.getClass()) {
            return false;
        }
        DiskInfo diskInfo = (DiskInfo) obj;
        return Intrinsics.EZpvd(this.KWHzl, diskInfo.KWHzl) && Intrinsics.EZpvd(this.EZpvd, diskInfo.EZpvd);
    }

    public static /* synthetic */ DiskInfo copy$default(DiskInfo diskInfo, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.MentionSentiment$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DiskInfo.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DiskInfo.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(diskInfo);
        function1.invoke(stateListAnimator);
        return stateListAnimator.OLrzqt();
    }

    public static final class StateListAnimator {
        public UntaggedSocketViolation KWHzl;
        public WebViewMethodCalledOnWrongThreadViolation OLrzqt;

        public final StateListAnimator AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(UntaggedSocketViolation untaggedSocketViolation) {
            this.KWHzl = untaggedSocketViolation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UntaggedSocketViolation KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewMethodCalledOnWrongThreadViolation copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(WebViewMethodCalledOnWrongThreadViolation webViewMethodCalledOnWrongThreadViolation) {
            this.OLrzqt = webViewMethodCalledOnWrongThreadViolation;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull DiskInfo diskInfo) {
            this();
            Intrinsics.checkNotNullParameter(diskInfo, "");
            this.KWHzl = diskInfo.KWHzl();
            this.OLrzqt = diskInfo.OLrzqt();
        }

        public final DiskInfo OLrzqt() {
            return new DiskInfo(this, null);
        }
    }
}
