package com.okinc.okex.uploadlog.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.sBY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = sBY.class)
public abstract class ElementValue {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.bean.ElementValue.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ElementValue(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.bean.ElementValue.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ElementValue> serializer() {
            return sBY.KWHzl;
        }
    }

    private ElementValue() {
    }

    @Serializable
    public static final class ElementString extends ElementValue {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String data;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ElementString copy$default(ElementString elementString, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = elementString.data;
            }
            return elementString.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ElementString copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ElementString(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ElementString) && Intrinsics.EZpvd((Object) this.data, (Object) ((ElementString) obj).data);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.data.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ElementString(data=" + this.data + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.bean.ElementValue.ElementString.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ElementString> serializer() {
                return ElementValue$ElementString$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ElementString(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, ElementValue$ElementString$$serializer.INSTANCE.getDescriptor());
            }
            this.data = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ElementString(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.data = str;
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    @Serializable
    public static final class ElementBoolean extends ElementValue {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final boolean data;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ElementBoolean copy$default(ElementBoolean elementBoolean, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = elementBoolean.data;
            }
            return elementBoolean.copy(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component1() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ElementBoolean copy(boolean z) {
            return new ElementBoolean(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ElementBoolean) && this.data == ((ElementBoolean) obj).data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Boolean.hashCode(this.data);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ElementBoolean(data=" + this.data + ")";
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.bean.ElementValue.ElementBoolean.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ElementBoolean> serializer() {
                return ElementValue$ElementBoolean$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ElementBoolean(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, ElementValue$ElementBoolean$$serializer.INSTANCE.getDescriptor());
            }
            this.data = z;
        }

        public ElementBoolean(boolean z) {
            super(null);
            this.data = z;
        }
    }
}
