package o;

import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.AccessDeniedException;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yFH implements Sequence<java.io.File> {
    public final Function1<java.io.File, Unit> AEQbTJ;
    public final Function1<java.io.File, java.lang.Boolean> EZpvd;
    public final FileWalkDirection KWHzl;
    public final int OLrzqt;
    public final Function2<java.io.File, java.io.IOException, Unit> copydefault;
    public final java.io.File gEmmrt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.io.File, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public yFH(java.io.File file, FileWalkDirection fileWalkDirection, Function1<? super java.io.File, java.lang.Boolean> function1, Function1<? super java.io.File, Unit> function12, Function2<? super java.io.File, ? super java.io.IOException, Unit> function2, int i) {
        this.gEmmrt = file;
        this.KWHzl = fileWalkDirection;
        this.EZpvd = function1;
        this.AEQbTJ = function12;
        this.copydefault = function2;
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r8v0 java.io.File)
  (wrap:kotlin.io.FileWalkDirection:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.io.FileWalkDirection:0x0004: SGET  A[WRAPPED] (LINE:39) kotlin.io.FileWalkDirection.TOP_DOWN kotlin.io.FileWalkDirection) : (r9v0 kotlin.io.FileWalkDirection))
  (r10v0 kotlin.jvm.functions.Function1)
  (r11v0 kotlin.jvm.functions.Function1)
  (r12v0 kotlin.jvm.functions.Function2)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (Integer.MAX_VALUE int) : (r13v0 int))
 A[MD:(java.io.File, kotlin.io.FileWalkDirection, kotlin.jvm.functions.Function1<? super java.io.File, java.lang.Boolean>, kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit>, kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, kotlin.Unit>, int):void (m)] (LINE:37) call: o.yFH.<init>(java.io.File, kotlin.io.FileWalkDirection, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, int):void type: THIS */
    public /* synthetic */ yFH(java.io.File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function12, function2, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yFH(@NotNull java.io.File file, @NotNull FileWalkDirection fileWalkDirection) {
        this(file, fileWalkDirection, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(fileWalkDirection, "");
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<java.io.File> iterator() {
        return new TaskDescription();
    }

    public static abstract class Application {
        public final java.io.File valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.io.File OLrzqt() {
            return this.valueOf;
        }

        public abstract java.io.File copydefault();

        public Application(@NotNull java.io.File file) {
            Intrinsics.checkNotNullParameter(file, "");
            this.valueOf = file;
        }
    }

    public static abstract class Activity extends Application {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.io.File file) {
            super(file);
            Intrinsics.checkNotNullParameter(file, "");
        }
    }

    public final class TaskDescription extends yDH<java.io.File> {
        public final ArrayDeque<Application> copydefault;

        /* JADX INFO: renamed from: o.yFH$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public final /* synthetic */ class C1000TaskDescription {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
            ArrayDeque<Application> arrayDeque = new ArrayDeque<>();
            this.copydefault = arrayDeque;
            if (yFH.this.gEmmrt.isDirectory()) {
                arrayDeque.push(EZpvd(yFH.this.gEmmrt));
            } else if (yFH.this.gEmmrt.isFile()) {
                arrayDeque.push(new Activity(this, yFH.this.gEmmrt));
            } else {
                KWHzl();
            }
        }

        @Override // o.yDH
        public void copydefault() {
            java.io.File fileEZpvd = EZpvd();
            if (fileEZpvd != null) {
                copydefault(fileEZpvd);
            } else {
                KWHzl();
            }
        }

        public final Activity EZpvd(java.io.File file) {
            int i = C1000TaskDescription.AEQbTJ[yFH.this.KWHzl.ordinal()];
            if (i == 1) {
                return new ActionBar(this, file);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return new StateListAnimator(this, file);
        }

        public final java.io.File EZpvd() {
            java.io.File fileCopydefault;
            while (true) {
                Application applicationPeek = this.copydefault.peek();
                if (applicationPeek == null) {
                    return null;
                }
                fileCopydefault = applicationPeek.copydefault();
                if (fileCopydefault == null) {
                    this.copydefault.pop();
                } else {
                    if (Intrinsics.EZpvd(fileCopydefault, applicationPeek.OLrzqt()) || !fileCopydefault.isDirectory() || this.copydefault.size() >= yFH.this.OLrzqt) {
                        break;
                    }
                    this.copydefault.push(EZpvd(fileCopydefault));
                }
            }
            return fileCopydefault;
        }

        public final class StateListAnimator extends Activity {
            public final /* synthetic */ TaskDescription AEQbTJ;
            public boolean EZpvd;
            public boolean KWHzl;
            public int OLrzqt;
            public java.io.File[] copydefault;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull TaskDescription taskDescription, java.io.File file) {
                super(file);
                Intrinsics.checkNotNullParameter(file, "");
                this.AEQbTJ = taskDescription;
            }

            @Override // o.yFH.Application
            public java.io.File copydefault() {
                if (!this.KWHzl && this.copydefault == null) {
                    Function1 function1 = yFH.this.EZpvd;
                    if (function1 != null && !((java.lang.Boolean) function1.invoke(OLrzqt())).booleanValue()) {
                        return null;
                    }
                    java.io.File[] fileArrListFiles = OLrzqt().listFiles();
                    this.copydefault = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Function2 function2 = yFH.this.copydefault;
                        if (function2 != null) {
                            function2.invoke(OLrzqt(), new AccessDeniedException(OLrzqt(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.KWHzl = true;
                    }
                }
                java.io.File[] fileArr = this.copydefault;
                if (fileArr != null) {
                    int i = this.OLrzqt;
                    Intrinsics.copydefault(fileArr);
                    if (i < fileArr.length) {
                        java.io.File[] fileArr2 = this.copydefault;
                        Intrinsics.copydefault(fileArr2);
                        int i2 = this.OLrzqt;
                        this.OLrzqt = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (this.EZpvd) {
                    Function1 function12 = yFH.this.AEQbTJ;
                    if (function12 != null) {
                        function12.invoke(OLrzqt());
                    }
                    return null;
                }
                this.EZpvd = true;
                return OLrzqt();
            }
        }

        public final class ActionBar extends Activity {
            public int AEQbTJ;
            public java.io.File[] EZpvd;
            public boolean OLrzqt;
            public final /* synthetic */ TaskDescription copydefault;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull TaskDescription taskDescription, java.io.File file) {
                super(file);
                Intrinsics.checkNotNullParameter(file, "");
                this.copydefault = taskDescription;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // o.yFH.Application
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public java.io.File copydefault() {
                Function2 function2;
                if (!this.OLrzqt) {
                    Function1 function1 = yFH.this.EZpvd;
                    if (function1 != null && !((java.lang.Boolean) function1.invoke(OLrzqt())).booleanValue()) {
                        return null;
                    }
                    this.OLrzqt = true;
                    return OLrzqt();
                }
                java.io.File[] fileArr = this.EZpvd;
                if (fileArr != null) {
                    int i = this.AEQbTJ;
                    Intrinsics.copydefault(fileArr);
                    if (i >= fileArr.length) {
                        Function1 function12 = yFH.this.AEQbTJ;
                        if (function12 != null) {
                            function12.invoke(OLrzqt());
                        }
                        return null;
                    }
                }
                if (this.EZpvd == null) {
                    java.io.File[] fileArrListFiles = OLrzqt().listFiles();
                    this.EZpvd = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = yFH.this.copydefault) != null) {
                        function2.invoke(OLrzqt(), new AccessDeniedException(OLrzqt(), null, "Cannot list files in a directory", 2, null));
                    }
                    java.io.File[] fileArr2 = this.EZpvd;
                    if (fileArr2 != null) {
                        Intrinsics.copydefault(fileArr2);
                    }
                    Function1 function13 = yFH.this.AEQbTJ;
                    if (function13 != null) {
                        function13.invoke(OLrzqt());
                    }
                    return null;
                }
                java.io.File[] fileArr3 = this.EZpvd;
                Intrinsics.copydefault(fileArr3);
                int i2 = this.AEQbTJ;
                this.AEQbTJ = i2 + 1;
                return fileArr3[i2];
            }
        }

        public final class Activity extends Application {
            public boolean EZpvd;
            public final /* synthetic */ TaskDescription KWHzl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull TaskDescription taskDescription, java.io.File file) {
                super(file);
                Intrinsics.checkNotNullParameter(file, "");
                this.KWHzl = taskDescription;
            }

            @Override // o.yFH.Application
            public java.io.File copydefault() {
                if (this.EZpvd) {
                    return null;
                }
                this.EZpvd = true;
                return OLrzqt();
            }
        }
    }

    public final yFH OLrzqt(@NotNull Function2<? super java.io.File, ? super java.io.IOException, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return new yFH(this.gEmmrt, this.KWHzl, this.EZpvd, this.AEQbTJ, function2, this.OLrzqt);
    }

    public final yFH copydefault(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("depth must be positive, but was " + i + '.');
        }
        return new yFH(this.gEmmrt, this.KWHzl, this.EZpvd, this.AEQbTJ, this.copydefault, i);
    }
}
