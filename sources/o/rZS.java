package o;

/* JADX INFO: loaded from: classes16.dex */
public final class rZS {
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ rZS copy$default(rZS rzs, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = rzs.copydefault;
        }
        return rzs.AEQbTJ(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final rZS AEQbTJ(@androidx.annotation.StringRes int i) {
        return new rZS(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rZS) && this.copydefault == ((rZS) obj).copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Integer.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NotificationSettingsChannelsPrompt(title=" + this.copydefault + ")";
    }

    public rZS(@androidx.annotation.StringRes int i) {
        this.copydefault = i;
    }
}
