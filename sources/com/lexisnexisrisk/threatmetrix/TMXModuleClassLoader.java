package com.lexisnexisrisk.threatmetrix;

import QfgSZK.GCXiNH;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class TMXModuleClassLoader extends ClassLoader {
    public static int UCE = 5212;
    public static int sBu = 8172;
    private static boolean sHnwvq = false;
    private final ClassLoader RMrsLl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXModuleClassLoader(ClassLoader classLoader) {
        this.RMrsLl = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.ClassLoader
    public Enumeration<URL> getResources(String str) throws IOException {
        String strFsw = GCXiNH.fsw("|bHi_B.miZTJIL[");
        if (sHnwvq) {
            strFsw = GCXiNH.fsw("|bHi_B.ji[VpO[^NUPG");
        }
        String strReplace = str.replace(GCXiNH.fsw("PToM\u0006xOX#[GQ\\@KBE"), strFsw);
        if ((UCE ^ 5212) == 0) {
            return this.RMrsLl.getResources(strReplace);
        }
        while (true) {
            int i = UCE;
            int i2 = i + 52;
            if (i2 == 96) {
                UCE = (i * 75) + i;
            } else if (i2 == 293) {
                UCE = ((i >> 93) + i) >> 104;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) throws ClassNotFoundException {
        return this.RMrsLl.loadClass(str);
    }
}
