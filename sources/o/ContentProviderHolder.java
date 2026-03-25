package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ContentProviderHolder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ContentProviderHolder {
    public static final Activity EZpvd = new Activity(null);
    public final java.lang.Integer KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ContentProviderHolder$StateListAnimator) A[MD:(o.ContentProviderHolder$StateListAnimator):void (m)] call: o.ContentProviderHolder.<init>(o.ContentProviderHolder$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ContentProviderHolder(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    public ContentProviderHolder(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.OLrzqt();
        this.OLrzqt = stateListAnimator.EZpvd();
        this.copydefault = stateListAnimator.KWHzl();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ContentProviderHolder.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListGroupsRequest(");
        sb.append("limit=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("nextToken=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userPoolId=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Integer num = this.KWHzl;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.copydefault;
        return (((iIntValue * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ContentProviderHolder.class != obj.getClass()) {
            return false;
        }
        ContentProviderHolder contentProviderHolder = (ContentProviderHolder) obj;
        return Intrinsics.EZpvd(this.KWHzl, contentProviderHolder.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) contentProviderHolder.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) contentProviderHolder.copydefault);
    }

    public static /* synthetic */ ContentProviderHolder copy$default(ContentProviderHolder contentProviderHolder, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.ListGroupsRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ContentProviderHolder.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentProviderHolder.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(contentProviderHolder);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.Integer KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer OLrzqt() {
            return this.KWHzl;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull ContentProviderHolder contentProviderHolder) {
            this();
            Intrinsics.checkNotNullParameter(contentProviderHolder, "");
            this.KWHzl = contentProviderHolder.AEQbTJ();
            this.AEQbTJ = contentProviderHolder.KWHzl();
            this.EZpvd = contentProviderHolder.EZpvd();
        }

        public final ContentProviderHolder copydefault() {
            return new ContentProviderHolder(this, null);
        }
    }
}
