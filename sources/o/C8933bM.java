package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C8933bM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C8933bM {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final C6529aR KWHzl;
    public final C33629n copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bM$Activity) A[MD:(o.bM$Activity):void (m)] call: o.bM.<init>(o.bM$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C8933bM(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6529aR AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33629n copydefault() {
        return this.copydefault;
    }

    public C8933bM(Activity activity) {
        this.copydefault = activity.AEQbTJ();
        this.KWHzl = activity.EZpvd();
    }

    /* JADX INFO: renamed from: o.bM$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bM.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StreamProcessorOutput(");
        sb.append("kinesisDataStream=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("s3Destination=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C33629n c33629n = this.copydefault;
        int iHashCode = c33629n != null ? c33629n.hashCode() : 0;
        C6529aR c6529aR = this.KWHzl;
        return (iHashCode * 31) + (c6529aR != null ? c6529aR.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8933bM.class != obj.getClass()) {
            return false;
        }
        C8933bM c8933bM = (C8933bM) obj;
        return Intrinsics.EZpvd(this.copydefault, c8933bM.copydefault) && Intrinsics.EZpvd(this.KWHzl, c8933bM.KWHzl);
    }

    public static /* synthetic */ C8933bM copy$default(C8933bM c8933bM, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StreamProcessorOutput$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C8933bM.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C8933bM.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c8933bM);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    /* JADX INFO: renamed from: o.bM$Activity */
    public static final class Activity {
        public C6529aR KWHzl;
        public C33629n OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33629n AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C6529aR EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C6529aR c6529aR) {
            this.KWHzl = c6529aR;
        }

        public final Activity KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C33629n c33629n) {
            this.OLrzqt = c33629n;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C8933bM c8933bM) {
            this();
            Intrinsics.checkNotNullParameter(c8933bM, "");
            this.OLrzqt = c8933bM.copydefault();
            this.KWHzl = c8933bM.AEQbTJ();
        }

        public final C8933bM OLrzqt() {
            return new C8933bM(this, null);
        }
    }
}
