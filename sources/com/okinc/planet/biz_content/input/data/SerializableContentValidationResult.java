package com.okinc.planet.biz_content.input.data;

import com.okinc.planet.biz_content.input.ContentValidationType;
import com.okinc.planet.biz_content.input.ValidationStatus;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47572tse;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SerializableContentValidationResult implements Serializable {
    public static final int $stable = 0;
    public static final ActionBar Companion = new ActionBar(null);
    private final String details;
    private final String message;
    private final ValidationStatus status;
    private final long timestamp;
    private final ContentValidationType type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SerializableContentValidationResult copy$default(SerializableContentValidationResult serializableContentValidationResult, ContentValidationType contentValidationType, ValidationStatus validationStatus, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            contentValidationType = serializableContentValidationResult.type;
        }
        if ((i & 2) != 0) {
            validationStatus = serializableContentValidationResult.status;
        }
        ValidationStatus validationStatus2 = validationStatus;
        if ((i & 4) != 0) {
            str = serializableContentValidationResult.message;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = serializableContentValidationResult.details;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            j = serializableContentValidationResult.timestamp;
        }
        return serializableContentValidationResult.copy(contentValidationType, validationStatus2, str3, str4, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentValidationType component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValidationStatus component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SerializableContentValidationResult copy(@NotNull ContentValidationType contentValidationType, @NotNull ValidationStatus validationStatus, @NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(contentValidationType, "");
        Intrinsics.checkNotNullParameter(validationStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SerializableContentValidationResult(contentValidationType, validationStatus, str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerializableContentValidationResult)) {
            return false;
        }
        SerializableContentValidationResult serializableContentValidationResult = (SerializableContentValidationResult) obj;
        return this.type == serializableContentValidationResult.type && this.status == serializableContentValidationResult.status && Intrinsics.EZpvd((Object) this.message, (Object) serializableContentValidationResult.message) && Intrinsics.EZpvd((Object) this.details, (Object) serializableContentValidationResult.details) && this.timestamp == serializableContentValidationResult.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetails() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValidationStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentValidationType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.type.hashCode() * 31) + this.status.hashCode()) * 31) + this.message.hashCode()) * 31) + this.details.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SerializableContentValidationResult(type=" + this.type + ", status=" + this.status + ", message=" + this.message + ", details=" + this.details + ", timestamp=" + this.timestamp + ")";
    }

    public SerializableContentValidationResult(@NotNull ContentValidationType contentValidationType, @NotNull ValidationStatus validationStatus, @NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(contentValidationType, "");
        Intrinsics.checkNotNullParameter(validationStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = contentValidationType;
        this.status = validationStatus;
        this.message = str;
        this.details = str2;
        this.timestamp = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r10v0 com.okinc.planet.biz_content.input.ContentValidationType)
  (r11v0 com.okinc.planet.biz_content.input.ValidationStatus)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0010: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:108)) : (r14v0 long))
 A[MD:(com.okinc.planet.biz_content.input.ContentValidationType, com.okinc.planet.biz_content.input.ValidationStatus, java.lang.String, java.lang.String, long):void (m)] (LINE:103) call: com.okinc.planet.biz_content.input.data.SerializableContentValidationResult.<init>(com.okinc.planet.biz_content.input.ContentValidationType, com.okinc.planet.biz_content.input.ValidationStatus, java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ SerializableContentValidationResult(ContentValidationType contentValidationType, ValidationStatus validationStatus, String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentValidationType, validationStatus, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? System.currentTimeMillis() : j);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_content.input.data.SerializableContentValidationResult.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final SerializableContentValidationResult OLrzqt(@NotNull C47572tse c47572tse) {
            Intrinsics.checkNotNullParameter(c47572tse, "");
            return new SerializableContentValidationResult(c47572tse.KWHzl(), c47572tse.EZpvd(), c47572tse.AEQbTJ(), c47572tse.copydefault(), c47572tse.OLrzqt());
        }
    }

    public final C47572tse toContentValidationResult() {
        return new C47572tse(this.type, this.status, this.message, this.details, null, this.timestamp);
    }
}
