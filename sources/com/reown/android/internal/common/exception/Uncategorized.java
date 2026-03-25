package com.reown.android.internal.common.exception;

import com.reown.android.internal.common.model.type.Error;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Uncategorized implements Error {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.internal.common.exception.Uncategorized.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Uncategorized(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Uncategorized() {
    }

    public static final class NoMatchingTopic extends Uncategorized {
        public final int code;
        public final String message;
        public final String sequence;
        public final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ NoMatchingTopic copy$default(NoMatchingTopic noMatchingTopic, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = noMatchingTopic.sequence;
            }
            if ((i & 2) != 0) {
                str2 = noMatchingTopic.topic;
            }
            return noMatchingTopic.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.sequence;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NoMatchingTopic copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new NoMatchingTopic(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoMatchingTopic)) {
                return false;
            }
            NoMatchingTopic noMatchingTopic = (NoMatchingTopic) obj;
            return Intrinsics.EZpvd((Object) this.sequence, (Object) noMatchingTopic.sequence) && Intrinsics.EZpvd((Object) this.topic, (Object) noMatchingTopic.topic);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.Error
        public int getCode() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.Error
        public String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSequence() {
            return this.sequence;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.sequence.hashCode() * 31) + this.topic.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "NoMatchingTopic(sequence=" + this.sequence + ", topic=" + this.topic + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoMatchingTopic(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.sequence = str;
            this.topic = str2;
            this.message = "No matching " + str + " with topic: " + str2;
            this.code = 1301;
        }
    }

    public static final class GenericError extends Uncategorized {
        public final int code;
        public final String error;
        public final String message;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ GenericError copy$default(GenericError genericError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = genericError.error;
            }
            return genericError.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GenericError copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new GenericError(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenericError) && Intrinsics.EZpvd((Object) this.error, (Object) ((GenericError) obj).error);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.Error
        public int getCode() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getError() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.Error
        public String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.error.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "GenericError(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GenericError(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
            this.message = "Generic error: " + str;
            this.code = 1302;
        }
    }
}
