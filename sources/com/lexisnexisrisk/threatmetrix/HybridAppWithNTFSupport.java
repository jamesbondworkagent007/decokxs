package com.lexisnexisrisk.threatmetrix;

import android.app.Activity;

/* JADX INFO: loaded from: classes3.dex */
public interface HybridAppWithNTFSupport extends HybridAppSupport {
    void clearCurrentKeyboardTarget(String str, String str2, Activity activity);

    void keyboardTargetTextChanged(String str, String str2, String str3, Activity activity);

    void registerKeyboardTarget(String str, boolean z, Activity activity);

    void setCurrentKeyboardTarget(String str, String str2, Activity activity);
}
