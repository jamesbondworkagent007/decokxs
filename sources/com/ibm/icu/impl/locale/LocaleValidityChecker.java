package com.ibm.icu.impl.locale;

import com.ibm.icu.impl.ValidIdentifiers;
import com.ibm.icu.text.DateFormat;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes22.dex */
public class LocaleValidityChecker {
    public static Pattern copydefault = Pattern.compile("[-_]");
    public static final Pattern KWHzl = Pattern.compile("[a-zA-Z0-9]{2,8}(-[a-zA-Z0-9]{2,8})*");
    public static final Set<String> AEQbTJ = new HashSet(Arrays.asList("space", "punct", "symbol", "currency", "digit", "others", DateFormat.SPECIFIC_TZ));
    public static final Set<String> OLrzqt = new HashSet(Arrays.asList("zinh", "zyyy"));
    public static final Set<ValidIdentifiers.Datasubtype> EZpvd = EnumSet.of(ValidIdentifiers.Datasubtype.regular);

    public enum SpecialCase {
        normal,
        anything,
        reorder,
        codepoints,
        subdivision,
        rgKey;

        public static SpecialCase get(String str) {
            return str.equals("kr") ? reorder : str.equals("vt") ? codepoints : str.equals("sd") ? subdivision : str.equals("rg") ? rgKey : str.equals("x0") ? anything : normal;
        }
    }
}
