package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SearchManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class SearchManager {
    public static final Application KWHzl = new Application(null);
    public final java.lang.Boolean AEQbTJ;
    public final NativeActivity AhwBna;
    public final java.lang.String EZpvd;
    public final AuthenticatorException OLrzqt;
    public final java.lang.Boolean copydefault;
    public final DevicePolicyCache djBIcL;
    public final java.lang.Boolean valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SearchManager$Activity) A[MD:(o.SearchManager$Activity):void (m)] call: o.SearchManager.<init>(o.SearchManager$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SearchManager(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthenticatorException AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NativeActivity copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DevicePolicyCache valueOf() {
        return this.djBIcL;
    }

    public SearchManager(Activity activity) {
        this.OLrzqt = activity.copydefault();
        this.copydefault = activity.KWHzl();
        this.AEQbTJ = activity.EZpvd();
        this.EZpvd = activity.gEmmrt();
        this.AhwBna = activity.AYXKKw();
        this.valueOf = activity.valueOf();
        this.djBIcL = activity.AhwBna();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SearchManager.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SchemaAttributeType(");
        sb.append("attributeDataType=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("developerOnlyAttribute=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("mutable=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("name=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("numberAttributeConstraints=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("required=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("stringAttributeConstraints=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AuthenticatorException authenticatorException = this.OLrzqt;
        int iHashCode = authenticatorException != null ? authenticatorException.hashCode() : 0;
        java.lang.Boolean bool = this.copydefault;
        int iHashCode2 = bool != null ? bool.hashCode() : 0;
        java.lang.Boolean bool2 = this.AEQbTJ;
        int iHashCode3 = bool2 != null ? bool2.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        NativeActivity nativeActivity = this.AhwBna;
        int iHashCode5 = nativeActivity != null ? nativeActivity.hashCode() : 0;
        java.lang.Boolean bool3 = this.valueOf;
        int iHashCode6 = bool3 != null ? bool3.hashCode() : 0;
        DevicePolicyCache devicePolicyCache = this.djBIcL;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (devicePolicyCache != null ? devicePolicyCache.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SearchManager.class != obj.getClass()) {
            return false;
        }
        SearchManager searchManager = (SearchManager) obj;
        return Intrinsics.EZpvd(this.OLrzqt, searchManager.OLrzqt) && Intrinsics.EZpvd(this.copydefault, searchManager.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, searchManager.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) searchManager.EZpvd) && Intrinsics.EZpvd(this.AhwBna, searchManager.AhwBna) && Intrinsics.EZpvd(this.valueOf, searchManager.valueOf) && Intrinsics.EZpvd(this.djBIcL, searchManager.djBIcL);
    }

    public static /* synthetic */ SearchManager copy$default(SearchManager searchManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.SchemaAttributeType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SearchManager.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SearchManager.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(searchManager);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public NativeActivity EZpvd;
        public java.lang.Boolean KWHzl;
        public AuthenticatorException OLrzqt;
        public java.lang.Boolean copydefault;
        public java.lang.Boolean djBIcL;
        public DevicePolicyCache gEmmrt;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AuthenticatorException authenticatorException) {
            this.OLrzqt = authenticatorException;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NativeActivity AYXKKw() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DevicePolicyCache AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Boolean bool) {
            this.djBIcL = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Boolean bool) {
            this.copydefault = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(NativeActivity nativeActivity) {
            this.EZpvd = nativeActivity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Boolean bool) {
            this.KWHzl = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthenticatorException copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(DevicePolicyCache devicePolicyCache) {
            this.gEmmrt = devicePolicyCache;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean valueOf() {
            return this.djBIcL;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull SearchManager searchManager) {
            this();
            Intrinsics.checkNotNullParameter(searchManager, "");
            this.OLrzqt = searchManager.AEQbTJ();
            this.KWHzl = searchManager.OLrzqt();
            this.copydefault = searchManager.EZpvd();
            this.AEQbTJ = searchManager.KWHzl();
            this.EZpvd = searchManager.copydefault();
            this.djBIcL = searchManager.djBIcL();
            this.gEmmrt = searchManager.valueOf();
        }

        public final SearchManager OLrzqt() {
            return new SearchManager(this, null);
        }
    }
}
