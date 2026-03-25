package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C35318nt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C35318nt {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final C35796oE EZpvd;
    public final byte[] KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nt$Activity) A[MD:(o.nt$Activity):void (m)] call: o.nt.<init>(o.nt$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C35318nt(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35796oE OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] copydefault() {
        return this.KWHzl;
    }

    public C35318nt(Activity activity) {
        this.KWHzl = activity.copydefault();
        this.EZpvd = activity.EZpvd();
    }

    /* JADX INFO: renamed from: o.nt$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nt.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C35318nt EZpvd(@NotNull Function1<? super Activity, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Activity activity = new Activity();
            function1.invoke(activity);
            return activity.KWHzl();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Document(");
        sb.append("bytes=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("s3Object=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        byte[] bArr = this.KWHzl;
        int iHashCode = bArr != null ? java.util.Arrays.hashCode(bArr) : 0;
        C35796oE c35796oE = this.EZpvd;
        return (iHashCode * 31) + (c35796oE != null ? c35796oE.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C35318nt.class != obj.getClass()) {
            return false;
        }
        C35318nt c35318nt = (C35318nt) obj;
        byte[] bArr = this.KWHzl;
        if (bArr != null) {
            byte[] bArr2 = c35318nt.KWHzl;
            if (bArr2 == null || !java.util.Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (c35318nt.KWHzl != null) {
            return false;
        }
        return Intrinsics.EZpvd(this.EZpvd, c35318nt.EZpvd);
    }

    public static /* synthetic */ C35318nt copy$default(C35318nt c35318nt, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.Document$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C35318nt.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C35318nt.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c35318nt);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    /* JADX INFO: renamed from: o.nt$Activity */
    public static final class Activity {
        public C35796oE AEQbTJ;
        public byte[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(byte[] bArr) {
            this.OLrzqt = bArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C35796oE EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final byte[] copydefault() {
            return this.OLrzqt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C35318nt c35318nt) {
            this();
            Intrinsics.checkNotNullParameter(c35318nt, "");
            this.OLrzqt = c35318nt.copydefault();
            this.AEQbTJ = c35318nt.OLrzqt();
        }

        public final C35318nt KWHzl() {
            return new C35318nt(this, null);
        }
    }
}
