package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.HeterogeneousExpandableList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class HeterogeneousExpandableList {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final C5173Hn AEQbTJ;
    public final java.lang.Long EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;
    public final java.lang.Long djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.HeterogeneousExpandableList$StateListAnimator) A[MD:(o.HeterogeneousExpandableList$StateListAnimator):void (m)] call: o.HeterogeneousExpandableList.<init>(o.HeterogeneousExpandableList$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ HeterogeneousExpandableList(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    public HeterogeneousExpandableList(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator.EZpvd();
        this.AEQbTJ = stateListAnimator.copydefault();
        this.EZpvd = stateListAnimator.OLrzqt();
        this.KWHzl = stateListAnimator.AhwBna();
        this.djBIcL = stateListAnimator.valueOf();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.HeterogeneousExpandableList.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DescribeCollectionResponse(");
        sb.append("collectionArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("creationTimestamp=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("faceCount=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("faceModelVersion=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userCount=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        C5173Hn c5173Hn = this.AEQbTJ;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.lang.Long l = this.EZpvd;
        int iHashCode3 = l != null ? l.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.lang.Long l2 = this.djBIcL;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HeterogeneousExpandableList.class != obj.getClass()) {
            return false;
        }
        HeterogeneousExpandableList heterogeneousExpandableList = (HeterogeneousExpandableList) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) heterogeneousExpandableList.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, heterogeneousExpandableList.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, heterogeneousExpandableList.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) heterogeneousExpandableList.KWHzl) && Intrinsics.EZpvd(this.djBIcL, heterogeneousExpandableList.djBIcL);
    }

    public static /* synthetic */ HeterogeneousExpandableList copy$default(HeterogeneousExpandableList heterogeneousExpandableList, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DescribeCollectionResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HeterogeneousExpandableList.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HeterogeneousExpandableList.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(heterogeneousExpandableList);
        function1.invoke(stateListAnimator);
        return stateListAnimator.KWHzl();
    }

    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public java.lang.Long EZpvd;
        public C5173Hn KWHzl;
        public java.lang.Long OLrzqt;
        public java.lang.String copydefault;

        public final StateListAnimator AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C5173Hn c5173Hn) {
            this.KWHzl = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Long l) {
            this.OLrzqt = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Long l) {
            this.EZpvd = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long valueOf() {
            return this.EZpvd;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull HeterogeneousExpandableList heterogeneousExpandableList) {
            this();
            Intrinsics.checkNotNullParameter(heterogeneousExpandableList, "");
            this.AEQbTJ = heterogeneousExpandableList.copydefault();
            this.KWHzl = heterogeneousExpandableList.KWHzl();
            this.OLrzqt = heterogeneousExpandableList.AEQbTJ();
            this.copydefault = heterogeneousExpandableList.EZpvd();
            this.EZpvd = heterogeneousExpandableList.OLrzqt();
        }

        public final HeterogeneousExpandableList KWHzl() {
            return new HeterogeneousExpandableList(this, null);
        }
    }
}
