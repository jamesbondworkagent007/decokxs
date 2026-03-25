package com.okinc.base.bugreport;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SerializableThrowable extends Throwable implements Serializable {
    public static final String TAG = "SerializableThrowable";
    private static final long serialVersionUID = 1;
    private final SerializableThrowable cause;
    private final String className;
    private final StackTraceElement[] stackTraceElements;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getCause()Ljava/lang/Throwable; */
    @Override // java.lang.Throwable
    public SerializableThrowable getCause() {
        return this.cause;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.StackTraceElement[])
  (wrap:com.okinc.base.bugreport.SerializableThrowable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.base.bugreport.SerializableThrowable) : (r4v0 com.okinc.base.bugreport.SerializableThrowable))
 A[MD:(java.lang.String, java.lang.String, java.lang.StackTraceElement[], com.okinc.base.bugreport.SerializableThrowable):void (m)] (LINE:11) call: com.okinc.base.bugreport.SerializableThrowable.<init>(java.lang.String, java.lang.String, java.lang.StackTraceElement[], com.okinc.base.bugreport.SerializableThrowable):void type: THIS */
    public /* synthetic */ SerializableThrowable(String str, String str2, StackTraceElement[] stackTraceElementArr, SerializableThrowable serializableThrowable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, stackTraceElementArr, (i & 8) != 0 ? null : serializableThrowable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializableThrowable(@NotNull String str, String str2, @NotNull StackTraceElement[] stackTraceElementArr, SerializableThrowable serializableThrowable) {
        super(str2);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(stackTraceElementArr, "");
        this.className = str;
        this.stackTraceElements = stackTraceElementArr;
        this.cause = serializableThrowable;
        setStackTrace(stackTraceElementArr);
        if (getCause() != null) {
            initCause(getCause().restore());
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.base.bugreport.SerializableThrowable.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final Throwable restore() {
        try {
            Object objNewInstance = Class.forName(this.className).getConstructor(String.class).newInstance(getMessage());
            Intrinsics.copydefault(objNewInstance, "");
            Throwable th = (Throwable) objNewInstance;
            th.setStackTrace(this.stackTraceElements);
            if (getCause() == null) {
                return th;
            }
            th.initCause(getCause().restore());
            return th;
        } catch (Exception e) {
            return new Throwable("cant Throwable: " + this.className + ", error: " + e.getMessage(), e);
        }
    }
}
