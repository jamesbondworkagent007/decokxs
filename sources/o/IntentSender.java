package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface IntentSender<T> {
    public static final Application OLrzqt = Application.EZpvd;

    T copydefault();

    java.lang.Object copydefault(@NotNull Continuation<? super T> continuation);

    public static final class TaskDescription {
        public static <T> T OLrzqt(@NotNull IntentSender<T> intentSender) {
            throw new java.lang.IllegalStateException("The driver used with SQLDelight is asynchronous, so SQLDelight should be configured for\nasynchronous usage:\n\nsqldelight {\n  databases {\n    MyDatabase {\n      generateAsync = true\n    }\n  }\n}");
        }
    }

    public static final class Activity<T> implements IntentSender<T> {
        public final T copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static int AEQbTJ(java.lang.Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.Object) A[MD:(java.lang.Object):void (m)] call: o.IntentSender.Activity.<init>(java.lang.Object):void type: CONSTRUCTOR */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static final /* synthetic */ Activity EZpvd(java.lang.Object obj) {
            return new Activity(obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static java.lang.String KWHzl(java.lang.Object obj) {
            return "Value(value=" + obj + ')';
        }

        public static java.lang.Object OLrzqt(java.lang.Object obj, @NotNull Continuation<? super T> continuation) {
            return obj;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static boolean OLrzqt(java.lang.Object obj, java.lang.Object obj2) {
            return (obj2 instanceof Activity) && Intrinsics.EZpvd(obj, ((Activity) obj2).AEQbTJ());
        }

        public static <T> java.lang.Object copydefault(T t) {
            return t;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final /* synthetic */ java.lang.Object AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.IntentSender
        public T copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            return OLrzqt(this.copydefault, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return AEQbTJ(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return KWHzl(this.copydefault);
        }

        /* JADX DEBUG: Marked for inline */
        /* JADX DEBUG: Method not inlined, still used in: [o.IntentSender.Activity.EZpvd(java.lang.Object):o.IntentSender$Activity] */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Activity(java.lang.Object obj) {
            this.copydefault = obj;
        }

        @Override // o.IntentSender
        public java.lang.Object copydefault(@NotNull Continuation<? super T> continuation) {
            return OLrzqt((java.lang.Object) this.copydefault, (Continuation) continuation);
        }
    }

    public static final class ActionBar<T> implements IntentSender<T> {
        public final Function1<Continuation<? super T>, java.lang.Object> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> */
        /* JADX WARN: Multi-variable type inference failed */
        public static <T> Function1<Continuation<? super T>, java.lang.Object> AEQbTJ(@NotNull Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static int EZpvd(Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1) {
            return function1.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static java.lang.String OLrzqt(Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1) {
            return "AsyncValue(getter=" + function1 + ')';
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 kotlin.jvm.functions.Function1) A[MD:(kotlin.jvm.functions.Function1):void (m)] call: o.IntentSender.ActionBar.<init>(kotlin.jvm.functions.Function1):void type: CONSTRUCTOR */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static final /* synthetic */ ActionBar copydefault(Function1 function1) {
            return new ActionBar(function1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static boolean copydefault(Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1, java.lang.Object obj) {
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(function1, ((ActionBar) obj).KWHzl());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final /* synthetic */ Function1 KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            return copydefault(this.EZpvd, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return EZpvd(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return OLrzqt(this.EZpvd);
        }

        @Override // o.IntentSender
        public T copydefault() {
            return (T) TaskDescription.OLrzqt(this);
        }

        /* JADX DEBUG: Marked for inline */
        /* JADX DEBUG: Method not inlined, still used in: [o.IntentSender.ActionBar.copydefault(kotlin.jvm.functions.Function1):o.IntentSender$ActionBar] */
        public /* synthetic */ ActionBar(Function1 function1) {
            this.EZpvd = function1;
        }

        public static java.lang.Object copydefault(Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1, @NotNull Continuation<? super T> continuation) {
            return function1.invoke(continuation);
        }

        @Override // o.IntentSender
        public java.lang.Object copydefault(@NotNull Continuation<? super T> continuation) {
            return copydefault((Function1) this.EZpvd, (Continuation) continuation);
        }
    }

    public static final class Application {
        public static final /* synthetic */ Application EZpvd = new Application();
        public static final java.lang.Object copydefault = Activity.copydefault(Unit.INSTANCE);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Object AEQbTJ() {
            return copydefault;
        }

        private Application() {
        }
    }
}
