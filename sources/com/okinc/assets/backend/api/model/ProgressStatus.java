package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class ProgressStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ProgressStatus[] $VALUES;
    public static final Activity Companion;
    public static final ProgressStatus Processing = new ProgressStatus("Processing", 0);
    public static final ProgressStatus Completed = new ProgressStatus("Completed", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ProgressStatus[] $values() {
        return new ProgressStatus[]{Processing, Completed};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ProgressStatus> getEntries() {
        return $ENTRIES;
    }

    private ProgressStatus(String str, int i) {
    }

    static {
        ProgressStatus[] progressStatusArr$values = $values();
        $VALUES = progressStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(progressStatusArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.ProgressStatus.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
        
            if (r2.equals("1") == false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
        
            return com.okinc.assets.backend.api.model.ProgressStatus.Completed;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
        
            if (r2.equals("2") == false) goto L17;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ProgressStatus KWHzl(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case 48:
                        if (str.equals("0")) {
                            return ProgressStatus.Processing;
                        }
                        break;
                }
            }
            return null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        
            if (r3.equals("1") == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        
            if (r3.equals("0") == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        
            if (r3.equals("10") != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
        
            return com.okinc.assets.backend.api.model.ProgressStatus.Processing;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ProgressStatus OLrzqt(String str) {
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != 1567) {
                    switch (iHashCode) {
                        case 50:
                            if (str.equals("2")) {
                                return ProgressStatus.Completed;
                            }
                            break;
                    }
                }
            }
            return null;
        }

        public final ProgressStatus copydefault(String str) {
            if (Intrinsics.EZpvd((Object) str, (Object) "1")) {
                return ProgressStatus.Processing;
            }
            if (Intrinsics.EZpvd((Object) str, (Object) "2")) {
                return ProgressStatus.Completed;
            }
            return null;
        }
    }

    public static ProgressStatus valueOf(String str) {
        return (ProgressStatus) Enum.valueOf(ProgressStatus.class, str);
    }

    public static ProgressStatus[] values() {
        return (ProgressStatus[]) $VALUES.clone();
    }
}
