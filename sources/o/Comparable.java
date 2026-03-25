package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.Comparable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class Comparable {
    public static final Application OLrzqt = new Application(null);
    public final java.lang.Boolean AEQbTJ;
    public final java.util.List<java.lang.String> AYXKKw;
    public final java.util.Map<java.lang.String, java.lang.String> AhwBna;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final java.util.List<ClassFormatError> copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;
    public final java.util.List<java.lang.String> valueOf;
    public final java.util.Map<java.lang.String, java.lang.String> values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Comparable$ActionBar) A[MD:(o.Comparable$ActionBar):void (m)] call: o.Comparable.<init>(o.Comparable$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Comparable(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ClassFormatError> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> gEmmrt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> valueOf() {
        return this.valueOf;
    }

    public Comparable(ActionBar actionBar) {
        this.AEQbTJ = actionBar.KWHzl();
        this.KWHzl = actionBar.copydefault();
        this.copydefault = actionBar.OLrzqt();
        this.EZpvd = actionBar.AhwBna();
        java.lang.String strValueOf = actionBar.valueOf();
        if (strValueOf == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for identityPoolId".toString());
        }
        this.djBIcL = strValueOf;
        java.lang.String strAYXKKw = actionBar.AYXKKw();
        if (strAYXKKw == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for identityPoolName".toString());
        }
        this.gEmmrt = strAYXKKw;
        this.AhwBna = actionBar.djBIcL();
        this.valueOf = actionBar.gEmmrt();
        this.AYXKKw = actionBar.DbNXlk();
        this.values = actionBar.isConnected();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Comparable.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateIdentityPoolResponse(");
        sb.append("allowClassicFlow=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("allowUnauthenticatedIdentities=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("cognitoIdentityProviders=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("developerProviderName=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("identityPoolId=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("identityPoolName=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("identityPoolTags=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("openIdConnectProviderArns=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("samlProviderArns=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("supportedLoginProviders=");
        sb2.append(this.values);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Boolean bool = this.AEQbTJ;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        int iHashCode2 = java.lang.Boolean.hashCode(this.KWHzl);
        java.util.List<ClassFormatError> list = this.copydefault;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        int iHashCode5 = this.djBIcL.hashCode();
        int iHashCode6 = this.gEmmrt.hashCode();
        java.util.Map<java.lang.String, java.lang.String> map = this.AhwBna;
        int iHashCode7 = map != null ? map.hashCode() : 0;
        java.util.List<java.lang.String> list2 = this.valueOf;
        int iHashCode8 = list2 != null ? list2.hashCode() : 0;
        java.util.List<java.lang.String> list3 = this.AYXKKw;
        int iHashCode9 = list3 != null ? list3.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.values;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (map2 != null ? map2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Comparable.class != obj.getClass()) {
            return false;
        }
        Comparable comparable = (Comparable) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, comparable.AEQbTJ) && this.KWHzl == comparable.KWHzl && Intrinsics.EZpvd(this.copydefault, comparable.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) comparable.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) comparable.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) comparable.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, comparable.AhwBna) && Intrinsics.EZpvd(this.valueOf, comparable.valueOf) && Intrinsics.EZpvd(this.AYXKKw, comparable.AYXKKw) && Intrinsics.EZpvd(this.values, comparable.values);
    }

    public static /* synthetic */ Comparable copy$default(Comparable comparable, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.model.CreateIdentityPoolResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Comparable.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Comparable.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(comparable);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    public static final class ActionBar {
        public java.lang.Boolean AEQbTJ;
        public java.util.List<java.lang.String> AYXKKw;
        public java.util.Map<java.lang.String, java.lang.String> AhwBna;
        public boolean EZpvd;
        public java.lang.String KWHzl;
        public java.util.List<ClassFormatError> OLrzqt;
        public java.lang.String copydefault;
        public java.lang.String djBIcL;
        public java.util.List<java.lang.String> gEmmrt;
        public java.util.Map<java.lang.String, java.lang.String> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ() {
            if (this.KWHzl == null) {
                this.KWHzl = "";
            }
            if (this.djBIcL == null) {
                this.djBIcL = "";
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.Map<java.lang.String, java.lang.String> map) {
            this.AhwBna = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> DbNXlk() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Boolean bool) {
            this.AEQbTJ = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<ClassFormatError> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<java.lang.String> list) {
            this.AYXKKw = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ClassFormatError> OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<java.lang.String> list) {
            this.gEmmrt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.Map<java.lang.String, java.lang.String> map) {
            this.valueOf = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(boolean z) {
            this.EZpvd = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> isConnected() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.KWHzl;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull Comparable comparable) {
            this();
            Intrinsics.checkNotNullParameter(comparable, "");
            this.AEQbTJ = comparable.OLrzqt();
            this.EZpvd = comparable.AEQbTJ();
            this.OLrzqt = comparable.EZpvd();
            this.copydefault = comparable.KWHzl();
            this.KWHzl = comparable.copydefault();
            this.djBIcL = comparable.AhwBna();
            this.AhwBna = comparable.djBIcL();
            this.gEmmrt = comparable.valueOf();
            this.AYXKKw = comparable.AYXKKw();
            this.valueOf = comparable.gEmmrt();
        }

        public final Comparable EZpvd() {
            return new Comparable(this, null);
        }
    }
}
