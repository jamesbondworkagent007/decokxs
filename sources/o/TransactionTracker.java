package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.TransactionTracker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class TransactionTracker {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public final java.util.List<HwBinder> AEQbTJ;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.TransactionTracker$ActionBar) A[MD:(o.TransactionTracker$ActionBar):void (m)] call: o.TransactionTracker.<init>(o.TransactionTracker$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TransactionTracker(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<HwBinder> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public TransactionTracker(ActionBar actionBar) {
        this.AEQbTJ = actionBar.AEQbTJ();
        this.OLrzqt = actionBar.EZpvd();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.TransactionTracker.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListDominantLanguageDetectionJobsResponse(");
        sb.append("dominantLanguageDetectionJobPropertiesList=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("nextToken=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<HwBinder> list = this.AEQbTJ;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.String str = this.OLrzqt;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransactionTracker.class != obj.getClass()) {
            return false;
        }
        TransactionTracker transactionTracker = (TransactionTracker) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, transactionTracker.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) transactionTracker.OLrzqt);
    }

    public static /* synthetic */ TransactionTracker copy$default(TransactionTracker transactionTracker, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.ListDominantLanguageDetectionJobsResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TransactionTracker.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TransactionTracker.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(transactionTracker);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        public java.util.List<HwBinder> OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<HwBinder> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<HwBinder> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        public final ActionBar KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.copydefault = str;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull TransactionTracker transactionTracker) {
            this();
            Intrinsics.checkNotNullParameter(transactionTracker, "");
            this.OLrzqt = transactionTracker.AEQbTJ();
            this.copydefault = transactionTracker.copydefault();
        }

        public final TransactionTracker copydefault() {
            return new TransactionTracker(this, null);
        }
    }
}
