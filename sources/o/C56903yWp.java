package o;

import java.security.AccessControlException;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import o.InterfaceC56893yWf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yWp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56903yWp implements InterfaceC56893yWf.TaskDescription {
    public static boolean AEQbTJ;
    public static final java.util.Map<C56929yXo, KotlinClassHeader.Kind> EZpvd;
    public int[] valueOf = null;
    public java.lang.String copydefault = null;
    public int OLrzqt = 0;
    public java.lang.String djBIcL = null;
    public java.lang.String[] KWHzl = null;
    public java.lang.String[] AkhnZx = null;
    public java.lang.String[] AYXKKw = null;
    public KotlinClassHeader.Kind AhwBna = null;
    public java.lang.String[] gEmmrt = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void OLrzqt(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // o.InterfaceC56893yWf.TaskDescription
    public void EZpvd() {
    }

    static {
        try {
            AEQbTJ = "true".equals(java.lang.System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            AEQbTJ = false;
        }
        java.util.HashMap map = new java.util.HashMap();
        EZpvd = map;
        map.put(C56929yXo.copydefault(new C56933yXs("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        map.put(C56929yXo.copydefault(new C56933yXs("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        map.put(C56929yXo.copydefault(new C56933yXs("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        map.put(C56929yXo.copydefault(new C56933yXs("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        map.put(C56929yXo.copydefault(new C56933yXs("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    public KotlinClassHeader AEQbTJ() {
        return OLrzqt(C56921yXg.KWHzl);
    }

    public KotlinClassHeader OLrzqt(C56921yXg c56921yXg) {
        int[] iArr;
        if (this.AhwBna == null || (iArr = this.valueOf) == null) {
            return null;
        }
        C56921yXg c56921yXg2 = new C56921yXg(iArr, (this.OLrzqt & 8) != 0);
        if (!c56921yXg2.EZpvd(c56921yXg)) {
            this.AYXKKw = this.KWHzl;
            this.KWHzl = null;
        } else if (KWHzl() && this.KWHzl == null) {
            return null;
        }
        java.lang.String[] strArr = this.gEmmrt;
        return new KotlinClassHeader(this.AhwBna, c56921yXg2, this.KWHzl, this.AYXKKw, this.AkhnZx, this.copydefault, this.OLrzqt, this.djBIcL, strArr != null ? C56922yXh.EZpvd(strArr) : null);
    }

    public final boolean KWHzl() {
        KotlinClassHeader.Kind kind = this.AhwBna;
        return kind == KotlinClassHeader.Kind.CLASS || kind == KotlinClassHeader.Kind.FILE_FACADE || kind == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART;
    }

    @Override // o.InterfaceC56893yWf.TaskDescription
    public InterfaceC56893yWf.Application copydefault(@NotNull C56929yXo c56929yXo, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        KotlinClassHeader.Kind kind;
        if (c56929yXo == null) {
            OLrzqt(0);
        }
        if (interfaceC56686yOo == null) {
            OLrzqt(1);
        }
        C56933yXs c56933yXsAEQbTJ = c56929yXo.AEQbTJ();
        if (c56933yXsAEQbTJ.equals(yRE.DbNXlk)) {
            return new ActionBar();
        }
        if (c56933yXsAEQbTJ.equals(yRE.getFieldNames)) {
            return new Application();
        }
        if (AEQbTJ || this.AhwBna != null || (kind = EZpvd.get(c56929yXo)) == null) {
            return null;
        }
        this.AhwBna = kind;
        return new TaskDescription();
    }

    /* JADX INFO: renamed from: o.yWp$ActionBar */
    public class ActionBar implements InterfaceC56893yWf.Application {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void copydefault(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56893yWf.Application
        public void AEQbTJ(C56935yXu c56935yXu, @NotNull C56977yZi c56977yZi) {
            if (c56977yZi == null) {
                copydefault(0);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56893yWf.Application
        public InterfaceC56893yWf.Application KWHzl(C56935yXu c56935yXu, @NotNull C56929yXo c56929yXo) {
            if (c56929yXo != null) {
                return null;
            }
            copydefault(3);
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56893yWf.Application
        public void OLrzqt(C56935yXu c56935yXu, @NotNull C56929yXo c56929yXo, @NotNull C56935yXu c56935yXu2) {
            if (c56929yXo == null) {
                copydefault(1);
            }
            if (c56935yXu2 == null) {
                copydefault(2);
            }
        }

        @Override // o.InterfaceC56893yWf.Application
        public void copydefault() {
        }

        public ActionBar() {
        }

        @Override // o.InterfaceC56893yWf.Application
        public void AEQbTJ(C56935yXu c56935yXu, java.lang.Object obj) {
            if (c56935yXu == null) {
                return;
            }
            java.lang.String strAEQbTJ = c56935yXu.AEQbTJ();
            if ("k".equals(strAEQbTJ)) {
                if (obj instanceof java.lang.Integer) {
                    C56903yWp.this.AhwBna = KotlinClassHeader.Kind.getById(((java.lang.Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strAEQbTJ)) {
                if (obj instanceof int[]) {
                    C56903yWp.this.valueOf = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strAEQbTJ)) {
                if (obj instanceof java.lang.String) {
                    java.lang.String str = (java.lang.String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    C56903yWp.this.copydefault = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strAEQbTJ)) {
                if (obj instanceof java.lang.Integer) {
                    C56903yWp.this.OLrzqt = ((java.lang.Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strAEQbTJ) && (obj instanceof java.lang.String)) {
                java.lang.String str2 = (java.lang.String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                C56903yWp.this.djBIcL = str2;
            }
        }

        @Override // o.InterfaceC56893yWf.Application
        public InterfaceC56893yWf.Activity EZpvd(C56935yXu c56935yXu) {
            java.lang.String strAEQbTJ = c56935yXu != null ? c56935yXu.AEQbTJ() : null;
            if ("d1".equals(strAEQbTJ)) {
                return EZpvd();
            }
            if ("d2".equals(strAEQbTJ)) {
                return KWHzl();
            }
            return null;
        }

        public final InterfaceC56893yWf.Activity EZpvd() {
            return new StateListAnimator() { // from class: o.yWp.ActionBar.3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ void KWHzl(int i) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
                }

                @Override // o.C56903yWp.StateListAnimator
                public void EZpvd(@NotNull java.lang.String[] strArr) {
                    if (strArr == null) {
                        KWHzl(0);
                    }
                    C56903yWp.this.KWHzl = strArr;
                }
            };
        }

        public final InterfaceC56893yWf.Activity KWHzl() {
            return new StateListAnimator() { // from class: o.yWp.ActionBar.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private static /* synthetic */ void KWHzl(int i) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
                }

                @Override // o.C56903yWp.StateListAnimator
                public void EZpvd(@NotNull java.lang.String[] strArr) {
                    if (strArr == null) {
                        KWHzl(0);
                    }
                    C56903yWp.this.AkhnZx = strArr;
                }
            };
        }
    }

    /* JADX INFO: renamed from: o.yWp$TaskDescription */
    public class TaskDescription implements InterfaceC56893yWf.Application {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static /* synthetic */ void EZpvd(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56893yWf.Application
        public void AEQbTJ(C56935yXu c56935yXu, @NotNull C56977yZi c56977yZi) {
            if (c56977yZi == null) {
                EZpvd(0);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56893yWf.Application
        public InterfaceC56893yWf.Application KWHzl(C56935yXu c56935yXu, @NotNull C56929yXo c56929yXo) {
            if (c56929yXo != null) {
                return null;
            }
            EZpvd(3);
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56893yWf.Application
        public void OLrzqt(C56935yXu c56935yXu, @NotNull C56929yXo c56929yXo, @NotNull C56935yXu c56935yXu2) {
            if (c56929yXo == null) {
                EZpvd(1);
            }
            if (c56935yXu2 == null) {
                EZpvd(2);
            }
        }

        @Override // o.InterfaceC56893yWf.Application
        public void copydefault() {
        }

        public TaskDescription() {
        }

        @Override // o.InterfaceC56893yWf.Application
        public void AEQbTJ(C56935yXu c56935yXu, java.lang.Object obj) {
            if (c56935yXu == null) {
                return;
            }
            java.lang.String strAEQbTJ = c56935yXu.AEQbTJ();
            if ("version".equals(strAEQbTJ)) {
                if (obj instanceof int[]) {
                    C56903yWp.this.valueOf = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strAEQbTJ)) {
                C56903yWp.this.copydefault = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            }
        }

        @Override // o.InterfaceC56893yWf.Application
        public InterfaceC56893yWf.Activity EZpvd(C56935yXu c56935yXu) {
            java.lang.String strAEQbTJ = c56935yXu != null ? c56935yXu.AEQbTJ() : null;
            if ("data".equals(strAEQbTJ) || "filePartClassNames".equals(strAEQbTJ)) {
                return EZpvd();
            }
            if ("strings".equals(strAEQbTJ)) {
                return KWHzl();
            }
            return null;
        }

        private InterfaceC56893yWf.Activity EZpvd() {
            return new StateListAnimator() { // from class: o.yWp.TaskDescription.5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private static /* synthetic */ void EZpvd(int i) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
                }

                @Override // o.C56903yWp.StateListAnimator
                public void EZpvd(@NotNull java.lang.String[] strArr) {
                    if (strArr == null) {
                        EZpvd(0);
                    }
                    C56903yWp.this.KWHzl = strArr;
                }
            };
        }

        private InterfaceC56893yWf.Activity KWHzl() {
            return new StateListAnimator() { // from class: o.yWp.TaskDescription.3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private static /* synthetic */ void copydefault(int i) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
                }

                @Override // o.C56903yWp.StateListAnimator
                public void EZpvd(@NotNull java.lang.String[] strArr) {
                    if (strArr == null) {
                        copydefault(0);
                    }
                    C56903yWp.this.AkhnZx = strArr;
                }
            };
        }
    }

    /* JADX INFO: renamed from: o.yWp$Application */
    public class Application implements InterfaceC56893yWf.Application {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static /* synthetic */ void EZpvd(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // o.InterfaceC56893yWf.Application
        public void AEQbTJ(C56935yXu c56935yXu, java.lang.Object obj) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56893yWf.Application
        public void AEQbTJ(C56935yXu c56935yXu, @NotNull C56977yZi c56977yZi) {
            if (c56977yZi == null) {
                EZpvd(0);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56893yWf.Application
        public InterfaceC56893yWf.Application KWHzl(C56935yXu c56935yXu, @NotNull C56929yXo c56929yXo) {
            if (c56929yXo != null) {
                return null;
            }
            EZpvd(3);
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56893yWf.Application
        public void OLrzqt(C56935yXu c56935yXu, @NotNull C56929yXo c56929yXo, @NotNull C56935yXu c56935yXu2) {
            if (c56929yXo == null) {
                EZpvd(1);
            }
            if (c56935yXu2 == null) {
                EZpvd(2);
            }
        }

        @Override // o.InterfaceC56893yWf.Application
        public void copydefault() {
        }

        public Application() {
        }

        @Override // o.InterfaceC56893yWf.Application
        public InterfaceC56893yWf.Activity EZpvd(C56935yXu c56935yXu) {
            if ("b".equals(c56935yXu != null ? c56935yXu.AEQbTJ() : null)) {
                return KWHzl();
            }
            return null;
        }

        public final InterfaceC56893yWf.Activity KWHzl() {
            return new StateListAnimator() { // from class: o.yWp.Application.4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private static /* synthetic */ void KWHzl(int i) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
                }

                @Override // o.C56903yWp.StateListAnimator
                public void EZpvd(@NotNull java.lang.String[] strArr) {
                    if (strArr == null) {
                        KWHzl(0);
                    }
                    C56903yWp.this.gEmmrt = strArr;
                }
            };
        }
    }

    /* JADX INFO: renamed from: o.yWp$StateListAnimator */
    public static abstract class StateListAnimator implements InterfaceC56893yWf.Activity {
        public final java.util.List<java.lang.String> OLrzqt = new java.util.ArrayList();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static /* synthetic */ void copydefault(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56893yWf.Activity
        public void AEQbTJ(@NotNull C56929yXo c56929yXo, @NotNull C56935yXu c56935yXu) {
            if (c56929yXo == null) {
                copydefault(0);
            }
            if (c56935yXu == null) {
                copydefault(1);
            }
        }

        public abstract void EZpvd(@NotNull java.lang.String[] strArr);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56893yWf.Activity
        public InterfaceC56893yWf.Application KWHzl(@NotNull C56929yXo c56929yXo) {
            if (c56929yXo != null) {
                return null;
            }
            copydefault(3);
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56893yWf.Activity
        public void OLrzqt(@NotNull C56977yZi c56977yZi) {
            if (c56977yZi == null) {
                copydefault(2);
            }
        }

        @Override // o.InterfaceC56893yWf.Activity
        public void OLrzqt(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                this.OLrzqt.add((java.lang.String) obj);
            }
        }

        @Override // o.InterfaceC56893yWf.Activity
        public void KWHzl() {
            EZpvd((java.lang.String[]) this.OLrzqt.toArray(new java.lang.String[0]));
        }
    }
}
