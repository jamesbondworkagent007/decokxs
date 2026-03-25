package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C46909tg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C46909tg {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final C46456tV OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tg$Activity) A[MD:(o.tg$Activity):void (m)] call: o.tg.<init>(o.tg$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C46909tg(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46456tV EZpvd() {
        return this.OLrzqt;
    }

    public C46909tg(Activity activity) {
        this.OLrzqt = activity.copydefault();
    }

    /* JADX INFO: renamed from: o.tg$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tg.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DescribeTextTranslationJobResponse(");
        sb.append("textTranslationJobProperties=" + this.OLrzqt);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C46456tV c46456tV = this.OLrzqt;
        if (c46456tV != null) {
            return c46456tV.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C46909tg.class == obj.getClass() && Intrinsics.EZpvd(this.OLrzqt, ((C46909tg) obj).OLrzqt);
    }

    public static /* synthetic */ C46909tg copy$default(C46909tg c46909tg, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.DescribeTextTranslationJobResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C46909tg.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C46909tg.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c46909tg);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    /* JADX INFO: renamed from: o.tg$Activity */
    public static final class Activity {
        public C46456tV AEQbTJ;

        public final Activity EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C46456tV c46456tV) {
            this.AEQbTJ = c46456tV;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46456tV copydefault() {
            return this.AEQbTJ;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C46909tg c46909tg) {
            this();
            Intrinsics.checkNotNullParameter(c46909tg, "");
            this.AEQbTJ = c46909tg.EZpvd();
        }

        public final C46909tg OLrzqt() {
            return new C46909tg(this, null);
        }
    }
}
