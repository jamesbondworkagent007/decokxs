package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.LayoutTransition;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutTransition {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ;
    public final ClientTransactionHandler AYXKKw;
    public final java.util.List<java.lang.String> KWHzl;
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.LayoutTransition$ActionBar) A[MD:(o.LayoutTransition$ActionBar):void (m)] call: o.LayoutTransition.<init>(o.LayoutTransition$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LayoutTransition(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClientTransactionHandler OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    public LayoutTransition(ActionBar actionBar) {
        this.OLrzqt = actionBar.EZpvd();
        this.KWHzl = actionBar.copydefault();
        this.AEQbTJ = actionBar.AEQbTJ();
        this.copydefault = actionBar.OLrzqt();
        this.AYXKKw = actionBar.gEmmrt();
        this.djBIcL = actionBar.AYXKKw();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.LayoutTransition.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateIdentityProviderRequest(");
        sb.append("attributeMapping=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("idpIdentifiers=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("providerDetails=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("providerName=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("providerType=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userPoolId=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.Map<java.lang.String, java.lang.String> map = this.OLrzqt;
        int iHashCode = map != null ? map.hashCode() : 0;
        java.util.List<java.lang.String> list = this.KWHzl;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.AEQbTJ;
        int iHashCode3 = map2 != null ? map2.hashCode() : 0;
        java.lang.String str = this.copydefault;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        ClientTransactionHandler clientTransactionHandler = this.AYXKKw;
        int iHashCode5 = clientTransactionHandler != null ? clientTransactionHandler.hashCode() : 0;
        java.lang.String str2 = this.djBIcL;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LayoutTransition.class != obj.getClass()) {
            return false;
        }
        LayoutTransition layoutTransition = (LayoutTransition) obj;
        return Intrinsics.EZpvd(this.OLrzqt, layoutTransition.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, layoutTransition.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, layoutTransition.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) layoutTransition.copydefault) && Intrinsics.EZpvd(this.AYXKKw, layoutTransition.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) layoutTransition.djBIcL);
    }

    public static /* synthetic */ LayoutTransition copy$default(LayoutTransition layoutTransition, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.CreateIdentityProviderRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutTransition.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutTransition.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(layoutTransition);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    public static final class ActionBar {
        public java.util.List<java.lang.String> AEQbTJ;
        public java.lang.String AhwBna;
        public java.util.Map<java.lang.String, java.lang.String> EZpvd;
        public ClientTransactionHandler KWHzl;
        public java.util.Map<java.lang.String, java.lang.String> OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ClientTransactionHandler gEmmrt() {
            return this.KWHzl;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull LayoutTransition layoutTransition) {
            this();
            Intrinsics.checkNotNullParameter(layoutTransition, "");
            this.OLrzqt = layoutTransition.EZpvd();
            this.AEQbTJ = layoutTransition.KWHzl();
            this.EZpvd = layoutTransition.AEQbTJ();
            this.copydefault = layoutTransition.copydefault();
            this.KWHzl = layoutTransition.OLrzqt();
            this.AhwBna = layoutTransition.AYXKKw();
        }

        public final LayoutTransition KWHzl() {
            return new LayoutTransition(this, null);
        }
    }
}
