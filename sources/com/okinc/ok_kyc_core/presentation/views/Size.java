package com.okinc.ok_kyc_core.presentation.views;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class Size {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Size[] $VALUES;
    public static final Activity Companion;
    private final String size;
    public static final Size SM = new Size("SM", 0, "sm");
    public static final Size LG = new Size("LG", 1, "lg");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Size[] $values() {
        return new Size[]{SM, LG};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Size> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSize() {
        return this.size;
    }

    private Size(String str, int i, String str2) {
        this.size = str2;
    }

    static {
        Size[] sizeArr$values = $values();
        $VALUES = sizeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sizeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.presentation.views.Size.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final Size EZpvd(String str) {
            Size size;
            Size[] sizeArrValues = Size.values();
            int length = sizeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    size = null;
                    break;
                }
                size = sizeArrValues[i];
                if (Intrinsics.EZpvd((Object) size.getSize(), (Object) str)) {
                    break;
                }
                i++;
            }
            return size == null ? Size.LG : size;
        }
    }

    public static Size valueOf(String str) {
        return (Size) Enum.valueOf(Size.class, str);
    }

    public static Size[] values() {
        return (Size[]) $VALUES.clone();
    }
}
