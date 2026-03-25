package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RemoteViewsListAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RemoteViewsListAdapter {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final C25615j OLrzqt;
    public final C6052aI copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RemoteViewsListAdapter$ActionBar) A[MD:(o.RemoteViewsListAdapter$ActionBar):void (m)] call: o.RemoteViewsListAdapter.<init>(o.RemoteViewsListAdapter$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RemoteViewsListAdapter(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25615j EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6052aI copydefault() {
        return this.copydefault;
    }

    public RemoteViewsListAdapter(ActionBar actionBar) {
        this.OLrzqt = actionBar.OLrzqt();
        this.copydefault = actionBar.KWHzl();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RemoteViewsListAdapter.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectProtectiveEquipmentRequest(");
        sb.append("image=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("summarizationAttributes=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C25615j c25615j = this.OLrzqt;
        int iHashCode = c25615j != null ? c25615j.hashCode() : 0;
        C6052aI c6052aI = this.copydefault;
        return (iHashCode * 31) + (c6052aI != null ? c6052aI.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RemoteViewsListAdapter.class != obj.getClass()) {
            return false;
        }
        RemoteViewsListAdapter remoteViewsListAdapter = (RemoteViewsListAdapter) obj;
        return Intrinsics.EZpvd(this.OLrzqt, remoteViewsListAdapter.OLrzqt) && Intrinsics.EZpvd(this.copydefault, remoteViewsListAdapter.copydefault);
    }

    public static /* synthetic */ RemoteViewsListAdapter copy$default(RemoteViewsListAdapter remoteViewsListAdapter, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DetectProtectiveEquipmentRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RemoteViewsListAdapter.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RemoteViewsListAdapter.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(remoteViewsListAdapter);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    public static final class ActionBar {
        public C25615j KWHzl;
        public C6052aI OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C6052aI KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C25615j OLrzqt() {
            return this.KWHzl;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull RemoteViewsListAdapter remoteViewsListAdapter) {
            this();
            Intrinsics.checkNotNullParameter(remoteViewsListAdapter, "");
            this.KWHzl = remoteViewsListAdapter.EZpvd();
            this.OLrzqt = remoteViewsListAdapter.copydefault();
        }

        public final RemoteViewsListAdapter EZpvd() {
            return new RemoteViewsListAdapter(this, null);
        }
    }
}
