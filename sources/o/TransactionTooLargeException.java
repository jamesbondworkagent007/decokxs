package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.TransactionTooLargeException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class TransactionTooLargeException {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final HwRemoteBinder AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.Integer copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.TransactionTooLargeException$ActionBar) A[MD:(o.TransactionTooLargeException$ActionBar):void (m)] call: o.TransactionTooLargeException.<init>(o.TransactionTooLargeException$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TransactionTooLargeException(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HwRemoteBinder KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.copydefault;
    }

    public TransactionTooLargeException(ActionBar actionBar) {
        this.AEQbTJ = actionBar.EZpvd();
        this.copydefault = actionBar.AEQbTJ();
        this.EZpvd = actionBar.copydefault();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.TransactionTooLargeException.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final TransactionTooLargeException KWHzl(@NotNull Function1<? super ActionBar, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            ActionBar actionBar = new ActionBar();
            function1.invoke(actionBar);
            return actionBar.KWHzl();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListDominantLanguageDetectionJobsRequest(");
        sb.append("filter=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("maxResults=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("nextToken=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        HwRemoteBinder hwRemoteBinder = this.AEQbTJ;
        int iHashCode = hwRemoteBinder != null ? hwRemoteBinder.hashCode() : 0;
        java.lang.Integer num = this.copydefault;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str = this.EZpvd;
        return (((iHashCode * 31) + iIntValue) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransactionTooLargeException.class != obj.getClass()) {
            return false;
        }
        TransactionTooLargeException transactionTooLargeException = (TransactionTooLargeException) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, transactionTooLargeException.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, transactionTooLargeException.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) transactionTooLargeException.EZpvd);
    }

    public static /* synthetic */ TransactionTooLargeException copy$default(TransactionTooLargeException transactionTooLargeException, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.ListDominantLanguageDetectionJobsRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TransactionTooLargeException.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TransactionTooLargeException.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(transactionTooLargeException);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        public java.lang.Integer EZpvd;
        public HwRemoteBinder OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HwRemoteBinder EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull TransactionTooLargeException transactionTooLargeException) {
            this();
            Intrinsics.checkNotNullParameter(transactionTooLargeException, "");
            this.OLrzqt = transactionTooLargeException.KWHzl();
            this.EZpvd = transactionTooLargeException.copydefault();
            this.copydefault = transactionTooLargeException.AEQbTJ();
        }

        public final TransactionTooLargeException KWHzl() {
            return new TransactionTooLargeException(this, null);
        }
    }
}
