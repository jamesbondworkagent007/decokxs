package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.X509TrustManagerExtensions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class X509TrustManagerExtensions {
    public static final Activity EZpvd = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final NetworkKey KWHzl;
    public final java.lang.String OLrzqt;
    public final java.util.List<java.lang.String> copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.X509TrustManagerExtensions$StateListAnimator) A[MD:(o.X509TrustManagerExtensions$StateListAnimator):void (m)] call: o.X509TrustManagerExtensions.<init>(o.X509TrustManagerExtensions$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ X509TrustManagerExtensions(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkKey OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public X509TrustManagerExtensions(StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator.KWHzl();
        java.util.List<java.lang.String> listCopydefault = stateListAnimator.copydefault();
        if (listCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for attributeNames".toString());
        }
        this.copydefault = listCopydefault;
        this.KWHzl = stateListAnimator.OLrzqt();
        java.lang.String strAEQbTJ = stateListAnimator.AEQbTJ();
        if (strAEQbTJ == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for s3Uri".toString());
        }
        this.AEQbTJ = strAEQbTJ;
        this.valueOf = stateListAnimator.AhwBna();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.X509TrustManagerExtensions.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatasetAugmentedManifestsListItem(");
        sb.append("annotationDataS3Uri=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("attributeNames=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("documentType=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("s3Uri=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("sourceDocumentsS3Uri=");
        sb2.append(this.valueOf);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        int iHashCode2 = this.copydefault.hashCode();
        NetworkKey networkKey = this.KWHzl;
        int iHashCode3 = networkKey != null ? networkKey.hashCode() : 0;
        int iHashCode4 = this.AEQbTJ.hashCode();
        java.lang.String str2 = this.valueOf;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || X509TrustManagerExtensions.class != obj.getClass()) {
            return false;
        }
        X509TrustManagerExtensions x509TrustManagerExtensions = (X509TrustManagerExtensions) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) x509TrustManagerExtensions.OLrzqt) && Intrinsics.EZpvd(this.copydefault, x509TrustManagerExtensions.copydefault) && Intrinsics.EZpvd(this.KWHzl, x509TrustManagerExtensions.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) x509TrustManagerExtensions.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) x509TrustManagerExtensions.valueOf);
    }

    public static /* synthetic */ X509TrustManagerExtensions copy$default(X509TrustManagerExtensions x509TrustManagerExtensions, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DatasetAugmentedManifestsListItem$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull X509TrustManagerExtensions.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(X509TrustManagerExtensions.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(x509TrustManagerExtensions);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    public static final class StateListAnimator {
        public java.util.List<java.lang.String> AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public NetworkKey copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkKey OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> copydefault() {
            return this.AEQbTJ;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull X509TrustManagerExtensions x509TrustManagerExtensions) {
            this();
            Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "");
            this.EZpvd = x509TrustManagerExtensions.copydefault();
            this.AEQbTJ = x509TrustManagerExtensions.EZpvd();
            this.copydefault = x509TrustManagerExtensions.OLrzqt();
            this.OLrzqt = x509TrustManagerExtensions.KWHzl();
            this.KWHzl = x509TrustManagerExtensions.AEQbTJ();
        }

        public final X509TrustManagerExtensions EZpvd() {
            return new X509TrustManagerExtensions(this, null);
        }
    }
}
