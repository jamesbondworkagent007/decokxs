package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C6792aW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C6792aW {
    public static final Application EZpvd = new Application(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.Integer KWHzl;
    public final C25615j OLrzqt;
    public final AbstractC6105aJ copydefault;
    public final java.lang.Float gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.aW$Activity) A[MD:(o.aW$Activity):void (m)] call: o.aW.<init>(o.aW$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C6792aW(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25615j KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC6105aJ copydefault() {
        return this.copydefault;
    }

    public C6792aW(Activity activity) {
        this.AEQbTJ = activity.KWHzl();
        this.OLrzqt = activity.OLrzqt();
        this.KWHzl = activity.EZpvd();
        this.copydefault = activity.copydefault();
        this.gEmmrt = activity.AYXKKw();
    }

    /* JADX INFO: renamed from: o.aW$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aW.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SearchUsersByImageRequest(");
        sb.append("collectionId=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("image=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("maxUsers=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("qualityFilter=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userMatchThreshold=");
        sb2.append(this.gEmmrt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        C25615j c25615j = this.OLrzqt;
        int iHashCode2 = c25615j != null ? c25615j.hashCode() : 0;
        java.lang.Integer num = this.KWHzl;
        int iIntValue = num != null ? num.intValue() : 0;
        AbstractC6105aJ abstractC6105aJ = this.copydefault;
        int iHashCode3 = abstractC6105aJ != null ? abstractC6105aJ.hashCode() : 0;
        java.lang.Float f = this.gEmmrt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iIntValue) * 31) + iHashCode3) * 31) + (f != null ? f.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6792aW.class != obj.getClass()) {
            return false;
        }
        C6792aW c6792aW = (C6792aW) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c6792aW.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c6792aW.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c6792aW.KWHzl) && Intrinsics.EZpvd(this.copydefault, c6792aW.copydefault) && Intrinsics.copydefault(this.gEmmrt, c6792aW.gEmmrt);
    }

    public static /* synthetic */ C6792aW copy$default(C6792aW c6792aW, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.SearchUsersByImageRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C6792aW.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C6792aW.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c6792aW);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.aW$Activity */
    public static final class Activity {
        public java.lang.Float AEQbTJ;
        public AbstractC6105aJ EZpvd;
        public java.lang.String KWHzl;
        public java.lang.Integer OLrzqt;
        public C25615j copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float AYXKKw() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C25615j OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC6105aJ copydefault() {
            return this.EZpvd;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C6792aW c6792aW) {
            this();
            Intrinsics.checkNotNullParameter(c6792aW, "");
            this.KWHzl = c6792aW.EZpvd();
            this.copydefault = c6792aW.KWHzl();
            this.OLrzqt = c6792aW.AEQbTJ();
            this.EZpvd = c6792aW.copydefault();
            this.AEQbTJ = c6792aW.OLrzqt();
        }

        public final C6792aW AEQbTJ() {
            return new C6792aW(this, null);
        }
    }
}
