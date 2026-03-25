package io.ipfs.multibase;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
import java.util.TreeMap;
import o.C58171ywJ;
import o.C58172ywK;
import o.C58173ywL;
import o.C58174ywM;
import o.C58175ywN;

/* JADX INFO: loaded from: classes12.dex */
public class Multibase {

    public enum Base {
        Base1('1'),
        Base2('0'),
        Base8('7'),
        Base10('9'),
        Base16('f'),
        Base16Upper('F'),
        Base32('b'),
        Base32Upper('B'),
        Base32Pad('c'),
        Base32PadUpper('C'),
        Base32Hex('v'),
        Base32HexUpper('V'),
        Base32HexPad('t'),
        Base32HexPadUpper('T'),
        Base36('k'),
        Base36Upper('K'),
        Base58BTC('z'),
        Base58Flickr('Z'),
        Base64('m'),
        Base64Url('u'),
        Base64Pad('M'),
        Base64UrlPad('U');

        private static Map<Character, Base> lookup = new TreeMap();
        public char prefix;

        static {
            for (Base base : values()) {
                lookup.put(Character.valueOf(base.prefix), base);
            }
        }

        Base(char c) {
            this.prefix = c;
        }

        public static Base lookup(char c) {
            if (!lookup.containsKey(Character.valueOf(c))) {
                throw new IllegalStateException("Unknown Multibase type: " + c);
            }
            return lookup.get(Character.valueOf(c));
        }
    }

    /* JADX INFO: renamed from: io.ipfs.multibase.Multibase$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[Base.values().length];
            copydefault = iArr;
            try {
                iArr[Base.Base58BTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                copydefault[Base.Base16.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                copydefault[Base.Base16Upper.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                copydefault[Base.Base32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                copydefault[Base.Base32Pad.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                copydefault[Base.Base32PadUpper.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                copydefault[Base.Base32Upper.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                copydefault[Base.Base32Hex.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                copydefault[Base.Base32HexPad.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                copydefault[Base.Base32HexPadUpper.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                copydefault[Base.Base32HexUpper.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                copydefault[Base.Base36.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                copydefault[Base.Base36Upper.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                copydefault[Base.Base64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                copydefault[Base.Base64Url.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                copydefault[Base.Base64Pad.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                copydefault[Base.Base64UrlPad.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static String KWHzl(Base base, byte[] bArr) {
        switch (AnonymousClass5.copydefault[base.ordinal()]) {
            case 1:
                return base.prefix + C58171ywJ.OLrzqt(bArr);
            case 2:
                return base.prefix + C58172ywK.AEQbTJ(bArr);
            case 3:
                return base.prefix + C58172ywK.AEQbTJ(bArr).toUpperCase();
            case 4:
                return base.prefix + new String(new C58175ywN().gEmmrt(bArr)).toLowerCase().replaceAll(ContainerUtils.KEY_VALUE_DELIMITER, "");
            case 5:
                return base.prefix + new String(new C58175ywN().gEmmrt(bArr)).toLowerCase();
            case 6:
                return base.prefix + new String(new C58175ywN().gEmmrt(bArr));
            case 7:
                return base.prefix + new String(new C58175ywN().gEmmrt(bArr)).replaceAll(ContainerUtils.KEY_VALUE_DELIMITER, "");
            case 8:
                return base.prefix + new String(new C58175ywN(true).gEmmrt(bArr)).toLowerCase().replaceAll(ContainerUtils.KEY_VALUE_DELIMITER, "");
            case 9:
                return base.prefix + new String(new C58175ywN(true).gEmmrt(bArr)).toLowerCase();
            case 10:
                return base.prefix + new String(new C58175ywN(true).gEmmrt(bArr));
            case 11:
                return base.prefix + new String(new C58175ywN(true).gEmmrt(bArr)).replaceAll(ContainerUtils.KEY_VALUE_DELIMITER, "");
            case 12:
                return base.prefix + C58173ywL.AEQbTJ(bArr);
            case 13:
                return base.prefix + C58173ywL.AEQbTJ(bArr).toUpperCase();
            case 14:
                return base.prefix + C58174ywM.EZpvd(bArr).replaceAll(ContainerUtils.KEY_VALUE_DELIMITER, "");
            case 15:
                return base.prefix + C58174ywM.copydefault(bArr).replaceAll(ContainerUtils.KEY_VALUE_DELIMITER, "");
            case 16:
                return base.prefix + C58174ywM.EZpvd(bArr);
            case 17:
                return base.prefix + C58174ywM.EZpvd(bArr).replaceAll("\\+", "-").replaceAll("/", "_");
            default:
                throw new IllegalStateException("Unsupported base encoding: " + base.name());
        }
    }

    public static Base AEQbTJ(String str) {
        return Base.lookup(str.charAt(0));
    }

    public static byte[] EZpvd(String str) {
        Base baseAEQbTJ = AEQbTJ(str);
        String strSubstring = str.substring(1);
        switch (AnonymousClass5.copydefault[baseAEQbTJ.ordinal()]) {
            case 1:
                return C58171ywJ.copydefault(strSubstring);
            case 2:
                return C58172ywK.OLrzqt(strSubstring);
            case 3:
                return C58172ywK.OLrzqt(strSubstring.toLowerCase());
            case 4:
            case 5:
                return new C58175ywN().copydefault(strSubstring);
            case 6:
            case 7:
                return new C58175ywN().copydefault(strSubstring.toLowerCase());
            case 8:
            case 9:
                return new C58175ywN(true).copydefault(strSubstring);
            case 10:
            case 11:
                return new C58175ywN(true).copydefault(strSubstring.toLowerCase());
            case 12:
                return C58173ywL.AEQbTJ(strSubstring);
            case 13:
                return C58173ywL.AEQbTJ(strSubstring.toLowerCase());
            case 14:
            case 15:
            case 16:
            case 17:
                return C58174ywM.KWHzl(strSubstring);
            default:
                throw new IllegalStateException("Unsupported base encoding: " + baseAEQbTJ.name());
        }
    }
}
