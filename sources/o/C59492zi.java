package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C59492zi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C59492zi<T> {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final java.lang.String EZpvd;
    public final Function1<java.lang.String, T> KWHzl;
    public final T OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zi */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C59492zi copy$default(C59492zi c59492zi, Function1 function1, java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            function1 = c59492zi.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c59492zi.copydefault;
        }
        if ((i & 4) != 0) {
            str2 = c59492zi.EZpvd;
        }
        if ((i & 8) != 0) {
            obj = c59492zi.OLrzqt;
        }
        return c59492zi.copydefault(function1, str, str2, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, T> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<T> copydefault(@NotNull Function1<? super java.lang.String, ? extends T> function1, @NotNull java.lang.String str, @NotNull java.lang.String str2, T t) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C59492zi<>(function1, str, str2, t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59492zi)) {
            return false;
        }
        C59492zi c59492zi = (C59492zi) obj;
        return Intrinsics.EZpvd(this.KWHzl, c59492zi.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c59492zi.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c59492zi.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c59492zi.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        T t = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (t == null ? 0 : t.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EnvironmentSetting(parse=" + this.KWHzl + ", sysProp=" + this.copydefault + ", envVar=" + this.EZpvd + ", defaultValue=" + this.OLrzqt + ')';
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, ? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59492zi(@NotNull Function1<? super java.lang.String, ? extends T> function1, @NotNull java.lang.String str, @NotNull java.lang.String str2, T t) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = function1;
        this.copydefault = str;
        this.EZpvd = str2;
        this.OLrzqt = t;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 kotlin.jvm.functions.Function1)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r4v0 java.lang.Object))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.String, ? extends T>, java.lang.String, java.lang.String, T):void (m)] (LINE:25) call: o.zi.<init>(kotlin.jvm.functions.Function1, java.lang.String, java.lang.String, java.lang.Object):void type: THIS */
    public /* synthetic */ C59492zi(Function1 function1, java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, str, str2, (i & 8) != 0 ? null : obj);
    }

    /* JADX INFO: renamed from: o.zi$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zi.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final <T> Function2<java.lang.String, java.lang.String, C59492zi<T>> copydefault(@NotNull final Function1<? super java.lang.String, ? extends T> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return new Function2<java.lang.String, java.lang.String, C59492zi<T>>() { // from class: aws.smithy.kotlin.runtime.config.EnvironmentSetting$Companion$invoke$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, ? extends T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final C59492zi<T> invoke(@NotNull String str, @NotNull String str2) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    return new C59492zi<>(function1, str, str2, null, 8, null);
                }
            };
        }
    }

    public final C59492zi<T> EZpvd(T t) {
        return copy$default(this, null, null, null, t, 7, null);
    }
}
