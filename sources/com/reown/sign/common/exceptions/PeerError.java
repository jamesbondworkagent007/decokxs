package com.reown.sign.common.exceptions;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.google.android.exoplayer2.audio.AacUtil;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.reown.android.internal.common.model.type.Error;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class PeerError implements Error {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.common.exceptions.PeerError.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PeerError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static abstract class Invalid extends PeerError {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.common.exceptions.PeerError.Invalid.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Invalid(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Invalid() {
            super(null);
        }

        public static final class Method extends Invalid {
            public final int code;
            public final String message;
            public final String reason;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Method copy$default(Method method, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = method.reason;
                }
                return method.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Method copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Method(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Method) && Intrinsics.EZpvd((Object) this.reason, (Object) ((Method) obj).reason);
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
            public final String getReason() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.reason.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Method(reason=" + this.reason + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Method(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.reason = str;
                this.message = "Invalid session request: " + str;
                this.code = 1001;
            }
        }

        public static final class Event extends Invalid {
            public final int code;
            public final String message;
            public final String reason;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Event copy$default(Event event, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = event.reason;
                }
                return event.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Event copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Event(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Event) && Intrinsics.EZpvd((Object) this.reason, (Object) ((Event) obj).reason);
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
            public final String getReason() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.reason.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Event(reason=" + this.reason + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Event(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.reason = str;
                this.message = "Invalid event request: " + str;
                this.code = 1002;
            }
        }

        public static final class UpdateRequest extends Invalid {
            public final int code;
            public final String message;
            public final String reason;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ UpdateRequest copy$default(UpdateRequest updateRequest, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = updateRequest.reason;
                }
                return updateRequest.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UpdateRequest copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new UpdateRequest(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateRequest) && Intrinsics.EZpvd((Object) this.reason, (Object) ((UpdateRequest) obj).reason);
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
            public final String getReason() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.reason.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UpdateRequest(reason=" + this.reason + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateRequest(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.reason = str;
                this.message = "Invalid update namespace request: " + str;
                this.code = 1003;
            }
        }

        public static final class ExtendRequest extends Invalid {
            public final int code;
            public final String message;
            public final String reason;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ExtendRequest copy$default(ExtendRequest extendRequest, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = extendRequest.reason;
                }
                return extendRequest.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ExtendRequest copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ExtendRequest(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtendRequest) && Intrinsics.EZpvd((Object) this.reason, (Object) ((ExtendRequest) obj).reason);
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
            public final String getReason() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.reason.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ExtendRequest(reason=" + this.reason + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExtendRequest(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.reason = str;
                this.message = "Invalid session extend request: " + str;
                this.code = 1004;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class SessionSettleRequest extends Invalid {
            public final int code;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SessionSettleRequest copy$default(SessionSettleRequest sessionSettleRequest, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sessionSettleRequest.message;
                }
                return sessionSettleRequest.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SessionSettleRequest copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new SessionSettleRequest(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SessionSettleRequest) && Intrinsics.EZpvd((Object) this.message, (Object) ((SessionSettleRequest) obj).message);
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
            public int hashCode() {
                return this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SessionSettleRequest(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SessionSettleRequest(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
                this.code = 1005;
            }
        }
    }

    public PeerError() {
    }

    public static abstract class Unauthorized extends PeerError {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.common.exceptions.PeerError.Unauthorized.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Unauthorized(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Unauthorized() {
            super(null);
        }

        public static final class Method extends Unauthorized {
            public final int code;
            public final String message;
            public final String reason;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Method copy$default(Method method, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = method.reason;
                }
                return method.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Method copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Method(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Method) && Intrinsics.EZpvd((Object) this.reason, (Object) ((Method) obj).reason);
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
            public final String getReason() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.reason.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Method(reason=" + this.reason + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Method(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.reason = str;
                this.message = "Unauthorized session request: " + str;
                this.code = 3001;
            }
        }

        public static final class Event extends Unauthorized {
            public final int code;
            public final String message;
            public final String reason;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Event copy$default(Event event, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = event.reason;
                }
                return event.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Event copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Event(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Event) && Intrinsics.EZpvd((Object) this.reason, (Object) ((Event) obj).reason);
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
            public final String getReason() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.reason.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Event(reason=" + this.reason + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Event(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.reason = str;
                this.message = "Unauthorized event request: " + str;
                this.code = 3002;
            }
        }

        public static final class UpdateRequest extends Unauthorized {
            public final int code;
            public final String message;
            public final String sequence;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ UpdateRequest copy$default(UpdateRequest updateRequest, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = updateRequest.sequence;
                }
                return updateRequest.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.sequence;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UpdateRequest copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new UpdateRequest(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateRequest) && Intrinsics.EZpvd((Object) this.sequence, (Object) ((UpdateRequest) obj).sequence);
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
            public int hashCode() {
                return this.sequence.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UpdateRequest(sequence=" + this.sequence + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateRequest(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.sequence = str;
                this.message = "Unauthorized update " + str + " namespace request";
                this.code = 3003;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class ExtendRequest extends Unauthorized {
            public final int code;
            public final String message;
            public final String sequence;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ExtendRequest copy$default(ExtendRequest extendRequest, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = extendRequest.sequence;
                }
                return extendRequest.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.sequence;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ExtendRequest copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ExtendRequest(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtendRequest) && Intrinsics.EZpvd((Object) this.sequence, (Object) ((ExtendRequest) obj).sequence);
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
            public int hashCode() {
                return this.sequence.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ExtendRequest(sequence=" + this.sequence + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExtendRequest(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.sequence = str;
                this.message = "Unauthorized " + str + " extend request";
                this.code = 3004;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Chain extends Unauthorized {
            public final int code;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Chain copy$default(Chain chain, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = chain.message;
                }
                return chain.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Chain copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Chain(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Chain) && Intrinsics.EZpvd((Object) this.message, (Object) ((Chain) obj).message);
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
            public int hashCode() {
                return this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Chain(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Chain(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
                this.code = 3005;
            }
        }
    }

    public static abstract class EIP1193 extends PeerError {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.common.exceptions.PeerError.EIP1193.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ EIP1193(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public EIP1193() {
            super(null);
        }

        public static final class UserRejectedRequest extends EIP1193 {
            public final int code;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ UserRejectedRequest copy$default(UserRejectedRequest userRejectedRequest, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = userRejectedRequest.message;
                }
                return userRejectedRequest.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UserRejectedRequest copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new UserRejectedRequest(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserRejectedRequest) && Intrinsics.EZpvd((Object) this.message, (Object) ((UserRejectedRequest) obj).message);
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
            public int hashCode() {
                return this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UserRejectedRequest(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserRejectedRequest(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
                this.code = MTAnalysisConstants.MainWhat.INIT;
            }
        }
    }

    public static abstract class CAIP25 extends PeerError {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.common.exceptions.PeerError.CAIP25.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CAIP25(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public CAIP25() {
            super(null);
        }

        public static final class UserRejected extends CAIP25 {
            public final int code;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ UserRejected copy$default(UserRejected userRejected, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = userRejected.message;
                }
                return userRejected.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UserRejected copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new UserRejected(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserRejected) && Intrinsics.EZpvd((Object) this.message, (Object) ((UserRejected) obj).message);
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
            public int hashCode() {
                return this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UserRejected(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserRejected(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
                this.code = 5000;
            }
        }

        public static final class UserRejectedChains extends CAIP25 {
            public final int code;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ UserRejectedChains copy$default(UserRejectedChains userRejectedChains, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = userRejectedChains.message;
                }
                return userRejectedChains.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UserRejectedChains copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new UserRejectedChains(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserRejectedChains) && Intrinsics.EZpvd((Object) this.message, (Object) ((UserRejectedChains) obj).message);
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
            public int hashCode() {
                return this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UserRejectedChains(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserRejectedChains(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
                this.code = MfaResponse.CREATE_SESSION_FAILURE;
            }
        }

        public static final class UserRejectedMethods extends CAIP25 {
            public final int code;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ UserRejectedMethods copy$default(UserRejectedMethods userRejectedMethods, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = userRejectedMethods.message;
                }
                return userRejectedMethods.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UserRejectedMethods copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new UserRejectedMethods(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserRejectedMethods) && Intrinsics.EZpvd((Object) this.message, (Object) ((UserRejectedMethods) obj).message);
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
            public int hashCode() {
                return this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UserRejectedMethods(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserRejectedMethods(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
                this.code = MfaResponse.SESSION_EXPIRED;
            }
        }

        public static final class UserRejectedEvents extends CAIP25 {
            public final int code;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ UserRejectedEvents copy$default(UserRejectedEvents userRejectedEvents, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = userRejectedEvents.message;
                }
                return userRejectedEvents.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UserRejectedEvents copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new UserRejectedEvents(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserRejectedEvents) && Intrinsics.EZpvd((Object) this.message, (Object) ((UserRejectedEvents) obj).message);
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
            public int hashCode() {
                return this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UserRejectedEvents(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserRejectedEvents(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
                this.code = MfaResponse.SESSION_INVALID;
            }
        }

        public static final class UnsupportedChains extends CAIP25 {
            public final int code;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ UnsupportedChains copy$default(UnsupportedChains unsupportedChains, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = unsupportedChains.message;
                }
                return unsupportedChains.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UnsupportedChains copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new UnsupportedChains(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnsupportedChains) && Intrinsics.EZpvd((Object) this.message, (Object) ((UnsupportedChains) obj).message);
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
            public int hashCode() {
                return this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UnsupportedChains(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnsupportedChains(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
                this.code = 5100;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class UnsupportedMethods extends CAIP25 {
            public final int code;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ UnsupportedMethods copy$default(UnsupportedMethods unsupportedMethods, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = unsupportedMethods.message;
                }
                return unsupportedMethods.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UnsupportedMethods copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new UnsupportedMethods(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnsupportedMethods) && Intrinsics.EZpvd((Object) this.message, (Object) ((UnsupportedMethods) obj).message);
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
            public int hashCode() {
                return this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UnsupportedMethods(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnsupportedMethods(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
                this.code = 5101;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class UnsupportedEvents extends CAIP25 {
            public final int code;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ UnsupportedEvents copy$default(UnsupportedEvents unsupportedEvents, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = unsupportedEvents.message;
                }
                return unsupportedEvents.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UnsupportedEvents copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new UnsupportedEvents(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnsupportedEvents) && Intrinsics.EZpvd((Object) this.message, (Object) ((UnsupportedEvents) obj).message);
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
            public int hashCode() {
                return this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UnsupportedEvents(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnsupportedEvents(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
                this.code = 5102;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class UnsupportedAccounts extends CAIP25 {
            public final int code;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ UnsupportedAccounts copy$default(UnsupportedAccounts unsupportedAccounts, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = unsupportedAccounts.message;
                }
                return unsupportedAccounts.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UnsupportedAccounts copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new UnsupportedAccounts(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnsupportedAccounts) && Intrinsics.EZpvd((Object) this.message, (Object) ((UnsupportedAccounts) obj).message);
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
            public int hashCode() {
                return this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UnsupportedAccounts(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnsupportedAccounts(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
                this.code = 5103;
            }
        }

        public static final class UnsupportedNamespaceKey extends CAIP25 {
            public final int code;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ UnsupportedNamespaceKey copy$default(UnsupportedNamespaceKey unsupportedNamespaceKey, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = unsupportedNamespaceKey.message;
                }
                return unsupportedNamespaceKey.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UnsupportedNamespaceKey copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new UnsupportedNamespaceKey(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnsupportedNamespaceKey) && Intrinsics.EZpvd((Object) this.message, (Object) ((UnsupportedNamespaceKey) obj).message);
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
            public int hashCode() {
                return this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UnsupportedNamespaceKey(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnsupportedNamespaceKey(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
                this.code = 5104;
            }
        }

        public static final class InvalidSessionPropertiesObject extends CAIP25 {
            public final int code;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ InvalidSessionPropertiesObject copy$default(InvalidSessionPropertiesObject invalidSessionPropertiesObject, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = invalidSessionPropertiesObject.message;
                }
                return invalidSessionPropertiesObject.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InvalidSessionPropertiesObject copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new InvalidSessionPropertiesObject(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InvalidSessionPropertiesObject) && Intrinsics.EZpvd((Object) this.message, (Object) ((InvalidSessionPropertiesObject) obj).message);
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
            public int hashCode() {
                return this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InvalidSessionPropertiesObject(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidSessionPropertiesObject(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
                this.code = 5200;
            }
        }

        public static final class EmptySessionNamespaces extends CAIP25 {
            public final int code;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ EmptySessionNamespaces copy$default(EmptySessionNamespaces emptySessionNamespaces, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = emptySessionNamespaces.message;
                }
                return emptySessionNamespaces.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final EmptySessionNamespaces copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new EmptySessionNamespaces(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EmptySessionNamespaces) && Intrinsics.EZpvd((Object) this.message, (Object) ((EmptySessionNamespaces) obj).message);
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
            public int hashCode() {
                return this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "EmptySessionNamespaces(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmptySessionNamespaces(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
                this.code = 5201;
            }
        }
    }

    public static abstract class Failure extends PeerError {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.common.exceptions.PeerError.Failure.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Failure(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Failure() {
            super(null);
        }

        public static final class SessionSettlementFailed extends Failure {
            public final int code;
            public final String message;
            public final String reason;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SessionSettlementFailed copy$default(SessionSettlementFailed sessionSettlementFailed, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sessionSettlementFailed.reason;
                }
                return sessionSettlementFailed.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SessionSettlementFailed copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new SessionSettlementFailed(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SessionSettlementFailed) && Intrinsics.EZpvd((Object) this.reason, (Object) ((SessionSettlementFailed) obj).reason);
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
            public final String getReason() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.reason.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SessionSettlementFailed(reason=" + this.reason + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SessionSettlementFailed(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.reason = str;
                this.message = "Invalid Session Settle Request: " + str;
                this.code = AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class NoSessionForTopic extends Failure {
            public final int code;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ NoSessionForTopic copy$default(NoSessionForTopic noSessionForTopic, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = noSessionForTopic.message;
                }
                return noSessionForTopic.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final NoSessionForTopic copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new NoSessionForTopic(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NoSessionForTopic) && Intrinsics.EZpvd((Object) this.message, (Object) ((NoSessionForTopic) obj).message);
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
            public int hashCode() {
                return this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "NoSessionForTopic(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoSessionForTopic(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
                this.code = 7001;
            }
        }
    }
}
