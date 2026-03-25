package o;

import o.OW;

/* JADX INFO: loaded from: classes2.dex */
public final class OZ extends OW {
    public OZ(android.content.Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public OZ(final android.content.Context context, final java.lang.String str, long j) {
        super(new OW.Activity() { // from class: o.OZ.2
            @Override // o.OW.Activity
            public java.io.File copydefault() {
                java.io.File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                return str != null ? new java.io.File(cacheDir, str) : cacheDir;
            }
        }, j);
    }
}
