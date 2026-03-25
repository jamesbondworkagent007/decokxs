package o;

import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: o.eym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C17226eym {
    public static int EZpvd = 1048576;

    public static java.lang.String copydefault(java.util.ArrayList<java.lang.String> arrayList, java.lang.String str) throws java.io.IOException {
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(str)));
            byte[] bArr = new byte[EZpvd];
            for (int i = 0; i < arrayList.size(); i++) {
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(arrayList.get(i)), EZpvd);
                zipOutputStream.putNextEntry(new ZipEntry(arrayList.get(i).substring(arrayList.get(i).lastIndexOf("/") + 1)));
                while (true) {
                    int i2 = bufferedInputStream.read(bArr, 0, EZpvd);
                    if (i2 != -1) {
                        zipOutputStream.write(bArr, 0, i2);
                    }
                }
                bufferedInputStream.close();
            }
            zipOutputStream.close();
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("tag", e);
        }
        return str;
    }
}
