package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mXz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC32329mXz {

    /* JADX INFO: renamed from: o.mXz$Activity */
    public static final class Activity implements InterfaceC32329mXz {
        public static final Activity EZpvd = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.mXz$ActionBar */
    public static final class ActionBar implements InterfaceC32329mXz {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String EZpvd;
        public final java.util.List<mXB> KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String djBIcL;
        public final java.lang.String gEmmrt;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<mXB> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<mXB> list, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            return new ActionBar(str, str2, list, str3, str4, str5, str6, str7, str8);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) actionBar.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) actionBar.AYXKKw) && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) actionBar.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) actionBar.valueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((this.djBIcL.hashCode() * 31) + this.AYXKKw.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.valueOf.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(totalBuyInRate=" + this.djBIcL + ", totalCurrentHoldingRate=" + this.AYXKKw + ", sniperList=" + this.KWHzl + ", holdAmt=" + this.copydefault + ", transferAmt=" + this.gEmmrt + ", sellAllAmt=" + this.OLrzqt + ", sellPartAmt=" + this.EZpvd + ", buyMoreAmt=" + this.AEQbTJ + ", total=" + this.valueOf + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.gEmmrt;
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<mXB> list, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            this.djBIcL = str;
            this.AYXKKw = str2;
            this.KWHzl = list;
            this.copydefault = str3;
            this.gEmmrt = str4;
            this.OLrzqt = str5;
            this.EZpvd = str6;
            this.AEQbTJ = str7;
            this.valueOf = str8;
        }
    }

    /* JADX INFO: renamed from: o.mXz$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Application implements InterfaceC32329mXz {
        public static final Application copydefault = new Application();

        private Application() {
        }
    }
}
