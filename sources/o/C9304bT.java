package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C9304bT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C9304bT {
    public static final ActionBar KWHzl = new ActionBar(null);
    public final AdapterView AEQbTJ;
    public final TabHost copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bT$Activity) A[MD:(o.bT$Activity):void (m)] call: o.bT.<init>(o.bT$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C9304bT(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TabHost KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdapterView OLrzqt() {
        return this.AEQbTJ;
    }

    public C9304bT(Activity activity) {
        this.AEQbTJ = activity.EZpvd();
        this.copydefault = activity.KWHzl();
    }

    /* JADX INFO: renamed from: o.bT$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StreamProcessorSettings(");
        sb.append("connectedHome=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("faceSearch=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AdapterView adapterView = this.AEQbTJ;
        int iHashCode = adapterView != null ? adapterView.hashCode() : 0;
        TabHost tabHost = this.copydefault;
        return (iHashCode * 31) + (tabHost != null ? tabHost.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9304bT.class != obj.getClass()) {
            return false;
        }
        C9304bT c9304bT = (C9304bT) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c9304bT.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c9304bT.copydefault);
    }

    public static /* synthetic */ C9304bT copy$default(C9304bT c9304bT, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StreamProcessorSettings$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C9304bT.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C9304bT.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c9304bT);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    /* JADX INFO: renamed from: o.bT$Activity */
    public static final class Activity {
        public TabHost AEQbTJ;
        public AdapterView copydefault;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AdapterView adapterView) {
            this.copydefault = adapterView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(TabHost tabHost) {
            this.AEQbTJ = tabHost;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AdapterView EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TabHost KWHzl() {
            return this.AEQbTJ;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C9304bT c9304bT) {
            this();
            Intrinsics.checkNotNullParameter(c9304bT, "");
            this.copydefault = c9304bT.OLrzqt();
            this.AEQbTJ = c9304bT.KWHzl();
        }

        public final C9304bT OLrzqt() {
            return new C9304bT(this, null);
        }
    }
}
