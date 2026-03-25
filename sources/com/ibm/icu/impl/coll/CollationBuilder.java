package com.ibm.icu.impl.coll;

import com.ibm.icu.impl.coll.CollationRuleParser;
import com.ibm.icu.text.UnicodeSet;

/* JADX INFO: loaded from: classes22.dex */
public final class CollationBuilder extends CollationRuleParser.Activity {
    public static final UnicodeSet AEQbTJ;

    static {
        UnicodeSet unicodeSet = new UnicodeSet("[:NFD_QC=N:]");
        AEQbTJ = unicodeSet;
        unicodeSet.gEmmrt(44032, 55203);
    }
}
