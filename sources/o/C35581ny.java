package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C35581ny;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ny, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C35581ny {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public final java.util.List<C36201oT> AEQbTJ;
    public final java.util.List<C35850oG> KWHzl;
    public final java.lang.String OLrzqt;
    public final java.util.List<C35422nv> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ny$ActionBar) A[MD:(o.ny$ActionBar):void (m)] call: o.ny.<init>(o.ny$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C35581ny(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C36201oT> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C35850oG> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C35422nv> copydefault() {
        return this.copydefault;
    }

    public C35581ny(ActionBar actionBar) {
        this.copydefault = actionBar.KWHzl();
        this.KWHzl = actionBar.copydefault();
        this.OLrzqt = actionBar.EZpvd();
        this.AEQbTJ = actionBar.AYXKKw();
    }

    /* JADX INFO: renamed from: o.ny$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ny.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DocumentGroup(");
        sb.append("detectedSignatures=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("splitDocuments=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("type=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("undetectedSignatures=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<C35422nv> list = this.copydefault;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.util.List<C35850oG> list2 = this.KWHzl;
        int iHashCode2 = list2 != null ? list2.hashCode() : 0;
        java.lang.String str = this.OLrzqt;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        java.util.List<C36201oT> list3 = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C35581ny.class != obj.getClass()) {
            return false;
        }
        C35581ny c35581ny = (C35581ny) obj;
        return Intrinsics.EZpvd(this.copydefault, c35581ny.copydefault) && Intrinsics.EZpvd(this.KWHzl, c35581ny.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c35581ny.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c35581ny.AEQbTJ);
    }

    public static /* synthetic */ C35581ny copy$default(C35581ny c35581ny, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.DocumentGroup$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C35581ny.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C35581ny.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c35581ny);
        function1.invoke(actionBar);
        return actionBar.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.ny$ActionBar */
    public static final class ActionBar {
        public java.util.List<C36201oT> AEQbTJ;
        public java.util.List<C35850oG> EZpvd;
        public java.util.List<C35422nv> KWHzl;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C36201oT> AYXKKw() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<C35850oG> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C35422nv> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<C35422nv> list) {
            this.KWHzl = list;
        }

        public final ActionBar OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C35850oG> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<C36201oT> list) {
            this.AEQbTJ = list;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C35581ny c35581ny) {
            this();
            Intrinsics.checkNotNullParameter(c35581ny, "");
            this.KWHzl = c35581ny.copydefault();
            this.EZpvd = c35581ny.KWHzl();
            this.copydefault = c35581ny.AEQbTJ();
            this.AEQbTJ = c35581ny.EZpvd();
        }

        public final C35581ny AEQbTJ() {
            return new C35581ny(this, null);
        }
    }
}
