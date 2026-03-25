package com.reown.sign.engine.model;

import com.reown.sign.common.exceptions.MessagesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ValidationError {
    public final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.reown.sign.engine.model.ValidationError.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ValidationError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    public ValidationError(String str) {
        this.message = str;
    }

    public static final class EmptyNamespaces extends ValidationError {
        public static final EmptyNamespaces INSTANCE = new EmptyNamespaces();

        public EmptyNamespaces() {
            super(MessagesKt.EMPTY_NAMESPACES_MESSAGE, null);
        }
    }

    public static final class UnsupportedNamespaceKey extends ValidationError {
        public static final UnsupportedNamespaceKey INSTANCE = new UnsupportedNamespaceKey();

        public UnsupportedNamespaceKey() {
            super(MessagesKt.NAMESPACE_KEYS_INVALID_FORMAT, null);
        }
    }

    public static final class UnsupportedChains extends ValidationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnsupportedChains(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class UserRejected extends ValidationError {
        public static final UserRejected INSTANCE = new UserRejected();

        public UserRejected() {
            super(MessagesKt.NAMESPACE_KEYS_MISSING_MESSAGE, null);
        }
    }

    public static final class UserRejectedChains extends ValidationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserRejectedChains(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class UserRejectedMethods extends ValidationError {
        public static final UserRejectedMethods INSTANCE = new UserRejectedMethods();

        public UserRejectedMethods() {
            super(MessagesKt.NAMESPACE_METHODS_MISSING_MESSAGE, null);
        }
    }

    public static final class UserRejectedEvents extends ValidationError {
        public static final UserRejectedEvents INSTANCE = new UserRejectedEvents();

        public UserRejectedEvents() {
            super(MessagesKt.NAMESPACE_EVENTS_MISSING_MESSAGE, null);
        }
    }

    public static final class UnauthorizedMethod extends ValidationError {
        public static final UnauthorizedMethod INSTANCE = new UnauthorizedMethod();

        public UnauthorizedMethod() {
            super(MessagesKt.UNAUTHORIZED_METHOD_MESSAGE, null);
        }
    }

    public static final class UnauthorizedEvent extends ValidationError {
        public static final UnauthorizedEvent INSTANCE = new UnauthorizedEvent();

        public UnauthorizedEvent() {
            super(MessagesKt.UNAUTHORIZED_EVENT_MESSAGE, null);
        }
    }

    public static final class InvalidSessionRequest extends ValidationError {
        public static final InvalidSessionRequest INSTANCE = new InvalidSessionRequest();

        public InvalidSessionRequest() {
            super(MessagesKt.INVALID_REQUEST_MESSAGE, null);
        }
    }

    public static final class InvalidEvent extends ValidationError {
        public static final InvalidEvent INSTANCE = new InvalidEvent();

        public InvalidEvent() {
            super(MessagesKt.INVALID_EVENT_MESSAGE, null);
        }
    }

    public static final class InvalidExtendRequest extends ValidationError {
        public static final InvalidExtendRequest INSTANCE = new InvalidExtendRequest();

        public InvalidExtendRequest() {
            super(MessagesKt.INVALID_EXTEND_TIME, null);
        }
    }

    public static final class InvalidSessionProperties extends ValidationError {
        public static final InvalidSessionProperties INSTANCE = new InvalidSessionProperties();

        public InvalidSessionProperties() {
            super(MessagesKt.INVALID_SESSION_PROPERTIES, null);
        }
    }
}
