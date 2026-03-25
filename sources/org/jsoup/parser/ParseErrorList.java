package org.jsoup.parser;

import java.util.ArrayList;
import o.C59947zsc;

/* JADX INFO: loaded from: classes20.dex */
public class ParseErrorList extends ArrayList<C59947zsc> {
    private static final int INITIAL_CAPACITY = 16;
    private final int maxSize;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMaxSize() {
        return this.maxSize;
    }

    public ParseErrorList(int i, int i2) {
        super(i);
        this.maxSize = i2;
    }

    public boolean canAddError() {
        return size() < this.maxSize;
    }

    public static ParseErrorList noTracking() {
        return new ParseErrorList(0, 0);
    }

    public static ParseErrorList tracking(int i) {
        return new ParseErrorList(16, i);
    }
}
