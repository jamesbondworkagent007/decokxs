package com.osbcp.cssparser;

/* JADX INFO: loaded from: classes12.dex */
public enum State {
    INSIDE_SELECTOR,
    INSIDE_COMMENT,
    INSIDE_PROPERTY_NAME,
    INSIDE_VALUE,
    INSIDE_VALUE_ROUND_BRACKET;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Replace access to removed values field (ENUM$VALUES) with 'values()' method */
    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static State[] valuesCustom() {
        State[] stateArrValuesCustom = values();
        int length = stateArrValuesCustom.length;
        State[] stateArr = new State[length];
        System.arraycopy(stateArrValuesCustom, 0, stateArr, 0, length);
        return stateArr;
    }
}
