package com.immomo.mls.log;

import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes3.dex */
public enum ErrorType {
    LOG("", -1),
    ERROR("[LUA_ERROR] ", SupportMenu.CATEGORY_MASK),
    ERROR_REPEAT("", SupportMenu.CATEGORY_MASK),
    WARNING("[LUA_WARNING] ", InputDeviceCompat.SOURCE_ANY),
    WARNING_REPEAT("", InputDeviceCompat.SOURCE_ANY);

    private final int errorColor;
    private final String errorPrefix;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getErrorColor() {
        return this.errorColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getErrorPrefix() {
        return this.errorPrefix;
    }

    ErrorType(String str, int i) {
        this.errorPrefix = str;
        this.errorColor = i;
    }
}
