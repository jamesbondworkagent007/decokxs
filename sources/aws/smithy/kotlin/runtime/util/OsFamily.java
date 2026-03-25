package aws.smithy.kotlin.runtime.util;

import kotlin.NoWhenBranchMatchedException;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class OsFamily {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OsFamily[] $VALUES;
    public static final OsFamily Linux = new OsFamily("Linux", 0);
    public static final OsFamily MacOs = new OsFamily("MacOs", 1);
    public static final OsFamily Windows = new OsFamily("Windows", 2);
    public static final OsFamily Android = new OsFamily("Android", 3);
    public static final OsFamily Ios = new OsFamily("Ios", 4);
    public static final OsFamily Unknown = new OsFamily("Unknown", 5);

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OsFamily.values().length];
            try {
                iArr[OsFamily.Linux.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OsFamily.MacOs.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OsFamily.Windows.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OsFamily.Android.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OsFamily.Ios.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OsFamily.Unknown.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OsFamily[] $values() {
        return new OsFamily[]{Linux, MacOs, Windows, Android, Ios, Unknown};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OsFamily> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static OsFamily valueOf(String str) {
        return (OsFamily) Enum.valueOf(OsFamily.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static OsFamily[] values() {
        return (OsFamily[]) $VALUES.clone();
    }

    private OsFamily(String str, int i) {
    }

    static {
        OsFamily[] osFamilyArr$values = $values();
        $VALUES = osFamilyArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(osFamilyArr$values);
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (ActionBar.copydefault[ordinal()]) {
            case 1:
                return "linux";
            case 2:
                return "macos";
            case 3:
                return "windows";
            case 4:
                return "android";
            case 5:
                return "ios";
            case 6:
                return "unknown";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
