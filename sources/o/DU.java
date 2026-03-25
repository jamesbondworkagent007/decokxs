package o;

import aws.smithy.kotlin.runtime.net.url.UserInfo$Builder$parseDecoded$1;
import aws.smithy.kotlin.runtime.net.url.UserInfo$Builder$parseEncoded$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C5166Hg;
import o.DU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DU {
    public static final DU KWHzl;
    public static final Activity OLrzqt = new Activity(null);
    public final boolean AEQbTJ;
    public final C5166Hg EZpvd;
    public final boolean copydefault;
    public final C5166Hg djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Hg), (r2v0 o.Hg) A[MD:(o.Hg, o.Hg):void (m)] call: o.DU.<init>(o.Hg, o.Hg):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DU(C5166Hg c5166Hg, C5166Hg c5166Hg2, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5166Hg, c5166Hg2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5166Hg OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5166Hg copydefault() {
        return this.EZpvd;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DU.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final DU EZpvd(@NotNull Function1<? super Application, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Application application = new Application();
            function1.invoke(application);
            return application.copydefault();
        }

        public final DU EZpvd(@NotNull final java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return DU.OLrzqt.EZpvd(new Function1<Application, Unit>() { // from class: aws.smithy.kotlin.runtime.net.url.UserInfo$Companion$parseEncoded$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DU.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DU.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                    application.AEQbTJ(str);
                }
            });
        }
    }

    public DU(C5166Hg c5166Hg, C5166Hg c5166Hg2) {
        this.djBIcL = c5166Hg;
        this.EZpvd = c5166Hg2;
        if (!c5166Hg2.KWHzl() && !c5166Hg.copydefault()) {
            throw new java.lang.IllegalArgumentException("Cannot have a password without a user name".toString());
        }
        boolean z = c5166Hg.KWHzl() && c5166Hg2.KWHzl();
        this.copydefault = z;
        this.AEQbTJ = !z;
    }

    static {
        C5166Hg.TaskDescription taskDescription = C5166Hg.KWHzl;
        KWHzl = new DU(taskDescription.copydefault(), taskDescription.copydefault());
    }

    public final Application AEQbTJ() {
        return new Application(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DU.class != obj.getClass()) {
            return false;
        }
        DU du = (DU) obj;
        return Intrinsics.EZpvd(this.djBIcL, du.djBIcL) && Intrinsics.EZpvd(this.EZpvd, du.EZpvd);
    }

    public int hashCode() {
        return (this.djBIcL.hashCode() * 31) + this.EZpvd.hashCode();
    }

    public java.lang.String toString() {
        if (this.djBIcL.KWHzl()) {
            return "";
        }
        if (this.EZpvd.KWHzl()) {
            return this.djBIcL.AEQbTJ();
        }
        return this.djBIcL.AEQbTJ() + AbstractJsonLexerKt.COLON + this.EZpvd.AEQbTJ();
    }

    public static final class Application {
        public C5166Hg AEQbTJ;
        public C5166Hg EZpvd;

        public Application(DU du) {
            C5166Hg c5166HgCopydefault;
            C5166Hg c5166HgOLrzqt;
            this.AEQbTJ = (du == null || (c5166HgOLrzqt = du.OLrzqt()) == null) ? C5166Hg.KWHzl.copydefault() : c5166HgOLrzqt;
            this.EZpvd = (du == null || (c5166HgCopydefault = du.copydefault()) == null) ? C5166Hg.KWHzl.copydefault() : c5166HgCopydefault;
        }

        public Application() {
            this(null);
        }

        public final void copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            OLrzqt(str, new UserInfo$Builder$parseDecoded$1(C5167Hh.KWHzl.djBIcL()));
        }

        public final void AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            OLrzqt(str, new UserInfo$Builder$parseEncoded$1(C5167Hh.KWHzl.djBIcL()));
        }

        public final void OLrzqt(java.lang.String str, Function1<? super java.lang.String, C5166Hg> function1) {
            C5166Hg c5166HgCopydefault;
            if (str.length() == 0) {
                C5166Hg.TaskDescription taskDescription = C5166Hg.KWHzl;
                this.AEQbTJ = taskDescription.copydefault();
                this.EZpvd = taskDescription.copydefault();
                return;
            }
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{":"}, false, 2, 2, (java.lang.Object) null);
            this.AEQbTJ = function1.invoke(listSplit$default.get(0));
            int size = listSplit$default.size();
            if (size == 1) {
                c5166HgCopydefault = C5166Hg.KWHzl.copydefault();
            } else if (size == 2) {
                c5166HgCopydefault = function1.invoke(listSplit$default.get(1));
            } else {
                throw new java.lang.IllegalArgumentException("invalid user info string " + str);
            }
            this.EZpvd = c5166HgCopydefault;
        }

        public final DU copydefault() {
            return new DU(this.AEQbTJ, this.EZpvd, null);
        }

        public final void AEQbTJ(@NotNull DU du) {
            Intrinsics.checkNotNullParameter(du, "");
            this.AEQbTJ = du.OLrzqt();
            this.EZpvd = du.copydefault();
        }

        public final void AEQbTJ(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            this.AEQbTJ = application.AEQbTJ;
            this.EZpvd = application.EZpvd;
        }
    }
}
