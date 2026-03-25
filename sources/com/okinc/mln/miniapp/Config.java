package com.okinc.mln.miniapp;

/* JADX INFO: loaded from: classes9.dex */
public final class Config {
    public static final int $stable = 0;
    private final boolean showMenuClose;
    private final boolean showMenuMore;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Config copy$default(Config config, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = config.showMenuClose;
        }
        if ((i & 2) != 0) {
            z2 = config.showMenuMore;
        }
        return config.copy(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.showMenuClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.showMenuMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Config copy(boolean z, boolean z2) {
        return new Config(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        return this.showMenuClose == config.showMenuClose && this.showMenuMore == config.showMenuMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowMenuClose() {
        return this.showMenuClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowMenuMore() {
        return this.showMenuMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.showMenuClose) * 31) + Boolean.hashCode(this.showMenuMore);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Config(showMenuClose=" + this.showMenuClose + ", showMenuMore=" + this.showMenuMore + ")";
    }

    public Config(boolean z, boolean z2) {
        this.showMenuClose = z;
        this.showMenuMore = z2;
    }
}
