package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C47492tr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C47492tr {
    public static final Application AEQbTJ = new Application(null);
    public final java.util.List<C47700tv> EZpvd;
    public final java.lang.String OLrzqt;
    public final AbstractC46856tf copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tr$Activity) A[MD:(o.tr$Activity):void (m)] call: o.tr.<init>(o.tr$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C47492tr(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC46856tf AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C47700tv> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public C47492tr(Activity activity) {
        this.copydefault = activity.EZpvd();
        this.EZpvd = activity.OLrzqt();
        this.OLrzqt = activity.copydefault();
    }

    /* JADX INFO: renamed from: o.tr$Application */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tr.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListLanguagesResponse(");
        sb.append("displayLanguageCode=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("languages=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
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
        AbstractC46856tf abstractC46856tf = this.copydefault;
        int iHashCode = abstractC46856tf != null ? abstractC46856tf.hashCode() : 0;
        java.util.List<C47700tv> list = this.EZpvd;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        java.lang.String str = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C47492tr.class != obj.getClass()) {
            return false;
        }
        C47492tr c47492tr = (C47492tr) obj;
        return Intrinsics.EZpvd(this.copydefault, c47492tr.copydefault) && Intrinsics.EZpvd(this.EZpvd, c47492tr.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c47492tr.OLrzqt);
    }

    public static /* synthetic */ C47492tr copy$default(C47492tr c47492tr, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.ListLanguagesResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C47492tr.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C47492tr.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c47492tr);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.tr$Activity */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        public java.util.List<C47700tv> KWHzl;
        public java.lang.String OLrzqt;
        public AbstractC46856tf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC46856tf EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(AbstractC46856tf abstractC46856tf) {
            this.copydefault = abstractC46856tf;
        }

        public final Activity KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<C47700tv> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C47700tv> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C47492tr c47492tr) {
            this();
            Intrinsics.checkNotNullParameter(c47492tr, "");
            this.copydefault = c47492tr.AEQbTJ();
            this.KWHzl = c47492tr.EZpvd();
            this.OLrzqt = c47492tr.copydefault();
        }

        public final C47492tr AEQbTJ() {
            return new C47492tr(this, null);
        }
    }
}
