package o;

import com.okinc.business.invest_biz.data.bean.HomeActivityNewItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC27342jtQ {

    /* JADX INFO: renamed from: o.jtQ$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC27342jtQ {
        public final HomeActivityNewItem AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String EZpvd;
        public final Function0<Unit> KWHzl;
        public final long OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HomeActivityNewItem AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, HomeActivityNewItem homeActivityNewItem, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new StateListAnimator(j, str, str2, str3, str4, homeActivityNewItem, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.OLrzqt == stateListAnimator.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) stateListAnimator.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) stateListAnimator.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Long.hashCode(this.OLrzqt);
            int iHashCode2 = this.copydefault.hashCode();
            int iHashCode3 = this.djBIcL.hashCode();
            int iHashCode4 = this.AYXKKw.hashCode();
            int iHashCode5 = this.EZpvd.hashCode();
            HomeActivityNewItem homeActivityNewItem = this.AEQbTJ;
            int iHashCode6 = homeActivityNewItem == null ? 0 : homeActivityNewItem.hashCode();
            Function0<Unit> function0 = this.KWHzl;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (function0 != null ? function0.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ActivityItem(investmentId=" + this.OLrzqt + ", imageUrl=" + this.copydefault + ", title=" + this.djBIcL + ", subTitle=" + this.AYXKKw + ", btnText=" + this.EZpvd + ", newActivityData=" + this.AEQbTJ + ", onClick=" + this.KWHzl + ")";
        }

        public StateListAnimator(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, HomeActivityNewItem homeActivityNewItem, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.OLrzqt = j;
            this.copydefault = str;
            this.djBIcL = str2;
            this.AYXKKw = str3;
            this.EZpvd = str4;
            this.AEQbTJ = homeActivityNewItem;
            this.KWHzl = function0;
        }
    }
}
