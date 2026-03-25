package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AccessibilityRequestPreparer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class AccessibilityRequestPreparer {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public final AlphaAnimation OLrzqt;
    public final AnimationSet copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AccessibilityRequestPreparer$StateListAnimator) A[MD:(o.AccessibilityRequestPreparer$StateListAnimator):void (m)] call: o.AccessibilityRequestPreparer.<init>(o.AccessibilityRequestPreparer$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AccessibilityRequestPreparer(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlphaAnimation AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnimationSet EZpvd() {
        return this.copydefault;
    }

    public AccessibilityRequestPreparer(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator.copydefault();
        this.OLrzqt = stateListAnimator.KWHzl();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AccessibilityRequestPreparer.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetLexiconResponse(");
        sb.append("lexicon=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("lexiconAttributes=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AnimationSet animationSet = this.copydefault;
        int iHashCode = animationSet != null ? animationSet.hashCode() : 0;
        AlphaAnimation alphaAnimation = this.OLrzqt;
        return (iHashCode * 31) + (alphaAnimation != null ? alphaAnimation.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AccessibilityRequestPreparer.class != obj.getClass()) {
            return false;
        }
        AccessibilityRequestPreparer accessibilityRequestPreparer = (AccessibilityRequestPreparer) obj;
        return Intrinsics.EZpvd(this.copydefault, accessibilityRequestPreparer.copydefault) && Intrinsics.EZpvd(this.OLrzqt, accessibilityRequestPreparer.OLrzqt);
    }

    public static /* synthetic */ AccessibilityRequestPreparer copy$default(AccessibilityRequestPreparer accessibilityRequestPreparer, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.polly.model.GetLexiconResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AccessibilityRequestPreparer.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AccessibilityRequestPreparer.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(accessibilityRequestPreparer);
        function1.invoke(stateListAnimator);
        return stateListAnimator.AEQbTJ();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        public AnimationSet AEQbTJ;
        public AlphaAnimation EZpvd;

        public final StateListAnimator EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AlphaAnimation KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AnimationSet animationSet) {
            this.AEQbTJ = animationSet;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(AlphaAnimation alphaAnimation) {
            this.EZpvd = alphaAnimation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AnimationSet copydefault() {
            return this.AEQbTJ;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull AccessibilityRequestPreparer accessibilityRequestPreparer) {
            this();
            Intrinsics.checkNotNullParameter(accessibilityRequestPreparer, "");
            this.AEQbTJ = accessibilityRequestPreparer.EZpvd();
            this.EZpvd = accessibilityRequestPreparer.AEQbTJ();
        }

        public final AccessibilityRequestPreparer AEQbTJ() {
            return new AccessibilityRequestPreparer(this, null);
        }
    }
}
