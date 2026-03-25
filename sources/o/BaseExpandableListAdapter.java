package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.BaseExpandableListAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class BaseExpandableListAdapter {
    public static final Activity KWHzl = new Activity(null);
    public final EdgeEffect AEQbTJ;
    public final DigitalClock EZpvd;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.BaseExpandableListAdapter$TaskDescription) A[MD:(o.BaseExpandableListAdapter$TaskDescription):void (m)] call: o.BaseExpandableListAdapter.<init>(o.BaseExpandableListAdapter$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BaseExpandableListAdapter(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DigitalClock AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EdgeEffect OLrzqt() {
        return this.AEQbTJ;
    }

    public BaseExpandableListAdapter(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.KWHzl();
        this.EZpvd = taskDescription.OLrzqt();
        this.OLrzqt = taskDescription.copydefault();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BaseExpandableListAdapter.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateDatasetRequest(");
        sb.append("datasetSource=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("datasetType=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("projectArn=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        EdgeEffect edgeEffect = this.AEQbTJ;
        int iHashCode = edgeEffect != null ? edgeEffect.hashCode() : 0;
        DigitalClock digitalClock = this.EZpvd;
        int iHashCode2 = digitalClock != null ? digitalClock.hashCode() : 0;
        java.lang.String str = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BaseExpandableListAdapter.class != obj.getClass()) {
            return false;
        }
        BaseExpandableListAdapter baseExpandableListAdapter = (BaseExpandableListAdapter) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, baseExpandableListAdapter.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, baseExpandableListAdapter.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) baseExpandableListAdapter.OLrzqt);
    }

    public static /* synthetic */ BaseExpandableListAdapter copy$default(BaseExpandableListAdapter baseExpandableListAdapter, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.CreateDatasetRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BaseExpandableListAdapter.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BaseExpandableListAdapter.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(baseExpandableListAdapter);
        function1.invoke(taskDescription);
        return taskDescription.AEQbTJ();
    }

    public static final class TaskDescription {
        public DigitalClock AEQbTJ;
        public java.lang.String OLrzqt;
        public EdgeEffect copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EdgeEffect KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DigitalClock OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull BaseExpandableListAdapter baseExpandableListAdapter) {
            this();
            Intrinsics.checkNotNullParameter(baseExpandableListAdapter, "");
            this.copydefault = baseExpandableListAdapter.OLrzqt();
            this.AEQbTJ = baseExpandableListAdapter.AEQbTJ();
            this.OLrzqt = baseExpandableListAdapter.EZpvd();
        }

        public final BaseExpandableListAdapter AEQbTJ() {
            return new BaseExpandableListAdapter(this, null);
        }
    }
}
