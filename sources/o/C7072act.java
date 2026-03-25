package o;

import com.fasterxml.jackson.core.JsonPointer;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/* JADX INFO: renamed from: o.act, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7072act extends UResourceBundle {
    public static AbstractC7013abN<java.lang.String, C7072act, TaskDescription> EZpvd = new AbstractC7078acz<java.lang.String, C7072act, TaskDescription>() { // from class: o.act.5
        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public C7072act copydefault(java.lang.String str, TaskDescription taskDescription) {
            return taskDescription.EZpvd();
        }
    };
    public static final boolean copydefault = C7060ach.AEQbTJ("resourceBundleWrapper");
    public java.util.List<java.lang.String> AEQbTJ;
    public java.lang.String AhwBna;
    public ResourceBundle KWHzl;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.util.UResourceBundle
    public java.lang.String djBIcL() {
        return this.AhwBna;
    }

    /* JADX INFO: renamed from: o.act$TaskDescription */
    public static abstract class TaskDescription {
        public abstract C7072act EZpvd();

        private TaskDescription() {
        }
    }

    public C7072act(ResourceBundle resourceBundle) {
        this.AhwBna = null;
        this.OLrzqt = null;
        this.AEQbTJ = null;
        this.KWHzl = resourceBundle;
    }

    @Override // com.ibm.icu.util.UResourceBundle, java.util.ResourceBundle
    public java.lang.Object handleGetObject(java.lang.String str) {
        java.lang.Object object;
        C7072act c7072act = this;
        while (true) {
            if (c7072act == null) {
                object = null;
                break;
            }
            try {
                object = c7072act.KWHzl.getObject(str);
                break;
            } catch (MissingResourceException unused) {
                c7072act = (C7072act) c7072act.gEmmrt();
            }
        }
        if (object != null) {
            return object;
        }
        throw new MissingResourceException("Can't find resource for bundle " + this.OLrzqt + ", key " + str, C7072act.class.getName(), str);
    }

    @Override // com.ibm.icu.util.UResourceBundle, java.util.ResourceBundle
    public java.util.Enumeration<java.lang.String> getKeys() {
        return Collections.enumeration(this.AEQbTJ);
    }

    public final void KWHzl() {
        this.AEQbTJ = new java.util.ArrayList();
        for (C7072act c7072act = this; c7072act != null; c7072act = (C7072act) c7072act.gEmmrt()) {
            java.util.Enumeration<java.lang.String> keys = c7072act.KWHzl.getKeys();
            while (keys.hasMoreElements()) {
                java.lang.String strNextElement = keys.nextElement();
                if (!this.AEQbTJ.contains(strNextElement)) {
                    this.AEQbTJ.add(strNextElement);
                }
            }
        }
    }

    @Override // com.ibm.icu.util.UResourceBundle
    public java.lang.String EZpvd() {
        return this.KWHzl.getClass().getName().replace('.', JsonPointer.SEPARATOR);
    }

    @Override // com.ibm.icu.util.UResourceBundle
    public ULocale fetchVPNInfo() {
        return new ULocale(this.AhwBna);
    }

    @Override // com.ibm.icu.util.UResourceBundle
    public UResourceBundle gEmmrt() {
        return (UResourceBundle) ((ResourceBundle) this).parent;
    }

    public static C7072act copydefault(java.lang.String str, java.lang.String str2, java.lang.ClassLoader classLoader, boolean z) {
        C7072act c7072actEZpvd;
        if (classLoader == null) {
            classLoader = C7016abQ.copydefault();
        }
        if (z) {
            c7072actEZpvd = EZpvd(str, str2, null, classLoader, z);
        } else {
            c7072actEZpvd = EZpvd(str, str2, ULocale.getDefault().getBaseName(), classLoader, z);
        }
        if (c7072actEZpvd != null) {
            return c7072actEZpvd;
        }
        throw new MissingResourceException("Could not find the bundle " + str + (str.indexOf(47) >= 0 ? "/" : "_") + str2, "", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean KWHzl(java.lang.String str, java.lang.String str2) {
        return str.startsWith(str2) && (str.length() == str2.length() || str.charAt(str2.length()) == '_');
    }

    public static C7072act EZpvd(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.ClassLoader classLoader, final boolean z) {
        final java.lang.String str4;
        java.lang.String str5;
        if (str2.isEmpty()) {
            str4 = str;
        } else {
            str4 = str + '_' + str2;
        }
        if (z) {
            str5 = str4;
        } else {
            str5 = str4 + '#' + str3;
        }
        return EZpvd.AEQbTJ(str5, new TaskDescription() { // from class: o.act.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(1:4)(2:5|(8:7|92|10|(2:88|12)|13|(6:85|28|(8:30|90|31|(2:86|33)|34|79|35|36)|(1:53)|(1:59)|60)|(1:69)(2:70|(1:72))|73)(1:8))|9|92|10|(0)|13|(0)|(0)(0)|73|(2:(0)|(1:82))) */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
            
                r6 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
            
                r8 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
            
                r8 = null;
             */
            /* JADX WARN: Removed duplicated region for block: B:69:0x012e  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0132  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:88:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // o.C7072act.TaskDescription
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public C7072act EZpvd() throws java.lang.Throwable {
                C7072act c7072actEZpvd;
                boolean z2;
                C7072act c7072actEZpvd2;
                int iLastIndexOf = str2.lastIndexOf(95);
                boolean z3 = false;
                if (iLastIndexOf != -1) {
                    c7072actEZpvd = C7072act.EZpvd(str, str2.substring(0, iLastIndexOf), str3, classLoader, z);
                } else {
                    if (!str2.isEmpty()) {
                        c7072actEZpvd = C7072act.EZpvd(str, "", str3, classLoader, z);
                        z2 = true;
                        c7072actEZpvd2 = new C7072act((ResourceBundle) classLoader.loadClass(str4).asSubclass(ResourceBundle.class).newInstance());
                        if (c7072actEZpvd != null) {
                            try {
                                c7072actEZpvd2.setParent(c7072actEZpvd);
                            } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused) {
                                z3 = true;
                            } catch (java.lang.Exception e) {
                                e = e;
                                if (C7072act.copydefault) {
                                    java.lang.System.out.println("failure");
                                }
                                if (C7072act.copydefault) {
                                    java.lang.System.out.println(e);
                                }
                            }
                        }
                        c7072actEZpvd2.OLrzqt = str;
                        c7072actEZpvd2.AhwBna = str2;
                        if (z3) {
                            try {
                                final java.lang.String str6 = str4.replace('.', JsonPointer.SEPARATOR) + ".properties";
                                java.io.InputStream inputStream = (java.io.InputStream) AccessController.doPrivileged(new PrivilegedAction<java.io.InputStream>() { // from class: o.act.4.2
                                    /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
                                    @Override // java.security.PrivilegedAction
                                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                                    public java.io.InputStream run() {
                                        return classLoader.getResourceAsStream(str6);
                                    }
                                });
                                if (inputStream != null) {
                                    java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
                                    try {
                                        C7072act c7072act = new C7072act(new PropertyResourceBundle(bufferedInputStream));
                                        if (c7072actEZpvd != null) {
                                            try {
                                                c7072act.setParent(c7072actEZpvd);
                                            } catch (java.lang.Exception unused2) {
                                                c7072actEZpvd2 = c7072act;
                                                try {
                                                    bufferedInputStream.close();
                                                } catch (java.lang.Exception unused3) {
                                                }
                                            } catch (java.lang.Throwable th) {
                                                th = th;
                                                try {
                                                    bufferedInputStream.close();
                                                } catch (java.lang.Exception unused4) {
                                                }
                                                throw th;
                                            }
                                        }
                                        c7072act.OLrzqt = str;
                                        c7072act.AhwBna = str2;
                                        try {
                                            bufferedInputStream.close();
                                        } catch (java.lang.Exception unused5) {
                                        }
                                        c7072actEZpvd2 = c7072act;
                                    } catch (java.lang.Exception unused6) {
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                    }
                                }
                                if (c7072actEZpvd2 == null && !z && !str2.isEmpty() && str2.indexOf(95) < 0 && !C7072act.KWHzl(str3, str2)) {
                                    java.lang.String str7 = str;
                                    java.lang.String str8 = str3;
                                    c7072actEZpvd2 = C7072act.EZpvd(str7, str8, str8, classLoader, z);
                                }
                                if (c7072actEZpvd2 != null || (z2 && z)) {
                                    c7072actEZpvd = c7072actEZpvd2;
                                }
                                c7072actEZpvd2 = c7072actEZpvd;
                            } catch (java.lang.Exception e2) {
                                if (C7072act.copydefault) {
                                    java.lang.System.out.println("failure");
                                }
                                if (C7072act.copydefault) {
                                    java.lang.System.out.println(e2);
                                }
                            }
                        }
                        if (c7072actEZpvd2 == null) {
                            c7072actEZpvd2.KWHzl();
                        } else if (C7072act.copydefault) {
                            java.lang.System.out.println("Returning null for " + str + "_" + str2);
                        }
                        return c7072actEZpvd2;
                    }
                    c7072actEZpvd = null;
                }
                z2 = false;
                c7072actEZpvd2 = new C7072act((ResourceBundle) classLoader.loadClass(str4).asSubclass(ResourceBundle.class).newInstance());
                if (c7072actEZpvd != null) {
                }
                c7072actEZpvd2.OLrzqt = str;
                c7072actEZpvd2.AhwBna = str2;
                if (z3) {
                }
                if (c7072actEZpvd2 == null) {
                }
                return c7072actEZpvd2;
            }
        });
    }
}
