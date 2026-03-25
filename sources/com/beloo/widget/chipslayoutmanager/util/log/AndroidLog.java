package com.beloo.widget.chipslayoutmanager.util.log;

/* JADX INFO: loaded from: classes21.dex */
class AndroidLog implements LogWrapper {
    @Override // com.beloo.widget.chipslayoutmanager.util.log.LogWrapper
    public int d(String str, String str2) {
        return android.util.Log.d(str, str2);
    }

    @Override // com.beloo.widget.chipslayoutmanager.util.log.LogWrapper
    public int v(String str, String str2) {
        return android.util.Log.v(str, str2);
    }

    @Override // com.beloo.widget.chipslayoutmanager.util.log.LogWrapper
    public int w(String str, String str2) {
        return android.util.Log.w(str, str2);
    }

    @Override // com.beloo.widget.chipslayoutmanager.util.log.LogWrapper
    public int i(String str, String str2) {
        return android.util.Log.i(str, str2);
    }

    @Override // com.beloo.widget.chipslayoutmanager.util.log.LogWrapper
    public int e(String str, String str2) {
        return android.util.Log.e(str, str2);
    }
}
