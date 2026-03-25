package o;

import android.os.Build;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zwX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60134zwX {
    public static final ActionBar EZpvd = new ActionBar(null);
    public static final java.util.ArrayList<Application> copydefault = new java.util.ArrayList<>();
    public static volatile Application[] OLrzqt = new Application[0];

    private C60134zwX() {
        throw new java.lang.AssertionError();
    }

    /* JADX INFO: renamed from: o.zwX$Application */
    public static abstract class Application {
        private final java.lang.ThreadLocal<java.lang.String> explicitTag = new java.lang.ThreadLocal<>();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final /* synthetic */ java.lang.ThreadLocal getExplicitTag$timber_release() {
            return this.explicitTag;
        }

        public boolean isLoggable(int i) {
            return true;
        }

        public abstract void log(int i, java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th);

        public /* synthetic */ java.lang.String getTag$timber_release() {
            java.lang.String str = this.explicitTag.get();
            if (str != null) {
                this.explicitTag.remove();
            }
            return str;
        }

        public void v(java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            prepareLog(2, null, str, java.util.Arrays.copyOf(objArr, objArr.length));
        }

        public void v(java.lang.Throwable th, java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            prepareLog(2, th, str, java.util.Arrays.copyOf(objArr, objArr.length));
        }

        public void v(java.lang.Throwable th) {
            prepareLog(2, th, null, new java.lang.Object[0]);
        }

        public void d(java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            prepareLog(3, null, str, java.util.Arrays.copyOf(objArr, objArr.length));
        }

        public void d(java.lang.Throwable th, java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            prepareLog(3, th, str, java.util.Arrays.copyOf(objArr, objArr.length));
        }

        public void d(java.lang.Throwable th) {
            prepareLog(3, th, null, new java.lang.Object[0]);
        }

        public void i(java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            prepareLog(4, null, str, java.util.Arrays.copyOf(objArr, objArr.length));
        }

        public void i(java.lang.Throwable th, java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            prepareLog(4, th, str, java.util.Arrays.copyOf(objArr, objArr.length));
        }

        public void i(java.lang.Throwable th) {
            prepareLog(4, th, null, new java.lang.Object[0]);
        }

        public void w(java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            prepareLog(5, null, str, java.util.Arrays.copyOf(objArr, objArr.length));
        }

        public void w(java.lang.Throwable th, java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            prepareLog(5, th, str, java.util.Arrays.copyOf(objArr, objArr.length));
        }

        public void w(java.lang.Throwable th) {
            prepareLog(5, th, null, new java.lang.Object[0]);
        }

        public void e(java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            prepareLog(6, null, str, java.util.Arrays.copyOf(objArr, objArr.length));
        }

        public void e(java.lang.Throwable th, java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            prepareLog(6, th, str, java.util.Arrays.copyOf(objArr, objArr.length));
        }

        public void e(java.lang.Throwable th) {
            prepareLog(6, th, null, new java.lang.Object[0]);
        }

        public void wtf(java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            prepareLog(7, null, str, java.util.Arrays.copyOf(objArr, objArr.length));
        }

        public void wtf(java.lang.Throwable th, java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            prepareLog(7, th, str, java.util.Arrays.copyOf(objArr, objArr.length));
        }

        public void wtf(java.lang.Throwable th) {
            prepareLog(7, th, null, new java.lang.Object[0]);
        }

        public void log(int i, java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            prepareLog(i, null, str, java.util.Arrays.copyOf(objArr, objArr.length));
        }

        public void log(int i, java.lang.Throwable th, java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            prepareLog(i, th, str, java.util.Arrays.copyOf(objArr, objArr.length));
        }

        public void log(int i, java.lang.Throwable th) {
            prepareLog(i, th, null, new java.lang.Object[0]);
        }

        public boolean isLoggable(java.lang.String str, int i) {
            return isLoggable(i);
        }

        public final void prepareLog(int i, java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
            java.lang.String tag$timber_release = getTag$timber_release();
            if (isLoggable(tag$timber_release, i)) {
                if (str != null && str.length() != 0) {
                    if (!(objArr.length == 0)) {
                        str = formatMessage(str, objArr);
                    }
                    if (th != null) {
                        str = ((java.lang.Object) str) + '\n' + getStackTraceString(th);
                    }
                } else if (th == null) {
                    return;
                } else {
                    str = getStackTraceString(th);
                }
                log(i, tag$timber_release, str, th);
            }
        }

        public java.lang.String formatMessage(@NotNull java.lang.String str, @NotNull java.lang.Object[] objArr) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(objArr, "");
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            java.lang.String str2 = java.lang.String.format(str, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            return str2;
        }

        public final java.lang.String getStackTraceString(java.lang.Throwable th) {
            java.io.StringWriter stringWriter = new java.io.StringWriter(256);
            java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.Writer) stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            java.lang.String string = stringWriter.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
    }

    /* JADX INFO: renamed from: o.zwX$StateListAnimator */
    /* JADX INFO: loaded from: classes17.dex */
    public static class StateListAnimator extends Application {
        private static final int MAX_LOG_LENGTH = 4000;
        private static final int MAX_TAG_LENGTH = 23;
        private final java.util.List<java.lang.String> fqcnIgnore = yDY.gEmmrt(C60134zwX.class.getName(), ActionBar.class.getName(), Application.class.getName(), StateListAnimator.class.getName());
        public static final TaskDescription Companion = new TaskDescription(null);
        private static final Pattern ANONYMOUS_CLASS = Pattern.compile("(\\$\\d+)+$");

        @Override // o.C60134zwX.Application
        public java.lang.String getTag$timber_release() {
            java.lang.String tag$timber_release = super.getTag$timber_release();
            if (tag$timber_release != null) {
                return tag$timber_release;
            }
            java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "");
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                if (!this.fqcnIgnore.contains(stackTraceElement.getClassName())) {
                    return createStackElementTag(stackTraceElement);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        public java.lang.String createStackElementTag(@NotNull java.lang.StackTraceElement stackTraceElement) {
            Intrinsics.checkNotNullParameter(stackTraceElement, "");
            java.lang.String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            java.lang.String strSubstringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(className, '.', (java.lang.String) null, 2, (java.lang.Object) null);
            Matcher matcher = ANONYMOUS_CLASS.matcher(strSubstringAfterLast$default);
            if (matcher.find()) {
                strSubstringAfterLast$default = matcher.replaceAll("");
                Intrinsics.checkNotNullExpressionValue(strSubstringAfterLast$default, "");
            }
            if (strSubstringAfterLast$default.length() <= 23 || Build.VERSION.SDK_INT >= 26) {
                return strSubstringAfterLast$default;
            }
            java.lang.String strSubstring = strSubstringAfterLast$default.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return strSubstring;
        }

        @Override // o.C60134zwX.Application
        public void log(int i, java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
            int iMin;
            Intrinsics.checkNotNullParameter(str2, "");
            if (str2.length() < MAX_LOG_LENGTH) {
                if (i == 7) {
                    android.util.Log.wtf(str, str2);
                    return;
                } else {
                    android.util.Log.println(i, str, str2);
                    return;
                }
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str2, '\n', i2, false, 4, (java.lang.Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = length;
                }
                while (true) {
                    iMin = java.lang.Math.min(iIndexOf$default, i2 + MAX_LOG_LENGTH);
                    java.lang.String strSubstring = str2.substring(i2, iMin);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    if (i == 7) {
                        android.util.Log.wtf(str, strSubstring);
                    } else {
                        android.util.Log.println(i, str, strSubstring);
                    }
                    if (iMin >= iIndexOf$default) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }

        /* JADX INFO: renamed from: o.zwX$StateListAnimator$TaskDescription */
        /* JADX INFO: loaded from: classes25.dex */
        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zwX.StateListAnimator.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }
        }
    }

    /* JADX INFO: renamed from: o.zwX$ActionBar */
    public static final class ActionBar extends Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zwX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        @Override // o.C60134zwX.Application
        public void v(java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            for (Application application : C60134zwX.OLrzqt) {
                application.v(str, java.util.Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.C60134zwX.Application
        public void v(java.lang.Throwable th, java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            for (Application application : C60134zwX.OLrzqt) {
                application.v(th, str, java.util.Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.C60134zwX.Application
        public void v(java.lang.Throwable th) {
            for (Application application : C60134zwX.OLrzqt) {
                application.v(th);
            }
        }

        @Override // o.C60134zwX.Application
        public void d(java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            for (Application application : C60134zwX.OLrzqt) {
                application.d(str, java.util.Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.C60134zwX.Application
        public void d(java.lang.Throwable th, java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            for (Application application : C60134zwX.OLrzqt) {
                application.d(th, str, java.util.Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.C60134zwX.Application
        public void d(java.lang.Throwable th) {
            for (Application application : C60134zwX.OLrzqt) {
                application.d(th);
            }
        }

        @Override // o.C60134zwX.Application
        public void i(java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            for (Application application : C60134zwX.OLrzqt) {
                application.i(str, java.util.Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.C60134zwX.Application
        public void i(java.lang.Throwable th, java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            for (Application application : C60134zwX.OLrzqt) {
                application.i(th, str, java.util.Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.C60134zwX.Application
        public void i(java.lang.Throwable th) {
            for (Application application : C60134zwX.OLrzqt) {
                application.i(th);
            }
        }

        @Override // o.C60134zwX.Application
        public void w(java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            for (Application application : C60134zwX.OLrzqt) {
                application.w(str, java.util.Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.C60134zwX.Application
        public void w(java.lang.Throwable th, java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            for (Application application : C60134zwX.OLrzqt) {
                application.w(th, str, java.util.Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.C60134zwX.Application
        public void w(java.lang.Throwable th) {
            for (Application application : C60134zwX.OLrzqt) {
                application.w(th);
            }
        }

        @Override // o.C60134zwX.Application
        public void e(java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            for (Application application : C60134zwX.OLrzqt) {
                application.e(str, java.util.Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.C60134zwX.Application
        public void e(java.lang.Throwable th, java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            for (Application application : C60134zwX.OLrzqt) {
                application.e(th, str, java.util.Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.C60134zwX.Application
        public void e(java.lang.Throwable th) {
            for (Application application : C60134zwX.OLrzqt) {
                application.e(th);
            }
        }

        @Override // o.C60134zwX.Application
        public void wtf(java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            for (Application application : C60134zwX.OLrzqt) {
                application.wtf(str, java.util.Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.C60134zwX.Application
        public void wtf(java.lang.Throwable th, java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            for (Application application : C60134zwX.OLrzqt) {
                application.wtf(th, str, java.util.Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.C60134zwX.Application
        public void wtf(java.lang.Throwable th) {
            for (Application application : C60134zwX.OLrzqt) {
                application.wtf(th);
            }
        }

        @Override // o.C60134zwX.Application
        public void log(int i, java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            for (Application application : C60134zwX.OLrzqt) {
                application.log(i, str, java.util.Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.C60134zwX.Application
        public void log(int i, java.lang.Throwable th, java.lang.String str, @NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            for (Application application : C60134zwX.OLrzqt) {
                application.log(i, th, str, java.util.Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.C60134zwX.Application
        public void log(int i, java.lang.Throwable th) {
            for (Application application : C60134zwX.OLrzqt) {
                application.log(i, th);
            }
        }

        @Override // o.C60134zwX.Application
        public void log(int i, java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(str2, "");
            throw new java.lang.AssertionError();
        }
    }
}
