package o;

/* JADX INFO: renamed from: o.zvy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60117zvy {
    public static StateListAnimator EZpvd = null;
    public static boolean OLrzqt = false;

    private C60117zvy() {
    }

    public static java.lang.String copydefault(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("null input");
        }
        try {
            return java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            return null;
        }
    }

    public static boolean KWHzl(java.lang.String str) {
        java.lang.String strCopydefault = copydefault(str);
        if (strCopydefault == null) {
            return false;
        }
        return strCopydefault.equalsIgnoreCase("true");
    }

    /* JADX INFO: renamed from: o.zvy$StateListAnimator */
    public static final class StateListAnimator extends java.lang.SecurityManager {
        private StateListAnimator() {
        }

        @Override // java.lang.SecurityManager
        public java.lang.Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    public static StateListAnimator AEQbTJ() {
        StateListAnimator stateListAnimator = EZpvd;
        if (stateListAnimator != null) {
            return stateListAnimator;
        }
        if (OLrzqt) {
            return null;
        }
        StateListAnimator stateListAnimatorEZpvd = EZpvd();
        EZpvd = stateListAnimatorEZpvd;
        OLrzqt = true;
        return stateListAnimatorEZpvd;
    }

    public static StateListAnimator EZpvd() {
        try {
            return new StateListAnimator();
        } catch (java.lang.SecurityException unused) {
            return null;
        }
    }

    public static java.lang.Class<?> OLrzqt() {
        int i;
        StateListAnimator stateListAnimatorAEQbTJ = AEQbTJ();
        if (stateListAnimatorAEQbTJ == null) {
            return null;
        }
        java.lang.Class<?>[] classContext = stateListAnimatorAEQbTJ.getClassContext();
        java.lang.String name = C60117zvy.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new java.lang.IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    public static final void AEQbTJ(java.lang.String str, java.lang.Throwable th) {
        java.io.PrintStream printStream = java.lang.System.err;
        printStream.println(str);
        printStream.println("Reported exception:");
        th.printStackTrace();
    }

    public static final void AEQbTJ(java.lang.String str) {
        java.lang.System.err.println("SLF4J: " + str);
    }
}
