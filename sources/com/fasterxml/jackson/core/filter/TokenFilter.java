package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class TokenFilter {
    public static final TokenFilter KWHzl = new TokenFilter();

    public enum Inclusion {
        ONLY_INCLUDE_ALL,
        INCLUDE_ALL_AND_PATH,
        INCLUDE_NON_NULL
    }

    public TokenFilter AEQbTJ(int i) {
        return this;
    }

    public TokenFilter AEQbTJ(String str) {
        return this;
    }

    public boolean AEQbTJ() {
        return true;
    }

    public boolean AEQbTJ(boolean z) {
        return false;
    }

    public TokenFilter EZpvd() {
        return this;
    }

    public TokenFilter KWHzl() {
        return this;
    }

    public TokenFilter OLrzqt(int i) {
        return this;
    }

    public void OLrzqt() {
    }

    public void copydefault() {
    }

    public boolean copydefault(boolean z) {
        return false;
    }

    public boolean EZpvd(JsonParser jsonParser) throws IOException {
        return AEQbTJ();
    }

    public String toString() {
        return this == KWHzl ? "TokenFilter.INCLUDE_ALL" : super.toString();
    }
}
