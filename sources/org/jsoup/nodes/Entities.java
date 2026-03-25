package org.jsoup.nodes;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.regex.Pattern;
import org.jsoup.nodes.Document;

/* JADX INFO: loaded from: classes20.dex */
public class Entities {
    public static final Map<String, Character> EZpvd;
    public static final Map<String, Character> KWHzl;
    public static final Map<Character, String> OLrzqt;
    public static final Map<Character, String> copydefault;
    public static final Object[][] gEmmrt;
    public static final Pattern djBIcL = Pattern.compile("&(#(x|X)?([0-9a-fA-F]+)|[a-zA-Z]+\\d*);?");
    public static final Pattern AEQbTJ = Pattern.compile("&(#(x|X)?([0-9a-fA-F]+)|[a-zA-Z]+\\d*);");
    public static final Map<Character, String> valueOf = new HashMap();

    public enum EscapeMode {
        xhtml(Entities.valueOf),
        base(Entities.OLrzqt),
        extended(Entities.copydefault);

        private Map<Character, String> map;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Map<Character, String> getMap() {
            return this.map;
        }

        EscapeMode(Map map) {
            this.map = map;
        }
    }

    static {
        Object[][] objArr = {new Object[]{"quot", 34}, new Object[]{"amp", 38}, new Object[]{"apos", 39}, new Object[]{"lt", 60}, new Object[]{"gt", 62}};
        gEmmrt = objArr;
        Map<String, Character> mapOLrzqt = OLrzqt("entities-base.properties");
        KWHzl = mapOLrzqt;
        OLrzqt = copydefault(mapOLrzqt);
        Map<String, Character> mapOLrzqt2 = OLrzqt("entities-full.properties");
        EZpvd = mapOLrzqt2;
        copydefault = copydefault(mapOLrzqt2);
        for (int i = 0; i < 5; i++) {
            Object[] objArr2 = objArr[i];
            valueOf.put(Character.valueOf((char) ((Integer) objArr2[1]).intValue()), (String) objArr2[0]);
        }
    }

    private Entities() {
    }

    public static boolean EZpvd(String str) {
        return EZpvd.containsKey(str);
    }

    public static boolean AEQbTJ(String str) {
        return KWHzl.containsKey(str);
    }

    public static Character KWHzl(String str) {
        return EZpvd.get(str);
    }

    public static String copydefault(String str, Document.Activity activity) {
        return EZpvd(str, activity.EZpvd(), activity.copydefault());
    }

    public static String EZpvd(String str, CharsetEncoder charsetEncoder, EscapeMode escapeMode) {
        StringBuilder sb = new StringBuilder(str.length() * 2);
        Map<Character, String> map = escapeMode.getMap();
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 65536) {
                char c = (char) iCodePointAt;
                if (map.containsKey(Character.valueOf(c))) {
                    sb.append('&');
                    sb.append(map.get(Character.valueOf(c)));
                    sb.append(';');
                } else if (charsetEncoder.canEncode(c)) {
                    sb.append(c);
                } else {
                    sb.append("&#x");
                    sb.append(Integer.toHexString(iCodePointAt));
                    sb.append(';');
                }
            } else {
                String str2 = new String(Character.toChars(iCodePointAt));
                if (charsetEncoder.canEncode(str2)) {
                    sb.append(str2);
                } else {
                    sb.append("&#x");
                    sb.append(Integer.toHexString(iCodePointAt));
                    sb.append(';');
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return sb.toString();
    }

    public static Map<String, Character> OLrzqt(String str) {
        Properties properties = new Properties();
        HashMap map = new HashMap();
        try {
            InputStream resourceAsStream = Entities.class.getResourceAsStream(str);
            properties.load(resourceAsStream);
            resourceAsStream.close();
            for (Map.Entry entry : properties.entrySet()) {
                map.put((String) entry.getKey(), Character.valueOf((char) Integer.parseInt((String) entry.getValue(), 16)));
            }
            return map;
        } catch (IOException e) {
            throw new MissingResourceException("Error loading entities resource: " + e.getMessage(), "Entities", str);
        }
    }

    public static Map<Character, String> copydefault(Map<String, Character> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Character> entry : map.entrySet()) {
            Character value = entry.getValue();
            String key = entry.getKey();
            if (map2.containsKey(value)) {
                if (key.toLowerCase().equals(key)) {
                    map2.put(value, key);
                }
            } else {
                map2.put(value, key);
            }
        }
        return map2;
    }
}
