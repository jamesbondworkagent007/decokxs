package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RemoteViewsAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class RemoteViewsAdapter {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final C25615j AEQbTJ;
    public final RemoteViews copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RemoteViewsAdapter$ActionBar) A[MD:(o.RemoteViewsAdapter$ActionBar):void (m)] call: o.RemoteViewsAdapter.<init>(o.RemoteViewsAdapter$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RemoteViewsAdapter(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25615j AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RemoteViews copydefault() {
        return this.copydefault;
    }

    public RemoteViewsAdapter(ActionBar actionBar) {
        this.copydefault = actionBar.copydefault();
        this.AEQbTJ = actionBar.OLrzqt();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RemoteViewsAdapter.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectTextRequest(");
        sb.append("filters=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("image=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        RemoteViews remoteViews = this.copydefault;
        int iHashCode = remoteViews != null ? remoteViews.hashCode() : 0;
        C25615j c25615j = this.AEQbTJ;
        return (iHashCode * 31) + (c25615j != null ? c25615j.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RemoteViewsAdapter.class != obj.getClass()) {
            return false;
        }
        RemoteViewsAdapter remoteViewsAdapter = (RemoteViewsAdapter) obj;
        return Intrinsics.EZpvd(this.copydefault, remoteViewsAdapter.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, remoteViewsAdapter.AEQbTJ);
    }

    public static /* synthetic */ RemoteViewsAdapter copy$default(RemoteViewsAdapter remoteViewsAdapter, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DetectTextRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RemoteViewsAdapter.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RemoteViewsAdapter.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(remoteViewsAdapter);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    public static final class ActionBar {
        public RemoteViews KWHzl;
        public C25615j OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C25615j c25615j) {
            this.OLrzqt = c25615j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C25615j OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RemoteViews copydefault() {
            return this.KWHzl;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull RemoteViewsAdapter remoteViewsAdapter) {
            this();
            Intrinsics.checkNotNullParameter(remoteViewsAdapter, "");
            this.KWHzl = remoteViewsAdapter.copydefault();
            this.OLrzqt = remoteViewsAdapter.AEQbTJ();
        }

        public final RemoteViewsAdapter EZpvd() {
            return new RemoteViewsAdapter(this, null);
        }
    }
}
