package com.beloo.widget.chipslayoutmanager.util;

import com.beloo.widget.chipslayoutmanager.layouter.IStateFactory;

/* JADX INFO: loaded from: classes21.dex */
public class StateHelper {
    public static boolean isInfinite(IStateFactory iStateFactory) {
        return iStateFactory.getSizeMode() == 0 && iStateFactory.getEnd() == 0;
    }
}
