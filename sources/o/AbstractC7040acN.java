package o;

import com.fasterxml.jackson.core.JsonPointer;
import java.lang.reflect.InvocationTargetException;
import java.net.JarURLConnection;
import java.net.URISyntaxException;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* JADX INFO: renamed from: o.acN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC7040acN {
    public static final boolean EZpvd = C7060ach.AEQbTJ("URLHandler");
    public static final java.util.Map<java.lang.String, java.lang.reflect.Method> OLrzqt;

    /* JADX INFO: renamed from: o.acN$Activity */
    public interface Activity {
        void EZpvd(java.lang.String str);
    }

    public abstract void AEQbTJ(Activity activity, boolean z, boolean z2);

    static {
        java.lang.Object obj;
        java.util.HashMap map;
        java.io.BufferedReader bufferedReader;
        java.io.InputStream resourceAsStream;
        java.lang.String line;
        java.io.BufferedReader bufferedReader2 = null;
        map = null;
        java.util.HashMap map2 = null;
        try {
            resourceAsStream = C7016abQ.EZpvd(AbstractC7040acN.class).getResourceAsStream("urlhandler.props");
        } catch (java.lang.Throwable th) {
            obj = th;
            map = null;
        }
        if (resourceAsStream != null) {
            java.lang.Class<?>[] clsArr = {java.net.URL.class};
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(resourceAsStream));
            while (true) {
                try {
                    line = bufferedReader.readLine();
                } catch (java.lang.Throwable th2) {
                    obj = th2;
                    map = map2;
                    bufferedReader2 = bufferedReader;
                    try {
                        if (EZpvd) {
                            java.lang.System.err.println(obj);
                        }
                        if (bufferedReader2 != null) {
                            bufferedReader = bufferedReader2;
                            map2 = map;
                            try {
                                bufferedReader.close();
                            } catch (java.io.IOException unused) {
                            }
                        } else {
                            map2 = map;
                        }
                    } catch (java.lang.Throwable th3) {
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (java.io.IOException unused2) {
                            }
                        }
                        throw th3;
                    }
                }
                if (line == null) {
                    break;
                }
                java.lang.String strTrim = line.trim();
                if (strTrim.length() != 0 && strTrim.charAt(0) != '#') {
                    int iIndexOf = strTrim.indexOf(61);
                    if (iIndexOf != -1) {
                        java.lang.String strTrim2 = strTrim.substring(0, iIndexOf).trim();
                        try {
                            java.lang.reflect.Method declaredMethod = java.lang.Class.forName(strTrim.substring(iIndexOf + 1).trim()).getDeclaredMethod("get", clsArr);
                            if (map2 == null) {
                                map2 = new java.util.HashMap();
                            }
                            map2.put(strTrim2, declaredMethod);
                        } catch (java.lang.ClassNotFoundException e) {
                            if (EZpvd) {
                                java.lang.System.err.println(e);
                            }
                        } catch (java.lang.NoSuchMethodException e2) {
                            if (EZpvd) {
                                java.lang.System.err.println(e2);
                            }
                        } catch (java.lang.SecurityException e3) {
                            if (EZpvd) {
                                java.lang.System.err.println(e3);
                            }
                        }
                    } else if (EZpvd) {
                        java.lang.System.err.println("bad urlhandler line: '" + strTrim + "'");
                    }
                    OLrzqt = map2;
                }
            }
            bufferedReader.close();
        } else {
            bufferedReader = null;
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        OLrzqt = map2;
    }

    public static AbstractC7040acN AEQbTJ(java.net.URL url) {
        java.lang.reflect.Method method;
        if (url == null) {
            return null;
        }
        java.lang.String protocol = url.getProtocol();
        java.util.Map<java.lang.String, java.lang.reflect.Method> map = OLrzqt;
        if (map != null && (method = map.get(protocol)) != null) {
            try {
                AbstractC7040acN abstractC7040acN = (AbstractC7040acN) method.invoke(null, url);
                if (abstractC7040acN != null) {
                    return abstractC7040acN;
                }
            } catch (java.lang.IllegalAccessException e) {
                if (EZpvd) {
                    java.lang.System.err.println(e);
                }
            } catch (java.lang.IllegalArgumentException e2) {
                if (EZpvd) {
                    java.lang.System.err.println(e2);
                }
            } catch (InvocationTargetException e3) {
                if (EZpvd) {
                    java.lang.System.err.println(e3);
                }
            }
        }
        return OLrzqt(url);
    }

    public static AbstractC7040acN OLrzqt(java.net.URL url) {
        java.lang.String protocol = url.getProtocol();
        if (protocol.equals("file")) {
            return new TaskDescription(url);
        }
        if (protocol.equals("jar") || protocol.equals("wsjar")) {
            return new ActionBar(url);
        }
        return null;
    }

    /* JADX INFO: renamed from: o.acN$TaskDescription */
    /* JADX INFO: loaded from: classes17.dex */
    public static class TaskDescription extends AbstractC7040acN {
        public java.io.File copydefault;

        public TaskDescription(java.net.URL url) {
            try {
                this.copydefault = new java.io.File(url.toURI());
            } catch (URISyntaxException unused) {
            }
            java.io.File file = this.copydefault;
            if (file == null || !file.exists()) {
                if (AbstractC7040acN.EZpvd) {
                    java.lang.System.err.println("file does not exist - " + url.toString());
                }
                throw new java.lang.IllegalArgumentException();
            }
        }

        @Override // o.AbstractC7040acN
        public void AEQbTJ(Activity activity, boolean z, boolean z2) {
            if (this.copydefault.isDirectory()) {
                OLrzqt(activity, z, z2, "/", this.copydefault.listFiles());
            } else {
                activity.EZpvd(this.copydefault.getName());
            }
        }

        public final void OLrzqt(Activity activity, boolean z, boolean z2, java.lang.String str, java.io.File[] fileArr) {
            if (fileArr != null) {
                for (java.io.File file : fileArr) {
                    if (!file.isDirectory()) {
                        activity.EZpvd(z2 ? file.getName() : str + file.getName());
                    } else if (z) {
                        OLrzqt(activity, z, z2, str + file.getName() + JsonPointer.SEPARATOR, file.listFiles());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.acN$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static class ActionBar extends AbstractC7040acN {
        public java.lang.String AEQbTJ;
        public JarFile KWHzl;

        public ActionBar(java.net.URL url) {
            java.lang.String string;
            int iIndexOf;
            try {
                java.lang.String path = url.getPath();
                this.AEQbTJ = path;
                int iLastIndexOf = path.lastIndexOf("!/");
                if (iLastIndexOf >= 0) {
                    this.AEQbTJ = this.AEQbTJ.substring(iLastIndexOf + 2);
                }
                if (!url.getProtocol().equals("jar") && (iIndexOf = (string = url.toString()).indexOf(":")) != -1) {
                    url = new java.net.URL("jar" + string.substring(iIndexOf));
                }
                this.KWHzl = ((JarURLConnection) url.openConnection()).getJarFile();
            } catch (java.lang.Exception e) {
                if (AbstractC7040acN.EZpvd) {
                    java.lang.System.err.println("icurb jar error: " + e);
                }
                throw new java.lang.IllegalArgumentException("jar error: " + e.getMessage());
            }
        }

        @Override // o.AbstractC7040acN
        public void AEQbTJ(Activity activity, boolean z, boolean z2) {
            java.lang.String strSubstring;
            int iLastIndexOf;
            try {
                java.util.Enumeration<JarEntry> enumerationEntries = this.KWHzl.entries();
                while (enumerationEntries.hasMoreElements()) {
                    JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                    if (!jarEntryNextElement.isDirectory()) {
                        java.lang.String name = jarEntryNextElement.getName();
                        if (name.startsWith(this.AEQbTJ) && ((iLastIndexOf = (strSubstring = name.substring(this.AEQbTJ.length())).lastIndexOf(47)) <= 0 || z)) {
                            if (z2 && iLastIndexOf != -1) {
                                strSubstring = strSubstring.substring(iLastIndexOf + 1);
                            }
                            activity.EZpvd(strSubstring);
                        }
                    }
                }
            } catch (java.lang.Exception e) {
                if (AbstractC7040acN.EZpvd) {
                    java.lang.System.err.println("icurb jar error: " + e);
                }
            }
        }
    }

    public void AEQbTJ(Activity activity, boolean z) {
        AEQbTJ(activity, z, true);
    }
}
