package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC47015ti;
import o.C46697tc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C46697tc {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final java.lang.String OLrzqt;
    public final AbstractC47015ti copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tc$ActionBar) A[MD:(o.tc$ActionBar):void (m)] call: o.tc.<init>(o.tc$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C46697tc(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC47015ti KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public C46697tc(ActionBar actionBar) {
        java.lang.String strKWHzl = actionBar.KWHzl();
        if (strKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for id".toString());
        }
        this.OLrzqt = strKWHzl;
        AbstractC47015ti abstractC47015tiOLrzqt = actionBar.OLrzqt();
        if (abstractC47015tiOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for type".toString());
        }
        this.copydefault = abstractC47015tiOLrzqt;
    }

    /* JADX INFO: renamed from: o.tc$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EncryptionKey(");
        sb.append("id=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("type=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C46697tc.class != obj.getClass()) {
            return false;
        }
        C46697tc c46697tc = (C46697tc) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c46697tc.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c46697tc.copydefault);
    }

    public static /* synthetic */ C46697tc copy$default(C46697tc c46697tc, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.EncryptionKey$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C46697tc.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C46697tc.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c46697tc);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    /* JADX INFO: renamed from: o.tc$ActionBar */
    public static final class ActionBar {
        public java.lang.String OLrzqt;
        public AbstractC47015ti copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC47015ti OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AbstractC47015ti abstractC47015ti) {
            this.copydefault = abstractC47015ti;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C46697tc c46697tc) {
            this();
            Intrinsics.checkNotNullParameter(c46697tc, "");
            this.OLrzqt = c46697tc.copydefault();
            this.copydefault = c46697tc.KWHzl();
        }

        public final C46697tc copydefault() {
            return new C46697tc(this, null);
        }

        public final ActionBar AEQbTJ() {
            if (this.OLrzqt == null) {
                this.OLrzqt = "";
            }
            if (this.copydefault == null) {
                this.copydefault = new AbstractC47015ti.TaskDescription("no value provided");
            }
            return this;
        }
    }
}
