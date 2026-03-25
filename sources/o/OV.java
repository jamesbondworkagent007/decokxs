package o;

import o.OW;

/* JADX INFO: loaded from: classes2.dex */
public final class OV extends OW {
    public OV(android.content.Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public OV(final android.content.Context context, final java.lang.String str, long j) {
        super(new OW.Activity() { // from class: o.OV.1
            public final java.io.File KWHzl() {
                java.io.File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                return str != null ? new java.io.File(cacheDir, str) : cacheDir;
            }

            @Override // o.OW.Activity
            public java.io.File copydefault() {
                java.io.File externalCacheDir;
                java.io.File fileKWHzl = KWHzl();
                return ((fileKWHzl == null || !fileKWHzl.exists()) && (externalCacheDir = context.getExternalCacheDir()) != null && externalCacheDir.canWrite()) ? str != null ? new java.io.File(externalCacheDir, str) : externalCacheDir : fileKWHzl;
            }
        }, j);
    }
}
