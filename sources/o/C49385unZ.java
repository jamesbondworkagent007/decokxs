package o;

import com.google.gson.reflect.TypeToken;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49385unZ implements RxBus.Application {
    public static final ActionBar Companion = new ActionBar(null);
    public final java.lang.String EZpvd;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C49385unZ copy$default(C49385unZ c49385unZ, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c49385unZ.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c49385unZ.EZpvd;
        }
        return c49385unZ.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C49385unZ copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C49385unZ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49385unZ)) {
            return false;
        }
        C49385unZ c49385unZ = (C49385unZ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c49385unZ.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c49385unZ.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        java.lang.String str = this.EZpvd;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OKMarketBridgeEvent(eventName=" + this.copydefault + ", data=" + this.EZpvd + ")";
    }

    public C49385unZ(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.EZpvd = str2;
    }

    public final void AEQbTJ() {
        RxBus.AEQbTJ(this);
    }

    /* JADX INFO: renamed from: o.unZ$ActionBar */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar {

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: o.unZ$ActionBar$Activity */
        public static final class Activity<T> extends TypeToken<T> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.unZ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
