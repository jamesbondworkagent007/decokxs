package com.tencent.matrix;

import android.app.Application;
import o.C58001ysz;
import o.C58014ytL;
import o.InterfaceC58036yth;

/* JADX INFO: loaded from: classes12.dex */
@Deprecated
public enum AppActiveMatrixDelegate {
    INSTANCE;

    private static final String TAG = "Matrix.AppActiveDelegate";

    public void init(Application application) {
    }

    public String getCurrentFragmentName() {
        return C58001ysz.AEQbTJ.DbNXlk();
    }

    public void setCurrentFragmentName(String str) {
        C58001ysz.AEQbTJ.copydefault(str);
    }

    public String getVisibleScene() {
        return C58001ysz.AEQbTJ.AkhnZx();
    }

    @Deprecated
    public boolean isAppForeground() {
        return C58001ysz.AEQbTJ.ejfBZ();
    }

    @Deprecated
    public void addListener(InterfaceC58036yth interfaceC58036yth) {
        C58001ysz.AEQbTJ.KWHzl(interfaceC58036yth);
    }

    @Deprecated
    public void removeListener(InterfaceC58036yth interfaceC58036yth) {
        C58001ysz.AEQbTJ.EZpvd(interfaceC58036yth);
    }

    @Deprecated
    public static String getTopActivityName() {
        return C58014ytL.copydefault();
    }
}
