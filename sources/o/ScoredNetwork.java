package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ScoredNetwork;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ScoredNetwork {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final SSLSessionCache AEQbTJ;
    public final java.lang.Integer EZpvd;
    public final java.lang.Integer KWHzl;
    public final java.lang.Integer OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ScoredNetwork$ActionBar) A[MD:(o.ScoredNetwork$ActionBar):void (m)] call: o.ScoredNetwork.<init>(o.ScoredNetwork$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ScoredNetwork(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SSLSessionCache AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.KWHzl;
    }

    public ScoredNetwork(ActionBar actionBar) {
        this.AEQbTJ = actionBar.EZpvd();
        this.KWHzl = actionBar.OLrzqt();
        this.EZpvd = actionBar.KWHzl();
        this.OLrzqt = actionBar.valueOf();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ScoredNetwork.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "ClassifierMetadata(*** Sensitive Data Redacted ***)";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        SSLSessionCache sSLSessionCache = this.AEQbTJ;
        int iHashCode = sSLSessionCache != null ? sSLSessionCache.hashCode() : 0;
        java.lang.Integer num = this.KWHzl;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = this.EZpvd;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        java.lang.Integer num3 = this.OLrzqt;
        return (((((iHashCode * 31) + iIntValue) * 31) + iIntValue2) * 31) + (num3 != null ? num3.intValue() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScoredNetwork.class != obj.getClass()) {
            return false;
        }
        ScoredNetwork scoredNetwork = (ScoredNetwork) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, scoredNetwork.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, scoredNetwork.KWHzl) && Intrinsics.EZpvd(this.EZpvd, scoredNetwork.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, scoredNetwork.OLrzqt);
    }

    public static /* synthetic */ ScoredNetwork copy$default(ScoredNetwork scoredNetwork, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.ClassifierMetadata$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ScoredNetwork.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ScoredNetwork.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(scoredNetwork);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    public static final class ActionBar {
        public java.lang.Integer AEQbTJ;
        public java.lang.Integer EZpvd;
        public java.lang.Integer OLrzqt;
        public SSLSessionCache copydefault;

        public final ActionBar AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SSLSessionCache EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Integer num) {
            this.EZpvd = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(SSLSessionCache sSLSessionCache) {
            this.copydefault = sSLSessionCache;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Integer num) {
            this.OLrzqt = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Integer num) {
            this.AEQbTJ = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer valueOf() {
            return this.EZpvd;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull ScoredNetwork scoredNetwork) {
            this();
            Intrinsics.checkNotNullParameter(scoredNetwork, "");
            this.copydefault = scoredNetwork.AEQbTJ();
            this.OLrzqt = scoredNetwork.OLrzqt();
            this.AEQbTJ = scoredNetwork.KWHzl();
            this.EZpvd = scoredNetwork.EZpvd();
        }

        public final ScoredNetwork copydefault() {
            return new ScoredNetwork(this, null);
        }
    }
}
