package com.amplifyframework.core.model;

import com.amplifyframework.AmplifyException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ModelException extends AmplifyException {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String), (r3v0 java.lang.Exception) A[MD:(java.lang.String, java.lang.String, java.lang.Exception):void (m)] call: com.amplifyframework.core.model.ModelException.<init>(java.lang.String, java.lang.String, java.lang.Exception):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ModelException(String str, String str2, Exception exc, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, exc);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.Exception:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Exception) : (r3v0 java.lang.Exception))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.Exception, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:20) call: com.amplifyframework.core.model.ModelException.<init>(java.lang.String, java.lang.String, java.lang.Exception, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ ModelException(String str, String str2, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : exc, null);
    }

    private ModelException(String str, String str2, Exception exc) {
        super(str, exc, str2);
    }

    public static final class PropertyPathNotFound extends ModelException {
        private final String modelName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getModelName() {
            return this.modelName;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.Exception:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Exception) : (r2v0 java.lang.Exception))
 A[MD:(java.lang.String, java.lang.Exception):void (m)] (LINE:26) call: com.amplifyframework.core.model.ModelException.PropertyPathNotFound.<init>(java.lang.String, java.lang.Exception):void type: THIS */
        public /* synthetic */ PropertyPathNotFound(String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : exc);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PropertyPathNotFound(@NotNull String str, Exception exc) {
            super("The root property path for the model " + str + " could not be found", "Check if the model types were generated with the latest Amplify CLI and try again", exc, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.modelName = str;
        }
    }
}
