package o;

import com.okinc.im.usecase.group.SaveGroupProfileUseCase$execute$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35784oDo {
    public final oDA EZpvd;
    public final sIR KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C35784oDo(@NotNull sIR sir, @NotNull oDA oda, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(oda, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = sir;
        this.EZpvd = oda;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.oDo$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final android.net.Uri KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.copydefault;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = actionBar.EZpvd;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                str4 = actionBar.OLrzqt;
            }
            java.lang.String str7 = str4;
            if ((i & 16) != 0) {
                uri = actionBar.KWHzl;
            }
            return actionBar.OLrzqt(str, str5, str6, str7, uri);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.net.Uri OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str, str2, str3, str4, uri);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            java.lang.String str = this.copydefault;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.EZpvd;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.OLrzqt;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            android.net.Uri uri = this.KWHzl;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (uri != null ? uri.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Params(groupId=" + this.AEQbTJ + ", groupName=" + this.copydefault + ", bizGroupName=" + this.EZpvd + ", description=" + this.OLrzqt + ", avatarUri=" + this.KWHzl + ")";
        }

        public ActionBar(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.copydefault = str2;
            this.EZpvd = str3;
            this.OLrzqt = str4;
            this.KWHzl = uri;
        }
    }

    public final java.lang.Object KWHzl(@NotNull ActionBar actionBar, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.copydefault, new SaveGroupProfileUseCase$execute$2(this, actionBar, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
