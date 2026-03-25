package dagger.hilt.android.internal.modules;

import android.app.Application;
import android.content.Context;
import o.C58124yvP;

/* JADX INFO: loaded from: classes12.dex */
public final class ApplicationContextModule {
    public final Context copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Context AEQbTJ() {
        return this.copydefault;
    }

    public ApplicationContextModule(Context context) {
        this.copydefault = context;
    }

    public Application copydefault() {
        return C58124yvP.EZpvd(this.copydefault);
    }
}
