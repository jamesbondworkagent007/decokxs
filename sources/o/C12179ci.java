package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C12179ci;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C12179ci {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final SmartSelectSprite OLrzqt;
    public final java.util.List<AbstractC12232cj> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ci$TaskDescription) A[MD:(o.ci$TaskDescription):void (m)] call: o.ci.<init>(o.ci$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C12179ci(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartSelectSprite AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC12232cj> OLrzqt() {
        return this.copydefault;
    }

    public C12179ci(TaskDescription taskDescription) {
        this.OLrzqt = taskDescription.KWHzl();
        this.copydefault = taskDescription.OLrzqt();
    }

    /* JADX INFO: renamed from: o.ci$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ci.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UnsearchedFace(");
        sb.append("faceDetails=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("reasons=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        SmartSelectSprite smartSelectSprite = this.OLrzqt;
        int iHashCode = smartSelectSprite != null ? smartSelectSprite.hashCode() : 0;
        java.util.List<AbstractC12232cj> list = this.copydefault;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12179ci.class != obj.getClass()) {
            return false;
        }
        C12179ci c12179ci = (C12179ci) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c12179ci.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c12179ci.copydefault);
    }

    public static /* synthetic */ C12179ci copy$default(C12179ci c12179ci, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.UnsearchedFace$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C12179ci.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C12179ci.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c12179ci);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    /* JADX INFO: renamed from: o.ci$TaskDescription */
    public static final class TaskDescription {
        public SmartSelectSprite KWHzl;
        public java.util.List<? extends AbstractC12232cj> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SmartSelectSprite KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.cj>, java.util.List<o.cj> */
        public final java.util.List<AbstractC12232cj> OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<? extends AbstractC12232cj> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(SmartSelectSprite smartSelectSprite) {
            this.KWHzl = smartSelectSprite;
        }

        public final TaskDescription copydefault() {
            return this;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C12179ci c12179ci) {
            this();
            Intrinsics.checkNotNullParameter(c12179ci, "");
            this.KWHzl = c12179ci.AEQbTJ();
            this.OLrzqt = c12179ci.OLrzqt();
        }

        public final C12179ci EZpvd() {
            return new C12179ci(this, null);
        }
    }
}
