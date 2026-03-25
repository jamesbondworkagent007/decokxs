package com.amplifyframework.statemachine.codegen.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CredentialType {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.CredentialType.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CredentialType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class Amplify extends CredentialType {
        public static final Amplify INSTANCE = new Amplify();

        private Amplify() {
            super(null);
        }
    }

    private CredentialType() {
    }

    public static final class Device extends CredentialType {
        private final String username;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Device copy$default(Device device, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = device.username;
            }
            return device.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.username;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Device copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Device(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Device) && Intrinsics.EZpvd((Object) this.username, (Object) ((Device) obj).username);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUsername() {
            return this.username;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.username.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Device(username=" + this.username + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Device(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.username = str;
        }
    }

    public static final class ASF extends CredentialType {
        public static final ASF INSTANCE = new ASF();

        private ASF() {
            super(null);
        }
    }
}
