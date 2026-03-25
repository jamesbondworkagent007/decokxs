package com.ibm.icu.impl;

import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.util.EnumMap;
import java.util.Map;
import o.C7043acQ;
import o.C7150aeR;
import okhttp3.HttpUrl;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public class StaticUnicodeSets {
    public static final Map<Key, UnicodeSet> KWHzl;

    public enum Key {
        EMPTY,
        DEFAULT_IGNORABLES,
        STRICT_IGNORABLES,
        COMMA,
        PERIOD,
        STRICT_COMMA,
        STRICT_PERIOD,
        APOSTROPHE_SIGN,
        OTHER_GROUPING_SEPARATORS,
        ALL_SEPARATORS,
        STRICT_ALL_SEPARATORS,
        MINUS_SIGN,
        PLUS_SIGN,
        PERCENT_SIGN,
        PERMILLE_SIGN,
        INFINITY_SIGN,
        DOLLAR_SIGN,
        POUND_SIGN,
        RUPEE_SIGN,
        YEN_SIGN,
        WON_SIGN,
        DIGITS,
        DIGITS_OR_ALL_SEPARATORS,
        DIGITS_OR_STRICT_ALL_SEPARATORS
    }

    static {
        EnumMap enumMap = new EnumMap(Key.class);
        KWHzl = enumMap;
        enumMap.put(Key.EMPTY, new UnicodeSet(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI).AYXKKw());
        enumMap.put(Key.DEFAULT_IGNORABLES, new UnicodeSet("[[:Zs:][\\u0009][:Bidi_Control:][:Variation_Selector:]]").AYXKKw());
        enumMap.put(Key.STRICT_IGNORABLES, new UnicodeSet("[[:Bidi_Control:]]").AYXKKw());
        ((ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", ULocale.ROOT)).copydefault("parse", new Application());
        UnicodeSet unicodeSet = new UnicodeSet("[٬‘\\u0020\\u00A0\\u2000-\\u200A\\u202F\\u205F\\u3000]");
        unicodeSet.OLrzqt((UnicodeSet) enumMap.get(Key.APOSTROPHE_SIGN));
        Key key = Key.OTHER_GROUPING_SEPARATORS;
        enumMap.put(key, unicodeSet.AYXKKw());
        Key key2 = Key.ALL_SEPARATORS;
        enumMap.put(key2, EZpvd(Key.COMMA, Key.PERIOD, key));
        Key key3 = Key.STRICT_ALL_SEPARATORS;
        enumMap.put(key3, EZpvd(Key.STRICT_COMMA, Key.STRICT_PERIOD, key));
        enumMap.put(Key.INFINITY_SIGN, new UnicodeSet("[∞]").AYXKKw());
        Key key4 = Key.DIGITS;
        enumMap.put(key4, new UnicodeSet("[:digit:]").AYXKKw());
        enumMap.put(Key.DIGITS_OR_ALL_SEPARATORS, EZpvd(key4, key2));
        enumMap.put(Key.DIGITS_OR_STRICT_ALL_SEPARATORS, EZpvd(key4, key3));
    }

    public static UnicodeSet EZpvd(Key key) {
        UnicodeSet unicodeSet = KWHzl.get(key);
        return unicodeSet == null ? UnicodeSet.OLrzqt : unicodeSet;
    }

    public static Key KWHzl(String str, Key key) {
        if (C7150aeR.EZpvd(EZpvd(key), str)) {
            return key;
        }
        return null;
    }

    public static Key AEQbTJ(String str, Key key, Key key2) {
        return C7150aeR.EZpvd(EZpvd(key), str) ? key : KWHzl(str, key2);
    }

    public static Key KWHzl(String str) {
        Key key = Key.DOLLAR_SIGN;
        if (EZpvd(key).OLrzqt((CharSequence) str)) {
            return key;
        }
        Key key2 = Key.POUND_SIGN;
        if (EZpvd(key2).OLrzqt((CharSequence) str)) {
            return key2;
        }
        Key key3 = Key.RUPEE_SIGN;
        if (EZpvd(key3).OLrzqt((CharSequence) str)) {
            return key3;
        }
        Key key4 = Key.YEN_SIGN;
        if (EZpvd(key4).OLrzqt((CharSequence) str)) {
            return key4;
        }
        Key key5 = Key.WON_SIGN;
        if (EZpvd(key5).OLrzqt((CharSequence) str)) {
            return key5;
        }
        return null;
    }

    public static UnicodeSet EZpvd(Key key, Key key2) {
        return new UnicodeSet().OLrzqt(EZpvd(key)).OLrzqt(EZpvd(key2)).AYXKKw();
    }

    public static UnicodeSet EZpvd(Key key, Key key2, Key key3) {
        return new UnicodeSet().OLrzqt(EZpvd(key)).OLrzqt(EZpvd(key2)).OLrzqt(EZpvd(key3)).AYXKKw();
    }

    public static void KWHzl(Key key, String str) {
        KWHzl.put(key, new UnicodeSet(str).AYXKKw());
    }

    public static class Application extends C7043acQ.ActionBar {
        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                if (!application.copydefault("date")) {
                    C7043acQ.StateListAnimator stateListAnimatorValueOf2 = taskDescription.valueOf();
                    for (int i2 = 0; stateListAnimatorValueOf2.AEQbTJ(i2, application, taskDescription); i2++) {
                        boolean zCopydefault = application.copydefault("lenient");
                        C7043acQ.Activity activityOLrzqt = taskDescription.OLrzqt();
                        for (int i3 = 0; i3 < activityOLrzqt.KWHzl(); i3++) {
                            activityOLrzqt.copydefault(i3, taskDescription);
                            String string = taskDescription.toString();
                            if (string.indexOf(46) != -1) {
                                StaticUnicodeSets.KWHzl(zCopydefault ? Key.PERIOD : Key.STRICT_PERIOD, string);
                            } else if (string.indexOf(44) != -1) {
                                StaticUnicodeSets.KWHzl(zCopydefault ? Key.COMMA : Key.STRICT_COMMA, string);
                            } else if (string.indexOf(43) != -1) {
                                StaticUnicodeSets.KWHzl(Key.PLUS_SIGN, string);
                            } else if (string.indexOf(45) != -1) {
                                StaticUnicodeSets.KWHzl(Key.MINUS_SIGN, string);
                            } else if (string.indexOf(36) != -1) {
                                StaticUnicodeSets.KWHzl(Key.DOLLAR_SIGN, string);
                            } else if (string.indexOf(CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384) != -1) {
                                StaticUnicodeSets.KWHzl(Key.POUND_SIGN, string);
                            } else if (string.indexOf(8377) != -1) {
                                StaticUnicodeSets.KWHzl(Key.RUPEE_SIGN, string);
                            } else if (string.indexOf(CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384) != -1) {
                                StaticUnicodeSets.KWHzl(Key.YEN_SIGN, string);
                            } else if (string.indexOf(8361) != -1) {
                                StaticUnicodeSets.KWHzl(Key.WON_SIGN, string);
                            } else if (string.indexOf(37) != -1) {
                                StaticUnicodeSets.KWHzl(Key.PERCENT_SIGN, string);
                            } else if (string.indexOf(8240) != -1) {
                                StaticUnicodeSets.KWHzl(Key.PERMILLE_SIGN, string);
                            } else {
                                if (string.indexOf(8217) == -1) {
                                    throw new AssertionError("Unknown class of parse lenients: " + string);
                                }
                                StaticUnicodeSets.KWHzl(Key.APOSTROPHE_SIGN, string);
                            }
                        }
                    }
                }
            }
        }
    }
}
