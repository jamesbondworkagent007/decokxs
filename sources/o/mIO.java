package o;

import com.okinc.cruilib.model.listitem.OKCRListItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class mIO extends OKCRListItem {
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.cruilib.model.listitem.OKCRListItem
    public java.lang.String getId() {
        return this.OLrzqt;
    }

    public mIO(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    public static final class Activity extends mIO {
        public final java.lang.String AEQbTJ;
        public final int KWHzl;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = activity.AEQbTJ;
            }
            if ((i3 & 2) != 0) {
                i = activity.KWHzl;
            }
            if ((i3 & 4) != 0) {
                i2 = activity.copydefault;
            }
            return activity.copydefault(str, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull java.lang.String str, @androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && this.KWHzl == activity.KWHzl && this.copydefault == activity.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.mIO, com.okinc.cruilib.model.listitem.OKCRListItem
        public java.lang.String getId() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "EmptyItem(id=" + this.AEQbTJ + ", emptyTextId=" + this.KWHzl + ", buttonTextId=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.String str, @androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.KWHzl = i;
            this.copydefault = i2;
        }
    }
}
