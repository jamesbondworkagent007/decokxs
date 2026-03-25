package o;

import o.OP;

/* JADX INFO: loaded from: classes2.dex */
public class OW implements OP.Activity {
    public final Activity AEQbTJ;
    public final long KWHzl;

    public interface Activity {
        java.io.File copydefault();
    }

    public OW(Activity activity, long j) {
        this.KWHzl = j;
        this.AEQbTJ = activity;
    }

    @Override // o.OP.Activity
    public OP EZpvd() {
        java.io.File fileCopydefault = this.AEQbTJ.copydefault();
        if (fileCopydefault == null) {
            return null;
        }
        if (fileCopydefault.isDirectory() || fileCopydefault.mkdirs()) {
            return OU.AEQbTJ(fileCopydefault, this.KWHzl);
        }
        return null;
    }
}
