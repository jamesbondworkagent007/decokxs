package o;

/* JADX INFO: renamed from: o.pIN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C37986pIN implements java.io.FileFilter {
    @Override // java.io.FileFilter
    public boolean accept(java.io.File file) {
        return java.lang.System.currentTimeMillis() - file.lastModified() > 604800000;
    }
}
