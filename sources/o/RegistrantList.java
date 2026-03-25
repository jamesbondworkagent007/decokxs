package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RegistrantList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RegistrantList {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final C5173Hn AEQbTJ;
    public final RemoteMailException EZpvd;
    public final C5173Hn copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RegistrantList$ActionBar) A[MD:(o.RegistrantList$ActionBar):void (m)] call: o.RegistrantList.<init>(o.RegistrantList$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RegistrantList(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RemoteMailException copydefault() {
        return this.EZpvd;
    }

    public RegistrantList(ActionBar actionBar) {
        this.copydefault = actionBar.AEQbTJ();
        this.AEQbTJ = actionBar.KWHzl();
        this.EZpvd = actionBar.copydefault();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RegistrantList.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FlywheelFilter(");
        sb.append("creationTimeAfter=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("creationTimeBefore=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("status=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.copydefault;
        int iHashCode = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C5173Hn c5173Hn2 = this.AEQbTJ;
        int iHashCode2 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        RemoteMailException remoteMailException = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (remoteMailException != null ? remoteMailException.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RegistrantList.class != obj.getClass()) {
            return false;
        }
        RegistrantList registrantList = (RegistrantList) obj;
        return Intrinsics.EZpvd(this.copydefault, registrantList.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, registrantList.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, registrantList.EZpvd);
    }

    public static /* synthetic */ RegistrantList copy$default(RegistrantList registrantList, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.FlywheelFilter$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RegistrantList.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RegistrantList.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(registrantList);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    public static final class ActionBar {
        public RemoteMailException KWHzl;
        public C5173Hn OLrzqt;
        public C5173Hn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RemoteMailException copydefault() {
            return this.KWHzl;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull RegistrantList registrantList) {
            this();
            Intrinsics.checkNotNullParameter(registrantList, "");
            this.OLrzqt = registrantList.KWHzl();
            this.copydefault = registrantList.EZpvd();
            this.KWHzl = registrantList.copydefault();
        }

        public final RegistrantList OLrzqt() {
            return new RegistrantList(this, null);
        }
    }
}
