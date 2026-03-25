package com.okinc.crcore.coreapi.pagecache;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes23.dex */
public final class PageCacheUtil {
    public static final Companion Companion = new Companion(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm KWHzl;

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.pagecache.PageCacheUtil.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class CacheStatus {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ CacheStatus[] $VALUES;
            private final String value;
            public static final CacheStatus HIT = new CacheStatus("HIT", 0, "hit");
            public static final CacheStatus MISS = new CacheStatus("MISS", 1, "miss");
            public static final CacheStatus EXPIRE = new CacheStatus("EXPIRE", 2, "expire");

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ CacheStatus[] $values() {
                return new CacheStatus[]{HIT, MISS, EXPIRE};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<CacheStatus> getEntries() {
                return $ENTRIES;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getValue() {
                return this.value;
            }

            private CacheStatus(String str, int i, String str2) {
                this.value = str2;
            }

            static {
                CacheStatus[] cacheStatusArr$values = $values();
                $VALUES = cacheStatusArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(cacheStatusArr$values);
            }

            public static CacheStatus valueOf(String str) {
                return (CacheStatus) Enum.valueOf(CacheStatus.class, str);
            }

            public static CacheStatus[] values() {
                return (CacheStatus[]) $VALUES.clone();
            }
        }
    }

    public final File copydefault() {
        return (File) this.KWHzl.getValue();
    }

    public final String KWHzl(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        return "PageCacheUtil-" + str + "-" + str2;
    }

    public static /* synthetic */ File pageDirectory$default(PageCacheUtil pageCacheUtil, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return pageCacheUtil.EZpvd(str, z);
    }

    public final File EZpvd(String str, boolean z) {
        KWHzl(str, null);
        File file = new File(copydefault(), str);
        if (!file.exists()) {
            if (z) {
                boolean zMkdirs = file.mkdirs();
                file.getAbsolutePath();
                if (!zMkdirs) {
                }
            }
            return null;
        }
        return file;
    }

    public static /* synthetic */ File sectionDirectory$default(PageCacheUtil pageCacheUtil, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return pageCacheUtil.KWHzl(str, str2, z);
    }

    public final File KWHzl(String str, String str2, boolean z) {
        KWHzl(str, str2);
        File fileEZpvd = EZpvd(str, z);
        if (fileEZpvd == null) {
            return null;
        }
        if (str2 == null) {
            fileEZpvd.getAbsolutePath();
            return fileEZpvd;
        }
        File file = new File(fileEZpvd, str2);
        if (!file.exists()) {
            if (z) {
                boolean zMkdirs = file.mkdirs();
                file.getAbsolutePath();
                if (!zMkdirs) {
                }
            }
            return null;
        }
        return file;
    }
}
