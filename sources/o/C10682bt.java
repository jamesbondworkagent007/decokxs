package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C10682bt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C10682bt {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final AbstractC5734aC AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bt$ActionBar) A[MD:(o.bt$ActionBar):void (m)] call: o.bt.<init>(o.bt$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C10682bt(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC5734aC EZpvd() {
        return this.AEQbTJ;
    }

    public C10682bt(ActionBar actionBar) {
        this.AEQbTJ = actionBar.KWHzl();
    }

    /* JADX INFO: renamed from: o.bt$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bt.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartProjectVersionResponse(");
        sb.append("status=" + this.AEQbTJ);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AbstractC5734aC abstractC5734aC = this.AEQbTJ;
        if (abstractC5734aC != null) {
            return abstractC5734aC.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C10682bt.class == obj.getClass() && Intrinsics.EZpvd(this.AEQbTJ, ((C10682bt) obj).AEQbTJ);
    }

    public static /* synthetic */ C10682bt copy$default(C10682bt c10682bt, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StartProjectVersionResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C10682bt.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C10682bt.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c10682bt);
        function1.invoke(actionBar);
        return actionBar.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.bt$ActionBar */
    public static final class ActionBar {
        public AbstractC5734aC EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC5734aC KWHzl() {
            return this.EZpvd;
        }

        public final ActionBar copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AbstractC5734aC abstractC5734aC) {
            this.EZpvd = abstractC5734aC;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C10682bt c10682bt) {
            this();
            Intrinsics.checkNotNullParameter(c10682bt, "");
            this.EZpvd = c10682bt.EZpvd();
        }

        public final C10682bt AEQbTJ() {
            return new C10682bt(this, null);
        }
    }
}
