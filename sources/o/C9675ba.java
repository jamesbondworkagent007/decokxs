package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C9675ba;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C9675ba {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final SmartSelectSprite OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ba$Activity) A[MD:(o.ba$Activity):void (m)] call: o.ba.<init>(o.ba$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C9675ba(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartSelectSprite OLrzqt() {
        return this.OLrzqt;
    }

    public C9675ba(Activity activity) {
        this.OLrzqt = activity.KWHzl();
    }

    /* JADX INFO: renamed from: o.ba$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ba.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SearchedFaceDetails(");
        sb.append("faceDetail=" + this.OLrzqt);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        SmartSelectSprite smartSelectSprite = this.OLrzqt;
        if (smartSelectSprite != null) {
            return smartSelectSprite.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C9675ba.class == obj.getClass() && Intrinsics.EZpvd(this.OLrzqt, ((C9675ba) obj).OLrzqt);
    }

    public static /* synthetic */ C9675ba copy$default(C9675ba c9675ba, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.SearchedFaceDetails$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C9675ba.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C9675ba.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c9675ba);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    /* JADX INFO: renamed from: o.ba$Activity */
    public static final class Activity {
        public SmartSelectSprite EZpvd;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SmartSelectSprite KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(SmartSelectSprite smartSelectSprite) {
            this.EZpvd = smartSelectSprite;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C9675ba c9675ba) {
            this();
            Intrinsics.checkNotNullParameter(c9675ba, "");
            this.EZpvd = c9675ba.OLrzqt();
        }

        public final C9675ba OLrzqt() {
            return new C9675ba(this, null);
        }
    }
}
